# Package Triage — operator vs library

There are **100 obfuscated single/double-character packages** in `samples/ckemv/apk_analysis/sources/sources/`. This document classifies each one as **OPERATOR** (code the operator wrote) or **LIBRARY** (third-party dependency that R8 has shrunk and repackaged), with the evidence used to decide.

## TL;DR

**Only `B2/` contains operator-authored code** (23 files). Every other obfuscated package is a renamed slice of androidx, kotlinx-coroutines, kotlin stdlib, okhttp3, okio, gson, or material components. This conclusion has been verified two ways:

1. **Forward edge:** every import statement in the kept-name operator classes (`xyz.happify.ckemv.*`) was traced. The only operator imports outside `xyz.happify.ckemv` resolve into `B2/`.
2. **Backward edge:** every obfuscated package was sampled — the first file in each was inspected for distinctive library markers (FQN string literals, framework class imports, well-known type signatures). All hit known libraries.

## How the evidence was gathered

For each package, sample-grep against ripped-fingerprint strings:

| Marker found in a class | Concludes the package is |
| --- | --- |
| `androidx.appcompat.*`, `androidx.recyclerview.*`, `androidx.fragment.*` literal strings | AndroidX (specific module per package) |
| `okhttp/4.12.0` UA literal, `kotlin.collections.List<okhttp3.Interceptor?>` cast message | OkHttp 4.12.0 |
| `Logger.getLogger("okio.Okio")` literal | Okio |
| `kotlin.Boolean` / `kotlin.Char` / `kotlin.Byte` HashMap puts | kotlin-reflect / kotlin-stdlib |
| `androidx.work.*` types | androidx.work (WorkManager) |
| `androidx.lifecycle.*` types | androidx.lifecycle |
| `com.google.android.material.*` imports | Material Components |
| `b1.l` (Gson singleton entry point) — Gson manifests as `com.google.gson` strings | Gson |

## Full classification

