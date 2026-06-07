# CKEMV-Harvester — Threat Actor Intel & Ecosystem Attribution

**Posture:** Defender-side. All references are to publicly published threat-intelligence reports. Operator-side handles below were supplied by the user from authorised penetration of the target group; this report **does not** instruct or facilitate contact with those handles, only documents them so defenders can build hunt rules.

**Sample tie:** `samples/ckemv/sample.apk` · pkg `xyz.happify.ckemv` · label *"Geometry Saver"* · C2 `https://tqqemv.xyz` · build user `arthur` (macOS) · Rust workspace `ckemv-{android,reporter,emv-kernel,core}` · internal version 1.7.

**Companion files referenced:**
- `Ghost_Tapping_Guarantee_Marketplaces_Research.md` (project root) — ecosystem map: marketplaces, NFC families, mules, smishing-to-NFC pipeline.
- `CKEMV_HARVESTER_ANALYSIS.md` / `CKEMV_NATIVE_FUNCTIONS_REPORT.md` / `CKEMV_OSS_MODULE_INVENTORY.md` / `CKEMV_ULTRA_DEEP_REPORT.md` (this dir) — static-analysis chain.

---

## 1. The three direct questions, answered

### 1.1 Where did this type of malware start?

**Short answer:** Public NFC-relay Android malware traces to **NFCGate**, an open-source NFC research tool published by **TU Darmstadt** (Secure Mobile Networking Lab, "Seemoo"). NFCGate was designed for legitimate NFC traffic capture/analysis. It was first weaponised in the wild as **NGate**, attributed by **ESET** in **August 2024** to a campaign that had been active in Czechia since **November 2023**.

