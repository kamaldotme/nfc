# CKEMV-Harvester — Complete Function Report (Plain-English)

**Audience:** A junior programmer / smart non-specialist. Every function is paired with the question *"Why does this exist?"* and *"What does it do, in one paragraph?"* — no Rust-mangling, no EMV jargon without a plain-English gloss.

**Sample:** `samples/ckemv/sample.apk` · `xyz.happify.ckemv` · "Geometry Saver".
**Analysis posture:** Static only. Defender's brief — no execution, no live C2 probing.
**Tracker:** `RESEARCH_TRACKER.md` · **Log:** `RESEARCH_LOG.md` · **Memory:** `~/.claude/projects/.../memory/`.

The report is in **six parts**:

1. The 60-second mental model
2. Java / Kotlin functions — every method, plain English
3. `libckemv_android.so` — the Rust EMV brain, every function explained
4. `libckemv_reporter.so` — the Rust C2 messenger, every function explained
5. What gets bundled but isn't operator code (libraries we skip)
6. Defender takeaways, IOCs, and detection ideas

---

## Part 1 — 60-second mental model

> A criminal hands you a phone with a screensaver app called **Geometry Saver**. Anyone who taps a contactless bank card on the back of the phone has just had the card's secrets (PAN, transaction counter, and a fresh authorization cryptogram for an attacker-chosen amount on an attacker-chosen day) silently posted to a website on the internet called `tqqemv.xyz`. The phone re-tries every 10 seconds until it succeeds, and every 60 seconds it asks the website for new instructions or for a newer copy of itself.

That's the whole app. The Java code is the *receptionist* that takes calls from the operating system ("NFC tap happened!") and routes them. The actual EMV ("EMV" = the global chip-card protocol) work happens inside a Rust library that ships with the APK. A second Rust library does the HTTPS calls.

```
        [tap card on phone]
                │
                ▼
   ┌────────────────────────┐                              ┌──────────────┐
   │   MainActivity (Java)  │  → JSON of card secrets  →   │  tqqemv.xyz  │
   └────────────────────────┘                              └──────────────┘
       │            ▲
       │ (drives    │ (fetches new instructions every 60s
       │  card      │  and new APK every time a newer version
       │  through   │  is advertised)
       │  EMV)
       ▼
   ┌────────────────────────┐
   │   libckemv_android.so  │   ← Rust state machine for the chip
   │   libckemv_reporter.so │   ← Rust HTTPS client
   └────────────────────────┘
```

The **map of who calls what** is the same one we'll keep returning to in this report:

| Where you are | Who you call next |
| --- | --- |
| User opens the app | `MainActivity.onCreate` |
| Activity creates UI + starts 3 background coroutines + 1 WorkManager job | `B2.l` (UI), `B2.s` (uploader), `B2.t` (config/update), `SyncWorker` |
| User taps a card | `MainActivity.onNewIntent` → launches `B2.q` |
| `B2.q` walks the chip through each scenario | calls `EmvKernel.*` (which calls into `libckemv_android.so`) |
| `B2.q` finishes, persists, kicks immediate upload | `B2.a` (DB) + `B2.o` (uploader) |
| Any upload uses HTTPS | calls `Reporter.*` (which calls into `libckemv_reporter.so`) |

---

## Part 2 — Java / Kotlin classes (the receptionist)

For each class we list its purpose first, then a table of **method → why it exists / what it does**. Lines marked *(Kotlin data-class boilerplate)* are auto-generated equality / copy / hashCode helpers — they have no business logic; we name them so you can see we didn't skip anything, but you can safely ignore them.

### 2.1 `AppVersion.java` — *"What version do you think I should be running?"*

A tiny data record the C2 sends back when the app asks "got anything new?". The app compares this against its own hard-coded version (1.7). If the C2 says "1.8" or higher, the app downloads and installs the new APK from the C2.

