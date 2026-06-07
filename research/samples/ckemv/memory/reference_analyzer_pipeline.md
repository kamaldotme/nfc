---
name: CKEMV native analyzer pipeline on host
description: Python + capstone + lief disassembly pipeline is installed on the host. Reusable scripts live in samples/ckemv/apk_analysis/. Use these instead of re-doing ELF parsing by hand.
type: reference
originSessionId: 605f073d-ca80-4801-9e11-470b45734b88
---
The host (Windows 11, Python 3.14.4 at `C:\Users\mogli\AppData\Local\Python\pythoncore-3.14-64\python.exe`) has the following Python packages installed via `pip install --user`:

- `capstone 5.0.7` — ARM64 disassembly (`CS_ARCH_ARM64`, `CS_MODE_ARM`).
- `lief 0.17.6` — ELF parsing. **Note the API changed in 0.17**: `s.type.name == "FUNC"` (not `lief.ELF.SYMBOL_TYPES.FUNC`).

What's NOT on host: `rustfilt`, `readelf`, `objdump`, `nm`, Ghidra. A small hand-rolled Rust demangler is in `native_analyze.py` and handles the legacy v0-style names with hash suffixes (which is what this sample uses).

Reusable scripts under `samples/ckemv/apk_analysis/`:

- `elf_inspect.py` — no-deps ELF reader. Subcommands: `header`, `sections`, `dynsym`, `symtab`, `needed`, `rodata`, `strings`, `all`.
- `native_analyze.py <path.so> <out_prefix>` — full pipeline. Emits `<prefix>_functions.json` (per-function: offset, size, instr count, calls, rodata refs), `<prefix>_summary.txt` (crate-grouped), `<prefix>_obfstr_candidates.txt`, and for reporter-style libs `<prefix>_ca_anchors.txt`.
- `extract_operator.py` — filters `<prefix>_functions.json` to operator-authored crates and emits Markdown function-cards.

Rebuild outputs by re-running:
```
cd C:\Users\mogli\Desktop\Prj\Research\apk_analysis
python native_analyze.py res_only/resources/lib/arm64-v8a/libckemv_android.so kernel
python native_analyze.py res_only/resources/lib/arm64-v8a/libckemv_reporter.so reporter
python extract_operator.py
```

To push beyond what this pipeline produces (full pseudocode decompilation), the user would need to install **Ghidra** (free, https://ghidra-sre.org) or **Binary Ninja**. Not required for symbol+string+call-graph analysis.
