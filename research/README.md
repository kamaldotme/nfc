# EMV Pre-Play Attack Research Lab

Local research lab for proving the EMV pre-play attack (CVE-2012-3343 class).
Own card only. Localhost only. No fraud.

## Components

- **`card_harvester/`** — Android app ("Harvester"): taps own card, runs 20 GENERATE AC with sequential UNs, posts to C2
- **`emv_un_prover/`** — Android app ("Moksha"): HCE emulator, OBSERVE + REPLAY modes
- **`lab/preplay_dashboard.py`** — Python C2 + web UI at port 4444

## Quick Start

```bash
# 1. Start C2
python3 lab/preplay_dashboard.py --port 4444

# 2. ADB tunnel
adb reverse tcp:4444 tcp:4444

# 3. Dashboard UI
open http://localhost:4444
```

Then tap your card to Harvester → 20 rows appear in dashboard → sync into Moksha → REPLAY at POS.

See [`PROJECT_OVERVIEW.md`](PROJECT_OVERVIEW.md) for full architecture and [`TASKS.md`](TASKS.md) for the active task list.
