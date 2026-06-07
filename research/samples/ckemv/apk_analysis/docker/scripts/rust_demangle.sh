#!/bin/bash
# Demangle every Rust symbol with rustfilt.
set -euo pipefail

OUT=/out
mkdir -p "$OUT"

for src in /in/kernel_symtab.txt /in/reporter_symtab.txt; do
    base=$(basename "$src" .txt)
    echo "[+] demangling $src"
    # Extract just the symbol name column (last word on each line) and feed to rustfilt
    awk '{print $NF}' "$src" > "$OUT/${base}_raw.txt"
    rustfilt < "$OUT/${base}_raw.txt" > "$OUT/${base}_demangled.txt"
    # Also produce a side-by-side
    paste "$OUT/${base}_raw.txt" "$OUT/${base}_demangled.txt" > "$OUT/${base}_pairs.tsv"
    echo "[+] $OUT/${base}_demangled.txt"
done

# Quick crate-level summary
for src in /in/kernel_symtab.txt /in/reporter_symtab.txt; do
    base=$(basename "$src" .txt)
    awk '{print $NF}' "$src" | rustfilt \
        | sed -E 's/::.*//; s/^_<//; s/[ <>(){}].*//' \
        | sort | uniq -c | sort -rn > "$OUT/${base}_crate_counts.txt"
done

ls -la "$OUT"
echo "[+] done"