| When | What | Source |
| --- | --- | --- |
| ~2015 onward | NFCGate published by TU Darmstadt as academic NFC research tooling | TU Darmstadt Seemoo (GitHub) |
| Nov 2023 | First in-the-wild Android NFC-relay campaign (Czechia), pre-NGate | ESET (welivesecurity, Aug 2024) |
| Aug 2024 | ESET names **NGate**; first time NFC capture-and-relay seen in widespread Android malware | [welivesecurity — NGate](https://www.welivesecurity.com/en/eset-research/ngate-android-malware-relays-nfc-traffic-to-steal-cash/) |
| Nov 2024 | **Oedipus** Telegram channel (POS terminals) established | Recorded Future / Group-IB |
| Jan 2025 | **TX-NFC** vendor channel established; 21,000+ subscribers | Recorded Future |
| Feb 2025 | **Z-NFC** identified | Resecurity HUNTER |
| Apr 2025 | **SuperCard X** (Chinese-speaking MaaS) identified by Cleafy in an Italian banking campaign | [Cleafy — SuperCard X](https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation) |
| Apr 2025 | **NFU Pay** first seen; redistributed under multiple names | Group-IB |
| Aug 2025 | **PhantomCard** (Brazilian NFU Pay variant; "Go1ano developer") | [ThreatFabric — PhantomCard](https://www.threatfabric.com/blogs/phantomcard-new-nfc-driven-android-malware-emerging-in-brazil) |
| Sep 2025 | **RatOn** Android malware adds NFC relay + ATS banking fraud capability | [The Hacker News — RatOn](https://thehackernews.com/2025/09/raton-android-malware-detected-with-nfc.html) |
| Oct 2025 | Zimperium zLabs publishes **"Tap-and-Steal"** report: 760+ malicious apps, 70+ C2s, "dozens of Telegram bots and private channels" | [Zimperium](https://zimperium.com/blog/tap-and-steal-the-rise-of-nfc-relay-malware-on-mobile-devices) · IOCs at https://github.com/Zimperium/IOC/tree/master/2025-10-NFCStealer |
| Jan 2026 | Group-IB publishes **"Ghost Tapped"**: 54+ variants, $355k from one vendor (Nov 2024–Aug 2025), arrests in US/Singapore/Czechia/Malaysia | [Group-IB — Ghost Tapped](https://www.group-ib.com/blog/ghost-tapped-chinese-malware/) |
| Apr 2026 | ESET publishes **NGate variant in trojanised HandyPay** (Brazil, "Proteção Cartão", AI-generated patch code) | [welivesecurity — HandyPay NGate](https://www.welivesecurity.com/en/eset-research/new-ngate-variant-hides-in-a-trojanized-nfc-payment-app/) |

The Chinese-speaking branch of the ecosystem started crystallising around the **guarantee marketplaces** (Huione 华永担保, Xinbi 新币担保, Tudou 土豆担保) which provided escrow trust for vendors selling NFC-relay tools, burner phones, phished cards, and mule recruitment. See companion doc §2 for full marketplace history.

### 1.2 Is `ckemv-harvester` closed-source, derived from existing tools, or wholly new?

**Closed-source / private to the operator. Clean-room re-implementation in Rust. Not derived from NFCGate.**

Evidence:

| Feature | Public NFC-relay families | `ckemv-harvester` |
| --- | --- | --- |
| Implementation language | **Java/Kotlin** wrappers around **NFCGate** (Java) or **NFCProxy** (Java) | Pure **Rust** workspace; Java/Kotlin is only a UI/dispatch shim |
| Underlying EMV kernel | Re-uses NFCGate APDU plumbing; offloads EMV semantics to the POS terminal or to a remote operator-side relay | Self-contained EMV book-2/book-3 capture kernel in Rust (`ckemv_emv_kernel`) — implements Visa qVSDC/VSDC + Mastercard M/Chip state machines locally |
| Cryptography stack | Variable (often platform Java crypto) | Statically linked **`ring 0.17.14`** + **`num-bigint 0.4.6`** for EMV SDA/DDA/CDA via RSA; **no system crypto** |
| HTTPS transport | Often `okhttp`/system | Statically linked **`ureq 2.12.1`** + **`rustls 0.23.37`** + **`rustls-webpki 0.103.10`** + Mozilla CA bundle (no pinning) |
| JNI binding style | Conventional `Java_*` symbols | `JNI_OnLoad` + `RegisterNatives` (handler addresses stripped from `.dynsym`) |
| String obfuscation | App-specific, often base64 / per-build | **`obfstr`** Rust crate (per-call-site XOR keys, visible in our pseudo-C) |
| Operator branding inside binary | Varies | Crate names `ckemv-{android,reporter,emv-kernel,core}`; build user `arthur`; macOS build host; internal version `1.7` |
| Public IOC presence | Yes — sample hashes, C2 domains, package names in vendor IOC repos | **Zero** public mentions of `ckemv`, `tqqemv.xyz`, `xyz.happify.ckemv`, or "Geometry Saver" as of 2026-05-17 |

The codebase **does not match** any of NGate / NFSkate / TX-NFC / X-NFC / Z-NFC / NFU Pay / SuperCard X / PhantomCard / RatOn / KingNFC / UFO NFC / Track2NFC profiles. The conceptual approach is the same — Android HCE + a state machine that drives the card through a transaction and exfiltrates the ARQC — but the **code lineage is independent** and the **operator brand is private**.

The 50 operator functions we decompiled (47 in the kernel + 3 in the reporter, see `CKEMV_ULTRA_DEEP_REPORT.md`) are all attacker-authored. The third-party Rust crates linked in (`iso7816-tlv`, `num-bigint`, `serde_json`, `jni`, `ureq`, `rustls`, `ring`, etc.) are all public on crates.io / GitHub — see `CKEMV_OSS_MODULE_INVENTORY.md` for URLs. **The wrapper logic is not open source anywhere.**

### 1.3 Who else / what other groups / companies / news?

The Chinese-speaking NFC-harvester ecosystem is dense. Publicly documented entities the `ckemv-harvester` operator most plausibly intersects with:

**Public NFC-relay vendor groups (in order of evidence weight, see companion doc §5–6):**
1. **TX-NFC** — largest documented vendor, 21k+ subs, $45/day–$1,050/3mo. Based on **NFCProxy** (open source). [Group-IB](https://www.group-ib.com/blog/ghost-tapped-chinese-malware/)
2. **X-NFC / Z-NFC** — likely same developer (near-identical GUI). [Resecurity](https://www.resecurity.com/blog/article/nfc-fraud-wave-evolution-of-ghost-tap-on-the-dark-web)
3. **NFU Pay** — base codebase for PhantomCard (Brazil) and other regional rebrands. [ThreatFabric](https://www.threatfabric.com/blogs/phantomcard-new-nfc-driven-android-malware-emerging-in-brazil)
4. **SuperCard X** — Chinese-speaking MaaS, Italian banking campaign Apr 2025. [Cleafy](https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation)
5. **KingNFC, UFO NFC** — limited public intel; mentioned in Resecurity reporting and the Panda Shop smishing-kit ecosystem.

**Telegram vendors of burner phones / phished cards / mule services:**
- `@webu8` (Putian, Fujian, China) — primary ghost-tap burner-phone vendor; Cleafy / Recorded Future link SuperCard X to "similar proprietary software" sold by `@webu8`.
- `@djdj8884` — US payment card supplier (phished cards with PINs).
- `@xingma888` (新马机构) — mule controller, Singapore/Malaysia.
- `@llan19889` (黑猫 "Black Cat"), `@OPLuffy888` (路飞 "Luffy"), `@eyDLBhqqotRXfJ` (莫淮), `@J0hnNo1` — see companion doc §10.

**Guarantee marketplaces (escrow platforms hosting the vendors):**
- Huione 华永担保 / Haowang `@hwdb` — shut down May 2025 (FinCEN Section 311). Chairman Chen Zhi (Prince Group) extradited to China Jan 2026.
- Xinbi 新币担保 `@xbdb` / `@xbdb0` — UK FCDO sanctioned; rebuilt after May 2025 ban.
- Tudou 土豆担保 `@tddb` — shut down Jan 2026.
- Dabai 大白担保 `@dabai_a` — emerging successor; active as of Feb 2026.

**Reporting vendors (defender-side intel sources):**
| Vendor | Publication | URL |
| --- | --- | --- |
| ESET | NGate (Aug 2024) | https://www.welivesecurity.com/en/eset-research/ngate-android-malware-relays-nfc-traffic-to-steal-cash/ |
| ESET | NGate variant in HandyPay (Apr 2026) | https://www.welivesecurity.com/en/eset-research/new-ngate-variant-hides-in-a-trojanized-nfc-payment-app/ |
| Cleafy | SuperCard X (Apr 2025) | https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation |
| Recorded Future / Insikt Group | Ghost-Tapping ecosystem (Aug 2025) | https://www.recordedfuture.com/research/ghost-tapping-chinese-criminal-ecosystem |
| Recorded Future / Insikt Group | Guarantee marketplace evolution (Apr 2026) | https://www.recordedfuture.com/research/evolution-of-the-chinese-language |
| Group-IB | Ghost Tapped (Jan 2026) | https://www.group-ib.com/blog/ghost-tapped-chinese-malware/ |
| ThreatFabric | PhantomCard (Aug 2025) | https://www.threatfabric.com/blogs/phantomcard-new-nfc-driven-android-malware-emerging-in-brazil |
| ThreatFabric | RatOn (Sep 2025) | https://www.threatfabric.com/blogs |
| Resecurity | NFC Fraud Wave / Z-NFC | https://www.resecurity.com/blog/article/nfc-fraud-wave-evolution-of-ghost-tap-on-the-dark-web |
| Resecurity | Philippines NFC / Panda Shop | https://www.resecurity.com/blog/article/chinese-threat-nfc-enabled-fraud-in-the-philippines-financial-sector |
| Zimperium zLabs | Tap-and-Steal (Oct 2025) | https://zimperium.com/blog/tap-and-steal-the-rise-of-nfc-relay-malware-on-mobile-devices |
| Zimperium zLabs | IOC repo (NFCStealer) | https://github.com/Zimperium/IOC/tree/master/2025-10-NFCStealer |
| Kaspersky | NFC-Gate relay (2026) | https://www.kaspersky.com/blog/nfc-gate-relay-attacks-2026/55116/ |
| Krebs on Security | Phished data → Apple/Google Wallets | https://krebsonsecurity.com/2025/02/how-phished-data-turns-into-apple-google-wallets/ |
| Krebs on Security | Tap-to-pay scheme arrests (Mar 2025) | https://krebsonsecurity.com/2025/03/arrests-in-tap-to-pay-scheme-powered-by-phishing/ |

---

## 2. The handles you supplied — what we know and don't know

Handles provided by the user from authorised penetration of the operator group:

| Handle / Channel | Translation / decode | Public mentions found | Assessment |
| --- | --- | --- | --- |
| `大V诚意合作社人员` | "Big-V Sincere Cooperative Staff" (group / channel name). `大V` is Chinese internet slang for a verified/influencer account; `诚意合作社` = "Sincerity Cooperative" — fraud op framed as a cooperative | **0** | New entity. Not in any of the cited reporting. Likely operator group brand. |
| `@DYYDS999` | `DYYDS` = `大永远的神` ("Big forever-God") — common Chinese gaming slang for "GOAT/legend"; 999 is reuse-padding common in Chinese fraud handles | **0** | New. Plausibly the lead admin / "boss" handle. |
| `@ViperDS990` | Sequential numbered handle, "Viper" brand + DS suffix shared with `@DYYDS999` | **0** | Backup / sub-admin. |
| `@ViperDS991` | Same pattern | **0** | Backup / sub-admin. |
| `@ViperDS992` | Same pattern | **0** | Backup / sub-admin. |
| `@ViperDS994` | Same pattern (993 not provided — may be banned or operator-skipped) | **0** | Backup / sub-admin. |
| `@ViperDS995` | Same pattern | **0** | Backup / sub-admin. |
| `@ViperDS998` | Same pattern | **0** | Backup / sub-admin. |
| `频道 @daoshua99` ("Channel @daoshua99") | `频道` = "channel". `daoshua` likely transliterates `盗刷` ("theft-swipe", i.e. unauthorised card use) — the term most Chinese-speaking operators use for ghost-tap fraud | **0** for `99`; **5,695 members** for sibling handle `@daoshua00` (Recorded Future, Aug 2025) | **High-confidence successor / sibling** to the publicly documented `@daoshua00` "CVV teaching" channel. Either a backup or a parallel English-friendlier presence. |
| `Eng Channel @VPayLoader9` | "VPay" = brand; "Loader" suggests the APK installer/dropper; "Eng" = English-language facing | **0** | New. Strongly suggests the operator is *expanding outside Chinese-only customers* — the same pattern Group-IB documented for TX-NFC, whose English-speaking support distinguishes it from earlier Chinese-only vendors. Plausibly this group's English customer-facing storefront. |

**Pattern signals.**
- Sequential numbered backups (`@ViperDS990–998`, `@DYYDS999`) — classic Telegram-ban-survival opsec. Every Chinese guarantee-marketplace vendor uses this pattern (cf. `@daoshua00/99`, `@xbdb/@xbdb0`, `@dabai_a/c/e/f`).
- Shared `DS` suffix between `DYYDS999` and `ViperDS99X` — single operator behind both brands.
- English-language sibling channel (`@VPayLoader9`) — recent move; matches the broader trend ESET / Group-IB document where Chinese vendors started offering tailored builds and English customer support in 2025–26 (TX-NFC was the first major one).

**What `ckemv-harvester` adds to the publicly known picture.**
The technical fingerprint (Rust workspace, build user `arthur` on macOS, internal version `1.7`, host `tqqemv.xyz`, Mozilla CA bundle in-binary, no pinning, `obfstr`-XOR'd JNI strings, full EMV ODA crypto) is **distinct from every documented family**. The most parsimonious read:

> The handle network `大V诚意合作社人员` / `@DYYDS999` / `@ViperDS99X` / `@daoshua99` / `@VPayLoader9` is **a previously undisclosed operator group within the broader Chinese-speaking ghost-tap ecosystem**, fielding their own Rust-based harvester (`ckemv-harvester`) rather than redistributing TX-NFC / X-NFC / NFU Pay / SuperCard X.

The `@daoshua99` ↔ `@daoshua00` sibling relationship is the **single strongest public-record overlap** with the existing ecosystem map. It plausibly places this group inside the same upstream supply chain as the publicly documented Recorded Future / Group-IB operators, but as a **distinct vendor brand** rather than a redistributor.

---

## 3. Confidence assessment

| Claim | Confidence | Basis |
| --- | --- | --- |
| The `ckemv-harvester` family is operator-private, not open source | **High** | Zero public mentions of `ckemv`, `tqqemv.xyz`, `xyz.happify.ckemv`, "Geometry Saver" across Zimperium IOC repo, Group-IB, Cleafy, ESET, Recorded Future, ThreatFabric, Resecurity, Kaspersky as of 2026-05-17 |
| Code lineage is Rust clean-room (not NFCGate / NFCProxy derived) | **High** | Static analysis: 100% Rust crates in both .so files; NFCGate/NFCProxy are Java codebases; the EMV state machine is locally implemented (not relay-only); `iso7816-tlv` Rust crate has no malware citations |
| The operator group is Chinese-speaking and fits the ghost-tap ecosystem profile | **High** | `daoshua` = `盗刷`; `大V诚意合作社` is Chinese; `DYYDS` is Chinese slang; build user `arthur` on macOS is consistent with the small-team Chinese operator profile; package "Geometry Saver" + decoy UI pattern matches ESET HandyPay variant approach |
| `@daoshua99` is operationally related to the documented `@daoshua00` | **Medium–High** | Same handle stem (`daoshua` = `盗刷`), same channel type pattern (Recorded Future documented `@daoshua00` as a CVV-teaching / ghost-tap-promotion channel with 5,695 members; sequential numeric suffix is the dominant Chinese-vendor ban-survival pattern) |
| `@VPayLoader9` is the operator's English-language customer-facing channel | **Medium** | "Eng Channel" label provided by user; matches the documented 2025–26 trend of Chinese vendors offering English support (TX-NFC) and tailored regional builds |
| Same single operator runs `@DYYDS999` and `@ViperDS99X` | **Medium** | Shared `DS` suffix; sequential numbering; standard Telegram backup pattern. **Cannot be confirmed without behavioural / posting-time correlation** (out of scope for static research). |
| This operator is downstream of one of the publicly documented MaaS vendors (TX-NFC / Z-NFC / NFU Pay / SuperCard X) | **Low** | No code-sharing evidence in the static analysis. The Rust workspace structure, `obfstr` usage pattern, and CA-bundle approach are distinct from each documented family. Plausible the operator pays for an upstream tool and resells/customises; **not provable from static evidence alone**. |
| Same operator is connected to Huione / Xinbi / Tudou / Dabai guarantee marketplaces | **Low–Medium** | All documented Chinese NFC vendors advertise via these marketplaces; expected but not directly evidenced for this handle set. |

---

## 4. Open intelligence questions (where defenders could push further)

1. **Telegram channel temporal correlation** (out of scope for this static project). Defenders with Telegram-monitoring access could correlate posting times across `@daoshua99`, `@DYYDS999`, `@ViperDS99X`, `@VPayLoader9` to confirm or refute single-operator hypothesis.
2. **Marketplace presence.** Is `@VPayLoader9` advertised on Dabai 大白担保 (`@dabai_a`, `@dabai_c`) or any successor marketplace? This is the single most enriching data point and is the same lookup Recorded Future / Group-IB performed for `@webu8`.
3. **Wallet attribution.** Companion doc identifies `TByDzGWCirpCABaUorkhz5eWhjyDdYWgSo` (Dabai). If the user's group accepts USDT via a known wallet, blockchain analytics (Chainalysis / Elliptic / TRM Labs) could place them in the broader ghost-tap money-flow graph.
4. **PhantomCard-style regional rebrand check.** PhantomCard's C2 endpoint `/baxi/b` ("Brazil" in Chinese) gave away its regional targeting. Worth checking whether `ckemv-harvester` has analogous region-coded paths in its self-update / scenario fetch flow. (We can re-derive from the disasm: see `CKEMV_NATIVE_FUNCTIONS_REPORT.md` §B; endpoints are `/me`, `/report`, `/harvest`, no region path observed.)
5. **`@webu8` proprietary-software comparison.** Cleafy noted SuperCard X "shares similarities with the proprietary software @webu8 mentioned" but could not confirm identity. The same comparison applied to `ckemv-harvester` requires sample-to-sample diffing with whatever `@webu8` ships — not currently on disk.
6. **CA-bundle hash.** The Mozilla-bundle anchors in `libckemv_reporter.so` are a near-unique fingerprint of the operator's `rustls` build vintage. Defenders can fingerprint the build by hashing the DER trust-anchor blob and comparing across other Rust NFC-relay samples — this would surface co-builds by the same operator across rebrands.
7. **Chen Zhi / Prince Group adjacency.** Tudou shutdown (Jan 2026) was directly tied to the Chen Zhi arrest. If `@VPayLoader9` / `@DYYDS999` started or accelerated activity after Jan 2026, that may be a successor-vendor signature.

---

## 5. Defender artefacts (build/hunt-ready)

### 5.1 YARA anchors specific to this sample

```yara
rule ckemv_harvester_rust_panic_strings
{
    meta:
        author = "internal"
        date = "2026-05-17"
        description = "Hits ckemv-harvester native libs via Rust panic-location strings (per-crate, byte-stable across rebuilds in this workspace)"
    strings:
        $a1 = "ckemv-android/src/lib.rs"
        $a2 = "ckemv-reporter/src/lib.rs"
        $a3 = "ckemv-emv-kernel/src/dispatcher.rs"
        $a4 = "ckemv-emv-kernel/src/kernels/visa.rs"
        $a5 = "ckemv-emv-kernel/src/kernels/mchip.rs"
        $a6 = "ckemv-emv-kernel/src/results.rs"
    condition:
        3 of them
}

rule ckemv_harvester_ecosystem_strings
{
    meta:
        description = "Operator-side rodata literals — EMV state-machine log lines and JNI/JSON keys"
    strings:
        $s1 = "Selecting PPSE/PSE"
        $s2 = "Visa Fast-Path completed"
        $s3 = "Card approved offline! Returned TC"
        $s4 = "Card REJECTED offline! Returned AAC"
        $s5 = "PPSE failed, falling back to default AID"
        $s6 = "Initialize: is_contactless="
        $s7 = "deterministic_un="
        $s8 = "CKEMV_NATIVE"
    condition:
        4 of them
}
```

### 5.2 Network IOCs

| Type | Value | Source |
| --- | --- | --- |
| C2 host | `tqqemv.xyz` | static (this sample) |
| HTTP path | `POST /harvest` | static |
| HTTP path | `GET /me` | static |
| HTTP path | `GET /report` | static |
| User-Agent | `ureq/2.12.1` (anomalous on Android) | static |
| TLS profile | `rustls/ring` JA4 (TLS 1.3 + ECH + MLKEM768 hybrid) | static |
| Auth model | `Authorization` header (Bearer or Basic) sourced from `api_key` JNI parameter | static |
| Sideload destination | `Environment.DIRECTORY_DOWNLOADS/update_v{x}.apk` via `xyz.happify.ckemv.fileprovider` | static |

### 5.3 Telegram-handle hunt list (defender-internal; report to providers, do not contact)

```
大V诚意合作社人员       ← group / channel name
@DYYDS999               ← suspected lead admin
@ViperDS990
@ViperDS991
@ViperDS992
@ViperDS994
@ViperDS995
@ViperDS998
@daoshua99              ← suspected sibling of publicly-documented @daoshua00
@VPayLoader9            ← English-facing storefront

Recommended action: pivot via Telegram channel-discovery (tgstat / telemetr) on
the `@daoshua00` ↔ `@daoshua99` relationship, then report the cluster via
abuse@telegram.org with the IOC bundle from §5.1–5.2 and references to the
Group-IB / Recorded Future / Cleafy / Zimperium / ESET reports above as
context for the takedown request.
```

---

## 6. Source list (all OSINT, all public)

Primary reports cited above plus everything pulled this session:

- ESET welivesecurity — NGate (Aug 2024) / HandyPay variant (Apr 2026)
- Cleafy — SuperCard X (Apr 2025)
- Recorded Future Insikt Group — Ghost-Tapping ecosystem (Aug 2025) / Guarantee-marketplace evolution (Apr 2026)
- Group-IB — Ghost Tapped (Jan 2026)
- ThreatFabric — PhantomCard (Aug 2025), RatOn (Sep 2025)
- Resecurity — NFC Fraud Wave (Z-NFC, X-NFC, Track2NFC), Panda Shop carding syndicate, Philippines NFC
- Zimperium zLabs — Tap-and-Steal (Oct 2025) + IOC repo `Zimperium/IOC/2025-10-NFCStealer`
- Kaspersky — NFC-Gate relay (2026)
- Krebs on Security — phished data → Apple/Google Wallets, tap-to-pay arrests
- Companion doc on disk: `Ghost_Tapping_Guarantee_Marketplaces_Research.md` (Apr 2026)
- Full URL list embedded in §1.3 and §6 of `Ghost_Tapping_Guarantee_Marketplaces_Research.md`.

---

## 7. Bottom line for the defender

1. **`ckemv-harvester` is a previously undisclosed Rust-based ghost-tap harvester** operated by a Chinese-speaking group that — based on the technical fingerprint and the handle pattern — sits inside the broader ghost-tap ecosystem but **does not match any of the publicly documented vendor brands**.
2. **The handle network you supplied is net-new public intel.** Only `@daoshua99` has a plausible public-record sibling (`@daoshua00`, Recorded Future Aug 2025). The rest are not in any cited report.
3. **The static analysis chain in this repo** (`CKEMV_HARVESTER_ANALYSIS.md`, `CKEMV_NATIVE_FUNCTIONS_REPORT.md`, `CKEMV_OSS_MODULE_INVENTORY.md`, `CKEMV_ULTRA_DEEP_REPORT.md`) is sufficient to produce a write-up for a vendor (Group-IB / Cleafy / Recorded Future / Zimperium) or a CERT submission. The YARA + IOC bundle above is the minimum hunt pack.
4. **Next defensive moves** (in priority order): (a) submit the sample hash + IOC bundle to MalwareBazaar / VirusTotal / Hatching for community fingerprinting; (b) report the handle cluster to Telegram with the technical evidence so the takedown survives Telegram's "must be evidence-backed" abuse criteria; (c) approach one of the vendors above (Group-IB Threat Intelligence portal, Recorded Future Insikt, Cleafy) to either co-publish or fold this sample into their next ecosystem report so it gets a public-record name.
