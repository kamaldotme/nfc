#!/bin/sh
# radare2 analysis of both .so files. Single-pass per binary — all artefacts in one r2 invocation.
set -eu

OUT=/out
mkdir -p "$OUT"

run_one() {
    sample="$1"
    name="$2"
    echo "[+] analyzing $sample -> $OUT/${name}_*"

    # Build a single command script for r2 that:
    #   - runs analysis (aaaa is deepest, but slow on big bins; use aaa)
    #   - dumps function list, strings, imports, sections (JSON)
    #   - dumps callgraph DOT
    #   - for every fn whose name contains 'ckemv', dumps pdfj (disasm JSON) + axt + axf
    cmd_file=$(mktemp)
    cat > "$cmd_file" <<EOF
aaa
e scr.color=0
e scr.utf8=0
e anal.depth=64
aflj > $OUT/${name}_aflj.json
izj > $OUT/${name}_izj.json
iIj > $OUT/${name}_iIj.json
iSj > $OUT/${name}_iSj.json
isj > $OUT/${name}_isj.json
agCd > $OUT/${name}_callgraph.dot
% mkdir -p $OUT/per_fn
% echo '{"functions":[' > $OUT/${name}_per_fn.json
.(emit_per_fn)
EOF

    # define the emit_per_fn macro inline via -e or use the simpler approach: list, then per-fn pdf
    # Simpler: just loop using shell over function names from aflj output post-run.

    r2 -q -i "$cmd_file" "$sample" 2>"$OUT/${name}_r2.stderr" || true
    rm -f "$cmd_file"

    # Now do per-operator-fn dump using ONE additional r2 session that uses .--/.--
    # Extract operator function names from aflj output via python
    python3 - <<PY > "$OUT/${name}_op_fn_names.txt" 2>/dev/null
import json, sys
try:
    fns = json.load(open("$OUT/${name}_aflj.json"))
    for fn in fns:
        n = fn.get("name","")
        if "ckemv" in n:
            print(n)
except Exception as e:
    sys.stderr.write(f"parse err: {e}\n")
PY
    n_op=$(wc -l < "$OUT/${name}_op_fn_names.txt" || echo 0)
    echo "[+] operator fns to dump for $name: $n_op"

    # Build one big command script that does all operator-fn dumps inside one r2 session
    cmd_file=$(mktemp)
    echo 'aaa' > "$cmd_file"
    echo 'e scr.color=0' >> "$cmd_file"
    : > "$OUT/${name}_per_fn.txt"
    while IFS= read -r fn; do
        echo "===== FN $fn =====" >> "$OUT/${name}_per_fn.txt"
        echo "echo ===== FN $fn =====" >> "$cmd_file"
        echo "s $fn" >> "$cmd_file"
        echo "pdf" >> "$cmd_file"
        echo "echo --- XREFS TO ---" >> "$cmd_file"
        echo "axt" >> "$cmd_file"
        echo "echo --- XREFS FROM ---" >> "$cmd_file"
        echo "axf" >> "$cmd_file"
    done < "$OUT/${name}_op_fn_names.txt"

    r2 -q -i "$cmd_file" "$sample" >> "$OUT/${name}_per_fn.txt" 2>>"$OUT/${name}_r2.stderr" || true
    rm -f "$cmd_file"

    echo "[+] done $name"
}

run_one /samples/libckemv_android.so kernel
run_one /samples/libckemv_reporter.so reporter

echo "[+] radare2 pipeline complete"
ls -la "$OUT"
