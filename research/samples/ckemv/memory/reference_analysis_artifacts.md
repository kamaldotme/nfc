---
name: CKEMV analysis artifact locations
description: Where the sample APK, decompiled sources, native libs, strings dumps, and existing analysis reports live on disk
type: reference
originSessionId: 61ec3028-602d-486d-800c-a4a9cfa6a4be
---
Working tree root: `C:\Users\mogli\Desktop\Prj\Research`

- **Sample APK:** `samples/ckemv/sample.apk` (6.76 MB)
- **Companion research:** `Ghost_Tapping_Guarantee_Marketplaces_Research.md`
- **Reporter strings dump:** `samples/ckemv/ckemv_reporter_strings.txt` (7,291 lines, pre-extracted)
- **samples/ckemv/apk_analysis/** — all outputs
  - `sample.apk` — copy of the APK
  - `jadx/` and `jadx.zip` — jadx tool / output bundle
  - `res_only/resources/` — `AndroidManifest.xml`, `classes.dex`, assets, lib/arm64-v8a/
    - `lib/arm64-v8a/libckemv_android.so` (1.08 MB, Rust 1.91, EMV state machine)
    - `lib/arm64-v8a/libckemv_reporter.so` (3.01 MB, Rust 1.88, ureq+rustls+ring)
  - `sources/sources/` — jadx-decompiled Java
    - `xyz/happify/ckemv/` — 10 named files (AppVersion, CardRecord, CveConfig, EmvKernel, HarvestedTx, MainActivity, MeResponse, R, Reporter, SyncWorker)
    - `B2/` — 23 obfuscated single-letter Kotlin files (DB, NFC, upload, config, FileProvider, decoy UI, thread hops)
  - **Reports:**
    - `CKEMV_HARVESTER_ANALYSIS.md`
    - `CKEMV_MASTER_RESEARCH_HANDOFF.md`
    - `CKEMV_MONETIZATION_AND_LIMITS.md`
    - `CKEMV_THREAT_HUNT_PACK.md`
    - `CKEMV_CLASS_BY_CLASS_REPORT.md`
    - `RESEARCH_TRACKER.md` (live status)
    - `RESEARCH_LOG.md` (append-only timeline)
- **Native binutils not on host.** Use Python (no deps) for ELF parsing.
