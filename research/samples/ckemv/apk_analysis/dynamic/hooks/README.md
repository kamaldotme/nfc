# Frida hooks

Drop into `frida -U -f xyz.happify.ckemv -l <file>.js --no-pause`. They are
order-sensitive only in the sense that `Java.perform`-using ones must come
*after* the JVM is up — but Frida defers `Java.perform` callbacks anyway, so
order on the command line does not matter in practice.

| File | What it does | When to load |
|---|---|---|
| `rustls_bypass.js` | Hooks `WebPkiServerVerifier::verify_server_cert` in `libckemv_reporter.so` (offset 0x162ee4) so traffic the reporter sends can be intercepted by mitmproxy. Currently TRACE only — ABI must be observed once before we replace the return. | Every C2-traffic capture. |
| `trace_jni.js` | Hooks every method on `xyz.happify.ckemv.{jni.EmvKernel, jni.Reporter, nfc.NfcTapHandler, net.*, update.ApkSideloader, SyncWorker, MainActivity}` and logs all `art::JNI::RegisterNatives` calls. | Always — gives the Kotlin→native→C2 play-by-play. |
| `log_nfc.js` | Logs every IsoDep transceive/connect/close + `NfcTapHandler.onTagDiscovered`. Quiet until an NFC tap (synthetic or real) happens. | When testing NFC paths in Phase E3. |

After a capture, save the Frida stdout alongside the mitmproxy `.flow` file
in `samples/ckemv/apk_analysis/dynamic/captures/<timestamp>_<scenario>/`.

## Things still to write

- `inject_apdu.js` — call `EmvKernel.process_apdu` directly with a synthetic
  Visa contactless APDU sequence, so we don't need real NFC hardware.
- `dump_db.js` — read `HarvestDatabaseHelper` SQLite contents to disk after
  each capture, so we can correlate stored rows with uploaded payloads.
- `time_skew.js` — accelerate `SyncWorker` / `ConfigUpdateLoop` cadence by
  overriding their delay constants, so we don't wait minutes between RPCs.
