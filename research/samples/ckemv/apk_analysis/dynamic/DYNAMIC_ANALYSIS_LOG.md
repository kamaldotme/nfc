# CKEMV Dynamic Analysis — Append-Only Log

Each entry is one action. Format:
```
## YYYY-MM-DDTHH:MM (UTC) — <who> — <one-line summary>
What:   <what was actually run / decided>
Why:    <why it was needed>
Result: <outcome, key paths produced, errors hit>
Next:   <pointer to the next pending item>
```

Newest entry at the bottom. Do not edit prior entries — append corrections
as new entries.

---

## 2026-05-17T17:20 — claude — Host tooling install pass complete
What: Installed frida 17.9.10, frida-tools 14.8.2, objection 1.12.4 via pip
    --user. Verified jadx already unpacked at samples/ckemv/apk_analysis/jadx/bin. Cloned
    SimoneAvogadro/android-reverse-engineering-skill into
    ~/.claude/plugins/marketplaces/android-re and registered marketplace.
    Wrote ANDROID_HOME, ANDROID_SDK_ROOT, JAVA_HOME and PATH into
    ~/.claude/settings.json.
Why:  Dynamic analysis prerequisites; previous sessions stayed static-only.
Result: All tools on disk and verified. PATH effective on next CC reload.
Next: AVD architecture decision.

## 2026-05-17T17:25 — claude — Surfaced architecture mismatch to user
What: Discovered all 3 existing AVDs are x86_64 google_apis_playstore — can't
    root and can't load arm64-only native libs from the APK. Documented in
    samples/ckemv/apk_analysis/DYNAMIC_ANALYSIS_SETUP.md §2; presented 3 paths.
Why:  Picking wrong path here costs us the native-layer instrumentation.
Result: User chose path A — arm64 rooted AVD.
Next: Install cmdline-tools.

## 2026-05-17T17:32 — claude — cmdline-tools 12.0 installed
What: Downloaded commandlinetools-win-11076708_latest.zip (147 MB),
    extracted to Sdk/cmdline-tools/latest/. Set JAVA_HOME to
    "C:\Program Files\Java\jdk-21.0.10"; sdkmanager --version returns 12.0.
Why:  Required for sdkmanager / avdmanager to pull images headlessly.
Result: sdkmanager + avdmanager working. translatedAbis XML warning is
    benign (cmdline-tools schema version 3 vs Android Studio's installed
    package.xml at schema 4 — does not block operations).
Next: Accept licenses, pull arm64 image.

## 2026-05-17T17:34 — claude — Pulled arm64-v8a google_apis API 33 image
What: yes | sdkmanager --licenses; sdkmanager
    "system-images;android-33;google_apis;arm64-v8a" (~1.3 GB).
Why:  Required system image for a rootable arm64 AVD.
Result: Image installed at
    Sdk/system-images/android-33/google_apis/arm64-v8a/.

## 2026-05-17T17:36 — claude — Created AVD CKEMV_ARM64
What: avdmanager create avd -n CKEMV_ARM64
    -k "system-images;android-33;google_apis;arm64-v8a" --device pixel.
Why:  Rooted arm64 target for the harvester.
Result: ~/.android/avd/CKEMV_ARM64.avd exists; config.ini confirms
    abi.type=arm64-v8a, PlayStore.enabled=no, tag.id=google_apis.

## 2026-05-17T17:36 — claude — Staged frida-server-arm64
What: curl https://github.com/frida/frida/releases/download/17.9.10/
    frida-server-17.9.10-android-arm64.xz; xz -d. Landed at
    samples/ckemv/apk_analysis/tools/frida-server-arm64 (51 MB).
Why:  Need a frida-server binary matching the host's frida 17.9.10 client.
Result: Ready to adb push once emulator boots.

## 2026-05-17T18:30 — claude — mitmproxy 12.2.3 installed + CA generated
What: pip install mitmproxy. Ran mitmdump briefly with confdir
    samples/ckemv/apk_analysis/dynamic/mitmproxy/ to materialize the CA. Computed Android
    `subject_hash_old` of the CA: **c8750f0d**. Staged copy of CA as
    `c8750f0d.0` for system-store install (would need root).
