# Sample workspace: <SAMPLE>

Standard per-sample reverse-engineering workspace, created by
`lab/bin/new-sample.sh`. Self-contained: everything about this APK lives here.

```
INSTANCE.env     # package, AVD clone, serial/port, APK sha256, CA hash
sample.apk       # the sample
TRACKER.md       # source-of-truth status (read first)
LOG.md           # append-only action log
ANALYSIS.md      # working notes / scratch
hooks/           # SAMPLE-SPECIFIC Frida hooks (extend the lab/hooks/ library)
captures/        # frida logs, mock access logs, mitmproxy flows  (gitignored)
decompiled/      # jadx output, deobfuscated source
native/          # .so analysis: symbol tables, disasm, offsets
reports/         # triage, protocol spec, final report, IOCs
```

## Run the dynamic harness

```bash
source ../../lab/.venv/bin/activate
set -a; source INSTANCE.env; set +a

# trace JNI + bypass JVM TLS for 60s
python ../../lab/driver/driver.py --serial "$SERIAL" --package "$PACKAGE" \
    --duration 60 ../../lab/hooks/trace_jni.js ../../lab/hooks/ssl_bypass.js

# capture HTTP and rewrite a host to the local mock
python ../../lab/mock/http_mock.py --port 8771 --access-log captures/c2.log &
python ../../lab/driver/driver.py --serial "$SERIAL" --package "$PACKAGE" \
    --mock-url http://10.0.2.2:8771 --duration 60 ../../lab/hooks/http_capture.js
```

## Teardown
`lab/bin/teardown-sample.sh <SAMPLE>` (keeps this workspace; `--purge` deletes it).
