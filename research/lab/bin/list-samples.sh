#!/usr/bin/env bash
# list-samples.sh — show sample workspaces, their AVD clones, and which are running.
set -euo pipefail
source "$(cd "$(dirname "$0")/.." && pwd)/config.sh"

running=$("$ADB" devices | grep emulator- | awk '{print $1}' || true)

printf '%-18s %-30s %-16s %-8s\n' "SAMPLE" "PACKAGE" "SERIAL" "STATE"
printf '%-18s %-30s %-16s %-8s\n' "------" "-------" "------" "-----"
for d in "$SAMPLES_DIR"/*/; do
  [ -d "$d" ] || continue
  name=$(basename "$d")
  env_file="$d/INSTANCE.env"
  pkg="-"; serial="-"
  if [ -f "$env_file" ]; then
    pkg=$(grep -E '^PACKAGE=' "$env_file" | cut -d= -f2)
    serial=$(grep -E '^SERIAL=' "$env_file" | cut -d= -f2)
  fi
  state="stopped"
  echo "$running" | grep -q "^$serial$" && state="RUNNING"
  printf '%-18s %-30s %-16s %-8s\n' "$name" "${pkg:--}" "${serial:--}" "$state"
done

echo
echo "Golden base AVD clones present:"
"$AVDMANAGER" list avd 2>/dev/null | grep -E "Name: (sample_|$BASE_AVD)" | sed 's/^/  /' || true