Result: mitmproxy ready. CA fingerprint c8750f0d.

## 2026-05-17T18:32 — claude — Architecture failure #1: ARM AVD on x86 host
What: Tried to boot CKEMV_ARM64 (arm64-v8a google_apis API 33).
Result: FATAL — "Avd's CPU Architecture 'arm64' is not supported by the
    QEMU2 emulator on x86_64 host. System image must match the host
    architecture." Modern emulator 36.x dropped arm-on-x86 translation.
Next: Pivot to x86_64 image with ARM user-mode translation.

## 2026-05-17T18:34 — claude — Pulled x86_64 google_apis API 33 image
What: Installed system-images;android-33;google_apis;x86_64; created
    CKEMV_X86 AVD (rooted, x86_64).
Result: Boots fast, gets root via `adb root`, but
    `ro.product.cpu.abilist=x86_64` only — NO arm64 translation. Image
    is bare-bones google_apis. Native arm64 .so from the malware would
    UnsatisfiedLinkError on this image.

## 2026-05-17T18:42 — claude — Architecture failure #2: x86_64 google_apis has no ARM translation
What: Inspected system-images already on disk:
    - android-33 google_apis_playstore x86_64: `x86_64` (no arm)
    - android-34 google_apis_playstore x86_64: `x86_64,arm64-v8a` ✓
    - android-35 google_apis_playstore x86_64: `x86_64,arm64-v8a` ✓
Result: Only Play Store images have the translation. Play Store images are
    NOT rootable. Killed CKEMV_X86. Pivoted to existing Pixel_7a AVD (API
    35 playstore) + frida-gadget repack approach (no root needed).
Next: objection patchapk + boot Pixel_7a.

## 2026-05-17T18:50 — claude — Patched APK with frida-gadget via objection
What: After installing apktool 2.11.0 + creating apktool.bat wrapper
    (objection's shutil.which needs .bat on Windows), ran:
    `objection patchapk -s "samples/ckemv/sample.apk" -a arm64 -N -2`
Result: Produced ckemv-harvester (10).objection.apk. The patch:
    - injected `loadLibrary("frida-gadget")` into MainActivity.smali clinit
    - dropped libfrida-gadget.so (arm64) into the APK
    - copied a network_security_config.xml that trusts user CAs
    - resigned with objection's bundled keystore

## 2026-05-17T18:53 — claude — Pixel_7a booted (third try; GPU+lock-file issues)
What: First boot crashed on GPU init. Second attempt failed due to stale
    AVD locks (PID 16168 = qemu-system-x86_64.exe still alive from earlier
    failed boot — killed it, cleared locks). Third boot with
    `-no-window -gpu swiftshader_indirect` succeeded.
Result: Pixel_7a online, `ro.product.cpu.abilist=x86_64,arm64-v8a` —
    arm64 translation confirmed.

## 2026-05-17T19:02 — claude — APK install bug + fix
What: Installed objection-patched APK; logcat dalvik-cache path was
    `/data/dalvik-cache/x86_64/...` and the on-device lib dir only had
    `lib/arm64/libfrida-gadget.so` — the original ckemv_*.so were missing.
    Root cause: objection placed libfrida-gadget.so in `lib/arm64/` rather
    than `lib/arm64-v8a/`. Android's installer treats those as separate
    candidate ABI dirs and picked the gadget-only `arm64/` dir as the
    primary, ignoring the real arm64-v8a contents.
    Fix: repacked with Python zipfile to merge into `lib/arm64-v8a/`, kept
    resources.arsc STORED (API 30+ requirement), zipaligned, re-signed with
    objection's bundled keystore (apksigner v2+v3).
Result: ckemv-patched-fixed-aligned.apk installs cleanly; on-device lib
    dir now has all three: libckemv_android.so, libckemv_reporter.so,
    libfrida-gadget.so.

## 2026-05-17T19:03 — claude — HARD BLOCKER: frida-gadget crashes under arm64 translation
What: am start -n xyz.happify.ckemv/.MainActivity.
Result: Process pid 8482 launched, immediately crashed with F DEBUG
    tombstone. Three frames in libfrida-gadget.so (0x9cb260, 0x9cb66c,
    0x9b936c). Process dies; Activity force-finished. `frida-ps -U` does
    not show the app or any Gadget. `re.frida.helper` device-side bridge
    also logs "Unexpected CPU variant for x86: x86_64." — running x86_64
    helper but the target is arm64-translated.
Diagnosis: frida-gadget's runtime (Stalker, Cloak, JIT, signal handlers)
    needs real native CPU instructions; `libndk_translation`'s syscall
    interposition + binary translation doesn't preserve the contract.
    This is a known incompatibility, not a build error.
Next: Need a different instrumentation path. See TRACKER §"Decision
    matrix" — Path P (physical ARM phone) or F2 (rooted x86_64+arm64
    image if it exists) or B (binary patch the rustls verifier and skip
    Frida).

