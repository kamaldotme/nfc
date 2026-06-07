# CKEMV Dynamic Analysis — Atomic TODO Checklist

Tick boxes as you go. When a section is fully ticked, move on to the next.
The high-level plan and rationale for each item live in
`DYNAMIC_ANALYSIS_PLAN.md`. Current status summary lives in
`DYNAMIC_ANALYSIS_TRACKER.md`. Per-action history goes in
`DYNAMIC_ANALYSIS_LOG.md`.

## Phase 0 — Host tool install (mostly done)

- [x] frida 17.9.10, frida-tools 14.8.2, objection 1.12.4 (pip --user)
- [x] cmdline-tools 12.0 in `Sdk/cmdline-tools/latest/`
- [x] SDK licenses accepted
- [x] arm64-v8a google_apis API-33 system image
- [x] AVD `CKEMV_ARM64` (rootable)
- [x] frida-server-17.9.10-android-arm64 at `samples/ckemv/apk_analysis/tools/frida-server-arm64`
- [x] `JAVA_HOME` and cmdline-tools bin in `~/.claude/settings.json` PATH
- [x] mitmproxy 12.2.3 installed; CA in `samples/ckemv/apk_analysis/dynamic/mitmproxy/` (hash **c8750f0d**)
- [x] cmdline-tools + arm64 system image pulled (path A); both turned out to be dead-ends
- [x] Discovered Play Store x86_64 images (API 34/35) DO carry arm64 translation
- [x] objection-patched APK + Python zipfile rebuild → installs cleanly
- [x] **Resolve frida-gadget vs arm64-translation incompatibility** — user picked Path G (Genymotion). Plan in `GENYMOTION_SETUP.md`.

## Phase M — Migrate to macOS arm64 (Apple Silicon)

Path G (Genymotion) was superseded — see LOG 2026-05-17T19:25. Full
details in `MAC_HANDOFF.md`.

User-side (manual):
- [ ] Copy `Research/` tree from Windows to Mac
- [ ] On Mac: install JDK 17+, Android cmdline-tools, Python tools per `MAC_HANDOFF.md`
- [ ] `sdkmanager --install "system-images;android-33;google_apis;arm64-v8a"`
- [ ] `avdmanager create avd -n CKEMV_ARM64_MAC -k "system-images;android-33;google_apis;arm64-v8a" --device pixel`
- [ ] Open Claude Code in the copied `Research/` directory
- [ ] First message: "Read `samples/ckemv/apk_analysis/dynamic/MAC_HANDOFF.md`, then resume PLAN §D2."

Claude-side on Mac (once handed off):
- [ ] Boot AVD; verify `ro.product.cpu.abilist == arm64-v8a` and `adb root` works
- [ ] Push `frida-server-arm64`; verify `frida-ps -U`
- [ ] Generate fresh mitmproxy CA; push `<new-hash>.0` to `/system/etc/security/cacerts/`
- [ ] `adb install -r "samples/ckemv/sample.apk"` (**original**, not the patched one)
- [ ] Cold-start capture with `frida -U -f xyz.happify.ckemv -l hooks/trace_jni.js -l hooks/rustls_bypass.js --no-pause` + `mitmdump -w captures/cold_start.flow`
- [ ] Continue per Phase E and F

## Phase D — Instrumentation harness

- [ ] Cold-boot CKEMV_ARM64 with `-http-proxy 127.0.0.1:8080 -writable-system`
- [ ] Wait until `adb shell getprop sys.boot_completed == 1`
- [ ] Snapshot AVD (`emulator -avd CKEMV_ARM64 -snapshot clean`)
- [ ] `adb root` succeeds
- [ ] Push frida-server, chmod 755, run as background
- [ ] `frida-ps -U` lists `system_server`, `zygote`, etc.
- [ ] Compute mitmproxy CA Android hash (`openssl x509 -subject_hash_old`)
- [ ] `adb remount` succeeds
- [ ] Push `<hash>.0` to `/system/etc/security/cacerts/`
- [ ] `adb reboot`, then verify cert in `/system/etc/security/cacerts/`
- [ ] Host firewall rule: drop outbound to `tqqemv.xyz` (defense in depth)
- [ ] Resolve `rustls::ServerCertVerifier::verify_server_cert` offset in
      `libckemv_reporter.so` (from `reporter_functions.json`)
- [ ] Write `hooks/rustls_bypass.js` (Interceptor.attach → force `Ok`)
- [ ] Write `hooks/trace_jni.js` (Java + native trace)
- [ ] `adb install -r "../samples/ckemv/sample.apk"`
- [ ] `pm list packages | grep ckemv` shows `xyz.happify.ckemv`

## Phase E — Capture

- [ ] Run cold-start with frida + mitmdump, save flow + frida log
- [ ] Decode each request/response in captures/cold_start.flow
- [ ] Walk every reachable UI path; one capture per path
- [ ] Inject a synthetic APDU via Frida into `EmvKernel.process_apdu`
- [ ] Force-trigger `SyncWorker` job; capture upload
- [ ] Force-trigger `ConfigUpdateLoop`; capture config fetch

## Phase F — Protocol RE + mock C2

- [ ] Populate `C2_PROTOCOL_SPEC.md` with one section per endpoint
- [ ] Identify framing: JSON / protobuf / TLV / raw
- [ ] If protobuf: extract .proto schemas from binary (`reporter_symtab.txt`
      for `prost`/`pb` symbols)
- [ ] Generate self-signed cert chain rooted in mitmproxy CA for
      `tqqemv.xyz` (so local_c2 presents a cert the device already trusts)
- [ ] Write `local_c2/server.py` skeleton (route table)
- [ ] Implement each handler from `C2_PROTOCOL_SPEC.md`
- [ ] Add `/system/etc/hosts` entry: `tqqemv.xyz → 10.0.2.2`
- [ ] Start local_c2, point APK at it (with mitmproxy off)
- [ ] End-to-end run: APK completes one harvest cycle against local_c2
- [ ] Diff local_c2 access log vs cold_start.flow — should match

## Phase G — Wrap

- [ ] Write `CKEMV_DYNAMIC_BEHAVIOR_REPORT.md`
- [ ] Update `CKEMV_THREAT_HUNT_PACK.md` with runtime-derived IOCs
- [ ] Update `RESEARCH_TRACKER.md` (top level) — mark Phase D/E/F done
- [ ] Update auto-memory pointer to `DYNAMIC_ANALYSIS_TRACKER.md`
- [ ] Tag / archive the captures directory