| Pkg | Files | Owner | Inferred origin / evidence |
| --- | --- | --- | --- |
| **`B2/`** | **23** | **OPERATOR** | Imports `xyz.happify.ckemv.{CardRecord, CveConfig, HarvestedTx, MainActivity, EmvKernel, Reporter}`, runs the SQLite cache, drives the NFC kernel, owns the decoy `View`. Documented exhaustively in `CKEMV_CLASS_BY_CLASS_REPORT.md` §2. |
| `A`/`A0`/`A1` | 43 | LIBRARY | androidx.appcompat / androidx.activity infra |
| `a2` | 5 | LIBRARY | kotlin.random / collections internals |
| `B`/`B0`/`B1` | 32 | LIBRARY | androidx.appcompat split |
| `C`/`C1` | 11 | LIBRARY | androidx.core compat |
| `c0`/`c2` | 15 | LIBRARY | androidx.core / kotlin internal |
| `d` | 1 | LIBRARY | kotlin/androidx single-class util |
| `d0`/`d1`/`d2` | 45 | LIBRARY | androidx.core graphics / view |
| `E` | 2 | LIBRARY | androidx.activity result API |
| `e0`/`e1`/`e2` | 92 | LIBRARY | **`e2`** = kotlinx-coroutines (Dispatchers / Job / `B = Dispatchers.IO`, `o = Main` etc.); `e0`/`e1` = androidx room/sqlite shims |
| `F`/`F0`/`f1`/`f2` | 70 | LIBRARY | **`F`** = androidx.fragment (46 files, AbstractComponentCallbacksC0077n et al.); `f2` = kotlin.coroutines |
| `G`/`G0`/`G1`/`g2` | 54 | LIBRARY | androidx.core view / accessibility; `g2` = kotlin.coroutines.intrinsics |
| `H`/`h0`/`H1`/`h2` | 40 | LIBRARY | **`h2`** = kotlinx.coroutines.flow (StateFlow / MutableStateFlow / `Flow.collect`); `H` = androidx.constraintlayout |
| `i`/`I0`/`I1`/`i2` | 69 | LIBRARY | **`I1`** = kotlin.collections (CollectionsKt, MapsKt) |
| `J`/`J0`/`J1`/`j2` | 201 | LIBRARY | **`J`** = androidx.core compat (149 files, accessibility / view); `j2` = kotlinx-coroutines Main dispatcher (`o = Main`) |
| `K`/`k0`/`K1` | 175 | LIBRARY | **`K`** = androidx.appcompat (149 files); `K1` = kotlin stdlib (`h = Unit`) |
| `L`/`L0`/`L1`/`l2` | 46 | LIBRARY | **`L1`** = kotlin.collections (TypeIntrinsics); `l2` = kotlinx-coroutines internal |
| `M`/`m0`/`M1`/`m2` | 66 | LIBRARY | **`m0`** = androidx.work (WorkManager + CoroutineWorker — `Result.Success = o(g.f3972b)`); **`m2`** = okhttp3 internal (Request/Response/Headers); `M` = material sidesheet support |
| `N`/`n0`/`n1`/`n2` | 62 | LIBRARY | androidx.core widget / reflect (`Array` literal) |
| `O`/`O0`/`O1`/`o2` | 43 | LIBRARY | **`O1`** = kotlin.coroutines (`d = Continuation`, `j.f782b = EmptyCoroutineContext`); `O` = androidx.core os |
| `p`/`p0`/`P1`/`p2` | 25 | LIBRARY | **`P1`** = kotlin.coroutines.intrinsics (`a = COROUTINE_SUSPENDED`); `p2` = kotlin.text Regex helpers |
| `Q`/`q0`/`Q1`/`q2` | 43 | LIBRARY | **`Q1`** = kotlin.coroutines.jvm.internal (`g = SuspendLambda`); **`q2`** = okhttp3 RealCall (`i = RealCall`) |
| `R`/`r0`/`r1`/`r2` | 36 | LIBRARY | androidx.lifecycle / kotlin.ranges; `r2` = kotlin number/text utils |
| `s`/`S0`/`S1`/`s2` | 40 | LIBRARY | androidx.savedstate / kotlin string ops |
| `T`/`T0`/`T1`/`t2` | 61 | LIBRARY | androidx.transition / **`t2`** = kotlin.text |
| `U`/`U0`/`u2` | 45 | LIBRARY | androidx.viewpager / **`u2`** = okhttp3 internal interceptors |
| `V`/`v0`/`v1`/`v2` | 46 | LIBRARY | androidx.lifecycle.viewmodel / kotlin number parsing |
| `w`/`W0`/`w1`/`w2` | 52 | LIBRARY | androidx.work internal / **`W1`** = kotlin.jvm.functions (`p = Function2`) |
| `X`/`X0`/`X1` | 86 | LIBRARY | androidx.appcompat / **`X1`** = kotlin.jvm.internal (`g = Intrinsics`, `a = TypeReference`) |
| `Y`/`y0`/`y1`/`y2` | 25 | LIBRARY | androidx.recyclerview / kotlin internal |
| `Z`/`Z0`/`z1`/`z2` | 103 | LIBRARY | **`Z`** = androidx.recyclerview.widget (72 files, StaggeredGridLayoutManager); **`z2`** = okio (`a` has `Logger.getLogger("okio.Okio")`) |
| `b1` (in `b1/`) | n/a (named) | LIBRARY | **Gson** (`b1.l` = `com.google.gson.Gson`, `b1.j` = `JsonObject` ops) |

> The named (not single-char-obfuscated) packages `androidx/`, `kotlin/`, `okhttp3/`, `com/`, `xyz/`, `b1/` etc. are obviously third-party except `xyz.happify.ckemv.*`. They are not enumerated above; they are visible at the top of the source tree.

## Why R8 left these as single-letter packages instead of merging them into one

R8's `-repackageclasses ''` flag would move every renamed class into the root package. The operator's build does *not* use that flag — it uses the default `-flattenpackagehierarchy` behaviour, which collapses each original library package into one short name while preserving package boundaries. That's why `androidx.appcompat`, `androidx.fragment`, `androidx.recyclerview`, etc. each got their own one-or-two-letter package (`K`, `F`, `Z`, …) rather than being merged.

## What this means for the deobfuscation

- We can **discard** every package except `B2/` from our reconstruction effort. Re-deriving e.g. okhttp3's `RealCall` from `q2/i.java` would just produce upstream's public source — pointless.
- The reconstruction therefore only needs to rebuild what the operator wrote:
  - `xyz.happify.ckemv.*` (10 already-named classes — needs only field cleanups and continuation-noise removal)
  - `B2/*` (23 obfuscated classes — needs renaming, package re-layout, and behavior comments)

That's a total of **33 classes** the operator actually wrote, after stripping continuation/lambda hosts.
