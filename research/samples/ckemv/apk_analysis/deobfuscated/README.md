# CKEMV Harvester — Deobfuscated Source Tree

**Generated:** 2026-05-17  
**Sample:** `samples/ckemv/sample.apk` · pkg `xyz.happify.ckemv` · label *"Geometry Saver"*  
**Method:** Operator-authored classes identified, renamed, and reconstructed as Kotlin (the language the operator wrote in).

---

## What this directory is

The jadx decompilation of the APK produces ~100 obfuscated single-character packages and ~2,000 files. 99% of that is Android/Kotlin/OkHttp/Gson library code that R8 shrank and renamed. **Only 33 classes were authored by the operator.**

This directory contains those 33 classes reconstructed under semantic names, in the package layout the operator most likely wrote. It is NOT a runnable project — it is a reading aid. Each file has an `// orig:` header pointing back to its obfuscated counterpart.

For the explanation of WHY names are random, see `00_WHY_OBFUSCATED.md`.  
For the package ownership map, see `01_PACKAGE_TRIAGE.md`.  
For the obfuscated↔semantic mapping table, see `02_RENAME_MAP.json`.

---

## Operator source layout

```
src/xyz/happify/ckemv/
├── MainActivity.kt          ← The only Activity. Entry point. Wires UI + NFC + coroutines.
├── SyncWorker.kt            ← WorkManager 15-min backup job: refreshes /me scenarios.
│
├── model/
│   ├── AppVersion.kt        ← {major, minor, hash} — what the C2 says is the latest build
│   ├── CardRecord.kt        ← One tapped card: pan/aid/network/rawData + list of HarvestedTx
│   ├── CveConfig.kt         ← One operator scenario: amount + per-scheme TLV tag overlays
│   ├── HarvestedTx.kt       ← One ARQC capture: atc + arqc + timeMs + params + cve_id
│   └── MeResponse.kt        ← Wire shape of GET /me: name + cves[] + latest_version?
│
├── jni/
│   ├── EmvKernel.kt         ← JNI bridge → libckemv_android.so (Rust EMV state machine)
│   └── Reporter.kt          ← JNI bridge → libckemv_reporter.so (Rust HTTPS/ureq transport)
│
├── db/
│   └── HarvestDatabaseHelper.kt  ← SQLiteOpenHelper for CkemvHarvest.db (schema v8)
│
├── nfc/
│   └── NfcTapHandler.kt     ← THE HEART. Drives EmvKernel against a card, harvests ARQCs.
│
├── net/
│   ├── C2.kt                ← C2 base URL constant (https://tqqemv.xyz)
│   ├── UploadLoop.kt        ← 10-second POST loop: sweeps DB, uploads, deletes on "Success"
│   ├── ConfigUpdateLoop.kt  ← 60-second GET /me loop: refresh cves, trigger self-update
│   └── PostTapUploader.kt   ← Single-shot upload fired immediately after a tap
│
├── update/
│   └── ApkSideloader.kt     ← Fires ACTION_VIEW on the downloaded APK via FileProvider
│
└── ui/
    ├── DecoyView.kt          ← Custom View — the entire "Geometry Saver" visible app
    ├── AnimationDot.kt       ← Data record: one bouncing dot {x,y,r,vx,vy,color}
    ├── DecoyAnimationRunnable.kt  ← Background thread: 60 FPS dot-position updates
    ├── ShowProgressBar.kt    ← suspend fn: progressBar.visibility = VISIBLE
    ├── HideProgressBar.kt    ← suspend fn: progressBar.visibility = INVISIBLE
    ├── UploadAckFlash.kt     ← suspend fn: centered "✅" Toast (PostTapUploader path)
    ├── UploadAckFlashLoop.kt ← suspend fn: same Toast (UploadLoop path)
    ├── ProgressPump.kt       ← Collects progressFlow StateFlow → drives progress bar
    ├── ProgressPumpStep.kt   ← FlowCollector: progressBar.progress = value
    └── QrScanCallback.kt     ← ZXing result callback: writes decoded QR string to api_key
```

---

## Obfuscated → semantic name quick-reference

| Obfuscated file | Semantic class | Sub-package |
|---|---|---|
| `B2/a.java` | `HarvestDatabaseHelper` | `db/` |
| `B2/q.java` | `NfcTapHandler` | `nfc/` |
| `B2/s.java` | `UploadLoop` | `net/` |
| `B2/t.java` | `ConfigUpdateLoop` | `net/` |
| `B2/o.java` | `PostTapUploader` | `net/` |
| `B2/h.java` | `ApkSideloader` | `update/` |
| `B2/w.java` | `DecoyView` | `ui/` |
| `B2/v.java` | `AnimationDot` | `ui/` |
| `B2/u.java` (case 0) | `DecoyAnimationRunnable` | `ui/` |
| `B2/m.java` | `ShowProgressBar` | `ui/` |
| `B2/p.java` | `HideProgressBar` | `ui/` |
| `B2/n.java` | `UploadAckFlash` | `ui/` |
| `B2/r.java` | `UploadAckFlashLoop` | `ui/` |
| `B2/l.java` | `ProgressPump` | `ui/` |
| `B2/k.java` | `ProgressPumpStep` | `ui/` |
| `B2/b.java` | `QrScanCallback` | `ui/` |
| `B2/f.java` | *(SelfUpdateContinuation — compiler artefact, omitted)* | — |
| `B2/c,g,i,j.java` | *(compiler continuations — omitted)* | — |
| `B2/InterfaceC0106a/b` | *(marker interfaces — omitted)* | — |
| `xyz/happify/ckemv/MainActivity.java` | `MainActivity` | root |
| `xyz/happify/ckemv/SyncWorker.java` | `SyncWorker` | root |
| `xyz/happify/ckemv/EmvKernel.java` | `EmvKernel` | `jni/` |
| `xyz/happify/ckemv/Reporter.java` | `Reporter` | `jni/` |
| `xyz/happify/ckemv/AppVersion.java` | `AppVersion` | `model/` |
| `xyz/happify/ckemv/CardRecord.java` | `CardRecord` | `model/` |
| `xyz/happify/ckemv/CveConfig.java` | `CveConfig` | `model/` |
| `xyz/happify/ckemv/HarvestedTx.java` | `HarvestedTx` | `model/` |
| `xyz/happify/ckemv/MeResponse.java` | `MeResponse` | `model/` |

---

## Suggested reading order

1. `model/` — get the data shapes in your head (5 files, all trivial)
2. `jni/EmvKernel.kt` — understand what the native side exposes
3. `jni/Reporter.kt` — understand how the C2 is reached
4. `db/HarvestDatabaseHelper.kt` — what gets persisted and how
5. `MainActivity.kt` — see how the whole app is assembled and wired
6. `nfc/NfcTapHandler.kt` — the tap-time harvest loop (the core attack)
7. `net/UploadLoop.kt` + `net/PostTapUploader.kt` — exfiltration
8. `net/ConfigUpdateLoop.kt` — C2 check-in and self-update trigger
9. `update/ApkSideloader.kt` — self-update installation
10. `ui/` — decoy view, optional reading unless you need the UX cover story

---

## New finding from reading raw source (correction to Phase B report)

**`B2/n.java` and `B2/r.java`** were described as "progress bar flash" in the Phase B report. The actual source shows both simply show a **centered "✅" Toast** (`Toast.makeText(activity, "✅", Toast.LENGTH_SHORT)` with `Gravity.CENTER`). They are identical — `n` fires from `PostTapUploader`, `r` fires from `UploadLoop`. There is no progress bar involvement in the upload-ack signal.
