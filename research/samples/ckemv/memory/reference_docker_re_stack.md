---
name: CKEMV Docker reverse-engineering stack
description: Isolated multi-container Ghidra/radare2/rustfilt pipeline at samples/ckemv/apk_analysis/docker/. Compose project ckemv-re. Run-recipe + known gotchas.
type: reference
originSessionId: 605f073d-ca80-4801-9e11-470b45734b88
---
Docker stack for deep RE of the CKEMV native libs lives at `samples/ckemv/apk_analysis/docker/`. **All containers + network are prefixed `ckemv-re-` so they never collide with the user's other 30+ running projects (shorts-*, usko-*, astra-*, etc.).**

### Services (defined in `docker/docker-compose.yml`)
- `ghidra-kernel` / `ghidra-reporter` — `blacktop/ghidra:latest` (headless analyzer, ~3 GB image)
- `radare2` — `radare/radare2:latest`
- `rust-tools` — built locally from `Dockerfile.rust-tools` (rust:1-slim + `cargo install rustfilt`)

### Run-recipe (from `samples/ckemv/apk_analysis/docker/`)
```sh
# Pull / build once
docker compose pull ghidra-kernel radare2
docker compose build rust-tools

# One-shot runs (all output to docker/out/)
MSYS_NO_PATHCONV=1 docker compose run --rm rust-tools          # ~30 sec — demangle every symtab
MSYS_NO_PATHCONV=1 docker compose run --rm ghidra-kernel       # ~3-5 min — full pseudo-C for kernel operator fns
MSYS_NO_PATHCONV=1 docker compose run --rm ghidra-reporter     # ~5-10 min — same for reporter
MSYS_NO_PATHCONV=1 docker compose run --rm radare2             # kernel metadata (~5 min); skip reporter (stalls on aaft)

# Aggregate everything → CKEMV_ULTRA_DEEP_REPORT.md
cd .. && python docker/scripts/aggregate_ultra.py
python docker/scripts/inject_toc.py
```

### Gotchas (each cost 5-15 min of debugging in the original session — don't re-discover)
- **`MSYS_NO_PATHCONV=1` is mandatory** when running docker from Git Bash on Windows — otherwise `/bin/sh` gets mangled to `C:/Program Files/Git/usr/bin/sh`.
- **Ghidra 11.x in `blacktop/ghidra:latest` has no Jython.** Write post-scripts in Java (not Python). Class name MUST match filename.
- **Ghidra ELF loader does NOT auto-promote LOCAL .symtab FUNC entries** to Function objects. The decompile script walks `SymbolTable.getDefinedSymbols()` + calls `createFunction(addr, name)` on demand — see `scripts/decompile_operator.java` v2.
- **`rizinorg/rizin` does not exist on Docker Hub.** Use `radare/radare2:latest` with `r2` CLI.
- **r2's `aaft` (type matching) hangs on big rustls-heavy binaries.** Stalls >15 min on the 3 MB reporter. Use plain `-A` (`aaa`), don't add `-AA` (`aaaa`).
- **r2 `s symbol; pdf` loop with `::` in symbol names is unreliable.** Stick to single-pass aflj/izj extraction; pull per-fn detail from Ghidra/capstone.

### Output locations (under `samples/ckemv/apk_analysis/docker/out/`)
- `ghidra/{kernel,reporter}/*.c` + `index.json` — per-function pseudo-C + manifest
- `rizin/{kernel,reporter}_{aflj,izj,iIj,iSj}.json` + `kernel_callgraph.dot`
- `rust/{kernel,reporter}_symtab_demangled.txt` + `*_pairs.tsv` + `*_crate_counts.txt`

### Final deliverable
`samples/ckemv/apk_analysis/CKEMV_ULTRA_DEEP_REPORT.md` (10,011 lines, 407 KB) — TOC + defender takeaways + Ghidra pseudo-C for every operator function + capstone metadata cross-refs. Regenerate with `aggregate_ultra.py` + `inject_toc.py`.
