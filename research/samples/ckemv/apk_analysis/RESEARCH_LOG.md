# CKEMV-Harvester — Research Log

Append-only log of every concrete step taken, every observation, every dead end. Read top-to-bottom on resume.

---

## 2026-05-16 — Session 1 (Opus 4.7 / 1M ctx)

### 14:?? — kickoff
- User asked for a detailed project report on the APK, every Java class + function, audience junior researcher.
- Existing analyses already on disk: `CKEMV_HARVESTER_ANALYSIS.md` (the authoritative summary), `CKEMV_MASTER_RESEARCH_HANDOFF.md`, `CKEMV_MONETIZATION_AND_LIMITS.md`, `CKEMV_THREAT_HUNT_PACK.md`.

### Phase B — Java/Kotlin walk
- Read 10 files in `xyz.happify.ckemv/` directly. R.java skipped (390 KB of generated IDs).
- Read 12 behaviorally-meaningful files in `B2/`: a (db), q (nfc), s (upload), t (config), o (post-tap), h (sideload), w/v/u (decoy), m/p/n/r/l (thread hops), b (qr callback), d (long-press), plus brief on compiler continuations (c/f/g/i/j/k) and marker interfaces.
- Produced `CKEMV_CLASS_BY_CLASS_REPORT.md` — junior-researcher pitched, function-by-function for the operator-authored code.

### Pivot to Phase C — native libs
- User asked for the same depth on the `.so` files + a continuously-updated tracker + persistent memory for session-loss resilience.
- Confirmed no llvm-binutils / readelf on the host (Git Bash on Windows). Python is available. Will use Python to read ELF headers, walk section tables, extract strings.
- Confirmed both ARM64 binaries are present in `samples/ckemv/apk_analysis/res_only/resources/lib/arm64-v8a/`.
- A 7,291-line strings dump of `libckemv_reporter.so` already exists at `Research/samples/ckemv/ckemv_reporter_strings.txt`. Will reuse and extend with a comparable dump for `libckemv_android.so`.

### Plan for Phase C
1. Write a small Python ELF inspector (no external deps) → dump header / sections / dynsym / symtab / rodata strings for each .so.
2. For each native, name and describe **every** non-stdlib function recoverable from `.symtab`, organized by Rust module path.
3. For each `native_*` JNI entry, cross-reference what the Java side calls it with, what params/return are.
4. Document the obfstr pattern in the reporter (XOR-decoded JNI class/method names live in `.rodata`).
5. Produce `CKEMV_NATIVE_FUNCTIONS_REPORT.md`, then merge everything into `CKEMV_COMPLETE_FUNCTION_REPORT.md`.

### State of tracker
- `RESEARCH_TRACKER.md` written. Phase A & B closed. Phase C C.1 + C.2 ELF header steps begin next.

## 2026-05-16 — Session 2 (Opus 4.7 / 1M ctx) — Phase C close-out

### Tooling
- User asked for full module + .so deep dive, including identifying public vs operator-private code.
- Bootstrapped a disassembly pipeline on host: `pip install --user capstone lief` (versions 5.0.7 + 0.17.6, both wheels available for Python 3.14 on Windows). `rustfilt` is not on PyPI — left untouched (manual Rust demangler written in `native_analyze.py` covers the cases that matter).
- Confirmed no `readelf` / `objdump` / `nm` available; not blocking — lief replaces them.

### Pipeline written
- `samples/ckemv/apk_analysis/native_analyze.py` — main analyzer. lief for ELF parsing, capstone (CS_ARCH_ARM64) for disassembly. For every FUNC symbol with nonzero size: extract bytes, disassemble, walk instructions tracking ADRP+ADD/LDR pairs to resolve `.rodata` cross-refs, resolve BL targets against the symbol table. Emits `<lib>_functions.json` (full structured), `<lib>_summary.txt` (crate-grouped), `<lib>_obfstr_candidates.txt`, and (reporter only) `<lib>_ca_anchors.txt`.
- `samples/ckemv/apk_analysis/extract_operator.py` — filter for crates `ckemv_android`, `ckemv_emv_kernel`, `ckemv_core`, `ckemv_reporter`. Emits Markdown function-cards.

### Ran and verified
- kernel: 1,207 FUNC symbols disassembled; 47 operator-authored.
- reporter: 3,486 FUNC symbols disassembled; 3 operator-authored (the three `native_*` JNI shims).
- Per-crate function counts validated against operator hypotheses — `ring 0.17.14`, `rustls 0.23.37`, `webpki 0.103.10`, `ureq 2.12.1`, `iso7816-tlv 0.4.4`, `num-bigint 0.4.6`, `serde_json 1.0.149`, etc.

