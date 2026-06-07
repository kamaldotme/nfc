# CKEMV-Harvester — Open-Source Module Inventory

**Sample:** `samples/ckemv/sample.apk` · `xyz.happify.ckemv` · "Geometry Saver"
**Posture:** Static only. Defender's brief.
**Purpose:** For every module statically linked into the two native libraries, identify whether the source is publicly available (and *where*), what role it plays, and where its compiled bytes live in the binary. Anything not on this list and beginning with `ckemv_*` is **operator-authored** and is covered in `CKEMV_NATIVE_FUNCTIONS_REPORT.md`.

Counts come from the disassembly inventory (`kernel_summary.txt`, `reporter_summary.txt`). Every "fns" column is the number of monomorphized Rust functions emitted into `.text` after generics expansion — not the source crate's function count.

---

## 1. Operator-authored crates (NOT public; reverse engineered locally)

These are the attacker's own crates. They are not on GitHub, crates.io, or anywhere else in public — the names `ckemv-*` are entirely operator naming. Every byte of their behavior was reconstructed here from symbols + rodata + disassembly.

| Crate | Lib | Operator-emitted fns | Role |
| --- | --- | --- | --- |
| `ckemv_android` | kernel | 10 | JNI shim for `xyz.happify.ckemv.EmvKernel` |
| `ckemv_emv_kernel` | kernel | 20 (+ 13 closures / impl blocks) | EMV state machine — Visa + Mastercard kernels, DOL builder, ODA crypto, TLV result extraction |
| `ckemv_core` | kernel | 2 (+ 2 impl blocks) | Shared types — `ApduCommand`, `Response`, `StatusWord` |
| `ckemv_reporter` | reporter | 3 | JNI shim for `xyz.happify.ckemv.Reporter` (POST `/harvest`, GET `/me`, GET `/report`) |

Full per-function detail of these is in `CKEMV_NATIVE_FUNCTIONS_REPORT.md` and `kernel_operator_functions.md` / `reporter_operator_functions.md`.

---

## 2. Open-source crates linked into `libckemv_android.so` (the EMV kernel)

All paths inside the binary are the operator's macOS build host: `/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b557f/<crate>-<ver>/`. Versions below are recovered from those embedded paths or from build-fingerprint strings. Where a crate appears in both binaries it is listed in this table; mismatched versions across the two binaries are called out (Rust 1.91 kernel vs Rust 1.88 reporter rebuilt at different times).

### EMV-protocol and APDU helpers

| Crate | Version | Source / repo | Role in this binary |
| --- | --- | --- | --- |
| `iso7816-tlv` | 0.4.4 | https://crates.io/crates/iso7816-tlv · https://github.com/jkrh/iso7816-tlv | BER-TLV parse/encode for EMV records (`Tlv::parse_all`, `Tlv::to_vec`, `Tag::is_constructed`, `Tag::to_bytes`). Used by `ckemv_emv_kernel::results::build_tlv_tree`, `extract_aids_from_ppse`, both kernels' `process_response`. 6 monomorphizations visible. |
| `num-bigint` | 0.4.6 | https://crates.io/crates/num-bigint · https://github.com/rust-num/num-bigint | Arbitrary-precision integer math for RSA cert recovery in `ckemv_emv_kernel::crypto::oda::recover_cert` (calls `BigUint::modpow`, `convert::from_bitwise_digits_le`, `to_bitwise_digits_le`). 37 fns. |
| `num-integer` | 0.1.46 | https://crates.io/crates/num-integer · https://github.com/rust-num/num-integer | GCD/extended Euclid helpers used by `num-bigint`. (Pulled transitively.) |
| `sha1` | (RustCrypto, 0.10.x) | https://crates.io/crates/sha1 · https://github.com/RustCrypto/hashes | SHA-1 hash for EMV ODA cert verification — `sha1::compress::compress` is called from both `verify_issuer_public_key` and `verify_icc_public_key`. (EMV ODA spec mandates SHA-1.) |

### Rust runtime / serialization / FFI

