#!/usr/bin/env bash
# teardown-sample.sh <name> [--keep-workspace] — kill the instance + delete the AVD clone.
# By default keeps samples/<name>/ (your findings); pass --purge to delete it too.
set -euo pipefail
source "$(cd "$(dirname "$0")/.." && pwd)/config.sh"

[ $# -ge 1 ] || die "usage: teardown-sample.sh <name> [--purge]"
name="$(echo "$1" | tr -cd 'A-Za-z0-9_-')"; shift || true
purge="${1:-}"
clone="sample_${name}"

# Find the running serial for this clone (if any) and kill it.
env_file="$SAMPLES_DIR/$name/INSTANCE.env"
serial=""
[ -f "$env_file" ] && serial=$(grep -E '^SERIAL=' "$env_file" | cut -d= -f2 || true)
if [ -n "$serial" ] && "$ADB" devices | grep -q "$serial"; then
  log "Killing $serial ..."
  "$ADB" -s "$serial" emu kill >/dev/null 2>&1 || true
  sleep 2
fi

log "Deleting AVD clone $clone ..."
"$AVDMANAGER" delete avd -n "$clone" >/dev/null 2>&1 || rm -rf "$AVD_HOME/$clone.avd" "$AVD_HOME/$clone.ini"
rm -f "$SAMPLES_DIR/.$clone.emulator.log" 2>/dev/null || true

if [ "$purge" = "--purge" ]; then
  warn "Purging workspace samples/$name ..."
  rm -rf "$SAMPLES_DIR/$name"
else
  log "Workspace samples/$name kept (use --purge to delete)."
fi
log "Teardown complete for '$name'."
