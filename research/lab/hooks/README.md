# Shared Frida hook library

Generic, sample-agnostic hooks. The driver (`lab/driver/driver.py`) prepends a
`LAB` config object so the same scripts work for any package:

```js
var LAB = { package: "com.evil.app", mockUrl: "http://10.0.2.2:8771",
            traceClasses: [...], extraPrefixes: ["B2."] };
```

| Hook | Purpose | Key LAB fields |
|------|---------|----------------|
| `trace_jni.js` | Trace Java/Kotlin methods; map `RegisterNatives` -> .so addrs | `package`, `traceClasses`, `extraPrefixes` |
| `ssl_bypass.js` | Defeat JVM-side TLS validation + cert pinning (TrustManager, Conscrypt, OkHttp, HostnameVerifier) | — |
| `http_capture.js` | Log OkHttp / HttpURLConnection requests; optional host rewrite to the mock | `mockUrl` |

## Conventions
- **Frida 16.x only.** Frida 17 removed the global `Java` bridge and changed the
  `Module` API these hooks use. The pinned client + `frida-server` are 16.7.19.
- Hooks emit structured events via `send({tag, ...})`; the driver timestamps and
  prints them. Use `console.log` for ad-hoc debug (also captured).
- **Native TLS (Rust rustls / BoringSSL) is NOT handled here** — it needs a
  per-sample hook at a binary-specific offset. Put those in `samples/<name>/hooks/`.

## Per-sample hooks
Sample-specific hooks (renamed-class captures, native offset patches) live in
`samples/<name>/hooks/` and are loaded alongside these, e.g.:

```bash
python ../../lab/driver/driver.py --serial "$SERIAL" --package "$PACKAGE" \
    ../../lab/hooks/trace_jni.js hooks/capture_c2.js
```
