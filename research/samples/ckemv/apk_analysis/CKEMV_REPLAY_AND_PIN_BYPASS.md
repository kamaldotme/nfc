# CKEMV-Harvester — The Replay Model and the PIN-Bypass Question

**Audience:** Security researcher reading the static-analysis chain in this folder.
**Question being answered:** *"NFCGate just relays card info in real time, but this malware stores 20 cryptograms per card and can use them whenever the operator wants — and over £100 in the UK needs PIN, so how do they get past that? What's the ground scenario?"*

**Companion docs in this folder you'll want open:**
- `CKEMV_HARVESTER_ANALYSIS.md` — what the binary actually does
- `CKEMV_MONETIZATION_AND_LIMITS.md` — exhaustive monetization-economics doc (this brief is the punchy version of its §6–§10)
- `CKEMV_NATIVE_FUNCTIONS_REPORT.md` — per-function evidence from the .so files
- `Ghost_Tapping_Guarantee_Marketplaces_Research.md` (project root) — ecosystem map + EMV vulnerability research roundup (its §9.18)

---

## 1. NFCGate vs `ckemv-harvester` — actually a *different attack class*

### 1.1 NFCGate / NGate model — live relay

A victim taps card → bytes go straight over the network to a mule's phone in real time → mule's phone replays them onto a POS at that moment. **No storage.** If the network or the victim's phone drops, the transaction dies.

Geographic separation possible, time separation **not**. The transaction must complete in seconds because EMV state machines and terminal timeouts are sub-second.

### 1.2 `ckemv-harvester` model — pre-recorded batch

When the victim taps, the kernel drives the card through **20 full EMV transactions in one continuous IsoDep session** *before the user pulls the card away*. Each one of those 20 produces a **fresh, independent ARQC cryptogram** because:

- The card's `Application Transaction Counter` (tag `9F36`, "ATC") increments every time `GENERATE AC` is issued. So 20 calls produce ATC values `0x0042, 0x0043, … 0x0055`.
- Each call passes different `Amount`, `Date`, `Currency`, `Country`, `UN`-style parameters into the CDOL1/CDOL2 buffer. The card MACs over those parameters + the new ATC, producing a different cryptogram each time.

The on-disk evidence is `q.java` (the NFC tap handler in the Kotlin layer):

```
3 outer iterations indexed by day offset (0/1/2 from Calendar.getInstance())
  × 8 inner amount iterations for day 0
  × 8 inner amount iterations for day 1
  × 4 inner amount iterations for day 2
= up to 20 transactions per scenario per card tap
```

Each inner iteration starts at `cveConfig.amount` and reduces it 5% then trims by 0-100 random units (see `CKEMV_HARVESTER_ANALYSIS.md` §6.2). The harvester ends up with **20 (ATC, ARQC, params)-tuples** uploaded as JSON to the C2.

So your reading is correct — **time separation is the new capability**. The mule (or, more often, a softPoS terminal under operator control) can submit any one of those 20 cryptograms at a POS minutes/hours later. The cryptogram is a valid MAC because the card actually computed it — the terminal doesn't see anything wrong.

### 1.3 Single sentence

> NFCGate is a remote-control cable to the victim's chip; the CKEMV harvester is a **vault of one-shot vouchers** pre-signed by the victim's chip.

---

## 2. "Use it whenever he likes" — actually no. There's an expiry, and it's short.

This is the part that is widely misunderstood in operator-side marketing. Each captured cryptogram is **a one-shot voucher with a real expiry**, and the expiry is not "when the bank notices and cancels the card." The expiry is **the next time the legitimate cardholder uses their card.**

### 2.1 Why

The bank tracks a `last_seen_ATC` per card. The rule is:

| What the bank sees | What it does |
| --- | --- |
| ATC > last_seen | Accept, advance last_seen |
| ATC == last_seen | Reject (duplicate) |
| ATC < last_seen | Reject (replay / out-of-order beyond tolerance window) |

So the harvester's captures expire as soon as the legitimate cardholder makes a real transaction that pushes `last_seen_ATC` past the captured range.

### 2.2 Worked example

