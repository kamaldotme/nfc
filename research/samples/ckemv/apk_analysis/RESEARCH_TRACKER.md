# CKEMV-Harvester — Research Tracker (Live)

**Owner:** kamaldotme@gmail.com · **Working tree:** `C:\Users\mogli\Desktop\Prj\Research`
**Sample:** `samples/ckemv/sample.apk` · pkg `xyz.happify.ckemv` · label *"Geometry Saver"*
**Started:** 2026-05-16 · **Session model:** Opus 4.7 (1M ctx)
**Mandate:** Defender-side static analysis. No execution, no live C2 probing.

> This tracker is the **single source of truth** for what's done, what's next, and what context a fresh session needs. If a session dies, the next session reads this file + `memory/` + the existing `samples/ckemv/apk_analysis/*.md` and resumes at the next unchecked item.

---

## Status legend

- `[ ]` not started
- `[~]` in progress
- `[x]` done
- `[!]` blocked / needs decision

---

## Phase A — Inventory & ingest (DONE)

- [x] Decompile APK with jadx → `samples/ckemv/apk_analysis/sources/sources/`
- [x] Extract resources → `samples/ckemv/apk_analysis/res_only/resources/`
- [x] Identify native libs (arm64-v8a only): `libckemv_android.so` 1.08 MB, `libckemv_reporter.so` 3.01 MB
- [x] Extract reporter strings → `samples/ckemv/ckemv_reporter_strings.txt` (7,291 lines)
- [x] Existing reports authored: `CKEMV_HARVESTER_ANALYSIS.md`, `CKEMV_MASTER_RESEARCH_HANDOFF.md`, `CKEMV_MONETIZATION_AND_LIMITS.md`, `CKEMV_THREAT_HUNT_PACK.md`, `CKEMV_CLASS_BY_CLASS_REPORT.md`

## Phase B — Java/Kotlin function-by-function (THIS SESSION)

- [x] xyz.happify.ckemv.AppVersion
- [x] xyz.happify.ckemv.CardRecord
- [x] xyz.happify.ckemv.CveConfig
- [x] xyz.happify.ckemv.EmvKernel
- [x] xyz.happify.ckemv.HarvestedTx
- [x] xyz.happify.ckemv.MeResponse
- [x] xyz.happify.ckemv.Reporter
- [x] xyz.happify.ckemv.SyncWorker
- [x] xyz.happify.ckemv.MainActivity
- [ ] xyz.happify.ckemv.R                  *(skip — generated)*
- [x] B2/a.java   (DatabaseHelper)
- [x] B2/q.java   (NFC tap handler)
- [x] B2/s.java   (10-s upload loop)
- [x] B2/t.java   (60-s config/update loop)
- [x] B2/o.java   (post-tap immediate uploader)
- [x] B2/h.java   (FileProvider sideload)
- [x] B2/w.java   (decoy view)
- [x] B2/u.java   (animation Runnable + dispatch fan-out)
- [x] B2/v.java   (dot struct — implied from w.java reads)
- [x] B2/m.java / p.java / n.java / r.java   (UI thread hops)
- [x] B2/l.java   (progress StateFlow pump)
- [x] B2/b.java   (QR-callback + SQLite factory shim)
- [x] B2/d.java   (long-press lambda host)
- [x] B2/c.java / f.java / g.java / i.java / j.java / k.java   (compiler continuations — short notes)
- [x] B2/InterfaceC0106a / InterfaceC0107b   (marker ifaces)

Phase B output: `CKEMV_CLASS_BY_CLASS_REPORT.md` (committed).

## Phase C — Native lib deep dive (DONE 2026-05-16)

### C.1 — libckemv_android.so
- [x] ELF header & section table (Python `struct` reader → `elf_inspect.py`)
- [x] dynsym + symtab → all defined Rust functions (filter `ckemv_*`, `kernels::*`, `crypto::*`) — `kernel_dynsym.txt`, `kernel_symtab.txt`
- [x] RegisterNatives map (JNI surface): 10 functions, see CKEMV_NATIVE_FUNCTIONS_REPORT §A.1
- [x] Rodata strings dump → state-machine log lines, AID literals, error paths (`kernel_rodata.txt`)
- [x] Function-by-function commentary for every native_* + every recovered kernel module fn — `kernel_operator_functions.md`, CKEMV_NATIVE_FUNCTIONS_REPORT §A
- [x] Crate inventory from path strings — `CKEMV_OSS_MODULE_INVENTORY.md`
- [x] Build provenance (Rust 1.91 / NDK r25b / clang 14.0.6 / build user `arthur` on macOS)