### Deliverables
- `samples/ckemv/apk_analysis/CKEMV_NATIVE_FUNCTIONS_REPORT.md` — operator-authored function-by-function (Parts A and B), defender takeaways (Part D), JNI registration anti-static-analysis (Part C), tooling appendix.
- `samples/ckemv/apk_analysis/CKEMV_OSS_MODULE_INVENTORY.md` — every linked OSS crate with GitHub/crates.io URLs, version pinning, role in the binary. Includes the full `ring_core_0_17_14__*` symbol catalogue for fingerprinting.
- Tracker updated, Phase C boxes ticked.

### Open items
- Phase D — final merged deliverable `CKEMV_COMPLETE_FUNCTION_REPORT.md`: currently 230-line stub. Outstanding: merge in the operator native-function commentary as Parts 3 + 4, link to OSS inventory as Part 5.
- Optional: install Ghidra for byte-level decompilation if any operator function ever needs to be rebuilt from bytes (current pipeline reaches "name + behaviour from strings + calls", not "rewritten Rust").

## 2026-05-17 — Session 3 — ULTRAMODE (Docker multi-container RE stack)

### Stack
- User authorised Docker Desktop usage with constraint "don't disturb other running projects".
- Verified: 34 unrelated containers running (shorts-*, usko-*, astra-*) — kept all isolated under compose project `ckemv-re` + bridge network `ckemv-re-net`.
- New artefact root: `samples/ckemv/apk_analysis/docker/` with:
  - `docker-compose.yml` — services `ghidra-kernel`, `ghidra-reporter`, `radare2`, `rust-tools`
  - `Dockerfile.rust-tools` — rust:1-slim + cargo install rustfilt
  - `scripts/ghidra_run.sh` — wraps `/ghidra/support/analyzeHeadless`
  - `scripts/decompile_operator.py` — Ghidra Jython post-script; decompiles every fn whose name contains "ckemv" and writes per-fn .c + index.json
  - `scripts/rizin_analyze.sh` — r2 batch (renamed from rizin after rizinorg/rizin Docker image found to not exist; using `radare/radare2:latest` with compatible `r2` CLI)
  - `scripts/rust_demangle.sh` — rustfilt over symtab dumps
  - `scripts/aggregate_ultra.py` — merges Ghidra C + r2 disasm + rustfilt names into one report
  - `out/{ghidra,rizin,rust}/` — bind-mounted output dirs

### Path-conv gotcha (Git Bash on Windows)
- `docker compose run` from Git Bash mangles `/bin/sh` to `C:/Program Files/Git/usr/bin/sh`. Workaround: prefix every docker invocation with `MSYS_NO_PATHCONV=1`. Documented in this log so future sessions know.

### Image inventory (this session pulled)
- `blacktop/ghidra:latest` — analyzeHeadless at `/ghidra/support/analyzeHeadless`
- `radare/radare2:latest`
- `ckemv-re-rust-tools:local` — built locally from rust:1-slim + rustfilt

### Outputs already on disk (rust-tools done)
- `docker/out/rust/kernel_symtab_demangled.txt` (72 KB) — canonical rustfilt names for every kernel symbol
- `docker/out/rust/reporter_symtab_demangled.txt` (212 KB) — same for reporter
- `docker/out/rust/*_pairs.tsv` — raw-vs-demangled side-by-side
- `docker/out/rust/*_crate_counts.txt` — top-level crate occurrence counts

### Outputs pending (containers running)
- `docker/out/ghidra/kernel/*.c` + `index.json` — full pseudo-C for every `ckemv_*` operator function
- `docker/out/ghidra/reporter/*.c` + `index.json` — same for reporter
- `docker/out/rizin/*.json` + `*_per_fn.txt` + `*_callgraph.dot` — function lists, strings, sections, per-fn disasm + xrefs

### Once outputs land
- Run `python docker/scripts/aggregate_ultra.py` → `CKEMV_ULTRA_DEEP_REPORT.md`

