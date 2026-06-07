# CKEMV Dynamic Analysis — Tooling Setup & SOP

Last updated: 2026-05-17

This doc records the dynamic-analysis tooling installed for the CKEMV harvester
(`xyz.happify.ckemv`, "Geometry Saver", C2 `https://tqqemv.xyz`) and the
operating procedure for spinning up an instrumented Android target.

The static-analysis pipeline (Docker Ghidra/radare2/rustfilt, Python
capstone/lief, jadx, the deobfuscated source tree at
`samples/ckemv/apk_analysis/deobfuscated/`) is unchanged — this is purely additive.

---

## 1. Host tool inventory (verified 2026-05-17)

| Tool             | Version            | Location                                                                  |
|------------------|--------------------|---------------------------------------------------------------------------|
| Docker Desktop   | 29.3.1             | system                                                                    |
| Android Studio   | installed          | `C:\Program Files\Android\Android Studio`                                 |
| Android SDK      | API 33/34/35/36    | `C:\Users\mogli\AppData\Local\Android\Sdk`                                |
| adb              | 1.0.41 (36.0.0)    | `...\Sdk\platform-tools\adb.exe` (also via scrcpy install)                |
| emulator         | (with SDK)         | `...\Sdk\emulator\emulator.exe`                                           |
| Java JDK         | 21.0.10            | `C:\Program Files\Common Files\Oracle\Java\javapath\java.exe`             |
| jadx CLI         | (bundled)          | `apk_analysis\jadx\bin\jadx.bat`                                          |
| Python           | 3.14.4             | `...\pythoncore-3.14-64\python.exe`                                       |
| capstone         | 5.0.7              | pip --user                                                                |
| lief             | 0.17.6             | pip --user                                                                |
| **frida**        | **17.9.10**        | pip --user — `...\Roaming\Python\Python314\Scripts\frida.exe`             |
| **frida-tools**  | **14.8.2**         | pip --user (frida, frida-ps, frida-trace, frida-ls-devices, …)            |
| **objection**    | **1.12.4**         | pip --user — `...\Scripts\objection.exe`                                  |

### PATH wiring

`~/.claude/settings.json` `env.PATH` now prepends:
- `...\Roaming\Python\Python314\Scripts` (frida/objection)
- `...\Sdk\emulator`
- `...\Sdk\platform-tools` (adb/fastboot)
- `apk_analysis\jadx\bin`

`ANDROID_HOME` and `ANDROID_SDK_ROOT` are both set to the SDK root.
Effective after Claude Code reload.

### Claude Code skills

`SimoneAvogadro/android-reverse-engineering-skill` is cloned to
`~/.claude/plugins/marketplaces/android-re` and registered in
`known_marketplaces.json`. Enable it once via:

```
/plugin install android-reverse-engineering@android-reverse-engineering-skill
```

It wraps jadx/Fernflower + an API-call grep helper. Our existing JADX output
already lives at `samples/ckemv/apk_analysis/sources/` and `samples/ckemv/apk_analysis/deobfuscated/`, so
the skill's primary value here is the `find-api-calls.ps1` cross-check.

---

## 2. AVD inventory & architecture decision

`emulator -list-avds`:

- **`CKEMV_ARM64`** — API 33, **arm64-v8a**, **google_apis** (no Play Store, **rootable**) ← created 2026-05-17 for this work
- `Medium_Phone`   — API 33, x86_64, google_apis_playstore (unused)
- `Medium_Phone_2` — API 34, x86_64, google_apis_playstore (unused)
- `Pixel_7a`       — API 35, x86_64, google_apis_playstore (unused)

`frida-server-17.9.10-android-arm64` is staged at
`samples/ckemv/apk_analysis/tools/frida-server-arm64` (51 MB, decompressed).

**Two problems for running `xyz.happify.ckemv` instrumented:**

1. **Play Store images can't be `adb root`'d.** They enforce
   verified-boot constraints, so `frida-server` (which needs root to attach
   without repackaging) cannot be installed the usual way. Workarounds:
   non-Play `google_apis` image, *or* repackage the APK with `frida-gadget`
   and run unrooted.

2. **Native-lib architecture mismatch.** Per Phase-A analysis the APK ships
   `lib/arm64-v8a/libckemv_android.so` and `libckemv_reporter.so` and *only*
   `arm64-v8a`. On an x86_64 emulator the package will install (the Java
   layer loads fine) but any JNI call into the EMV state machine or the
   ureq/rustls reporter throws `UnsatisfiedLinkError`. The interesting C2
   traffic, NFC frame parsing, and PIN handling live in those `.so`s, so
   x86_64 dynamic analysis only covers the Kotlin shell.

**Three viable paths forward (pick one before installing more):**

