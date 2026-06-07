# CKEMV-Harvester — Operator's-View Source Tree (Deobfuscated)

This directory contains a **reconstruction of the operator's Kotlin source** as it most plausibly existed before the Android release-build chain ran R8 over it. Everything under `operator_view/` is hand-rewritten by reading the jadx-decompiled Java (`samples/ckemv/apk_analysis/sources/sources/`) and reversing the renames + restructuring R8 applied.

**Faithfulness:** every behaviour observable in the obfuscated source is preserved verbatim. Names, control flow as a coroutine, and lambdas are restored to a plausible original form. Local-variable names are renamed for readability where the original is unrecoverable.

---

## 1. Why the obfuscated source looks the way it does

When you open `samples/ckemv/apk_analysis/sources/sources/` you see:

- A clean package `xyz.happify.ckemv/` with 10 named Java files (operator's public surface — Activity, JNI bridges, data classes, the WorkManager).
- A flat package `B2/` with 23 obfuscated single-letter Kotlin classes (`a.java`, `b.java`, … `w.java` plus two `InterfaceC0106a/b`).

That layout is **not** what the operator wrote. It is what **R8** (Google's optimizer/obfuscator, the default in any release-mode Android build) produced from the operator's Kotlin source. Specifically R8 performed:

1. **Class renaming.** Every internal class got renamed to single letters (`a`, `b`, …, `aa`, `ab`, …) and moved into a flat package `B2`. Classes the operator marked `@Keep` or that were referenced by Android's manifest (the Activity, the WorkManager subclass, the JNI bridges) kept their original names — that's why `xyz.happify.ckemv.MainActivity` and friends survive.
2. **Method/field renaming.** Inside each class, every non-public method and field got a one-letter name. So `dbHelper.getApiKey()` became `aVar.i()`, and the field `dbHelper` became `f5247A`.
3. **Local-variable wiping.** Decompilers reconstruct local-variable names — but R8 stripped them to placeholders, so jadx gives you `iVar1`, `pVar3`, `aVar2`, etc. We cannot recover the operator's original local names; we rename them for readability.
4. **Coroutine state-machine flattening.** Every Kotlin `suspend fun` is rewritten by the Kotlin compiler into a `Q1.g`-subclass with a giant `switch(label)` block and explicit "resume" handling. The operator's source looked like clean `suspend fun upload() { ... delay(10_000) ... }`; the decompiled output looks like `case 0: ... ; case 1: ... ; if (i3 == aVar2) return aVar2;`.
5. **Lambda hoisting.** Anonymous lambdas (`onLongClick { … }`, `Runnable { … }`, `withContext(Dispatchers.Main) { … }`) get hoisted into separate single-letter classes (`B2/d`, `B2/m`, `B2/n`, `B2/p`, `B2/r`, etc.) implementing the relevant functional interface. R8 also **merges** unrelated lambdas with compatible signatures into one shared class with a `switch(i)` dispatch — `B2/u.java` is the worst offender, dispatching 17 unrelated `Runnable.run()` bodies from across the app and from third-party libraries (Material, AndroidX, ZXing) into one giant `case` statement. Only `case 0` belongs to the operator (the dot-animation tick); the other 16 cases belong to libraries.
6. **Compiler continuations.** Several `B2/*.java` files (`c.java`, `f.java`, `g.java`, `i.java`, `j.java`, `k.java`) are pure Kotlin compiler artefacts — they are the `Continuation<Unit>` subclasses that the `kotlinx.coroutines` machinery requires for each `suspend` call site. The operator never wrote these; the compiler generates them. We omit them from `operator_view/`.
7. **Marker interfaces.** `InterfaceC0106a.java` and `InterfaceC0107b.java` are empty marker interfaces R8 created to tag groups of lambdas. The operator never wrote these either.

**There is no encryption/packing layer on top.** This APK does not use Bangcle / Tencent legu / Jiagu / SecNeo — we'd see `libjiagu.so`/`libjgdtc.so`/etc. in `lib/arm64-v8a/` and they aren't there (Z-NFC uses them, ckemv-harvester does not). It's stock R8 minification only. So R8-reversal is **the only deobfuscation pass needed.**

---

## 2. How `operator_view/` maps onto `sources/sources/`

See `RENAME_MAP.md` in this directory for the full per-file mapping. The high-level picture:

```
Operator's likely source                 →  R8 output (in samples/ckemv/apk_analysis/sources/sources/)
─────────────────────────────────────────────────────────────────────────────────────
src/main/kotlin/xyz/happify/ckemv/
  AppVersion.kt                          →  xyz/happify/ckemv/AppVersion.java     (kept, light renamed)
  CardRecord.kt                          →  xyz/happify/ckemv/CardRecord.java     (kept)
  CveConfig.kt                           →  xyz/happify/ckemv/CveConfig.java      (kept)
  HarvestedTx.kt                         →  xyz/happify/ckemv/HarvestedTx.java    (kept)
  MeResponse.kt                          →  xyz/happify/ckemv/MeResponse.java     (kept)
  EmvKernel.kt                           →  xyz/happify/ckemv/EmvKernel.java      (kept; thin JNI wrapper)
  Reporter.kt                            →  xyz/happify/ckemv/Reporter.java       (kept; thin JNI wrapper)
  SyncWorker.kt                          →  xyz/happify/ckemv/SyncWorker.java     (kept)
  MainActivity.kt                        →  xyz/happify/ckemv/MainActivity.java   (kept; internals minified)
  DatabaseHelper.kt                      →  B2/a.java
  NfcTapHandler.kt        (suspend fun)  →  B2/q.java
  UploadLoop.kt           (suspend fun)  →  B2/s.java   + UI-hop hoists in B2/r.java
  ConfigRefreshLoop.kt    (suspend fun)  →  B2/t.java
  ImmediateUploader.kt    (suspend fun)  →  B2/o.java   + UI-hop hoist in B2/n.java
  SideloadKicker.kt       (suspend fun)  →  B2/h.java
  DecoyView.kt            (View + tick)  →  B2/w.java + B2/v.java + B2/u.java case 0
  ProgressFlowPump.kt     (suspend fun)  →  B2/l.java
  ScannerCallback.kt      (lambda host)  →  B2/b.java
  ─────────────────────                     ─────────────────────────────────────
                                            (omitted from operator_view; these are pure compiler artefacts:)
                                            B2/c.java, f.java, g.java, i.java, j.java, k.java  (suspend Continuations)
                                            B2/InterfaceC0106a.java, InterfaceC0107b.java       (marker interfaces)
                                            B2/d.java                                            (long-press lambda hoist — inlined back into MainActivity.onCreate)
                                            B2/m.java, n.java, p.java, r.java                    (UI-hop lambda hoists — inlined into parent functions)
                                            B2/u.java (case 1..16)                               (third-party library lambdas — not operator code)
```

So 23 obfuscated `B2/*.java` files **fold back into ~9 logical operator source files**, plus the 10 already-named ones, for a total of ~17 files in the operator's working tree.

---

## 3. What you can and cannot recover from R8 output

| Recoverable | Not recoverable |
| --- | --- |
| Class roles (from behaviour) | Class names exactly as the operator typed them (only plausible) |
| Method roles | Method names exactly (only plausible) |
| Field roles | Field names exactly (only plausible) |
| Control flow (with effort, by un-flattening the coroutine state machine) | Local-variable names (we rename for readability) |
| Constant values (hex literals, magic numbers) | Comments (none survive in bytecode) |
| Logging strings (R8 keeps them unless `-assumenosideeffects` is enabled, which the operator did NOT do) | Inline lambda capture-variable names |
| Method bodies' semantics | Original source-level formatting / blank lines |

So the `operator_view/` tree is the most faithful reconstruction we can produce, but **two operator-source-tree views of the same APK would differ on cosmetic details** — function names like `NfcTapHandler.kt` vs `TapHandler.kt`, local-variable names like `cveConfig` vs `cve`, etc.

---

## 4. Practical use

- **For sharing with a vendor (Group-IB, Cleafy, Recorded Future):** ship `operator_view/` rather than `sources/sources/B2/` — readable Kotlin is much easier to review than R8 output.
- **For YARA / IOC writing:** the strings and constants survive intact in either view; either works.
- **For tracing how the operator changed the code between builds:** if a future sample appears (`ckemv-harvester (11).apk` etc.), diff `operator_view/` against that future sample's reconstruction.
- **For approaching researchers at the cited vendors:** the `operator_view/` source + `CKEMV_NATIVE_FUNCTIONS_REPORT.md` + `CKEMV_THREAT_ACTOR_INTEL.md` is the credible "I have a sample worth publishing on" packet.

---

## 5. Index of files in this directory

- `README.md` — this file
- `RENAME_MAP.md` — full obfuscated→readable mapping table
- `operator_view/` — the reconstructed Kotlin source tree
  - `xyz/happify/ckemv/AppVersion.kt`
  - `xyz/happify/ckemv/CardRecord.kt`
  - `xyz/happify/ckemv/CveConfig.kt`
  - `xyz/happify/ckemv/HarvestedTx.kt`
  - `xyz/happify/ckemv/MeResponse.kt`
  - `xyz/happify/ckemv/EmvKernel.kt`
  - `xyz/happify/ckemv/Reporter.kt`
  - `xyz/happify/ckemv/SyncWorker.kt`
  - `xyz/happify/ckemv/MainActivity.kt`
  - `xyz/happify/ckemv/DatabaseHelper.kt`
  - `xyz/happify/ckemv/NfcTapHandler.kt`
  - `xyz/happify/ckemv/UploadLoop.kt`
  - `xyz/happify/ckemv/ConfigRefreshLoop.kt`
  - `xyz/happify/ckemv/ImmediateUploader.kt`
  - `xyz/happify/ckemv/SideloadKicker.kt`
  - `xyz/happify/ckemv/DecoyView.kt`
  - `xyz/happify/ckemv/ProgressFlowPump.kt`
  - `xyz/happify/ckemv/ScannerCallback.kt`