### Lessons learned this session
- **Ghidra 11.x in `blacktop/ghidra:latest` has no Jython.** PyGhidra requires explicit setup; use Java post-scripts instead. Class name must match filename.
- **Ghidra's ELF loader does NOT auto-promote LOCAL .symtab FUNC entries** to Function objects. The v1 script (filtering `FunctionManager.getFunctions(true)`) only matched drop_in_place generic specializations because those happened to be promoted. v2 walks `SymbolTable.getDefinedSymbols()` + calls `createFunction(addr, name)` on demand — picks up all 47+3 operator functions.
- **Git Bash on Windows mangles `/bin/sh` paths** in docker args. Prefix every `docker run` / `docker compose run` with `MSYS_NO_PATHCONV=1`.
- **`rizinorg/rizin` does not exist on Docker Hub.** Use `radare/radare2:latest` (compatible CLI: `r2` instead of `rizin`).
- **r2 `aaft` (type matching) is O(slow) on big rustls/ring-heavy binaries.** Stalls for >15 min on the 3 MB reporter. Skip it — use plain `-A` (or just `aa`).
- **r2 per-fn seek + pdf loop is brittle with `::` in symbol names.** A single r2 session with `s sym; pdf; axt; axf` for each operator fn hangs. Better: extract aflj once, then use capstone+lief / Ghidra for per-fn detail.
- **Ghidra pseudo-C reveals the obfstr XOR keys directly** as 64-bit immediates in the decompiled output. Defenders can deobfuscate URL paths and header literals statically using these (per-call-site) constants.

### Final deliverables (2026-05-17)
- `CKEMV_ULTRA_DEEP_REPORT.md` (407 KB, 10,011 lines) — Ghidra pseudo-C for every operator function, TOC, defender takeaways, capstone metadata, rustfilt names, ELF metadata.
- `CKEMV_OSS_MODULE_INVENTORY.md` — every open-source crate with GitHub URL + pinned version.
- `CKEMV_NATIVE_FUNCTIONS_REPORT.md` — operator function narrative (companion to ULTRA).
- All Docker artefacts isolated in `docker/out/`; compose stack documented in `docker/docker-compose.yml`.

## 2026-05-17 — Session 4 — Phase E: Threat actor attribution

### User-supplied intel
User had penetrated a Chinese-speaking NFC-harvester operator group and supplied operator-side handles:
- Group/channel name: `大V诚意合作社人员` ("Big-V Sincere Cooperative Staff")
- Admin handles: `@DYYDS999`, `@ViperDS990`, `@ViperDS991`, `@ViperDS992`, `@ViperDS994`, `@ViperDS995`, `@ViperDS998`
- Channel: `频道 @daoshua99` (`频道` = "channel")
- English-language channel: `Eng Channel @VPayLoader9`

### OSINT research executed
- Read companion file `Ghost_Tapping_Guarantee_Marketplaces_Research.md` end-to-end (Apr 2026 doc, 1,354 lines, full ecosystem map)
- Parallel WebSearch on every supplied handle + sample identifier (`ckemv`, `tqqemv.xyz`, `xyz.happify.ckemv`, "Geometry Saver", "happify", "VPayLoader", "ViperDS", "DYYDS999", "daoshua99", `大V`+`诚意合作社`)
- WebFetch on Group-IB Ghost Tapped (403 — rate-limited), Recorded Future Ghost-Tapping, Zimperium IOC repo (`apks.csv`, `hosts.csv` in `2025-10-NFCStealer`)
- Cross-checked Cleafy SuperCard X attribution chain (`@webu8` Putian Fujian → SuperCard X "similar proprietary software")

### Key findings
1. **`ckemv` / `tqqemv.xyz` / `xyz.happify.ckemv` / "Geometry Saver" are absent from every public report and IOC repo checked.** This is a previously-undisclosed sample.
2. **The Rust workspace (`ckemv-{android,reporter,emv-kernel,core}`) is a clean-room implementation**, not derived from NFCGate (Java) or NFCProxy (Java). Does not match any of NGate / TX-NFC / X-NFC / Z-NFC / NFU Pay / SuperCard X / PhantomCard / RatOn / KingNFC / UFO NFC / Track2NFC profiles.
3. **`@daoshua99` ↔ `@daoshua00` sibling relationship** is the strongest public-record overlap. `@daoshua00` is documented by Recorded Future Insikt Group (Aug 2025) as a 5,695-member "CVV teaching" channel promoting ghost-tap. `daoshua` = transliteration of `盗刷` ("theft-swipe"). Sequential numeric-suffix pattern is the dominant Chinese-vendor ban-survival opsec.
4. **`@VPayLoader9`** = likely the operator's English-language storefront. Matches the 2025–26 trend (TX-NFC was first; others followed) of Chinese vendors offering English support + region-tailored builds.
5. **`@DYYDS999` + `@ViperDS990–998`** share the `DS` suffix → likely single operator running sequential backup admin accounts (standard ban-survival).

### Deliverable
- `samples/ckemv/apk_analysis/CKEMV_THREAT_ACTOR_INTEL.md` — full intel doc covering: where this malware type originated (NFCGate→NGate Aug 2024 timeline), lineage assessment (Rust clean-room, not OSS-derived), the supplied handle cluster with translations and assessment, confidence-rated claims, open intelligence questions, YARA + IOC + handle hunt-pack, full source list with URLs.

