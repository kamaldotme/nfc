#!/usr/bin/env python3
"""native_analyze.py — deep static analyzer for the ckemv .so files.

Uses lief for ELF parsing and capstone for ARM64 disassembly.

Outputs JSON-per-function and a human-readable summary for each lib:
  apk_analysis/<lib>_functions.json     — every defined func: offset, size, instr count,
                                          called fns (resolved), rodata strings referenced
  apk_analysis/<lib>_summary.txt        — module-grouped human-readable summary
  apk_analysis/<lib>_ca_anchors.txt     — DER trust anchor enumeration (reporter only is useful)
  apk_analysis/<lib>_obfstr_candidates.txt — likely obfstr-style XOR'd blobs in rodata

Run:
  python native_analyze.py <path.so> <out_prefix>
"""

import sys
import os
import json
import re
import struct

import lief
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM, CS_OP_IMM, CS_OP_REG


ROOT = os.path.dirname(os.path.abspath(__file__))


# ---------- Rust demangler (legacy v0/v1 hash-suffix scheme) ----------

def rust_demangle(name: str) -> str:
    """Strip the trailing 17h<hex>E + clean $LT$/$GT$/$u20$ etc."""
    if not name.startswith("_ZN"):
        return name
    # find trailing 17h…E
    s = name
    # strip leading _ZN and trailing E
    body = s[3:]
    if body.endswith("E"):
        body = body[:-1]
    # split length-prefixed components
    parts = []
    i = 0
    while i < len(body):
        j = i
        while j < len(body) and body[j].isdigit():
            j += 1
        if j == i:
            break
        n = int(body[i:j])
        comp = body[j:j + n]
        parts.append(comp)
        i = j + n
    # last part is usually 17h<hex>
    if parts and parts[-1].startswith("h") and len(parts[-1]) == 17:
        parts = parts[:-1]
    out = "::".join(parts)
    out = (out.replace("$LT$", "<").replace("$GT$", ">")
              .replace("$u20$", " ").replace("$u27$", "'")
              .replace("$u7b$", "{").replace("$u7d$", "}")
              .replace("$RF$", "&").replace("$BP$", "*")
              .replace("$C$", ",").replace("..", "::"))
    return out


# ---------- ELF helpers via lief ----------

def load_elf(path):
    return lief.parse(path)


def text_section(b):
    for s in b.sections:
        if s.name == ".text":
            return s
    return None


def rodata_section(b):
    for s in b.sections:
        if s.name == ".rodata":
            return s
    return None


def find_func_symbols(b):
    """All FUNC symbols with nonzero size, grouped by virtual address."""
    seen = {}
    # Prefer symtab (full); fall back to dynsym
    syms = list(b.symbols)  # union dynsym+symtab in lief
    for s in syms:
        try:
            tname = s.type.name
        except AttributeError:
            tname = str(s.type)
        if tname == "FUNC" and s.size > 0:
            if s.value not in seen:
                seen[s.value] = s
    return seen


def read_va_range(b, va, n):
    """Read n bytes starting at virtual address va."""
    # lief offers get_content_from_virtual_address
    try:
        data = bytes(b.get_content_from_virtual_address(va, n))
        return data
    except Exception:
        return b""


def rodata_string_at(b, va):
    """If va points into .rodata and a printable C-string starts there, return it."""
    ro = rodata_section(b)
    if ro is None:
        return None
    if not (ro.virtual_address <= va < ro.virtual_address + ro.size):
        return None
    off = va - ro.virtual_address
    raw = bytes(ro.content)
    end = raw.find(b"\x00", off)
    if end == -1:
        end = min(off + 256, len(raw))
    s = raw[off:end]
    if not s:
        return None
    try:
        d = s.decode("utf-8")
    except Exception:
        return None
    # only return if it's printable enough (heuristic)
    printable = sum(1 for c in s if 0x20 <= c < 0x7f or c in (9, 10, 13))
    if len(s) >= 4 and printable / max(1, len(s)) > 0.85:
        return d
    return None


