#!/usr/bin/env python3
"""Inject a TOC and defender takeaways into CKEMV_ULTRA_DEEP_REPORT.md."""
import re
import sys
import os

ROOT = os.path.abspath(os.path.join(os.path.dirname(__file__), "..", ".."))
p = os.path.join(ROOT, "CKEMV_ULTRA_DEEP_REPORT.md")

with open(p, encoding="utf-8") as f:
    txt = f.read()

# Build TOC from #### headings + their containing ## lib section
lines = txt.splitlines()
current_lib = None
seen = []
for ln in lines:
    if ln.startswith("## libckemv_android"):
        current_lib = "kernel"
    elif ln.startswith("## libckemv_reporter"):
        current_lib = "reporter"
    m = re.match(r"^#### `(.+?)`", ln)
    if m:
        seen.append((m.group(1), current_lib))

toc = ["## Index of operator functions (in disasm order)", ""]
toc.append("| # | Function | Library |")
toc.append("| - | -------- | ------- |")
for idx, (n, lib) in enumerate(seen, 1):
    safe = n.replace("|", "\\|")
    toc.append(f"| {idx} | `{safe}` | {lib} |")
toc_text = "\n".join(toc) + "\n\n"

defender = """## Defender takeaways extracted from the ULTRA pass

1. **obfstr XOR keys are now in the open.** The Ghidra pseudo-C below exposes the 64-bit XOR keys the operator used with the `obfstr` crate. For example, in `ckemv_reporter::native_fetch_report`, a string literal is XOR-decoded with keys `0x49d236de9c7f6dfe`, `0x88b5538cb0339327`, `0xde9c55b27a5c9f2e`, plus single-byte keys `0x1a`, `0x47`, `0xcb`. These are *per-call-site* constants — apply them to the byte ranges referenced by the preceding ADRP+ADD pair to recover the plaintext header / path strings.
2. **Every JNI return goes through `JNIEnv::new_string`** (after which the Java side reads it). A single Frida hook on this call dumps every harvested value as it leaves the native side.
3. **`obfstr::xref::inner` is the universal deobfuscation gateway.** Every operator function in the reporter calls into it before reading any header / URL literal. A single breakpoint on `obfstr::xref::inner` returns the deobfuscated bytes in memory — defender-side dynamic-analysis path.
4. **`ureq::request::Request::set` is called once per header.** The first arg is the header *name* (length-prefixed). In `native_upload_harvest_data` we see set called with byte-lengths 13 (Authorization) and 16 (Content-Type) — confirming exactly two headers per upload.
5. **Reporter has zero pinning code.** No `webpki` callback overrides, no custom `ServerCertVerifier` — confirmed by absence of those derivations across all 3,486 functions. Any corporate TLS-intercepting proxy with a Mozilla-trusted root unwraps the traffic.
6. **Deterministic-UN code path is reachable from JNI.** `ckemv_android::native_initialize` parses the JSON `params` object for a `deterministic_un` boolean (rodata at `0x19e08`: `"Initialize: is_contactless=, deterministic_un=, params="`). A scenario JSON with `deterministic_un=true` and an explicit `9F37` override turns the harvester into a replay device.
7. **Per-crate panic-location strings** remain the strongest YARA anchors. Search rodata for the literal byte strings: `"ckemv-emv-kernel/src/dispatcher.rs"`, `"ckemv-emv-kernel/src/kernels/visa.rs"`, `"ckemv-emv-kernel/src/kernels/mchip.rs"`, `"ckemv-emv-kernel/src/results.rs"`, `"ckemv-android/src/lib.rs"`, `"ckemv-reporter/src/lib.rs"`. All six are present.

---

"""

# Inject after the first preamble '---' line
new_txt = re.sub(r"^---\n", toc_text + defender, txt, count=1, flags=re.MULTILINE)
with open(p, "w", encoding="utf-8") as f:
    f.write(new_txt)

print(f"injected TOC ({len(seen)} entries) + defender takeaways into {p}")