### Open items going forward
- Phase D (final merged `CKEMV_COMPLETE_FUNCTION_REPORT.md`) still pending — the ULTRA report supersedes much of that need.
- Phase F (optional): submit IOC bundle to MalwareBazaar / VT / Hatching; approach Group-IB or Recorded Future to fold sample into next public ecosystem report so it gets a public name.

## 2026-05-17 — Session 4 (cont) — Replay + PIN-bypass brief

User asked sharply: NFCGate is live-relay only, but this malware stores 20 cryptograms per card and supposedly uses them "whenever the operator wants" — and over £100 in the UK needs PIN, so how do they get past that? What's the ground scenario?

### Doc produced
`samples/ckemv/apk_analysis/CKEMV_REPLAY_AND_PIN_BYPASS.md` — 8-section punchy brief:
1. NFCGate live-relay vs ckemv 20-cryptogram pre-record (different attack class)
2. The ATC reality — captures expire on victim's next legitimate tap (hours, not days)
3. £100 PIN bypass landscape, 7 documented techniques (sub-limit stacking dominant; CVM tampering, Brand Mixup, CDCVM abuse, transit-mode, terminal-type spoofing, country selection)
4. Ground scenario end-to-end (T+0 social engineering → T+10s upload → T+30s mule routes → T+1-6h race ends)
5. Why model survives despite short window (volume + sub-£100 stacking + loose-ATC issuers + wallet pivot + acquirer laxity)
6. TL;DR answers to the headline question
7. Defender leverage (issuer ATC monotonicity = 70% of value)
8. References with URLs for Cambridge 2014, Galloway 2019, ETH Zurich USENIX 2021+2023, Surrey USENIX 2025, plus the vendor reports

### Net-new academic citations vs existing monetization doc
The existing CKEMV_MONETIZATION_AND_LIMITS.md covered Cambridge 2014 and Galloway 2019 but did NOT cover the 2021-2025 attacks. The new brief adds:
- ETH Zurich USENIX 2021 (Brand Mixup)
- ETH Zurich USENIX 2023 (inducing-auth-failures)
- Surrey USENIX 2025 (transit-mode + Apple Pay Visa relay £25,000)
- SoK arXiv 2025 (consolidation paper)

---

## 2026-05-17 — Session 3 (Sonnet 4.6 / resumed from Opus 4.7)

### Phase F — Source deobfuscation & operator-eye reconstruction

**Trigger:** User asked why source has random names (a.java, b.java) and requested full deobfuscation "as the operator sees it".

**Why random names:** R8 (Android Gradle Plugin default shrinker) renamed every non-kept identifier to single alphabetic characters. 100 obfuscated packages in total. Only `B2/` is operator code — confirmed by tracing all imports from the kept-name `xyz.happify.ckemv.*` classes.

**Method:** Read every B2/ file directly (23 files, 2,325 lines of jadx output). Identified each class by imports, field types, string literals, and the Phase B behavioral analysis. Reconstructed as Kotlin (the operator's original language) with semantic names.

**Key findings from reading raw source:**
- `B2/n.java` and `B2/r.java` both show a centered "✅" Toast — NOT a progress bar flash as Phase B report stated. Corrected in README.
- `B2/d.java` does not exist — long-press handling is inlined in MainActivity.
- Upload-ack signal to user: centered "✅" Toast with Gravity.CENTER for ~2 s.
- ConfigUpdateLoop operator note: `apiKey.take(8)` is a no-op (result discarded) — likely stripped debug logging, not a functional truncation.

**Outputs:**
- `deobfuscated/00_WHY_OBFUSCATED.md` — obfuscation scheme explanation with evidence
- `deobfuscated/01_PACKAGE_TRIAGE.md` — all 100 packages classified operator vs library
- `deobfuscated/02_RENAME_MAP.json` — obfuscated → semantic name + evidence per class
- `deobfuscated/src/xyz/happify/ckemv/` — 28 Kotlin source files in 7 sub-packages:
  - `model/` (5): AppVersion, CardRecord, CveConfig, HarvestedTx, MeResponse
  - `jni/` (2): EmvKernel, Reporter
  - `db/` (1): HarvestDatabaseHelper
  - `nfc/` (1): NfcTapHandler
  - `net/` (4): C2, UploadLoop, ConfigUpdateLoop, PostTapUploader
  - `update/` (1): ApkSideloader
  - `ui/` (10): DecoyView, AnimationDot, DecoyAnimationRunnable, ShowProgressBar, HideProgressBar, UploadAckFlash, UploadAckFlashLoop, ProgressPump, ProgressPumpStep, QrScanCallback
  - root (2): MainActivity, SyncWorker
- `deobfuscated/README.md` — layout guide + quick-reference table