def rodata_strings_dump(b, min_len=4):
    ro = rodata_section(b)
    if ro is None:
        return []
    raw = bytes(ro.content)
    pat = re.compile(rb"[\x09\x0a\x0d\x20-\x7e]{%d,}" % min_len)
    out = []
    for m in pat.finditer(raw):
        out.append((ro.virtual_address + m.start(), m.group().decode("ascii", "replace")))
    return out


# ---------- ARM64 instruction walker ----------

def make_disasm():
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True
    return md


def analyze_function(b, sym, syms_by_addr, md):
    """Disassemble a function and extract calls + rodata refs."""
    va = sym.value
    size = sym.size
    data = read_va_range(b, va, size)
    if not data or len(data) < 4:
        return None
    insns = list(md.disasm(data, va))
    calls = []
    rodata_refs = []
    # ADRP + ADD pair tracker by register
    adrp_state = {}  # reg -> page va
    for ins in insns:
        m = ins.mnemonic
        if m in ("bl", "b"):
            # branch target operand
            try:
                if ins.operands and ins.operands[0].type == CS_OP_IMM:
                    tgt = ins.operands[0].imm
                    sym_t = syms_by_addr.get(tgt)
                    name = rust_demangle(sym_t.name) if sym_t else None
                    if m == "bl":
                        calls.append((tgt, name))
                    # we don't track plain `b` as calls (jumps)
            except Exception:
                pass
        elif m == "adrp":
            try:
                rd = ins.operands[0].reg
                imm = ins.operands[1].imm
                adrp_state[rd] = imm
            except Exception:
                pass
        elif m in ("add", "ldr", "ldrb", "ldrh", "ldrsb", "ldrsh", "ldrsw"):
            # ADD x,xN,#imm  OR  LDR x,[xN,#imm]  paired with prior ADRP on xN
            try:
                ops = ins.operands
                if m == "add" and len(ops) == 3 and ops[1].type == CS_OP_REG and ops[2].type == CS_OP_IMM:
                    base = ops[1].reg
                    if base in adrp_state:
                        addr = adrp_state[base] + ops[2].imm
                        s = rodata_string_at(b, addr)
                        if s:
                            rodata_refs.append((addr, s))
                elif m.startswith("ldr"):
                    # ldr Rt, [Rn, #imm] -> ops[1] is memory operand with base + disp
                    if len(ops) >= 2 and ops[1].type == 3:  # CS_OP_MEM = 3
                        base = ops[1].mem.base
                        disp = ops[1].mem.disp
                        if base in adrp_state:
                            addr = adrp_state[base] + disp
                            s = rodata_string_at(b, addr)
                            if s:
                                rodata_refs.append((addr, s))
            except Exception:
                pass
    return dict(
        name=rust_demangle(sym.name),
        raw_name=sym.name,
        offset=va,
        size=size,
        instr_count=len(insns),
        calls=[dict(tgt=t, name=n) for t, n in calls[:64]],
        call_count=len(calls),
        rodata_refs=[dict(addr=a, s=s) for a, s in rodata_refs[:32]],
        rodata_ref_count=len(rodata_refs),
    )


# ---------- module grouping ----------

def top_module(name: str) -> str:
    """Return the top-level Rust crate path for grouping."""
    dem = name
    if "::" in dem:
        return dem.split("::", 1)[0]
    return dem


# ---------- CA anchor enumeration ----------

def enumerate_ca_anchors(b):
    """Scan .rodata for sequences of DER certs / trust-anchor records.

    Rustls trust anchors are usually OwnedTrustAnchor structs: subject DN bytes,
    SPKI bytes, name_constraints bytes — each preceded by a length and a pointer.
    Simpler heuristic: count distinct DER SEQUENCEs (0x30 0x82 LL LL ...) in rodata
    whose payload looks like an X.509 SPKI or DN.
    """
    ro = rodata_section(b)
    if ro is None:
        return []
    raw = bytes(ro.content)
    hits = []
    i = 0
    while i < len(raw) - 4:
        if raw[i] == 0x30 and raw[i + 1] == 0x82:
            ln = (raw[i + 2] << 8) | raw[i + 3]
            if 40 <= ln <= 4096 and i + 4 + ln <= len(raw):
                # Heuristic: inside the SEQUENCE we expect OIDs (0x06 ...) and SET (0x31)
                blob = raw[i + 4:i + 4 + ln]
                if blob.count(b"\x06\x03") >= 2 or b"\x06\x09" in blob:
                    hits.append((ro.virtual_address + i, ln))
                    i += 4 + ln
                    continue
        i += 1
    return hits