| Crate | Version | Source / repo | Role |
| --- | --- | --- | --- |
| `jni` | 0.21.1 | https://crates.io/crates/jni · https://github.com/jni-rs/jni-rs | Rust↔Java bridge. Used in every `ckemv_android::native_*`: `JNIEnv::get_string`, `new_string`, `register_native_methods`, `JavaStr` conversions. 10 fns visible. |
| `serde` / `serde_core` | 1.0.x | https://crates.io/crates/serde · https://github.com/serde-rs/serde | Serde core traits — needed by `serde_json`. 5 fns. |
| `serde_json` | 1.0.149 | https://crates.io/crates/serde_json · https://github.com/serde-rs/json | Parse `params` JSON in `native_initialize`, serialize results in `native_get_tx_parameters` / `native_get_raw_data`. 30 fns + 13 impl-bound monomorphizations. |
| `hashbrown` | 0.15.3 | https://crates.io/crates/hashbrown · https://github.com/rust-lang/hashbrown | The `HashMap` impl Rust uses internally — `TransactionContext` and the DOL flattener call `HashMap::insert`. 5 + 7 fns. |
| `bytes` | 1.11.1 | https://crates.io/crates/bytes · https://github.com/tokio-rs/bytes | Zero-copy byte buffers used by `ApduCommand::to_bytes` and the kernel's `next_command`. 31 fns. |
| `hex` | 0.4.3 | https://crates.io/crates/hex · https://github.com/KokaKiwi/rust-hex | Hex encode/decode of APDU response data in `native_process_response`, `extract_emv_data`. 4 fns. |
| `cesu8` | 1.1.0 | https://crates.io/crates/cesu8 · https://github.com/emk/cesu8-rs | Java's modified UTF-8 (CESU-8) encoding bridge — used by `jni` to convert Java strings. 4 fns. |
| `obfstr` | (compile-time crate, no runtime fns embedded as-is) | https://crates.io/crates/obfstr · https://github.com/CasualX/obfstr | Compile-time XOR string obfuscation. Visible as 24 helper fns plus 193 candidate XOR blobs in `.rodata`. Used to hide JNI class/method names. **Operator-controlled use, but the crate is OSS.** |

### Logging

| Crate | Version | Source / repo | Role |
| --- | --- | --- | --- |
| `log` | (4.x façade) | https://crates.io/crates/log · https://github.com/rust-lang/log | Logging façade. 3 fns + 5 impl-bound. |
| `android_logger` | 0.14.1 | https://crates.io/crates/android_logger · https://github.com/rust-mobile/android_logger-rs | Routes Rust `log` macros to Android logcat. `init_once` + `Config::with_tag("CKEMV_NATIVE")` called from `native_initialize`. 2 fns + 4 impl-bound. |
| `env_filter` | (0.x) | https://crates.io/crates/env_filter · https://github.com/rust-cli/env_logger/tree/main/crates/env_filter | Filter-spec parser (`RUST_LOG=...`) used by `android_logger`. 2 fns. |
| `regex-automata` | 0.4.14 | https://crates.io/crates/regex-automata · https://github.com/rust-lang/regex/tree/master/regex-automata | Pulled in transitively by `env_filter` for parsing filter specs. Bloats the binary considerably (many `core::ptr::drop_in_place<regex_automata::...>` instantiations). 2 fns + many drop-glue. |
| `once_cell` | (1.x) | https://crates.io/crates/once_cell · https://github.com/matklad/once_cell | `OnceCell::initialize` used by the global `Mutex<Option<TransactionDispatcher>>` singleton in every `native_*`. 3 fns. |

### Compression / panic / unwind / debug

