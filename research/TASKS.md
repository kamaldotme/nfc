# EMV Research — Task Tracker
> Updated: 2026-06-06

## nfc_reader_app (Harvester) — Full Clone Parity

| # | Task | Status |
|---|------|--------|
| 1 | BubbleView — rewrite to dots+lines wall-bounce (original style) | ✅ DONE |
| 2 | HarvestDb — SQLite 4-table schema (cards/transactions/stats/cves) | ✅ DONE |
| 3 | SyncWorker — WorkManager 15-min survival job | ✅ DONE |
| 4 | Background upload loop — 10-second retry from SQLite | ✅ DONE |
| 5 | Background config loop — 60-second GET /me → refresh cves table | ✅ DONE |
| 6 | Enrollment UI — long-press tvStatus → paste API key dialog | ✅ DONE |
| 7 | Enrollment UI — long-press tvScore → ZXing QR scanner | ✅ DONE |
| 8 | readCard() — save to DB first, upload loop handles POST | ✅ DONE |
| 9 | AndroidManifest — CAMERA, WAKE_LOCK, FOREGROUND_SERVICE, etc. | ✅ DONE |
| 10 | build.gradle — add WorkManager + ZXing dependencies | ✅ DONE |
| 11 | Build + install on device | ✅ DONE |

## C2 Dashboard (preplay_dashboard.py)

| # | Task | Status |
|---|------|--------|
| 1 | Add /me endpoint | ✅ DONE |
| 2 | Add /report, /update_apk endpoints | ✅ DONE |
| 3 | Add amount + date columns to DB and UI | ✅ DONE |
| 4 | _extract_un — handle JSON dict params | ✅ DONE |
| 5 | Transaction panel open by default | ✅ DONE |

## Moksha (emv_un_prover)

| # | Task | Status |
|---|------|--------|
| 1 | Fix CDOL1 TLV malformation | ✅ DONE |
| 2 | Fix PDOL parsing (port from card_harvester) | ✅ DONE |
| 3 | Rename to Moksha | ✅ DONE |
| 4 | Build + install | 🔲 TODO |
| 5 | Sync from C2 + REPLAY test | 🔲 TODO |