### C.2 — libckemv_reporter.so
- [x] ELF header & section table
- [x] All defined fns (3 operator native_* + 222 rustls + 156 ring + 55 ureq + 43 webpki + supporting) — `reporter_summary.txt`
- [x] Endpoint paths (`/harvest`, `/me`, `/report`) cross-referenced in `CKEMV_NATIVE_FUNCTIONS_REPORT.md`
- [x] obfstr-XOR'd JNI signature strings — located at `.rodata 0x2b0f6–0x2b253`, 1,703 candidate blobs enumerated in `reporter_obfstr_candidates.txt`
- [x] HTTP fingerprint (UA `ureq/2.12.1`, Auth header sourced from `apiKey`, gzip-capable, TLS 1.3 + ECH + MLKEM768) — confirmed
- [x] Function-by-function commentary for every native_* — `reporter_operator_functions.md`, CKEMV_NATIVE_FUNCTIONS_REPORT §B

Phase C outputs:
- `CKEMV_NATIVE_FUNCTIONS_REPORT.md` (operator code, function-by-function)
- `CKEMV_OSS_MODULE_INVENTORY.md` (every open-source crate linked in, with GitHub/crates.io URLs)
- `native_analyze.py` (lief + capstone pipeline) — reusable
- `extract_operator.py` (operator-only function filter)

## Phase C+ — ULTRAMODE (Docker multi-container RE)  [DONE 2026-05-17]

- [x] Compose project `ckemv-re` isolated under bridge `ckemv-re-net`
- [x] Ghidra headless (`blacktop/ghidra:latest`) — Java post-script `decompile_operator.java` v2 walks SymbolTable + auto-creates functions for LOCAL .symtab entries
- [x] All 47 kernel + 3 reporter operator functions decompiled to pseudo-C → `docker/out/ghidra/{kernel,reporter}/*.c`
- [x] radare2 (`radare/radare2:latest`) metadata: aflj/izj/iIj/iSj/callgraph.dot for kernel; reporter aflj stalled on `aaft` pass — skipped (Ghidra+capstone already cover everything operationally meaningful)
- [x] rustfilt demangling of every symbol → `docker/out/rust/*_demangled.txt`
- [x] ELF metadata via lief → `kernel_elf_meta.json`, `reporter_elf_meta.json`
- [x] Aggregator `docker/scripts/aggregate_ultra.py` + `inject_toc.py` → `CKEMV_ULTRA_DEEP_REPORT.md` (10,011 lines, 407 KB)

Phase C+ output: `CKEMV_ULTRA_DEEP_REPORT.md` — every operator function with Ghidra pseudo-C, capstone metadata, rustfilt demangled name, rodata cross-refs.

## Phase D — Final deliverable

- [ ] Merge B + C + existing analyses → `CKEMV_COMPLETE_FUNCTION_REPORT.md`
- [ ] Update this tracker, mark Phase D done
- [ ] Save end-of-research summary memory

## Phase E — Threat actor attribution & ecosystem mapping (DONE 2026-05-17)

User supplied operator-side intel from authorised pentest of a Chinese-speaking NFC-harvester group: channel `大V诚意合作社人员`; handles `@DYYDS999`, `@ViperDS990`/`991`/`992`/`994`/`995`/`998`; channel `频道 @daoshua99`; English channel `@VPayLoader9`.

