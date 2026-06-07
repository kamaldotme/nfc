#!/usr/bin/env bash
# lab/config.sh — shared environment for the Android malware-analysis lab.
# Source this from every lab script:  source "$(dirname "$0")/../config.sh"
#
# Single source of truth for paths, the golden-base AVD name, the system image,
# and the pinned Frida version. Override any value by exporting it before
# sourcing (e.g. BASE_AVD=Foo source config.sh).

set -euo pipefail

# --- Android SDK -----------------------------------------------------------
export ANDROID_HOME="${ANDROID_HOME:-$HOME/Library/Android/sdk}"
export ANDROID_SDK_ROOT="$ANDROID_HOME"

ADB="$ANDROID_HOME/platform-tools/adb"
EMULATOR="$ANDROID_HOME/emulator/emulator"
# Use the in-SDK cmdline-tools (the brew copy mis-resolves the SDK root).
AVDMANAGER="$ANDROID_HOME/cmdline-tools/latest/bin/avdmanager"
SDKMANAGER="$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager"
AVD_HOME="${ANDROID_AVD_HOME:-$HOME/.android/avd}"

# --- Lab layout ------------------------------------------------------------
LAB_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]:-$0}")" && pwd)"
REPO_ROOT="$(cd "$LAB_ROOT/.." && pwd)"
SAMPLES_DIR="$REPO_ROOT/samples"
TEMPLATE_DIR="$LAB_ROOT/templates/sample"
HOOKS_DIR="$LAB_ROOT/hooks"
DRIVER="$LAB_ROOT/driver/driver.py"
MOCK="$LAB_ROOT/mock/http_mock.py"
VENV="$LAB_ROOT/.venv"

# --- Golden base + system image -------------------------------------------
BASE_AVD="${BASE_AVD:-MalLab-Base}"
SYSIMG="${SYSIMG:-system-images;android-33;google_apis;arm64-v8a}"
DEVICE_PROFILE="${DEVICE_PROFILE:-pixel}"

# --- Frida (pinned: 17 removed the Java bridge the hooks rely on) ----------
FRIDA_VERSION="${FRIDA_VERSION:-16.7.19}"
FRIDA_SERVER="$LAB_ROOT/tools/frida-server-arm64-$FRIDA_VERSION"
FRIDA_SERVER_DEVPATH="/data/local/tmp/frida-server"

# --- mitmproxy CA (shared across instances) -------------------------------
MITM_CONFDIR="$LAB_ROOT/mitmproxy"
MITM_CA_PEM="$MITM_CONFDIR/mitmproxy-ca-cert.pem"

# --- Ports -----------------------------------------------------------------
# Base builds on 5554; samples get the next free even console port >= 5556.
BASE_PORT="${BASE_PORT:-5554}"
SAMPLE_PORT_START="${SAMPLE_PORT_START:-5556}"

# --- Helpers ---------------------------------------------------------------
log()  { printf '\033[1;36m[lab]\033[0m %s\n' "$*" >&2; }
warn() { printf '\033[1;33m[lab:warn]\033[0m %s\n' "$*" >&2; }
die()  { printf '\033[1;31m[lab:err]\033[0m %s\n' "$*" >&2; exit 1; }

# Activate the lab venv (frida client, mitmproxy) if present.
activate_venv() { [ -f "$VENV/bin/activate" ] && source "$VENV/bin/activate" || true; }

# adb against a specific serial: adb_s emulator-5556 shell ...
adb_s() { local serial="$1"; shift; "$ADB" -s "$serial" "$@"; }

# Wait until a given emulator serial reports boot complete.
wait_boot() {
  local serial="$1"
  "$ADB" -s "$serial" wait-for-device
  until [ "$("$ADB" -s "$serial" shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')" = "1" ]; do
    sleep 3
  done
}

# First free even console port >= SAMPLE_PORT_START not already an emulator.
free_port() {
  local p="$SAMPLE_PORT_START"
  while "$ADB" devices | grep -q "emulator-$p"; do p=$((p + 2)); done
  echo "$p"
}

