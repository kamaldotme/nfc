#!/usr/bin/env bash
# build-base.sh — create and provision the GOLDEN BASE AVD.
#
# Produces a clean, rooted, arm64 emulator with frida-server staged and the
# mitmproxy CA installed in the system trust store. NEVER runs malware. Clones
# for individual samples are made from this with new-sample.sh.
#
# Idempotent: re-running re-provisions the existing base.
set -euo pipefail
source "$(cd "$(dirname "$0")/.." && pwd)/config.sh"

log "Golden base: $BASE_AVD  (image: $SYSIMG, port: $BASE_PORT)"

# 1) System image present?
if [ ! -f "$ANDROID_HOME/${SYSIMG//;//}/system.img" ]; then
  log "Installing system image $SYSIMG ..."
  yes | "$SDKMANAGER" --sdk_root="$ANDROID_HOME" "$SYSIMG" >/dev/null
fi

# 2) Create AVD if missing.
if ! "$AVDMANAGER" list avd 2>/dev/null | grep -q "Name: $BASE_AVD$"; then
  log "Creating AVD $BASE_AVD ..."
  echo "no" | "$AVDMANAGER" create avd -n "$BASE_AVD" -k "$SYSIMG" --device "$DEVICE_PROFILE" --force
else
  log "AVD $BASE_AVD already exists — re-provisioning."
fi

# 3) Boot it (writable-system so we can install the CA).
local_serial="emulator-$BASE_PORT"
log "Booting $BASE_AVD on $BASE_PORT (writable-system, cold) ..."
nohup "$EMULATOR" -avd "$BASE_AVD" -port "$BASE_PORT" \
  -no-snapshot-load -writable-system -no-boot-anim -gpu host \
  > "$LAB_ROOT/base-emulator.log" 2>&1 &
wait_boot "$local_serial"
log "Booted. Verifying arm64 + root ..."
"$ADB" -s "$local_serial" root >/dev/null 2>&1 || true
"$ADB" -s "$local_serial" wait-for-device
abi=$("$ADB" -s "$local_serial" shell getprop ro.product.cpu.abi | tr -d '\r')
who=$("$ADB" -s "$local_serial" shell whoami | tr -d '\r')
[ "$abi" = "arm64-v8a" ] || die "expected arm64-v8a, got $abi"
[ "$who" = "root" ] || die "adb root failed (whoami=$who) — is this a google_apis (non-Play) image?"
"$ADB" -s "$local_serial" remount >/dev/null 2>&1 || true

# 4) Provision: frida-server + mitmproxy CA + dev settings.
log "Staging frida-server ($FRIDA_VERSION) ..."
"$ADB" -s "$local_serial" push "$FRIDA_SERVER" "$FRIDA_SERVER_DEVPATH" >/dev/null
"$ADB" -s "$local_serial" shell chmod 755 "$FRIDA_SERVER_DEVPATH"

log "Installing mitmproxy CA into system trust store ..."
ca_hash=$(openssl x509 -inform PEM -subject_hash_old -in "$MITM_CA_PEM" | head -1)
"$ADB" -s "$local_serial" push "$MITM_CONFDIR/${ca_hash}.0" "/system/etc/security/cacerts/${ca_hash}.0" >/dev/null
"$ADB" -s "$local_serial" shell chmod 644 "/system/etc/security/cacerts/${ca_hash}.0"

log "Applying analysis dev settings ..."
for s in window_animation_scale transition_animation_scale animator_duration_scale; do
  "$ADB" -s "$local_serial" shell settings put global "$s" 0 >/dev/null 2>&1 || true
done
"$ADB" -s "$local_serial" shell settings put system screen_off_timeout 1800000 >/dev/null 2>&1 || true

# 5) Snapshot a clean golden state, then shut down cleanly.
log "Saving 'golden' snapshot ..."
"$ADB" -s "$local_serial" emu avd snapshot save golden >/dev/null 2>&1 || warn "snapshot save failed (non-fatal)"
log "Shutting base down ..."
"$ADB" -s "$local_serial" emu kill >/dev/null 2>&1 || true
sleep 3

log "Base ready. CA hash=${ca_hash}. Make per-sample clones with: lab/bin/new-sample.sh <name> <apk>"
