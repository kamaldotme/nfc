#!/usr/bin/env python3
"""Extract operator-authored functions (ckemv_*) with strings + call lists."""

import json
import os
import re

ROOT = os.path.dirname(os.path.abspath(__file__))

OPERATOR_PATTERNS = re.compile(
    r"^(ckemv_android|ckemv_emv_kernel|ckemv_core|ckemv_reporter)\b|"
    r"^_<ckemv_(?:android|emv_kernel|core|reporter)\b"
)


def main():
    for prefix in ("kernel", "reporter"):
        with open(os.path.join(ROOT, f"{prefix}_functions.json"), encoding="utf-8") as f:
            funcs = json.load(f)
        op = [r for r in funcs if OPERATOR_PATTERNS.match(r["name"])]
        op.sort(key=lambda r: r["offset"])

        out = os.path.join(ROOT, f"{prefix}_operator_functions.md")
        with open(out, "w", encoding="utf-8") as f:
            f.write(f"# Operator-authored functions in {prefix}\n\n")
            f.write(f"Total: {len(op)}\n\n")
            for r in op:
                f.write(f"## `{r['name']}`\n")
                f.write(f"- offset: `0x{r['offset']:x}`  size: {r['size']} bytes  "
                        f"instr: {r['instr_count']}\n")
                if r["calls"]:
                    f.write(f"- calls ({r['call_count']}):\n")
                    seen = set()
                    for c in r["calls"]:
                        n = c.get("name") or f"@0x{c['tgt']:x}"
                        if n in seen:
                            continue
                        seen.add(n)
                        f.write(f"  - `{n}`\n")
                if r["rodata_refs"]:
                    f.write(f"- strings referenced ({r['rodata_ref_count']}):\n")
                    seen = set()
                    for s in r["rodata_refs"]:
                        txt = s["s"]
                        if txt in seen:
                            continue
                        seen.add(txt)
                        # truncate ultra-long strings
                        disp = txt if len(txt) <= 200 else txt[:200] + "…"
                        f.write(f"  - `0x{s['addr']:x}`: {json.dumps(disp)}\n")
                f.write("\n")
        print(f"wrote {out}: {len(op)} operator functions")


if __name__ == "__main__":
    main()
