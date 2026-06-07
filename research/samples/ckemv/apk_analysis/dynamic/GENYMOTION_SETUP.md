# Genymotion Setup — Path G

Why we're here: Path G chosen 2026-05-17. See
`DYNAMIC_ANALYSIS_TRACKER.md` §"Decision matrix" for the rejection reasons
for Paths A, B, C, F2, and the gadget-on-translation crash that killed
the prior approach. See `DYNAMIC_ANALYSIS_LOG.md` for the full timeline.

## What Genymotion gives us that the SDK emulator could not

Genymotion's `arm64-v8a` virtual devices run **real arm64 instructions
under QEMU TCG** — no `libndk_translation` shim, no x86→arm64 page-by-page
emulation, no Houdini. The frida runtime's signal handlers, stalker, and
JIT all see a normal arm64 CPU, so `frida-server-arm64` will attach
without the tombstone we hit under Pixel_7a translation.

Bonus: Genymotion personal devices boot **rooted by default**, which
collapses three things we were juggling:

- We can use the **original** harvester APK (no objection repack, no
  `lib/arm64-v8a` shuffling, no resigning).
- The mitmproxy CA goes into the **system** trust store
  (`/system/etc/security/cacerts/c8750f0d.0`) — no per-app NSC dance.
- `frida-server` runs as root and attaches to anything, including the
  Reporter's rustls call chain.

## Steps the *user* has to do (no automation possible — login + EULA)

1. **Free Genymotion account** — register at
   https://www.genymotion.com/account/ (email + password, no card).
2. **Download Genymotion Desktop Personal Edition** from
   https://www.genymotion.com/download/. Pick the *without VirtualBox*
   build (≈150 MB) — Hyper-V is the right backend on this host because
   Docker Desktop already owns Hyper-V and a parallel VirtualBox install
   would either fight for VT-x or run nested-and-slow.
3. **Install** with defaults; on first launch, **sign in** with the
   account from step 1.
4. **Backend selection** — Settings → "Default backend" → choose
   **Hyper-V** (or "Microsoft Hyper-V" depending on the build). Confirm
   any UAC prompts (Hyper-V backend needs to install a small helper).
5. **Tell me when the Genymotion main window is open and you've signed
   in.** I'll take over from there.

## What I'll do once Genymotion is up (automated via gmtool)

`gmtool` is Genymotion's CLI, installed alongside the desktop app at
`C:\Program Files\Genymobile\Genymotion\gmtool.exe`. From there:

```bash
# Find arm64 templates available
gmtool admin templates --arch=arm64

# Create our device (template name TBD after templates listing)
gmtool admin create "Custom Phone - 13.0 - API 33 - 1080x1920 (arm64)" CKEMV_ARM64_G

# Start it
gmtool admin start CKEMV_ARM64_G

# Adopt under the system adb so we can use the same scripts
adb connect 127.0.0.1:6555    # Genymotion's default adb port
adb devices
```

Then everything from `DYNAMIC_ANALYSIS_PLAN.md` §D2 onwards runs unchanged:
push frida-server, install CA, install harvester, attach Frida, capture
under mitmproxy, decode wire protocol, build local C2 mock.

## Notes / gotchas to expect

- The first boot of an arm64 device on x86 host is slow (QEMU TCG, no KVM
  acceleration). 1–2 minutes is normal.
- Once booted, ARM apps run at maybe 1/10 of a real Pixel's speed but
  fast enough for instrumented analysis.
- Genymotion's default adb port is **5555 + 1000 × instance_index** — the
  first device is on `127.0.0.1:6555`. The standalone `adb devices` will
  find it after `adb connect`.
- `adb root` works directly — Genymotion devices ship with root.
- If `adb root` returns "adbd cannot run as root in production builds",
  the device template was a "Production" flavor — recreate with a
  "Development" or "Custom" template.
- mitmproxy continues to listen on host port 8080. Genymotion devices see
  the host at `10.0.2.2` just like the SDK emulator.