# ---------- obfstr candidate detection ----------

def obfstr_candidates(b):
    """Find runs of bytes in .rodata that look like XOR-obfuscated short strings.

    Heuristic: a tight blob (4..64 bytes) of mid-entropy bytes not printable as text,
    flanked by zero bytes and referenced by an ADRP+ADD elsewhere.
    """
    ro = rodata_section(b)
    if ro is None:
        return []
    raw = bytes(ro.content)
    candidates = []
    i = 0
    while i < len(raw):
        # skip nulls
        while i < len(raw) and raw[i] == 0:
            i += 1
        j = i
        while j < len(raw) and raw[j] != 0:
            j += 1
        blob = raw[i:j]
        if 4 <= len(blob) <= 64:
            printable = sum(1 for c in blob if 0x20 <= c < 0x7f)
            if printable / len(blob) < 0.5:
                # non-printable, suspicious
                # entropy lower bound: at least 4 distinct bytes
                if len(set(blob)) >= 4:
                    candidates.append((ro.virtual_address + i, blob.hex()))
        i = j + 1
    return candidates


# ---------- main ----------

def main():
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    path = sys.argv[1]
    prefix = sys.argv[2]
    b = load_elf(path)
    if b is None:
        print("failed to load", path)
        sys.exit(2)

    md = make_disasm()
    syms = find_func_symbols(b)

    print(f"[+] {os.path.basename(path)}: {len(syms)} defined FUNC symbols")

    funcs = []
    for va, sym in sorted(syms.items()):
        r = analyze_function(b, sym, syms, md)
        if r:
            funcs.append(r)

    print(f"[+] disassembled {len(funcs)} functions")

    out_json = os.path.join(ROOT, f"{prefix}_functions.json")
    with open(out_json, "w", encoding="utf-8") as f:
        json.dump(funcs, f, indent=2)
    print(f"[+] wrote {out_json}")

    # Group by top-level module
    groups = {}
    for r in funcs:
        top = top_module(r["name"])
        groups.setdefault(top, []).append(r)

    out_sum = os.path.join(ROOT, f"{prefix}_summary.txt")
    with open(out_sum, "w", encoding="utf-8") as f:
        f.write(f"=== {os.path.basename(path)} — function inventory grouped by crate ===\n\n")
        for crate in sorted(groups, key=lambda k: (-len(groups[k]), k)):
            fns = groups[crate]
            total_size = sum(x["size"] for x in fns)
            f.write(f"## {crate}  ({len(fns)} fns, {total_size} bytes)\n")
            for r in sorted(fns, key=lambda x: x["offset"]):
                f.write(f"  0x{r['offset']:08x}  {r['size']:>6}b  i={r['instr_count']:>4}  c={r['call_count']:>3}  s={r['rodata_ref_count']:>3}  {r['name']}\n")
            f.write("\n")
    print(f"[+] wrote {out_sum}")

    if "reporter" in prefix.lower():
        anchors = enumerate_ca_anchors(b)
        out_ca = os.path.join(ROOT, f"{prefix}_ca_anchors.txt")
        with open(out_ca, "w", encoding="utf-8") as f:
            f.write(f"DER SEQUENCE candidates in .rodata: {len(anchors)}\n")
            for a, ln in anchors[:300]:
                f.write(f"  0x{a:08x}  len={ln}\n")
        print(f"[+] wrote {out_ca}: {len(anchors)} candidates")

    obfs = obfstr_candidates(b)
    out_obf = os.path.join(ROOT, f"{prefix}_obfstr_candidates.txt")
    with open(out_obf, "w", encoding="utf-8") as f:
        f.write(f"obfstr-style XOR-blob candidates in .rodata: {len(obfs)}\n")
        for a, hx in obfs[:500]:
            f.write(f"  0x{a:08x}  {hx}\n")
    print(f"[+] wrote {out_obf}: {len(obfs)} candidates")


if __name__ == "__main__":
    main()