- [x] Read companion doc `Ghost_Tapping_Guarantee_Marketplaces_Research.md` (1,354 lines) — full ecosystem map already in place
- [x] WebSearch all supplied handles + sample identifiers (`ckemv`, `tqqemv.xyz`, `xyz.happify.ckemv`, "Geometry Saver", "happify", "VPayLoader") — **all return zero public hits**
- [x] WebSearch + WebFetch on ESET / Cleafy / Group-IB / Recorded Future / Zimperium / Resecurity / Kaspersky / Krebs reports — `ckemv-harvester` not mentioned in any
- [x] WebFetch Zimperium IOC repo `Zimperium/IOC/2025-10-NFCStealer` (`apks.csv`, `hosts.csv`) — neither file contains any of the supplied identifiers
- [x] Established sibling-handle relationship: user's `@daoshua99` ↔ documented `@daoshua00` (Recorded Future Aug 2025, 5,695-member "CVV teaching" channel for ghost-tap promotion). `daoshua` = transliteration of `盗刷` ("theft-swipe").
- [x] Established lineage: `ckemv-harvester` is Rust clean-room implementation, NOT derived from NFCGate / NFCProxy (which are Java); does not match any publicly named family (NGate / TX-NFC / X-NFC / Z-NFC / NFU Pay / SuperCard X / PhantomCard / RatOn / KingNFC / UFO NFC / Track2NFC)
- [x] Authored `samples/ckemv/apk_analysis/CKEMV_THREAT_ACTOR_INTEL.md` — full intel doc: where this malware type started, lineage assessment, the supplied handle cluster, confidence-rated assessments, open intelligence questions, YARA + IOC + handle hunt-pack, full source list

Phase E output: `samples/ckemv/apk_analysis/CKEMV_THREAT_ACTOR_INTEL.md`.

### Key conclusion (Phase E)

The handle cluster `大V诚意合作社人员` / `@DYYDS999` / `@ViperDS99X` / `@daoshua99` / `@VPayLoader9` is **net-new public intel**. Only `@daoshua99` has a plausible public-record sibling (`@daoshua00`). The Rust-based `ckemv-harvester` family fits the broader Chinese ghost-tap profile but **does not match any publicly named vendor brand**. The operator group is a previously undisclosed entity in the ecosystem.

---

## Phase F — Source deobfuscation & operator-eye reconstruction (DONE 2026-05-17)

User asked: "why random names like a.java b.java — reanalyse and remove all obfuscation, as operator sees source".

- [x] Explain the obfuscation scheme → `deobfuscated/00_WHY_OBFUSCATED.md` (R8 defaults, evidence fingerprints, why kept-names are kept)
- [x] Inventory all 100 obfuscated packages → `deobfuscated/01_PACKAGE_TRIAGE.md` (only `B2/` is operator code; rest = library)
- [x] Build rename map → `deobfuscated/02_RENAME_MAP.json` (every B2 class + xyz.happify.ckemv class with semantic name + evidence)
- [x] Emit reconstructed Kotlin source — 28 files under `deobfuscated/src/xyz/happify/ckemv/{model,jni,db,nfc,net,update,ui}/`
- [x] Write `deobfuscated/README.md` (layout guide + obfuscated↔semantic table + new finding)

**New finding:** `B2/n.java` and `B2/r.java` (UploadAckFlash / UploadAckFlashLoop) show a **centered "✅" Toast**, not a progress bar flash. This corrects the Phase B report for those two classes.

Phase F outputs:
- `samples/ckemv/apk_analysis/deobfuscated/` — full tree:
  - `00_WHY_OBFUSCATED.md`, `01_PACKAGE_TRIAGE.md`, `02_RENAME_MAP.json`, `README.md`
  - `src/xyz/happify/ckemv/` — 28 semantic `.kt` files in 7 sub-packages

---

## Open questions / decision log

- The `/report` endpoint in the reporter is unreferenced by Java. Hypothesis: operator-side pull API for the C2 dashboard. To confirm we'd need a live C2 sample — out of scope here.
- The `terminals` table is dropped on upgrade. Implies a prior build tracked acquirer/terminal metadata. Earlier samples in this family would clarify; none on disk.
- Re-confirm `1.7` constant in `B2/t.java` matches the byte offset / disassembly view of the natives (any version literal there?).

## Resume instructions for a future session

1. Read this file end-to-end.
2. Read `memory/MEMORY.md` and the entries it points to.
3. Pick the first `[~]` or `[ ]` item under Phase C, claim it via TaskUpdate, work it, commit findings to `CKEMV_NATIVE_FUNCTIONS_REPORT.md`, check the box here.
4. Update `RESEARCH_LOG.md` with a 1-2 sentence note of what you did + what you observed.
5. Save/update relevant memories.

## Live log pointer

Detailed thinking + step-by-step actions are appended to: `samples/ckemv/apk_analysis/RESEARCH_LOG.md`.
