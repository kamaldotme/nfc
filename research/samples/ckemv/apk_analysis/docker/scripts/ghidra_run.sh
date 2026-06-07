#!/bin/bash
# Wrapper for headless Ghidra analysis.
# Inputs (env): SAMPLE, GHIDRA_OUT, PROJECT_NAME, GHIDRA_FILTER
set -euo pipefail

: "${SAMPLE:?SAMPLE not set}"
: "${GHIDRA_OUT:?GHIDRA_OUT not set}"
: "${PROJECT_NAME:?PROJECT_NAME not set}"

mkdir -p "$GHIDRA_OUT"

# Locate analyzeHeadless. blacktop/ghidra puts Ghidra under /ghidra
HEADLESS=""
for cand in /ghidra/support/analyzeHeadless /opt/ghidra/support/analyzeHeadless /usr/local/ghidra/support/analyzeHeadless; do
    if [ -x "$cand" ]; then
        HEADLESS="$cand"; break
    fi
done
if [ -z "$HEADLESS" ]; then
    HEADLESS=$(command -v analyzeHeadless || true)
fi
if [ -z "$HEADLESS" ]; then
    echo "[!] Cannot find analyzeHeadless. Searching..."
    find / -name analyzeHeadless 2>/dev/null | head -5
    exit 2
fi

echo "[+] Using $HEADLESS"
echo "[+] Sample: $SAMPLE"
echo "[+] Output: $GHIDRA_OUT"
echo "[+] Project: $PROJECT_NAME"

PROJ_DIR=$(mktemp -d)
trap 'rm -rf "$PROJ_DIR"' EXIT

# Headless: import, run script, delete project after
"$HEADLESS" \
    "$PROJ_DIR" "$PROJECT_NAME" \
    -import "$SAMPLE" \
    -scriptPath /scripts \
    -postScript decompile_operator.java \
    -deleteProject \
    -overwrite \
    -log "$GHIDRA_OUT/headless.log" \
    2>&1 | tee "$GHIDRA_OUT/headless.stdout.log"

echo "[+] Ghidra headless complete. Output:"
ls -la "$GHIDRA_OUT"
