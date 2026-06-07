---
name: CKEMV dynamic-analysis tooling stack
description: Frida/objection/jadx/Android-SDK setup on host for live instrumentation of the CKEMV harvester APK. SOP lives in samples/ckemv/apk_analysis/DYNAMIC_ANALYSIS_SETUP.md.
type: reference
originSessionId: 26bf2ab3-2b2b-41af-b248-5ab43342d290
---
Host already has: Docker Desktop 29.3.1, Android Studio + SDK (API 33/34/35 system-images at `C:\Users\mogli\AppData\Local\Android\Sdk`), JDK 21, adb 1.0.41, Python 3.14 + capstone/lief.

**Added 2026-05-17 (pip --user):** frida 17.9.10, frida-tools 14.8.2, objection 1.12.4. Binaries land in `C:\Users\mogli\AppData\Roaming\Python\Python314\Scripts\`. JADX CLI is already unpacked at `apk_analysis\jadx\bin\jadx.bat`.

**`~/.claude/settings.json` env updated:** `ANDROID_HOME`, `ANDROID_SDK_ROOT`, and `PATH` prepend (frida scripts dir, SDK emulator + platform-tools, jadx bin). Takes effect on Claude Code reload.

**Skill registered (not yet installed):** `SimoneAvogadro/android-reverse-engineering-skill` cloned to `~/.claude/plugins/marketplaces/android-re`, added to `known_marketplaces.json`. Enable with `/plugin install android-reverse-engineering@android-reverse-engineering-skill`.

**Path A executed 2026-05-17:** Android cmdline-tools 12.0 installed at `Sdk/cmdline-tools/latest/`, SDK licenses accepted, `system-images;android-33;google_apis;arm64-v8a` pulled (~1.3 GB), AVD **`CKEMV_ARM64`** created (arm64-v8a, google_apis, PlayStore.enabled=no — rootable). `frida-server-17.9.10-android-arm64` decompressed and staged at `samples/ckemv/apk_analysis/tools/frida-server-arm64` (51 MB). `JAVA_HOME` and cmdline-tools/bin added to `settings.json` PATH.

The three Play Store x86_64 AVDs (Medium_Phone, Medium_Phone_2, Pixel_7a) are unused for this work and can be deleted later if disk pressure matters.

**Next steps (need user OK to proceed because they boot/install the live sample):** boot CKEMV_ARM64 (slow first cold boot on x86 host due to ARM translation), pick net-containment strategy (firewall vs mitmproxy), `adb root` + push frida-server, `adb install` the harvester APK, write first JNI-trace Frida script.

**Full SOP, hook targets, and net-containment plan:** `samples/ckemv/apk_analysis/DYNAMIC_ANALYSIS_SETUP.md`.
