# Mac Handoff — CKEMV Dynamic Analysis on Apple Silicon

**Read this first on the Mac.** It's the entry point for a fresh
Claude Code session on macOS. Once the steps below are done, every other
doc in `samples/ckemv/apk_analysis/dynamic/` works as written — no Windows-specific
workarounds left.

## Why we're moving

Six failed/abandoned paths on the Windows x86_64 host (see
`DYNAMIC_ANALYSIS_LOG.md` 2026-05-17 entries), all rooted in the same
problem: the harvester's only native libs are `arm64-v8a`, and an
x86_64 host can't run them at full fidelity. M1 Pro is **natively arm64**,
so:

- Android emulator runs `system-images;android-33;google_apis;arm64-v8a`
  directly on Hypervisor.framework. No translation. No `libndk_translation`.
  No QEMU TCG.
- The google_apis (non-Play-Store) image is **rootable**.
- `frida-server-android-arm64` runs in the device's arm64 process tree
  with no impedance mismatch — Stalker, JIT, signal handlers all just work.
- We use the **original** `samples/ckemv/sample.apk` — no objection repack,
  no smali edit, no resign.

## What to copy from Windows to Mac

Just the project tree:

```
C:\Users\mogli\Desktop\Prj\Research\   →   ~/Prj/Research/    (or wherever)
```

Inside that, the things that matter:

| Item | Why we need it | Carry over? |
|---|---|---|
| `samples/ckemv/sample.apk` | the sample | **yes** |
| `samples/ckemv/apk_analysis/RESEARCH_TRACKER.md` + `RESEARCH_LOG.md` | top-level static-analysis SoT | **yes** |
| `samples/ckemv/apk_analysis/CKEMV_*_REPORT.md` and other `.md` reports | prior phases A–F findings | **yes** |
| `samples/ckemv/apk_analysis/deobfuscated/` | the operator-readable Kotlin reconstruction | **yes** |
| `samples/ckemv/apk_analysis/{kernel,reporter}_*.{json,txt,md}` | capstone/lief outputs, symbol tables | **yes** — the rustls bypass hook references `reporter_symtab.txt` line 1471 offset `0x162ee4` |
| `samples/ckemv/apk_analysis/sources/`, `samples/ckemv/apk_analysis/res_only/` | jadx output | **yes** |
| `samples/ckemv/apk_analysis/dynamic/{TRACKER,PLAN,LOG,TODO}.md` | dynamic-phase SoT | **yes** |
| `samples/ckemv/apk_analysis/dynamic/hooks/*.js` | Frida scripts | **yes** — platform-agnostic |
| `samples/ckemv/apk_analysis/dynamic/C2_PROTOCOL_SPEC.md` | growing protocol spec | **yes** |
| `samples/ckemv/apk_analysis/dynamic/local_c2/` | (empty scaffold for now) | **yes** |
| `samples/ckemv/apk_analysis/tools/frida-server-arm64` | binary that goes **onto the Android device** | **yes** — same binary, regardless of host |
| `samples/ckemv/apk_analysis/jadx/` | Windows jadx; Mac will use its own (`brew install jadx`) | **no** |
| `samples/ckemv/apk_analysis/docker/` | Docker RE stack — fine to bring; same Docker on Mac | optional |
| `samples/ckemv/apk_analysis/_cli_setup/` | Windows cmdline-tools zip | **no** |
| `samples/ckemv/apk_analysis/tools/frida-server-x86_64`, `apktool*` | Windows-side helpers from the dead paths | **no** |
| `samples/ckemv/apk_analysis/dynamic/patched/` | the dead frida-gadget repack | **no** (delete after copy if you want a clean tree) |
| `samples/ckemv/apk_analysis/dynamic/mitmproxy/` | Windows-generated CA — Mac will regenerate | **no** |

Easiest transfer: zip the whole `Research/` directory (~300–500 MB),
move it via iCloud / USB / scp, unzip on the Mac. The "no" rows are
small enough that leaving them in doesn't hurt — just don't trust the
binaries.

## What to install on the Mac (Apple Silicon)

```bash
# Homebrew (if not already installed)
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# Java + Android SDK command-line tools
brew install --cask temurin@21         # or any JDK 17+
brew install --cask android-commandlinetools

# Android Studio is optional; cmdline-tools is enough for headless work.

# Python tools (Frida + objection + mitmproxy)
python3 -m pip install --user frida-tools objection mitmproxy

# Static analyzers (host-side, optional, useful for re-runs)
brew install jadx
python3 -m pip install --user capstone lief

# Claude Code itself
brew install anthropic/claude/claude-code     # or however CC is installed on Mac
```

Then accept SDK licenses and pull the system image + create the AVD:

```bash
export ANDROID_HOME="$HOME/Library/Android/sdk"   # or wherever brew put it
export PATH="$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools:$ANDROID_HOME/emulator:$PATH"

sdkmanager --install "platform-tools" "emulator"
sdkmanager --install "system-images;android-33;google_apis;arm64-v8a"
yes | sdkmanager --licenses

avdmanager create avd -n CKEMV_ARM64_MAC \
  -k "system-images;android-33;google_apis;arm64-v8a" \
  --device pixel
```

## Start the next Claude Code session

1. `cd ~/Prj/Research` (or wherever you put the tree).
2. Launch Claude Code.
3. First message to the new session:

   > Read `samples/ckemv/apk_analysis/dynamic/MAC_HANDOFF.md` first, then
   > `samples/ckemv/apk_analysis/dynamic/DYNAMIC_ANALYSIS_TRACKER.md`. We're on the M1
   > Pro now, picking up Path A from the original plan. Boot the
   > `CKEMV_ARM64_MAC` AVD, push frida-server-arm64, install
   > the mitmproxy CA into /system/etc/security/cacerts/, install the
   > original `samples/ckemv/sample.apk`, attach Frida with hooks/, and
   > start the first cold-start capture.

That message contains everything the new session needs. The auto-memory
on the Mac will be empty (it's per-host) — but every fact the prior
session recorded is in the project tree, which is the SoT we agreed on.

## Sanity check once the AVD boots

```bash
emulator -avd CKEMV_ARM64_MAC -no-snapshot -no-boot-anim &
adb wait-for-device
adb shell getprop ro.product.cpu.abilist        # expect: arm64-v8a
adb shell getprop ro.product.cpu.abi            # expect: arm64-v8a
adb root                                         # expect: restarting adbd as root
adb shell uname -m                              # expect: aarch64
```

If all four are as expected, the architecture problem that ate the
Windows session is gone. Proceed with PLAN §D2.

## What stays unchanged across the move

- The Frida scripts in `samples/ckemv/apk_analysis/dynamic/hooks/` reference symbol
  offsets inside `libckemv_reporter.so` — those offsets are properties of
  the binary, not the host. They're correct on Mac too.
- The protocol spec, plan, tracker, todo, log — all the planning docs
  apply unchanged.
- The C2 IOCs, the deobfuscated tree, the threat-hunt pack — all carry.
- The mitmproxy CA hash will change because Mac regenerates a fresh CA;
  push the new `<hash>.0` to the device instead of `c8750f0d.0`.