## 2026-05-17T19:08 — claude — Probed sdkmanager for rooted x86_64+arm64 hybrid image
What: `sdkmanager --list | grep system-images;android-3[3-5]`. Looked
    specifically for `x86_64_arm64-v8a` (hybrid) variants.
Result: No such variant exists. Every published image is single-arch. The
    only images that include arm64 user-mode translation on an x86_64 host
    are the `google_apis_playstore` x86_64 images at API 34/35 — and Play
    Store images are not rootable. Path F2 is therefore dead.
Next: Decision still owed by user — Path P, G, or B (see TRACKER §1).

## 2026-05-17T19:15 — claude — User chose Path G (Genymotion)
What: User picked Genymotion Personal Edition. Genymotion's arm64 virtual
    devices run real arm64 instructions under QEMU TCG (no
    libndk_translation), so frida-server-arm64 will work, and the devices
    ship rooted — which collapses the entire frida-gadget repack /
    network_security_config path we built earlier.
Result: Wrote GENYMOTION_SETUP.md with the (few) manual-install steps
    the user must do plus the automated gmtool plan I'll execute once
    they're signed in. Updated TRACKER §"Current blockers". The patched
    APK at samples/ckemv/apk_analysis/dynamic/patched/ckemv-patched-fixed-aligned.apk
    stays on disk as reference but won't be installed on Genymotion.
Next: User installs Genymotion + signs in. Then I run gmtool to create
    an arm64 device, boot it, and resume PLAN §D2.

## 2026-05-17T19:25 — claude — Path G superseded by macOS arm64 host migration
What: User disclosed an M1 Pro Mac is available. On Apple Silicon the
    Android emulator runs arm64-v8a system images natively under
    Hypervisor.framework — no translation, no Houdini, no QEMU TCG,
    no Genymotion needed. The original Path A from the very first plan
    becomes the right path: rooted google_apis arm64 AVD +
    frida-server-arm64 + the unmodified harvester APK.
Result: Shut down Pixel_7a emulator on Windows. Wrote MAC_HANDOFF.md as
    the entry point for the next Claude Code session on the Mac:
    transfer list, install commands (brew + sdkmanager), AVD creation,
    the bootstrap prompt to give the new session.
Next: User copies Research/ tree to Mac and starts a new Claude Code
    session there. This Windows session is parked.

## 2026-05-17T17:40 — claude — User authorized full dynamic-analysis workstream
What: User approved (a) booting CKEMV_ARM64, (b) mitmproxy CA + rustls
    bypass for full forensic visibility, (c) APK install. Scope expanded
    to: build a local C2 mock that lets analysis survive operator C2
    rotation. All docs to live in samples/ckemv/apk_analysis/dynamic/ so sessions can
    resume from disk alone.
Why:  Memory is volatile across sessions; the project tree is not.
Result: Created samples/ckemv/apk_analysis/dynamic/{hooks,captures,local_c2} + the four
    planning docs (TRACKER, PLAN, TODO, this LOG).
Next: Install mitmproxy on host, then cold-boot CKEMV_ARM64.

