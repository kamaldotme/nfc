---
name: CKEMV operator group — Telegram handle cluster
description: User-supplied operator handles from authorised pentest. Cluster appears to be a previously-undisclosed Chinese-speaking NFC-harvester vendor running the ckemv-harvester APK family.
type: project
originSessionId: 605f073d-ca80-4801-9e11-470b45734b88
---
User (kamaldotme@gmail.com) penetrated a Chinese-speaking NFC-harvester operator group during authorised research and supplied this handle cluster on 2026-05-17:

- **Group/channel name:** `大V诚意合作社人员` ("Big-V Sincere Cooperative Staff")
- **Suspected lead admin:** `@DYYDS999` (`DYYDS` = `大永远的神` slang)
- **Sequential backup admins:** `@ViperDS990`, `@ViperDS991`, `@ViperDS992`, `@ViperDS994`, `@ViperDS995`, `@ViperDS998` (993 not supplied — banned or operator-skipped)
- **Tutorial / "boost" channel:** `频道 @daoshua99` (`频道` = channel; `daoshua` = `盗刷` = "theft-swipe")
- **English-language storefront:** `Eng Channel @VPayLoader9`

**Why:** Phase E of the CKEMV research established that none of these handles appear in any public threat-intel reporting (Group-IB / Recorded Future / Cleafy / ESET / Zimperium / Resecurity / Kaspersky / Krebs) — this is **net-new public intel**. Only `@daoshua99` has a public-record sibling (`@daoshua00`, documented by Recorded Future Aug 2025 as a 5,695-member CVV-teaching ghost-tap promotion channel). The sample's `ckemv-harvester` Rust workspace also doesn't match any documented family — so this looks like a previously-undisclosed operator running its own Rust-based harvester.

**How to apply:**
- Treat this handle cluster as the operator network behind the `ckemv-harvester` sample in this project. Don't conflate with publicly documented vendors (TX-NFC, X-NFC, Z-NFC, NFU Pay, SuperCard X, PhantomCard, etc.).
- Full assessment + confidence levels in `samples/ckemv/apk_analysis/CKEMV_THREAT_ACTOR_INTEL.md`.
- **Never contact these handles.** This memory is for defender-side attribution reasoning only; the file documents them so future sessions don't re-derive the same OSINT search results.
- If new operator handles surface in future sessions, append to the cluster list here and update the intel doc.
