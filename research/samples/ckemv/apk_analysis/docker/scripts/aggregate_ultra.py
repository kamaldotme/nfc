#!/usr/bin/env python3
"""Aggregate Ghidra pseudo-C + radare2 metadata + rustfilt demangle + capstone refs.

Run from anywhere; outputs apk_analysis/CKEMV_ULTRA_DEEP_REPORT.md.
"""

import os
import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]  # apk_analysis/
DOUT = ROOT / "docker" / "out"
REPORT = ROOT / "CKEMV_ULTRA_DEEP_REPORT.md"


def rust_demangle(name: str) -> str:
    """Strip the trailing 17h<hex>E and decode escape sequences."""
    if not name.startswith("_ZN"):
        return name
    body = name[3:]
    if body.endswith("E"):
        body = body[:-1]
    parts, i = [], 0
    while i < len(body):
        j = i
        while j < len(body) and body[j].isdigit():
            j += 1
        if j == i:
            break
        n = int(body[i:j])
        parts.append(body[j:j + n])
        i = j + n
    if parts and parts[-1].startswith("h") and len(parts[-1]) == 17:
        parts = parts[:-1]
    out = "::".join(parts)
    return (out.replace("$LT$", "<").replace("$GT$", ">")
              .replace("$u20$", " ").replace("$u7b$", "{").replace("$u7d$", "}")
              .replace("$u27$", "'").replace("$RF$", "&").replace("$BP$", "*")
              .replace("$C$", ",").replace("..", "::"))


def load_capstone_funcs():
    """Returns {lib: {raw_name: record}} from capstone+lief output."""
    out = {}
    for lib, p in [("kernel", "kernel_functions.json"),
                   ("reporter", "reporter_functions.json")]:
        fp = ROOT / p
        if fp.exists():
            with fp.open(encoding="utf-8") as f:
                arr = json.load(f)
            out[lib] = {x["raw_name"]: x for x in arr}
    return out


def load_ghidra(lib):
    d = DOUT / "ghidra" / lib
    idx_p = d / "index.json"
    if not idx_p.exists():
        return [], {}
    with idx_p.open(encoding="utf-8") as f:
        idx = json.load(f)
    return idx, d


def read_ghidra_c(d: Path, fname: str):
    fp = d / fname
    if not fp.exists():
        return ""
    txt = fp.read_text(encoding="utf-8", errors="replace")
    # strip our header comment block
    return re.sub(r"^//.*\n", "", txt, flags=re.MULTILINE).lstrip()


def load_r2_meta(lib):
    d = DOUT / "rizin"
    out = {}
    for k in ("aflj", "izj", "iIj", "iSj"):
        fp = d / f"{lib}_{k}.json"
        if fp.exists() and fp.stat().st_size > 0:
            try:
                out[k] = json.loads(fp.read_text(encoding="utf-8"))
            except Exception as e:
                out[k] = None
    return out


def is_operator(name: str) -> bool:
    dem = rust_demangle(name) if name.startswith("_ZN") else name
    return bool(re.match(r"^(ckemv_(?:android|emv_kernel|core|reporter))\b|"
                         r"^_<ckemv_(?:android|emv_kernel|core|reporter)\b",
                         dem))


def fmt_csrc(csrc: str, max_chars: int = 10000) -> str:
    if len(csrc) > max_chars:
        return csrc[:max_chars] + "\n/* ... truncated for readability — see Ghidra output file for full body ... */"
    return csrc