```
Tuesday 10:00  Victim's card is at ATC 0x0041 when harvested.
               Harvester records cryptograms for ATC 0x0042 … 0x0055.
Tuesday 13:00  Victim buys coffee normally. ATC on the card becomes 0x0056.
                Bank's last_seen_ATC for this card becomes 0x0056.
Tuesday 14:00  Operator's mule tries to use the captured ATC=0x0042 cryptogram.
                Bank sees ATC 0x0042 ≤ last_seen 0x0056 → REJECT.
                Every other captured cryptogram (0x0043 … 0x0055) is also dead
                for the same reason — they're all behind the bank's pointer.
```

**One legitimate tap by the cardholder kills the entire 20-shot inventory.**

### 2.3 The real "whenever he likes" window

In practice the operator has **hours, not days**, before the legitimate cardholder uses the card again. This is exactly why the pipeline is built for speed:
- 10-second upload loop (`B2/s.java`)
- Immediate-upload-on-tap path (`B2/o.java`)
- 60-second config refresh + self-update (`B2/t.java`)
- No batching, no scheduling, no "save for later"

The criminal pipeline economics are:
- Capture
- Push to C2 within 10 seconds
- Operator routes a mule + softPoS within minutes
- Cryptograms burned within hours

If a captured card is **freshly skimmed at the airport on a victim who isn't going to use the card for the rest of the trip**, the window can stretch to days. But that's an exception, not the model.

### 2.4 Caveats that lengthen the window (operator's friends)

- **Loose-ATC issuers.** Some issuers historically tolerated large ATC gaps and even out-of-order ATCs because legitimate offline terminals sometimes batch-submit transactions days late. Where this is the case, replay protection effectively fails. The Cambridge pre-play paper (2014) found multiple real terminals/issuers with weak ATC enforcement; some banks have since tightened, many haven't.
- **Cards that don't enforce monotonic ATC on the chip side.** Rare in modern EMV, but a couple of bank-issued chip designs in tier-2/3 markets historically had bugs.
- **Issuer offline-PIN cards.** If the card supports offline transactions, the ATC pointer at the bank can be many transactions behind the chip — the bank sometimes accepts a window of "out of order" ATCs.

But for any tier-1-bank card in the UK / EU / US in 2026, **assume hours, not days.**

---

## 3. The actual numbers — what amounts come out per starting value

So how much money is the harvester baking into each of the 20 cryptograms? Pulled verbatim from the operator's own code in `B2/q.java`.

### 3.1 The formula

```java
// B2/q.java :: lines 252–265 (NFC tap handler)
long amount = cveConfig2.getAmount();           // operator-chosen, from /me C2 config
int i10 = 0;
while (i10 < i4) {                              // i4 = 8 for day 0, 8 for day 1, 4 for day 2
    long j3 = (amount * 95) / 100;              // step 1: multiply by 0.95 (= -5%)
    amount = j3 - Math.min(j3,
        u2.l.D(Y1.e.f1147b, new C0062a(1, 101, 1)));   // step 2: subtract random 1..100
    if (amount >= 100) {                        // step 3: floor at 100 minor units (£1.00)
        ...
        linkedHashMap.put("9F02",
            String.format("%012d", amount));    // EMV tag 9F02 (Amount, Authorized)
        ...
        i10++;
    }
}
```

Three outer day iterations (`today`, `today+1`, `today+2` via `Calendar.add(6, i9)`) × inner iterations `8 + 8 + 4 = 20`. The unit is **minor currency units** — pence for GBP, cents for USD, etc. — per the EMV spec for tag `9F02`.

### 3.2 What the malware ships with as a default — **nothing**

- The `cves` SQLite table is **empty on install** (`B2/a.java:185` — `CREATE TABLE cves` then no `INSERT`).
- The amount lives entirely in the operator's `/me` C2 response (`xyz.happify.ckemv.CveConfig.amount`, an `int`).
- The operator can rotate the table instantly: `B2/a.java:27` does `DELETE FROM cves; INSERT…` atomically on every 60-second config refresh from C2.

There is **no fixed value baked in.** The operator types a number into their C2 dashboard per scenario; the harvester does the math.

### 3.3 Worked tables — what 20 cryptograms come out for typical starting values

> Random `–1..100` minor-unit jitter adds ±£0.50 noise per row; numbers below use the midpoint (–50).

#### `amount = 9900` (£99.00) — **UK no-PIN strategy**