## 2026-05-23T00:00 — claude (Mac/M1) — Resumed on Apple Silicon, starting Phase M bring-up
What: New Claude Code session on the user's M1 Mac (arm64 confirmed via uname).
    Repo cloned to ~/Desktop/Nfc research/research. Surveyed host: brew, JDK 25,
    python3.14, docker present. Existing Android SDK at ~/Library/Android/sdk has
    adb + emulator binary + arm64 system-images BUT they are all
    google_apis_PLAYSTORE variants (NOT rootable) and there is no cmdline-tools
    (no sdkmanager/avdmanager). Existing AVDs are the user's personal ones — will
    NOT run malware on those.
Plan: install cmdline-tools (brew cask) + jadx + mitmproxy (brew); pull a ROOTABLE
    system-images;android-3X;google_apis;arm64-v8a (non-playstore); create dedicated
    AVD CKEMV_ARM64_MAC; install frida-tools (handle py3.14 wheel risk). Then PLAN §D.
Invariants reaffirmed: no real C2 traffic to tqqemv.xyz; malware confined to the AVD;
    all findings to disk.
Next: brew installs + set ANDROID_HOME/PATH.

## 2026-05-23T00:40 — claude (Mac/M1) — Architecture wall CLEARED; AVD up, rooted, arm64
What: Toolchain installed (cmdline-tools into SDK, jadx, mitmproxy 12.2.3, frida
    17.9.10 client in venv matching the shipped frida-server-arm64). Pulled rootable
    system-images;android-33;google_apis;arm64-v8a (8.2G). Created AVD CKEMV_ARM64_MAC
    (Android 13, google_apis/arm64-v8a). Booted with -writable-system -no-snapshot-load.
Result: ALL FOUR GREEN — ro.product.cpu.abilist=arm64-v8a, abi=arm64-v8a,
    uname -m=aarch64, `adb root` => "restarting adbd as root", whoami=root,
    `adb remount` => overlayfs remount succeeded. The six-deep x86_64 emulation
    failure chain from the Windows host is gone (native arm64 under Hypervisor.fwk).
    mitmproxy CA generated; Android trust filename c8750f0d.0 (deterministic hash).
avdmanager gotcha (recorded for future): the brew cmdline-tools avdmanager computes
    SDK root from its own dir and ignored ANDROID_SDK_ROOT ("Valid system image paths: null").
    Fix = install cmdline-tools;latest INTO ~/Library/Android/sdk and use that avdmanager.
Next: push frida-server-arm64, run as root, verify frida-ps -U; push CA to /system trust store.