| Crate | Source / repo | Role |
| --- | --- | --- |
| `miniz_oxide` | https://crates.io/crates/miniz_oxide · https://github.com/Frommi/miniz_oxide | DEFLATE codec, transitive. 4 fns. |
| `adler2` | https://crates.io/crates/adler2 · https://github.com/oyvindln/adler2 | Adler-32 (used by miniz_oxide). 1 fn. |
| `gimli` | https://crates.io/crates/gimli · https://github.com/gimli-rs/gimli | DWARF parser, used by the panic-unwinder for backtraces. 23 fns. |
| `addr2line` | https://crates.io/crates/addr2line · https://github.com/gimli-rs/addr2line | Resolves return addresses to symbols for panic backtraces. 12 fns. |
| `rustc-demangle` | https://crates.io/crates/rustc-demangle · https://github.com/rust-lang/rustc-demangle | Demangles Rust symbols in backtraces. 31 fns. |
| `panic_unwind`, `libunwind` | Rust std + LLVM libunwind | Standard panic-unwind machinery. 31 + supporting C symbols. |
| `compiler_builtins` | https://github.com/rust-lang/compiler-builtins | LLVM compiler-builtin shims (e.g. `__udivti3`). 1 fn. |

### Build provenance

- **Rust toolchain:** 1.91 (commit `6b00bc3880198600130e1cf62b8f8a93494488cc`) — this commit hash leaks into every panic-format string in the binary.
- **rustup registry path:** `/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b557f/`
- **NDK:** r25b / clang 14.0.6.

---

## 3. Open-source crates linked into `libckemv_reporter.so` (the C2 client)

### Network transport

| Crate | Version | Source / repo | Role |
| --- | --- | --- | --- |
| `ureq` | 2.12.1 | https://crates.io/crates/ureq · https://github.com/algesten/ureq | Blocking HTTP/1.1 client. The three operator native_* entry points all funnel into `ureq::get` / `ureq::post` + `Request::set` (headers) + `Request::call` / `Request::send_json`. 55 fns + 29 impl-bound monomorphizations. |
| `rustls` | 0.23.37 | https://crates.io/crates/rustls · https://github.com/rustls/rustls | TLS 1.2/1.3 + ECH support. 222 fns + 333 impl-bound + 23 trait-impl helpers — the largest single component of the reporter binary. |
| `rustls-pki-types` | 1.14.0 | https://crates.io/crates/rustls-pki-types · https://github.com/rustls/pki-types | TrustAnchor / CertificateDer / PrivateKeyDer wrapper types. 10 fns + 23 impl-bound. |
| `rustls-webpki` (`webpki`) | 0.103.10 | https://crates.io/crates/rustls-webpki · https://github.com/rustls/webpki | X.509 path validation. 43 fns + 29 impl-bound. Backbone of the (unpinned) cert verification — accepts any anchor in the Mozilla bundle. |
| `untrusted` | (0.9.x) | https://crates.io/crates/untrusted · https://github.com/briansmith/untrusted | Brian Smith's input parser, dependency of `ring` and `webpki`. 21 fns + 4 impl-bound. |
| `ring` | 0.17.14 | https://crates.io/crates/ring · https://github.com/briansmith/ring | All TLS crypto: AES-GCM, ChaCha20-Poly1305, P-256/P-384, X25519, Ed25519, SHA-2. Exports ~70 `ring_core_0_17_14__*` C-style symbols (visible in the dump) plus 156 Rust fns + 38 impl-bound. **No application-layer crypto** — every symbol here is consumed inside `rustls`. |

### URL / encoding / Unicode

| Crate | Source / repo | Role |
| --- | --- | --- |
| `url` | https://crates.io/crates/url · https://github.com/servo/rust-url | URL parsing for `ureq`. 33 fns + 10 impl-bound. |
| `idna` | https://crates.io/crates/idna · https://github.com/servo/rust-url/tree/main/idna | IDN / punycode handling. 8 fns. |
| `percent-encoding` | https://crates.io/crates/percent-encoding · https://github.com/servo/rust-url/tree/main/percent_encoding | URL percent-encoding. 2 fns + 1 impl-bound. |
| `icu_normalizer` | https://crates.io/crates/icu_normalizer · https://github.com/unicode-org/icu4x | NFC/NFD/NFKC/NFKD for IDN. 9 fns. |
| `icu_collections` | https://crates.io/crates/icu_collections · https://github.com/unicode-org/icu4x | ICU code-point trie. 6 fns. |
| `utf8_iter` | https://crates.io/crates/utf8_iter · https://github.com/hsivonen/utf8_iter | UTF-8 chunk iterator. 1 fn. |
| `base64` | https://crates.io/crates/base64 · https://github.com/marshallpierce/rust-base64 | Base64 codec. 3 fns + 1 impl-bound. |

