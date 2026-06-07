# `ckemv-harvester` — Threat-Hunt Pack (Defender Distribution)

Companion to `CKEMV_HARVESTER_ANALYSIS.md` and `CKEMV_MONETIZATION_AND_LIMITS.md`. This document is structured for hand-off to: payment-network fraud teams (Visa GAS, Mastercard FraudOps), national CERTs (CERT-EU, CERT-PL, CERT-BR), AV/mobile-EDR vendors (ESET, Cleafy, ThreatFabric, Zimperium, Lookout, Kaspersky), and OSINT sharing communities (MalwareBazaar, ThreatFox, MISP, VirusTotal).

**Sample:** `samples/ckemv/sample.apk`
**Package:** `xyz.happify.ckemv` ("Geometry Saver")
**C2:** `https://tqqemv.xyz` (Let's Encrypt cert issued 2026-03-28, expires 2026-06-26 — **live infrastructure as of writing**)
**Compiled:** 2026-05-16
**Analyst:** Independent security research
**Confidence:** High on technical claims (static reverse engineering), moderate on family attribution (working hypothesis), N/A on operator identity

---

## 1. Family-Attribution Summary

### 1.1 What this sample is NOT

Cross-referenced against every publicly indexed IOC corpus in the NFC-relay malware space:

| Family | Source | IOC overlap with our sample | Status |
| --- | --- | --- | --- |
| **NGate / NFSkate** | ESET WeLiveSecurity, GitHub `eset/malware-ioc/ngate` | None (verified against 23 SHA-1 hashes, 23 C2 domains, 11 C2 IPs) | **Excluded** |
| **NGate-HandyPay variant (2026)** | ESET, published April 2026 | None | **Excluded** |
| **SuperCard X** | Cleafy Labs (April 2025) | None (verified against `api.kingnfc.com`, `api.kingcardnfc.com`, `api.payforce-x.com`; SHA-256 of 3 published samples) | **Excluded** |
| **PhantomCard / `com.billy.cardemv`** | ThreatFabric (Brazil campaign) | None | **Excluded** |
| **RelayNFC** | Cyble (Brazil) | None | **Excluded** |
| **TX-NFC / X-NFC / Z-NFC / NFU Pay / KingNFC** | Group-IB, Resecurity, Recorded Future | None on binary fingerprints (no `znfcqwe.top`, no `com.hk.nfc.paypay`, no `libjiagu.so`/`libjgdtc.so`) | **Excluded** |
| **Zimperium NFCStealer corpus (760+ samples, Oct 2025)** | `github.com/Zimperium/IOC/2025-10-NFCStealer` | None (verified against full `hosts.csv`; that dataset is Russian/EE-hosted port-based IPs, no `.xyz` domains) | **Excluded** |

### 1.2 What this sample IS — working hypothesis

A **previously undocumented brand** within the Chinese-language NFC-relay MaaS ecosystem, with significant technical differentiation from all published families. Most likely one of:

1. **A boutique private build** for a single operator/syndicate (consistent with the `@webu8`-style "proprietary software, loaned not sold" model documented by Recorded Future Insikt Group). Operators in Putian/Fujian and similar hubs are known to maintain in-house tooling beyond the off-the-shelf MaaS offerings.
2. **A new MaaS brand** not yet on researcher radar — i.e., a competitor to TX-NFC/Z-NFC/SuperCard X using a more advanced (Rust-based) stack to differentiate.
3. **A specialized harvester upstream** that feeds collected cryptograms into a *separate* live-relay/cashout brand (which would explain the missing HCE/Tapper component).

### 1.3 Technical differentiators from documented families

Distinguishing this sample as a **new lineage**:

| Property | Documented families | This sample |
| --- | --- | --- |
| Implementation language | Java/Kotlin + open-source NFCGate / NFCProxy | **Rust JNI** (libckemv_android.so, libckemv_reporter.so) |
| Architecture | Reader + Tapper modular | **Harvester-only** (capture → upload; no HCE/Tapper component) |
| EMV engine | NFCGate-derived or trivial APDU forwarder | **Custom EMV state machine** with full Visa qVSDC + Mastercard M/Chip kernels, full SDA/DDA cert chain verification (`num-bigint` RSA, `iso7816-tlv`) |
| C2 transport | OkHttp/Java HTTPS, sometimes mTLS | Rust `ureq/2.12.1` + `rustls 0.23.37` + `ring 0.17.14`, **no payload crypto, no TLS pinning**, mainstream Mozilla CA bundle |
| Anti-analysis | Often packed (libjiagu loader) | **`obfstr`-style XOR'd `.rodata` strings**, `JNI_OnLoad`+`RegisterNatives` hidden binding; no packer |
| Operator OPSEC | Varies | **macOS build host, dev user `arthur`**, Rust 1.88/1.91, NDK r25b |
| C2 path style | `api.<brand>nfc.com` | `/me`, `/harvest`, `/report` on plain `<random>.xyz` |
| Self-update | Rare in published families | **In-app APK self-update via FileProvider** (`update_v{version}.apk`) |

The combined fingerprint strongly suggests **a single Rust-experienced developer (handle `arthur` or similar) maintaining a private toolchain for a single operator or small affiliate group**.

---

## 2. YARA Rules

Three rules at increasing specificity. All target the static APK or extracted natives — no runtime memory artifacts assumed.

```yara
// ─────────────────────────────────────────────────────────────────────
// Rule 1: APK-level matcher (low FP, deploy on Android app inventories)
// ─────────────────────────────────────────────────────────────────────
rule CKEMV_Harvester_APK_Manifest_Strings
{
    meta:
        author = "Independent research, 2026-05-16"
        description = "Android NFC/EMV cryptogram harvester (xyz.happify.ckemv / Geometry Saver / tqqemv.xyz)"
        family = "Undocumented Chinese-MaaS NFC harvester (working name: ckemv)"
        reference = "CKEMV_HARVESTER_ANALYSIS.md"
        tlp = "WHITE"
        priority = "high"
    strings:
        $pkg     = "xyz.happify.ckemv" ascii
        $auth    = "xyz.happify.ckemv.fileprovider" ascii
        $perm    = "xyz.happify.ckemv.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION" ascii
        $label   = "Geometry Saver" wide
        $db      = "CkemvHarvest.db" ascii
        $native1 = "libckemv_android.so" ascii
        $native2 = "libckemv_reporter.so" ascii
        $update  = /update_v[0-9]+\.[0-9]+\.apk/ ascii
    condition:
        uint32be(0) == 0x504B0304       // ZIP / APK magic
        and (3 of ($pkg, $auth, $perm, $label, $db, $native1, $native2, $update))
}

// ─────────────────────────────────────────────────────────────────────
// Rule 2: Native EMV-kernel matcher (extracted .so file)
// ─────────────────────────────────────────────────────────────────────
rule CKEMV_Harvester_Native_EMV_Kernel
{
    meta:
        author = "Independent research, 2026-05-16"
        description = "libckemv_android.so — Rust-based custom EMV capture kernel"
        family = "ckemv-emv-kernel"
        tlp = "WHITE"
    strings:
        $elf       = { 7F 45 4C 46 02 01 01 }              // ELF64 LSB
        $crate1    = "ckemv-android/src/lib.rs" ascii
        $crate2    = "ckemv-emv-kernel/src/" ascii
        $crate3    = "ckemv_emv_kernel::kernels::visa::VisaKernel" ascii
        $crate4    = "ckemv_emv_kernel::kernels::mchip::MastercardKernel" ascii
        $crate5    = "ckemv_emv_kernel::dispatcher::TransactionDispatcher" ascii
        $log_tag   = "CKEMV_NATIVE" ascii
        $build     = "/Users/arthur/.cargo/registry" ascii
        $jni_init  = "ckemv_android::native_initialize" ascii
        $jni_apdu  = "ckemv_android::native_get_next_command" ascii
        $jni_crypto = "ckemv_android::native_get_arqc" ascii
        $log_visa  = "Visa Fast-Path completed" ascii
        $log_mc    = "Card REJECTED offline! Returned AAC" ascii
        $log_ppse  = "PPSE failed, falling back to default AID A0000000031010" ascii
        $log_init  = "Initialize: is_contactless=" ascii
        $obf       = "_OBFBYTES_SDATA" ascii
    condition:
        $elf at 0
        and filesize > 500KB and filesize < 5MB
        and (
            3 of ($crate*) or
            ($log_tag and ($log_visa or $log_mc or $log_ppse or $log_init)) or
            ($build and 1 of ($jni_*)) or
            ($obf and 2 of ($jni_*))
        )
}

// ─────────────────────────────────────────────────────────────────────
// Rule 3: Native C2 reporter matcher (extracted .so file)
// ─────────────────────────────────────────────────────────────────────
rule CKEMV_Harvester_Native_C2_Reporter
{
    meta:
        author = "Independent research, 2026-05-16"
        description = "libckemv_reporter.so — Rust ureq/rustls C2 client"
        family = "ckemv-reporter"
        tlp = "WHITE"
    strings:
        $elf       = { 7F 45 4C 46 02 01 01 }
        $crate1    = "ckemv-reporter/src/lib.rs" ascii
        $crate2    = "ckemv-reporter" ascii
        $build     = "/Users/arthur/.cargo/registry" ascii
        $jni1      = "ckemv_reporter::native_fetch_cves" ascii
        $jni2      = "ckemv_reporter::native_fetch_report" ascii
        $jni3      = "ckemv_reporter::native_upload_harvest_data" ascii
        $rt1       = "ureq/2.12.1" ascii
        $rt2       = "rustls" ascii
        $rt3       = "ring" ascii
        $path1     = "ckemv-reporter/src/lib.rs" ascii
    condition:
        $elf at 0
        and filesize > 1MB and filesize < 8MB
        and (
            2 of ($crate*) or
            2 of ($jni*) or
            ($rt1 and ($build or 1 of ($jni*)))
        )
}
```

Submit to:
- VirusTotal Hunting (Retrohunt + Livehunt)
- abuse.ch MalwareBazaar YARA feed
- MISP communities
- ESET, Cleafy, ThreatFabric, Zimperium private threat-intel exchanges

---

## 3. Network IOCs (STIX-friendly)

### 3.1 Domains

| Indicator | Type | Confidence | Notes |
| --- | --- | --- | --- |
| `tqqemv.xyz` | domain-name | **High (confirmed C2)** | Hard-coded in sample; live Let's Encrypt cert (`crt.sh` IDs 25281253978, 25267534894); issued 2026-03-28 |
| `www.tqqemv.xyz` | domain-name | High | Cert SAN; not exercised by code but cert-issued |

### 3.2 URLs / paths

| Indicator | Type | Notes |
| --- | --- | --- |
| `https://tqqemv.xyz/me` | url | Config-fetch (returns `MeResponse` JSON: scenarios + version manifest) |
| `https://tqqemv.xyz/harvest` | url | Upload (POSTs card+ARQC JSON) |
| `https://tqqemv.xyz/report` | url | Reserved; not exercised by current build |

### 3.3 TLS / HTTP fingerprints

| Indicator | Type | Notes |
| --- | --- | --- |
| `User-Agent: ureq/2.12.1` | http-request-ext | Highly anomalous UA on Android — strong network IOC |
| JA4 of rustls 0.23.37 + ring 0.17.14 + ECH | tls-fingerprint | Distinctive; deploy in Zeek/JA4+ if available |
| `Authorization: Bearer <api_key>` | http-request-ext | Bearer-style auth (api_key value is per-tenant) |
| Content-Type: `application/json` | http-request-ext | POST body shape per §3.4 |

### 3.4 Egress payload shape (decode at TLS-MITM proxies)

Hunt for outbound JSON bodies containing the union of these keys, regardless of destination:

```
pan, aid, network, tx_count, raw_data, harvested_txs[],
atc, arqc, time_ms, cve_id, params,
mc_tags, visa_tags, mastercard_tags
```

Any single HTTP request body containing `pan` + `arqc` + EMV tag hex (`9F26`, `9F36`, `9F10`, `9F37`) over HTTPS to a non-acquirer destination is conclusive.

---

## 4. Host-Based IOCs (Android MDM / EDR / Endpoint)

| Indicator | Type | Hunting query (concept) |
| --- | --- | --- |
| Package name `xyz.happify.ckemv` | mobile-app | `pm list packages \| grep happify` |
| Label "Geometry Saver" | mobile-app | App-inventory label search |
| Native lib `libckemv_android.so` | file | File presence in `/data/app/.../lib/arm64/` |
| Native lib `libckemv_reporter.so` | file | Same |
| SQLite DB `CkemvHarvest.db` | file | `/data/data/xyz.happify.ckemv/databases/` |
| Logcat tag `CKEMV_NATIVE` | log-event | `logcat -s CKEMV_NATIVE:V` |
| FileProvider authority `xyz.happify.ckemv.fileprovider` | content-provider | `dumpsys content` |
| Downloaded update path | file | `<external-files>/Download/update_v*.apk` |

---

## 5. Operator OPSEC Fingerprints (for cross-sample correlation)

The following are weak attribution signals individually, strong in combination:

| Fingerprint | Value | Usefulness |
| --- | --- | --- |
| Build-host username | `arthur` | High — embedded in every `.so` from this developer's machine |
| Build-host OS | macOS (`/Users/` prefix) | Medium |
| Rust toolchain | 1.88.0 (reporter), 1.91 (kernel) | Medium — narrows time window |
| NDK | r25b (clang 14.0.6, 8937393) | Low — common |
| Rust crate workspace | `ckemv-android`, `ckemv-reporter`, `ckemv-emv-kernel` | High — internal naming convention |
| String-obfuscation library | `obfstr`-style (`_OBFBYTES_SDATA*` symbols) | Medium |
| HTTP/TLS stack | ureq 2.12.1 + rustls 0.23.37 + ring 0.17.14 + flate2 + base64 | Medium — uncommon combo |
| Native-call binding pattern | `JNI_OnLoad` + `RegisterNatives` only export | Low — generic obfuscation |

Any subsequent sample exhibiting **`arthur` + Rust + `ckemv-*` crate names** is almost-certainly the same developer.

---

## 6. Infrastructure Pivot Plan (Passive OSINT — DO NOT actively probe)

Recommended pivots, all passive, all using public datasets:

### 6.1 Cert Transparency / Domain neighborhood
- **crt.sh** — query for `%.xyz` certs issued by Let's Encrypt on/around 2026-03-28 with similar structural patterns (4-letter SLD + `emv` substring + `.xyz`). Look for sibling domains the operator may have registered in the same batch.
- **Censys / Shodan** — search for HTTPS endpoints serving the certificate hash of `tqqemv.xyz`'s leaf cert and any cert chain sharing the same Let's Encrypt order intermediate.
- **DomainTools / SecurityTrails passive DNS** — historical A/AAAA records for `tqqemv.xyz` and reverse-lookup the hosting IP to find co-hosted domains.

### 6.2 Sample neighborhood
- **VirusTotal Intelligence Retrohunt** with the YARA rules above (90 days back).
- **MalwareBazaar / abuse.ch** — query for hashes matching the rule, query by tags `apk:nfc-relay` and `arch:arm64-only`.
- **Koodous / AndroZoo** — Android-specific public corpora.
- **Triage / Hatching** — search public sandbox reports for `xyz.happify.ckemv` or strings matching the YARA `$log_*` set.

### 6.3 Developer-fingerprint pivot
- **crates.io / lib.rs** — check whether `arthur` (or arthur-prefixed handles) ever published public Rust crates (likely no, but worth ruling out).
- **GitHub / GitLab** — search for forks/clones of `iso7816-tlv` and `jni-rs` by users with `arthur` in their handle.
- **Stack Overflow / Reddit** — search for "rust" + "iso7816-tlv" + "android jni" questions by handles plausibly matching the developer.

### 6.4 Marketplace pivot (where the operator may be advertising or sourcing)
Per the existing `Ghost_Tapping_Guarantee_Marketplaces_Research.md`:
- **Dabai Guarantee** `@dabai_a`, `@dabai_c` (active Feb 2026; sub-channel `@dbtm301` operated by `@J0hnNo1`)
- **Xinbi Guarantee** `@xbdb` (rebuilt post-ban via SafeW + XinbiPay)
- **`@webu8`** Putian/Fujian — primary suspect for boutique-tool affiliation given proprietary-software model
- **`@daoshua00`** "CVV teaching" channel
- **TX-NFC**, **X-NFC**, **Z-NFC** channels — monitor for new sub-products / Rust-rewrite announcements
- **Track2NFC** (`track2nfc.blogspot.com`)

### 6.5 Sample-acquisition strategy
- Search MalwareBazaar / VT / Koodous for any APK signed by the same code-signing certificate. The signing cert is recoverable from the APK's `META-INF/CERT.RSA`; correlate by SHA-256 of the public key.
- Search for any APK shipping both `libckemv_android.so` AND `libckemv_reporter.so` — those file names are unique enough to be a straight string-on-disk hit across mobile-AV telemetry.

---

## 7. Suggested Sharing Partners

Listed in order of expected analytic capacity / regional relevance:

| Partner | Why | Contact path |
| --- | --- | --- |
| **ESET Research / WeLiveSecurity** | NGate originators; deepest NFC-relay malware lineage tracking | `threatintel@eset.com`; publish to MISP CIRCL |
| **Cleafy Labs** | SuperCard X / Chinese-MaaS specialists; Italy/EU focus | `research@cleafy.com` |
| **ThreatFabric** | Ghost Tap framing; PhantomCard tracking | Public research disclosure form on threatfabric.com |
| **Zimperium zLabs** | Operates the 760-sample NFCStealer corpus | `zlabs@zimperium.com` |
| **Group-IB** | Chinese-MaaS taxonomy; TX-NFC / X-NFC / NFU Pay tracking | `tipoff@group-ib.com` |
| **Recorded Future / Insikt Group** | `@webu8` / Putian-Fujian ecosystem tracking | Insikt research portal |
| **Resecurity HUNTER** | Z-NFC / Panda Shop investigations | Public submission portal |
| **abuse.ch ThreatFox + MalwareBazaar** | Public IOC and sample sharing | `https://bazaar.abuse.ch/submit/` |
| **Visa Global Acquirer Services Fraud team** | If you're a bank/issuer, escalate per scheme contract | Internal scheme channel |
| **Mastercard Fraud Operations** | Same | Internal scheme channel |
| **CERT-EU / CERT-PL / CERT-BR / CERT-IN** | Per jurisdiction of likely victims | Standard CERT submission portal |
| **MISP communities** | Distribution to defender ecosystem | Standard MISP feed publication |

Whatever you share should include:
- Sample SHA-256 (and the APK file itself if licensing allows redistribution)
- The two native libraries' SHA-256
- The YARA rules (§2)
- The IOC list (§§3–4)
- A reference to this document and its companions

Coordinate before publicly disclosing the C2 domain — sinkholing requires legal coordination with the registrar (`.xyz` is operated by XYZ.COM LLC, registrar lookup via WHOIS will identify the registrar of record), and law enforcement may already have an open investigation against the operator.

---

## 8. Detection Rule Drafts (Sigma / Snort / Suricata concepts)

### 8.1 Sigma — outbound DNS / proxy

```yaml
title: Resolution of CKEMV harvester C2 (tqqemv.xyz)
id: 00000000-0000-0000-0000-ckemvharvest1
status: experimental
description: DNS or proxy resolution of tqqemv.xyz indicates a CKEMV-harvester-class
  malware sample is active on the network.
references:
  - samples/ckemv/apk_analysis/CKEMV_HARVESTER_ANALYSIS.md
author: Independent research
date: 2026-05-16
logsource:
  category: dns
detection:
  selection:
    query|endswith:
      - 'tqqemv.xyz'
  condition: selection
level: high
tags:
  - attack.command_and_control
  - attack.t1071.001
```

### 8.2 Sigma — Android UA anomaly

```yaml
title: Anomalous ureq User-Agent from Android handset
id: 00000000-0000-0000-0000-ckemvharvest2
description: The User-Agent string "ureq/2.12.1" emerging from an Android handset's
  outbound HTTPS is anomalous. Standard Android stacks use okhttp, Dalvik, Chrome WebView,
  or com.google.android.gms.
logsource:
  category: proxy
detection:
  selection:
    cs-user-agent|startswith: 'ureq/'
    src-os: 'Android'
  condition: selection
level: medium
```

### 8.3 Suricata / Snort concept

```
# CKEMV harvester C2 SNI
alert tls $HOME_NET any -> $EXTERNAL_NET 443 (
  msg:"NFC-relay harvester C2 contact (tqqemv.xyz)";
  tls.sni; content:"tqqemv.xyz"; nocase;
  flow:established, to_server;
  classtype:trojan-activity;
  sid:1000000001; rev:1;
)

# Anomalous ureq UA on Android
alert http $HOME_NET any -> $EXTERNAL_NET any (
  msg:"Anomalous ureq UA — possible Rust-based Android malware";
  http.user_agent; content:"ureq/"; startswith;
  classtype:trojan-activity;
  sid:1000000002; rev:1;
)
```

---

## 9. Open Hunt Questions

Worth following up but beyond this document's scope:

1. **Does `tqqemv.xyz` route through Cloudflare or a bulletproof host?** Passive A-record lookup will distinguish.
2. **Are there sibling `.xyz` domains** registered around 2026-03-28 with similar 4-letter+emv patterns (`xxemv.xyz`, `xxxemv.xyz`) on Let's Encrypt? Bulk-cert hunt on crt.sh.
3. **Does the developer `arthur` have a public footprint** beyond the leaked path? Worth a careful, narrow OSINT pass.
4. **Is the `ckemv-emv-kernel` Rust crate workspace published anywhere** (private GitLab, internal git, leaked code dump)? Cross-search for the exact crate path.
5. **Does this sample's `update_v{x}.apk` self-update endpoint serve a different binary** than the harvester (e.g., a hybrid relay/cashout component)? Cannot test without active probing; flag for sandbox detonation in a controlled environment.
6. **Are there iOS or PC counterparts** that consume the same C2 JSON contract? If the `/me`, `/report`, `/harvest` endpoints accept clients besides this APK, a richer toolchain exists. Hunt for samples with the same JSON-key signature.

---

## 10. Final Hand-Off Checklist

When sharing this pack:

- [ ] Sanitize file paths if your hosts are sensitive (`C:\Users\mogli\...`).
- [ ] Include companion docs `CKEMV_HARVESTER_ANALYSIS.md` and `CKEMV_MONETIZATION_AND_LIMITS.md`.
- [ ] Attach SHA-256 of the original APK and both native libraries.
- [ ] Specify TLP: WHITE for the YARA rules and IOC list; TLP:AMBER if including the sample binary itself.
- [ ] Tag with MITRE ATT&CK for Mobile: T1655.001, T1406, T1646, T1437.001, T1407, T1521.002, T1409.
- [ ] If you're operating in an official defender capacity (bank, CERT, payment-network fraud team), escalate per your incident-response process before public disclosure.
- [ ] Note: the C2 domain is **live infrastructure** as of cert issuance. Do not actively probe it; coordinate with appropriate authorities for sinkhole or takedown.

---

## 11. References (cross-checked against this sample)

| Source | URL | Relevance |
| --- | --- | --- |
| ESET — Original NGate writeup | https://www.welivesecurity.com/en/eset-research/ngate-android-malware-relays-nfc-traffic-to-steal-cash/ | Family taxonomy |
| ESET — NGate HandyPay variant (2026) | https://www.welivesecurity.com/en/eset-research/new-ngate-variant-hides-in-a-trojanized-nfc-payment-app/ | Latest NGate evolution |
| ESET — NGate IOC repo | https://github.com/eset/malware-ioc/tree/master/ngate | Confirmed no overlap |
| Cleafy — SuperCard X | https://www.cleafy.com/cleafy-labs/supercardx-exposing-chinese-speaker-maas-for-nfc-relay-fraud-operation | Confirmed no overlap |
| ThreatFabric — Ghost Tap | https://www.threatfabric.com/blogs/ghost-tap-new-cash-out-tactic-with-nfc-relay | Framing |
| ThreatFabric — PhantomCard | https://www.threatfabric.com/blogs/phantomcard-new-nfc-driven-android-malware-emerging-in-brazil | Variant taxonomy |
| Group-IB — Ghost Tapped (Chinese MaaS) | https://www.group-ib.com/blog/ghost-tapped-chinese-malware/ | Brand taxonomy: TX-NFC, NFU Pay, etc. |
| Zimperium — Tap-and-Steal | https://zimperium.com/blog/tap-and-steal-the-rise-of-nfc-relay-malware-on-mobile-devices | 760-sample corpus context |
| Zimperium NFCStealer IOC repo | https://github.com/Zimperium/IOC/tree/master/2025-10-NFCStealer | Confirmed no overlap |
| Cyble — RelayNFC | https://cyble.com/blog/relaynfc-nfc-relay-malware-targeting-brazil/ | Variant taxonomy |
| Recorded Future — Ghost-tapping ecosystem | https://www.recordedfuture.com/research/ghost-tapping-chinese-criminal-ecosystem | `@webu8` Putian/Fujian model |
| Kaspersky — NFCGate relay attacks | https://www.kaspersky.com/blog/nfc-gate-relay-attacks-2026/55116/ | NFCGate background |
| Bleeping Computer — Massive surge of NFC relay malware | https://www.bleepingcomputer.com/news/security/massive-surge-of-nfc-relay-malware-steals-europeans-credit-cards/ | Ecosystem context |
| The Hacker News — Ghost Tap exploiting NFCGate | https://thehackernews.com/2024/11/ghost-tap-hackers-exploiting-nfcgate-to.html | Technique overview |
| crt.sh — tqqemv.xyz | https://crt.sh/?q=tqqemv.xyz | Live cert observed 2026-03-28 to 2026-06-26 |