| # | Day | Amount captured | PIN needed in UK? |
|---|---|---|---|
| 1 | today | ~£93.55 | No |
| 2 | today | ~£88.37 | No |
| 3 | today | ~£83.45 | No |
| 4 | today | ~£78.77 | No |
| 5 | today | ~£74.33 | No |
| 6 | today | ~£70.11 | No |
| 7 | today | ~£66.10 | No |
| 8 | today | ~£62.29 | No |
| 9 | today+1 | ~£58.67 | No |
| 10 | today+1 | ~£55.23 | No |
| 11 | today+1 | ~£51.96 | No |
| 12 | today+1 | ~£48.86 | No |
| 13 | today+1 | ~£45.91 | No |
| 14 | today+1 | ~£43.11 | No |
| 15 | today+1 | ~£40.45 | No |
| 16 | today+1 | ~£37.92 | No |
| 17 | today+2 | ~£35.52 | No |
| 18 | today+2 | ~£33.24 | No |
| 19 | today+2 | ~£31.07 | No |
| 20 | today+2 | ~£29.01 | No |

**Sum if all 20 clear: ~£1,127 per card.** Zero PIN ever demanded, zero CVM bypass required.

#### `amount = 100000` (£1000.00) — **high-value strategy**

| # | Day | Amount | PIN needed in UK? |
|---|---|---|---|
| 1 | today | ~£949.50 | **Yes** — needs CVM bypass |
| 2 | today | ~£901.53 | Yes |
| 3 | today | ~£856.05 | Yes |
| 4 | today | ~£812.75 | Yes |
| 5 | today | ~£771.61 | Yes |
| 6 | today | ~£732.53 | Yes |
| 7 | today | ~£695.40 | Yes |
| 8 | today | ~£660.13 | Yes |
| 9 | today+1 | ~£626.63 | Yes |
| 10 | today+1 | ~£594.80 | Yes |
| 11 | today+1 | ~£564.56 | Yes |
| 12 | today+1 | ~£535.83 | Yes |
| 13 | today+1 | ~£508.54 | Yes |
| 14 | today+1 | ~£482.61 | Yes |
| 15 | today+1 | ~£457.98 | Yes |
| 16 | today+1 | ~£434.58 | Yes |
| 17 | today+2 | ~£412.35 | Yes |
| 18 | today+2 | ~£391.23 | Yes |
| 19 | today+2 | ~£371.17 | Yes |
| 20 | today+2 | ~£352.11 | Yes |

**Sum if all 20 clear: ~£12,151.** But every single one is above £100, so every single one needs a CVM-bypass technique (Galloway 2019, Brand Mixup, CDCVM-flag fakery, etc.) — the per-cryptogram success rate is much lower.

#### `amount = 4500` (€45 / £45) — **EU PSD2 strategy**

All 20 captures land between ~£42.75 and ~£13.25 — all under the EU PSD2 €50/tap threshold (no SCA challenge fires). Sum if all clear: **~£540/card**.

#### `amount = 19900` (£199) — **mixed strategy**

Iters 1–~6 are above £100 (need bypass). Iters 7–20 are below £100 (no bypass). Operator gets **a mix**: ~6 high-value PIN-required + ~14 sub-limit no-PIN captures per card from one tap. Operator burns the easy sub-limit ones first; treats the high-value ones as a bonus lane.

### 3.4 Why the formula looks like that — design intent

| Choice | Why |
|---|---|
| **5% decay per iter** | Smooth amount sweep so each of the 20 captured `9F02` values is unique. Unique `9F02` → unique cryptogram MAC input → 20 independently-usable ARQCs. |
| **Random ±1..100 minor-unit jitter** | Anti-fraud-fingerprint. Without it, two consecutive amounts would always be in exact `0.95 × x` ratio — a clean pattern issuer ML could pick up. The 1p–£1.00 noise breaks that signal. |
| **Floor at 100 minor units (£1.00)** | Most merchants don't accept sub-£1 contactless; below this, captures would be wasted. Loop drops the iteration without consuming a slot in the 20. |
| **3-day date sweep (today / +1 / +2 on tag `9A`)** | Gives the operator a 72-hour window in which the date field on the captured cryptogram still matches what the mule will present at the POS. Past-dated transactions trigger more issuer scrutiny than slightly-future-dated ones (terminals sometimes accept future dates as clock drift). |
| **`Locale.CHINA` on the date formatter (q.java:199)** | Pure build-host artefact (operator on Chinese-locale macOS). Date format is `yyMMdd` regardless. Forensic clue confirming Chinese-speaking operator. |

