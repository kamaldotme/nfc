# CKEMV C2 Wire Protocol — Reconstructed Spec

> ## ✅ OBSERVED (2026-05-23, MalLab dynamic capture on arm64)
>
> Captured by rewriting `Reporter`'s `baseUrl` arg to the local mock via Frida
> (`hooks/capture_c2.js`) while the app's own `UploadLoop`/`ConfigUpdateLoop`
> ran. Real C2 sinkholed + egress-locked. Raw: `captures/lab_c2.log`.
>
> **Transport:** Rust `ureq` over HTTP(S). `User-Agent: ureq/2.12.1` (IOC).
> `Accept-Encoding: gzip`. `Content-Type: application/json` on POST.
>
> **Auth:** header **`X-API-KEY: <apiKey>`** — NOT `Authorization: Bearer`
> (the static guess in `jni/Reporter.kt` is wrong; correct it). The apiKey is the
> QR-provisioned `stats.api_key`.
>
> **Endpoints (real paths):**
> - `GET /me` — config/scenario pull. Header: `X-API-KEY`. No body.
>   Response consumed as `MeResponse {name, cves[], latest_version}`.
> - `POST /harvest` — exfil. Headers: `X-API-KEY`, `Content-Type: application/json`.
>   Body = `CardRecord.toUploadJson()` (JSON, confirmed — not protobuf/bincode):
>   ```json
>   {"aid","network","pan","tx_count","raw_data":{<tlv>},
>    "harvested_txs":[{"arqc","atc","cve_id","params":{<tlv>},"time_ms"}]}
>   ```
>   Success = response body containing the substring `Success`.
> - `GET /report` — no Java caller (dead in this build).
> - `POST /update_apk` — Java/OkHttp self-updater; body `{"api_key":"..."}`.
>
> The hypothesized `/api/*` paths and `Bearer` auth below are SUPERSEDED.

---

> Status (legacy): **skeleton only.** Endpoints below are *hypothesized* from static
> analysis (`CKEMV_CLASS_BY_CLASS_REPORT.md`, demangled crate list, string
> dump of the reporter). They will be replaced with **observed** request/
> response pairs as soon as Phase E captures land.
>
> Every endpoint section must end with a `## Provenance` block citing the
> exact capture file + flow index that produced it (or "static only" if
> still pre-Phase-E).

## Endpoint inventory (hypothesized)

| Path                       | Direction | Caller (static)                                           |
|----------------------------|-----------|-----------------------------------------------------------|
| `POST /api/me`             | dev → C2  | `xyz.happify.ckemv.net.C2#me()` (returns `MeResponse`)    |
| `POST /api/config`         | dev → C2  | `ConfigUpdateLoop` — periodic config pull                 |
| `POST /api/cards`          | dev → C2  | `UploadLoop` — uploads `HarvestedTx` rows                 |
| `POST /api/ack`            | dev → C2  | `PostTapUploader` — per-tap synchronous ack               |
| `GET  /api/apk`            | dev → C2  | `ApkSideloader` — secondary payload download              |

All requests carry the operator-side device ID in some form (see
`CardRecord`/`HarvestedTx` model classes). Auth scheme TBD — could be a
shared bearer baked into the .so or a per-device handshake response from
`/api/me`.

---

## `POST /api/me`

- **Direction:** device → C2
- **Trigger:** first launch (`MainActivity.onCreate`?) and on each
  `SyncWorker` run.
- **Static evidence:** `xyz.happify.ckemv.Reporter.me()` JNI ↔
  `libckemv_reporter.so` symbol containing the `me` substring.
- **Hypothesized request body:** `{ deviceId, install_ts, version=1.7,
  abi=arm64-v8a }` (likely JSON or bincode; reporter pulls `serde_json`).
- **Hypothesized response body:** `MeResponse` model has fields TBD —
  refresh from `samples/ckemv/apk_analysis/sources/xyz/happify/ckemv/MeResponse.java`
  during Phase F1.

### Provenance
- *Static only — TBD after first capture.*

---

## `POST /api/config`

- **Direction:** device → C2
- **Trigger:** `ConfigUpdateLoop` periodic tick (interval TBD).
- **Static evidence:** `CveConfig` model + `ConfigUpdateLoop` class in
  `B2/` (deobfuscated).
- **Hypothesized response:** JSON `CveConfig` — likely controls upload
  cadence, decoy behavior, kill switch.

### Provenance
- *Static only — TBD.*

---

## `POST /api/cards` (upload)

- **Direction:** device → C2
- **Trigger:** `UploadLoop` flushes the `HarvestDatabaseHelper` (SQLite)
  rows where `synced=0`, marks them synced on 2xx.
- **Static evidence:** `HarvestedTx` model includes EMV-relevant fields;
  the upload likely batches them.
- **Body:** likely an array of `HarvestedTx` JSON objects, possibly
  msgpack/bincode given Rust crate inventory.

### Provenance
- *Static only — TBD.*

---

## `POST /api/ack` (per-tap)

- **Direction:** device → C2
- **Trigger:** immediately after a successful NFC tap, by
  `PostTapUploader`. The UI flashes a ✅ Toast on success
  (`UploadAckFlash` / `UploadAckFlashLoop` — corrected in
  `deobfuscated/README.md`).
- **Hypothesized payload:** a single `CardRecord`-shaped object.

### Provenance
- *Static only — TBD.*

---

## `GET /api/apk` (sideload)

- **Direction:** device → C2
- **Trigger:** `ApkSideloader` — likely invoked when `CveConfig` flips a
  flag indicating an update is available.
- **Hypothesized response:** binary APK bytes. Signed by operator? Or
  just a same-package upgrade install via `PackageInstaller`?

### Provenance
- *Static only — TBD.*

---

## TLS notes

- The reporter pins via the bundled Mozilla root CA store (rustls +
  webpki-roots). Not classic public-key pinning, but functionally equivalent
  — only certs chaining to roots **in the .so** verify successfully.
- Frida bypass strategy: hook
  `<rustls::ServerCertVerifier as ...>::verify_server_cert` to force `Ok(_)`.
  See `hooks/rustls_bypass.js`.

## Encoding hints from static analysis

The reporter's symbol table includes `serde_json` and `serde::de`
substrings, suggesting JSON is at least *available*. But many Rust apps
ship JSON for some endpoints and bincode/msgpack/protobuf for hot paths.
Determine empirically per endpoint in Phase F1 by `Content-Type` headers
+ leading magic bytes in the request body.
