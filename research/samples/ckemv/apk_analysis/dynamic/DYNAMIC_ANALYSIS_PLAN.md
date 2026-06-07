# CKEMV Dynamic Analysis — Full Plan

This document is **stable** — written once, edited only when scope changes.
Day-to-day status lives in `DYNAMIC_ANALYSIS_TRACKER.md` and per-task
checkboxes in `DYNAMIC_ANALYSIS_TODO.md`. Per-action history goes in
`DYNAMIC_ANALYSIS_LOG.md`.

## Goal

End-to-end behavioral characterization of the CKEMV harvester
(`xyz.happify.ckemv`, "Geometry Saver", v1.7, ARM64-only native libs)
sufficient to:

1. Document what the app **does** at runtime (UI flow, NFC harvest loop,
   JNI bridge into Rust libs, threading, persistence).
2. Document every byte it **sends to** and **receives from** its C2
   (`https://tqqemv.xyz`) — schema, semantics, encoding, framing.
3. Build a **local C2 server** that faithfully impersonates `tqqemv.xyz`
   so analysis continues even if the operator rotates the C2 host. The
   mock answers every observed RPC and the APK proceeds normally through
   its full lifecycle.

## Non-goals

- No offensive use. We do not relay captured card data, do not connect to
  any acquirer, do not perform ghost-tap relay.
- No interaction with the real operator infrastructure. Real C2 stays
  blocked at the network layer.

## Phases

### Phase D — Dynamic-instrumentation harness

**D1. Boot the AVD.**
- `emulator -avd CKEMV_ARM64 -writable-system -no-snapshot -no-boot-anim
   -http-proxy 127.0.0.1:8080`.
- First cold boot is slow (5–10 min on x86 host via QEMU translation).
- Once `adb shell getprop sys.boot_completed` returns 1, snapshot.

**D2. frida-server on device.**
- `adb root && adb push samples/ckemv/apk_analysis/tools/frida-server-arm64
   /data/local/tmp/frida-server && adb shell chmod 755
   /data/local/tmp/frida-server`.
- Launch as background: `adb shell "/data/local/tmp/frida-server &"`.
- Verify from host: `frida-ps -U` lists Android processes.

**D3. mitmproxy on host + CA into Android system store.**
- Install mitmproxy on host (pip).
- Start `mitmweb -p 8080` (web UI + proxy).
- Convert `~/.mitmproxy/mitmproxy-ca-cert.pem` to subject-hash format
  required by Android: `openssl x509 -inform PEM -subject_hash_old -in
  cert.pem | head -1` → that hash + `.0` is the filename.
- `adb remount` (works on the rooted AVD), `adb push <hash>.0
  /system/etc/security/cacerts/`, `chmod 644`, `adb reboot`.
- Verify: Settings → Security → Trusted credentials → System → "mitmproxy"
  is listed.

**D4. Network-only-through-proxy.**
- Emulator launched with `-http-proxy 127.0.0.1:8080` already routes app
  HTTPS through mitmproxy. Confirm by hitting any HTTPS site in the
  browser and seeing it in mitmweb.
- **Belt and braces:** add an outbound firewall rule on the host to drop
  any direct egress to `tqqemv.xyz` that bypasses the proxy (rustls in
  the reporter does its own DNS+TCP, may not honor the system proxy).

**D5. rustls bypass hook.**
- The reporter (`libckemv_reporter.so`) uses ureq+rustls+ring with a
  Mozilla CA bundle linked **into the binary**. Pushing mitmproxy CA to
  the Android system store is **not enough** — rustls only trusts its
  bundled roots.
- Two options:
  1. **Hook the rustls verifier.** Locate the
     `<rustls::client::ServerCertVerifier as ...>::verify_server_cert`
     symbol in `reporter_functions.json` / `reporter_symtab.txt`.
     `Interceptor.attach` and replace the return with `Ok`. Most reliable.
  2. **Hook ureq.** Hook the agent-build path to inject our CA into the
     root store. Higher up the stack but harder symbol resolution.
- Script: `hooks/rustls_bypass.js`.

**D6. APK install.**
- `adb install -r "../samples/ckemv/sample.apk"`.
- `adb shell pm list packages | grep ckemv` to confirm.