## 2026-05-23T00:55 — claude (Mac/M1) — Frida WORKS on arm64; two fixes required
What: First instrumentation attempt of the dynamic harness on native arm64.
Fix 1 — Frida version: shipped frida-server is 17.9.10, but the hooks/*.js were
    written for Frida <=16 (global `Java`, `Module.findExportByName`). Frida 17
    removed the Java/ObjC bridges and changed the Module API → both hooks threw.
    Downgraded the WHOLE stack to 16.7.19: pip frida==16.7.19 (abi3 wheel runs on
    py3.14) + downloaded frida-server-16.7.19-android-arm64 (tools/), pushed as
    /data/local/tmp/frida-server-16, removed the 17.x binary. Client/server handshake OK.
Fix 2 — spawn-gating times out on this google_apis-33 image ("timed out waiting
    for app to launch"). Switched to launch-then-ATTACH-by-PID (monkey LAUNCHER +
    pidof + driver.py --pid). Reliable. Wrote samples/ckemv/apk_analysis/dynamic/driver.py.
Result: trace_jni hooked SyncWorker(1) + MainActivity(7). Other classes "not found"
    because trace_jni used the analyst SEMANTIC names. Runtime truth (from
    02_RENAME_MAP.json): JNI bridges are KEPT but in ROOT pkg — xyz.happify.ckemv.Reporter
    and .EmvKernel (not jni.*). Loops are R8-renamed: B2.s=UploadLoop, B2.t=ConfigUpdateLoop,
    B2.o=PostTapUploader, B2.q=NfcTapHandler, B2.a=HarvestDatabaseHelper(i=getApiKey,
    o=insertCard,a=deleteCard,A=replaceAllCves,b=getAllCves). RegisterNatives hook
    skipped (art symbol stripped) — will hook native fns by .so offset instead.
Plan: hook xyz.happify.ckemv.Reporter directly to capture /me + /harvest wire bodies;
    build local_c2 mock; rewrite baseUrl arg https://tqqemv.xyz -> http://10.0.2.2:PORT
    so the malware's own loops drive traffic to the mock. Real C2 stays sinkholed.
Next: check on-device sqlite3; build mock + capture_c2.js.

## 2026-05-23T01:30 — claude (Mac/M1) — Project restructured into the MalLab RE lab; CKEMV = sample #1
What: User clarified the real goal: a REUSABLE Android malware RE lab (not a CKEMV
    one-off). Built `lab/` (golden base AVD + clone-per-sample isolation + shared
    tooling: driver, generic hooks trace_jni/ssl_bypass/http_capture, http_mock,
    build-base/new-sample/teardown scripts, .venv frida 16.7.19, canonical mitm CA).
    Golden base `MalLab-Base` built + 'golden' snapshot saved. Migrated the whole
    CKEMV tree to samples/ckemv/ and fixed path refs (apk_analysis/ -> samples/ckemv/
    apk_analysis/). Repo root now: lab/ + samples/ + README.md.
Why: Apple Silicon = native arm64 for EVERY future sample, not just CKEMV. "Plan
    like a real reverse engineer."
Result: Lab core proven (base boots rooted arm64, frida attaches, hooks load, mock
    reachable). CKEMV-specific hooks (capture_c2.js) + early scripts kept under
    samples/ckemv/apk_analysis/dynamic/. Generic equivalents now in lab/.
Next: validate end-to-end — `lab/bin/new-sample.sh ckemv samples/ckemv/sample.apk`,
    then re-run the Reporter C2 capture against lab/mock to prove an isolated
    per-sample analysis works start-to-finish.

## 2026-05-23T01:55 — claude (Mac/M1) — LAB VALIDATED end-to-end + real C2 protocol captured
What: Ran the full lab workflow on a fresh sample instance and captured the live C2.
Findings (protocol, OBSERVED — corrects static guesses; see C2_PROTOCOL_SPEC.md):
  - Auth header is X-API-KEY: <apiKey>  (NOT Authorization: Bearer).
  - User-Agent: ureq/2.12.1 (network IOC). Accept-Encoding: gzip.
  - POST /harvest body = toUploadJson() JSON (confirmed JSON, not protobuf):
    {pan,aid,network,tx_count,raw_data{},harvested_txs[{atc,arqc,time_ms,cve_id,params{}}]}
  - GET /me carries X-API-KEY, no body. Success = response contains "Success".
Method: Frida capture_c2.js rewrites Reporter baseUrl https://tqqemv.xyz ->
    http://10.0.2.2:8771 (lab mock); app's own UploadLoop/ConfigUpdateLoop drove it.
    Real C2 sinkholed (/system/etc/hosts) + egress-locked (iptables). Synthetic
    apiKey + fake-PAN card injected via sqlite3. Raw: captures/lab_c2.log.
Lab gotchas discovered + fixed:
  - Directory-COPY AVD clone boots but Frida `attach` fails (inject breaks). FIX:
    new-sample.sh now creates a FRESH avdmanager AVD per sample (attach works).
  - `setenforce 0` (permissive) makes zygote selinux_android_setcontext fail ->
    target app SIGABRTs on launch, and the toggle stays broken until reboot.
    FIX: provisioning leaves SELinux ENFORCING (attach works fine under enforcing).
  - frida-server: start WITHOUT `-l` (breaks adb attach transport); pidof/ps are
    false-negatives (it daemonizes w/ cleared comm) — confirm via host enumerate.
  - launch via `am start -n pkg/.MainActivity` (monkey LAUNCHER returns -5 here).
Result: fresh sample_ckemv on emulator-5556 — attach OK (pid 3097), Reporter+
    EmvKernel hooked, /harvest + /me captured at the mock. Lab is production-ready.