# Start frida-server on a serial (default listen — do NOT pass -l, it breaks
# the adb-forward attach transport). Idempotent: kills stale instances first.
start_frida() {
  local serial="$1"
  "$ADB" -s "$serial" shell "pkill -9 frida-server 2>/dev/null; pkill -9 -f frida-server 2>/dev/null" >/dev/null 2>&1 || true
  "$ADB" -s "$serial" shell "nohup $FRIDA_SERVER_DEVPATH >/dev/null 2>&1 &" >/dev/null 2>&1 || true
  sleep 3
}

# Confirm the host frida client can reach the device server (pidof is unreliable
# because frida-server daemonizes under a cleared comm). Returns 0 if reachable.
frida_up() {
  local serial="$1"
  ( activate_venv; python - "$serial" <<'PY' >/dev/null 2>&1
import sys, frida
frida.get_device(sys.argv[1]).enumerate_processes()
PY
  )
}

# Provision an instance for analysis: root, remount, frida-server staged,
# mitmproxy CA trusted, SELinux permissive (helps frida inject), dev settings,
# and an EGRESS LOCKDOWN so the sample can only reach the host (10.0.2.0/24) and
# never the real internet. Idempotent.
provision_instance() {
  local serial="$1"
  "$ADB" -s "$serial" root >/dev/null 2>&1 || true
  "$ADB" -s "$serial" wait-for-device
  "$ADB" -s "$serial" remount >/dev/null 2>&1 || true

  # frida-server
  if ! "$ADB" -s "$serial" shell "[ -f $FRIDA_SERVER_DEVPATH ] && echo y" | grep -q y; then
    "$ADB" -s "$serial" push "$FRIDA_SERVER" "$FRIDA_SERVER_DEVPATH" >/dev/null
    "$ADB" -s "$serial" shell chmod 755 "$FRIDA_SERVER_DEVPATH"
  fi
  # mitmproxy CA
  local ca_hash; ca_hash=$(openssl x509 -inform PEM -subject_hash_old -in "$MITM_CA_PEM" | head -1)
  if ! "$ADB" -s "$serial" shell "[ -f /system/etc/security/cacerts/${ca_hash}.0 ] && echo y" | grep -q y; then
    "$ADB" -s "$serial" push "$MITM_CONFDIR/${ca_hash}.0" "/system/etc/security/cacerts/${ca_hash}.0" >/dev/null
    "$ADB" -s "$serial" shell chmod 644 "/system/etc/security/cacerts/${ca_hash}.0"
  fi
  # NOTE: do NOT setenforce 0 — permissive makes zygote's
  # selinux_android_setcontext fail and the target app SIGABRTs on launch.
  # Frida attach works fine under enforcing on these images.
  # Dev settings
  for s in window_animation_scale transition_animation_scale animator_duration_scale; do
    "$ADB" -s "$serial" shell settings put global "$s" 0 >/dev/null 2>&1 || true
  done
  "$ADB" -s "$serial" shell settings put system screen_off_timeout 1800000 >/dev/null 2>&1 || true
  # Egress lockdown: only loopback + emulator host net; reject the real internet.
  "$ADB" -s "$serial" shell "
    iptables -D OUTPUT -j REJECT 2>/dev/null
    iptables -C OUTPUT -o lo -j ACCEPT 2>/dev/null || iptables -I OUTPUT 1 -o lo -j ACCEPT
    iptables -C OUTPUT -d 10.0.2.0/24 -j ACCEPT 2>/dev/null || iptables -I OUTPUT 2 -d 10.0.2.0/24 -j ACCEPT
    iptables -A OUTPUT -j REJECT
    ip6tables -A OUTPUT -j REJECT 2>/dev/null
  " >/dev/null 2>&1 || true
}

# Sinkhole a specific host on-device (belt-and-suspenders with egress lockdown).
sinkhole_host() {
  local serial="$1" host="$2"
  "$ADB" -s "$serial" remount >/dev/null 2>&1 || true
  "$ADB" -s "$serial" shell "grep -q ' $host\$' /system/etc/hosts || echo '127.0.0.1 $host' >> /system/etc/hosts" >/dev/null 2>&1 || true
}