### Compression / hashing helpers

| Crate | Source / repo | Role |
| --- | --- | --- |
| `flate2` | https://crates.io/crates/flate2 · https://github.com/rust-lang/flate2-rs | gzip/deflate frontend for ureq response decoding. 12 fns + 5 impl-bound. |
| `miniz_oxide` | https://crates.io/crates/miniz_oxide · https://github.com/Frommi/miniz_oxide | Pure-Rust DEFLATE backend for flate2. 11 fns. |
| `simd_adler32` | https://crates.io/crates/simd-adler32 | Adler-32 with SIMD. 3 fns. |
| `crc32fast` | https://crates.io/crates/crc32fast · https://github.com/srijs/rust-crc32fast | CRC-32 (gzip footer). 2 fns + 1 impl-bound. |
| `subtle` | https://crates.io/crates/subtle · https://github.com/dalek-cryptography/subtle | Constant-time byte compare for `ring`. 1 fn. |

### Logging / FFI / serialization / misc

| Crate | Source / repo | Role |
| --- | --- | --- |
| `jni` | https://github.com/jni-rs/jni-rs (0.21.1) | JNI bridge for the three `native_*` entry points. 9 fns + 7 impl-bound. |
| `cesu8` | https://github.com/emk/cesu8-rs (1.1.0) | Java modified-UTF-8. 4 fns + 1 impl-bound. |
| `serde` / `serde_core` | https://github.com/serde-rs/serde | Serde core. 2 fns. |
| `serde_json` | https://github.com/serde-rs/json (1.0.x) | Used by `native_upload_harvest_data` to round-trip the JSON. 28 fns + 10 impl-bound. |
| `hashbrown` | https://github.com/rust-lang/hashbrown | Internal hashmap. 11 fns + 1 impl-bound. |
| `smallvec` | https://github.com/servo/rust-smallvec | Inline-array vectors used by rustls. 8 fns + 8 impl-bound. |
| `once_cell` | https://github.com/matklad/once_cell | One-shot lazies. 5 fns + 1 impl-bound. |
| `log` | https://github.com/rust-lang/log | Logging façade (no Android adapter in this lib). 4 fns + 4 impl-bound. |
| `obfstr` | https://github.com/CasualX/obfstr | Compile-time XOR string obfuscation. 27 fns + **1,703 candidate XOR blobs** in `.rodata` (note: bloated because `obfstr` is also used inside `rustls`/`webpki` for some constants — the operator's deliberate use is a much smaller subset, the JNI class+method names at `0x2b0f6–0x2b253`). |
| `gimli`, `addr2line`, `rustc-demangle`, `libunwind`, `panic_unwind`, `std_detect` | (same as kernel) | Panic-unwind + backtrace machinery. |

### `ring` low-level crypto export catalogue (informational)

The `ring_core_0_17_14__*` symbols expose every primitive that rustls links against. Defenders interested in fingerprinting can grep for these symbols since they pin the exact `ring` build:

