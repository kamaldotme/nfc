# CKEMV Dynamic Analysis — Tracker (Source of Truth)

**Read this first on every session resume.** It is the single source of truth
for "where are we right now". If anything else (memory, logs, code) disagrees
with this file, trust this file and reconcile.

Companion docs (all under `samples/ckemv/apk_analysis/dynamic/` unless noted):
- **`DYNAMIC_ANALYSIS_PLAN.md`** — full multi-phase plan, phases D1 → F.
- **`DYNAMIC_ANALYSIS_LOG.md`** — append-only log of every action taken.
- **`DYNAMIC_ANALYSIS_TODO.md`** — atomic checklist (current sprint).
- **`C2_PROTOCOL_SPEC.md`** — growing spec of the C2 wire format
  reconstructed from captures.
- **`hooks/`** — Frida JavaScript scripts.
- **`captures/`** — mitmproxy `.flow` files + decoded payloads.
- **`local_c2/`** — mock C2 server reimplementation.
- `../DYNAMIC_ANALYSIS_SETUP.md` — one-time host/AVD/tool setup notes.

---

## High-level status

> **NOTE (2026-05-23):** This project is now **sample #1 of the MalLab lab**
> (`lab/`). The dynamic phase ran on the Mac via `lab/bin/new-sample.sh ckemv`.
> The CKEMV-specific dynamic harness here is superseded by the shared lab
> tooling; this tracker is kept for history. **All phases below are DONE.**

| Phase | Goal | Status | Output |
|-------|------|--------|--------|
| 0. Setup | rooted arm64 AVD + frida + mitm CA (Mac/M1) | **DONE** | lab/, MalLab-Base, lab/.venv |
| D. Instrumentation | frida-server running, CA trusted, APK installed | **DONE** | lab provisioning, sample_ckemv |
| E. Capture | runtime C2 captured under Frida + mock | **DONE** | captures/lab_c2.log, lab_validation_frida2.log |
| F1. Protocol RE | decode the C2 RPCs | **DONE** | C2_PROTOCOL_SPEC.md (OBSERVED block) |
| F2. Local C2 | mock impersonating `tqqemv.xyz` | **DONE** | lab/mock/http_mock.py + c2_routes.json (local_c2/server.py = early CKEMV-specific) |
| F3. End-to-end | APK lifecycle vs mock, no real network | **DONE** | UploadLoop+ConfigUpdateLoop hit mock; real C2 sinkholed+egress-locked |

## Last action

**Dynamic phase COMPLETE on Mac/M1 via the lab.** Captured the live C2 wire
protocol from a fresh isolated instance (`sample_ckemv`, emulator-5556): Frida
`capture_c2.js` rewrote `Reporter`'s baseUrl to the local mock; the app's own
loops drove `POST /harvest` + `GET /me`. Real findings (correct the static
guesses): auth is **`X-API-KEY`** (not Bearer), UA `ureq/2.12.1`, `/harvest`
body is JSON = `toUploadJson()`. See C2_PROTOCOL_SPEC.md OBSERVED block + LOG
2026-05-23 entries. Lab gotchas (fresh-create not copy; never setenforce 0;
frida no `-l`; am start not monkey) documented in the LOG.

## Current blockers

**None.** Lab is production-ready. Remaining optional CKEMV work: simulate an
NFC tap via `EmvKernel` to harvest a real synthetic ARQC end-to-end; exercise
the `/me`-driven self-update (`latest_version`) path; write
`CKEMV_DYNAMIC_BEHAVIOR_REPORT.md` and fold runtime IOCs into the threat-hunt pack.

<details><summary>Historical: pre-Mac decision matrix (resolved)</summary>

### Decision matrix (pick one, document in LOG before executing)

| Option | What it needs | Pros | Cons |
|---|---|---|---|
| **P. Physical ARM Android phone** | Spare phone + USB + `adb` + `frida-server-android-arm64` (already staged) | Cleanest; real CPU, no translation; root via Magisk if needed | Needs hardware the user may not have on hand |
| **G. Genymotion Personal** | Install Genymotion Desktop; create ARM64 device | Free for personal use; native ARM emulation via QEMU; rooted by default | Another install (~150 MB); slower than translation |
| **B. Static binary patch + transparent proxy** | Patch `verify_server_cert` in `libckemv_reporter.so` to NOP and return Ok; repack; for proxying use Frida-less DNS redirect | Survives translation; reproducible | DNS redirect needs root *or* a host-network bridge; for Java/OkHttp side we'd still need a TrustManager bypass |
| **L. LSPosed/Xposed via rooted AVD with custom kernel** | Build a custom rooted AVD with translation library injected | Full hook power | Multi-day setup; brittle across image updates |
| ~~**F2.**~~ | ~~Rooted x86_64+arm64 hybrid image~~ | n/a | **Verified dead 2026-05-17 — no such image exists in sdkmanager.** |

**Recommendation (claude):** **P** if a physical Android phone with USB
debug is on hand (cleanest). Otherwise **G** (Genymotion native ARM
emulation). **B** (binary patch + DNS-redirect to local C2) is the most
self-contained path but is the most engineering work.

*Resolved: the Mac/M1 native-arm64 AVD path made this matrix moot.*

</details>

## Next action

Optional CKEMV deepening (see "Current blockers"): synthetic NFC-tap ARQC
harvest via `EmvKernel`, self-update path, and `CKEMV_DYNAMIC_BEHAVIOR_REPORT.md`.
Re-spin anytime with `lab/bin/new-sample.sh ckemv samples/ckemv/sample.apk tqqemv.xyz`.

## How to resume from a dead session

```
# 1. Read this file
# 2. Read DYNAMIC_ANALYSIS_LOG.md tail for the last completed action
# 3. Read DYNAMIC_ANALYSIS_TODO.md for the next pending checkbox
# 4. Read DYNAMIC_ANALYSIS_PLAN.md only if you've lost the big picture
# 5. Check `frida-ps -U` to see if the emulator + frida-server are still live;
#    if not, restart per PLAN §D1-D2.
```

## Invariants we are protecting

- **No real C2 traffic.** Either the host firewall blocks `tqqemv.xyz`, or
  mitmproxy intercepts it on a non-internet-routed interface, or we use
  the local mock server. The malware must never make a successful HTTPS
  call to the operator's infrastructure.
- **No persistence outside the emulator.** All malware writes stay in
  `~/.android/avd/CKEMV_ARM64.avd/userdata-qemu.img`. We snapshot before
  each capture and revert after.
- **All findings are written to disk in this directory tree.** Auto-memory
  is used only for pointers ("file X is the SoT"), never for raw findings.
