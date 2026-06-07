---
name: CKEMV harvester research project
description: Defender-side static analysis of an Android NFC/EMV card-harvesting APK. Multi-phase research with a persistent tracker; if a session dies, the next session resumes from the tracker.
type: project
originSessionId: 61ec3028-602d-486d-800c-a4a9cfa6a4be
---
**Sample:** `C:\Users\mogli\Desktop\Prj\Research\samples/ckemv/sample.apk` (6.76 MB, SHA-bound to that path).
**Package:** `xyz.happify.ckemv` · **Label:** "Geometry Saver" · **Family:** NFC relay / ghost-tap harvester aligned with ESET NGate / ThreatFabric Ghost Tap / Cleafy SuperCard X reporting.
**C2 host:** `https://tqqemv.xyz` (HTTPS, no pinning, Mozilla root bundle in-binary).
**Native libs (ARM64 only):** `libckemv_android.so` (Rust EMV state machine, 1.08 MB), `libckemv_reporter.so` (Rust ureq+rustls+ring transport, 3.01 MB). Build user `arthur` on macOS, internal version 1.7.

**Why:** Defender-oriented characterization — IOCs, MITRE ATT&CK mapping, detection guidance. Companion file `Ghost_Tapping_Guarantee_Marketplaces_Research.md` tracks the upstream marketplaces.

**How to apply:**
- **Single source of truth** for status: `samples/ckemv/apk_analysis/RESEARCH_TRACKER.md`. Read it first on resume.
- **Append-only log of actions** at `samples/ckemv/apk_analysis/RESEARCH_LOG.md`. Add a dated entry at the start of every working session.
- **Existing authoritative reports** (don't rewrite, reference):
  - `samples/ckemv/apk_analysis/CKEMV_HARVESTER_ANALYSIS.md` — top-level writeup
  - `samples/ckemv/apk_analysis/CKEMV_MASTER_RESEARCH_HANDOFF.md` — handoff doc
  - `samples/ckemv/apk_analysis/CKEMV_MONETIZATION_AND_LIMITS.md` — what the operator can do with captures
  - `samples/ckemv/apk_analysis/CKEMV_THREAT_HUNT_PACK.md` — hunt rules
  - `samples/ckemv/apk_analysis/CKEMV_CLASS_BY_CLASS_REPORT.md` — Java/Kotlin function walk (Phase B output)
- **Current phase:** C — native lib deep dive. Outputs: `CKEMV_NATIVE_FUNCTIONS_REPORT.md` then merged `CKEMV_COMPLETE_FUNCTION_REPORT.md`.
- **No llvm-binutils on host.** Use Python (no extra deps) for ELF inspection. A 7,291-line `strings` dump of the reporter is already at `Research/samples/ckemv/ckemv_reporter_strings.txt`.
- **Constraints:** static only — no execution, no live C2 probing, no operational/offensive content. This is a defender's brief.