- AES: `aes_hw_ctr32_encrypt_blocks`, `aes_hw_set_encrypt_key`, `aes_nohw_ctr32_encrypt_blocks`, `aes_nohw_encrypt`, `vpaes_*`
- GCM: `aes_gcm_enc_kernel`, `aes_gcm_dec_kernel`, `gcm_init_clmul`, `gcm_gmult_clmul`, `gcm_ghash_neon`
- ChaCha20-Poly1305: `chacha20_poly1305_open`, `chacha20_poly1305_seal`, `ChaCha20_ctr32_neon`, `ChaCha20_ctr32_nohw`
- P-256: `p256_mul_mont`, `p256_point_add`, `p256_point_add_affine`, `p256_point_double`, `p256_point_mul`, `p256_point_mul_base`, `p256_scalar_mul_mont`, `p256_sqr_mont`
- P-384: `p384_elem_mul_mont`, `p384_point_add`, `p384_point_mul`, `p384_scalar_mul_mont`, `nistz384_point_*`
- X25519/Ed25519: `x25519_fe_*`, `x25519_ge_*`, `x25519_sc_*`, `x25519_scalar_mult_generic_masked`, `x25519_public_from_private_generic_masked`
- SHA: `sha256_block_data_order_hw/nohw`, `sha512_block_data_order_hw/nohw`
- BigNum: `bn_mul4x_mont`, `bn_sqr8x_mont`, `bn_mul_mont_nohw`, `bn_from_montgomery_in_place`, `bn_neg_inv_mod_r_u64`
- LIMB primitives: `LIMBS_add_mod`, `LIMBS_sub_mod`, `LIMBS_shl_mod`, `LIMBS_reduce_once`, `LIMBS_window5_*`, `LIMB_shr`, `LIMB_is_zero`, `LIMBS_are_zero`, `LIMBS_equal`, `LIMBS_less_than`, `LIMBS_select_512_32`, `limbs_mul_add_limb`, `little_endian_bytes_from_scalar`
- Utility: `CRYPTO_memcmp`

None of these is operator code — they all ship with `ring 0.17.14`.

### Build provenance

- **Rust toolchain:** 1.88.0 stable
- **NDK:** r25b / clang 14.0.6
- **Same build user `arthur` on macOS** as the kernel lib.

---

## 4. How to use this inventory

1. **For each `ring_core_*` / `rustls::` / `webpki::` / `ureq::` symbol you encounter in the disassembly, do *not* reverse it** — read the upstream source. Versions are pinned above; click straight through.
2. **For each `iso7816_tlv::`, `num_bigint::`, `serde_json::`, `hex::`, `bytes::` symbol** in the kernel lib — same advice. These are well-documented open-source primitives.
3. **Anything matching `^ckemv_` is operator-authored** — covered byte-by-byte in `CKEMV_NATIVE_FUNCTIONS_REPORT.md`. There is **no public repo** for these crates; they are reverse-engineered from this sample.
4. **For deeper byte-level work on the operator code:**
   - `samples/ckemv/apk_analysis/kernel_functions.json` + `reporter_functions.json` have per-function offset/size/calls/strings — load into Ghidra/Binja for cross-referenced decomp.
   - `samples/ckemv/apk_analysis/kernel_obfstr_candidates.txt` lists 193 XOR-blob candidates in the kernel; the deliberate operator obfstr blobs are concentrated near `.rodata 0x198b0–0x19a41` (the JNI signature strings, per the existing analysis).
   - `samples/ckemv/apk_analysis/reporter_obfstr_candidates.txt` has 1,703 — the operator-authored ones cluster at `0x2b0f6–0x2b253`.

---

## 5. Suggested further tooling to push deeper (optional)

Already on host: Python 3.14, `capstone 5.0.7`, `lief 0.17.6`, `jadx`.

To take the analysis further (full decompilation of operator functions to readable pseudo-C / pseudo-Rust):

- **Ghidra 11.x** (free, NSA, https://ghidra-sre.org/) — best free decompiler for stripped Rust on ARM64. Import both `.so` files, run auto-analysis, then look up each `ckemv_*` symbol in the symbol tree.
- **Binary Ninja Free / Personal** (https://binary.ninja) — best Rust decompilation in the industry; well worth the personal license if doing this regularly.
- **rizin + Cutter** (free, https://rizin.re) — radare2 fork with a GUI.
- **`rustfilt`** — install via `cargo install rustfilt`. Pipes through any output to demangle. (Not on pip; needs a Rust toolchain.)
- **`objdump`/`readelf`/`nm`** — if you `pacman -S mingw-w64-x86_64-binutils` in MSYS2, you get llvm-friendly versions. Not required given the current Python pipeline, but handy as a sanity cross-check.

Nothing else is *needed* — the lief + capstone pipeline here already covers full ARM64 disasm, symbol resolution, rodata cross-refs, and obfstr-blob enumeration.