| Path | What to install | Pros | Cons |
|------|-----------------|------|------|
| **A. arm64-v8a Google APIs AVD (rooted)** | Android cmdline-tools + `sdkmanager "system-images;android-33;google_apis;arm64-v8a"` (~1.3 GB) + `avdmanager` to create AVD | Real ARM exec of all `.so`s, root works, full frida-server | Slow on x86 host (QEMU translation), large download |
| **B. x86_64 google_apis AVD (rooted) + Java-layer only** | `sdkmanager "system-images;android-33;google_apis;x86_64"` (~1 GB) | Fast, root, frida-server works | Native libs won't load — misses EMV state machine, reporter, C2 traffic |
| **C. Physical ARM phone (USB-debug, unrooted) + frida-gadget repack** | Just patch APK with `objection patchapk` | Real hardware speed, real NFC if a card reader is attached | Requires a spare burner phone; repack signature ≠ original |

Recommendation for this sample: **A** (correctness beats speed for a
JNI-heavy harvester). The arm64 image plus a rooted AVD lets Frida read the
real EMV bytes flowing through `libckemv_android.so::handle_apdu_*` and
intercept `ureq` calls in `libckemv_reporter.so` before TLS encryption.

If the host can't tolerate ARM emulation speed, **C** with a burner is the
practical fallback.

---

## 3. Operating procedure (post-decision)

### 3.1 Network containment

The malware uploads to `https://tqqemv.xyz`. **Before** the first launch:

- Block egress to `tqqemv.xyz` at the host firewall (Windows Defender
  Firewall outbound rule on `emulator-arm64.exe` / `qemu-system-*.exe`),
  *or* run the emulator with `-dns-server 127.0.0.1` and point at a local
  sinkhole, *or* run inside an isolated Docker network with no outbound
  route.
- Alternative: let traffic flow but route through mitmproxy (`-http-proxy
  http://10.0.2.2:8080`) and pin the cert so we read everything. Beware
  that the reporter uses rustls with a bundled Mozilla root store
  (`reporter_ca_anchors.txt`), so we'll need to inject our CA into the
  bundle or hook rustls verification via Frida.

### 3.2 Spin up the AVD

```
emulator -avd <name> -no-snapshot -wipe-data -writable-system -no-audio \
         -no-boot-anim -dns-server 127.0.0.1
```

Wait for boot, then:
```
adb root
adb remount
```

### 3.3 Install frida-server matching the AVD ABI

For arm64: `frida-server-17.9.10-android-arm64`. For x86_64:
`frida-server-17.9.10-android-x86_64`. From the official release page on
github.com/frida/frida.

```
adb push frida-server-17.9.10-android-<abi> /data/local/tmp/frida-server
adb shell chmod 755 /data/local/tmp/frida-server
adb shell /data/local/tmp/frida-server &
frida-ps -U   # should list device processes
```

### 3.4 Install + run the sample

```
adb install -r "..\samples/ckemv/sample.apk"
# Cold-start with Frida attached so we catch onCreate:
frida -U -f xyz.happify.ckemv -l hooks\trace_jni.js --no-pause
```

Useful objection one-shots once attached:
```
objection -g xyz.happify.ckemv explore
android hooking list classes
android hooking watch class xyz.happify.ckemv.B2.NfcTapHandler
android sslpinning disable
android keystore list
```

### 3.5 Things worth hooking first (from static analysis)

- `xyz.happify.ckemv.B2.NfcTapHandler` — core harvest loop, where `IsoDep`
  frames enter the JNI bridge
- `xyz.happify.ckemv.jni.EmvKernel.*` — native entry points into
  `libckemv_android.so`
- `xyz.happify.ckemv.jni.Reporter.*` — native entry points into
  `libckemv_reporter.so` (uploads to `tqqemv.xyz`)
- `xyz.happify.ckemv.net.UploadLoop` and `ConfigUpdateLoop` — Java-side C2
  scheduling
- `xyz.happify.ckemv.update.ApkSideloader` — secondary payload path

For native side: capstone offsets from `samples/ckemv/apk_analysis/kernel_functions.json`
and `samples/ckemv/apk_analysis/reporter_functions.json` give the addresses to
`Interceptor.attach` on once the libs are mapped.

---

## 4. Outstanding setup tasks

- [x] Path **A** chosen by user (2026-05-17)
- [x] `cmdline-tools` 12.0 installed at `Sdk/cmdline-tools/latest/`
- [x] SDK licenses accepted
- [x] arm64-v8a google_apis API-33 system image pulled (~1.3 GB)
- [x] AVD `CKEMV_ARM64` created (rootable)
- [x] `frida-server-17.9.10-android-arm64` staged in `samples/ckemv/apk_analysis/tools/`
- [ ] First boot of CKEMV_ARM64 — requires user OK (and the cold boot is
      slow on x86 host because of QEMU ARM translation, ~5–10 min)
- [ ] Network-containment choice (firewall block on `tqqemv.xyz` vs
      mitmproxy intercept)
- [ ] Push frida-server, `adb root`, `chmod 755`, run as background
- [ ] `adb install -r "samples/ckemv/sample.apk"`
- [ ] First Frida hook script (`hooks/trace_jni.js`)
