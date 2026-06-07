#!/usr/bin/env python3
"""Minimal ELF64 inspector — no external deps. Reads header, sections, dyn/symtab, rodata strings.

Usage: python elf_inspect.py <path.so> <command>
  command ∈ {header, sections, dynsym, symtab, needed, rodata, all, strings}
"""

import sys, struct, re

ELFCLASS64 = 2
SHT_SYMTAB = 2
SHT_STRTAB = 3
SHT_DYNSYM = 11
SHT_DYNAMIC = 6
DT_NEEDED = 1
STT = {0:"NOTYPE",1:"OBJECT",2:"FUNC",3:"SECTION",4:"FILE",5:"COMMON",6:"TLS"}
STB = {0:"LOCAL",1:"GLOBAL",2:"WEAK"}


def read_cstring(buf, off):
    end = buf.find(b"\x00", off)
    if end == -1:
        return ""
    try:
        return buf[off:end].decode("utf-8", errors="replace")
    except Exception:
        return ""


class Elf64:
    def __init__(self, path):
        with open(path, "rb") as f:
            self.data = f.read()
        d = self.data
        if d[:4] != b"\x7fELF":
            raise ValueError("not an ELF file")
        if d[4] != ELFCLASS64:
            raise ValueError("not ELF64")
        # ELF64 header (assuming little-endian, EV_CURRENT)
        (self.e_type, self.e_machine, self.e_version,
         self.e_entry, self.e_phoff, self.e_shoff,
         self.e_flags, self.e_ehsize, self.e_phentsize, self.e_phnum,
         self.e_shentsize, self.e_shnum, self.e_shstrndx) = struct.unpack_from(
            "<HHIQQQIHHHHHH", d, 0x10)
        self.sections = self._read_sections()

    def _read_sections(self):
        secs = []
        for i in range(self.e_shnum):
            off = self.e_shoff + i * self.e_shentsize
            (sh_name, sh_type, sh_flags, sh_addr, sh_offset, sh_size,
             sh_link, sh_info, sh_addralign, sh_entsize) = struct.unpack_from(
                "<IIQQQQIIQQ", self.data, off)
            secs.append(dict(idx=i, name_off=sh_name, type=sh_type, flags=sh_flags,
                             addr=sh_addr, offset=sh_offset, size=sh_size,
                             link=sh_link, info=sh_info, entsize=sh_entsize, name=""))
        # resolve names
        sh_strtab = secs[self.e_shstrndx]
        strbuf = self.data[sh_strtab["offset"]:sh_strtab["offset"]+sh_strtab["size"]]
        for s in secs:
            s["name"] = read_cstring(strbuf, s["name_off"])
        return secs

    def find_section(self, name):
        for s in self.sections:
            if s["name"] == name:
                return s
        return None

    def header(self):
        print(f"ELF64, type={self.e_type}, machine={self.e_machine} (AArch64=183), "
              f"entry=0x{self.e_entry:x}")
        print(f"  ph: off=0x{self.e_phoff:x} cnt={self.e_phnum} sz={self.e_phentsize}")
        print(f"  sh: off=0x{self.e_shoff:x} cnt={self.e_shnum} sz={self.e_shentsize} "
              f"strtabIdx={self.e_shstrndx}")

    def sections_print(self):
        print(f"{'idx':>3} {'name':<24} {'type':>6} {'addr':>10} {'offset':>10} {'size':>10}")
        for s in self.sections:
            print(f"{s['idx']:>3} {s['name']:<24} {s['type']:>6} 0x{s['addr']:08x} 0x{s['offset']:08x} {s['size']:>10}")

    def _read_symbols(self, sym_section_name, str_section_name):
        symsec = self.find_section(sym_section_name)
        if symsec is None:
            return []
        strsec = self.find_section(str_section_name)
        if strsec is None:
            return []
        strbuf = self.data[strsec["offset"]:strsec["offset"]+strsec["size"]]
        n = symsec["size"] // symsec["entsize"]
        out = []
        for i in range(n):
            o = symsec["offset"] + i * symsec["entsize"]
            (st_name, st_info, st_other, st_shndx, st_value, st_size) = struct.unpack_from(
                "<IBBHQQ", self.data, o)
            name = read_cstring(strbuf, st_name)
            bind = (st_info >> 4) & 0xf
            typ = st_info & 0xf
            out.append(dict(idx=i, name=name, bind=STB.get(bind, str(bind)),
                            type=STT.get(typ, str(typ)), shndx=st_shndx,
                            value=st_value, size=st_size))
        return out

    def dynsym(self):
        return self._read_symbols(".dynsym", ".dynstr")

    def symtab(self):
        return self._read_symbols(".symtab", ".strtab")

    def needed(self):
        dyn = self.find_section(".dynamic")
        if dyn is None:
            return []
        # Strings live in .dynstr
        dynstr = self.find_section(".dynstr")
        strbuf = self.data[dynstr["offset"]:dynstr["offset"]+dynstr["size"]]
        out = []
        i = 0
        while i < dyn["size"]:
            o = dyn["offset"] + i
            tag, val = struct.unpack_from("<qq", self.data, o)
            if tag == 0:
                break
            if tag == DT_NEEDED:
                out.append(read_cstring(strbuf, val))
            i += 16
        return out

    def rodata_strings(self, min_len=4):
        ro = self.find_section(".rodata")
        if ro is None:
            return []
        buf = self.data[ro["offset"]:ro["offset"]+ro["size"]]
        pat = re.compile(rb"[\x20-\x7e]{%d,}" % min_len)
        return [(ro["addr"] + m.start(), m.group().decode("ascii", "replace"))
                for m in pat.finditer(buf)]

    def strings_all(self, min_len=6):
        pat = re.compile(rb"[\x20-\x7e]{%d,}" % min_len)
        return [m.group().decode("ascii", "replace") for m in pat.finditer(self.data)]


def main():
    if len(sys.argv) < 3:
        print(__doc__)
        sys.exit(1)
    path, cmd = sys.argv[1], sys.argv[2]
    e = Elf64(path)
    if cmd == "header":
        e.header()
    elif cmd == "sections":
        e.sections_print()
    elif cmd == "needed":
        for n in e.needed():
            print(n)
    elif cmd == "dynsym":
        for s in e.dynsym():
            if s["name"]:
                print(f"{s['value']:>16x} {s['size']:>8} {s['type']:>6} {s['bind']:>6} {s['name']}")
    elif cmd == "symtab":
        for s in e.symtab():
            if s["name"] and s["type"] == "FUNC" and s["shndx"] != 0:
                print(f"{s['value']:>16x} {s['size']:>8} {s['bind']:>6} {s['name']}")
    elif cmd == "rodata":
        ml = int(sys.argv[3]) if len(sys.argv) >= 4 else 4
        for a, s in e.rodata_strings(ml):
            print(f"{a:08x} {s}")
    elif cmd == "strings":
        ml = int(sys.argv[3]) if len(sys.argv) >= 4 else 6
        for s in e.strings_all(ml):
            print(s)
    elif cmd == "all":
        e.header()
        print()
        e.sections_print()
        print()
        print("NEEDED:", e.needed())
    else:
        print("unknown cmd:", cmd)
        sys.exit(2)


if __name__ == "__main__":
    main()
