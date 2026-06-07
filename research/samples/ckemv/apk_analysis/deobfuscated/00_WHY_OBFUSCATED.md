# Why the decompiled source has names like `a.java`, `b.java`

## Short answer

The operator did **not** name their classes `a`, `b`, `q`, `B2`. Those names were assigned by **R8** (the default Android shrinker / obfuscator that ships with the Android Gradle Plugin) when the operator built the release APK. Every identifier the operator wrote — class names, package paths, method names, field names, local variable names — was replaced with the shortest legal symbol available.

`jadx` only sees the post-R8 bytecode, so the source it reconstructs uses the post-R8 names.

---

## The four things R8 actually does

When the operator's `app/build.gradle` had `minifyEnabled true`, R8 rewrote the dex in four passes:

1. **Tree shaking.** Dead code (unused classes, methods, fields) is dropped.
2. **Renaming.** Every non-public symbol that isn't pinned by a `keep` rule is renamed to a short alphabetic sequence: `a`, `b`, …, `z`, `aa`, `ab`, …
3. **Optimisation.** Small inlining and dead-branch removal.
4. **Repackaging.** Classes from many original packages are flattened into a single (or a few) tiny package names — `B2/`, `K/`, `Z/`, etc.

Step 2 + step 4 are the source of the gibberish names you see in `samples/ckemv/apk_analysis/sources/sources/`.

## Evidence this is R8 (not DexGuard, not the operator)

- **Lowercase-first naming scheme** (`a`, `b`, `c`, … `aa`, `ab`): canonical R8 output. DexGuard uses interleaved upper/lowercase and longer aliases by default.
- **Repackaged single-letter packages** (`B2/`, `K/`, `J/` …): default R8 behaviour with `-repackageclasses` / `-flattenpackagehierarchy`.
- **Synthetic interfaces with a `C0107b`-style numeric infix** (`InterfaceC0106a.java`, `InterfaceC0107b.java`): jadx's own placeholder when R8 has emitted a marker interface with no original `kotlin_metadata` to recover from.
- **Original package `xyz.happify.ckemv` is preserved**: classes touched by the Android framework (`Activity`, `Worker`, JNI-loaded classes) must keep their original FQN because the framework finds them by name from the manifest or `System.loadLibrary`. R8 *was* asked to keep them — that's why `MainActivity`, `SyncWorker`, `EmvKernel`, `Reporter`, and the `@Keep`-equivalent data classes still have real names.
- **No string encryption.** DexGuard and Allatori add a per-class decryption stub for every string literal; here every interesting string (URL, SQL, EMV AID) is plaintext UTF-8 in the dex. R8 doesn't ship a string encrypter.

So the obfuscation is *off-the-shelf Android-Gradle-Plugin defaults*. The operator did **not** add a commercial obfuscator on top — almost certainly because (a) they didn't need to (the native libs already hide the interesting code) and (b) the build pipeline points to `Rust 1.91` / NDK toolchains that wouldn't have a paid Java obfuscator attached.

## Why some names *aren't* obfuscated

Anything reachable by reflection or by the platform without a Java caller must be kept under its original name, otherwise the app crashes at runtime:

| Kept-name reason | Examples in this sample |
|---|---|
| Declared in `AndroidManifest.xml` (Android instantiates by FQN) | `xyz.happify.ckemv.MainActivity` |
| `WorkManager` looks up `Worker` subclasses by FQN | `xyz.happify.ckemv.SyncWorker` |
| `System.loadLibrary(...)` then `RegisterNatives` matches by class + method name | `xyz.happify.ckemv.EmvKernel`, `xyz.happify.ckemv.Reporter` |
| Gson reflects on field names to deserialise JSON | `AppVersion`, `CveConfig`, `MeResponse`, `CardRecord`, `HarvestedTx` (field names like `pan`, `aid`, `mastercard_tags`, `latest_version` are wire-shape pinned) |
| Android `R` class is generated and kept by AGP | `xyz.happify.ckemv.R` |

Everything else — the SQLite helper, the NFC loop, the upload loop, the config-fetch loop, the decoy `View`, the FileProvider sideloader, every coroutine continuation — was free to be renamed and so was. That's the entire content of `B2/`.

## Why class files multiply (one feature → six classes)

Two compiler features inflate the class count before R8 even runs:

- **Kotlin lambdas / `suspend` blocks** — every `withContext(...) { ... }`, every `launch { ... }`, every `Flow.collect { ... }` lambda becomes a separate `SuspendLambda` subclass at compile time. After R8, each is a single-letter file. Hence why a single coroutine like the upload loop spawns `o.java`, `s.java`, `m.java`, `p.java`, `n.java`, `r.java` — most are continuation/lambda hosts, only `s.java` is the *body* of the loop.
- **Kotlin `data class`** — every `data class` gets compiler-generated `equals`, `hashCode`, `copy`, `componentN`, `toString`. R8 *can* prune them, but if **anything** retains them (Gson, Parcel-by-reflection, debug logging), they stay.

## How to read the source without this report

The decoder ring is `02_RENAME_MAP.json` — every operator-authored obfuscated symbol with its semantic name and the evidence used to derive it. The deobfuscated source tree at `src/` is the reconstructed code under those semantic names, organised into the package layout the operator most likely wrote.

If you only have time for one thing: read the deobfuscated `MainActivity.java` (entry point), then follow the call graph into `nfc/NfcTapHandler.java`, `net/UploadLoop.java`, and `net/ConfigUpdateLoop.java`.