| Method | Why it exists | What it does |
| --- | --- | --- |
| `AppVersion(int, int, String)` | Construct one from JSON | Stores `major`, `minor`, `hash` (the build's git commit). Throws if `hash` is null. |
| `getMajor()` / `getMinor()` / `getHash()` | Read the fields | One-line getters. |
| `copy(...)` / `copy$default(...)` | Kotlin data-class boilerplate | Make a duplicate with optional field overrides. Never called in this APK. |
| `component1/2/3` | Kotlin destructuring | Same as the getters; never called. |
| `equals` / `hashCode` / `toString` | Boilerplate | Compare/print. |

### 2.2 `CveConfig.java` — *"What scenario should I play against the next card?"*

One scenario the operator wants run against every tapped card. The word *"CVE"* is the operator's jargon — it does **not** mean a real CVE-numbered vulnerability. Think "playbook entry". Each one carries an amount, a label, and two **TLV overlay maps** — one for Visa cards, one for Mastercard cards — that tell the EMV kernel what terminal-side values to inject when asking the chip for a cryptogram.

| Method | Why | What it does |
| --- | --- | --- |
| `CveConfig(id, name, amount, mcTags, visaTags)` | Build one from JSON | Saves all fields. Null-checks each non-int. |
| `getId/getName/getAmount/getMastercard_tags/getVisa_tags` | Read fields | Simple getters. |
| `copy/copy$default/component1..5/equals/hashCode/toString` | Boilerplate | — |

### 2.3 `CardRecord.java` — *"Everything we just stole from one tap"*

The in-memory record built by the NFC handler. Holds the PAN (card number), AID (which payment app on the card we used), the network ("Visa"/"Mastercard"), the raw TLV dump, and a list of `HarvestedTx` (one per scenario iteration).

| Method | Why | What it does |
| --- | --- | --- |
| `CardRecord(pan, aid, network, rawData, txs)` | Build the record | Saves all five fields. |
| `getPan/getAid/getNetwork/getRawData/getTxs` | Read | Getters. |
| (boilerplate) | — | — |

### 2.4 `HarvestedTx.java` — *"One cryptogram we successfully harvested"*

One row inside a `CardRecord.txs`. Contains the **ARQC** (Authorization Request Cryptogram — the 8-byte signature the bank uses to verify the transaction), the **ATC** (the chip's transaction counter), how long the harvest took, the JSON of the parameters we fed the chip, and which scenario produced it.

| Method | Why | What it does |
| --- | --- | --- |
| `HarvestedTx(atc, arqc, timeMs, params, cveId)` | Build | Saves all five. |
| `getAtc/getArqc/getTimeMs/getParams/getCve_id` | Read | Getters. |
| (boilerplate) | — | — |

### 2.5 `MeResponse.java` — *"The C2's reply to `GET /me`"*

The shape of the JSON the operator's server sends back when the device asks "any new instructions?". Has the operator's name (for the dashboard), the new list of scenarios, and the latest version.

| Method | Why | What it does |
| --- | --- | --- |
| `MeResponse(name, cves, latestVersion)` | Build from JSON | Saves all three; `latestVersion` may be null. |
| `getName/getCves/getLatest_version` | Read | Getters. |
| (boilerplate) | — | — |

### 2.6 `EmvKernel.java` — *the bridge into the Rust EMV brain*

This is **the** Java handle on the Rust state machine. Java does **none** of the work — every method is `native` and lives in `libckemv_android.so`. There is one global instance (`EmvKernel.INSTANCE`).

| Method | Why | What it does |
| --- | --- | --- |
| static `loadLibrary("ckemv_android")` | Pull the Rust library into the process | Done once at class-load. |
| `initialize(boolean isContactless, String paramsJson)` | Reset / configure the state machine for one tap | Hands a JSON blob to Rust containing the scenario's overlay tags + per-iteration overrides (amount, date). After this, Rust knows the play to call. |
| `getStatus()` | "Are you still working?" | Returns `"InProgress"`, `"Completed"`, or `"Failed"` — Java polls this in a loop. |
| `getNextCommand()` | "What APDU should I send the card next?" | Returns the next chip command as a hex string. Empty = nothing yet. |
| `processResponse(String responseHex)` | "Here's what the card replied" | Feeds the chip's response back to Rust so the state machine can advance. |
| `getPan()` / `getAid()` / `getAtc()` / `getArqc()` | "Read out the loot when you're done" | Each returns a hex string with the corresponding EMV value. Empty if not captured. |
| `getTxParameters()` | "What terminal-side values did you actually use?" | Returns a JSON blob — used for audit / C2 replay. |
| `getRawData()` | "Give me every byte you saw on the wire" | Returns a JSON TLV map of everything observed. |

### 2.7 `Reporter.java` — *the bridge into the Rust HTTPS client*

Same idea, smaller. Three native methods live in `libckemv_reporter.so`.

| Method | Why | What it does |
| --- | --- | --- |
| static `loadLibrary("ckemv_reporter")` | Load the Rust library | Once. |
| `fetchCves(String apiKey, String baseUrl)` | "Get new scenarios" | HTTPS `GET {baseUrl}/me` with the API key in an `Authorization` header. Returns the response body, or `"Error: …"`. |
| `fetchReport(String apiKey, String baseUrl)` | "Get a report from the operator side" | `GET {baseUrl}/report`. **Never called by Java in this build** — leftover from another tool or a future feature. |
| `uploadHarvestData(String json, String apiKey, String baseUrl)` | "Send the stolen data" | HTTPS `POST {baseUrl}/harvest` with the JSON body. Returns response text; Java callers look for `"Success"`. |

### 2.8 `SyncWorker.java` — *the "in case the app dies" safety net*

A `WorkManager` periodic job. Every 15 minutes the OS wakes the app for ~10 seconds to do a small piece of work. This worker only refreshes the scenarios — it does **not** check for self-update.

| Method | Why | What it does |
| --- | --- | --- |
| `SyncWorker(Context, WorkerParameters)` | Constructor required by WorkManager | Stores context. |
| `f()` (= `doWork()`) | The actual periodic job | Reads the API key from SQLite; if present, calls `Reporter.fetchCves`; if the response is not an error, JSON-decodes it and overwrites the local scenarios table; returns Success/Failure. |

### 2.9 `MainActivity.java` — *the only screen and the conductor*

The single Activity. Has the decoy UI on top, but its real work is **wiring up**: it asks the OS to send all NFC events here, it starts the three background coroutines, and it schedules the WorkManager job. It also contains the self-update downloader.

**Fields you'll see referenced**

| Field | Plain English |
| --- | --- |
| `f5251x` (NfcAdapter) | Handle to the phone's NFC chip |
| `f5252y` (PendingIntent) | "Send NFC events to me" cookie the OS uses |
| `f5253z` (boolean) | "Am I already downloading an update?" guard |
| `f5247A` (B2.a) | The SQLite helper |
| `f5248B` (LinearLayout) | The hidden "scan QR" hotzone |
| `f5249C` (ProgressBar) | The thin green bar that flashes during NFC reads |
| `D` (StateFlow<Integer>) | Live progress percentage from the NFC handler to the UI |
| `f5250E` (ActivityResultLauncher) | Callback for the QR scanner |

**Methods**

| Method | Why | What it does |
| --- | --- | --- |
| static `v(MainActivity, byte[])` | Print bytes as uppercase hex | Helper used to encode APDU responses for the Rust kernel. |
| static `x(MainActivity, String)` | Parse hex back to bytes | Inverse of `v()`. |
| static `w(MainActivity, apiKey, version, cont)` | Download a newer APK from the C2 | Builds a JSON body `{"api_key":"…"}`, POSTs it via the bundled OkHttp library, writes the response to `…/Downloads/update_v{version}.apk`, then hands off to `B2.h` to launch the system installer. The `f5253z` flag prevents two parallel downloads. |
| `onCreate(Bundle)` | The OS just started us | (1) keep the screen on; (2) hide the action bar; (3) build the SQLite helper; (4) **ask the user to whitelist us from battery optimization** (popping the system settings page if not already whitelisted); (5) build the decoy UI in code; (6) schedule the 15-minute WorkManager job; (7) launch 3 coroutines (`B2.l` UI pump, `B2.s` uploader, `B2.t` config/update); (8) register a `PendingIntent` so the OS sends every NFC discovery here. |
| `onResume()` | The screen came back to the front | Tell `NfcAdapter` to dispatch `IsoDep` taps to us via foreground dispatch. |
| `onPause()` | The screen went away | Cancel that dispatch. |
| `onNewIntent(Intent)` | The OS just delivered an NFC event | If it isn't an NFC action, return. Pull the `Tag` out; if it's an `IsoDep` (any chip card), launch `B2.q` on a background thread to drive the kernel. |
| anonymous `onLongClick(View)` (case 0) | Long-press on the empty top-row text | Pops an `AlertDialog` titled *"Manual Key Update"* with a paste field. On confirm: writes the trimmed string into `stats.api_key`. |
| anonymous `onLongClick(View)` (case 1) | Long-press on the right-side hot zone | Launches ZXing's QR scanner with prompt *"Scan Collector API Key"*; the result goes back through `B2.b::a`. |

### 2.10 `R.java`

Auto-generated table of resource IDs (390 KB). **Skip.**

### 2.11 `B2/a.java` — `DatabaseHelper`

The SQLite cache. One file `CkemvHarvest.db`, four tables: `cards`, `transactions`, `stats` (single row, holds the API key + scan counter), `cves` (scenarios from the C2).

| Method | Why | What it does |
| --- | --- | --- |
| `a(Context)` | Constructor | Opens (or creates) `CkemvHarvest.db` at version 8. |
| `onCreate(SQLiteDatabase)` | First run | Creates the four tables, inserts a default `stats(0, NULL)` row. |
| `onUpgrade(SQLiteDatabase, old, new)` | DB version bump | If old < 8: drops everything (including an old `terminals` table from an earlier build) and re-creates fresh. No migration of data. |
| `i()` | "Give me the API key" | `SELECT api_key FROM stats WHERE id=1`. Returns null if unset. |
| `o(CardRecord)` | "Save this captured card" | Inserts one `cards` row, then one `transactions` row per `HarvestedTx`. Returns the new `cards.id`. |
| `a(long id)` | "Delete this card and its transactions" | Called after successful upload. |
| `A(List<CveConfig>)` | "Replace all scenarios with this fresh list" | Wraps `DELETE FROM cves; INSERT …` in a transaction so the table is never half-empty. |
| `b()` | "Give me all scenarios" | Reads every row of `cves`, JSON-decodes the two tag-map columns, returns an `ArrayList<CveConfig>`. (jadx mangled the body; recovered behaviorally.) |

### 2.12 `B2/q.java` — **the NFC tap handler. This is the heart of the harvester.**

A coroutine kicked off whenever a card is tapped. We'll walk it step by step in plain English.

1. **Reset the progress bar** to 0%, show it.
2. **Open a channel to the card** (`IsoDep.connect()`, 10-second timeout).
3. **Read scenarios** from the local DB. If none, bail.
4. **Ask the card "what payment apps are on you?"** — sends the standard PPSE select APDU.
5. **Identify the network**: AID prefix `A000000003…` = Visa, `A000000004…` = Mastercard, else Unknown.
6. **Filter scenarios** to those with a non-empty tag-map for the detected network.
7. **For each surviving scenario, three days × variable iterations**:
   - Outer loop `i9 ∈ {0,1,2}` — pick today, today+1, today+2 as the transaction date.
   - Inner count = `8 if i9 ∈ {0,1} else 4` → up to **8 + 8 + 4 = 20 transactions per scenario**.
   - Per iteration: `amount = (amount × 95)/100 − rand(0..100)`; bail if amount < 100.
   - Build the params JSON: copy the scenario's tag map, then overlay `9A` = the chosen date and `9F02` = the chosen amount (zero-padded to 12 digits).
   - `EmvKernel.initialize(true, paramsJson)`. Then loop: while `getStatus()` is `"InProgress"`, get the next APDU command, `IsoDep.transceive` it, feed the bytes (as hex) back via `processResponse`.
   - When the kernel finishes, read out `pan`, `aid`, `atc`, `arqc`, `txParameters`, `rawData`. If we got an ARQC, append a `HarvestedTx`.
   - Update the progress bar percentage.
8. **Close the channel.** Build a `CardRecord`. Persist to SQLite.
9. **Build the upload JSON** and launch `B2.o` to fire it off immediately.
10. **Hide the progress bar** by hopping to the main thread (`B2.p`).

Method-by-method:

| Method | Why | What it does |
| --- | --- | --- |
| `q(MainActivity, IsoDep, cont)` | Coroutine ctor | Saves the activity reference and the IsoDep handle. |
| `b(cont, obj)` / `e(obj1, obj2)` | Kotlin coroutine plumbing | Compiler-generated `create` and `invoke`. |
| `k(obj)` | The body | Everything above. |

### 2.13 `B2/s.java` — the 10-second upload loop

Background coroutine. Sweeps the local DB; uploads every unsent card; deletes rows that