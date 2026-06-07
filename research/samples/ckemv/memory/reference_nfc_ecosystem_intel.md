---
name: NFC-relay malware ecosystem intel sources
description: Canonical list of public threat-intel reports on the ghost-tap / NFC-relay Android malware ecosystem. Use as starting point for any future attribution / lineage question on this family.
type: reference
originSessionId: 605f073d-ca80-4801-9e11-470b45734b88
---
When asked about NFC-relay / ghost-tap Android malware ecosystem (vendors, marketplaces, attribution, lineage), start with these public reports (all OSINT, all defender-side):

### Primary reports (chronological)
- **TU Darmstadt Seemoo lab** — `NFCGate` open-source NFC research tool (origin of the technique)
- **ESET / welivesecurity** — NGate (Aug 2024) + NGate-in-HandyPay (Apr 2026): https://www.welivesecurity.com/en/eset-research/
- **Cleafy** — SuperCard X (Apr 2025, Chinese-speaking MaaS, Italian banking campaign): https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation
- **Recorded Future Insikt Group** — Ghost-Tapping ecosystem (Aug 2025) + Guarantee-marketplace evolution (Apr 2026): https://www.recordedfuture.com/research/ghost-tapping-chinese-criminal-ecosystem
- **Group-IB** — Ghost Tapped (Jan 2026, 54+ variants, $355k from one vendor): https://www.group-ib.com/blog/ghost-tapped-chinese-malware/
- **ThreatFabric** — PhantomCard (Aug 2025, Brazilian NFU Pay variant): https://www.threatfabric.com/blogs/phantomcard-new-nfc-driven-android-malware-emerging-in-brazil ; RatOn (Sep 2025)
- **Resecurity HUNTER** — Z-NFC / X-NFC / Track2NFC / Panda Shop carding / Philippines NFC: https://www.resecurity.com/blog/article/nfc-fraud-wave-evolution-of-ghost-tap-on-the-dark-web
- **Zimperium zLabs** — Tap-and-Steal (Oct 2025, 760+ apps, 70+ C2s): https://zimperium.com/blog/tap-and-steal-the-rise-of-nfc-relay-malware-on-mobile-devices  ·  IOC repo: `https://github.com/Zimperium/IOC/tree/master/2025-10-NFCStealer`
- **Kaspersky** — NFC-Gate relay attacks (2026): https://www.kaspersky.com/blog/nfc-gate-relay-attacks-2026/
- **Krebs on Security** — Phished-data-to-Apple/Google-Wallet flow + tap-to-pay arrests: https://krebsonsecurity.com/2025/02/how-phished-data-turns-into-apple-google-wallets/

### Named public families to compare against (do NOT conflate)
NGate · NFSkate · TX-NFC · X-NFC · Z-NFC · NFU Pay · SuperCard X · PhantomCard · RatOn · KingNFC · UFO NFC · Track2NFC · HCE Bridge (iso8583.info)

### Marketplaces (escrow infra)
Huione 华永担保 (`@hwdb`, shut May 2025) · Xinbi 新币担保 (`@xbdb`, rebuilt) · Tudou 土豆担保 (`@tddb`, shut Jan 2026) · Dabai 大白担保 (`@dabai_a`, active 2026)

### Notable named operators (public record)
- `@webu8` (Putian Fujian) — burner-phone + proprietary NFC software vendor; Cleafy linked to SuperCard X
- `@xingma888` (新马机构) — Singapore/Malaysia mule controller
- `@daoshua00` — CVV-teaching channel (5,695 members; promotes ghost-tap)
- Wang Duo Yu — alleged Smishing Triad / Panda Shop creator
- LARVA-242 — Lucid PhaaS dev (Xinxin Group)

### Project-specific companion doc on disk
`Research/Ghost_Tapping_Guarantee_Marketplaces_Research.md` (Apr 2026, 1,354 lines) — has the full vendor/marketplace/mule/smishing-pipeline map. Read this BEFORE doing fresh OSINT for any ecosystem question.

### Project-specific deliverable on disk
`samples/ckemv/apk_analysis/CKEMV_THREAT_ACTOR_INTEL.md` — applies the ecosystem map to this specific sample + operator handle cluster. Includes YARA + IOC + handle hunt-pack and confidence-rated attribution claims.