### 3.5 Ground practicality — what the starting value tells you about the campaign

| Starting `amount` | Per-card cash-out if all 20 clear | What it tells defenders about the operator |
|---|---|---|
| 4900 (€49) | ~£540 | EU PSD2 sub-tap strategy. No bypass needed. Targeting EU cardholders. |
| 9900 (£99) | ~£1,127 | UK sub-limit strategy. No bypass needed. Dominant model. |
| 19900 (£199) | ~£2,500 | Mixed strategy. Half the captures need CVM bypass, half don't. |
| 49900 (£499) | ~£6,000 | High-value. Every capture needs CVM bypass. Indicates operator has reliable bypass capability — softPoS + CDCVM-claim or Galloway tampering. |
| 100000 (£1000) | ~£12,000 | Top-tier. Almost always implies the operator is using compromised POS terminals (cf. Oedipus channel) or full wallet-provisioning fraud rather than this harvester's raw cryptograms. |

**Without seeing live `/me` C2 traffic** (HTTPS, no pinning, but we're static-only here), we cannot tell what specific amounts THIS operator is currently configured for — but the formula constrains what's possible regardless of the value they pick, and which regime they're in is recoverable from one captured `/me` response.

### 3.6 Companion data points elsewhere in this analysis

- Per-tx parameter list in upload JSON: see `CKEMV_HARVESTER_ANALYSIS.md` §6.6 — `params` field carries `9F02`, `9A`, `9F1A`, etc.
- The 5%/random/floor math is also visible in the Ghidra pseudo-C for `ckemv_emv_kernel::dol::build_dol_payload` — see `CKEMV_ULTRA_DEEP_REPORT.md` §A.5 — that's the Rust side that *consumes* the operator's `9F02` value and feeds it to the chip's `GENERATE AC`.
- The C2-side `CveConfig` shape: see `CKEMV_CLASS_BY_CLASS_REPORT.md` (xyz.happify.ckemv.CveConfig section) — `id`, `name`, `amount` (int, minor units), `mastercard_tags` map, `visa_tags` map.

---

## 4. The £100 PIN limit — how do they get past it?

UK contactless single-transaction limit is £100 (was £45, raised Oct 2021). Above that, the terminal demands CVM — either chip+PIN entry, or a CDCVM flag from the cardholder device, or the transaction is declined.

The harvester gets past it via one or more of the following. **All of them are documented in public academic / vendor research.** None of them is magic; each exploits a specific real-world implementation gap.

### 3.1 The simplest answer: stay under the limit (sub-£100 stacking)

The harvester captures 20 cryptograms with decreasing amounts. The operator chooses amounts that all sit under £100 from the start:
- `cveConfig.amount = 9999` (pence) → 20 cryptograms all under £99.99
- Mule taps at 20 different merchants in the same shopping trip
- Total haul per card: up to 20 × £99 = £1,980 with **zero PIN ever demanded**

This is the dominant model. Operator marketing on Telegram explicitly frames it as "no PIN needed" / "no SMS needed." The captured-cryptogram economy works because the criminal **does not need single transactions over £100** — they can do 20 sub-limit transactions per card per shopping run.

There is also a **cumulative-limit floor** the card enforces (`9F14 Lower Consecutive Offline Limit` / `9F23 Upper Consecutive Offline Limit`). Once the card has done a certain cumulative amount or count of consecutive offline approvals, it flips CDOL1/CDOL2 to force the next transaction online with CVM. In practice, modern POS terminals are online and the floor counter is rarely hit; the limit a victim experiences is usually the terminal-side £100 ceiling, not the card-side floor.

### 3.2 Bypass family A — CVM-result tampering (the "Visa PIN bypass")

This is the **Galloway & Yunusov, Black Hat USA 2019** attack ("First Contact: Vulnerabilities in Contactless Payments"). It still works in pockets.

- The Card's `Card Transaction Qualifiers` (tag `9F6C`, Visa) and the Terminal's `Terminal Verification Results` (tag `9F34 CVM Results`) carry the "PIN required?" decision. **Neither was cryptographically protected** in the Visa qVSDC flow at the time of the 2019 disclosure.
- A man-in-the-middle device (a rogue softPoS or a relayed terminal under the operator's control) can rewrite the CVM-result bits to say "verified by terminal — no PIN needed" even for a £500 transaction.
- The issuer is supposed to cross-check the actual CVM evidence inside the `9F10 Issuer Application Data` field, but enforcement was historically uneven. **Visa has tightened**; some issuers still don't cross-check rigorously.
- **Mastercard's M/Chip is more resistant** — it signs more of the CVM-relevant TLVs as part of the ARQC computation, so post-facto rewriting fails the issuer-side MAC check.
- In `ckemv-harvester`'s context: the harvester captures the raw card response. The CVM downgrade happens on the **acquirer side** — i.e. when a confederate's softPoS submits the cryptogram with the CVM-result field rewritten. The harvester itself doesn't perform the downgrade.

### 3.3 Bypass family B — Brand Mixup (ETH Zurich, USENIX 2021)

Basin et al. — *"The EMV Standard: Break, Fix, Verify"* — showed you can **present a Mastercard as a Visa** to the terminal:

- During AID selection, the rogue device responds with `A0000000031010` (Visa Credit/Debit AID) when the card is actually Mastercard.
- The terminal happily runs Visa's qVSDC flow, including Visa's looser PIN-bypass behaviour.
- The issuer receives a transaction over the Visa rails with Mastercard underneath — depending on cross-scheme settlement, this either approves or routes to the wrong scheme entirely and processes anyway.
- **Worked against Mastercard cards specifically**, abusing Mastercard's lack of expectation of being asked Visa-style questions.

The harvester's PPSE-fallback logic (it hard-codes `A0000000031010` Visa AID as a default if PPSE matching fails) means the kernel already speaks Visa AID exposition by default — it's straightforward for the operator to wire the brand-mixup variant on the acquirer/softPoS side.

### 3.4 Bypass family C — Inducing authentication failures (ETH Zurich, USENIX 2023)

Basin et al. (follow-up) — *"Inducing Authentication Failures to Bypass Credit Card PINs"*:

- By inducing specific cryptographic failures in the EMV flow (e.g. corrupting Static Data Authentication signatures), the card-terminal protocol enters a fallback path where the card sets `Issuer Action Code - Denial` to zero — effectively telling the terminal *"don't decline me on auth failures."*
- Combined with terminal `Terminal Verification Results` manipulation, this gets a transaction approved with no PIN even on cards that nominally require one.

### 3.5 Bypass family D — CDCVM abuse (mobile wallets path)

Tokenized mobile wallets (Apple Pay, Google Pay) set a **CDCVM** ("Consumer Device CVM") flag in the cryptogram indicating *"the device already verified the cardholder via biometric/passcode."* When the terminal sees CDCVM-set, the £100 ceiling **does not apply** — the transaction can be in the thousands without any PIN.

- **Real attack vector:** a softPoS in attacker control can set the CDCVM flag in the submitted transaction even though the source was plain plastic that did not verify anyone.
- The issuer is supposed to cross-check `9F10` for actual CDCVM evidence (Apple Pay signs a specific token cryptogram structure, Google Pay another). Enforcement is uneven, especially with cross-border acquirers who handle multiple TSPs.
- **High-value lane.** A single CDCVM-flagged transaction with a captured ARQC can be £/€/$ thousands instead of £100.

The "phone the bank to get the OTP and link the card to attacker's Apple Pay" workflow that Krebs and Recorded Future documented (and that `@webu8` is the public-record vendor of) is the *clean version* of this — the operator legitimately provisions the stolen card into their Apple Pay, gets a real CDCVM-capable tokenization, and rides above the £100 ceiling forever. This is a **separate workflow from the static-cryptogram harvester** but the operator group on Telegram typically sells both.

### 3.6 Bypass family E — Transit-mode / Apple Pay Visa relay (USENIX 2025)

Surrey researchers (Pavlides et al.) published *"More is Less: Extra Features in Contactless Payments Break Security"* at USENIX Security 2025. Two distinct attacks:

- **Express Transit mode** — Apple Pay's transit mode skips Face ID/Touch ID. Researchers made a £25,000 fraudulent transaction from a **locked iPhone** by exploiting how the Visa rails handle transit-tagged cryptograms.
- The flaw is in *Visa's* validation of CDCVM, not Apple's biometric. Visa accepts CDCVM-asserted cryptograms even when the apparent "merchant" is a non-transit MCC.

The harvester per se doesn't drive this (the user has to volunteer their phone in transit-pay mode), but the criminal ecosystem around it does — and once they've harvested a chip plus separately phished credentials to provision Apple Pay, the transit-mode pathway becomes available to them.

### 3.7 Bypass family F — Terminal-type spoofing

Different `9F35 Terminal Type` and `9F33 Terminal Capabilities` values cause the card to skip cardholder verification entirely. **Unattended terminals** (e.g. fuel pumps, kiosks) have different CVM rules than attended POS. A rogue softPoS claiming to be an unattended-fuel-pump terminal can pull approvals on cards that would refuse a clerk's till.

The harvester's `params` JSON allows the operator to set these terminal-side fields at capture time. The captured cryptograms can be tailored to look like they came from a low-CVM-required terminal type.

### 3.8 Bypass family G — Country selection

Different jurisdictions have wildly different contactless ceilings:

| Country | Single contactless ceiling | Cumulative |
| --- | --- | --- |
| Japan | ¥15,000 (~£80) | varies |
| Canada | C$250 (~£145) | high |
| UK | £100 | PIN forced above |
| EU (PSD2) | ~€50/tap, €150 cumulative | PIN forced |
| US | $100 (Visa/MC), $200 (Amex) | mostly unlimited for wallets |

The operator chooses **which country's POS to submit through** by controlling the acquirer-side `9F1A Terminal Country Code`. Push UK-card cryptograms through a Japanese-MCC acquirer with a high CVM ceiling and the transaction goes through. (Acquirer-side compliance varies on whether they validate the submitted country code against their own merchant address.)

---

## 5. The ground scenario, end-to-end

Putting all of §1–4 together — what actually happens to a real victim.

```
T+0  Victim is socially engineered into a "bank verification" call.
     Scripts vary: "fraudulent transaction detected, please tap your card to
     the phone so our security app can verify the chip is genuine."

T+5s Victim taps card to attacker phone (the one running `ckemv-harvester`).
     IsoDep session opens (10-second timeout in the binary).

T+8s During those 10 seconds, the harvester's Rust EMV kernel runs each
     loaded scenario from the local `cves` SQLite table. For each scenario
     it executes 20 GENERATE AC transactions against the chip, each with
     a different (amount, date, country, currency, UN) tuple chosen by the
     operator. The chip increments its ATC by 20 and produces 20 distinct
     ARQCs.
     The card's actual `last_seen_ATC` at the bank is unchanged at this
     point — none of these transactions has reached the issuer yet.

T+9s  Victim pulls the card away. Decoy UI ("Geometry Saver") makes the
      attacker phone look idle the whole time.

T+10s Background coroutine `B2/s.java` reads the 20 (ATC, ARQC, params,
      raw TLV) tuples from the local SQLite, serializes JSON, and POSTs to
      `https://tqqemv.xyz/harvest` with the Authorization header (api_key).

T+15s C2 server receives the JSON. Operator-side dashboard now shows a new
      card available with 20 burn-able cryptograms.

T+30s Operator routes the cryptogram batch to a mule team. Two common routes:
      (a) A mule with a softPoS app on their own phone, walks into a real
          retail merchant or operates a faked merchant account. Selects one
          of the 20 cryptograms (highest amount under the local CVM ceiling),
          submits it to the acquirer with attacker-chosen 9F34/9F35/9F1A
          fields, and a real transaction settles. Mule receives goods or
          USDT.
      (b) An online seller who uses captured chip data + brand-mixup or
          CDCVM-claim on the acquirer side — this is the higher-value path
          but requires more sophisticated routing.

T+5min Operator burns the next of the 20 cryptograms at a second merchant.
       Repeat up to 20 times across multiple acquirer/MCC combos to maximize
       cash-out before the cardholder notices and calls the bank.

T+1h-6h Victim eventually uses their card normally somewhere. Bank's
        last_seen_ATC advances past 0x0055. Every remaining captured
        cryptogram is now dead. The race is over.

Result: depending on how many of the 20 cleared, operator monetized between
        £0 (everything got declined, e.g. tier-1 issuer with strict ATC
        + CVM cross-check + velocity rules) and ~£2,000 (sub-£100 stacking
        cleared all 20 transactions).
```

The 30%-70% "any of the 20 successfully monetizes" estimate in `CKEMV_MONETIZATION_AND_LIMITS.md` §7 captures the *probability per card*, not per cryptogram — i.e. the criminal expects 1-in-3 to 2-in-3 of harvested cards to yield *some* revenue, and the typical successful yield per card is £200–£2,000.

---

## 6. Why the model survives despite the short replay window

If captured cryptograms decay in hours, why is this still a multi-billion-dollar criminal industry?

1. **Volume.** Smishing kits (Smishing Triad, Panda Shop, Lighthouse, Lucid, Darcula) feed *thousands* of phished cards per day into the system. The pipeline runs continuously — each card is a fresh "20-shot magazine" with a few hours of usefulness. The criminal doesn't care that any single card decays fast; they care about the aggregate flow.
2. **Sub-£100 stacking.** Twenty £99 transactions are 1,980 quid per card *with no PIN ever needed* and no academic bypass required. The simple model is the dominant model.
3. **Loose-ATC issuers in tier-2/3 markets.** Many smaller issuers don't enforce strict ATC monotonicity. The criminal targets *those* card BINs preferentially.
4. **Wallet-provisioning pivot.** Once a card has been phished AND linked to attacker Apple Pay (separate workflow, not via the harvester), the £100 ceiling becomes moot — wallets bypass it via CDCVM. This is the **vertical integration** of the criminal ecosystem: smishing→credentials→harvester→wallet provisioning→long-lived high-value monetization.
5. **Acquirer-side laxity.** Cross-border transactions with manipulated `9F1A` / `9F34` / `9F35` fields slip through acquirer-of-record consistency checks that many acquirers don't run.

---

## 7. Quick TL;DR for the headline question

> *"Stores 20 instances per card and uses them whenever he likes, before the user blocks the card?"*

**Almost.** The 20-instance batch is real. The "whenever he likes" is wrong — the window is **hours, not days, in practice**, because the legitimate cardholder's next tap advances the bank's `last_seen_ATC` and kills every remaining captured cryptogram. The window can stretch to days only on cards the victim isn't currently using (travel, lost-but-not-cancelled), or against loose-ATC issuers.

> *"Over £100 in the UK needs PIN — how do they bypass?"*

Five layered answers, in descending order of operational importance:
1. **They mostly don't bypass — they stay under £100** by chosen amounts. 20× £99 stacking is the dominant cash-out path.
2. **CVM-result tampering** at the acquirer/softPoS side (Galloway & Yunusov, Black Hat 2019) for Visa cards on weakly-validating issuers.
3. **CDCVM abuse**: claim "device verified the cardholder" on the acquirer side without actually having a real wallet token. High-value lane.
4. **Brand Mixup** (ETH Zurich, USENIX 2021): present Mastercard as Visa to exploit Visa's looser PIN rules.
5. **Country/terminal-type spoofing**: route through jurisdictions with higher ceilings, or claim to be an unattended terminal that skips CVM.

The newer attacks (USENIX 2025 transit-mode + Apple Pay Visa relay, USENIX 2023 inducing-auth-failures) are even more potent but require the wallet/provisioning angle, which is a parallel workflow this specific harvester binary does not implement.

> *"Ground scenario?"*

Captured 20 cryptograms uploaded within 10 seconds → operator dashboards the card → mule + softPoS team burns cryptograms across multiple sub-£100 merchants within minutes-to-hours → race ends when victim's next legitimate tap advances ATC → revenue per successful card £200–£2,000 → repeated across thousands of cards/day fed by the smishing pipeline. The operator runs the funnel; they don't need any single card to be long-lived.

---

## 8. Defender's leverage on this specific attack

Pulled from `CKEMV_MONETIZATION_AND_LIMITS.md` §9, condensed:

**Issuers** — the **single highest-leverage** intervention:
1. **Strict ATC monotonicity enforcement at the issuer host.** No tolerance window beyond a small forward gap. This kills ~70% of captured-cryptogram value.
2. Velocity scoring on contactless transactions with geo-profile.
3. **Mandatory CVM cross-check in `9F10` IAD** — never trust terminal-reported "no CVM" without IAD evidence.
4. Push tokenization aggressively.

**Acquirers:**
1. Mandatory `9F1A` ↔ acquirer-of-record country consistency.
2. Mandatory submission of TVR/CVM-result fields end-to-end (so issuer can audit).
3. Refuse cross-border submissions with TRID/TSP routing inconsistencies.

**Cardholders:**
1. Tokenize. Apple Pay / Google Pay over plastic.
2. Don't tap your card to a phone or device handed to you by a stranger or anyone on a phone call claiming to be your bank.
3. Per-transaction push/SMS alerts at the issuer, with low thresholds.
4. **If you suspect your card was tapped to an unknown device — call the issuer immediately.** Every hour delayed is fresh cryptograms the criminal can still burn.

---

## 9. References (all OSINT)

- **EMVCo** specs (book 2, book 3 — contactless / kernel definitions)
- **Bond, Choudary, Murdoch, Skorobogatov, Anderson** — *"Chip and Skim: Cloning EMV Cards with the Pre-play Attack"*, IEEE S&P 2014. https://www.cl.cam.ac.uk/research/security/banking/preplay/
- **Galloway & Yunusov (Positive Technologies)** — *"First Contact: Vulnerabilities in Contactless Payments"*, Black Hat USA 2019.
- **Basin, Sasse, Toro-Pozo (ETH Zurich)** — *"The EMV Standard: Break, Fix, Verify"*, USENIX Security 2021 (Brand Mixup). https://www.usenix.org/conference/usenixsecurity21/presentation/basin
- **Basin, Sasse, Toro-Pozo (ETH Zurich)** — *"Inducing Authentication Failures to Bypass Credit Card PINs"*, USENIX Security 2023. https://www.usenix.org/system/files/sec23summer_430-basin-prepub.pdf
- **Pavlides et al. (University of Surrey)** — *"More is Less: Extra Features in Contactless Payments Break Security"*, USENIX Security 2025. https://www.usenix.org/system/files/usenixsecurity25-pavlides.pdf  (transit-mode + Apple Pay Visa relay £25,000 demo)
- **arXiv 2025** — *"SoK: Attacks on Modern Card Payments"*. https://arxiv.org/pdf/2504.03363
- **ESET** — NGate (Aug 2024). https://www.welivesecurity.com/en/eset-research/ngate-android-malware-relays-nfc-traffic-to-steal-cash/
- **Cleafy** — SuperCard X (Apr 2025). https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation
- **Recorded Future Insikt Group** — Ghost-Tapping ecosystem (Aug 2025). https://www.recordedfuture.com/research/ghost-tapping-chinese-criminal-ecosystem
- **Group-IB** — Ghost Tapped (Jan 2026). https://www.group-ib.com/blog/ghost-tapped-chinese-malware/
- **Zimperium zLabs** — Tap-and-Steal (Oct 2025). https://zimperium.com/blog/tap-and-steal-the-rise-of-nfc-relay-malware-on-mobile-devices
- **Krebs on Security** — Phished data → Apple/Google Wallets (Feb 2025). https://krebsonsecurity.com/2025/02/how-phished-data-turns-into-apple-google-wallets/
- **BleepingComputer** — Hackers share methods to bypass 3DS. https://www.bleepingcomputer.com/news/security/hackers-share-methods-to-bypass-3d-secure-for-payment-cards/

Also in this folder:
- `CKEMV_MONETIZATION_AND_LIMITS.md` — full economics doc (this brief is a condensed pass focused on the headline question)
- `CKEMV_HARVESTER_ANALYSIS.md` — §6.2 (the 20-iteration loop) and §6.6 (upload payload shape)
- `CKEMV_NATIVE_FUNCTIONS_REPORT.md` — `ckemv_emv_kernel::dispatcher::TransactionDispatcher` and `kernels::visa` / `kernels::mchip`
- `Ghost_Tapping_Guarantee_Marketplaces_Research.md` §9.18 — academic EMV vulnerability table