### Phase E — Capture

**E1. Cold-start trace.**
- `mitmdump -p 8080 -w captures/cold_start.flow &`
- `frida -U -f xyz.happify.ckemv
    -l hooks/trace_jni.js
    -l hooks/rustls_bypass.js
    -l hooks/log_nfc.js
    --no-pause`
- Let it run 60 s. Stop. Save Frida output to
  `captures/cold_start_frida.log`.

**E2. UI-driven warm runs.**
- Trigger every reachable UI path (decoy "Geometry Saver" screens, the
  QR scan callback in `xyz.happify.ckemv.ui.QrScanCallback`, etc.).
- Capture each as a separate `.flow` file.

**E3. NFC-event-driven runs.**
- We have no NFC hardware on the emulator. Two substitutes:
  1. **Manual JNI injection** via Frida — call the native
     `EmvKernel.process_apdu` entry point with a synthetic APDU buffer
     mimicking a Visa contactless card. Reconstruct from the EMV state
     machine paths in `kernel_operator_functions.md`.
  2. **HCE bridge** — write a tiny companion Android app that exposes an
     HCE service emulating a contactless card; install on a second
     emulator instance and use Android's NFC pairing. Heavyweight; only
     if (1) is insufficient.

**E4. Persistence + scheduling.**
- Observe `xyz.happify.ckemv.SyncWorker` (WorkManager) firing.
- Force-trigger via `adb shell cmd jobscheduler run -f xyz.happify.ckemv
  <job-id>`.
- Capture `UploadLoop` and `ConfigUpdateLoop` traffic.

### Phase F — Protocol & mock C2

**F1. Decode wire format.**
- For each captured request/response: identify content-type, framing,
  encoding (JSON / protobuf / TLV / msgpack / raw EMV TLV).
- Cross-reference with the demangled Rust crate list
  (`reporter_summary.txt`, `kernel_summary.txt`) — if `prost`, `serde`,
  `bincode`, etc. appear, that's a strong hint.
- Produce per-endpoint pages in `C2_PROTOCOL_SPEC.md`:
  ```
  ## POST /api/v1/<path>
  - Direction: device → C2
  - Trigger: ConfigUpdateLoop (every N seconds)
  - Headers: …
  - Request body schema: …
  - Response body schema: …
  - Observed example: captures/cold_start.flow#42
  - Field semantics: …
  ```

**F2. Build local C2 mock.**
- `local_c2/server.py` — Python aiohttp or Flask, TLS-terminated on
  `localhost:443`. Uses a cert signed by our own CA (the same mitmproxy
  CA already trusted on the device).
- One handler per `/api/v1/<path>` discovered in F1.
- Default responses derived from real observed responses.
- `local_c2/responses/` — JSON/binary files of canonical responses we can
  edit to test branching behavior.

**F3. DNS redirect.**
- Approach 1: `/system/etc/hosts` on the AVD → `tqqemv.xyz` →
  `10.0.2.2` (the host as seen by the emulator). Requires `adb remount`.
- Approach 2: run a local DNS resolver (dnsmasq in Docker) that returns
  `10.0.2.2` for `tqqemv.xyz` and the real answer for everything else;
  start emulator with `-dns-server 10.0.2.2`.
- Approach 1 is simpler; Approach 2 is more flexible if the APK queries
  multiple subdomains.

**F4. End-to-end verification.**
- Kill mitmproxy (so real C2 path is fully gone), keep firewall rule.
- Launch local_c2 server.
- Cold-start the APK. Capture local_c2 access log.
- Walk every UI/NFC path that worked in Phase E.
- Anything that errored or behaved differently than against the real C2
  (or against mitmproxy passthrough) goes back into F1 → F2 iteration.

### Phase G — Deliverables (when D-F are done)

- `CKEMV_DYNAMIC_BEHAVIOR_REPORT.md` — narrative writeup, equivalent of
  CKEMV_HARVESTER_ANALYSIS.md but runtime-grounded.
- `C2_PROTOCOL_SPEC.md` — complete, version-stamped.
- `local_c2/` — runnable mock with README.
- New IOC/hunt rules folded into `CKEMV_THREAT_HUNT_PACK.md`.
- Memory pointers updated.
