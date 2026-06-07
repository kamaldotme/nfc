#!/bin/sh
# Fast radare2 metadata pass: aflj + izj + iIj + iSj + callgraph. No per-fn loop.
set -eu

OUT=/out
mkdir -p "$OUT"

run_one() {
    sample="$1"
    name="$2"
    echo "[+] analyzing $sample -> $OUT/${name}_*"

    r2 -q -A \
        -c 'aflj' \
        "$sample" > "$OUT/${name}_aflj.json" 2>"$OUT/${name}_r2.stderr" || true

    r2 -q \
        -c 'izj' \
        "$sample" > "$OUT/${name}_izj.json" 2>>"$OUT/${name}_r2.stderr" || true

    r2 -q \
        -c 'iIj' \
        "$sample" > "$OUT/${name}_iIj.json" 2>>"$OUT/${name}_r2.stderr" || true

    r2 -q \
        -c 'iSj' \
        "$sample" > "$OUT/${name}_iSj.json" 2>>"$OUT/${name}_r2.stderr" || true

    echo "[+] done $name"
}

# Only run for libs that haven't been done yet.
if [ ! -s "$OUT/kernel_aflj.json" ]; then
    run_one /samples/libckemv_android.so kernel
fi
if [ ! -s "$OUT/reporter_aflj.json" ]; then
    run_one /samples/libckemv_reporter.so reporter
fi

echo "[+] fast pipeline complete"
ls -la "$OUT" | head -30