def render():
    capstone = load_capstone_funcs()
    out = []
    out.append("# CKEMV-Harvester — ULTRA Deep Report\n")
    out.append("**Pipeline:** capstone+lief (Python) → rustfilt (Docker) → Ghidra headless (Docker) → radare2 (Docker).")
    out.append("All Docker activity isolated under compose project `ckemv-re` on bridge network `ckemv-re-net`.\n")
    out.append("**Sources merged here:**")
    out.append("- `docker/out/ghidra/{kernel,reporter}/*.c` — full pseudo-C decompilation of every operator function")
    out.append("- `docker/out/rust/*_demangled.txt` — rustfilt-canonical names for every symbol")
    out.append("- `docker/out/rizin/{kernel,reporter}_*.json` — radare2 function metadata, strings, sections")
    out.append("- `kernel_functions.json` / `reporter_functions.json` — capstone+lief disasm metadata (offset, size, instr count, calls, rodata refs)\n")
    out.append("---\n")

    for lib_label, lib_key in [("libckemv_android.so (Rust EMV kernel)", "kernel"),
                               ("libckemv_reporter.so (Rust C2 client)", "reporter")]:
        out.append(f"## {lib_label}\n")

        # ELF meta
        meta_p = ROOT / f"{lib_key}_elf_meta.json"
        if meta_p.exists():
            meta = json.loads(meta_p.read_text(encoding="utf-8"))
            out.append(f"- arch: `{meta['arch']}`  type: `{meta['type']}`  entry: `{meta['entry']}`")
            out.append(f"- NEEDED libs: `{', '.join(meta['needed'])}`")
            out.append(f"- sections: {len(meta['sections'])}  segments: {len(meta['segments'])}")
            out.append("")

        # r2 metadata
        r2 = load_r2_meta(lib_key)
        if "iIj" in r2 and r2["iIj"]:
            ii = r2["iIj"]
            try:
                bits = ii.get("bits"); arch = ii.get("arch")
                stripped = ii.get("stripped"); reloc = ii.get("relocs")
                out.append(f"- r2 binary info: arch={arch} bits={bits} stripped={stripped} relocs={reloc}")
                out.append(f"  - canary={ii.get('canary')} nx={ii.get('nx')} pic={ii.get('pic')} relro={ii.get('relro')}")
            except Exception:
                pass
            out.append("")
        if "aflj" in r2 and r2["aflj"]:
            af = r2["aflj"]
            out.append(f"- r2 function count: {len(af)}")
            sizes = [f.get("size", 0) for f in af]
            out.append(f"  - total text covered: {sum(sizes):,} bytes  largest fn: {max(sizes):,} bytes")
            out.append("")
        if "izj" in r2 and r2["izj"]:
            iz = r2["izj"]
            out.append(f"- r2 strings: {len(iz)}")
            out.append("")

        # Ghidra
        idx, gdir = load_ghidra(lib_key)
        op_idx = [e for e in idx if is_operator(e["name"])]
        op_idx.sort(key=lambda x: int(x["offset"], 16))
        out.append(f"### Operator-authored functions decompiled by Ghidra: **{len(op_idx)}**\n")

        for e in op_idx:
            raw = e["name"]
            dem = rust_demangle(raw) if raw.startswith("_ZN") else raw
            offhex = e["offset"]
            try:
                size = int(e.get("size", 0))
            except Exception:
                size = e.get("size", 0)

            # capstone cross-ref (offsets differ: Ghidra adds 0x100000 base)
            cap = None
            for k, v in capstone.get(lib_key, {}).items():
                if dem == v.get("name") or raw == k:
                    cap = v
                    break

            out.append(f"#### `{dem}`")
            out.append("")
            out.append(f"- Ghidra address: `{offhex}` ({size} bytes)  ·  mangled: `{raw}`")
            if e.get("signature"):
                out.append(f"- signature (Ghidra): `{e['signature']}`")
            if cap:
                out.append(f"- capstone offset: `0x{cap['offset']:x}`  instr: {cap['instr_count']}")
                if cap.get("calls"):
                    cset = []
                    seen = set()
                    for c in cap["calls"]:
                        cn = c.get("name") or f"@0x{c['tgt']:x}"
                        if cn in seen:
                            continue
                        seen.add(cn)
                        cset.append(cn)
                    out.append(f"- direct calls ({len(cset)}): " + ", ".join(f"`{c}`" for c in cset[:25]) + (" …" if len(cset) > 25 else ""))
                if cap.get("rodata_refs"):
                    seen = set()
                    unique_strs = []
                    for r in cap["rodata_refs"]:
                        s = r["s"]
                        if s in seen:
                            continue
                        seen.add(s)
                        # truncate
                        s_show = s if len(s) < 200 else s[:200] + "…"
                        unique_strs.append((r["addr"], s_show))
                    if unique_strs:
                        out.append(f"- referenced strings ({len(unique_strs)} unique):")
                        for a, s in unique_strs[:12]:
                            out.append(f"  - `0x{a:x}`: {json.dumps(s)}")
            if e.get("callees"):
                out.append(f"- Ghidra callees ({len(e['callees'])}): " + ", ".join(f"`{c}`" for c in e["callees"][:25]) + (" …" if len(e["callees"]) > 25 else ""))
            out.append("")
            out.append("**Ghidra pseudo-C:**")
            out.append("")
            csrc = read_ghidra_c(gdir, e["file"])
            out.append("```c")
            out.append(fmt_csrc(csrc).rstrip())
            out.append("```")
            out.append("")

    out.append("---\n")
    out.append("## Appendix — Artefacts on disk\n")
    out.append("Inside `apk_analysis/docker/out/`:\n")
    out.append("- `ghidra/kernel/` — Ghidra pseudo-C for every operator function in libckemv_android.so")
    out.append("- `ghidra/reporter/` — Ghidra pseudo-C for the 3 reporter operator functions")
    out.append("- `rizin/kernel_aflj.json`, `kernel_izj.json`, `kernel_iIj.json`, `kernel_iSj.json`, `kernel_callgraph.dot`")
    out.append("- `rizin/reporter_*.json` — same for the reporter")
    out.append("- `rust/{kernel,reporter}_symtab_demangled.txt` — rustfilt canonical symbol lists")
    out.append("- `rust/{kernel,reporter}_symtab_crate_counts.txt` — top-level crate occurrence counts")
    out.append("\nInside `apk_analysis/` itself:")
    out.append("- `kernel_functions.json`, `reporter_functions.json` — capstone+lief per-function metadata")
    out.append("- `{kernel,reporter}_elf_meta.json` — ELF header / sections / segments / dynamic entries")
    out.append("- `CKEMV_OSS_MODULE_INVENTORY.md` — open-source crate inventory with public GitHub URLs")
    out.append("- `CKEMV_NATIVE_FUNCTIONS_REPORT.md` — operator function narrative")
    out.append("- `CKEMV_CLASS_BY_CLASS_REPORT.md` — Java/Kotlin function walk")
    out.append("- `CKEMV_HARVESTER_ANALYSIS.md` — overall writeup")

    REPORT.write_text("\n".join(out), encoding="utf-8")
    print(f"wrote {REPORT}")


if __name__ == "__main__":
    render()
