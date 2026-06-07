---
name: CKEMV deobfuscated source tree
description: Location and structure of the Phase F semantic reconstruction of all 28 operator-authored Kotlin files
type: reference
originSessionId: 32f0510b-6fce-41e1-bdae-d6b48455a376
---
`samples/ckemv/apk_analysis/deobfuscated/` — operator-eye reconstruction of the APK source (Phase F, 2026-05-17).

- `00_WHY_OBFUSCATED.md` — why names are random (R8 defaults; evidence; kept-name rules)
- `01_PACKAGE_TRIAGE.md` — all 100 obfuscated packages classified; only `B2/` is operator code
- `02_RENAME_MAP.json` — obfuscated ↔ semantic name + evidence for every class
- `README.md` — layout guide + obfuscated→semantic quick-reference table
- `src/xyz/happify/ckemv/` — 28 `.kt` files in 7 sub-packages:
  - `model/` — AppVersion, CardRecord, CveConfig, HarvestedTx, MeResponse
  - `jni/` — EmvKernel, Reporter
  - `db/` — HarvestDatabaseHelper
  - `nfc/` — NfcTapHandler (the core harvest loop)
  - `net/` — C2, UploadLoop, ConfigUpdateLoop, PostTapUploader
  - `update/` — ApkSideloader
  - `ui/` — DecoyView, AnimationDot, DecoyAnimationRunnable, ShowProgressBar, HideProgressBar, UploadAckFlash, UploadAckFlashLoop, ProgressPump, ProgressPumpStep, QrScanCallback
  - root — MainActivity, SyncWorker

**Correction to Phase B report:** `B2/n.java` (UploadAckFlash) and `B2/r.java` (UploadAckFlashLoop) both show a centered "✅" Toast — NOT a progress bar flash as previously stated.
