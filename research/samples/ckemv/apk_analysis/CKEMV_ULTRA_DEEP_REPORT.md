# CKEMV-Harvester — ULTRA Deep Report

**Pipeline:** capstone+lief (Python) → rustfilt (Docker) → Ghidra headless (Docker) → radare2 (Docker).
All Docker activity isolated under compose project `ckemv-re` on bridge network `ckemv-re-net`.

**Sources merged here:**
- `docker/out/ghidra/{kernel,reporter}/*.c` — full pseudo-C decompilation of every operator function
- `docker/out/rust/*_demangled.txt` — rustfilt-canonical names for every symbol
- `docker/out/rizin/{kernel,reporter}_*.json` — radare2 function metadata, strings, sections
- `kernel_functions.json` / `reporter_functions.json` — capstone+lief disasm metadata (offset, size, instr count, calls, rodata refs)

## Index of operator functions (in disasm order)

| # | Function | Library |
| - | -------- | ------- |
| 1 | `_<ckemv_emv_kernel::types::TransactionStatus as core::fmt::Debug>::fmt` | kernel |
| 2 | `ckemv_android::native_initialize` | kernel |
| 3 | `ckemv_android::native_get_next_command` | kernel |
| 4 | `ckemv_android::native_process_response` | kernel |
| 5 | `ckemv_android::native_get_status` | kernel |
| 6 | `ckemv_android::native_get_pan` | kernel |
| 7 | `ckemv_android::native_get_atc` | kernel |
| 8 | `ckemv_android::native_get_arqc` | kernel |
| 9 | `ckemv_android::native_get_aid` | kernel |
| 10 | `ckemv_android::native_get_tx_parameters` | kernel |
| 11 | `ckemv_android::native_get_raw_data` | kernel |
| 12 | `ckemv_core::command::ApduCommand::to_bytes` | kernel |
| 13 | `ckemv_emv_kernel::tags::get_tag_name` | kernel |
| 14 | `ckemv_emv_kernel::types::generate_negative_correlated_time` | kernel |
| 15 | `_<ckemv_emv_kernel::types::TransactionContext as core::default::Default>::default` | kernel |
| 16 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context` | kernel |
| 17 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::status` | kernel |
| 18 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results` | kernel |
| 19 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command` | kernel |
| 20 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response` | kernel |
| 21 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse` | kernel |
| 22 | `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive` | kernel |
| 23 | `_<ckemv_emv_kernel::types::TransactionContext as core::clone::Clone>::clone` | kernel |
| 24 | `ckemv_emv_kernel::results::EmvResults::fallback_track2` | kernel |
| 25 | `ckemv_emv_kernel::results::build_tlv_tree` | kernel |
| 26 | `ckemv_emv_kernel::results::extract_emv_data` | kernel |
| 27 | `_<ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt` | kernel |
| 28 | `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::next_command` | kernel |
| 29 | `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response` | kernel |
| 30 | `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::status` | kernel |
| 31 | `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_context` | kernel |
| 32 | `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_results` | kernel |
| 33 | `ckemv_emv_kernel::dol::build_dol_payload` | kernel |
| 34 | `ckemv_emv_kernel::crypto::oda::recover_cert` | kernel |
| 35 | `ckemv_emv_kernel::crypto::oda::verify_issuer_public_key` | kernel |
| 36 | `ckemv_emv_kernel::crypto::oda::verify_icc_public_key` | kernel |
| 37 | `ckemv_emv_kernel::crypto::oda::build_static_data` | kernel |
| 38 | `ckemv_emv_kernel::crypto::oda::verify_certificates` | kernel |
| 39 | `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}` | kernel |
| 40 | `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}` | kernel |
| 41 | `_<ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt` | kernel |
| 42 | `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::next_command` | kernel |
| 43 | `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response` | kernel |
| 44 | `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::status` | kernel |
| 45 | `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_context` | kernel |
| 46 | `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_results` | kernel |
| 47 | `ckemv_core::response::Response::from_bytes` | kernel |
| 48 | `ckemv_reporter::native_upload_harvest_data` | reporter |
| 49 | `ckemv_reporter::native_fetch_cves` | reporter |
| 50 | `ckemv_reporter::native_fetch_report` | reporter |

## Defender takeaways extracted from the ULTRA pass

1. **obfstr XOR keys are now in the open.** The Ghidra pseudo-C below exposes the 64-bit XOR keys the operator used with the `obfstr` crate. For example, in `ckemv_reporter::native_fetch_report`, a string literal is XOR-decoded with keys `0x49d236de9c7f6dfe`, `0x88b5538cb0339327`, `0xde9c55b27a5c9f2e`, plus single-byte keys `0x1a`, `0x47`, `0xcb`. These are *per-call-site* constants — apply them to the byte ranges referenced by the preceding ADRP+ADD pair to recover the plaintext header / path strings.
2. **Every JNI return goes through `JNIEnv::new_string`** (after which the Java side reads it). A single Frida hook on this call dumps every harvested value as it leaves the native side.
3. **`obfstr::xref::inner` is the universal deobfuscation gateway.** Every operator function in the reporter calls into it before reading any header / URL literal. A single breakpoint on `obfstr::xref::inner` returns the deobfuscated bytes in memory — defender-side dynamic-analysis path.
4. **`ureq::request::Request::set` is called once per header.** The first arg is the header *name* (length-prefixed). In `native_upload_harvest_data` we see set called with byte-lengths 13 (Authorization) and 16 (Content-Type) — confirming exactly two headers per upload.
5. **Reporter has zero pinning code.** No `webpki` callback overrides, no custom `ServerCertVerifier` — confirmed by absence of those derivations across all 3,486 functions. Any corporate TLS-intercepting proxy with a Mozilla-trusted root unwraps the traffic.
6. **Deterministic-UN code path is reachable from JNI.** `ckemv_android::native_initialize` parses the JSON `params` object for a `deterministic_un` boolean (rodata at `0x19e08`: `"Initialize: is_contactless=, deterministic_un=, params="`). A scenario JSON with `deterministic_un=true` and an explicit `9F37` override turns the harvester into a replay device.
7. **Per-crate panic-location strings** remain the strongest YARA anchors. Search rodata for the literal byte strings: `"ckemv-emv-kernel/src/dispatcher.rs"`, `"ckemv-emv-kernel/src/kernels/visa.rs"`, `"ckemv-emv-kernel/src/kernels/mchip.rs"`, `"ckemv-emv-kernel/src/results.rs"`, `"ckemv-android/src/lib.rs"`, `"ckemv-reporter/src/lib.rs"`. All six are present.

---


## libckemv_android.so (Rust EMV kernel)

- arch: `ARCH.AARCH64`  type: `FILE_TYPE.DYN`  entry: `0x0`
- NEEDED libs: `liblog.so, libc.so, libm.so, libdl.so`
- sections: 27  segments: 10

- r2 binary info: arch=arm bits=64 stripped=False relocs=True
  - canary=False nx=True pic=True relro=full

- r2 function count: 1295
  - total text covered: 467,588 bytes  largest fn: 13,436 bytes

- r2 strings: 471

### Operator-authored functions decompiled by Ghidra: **47**

#### `_<ckemv_emv_kernel::types::TransactionStatus as core::fmt::Debug>::fmt`

- Ghidra address: `0x1439f4` (112 bytes)  ·  mangled: `_ZN79_$LT$ckemv_emv_kernel..types..TransactionStatus$u20$as$u20$core..fmt..Debug$GT$3fmt17h3998113ef38eebeeE`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::types::TransactionStatus_as_core::fmt::Debug>::fmt(ulong *param_1,undefined8 param_2);`
- capstone offset: `0x439f4`  instr: 28
- direct calls (1): `core::fmt::Formatter::debug_tuple_field1_finish`
- referenced strings (3 unique):
  - `0x19cb1`: "CompletedFailed/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs{}"
  - `0x19ca7`: "InProgressCompletedFailed/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs{}"
  - `0x19cba`: "Failed/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs{}"
- Ghidra callees (2): `debug_tuple_field1_finish`, `write_str`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::types::TransactionStatus as core::fmt::Debug>::fmt */

void __rustcall
<ckemv_emv_kernel::types::TransactionStatus_as_core::fmt::Debug>::fmt
          (ulong *param_1,undefined8 param_2)

{
  ulong uVar1;
  ulong *puStack_8;
  
  uVar1 = *param_1 ^ 0x8000000000000000;
  if (1 < uVar1) {
    uVar1 = 2;
  }
  if (uVar1 != 0) {
    if (uVar1 == 1) {
      <core::fmt::Formatter_as_core::fmt::Write>::write_str(param_2,"Completed",9);
      return;
    }
    puStack_8 = param_1;
    core::fmt::Formatter::debug_tuple_field1_finish(param_2,"Failed",6,&puStack_8,&DAT_001c13f0);
    return;
  }
  <core::fmt::Formatter_as_core::fmt::Write>::write_str(param_2,"InProgress",10);
  return;
}
```

#### `ckemv_android::native_initialize`

- Ghidra address: `0x143a64` (1768 bytes)  ·  mangled: `_ZN13ckemv_android17native_initialize17h80fb337a3f5cbd47E`
- signature (Ghidra): `void __rustcall ckemv_android::native_initialize(undefined8 param_1,undefined8 param_2,char param_3,undefined8 param_4);`
- capstone offset: `0x43a64`  instr: 542
- direct calls (34): `jni::wrapper::jnienv::JNIEnv::get_string`, `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `serde_json::de::from_trait`, `core::ptr::drop_in_place<serde_json::error::Error>`, `_<ckemv_emv_kernel::types::TransactionContext as core::default::Default>::default`, `std::sys::thread_local::os::Storage<T>::get`, `_<alloc::collections::btree::map::Iter<K,V> as core::iter::traits::iterator::Iterator>::next`, `alloc::str::_<impl str>::to_uppercase`, `hashbrown::map::HashMap<K,V,S,A>::insert`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `core::fmt::num::imp::_<impl core::fmt::Display for u64>::fmt`, `alloc::fmt::format::format_inner`, `_<hashbrown::raw::RawTable<T,A> as core::ops::drop::Drop>::drop`, `android_logger::Config::with_tag`, `android_logger::init_once`, `log::__private_api::loc`, `_<log::__private_api::GlobalLogger as log::Log>::log`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `core::ptr::drop_in_place<ckemv_emv_kernel::dispatcher::TransactionDispatcher>`, `core::ptr::drop_in_place<serde_json::value::Value>`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::panicking::panic_count::is_zero_slow_path` …
- referenced strings (4 unique):
  - `0x19e08`: "CKEMV_NATIVEInitialize: is_contactless=, deterministic_un=, params=ckemv-android/src/lib.rsckemv_androidInvalid stringError: Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\"\u2026"
  - `0x19e63`: "ckemv_androidInvalid stringError: Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19a70`: "a Display implementation returned an error unexpectedly/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/string.rscalled `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalid\u2026"
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (28): `__rust_alloc`, `__rust_dealloc`, `default`, `drop`, `drop_in_place<ckemv_emv_kernel::dispatcher::TransactionDispatcher>`, `drop_in_place<jni::wrapper::errors::Error>`, `drop_in_place<serde_json::error::Error>`, `drop_in_place<serde_json::value::Value>`, `fmt`, `format_inner`, `from`, `from_trait`, `get`, `get_string`, `handle_error`, `init_once`, `initialize`, `insert`, `is_zero_slow_path`, `loc`, `lock_contended`, `log`, `next`, `panic_access_error`, `to_uppercase` …

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_initialize */

void __rustcall
ckemv_android::native_initialize
          (undefined8 param_1,undefined8 param_2,char param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 uVar2;
  char cVar3;
  undefined8 *******pppppppuVar4;
  undefined **ppuVar5;
  bool bVar6;
  byte bVar7;
  int iVar8;
  long *plVar9;
  ulong uVar10;
  char *pcVar11;
  long lVar12;
  long lVar13;
  undefined1 auVar14 [16];
  undefined8 local_2b8;
  undefined8 uStack_2b0;
  long local_2a8;
  undefined8 *******local_2a0;
  undefined **local_298;
  char *local_290;
  undefined8 uStack_288;
  undefined8 local_280;
  undefined *local_270;
  char *pcStack_268;
  undefined8 local_260;
  undefined8 uStack_258;
  undefined8 local_248;
  undefined8 uStack_240;
  undefined1 *local_238;
  char *pcStack_230;
  undefined8 local_228;
  undefined8 uStack_220;
  long local_218;
  long lStack_210;
  undefined1 local_208;
  undefined2 uStack_207;
  undefined5 uStack_205;
  undefined1 *local_200;
  char *pcStack_1f8;
  undefined8 local_1f0;
  undefined8 uStack_1e8;
  long local_1e0;
  long lStack_1d8;
  undefined8 ******local_1c8;
  undefined1 auStack_1c0 [24];
  undefined1 auStack_1a8 [24];
  undefined8 *******local_190;
  undefined **ppuStack_188;
  undefined8 local_180;
  undefined8 *******local_178;
  undefined **local_170;
  undefined8 *******local_168;
  code *pcStack_160;
  undefined1 **local_158;
  code *pcStack_150;
  undefined *local_110;
  char *pcStack_108;
  char *pcStack_100;
  undefined8 uStack_f8;
  undefined *local_f0;
  long lStack_e8;
  char *pcStack_e0;
  char *local_d8;
  undefined1 *puStack_d0;
  undefined8 local_c8;
  undefined **local_c0;
  undefined8 uStack_b8;
  undefined8 *******local_b0;
  long lStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined1 uStack_88;
  undefined1 uStack_87;
  undefined6 uStack_86;
  undefined8 *******local_78;
  undefined **ppuStack_70;
  undefined8 local_68;
  
  local_2b8 = param_1;
  uStack_2b0 = param_4;
  jni::wrapper::jnienv::JNIEnv::get_string(&local_110,&local_2b8,&uStack_2b0);
  if ((char)local_110 == '\x0f') {
    local_280 = uStack_f8;
    uStack_288 = pcStack_100;
    local_290 = pcStack_108;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from(&local_2a8,&local_290);
  }
  else {
    local_2a0 = (undefined8 *******)__rustc[4794b31dd7191200]::__rust_alloc(2,1);
    if (local_2a0 == (undefined8 *******)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,2,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c1470);
    }
    *(undefined2 *)local_2a0 = 0x7d7b;
    local_2a8 = 2;
    local_298 = (undefined **)0x2;
    core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_110);
  }
  local_168 = (undefined8 *******)0x0;
  local_178 = local_2a0;
  local_170 = local_298;
  serde_json::de::from_trait(&local_110,&local_178);
  if ((char)local_110 == '\x06') {
    local_270 = (undefined *)((ulong)local_270 & 0xffffffffffffff00);
    core::ptr::drop_in_place<serde_json::error::Error>(&pcStack_108);
  }
  else {
    pcStack_268 = pcStack_108;
    local_270 = local_110;
    uStack_258 = uStack_f8;
    local_260 = pcStack_100;
  }
  <ckemv_emv_kernel::types::TransactionContext_as_core::default::Default>::default(&local_248);
  uStack_207 = 0x101;
  plVar9 = (long *)std::sys::thread_local::os::Storage<T>::get
                             (&std::hash::random::RandomState::new::KEYS::{{closure}}::VAL,0);
  if (plVar9 == (long *)0x0) {
                    /* WARNING: Subroutine does not return */
    std::thread::local::panic_access_error
              (&anon_6deba2efe6b45fd21feb3db339334dc1_3_llvm_6518145507870720632);
  }
  lStack_1d8 = plVar9[1];
  local_1e0 = *plVar9;
  *plVar9 = local_1e0 + 1;
  pcStack_1f8 = (char *)0x0;
  local_200 = &DAT_00119d98;
  uStack_1e8 = 0;
  local_1f0 = 0;
  if ((char)local_270 == '\x05') {
    bVar6 = pcStack_268 != (char *)0x0;
    local_110 = (undefined *)(ulong)bVar6;
    pcStack_108 = (char *)0x0;
    pcStack_100 = pcStack_268;
    lStack_e8 = 0;
    pcStack_e0 = pcStack_268;
    lVar12 = -(ulong)((long)((ulong)CONCAT14(bVar6,(uint)bVar6) << 0x3f) < 0);
    lVar13 = -(ulong)((long)((ulong)bVar6 << 0x3f) < 0);
    uStack_f8 = CONCAT17((byte)((ulong)local_260 >> 0x38) & (byte)((ulong)lVar12 >> 0x38),
                         CONCAT16((byte)((ulong)local_260 >> 0x30) & (byte)((ulong)lVar12 >> 0x30),
                                  CONCAT15((byte)((ulong)local_260 >> 0x28) &
                                           (byte)((ulong)lVar12 >> 0x28),
                                           CONCAT14((byte)((ulong)local_260 >> 0x20) &
                                                    (byte)((ulong)lVar12 >> 0x20),
                                                    CONCAT13((byte)((ulong)local_260 >> 0x18) &
                                                             (byte)((ulong)lVar12 >> 0x18),
                                                             CONCAT12((byte)((ulong)local_260 >>
                                                                            0x10) &
                                                                      (byte)((ulong)lVar12 >> 0x10),
                                                                      CONCAT11((byte)((ulong)
                                                  local_260 >> 8) & (byte)((ulong)lVar12 >> 8),
                                                  (byte)local_260 & (byte)lVar12)))))));
    puStack_d0 = (undefined1 *)
                 CONCAT17((byte)((ulong)uStack_258 >> 0x38) & (byte)((ulong)lVar13 >> 0x38),
                          CONCAT16((byte)((ulong)uStack_258 >> 0x30) & (byte)((ulong)lVar13 >> 0x30)
                                   ,CONCAT15((byte)((ulong)uStack_258 >> 0x28) &
                                             (byte)((ulong)lVar13 >> 0x28),
                                             CONCAT14((byte)((ulong)uStack_258 >> 0x20) &
                                                      (byte)((ulong)lVar13 >> 0x20),
                                                      CONCAT13((byte)((ulong)uStack_258 >> 0x18) &
                                                               (byte)((ulong)lVar13 >> 0x18),
                                                               CONCAT12((byte)((ulong)uStack_258 >>
                                                                              0x10) &
                                                                        (byte)((ulong)lVar13 >> 0x10
                                                                              ),CONCAT11((byte)((
                                                  ulong)uStack_258 >> 8) &
                                                  (byte)((ulong)lVar13 >> 8),
                                                  (byte)uStack_258 & (byte)lVar13)))))));
    local_f0 = local_110;
    local_d8 = (char *)uStack_f8;
LAB_00143c08:
    while( true ) {
      auVar14 = <alloc::collections::btree::map::Iter<K,V>as_core::iter::traits::iterator::Iterator>
                ::next(&local_110);
      pcVar11 = auVar14._8_8_;
      lVar12 = auVar14._0_8_;
      if (lVar12 == 0) break;
      if (*pcVar11 == '\x02') goto LAB_00143c00;
      if (*pcVar11 == '\x03') {
        uVar1 = *(undefined8 *)(pcVar11 + 0x10);
        uVar2 = *(undefined8 *)(pcVar11 + 0x18);
        alloc::str::<impl_str>::to_uppercase
                  (&local_78,*(undefined8 *)(lVar12 + 8),*(undefined8 *)(lVar12 + 0x10));
        alloc::str::<impl_str>::to_uppercase(&local_178,uVar1,uVar2);
        hashbrown::map::HashMap<K,V,S,A>::insert(&local_190,&local_200,&local_78,&local_178);
        pppppppuVar4 = local_190;
        ppuVar5 = ppuStack_188;
        goto joined_r0x00143de0;
      }
    }
  }
  local_208 = 1;
  pcStack_108 = pcStack_1f8;
  local_110 = local_200;
  uStack_f8 = uStack_1e8;
  pcStack_100 = (char *)local_1f0;
  lStack_e8 = lStack_1d8;
  local_f0 = (undefined *)local_1e0;
  <hashbrown::raw::RawTable<T,A>as_core::ops::drop::Drop>::drop(&local_238);
  puStack_d0 = (undefined1 *)0x0;
  local_c0 = (undefined **)0x0;
  pcStack_230 = pcStack_108;
  local_238 = local_110;
  uStack_220 = uStack_f8;
  local_228 = pcStack_100;
  lStack_210 = lStack_e8;
  local_218 = (long)local_f0;
  pcStack_108 = (char *)0x8000000000000000;
  local_110 = (undefined *)0x0;
  local_b0 = (undefined8 *******)CONCAT71(local_b0._1_7_,8);
  android_logger::Config::with_tag(&local_178,&local_110,"CKEMV_NATIVE",0xc);
  android_logger::init_once(&local_178);
  if (2 < log::MAX_LOG_LEVEL_FILTER) {
    local_178 = &local_78;
    local_78 = (undefined8 *******)CONCAT71(local_78._1_7_,param_3 != '\0');
    local_170 = (undefined **)<bool_as_core::fmt::Display>::fmt;
    local_168 = (undefined8 *******)&local_208;
    pcStack_160 = <bool_as_core::fmt::Display>::fmt;
    pcStack_150 = <std::collections::hash::map::HashMap<K,V,S>as_core::fmt::Debug>::fmt;
    local_158 = &local_238;
    plVar9 = (long *)log::__private_api::loc(&PTR_s_ckemv_android_src_lib_rs_001c14d8);
    local_f0 = (undefined *)*plVar9;
    lStack_e8 = plVar9[1];
    uStack_b8 = 3;
    lStack_a8 = 3;
    pcStack_e0 = (char *)0x3;
    puStack_d0 = (undefined1 *)0xd;
    local_c0 = &PTR_s_Initialize__is_contactless___det_001c14a8;
    local_b0 = &local_178;
    local_d8 = "ckemv_android";
    local_a0 = 0;
    local_110 = (undefined *)0x0;
    pcStack_108 = "ckemv_android";
    uStack_f8 = 0;
    pcStack_100 = (char *)0xd;
    local_c8 = (char *)CONCAT44((int)plVar9[2],1);
    <log::__private_api::GlobalLogger_as_log::Log>::log(&local_190,&local_110);
  }
  uStack_88 = param_3 != '\0';
  local_a0 = CONCAT53(uStack_205,CONCAT21
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_next_command`

- Ghidra address: `0x1442dc` (868 bytes)  ·  mangled: `_ZN13ckemv_android23native_get_next_command17hb1b34eafcdaba1ccE`
- signature (Ghidra): `long __rustcall ckemv_android::native_get_next_command(undefined8 param_1);`
- capstone offset: `0x442dc`  instr: 264
- direct calls (16): `jni::wrapper::jnienv::JNIEnv::new_string`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `ckemv_core::command::ApduCommand::to_bytes`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::ptr::drop_in_place<ckemv_emv_kernel::types::KernelAction>`, `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`, `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`, `_Unwind_Resume`
- referenced strings (2 unique):
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (10): `__rust_dealloc`, `from_iter`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `next_command`, `to_bytes`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_next_command */

long __rustcall ckemv_android::native_get_next_command(undefined8 param_1)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  byte bVar4;
  long lVar5;
  ulong uVar6;
  int iVar7;
  undefined8 local_168;
  char local_160;
  undefined7 uStack_15f;
  long lStack_158;
  undefined8 local_150;
  long lStack_148;
  undefined8 local_140;
  undefined8 uStack_138;
  undefined8 local_130;
  undefined8 uStack_128;
  undefined4 *local_120;
  long lStack_118;
  undefined8 uStack_110;
  long local_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined1 auStack_e0 [24];
  char local_c8;
  undefined7 uStack_c7;
  long lStack_c0;
  long local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  long local_90;
  long lStack_88;
  undefined1 *puStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  local_168 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar2) {
      DAT_001cb070 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar4 = 0;
  }
  else {
    bVar4 = std::panicking::panic_count::is_zero_slow_path();
    bVar4 = bVar4 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_120 = &DAT_001cb070;
    uVar6 = (ulong)lStack_118 >> 8;
    lStack_118 = CONCAT71((int7)uVar6,bVar4);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_120,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c1508);
  }
  if (DAT_001cb078 != -0x8000000000000000) {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command(&local_160,&DAT_001cb078);
    if (-0x7fffffffffffffff < CONCAT71(uStack_15f,local_160)) {
      local_120 = (undefined4 *)CONCAT71(uStack_15f,local_160);
      lStack_118 = lStack_158;
      local_108 = lStack_148;
      uStack_110 = local_150;
      uStack_f8 = uStack_138;
      local_100 = local_140;
      uStack_e8 = uStack_128;
      local_f0 = local_130;
      ckemv_core::command::ApduCommand::to_bytes(&local_c8,&local_108);
      lVar3 = local_b8;
      lVar5 = lStack_c0;
      local_78 = CONCAT44(local_78._4_4_,0x110000);
      lStack_88 = lStack_c0 + local_b8;
      local_90 = lStack_c0;
      puStack_80 = &anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (auStack_e0,&local_90);
      (**(code **)(CONCAT71(uStack_c7,local_c8) + 0x20))(&uStack_b0,lVar5,lVar3);
      jni::wrapper::jnienv::JNIEnv::new_string(&local_c8,&local_168,auStack_e0);
      if (local_c8 != '\x0f') {
        lStack_88 = lStack_c0;
        local_78 = uStack_b0;
        puStack_80 = (undefined1 *)local_b8;
        uStack_68 = uStack_a0;
        local_70 = local_a8;
        local_60 = local_98;
                    /* WARNING: Subroutine does not return */
        core::result::unwrap_failed
                  ("called `Result::unwrap()` on an `Err` value",0x2b,&local_90,
                   &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                   &PTR_s_ckemv_android_src_lib_rs_001c1520);
      }
      if (local_108 != 0) {
        (**(code **)(local_108 + 0x20))(&local_f0,local_100,uStack_f8);
      }
      if (local_120 != (undefined4 *)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(lStack_118,local_120,1);
      }
      if ((((bVar4 & 1) == 0) &&
          ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
         (uVar6 = std::panicking::panic_count::is_zero_slow_path(lStack_c0), (uVar6 & 1) == 0)) {
        DAT_001cb074 = '\x01';
      }
      do {
        iVar7 = DAT_001cb070;
        cVar1 = '\x01';
        bVar2 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
        if (bVar2) {
          DAT_001cb070 = 0;
          cVar1 = ExclusiveMonitorsStatus();
        }
        lVar5 = lStack_c0;
      } while (cVar1 != '\0');
      goto LAB_001444cc;
    }
    if ((CONCAT71(uStack_15f,local_160) == -0x7fffffffffffffff) && (lStack_158 != 0)) {
      __rustc[4794b31dd7191200]::__rust_dealloc(local_150,lStack_158,1);
    }
  }
  jni::wrapper::jnienv::JNIEnv::new_string(&local_160,&local_168,1,0);
  if (local_160 != '\x0f') {
    uStack_f8 = uStack_138;
    local_100 = local_140;
    lStack_118 = lStack_158;
    local_108 = lStack_148;
    uStack_110 = local_150;
    local_f0 = local_130;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_120,
               &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
               &PTR_s_ckemv_android_src_lib_rs_001c1538);
  }
  if ((((bVar4 & 1) == 0) &&
      ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
     (uVar6 = std::panicking::panic_count::is_zero_slow_path(lStack_158), (uVar6 & 1) == 0)) {
    DAT_001cb074 = '\x01';
  }
  do {
    iVar7 = DAT_001cb070;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar2) {
      DAT_001cb070 = 0;
      cVar1 = ExclusiveMonitorsStatus();
    }
    lVar5 = lStack_158;
  } while (cVar1 != '\0');
LAB_001444cc:
  if (iVar7 == 2) {
    std::sys::sync::mutex::futex::Mutex::wake(&DAT_001cb070);
  }
  return lVar5;
}
```

#### `ckemv_android::native_process_response`

- Ghidra address: `0x1446fc` (1384 bytes)  ·  mangled: `_ZN13ckemv_android23native_process_response17h1794544a95923185E`
- signature (Ghidra): `undefined8 *** __rustcall ckemv_android::native_process_response(undefined8 param_1,undefined8 param_2,undefined8 param_3);`
- capstone offset: `0x446fc`  instr: 427
- direct calls (22): `jni::wrapper::jnienv::JNIEnv::get_string`, `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`, `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`, `ckemv_core::response::Response::from_bytes`, `core::ptr::drop_in_place<ckemv_core::error::Error>`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `jni::wrapper::jnienv::JNIEnv::new_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response`, `alloc::fmt::format::format_inner`, `_<alloc::vec::Vec<T,A> as core::ops::drop::Drop>::drop`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::panicking::panic_count::is_zero_slow_path`, `std::sys::sync::mutex::futex::Mutex::wake`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<core::option::Option<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>>`, `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`, `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`, `core::ptr::drop_in_place<core::result::Result<ckemv_core::response::Response,ckemv_core::error::Error>>`, `_Unwind_Resume`
- referenced strings (3 unique):
  - `0x19e85`: "Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19e70`: "Invalid stringError: Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (15): `__rust_dealloc`, `drop`, `drop_in_place<ckemv_core::error::Error>`, `format_inner`, `from`, `from_bytes`, `from_hex`, `get_string`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `process_response`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_process_response */

undefined8 *** __rustcall
ckemv_android::native_process_response(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 ***pppuVar1;
  undefined8 ***pppuVar2;
  char cVar3;
  int iVar4;
  undefined8 **ppuVar5;
  bool bVar6;
  byte bVar7;
  undefined8 ***pppuVar8;
  ulong uVar9;
  undefined8 ***pppuVar10;
  undefined8 uVar11;
  undefined8 ***pppuVar12;
  undefined8 local_1d8;
  undefined8 uStack_1d0;
  undefined1 auStack_1c8 [24];
  long local_1b0;
  long local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  long local_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 local_160;
  undefined8 **local_150;
  undefined8 **ppuStack_148;
  undefined8 **ppuStack_140;
  undefined8 **local_138;
  undefined8 **local_130;
  undefined8 uStack_128;
  undefined8 **local_120;
  undefined8 **ppuStack_118;
  undefined8 **local_110;
  undefined8 **local_108;
  undefined8 **local_100;
  undefined8 uStack_f8;
  undefined1 auStack_f0 [24];
  undefined8 **local_d8;
  undefined8 **ppuStack_d0;
  undefined8 **ppuStack_c8;
  undefined8 **ppuStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 **local_a0;
  undefined8 **ppuStack_98;
  undefined8 **local_90;
  undefined8 **local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  
  local_1d8 = param_1;
  uStack_1d0 = param_3;
  jni::wrapper::jnienv::JNIEnv::get_string(&local_d8,&local_1d8,&uStack_1d0);
  if ((char)local_d8 != '\x0f') {
    ppuStack_98 = ppuStack_d0;
    local_a0 = local_d8;
    local_88 = ppuStack_c0;
    local_90 = ppuStack_c8;
    uStack_78 = uStack_b0;
    local_80 = local_b8;
    local_70 = local_a8;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("Invalid string",0xe,&local_a0,
               &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
               &PTR_s_ckemv_android_src_lib_rs_001c1550);
  }
  local_90 = ppuStack_c0;
  ppuStack_98 = ppuStack_c8;
  local_a0 = ppuStack_d0;
  jni::wrapper::strings::java_str::
  <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
  from(auStack_1c8,&local_a0);
  <alloc::vec::Vec<u8>as_hex::FromHex>::from_hex(&local_a0,auStack_1c8);
  bVar6 = (undefined8 ***)local_a0 == (undefined8 ***)0x8000000000000000;
  pppuVar2 = (undefined8 ***)ppuStack_98;
  if (bVar6) {
    pppuVar2 = (undefined8 ***)0x1;
  }
  pppuVar1 = (undefined8 ***)0x0;
  if (!bVar6) {
    pppuVar1 = (undefined8 ***)local_a0;
  }
  pppuVar12 = (undefined8 ***)0x0;
  if (!bVar6) {
    pppuVar12 = (undefined8 ***)local_90;
  }
  ckemv_core::response::Response::from_bytes(&local_1b0,pppuVar2,pppuVar12);
  if ((int)local_1b0 == 1) {
joined_r0x00144888:
    if (local_1b0 == 0) {
      if (local_1a8 != 0) {
        (**(code **)(local_1a8 + 0x20))(&uStack_190,uStack_1a0,local_198);
      }
    }
    else {
      core::ptr::drop_in_place<ckemv_core::error::Error>(&local_1a8);
    }
  }
  else {
    uStack_178 = uStack_1a0;
    local_180 = local_1a8;
    uStack_168 = uStack_190;
    uStack_170 = local_198;
    local_160 = local_188;
    if (DAT_001cb108 != 2) {
      once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
    }
    do {
      if (DAT_001cb070 != 0) {
        ClearExclusiveLocal();
        std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
        break;
      }
      cVar3 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
      if (bVar6) {
        DAT_001cb070 = 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
      bVar7 = 0;
    }
    else {
      bVar7 = std::panicking::panic_count::is_zero_slow_path();
      bVar7 = bVar7 ^ 1;
    }
    if (DAT_001cb074 != '\0') {
      local_a0 = (undefined8 **)&DAT_001cb070;
      uVar9 = (ulong)ppuStack_98 >> 8;
      ppuStack_98 = (undefined8 **)CONCAT71((int7)uVar9,bVar7);
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_a0,
                 &
                 PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
                 ,&PTR_s_ckemv_android_src_lib_rs_001c1568);
    }
    if (DAT_001cb078 != -0x8000000000000000) {
      ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response
                (&local_150,&DAT_001cb078,&local_180,0);
      if ((undefined8 ***)local_150 == (undefined8 ***)0x8000000000000000) {
        local_d8 = &local_120;
        local_110 = local_138;
        ppuStack_d0 = (undefined8 **)<alloc::string::String_as_core::fmt::Display>::fmt;
        ppuStack_118 = ppuStack_140;
        local_120 = ppuStack_148;
        local_a0 = (undefined8 **)&PTR_s_Error__001c1598;
        ppuStack_98 = (undefined8 ***)0x1;
        local_90 = &local_d8;
        local_88 = (undefined8 **)0x1;
        local_80 = 0;
        alloc::fmt::format::format_inner(auStack_f0,&local_a0);
        jni::wrapper::jnienv::JNIEnv::new_string(&local_d8,&local_1d8,auStack_f0);
        if ((char)local_d8 != '\x0f') {
          ppuStack_98 = ppuStack_d0;
          local_a0 = local_d8;
          local_88 = ppuStack_c0;
          local_90 = ppuStack_c8;
          uStack_78 = uStack_b0;
          local_80 = local_b8;
          local_70 = local_a8;
                    /* WARNING: Subroutine does not return */
          core::result::unwrap_failed
                    ("called `Result::unwrap()` on an `Err` value",0x2b,&local_a0,
                     &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                     &PTR_s_ckemv_android_src_lib_rs_001c15a8);
        }
        pppuVar12 = (undefined8 ***)ppuStack_d0;
        if ((undefined8 ***)local_120 != (undefined8 ***)0x0) {
          uVar11 = 1;
          pppuVar8 = (undefined8 ***)ppuStack_118;
          pppuVar10 = (undefined8 ***)local_120;
LAB_00144a18:
          __rustc[4794b31dd7191200]::__rust_dealloc(pppuVar8,pppuVar10,uVar11);
        }
      }
      else {
        uStack_f8 = uStack_128;
        local_100 = local_130;
        ppuStack_118 = ppuStack_148;
        local_120 = local_150;
        local_108 = local_138;
        local_110 = ppuStack_140;
        ppuStack_98 = ppuStack_148;
        local_a0 = local_150;
        local_90 = ppuStack_140;
        jni::wrapper::jnienv::JNIEnv::new_string(&local_d8,&local_1d8,&local_a0);
        pppuVar12 = (undefined8 ***)ppuStack_d0;
        ppuVar5 = local_108;
        if ((char)local_d8 != '\x0f') {
          ppuStack_98 = ppuStack_d0;
          local_a0 = local_d8;
          local_88 = ppuStack_c0;
          local_90 = ppuStack_c8;
          uStack_78 = uStack_b0;
          local_80 = local_b8;
          local_70 = local_a8;
                    /* WARNING: Subroutine does not return */
          core::result::unwrap_failed
                    ("called `Result::unwrap()` on an `Err` value",0x2b,&local_a0,
                     &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                     &PTR_s_ckemv_android_src_lib_rs_001c1580);
        }
        if (((undefined8 ***)local_108 != (undefined8 ***)0x8000000000000000) &&
           (<alloc::vec::Vec<T,A>as_core::ops::drop::Drop>::drop(&local_108),
           (undefined8 ***)ppuVar5 != (undefined8 ***)0x0)) {
          uVar11 = 8;
          pppuVar10 = (undefined8 ***)((long)ppuVar5 * 0x70);
          pppuVar8 = (undefined8 ***)local_100;
          goto LAB_00144a18;
        }
      }
      if ((((bVar7 & 1) == 0) &&
          ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
         (uVar9 = std::panicking::panic_count::is_zero_slow_path(), (uVar9 & 1) == 0)) {
        DAT_001cb074 = '\x01';
      }
      do {
        iVar4 = DAT_001cb070;
        cVar3 = '\x01';
        bVar6 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
        if (bVar6) {
          DAT_001cb070 = 0;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (iVar4 == 2) {
        std::sys::sync::mutex::futex::Mutex::wake(&DAT_001cb070);
      }
      if (local_180 != 0) {
        (**(code **)(local_180 + 0x20))(&uStack_168,uStack_178,uStack_170);
      }
      if ((int)local_1b0 == 1) {
        if (local_1b0 == 0) {
          if (local_1a8 != 0) {
            (**(code **)(local_1a8 + 0x20))(&uStack_190,uStack_1a0,local_198);
          }
        }
        else {
          core::ptr::drop_in_place<ckemv_core::error::Error>(&local_1a8);
        }
      }
      goto LAB_001448d0;
    }
    if ((((bVar7 & 1) == 0) &&
        ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
       (uVar9 = std::panicking::panic_count::is_zero_slow_path(), (uVar9 & 1) == 0)) {
      DAT_001cb074 = '\x01';
    }
    do {
      iVar4 = DAT_001cb070;
      cVar3 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
      if (bVar6) {
        DAT_001cb070 = 0;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar4 == 2) {
      std::sys::sync::mutex::futex::Mutex::wake(&DAT_001cb070);
    }
    if (local_180 != 0) {
      (**(code **)(local_180 + 0x20))(&uStack_168,uStack_178,uStack_170);
    }
    if ((int)local_1b0 == 1) goto joined_r0x00144888;
  }
  jni::wrapper::jnienv::JNIEnv::new_string(&local_d8,&local_1d8,"Invalid APDU Response",0x15);
  pppuVar12 = (undefined8 ***)ppuStack_d0;
  if ((char)local_d8 != '\x0f') {
    ppuStack_98 = ppuStack_d0;
    local_a0 = local_d8;
    local_88 = ppuStack_c0;
    local_90 = ppuStack_c8;
    uStack_78 = uStack
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_status`

- Ghidra address: `0x144da8` (680 bytes)  ·  mangled: `_ZN13ckemv_android17native_get_status17h4f05d3beaad3bcd6E`
- signature (Ghidra): `undefined8 __rustcall ckemv_android::native_get_status(undefined8 param_1);`
- capstone offset: `0x44da8`  instr: 202
- direct calls (16): `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::status`, `alloc::fmt::format::format_inner`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `jni::wrapper::jnienv::JNIEnv::new_string`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`, `_Unwind_Resume`
- referenced strings (2 unique):
  - `0x19e9a`: "NotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (11): `__rust_alloc`, `__rust_dealloc`, `format_inner`, `handle_error`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `status`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_status */

undefined8 __rustcall ckemv_android::native_get_status(undefined8 param_1)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  int iVar4;
  byte bVar5;
  ulong uVar6;
  undefined8 local_d8;
  undefined4 *local_d0;
  undefined8 *puStack_c8;
  undefined8 local_c0;
  char *local_b8;
  code *pcStack_b0;
  char local_a8;
  undefined7 uStack_a7;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined4 *local_70;
  undefined8 *puStack_68;
  char **local_60;
  undefined8 local_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  
  local_d8 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar2) {
      DAT_001cb070 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar5 = 0;
  }
  else {
    bVar5 = std::panicking::panic_count::is_zero_slow_path();
    bVar5 = bVar5 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_70 = &DAT_001cb070;
    uVar6 = (ulong)puStack_68 >> 8;
    puStack_68 = (undefined8 *)CONCAT71((int7)uVar6,bVar5);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_70,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c15d8);
  }
  if (DAT_001cb078 == -0x8000000000000000) {
    puStack_c8 = (undefined8 *)__rustc[4794b31dd7191200]::__rust_alloc(0xe,1);
    if (puStack_c8 == (undefined8 *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0xe,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c1470);
    }
    *puStack_c8 = 0x6974696e49746f4e;
    local_c0 = 0xe;
    *(char (*) [8])((long)puStack_c8 + 6) = (char  [8])0x64657a696c616974;
    local_d0 = (undefined4 *)0xe;
  }
  else {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::status(&local_a8,&DAT_001cb078);
    pcStack_b0 = <ckemv_emv_kernel::types::TransactionStatus_as_core::fmt::Debug>::fmt;
    local_70 = (undefined4 *)&DAT_00119620;
    puStack_68 = (undefined8 *)0x1;
    local_60 = &local_b8;
    local_58 = 1;
    local_50 = 0;
    local_b8 = &local_a8;
    alloc::fmt::format::format_inner(&local_d0,&local_70);
    lVar3 = CONCAT71(uStack_a7,local_a8);
    if ((-0x7fffffffffffffff < lVar3) && (lVar3 != 0)) {
      __rustc[4794b31dd7191200]::__rust_dealloc(uStack_a0,lVar3,1);
    }
  }
  local_70 = local_d0;
  puStack_68 = puStack_c8;
  local_60 = (char **)local_c0;
  jni::wrapper::jnienv::JNIEnv::new_string(&local_a8,&local_d8,&local_70);
  if (local_a8 == '\x0f') {
    if ((((bVar5 & 1) == 0) &&
        ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
       (uVar6 = std::panicking::panic_count::is_zero_slow_path(), (uVar6 & 1) == 0)) {
      DAT_001cb074 = '\x01';
    }
    do {
      iVar4 = DAT_001cb070;
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
      if (bVar2) {
        DAT_001cb070 = 0;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
    if (iVar4 != 2) {
      return uStack_a0;
    }
    std::sys::sync::mutex::futex::Mutex::wake(&DAT_001cb070);
    return uStack_a0;
  }
  puStack_68 = (undefined8 *)uStack_a0;
  local_58 = uStack_90;
  local_60 = (char **)local_98;
  uStack_48 = uStack_80;
  local_50 = local_88;
  local_40 = local_78;
                    /* WARNING: Subroutine does not return */
  core::result::unwrap_failed
            ("called `Result::unwrap()` on an `Err` value",0x2b,&local_70,
             &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
             &PTR_s_ckemv_android_src_lib_rs_001c15f0);
}
```

#### `ckemv_android::native_get_pan`

- Ghidra address: `0x1450d0` (1508 bytes)  ·  mangled: `_ZN13ckemv_android14native_get_pan17h4ba861978c2176dfE`
- signature (Ghidra): `undefined8 __rustcall ckemv_android::native_get_pan(undefined8 param_1);`
- capstone offset: `0x450d0`  instr: 704
- direct calls (11): `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `jni::wrapper::jnienv::JNIEnv::new_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- referenced strings (1 unique):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (9): `__rust_dealloc`, `drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `get_results`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_pan */

undefined8 __rustcall ckemv_android::native_get_pan(undefined8 param_1)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  byte bVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 local_378;
  undefined4 *local_370;
  long lStack_368;
  long local_360;
  long local_358;
  undefined8 local_350;
  undefined8 uStack_348;
  long local_340;
  undefined8 local_338;
  long local_328;
  undefined8 local_320;
  long local_310;
  undefined8 local_308;
  long local_2f8;
  undefined8 uStack_2f0;
  undefined8 local_2e8;
  long local_2e0;
  undefined8 local_2d8;
  long local_2c8;
  undefined8 local_2c0;
  long local_2b0;
  undefined8 local_2a8;
  long local_298;
  undefined8 local_290;
  long local_280;
  undefined8 local_278;
  long local_268;
  undefined8 local_260;
  long local_250;
  undefined8 local_248;
  long local_238;
  undefined8 local_230;
  long local_220;
  undefined8 local_218;
  long local_208;
  undefined8 local_200;
  long local_1f0;
  undefined8 local_1e8;
  long local_1d8;
  undefined8 local_1d0;
  long local_1c0;
  undefined8 local_1b8;
  long local_1a8;
  undefined8 local_1a0;
  long local_190;
  undefined8 local_188;
  long local_178;
  undefined8 local_170;
  long local_160;
  undefined8 local_158;
  long local_148;
  undefined8 local_140;
  long local_130;
  undefined8 local_128;
  long local_118;
  undefined8 local_110;
  long local_100;
  undefined8 local_f8;
  long local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  char local_c8 [8];
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined4 *local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  local_378 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar4 = 0;
  }
  else {
    bVar4 = std::panicking::panic_count::is_zero_slow_path();
    bVar4 = bVar4 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_370 = &DAT_001cb070;
    uVar5 = (ulong)lStack_368 >> 8;
    lStack_368 = CONCAT71((int7)uVar5,bVar4);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c1608);
  }
  if (DAT_001cb078 != -0x8000000000000000) {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(&local_370,&DAT_001cb078);
    if (local_2f8 != -0x8000000000000000) {
      uStack_d8 = uStack_2f0;
      local_e0 = local_2f8;
      local_d0 = local_2e8;
      jni::wrapper::jnienv::JNIEnv::new_string(local_c8,&local_378,&local_e0);
      if (local_c8[0] != '\x0f') {
        uStack_88 = uStack_c0;
        uStack_78 = uStack_b0;
        uStack_80 = local_b8;
        uStack_68 = uStack_a0;
        local_70 = local_a8;
        local_60 = local_98;
                    /* WARNING: Subroutine does not return */
        core::result::unwrap_failed
                  ("called `Result::unwrap()` on an `Err` value",0x2b,&local_90,
                   &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                   &PTR_s_ckemv_android_src_lib_rs_001c1620);
      }
      if ((local_358 != -0x8000000000000000) && (local_358 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_350,local_358,1);
      }
      if ((local_340 != -0x8000000000000000) && (local_340 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_338,local_340,1);
      }
      if ((local_328 != -0x8000000000000000) && (local_328 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_320,local_328,1);
      }
      if ((local_310 != -0x8000000000000000) && (local_310 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_308,local_310,1);
      }
      if ((local_2e0 != -0x8000000000000000) && (local_2e0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2d8,local_2e0,1);
      }
      if ((local_2c8 != -0x8000000000000000) && (local_2c8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2c0,local_2c8,1);
      }
      if ((local_2b0 != -0x8000000000000000) && (local_2b0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2a8,local_2b0,1);
      }
      if ((local_298 != -0x8000000000000000) && (local_298 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_290,local_298,1);
      }
      if ((local_280 != -0x8000000000000000) && (local_280 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_278,local_280,1);
      }
      if ((local_268 != -0x8000000000000000) && (local_268 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_260,local_268,1);
      }
      if ((local_250 != -0x8000000000000000) && (local_250 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_248,local_250,1);
      }
      if ((local_238 != -0x8000000000000000) && (local_238 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_230,local_238,1);
      }
      if ((local_220 != -0x8000000000000000) && (local_220 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_218,local_220,1);
      }
      if ((local_208 != -0x8000000000000000) && (local_208 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_200,local_208,1);
      }
      if ((local_1f0 != -0x8000000000000000) && (local_1f0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1e8,local_1f0,1);
      }
      if ((local_1d8 != -0x8000000000000000) && (local_1d8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1d0,local_1d8,1);
      }
      if ((local_1c0 != -0x8000000000000000) && (local_1c0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1b8,local_1c0,1);
      }
      if ((local_1a8 != -0x8000000000000000) && (local_1a8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1a0,local_1a8,1);
      }
      if ((local_190 != -0x8000000000000000) && (local_190 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_188,local_190,1);
      }
      if ((local_178 != -0x8000000000000000) && (local_178 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_170,local_178,1);
      }
      if ((local_160 != -0x8000000000000000) && (local_160 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_158,local_160,1);
      }
      if ((local_148 != -0x8000000000000000) && (local_148 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_140,local_148,1);
      }
      if ((local_130 != -0x8000000000000000) && (local_130 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_128,local_130,1);
      }
      if ((local_118 != -0x8000000000000000) && (local_118 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_110,local_118,1);
      }
      if ((local_100 != -0x8000000000000000) && (local_100 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_f8,local_100,1);
      }
      if (local_360 != 0) {
        puVar8 = (undefined8 *)(lStack_368 + 0x10);
        lVar7 = local_360;
        do {
          if (puVar8[-1] != 0) {
            __rustc[4794b31dd7191200]::__rust_dealloc(*puVar8,puVar8[-1],1);
          }
          lVar7 = lVar7 + -1;
          puVar8 = puVar8 + 4;
        } while (lVar7 != 0);
      }
      if (local_370 != (undefined4 *)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(lStack_368,(long)local_370 << 5,8);
      }
      if ((((bVar4 & 1) == 0) &&
          ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
         (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
        DAT_001cb074 = '\x01';
      }
      do {
        iVar1 = DAT_001cb070;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
        if (bVar3) {
          DAT_001cb070 = 0;
          cVar2 = ExclusiveMonitorsStatus();
        }
        uVar6 = uStack_c0;
      } while (cVar2 != '\0');
      goto LAB_00145554;
    }
    core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>(&local_370);
  }
  jni::wrapper::jnienv::JNIEnv::new_string(&local_90,&local_378,1,0);
  if ((char)local_90 != '\x0f') {
    uStack_348 = uStack_68;
    local_350 = local_70;
    lStack_368 = uStack_88;
    local_370 = local_90;
    local_358 = uStack_78;
    local_360 = uStack_80;
    local_340 = local_60;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
               &PTR_s_ckemv_android_src_lib_rs_001c1638);
  }
  if ((((bVar4 & 1) == 0) &&
      ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
     (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
    DAT_001cb074 = '\x01';
  }
  do {
    iVar1 = DAT_001cb070;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 0;
      cVar2 = ExclusiveMonitorsStatus();
    }
    uVar6 = uStack_88;
  } 
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_atc`

- Ghidra address: `0x145bd0` (1508 bytes)  ·  mangled: `_ZN13ckemv_android14native_get_atc17h60122243470060d9E`
- signature (Ghidra): `undefined8 __rustcall ckemv_android::native_get_atc(undefined8 param_1);`
- capstone offset: `0x45bd0`  instr: 704
- direct calls (11): `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `jni::wrapper::jnienv::JNIEnv::new_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- referenced strings (1 unique):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (9): `__rust_dealloc`, `drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `get_results`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_atc */

undefined8 __rustcall ckemv_android::native_get_atc(undefined8 param_1)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  byte bVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 local_378;
  undefined4 *local_370;
  long lStack_368;
  long local_360;
  long local_358;
  undefined8 local_350;
  undefined8 uStack_348;
  long local_340;
  undefined8 local_338;
  long local_328;
  undefined8 local_320;
  long local_310;
  undefined8 local_308;
  long local_2f8;
  undefined8 local_2f0;
  long local_2e0;
  undefined8 local_2d8;
  long local_2c8;
  undefined8 local_2c0;
  long local_2b0;
  undefined8 local_2a8;
  long local_298;
  undefined8 uStack_290;
  undefined8 local_288;
  long local_280;
  undefined8 local_278;
  long local_268;
  undefined8 local_260;
  long local_250;
  undefined8 local_248;
  long local_238;
  undefined8 local_230;
  long local_220;
  undefined8 local_218;
  long local_208;
  undefined8 local_200;
  long local_1f0;
  undefined8 local_1e8;
  long local_1d8;
  undefined8 local_1d0;
  long local_1c0;
  undefined8 local_1b8;
  long local_1a8;
  undefined8 local_1a0;
  long local_190;
  undefined8 local_188;
  long local_178;
  undefined8 local_170;
  long local_160;
  undefined8 local_158;
  long local_148;
  undefined8 local_140;
  long local_130;
  undefined8 local_128;
  long local_118;
  undefined8 local_110;
  long local_100;
  undefined8 local_f8;
  long local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  char local_c8 [8];
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined4 *local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  local_378 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar4 = 0;
  }
  else {
    bVar4 = std::panicking::panic_count::is_zero_slow_path();
    bVar4 = bVar4 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_370 = &DAT_001cb070;
    uVar5 = (ulong)lStack_368 >> 8;
    lStack_368 = CONCAT71((int7)uVar5,bVar4);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c1650);
  }
  if (DAT_001cb078 != -0x8000000000000000) {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(&local_370,&DAT_001cb078);
    if (local_298 != -0x8000000000000000) {
      uStack_d8 = uStack_290;
      local_e0 = local_298;
      local_d0 = local_288;
      jni::wrapper::jnienv::JNIEnv::new_string(local_c8,&local_378,&local_e0);
      if (local_c8[0] != '\x0f') {
        uStack_88 = uStack_c0;
        uStack_78 = uStack_b0;
        uStack_80 = local_b8;
        uStack_68 = uStack_a0;
        local_70 = local_a8;
        local_60 = local_98;
                    /* WARNING: Subroutine does not return */
        core::result::unwrap_failed
                  ("called `Result::unwrap()` on an `Err` value",0x2b,&local_90,
                   &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                   &PTR_s_ckemv_android_src_lib_rs_001c1668);
      }
      if ((local_358 != -0x8000000000000000) && (local_358 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_350,local_358,1);
      }
      if ((local_340 != -0x8000000000000000) && (local_340 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_338,local_340,1);
      }
      if ((local_328 != -0x8000000000000000) && (local_328 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_320,local_328,1);
      }
      if ((local_310 != -0x8000000000000000) && (local_310 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_308,local_310,1);
      }
      if ((local_2f8 != -0x8000000000000000) && (local_2f8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2f0,local_2f8,1);
      }
      if ((local_2e0 != -0x8000000000000000) && (local_2e0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2d8,local_2e0,1);
      }
      if ((local_2c8 != -0x8000000000000000) && (local_2c8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2c0,local_2c8,1);
      }
      if ((local_2b0 != -0x8000000000000000) && (local_2b0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2a8,local_2b0,1);
      }
      if ((local_280 != -0x8000000000000000) && (local_280 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_278,local_280,1);
      }
      if ((local_268 != -0x8000000000000000) && (local_268 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_260,local_268,1);
      }
      if ((local_250 != -0x8000000000000000) && (local_250 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_248,local_250,1);
      }
      if ((local_238 != -0x8000000000000000) && (local_238 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_230,local_238,1);
      }
      if ((local_220 != -0x8000000000000000) && (local_220 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_218,local_220,1);
      }
      if ((local_208 != -0x8000000000000000) && (local_208 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_200,local_208,1);
      }
      if ((local_1f0 != -0x8000000000000000) && (local_1f0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1e8,local_1f0,1);
      }
      if ((local_1d8 != -0x8000000000000000) && (local_1d8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1d0,local_1d8,1);
      }
      if ((local_1c0 != -0x8000000000000000) && (local_1c0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1b8,local_1c0,1);
      }
      if ((local_1a8 != -0x8000000000000000) && (local_1a8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1a0,local_1a8,1);
      }
      if ((local_190 != -0x8000000000000000) && (local_190 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_188,local_190,1);
      }
      if ((local_178 != -0x8000000000000000) && (local_178 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_170,local_178,1);
      }
      if ((local_160 != -0x8000000000000000) && (local_160 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_158,local_160,1);
      }
      if ((local_148 != -0x8000000000000000) && (local_148 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_140,local_148,1);
      }
      if ((local_130 != -0x8000000000000000) && (local_130 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_128,local_130,1);
      }
      if ((local_118 != -0x8000000000000000) && (local_118 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_110,local_118,1);
      }
      if ((local_100 != -0x8000000000000000) && (local_100 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_f8,local_100,1);
      }
      if (local_360 != 0) {
        puVar8 = (undefined8 *)(lStack_368 + 0x10);
        lVar7 = local_360;
        do {
          if (puVar8[-1] != 0) {
            __rustc[4794b31dd7191200]::__rust_dealloc(*puVar8,puVar8[-1],1);
          }
          lVar7 = lVar7 + -1;
          puVar8 = puVar8 + 4;
        } while (lVar7 != 0);
      }
      if (local_370 != (undefined4 *)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(lStack_368,(long)local_370 << 5,8);
      }
      if ((((bVar4 & 1) == 0) &&
          ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
         (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
        DAT_001cb074 = '\x01';
      }
      do {
        iVar1 = DAT_001cb070;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
        if (bVar3) {
          DAT_001cb070 = 0;
          cVar2 = ExclusiveMonitorsStatus();
        }
        uVar6 = uStack_c0;
      } while (cVar2 != '\0');
      goto LAB_00146054;
    }
    core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>(&local_370);
  }
  jni::wrapper::jnienv::JNIEnv::new_string(&local_90,&local_378,1,0);
  if ((char)local_90 != '\x0f') {
    uStack_348 = uStack_68;
    local_350 = local_70;
    lStack_368 = uStack_88;
    local_370 = local_90;
    local_358 = uStack_78;
    local_360 = uStack_80;
    local_340 = local_60;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
               &PTR_s_ckemv_android_src_lib_rs_001c1680);
  }
  if ((((bVar4 & 1) == 0) &&
      ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
     (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
    DAT_001cb074 = '\x01';
  }
  do {
    iVar1 = DAT_001cb070;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 0;
      cVar2 = ExclusiveMonitorsStatus();
    }
    uVar6 = uStack_88;
  } 
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_arqc`

- Ghidra address: `0x1466d0` (1508 bytes)  ·  mangled: `_ZN13ckemv_android15native_get_arqc17hd0c1c57140c94414E`
- signature (Ghidra): `undefined8 __rustcall ckemv_android::native_get_arqc(undefined8 param_1);`
- capstone offset: `0x466d0`  instr: 704
- direct calls (11): `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `jni::wrapper::jnienv::JNIEnv::new_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- referenced strings (1 unique):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (9): `__rust_dealloc`, `drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `get_results`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_arqc */

undefined8 __rustcall ckemv_android::native_get_arqc(undefined8 param_1)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  byte bVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 local_378;
  undefined4 *local_370;
  long lStack_368;
  long local_360;
  long local_358;
  undefined8 local_350;
  undefined8 uStack_348;
  long local_340;
  undefined8 local_338;
  long local_328;
  undefined8 local_320;
  long local_310;
  undefined8 local_308;
  long local_2f8;
  undefined8 local_2f0;
  long local_2e0;
  undefined8 local_2d8;
  long local_2c8;
  undefined8 local_2c0;
  long local_2b0;
  undefined8 local_2a8;
  long local_298;
  undefined8 local_290;
  long local_280;
  undefined8 local_278;
  long local_268;
  undefined8 local_260;
  long local_250;
  undefined8 local_248;
  long local_238;
  undefined8 local_230;
  long local_220;
  undefined8 local_218;
  long local_208;
  undefined8 local_200;
  long local_1f0;
  undefined8 local_1e8;
  long local_1d8;
  undefined8 local_1d0;
  long local_1c0;
  undefined8 local_1b8;
  long local_1a8;
  undefined8 local_1a0;
  long local_190;
  undefined8 uStack_188;
  undefined8 local_180;
  long local_178;
  undefined8 local_170;
  long local_160;
  undefined8 local_158;
  long local_148;
  undefined8 local_140;
  long local_130;
  undefined8 local_128;
  long local_118;
  undefined8 local_110;
  long local_100;
  undefined8 local_f8;
  long local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  char local_c8 [8];
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined4 *local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  local_378 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar4 = 0;
  }
  else {
    bVar4 = std::panicking::panic_count::is_zero_slow_path();
    bVar4 = bVar4 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_370 = &DAT_001cb070;
    uVar5 = (ulong)lStack_368 >> 8;
    lStack_368 = CONCAT71((int7)uVar5,bVar4);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c1698);
  }
  if (DAT_001cb078 != -0x8000000000000000) {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(&local_370,&DAT_001cb078);
    if (local_190 != -0x8000000000000000) {
      uStack_d8 = uStack_188;
      local_e0 = local_190;
      local_d0 = local_180;
      jni::wrapper::jnienv::JNIEnv::new_string(local_c8,&local_378,&local_e0);
      if (local_c8[0] != '\x0f') {
        uStack_88 = uStack_c0;
        uStack_78 = uStack_b0;
        uStack_80 = local_b8;
        uStack_68 = uStack_a0;
        local_70 = local_a8;
        local_60 = local_98;
                    /* WARNING: Subroutine does not return */
        core::result::unwrap_failed
                  ("called `Result::unwrap()` on an `Err` value",0x2b,&local_90,
                   &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                   &PTR_s_ckemv_android_src_lib_rs_001c16b0);
      }
      if ((local_358 != -0x8000000000000000) && (local_358 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_350,local_358,1);
      }
      if ((local_340 != -0x8000000000000000) && (local_340 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_338,local_340,1);
      }
      if ((local_328 != -0x8000000000000000) && (local_328 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_320,local_328,1);
      }
      if ((local_310 != -0x8000000000000000) && (local_310 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_308,local_310,1);
      }
      if ((local_2f8 != -0x8000000000000000) && (local_2f8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2f0,local_2f8,1);
      }
      if ((local_2e0 != -0x8000000000000000) && (local_2e0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2d8,local_2e0,1);
      }
      if ((local_2c8 != -0x8000000000000000) && (local_2c8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2c0,local_2c8,1);
      }
      if ((local_2b0 != -0x8000000000000000) && (local_2b0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2a8,local_2b0,1);
      }
      if ((local_298 != -0x8000000000000000) && (local_298 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_290,local_298,1);
      }
      if ((local_280 != -0x8000000000000000) && (local_280 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_278,local_280,1);
      }
      if ((local_268 != -0x8000000000000000) && (local_268 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_260,local_268,1);
      }
      if ((local_250 != -0x8000000000000000) && (local_250 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_248,local_250,1);
      }
      if ((local_238 != -0x8000000000000000) && (local_238 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_230,local_238,1);
      }
      if ((local_220 != -0x8000000000000000) && (local_220 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_218,local_220,1);
      }
      if ((local_208 != -0x8000000000000000) && (local_208 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_200,local_208,1);
      }
      if ((local_1f0 != -0x8000000000000000) && (local_1f0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1e8,local_1f0,1);
      }
      if ((local_1d8 != -0x8000000000000000) && (local_1d8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1d0,local_1d8,1);
      }
      if ((local_1c0 != -0x8000000000000000) && (local_1c0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1b8,local_1c0,1);
      }
      if ((local_1a8 != -0x8000000000000000) && (local_1a8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1a0,local_1a8,1);
      }
      if ((local_178 != -0x8000000000000000) && (local_178 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_170,local_178,1);
      }
      if ((local_160 != -0x8000000000000000) && (local_160 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_158,local_160,1);
      }
      if ((local_148 != -0x8000000000000000) && (local_148 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_140,local_148,1);
      }
      if ((local_130 != -0x8000000000000000) && (local_130 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_128,local_130,1);
      }
      if ((local_118 != -0x8000000000000000) && (local_118 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_110,local_118,1);
      }
      if ((local_100 != -0x8000000000000000) && (local_100 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_f8,local_100,1);
      }
      if (local_360 != 0) {
        puVar8 = (undefined8 *)(lStack_368 + 0x10);
        lVar7 = local_360;
        do {
          if (puVar8[-1] != 0) {
            __rustc[4794b31dd7191200]::__rust_dealloc(*puVar8,puVar8[-1],1);
          }
          lVar7 = lVar7 + -1;
          puVar8 = puVar8 + 4;
        } while (lVar7 != 0);
      }
      if (local_370 != (undefined4 *)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(lStack_368,(long)local_370 << 5,8);
      }
      if ((((bVar4 & 1) == 0) &&
          ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
         (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
        DAT_001cb074 = '\x01';
      }
      do {
        iVar1 = DAT_001cb070;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
        if (bVar3) {
          DAT_001cb070 = 0;
          cVar2 = ExclusiveMonitorsStatus();
        }
        uVar6 = uStack_c0;
      } while (cVar2 != '\0');
      goto LAB_00146b54;
    }
    core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>(&local_370);
  }
  jni::wrapper::jnienv::JNIEnv::new_string(&local_90,&local_378,1,0);
  if ((char)local_90 != '\x0f') {
    uStack_348 = uStack_68;
    local_350 = local_70;
    lStack_368 = uStack_88;
    local_370 = local_90;
    local_358 = uStack_78;
    local_360 = uStack_80;
    local_340 = local_60;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
               &PTR_s_ckemv_android_src_lib_rs_001c16c8);
  }
  if ((((bVar4 & 1) == 0) &&
      ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
     (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
    DAT_001cb074 = '\x01';
  }
  do {
    iVar1 = DAT_001cb070;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 0;
      cVar2 = ExclusiveMonitorsStatus();
    }
    uVar6 = uStack_88;
  
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_aid`

- Ghidra address: `0x1471d0` (1508 bytes)  ·  mangled: `_ZN13ckemv_android14native_get_aid17hcfaadcc78a0b9070E`
- signature (Ghidra): `undefined8 __rustcall ckemv_android::native_get_aid(undefined8 param_1);`
- capstone offset: `0x471d0`  instr: 704
- direct calls (11): `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `jni::wrapper::jnienv::JNIEnv::new_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- referenced strings (1 unique):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (9): `__rust_dealloc`, `drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `get_results`, `initialize`, `is_zero_slow_path`, `lock_contended`, `new_string`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_aid */

undefined8 __rustcall ckemv_android::native_get_aid(undefined8 param_1)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  byte bVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 local_378;
  undefined4 *local_370;
  long lStack_368;
  long local_360;
  long local_358;
  undefined8 uStack_350;
  undefined8 uStack_348;
  long local_340;
  undefined8 local_338;
  long local_328;
  undefined8 local_320;
  long local_310;
  undefined8 local_308;
  long local_2f8;
  undefined8 local_2f0;
  long local_2e0;
  undefined8 local_2d8;
  long local_2c8;
  undefined8 local_2c0;
  long local_2b0;
  undefined8 local_2a8;
  long local_298;
  undefined8 local_290;
  long local_280;
  undefined8 local_278;
  long local_268;
  undefined8 local_260;
  long local_250;
  undefined8 local_248;
  long local_238;
  undefined8 local_230;
  long local_220;
  undefined8 local_218;
  long local_208;
  undefined8 local_200;
  long local_1f0;
  undefined8 local_1e8;
  long local_1d8;
  undefined8 local_1d0;
  long local_1c0;
  undefined8 local_1b8;
  long local_1a8;
  undefined8 local_1a0;
  long local_190;
  undefined8 local_188;
  long local_178;
  undefined8 local_170;
  long local_160;
  undefined8 local_158;
  long local_148;
  undefined8 local_140;
  long local_130;
  undefined8 local_128;
  long local_118;
  undefined8 local_110;
  long local_100;
  undefined8 local_f8;
  long local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  char local_c8 [8];
  undefined8 uStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined4 *local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  local_378 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar4 = 0;
  }
  else {
    bVar4 = std::panicking::panic_count::is_zero_slow_path();
    bVar4 = bVar4 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_370 = &DAT_001cb070;
    uVar5 = (ulong)lStack_368 >> 8;
    lStack_368 = CONCAT71((int7)uVar5,bVar4);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c16e0);
  }
  if (DAT_001cb078 != -0x8000000000000000) {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(&local_370,&DAT_001cb078);
    if (local_358 != -0x8000000000000000) {
      uStack_d8 = uStack_350;
      local_e0 = local_358;
      local_d0 = uStack_348;
      jni::wrapper::jnienv::JNIEnv::new_string(local_c8,&local_378,&local_e0);
      if (local_c8[0] != '\x0f') {
        uStack_88 = uStack_c0;
        uStack_78 = uStack_b0;
        uStack_80 = local_b8;
        uStack_68 = uStack_a0;
        local_70 = local_a8;
        local_60 = local_98;
                    /* WARNING: Subroutine does not return */
        core::result::unwrap_failed
                  ("called `Result::unwrap()` on an `Err` value",0x2b,&local_90,
                   &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                   &PTR_s_ckemv_android_src_lib_rs_001c16f8);
      }
      if ((local_340 != -0x8000000000000000) && (local_340 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_338,local_340,1);
      }
      if ((local_328 != -0x8000000000000000) && (local_328 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_320,local_328,1);
      }
      if ((local_310 != -0x8000000000000000) && (local_310 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_308,local_310,1);
      }
      if ((local_2f8 != -0x8000000000000000) && (local_2f8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2f0,local_2f8,1);
      }
      if ((local_2e0 != -0x8000000000000000) && (local_2e0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2d8,local_2e0,1);
      }
      if ((local_2c8 != -0x8000000000000000) && (local_2c8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2c0,local_2c8,1);
      }
      if ((local_2b0 != -0x8000000000000000) && (local_2b0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_2a8,local_2b0,1);
      }
      if ((local_298 != -0x8000000000000000) && (local_298 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_290,local_298,1);
      }
      if ((local_280 != -0x8000000000000000) && (local_280 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_278,local_280,1);
      }
      if ((local_268 != -0x8000000000000000) && (local_268 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_260,local_268,1);
      }
      if ((local_250 != -0x8000000000000000) && (local_250 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_248,local_250,1);
      }
      if ((local_238 != -0x8000000000000000) && (local_238 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_230,local_238,1);
      }
      if ((local_220 != -0x8000000000000000) && (local_220 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_218,local_220,1);
      }
      if ((local_208 != -0x8000000000000000) && (local_208 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_200,local_208,1);
      }
      if ((local_1f0 != -0x8000000000000000) && (local_1f0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1e8,local_1f0,1);
      }
      if ((local_1d8 != -0x8000000000000000) && (local_1d8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1d0,local_1d8,1);
      }
      if ((local_1c0 != -0x8000000000000000) && (local_1c0 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1b8,local_1c0,1);
      }
      if ((local_1a8 != -0x8000000000000000) && (local_1a8 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_1a0,local_1a8,1);
      }
      if ((local_190 != -0x8000000000000000) && (local_190 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_188,local_190,1);
      }
      if ((local_178 != -0x8000000000000000) && (local_178 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_170,local_178,1);
      }
      if ((local_160 != -0x8000000000000000) && (local_160 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_158,local_160,1);
      }
      if ((local_148 != -0x8000000000000000) && (local_148 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_140,local_148,1);
      }
      if ((local_130 != -0x8000000000000000) && (local_130 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_128,local_130,1);
      }
      if ((local_118 != -0x8000000000000000) && (local_118 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_110,local_118,1);
      }
      if ((local_100 != -0x8000000000000000) && (local_100 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(local_f8,local_100,1);
      }
      if (local_360 != 0) {
        puVar8 = (undefined8 *)(lStack_368 + 0x10);
        lVar7 = local_360;
        do {
          if (puVar8[-1] != 0) {
            __rustc[4794b31dd7191200]::__rust_dealloc(*puVar8,puVar8[-1],1);
          }
          lVar7 = lVar7 + -1;
          puVar8 = puVar8 + 4;
        } while (lVar7 != 0);
      }
      if (local_370 != (undefined4 *)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(lStack_368,(long)local_370 << 5,8);
      }
      if ((((bVar4 & 1) == 0) &&
          ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
         (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
        DAT_001cb074 = '\x01';
      }
      do {
        iVar1 = DAT_001cb070;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
        if (bVar3) {
          DAT_001cb070 = 0;
          cVar2 = ExclusiveMonitorsStatus();
        }
        uVar6 = uStack_c0;
      } while (cVar2 != '\0');
      goto LAB_00147654;
    }
    core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>(&local_370);
  }
  jni::wrapper::jnienv::JNIEnv::new_string(&local_90,&local_378,1,0);
  if ((char)local_90 != '\x0f') {
    uStack_348 = uStack_68;
    uStack_350 = local_70;
    lStack_368 = uStack_88;
    local_370 = local_90;
    local_358 = uStack_78;
    local_360 = uStack_80;
    local_340 = local_60;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_370,
               &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
               &PTR_s_ckemv_android_src_lib_rs_001c1710);
  }
  if ((((bVar4 & 1) == 0) &&
      ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
     (uVar5 = std::panicking::panic_count::is_zero_slow_path(), (uVar5 & 1) == 0)) {
    DAT_001cb074 = '\x01';
  }
  do {
    iVar1 = DAT_001cb070;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 0;
      cVar2 = ExclusiveMonitorsStatus();
    }
    uVar6 = uStack_88;
  } while (cVar2 != '\0');
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_tx_parameters`

- Ghidra address: `0x147cd0` (3236 bytes)  ·  mangled: `_ZN13ckemv_android24native_get_tx_parameters17he5d1f478c07ef2f7E`
- signature (Ghidra): `byte ****** __rustcall ckemv_android::native_get_tx_parameters(undefined8 param_1);`
- capstone offset: `0x47cd0`  instr: 956
- direct calls (21): `jni::wrapper::jnienv::JNIEnv::new_string`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`, `core::hash::BuildHasher::hash_one`, `_<alloc::string::String as core::clone::Clone>::clone`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `alloc::collections::btree::map::BTreeMap<K,V,A>::insert`, `core::ptr::drop_in_place<serde_json::value::Value>`, `@0xbcfe0`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `serde_core::ser::Serializer::collect_map`, `_<serde_json::value::Value as core::fmt::Display>::fmt`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `_<hashbrown::raw::RawTable<T,A> as core::ops::drop::Drop>::drop`, `alloc::sync::Arc<T,A>::drop_slow`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `alloc::raw_vec::handle_error`
- referenced strings (4 unique):
  - `0x19ba4`: "9F37for<kindcodeargs5F249F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19bbc`: "9F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
  - `0x19a70`: "a Display implementation returned an error unexpectedly/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/string.rscalled `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalid\u2026"
- Ghidra callees (21): `__rust_alloc`, `__rust_dealloc`, `clone`, `collect_map`, `drop`, `drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `drop_in_place<serde_json::value::Value>`, `drop_slow`, `fmt`, `get_context`, `get_results`, `handle_error`, `hash_one`, `initialize`, `insert`, `is_zero_slow_path`, `lock_contended`, `memcpy`, `new_string`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_tx_parameters */

byte ****** __rustcall ckemv_android::native_get_tx_parameters(undefined8 param_1)

{
  long lVar1;
  char cVar2;
  bool bVar3;
  uint uVar4;
  undefined1 auVar5 [16];
  long *plVar6;
  byte bVar7;
  int iVar8;
  ulong uVar9;
  byte ******__src;
  byte ******ppppppbVar10;
  byte ******ppppppbVar11;
  byte ******ppppppbVar12;
  byte *****pppppbVar13;
  void *__dest;
  ulong uVar14;
  undefined1 uVar15;
  long lVar16;
  byte bVar17;
  ulong uVar18;
  byte ******ppppppbVar19;
  byte ******ppppppbVar20;
  byte *******pppppppbVar21;
  undefined1 *__dest_00;
  byte bVar22;
  undefined8 uVar23;
  byte *******local_410;
  byte *******local_408;
  undefined8 local_400;
  char local_3f8;
  undefined7 uStack_3f7;
  byte ******ppppppbStack_3f0;
  long local_3e8;
  ulong uStack_3e0;
  undefined8 local_3d8;
  long lStack_3d0;
  undefined8 local_3c8 [3];
  undefined4 *local_3b0;
  byte ******ppppppbStack_3a8;
  long lStack_3a0;
  ulong uStack_398;
  undefined8 local_390;
  long lStack_388;
  undefined8 local_380;
  long local_1b8 [12];
  long local_158;
  void *local_150;
  byte ******local_148;
  long local_140;
  void *local_138;
  byte ******local_130;
  undefined8 local_120;
  byte ******local_118;
  byte ******ppppppbStack_110;
  undefined8 local_108;
  byte *******local_100;
  byte ******ppppppbStack_f8;
  byte ******local_f0;
  byte ******ppppppbStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 local_d0;
  byte *******local_c0;
  byte ******ppppppbStack_b8;
  byte ******local_b0;
  byte *******local_a0;
  byte ******ppppppbStack_98;
  byte ******local_90;
  byte ******local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  
  local_400 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar7 = 0;
  }
  else {
    bVar7 = std::panicking::panic_count::is_zero_slow_path();
    bVar7 = bVar7 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_3b0 = &DAT_001cb070;
    uVar14 = (ulong)ppppppbStack_3a8 >> 8;
    ppppppbStack_3a8 = (byte ******)CONCAT71((int7)uVar14,bVar7);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_3b0,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c1728);
  }
  if (DAT_001cb078 == -0x8000000000000000) {
    jni::wrapper::jnienv::JNIEnv::new_string(&local_3f8,&local_400,"{}",2);
    if (local_3f8 != '\x0f') {
      ppppppbStack_3a8 = ppppppbStack_3f0;
      uStack_398 = uStack_3e0;
      lStack_3a0 = local_3e8;
      lStack_388 = lStack_3d0;
      local_390 = local_3d8;
      local_380 = local_3c8[0];
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_3b0,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                 &PTR_s_ckemv_android_src_lib_rs_001c1740);
    }
    if ((((bVar7 & 1) == 0) &&
        ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
       (uVar14 = std::panicking::panic_count::is_zero_slow_path(), (uVar14 & 1) == 0)) {
      DAT_001cb074 = '\x01';
    }
    do {
      iVar8 = DAT_001cb070;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
      if (bVar3) {
        DAT_001cb070 = 0;
        cVar2 = ExclusiveMonitorsStatus();
      }
      ppppppbVar11 = ppppppbStack_3f0;
    } while (cVar2 != '\0');
    goto LAB_00148750;
  }
  ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context(&local_3f8,&DAT_001cb078);
  ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(&local_3b0,&DAT_001cb078);
  if (lStack_3d0 != 0) {
    uVar9 = core::hash::BuildHasher::hash_one(local_3c8,"9F37",4);
    lVar16 = 0;
    bVar17 = (byte)(uVar9 >> 0x39);
    uVar9 = uVar9 & uStack_3e0;
    uVar23 = *(undefined8 *)(local_3e8 + uVar9);
    uVar14 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar17),
                      CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar17),
                               CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar17),
                                        CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar17),
                                                 CONCAT13(-((byte)((ulong)uVar23 >> 0x18) == bVar17)
                                                          ,CONCAT12(-((byte)((ulong)uVar23 >> 0x10)
                                                                     == bVar17),
                                                                    CONCAT11(-((byte)((ulong)uVar23
                                                                                     >> 8) == bVar17
                                                                              ),-((byte)uVar23 ==
                                                                                 bVar17)))))))) &
             0x8080808080808080;
    while( true ) {
      while (uVar14 == 0) {
        bVar22 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar23 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar23 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar23 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar23 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar23
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar23 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar23 >> 8) == -1),
                                                           -((char)uVar23 == -1)))))))),1);
        if ((bVar22 & 1) != 0) goto LAB_00147ec0;
        lVar16 = lVar16 + 8;
        uVar9 = uVar9 + lVar16 & uStack_3e0;
        uVar23 = *(undefined8 *)(local_3e8 + uVar9);
        uVar14 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar17),
                          CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar17),
                                   CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar17),
                                            CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar17),
                                                     CONCAT13(-((byte)((ulong)uVar23 >> 0x18) ==
                                                               bVar17),CONCAT12(-((byte)((ulong)
                                                  uVar23 >> 0x10) == bVar17),
                                                  CONCAT11(-((byte)((ulong)uVar23 >> 8) == bVar17),
                                                           -((byte)uVar23 == bVar17)))))))) &
                 0x8080808080808080;
      }
      uVar18 = (uVar14 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar14 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
      uVar18 = uVar9 + ((ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3) & uStack_3e0;
      lVar1 = local_3e8 + -0x30 + uVar18 * -0x30;
      if ((*(long *)(lVar1 + 0x10) == 4) && (**(int **)(lVar1 + 8) == 0x37334639)) break;
      uVar14 = uVar14 - 1 & uVar14;
    }
    <alloc::string::String_as_core::clone::Clone>::clone
              (&local_a0,local_3e8 + uVar18 * -0x30 + -0x18);
    local_410 = local_a0;
    if (local_a0 != (byte *******)0x8000000000000000) {
      __src = ppppppbStack_98;
      ppppppbVar11 = local_90;
      if (lStack_3d0 == 0) goto LAB_00148030;
      goto LAB_00147ef4;
    }
  }
LAB_00147ec0:
  __src = (byte ******)__rustc[4794b31dd7191200]::__rust_alloc(8,1);
  if (__src == (byte ******)0x0) {
                    /* WARNING: Subroutine does not return */
    alloc::raw_vec::handle_error(1,8,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c1470);
  }
  *__src = (byte *****)0x3030303030303030;
  local_410 = (byte *******)&DAT_00000008;
  ppppppbVar11 = (byte ******)&DAT_00000008;
  if (lStack_3d0 != 0) {
LAB_00147ef4:
    uVar9 = core::hash::BuildHasher::hash_one(local_3c8,"9F02Byte",4);
    lVar16 = 0;
    bVar17 = (byte)(uVar9 >> 0x39);
    uVar9 = uVar9 & uStack_3e0;
    uVar23 = *(undefined8 *)(local_3e8 + uVar9);
    uVar14 = CONCAT17(-((byte)((ulong)uVar23 >> 0x38) == bVar17),
                      CONCAT16(-((byte)((ulong)uVar23 >> 0x30) == bVar17),
                               CONCAT15(-((byte)((ulong)uVar23 >> 0x28) == bVar17),
                                        CONCAT14(-((byte)((ulong)uVar23 >> 0x20) == bVar17),
                                                 CONCAT13(-((byte)((ulong)uVar23 >> 0x18) == bVar17)
                                                          ,CONCAT12(-((byte)((ulong)uVar23 >> 0x10)
                                                                     == bVar17),
                                                                    CONCAT11(-((byte)((ulong)uVar23
                                                               
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_android::native_get_raw_data`

- Ghidra address: `0x148bc0` (2444 bytes)  ·  mangled: `_ZN13ckemv_android19native_get_raw_data17hfb378eb189e545a7E`
- signature (Ghidra): `code * __rustcall ckemv_android::native_get_raw_data(undefined8 param_1);`
- capstone offset: `0x48bc0`  instr: 719
- direct calls (22): `jni::wrapper::jnienv::JNIEnv::new_string`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `alloc::fmt::format::format_inner`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `alloc::str::join_generic_copy`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `@0xbcfe0`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `std::sys::sync::mutex::futex::Mutex::lock_contended`, `std::panicking::panic_count::is_zero_slow_path`, `core::result::unwrap_failed`, `once_cell::imp::OnceCell<T>::initialize`, `std::sys::sync::mutex::futex::Mutex::wake`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<alloc::vec::Vec<alloc::string::String>>`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`, `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`, `_Unwind_Resume`
- referenced strings (2 unique):
  - `0x19eb7`: ",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (16): `__rust_alloc`, `__rust_dealloc`, `do_reserve_and_handle`, `drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `format_inner`, `get_results`, `grow_one`, `handle_error`, `initialize`, `is_zero_slow_path`, `join_generic_copy`, `lock_contended`, `memcpy`, `new_string`, `unwrap_failed`, `wake`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_android::native_get_raw_data */

code * __rustcall ckemv_android::native_get_raw_data(undefined8 param_1)

{
  int iVar1;
  char cVar2;
  bool bVar3;
  undefined **ppuVar4;
  undefined ***pppuVar5;
  code *__src;
  undefined ****__n;
  byte bVar6;
  code *pcVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 **ppuVar10;
  undefined ****ppppuVar11;
  long lVar12;
  undefined8 local_488;
  undefined8 **local_480;
  undefined **ppuStack_478;
  undefined ****local_470;
  undefined8 uStack_468;
  undefined8 local_460;
  code *pcStack_458;
  undefined8 local_450;
  undefined *local_438 [3];
  undefined *local_420 [54];
  undefined *local_270 [3];
  undefined *local_258 [3];
  undefined *local_240 [10];
  undefined8 **local_1f0;
  code *pcStack_1e8;
  undefined ****local_1e0;
  long local_1d8;
  long local_1d0;
  long local_1c8;
  undefined8 local_1c0;
  undefined8 uStack_1b8;
  undefined8 local_1b0;
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 local_190;
  undefined8 uStack_188;
  undefined8 local_180;
  undefined **local_178;
  long local_170;
  undefined **local_168;
  undefined **local_160;
  long local_158;
  undefined8 local_150;
  undefined8 uStack_148;
  undefined8 local_140;
  undefined8 local_138;
  undefined8 uStack_130;
  undefined8 local_128;
  undefined8 ***local_120;
  code *local_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined ***local_e0;
  code *pcStack_d8;
  undefined8 ***local_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined ***local_a0;
  code *pcStack_98;
  undefined ****local_90;
  code *local_88;
  undefined ****local_80;
  code *pcStack_78;
  undefined8 local_70;
  
  local_488 = param_1;
  if (DAT_001cb108 != 2) {
    once_cell::imp::OnceCell<T>::initialize(&DISPATCHER,&DISPATCHER);
  }
  do {
    if (DAT_001cb070 != 0) {
      ClearExclusiveLocal();
      std::sys::sync::mutex::futex::Mutex::lock_contended(&DAT_001cb070);
      break;
    }
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
    if (bVar3) {
      DAT_001cb070 = 1;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) == 0) {
    bVar6 = 0;
  }
  else {
    bVar6 = std::panicking::panic_count::is_zero_slow_path();
    bVar6 = bVar6 ^ 1;
  }
  if (DAT_001cb074 != '\0') {
    local_480 = (undefined8 **)&DAT_001cb070;
    uVar8 = (ulong)ppuStack_478 >> 8;
    ppuStack_478 = (undefined **)CONCAT71((int7)uVar8,bVar6);
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_480,
               &
               PTR_drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>_001c1330
               ,&PTR_s_ckemv_android_src_lib_rs_001c1788);
  }
  if (DAT_001cb078 == -0x8000000000000000) {
    jni::wrapper::jnienv::JNIEnv::new_string(&local_a0,&local_488,"{}",2);
    pcVar7 = pcStack_98;
    if ((char)local_a0 != '\x0f') {
      pcStack_458 = pcStack_78;
      local_460 = local_80;
      ppuStack_478 = (undefined **)pcStack_98;
      local_480 = local_a0;
      uStack_468 = local_88;
      local_470 = local_90;
      local_450 = local_70;
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_480,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_001c1310,
                 &PTR_s_ckemv_android_src_lib_rs_001c1960);
    }
    if ((((bVar6 & 1) == 0) &&
        ((std::panicking::panic_count::GLOBAL_PANIC_COUNT & 0x7fffffffffffffff) != 0)) &&
       (uVar8 = std::panicking::panic_count::is_zero_slow_path(), (uVar8 & 1) == 0)) {
      DAT_001cb074 = '\x01';
    }
    do {
      iVar1 = DAT_001cb070;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(0x1cb070,0x10);
      if (bVar3) {
        DAT_001cb070 = 0;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
  }
  else {
    ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(&local_480,&DAT_001cb078);
    pcVar7 = (code *)__rustc[4794b31dd7191200]::__rust_alloc(1,1);
    if (pcVar7 == (code *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,1,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c1470);
    }
    *pcVar7 = (code)0x7b;
    local_1f0 = (undefined ***)0x1;
    local_1e0 = (undefined ****)0x1;
    local_1d8 = 0;
    local_1d0 = 8;
    local_1c8 = 0;
    pcStack_1e8 = pcVar7;
    if (local_270[0] != (undefined *)0x8000000000000000) {
      local_178 = local_270;
      local_e0 = &local_178;
      local_80 = (undefined ****)0x0;
      pcStack_d8 = <&T_as_core::fmt::Display>::fmt;
      local_a0 = (undefined ***)&PTR_DAT_001c17a0;
      local_90 = &local_e0;
      pcStack_98 = (code *)0x2;
      local_88 = (code *)0x1;
      alloc::fmt::format::format_inner(&local_1c0,&local_a0);
      lVar12 = local_1c8;
      if (local_1c8 == local_1d8) {
        alloc::raw_vec::RawVec<T,A>::grow_one(&local_1d8,&PTR_s_ckemv_android_src_lib_rs_001c17c0);
      }
      local_1c8 = lVar12 + 1;
      puVar9 = (undefined8 *)(local_1d0 + lVar12 * 0x18);
      puVar9[1] = uStack_1b8;
      *puVar9 = local_1c0;
      puVar9[2] = local_1b0;
    }
    if (local_258[0] != (undefined *)0x8000000000000000) {
      local_178 = local_258;
      local_e0 = &local_178;
      local_80 = (undefined ****)0x0;
      pcStack_d8 = <&T_as_core::fmt::Display>::fmt;
      local_a0 = (undefined ***)&PTR_s__fci____001c17d8;
      local_90 = &local_e0;
      pcStack_98 = (code *)0x2;
      local_88 = (code *)0x1;
      alloc::fmt::format::format_inner(&local_1a8,&local_a0);
      lVar12 = local_1c8;
      if (local_1c8 == local_1d8) {
        alloc::raw_vec::RawVec<T,A>::grow_one(&local_1d8,&PTR_s_ckemv_android_src_lib_rs_001c17f8);
      }
      local_1c8 = lVar12 + 1;
      puVar9 = (undefined8 *)(local_1d0 + lVar12 * 0x18);
      puVar9[1] = uStack_1a0;
      *puVar9 = local_1a8;
      puVar9[2] = local_198;
    }
    if ((undefined8 *)local_240[0] != (undefined8 *)0x8000000000000000) {
      local_e0 = &local_178;
      local_80 = (undefined ****)0x0;
      local_178 = local_240;
      pcStack_d8 = <&T_as_core::fmt::Display>::fmt;
      local_a0 = (undefined ***)&PTR_s__gpo____001c1810;
      pcStack_98 = (code *)0x2;
      local_90 = &local_e0;
      local_88 = (code *)0x1;
      alloc::fmt::format::format_inner(&local_190,&local_a0);
      lVar12 = local_1c8;
      if (local_1c8 == local_1d8) {
        alloc::raw_vec::RawVec<T,A>::grow_one(&local_1d8,&PTR_s_ckemv_android_src_lib_rs_001c1830);
      }
      local_1c8 = lVar12 + 1;
      puVar9 = (undefined8 *)(local_1d0 + lVar12 * 0x18);
      puVar9[1] = uStack_188;
      *puVar9 = local_190;
      puVar9[2] = local_180;
    }
    if (local_470 != (undefined ****)0x0) {
      lVar12 = (long)local_470 << 5;
      local_178 = (undefined **)0x0;
      local_170 = 8;
      local_168 = (undefined **)0x0;
      ppuVar10 = (undefined8 **)ppuStack_478;
      do {
        local_158 = (long)ppuVar10 + 1;
        local_120 = (undefined8 ***)(ppuVar10 + 1);
        local_a0 = &local_160;
        local_90 = (undefined ****)&local_158;
        pcStack_98 = <&T_as_core::fmt::Display>::fmt;
        local_88 = <&T_as_core::fmt::Display>::fmt;
        pcStack_78 = <&T_as_core::fmt::Display>::fmt;
        local_e0 = (undefined ***)&PTR_s___001c1908;
        pcStack_d8 = (code *)0x4;
        local_c0 = 0;
        local_c8 = 3;
        local_160 = (undefined **)ppuVar10;
        local_d0 = &local_a0;
        local_80 = (undefined ****)&local_120;
        alloc::fmt::format::format_inner(&local_150,&local_e0);
        ppuVar4 = local_168;
        if (local_168 == local_178) {
          alloc::raw_vec::RawVec<T,A>::grow_one(&local_178,&PTR_s_ckemv_android_src_lib_rs_001c1948)
          ;
        }
        local_168 = (undefined **)((long)ppuVar4 + 1);
        puVar9 = (undefined8 *)(local_170 + (long)ppuVar4 * 0x18);
        lVar12 = lVar12 + -0x20;
        puVar9[1] = uStack_148;
        *puVar9 = local_150;
        puVar9[2] = local_140;
        ppuVar10 = ppuVar10 + 4;
      } while (lVar12 != 0);
      alloc::str::join_generic_copy
                (&local_a0,local_170,local_168,",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\"",1);
      local_80 = (undefined ****)0x0;
      local_d0 = local_90;
      pcStack_d8 = pcStack_98;
      local_e0 = local_a0;
      local_120 = &local_e0;
      local_118 = <alloc::string::String_as_core::fmt::Display>::fmt;
      local_a0 = (undefined ***)&DAT_001c1848;
      local_90 = (undefined ****)&local_120;
      pcStack_98 = (code *)0x2;
      local_88 = (code *)0x1;
      alloc::fmt::format::format_inner(&local_138,&local_a0);
      if ((undefined8 ***)local_e0 != (undefined8 ***)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(pcStack_d8,local_e0,1);
      }
      lVar12 = local_1c8;
      if (local_1c8 == local_1d8) {
        alloc::raw_vec::RawVec<T,A>::grow_one(&local_1d8,&PTR_s_ckemv_android_src_lib_rs_001c1868);
      }
      puVar9 = (undefined8 *)(local_1d0 + lVar12 * 0x18);
      puVar9[1] = uStack_130;
      *puVar9 = local_138;
      puVar9[2] = local_128;
      local_1c8 = lVar12 + 1;
      if ((undefined8 **)local_168 != (undefined8 **)0x0) {
        puVar9 = (undefined8 *)(local_170 + 8);
        ppuVar10 = (undefined8 **)local_168;
        do {
          if (puVar9[-1] != 0) {
            __rustc[4794b31dd7191200]::__rust_dealloc(*puVar9,puVar9[-1],1);
          }
          ppuVar10 = (undefined8 **)((lo
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_core::command::ApduCommand::to_bytes`

- Ghidra address: `0x1534a4` (600 bytes)  ·  mangled: `_ZN10ckemv_core7command11ApduCommand8to_bytes17hd3fca7faa9f7accfE`
- signature (Ghidra): `void __rustcall ckemv_core::command::ApduCommand::to_bytes(undefined8 *param_1,long *param_2);`
- capstone offset: `0x534a4`  instr: 166
- direct calls (8): `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `alloc::raw_vec::handle_error`, `_<bytes::bytes_mut::BytesMut as bytes::buf::buf_mut::BufMut>::put_slice`, `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`, `core::panicking::panic_fmt`, `_<bytes::bytes_mut::BytesMut as core::ops::drop::Drop>::drop`, `core::panicking::panic_in_cleanup`, `_Unwind_Resume`
- Ghidra callees (5): `__rust_alloc`, `from`, `handle_error`, `panic_fmt`, `put_slice`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_core::command::ApduCommand::to_bytes */

void __rustcall ckemv_core::command::ApduCommand::to_bytes(undefined8 *param_1,long *param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  long local_e0;
  long lStack_d8;
  ulong local_d0;
  ulong local_c8;
  long local_c0;
  long lStack_b8;
  long local_b0;
  undefined8 local_a8;
  long lStack_a0;
  ulong local_98;
  undefined8 uStack_90;
  ulong local_88;
  undefined **local_80;
  undefined8 uStack_78;
  ulong **local_70;
  undefined8 local_68;
  undefined8 uStack_60;
  ulong *local_50;
  code *pcStack_48;
  ulong *local_40;
  code *pcStack_38;
  ulong local_28;
  
  if (*param_2 == 0) {
    uVar3 = (ulong)*(byte *)((long)param_2 + 0x24) + 4;
  }
  else {
    lVar2 = 4;
    if (param_2[1] != 0) {
      lVar2 = param_2[2] + 5;
    }
    uVar3 = lVar2 + (ulong)*(byte *)((long)param_2 + 0x24);
    if ((long)uVar3 < 0) {
      uVar4 = 0;
      goto LAB_00153520;
    }
  }
  if (uVar3 == 0) {
    local_e0 = 1;
  }
  else {
    uVar4 = 1;
    local_e0 = __rustc[4794b31dd7191200]::__rust_alloc(uVar3,1);
    if (local_e0 == 0) {
LAB_00153520:
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(uVar4,uVar3,&PTR_s__Users_arthur__cargo_registry_sr_001c1e68);
    }
  }
  lStack_d8 = 0;
  uVar1 = 0x40 - LZCOUNT(uVar3 >> 10);
  if (6 < uVar1) {
    uVar1 = 7;
  }
  local_c8 = uVar1 << 2 | 1;
  local_d0 = uVar3;
  local_80._0_1_ = (char)param_2[4];
  <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,&local_80,1);
  local_80._0_1_ = *(undefined1 *)((long)param_2 + 0x21);
  <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,&local_80,1);
  local_80._0_1_ = *(undefined1 *)((long)param_2 + 0x22);
  <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,&local_80,1);
  local_80._0_1_ = *(undefined1 *)((long)param_2 + 0x23);
  <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,&local_80,1);
  if ((*param_2 != 0) && (lVar2 = param_2[1], lVar2 != 0)) {
    lVar5 = param_2[2];
    local_80._0_1_ = (undefined1)lVar5;
    <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,&local_80,1);
    <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,lVar2,lVar5);
  }
  if (*(char *)((long)param_2 + 0x24) == '\x01') {
    local_80._0_1_ = *(undefined1 *)((long)param_2 + 0x25);
    <bytes::bytes_mut::BytesMut_as_bytes::buf::buf_mut::BufMut>::put_slice(&local_e0,&local_80,1);
  }
  if ((local_c8 & 1) == 0) {
    param_1[2] = lStack_d8;
    param_1[3] = local_c8;
    *param_1 = &bytes::bytes_mut::SHARED_VTABLE;
    param_1[1] = local_e0;
    return;
  }
  uVar3 = local_c8 >> 5;
  local_c0 = uVar3 + local_d0;
  lStack_b8 = local_e0 - uVar3;
  local_b0 = uVar3 + lStack_d8;
  <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_a8,&local_c0);
  if (uVar3 <= local_98) {
    param_1[1] = lStack_a0 + uVar3;
    *param_1 = local_a8;
    param_1[3] = uStack_90;
    param_1[2] = local_98 - uVar3;
    return;
  }
  local_50 = &local_88;
  pcStack_48 = core::fmt::num::<impl_core::fmt::Debug_for_usize>::fmt;
  local_40 = &local_28;
  pcStack_38 = core::fmt::num::<impl_core::fmt::Debug_for_usize>::fmt;
  local_28 = local_98;
  local_80 = &PTR_s_cannot_advance_past__remaining___001c1f40;
  uStack_78 = 2;
  local_70 = &local_50;
  local_68 = 2;
  uStack_60 = 0;
  local_88 = uVar3;
                    /* WARNING: Subroutine does not return */
  core::panicking::panic_fmt(&local_80,&PTR_s__Users_arthur__cargo_registry_sr_001c1f60);
}
```

#### `ckemv_emv_kernel::tags::get_tag_name`

- Ghidra address: `0x160308` (2880 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel4tags12get_tag_name17h4b20f44c8b457740E`
- signature (Ghidra): `undefined1  [16] __rustcall ckemv_emv_kernel::tags::get_tag_name(uint *param_1,long param_2);`
- capstone offset: `0x60308`  instr: 720
- referenced strings (31 unique):
  - `0x1ff76`: "Unknown TagCustomer Exclusive DataData Authentication CodeUnpredictable NumberTerminal TypeCardholder Verification Method (CVM) ResultsTerminal Country CodeAmount, Other (Numeric)Amount, Authorized (N\u2026"
  - `0x1ff81`: "Customer Exclusive DataData Authentication CodeUnpredictable NumberTerminal TypeCardholder Verification Method (CVM) ResultsTerminal Country CodeAmount, Other (Numeric)Amount, Authorized (Numeric)Tran\u2026"
  - `0x2076e`: "Application Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/std/src/thread/local.rs/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b557f/hex-0.4.3/src/lib.rsa Disp\u2026"
  - `0x2070f`: "Cardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/std/src/thread/local.\u2026"
  - `0x2075d`: "Application LabelApplication Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/std/src/thread/local.rs/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b557f/hex-0.4.3\u2026"
  - `0x206f4`: "Application Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/li\u2026"
  - `0x20751`: "Track 1 DataApplication LabelApplication Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/std/src/thread/local.rs/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b55\u2026"
  - `0x206da`: "Application Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Identifier (AID)/rustc/6b00bc38801986001\u2026"
  - `0x2073a`: "Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/std/src/thread/local.rs/Users/arthur/.cargo/registry/src/index.c\u2026"
  - `0x206c7`: "Issuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Identifier (AID)/rust\u2026"
  - `0x2071e`: "PAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Identifier (AID)/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/std/src/thread/local.rs/Users/arthur\u2026"
  - `0x206b4`: "Language PreferenceIssuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelApplication Id\u2026"

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::tags::get_tag_name */

undefined1  [16] __rustcall ckemv_emv_kernel::tags::get_tag_name(uint *param_1,long param_2)

{
  undefined8 uVar1;
  char *pcVar2;
  uint uVar3;
  uint uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  undefined1 auVar67 [16];
  undefined1 auVar68 [16];
  undefined1 auVar69 [16];
  undefined1 auVar70 [16];
  undefined1 auVar71 [16];
  undefined1 auVar72 [16];
  undefined1 auVar73 [16];
  undefined1 auVar74 [16];
  undefined1 auVar75 [16];
  undefined1 auVar76 [16];
  undefined1 auVar77 [16];
  undefined1 auVar78 [16];
  undefined1 auVar79 [16];
  undefined1 auVar80 [16];
  undefined1 auVar81 [16];
  undefined1 auVar82 [16];
  undefined1 auVar83 [16];
  undefined1 auVar84 [16];
  undefined1 auVar85 [16];
  undefined1 auVar86 [16];
  undefined1 auVar87 [16];
  undefined1 auVar88 [16];
  undefined1 auVar89 [16];
  undefined1 auVar90 [16];
  
  if (param_2 != 4) {
    if (param_2 == 2) {
      if ((short)*param_1 == 0x4634) {
        auVar7._8_8_ = 0x1c;
        auVar7._0_8_ = "Application Identifier (AID)";
        return auVar7;
      }
      if ((short)*param_1 == 0x3035) {
        auVar9._8_8_ = 0x11;
        auVar9._0_8_ = "Application Label";
        return auVar9;
      }
      if ((short)*param_1 == 0x3635) {
        auVar11._8_8_ = 0xc;
        auVar11._0_8_ = "Track 1 Data";
        return auVar11;
      }
      if ((short)*param_1 == 0x3735) {
        auVar13._8_8_ = 0x17;
        auVar13._0_8_ = "Track 2 Equivalent Data";
        return auVar13;
      }
      if ((short)*param_1 == 0x4135) {
        auVar15._8_8_ = 0x1c;
        auVar15._0_8_ = "PAN (Primary Account Number)";
        return auVar15;
      }
      if ((short)*param_1 == 0x3136) {
        auVar17._8_8_ = 0x14;
        auVar17._0_8_ = "Application Template";
        return auVar17;
      }
      if ((short)*param_1 == 0x4636) {
        auVar19._8_8_ = 0xc;
        auVar19._0_8_ = "FCI Template";
        return auVar19;
      }
      if ((short)*param_1 == 0x3037) {
        auVar21._8_8_ = 0xf;
        auVar21._0_8_ = "Record Template";
        return auVar21;
      }
      if ((short)*param_1 == 0x3737) {
        auVar23._8_8_ = 0x22;
        auVar23._0_8_ = "Response Message Template Format 2";
        return auVar23;
      }
      if ((short)*param_1 == 0x3038) {
        auVar25._8_8_ = 0x22;
        auVar25._0_8_ = "Response Message Template Format 1";
        return auVar25;
      }
      if ((short)*param_1 == 0x3238) {
        auVar27._8_8_ = 0x25;
        auVar27._0_8_ = "AIP (Application Interchange Profile)";
        return auVar27;
      }
      if ((short)*param_1 == 0x3438) {
        auVar29._8_8_ = 7;
        auVar29._0_8_ = "DF Name";
        return auVar29;
      }
      if ((short)*param_1 == 0x3738) {
        auVar31._8_8_ = 0x1e;
        auVar31._0_8_ = "Application Priority Indicator";
        return auVar31;
      }
      if ((short)*param_1 == 0x4338) {
        auVar33._8_8_ = 5;
        auVar33._0_8_ = "CDOL1";
        return auVar33;
      }
      if ((short)*param_1 == 0x4438) {
        auVar35._8_8_ = 5;
        auVar35._0_8_ = "CDOL2";
        return auVar35;
      }
      if ((short)*param_1 == 0x4538) {
        auVar37._8_8_ = 0x29;
        auVar37._0_8_ = "CVM List (Cardholder Verification Method)";
        return auVar37;
      }
      if ((short)*param_1 == 0x4638) {
        auVar39._8_8_ = 0x13;
        auVar39._0_8_ = "CA Public Key Index";
        return auVar39;
      }
      if ((short)*param_1 == 0x3039) {
        auVar41._8_8_ = 0x1d;
        auVar41._0_8_ = "Issuer Public Key Certificate";
        return auVar41;
      }
      if ((short)*param_1 == 0x3239) {
        auVar43._8_8_ = 0x1b;
        auVar43._0_8_ = "Issuer Public Key Remainder";
        return auVar43;
      }
      if ((short)*param_1 == 0x3339) {
        auVar45._8_8_ = 0x25;
        auVar45._0_8_ = "Signed Static Application Data (SSAD)";
        return auVar45;
      }
      if ((short)*param_1 == 0x3439) {
        auVar47._8_8_ = 0x1e;
        auVar47._0_8_ = "AFL (Application File Locator)";
        return auVar47;
      }
      if ((short)*param_1 == 0x3541) {
        auVar49._8_8_ = 0x18;
        auVar49._0_8_ = "FCI Proprietary Template";
        return auVar49;
      }
      if ((short)*param_1 == 0x4138) {
        auVar51._8_8_ = 0x1b;
        auVar51._0_8_ = "Authorization Response Code";
        return auVar51;
      }
      if ((short)*param_1 == 0x3139) {
        auVar53._8_8_ = 0x1a;
        auVar53._0_8_ = "Issuer Authentication Data";
        return auVar53;
      }
      if ((short)*param_1 == 0x3539) {
        auVar55._8_8_ = 0x23;
        auVar55._0_8_ = "Terminal Verification Results (TVR)";
        return auVar55;
      }
      if ((short)*param_1 == 0x4139) {
        auVar57._8_8_ = 0x10;
        auVar57._0_8_ = &DAT_00119640;
        return auVar57;
      }
      if ((short)*param_1 == 0x4339) {
        auVar59._8_8_ = 0x10;
        auVar59._0_8_ = &BYTE_00119550;
        return auVar59;
      }
    }
    auVar5._8_8_ = 0xb;
    auVar5._0_8_ = "Unknown Tag";
    return auVar5;
  }
  if (*param_1 == 0x30324635) {
    auVar8._8_8_ = 0xf;
    auVar8._0_8_ = "Cardholder Name";
    return auVar8;
  }
  if (*param_1 == 0x34324635) {
    auVar10._8_8_ = 0x1b;
    auVar10._0_8_ = "Application Expiration Date";
    return auVar10;
  }
  if (*param_1 == 0x35324635) {
    auVar12._8_8_ = 0x1a;
    auVar12._0_8_ = "Application Effective Date";
    return auVar12;
  }
  if (*param_1 == 0x38324635) {
    auVar14._8_8_ = 0x13;
    auVar14._0_8_ = "Issuer Country Code";
    return auVar14;
  }
  if (*param_1 == 0x44324635) {
    auVar16._8_8_ = 0x13;
    auVar16._0_8_ = "Language Preference";
    return auVar16;
  }
  if (*param_1 == 0x30334635) {
    auVar18._8_8_ = 0xc;
    auVar18._0_8_ = "Service Code";
    return auVar18;
  }
  if (*param_1 == 0x34334635) {
    auVar20._8_8_ = 0x13;
    auVar20._0_8_ = "PAN Sequence Number";
    return auVar20;
  }
  if (*param_1 == 0x43304642) {
    auVar22._8_8_ = 0x1d;
    auVar22._0_8_ = "FCI Issuer Discretionary Data";
    return auVar22;
  }
  if (*param_1 == 0x37304639) {
    auVar24._8_8_ = 0x1f;
    auVar24._0_8_ = "Application Usage Control (AUC)";
    return auVar24;
  }
  if (*param_1 == 0x38304639) {
    auVar26._8_8_ = 0x1a;
    auVar26._0_8_ = "Application Version Number";
    return auVar26;
  }
  if (*param_1 == 0x41304639) {
    auVar28._8_8_ = 0x31;
    auVar28._0_8_ = "Application Selection Registered Proprietary Data";
    return auVar28;
  }
  if (*param_1 == 0x44304639) {
    auVar30._8_8_ = 0x1c;
    auVar30._0_8_ = "Issuer Action Code - Default";
    return auVar30;
  }
  if (*param_1 == 0x45304639) {
    auVar32._8_8_ = 0x1b;
    auVar32._0_8_ = "Issuer Action Code - Denial";
    return auVar32;
  }
  if (*param_1 == 0x46304639) {
    auVar34._8_8_ = 0x1b;
    auVar34._0_8_ = "Issuer Action Code - Online";
    return auVar34;
  }
  if (*param_1 == 0x30314639) {
    auVar36._8_8_ = 0x17;
    auVar36._0_8_ = "Issuer Application Data";
    return auVar36;
  }
  if (*param_1 == 0x31314639) {
    auVar38._8_8_ = 0x17;
    auVar38._0_8_ = "Issuer Code Table Index";
    return auVar38;
  }
  if (*param_1 == 0x32314639) {
    auVar40._8_8_ = 0x1a;
    auVar40._0_8_ = "Application Preferred Name";
    return auVar40;
  }
  if (*param_1 == 0x34314639) {
    auVar42._8_8_ = 0x1f;
    auVar42._0_8_ = "Lower Consecutive Offline Limit";
    return auVar42;
  }
  if (*param_1 == 0x37314639) {
    auVar44._8_8_ = 0xf;
    auVar44._0_8_ = "PIN Try Counter";
    return auVar44;
  }
  if (*param_1 == 0x46314639) {
    auVar46._8_8_ = 0x1a;
    auVar46._0_8_ = "Track 1 Discretionary Data";
    return auVar46;
  }
  if (*param_1 == 0x33324639) {
    auVar48._8_8_ = 0x1f;
    auVar48._0_8_ = "Upper Consecutive Offline Limit";
    return auVar48;
  }
  if (*param_1 == 0x36324639) {
    auVar50._8_8_ = 0x16;
    auVar50._0_8_ = "Application Cryptogram";
    return auVar50;
  }
  if (*param_1 == 0x37324639) {
    auVar52._8_8_ = 0x1b;
    auVar52._0_8_ = "Cryptogram Information Data";
    return auVar52;
  }
  if (*param_1 == 0x32334639) {
    auVar54._8_8_ = 0x1a;
    auVar54._0_8_ = "Issuer Public Key Exponent";
    return auVar54;
  }
  if (*param_1 == 0x36334639) {
    auVar56._8_8_ = 0x25;
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::types::generate_negative_correlated_time`

- Ghidra address: `0x161538` (452 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel5types33generate_negative_correlated_time17h3f3f470658b3f2e4E`
- signature (Ghidra): `uint __rustcall ckemv_emv_kernel::types::generate_negative_correlated_time(byte *param_1,byte *param_2);`
- capstone offset: `0x61538`  instr: 113

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::types::generate_negative_correlated_time */

uint __rustcall
ckemv_emv_kernel::types::generate_negative_correlated_time(byte *param_1,byte *param_2)

{
  long lVar1;
  ulong uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  ulong uVar7;
  uint uVar8;
  ulong uVar9;
  int iVar10;
  
  uVar3 = (uint)param_1[2] + (uint)(param_1[2] >> 4) * -6 & 0xff;
  uVar6 = (uint)param_1[1] + (uint)(param_1[1] >> 4) * -6;
  iVar10 = (uVar3 - (uVar6 & 0xff)) + (uVar6 & 0xff) * 8 +
           ((uint)*param_1 + (uint)(*param_1 >> 4) * -6 & 0xff) * 0x1f;
  uVar3 = (uVar6 & 0xff) + (uVar6 & 0xff) * 0x10 + uVar3 * 0x61;
  lVar1 = (((((ulong)((uint)*param_2 + (uint)(*param_2 >> 4) * -6 & 0xff) * 100 +
             (ulong)(byte)(param_2[1] + (param_2[1] >> 4) * -6)) * 100 +
            (ulong)(byte)(param_2[2] + (param_2[2] >> 4) * -6)) * 100 +
           (ulong)(byte)(param_2[3] + (param_2[3] >> 4) * -6)) * 100 +
          (ulong)(byte)(param_2[4] + (param_2[4] >> 4) * -6)) * 100 +
          (ulong)(byte)(param_2[5] + (param_2[5] >> 4) * -6);
  uVar9 = (ulong)(iVar10 * -0xd + (uint)((ulong)(uint)(iVar10 * 0xd) * 0x61173 >> 0x22) * 0xa8c0 +
                 0x1517f);
  uVar2 = lVar1 + (ulong)(ushort)((short)uVar3 + (short)(uVar3 / 10000) * -10000 + 2000);
  uVar7 = 0;
  if (uVar2 != 0) {
    uVar7 = (lVar1 * uVar9) / uVar2;
  }
  uVar9 = uVar9 - uVar7;
  iVar10 = (int)((uVar9 >> 4) / 0xe1);
  uVar8 = (int)uVar9 + (int)(uVar9 / 0x3c) * -0x3c;
  uVar3 = ((int)uVar9 + iVar10 * -0xe10 & 0xffffU) / 0x3c;
  uVar6 = (uVar8 & 0xff) / 10;
  uVar4 = ((uint)((uVar9 >> 4) / 0xe1) & 0xff) / 10;
  uVar5 = (uVar3 & 0xff) / 10;
  return uVar6 << 0x14 | (uVar8 + uVar6 * -10) * 0x10000 |
         (uVar5 << 0xc | (uVar3 + uVar5 * -10) * 0x100) & 0xffff |
         (iVar10 + uVar4 * -10 | uVar4 << 4) & 0xff;
}
```

#### `_<ckemv_emv_kernel::types::TransactionContext as core::default::Default>::default`

- Ghidra address: `0x1616fc` (100 bytes)  ·  mangled: `_ZN86_$LT$ckemv_emv_kernel..types..TransactionContext$u20$as$u20$core..default..Default$GT$7default17h7060fd0d3361361aE`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::types::TransactionContext_as_core::default::Default>::default(undefined8 *param_1);`
- capstone offset: `0x616fc`  instr: 25
- direct calls (2): `std::sys::thread_local::os::Storage<T>::get`, `std::thread::local::panic_access_error`
- Ghidra callees (2): `get`, `panic_access_error`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::types::TransactionContext as core::default::Default>::default */

void __rustcall
<ckemv_emv_kernel::types::TransactionContext_as_core::default::Default>::default
          (undefined8 *param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
  plVar1 = (long *)std::sys::thread_local::os::Storage<T>::get
                             (&std::hash::random::RandomState::new::KEYS::{{closure}}::VAL,0);
  if (plVar1 != (long *)0x0) {
    lVar3 = plVar1[1];
    lVar2 = *plVar1;
    *(undefined2 *)(param_1 + 8) = 0;
    *(undefined1 *)((long)param_1 + 0x42) = 1;
    param_1[5] = 0;
    param_1[4] = 0;
    param_1[7] = lVar3;
    param_1[6] = lVar2;
    param_1[3] = 0;
    param_1[2] = &DAT_00119d98;
    *plVar1 = lVar2 + 1;
    *param_1 = 0;
    return;
  }
                    /* WARNING: Subroutine does not return */
  std::thread::local::panic_access_error(&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2708);
}
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context`

- Ghidra address: `0x162590` (184 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher11get_context17hade379ef91ee7a47E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context(undefined8 *param_1,long param_2);`
- capstone offset: `0x62590`  instr: 46
- direct calls (1): `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  char cVar6;
  bool bVar7;
  code *pcVar8;
  long *plVar9;
  undefined8 extraout_x12;
  long lVar10;
  undefined8 uVar11;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  if (*(long *)(param_2 + 0x78) != 0) {
                    /* WARNING: Could not recover jumptable at 0x001625c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)(param_2 + 0x80) + 0x30))();
    return;
  }
  uVar1 = *(undefined8 *)(param_2 + 0x60);
  uVar2 = *(undefined8 *)(param_2 + 0x68);
  <hashbrown::raw::RawTable<T,A>as_core::clone::Clone>::clone(&local_60,param_2 + 0x40);
  uVar3 = *(undefined1 *)(param_2 + 0x70);
  plVar9 = *(long **)(param_2 + 0x30);
  uVar4 = *(undefined1 *)(param_2 + 0x71);
  uVar5 = *(undefined1 *)(param_2 + 0x72);
  uVar11 = extraout_x12;
  if (plVar9 != (long *)0x0) {
    do {
      lVar10 = *plVar9;
      cVar6 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(plVar9,0x10);
      if (bVar7) {
        *plVar9 = lVar10 + 1;
        cVar6 = ExclusiveMonitorsStatus();
      }
    } while (cVar6 != '\0');
    if (lVar10 < 0) {
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x162648);
      local_40 = uVar1;
      uStack_38 = uVar2;
      (*pcVar8)();
    }
    uVar11 = *(undefined8 *)(param_2 + 0x38);
  }
  *(undefined1 *)(param_1 + 8) = uVar3;
  param_1[7] = uVar2;
  param_1[6] = uVar1;
  param_1[3] = uStack_58;
  param_1[2] = local_60;
  param_1[5] = uStack_48;
  param_1[4] = uStack_50;
  *(undefined1 *)((long)param_1 + 0x41) = uVar4;
  *(undefined1 *)((long)param_1 + 0x42) = uVar5;
  *param_1 = plVar9;
  param_1[1] = uVar11;
  return;
}
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::status`

- Ghidra address: `0x162648` (156 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher6status17h8f981eca9ffb56aaE`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::status(undefined8 *param_1,long param_2);`
- capstone offset: `0x62648`  instr: 39
- direct calls (2): `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `alloc::raw_vec::handle_error`
- referenced strings (1 unique):
  - `0x20961`: "Dispatcher failed before kernel activation315041592E5359532E4444463031325041592E5359532E4444463031ckemv-emv-kernel/src/dispatcher.rsSelecting PPSE/PSE ()Selecting Application AID: No supported applica\u2026"
- Ghidra callees (2): `__rust_alloc`, `handle_error`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::status */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::status(undefined8 *param_1,long param_2)

{
  char *pcVar1;
  
  if (*(long *)(param_2 + 0x78) != 0) {
                    /* WARNING: Could not recover jumptable at 0x00162664. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)(param_2 + 0x80) + 0x28))(*(long *)(param_2 + 0x78));
    return;
  }
  if (*(char *)(param_2 + 0x89) == '\x03') {
    pcVar1 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x2a,1);
    if (pcVar1 != (char *)0x0) {
      *param_1 = 0x2a;
      param_1[1] = pcVar1;
      builtin_strncpy(pcVar1,"Dispatcher failed before kernel activation",0x2a);
      param_1[2] = 0x2a;
      return;
    }
                    /* WARNING: Subroutine does not return */
    alloc::raw_vec::handle_error(1,0x2a,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2868);
  }
  *param_1 = 0x8000000000000000;
  return;
}
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`

- Ghidra address: `0x1626e4` (352 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher11get_results17ha0616fd21b896704E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(void *param_1,long param_2);`
- capstone offset: `0x626e4`  instr: 93
- direct calls (6): `_<alloc::string::String as core::clone::Clone>::clone`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `ckemv_emv_kernel::results::EmvResults::fallback_track2`, `@0xbcfe0`, `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`, `_Unwind_Resume`
- Ghidra callees (4): `__rust_dealloc`, `clone`, `fallback_track2`, `memcpy`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results(void *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  undefined8 local_2e8;
  undefined8 uStack_2e0;
  undefined8 local_2d8;
  undefined8 uStack_2d0;
  undefined8 local_2b8;
  undefined8 local_2a0;
  undefined8 local_288;
  undefined8 local_270;
  undefined8 local_258;
  undefined8 local_240;
  undefined8 local_228;
  undefined8 local_210;
  undefined8 local_1f8;
  undefined8 local_1e0;
  undefined8 local_1c8;
  undefined8 local_1b0;
  undefined8 local_198;
  undefined8 local_180;
  undefined8 local_168;
  undefined8 local_150;
  undefined8 local_138;
  undefined8 local_120;
  undefined8 local_108;
  undefined8 local_f0;
  long local_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 local_c0;
  undefined8 local_a8;
  undefined8 local_90;
  undefined8 local_78;
  undefined8 local_60;
  undefined8 uStack_58;
  long local_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  if (*(long *)(param_2 + 0x78) == 0) {
    local_2b8 = 0x8000000000000000;
    local_2a0 = 0x8000000000000000;
    local_288 = 0x8000000000000000;
    local_270 = 0x8000000000000000;
    local_258 = 0x8000000000000000;
    local_240 = 0x8000000000000000;
    local_228 = 0x8000000000000000;
    local_210 = 0x8000000000000000;
    local_1f8 = 0x8000000000000000;
    local_1e0 = 0x8000000000000000;
    local_1c8 = 0x8000000000000000;
    local_1b0 = 0x8000000000000000;
    local_198 = 0x8000000000000000;
    local_180 = 0x8000000000000000;
    local_168 = 0x8000000000000000;
    local_150 = 0x8000000000000000;
    local_138 = 0x8000000000000000;
    local_120 = 0x8000000000000000;
    local_108 = 0x8000000000000000;
    local_f0 = 0x8000000000000000;
    local_c0 = 0x8000000000000000;
    local_a8 = 0x8000000000000000;
    local_90 = 0x8000000000000000;
    local_78 = 0x8000000000000000;
    local_2e8 = 0;
    uStack_2e0 = 8;
    uStack_2d0 = 0x8000000000000000;
    local_2d8 = 0;
    lVar2 = *(long *)(param_2 + 0x18);
    lVar1 = local_48;
  }
  else {
    (**(code **)(*(long *)(param_2 + 0x80) + 0x38))(&local_2e8);
    if (local_d8 != -0x8000000000000000) goto LAB_00162818;
    lVar2 = *(long *)(param_2 + 0x18);
    lVar1 = local_48;
  }
  local_48 = -0x8000000000000000;
  if (lVar2 != -0x8000000000000000) {
    local_d8 = -0x8000000000000000;
    local_48 = lVar1;
    <alloc::string::String_as_core::clone::Clone>::clone(&local_48,param_2 + 0x18);
    uStack_58 = uStack_38;
    local_60 = local_40;
    if ((local_d8 != -0x8000000000000000) && (local_d8 != 0)) {
      __rustc[4794b31dd7191200]::__rust_dealloc(local_d0,local_d8,1);
    }
  }
  uStack_c8 = uStack_58;
  local_d0 = local_60;
  local_d8 = local_48;
LAB_00162818:
  results::EmvResults::fallback_track2(&local_2e8);
  memcpy(param_1,&local_2e8,0x288);
  return;
}
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command`

- Ghidra address: `0x162858` (1216 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher12next_command17hdec7ae2305d54225E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command(undefined8 *param_1,long param_2);`
- capstone offset: `0x62858`  instr: 334
- direct calls (10): `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`, `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`, `alloc::fmt::format::format_inner`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_<hex::error::FromHexError as core::fmt::Display>::fmt`, `core::result::unwrap_failed`, `alloc::raw_vec::handle_error`, `core::panicking::panic_in_cleanup`, `_Unwind_Resume`
- referenced strings (5 unique):
  - `0x2098b`: "315041592E5359532E4444463031325041592E5359532E4444463031ckemv-emv-kernel/src/dispatcher.rsSelecting PPSE/PSE ()Selecting Application AID: No supported applications found on this cardA0000000031010PPSE\u2026"
  - `0x209a7`: "325041592E5359532E4444463031ckemv-emv-kernel/src/dispatcher.rsSelecting PPSE/PSE ()Selecting Application AID: No supported applications found on this cardA0000000031010PPSE selected, moving to AID sel\u2026"
  - `0x20a15`: "No supported applications found on this cardA0000000031010PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20830`: "a Display implementation returned an error unexpectedly/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/string.rscalled `Result::unwrap()` on an `Err` valueErrorInvalidHexCharactercin\u2026"
  - `0x208b2`: "called `Result::unwrap()` on an `Err` valueErrorInvalidHexCharactercindexOddLengthInvalidStringLength/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsDispatcher failed before \u2026"
- Ghidra callees (8): `__rust_alloc`, `__rust_dealloc`, `fmt`, `format_inner`, `from`, `from_iter`, `handle_error`, `unwrap_failed`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command(undefined8 *param_1,long param_2)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  undefined ***local_1b0;
  undefined8 uStack_1a8;
  undefined ***local_160;
  undefined8 uStack_158;
  undefined8 local_148;
  undefined8 uStack_140;
  undefined8 local_138;
  long local_130 [3];
  undefined ***local_118;
  int local_110;
  undefined4 local_104;
  undefined ***local_c0;
  int iStack_b8;
  undefined4 uStack_b4;
  undefined4 uStack_b0;
  undefined4 uStack_ac;
  undefined8 uStack_a8;
  undefined4 local_a0;
  undefined2 uStack_9c;
  undefined2 uStack_9a;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined ***local_80;
  undefined **ppuStack_78;
  undefined8 *local_70;
  undefined8 uStack_68;
  undefined8 *local_60;
  undefined8 local_48;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  undefined1 uStack_31;
  
  if (*(long *)(param_2 + 0x78) != 0) {
                    /* WARNING: Could not recover jumptable at 0x0016288c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*(long *)(param_2 + 0x80) + 0x18))(*(long *)(param_2 + 0x78));
    return;
  }
  if (*(char *)(param_2 + 0x89) == '\0') {
    local_1b0 = (undefined ***)"325041592E5359532E4444463031";
    if (*(char *)(param_2 + 0x88) == '\0') {
      local_1b0 = (undefined ***)"315041592E5359532E4444463031";
    }
    uStack_1a8 = 0x1c;
    local_60 = &local_48;
    uStack_68 = 0;
    local_48._0_4_ = 3;
    local_70 = (undefined8 *)0x2;
    ppuStack_78 = (undefined **)0x1c;
    local_80 = local_1b0;
    <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
              (&local_c0,&local_80,&anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023
              );
    if ((int)local_48 == 3) {
      uStack_158 = CONCAT44(uStack_ac,uStack_b0);
      local_160 = (undefined ***)CONCAT44(uStack_b4,iStack_b8);
      if (local_c0 != (undefined ***)0x8000000000000000) {
        local_80 = local_c0;
        <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_c0,&local_80)
        ;
        uStack_40 = 0x160fc8;
        uStack_3c = 0;
        uStack_9c = 1;
        local_80 = (undefined ***)&PTR_s_Selecting_PPSE_PSE____001c2898;
        ppuStack_78 = (undefined **)0x2;
        local_70 = &local_48;
        local_a0 = 0x4a400;
        uStack_68 = 1;
        local_60 = (undefined8 *)0x0;
        local_48 = &local_1b0;
        alloc::fmt::format::format_inner(&local_148,&local_80);
        param_1[1] = uStack_140;
        *param_1 = local_148;
        param_1[3] = local_c0;
        param_1[2] = local_138;
        param_1[5] = CONCAT44(uStack_ac,uStack_b0);
        param_1[4] = CONCAT44(uStack_b4,iStack_b8);
        param_1[7] = CONCAT26(uStack_9a,CONCAT24(uStack_9c,local_a0));
        param_1[6] = uStack_a8;
        return;
      }
    }
    else {
      uStack_158 = CONCAT44(uStack_3c,uStack_40);
      local_160 = (undefined ***)CONCAT44(local_48._4_4_,(int)local_48);
      if (local_c0 != (undefined ***)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(CONCAT44(uStack_b4,iStack_b8),local_c0,1);
      }
    }
    ppuStack_78 = (undefined **)uStack_158;
    local_80 = local_160;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              ("called `Result::unwrap()` on an `Err` value",0x2b,&local_80,&DAT_001c2808,
               &PTR_s_ckemv_emv_kernel_src_dispatcher__001c2880);
  }
  if (*(char *)(param_2 + 0x89) != '\x01') {
    *param_1 = 0x8000000000000000;
    return;
  }
  if (*(long *)(param_2 + 0x10) != 0) {
    local_130[0] = *(long *)(param_2 + 8);
    lVar3 = *(long *)(param_2 + 0x10) * 0x18;
    do {
      ppuStack_78 = *(undefined ***)(local_130[0] + 0x10);
      if ((9 < ppuStack_78) &&
         ((local_80 = *(undefined ****)(local_130[0] + 8),
          *local_80 == (undefined **)0x3030303030303041 && *(short *)(local_80 + 1) == 0x3330 ||
          (*local_80 == (undefined **)0x3030303030303041 && *(short *)(local_80 + 1) == 0x3430)))) {
        if (((ulong)ppuStack_78 & 1) == 0) {
          local_60 = &local_48;
          local_48._0_4_ = 3;
          uStack_68 = 0;
          local_70 = (undefined8 *)0x2;
          <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
                    (&local_c0,&local_80,
                     &anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023);
          iVar1 = (int)local_48;
          if ((int)local_48 == 3) {
            local_160 = (undefined ***)CONCAT44(uStack_b0,uStack_b4);
            uStack_158 = CONCAT44(uStack_158._4_4_,uStack_ac);
            iVar1 = iStack_b8;
            if (local_c0 != (undefined ***)0x8000000000000000) {
              local_118 = local_c0;
              local_110 = iStack_b8;
              local_104 = uStack_ac;
              <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from
                        (&local_c0,&local_118);
              local_48 = (undefined ****)local_130;
              uStack_40 = 0x160fb4;
              uStack_3c = 0;
              local_80 = (undefined ***)&PTR_s_Selecting_Application_AID__001c28b8;
              ppuStack_78 = (undefined **)0x1;
              local_70 = &local_48;
              uStack_9c = 1;
              local_a0 = 0x4a400;
              uStack_68 = 1;
              local_60 = (undefined8 *)0x0;
              alloc::fmt::format::format_inner(&local_98,&local_80);
              param_1[1] = uStack_90;
              *param_1 = local_98;
              param_1[3] = local_c0;
              param_1[2] = local_88;
              param_1[5] = CONCAT44(uStack_ac,uStack_b0);
              param_1[4] = CONCAT44(uStack_b4,iStack_b8);
              param_1[7] = CONCAT26(uStack_9a,CONCAT24(uStack_9c,local_a0));
              param_1[6] = uStack_a8;
              return;
            }
          }
          else {
            local_160 = (undefined ***)CONCAT44(uStack_40,local_48._4_4_);
            uStack_158 = CONCAT44(uStack_158._4_4_,uStack_3c);
            if (local_c0 != (undefined ***)0x0) {
              __rustc[4794b31dd7191200]::__rust_dealloc(CONCAT44(uStack_b4,iStack_b8),local_c0,1);
            }
          }
        }
        else {
          iVar1 = 1;
        }
        uStack_b0 = 0;
        uStack_ac = 0;
        local_48._4_4_ = SUB84(local_160,0);
        uStack_40 = (undefined4)((ulong)local_160 >> 0x20);
        local_c0 = (undefined ***)0x0;
        iStack_b8 = 1;
        uStack_b4 = 0;
        uStack_3c = (undefined4)uStack_158;
        local_70 = (undefined8 *)0xe0000020;
        local_80 = (undefined ***)&local_c0;
        ppuStack_78 = &PTR_drop_in_place<alloc::string::String>_001c27a0;
        local_48._0_4_ = iVar1;
        iVar1 = <hex::error::FromHexError_as_core::fmt::Display>::fmt(&local_48,&local_80);
        if (iVar1 == 0) {
          *(int *)(param_1 + 2) = iStack_b8;
          *(ulong *)((long)param_1 + 0x14) = CONCAT44(uStack_b0,uStack_b4);
          *(undefined4 *)((long)param_1 + 0x1c) = uStack_ac;
          *param_1 = 0x8000000000000001;
          param_1[1] = local_c0;
          return;
        }
                    /* WARNING: Subroutine does not return */
        core::result::unwrap_failed
                  ("a Display implementation returned an error unexpectedly",0x37,&uStack_31,
                   &DAT_001c27e8,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c27d0);
      }
      lVar3 = lVar3 + -0x18;
      local_130[0] = local_130[0] + 0x18;
    } while (lVar3 != 0);
  }
  *(undefined1 *)(param_2 + 0x89) = 3;
  pcVar2 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x2c,1);
  if (pcVar2 != (char *)0x0) {
    param_1[2] = pcVar2;
    param_1[3] = 0x2c;
    builtin_strncpy(pcVar2,"No supported applications found on this card",0x2c);
    param_1[1] = 0x2c;
    *param_1 = 0x8000000000000001;
    return;
  }
                    /* WARNING: Subroutine does not return */
  alloc::raw_vec::handle_error(1,0x2c,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2868);
}
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response`

- Ghidra address: `0x162d90` (2260 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher16process_response17h04bcc06c585ce401E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response(undefined8 *param_1,long *param_2,long *param_3,uint param_4);`
- capstone offset: `0x62d90`  instr: 643
- direct calls (28): `iso7816_tlv::ber::tlv::Tlv::parse_all`, `ckemv_emv_kernel::results::build_tlv_tree`, `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `_<alloc::string::String as core::clone::Clone>::clone`, `alloc::fmt::format::format_inner`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `core::ptr::drop_in_place<core::option::Option<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>>`, `_<alloc::vec::Vec<T,A> as core::ops::drop::Drop>::drop`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse`, `core::ptr::drop_in_place<alloc::vec::Vec<alloc::string::String>>`, `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`, `alloc::vec::Vec<T,A>::push`, `_<ckemv_emv_kernel::types::TransactionContext as core::clone::Clone>::clone`, `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`, `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::visa::VisaKernel>`, `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`, `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::mchip::MastercardKernel>`, `@0xbcfe0`, `alloc::alloc::exchange_malloc`, `core::ptr::drop_in_place<core::option::Option<alloc::boxed::Box<dyn ckemv_emv_kernel::types::EmvKernelStrategy>>>`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<ckemv_emv_kernel::types::StepResult>` …
- referenced strings (9 unique):
  - `0x20a41`: "A0000000031010PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20000`: "minal Country CodeAmount, Other (Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indica\u2026"
  - `0x20aa3`: "PPSE failed, falling back to default AIDAPDU Error: "
  - `0x20020`: "(Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indicator (FFI)Card Transaction Qualif\u2026"
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x20a4f`: "PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20a86`: "Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20a15`: "No supported applications found on this cardA0000000031010PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x202b8`: " CertificateApplication Currency CodePDOL (Processing Options Data Object List)Application Transaction Counter (ATC)Issuer Public Key ExponentCryptogram Information DataApplication CryptogramUpper Con\u2026"
- Ghidra callees (22): `__rust_alloc`, `__rust_dealloc`, `build_tlv_tree`, `clone`, `drop`, `drop_in_place<alloc::vec::Vec<alloc::string::String>>`, `drop_in_place<ckemv_emv_kernel::kernels::mchip::MastercardKernel>`, `drop_in_place<ckemv_emv_kernel::kernels::visa::VisaKernel>`, `drop_in_place<core::option::Option<alloc::boxed::Box<dyn_ckemv_emv_kernel::types::EmvKernelStrategy>>>`, `drop_in_place<core::option::Option<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>>`, `drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `exchange_malloc`, `extract_aids_from_ppse`, `format_inner`, `from_iter`, `grow_one`, `handle_error`, `memcpy`, `parse_all`, `process_response`, `push`, `to_vec`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response
          (undefined8 *param_1,long *param_2,long *param_3,uint param_4)

{
  undefined1 uVar1;
  code *pcVar2;
  undefined ***pppuVar3;
  code *pcVar4;
  undefined8 *puVar5;
  char *pcVar6;
  void *__dest;
  ulong uVar7;
  char cVar8;
  undefined8 *puVar9;
  long lVar10;
  long *plVar11;
  undefined8 uVar12;
  long lVar13;
  undefined **ppuVar14;
  undefined **local_720;
  code *pcStack_718;
  undefined ***local_710;
  undefined **local_700;
  code *pcStack_6f8;
  undefined ***local_6f0;
  undefined *local_6e8;
  long *local_6e0;
  ulong local_6d8;
  undefined **local_6d0;
  code *pcStack_6c8;
  undefined ***local_6c0;
  code *pcStack_6b8;
  undefined8 local_6a0;
  undefined8 local_688;
  undefined8 local_670;
  undefined8 local_658;
  undefined8 local_640;
  undefined8 local_628;
  undefined8 local_610;
  undefined8 local_5f8;
  undefined8 local_5e0;
  undefined8 local_5c8;
  undefined8 local_5b0;
  undefined8 local_598;
  undefined8 local_580;
  undefined8 local_568;
  undefined8 local_550;
  undefined8 local_538;
  undefined8 local_520;
  undefined8 local_508;
  undefined8 local_4f0;
  undefined8 local_4d8;
  undefined8 local_4c0;
  undefined8 local_4a8;
  undefined8 local_490;
  undefined8 local_478;
  undefined8 local_460;
  undefined8 local_448;
  undefined8 local_440;
  undefined8 local_438;
  undefined8 local_430;
  undefined **local_418;
  code *pcStack_410;
  undefined ***pppuStack_408;
  undefined8 uStack_400;
  undefined1 *local_3f8;
  undefined8 uStack_3f0;
  undefined8 uStack_3e8;
  undefined8 uStack_3e0;
  undefined8 local_3d8;
  undefined8 local_3d0;
  undefined8 local_3c0;
  code *pcStack_3b8;
  undefined ***pppuStack_3b0;
  undefined8 local_3a8;
  undefined1 *local_3a0;
  undefined8 uStack_398;
  undefined8 local_390;
  undefined ***pppuStack_388;
  undefined8 local_380;
  undefined **local_370;
  code *pcStack_368;
  undefined ***local_360;
  undefined8 local_358;
  undefined1 *local_350;
  undefined8 uStack_348;
  undefined8 uStack_340;
  undefined8 uStack_338;
  undefined8 local_330;
  undefined8 local_68;
  undefined8 uStack_60;
  undefined8 local_58;
  
  local_720 = (undefined **)0x0;
  if (param_2[0xf] != 0) {
                    /* WARNING: Could not recover jumptable at 0x00162df0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(param_2[0x10] + 0x20))(param_1,param_2[0xf],param_3,param_4);
    return;
  }
  if ((((param_4 & 1) == 0) || (*param_3 == 0)) || (param_3[1] == 0)) {
    local_720 = (undefined **)0x8000000000000000;
    cVar8 = (char)param_3[4];
    if (cVar8 == -0x70) goto LAB_00162e60;
LAB_00162fec:
    if (*(char *)((long)param_2 + 0x89) != '\0') {
      uVar1 = *(undefined1 *)((long)param_3 + 0x21);
      *(undefined1 *)((long)param_2 + 0x89) = 3;
      local_390._0_2_ = CONCAT11(uVar1,cVar8);
      local_6d0 = (undefined **)&local_390;
      local_3c0._0_2_ = CONCAT11(uVar1,cVar8);
      pcStack_6c8 = core::fmt::num::<impl_core::fmt::UpperHex_for_i8>::fmt;
      local_6c0 = (undefined ***)((ulong)&local_3c0 | 1);
      pcStack_6b8 = core::fmt::num::<impl_core::fmt::UpperHex_for_i8>::fmt;
      local_370 = &PTR_s_APDU_Error__001c2988;
      local_350 = &DAT_00120ad8;
      local_360 = &local_6d0;
      pcStack_368 = (code *)0x2;
      uStack_348 = 2;
      local_358 = 2;
      alloc::fmt::format::format_inner(&local_700,&local_370);
LAB_00163070:
      param_1[2] = pcStack_6f8;
      param_1[1] = local_700;
      param_1[3] = local_6f0;
      *param_1 = 0x8000000000000000;
LAB_00163080:
      ppuVar14 = local_720;
      if (local_720 == (undefined **)0x8000000000000000) {
        return;
      }
      <alloc::vec::Vec<T,A>as_core::ops::drop::Drop>::drop(&local_720);
      if (ppuVar14 == (undefined **)0x0) {
        return;
      }
      __rustc[4794b31dd7191200]::__rust_dealloc(pcStack_718,(long)ppuVar14 * 0x70,8);
      return;
    }
    uVar12 = 0xe;
    puVar5 = (undefined8 *)__rustc[4794b31dd7191200]::__rust_alloc(0xe,1);
    if (puVar5 == (undefined8 *)0x0) {
LAB_00163650:
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,uVar12,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2868);
    }
    lVar13 = param_2[2];
    lVar10 = *param_2;
    *puVar5 = 0x3030303030303041;
    *(char (*) [8])((long)puVar5 + 6) = (char  [8])0x3031303133303030;
    if (lVar13 == lVar10) {
      alloc::raw_vec::RawVec<T,A>::grow_one
                (param_2,&PTR_s_ckemv_emv_kernel_src_dispatcher__001c2970);
    }
    puVar9 = (undefined8 *)(param_2[1] + lVar13 * 0x18);
    uVar12 = 0x28;
    *puVar9 = 0xe;
    puVar9[1] = puVar5;
    puVar9[2] = 0xe;
    param_2[2] = lVar13 + 1;
    *(undefined1 *)((long)param_2 + 0x89) = 1;
    pcVar6 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x28,1);
    if (pcVar6 == (char *)0x0) goto LAB_00163650;
    uVar12 = 0x28;
    *(char (*) [8])(pcVar6 + 0x20) = (char  [8])0x44494120746c7561;
    pcVar6[8] = 'l';
    pcVar6[9] = 'e';
    pcVar6[10] = 'd';
    pcVar6[0xb] = ',';
    pcVar6[0xc] = ' ';
    pcVar6[0xd] = 'f';
    pcVar6[0xe] = 'a';
    pcVar6[0xf] = 'l';
    pcVar6[0] = 'P';
    pcVar6[1] = 'P';
    pcVar6[2] = 'S';
    pcVar6[3] = 'E';
    pcVar6[4] = ' ';
    pcVar6[5] = 'f';
    pcVar6[6] = 'a';
    pcVar6[7] = 'i';
    pcVar6[0x18] = 'k';
    pcVar6[0x19] = ' ';
    pcVar6[0x1a] = 't';
    pcVar6[0x1b] = 'o';
    pcVar6[0x1c] = ' ';
    pcVar6[0x1d] = 'd';
    pcVar6[0x1e] = 'e';
    pcVar6[0x1f] = 'f';
    pcVar6[0x10] = 'l';
    pcVar6[0x11] = 'i';
    pcVar6[0x12] = 'n';
    pcVar6[0x13] = 'g';
    pcVar6[0x14] = ' ';
    pcVar6[0x15] = 'b';
    pcVar6[0x16] = 'a';
    pcVar6[0x17] = 'c';
  }
  else {
    iso7816_tlv::ber::tlv::Tlv::parse_all(&local_370,param_3[1],param_3[2]);
    pppuVar3 = local_360;
    pcVar2 = pcStack_368;
    results::build_tlv_tree(&local_6d0,pcStack_368,local_360);
    lVar10 = (long)pppuVar3 + 1;
    pcVar4 = pcVar2;
    while (lVar10 = lVar10 + -1, lVar10 != 0) {
      core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>(pcVar4);
      pcVar4 = pcVar4 + 0x30;
    }
    if (local_370 != (undefined **)0x0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(pcVar2,(long)local_370 * 0x30,8);
    }
    pcStack_718 = pcStack_6c8;
    local_720 = local_6d0;
    local_710 = local_6c0;
    cVar8 = (char)param_3[4];
    if (cVar8 != -0x70) goto LAB_00162fec;
LAB_00162e60:
    if (*(char *)((long)param_3 + 0x21) != '\0') goto LAB_00162fec;
    if (*(char *)((long)param_2 + 0x89) != '\0') {
      if (*(char *)((long)param_2 + 0x89) == '\x01') {
        if (param_2[2] != 0) {
          lVar10 = param_2[1];
          lVar13 = param_2[2] * 0x18;
          do {
            if ((9 < *(ulong *)(lVar10 + 0x10)) &&
               ((plVar11 = *(long **)(lVar10 + 8),
                *plVar11 == 0x3030303030303041 && (short)plVar11[1] == 0x3330 ||
                (*plVar11 == 0x3030303030303041 && (short)plVar11[1] == 0x3430)))) {
              <alloc::string::String_as_core::clone::Clone>::clone(&local_6e8);
              plVar11 = local_6e0;
              if (local_6d8 < 10) {
LAB_00162f30:
                local_6d0 = &local_6e8;
                local_350 = (undefined1 *)0x0;
                *(undefined1 *)((long)param_2 + 0x89) = 3;
                pcStack_6c8 = <alloc::string::String_as_core::fmt::Display>::fmt;
                local_370 = &PTR_s_Unsupported_AID__001c28e0;
                local_360 = &local_6d0;
                pcStack_368 = (code *)0x1;
                local_358 = 1;
                alloc::fmt::format::format_inner(&local_68,&local_370);
                *param_1 = 0x8000000000000000;
                param_1[2] = uStack_60;
                param_1[1] = local_68;
                param_1[3] = local_58;
              }
              else {
                if (*local_6e0 == 0x3030303030303041 && (short)local_6e0[1] == 0x3330) {
                  <ckemv_emv_kernel::types::TransactionContext_as_core::clone::Clone>::clone
                            (&local_370,param_2 + 6);
                  local_430 = 0x8000000000000000;
                  uStack_3f0 = uStack_348;
                  local_3f8 = local_350;
                  uStack_3e0 = uStack_338;
                  uStack_3e8 = uStack_340;
                  local_3d8 = local_330;
                  local_6a0 = 0x8000000000000000;
                  pcStack_410 = pcStack_368;
                  local_418 = local_370;
                  uStack_400 = local_358;
                  pppuStack_408 = local_360;
                  local_688 = 0x8000000000000000;
                  local_6d0 = (undefined **)0x0;
                  pcStack_6c8 = (code *)&DAT_00000008;
                  pcStack_6b8 = (code *)0x8000000000000000;
                  local_6c0 = (undefined ***)0x0;
                  local_670 = 0x8000000000000000;
                  local_658 = 0x8000000000000000;
                  local_640 = 0x8000000000000000;
                  local_628 = 0x8000000000000000;
                  local_610 = 0x8000000000000000;
                  local_5f8 = 0x8000000000000000;
                  local_5e0 = 0x8000000000000000;
                  local_5c8 = 0x8000000000000000;
                  local_5b0 = 0x8000000000000000;
                  local_598 = 0x8000000000000000;
                  local_580 = 0x8000000000000000;
                  local_568 = 0x8000000000000000;
                  local_550 = 0x8000000000000000;
                  local_538 = 0x8000000000000000;
                  local_520 = 0x8000000000000000;
                  local_508 = 0x8000000000000000;
                  local_4f0 = 0x8000000000000000;
                  local_4d8 = 0x8000000000000000;
                  local_4c0 = 0x8000000000000000;
                  local_4a8 = 0x8000000000000000;
             
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse`

- Ghidra address: `0x16379c` (216 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher22extract_aids_from_ppse17h5c53f3eb221f0275E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse(undefined8 *param_1,undefined8 param_2,undefined8 param_3);`
- capstone offset: `0x6379c`  instr: 73
- direct calls (7): `iso7816_tlv::ber::tlv::Tlv::parse_all`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive`, `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `_<alloc::vec::into_iter::IntoIter<T,A> as core::ops::drop::Drop>::drop`, `core::ptr::drop_in_place<alloc::vec::Vec<alloc::string::String>>`, `_Unwind_Resume`, `core::panicking::panic_in_cleanup`
- Ghidra callees (4): `drop`, `drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `find_aids_recursive`, `parse_all`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse
          (undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 local_98;
  long *local_90;
  long lStack_88;
  long *local_80;
  long *local_78;
  undefined8 local_70;
  long *plStack_68;
  long local_60;
  long local_58;
  long lStack_50;
  long local_48;
  long lStack_40;
  long local_38;
  
  local_a0 = 0;
  local_b0 = 0;
  uStack_a8 = 8;
  iso7816_tlv::ber::tlv::Tlv::parse_all(&local_98,param_2,param_3);
  plVar3 = local_90 + lStack_88 * 6;
  local_80 = local_90;
  local_78 = local_90;
  local_70 = local_98;
  plVar1 = local_78;
  plStack_68 = plVar3;
  if (lStack_88 != 0) {
    do {
      plVar2 = local_90 + 6;
      plVar1 = plVar2;
      if (*local_90 == 2) break;
      local_38 = local_90[5];
      lStack_40 = local_90[4];
      local_48 = local_90[3];
      lStack_50 = local_90[2];
      local_58 = local_90[1];
      local_60 = *local_90;
      find_aids_recursive(&local_60,&local_b0);
      core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>(&local_60);
      local_90 = plVar2;
      plVar1 = plVar3;
    } while (plVar2 != plVar3);
  }
  local_78 = plVar1;
  <alloc::vec::into_iter::IntoIter<T,A>as_core::ops::drop::Drop>::drop(&local_80);
  param_1[1] = uStack_a8;
  *param_1 = local_b0;
  param_1[2] = local_a0;
  return;
}
```

#### `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive`

- Ghidra address: `0x1638c0` (248 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel10dispatcher21TransactionDispatcher19find_aids_recursive17hd7632c9c50d29614E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive(int *param_1,long *param_2);`
- capstone offset: `0x638c0`  instr: 70
- direct calls (6): `iso7816_tlv::ber::tag::Tag::to_bytes`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_Unwind_Resume`
- referenced strings (1 unique):
  - `0x19810`: "0123456789ABCDEF\u0001"
- Ghidra callees (4): `find_aids_recursive`, `from_iter`, `grow_one`, `to_bytes`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive */

void __rustcall
ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive(int *param_1,long *param_2)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined1 auVar4 [16];
  undefined8 local_58;
  undefined8 uStack_50;
  undefined8 local_48;
  long local_40;
  long local_38;
  undefined1 *puStack_30;
  undefined4 local_28;
  
  auVar4 = iso7816_tlv::ber::tag::Tag::to_bytes(param_1 + 8);
  if (*param_1 == 1) {
    if ((auVar4._8_8_ == 1) && (*auVar4._0_8_ == 'O')) {
      local_40 = *(long *)(param_1 + 4);
      local_38 = local_40 + *(long *)(param_1 + 6);
      local_28 = 0x110000;
      puStack_30 = &anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (&local_58,&local_40);
      lVar3 = param_2[2];
      if (lVar3 == *param_2) {
        alloc::raw_vec::RawVec<T,A>::grow_one
                  (param_2,&PTR_s_ckemv_emv_kernel_src_dispatcher__001c29a8);
      }
      puVar2 = (undefined8 *)(param_2[1] + lVar3 * 0x18);
      puVar2[1] = uStack_50;
      *puVar2 = local_58;
      puVar2[2] = local_48;
      param_2[2] = lVar3 + 1;
      return;
    }
  }
  else if (*(long *)(param_1 + 6) != 0) {
    lVar3 = *(long *)(param_1 + 6) * 0x30;
    lVar1 = *(long *)(param_1 + 4);
    do {
      find_aids_recursive(lVar1,param_2);
      lVar3 = lVar3 + -0x30;
      lVar1 = lVar1 + 0x30;
    } while (lVar3 != 0);
  }
  return;
}
```

#### `_<ckemv_emv_kernel::types::TransactionContext as core::clone::Clone>::clone`

- Ghidra address: `0x1639d8` (148 bytes)  ·  mangled: `_ZN82_$LT$ckemv_emv_kernel..types..TransactionContext$u20$as$u20$core..clone..Clone$GT$5clone17h8147b7ec8ff35dc8E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::types::TransactionContext_as_core::clone::Clone>::clone(undefined8 *param_1,undefined8 *param_2);`
- capstone offset: `0x639d8`  instr: 37
- direct calls (1): `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::types::TransactionContext as core::clone::Clone>::clone */

void __rustcall
<ckemv_emv_kernel::types::TransactionContext_as_core::clone::Clone>::clone
          (undefined8 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  char cVar6;
  bool bVar7;
  code *pcVar8;
  long *plVar9;
  undefined8 extraout_x12;
  long lVar10;
  undefined8 uVar11;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  uVar1 = param_2[6];
  uVar2 = param_2[7];
  <hashbrown::raw::RawTable<T,A>as_core::clone::Clone>::clone(&local_60,param_2 + 2);
  uVar3 = *(undefined1 *)(param_2 + 8);
  plVar9 = (long *)*param_2;
  uVar4 = *(undefined1 *)((long)param_2 + 0x41);
  uVar5 = *(undefined1 *)((long)param_2 + 0x42);
  uVar11 = extraout_x12;
  if (plVar9 != (long *)0x0) {
    do {
      lVar10 = *plVar9;
      cVar6 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(plVar9,0x10);
      if (bVar7) {
        *plVar9 = lVar10 + 1;
        cVar6 = ExclusiveMonitorsStatus();
      }
    } while (cVar6 != '\0');
    if (lVar10 < 0) {
                    /* WARNING: Does not return */
      pcVar8 = (code *)SoftwareBreakpoint(1,0x163a6c);
      local_40 = uVar1;
      uStack_38 = uVar2;
      (*pcVar8)();
    }
    uVar11 = param_2[1];
  }
  *(undefined1 *)(param_1 + 8) = uVar3;
  param_1[7] = uVar2;
  param_1[6] = uVar1;
  param_1[3] = uStack_58;
  param_1[2] = local_60;
  param_1[5] = uStack_48;
  param_1[4] = uStack_50;
  *(undefined1 *)((long)param_1 + 0x41) = uVar4;
  *(undefined1 *)((long)param_1 + 0x42) = uVar5;
  *param_1 = plVar9;
  param_1[1] = uVar11;
  return;
}
```

#### `ckemv_emv_kernel::results::EmvResults::fallback_track2`

- Ghidra address: `0x163bec` (644 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel7results10EmvResults15fallback_track217hcc49c1693064801cE`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::results::EmvResults::fallback_track2(long param_1);`
- capstone offset: `0x63bec`  instr: 161
- direct calls (5): `core::slice::memchr::memchr_aligned`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `@0xbcfe0`, `core::str::slice_error_fail`, `alloc::raw_vec::handle_error`
- Ghidra callees (5): `__rust_alloc`, `handle_error`, `memchr_aligned`, `memcpy`, `slice_error_fail`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::results::EmvResults::fallback_track2 */

void __rustcall ckemv_emv_kernel::results::EmvResults::fallback_track2(long param_1)

{
  void *__src;
  ulong uVar1;
  undefined4 uVar2;
  void *__dest;
  undefined4 *puVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  undefined1 auVar9 [16];
  
  if (*(long *)(param_1 + 0xc0) != -0x8000000000000000) {
    lVar6 = *(long *)(param_1 + 0x78);
    lVar8 = *(long *)(param_1 + 0xa8);
    if ((lVar6 == -0x8000000000000000) || (lVar8 == -0x8000000000000000)) {
      __src = *(void **)(param_1 + 200);
      uVar1 = *(ulong *)(param_1 + 0xd0);
      uVar5 = 0;
      do {
        if (uVar1 - uVar5 < 0x10) {
          if (uVar1 == uVar5) break;
          uVar4 = 0;
          while (*(char *)((long)__src + uVar4 + uVar5) != 'D') {
            uVar4 = uVar4 + 1;
            if (uVar1 - uVar5 == uVar4) goto LAB_00163cc0;
          }
        }
        else {
          auVar9 = core::slice::memchr::memchr_aligned(0x44);
          uVar4 = auVar9._8_8_;
          if ((auVar9._0_8_ & 1) == 0) break;
        }
        uVar4 = uVar4 + uVar5;
        if ((uVar4 < uVar1) && (*(char *)((long)__src + uVar4) == 'D')) goto LAB_00163d34;
        uVar5 = uVar4 + 1;
      } while (uVar5 <= uVar1);
LAB_00163cc0:
      uVar5 = 0;
      do {
        if (uVar1 - uVar5 < 0x10) {
          if (uVar1 == uVar5) {
            return;
          }
          uVar4 = 0;
          while (*(char *)((long)__src + uVar4 + uVar5) != '=') {
            uVar4 = uVar4 + 1;
            if (uVar1 - uVar5 == uVar4) {
              return;
            }
          }
        }
        else {
          auVar9 = core::slice::memchr::memchr_aligned(0x3d);
          uVar4 = auVar9._8_8_;
          if ((auVar9._0_8_ & 1) == 0) {
            return;
          }
        }
        uVar4 = uVar4 + uVar5;
        if ((uVar4 < uVar1) && (*(char *)((long)__src + uVar4) == '=')) goto LAB_00163d34;
        uVar5 = uVar4 + 1;
      } while (uVar5 <= uVar1);
    }
  }
  return;
LAB_00163d34:
  if (lVar6 == -0x8000000000000000) {
    if ((long)uVar4 < 0) {
      uVar7 = 0;
LAB_00163e48:
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(uVar7,uVar4,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2a38);
    }
    if (uVar4 == 0) {
      __dest = (void *)0x1;
    }
    else {
      uVar7 = 1;
      __dest = (void *)__rustc[4794b31dd7191200]::__rust_alloc(uVar4,1);
      if (__dest == (void *)0x0) goto LAB_00163e48;
    }
    memcpy(__dest,__src,uVar4);
    *(ulong *)(param_1 + 0x78) = uVar4;
    *(void **)(param_1 + 0x80) = __dest;
    *(ulong *)(param_1 + 0x88) = uVar4;
  }
  if (lVar8 != -0x8000000000000000) {
    return;
  }
  uVar5 = uVar4 + 5;
  if (uVar1 < uVar5) {
    return;
  }
  uVar4 = uVar4 + 1;
  if (uVar5 < uVar4) goto LAB_00163e2c;
  if (uVar4 != 0) {
    if (uVar4 < uVar1) {
      if (*(char *)((long)__src + uVar4) < -0x40) goto LAB_00163e2c;
    }
    else if (uVar4 != uVar1) goto LAB_00163e2c;
    if (uVar5 == 0) goto LAB_00163de4;
  }
  if ((uVar5 < uVar1) && (*(char *)((long)__src + uVar5) < -0x40)) {
LAB_00163e2c:
                    /* WARNING: Subroutine does not return */
    core::str::slice_error_fail
              (__src,uVar1,uVar4,uVar5,&PTR_s_ckemv_emv_kernel_src_results_rs_001c2a50);
  }
LAB_00163de4:
  puVar3 = (undefined4 *)__rustc[4794b31dd7191200]::__rust_alloc(4,1);
  if (puVar3 != (undefined4 *)0x0) {
    uVar2 = *(undefined4 *)((long)__src + uVar4);
    *(undefined8 *)(param_1 + 0xa8) = 4;
    *(undefined4 **)(param_1 + 0xb0) = puVar3;
    *puVar3 = uVar2;
    *(undefined8 *)(param_1 + 0xb8) = 4;
    return;
  }
                    /* WARNING: Subroutine does not return */
  alloc::raw_vec::handle_error(1,4,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2a38);
}
```

#### `ckemv_emv_kernel::results::build_tlv_tree`

- Ghidra address: `0x163e70` (884 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel7results14build_tlv_tree17h459b32cc2371b8a1E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::results::build_tlv_tree(long *param_1,int *param_2,long param_3);`
- capstone offset: `0x63e70`  instr: 307
- direct calls (17): `iso7816_tlv::ber::tag::Tag::to_bytes`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `ckemv_emv_kernel::tags::get_tag_name`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `@0xbcfe0`, `ckemv_emv_kernel::results::build_tlv_tree`, `_<alloc::vec::Vec<T,A> as core::ops::drop::Drop>::drop`, `iso7816_tlv::ber::tlv::Tlv::to_vec`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `iso7816_tlv::ber::tag::Tag::is_constructed`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<ckemv_emv_kernel::types::ParsedTlv>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>`, `_Unwind_Resume`
- referenced strings (1 unique):
  - `0x19810`: "0123456789ABCDEF\u0001"
- Ghidra callees (13): `__rust_alloc`, `__rust_dealloc`, `build_tlv_tree`, `do_reserve_and_handle`, `drop`, `from_iter`, `get_tag_name`, `grow_one`, `handle_error`, `is_constructed`, `memcpy`, `to_bytes`, `to_vec`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::results::build_tlv_tree */

void __rustcall ckemv_emv_kernel::results::build_tlv_tree(long *param_1,int *param_2,long param_3)

{
  undefined1 *puVar1;
  int *piVar2;
  long *plVar3;
  void *unaff_x19;
  void *__n;
  undefined1 *puVar4;
  long lVar5;
  undefined1 *__n_00;
  long lVar6;
  undefined1 *puVar7;
  void *__src;
  undefined1 auVar8 [16];
  undefined8 local_178;
  long local_160;
  long lStack_158;
  long local_150;
  long local_148;
  long lStack_140;
  long local_138;
  long local_130;
  undefined1 *puStack_128;
  undefined1 *local_120;
  long local_110;
  undefined1 *puStack_108;
  undefined1 *local_100;
  void *local_f8;
  void *local_f0;
  void *pvStack_e8;
  long local_e0;
  long lStack_d8;
  long local_d0;
  long lStack_c8;
  undefined1 *puStack_c0;
  undefined1 *local_b8;
  undefined1 *local_b0;
  undefined1 uStack_a8;
  undefined7 uStack_a7;
  long local_98;
  long lStack_90;
  long local_88;
  undefined1 *local_80;
  undefined1 *local_78;
  undefined1 *local_70;
  undefined4 local_68;
  
  local_160 = 0;
  lStack_158 = 8;
  local_150 = 0;
  if (param_3 != 0) {
    piVar2 = param_2 + param_3 * 0xc;
    local_178 = 1;
    do {
      auVar8 = iso7816_tlv::ber::tag::Tag::to_bytes(param_2 + 8);
      local_110 = auVar8._0_8_;
      puStack_108 = (undefined1 *)(local_110 + auVar8._8_8_);
      local_100 = &anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      local_f8 = (void *)CONCAT44(local_f8._4_4_,0x110000);
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (&local_148,&local_110);
      auVar8 = tags::get_tag_name(lStack_140,local_138);
      __n = auVar8._8_8_;
      if ((long)__n < 0) {
        local_178 = 0;
        __n = unaff_x19;
LAB_001641b8:
                    /* WARNING: Subroutine does not return */
        alloc::raw_vec::handle_error(local_178,__n,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2a38)
        ;
      }
      if (__n == (void *)0x0) {
        unaff_x19 = (void *)0x1;
      }
      else {
        unaff_x19 = (void *)__rustc[4794b31dd7191200]::__rust_alloc(__n,1);
        if (unaff_x19 == (void *)0x0) goto LAB_001641b8;
      }
      memcpy(unaff_x19,auVar8._0_8_,(size_t)__n);
      local_130 = 0;
      puStack_128 = &DAT_00000008;
      local_120 = (undefined1 *)0x0;
      if (*param_2 == 1) {
        __n_00 = *(undefined1 **)(param_2 + 6);
        if ((long)__n_00 < 0) {
          local_178 = 0;
LAB_001641d4:
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error
                    (local_178,__n_00,
                     &anon_43f406744c6c5c16e5130218f46f7dbb_2_llvm_9056258625447345068);
        }
        __src = *(void **)(param_2 + 4);
        if (__n_00 == (undefined1 *)0x0) {
          puVar1 = (undefined1 *)0x1;
        }
        else {
          puVar1 = (undefined1 *)__rustc[4794b31dd7191200]::__rust_alloc(__n_00,1);
          if (puVar1 == (undefined1 *)0x0) goto LAB_001641d4;
        }
        memcpy(puVar1,__src,(size_t)__n_00);
        puVar7 = __n_00;
      }
      else {
        lVar6 = *(long *)(param_2 + 4);
        lVar5 = *(long *)(param_2 + 6);
        build_tlv_tree(&local_110,lVar6,lVar5);
        <alloc::vec::Vec<T,A>as_core::ops::drop::Drop>::drop(&local_130);
        __n_00 = (undefined1 *)0x0;
        local_70 = (undefined1 *)0x0;
        local_120 = local_100;
        puStack_128 = puStack_108;
        local_130 = local_110;
        local_80 = (undefined1 *)0x0;
        local_78 = (undefined1 *)0x1;
        if (lVar5 == 0) {
          puVar7 = (undefined1 *)0x0;
          puVar1 = (undefined1 *)0x1;
        }
        else {
          puVar4 = (undefined1 *)0x1;
          lVar5 = lVar5 * 0x30;
          do {
            iso7816_tlv::ber::tlv::Tlv::to_vec(&local_110,lVar6);
            puVar1 = local_100;
            puVar7 = puStack_108;
            if (local_80 + -(long)__n_00 < local_100) {
              alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                        (&local_80,__n_00,local_100,1,1);
              puVar4 = local_78;
              __n_00 = local_70;
            }
            memcpy(puVar4 + (long)__n_00,puVar7,(size_t)puVar1);
            __n_00 = __n_00 + (long)puVar1;
            local_70 = __n_00;
            if (local_110 != 0) {
              __rustc[4794b31dd7191200]::__rust_dealloc(puVar7,local_110,1);
            }
            lVar5 = lVar5 + -0x30;
            lVar6 = lVar6 + 0x30;
            puVar7 = local_80;
            puVar1 = local_78;
          } while (lVar5 != 0);
        }
      }
      local_78 = puVar1 + (long)__n_00;
      local_70 = &anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      local_68 = 0x110000;
      local_80 = puVar1;
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (&local_98,&local_80);
      uStack_a8 = iso7816_tlv::ber::tag::Tag::is_constructed(param_2 + 8);
      lVar6 = local_150;
      local_b8 = local_120;
      puStack_c0 = puStack_128;
      lStack_c8 = local_130;
      local_d0 = local_88;
      puStack_108 = (undefined1 *)lStack_140;
      local_110 = local_148;
      local_100 = (undefined1 *)local_138;
      lStack_d8 = lStack_90;
      local_e0 = local_98;
      local_f8 = __n;
      local_f0 = unaff_x19;
      pvStack_e8 = __n;
      local_b0 = __n_00;
      if (local_150 == local_160) {
        alloc::raw_vec::RawVec<T,A>::grow_one
                  (&local_160,&PTR_s_ckemv_emv_kernel_src_results_rs_001c2a68);
      }
      plVar3 = (long *)(lStack_158 + lVar6 * 0x70);
      local_150 = lVar6 + 1;
      plVar3[9] = lStack_c8;
      plVar3[8] = local_d0;
      plVar3[0xb] = (long)local_b8;
      plVar3[10] = (long)puStack_c0;
      plVar3[0xd] = CONCAT71(uStack_a7,uStack_a8);
      plVar3[0xc] = (long)local_b0;
      plVar3[1] = (long)puStack_108;
      *plVar3 = local_110;
      plVar3[3] = (long)local_f8;
      plVar3[2] = (long)local_100;
      plVar3[5] = (long)pvStack_e8;
      plVar3[4] = (long)local_f0;
      plVar3[7] = lStack_d8;
      plVar3[6] = local_e0;
      if (puVar7 != (undefined1 *)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(puVar1,puVar7,1);
      }
      param_2 = param_2 + 0xc;
    } while (param_2 != piVar2);
  }
  param_1[1] = lStack_158;
  *param_1 = local_160;
  param_1[2] = local_150;
  return;
}
```

#### `ckemv_emv_kernel::results::extract_emv_data`

- Ghidra address: `0x16433c` (5016 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel7results16extract_emv_data17h4b99112874eb0198E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::results::extract_emv_data(uint *param_1,long param_2,long param_3);`
- capstone offset: `0x6433c`  instr: 1304
- direct calls (13): `iso7816_tlv::ber::tag::Tag::to_bytes`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `iso7816_tlv::ber::tlv::Tlv::to_vec`, `@0xbcfe0`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`, `@0xbd000`, `_<alloc::string::String as core::clone::Clone>::clone`, `core::str::pattern::StrSearcher::new`, `iso7816_tlv::ber::tag::Tag::is_constructed`, `ckemv_emv_kernel::results::extract_emv_data`
- referenced strings (9 unique):
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x19bb8`: "5F249F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19b84`: "5F349F47mut nametrue"
  - `0x19bd8`: "9F36main as 9F32Kind9F48/"
  - `0x19be4`: "9F32Kind9F48/"
  - `0x19b60`: "9F46 -> chardyn Long    u128Zero <= 5F349F47mut nametrue"
  - `0x19bec`: "9F48/"
  - `0x19b88`: "9F47mut nametrue"
  - `0x20c3b`: "FStatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/visa.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex\u2026"
- Ghidra callees (16): `__rust_alloc`, `__rust_dealloc`, `clone`, `do_reserve_and_handle`, `extract_emv_data`, `from_iter`, `handle_error`, `is_constructed`, `memcmp`, `memcpy`, `new`, `panic_bounds_check`, `slice_error_fail`, `spec_extend`, `to_bytes`, `to_vec`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::results::extract_emv_data */

void __rustcall ckemv_emv_kernel::results::extract_emv_data(uint *param_1,long param_2,long param_3)

{
  char *pcVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong *puVar6;
  long *plVar7;
  char *pcVar8;
  byte *pbVar9;
  long lVar10;
  uint uVar11;
  char cVar12;
  byte bVar13;
  int *__s1;
  long lVar14;
  long lVar15;
  uint *puVar16;
  bool bVar17;
  int iVar18;
  uint uVar19;
  undefined1 *puVar20;
  undefined1 *puVar21;
  undefined1 *puVar22;
  undefined8 uVar23;
  long lVar24;
  long lVar25;
  ulong uVar26;
  uint *puVar27;
  undefined1 *puVar28;
  undefined1 *puVar29;
  long lVar30;
  long lVar31;
  undefined1 *puVar32;
  uint uVar33;
  undefined1 *puVar34;
  long lVar35;
  char *pcVar36;
  long lVar37;
  undefined1 *puVar38;
  undefined1 *puVar39;
  undefined1 *puVar40;
  undefined1 *puVar41;
  ulong *puVar42;
  void *__src;
  ulong uVar43;
  undefined1 *puVar44;
  undefined1 *puVar45;
  uint *puVar46;
  ulong __n;
  undefined1 auVar47 [16];
  ulong local_1b0;
  undefined **ppuStack_1a8;
  undefined8 local_1a0;
  undefined **local_198;
  undefined1 *local_168;
  undefined1 *local_148;
  undefined1 *local_130;
  long local_120;
  int *local_118;
  long lStack_110;
  long local_108;
  long local_100;
  ulong local_f8;
  undefined1 *local_f0;
  undefined1 *puStack_e8;
  undefined1 *local_e0;
  undefined1 *local_d0;
  undefined1 *puStack_c8;
  undefined1 *local_c0;
  uint local_b8;
  undefined4 uStack_b4;
  ulong local_b0;
  undefined1 *puStack_a8;
  undefined1 *local_98;
  long local_88;
  undefined1 *puStack_80;
  long local_78;
  undefined1 *puStack_70;
  
  if (param_2 != 0) {
    puVar2 = (ulong *)(param_3 + 0x168);
    puVar3 = (ulong *)(param_3 + 0x1c8);
    puVar4 = (ulong *)(param_3 + 0x198);
    puVar5 = (ulong *)(param_3 + 0x138);
    puVar6 = (ulong *)(param_3 + 0x108);
    plVar7 = (long *)(param_3 + 0x1f8);
    local_1a0 = 1;
    local_198 = &PTR_s__rustc_6b00bc3880198600130e1cf62_001c29c0;
    local_1b0 = 4;
    ppuStack_1a8 = &PTR_s_ckemv_emv_kernel_src_results_rs_001c2a80;
    puVar16 = param_1 + 0xc;
    puVar46 = param_1;
    do {
      puVar27 = puVar16;
      auVar47 = iso7816_tlv::ber::tag::Tag::to_bytes(puVar46 + 8);
      local_d0 = auVar47._0_8_;
      puStack_c8 = local_d0 + auVar47._8_8_;
      local_c0 = &anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      local_b8 = 0x110000;
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (&local_120,&local_d0);
      uVar11 = *puVar46;
      if ((uVar11 & 1) == 0) {
        puVar41 = (undefined1 *)0x0;
        local_f0 = (undefined1 *)0x0;
        puStack_e8 = (undefined1 *)0x1;
        local_e0 = (undefined1 *)0x0;
        puVar20 = puStack_e8;
        local_130 = local_f0;
        if (*(long *)(puVar46 + 6) != 0) {
          lVar25 = *(long *)(puVar46 + 4);
          puVar44 = (undefined1 *)0x1;
          lVar31 = *(long *)(puVar46 + 6) * 0x30;
          do {
            iso7816_tlv::ber::tlv::Tlv::to_vec(&local_d0,lVar25);
            puVar40 = local_c0;
            puVar20 = puStack_c8;
            if (local_f0 + -(long)puVar41 < local_c0) {
              alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                        (&local_f0,puVar41,local_c0,1,1);
              puVar41 = local_e0;
              puVar44 = puStack_e8;
            }
            memcpy(puVar44 + (long)puVar41,puVar20,(size_t)puVar40);
            puVar41 = puVar41 + (long)puVar40;
            local_e0 = puVar41;
            if (local_d0 != (undefined1 *)0x0) {
              __rustc[4794b31dd7191200]::__rust_dealloc(puVar20,local_d0,1);
            }
            lVar31 = lVar31 + -0x30;
            lVar25 = lVar25 + 0x30;
            puVar20 = puStack_e8;
            local_130 = local_f0;
          } while (lVar31 != 0);
        }
      }
      else {
        puVar41 = *(undefined1 **)(puVar46 + 6);
        if ((long)puVar41 < 0) {
          local_1a0 = 0;
LAB_0016564c:
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error
                    (local_1a0,puVar41,
                     &anon_43f406744c6c5c16e5130218f46f7dbb_2_llvm_9056258625447345068);
        }
        __src = *(void **)(puVar46 + 4);
        if (puVar41 == (undefined1 *)0x0) {
          puVar20 = (undefined1 *)0x1;
        }
        else {
          puVar20 = (undefined1 *)__rustc[4794b31dd7191200]::__rust_alloc(puVar41,1);
          if (puVar20 == (undefined1 *)0x0) goto LAB_0016564c;
        }
        memcpy(puVar20,__src,(size_t)puVar41);
        local_130 = puVar41;
      }
      puStack_c8 = puVar20 + (long)puVar41;
      local_c0 = &anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      local_b8 = 0x110000;
      local_d0 = puVar20;
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (&local_108,&local_d0);
      uVar26 = local_f8;
      lVar25 = local_100;
      __s1 = local_118;
      if (lStack_110 == 4) {
        if (*local_118 == 0x38334639) {
          if (*(long *)(param_3 + 0x30) == -0x8000000000000000) {
            <alloc::string::String_as_core::clone::Clone>::clone(&local_d0,&local_108);
            lVar25 = *(long *)(param_3 + 0x30);
            puStack_e8 = puStack_c8;
            local_f0 = local_d0;
            local_e0 = local_c0;
            if ((lVar25 != -0x8000000000000000) && (lVar25 != 0)) {
              __rustc[4794b31dd7191200]::__rust_dealloc(*(undefined8 *)(param_3 + 0x38),lVar25,1);
            }
            *(undefined1 **)(param_3 + 0x38) = puStack_e8;
            *(undefined1 **)(param_3 + 0x30) = local_f0;
            *(undefined1 **)(param_3 + 0x40) = local_e0;
          }
        }
        else if (*local_118 == 0x36324639) {
          if (*(long *)(param_3 + 0x1e0) == -0x8000000000000000) {
            <alloc::string::String_as_core::clone::Clone>::clone(&local_d0,&local_108);
            lVar25 = *(long *)(param_3 + 0x1e0);
            puStack_e8 = puStack_c8;
            local_f0 = local_d0;
            local_e0 = local_c0;
            if ((lVar25 != -0x8000000000000000) && (lVar25 != 0)) {
              __rustc[4794b31dd7191200]::__rust_dealloc(*(undefined8 *)(param_3 + 0x1e8),lVar25,1);
            }
            *(undefined1 **)(param_3 + 0x1e8) = puStack_e8;
            *(undefined1 **)(param_3 + 0x1e0) = local_f0;
            *(undefined1 **)(param_3 + 0x1f0) = local_e0;
          }
        }
        else if (*local_118 == 0x37324639) {
          if (*plVar7 == -0x8000000000000000) {
            <alloc::string::String_as_core::clone::Clone>::clone(&local_d0,&local_108);
            lVar25 = *plVar7;
            puStack_e8 = puStack_c8;
            local_f0 = local_d0;
            local_e0 = local_c0;
            if ((lVar25 != -0x8000000000000000) && (lVar25 != 0)) {
              __rustc[4794b31dd7191200]::__rust_dealloc(*(undefined8 *)(param_3 + 0x200),lVar25,1);
            }
            *(undefined1 **)(param_3 + 0x200) = puStack_e8;
            *plVar7 = (long)local_f0;
            *(undefined1 **)(param_3 + 0x208) = local_e0;
          }
        }
        else {
          iVar18 = memcmp(local_118,"5F24",4);
          if (iVar18 == 0) {
            if (*(long *)(param_3 + 0xa8) == -0x8000000000000000) {
              <alloc::string::String_as_core::clone::Clone>::clone(&local_d0,&local_108);
              puStack_e8 = puStack_c8;
              local_f0 = local_d0;
              local_e0 = local_c0;
              if ((*(ulong *)(param_3 + 0xa8) | 0x8000000000000000) != 0x8000000000000000) {
                __rustc[4794b31dd7191200]::__rust_dealloc
                          (*(undefined8 *)(param_3 + 0xb0),*(ulong *)(param_3 + 0xa8),1);
              }
              *(undefined1 **)(param_3 + 0xb0) = puStack_e8;
              *(undefined1 **)(param_3 + 0xa8) = local_f0;
              *(undefined1 **)(param_3 + 0xb8) = local_e0;
            }
          }
          else {
            iVar18 = memcmp(__s1,"5F34",4);
            if (iVar18 == 0) {
              if (*(long *)(param_3 + 0x90) == -0x8000000000000000) {
                <alloc::string::String_as_core::clone::Clone>::clone(&local_d0,&local_108);
                puStack_e8 = puStack_c8;
                local_f0 = local_d0;
                local_e0 = local_c0;
                if ((*(ulong *)(param_3 + 0x90) | 0x8000000000000000) != 0x8000000000000000) {
                  __rustc[4794b31dd7191200]::__rust_dealloc
                            (*(undefined8 *)(param_3 + 0x98),*(ulong *)(param_3 + 0x90),1);
                }
                *(undefined1 **)(param_3 + 0x98) = puStack_e8;
                *(undefined1 **)(param_3 + 0x90) = local_f0;
                *(undefined1 **)(param_3 + 0xa0) = local_e0;
              }
            }
            else {
              iVar18 = memcmp(__s1,"9F36main",4);
              if (iVar18 == 0) {
                if (*(long *)(param_3 + 0xd8) == -0x8000000000000000) {
                  <alloc::string::String_as_core::clone::Clone>::clone(&local_d0,&local_108);
                  puStack_e8 = puStack_c8;
                  local_f0 = local_d0;
                  local_e0 = local_c0;
                  if ((*(ulong *)(param_3 + 0xd8) | 0x8000000000000000) != 0x8000000000000000) {
                    __rustc[4794b31dd7191200]::__rust_dealloc
                              (*(undefined8 *)(param_3 + 0xe0),*(ulong *)(param_3 + 0xd8),1);
                  }
                  *(undefined1 **)(param_3 + 0xe0) = puStack_e8;
                  *(undefined1 **)(param_3 + 0xd8) = local_f0;
                  *(undefined1 **)(param_3 + 0xe8) = local_e0;
                }
              }
              else {
                iVar18 = memcmp(__s1,"9F32",4);
                if (iVar18 == 0) {
                  if (*puVar5 == 0x80000000
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `_<ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt`

- Ghidra address: `0x16592c` (104 bytes)  ·  mangled: `_ZN77_$LT$ckemv_core..response..status..StatusWord$u20$as$u20$core..fmt..Debug$GT$3fmt17hf91b69f6fc879758E`
- signature (Ghidra): `void __rustcall<ckemv_core::response::status::StatusWord_as_core::fmt::Debug>::fmt(long param_1,undefined8 param_2);`
- capstone offset: `0x6bf08`  instr: 26
- direct calls (1): `core::fmt::Formatter::debug_struct_field2_finish`
- referenced strings (3 unique):
  - `0x212da`: "StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex\u2026"
  - `0x212e4`: "sw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesti\u2026"
  - `0x212e7`: "sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesting \u2026"
- Ghidra callees (1): `debug_struct_field2_finish`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt */

void __rustcall
<ckemv_core::response::status::StatusWord_as_core::fmt::Debug>::fmt(long param_1,undefined8 param_2)

{
  long lStack_8;
  
  lStack_8 = param_1 + 1;
  core::fmt::Formatter::debug_struct_field2_finish
            (param_2,"StatusWord",10,"sw1",3,param_1,&DAT_001c2ab0,"sw2",3,&lStack_8,&DAT_001c2ad0);
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::next_command`

- Ghidra address: `0x165a04` (908 bytes)  ·  mangled: `_ZN106_$LT$ckemv_emv_kernel..kernels..visa..VisaKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$12next_command17he071e15fb4899739E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::next_command(undefined8 *param_1,long param_2);`
- capstone offset: `0x65a04`  instr: 276
- direct calls (12): `alloc::fmt::format::format_inner`, `_<alloc::string::String as core::clone::Clone>::clone`, `ckemv_emv_kernel::dol::build_dol_payload`, `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `@0xbcfe0`, `alloc::alloc::handle_alloc_error`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `alloc::raw_vec::handle_error`, `core::panicking::panic_in_cleanup`, `_Unwind_Resume`
- referenced strings (3 unique):
  - `0x20d48`: "Requesting 1st Generate AC (ARQC/TC)Selected Visa ApplicationGPO returned ARQC. Visa Fast-Path completed.Failed to parse AFL: GPO returned ARQC and no records to read. Complete.GPO successful. No reco\u2026"
  - `0x20d05`: "Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (ARQC/TC)Selected Visa ApplicationGPO returned ARQC. Visa Fast-Path completed.Failed to parse AFL: GPO ret\u2026"
  - `0x20018`: ", Other (Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indicator (FFI)Card Transactio\u2026"
- Ghidra callees (10): `__rust_alloc`, `__rust_dealloc`, `build_dol_payload`, `clone`, `do_reserve_and_handle`, `format_inner`, `from`, `handle_alloc_error`, `handle_error`, `memcpy`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::visa::VisaKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::next_command */

void __rustcall
<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
next_command(undefined8 *param_1,long param_2)

{
  char cVar1;
  char cVar2;
  undefined *puVar3;
  char *pcVar4;
  long lVar5;
  ulong uVar6;
  undefined1 *puVar7;
  undefined *local_118;
  undefined1 *local_110;
  undefined8 uStack_108;
  long local_100;
  void *local_f8;
  size_t sStack_f0;
  undefined *local_e8;
  undefined1 *puStack_e0;
  long local_d8;
  undefined **local_d0;
  undefined8 uStack_c8;
  undefined ***local_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined *local_a0;
  undefined1 *puStack_98;
  long local_90;
  undefined1 auStack_88 [24];
  undefined **local_70;
  code *pcStack_68;
  undefined **local_60;
  code *pcStack_58;
  
  uVar6 = *(ulong *)(param_2 + 0x2a0) ^ 0x8000000000000000;
  if (4 < uVar6) {
    uVar6 = 5;
  }
  if ((long)uVar6 < 3) {
    if (uVar6 != 0) {
      if (uVar6 == 1) {
        if (*(long *)(param_2 + 0x30) == -0x8000000000000000) {
          uStack_108 = 0;
          local_118 = (undefined *)0x0;
          puVar7 = (undefined1 *)0x1;
        }
        else {
          <alloc::string::String_as_core::clone::Clone>::clone(&local_118,(long *)(param_2 + 0x30));
          puVar7 = local_110;
        }
        ckemv_emv_kernel::dol::build_dol_payload(&local_100,puVar7,uStack_108,param_2 + 0x2b8);
        puStack_e0 = (undefined1 *)__rustc[4794b31dd7191200]::__rust_alloc(2,1);
        if (puStack_e0 == (undefined1 *)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::alloc::handle_alloc_error(1,2);
        }
        *puStack_e0 = 0x83;
        local_e8 = (undefined *)0x2;
        puStack_e0[1] = (char)sStack_f0;
        local_d8 = 2;
        if (sStack_f0 != 0) {
          alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_e8,2,sStack_f0,1,1);
        }
        lVar5 = local_d8;
        memcpy(puStack_e0 + local_d8,local_f8,sStack_f0);
        local_d8 = lVar5 + sStack_f0;
        puStack_98 = puStack_e0;
        local_a0 = local_e8;
        local_90 = local_d8;
        <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_70,&local_a0)
        ;
        local_b0 = CONCAT26(local_b0._6_2_,0x100000000);
        uStack_c8 = pcStack_68;
        local_d0 = local_70;
        local_b8 = pcStack_58;
        local_c0 = (undefined ***)local_60;
        local_b0 = CONCAT44(local_b0._4_4_,0xa880);
        pcVar4 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x23,1);
        if (pcVar4 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error(1,0x23,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2af0);
        }
        builtin_strncpy(pcVar4,"Requesting Processing Options (GPO)",0x23);
        param_1[7] = local_b0;
        *param_1 = 0x23;
        param_1[1] = pcVar4;
        param_1[4] = uStack_c8;
        param_1[3] = local_d0;
        param_1[6] = local_b8;
        param_1[5] = local_c0;
        param_1[2] = 0x23;
        puVar3 = local_118;
        if (local_100 != 0) {
          __rustc[4794b31dd7191200]::__rust_dealloc(local_f8,local_100,1);
          puVar3 = local_118;
        }
        goto joined_r0x00165bf0;
      }
      if (*(ulong *)(param_2 + 0x300) < *(ulong *)(param_2 + 0x298)) {
        local_70 = &local_e8;
        pcVar4 = (char *)(*(long *)(param_2 + 0x290) + *(ulong *)(param_2 + 0x300) * 2);
        cVar1 = *pcVar4;
        local_e8 = (undefined *)CONCAT71(local_e8._1_7_,cVar1);
        cVar2 = pcVar4[1];
        local_60 = &local_a0;
        pcStack_68 = core::fmt::num::imp::<impl_core::fmt::Display_for_u8>::fmt;
        pcStack_58 = core::fmt::num::imp::<impl_core::fmt::Display_for_u8>::fmt;
        local_a0 = (undefined *)CONCAT71(local_a0._1_7_,cVar2);
        local_d0 = &PTR_s_Reading_Record__SFI____Record____001c2b60;
        uStack_c8 = 3;
        local_c0 = &local_70;
        local_b8 = 2;
        local_b0 = 0;
        alloc::fmt::format::format_inner(&local_d0);
        param_1[3] = 0;
        *(undefined2 *)(param_1 + 7) = 0xb200;
        *(char *)((long)param_1 + 0x3a) = cVar2;
        *(byte *)((long)param_1 + 0x3b) = cVar1 << 3 | 4;
        *(undefined2 *)((long)param_1 + 0x3c) = 1;
        return;
      }
    }
  }
  else if (uVar6 == 3) {
    if (*(long *)(param_2 + 0x48) == -0x8000000000000000) {
      local_a0 = (undefined *)0x0;
      lVar5 = 0;
      puVar7 = (undefined1 *)0x1;
    }
    else {
      <alloc::string::String_as_core::clone::Clone>::clone(&local_a0,(long *)(param_2 + 0x48));
      lVar5 = local_90;
      puVar7 = puStack_98;
    }
    ckemv_emv_kernel::dol::build_dol_payload(auStack_88,puVar7,lVar5,param_2 + 0x2b8);
    <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_70,auStack_88);
    uStack_c8 = pcStack_68;
    local_d0 = local_70;
    local_b8 = pcStack_58;
    local_c0 = (undefined ***)local_60;
    local_b0 = CONCAT26(local_b0._6_2_,0x10040ae80);
    pcVar4 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x24,1);
    if (pcVar4 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x24,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2af0);
    }
    param_1[7] = local_b0;
    builtin_strncpy(pcVar4,"Requesting 1st Generate AC (ARQC/TC)",0x24);
    *param_1 = 0x24;
    param_1[1] = pcVar4;
    param_1[2] = 0x24;
    param_1[4] = uStack_c8;
    param_1[3] = local_d0;
    param_1[6] = local_b8;
    param_1[5] = local_c0;
    puVar3 = local_a0;
joined_r0x00165bf0:
    if (puVar3 == (undefined *)0x0) {
      return;
    }
    __rustc[4794b31dd7191200]::__rust_dealloc(puVar7,puVar3,1);
    return;
  }
  *param_1 = 0x8000000000000000;
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`

- Ghidra address: `0x165e54` (3592 bytes)  ·  mangled: `_ZN106_$LT$ckemv_emv_kernel..kernels..visa..VisaKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$16process_response17h87f719bb0ef3d3d8E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::process_response(undefined8 *param_1,long *param_2,byte *******param_3,ulong param_4);`
- capstone offset: `0x65e54`  instr: 985
- direct calls (20): `iso7816_tlv::ber::tlv::Tlv::parse_all`, `ckemv_emv_kernel::results::extract_emv_data`, `ckemv_emv_kernel::results::build_tlv_tree`, `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `_<alloc::string::String as core::clone::Clone>::clone`, `alloc::fmt::format::format_inner`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `@0xbcfe0`, `ckemv_emv_kernel::crypto::oda::verify_certificates`, `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::visa::VisaState>`, `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`, `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `alloc::raw_vec::handle_error`, `core::panicking::panic_bounds_check`, `_Unwind_Resume`, `core::ptr::drop_in_place<alloc::vec::Vec<iso7816_tlv::ber::tlv::Tlv>>`
- referenced strings (16 unique):
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x20f28`: "Did not receive cryptogram in Generate AC responseCard returned error status: ckemv-emv-kernel/src/results.rs/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/\u2026"
  - `0x20020`: "(Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indicator (FFI)Card Transaction Qualif\u2026"
  - `0x20d6c`: "Selected Visa ApplicationGPO returned ARQC. Visa Fast-Path completed.Failed to parse AFL: GPO returned ARQC and no records to read. Complete.GPO successful. No records to read.GPO successful. Found  r\u2026"
  - `0x20000`: "minal Country CodeAmount, Other (Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indica\u2026"
  - `0x20e7b`: " All records read. Fast-Path ARQC already captured. Complete. All records read. Proceeding to GenAC.ODA Verification Failed: Successfully obtained cryptogram or track2 data.Did not receive cryptogram \u2026"
  - `0x20eb8`: " All records read. Proceeding to GenAC.ODA Verification Failed: Successfully obtained cryptogram or track2 data.Did not receive cryptogram in Generate AC responseCard returned error status: ckemv-emv-\u2026"
  - `0x20edf`: "ODA Verification Failed: Successfully obtained cryptogram or track2 data.Did not receive cryptogram in Generate AC responseCard returned error status: ckemv-emv-kernel/src/results.rs/rustc/6b00bc38801\u2026"
  - `0x20010`: "deAmount, Other (Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indicator (FFI)Card Tr\u2026"
  - `0x20ef8`: "Successfully obtained cryptogram or track2 data.Did not receive cryptogram in Generate AC responseCard returned error status: ckemv-emv-kernel/src/results.rs/rustc/6b00bc3880198600130e1cf62b8f8a934944\u2026"
  - `0x20d85`: "GPO returned ARQC. Visa Fast-Path completed.Failed to parse AFL: GPO returned ARQC and no records to read. Complete.GPO successful. No records to read.GPO successful. Found  records to read.GPO succes\u2026"
  - `0x20e43`: "GPO successful (no AFL). Waiting for GenAC.Read record / All records read. Fast-Path ARQC already captured. Complete. All records read. Proceeding to GenAC.ODA Verification Failed: Successfully obtain\u2026"
- Ghidra callees (18): `__rust_alloc`, `__rust_dealloc`, `build_tlv_tree`, `clone`, `do_reserve_and_handle`, `drop_in_place<ckemv_emv_kernel::kernels::visa::VisaState>`, `drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `extract_emv_data`, `format_inner`, `from_hex`, `from_iter`, `grow_one`, `handle_error`, `memcpy`, `panic_bounds_check`, `parse_all`, `to_vec`, `verify_certificates`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::visa::VisaKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::process_response */

void __rustcall
<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
process_response(undefined8 *param_1,long *param_2,byte *******param_3,ulong param_4)

{
  ulong *puVar1;
  undefined1 *puVar2;
  byte bVar3;
  char *pcVar4;
  byte *******pppppppbVar5;
  byte bVar6;
  undefined1 uVar7;
  undefined1 uVar8;
  byte bVar9;
  byte *pbVar10;
  byte *******pppppppbVar11;
  byte *******pppppppbVar12;
  byte *******pppppppbVar13;
  char *pcVar14;
  byte *******pppppppbVar15;
  byte *******pppppppbVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  byte ******ppppppbVar20;
  long lVar21;
  undefined8 uVar22;
  byte *******pppppppbVar23;
  long lVar24;
  byte *pbVar25;
  byte bVar26;
  undefined8 local_1d0;
  undefined **local_1c8;
  byte *******local_190;
  byte *******pppppppbStack_188;
  byte *******local_180;
  byte *******local_170;
  byte *******pppppppbStack_168;
  byte *******local_160;
  undefined8 local_158;
  undefined8 uStack_150;
  byte *******local_148;
  byte *******local_140;
  byte *******pppppppbStack_138;
  byte *******local_130;
  byte *******local_128;
  byte *******pppppppbStack_120;
  byte *******local_118;
  byte *******local_110;
  byte *******pppppppbStack_108;
  byte *******local_100;
  code *pcStack_f8;
  byte *******local_f0;
  byte *******pppppppbStack_e8;
  undefined8 local_e0;
  undefined8 local_d0;
  byte *******pppppppbStack_c8;
  undefined8 local_c0;
  byte *******local_b0;
  byte *******pppppppbStack_a8;
  byte *******local_a0;
  byte *******local_90;
  byte *******pppppppbStack_88;
  byte *******local_80;
  byte *******pppppppbStack_78;
  byte *******pppppppbStack_70;
  byte *******local_68;
  
  bVar26 = *(byte *)(param_3 + 4);
  if (bVar26 < 0x80) {
    if ((bVar26 != 0x70) && (bVar26 != 0x77)) {
LAB_00166188:
      bVar6 = *(byte *)((long)param_3 + 0x21);
LAB_0016618c:
      local_d0._0_2_ = CONCAT11(bVar6,bVar26);
      local_110 = (byte *******)&local_d0;
      pppppppbStack_108 =
           (byte *******)<ckemv_core::response::status::StatusWord_as_core::fmt::Debug>::fmt;
      local_90 = (byte *******)&DAT_001c2c08;
      pppppppbStack_88 = (byte *******)0x1;
      local_80 = (byte *******)&local_110;
      pppppppbStack_78 = (byte *******)0x1;
      pppppppbStack_70 = (byte *******)0x0;
      alloc::fmt::format::format_inner(&local_b0,&local_90);
      <alloc::string::String_as_core::clone::Clone>::clone(&local_90,&local_b0);
      lVar18 = param_2[0x54];
      pppppppbStack_108 = pppppppbStack_88;
      local_110 = local_90;
      local_100 = local_80;
      if ((-0x7ffffffffffffffc < lVar18) && (lVar18 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x55],lVar18,1);
      }
      param_2[0x56] = (long)local_100;
      param_2[0x55] = (long)pppppppbStack_108;
      param_2[0x54] = (long)local_110;
      param_1[1] = pppppppbStack_a8;
      *param_1 = local_b0;
      param_1[2] = local_a0;
      param_1[3] = 0x8000000000000000;
      return;
    }
  }
  else if (bVar26 != 0x80) {
    if (bVar26 != 0x90) goto LAB_00166188;
    bVar6 = *(byte *)((long)param_3 + 0x21);
    if (bVar6 != 0) goto LAB_0016618c;
  }
  local_190 = (byte *******)0x8000000000000000;
  if ((*param_3 != (byte ******)0x0) && (param_3[1] != (byte ******)0x0)) {
    iso7816_tlv::ber::tlv::Tlv::parse_all(&local_110,param_3[1],param_3[2]);
    pppppppbVar13 = local_100;
    pppppppbVar15 = pppppppbStack_108;
    ckemv_emv_kernel::results::extract_emv_data(pppppppbStack_108,local_100,param_2);
    if ((param_4 & 1) != 0) {
      ckemv_emv_kernel::results::build_tlv_tree(&local_90,pppppppbVar15,pppppppbVar13);
      pppppppbStack_188 = pppppppbStack_88;
      local_190 = local_90;
      local_180 = local_80;
    }
    pbVar25 = (byte *)((long)pppppppbVar13 + 1);
    pppppppbVar13 = pppppppbVar15;
    while (pbVar25 = pbVar25 + -1, pbVar25 != (byte *)0x0) {
      core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>(pppppppbVar13);
      pppppppbVar13 = pppppppbVar13 + 6;
    }
    if (local_110 != (byte *******)0x0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(pppppppbVar15,(long)local_110 * 0x30,8);
    }
  }
  uVar17 = param_2[0x54];
  puVar1 = (ulong *)(param_2 + 0x54);
  local_170 = (byte *******)0x0;
  pppppppbStack_168 = (byte *******)0x1;
  uVar19 = uVar17 ^ 0x8000000000000000;
  local_160 = (byte *******)0x0;
  if (4 < uVar19) {
    uVar19 = 5;
  }
  local_68 = local_180;
  if (2 < (long)uVar19) {
    if (1 < uVar19 - 4) {
      if ((*param_3 != (byte ******)0x0) &&
         (ppppppbVar20 = param_3[1], ppppppbVar20 != (byte ******)0x0)) {
        pppppppbStack_88 = (byte *******)((long)ppppppbVar20 + (long)param_3[2]);
        local_80 = (byte *******)&anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
        pppppppbStack_78 = (byte *******)CONCAT44(pppppppbStack_78._4_4_,0x110000);
        local_90 = (byte *******)ppppppbVar20;
        <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                  (&local_110,&local_90);
        lVar18 = param_2[0x4b];
        pppppppbStack_88 = pppppppbStack_108;
        local_90 = local_110;
        local_80 = local_100;
        if ((lVar18 != -0x8000000000000000) && (lVar18 != 0)) {
          __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x4c],lVar18,1);
        }
        param_2[0x4c] = (long)pppppppbStack_88;
        param_2[0x4b] = (long)local_90;
        param_2[0x4d] = (long)local_80;
      }
      if ((param_2[0x3c] == -0x8000000000000000) && (param_2[0x18] == -0x8000000000000000)) {
        uVar22 = 0x32;
        pppppppbStack_a8 = (byte *******)__rustc[4794b31dd7191200]::__rust_alloc(0x32,1);
        if (pppppppbStack_a8 == (byte *******)0x0) {
LAB_00166bfc:
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error(1,uVar22,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2af0);
        }
        *(undefined2 *)(pppppppbStack_a8 + 6) = 0x6573;
        pppppppbStack_a8[5] = (byte ******)0x6e6f707365722043;
        pppppppbStack_a8[4] = (byte ******)0x412065746172656e;
        pppppppbStack_a8[1] = (byte ******)0x2065766965636572;
        *pppppppbStack_a8 = (byte ******)0x20746f6e20646944;
        pppppppbStack_a8[3] = (byte ******)0x6547206e69206d61;
        pppppppbStack_a8[2] = (byte ******)0x72676f7470797263;
        local_b0 = (byte *******)0x32;
        local_a0 = (byte *******)0x32;
        <alloc::string::String_as_core::clone::Clone>::clone(&local_90,&local_b0);
        uVar19 = *puVar1;
        pppppppbStack_108 = pppppppbStack_88;
        local_110 = local_90;
        local_100 = local_80;
        if ((-0x7ffffffffffffffc < (long)uVar19) && (uVar19 != 0)) {
          __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x55],uVar19,1);
        }
        param_2[0x55] = (long)pppppppbStack_108;
        *puVar1 = (ulong)local_110;
        param_2[0x56] = (long)local_100;
        pppppppbStack_168 = pppppppbStack_a8;
        local_170 = local_b0;
        local_160 = local_a0;
      }
      else {
        if (((*(byte *)((long)param_2 + 0x2fa) & 1) == 0) &&
           ((param_2[0x57] != 0 &&
            (ckemv_emv_kernel::crypto::oda::verify_certificates
                       (&local_f0,param_2,
                        param_2[0x57] + (*(long *)(param_2[0x58] + 0x10) - 1U & 0xfffffffffffffff0)
                        + 0x10), local_f0 != (byte *******)0x8000000000000000)))) {
          local_b0 = (byte *******)&local_d0;
          local_c0 = local_e0;
          pppppppbStack_a8 = (byte *******)<alloc::string::String_as_core::fmt::Display>::fmt;
          pppppppbStack_c8 = pppppppbStack_e8;
          local_d0 = local_f0;
          local_90 = (byte *******)&DAT_001c2bf8;
          pppppppbStack_88 = (byte *******)0x1;
          local_80 = (byte *******)&local_b0;
          pppppppbStack_78 = (byte *******)0x1;
          pppppppbStack_70 = (byte *******)0x0;
          alloc::fmt::format::format_inner(&local_110,&local_90);
          pppppppbStack_a8 = pppppppbStack_108;
          local_b0 = local_110;
          local_a0 = local_100;
          <alloc::string::String_as_core::clone::Clone>::clone(&local_90,&local_b0);
          pppppppbStack_108 = pppppppbStack_88;
          local_110 = local_90;
          local_100 = local_80;
          core::ptr::drop_in_place<ckemv_emv_kernel::kernels::visa::VisaState>
                    (param_2[0x54],param_2[0x55]);
          param_2[0x56] = (long)local_100;
          param_2[0x55] = (long)pppppppbStack_108;
          *puVar1 = (ulong)local_110;
          param_1[1] = pppppppbStack_a8;
          *param_1 = local_b0;
          param_1[3] = local_190;
          param_1[2] = local_a0;
          param_1[5] = local_180;
          param_1[4] = pppppppbStack_188;
          pppppppbStack_70 = pppppppbStack_188;
          pppppppbStack_78 = local_190;
          local_80 = local_a0;
          pppppppbVar15 = local_d0;
          pppppppbVar13 = pppppppbStack_c8;
joined_r0x001667bc:
          if (pppppppbVar15 == (byte *******)0x0) {
            return;
          }
          __rustc[4794b31dd7191200]::__rust_dealloc(pppppppbVar13,pppppppbVar15,1);
          return;
        }
        uVar19 = *puVar1;
        if ((-0x7ffffffffffffffc < (long)uVar19) && (uVar19 != 0)) {
          __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x55],uVar19,1);
        }
        *puVar1 = 0x8000000000000004;
        uVar22 = 0x30;
        pppppppbVar15 = (byte *******)__rustc[4794b31dd7191200]::__rust_alloc(0x30,1);
        if (pppppppbVar15 == (byte *******)0x0) goto LAB_00166bfc;
        local_170 = (byte *******)&DAT_00000030;
        pppppppbVar15[5] = (byte ******)0x2e6174616420326b;
        pppppppbVar15[4] = (byte ******)0x6361727420726f20;
        pp
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::status`

- Ghidra address: `0x166db8` (68 bytes)  ·  mangled: `_ZN106_$LT$ckemv_emv_kernel..kernels..visa..VisaKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$6status17h93d134cf95f41729E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::status(undefined8 *param_1,long param_2);`
- capstone offset: `0x66db8`  instr: 17
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::visa::VisaKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::status */

void __rustcall
<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::status
          (undefined8 *param_1,long param_2)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_2 + 0x2a0) ^ 0x8000000000000000;
  if (4 < uVar1) {
    uVar1 = 5;
  }
  if (uVar1 != 4) {
    if (uVar1 == 5) {
      <alloc::string::String_as_core::clone::Clone>::clone(param_2 + 0x2a0);
      return;
    }
    *param_1 = 0x8000000000000000;
    return;
  }
  *param_1 = 0x8000000000000001;
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_context`

- Ghidra address: `0x166dfc` (152 bytes)  ·  mangled: `_ZN106_$LT$ckemv_emv_kernel..kernels..visa..VisaKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$11get_context17h98304d391d24bfd4E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::get_context(undefined8 *param_1,long param_2);`
- capstone offset: `0x66dfc`  instr: 38
- direct calls (1): `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::visa::VisaKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::get_context */

void __rustcall
<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
get_context(undefined8 *param_1,long param_2)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  char cVar4;
  bool bVar5;
  code *pcVar6;
  long *plVar7;
  undefined8 extraout_x12;
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  uVar10 = *(undefined8 *)(param_2 + 0x2e8);
  uVar11 = *(undefined8 *)(param_2 + 0x2f0);
  <hashbrown::raw::RawTable<T,A>as_core::clone::Clone>::clone(&local_60,param_2 + 0x2c8);
  uVar1 = *(undefined1 *)(param_2 + 0x2f8);
  plVar7 = *(long **)(param_2 + 0x2b8);
  uVar2 = *(undefined1 *)(param_2 + 0x2f9);
  uVar3 = *(undefined1 *)(param_2 + 0x2fa);
  uVar9 = extraout_x12;
  if (plVar7 != (long *)0x0) {
    do {
      lVar8 = *plVar7;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(plVar7,0x10);
      if (bVar5) {
        *plVar7 = lVar8 + 1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar8 < 0) {
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x166e94);
      local_40 = uVar10;
      uStack_38 = uVar11;
      (*pcVar6)();
    }
    uVar9 = *(undefined8 *)(param_2 + 0x2c0);
  }
  *(undefined1 *)(param_1 + 8) = uVar1;
  param_1[7] = uVar11;
  param_1[6] = uVar10;
  param_1[3] = uStack_58;
  param_1[2] = local_60;
  param_1[5] = uStack_48;
  param_1[4] = uStack_50;
  *(undefined1 *)((long)param_1 + 0x41) = uVar2;
  *(undefined1 *)((long)param_1 + 0x42) = uVar3;
  *param_1 = plVar7;
  param_1[1] = uVar9;
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_results`

- Ghidra address: `0x166e94` (2328 bytes)  ·  mangled: `_ZN106_$LT$ckemv_emv_kernel..kernels..visa..VisaKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$11get_results17h11c3fc7790332aa2E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::get_results(undefined8 *param_1,long param_2);`
- capstone offset: `0x66e94`  instr: 862
- direct calls (4): `_<alloc::string::String as core::clone::Clone>::clone`, `_<alloc::vec::Vec<T,A> as core::clone::Clone>::clone`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_Unwind_Resume`
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::visa::VisaKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::get_results */

void __rustcall
<ckemv_emv_kernel::kernels::visa::VisaKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
get_results(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 local_2a0;
  undefined8 local_298;
  undefined8 local_290;
  undefined8 local_288;
  undefined8 local_280;
  undefined8 local_278;
  undefined8 local_270;
  undefined8 local_268;
  undefined8 local_260;
  undefined8 local_258;
  undefined8 local_250;
  undefined8 local_248;
  undefined8 local_240;
  undefined8 local_238;
  undefined8 local_230;
  undefined8 local_228;
  undefined8 local_220;
  undefined8 local_218;
  undefined8 local_210;
  undefined8 local_208;
  undefined8 local_200;
  undefined8 local_1f8;
  undefined8 local_1f0;
  undefined8 local_1e8;
  undefined8 local_1e0;
  undefined8 local_1d8;
  undefined8 local_1d0;
  undefined8 local_1c8;
  undefined8 local_1c0;
  undefined8 local_1b8;
  undefined8 local_1b0;
  undefined8 local_1a8;
  undefined8 local_1a0;
  undefined8 local_198;
  undefined8 local_190;
  undefined8 local_188;
  undefined8 local_180;
  undefined8 local_178;
  undefined8 local_170;
  undefined8 local_168;
  undefined8 local_160;
  undefined8 local_158;
  undefined8 local_150;
  undefined8 local_148;
  undefined8 local_140;
  undefined8 local_138;
  undefined8 local_130;
  undefined8 local_128;
  undefined8 local_120;
  undefined8 local_118;
  undefined8 local_110;
  undefined8 local_108;
  undefined8 local_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 local_e8;
  undefined8 local_e0;
  undefined8 local_d8;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  if (*(long *)(param_2 + 0x18) == -0x8000000000000000) {
    local_90 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x30);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_90);
    lVar6 = *(long *)(param_2 + 0x30);
  }
  if (lVar6 == -0x8000000000000000) {
    local_98 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x48);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x48);
    local_98 = local_78;
    local_130 = uStack_70;
    local_188 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_a0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x60);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x60);
    local_a0 = local_78;
    local_198 = local_68;
    local_138 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_a8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x78);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x78);
    local_a8 = local_78;
    local_140 = uStack_70;
    local_1a0 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_b0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x90);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x90);
    local_b0 = local_78;
    local_1b0 = local_68;
    local_148 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_b8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xa8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xa8);
    local_b8 = local_78;
    local_150 = uStack_70;
    local_1b8 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_c0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xc0);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xc0);
    local_c0 = local_78;
    local_1c8 = local_68;
    local_158 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_c8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xd8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xd8);
    local_c8 = local_78;
    local_160 = uStack_70;
    local_1d8 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_d0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xf0);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xf0);
    local_d0 = local_78;
    local_1e0 = local_68;
    local_168 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_d8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x108);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x108);
    local_d8 = local_78;
    local_170 = uStack_70;
    local_1f0 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x120);
    local_e0 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x108);
    lVar6 = *(long *)(param_2 + 0x120);
    local_e0 = local_78;
    local_1f8 = local_68;
    local_178 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_e8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x138);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x120);
    lVar6 = *(long *)(param_2 + 0x138);
    local_e8 = local_78;
    local_180 = uStack_70;
    local_208 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x150);
    local_f0 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x138);
    lVar6 = *(long *)(param_2 + 0x150);
    local_f0 = local_78;
    local_218 = local_68;
    local_190 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_f8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x168);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x150);
    lVar6 = *(long *)(param_2 + 0x168);
    local_f8 = local_78;
    local_1a8 = uStack_70;
    local_220 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x180);
    local_100 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x168);
    lVar6 = *(long *)(param_2 + 0x180);
    local_100 = local_78;
    local_230 = local_68;
    local_1c0 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_108 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x198);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x180);
    lVar6 = *(long *)(param_2 + 0x198);
    local_108 = local_78;
    local_1d0 = uStack_70;
    local_238 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_110 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x1b0);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x198);
    lVar6 = *(long *)(param_2 + 0x1b0);
    local_110 = local_78;
    local_248 = local_68;
    local_1e8 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_118 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x1c8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1b0);
    lVar6 = *(long *)(param_2 + 0x1c8);
    local_118 = local_78;
    local_200 = uStack_70;
    local_250 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x1e0);
    uVar5 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1c8);
    lVar6 = *(long *)(param_2 + 0x1e0);
    uVar5 = local_78;
    local_260 = local_68;
    local_210 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_120 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x1f8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1e0);
    lVar6 = *(long *)(param_2 + 0x1f8);
    local_120 = local_78;
    local_228 = uStack_70;
    local_270 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x210);
    uVar4 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1f8);
    lVar6 = *(long *)(param_2 + 0x210);
    uVar4 = local_78;
    local_278 = local_68;
    local_240 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_128 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x228);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x210);
    lVar6 = *(long *)(param_2 + 0x228);
    local_128 = local_78;
    local_258 = uStack_70;
    local_288 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x240);
    uVar3 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x228);
    lVar6 = *(long *)(param_2 + 0x240);
    uVar3 = local_78;
    local_290 = local_68;
    local_268 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    uVar7 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 600);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x240);
    lVar6 = *(long *)(param_2 + 600);
    local_280 = uStack_70;
    local_2a0 = local_68;
    uVar7 = local_78;
  }
  if (lVar6 == -0x80000
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::dol::build_dol_payload`

- Ghidra address: `0x167c88` (5524 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel3dol17build_dol_payload17h368e1f8e30b3ec4eE`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::dol::build_dol_payload(undefined8 *param_1,byte *******param_2,byte *******param_3,long param_4);`
- capstone offset: `0x67c88`  instr: 1553
- direct calls (15): `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `alloc::fmt::format::format_inner`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_RNvCs691rhTbG0Ee_7___rustc19___rust_alloc_zeroed`, `core::hash::BuildHasher::hash_one`, `alloc::raw_vec::handle_error`, `_<alloc::string::String as core::clone::Clone>::clone`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `ckemv_emv_kernel::types::generate_negative_correlated_time`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `hashbrown::map::HashMap<K,V,S,A>::insert`, `@0xbd000`, `@0xbcfe0`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
- referenced strings (4 unique):
  - `0x19bc4`: "9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19bbc`: "9F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x19ba4`: "9F37for<kindcodeargs5F249F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
- Ghidra callees (19): `__rust_alloc`, `__rust_alloc_zeroed`, `__rust_dealloc`, `clone`, `compress`, `do_reserve_and_handle`, `format_inner`, `from_iter`, `generate_negative_correlated_time`, `grow_one`, `handle_alloc_error`, `handle_error`, `hash_one`, `insert`, `memcmp`, `memcpy`, `memset`, `panic_bounds_check`, `slice_end_index_len_fail`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::dol::build_dol_payload */

void __rustcall
ckemv_emv_kernel::dol::build_dol_payload
          (undefined8 *param_1,byte *******param_2,byte *******param_3,long param_4)

{
  short *psVar1;
  long lVar2;
  void *__src;
  undefined1 uVar3;
  bool bVar4;
  int iVar5;
  byte *******pppppppbVar6;
  ulong uVar7;
  byte *******pppppppbVar8;
  byte *******pppppppbVar9;
  byte *******pppppppbVar10;
  byte *******pppppppbVar11;
  byte *******pppppppbVar12;
  undefined4 *puVar13;
  code *pcVar14;
  long lVar15;
  undefined4 *puVar16;
  byte bVar17;
  uint uVar18;
  long lVar19;
  ulong uVar20;
  long lVar21;
  byte ******ppppppbVar22;
  undefined4 *puVar23;
  ulong uVar24;
  ulong uVar25;
  undefined8 *puVar26;
  byte *pbVar27;
  byte *******unaff_x23;
  size_t __n;
  byte *******pppppppbVar28;
  byte *******unaff_x24;
  byte *******pppppppbVar29;
  ushort uVar30;
  undefined1 auVar31 [16];
  byte bVar32;
  undefined8 uVar33;
  byte bVar34;
  undefined8 uVar35;
  undefined8 local_2b0;
  undefined1 *local_2a8;
  byte *******local_2a0;
  byte *******local_290;
  byte *******local_288;
  byte *******local_250;
  byte *******pppppppbStack_248;
  byte *******local_240;
  byte *******local_230;
  byte *******local_228;
  byte *******local_218;
  long local_210;
  undefined4 *puStack_208;
  long local_200;
  ushort local_1f8;
  undefined6 uStack_1f6;
  void *pvStack_1f0;
  byte *******local_1e8;
  byte ******local_1e0;
  code *local_1d8;
  byte *local_1d0;
  byte *******local_1c8;
  byte *******pppppppbStack_1c0;
  byte *******pppppppbStack_1b8;
  undefined4 uStack_1b0;
  undefined4 uStack_1ac;
  byte *******local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  ulong uStack_170;
  undefined1 local_168;
  undefined7 uStack_167;
  undefined8 local_160;
  undefined8 uStack_158;
  uint local_150;
  byte ******ppppppbStack_14c;
  undefined4 local_140;
  undefined2 uStack_13c;
  undefined2 uStack_13a;
  byte *******pppppppbStack_138;
  long local_130;
  byte *******local_120;
  byte *******pppppppbStack_118;
  byte *******local_110;
  undefined8 uStack_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  ulong local_c8;
  undefined8 local_c0;
  byte *******local_b0;
  byte *******pppppppbStack_a8;
  byte *******local_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 local_80;
  ulong local_78;
  
  local_140 = 0;
  uStack_13c = 0;
  uStack_13a = 0;
  pppppppbStack_138 = (byte *******)&DAT_00000008;
  local_130 = 0;
  if (((ulong)param_3 & 1) == 0) {
    local_100 = (byte *******)&local_b0;
    local_b0 = (byte *******)CONCAT44(local_b0._4_4_,3);
    uStack_108 = BYTE_00119540._8_8_;
    local_110 = (byte *******)BYTE_00119540;
    local_120 = param_2;
    pppppppbStack_118 = param_3;
    <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
              (&local_1c8,&local_120,
               &anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023);
    pppppppbVar29 = pppppppbStack_1b8;
    pppppppbVar10 = pppppppbStack_1c0;
    pppppppbVar6 = local_1c8;
    if ((int)local_b0 != 3) {
      if (local_1c8 != (byte *******)0x0) {
        __rustc[4794b31dd7191200]::__rust_dealloc(pppppppbStack_1c0,local_1c8,1);
      }
      goto LAB_00167eb0;
    }
    if (local_1c8 == (byte *******)0x8000000000000000) goto LAB_00167eb0;
    if (pppppppbStack_1b8 != (byte *******)0x0) {
      pppppppbVar11 = (byte *******)0x0;
      do {
        ppppppbVar22 = (byte ******)((long)pppppppbVar10 + (long)pppppppbVar11);
        local_1f8 = (ushort)*(byte *)ppppppbVar22;
        local_120 = (byte *******)&DAT_00119620;
        pppppppbStack_118 = (byte *******)0x1;
        local_100 = (byte *******)&DAT_00121000;
        uStack_f8 = 1;
        local_110 = &local_1e0;
        local_1d8 = core::fmt::num::<impl_core::fmt::UpperHex_for_i8>::fmt;
        uStack_108 = 1;
        local_1e0 = ppppppbVar22;
        alloc::fmt::format::format_inner(&local_b0,&local_120);
        pppppppbVar9 = pppppppbStack_a8;
        pppppppbVar8 = local_b0;
        if (pppppppbVar29 <= pppppppbVar11) {
                    /* WARNING: Subroutine does not return */
          core::panicking::panic_bounds_check(pppppppbVar11,pppppppbVar29,&DAT_001c2c48);
        }
        unaff_x23 = local_a0;
        unaff_x24 = local_b0;
        pppppppbVar28 = pppppppbStack_a8;
        if (((*(byte *)ppppppbVar22 ^ 0xff) & 0x1f) == 0) {
          pppppppbVar12 = (byte *******)((long)pppppppbVar11 + 1);
          if (pppppppbVar12 < pppppppbVar29) {
            local_b0 = (byte *******)&local_1f8;
            local_120 = (byte *******)&DAT_00119620;
            pppppppbStack_118 = (byte *******)0x1;
            local_1f8 = (ushort)CONCAT21(local_1f8,
                                         *(undefined1 *)((long)pppppppbVar10 + (long)pppppppbVar12))
            ;
            local_100 = (byte *******)&DAT_00121030;
            uStack_f8 = 1;
            local_110 = (byte *******)&local_b0;
            pppppppbStack_a8 = (byte *******)core::fmt::num::<impl_core::fmt::UpperHex_for_i16>::fmt
            ;
            uStack_108 = 1;
            alloc::fmt::format::format_inner(&local_1c8,&local_120);
            unaff_x23 = pppppppbStack_1b8;
            unaff_x24 = local_1c8;
            pppppppbVar28 = pppppppbStack_1c0;
            if (pppppppbVar8 != (byte *******)0x0) {
              __rustc[4794b31dd7191200]::__rust_dealloc(pppppppbVar9,pppppppbVar8,1);
              unaff_x23 = pppppppbStack_1b8;
              unaff_x24 = local_1c8;
              pppppppbVar28 = pppppppbStack_1c0;
            }
          }
          pppppppbVar8 = (byte *******)((long)pppppppbVar11 + 2);
          pppppppbVar11 = pppppppbVar12;
          if (pppppppbVar29 <= pppppppbVar8) goto LAB_00167e80;
LAB_00167e50:
          uVar24 = (ulong)*(byte *)((long)pppppppbVar10 + (long)pppppppbVar8);
          pppppppbVar8 = (byte *******)((long)pppppppbVar11 + 2);
          uVar30 = local_1f8;
          if (local_130 == CONCAT26(uStack_13a,CONCAT24(uStack_13c,local_140))) goto LAB_00167d38;
        }
        else {
          pppppppbVar8 = (byte *******)((long)pppppppbVar11 + 1);
          if (pppppppbVar8 < pppppppbVar29) goto LAB_00167e50;
LAB_00167e80:
          uVar24 = 0;
          uVar30 = local_1f8;
          if (local_130 == CONCAT26(uStack_13a,CONCAT24(uStack_13c,local_140))) {
LAB_00167d38:
            lVar21 = local_130;
            uVar30 = local_1f8;
            alloc::raw_vec::RawVec<T,A>::grow_one(&local_140,&DAT_001c2c60);
            local_130 = lVar21;
          }
        }
        puVar26 = (undefined8 *)((long)pppppppbStack_138 + local_130 * 10 * 4);
        local_130 = local_130 + 1;
        *puVar26 = unaff_x24;
        puVar26[1] = pppppppbVar28;
        puVar26[2] = unaff_x23;
        puVar26[3] = uVar24;
        *(ushort *)(puVar26 + 4) = uVar30;
        pppppppbVar11 = pppppppbVar8;
      } while (pppppppbVar8 < pppppppbVar29);
    }
    local_210 = CONCAT26(uStack_13a,CONCAT24(uStack_13c,local_140));
    local_200 = local_130;
    puStack_208 = (undefined4 *)pppppppbStack_138;
    if (pppppppbVar6 != (byte *******)0x0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(pppppppbVar10,pppppppbVar6,1);
    }
  }
  else {
LAB_00167eb0:
    local_210 = CONCAT26(uStack_13a,CONCAT24(uStack_13c,local_140));
    puStack_208 = (undefined4 *)pppppppbStack_138;
    local_200 = local_130;
  }
  local_1f8 = 0;
  uStack_1f6 = 0;
  pvStack_1f0 = (void *)0x1;
  local_1e8 = (byte *******)0x0;
  pppppppbVar6 = (byte *******)__rustc[4794b31dd7191200]::__rust_alloc_zeroed(3,1);
  if (pppppppbVar6 == (byte *******)0x0) {
                    /* WARNING: Subroutine does not return */
    alloc::raw_vec::handle_error(1,3,&DAT_001c2c78);
  }
  lVar21 = *(long *)(param_4 + 0x28);
  if (lVar21 != 0) {
    uVar7 = core::hash::BuildHasher::hash_one(param_4 + 0x30,"9F21) = ",4);
    lVar15 = 0;
    bVar17 = (byte)(uVar7 >> 0x39);
    lVar19 = *(long *)(param_4 + 0x10);
    uVar25 = *(ulong *)(param_4 + 0x18);
    uVar7 = uVar7 & uVar25;
    uVar35 = *(undefined8 *)(lVar19 + uVar7);
    uVar24 = CONCAT17(-((byte)((ulong)uVar35 >> 0x38) == bVar17),
                      CONCAT16(-((byte)((ulong)uVar35 >> 0x30) == bVar17),
                               CONCAT15(-((byte)((ulong)uVar35 >> 0x28) == bVar17),
                                        CONCAT14(-((byte)((ulong)uVar35 >> 0x20) == bVar17),
                                                 CONCAT13(-((byte)((ulong)uVar35 >> 0x18) == bVar17)
                                                          ,CONCAT12(-((byte)((ulong)uVar35 >> 0x10)
                                                                     == bVar17),
                                                                    CONCAT11(-((byte)((ulong)uVar35
                                                                                     >> 8) == bVar17
                                                                              ),-((byte)uVar35 ==
                                                                                 bVar17)))))))) &
             0x8080808080808080;
    while( true ) {
      for (; uVar24 != 0; uVar24 = uVar24 - 1 & uVar24) {
        uVar20 = (uVar24 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar24 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
        uVar20 = uVar7 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) & uVar25;
        lVar2 = lVar19 + -0x30 + uVar20 * -0x30;
        if ((*(long *)(lVar2 + 0x
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::crypto::oda::recover_cert`

- Ghidra address: `0x1695a8` (2172 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda12recover_cert17hbd6c03ecf7b32552E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::recover_cert(undefined8 *param_1,void *param_2,ulong param_3,void *param_4,ulong param_5,void *param_6,undefined1 (**param_7) [16]);`
- capstone offset: `0x695a8`  instr: 604
- direct calls (13): `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `@0xbcfe0`, `num_bigint::biguint::convert::from_bitwise_digits_le`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `num_bigint::biguint::BigUint::modpow`, `num_bigint::biguint::convert::to_bitwise_digits_le`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `@0xbcff0`, `alloc::fmt::format::format_inner`, `alloc::alloc::handle_alloc_error`, `alloc::raw_vec::handle_error`, `core::panicking::panic_bounds_check`, `_Unwind_Resume`
- referenced strings (1 unique):
  - `0x21130`: "Recovered length does not match modulus lengthMissing Issuer RemainderIssuer PK Certificate Hash mismatchInvalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID h\u2026"
- Ghidra callees (12): `__rust_alloc`, `__rust_dealloc`, `format_inner`, `from_bitwise_digits_le`, `grow_one`, `handle_alloc_error`, `handle_error`, `memcpy`, `memmove`, `modpow`, `panic_bounds_check`, `to_bitwise_digits_le`

**Ghidra pseudo-C:**

```c
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::recover_cert */

void __rustcall
ckemv_emv_kernel::crypto::oda::recover_cert
          (undefined8 *param_1,void *param_2,ulong param_3,void *param_4,ulong param_5,void *param_6
          ,undefined1 (**param_7) [16])

{
  undefined1 uVar1;
  char acVar2 [16];
  undefined1 (*pauVar3) [16];
  undefined8 *puVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 *puVar9;
  undefined1 (*pauVar10) [16];
  undefined4 *puVar11;
  undefined1 *puVar12;
  undefined4 *puVar13;
  undefined1 (*pauVar14) [16];
  undefined1 (*pauVar15) [16];
  undefined1 (**__n) [16];
  undefined8 uVar16;
  undefined4 uVar17;
  undefined1 auVar18 [16];
  undefined4 uVar19;
  undefined8 uVar20;
  undefined1 auVar21 [16];
  long local_160;
  undefined8 uStack_158;
  undefined8 local_150;
  long local_140;
  undefined8 uStack_138;
  undefined8 local_130;
  long local_120;
  undefined8 uStack_118;
  undefined8 local_110;
  long local_108;
  undefined8 local_100;
  long local_f8;
  undefined1 (**local_f0) [16];
  undefined1 (*pauStack_e8) [16];
  undefined1 (**local_e0) [16];
  undefined1 local_d0 [16];
  undefined8 local_c0;
  undefined1 local_b8 [16];
  undefined8 local_a8;
  undefined1 (**local_a0) [16];
  undefined1 (*pauStack_98) [16];
  undefined1 (**local_90) [16];
  undefined8 uStack_88;
  undefined1 *local_80;
  undefined8 uStack_78;
  undefined1 (*local_70) [16];
  code *pcStack_68;
  
  if (param_3 == 0) {
    local_150 = 0;
    uStack_158 = DAT_00121068._8_8_;
    local_160 = (long)DAT_00121068;
    if (param_5 != 0) goto LAB_00169784;
LAB_0016964c:
    local_130 = 0;
    uStack_138 = DAT_00121068._8_8_;
    local_140 = (long)DAT_00121068;
    if (param_7 != (undefined1 (**) [16])0x0) goto LAB_001698d4;
LAB_00169664:
    local_110 = 0;
    uStack_118 = DAT_00121068._8_8_;
    local_120 = (long)DAT_00121068;
  }
  else {
    if ((long)param_3 < 0) {
      uVar16 = 0;
LAB_00169dbc:
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(uVar16,param_3,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    uVar16 = 1;
    pauVar3 = (undefined1 (*) [16])__rustc[4794b31dd7191200]::__rust_alloc(param_3,1);
    if (pauVar3 == (undefined1 (*) [16])0x0) goto LAB_00169dbc;
    memcpy(pauVar3,param_2,param_3);
    if (param_3 != 1) {
      uVar5 = param_3 >> 1;
      if (param_3 < 8) {
        uVar7 = 0;
      }
      else {
        if (param_3 < 0x20) {
          uVar8 = 0;
        }
        else {
          uVar7 = uVar5 & 0x3ffffffffffffff0;
          uVar8 = uVar7;
          pauVar14 = pauVar3;
          pauVar15 = (undefined1 (*) [16])(*pauVar3 + param_3);
          do {
            pauVar10 = pauVar15 + -1;
            uVar8 = uVar8 - 0x10;
            auVar18 = NEON_rev64(*pauVar10,1);
            auVar21 = NEON_rev64(*pauVar14,1);
            auVar18 = NEON_ext(auVar18,auVar18,8,1);
            auVar21 = NEON_ext(auVar21,auVar21,8,1);
            *(long *)(*pauVar14 + 8) = auVar18._8_8_;
            *(long *)*pauVar14 = auVar18._0_8_;
            *(long *)(pauVar15[-1] + 8) = auVar21._8_8_;
            *(long *)*pauVar10 = auVar21._0_8_;
            pauVar14 = pauVar14 + 1;
            pauVar15 = pauVar10;
          } while (uVar8 != 0);
          if (uVar5 == uVar7) goto LAB_0016975c;
          uVar8 = uVar7;
          if ((param_3 & 0x18) == 0) goto LAB_00169730;
        }
        uVar7 = uVar5 & 0x3ffffffffffffffc;
        puVar13 = (undefined4 *)(*pauVar3 + uVar8);
        lVar6 = uVar8 - uVar7;
        puVar11 = (undefined4 *)((param_3 - uVar8) + (long)pauVar3);
        do {
          puVar11 = puVar11 + -1;
          uVar17 = *puVar11;
          uVar19 = *puVar13;
          lVar6 = lVar6 + 4;
          uVar16 = NEON_rev64((ulong)CONCAT16((char)((uint)uVar17 >> 0x18),
                                              (uint6)CONCAT14((char)((uint)uVar17 >> 0x10),
                                                              (uint)CONCAT12((char)((uint)uVar17 >>
                                                                                   8),(ushort)(byte)
                                                  uVar17))),2);
          uVar20 = NEON_rev64((ulong)CONCAT16((char)((uint)uVar19 >> 0x18),
                                              (uint6)CONCAT14((char)((uint)uVar19 >> 0x10),
                                                              (uint)CONCAT12((char)((uint)uVar19 >>
                                                                                   8),(ushort)(byte)
                                                  uVar19))),2);
          *puVar13 = CONCAT13((char)((ulong)uVar16 >> 0x30),
                              CONCAT12((char)((ulong)uVar16 >> 0x20),
                                       CONCAT11((char)((ulong)uVar16 >> 0x10),(char)uVar16)));
          puVar13 = puVar13 + 1;
          *puVar11 = CONCAT13((char)((ulong)uVar20 >> 0x30),
                              CONCAT12((char)((ulong)uVar20 >> 0x20),
                                       CONCAT11((char)((ulong)uVar20 >> 0x10),(char)uVar20)));
        } while (lVar6 != 0);
        if (uVar5 == uVar7) goto LAB_0016975c;
      }
LAB_00169730:
      lVar6 = uVar5 - uVar7;
      puVar9 = *pauVar3 + uVar7;
      puVar12 = *pauVar3 + ~uVar7 + param_3;
      do {
        uVar1 = *puVar9;
        lVar6 = lVar6 + -1;
        *puVar9 = *puVar12;
        *puVar12 = uVar1;
        puVar9 = puVar9 + 1;
        puVar12 = puVar12 + -1;
      } while (lVar6 != 0);
    }
LAB_0016975c:
    num_bigint::biguint::convert::from_bitwise_digits_le(&local_160,pauVar3,param_3,8);
    __rustc[4794b31dd7191200]::__rust_dealloc(pauVar3,param_3,1);
    if (param_5 == 0) goto LAB_0016964c;
LAB_00169784:
    if ((long)param_5 < 0) {
      uVar16 = 0;
LAB_00169dd4:
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(uVar16,param_5,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    uVar16 = 1;
    pauVar3 = (undefined1 (*) [16])__rustc[4794b31dd7191200]::__rust_alloc(param_5,1);
    if (pauVar3 == (undefined1 (*) [16])0x0) goto LAB_00169dd4;
    memcpy(pauVar3,param_4,param_5);
    if (param_5 != 1) {
      uVar5 = param_5 >> 1;
      if (param_5 < 8) {
        uVar7 = 0;
      }
      else {
        if (param_5 < 0x20) {
          uVar8 = 0;
        }
        else {
          uVar7 = uVar5 & 0x3ffffffffffffff0;
          uVar8 = uVar7;
          pauVar14 = pauVar3;
          pauVar15 = (undefined1 (*) [16])(*pauVar3 + param_5);
          do {
            pauVar10 = pauVar15 + -1;
            uVar8 = uVar8 - 0x10;
            auVar18 = NEON_rev64(*pauVar10,1);
            auVar21 = NEON_rev64(*pauVar14,1);
            auVar18 = NEON_ext(auVar18,auVar18,8,1);
            auVar21 = NEON_ext(auVar21,auVar21,8,1);
            *(long *)(*pauVar14 + 8) = auVar18._8_8_;
            *(long *)*pauVar14 = auVar18._0_8_;
            *(long *)(pauVar15[-1] + 8) = auVar21._8_8_;
            *(long *)*pauVar10 = auVar21._0_8_;
            pauVar14 = pauVar14 + 1;
            pauVar15 = pauVar10;
          } while (uVar8 != 0);
          if (uVar5 == uVar7) goto LAB_001698ac;
          uVar8 = uVar7;
          if ((param_5 & 0x18) == 0) goto LAB_00169880;
        }
        uVar7 = uVar5 & 0x3ffffffffffffffc;
        puVar13 = (undefined4 *)(*pauVar3 + uVar8);
        lVar6 = uVar8 - uVar7;
        puVar11 = (undefined4 *)((param_5 - uVar8) + (long)pauVar3);
        do {
          puVar11 = puVar11 + -1;
          uVar17 = *puVar11;
          uVar19 = *puVar13;
          lVar6 = lVar6 + 4;
          uVar16 = NEON_rev64((ulong)CONCAT16((char)((uint)uVar17 >> 0x18),
                                              (uint6)CONCAT14((char)((uint)uVar17 >> 0x10),
                                                              (uint)CONCAT12((char)((uint)uVar17 >>
                                                                                   8),(ushort)(byte)
                                                  uVar17))),2);
          uVar20 = NEON_rev64((ulong)CONCAT16((char)((uint)uVar19 >> 0x18),
                                              (uint6)CONCAT14((char)((uint)uVar19 >> 0x10),
                                                              (uint)CONCAT12((char)((uint)uVar19 >>
                                                                                   8),(ushort)(byte)
                                                  uVar19))),2);
          *puVar13 = CONCAT13((char)((ulong)uVar16 >> 0x30),
                              CONCAT12((char)((ulong)uVar16 >> 0x20),
                                       CONCAT11((char)((ulong)uVar16 >> 0x10),(char)uVar16)));
          puVar13 = puVar13 + 1;
          *puVar11 = CONCAT13((char)((ulong)uVar20 >> 0x30),
                              CONCAT12((char)((ulong)uVar20 >> 0x20),
                                       CONCAT11((char)((ulong)uVar20 >> 0x10),(char)uVar20)));
        } while (lVar6 != 0);
        if (uVar5 == uVar7) goto LAB_001698ac;
      }
LAB_00169880:
      lVar6 = uVar5 - uVar7;
      puVar9 = *pauVar3 + uVar7;
      puVar12 = *pauVar3 + ~uVar7 + param_5;
      do {
        uVar1 = *puVar9;
        lVar6 = lVar6 + -1;
        *puVar9 = *puVar12;
        *puVar12 = uVar1;
        puVar9 = puVar9 + 1;
        puVar12 = puVar12 + -1;
      } while (lVar6 != 0);
    }
LAB_001698ac:
    num_bigint::biguint::convert::from_bitwise_digits_le(&local_140,pauVar3,param_5,8);
    __rustc[4794b31dd7191200]::__rust_dealloc(pauVar3,param_5,1);
    if (param_7 == (undefined1 (**) [16])0x0) goto LAB_00169664;
LAB_001698d4:
    if ((long)param_7 < 0) {
      uVar16 = 0;
LAB_00169df0:
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(uVar16,param_7,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    uVar16 = 1;
    p
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::crypto::oda::verify_issuer_public_key`

- Ghidra address: `0x169f18` (1596 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda24verify_issuer_public_key17h2d41cbd3b86c2927E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::verify_issuer_public_key(undefined8 *param_1,undefined8 param_2,undefined8 param_3,void *param_4,ulong param_5,void *param_6,ulong param_7,undefined8 param_8,undefined8 param_9,undefined8 param_10,undefined8 param_11);`
- capstone offset: `0x69f18`  instr: 432
- direct calls (12): `ckemv_emv_kernel::crypto::oda::recover_cert`, `@0xbcfe0`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `sha1::compress::compress`, `@0xbd060`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `core::slice::index::slice_index_order_fail`, `core::slice::index::slice_end_index_len_fail`, `core::panicking::panic_bounds_check`, `alloc::raw_vec::handle_error`, `_Unwind_Resume`
- referenced strings (3 unique):
  - `0x21199`: "Invalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK \u2026"
  - `0x21176`: "Issuer PK Certificate Hash mismatchInvalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Iss\u2026"
  - `0x2115e`: "Missing Issuer RemainderIssuer PK Certificate Hash mismatchInvalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Pu\u2026"
- Ghidra callees (11): `__rust_alloc`, `__rust_dealloc`, `compress`, `do_reserve_and_handle`, `handle_error`, `memcpy`, `memset`, `panic_bounds_check`, `recover_cert`, `slice_end_index_len_fail`, `slice_index_order_fail`

**Ghidra pseudo-C:**

```c
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::verify_issuer_public_key */

void __rustcall
ckemv_emv_kernel::crypto::oda::verify_issuer_public_key
          (undefined8 *param_1,undefined8 param_2,undefined8 param_3,void *param_4,ulong param_5,
          void *param_6,ulong param_7,undefined8 param_8,undefined8 param_9,undefined8 param_10,
          undefined8 param_11)

{
  long *plVar1;
  size_t sVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  char *pcVar6;
  void *__src;
  ulong uVar7;
  long lVar8;
  uint uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  void *pvVar13;
  long lVar14;
  undefined1 auVar15 [16];
  long local_1d0;
  void *local_1c8;
  ulong local_1c0;
  ulong local_1b8;
  long local_1b0;
  long lStack_1a8;
  uint local_1a0;
  undefined4 uStack_19c;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  ulong uStack_160;
  undefined1 local_158;
  undefined7 uStack_157;
  long local_150;
  long lStack_148;
  uint local_140;
  int local_130;
  undefined4 uStack_12c;
  long lStack_128;
  long local_120;
  ulong local_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  ulong local_d8;
  undefined8 local_d0;
  long local_c0;
  long lStack_b8;
  uint local_b0;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  ulong uStack_68;
  
  recover_cert(&local_130,param_2,param_3,param_10,param_11,param_8,param_9);
  uVar12 = local_118;
  lVar4 = local_120;
  lVar3 = lStack_128;
  if (local_130 == 1) {
    param_1[2] = local_120;
    param_1[3] = local_118;
    *param_1 = 1;
    param_1[1] = lStack_128;
    return;
  }
  if (local_118 < 2) {
                    /* WARNING: Subroutine does not return */
    core::panicking::panic_bounds_check
              (1,local_118,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e00);
  }
  if (*(char *)(local_120 + 1) != '\x02') {
    pcVar6 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x1a,1);
    if (pcVar6 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x1a,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    param_1[2] = pcVar6;
    param_1[3] = 0x1a;
    builtin_strncpy(pcVar6,"Invalid Issuer Cert format",0x1a);
    auVar15 = _DAT_00119830;
    param_1[1] = DAT_00119830._8_8_;
    *param_1 = auVar15._0_8_;
    goto joined_r0x0016a2c4;
  }
  uVar5 = local_118 - 0x15;
  if (local_118 - 1 < uVar5) {
                    /* WARNING: Subroutine does not return */
    core::slice::index::slice_index_order_fail
              (uVar5,local_118 - 1,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e18);
  }
  local_1c0 = 0;
  local_1d0 = 0;
  local_1c8 = (void *)0x1;
  if (uVar5 == 0) {
                    /* WARNING: Subroutine does not return */
    core::slice::index::slice_index_order_fail(1,0,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e30)
    ;
  }
  if (local_118 < 0x15) {
                    /* WARNING: Subroutine does not return */
    core::slice::index::slice_end_index_len_fail
              (uVar5,local_118,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e30);
  }
  sVar2 = local_118 - 0x16;
  if (sVar2 != 0) {
    alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_1d0,0,sVar2,1,1);
  }
  uVar7 = local_1c0;
  pvVar13 = local_1c8;
  lVar10 = local_1d0;
  memcpy((void *)((long)local_1c8 + local_1c0),(char *)(local_120 + 1),sVar2);
  local_1c0 = uVar7 + sVar2;
  if (param_4 == (void *)0x0) {
    uVar7 = lVar10 - local_1c0;
  }
  else {
    if (lVar10 - local_1c0 < param_5) {
      alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                (&local_1d0,local_1c0,param_5,1,1);
      pvVar13 = local_1c8;
      lVar10 = local_1d0;
    }
    uVar7 = local_1c0;
    memcpy((void *)((long)pvVar13 + local_1c0),param_4,param_5);
    local_1c0 = uVar7 + param_5;
    uVar7 = lVar10 - local_1c0;
  }
  if (uVar7 < param_7) {
    alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_1d0,local_1c0,param_7,1,1)
    ;
    pvVar13 = local_1c8;
  }
  uVar7 = local_1c0;
  memcpy((void *)((long)pvVar13 + local_1c0),param_6,param_7);
  uVar7 = uVar7 + param_7;
  local_158 = 0;
  local_1b8 = 0;
  uStack_160 = 0;
  local_168 = 0;
  uStack_170 = 0;
  local_178 = 0;
  uStack_180 = 0;
  local_188 = 0;
  uStack_190 = 0;
  local_198 = 0;
  lStack_1a8 = DAT_00119730._8_8_;
  local_1b0 = (long)DAT_00119730;
  local_1a0 = 0xc3d2e1f0;
  __src = pvVar13;
  local_1c0 = uVar7;
  if (0x3f < uVar7) {
    local_1b8 = uVar7 >> 6;
    sha1::compress::compress(&local_1b0,pvVar13);
    uVar11 = uVar7 & 0xffffffffffffffc0;
    uVar7 = uVar7 & 0x3f;
    __src = (void *)((long)pvVar13 + uVar11);
  }
  memcpy(&local_198,__src,uVar7);
  local_158 = (undefined1)uVar7;
  uStack_e8 = uStack_170;
  local_f0 = local_178;
  local_d8 = uStack_160;
  uStack_e0 = local_168;
  local_118 = CONCAT44(uStack_19c,local_1a0);
  local_d0 = CONCAT71(uStack_157,local_158);
  lStack_128 = local_1b0;
  local_130 = (int)local_1b8;
  uStack_12c = (undefined4)(local_1b8 >> 0x20);
  local_120 = lStack_1a8;
  uVar7 = uVar7 & 0xff;
  uVar9 = (uint)local_d0;
  uStack_108 = uStack_190;
  local_110 = local_198;
  uStack_f8 = uStack_180;
  uStack_100 = local_188;
  lStack_b8 = lStack_1a8;
  local_c0 = local_1b0;
  uVar11 = local_1b8 << 9 | uVar7 << 3;
  local_b0 = local_1a0;
  *(undefined1 *)((long)&local_110 + uVar7) = 0x80;
  uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
  uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
  uVar11 = uVar11 >> 0x20 | uVar11 << 0x20;
  if (((uVar9 & 0xff) == 0x3f) ||
     (memset((void *)((long)&local_110 + uVar7 + 1),0,uVar7 ^ 0x3f), (uVar7 ^ 0x38) < 8)) {
    sha1::compress::compress(&local_c0,&local_110,1);
    local_70 = 0;
    uStack_88 = 0;
    local_90 = 0;
    uStack_78 = 0;
    uStack_80 = 0;
    uStack_98 = 0;
    local_a0 = 0;
    uStack_68 = uVar11;
    sha1::compress::compress(&local_c0,&local_a0,1);
  }
  else {
    local_d8 = uVar11;
    sha1::compress::compress(&local_c0,&local_110,1);
  }
  auVar15._8_8_ = lStack_b8;
  auVar15._0_8_ = local_c0;
  auVar15 = NEON_rev32(auVar15,1);
  plVar1 = (long *)(lVar4 + uVar5);
  lStack_148 = auVar15._8_8_;
  local_150 = auVar15._0_8_;
  uVar9 = (local_b0 & 0xff00ff00) >> 8 | (local_b0 & 0xff00ff) << 8;
  local_140 = uVar9 >> 0x10 | uVar9 << 0x10;
  if ((local_150 == *plVar1 && lStack_148 == plVar1[1]) && local_140 == *(uint *)(plVar1 + 2)) {
    uVar5 = (ulong)*(byte *)(lVar4 + 0xd);
    local_130 = 0;
    uStack_12c = 0;
    lStack_128 = 1;
    local_120 = 0;
    if (uVar12 - 0x24 < uVar5) {
      sVar2 = uVar12 - 0x24;
      if (sVar2 != 0) {
        alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_130,0,sVar2,1,1);
      }
      lVar10 = local_120;
      lVar14 = lStack_128;
      memcpy((void *)(lStack_128 + local_120),(void *)(lVar4 + 0xf),sVar2);
      local_120 = lVar10 + sVar2;
      if (param_4 == (void *)0x0) {
        pcVar6 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x18,1);
        if (pcVar6 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error(1,0x18,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
        }
        pcVar6[8] = 'I';
        pcVar6[9] = 's';
        pcVar6[10] = 's';
        pcVar6[0xb] = 'u';
        pcVar6[0xc] = 'e';
        pcVar6[0xd] = 'r';
        pcVar6[0xe] = ' ';
        pcVar6[0xf] = 'R';
        pcVar6[0] = 'M';
        auVar15 = _DAT_00119740;
        pcVar6[1] = 'i';
        pcVar6[2] = 's';
        pcVar6[3] = 's';
        pcVar6[4] = 'i';
        pcVar6[5] = 'n';
        pcVar6[6] = 'g';
        pcVar6[7] = ' ';
        *(char (*) [8])(pcVar6 + 0x10) = (char  [8])0x7265646e69616d65;
        param_1[2] = pcVar6;
        param_1[3] = 0x18;
        param_1[1] = auVar15._8_8_;
        *param_1 = auVar15._0_8_;
        if (CONCAT44(uStack_12c,local_130) != 0) {
          __rustc[4794b31dd7191200]::__rust_dealloc(lVar14,CONCAT44(uStack_12c,local_130),1);
        }
        goto LAB_0016a2b0;
      }
      lVar8 = CONCAT44(uStack_12c,local_130);
      lVar10 = (long)param_4 + param_5;
    }
    else {
      if (uVar12 < uVar5 + 0xf) {
                    /* WARNING: Subroutine does not return */
        core::slice::index::slice_end_index_len_fail
                  (uVar5 + 0xf,uVar12,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e48);
      }
      param_4 = (void *)(lVar4 + 0xf);
      lVar8 = 0;
      lVar10 = (long)param_4 + uVar5;
      lVar14 = 1;
    }
    uVar12 = lVar10 - (long)param_4;
    if ((ulong)(lVar8 - local_120) < uVar12) {
      alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                (&local_130,local_120,uVar12,1,1);
      lVar14 = lStack_128;
    }
    lVar10 = local_120;
    memcpy((void *)(lVar14 + local_120),param_4,uVar12);
    param_1[3] = lVar10 + uVar12;
    param_1[2] = lStack_128;
    param_1[1] = CONCAT44(uStack_12c,local_130);
    *param_1 = 0;
    if (local_1d0 != 0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(local_1c8,local_1d0,1);
    }
  }
  else {
    pcVar6 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x23,1);
    if (pcVar6 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x23,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    builtin_strncpy(pcVar6 + 0x1f,"atch",4);
    param_1[2] = pcVar6;
    param_1[3] = 0x23;
    builtin_strncpy(pcVar6,"Issuer PK Certificate Hash misma",0x20);
    auVar15 = _BYTE_
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::crypto::oda::verify_icc_public_key`

- Ghidra address: `0x16a5d8` (1628 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda21verify_icc_public_key17hbc4efd513c67c19eE`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::verify_icc_public_key(undefined8 *param_1,undefined8 param_2,undefined8 param_3,void *param_4,ulong param_5,void *param_6,ulong param_7,undefined8 param_8,undefined8 param_9,undefined8 param_10,undefined8 param_11,void *param_12,ulong param_13);`
- capstone offset: `0x6a5d8`  instr: 440
- direct calls (12): `ckemv_emv_kernel::crypto::oda::recover_cert`, `@0xbcfe0`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `sha1::compress::compress`, `@0xbd060`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `core::slice::index::slice_index_order_fail`, `core::slice::index::slice_end_index_len_fail`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `core::panicking::panic_bounds_check`, `alloc::raw_vec::handle_error`, `_Unwind_Resume`
- referenced strings (3 unique):
  - `0x211c8`: "Invalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short\u2026"
  - `0x1a3c8`: "ICC PK Certificate Hash mismatchindex out of bounds: the len is "
  - `0x211b3`: "Missing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK \u2026"
- Ghidra callees (11): `__rust_alloc`, `__rust_dealloc`, `compress`, `do_reserve_and_handle`, `handle_error`, `memcpy`, `memset`, `panic_bounds_check`, `recover_cert`, `slice_end_index_len_fail`, `slice_index_order_fail`

**Ghidra pseudo-C:**

```c
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::verify_icc_public_key */

void __rustcall
ckemv_emv_kernel::crypto::oda::verify_icc_public_key
          (undefined8 *param_1,undefined8 param_2,undefined8 param_3,void *param_4,ulong param_5,
          void *param_6,ulong param_7,undefined8 param_8,undefined8 param_9,undefined8 param_10,
          undefined8 param_11,void *param_12,ulong param_13)

{
  long *plVar1;
  size_t sVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  char *pcVar6;
  void *__src;
  ulong uVar7;
  long lVar8;
  uint uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  void *pvVar14;
  undefined1 auVar15 [16];
  long local_1d0;
  void *local_1c8;
  ulong local_1c0;
  ulong local_1b8;
  long local_1b0;
  long lStack_1a8;
  uint local_1a0;
  undefined4 uStack_19c;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  undefined8 local_178;
  undefined8 uStack_170;
  undefined8 local_168;
  ulong uStack_160;
  undefined1 local_158;
  undefined7 uStack_157;
  long local_150;
  long lStack_148;
  uint local_140;
  int local_130;
  undefined4 uStack_12c;
  long lStack_128;
  long local_120;
  ulong local_118;
  undefined8 local_110;
  undefined8 uStack_108;
  undefined8 uStack_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  undefined8 uStack_e8;
  undefined8 uStack_e0;
  ulong local_d8;
  undefined8 local_d0;
  long local_c0;
  long lStack_b8;
  uint local_b0;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  ulong uStack_68;
  
  recover_cert(&local_130,param_2,param_3,param_10,param_11,param_8,param_9);
  uVar12 = local_118;
  lVar4 = local_120;
  lVar3 = lStack_128;
  if (local_130 == 1) {
    param_1[2] = local_120;
    param_1[3] = local_118;
    *param_1 = 1;
    param_1[1] = lStack_128;
    return;
  }
  if (local_118 < 2) {
                    /* WARNING: Subroutine does not return */
    core::panicking::panic_bounds_check
              (1,local_118,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e60);
  }
  if (*(char *)(local_120 + 1) != '\x04') {
    pcVar6 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x17,1);
    if (pcVar6 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x17,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    pcVar6[8] = 'I';
    pcVar6[9] = 'C';
    pcVar6[10] = 'C';
    pcVar6[0xb] = ' ';
    pcVar6[0xc] = 'C';
    pcVar6[0xd] = 'e';
    pcVar6[0xe] = 'r';
    pcVar6[0xf] = 't';
    pcVar6[0] = 'I';
    auVar15 = _DAT_001196e0;
    pcVar6[1] = 'n';
    pcVar6[2] = 'v';
    pcVar6[3] = 'a';
    pcVar6[4] = 'l';
    pcVar6[5] = 'i';
    pcVar6[6] = 'd';
    pcVar6[7] = ' ';
    *(char (*) [8])(pcVar6 + 0xf) = (char  [8])0x74616d726f662074;
    param_1[2] = pcVar6;
    param_1[3] = 0x17;
    param_1[1] = auVar15._8_8_;
    *param_1 = auVar15._0_8_;
    goto joined_r0x0016a970;
  }
  uVar5 = local_118 - 0x15;
  if (local_118 - 1 < uVar5) {
                    /* WARNING: Subroutine does not return */
    core::slice::index::slice_index_order_fail
              (uVar5,local_118 - 1,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e78);
  }
  local_1c0 = 0;
  local_1d0 = 0;
  local_1c8 = (void *)0x1;
  if (uVar5 == 0) {
                    /* WARNING: Subroutine does not return */
    core::slice::index::slice_index_order_fail(1,0,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e90)
    ;
  }
  if (local_118 < 0x15) {
                    /* WARNING: Subroutine does not return */
    core::slice::index::slice_end_index_len_fail
              (uVar5,local_118,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2e90);
  }
  sVar2 = local_118 - 0x16;
  if (sVar2 != 0) {
    alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_1d0,0,sVar2,1,1);
  }
  uVar7 = local_1c0;
  pvVar14 = local_1c8;
  lVar10 = local_1d0;
  memcpy((void *)((long)local_1c8 + local_1c0),(char *)(local_120 + 1),sVar2);
  local_1c0 = uVar7 + sVar2;
  if (param_4 == (void *)0x0) {
    uVar7 = lVar10 - local_1c0;
  }
  else {
    if (lVar10 - local_1c0 < param_5) {
      alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                (&local_1d0,local_1c0,param_5,1,1);
      lVar10 = local_1d0;
      pvVar14 = local_1c8;
    }
    uVar7 = local_1c0;
    memcpy((void *)((long)pvVar14 + local_1c0),param_4,param_5);
    local_1c0 = uVar7 + param_5;
    uVar7 = lVar10 - local_1c0;
  }
  if (uVar7 < param_7) {
    alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_1d0,local_1c0,param_7,1,1)
    ;
    lVar10 = local_1d0;
    pvVar14 = local_1c8;
  }
  uVar7 = local_1c0;
  memcpy((void *)((long)pvVar14 + local_1c0),param_6,param_7);
  local_1c0 = uVar7 + param_7;
  if (lVar10 - local_1c0 < param_13) {
    alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
              (&local_1d0,local_1c0,param_13,1,1);
    pvVar14 = local_1c8;
  }
  uVar7 = local_1c0;
  memcpy((void *)((long)pvVar14 + local_1c0),param_12,param_13);
  uVar7 = uVar7 + param_13;
  local_158 = 0;
  local_1b8 = 0;
  uStack_160 = 0;
  local_168 = 0;
  uStack_170 = 0;
  local_178 = 0;
  uStack_180 = 0;
  local_188 = 0;
  uStack_190 = 0;
  local_198 = 0;
  lStack_1a8 = DAT_00119730._8_8_;
  local_1b0 = (long)DAT_00119730;
  local_1a0 = 0xc3d2e1f0;
  __src = pvVar14;
  local_1c0 = uVar7;
  if (0x3f < uVar7) {
    local_1b8 = uVar7 >> 6;
    sha1::compress::compress(&local_1b0,pvVar14);
    uVar11 = uVar7 & 0xffffffffffffffc0;
    uVar7 = uVar7 & 0x3f;
    __src = (void *)((long)pvVar14 + uVar11);
  }
  memcpy(&local_198,__src,uVar7);
  local_158 = (undefined1)uVar7;
  uStack_e8 = uStack_170;
  local_f0 = local_178;
  local_d8 = uStack_160;
  uStack_e0 = local_168;
  local_118 = CONCAT44(uStack_19c,local_1a0);
  local_d0 = CONCAT71(uStack_157,local_158);
  lStack_128 = local_1b0;
  local_130 = (int)local_1b8;
  uStack_12c = (undefined4)(local_1b8 >> 0x20);
  local_120 = lStack_1a8;
  uVar7 = uVar7 & 0xff;
  uVar9 = (uint)local_d0;
  uStack_108 = uStack_190;
  local_110 = local_198;
  uStack_f8 = uStack_180;
  uStack_100 = local_188;
  lStack_b8 = lStack_1a8;
  local_c0 = local_1b0;
  uVar11 = local_1b8 << 9 | uVar7 << 3;
  local_b0 = local_1a0;
  *(undefined1 *)((long)&local_110 + uVar7) = 0x80;
  uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
  uVar11 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
  uVar11 = uVar11 >> 0x20 | uVar11 << 0x20;
  if (((uVar9 & 0xff) == 0x3f) ||
     (memset((void *)((long)&local_110 + uVar7 + 1),0,uVar7 ^ 0x3f), (uVar7 ^ 0x38) < 8)) {
    sha1::compress::compress(&local_c0,&local_110,1);
    local_70 = 0;
    uStack_88 = 0;
    local_90 = 0;
    uStack_78 = 0;
    uStack_80 = 0;
    uStack_98 = 0;
    local_a0 = 0;
    uStack_68 = uVar11;
    sha1::compress::compress(&local_c0,&local_a0,1);
  }
  else {
    local_d8 = uVar11;
    sha1::compress::compress(&local_c0,&local_110,1);
  }
  auVar15._8_8_ = lStack_b8;
  auVar15._0_8_ = local_c0;
  auVar15 = NEON_rev32(auVar15,1);
  plVar1 = (long *)(lVar4 + uVar5);
  lStack_148 = auVar15._8_8_;
  local_150 = auVar15._0_8_;
  uVar9 = (local_b0 & 0xff00ff00) >> 8 | (local_b0 & 0xff00ff) << 8;
  local_140 = uVar9 >> 0x10 | uVar9 << 0x10;
  if ((local_150 == *plVar1 && lStack_148 == plVar1[1]) && local_140 == *(uint *)(plVar1 + 2)) {
    uVar5 = (ulong)*(byte *)(lVar4 + 0xd);
    local_130 = 0;
    uStack_12c = 0;
    lStack_128 = 1;
    local_120 = 0;
    if (uVar12 - 0x2a < uVar5) {
      sVar2 = uVar12 - 0x2a;
      if (sVar2 != 0) {
        alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_130,0,sVar2,1,1);
      }
      lVar10 = local_120;
      lVar13 = lStack_128;
      memcpy((void *)(lStack_128 + local_120),(void *)(lVar4 + 0x15),sVar2);
      local_120 = lVar10 + sVar2;
      if (param_4 == (void *)0x0) {
        pcVar6 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x15,1);
        if (pcVar6 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error(1,0x15,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
        }
        pcVar6[8] = 'I';
        pcVar6[9] = 'C';
        pcVar6[10] = 'C';
        pcVar6[0xb] = ' ';
        pcVar6[0xc] = 'R';
        pcVar6[0xd] = 'e';
        pcVar6[0xe] = 'm';
        pcVar6[0xf] = 'a';
        pcVar6[0] = 'M';
        auVar15 = _BYTE_00119560;
        pcVar6[1] = 'i';
        pcVar6[2] = 's';
        pcVar6[3] = 's';
        pcVar6[4] = 'i';
        pcVar6[5] = 'n';
        pcVar6[6] = 'g';
        pcVar6[7] = ' ';
        *(char (*) [8])(pcVar6 + 0xd) = (char  [8])0x7265646e69616d65;
        param_1[2] = pcVar6;
        param_1[3] = 0x15;
        param_1[1] = auVar15._8_8_;
        *param_1 = auVar15._0_8_;
        if (CONCAT44(uStack_12c,local_130) != 0) {
          __rustc[4794b31dd7191200]::__rust_dealloc(lVar13,CONCAT44(uStack_12c,local_130),1);
        }
        goto LAB_0016a95c;
      }
      lVar8 = CONCAT44(uStack_12c,local_130);
      lVar10 = (long)param_4 + param_5;
    }
    else {
      if (uVar12 < uVar5 + 0x15) {
                    /* WARNING: Subroutine does not return */
        core::slice::index::slice_end_index_len_fail
                  (uVar5 + 0x15,uVar12,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2ea8);
      }
      param_4 = (void *)(lVar4 + 0x15);
      lVar8 = 0;
      lVar10 = (long)param_4 + uVar5;
      lVar13 = 1;
    }
    uVar12 = lVar10 - (long)param_4;
    if ((ulong)(lVar8 - local_120) < uVar12) {
      alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                (&local_130,local_120,uVar12,1,1);
      lVar13 = lStack_128;
    }
    lVar10 = local_120;
    memcpy((void *)(lVar13 + local_120),param_4,
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::crypto::oda::build_static_data`

- Ghidra address: `0x16acb8` (1232 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda17build_static_data17h981de27f3e76f484E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::build_static_data(long *param_1,long param_2);`
- capstone offset: `0x6acb8`  instr: 348
- direct calls (6): `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `@0xbcfe0`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `_Unwind_Resume`
- Ghidra callees (5): `__rust_dealloc`, `do_reserve_and_handle`, `from_iter`, `grow_one`, `memcpy`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::build_static_data */

void __rustcall ckemv_emv_kernel::crypto::oda::build_static_data(long *param_1,long param_2)

{
  bool bVar1;
  char *pcVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  char cVar8;
  char cVar9;
  long lVar10;
  char *pcVar11;
  long lVar12;
  byte *pbVar13;
  char *pcVar14;
  byte bVar15;
  char *pcVar16;
  long lVar17;
  char *pcVar18;
  long lVar19;
  byte bVar20;
  long lVar21;
  long lVar22;
  char *pcVar23;
  byte *pbVar24;
  byte *pbVar25;
  char *pcVar26;
  long local_f8;
  long local_e0;
  long lStack_d8;
  long local_d0;
  long local_c8;
  char *local_c0;
  long local_b8;
  int local_b0 [4];
  long local_a0;
  byte *local_98;
  ulong local_90;
  undefined8 local_88;
  ulong uStack_80;
  undefined8 local_78;
  undefined8 uStack_70;
  int *local_68;
  
  local_e0 = 0;
  lStack_d8 = 1;
  local_d0 = 0;
  local_c8 = 0;
  local_c0 = (char *)0x1;
  local_b8 = 0;
  if ((*(long *)(param_2 + 0x1c8) != -0x8000000000000000) &&
     ((*(ulong *)(param_2 + 0x1d8) & 1) == 0)) {
    local_88 = *(undefined8 *)(param_2 + 0x1d0);
    local_68 = local_b0;
    local_b0[0] = 3;
    uStack_70 = 0;
    local_78 = 2;
    uStack_80 = *(ulong *)(param_2 + 0x1d8);
    <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
              (&local_a0,&local_88,&anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023
              );
    pbVar13 = local_98;
    lVar21 = local_a0;
    if (local_b0[0] == 3) {
      pbVar24 = local_98;
      uVar4 = local_90;
      if (local_a0 == -0x8000000000000000) goto LAB_0016ae5c;
      for (; uVar4 != 0; uVar4 = uVar4 - uVar3) {
        uVar3 = uVar4;
        if (3 < uVar4) {
          uVar3 = 4;
          bVar5 = pbVar24[3];
          if (bVar5 != 0) {
            bVar6 = *pbVar24;
            bVar7 = pbVar24[1];
            lVar22 = local_b8 << 1;
            bVar20 = 0;
            bVar15 = 1;
            do {
              lVar17 = local_b8;
              if (local_b8 == local_c8) {
                alloc::raw_vec::RawVec<T,A>::grow_one
                          (&local_c8,&PTR_s_ckemv_emv_kernel_src_crypto_oda__001c2ec0);
              }
              local_b8 = lVar17 + 1;
              pbVar25 = (byte *)(local_c0 + lVar22);
              lVar22 = lVar22 + 2;
              *pbVar25 = bVar6 >> 3;
              pbVar25[1] = bVar20 + bVar7;
              bVar1 = bVar15 < bVar5;
              bVar20 = bVar15;
              bVar15 = bVar15 + 1;
            } while (bVar1);
          }
        }
        pbVar24 = pbVar24 + uVar3;
      }
    }
    if (lVar21 != 0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(pbVar13,lVar21,1);
    }
  }
LAB_0016ae5c:
  pcVar11 = local_c0;
  lVar22 = local_c8;
  lVar17 = *(long *)(param_2 + 0x10);
  lVar21 = 0;
  if ((lVar17 != 0) && (local_b8 != 0)) {
    lVar10 = (ulong)(lVar17 != 0) * 0x20;
    lVar21 = 0;
    pcVar2 = local_c0 + local_b8 * 2;
    pcVar18 = *(char **)(param_2 + 8);
    local_f8 = 1;
    pcVar26 = local_c0;
    do {
      cVar8 = *pcVar26;
      cVar9 = pcVar26[1];
      pcVar26 = pcVar26 + 2;
      pcVar14 = pcVar18 + lVar10;
      lVar19 = lVar10 + lVar17 * -0x20;
      pcVar23 = pcVar18;
      do {
        pcVar16 = pcVar14;
        if (((*pcVar23 == cVar8) && (pcVar23[1] == cVar9)) &&
           ((*(ulong *)(pcVar23 + 0x18) & 1) == 0)) {
          local_88 = *(undefined8 *)(pcVar23 + 0x10);
          local_b0[0] = 3;
          uStack_70 = 0;
          local_78 = 2;
          uStack_80 = *(ulong *)(pcVar23 + 0x18);
          local_68 = local_b0;
          <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
                    (&local_a0,&local_88,
                     &anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023);
          pbVar13 = local_98;
          lVar12 = local_a0;
          if (local_b0[0] == 3) {
            if (local_a0 != -0x8000000000000000) {
              pbVar24 = local_98;
              if ((2 < local_90) && (*local_98 == 0x70)) {
                uVar4 = 4;
                if (local_98[1] != 0x82) {
                  uVar4 = 2;
                }
                uVar3 = 3;
                if (local_98[1] != 0x81) {
                  uVar3 = uVar4;
                }
                if (local_90 <= uVar3) {
                  uVar3 = 0;
                }
                pbVar24 = local_98 + uVar3;
              }
              pbVar25 = local_98 + (local_90 - (long)pbVar24);
              if ((byte *)(local_e0 - lVar21) < pbVar25) {
                alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                          (&local_e0,lVar21,pbVar25,1,1);
                local_f8 = lStack_d8;
                lVar21 = local_d0;
              }
              memcpy((void *)(lVar21 + local_f8),pbVar24,(size_t)pbVar25);
              lVar21 = lVar21 + (long)pbVar25;
              local_d0 = lVar21;
              if (lVar12 != 0) {
                __rustc[4794b31dd7191200]::__rust_dealloc(pbVar13,lVar12,1);
              }
            }
          }
          else if (local_a0 != 0) {
            __rustc[4794b31dd7191200]::__rust_dealloc(local_98,local_a0,1);
          }
        }
        lVar19 = lVar19 + 0x20;
        pcVar14 = pcVar16 + 0x20;
        pcVar23 = pcVar16;
      } while (lVar19 != 0x20);
    } while (pcVar26 != pcVar2);
  }
  if (lVar22 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(pcVar11,lVar22 << 1,1);
  }
  if ((*(long *)(param_2 + 0x1b0) != -0x8000000000000000) &&
     (uStack_80 = *(ulong *)(param_2 + 0x1c0), (uStack_80 & 1) == 0)) {
    local_88 = *(undefined8 *)(param_2 + 0x1b8);
    local_b0[0] = 3;
    local_68 = local_b0;
    uStack_70 = 0;
    local_78 = 2;
    <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
              (&local_a0,&local_88,&anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023
              );
    if (local_b0[0] == 3) {
      if (local_a0 == -0x8000000000000000) goto LAB_0016b134;
      if ((ulong)(local_e0 - lVar21) < local_90) {
        alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle
                  (&local_e0,lVar21,local_90,1,1);
        lVar21 = local_d0;
      }
      memcpy((void *)(lVar21 + lStack_d8),local_98,local_90);
      local_d0 = lVar21 + local_90;
    }
    if (local_a0 != 0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(local_98,local_a0,1);
    }
  }
LAB_0016b134:
  param_1[1] = lStack_d8;
  *param_1 = local_e0;
  param_1[2] = local_d0;
  return;
}
```

#### `ckemv_emv_kernel::crypto::oda::verify_certificates`

- Ghidra address: `0x16b228` (2316 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda19verify_certificates17hfbe17c8799a13633E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::verify_certificates(ulong *param_1,long param_2,undefined8 param_3,long param_4);`
- capstone offset: `0x6b228`  instr: 656
- direct calls (13): `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`, `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`, `core::ptr::drop_in_place<ckemv_emv_kernel::crypto::PublicKey>`, `alloc::fmt::format::format_inner`, `ckemv_emv_kernel::crypto::oda::verify_issuer_public_key`, `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}`, `ckemv_emv_kernel::crypto::oda::build_static_data`, `ckemv_emv_kernel::crypto::oda::verify_icc_public_key`, `alloc::raw_vec::handle_error`, `_Unwind_Resume`
- referenced strings (10 unique):
  - `0x211df`: "No AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer P\u2026"
  - `0x211eb`: "Invalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verificati\u2026"
  - `0x21283`: "AID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Failed: StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/ke\u2026"
  - `0x211fa`: "No CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC \u2026"
  - `0x2120e`: "Invalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Fail\u2026"
  - `0x21221`: "CA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Failed: StatusWordsw1sw\u2026"
  - `0x21238`: "No Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Failed: StatusWordsw1sw2/rustc/6b00bc388019860\u2026"
  - `0x2124f`: "Invalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Failed: StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488\u2026"
  - `0x21269`: "030Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Failed: StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice\u2026"
  - `0x2126c`: "Invalid ICC PK Cert hexAID too short to extract RIDIssuer PK Verification Failed: ICC PK Verification Failed: StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs\u2026"
- Ghidra callees (12): `__rust_alloc`, `__rust_dealloc`, `build_static_data`, `drop_in_place<ckemv_emv_kernel::crypto::PublicKey>`, `format_inner`, `from_hex`, `from_iter`, `handle_error`, `to_vec`, `verify_icc_public_key`, `verify_issuer_public_key`, `{{closure}}`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::verify_certificates */

void __rustcall
ckemv_emv_kernel::crypto::oda::verify_certificates
          (ulong *param_1,long param_2,undefined8 param_3,long param_4)

{
  uint uVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 uVar5;
  byte bVar6;
  undefined8 uVar7;
  long lVar8;
  undefined **ppuVar9;
  undefined **ppuVar10;
  undefined **ppuVar11;
  char ***pppcVar12;
  ulong uVar13;
  char *pcVar14;
  uint uVar15;
  ulong uVar16;
  byte *pbVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 uVar20;
  char ***pppcVar21;
  undefined **ppuVar22;
  undefined **ppuVar23;
  ulong local_1e8;
  ulong local_198;
  undefined **local_178;
  ulong local_170;
  char ***local_168;
  undefined8 local_160;
  int *piStack_158;
  undefined8 local_150;
  char *local_148;
  ulong uStack_140;
  int local_138 [2];
  undefined **local_130;
  ulong uStack_128;
  char ***local_120;
  char *local_118;
  ulong uStack_110;
  long local_108;
  undefined8 uStack_100;
  undefined8 local_f8;
  undefined **local_f0;
  ulong uStack_e8;
  char ***local_e0;
  undefined8 uStack_d8;
  int *local_d0;
  undefined8 local_c8;
  char **local_c0;
  code *pcStack_b8;
  undefined **local_b0;
  ulong uStack_a8;
  char ***local_a0;
  int local_98 [2];
  undefined **local_90;
  ulong uStack_88;
  char ***local_80;
  int local_78;
  undefined4 uStack_74;
  ulong uStack_70;
  char ***local_68;
  
  if (*(long *)(param_2 + 0x18) == -0x8000000000000000) {
    pcVar14 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0xc,1);
    if (pcVar14 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0xc,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2d98);
    }
    builtin_strncpy(pcVar14,"No AID found",0xc);
    uVar16 = 0xc;
    goto LAB_0016b3ac;
  }
  if ((*(ulong *)(param_2 + 0x28) & 1) == 0) {
    local_f0 = *(undefined ***)(param_2 + 0x20);
    local_d0 = &local_78;
    local_78 = 3;
    uStack_d8 = 0;
    local_e0 = (char ***)0x2;
    uStack_e8 = *(ulong *)(param_2 + 0x28);
    <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
              (&local_178,&local_f0,
               &anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023);
    uVar16 = local_170;
    ppuVar9 = local_178;
    if (local_78 == 3) {
      if (local_178 != (undefined **)0x8000000000000000) {
        if (local_168 <= &DAT_00000004) {
          uVar20 = 0x1c;
          pcVar14 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x1c,1);
          if (pcVar14 == (char *)0x0) goto LAB_0016bb20;
          builtin_strncpy(pcVar14,"AID too short to extract RID",0x1c);
          *param_1 = 0x1c;
          param_1[1] = (ulong)pcVar14;
          param_1[2] = 0x1c;
          goto joined_r0x0016b648;
        }
        if (*(long *)(param_2 + 0x108) == -0x8000000000000000) {
          uVar20 = 0x14;
          pcVar14 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x14,1);
          if (pcVar14 == (char *)0x0) goto LAB_0016bb20;
          builtin_strncpy(pcVar14,"No CA PK Index found",0x14);
          *param_1 = 0x14;
          param_1[1] = (ulong)pcVar14;
          param_1[2] = 0x14;
          goto joined_r0x0016b648;
        }
        uVar18 = *(ulong *)(param_2 + 0x118);
        if (uVar18 != 0) {
          pbVar17 = *(byte **)(param_2 + 0x110);
          uVar19 = uVar18 - 1;
          if (uVar19 != 0) {
            if (*pbVar17 == 0x2b) {
              pbVar17 = pbVar17 + 1;
              if (uVar18 < 4) goto LAB_0016b53c;
LAB_0016b4f4:
              uVar15 = 0;
              do {
                bVar6 = *pbVar17;
                uVar1 = (bVar6 - 0x41 & 0xffffffdf) + 10;
                if (bVar6 < 0x3a) {
                  uVar1 = bVar6 - 0x30;
                }
                if (0xf < uVar1 || 0xf < (uVar15 & 0xff)) goto LAB_0016b464;
                uVar15 = uVar1 | uVar15 << 4;
                uVar19 = uVar19 - 1;
                pbVar17 = pbVar17 + 1;
              } while (uVar19 != 0);
            }
            else {
              uVar19 = uVar18;
              if (2 < uVar18) goto LAB_0016b4f4;
              uVar19 = 2;
LAB_0016b53c:
              uVar15 = 0;
              do {
                bVar6 = *pbVar17;
                uVar1 = (bVar6 - 0x41 & 0xffffffdf) + 10;
                if (bVar6 < 0x3a) {
                  uVar1 = bVar6 - 0x30;
                }
                if (0xf < uVar1) goto LAB_0016b464;
                uVar15 = uVar1 | uVar15 << 4;
                uVar19 = uVar19 - 1;
                pbVar17 = pbVar17 + 1;
              } while (uVar19 != 0);
            }
            (**(code **)(param_4 + 0x18))(&local_f0,param_3,local_170,5,uVar15);
            if (local_f0 == (undefined **)0x8000000000000000) {
              <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec
                        (&local_f0,"CA Public Key not found",0x17);
              param_1[1] = uStack_e8;
              *param_1 = (ulong)local_f0;
              param_1[2] = (ulong)local_e0;
              goto joined_r0x0016b648;
            }
            piStack_158 = local_d0;
            local_160 = uStack_d8;
            local_150 = local_c8;
            local_178 = local_f0;
            local_170 = uStack_e8;
            local_168 = local_e0;
            if (*(long *)(param_2 + 0x120) == -0x8000000000000000) {
              <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec
                        (&local_f0,"No Issuer PK Cert found",0x17);
LAB_0016b630:
              param_1[1] = uStack_e8;
              *param_1 = (ulong)local_f0;
              param_1[2] = (ulong)local_e0;
            }
            else {
              <alloc::vec::Vec<u8>as_hex::FromHex>::from_hex(&local_f0,param_2 + 0x120);
              pppcVar12 = local_e0;
              uVar18 = uStack_e8;
              ppuVar10 = local_f0;
              if (local_f0 == (undefined **)0x8000000000000000) {
                <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec
                          (&local_f0,"Invalid Issuer PK Cert hex",0x1a);
                goto LAB_0016b630;
              }
              if (*(long *)(param_2 + 0x138) == -0x8000000000000000) {
                local_148 = "03";
                uStack_140 = 2;
LAB_0016b684:
                <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec(&local_f0);
                local_a0 = local_e0;
                local_b0 = local_f0;
                uStack_a8 = uStack_e8;
              }
              else {
                local_148 = *(char **)(param_2 + 0x140);
                uStack_140 = *(ulong *)(param_2 + 0x148);
                if ((uStack_140 & 1) == 0) goto LAB_0016b684;
                local_c0 = &local_148;
                pcStack_b8 = <&T_as_core::fmt::Display>::fmt;
                local_f0 = &PTR_s_0_001c2ed8;
                uStack_e8 = 1;
                local_e0 = &local_c0;
                uStack_d8 = 1;
                local_d0 = (int *)0x0;
                alloc::fmt::format::format_inner(&local_78,&local_f0);
                local_b0 = (undefined **)CONCAT44(uStack_74,local_78);
                local_a0 = local_68;
                uStack_a8 = uStack_70;
              }
              <alloc::vec::Vec<u8>as_hex::FromHex>::from_hex(&local_108,&local_b0);
              uVar20 = uStack_100;
              uVar7 = local_f8;
              if (local_108 == -0x8000000000000000) {
                uVar20 = 1;
                uVar7 = 0;
              }
              lVar2 = 0;
              if (local_108 != -0x8000000000000000) {
                lVar2 = local_108;
              }
              if (*(long *)(param_2 + 0x150) == -0x8000000000000000) {
                uVar19 = 0;
                ppuVar22 = (undefined **)0x8000000000000000;
              }
              else {
                <alloc::vec::Vec<u8>as_hex::FromHex>::from_hex(&local_f0,param_2 + 0x150);
                local_198 = uStack_e8;
                uVar19 = 0;
                ppuVar22 = local_f0;
                if (local_f0 != (undefined **)0x8000000000000000) {
                  uVar19 = uStack_e8;
                }
              }
              pppcVar21 = (char ***)local_138;
              verify_issuer_public_key(local_138,uVar18,pppcVar12,uVar19);
              if (local_138[0] == 1) {
                uStack_e8 = uStack_128;
                local_f0 = local_130;
                local_e0 = local_120;
                verify_certificates::__closure__(&local_78,&local_f0);
                param_1[1] = uStack_70;
                *param_1 = CONCAT44(uStack_74,local_78);
                param_1[2] = (ulong)local_68;
              }
              else if (*(long *)(param_2 + 0x168) == -0x8000000000000000) {
LAB_0016b7c8:
                *param_1 = 0x8000000000000000;
                if (local_130 != (undefined **)0x0) {
                  __rustc[4794b31dd7191200]::__rust_dealloc(uStack_128,local_130,1);
                }
              }
              else {
                <alloc::vec::Vec<u8>as_hex::FromHex>::from_hex(&local_f0,param_2 + 0x168);
                pppcVar12 = local_e0;
                uVar19 = uStack_e8;
                ppuVar11 = local_f0;
                if (local_f0 == (undefined **)0x8000000000000000) {
                  <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec
                            (&local_f0,"Invalid ICC PK Cert hex",0x17);
                  param_1[1] = uStack_e8;
                  *param_1 = (ulong)local_f0;
                  param_1[2] = (ulong)local_e0;
                }
                else {
                  if (*(long *)(param_2 + 0x180) == -0x8000000000000000) {
                    local_118 = "03";
                    uStack_110 = 2;
LAB_0016b868:
                    <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec(&local_f0);
        
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}`

- Ghidra address: `0x16bc68` (104 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda19verify_certificates28_$u7b$$u7b$closure$u7d$$u7d$17h3d5ba69d4fee5704E`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::verify_certificates::{{closure}}(undefined8 param_1,long *param_2);`
- capstone offset: `0x6bc68`  instr: 34
- direct calls (3): `alloc::fmt::format::format_inner`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_Unwind_Resume`
- Ghidra callees (2): `__rust_dealloc`, `format_inner`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::verify_certificates::{{closure}} */

void __rustcall
ckemv_emv_kernel::crypto::oda::verify_certificates::__closure__(undefined8 param_1,long *param_2)

{
  undefined **local_60;
  undefined8 uStack_58;
  long **local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long *local_30;
  code *local_28;
  
  local_28 = <alloc::string::String_as_core::fmt::Display>::fmt;
  local_60 = &PTR_s_Issuer_PK_Verification_Failed__001c2ee8;
  uStack_58 = 1;
  local_50 = &local_30;
  local_48 = 1;
  uStack_40 = 0;
  local_30 = param_2;
  alloc::fmt::format::format_inner(param_1,&local_60);
  if (*param_2 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(param_2[1],*param_2,1);
  }
  return;
}
```

#### `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}`

- Ghidra address: `0x16bcf0` (104 bytes)  ·  mangled: `_ZN16ckemv_emv_kernel6crypto3oda19verify_certificates28_$u7b$$u7b$closure$u7d$$u7d$17h52b4eb992e99e00cE`
- signature (Ghidra): `void __rustcall ckemv_emv_kernel::crypto::oda::verify_certificates::{{closure}}(undefined8 param_1,long *param_2);`
- capstone offset: `0x6bc68`  instr: 34
- direct calls (3): `alloc::fmt::format::format_inner`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_Unwind_Resume`
- Ghidra callees (2): `__rust_dealloc`, `format_inner`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_emv_kernel::crypto::oda::verify_certificates::{{closure}} */

void __rustcall
ckemv_emv_kernel::crypto::oda::verify_certificates::__closure__(undefined8 param_1,long *param_2)

{
  undefined **local_60;
  undefined8 uStack_58;
  long **local_50;
  undefined8 local_48;
  undefined8 uStack_40;
  long *local_30;
  code *local_28;
  
  local_28 = <alloc::string::String_as_core::fmt::Display>::fmt;
  local_60 = &PTR_s_ICC_PK_Verification_Failed__001c2ef8;
  uStack_58 = 1;
  local_50 = &local_30;
  local_48 = 1;
  uStack_40 = 0;
  local_30 = param_2;
  alloc::fmt::format::format_inner(param_1,&local_60);
  if (*param_2 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(param_2[1],*param_2,1);
  }
  return;
}
```

#### `_<ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt`

- Ghidra address: `0x16bf08` (104 bytes)  ·  mangled: `_ZN77_$LT$ckemv_core..response..status..StatusWord$u20$as$u20$core..fmt..Debug$GT$3fmt17hf91b69f6fc879758E`
- signature (Ghidra): `void __rustcall<ckemv_core::response::status::StatusWord_as_core::fmt::Debug>::fmt(long param_1,undefined8 param_2);`
- capstone offset: `0x6bf08`  instr: 26
- direct calls (1): `core::fmt::Formatter::debug_struct_field2_finish`
- referenced strings (3 unique):
  - `0x212da`: "StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex\u2026"
  - `0x212e4`: "sw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesti\u2026"
  - `0x212e7`: "sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesting \u2026"
- Ghidra callees (1): `debug_struct_field2_finish`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt */

void __rustcall
<ckemv_core::response::status::StatusWord_as_core::fmt::Debug>::fmt(long param_1,undefined8 param_2)

{
  long lStack_8;
  
  lStack_8 = param_1 + 1;
  core::fmt::Formatter::debug_struct_field2_finish
            (param_2,"StatusWord",10,"sw1",3,param_1,&DAT_001c2f08,"sw2",3,&lStack_8,&DAT_001c2f28);
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::next_command`

- Ghidra address: `0x16bfe0` (1492 bytes)  ·  mangled: `_ZN113_$LT$ckemv_emv_kernel..kernels..mchip..MastercardKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$12next_command17h042c28383b2a90c2E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::next_command(undefined8 *param_1,long param_2);`
- capstone offset: `0x6bfe0`  instr: 446
- direct calls (14): `alloc::fmt::format::format_inner`, `_<alloc::string::String as core::clone::Clone>::clone`, `ckemv_emv_kernel::dol::build_dol_payload`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `@0xbcfe0`, `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `hashbrown::map::HashMap<K,V,S,A>::insert`, `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`, `alloc::alloc::handle_alloc_error`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`, `alloc::raw_vec::handle_error`, `core::panicking::panic_in_cleanup`, `_Unwind_Resume`
- referenced strings (4 unique):
  - `0x213a4`: "Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (TC)Requesting 2nd Generate AC (TC/AAC)Selected Mastercard ApplicationFailed to parse AFL: GPO successful.\u2026"
  - `0x213e7`: "Requesting 1st Generate AC (TC)Requesting 2nd Generate AC (TC/AAC)Selected Mastercard ApplicationFailed to parse AFL: GPO successful. No records to read.GPO successful. Found  records to read.GPO succ\u2026"
  - `0x19bcc`: "5931i128Void9F36main as 9F32Kind9F48/"
  - `0x21406`: "Requesting 2nd Generate AC (TC/AAC)Selected Mastercard ApplicationFailed to parse AFL: GPO successful. No records to read.GPO successful. Found  records to read.GPO successful. No AFL returned. Procee\u2026"
- Ghidra callees (12): `__rust_alloc`, `__rust_dealloc`, `build_dol_payload`, `clone`, `do_reserve_and_handle`, `format_inner`, `from`, `from_iter`, `handle_alloc_error`, `handle_error`, `insert`, `memcpy`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::mchip::MastercardKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::next_command */

void __rustcall
<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
next_command(undefined8 *param_1,long param_2)

{
  char cVar1;
  char cVar2;
  undefined ****ppppuVar3;
  undefined ****__src;
  char *pcVar4;
  long lVar5;
  ulong uVar6;
  undefined ****ppppuVar7;
  undefined ****local_128;
  undefined ****local_120;
  undefined8 uStack_118;
  undefined ****local_110;
  undefined ****ppppuStack_108;
  undefined *****pppppuStack_100;
  undefined8 local_f8;
  undefined *****local_f0;
  undefined1 auStack_d8 [24];
  undefined ****local_c0;
  undefined ****local_b8;
  size_t local_b0;
  undefined ****local_a8;
  undefined ****ppppuStack_a0;
  long lStack_98;
  undefined ****local_90;
  undefined ****ppppuStack_88;
  long local_80;
  undefined *****local_70;
  undefined ****ppppuStack_68;
  undefined *****pppppuStack_60;
  code *pcStack_58;
  
  uVar6 = *(ulong *)(param_2 + 0x2a0) ^ 0x8000000000000000;
  if (5 < uVar6) {
    uVar6 = 6;
  }
  if ((long)uVar6 < 3) {
    if (uVar6 != 0) {
      if (uVar6 == 1) {
        if (*(long *)(param_2 + 0x30) == -0x8000000000000000) {
          uStack_118 = 0;
          local_128 = (undefined ****)0x0;
          ppppuVar7 = (undefined ****)0x1;
        }
        else {
          <alloc::string::String_as_core::clone::Clone>::clone(&local_128,(long *)(param_2 + 0x30));
          ppppuVar7 = local_120;
        }
        ckemv_emv_kernel::dol::build_dol_payload(&local_c0,ppppuVar7,uStack_118,param_2 + 0x2b8);
        ppppuStack_a0 = (undefined ****)__rustc[4794b31dd7191200]::__rust_alloc(2,1);
        __src = local_b8;
        if (ppppuStack_a0 == (undefined ****)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::alloc::handle_alloc_error(1,2);
        }
        *(char *)ppppuStack_a0 = -0x7d;
        local_a8 = (undefined ****)0x2;
        *(char *)((long)ppppuStack_a0 + 1) = (char)local_b0;
        lStack_98 = 2;
        if (local_b0 != 0) {
          alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle(&local_a8,2,local_b0,1,1);
        }
        lVar5 = lStack_98;
        memcpy((char *)((long)ppppuStack_a0 + lStack_98),__src,local_b0);
        lStack_98 = lVar5 + local_b0;
        ppppuStack_88 = ppppuStack_a0;
        local_90 = local_a8;
        local_80 = lStack_98;
        <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_70,&local_90)
        ;
        ppppuStack_108 = ppppuStack_68;
        local_110 = (undefined ****)local_70;
        local_f8 = pcStack_58;
        pppppuStack_100 = pppppuStack_60;
        local_f0 = (undefined *****)CONCAT26(local_f0._6_2_,0x10000a880);
        pcVar4 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x23,1);
        if (pcVar4 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::raw_vec::handle_error(1,0x23,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2f48);
        }
        builtin_strncpy(pcVar4,"Requesting Processing Options (GPO)",0x23);
        param_1[7] = local_f0;
        *param_1 = 0x23;
        param_1[1] = pcVar4;
        param_1[4] = ppppuStack_108;
        param_1[3] = local_110;
        param_1[6] = local_f8;
        param_1[5] = pppppuStack_100;
        param_1[2] = 0x23;
        ppppuVar3 = local_128;
        if (local_c0 != (undefined ****)0x0) {
          __rustc[4794b31dd7191200]::__rust_dealloc(__src,local_c0,1);
          ppppuVar3 = local_128;
        }
        goto joined_r0x0016c268;
      }
      if (*(ulong *)(param_2 + 0x300) < *(ulong *)(param_2 + 0x298)) {
        local_70 = &local_a8;
        pcVar4 = (char *)(*(long *)(param_2 + 0x290) + *(ulong *)(param_2 + 0x300) * 2);
        cVar1 = *pcVar4;
        local_a8 = (undefined ****)CONCAT71(local_a8._1_7_,cVar1);
        cVar2 = pcVar4[1];
        pppppuStack_60 = &local_90;
        ppppuStack_68 = (undefined ****)core::fmt::num::imp::<impl_core::fmt::Display_for_u8>::fmt;
        pcStack_58 = core::fmt::num::imp::<impl_core::fmt::Display_for_u8>::fmt;
        local_90 = (undefined ****)CONCAT71(local_90._1_7_,cVar2);
        local_110 = (undefined ****)&PTR_s_Reading_Record__SFI____Record____001c2fb8;
        ppppuStack_108 = (undefined ****)0x3;
        pppppuStack_100 = (undefined *****)&local_70;
        local_f8 = 2;
        local_f0 = (undefined *****)0x0;
        alloc::fmt::format::format_inner(param_1,&local_110);
        param_1[3] = 0;
        *(undefined2 *)(param_1 + 7) = 0xb200;
        *(char *)((long)param_1 + 0x3a) = cVar2;
        *(byte *)((long)param_1 + 0x3b) = cVar1 << 3 | 4;
        *(undefined2 *)((long)param_1 + 0x3c) = 1;
        return;
      }
    }
LAB_0016c084:
    *param_1 = 0x8000000000000000;
    return;
  }
  if (4 < (long)uVar6) goto LAB_0016c084;
  if (uVar6 == 3) {
    if (*(long *)(param_2 + 0x48) == -0x8000000000000000) {
      local_90 = (undefined ****)0x0;
      lVar5 = 0;
      ppppuVar7 = (undefined ****)0x1;
    }
    else {
      <alloc::string::String_as_core::clone::Clone>::clone(&local_90,(long *)(param_2 + 0x48));
      lVar5 = local_80;
      ppppuVar7 = ppppuStack_88;
    }
    ckemv_emv_kernel::dol::build_dol_payload(auStack_d8,ppppuVar7,lVar5,param_2 + 0x2b8);
    <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_70,auStack_d8);
    ppppuStack_108 = ppppuStack_68;
    local_110 = (undefined ****)local_70;
    local_f8 = pcStack_58;
    pppppuStack_100 = pppppuStack_60;
    local_f0 = (undefined *****)CONCAT26(local_f0._6_2_,0x10080ae80);
    pcVar4 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x1f,1);
    if (pcVar4 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x1f,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2f48);
    }
    builtin_strncpy(pcVar4,"Requesting 1st Generate AC (TC)",0x1f);
    param_1[7] = local_f0;
    *param_1 = 0x1f;
    param_1[1] = pcVar4;
    param_1[4] = ppppuStack_108;
    param_1[3] = local_110;
    param_1[6] = local_f8;
    param_1[5] = pppppuStack_100;
    param_1[2] = 0x1f;
    ppppuVar3 = local_90;
    goto joined_r0x0016c268;
  }
  if (*(long *)(param_2 + 0x60) == -0x8000000000000000) {
    local_c0 = (undefined ****)0x0;
    local_b8 = (undefined ****)0x1;
LAB_0016c34c:
    ppppuStack_68 = (undefined ****)__rustc[4794b31dd7191200]::__rust_alloc(2,1);
    if (ppppuStack_68 == (undefined ****)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,2,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2f48);
    }
    *(undefined2 *)ppppuStack_68 = 0x4138;
    local_70 = (undefined *****)0x2;
    pppppuStack_60 = (undefined *****)0x2;
    ppppuStack_108 = (undefined ****)__rustc[4794b31dd7191200]::__rust_alloc(4,1);
    if (ppppuStack_108 == (undefined ****)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,4,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2f48);
    }
    local_110 = (undefined ****)0x4;
    *(undefined4 *)ppppuStack_108 = 0x31333935;
    pppppuStack_100 = (undefined *****)0x4;
    hashbrown::map::HashMap<K,V,S,A>::insert(&local_90,param_2 + 0x2c8,&local_70,&local_110);
    if ((local_90 != (undefined ****)0x8000000000000000) && (local_90 != (undefined ****)0x0)) {
      __rustc[4794b31dd7191200]::__rust_dealloc(ppppuStack_88,local_90,1);
    }
    local_110 = (undefined ****)0x119bcc;
    local_f0 = &local_90;
    local_90 = (undefined ****)CONCAT44(local_90._4_4_,3);
    pppppuStack_100 = (undefined *****)0x2;
    ppppuStack_108 = (undefined ****)0x4;
    local_f8 = 0;
    <alloc::vec::Vec<T>as_alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter
              (&local_70,&local_110,
               &anon_3b42ea0a3ec49587e66eacb3e82acbb4_1_llvm_9996186133154998023);
    if ((int)local_90 == 3) {
      ppppuStack_108 = (undefined ****)pppppuStack_60;
      local_110 = ppppuStack_68;
      if (local_70 != (undefined *****)0x8000000000000000) {
        local_a8 = (undefined ****)local_70;
        lStack_98 = (long)pppppuStack_60;
        ppppuStack_a0 = ppppuStack_68;
        goto LAB_0016c468;
      }
    }
    else if (local_70 != (undefined *****)0x0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(ppppuStack_68,local_70,1);
    }
    lStack_98 = 0;
    local_a8 = (undefined ****)0x0;
    ppppuStack_a0 = (undefined ****)0x1;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_c0);
    if (local_b0 == 0) goto LAB_0016c34c;
    ckemv_emv_kernel::dol::build_dol_payload(&local_a8,local_b8,local_b0,param_2 + 0x2b8);
  }
LAB_0016c468:
  ppppuStack_88 = ppppuStack_a0;
  local_90 = local_a8;
  local_80 = lStack_98;
  <bytes::bytes::Bytes_as_core::convert::From<alloc::vec::Vec<u8>>>::from(&local_70,&local_90);
  ppppuStack_108 = ppppuStack_68;
  local_110 = (undefined ****)local_70;
  local_f8 = pcStack_58;
  pppppuStack_100 = pppppuStack_60;
  local_f0 = (undefined *****)CONCAT26(local_f0._6_2_,0x10040ae80);
  pcVar4 = (char *)__rustc[4794b31dd7191200]::__rust_alloc(0x23,1);
  if (pcVar4 == (char *)0x0) {
                    /* WARNING: Subroutine does not return */
    alloc::raw_vec::handle_error(1,0x23,&PTR_s__rustc_6b00bc3880198600130e1cf62_001c2f48);
  }
  builtin_strncpy(pcVar4,"Requesting 2nd Generate AC (TC/AAC)",0x23);
  param_1[7] = local_f0;
  *param_1 = 0x23;
  param_1[1] = pcVar4;
  param_1[4] = ppppuStack_108;
  param_1[3] = local_110;
  param_1[6] = local_f8;
  param_1[5] = pppppuStack_100;
  param_1[2] = 0x23;
  ppppuVar7 = local_b8;
  ppppuVar3 = local_c0;
joined_r0x0016c268:
  if (ppppuVar3 == (undefined ****)0x0) {
    return;
  }
  __rustc[4794b31dd7191200]::__rust_dealloc(ppppuVar7,ppppuVar3,1);
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`

- Ghidra address: `0x16c6d8` (4024 bytes)  ·  mangled: `_ZN113_$LT$ckemv_emv_kernel..kernels..mchip..MastercardKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$16process_response17h337849fca6ad0bc5E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::process_response(undefined8 *param_1,long *param_2,long *param_3,ulong param_4);`
- capstone offset: `0x6c6d8`  instr: 1105
- direct calls (16): `iso7816_tlv::ber::tlv::Tlv::parse_all`, `ckemv_emv_kernel::results::extract_emv_data`, `ckemv_emv_kernel::results::build_tlv_tree`, `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`, `_<alloc::string::String as core::clone::Clone>::clone`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`, `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`, `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::mchip::MChipState>`, `alloc::fmt::format::format_inner`, `alloc::raw_vec::RawVec<T,A>::grow_one`, `ckemv_emv_kernel::crypto::oda::verify_certificates`, `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`, `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
- referenced strings (12 unique):
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x214a7`: "GPO successful. No AFL returned. Proceeding to GenAC.Read record / All records read.Card downgraded request and returned ARQC. Proceeding to 2nd Gen AC.Card approved offline! Returned TC.Card REJECTED\u2026"
  - `0x21562`: "Card REJECTED offline! Returned AAC.Unknown CID returned: "
  - `0x215e9`: "Did not receive ARQC in Generate AC response2nd Generate AC Complete. Transaction finalized.Card returned error status: ckemv-emv-kernel/src/results.rs/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/l\u2026"
  - `0x21429`: "Selected Mastercard ApplicationFailed to parse AFL: GPO successful. No records to read.GPO successful. Found  records to read.GPO successful. No AFL returned. Proceeding to GenAC.Read record / All rec\u2026"
  - `0x214e9`: " All records read.Card downgraded request and returned ARQC. Proceeding to 2nd Gen AC.Card approved offline! Returned TC.Card REJECTED offline! Returned AAC.Unknown CID returned: "
  - `0x21615`: "2nd Generate AC Complete. Transaction finalized.Card returned error status: ckemv-emv-kernel/src/results.rs/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsmid > len/Users/art\u2026"
  - `0x21371`: "AFL length must be a multiple of 4Invalid AFL hex: Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (TC)Requesting 2nd Generate AC (TC/AAC)Selected Masterc\u2026"
  - `0x214fb`: "Card downgraded request and returned ARQC. Proceeding to 2nd Gen AC.Card approved offline! Returned TC.Card REJECTED offline! Returned AAC.Unknown CID returned: "
  - `0x2145d`: "GPO successful. No records to read.GPO successful. Found  records to read.GPO successful. No AFL returned. Proceeding to GenAC.Read record / All records read.Card downgraded request and returned ARQC.\u2026"
  - `0x2153f`: "Card approved offline! Returned TC.Card REJECTED offline! Returned AAC.Unknown CID returned: "
  - `0x21359`: "Invalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (TC)Requesting 2nd Generate AC \u2026"
- Ghidra callees (18): `__rust_alloc`, `__rust_dealloc`, `build_tlv_tree`, `clone`, `do_reserve_and_handle`, `drop_in_place<ckemv_emv_kernel::kernels::mchip::MChipState>`, `drop_in_place<iso7816_tlv::ber::tlv::Tlv>`, `extract_emv_data`, `format_inner`, `from_hex`, `from_iter`, `grow_one`, `handle_alloc_error`, `handle_error`, `panic_bounds_check`, `parse_all`, `to_vec`, `verify_certificates`

**Ghidra pseudo-C:**

```c
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::mchip::MastercardKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::process_response */

void __rustcall
<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
process_response(undefined8 *param_1,long *param_2,long *param_3,ulong param_4)

{
  ulong *puVar1;
  undefined1 *puVar2;
  byte *pbVar3;
  byte bVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  byte bVar7;
  byte bVar8;
  byte *******pppppppbVar9;
  byte *******pppppppbVar10;
  char *pcVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  byte ******ppppppbVar15;
  long lVar16;
  int iVar17;
  byte *******pppppppbVar18;
  byte *******pppppppbVar19;
  long lVar20;
  byte *pbVar21;
  undefined8 uVar22;
  byte bVar23;
  undefined8 local_1e0;
  undefined **local_1d8;
  byte *******local_1a0;
  byte *******pppppppbStack_198;
  byte *******local_190;
  byte *******local_180;
  byte *******pppppppbStack_178;
  byte *******local_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  byte *******local_150;
  byte *******pppppppbStack_148;
  byte *******local_140;
  byte *******local_138;
  byte *******pppppppbStack_130;
  byte *******local_128;
  byte *******local_120;
  int iStack_118;
  undefined4 uStack_114;
  undefined8 uStack_110;
  code *pcStack_108;
  byte *******local_100;
  byte *******pppppppbStack_f8;
  byte *******local_f0;
  long local_e8;
  undefined4 uStack_e0;
  undefined4 uStack_dc;
  undefined8 local_d8;
  byte local_d0;
  char cStack_cf;
  undefined2 uStack_ce;
  undefined4 uStack_cc;
  undefined4 uStack_c8;
  undefined4 uStack_c4;
  undefined8 local_c0;
  byte *******local_b0;
  int iStack_a8;
  undefined4 uStack_a4;
  uint uStack_a0;
  undefined4 uStack_9c;
  byte *******local_90;
  byte *******pppppppbStack_88;
  byte *******local_80;
  byte *******pppppppbStack_78;
  byte *******pppppppbStack_70;
  byte *******local_68;
  
  local_d0 = *(byte *)(param_3 + 4);
  if (local_d0 < 0x80) {
    if ((local_d0 != 0x70) && (local_d0 != 0x77)) {
LAB_0016cb4c:
      cStack_cf = *(char *)((long)param_3 + 0x21);
LAB_0016cb50:
      local_120 = (byte *******)&local_d0;
      iStack_118 = 0x16bf08;
      uStack_114 = 0;
      local_90 = (byte *******)&DAT_001c3070;
      pppppppbStack_88 = (byte *******)0x1;
      local_80 = (byte *******)&local_120;
      pppppppbStack_78 = (byte *******)0x1;
      pppppppbStack_70 = (byte *******)0x0;
      alloc::fmt::format::format_inner(&local_b0,&local_90);
      <alloc::string::String_as_core::clone::Clone>::clone(&local_90,&local_b0);
      lVar13 = param_2[0x54];
      iStack_118 = (int)pppppppbStack_88;
      uStack_114 = (undefined4)((ulong)pppppppbStack_88 >> 0x20);
      local_120 = local_90;
      uStack_110._0_4_ = (uint)local_80;
      uStack_110._4_4_ = (undefined4)((ulong)local_80 >> 0x20);
      if ((-0x7ffffffffffffffb < lVar13) && (lVar13 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x55],lVar13,1);
      }
      param_2[0x56] = CONCAT44(uStack_110._4_4_,(uint)uStack_110);
      param_2[0x55] = CONCAT44(uStack_114,iStack_118);
      param_2[0x54] = (long)local_120;
      param_1[1] = CONCAT44(uStack_a4,iStack_a8);
      *param_1 = local_b0;
      param_1[2] = CONCAT44(uStack_9c,uStack_a0);
      param_1[3] = 0x8000000000000000;
      return;
    }
  }
  else if (local_d0 != 0x80) {
    if (local_d0 != 0x90) goto LAB_0016cb4c;
    cStack_cf = *(char *)((long)param_3 + 0x21);
    if (cStack_cf != '\0') goto LAB_0016cb50;
  }
  local_1a0 = (byte *******)0x8000000000000000;
  if ((*param_3 != 0) && (param_3[1] != 0)) {
    iso7816_tlv::ber::tlv::Tlv::parse_all(&local_120,param_3[1],param_3[2]);
    lVar20 = CONCAT44(uStack_114,iStack_118);
    lVar13 = CONCAT44(uStack_110._4_4_,(uint)uStack_110);
    ckemv_emv_kernel::results::extract_emv_data(lVar20,lVar13,param_2);
    if ((param_4 & 1) != 0) {
      ckemv_emv_kernel::results::build_tlv_tree(&local_90,lVar20,lVar13);
      pppppppbStack_198 = pppppppbStack_88;
      local_1a0 = local_90;
      local_190 = local_80;
    }
    lVar13 = lVar13 + 1;
    lVar16 = lVar20;
    while (lVar13 = lVar13 + -1, lVar13 != 0) {
      core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>(lVar16);
      lVar16 = lVar16 + 0x30;
    }
    if (local_120 != (byte *******)0x0) {
      __rustc[4794b31dd7191200]::__rust_dealloc(lVar20,(long)local_120 * 0x30,8);
    }
  }
  uVar12 = param_2[0x54];
  puVar1 = (ulong *)(param_2 + 0x54);
  local_180 = (byte *******)0x0;
  pppppppbStack_178 = (byte *******)0x1;
  uVar14 = uVar12 ^ 0x8000000000000000;
  local_170 = (byte *******)0x0;
  if (5 < uVar14) {
    uVar14 = 6;
  }
  if (2 < (long)uVar14) {
    if (uVar14 - 5 < 2) goto LAB_0016cf64;
    if (uVar14 != 3) {
      if ((*param_3 != 0) &&
         (ppppppbVar15 = (byte ******)param_3[1], ppppppbVar15 != (byte ******)0x0)) {
        pppppppbStack_88 = (byte *******)((long)ppppppbVar15 + param_3[2]);
        local_80 = (byte *******)&anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
        pppppppbStack_78 = (byte *******)CONCAT44(pppppppbStack_78._4_4_,0x110000);
        local_90 = (byte *******)ppppppbVar15;
        <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                  (&local_120,&local_90);
        lVar13 = param_2[0x4e];
        pppppppbStack_88 = (byte *******)CONCAT44(uStack_114,iStack_118);
        local_80 = (byte *******)CONCAT44(uStack_110._4_4_,(uint)uStack_110);
        local_90 = local_120;
        if ((lVar13 != -0x8000000000000000) && (lVar13 != 0)) {
          __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x4f],lVar13,1);
        }
        param_2[0x4f] = (long)pppppppbStack_88;
        param_2[0x4e] = (long)local_90;
        param_2[0x50] = (long)local_80;
      }
      uVar22 = 0x30;
      pppppppbVar10 = (byte *******)__rustc[4794b31dd7191200]::__rust_alloc(0x30,1);
      if (pppppppbVar10 == (byte *******)0x0) goto LAB_0016d634;
      uVar14 = *puVar1;
      local_180 = (byte *******)&DAT_00000030;
      pppppppbVar10[1] = (byte ******)0x2043412065746172;
      *pppppppbVar10 = (byte ******)0x656e654720646e32;
      pppppppbVar10[3] = (byte ******)0x61736e617254202e;
      pppppppbVar10[2] = (byte ******)0x6574656c706d6f43;
      pppppppbVar10[5] = (byte ******)0x2e64657a696c616e;
      pppppppbVar10[4] = (byte ******)0x6966206e6f697463;
      local_170 = (byte *******)&DAT_00000030;
      pppppppbStack_178 = pppppppbVar10;
      if ((-0x7ffffffffffffffb < (long)uVar14) && (uVar14 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x55],uVar14,1);
      }
      *puVar1 = 0x8000000000000005;
      goto LAB_0016cf64;
    }
    if ((*param_3 != 0) &&
       (ppppppbVar15 = (byte ******)param_3[1], ppppppbVar15 != (byte ******)0x0)) {
      pppppppbStack_88 = (byte *******)((long)ppppppbVar15 + param_3[2]);
      local_80 = (byte *******)&anon_43f406744c6c5c16e5130218f46f7dbb_0_llvm_9056258625447345068;
      pppppppbStack_78 = (byte *******)CONCAT44(pppppppbStack_78._4_4_,0x110000);
      local_90 = (byte *******)ppppppbVar15;
      <alloc::string::String_as_core::iter::traits::collect::FromIterator<char>>::from_iter
                (&local_120,&local_90);
      lVar13 = param_2[0x4b];
      pppppppbStack_88 = (byte *******)CONCAT44(uStack_114,iStack_118);
      local_80 = (byte *******)CONCAT44(uStack_110._4_4_,(uint)uStack_110);
      local_90 = local_120;
      if ((lVar13 != -0x8000000000000000) && (lVar13 != 0)) {
        __rustc[4794b31dd7191200]::__rust_dealloc(param_2[0x4c],lVar13,1);
      }
      param_2[0x4c] = (long)pppppppbStack_88;
      param_2[0x4b] = (long)local_90;
      param_2[0x4d] = (long)local_80;
      if (param_2[0x3f] != -0x8000000000000000) {
        <alloc::vec::Vec<u8>as_hex::FromHex>::from_hex(&local_90,param_2 + 0x3f);
        pppppppbVar18 = (byte *******)__rustc[4794b31dd7191200]::__rust_alloc(1,1);
        pppppppbVar9 = local_80;
        pppppppbVar19 = pppppppbStack_88;
        pppppppbVar10 = local_90;
        if (pppppppbVar18 == (byte *******)0x0) {
                    /* WARNING: Subroutine does not return */
          alloc::alloc::handle_alloc_error(1,1);
        }
        *(byte *)pppppppbVar18 = 0;
        if (local_90 == (byte *******)0x8000000000000000) {
          pppppppbVar10 = (byte *******)0x1;
          pppppppbVar19 = pppppppbVar18;
LAB_0016ca18:
          <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec
                    (&local_90,"Card REJECTED offline! Returned AAC.Unknown CID returned: ",0x24);
          local_f0 = local_80;
          local_100 = local_90;
          pppppppbStack_f8 = pppppppbStack_88;
          goto LAB_0016ca34;
        }
        __rustc[4794b31dd7191200]::__rust_dealloc(pppppppbVar18,1,1);
        if (pppppppbVar9 != (byte *******)0x0) {
          bVar23 = *(byte *)pppppppbVar19 >> 6 ^ 2;
          if (bVar23 < 2) {
            if (bVar23 != 0) {
              local_120 = pppppppbVar19;
              iStack_118 = 0x1b7df4;
              uStack_114 = 0;
              local_90 = (byte *******)&DAT_001c3050;
              pppppppbStack_88 = (byte *******)0x1;
              pppppppbStack_70 = (byte *******)&DAT_001215a0;
              local_68 = (byte *******)0x1;
              local_80 = (byte *******)&local_120;
              pppppppbStack_78 = (byte *******)0x1;
              alloc::fmt::format::format_inner(&local_100,&local_90);
              goto LAB_0016ca34;
            }
            <T_as_alloc::slice::<impl[T]>::to_vec_in::ConvertVec>::to_vec
                      (&local_90,
                       "Card downgraded request and returned ARQC. Proceeding to 2nd Gen AC.",0x44);
            pppppppbStack_178 = pppppppbStack_88;
            local_180 = local_90;
            local_170 = local_80;
            core::ptr::drop_in_place<ckemv_emv_kernel:
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::status`

- Ghidra address: `0x16d81c` (68 bytes)  ·  mangled: `_ZN113_$LT$ckemv_emv_kernel..kernels..mchip..MastercardKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$6status17h0418b5fcd6ac51e2E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::status(undefined8 *param_1,long param_2);`
- capstone offset: `0x6d81c`  instr: 17
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::mchip::MastercardKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::status */

void __rustcall
<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
status(undefined8 *param_1,long param_2)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_2 + 0x2a0) ^ 0x8000000000000000;
  if (5 < uVar1) {
    uVar1 = 6;
  }
  if (uVar1 != 5) {
    if (uVar1 == 6) {
      <alloc::string::String_as_core::clone::Clone>::clone(param_2 + 0x2a0);
      return;
    }
    *param_1 = 0x8000000000000000;
    return;
  }
  *param_1 = 0x8000000000000001;
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_context`

- Ghidra address: `0x16d860` (152 bytes)  ·  mangled: `_ZN113_$LT$ckemv_emv_kernel..kernels..mchip..MastercardKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$11get_context17h89b1cefd54401a30E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::get_context(undefined8 *param_1,long param_2);`
- capstone offset: `0x6d860`  instr: 38
- direct calls (1): `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::mchip::MastercardKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::get_context */

void __rustcall
<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
get_context(undefined8 *param_1,long param_2)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  char cVar4;
  bool bVar5;
  code *pcVar6;
  long *plVar7;
  undefined8 extraout_x12;
  long lVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  uVar10 = *(undefined8 *)(param_2 + 0x2e8);
  uVar11 = *(undefined8 *)(param_2 + 0x2f0);
  <hashbrown::raw::RawTable<T,A>as_core::clone::Clone>::clone(&local_60,param_2 + 0x2c8);
  uVar1 = *(undefined1 *)(param_2 + 0x2f8);
  plVar7 = *(long **)(param_2 + 0x2b8);
  uVar2 = *(undefined1 *)(param_2 + 0x2f9);
  uVar3 = *(undefined1 *)(param_2 + 0x2fa);
  uVar9 = extraout_x12;
  if (plVar7 != (long *)0x0) {
    do {
      lVar8 = *plVar7;
      cVar4 = '\x01';
      bVar5 = (bool)ExclusiveMonitorPass(plVar7,0x10);
      if (bVar5) {
        *plVar7 = lVar8 + 1;
        cVar4 = ExclusiveMonitorsStatus();
      }
    } while (cVar4 != '\0');
    if (lVar8 < 0) {
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x16d8f8);
      local_40 = uVar10;
      uStack_38 = uVar11;
      (*pcVar6)();
    }
    uVar9 = *(undefined8 *)(param_2 + 0x2c0);
  }
  *(undefined1 *)(param_1 + 8) = uVar1;
  param_1[7] = uVar11;
  param_1[6] = uVar10;
  param_1[3] = uStack_58;
  param_1[2] = local_60;
  param_1[5] = uStack_48;
  param_1[4] = uStack_50;
  *(undefined1 *)((long)param_1 + 0x41) = uVar2;
  *(undefined1 *)((long)param_1 + 0x42) = uVar3;
  *param_1 = plVar7;
  param_1[1] = uVar9;
  return;
}
```

#### `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_results`

- Ghidra address: `0x16d8f8` (2328 bytes)  ·  mangled: `_ZN113_$LT$ckemv_emv_kernel..kernels..mchip..MastercardKernel$u20$as$u20$ckemv_emv_kernel..types..EmvKernelStrategy$GT$11get_results17ha79ebfbec68a8293E`
- signature (Ghidra): `void __rustcall<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::get_results(undefined8 *param_1,long param_2);`
- capstone offset: `0x6d8f8`  instr: 862
- direct calls (4): `_<alloc::string::String as core::clone::Clone>::clone`, `_<alloc::vec::Vec<T,A> as core::clone::Clone>::clone`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `_Unwind_Resume`
- Ghidra callees (1): `clone`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* <ckemv_emv_kernel::kernels::mchip::MastercardKernel as
   ckemv_emv_kernel::types::EmvKernelStrategy>::get_results */

void __rustcall
<ckemv_emv_kernel::kernels::mchip::MastercardKernel_as_ckemv_emv_kernel::types::EmvKernelStrategy>::
get_results(undefined8 *param_1,long param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 local_2a0;
  undefined8 local_298;
  undefined8 local_290;
  undefined8 local_288;
  undefined8 local_280;
  undefined8 local_278;
  undefined8 local_270;
  undefined8 local_268;
  undefined8 local_260;
  undefined8 local_258;
  undefined8 local_250;
  undefined8 local_248;
  undefined8 local_240;
  undefined8 local_238;
  undefined8 local_230;
  undefined8 local_228;
  undefined8 local_220;
  undefined8 local_218;
  undefined8 local_210;
  undefined8 local_208;
  undefined8 local_200;
  undefined8 local_1f8;
  undefined8 local_1f0;
  undefined8 local_1e8;
  undefined8 local_1e0;
  undefined8 local_1d8;
  undefined8 local_1d0;
  undefined8 local_1c8;
  undefined8 local_1c0;
  undefined8 local_1b8;
  undefined8 local_1b0;
  undefined8 local_1a8;
  undefined8 local_1a0;
  undefined8 local_198;
  undefined8 local_190;
  undefined8 local_188;
  undefined8 local_180;
  undefined8 local_178;
  undefined8 local_170;
  undefined8 local_168;
  undefined8 local_160;
  undefined8 local_158;
  undefined8 local_150;
  undefined8 local_148;
  undefined8 local_140;
  undefined8 local_138;
  undefined8 local_130;
  undefined8 local_128;
  undefined8 local_120;
  undefined8 local_118;
  undefined8 local_110;
  undefined8 local_108;
  undefined8 local_100;
  undefined8 local_f8;
  undefined8 local_f0;
  undefined8 local_e8;
  undefined8 local_e0;
  undefined8 local_d8;
  undefined8 local_d0;
  undefined8 local_c8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 local_78;
  undefined8 uStack_70;
  undefined8 local_68;
  
  if (*(long *)(param_2 + 0x18) == -0x8000000000000000) {
    local_90 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x30);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_90);
    lVar6 = *(long *)(param_2 + 0x30);
  }
  if (lVar6 == -0x8000000000000000) {
    local_98 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x48);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x48);
    local_98 = local_78;
    local_130 = uStack_70;
    local_188 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_a0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x60);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x60);
    local_a0 = local_78;
    local_198 = local_68;
    local_138 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_a8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x78);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x78);
    local_a8 = local_78;
    local_140 = uStack_70;
    local_1a0 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_b0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x90);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x90);
    local_b0 = local_78;
    local_1b0 = local_68;
    local_148 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_b8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xa8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xa8);
    local_b8 = local_78;
    local_150 = uStack_70;
    local_1b8 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_c0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xc0);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xc0);
    local_c0 = local_78;
    local_1c8 = local_68;
    local_158 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_c8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xd8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xd8);
    local_c8 = local_78;
    local_160 = uStack_70;
    local_1d8 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_d0 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0xf0);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0xf0);
    local_d0 = local_78;
    local_1e0 = local_68;
    local_168 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_d8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x108);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78);
    lVar6 = *(long *)(param_2 + 0x108);
    local_d8 = local_78;
    local_170 = uStack_70;
    local_1f0 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x120);
    local_e0 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x108);
    lVar6 = *(long *)(param_2 + 0x120);
    local_e0 = local_78;
    local_1f8 = local_68;
    local_178 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_e8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x138);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x120);
    lVar6 = *(long *)(param_2 + 0x138);
    local_e8 = local_78;
    local_180 = uStack_70;
    local_208 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x150);
    local_f0 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x138);
    lVar6 = *(long *)(param_2 + 0x150);
    local_f0 = local_78;
    local_218 = local_68;
    local_190 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_f8 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x168);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x150);
    lVar6 = *(long *)(param_2 + 0x168);
    local_f8 = local_78;
    local_1a8 = uStack_70;
    local_220 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x180);
    local_100 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x168);
    lVar6 = *(long *)(param_2 + 0x180);
    local_100 = local_78;
    local_230 = local_68;
    local_1c0 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_108 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x198);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x180);
    lVar6 = *(long *)(param_2 + 0x198);
    local_108 = local_78;
    local_1d0 = uStack_70;
    local_238 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    local_110 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x1b0);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x198);
    lVar6 = *(long *)(param_2 + 0x1b0);
    local_110 = local_78;
    local_248 = local_68;
    local_1e8 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_118 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x1c8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1b0);
    lVar6 = *(long *)(param_2 + 0x1c8);
    local_118 = local_78;
    local_200 = uStack_70;
    local_250 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x1e0);
    uVar5 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1c8);
    lVar6 = *(long *)(param_2 + 0x1e0);
    uVar5 = local_78;
    local_260 = local_68;
    local_210 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_120 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x1f8);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1e0);
    lVar6 = *(long *)(param_2 + 0x1f8);
    local_120 = local_78;
    local_228 = uStack_70;
    local_270 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x210);
    uVar4 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x1f8);
    lVar6 = *(long *)(param_2 + 0x210);
    uVar4 = local_78;
    local_278 = local_68;
    local_240 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    local_128 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 0x228);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x210);
    lVar6 = *(long *)(param_2 + 0x228);
    local_128 = local_78;
    local_258 = uStack_70;
    local_288 = local_68;
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(param_2 + 0x240);
    uVar3 = 0x8000000000000000;
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x228);
    lVar6 = *(long *)(param_2 + 0x240);
    uVar3 = local_78;
    local_290 = local_68;
    local_268 = uStack_70;
  }
  if (lVar6 == -0x8000000000000000) {
    uVar7 = 0x8000000000000000;
    lVar6 = *(long *)(param_2 + 600);
  }
  else {
    <alloc::string::String_as_core::clone::Clone>::clone(&local_78,param_2 + 0x240);
    lVar6 = *(long *)(param_2 + 600);
    local_280 = uStack_70;
    local_2a0 = local_68;
    uVar7 = local_78;
  }
  if (lVa
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_core::response::Response::from_bytes`

- Ghidra address: `0x17a018` (184 bytes)  ·  mangled: `_ZN10ckemv_core8response8Response10from_bytes17h6914d4801a68cd5fE`
- signature (Ghidra): `void __rustcall ckemv_core::response::Response::from_bytes(undefined8 *param_1,long param_2,ulong param_3);`
- capstone offset: `0x7a018`  instr: 46
- direct calls (1): `bytes::bytes::Bytes::copy_from_slice`
- referenced strings (1 unique):
  - `0x235df`: "Response too short: must be at least 2 bytesInvalid character  at position Odd number of digitsInvalid string length/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b557f/iso7816-tlv-0.4.4\u2026"
- Ghidra callees (1): `copy_from_slice`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_core::response::Response::from_bytes */

void __rustcall
ckemv_core::response::Response::from_bytes(undefined8 *param_1,long param_2,ulong param_3)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_40;
  undefined8 local_38;
  undefined8 uStack_30;
  undefined8 local_28;
  
  if (param_3 < 2) {
    param_1[1] = 0x8000000000000005;
    param_1[2] = "Response too short: must be at least 2 bytes";
    param_1[3] = 0x2c;
    *param_1 = 1;
    return;
  }
  uVar1 = *(undefined1 *)(param_2 + (param_3 - 2));
  uVar2 = *(undefined1 *)(param_2 + param_3 + -1);
  if (param_3 - 2 == 0) {
    local_40 = 0;
  }
  else {
    bytes::bytes::Bytes::copy_from_slice(&local_40);
    uStack_58 = uStack_30;
    local_60 = local_38;
    local_50 = local_28;
  }
  param_1[1] = local_40;
  *(undefined1 *)(param_1 + 5) = uVar1;
  param_1[3] = uStack_58;
  param_1[2] = local_60;
  param_1[4] = local_50;
  *(undefined1 *)((long)param_1 + 0x29) = uVar2;
  *param_1 = 0;
  return;
}
```

## libckemv_reporter.so (Rust C2 client)

- arch: `ARCH.AARCH64`  type: `FILE_TYPE.DYN`  entry: `0x0`
- NEEDED libs: `libc.so, libdl.so`
- sections: 27  segments: 10

### Operator-authored functions decompiled by Ghidra: **3**

#### `ckemv_reporter::native_upload_harvest_data`

- Ghidra address: `0x1de7a4` (2852 bytes)  ·  mangled: `_ZN14ckemv_reporter26native_upload_harvest_data17hca508f3dbdced817E`
- signature (Ghidra): `undefined8 *** __rustcall ckemv_reporter::native_upload_harvest_data(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5);`
- capstone offset: `0xde7a4`  instr: 828
- direct calls (23): `jni::wrapper::jnienv::JNIEnv::get_string`, `obfstr::xref::inner`, `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `serde_json::de::from_trait`, `alloc::fmt::format::format_inner`, `jni::wrapper::jnienv::JNIEnv::new_string`, `core::ptr::drop_in_place<serde_json::error::Error>`, `ureq::post`, `ureq::request::Request::set`, `ureq::request::Request::send_json`, `@0x22a990`, `ureq::response::Response::into_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `core::ptr::drop_in_place<ureq::error::Error>`, `core::result::unwrap_failed`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<std::io::error::Error>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<ureq::request::Request>`, `core::ptr::drop_in_place<core::result::Result<jni::wrapper::strings::java_str::JavaStr,jni::wrapper::errors::Error>>`, `core::ptr::drop_in_place<serde_json::value::Value>`
- referenced strings (1 unique):
  - `0x2b254`: "called `Result::unwrap()` on an `Err` valueWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (18): `__rust_alloc`, `__rust_dealloc`, `drop_in_place<jni::wrapper::errors::Error>`, `drop_in_place<serde_json::error::Error>`, `drop_in_place<ureq::error::Error>`, `format_inner`, `from`, `from_trait`, `get_string`, `handle_error`, `inner`, `into_string`, `memcpy`, `new_string`, `post`, `send_json`, `set`, `unwrap_failed`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_reporter::native_upload_harvest_data */

undefined8 *** __rustcall
ckemv_reporter::native_upload_harvest_data
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5)

{
  uint uVar1;
  uint3 uVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  undefined4 uVar7;
  byte bVar8;
  ulong *puVar9;
  uint *puVar10;
  undefined4 *puVar11;
  long lVar12;
  undefined8 uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 ***pppuVar16;
  undefined8 *puVar17;
  undefined8 uVar18;
  undefined8 *puVar19;
  undefined8 local_598;
  undefined8 uStack_590;
  undefined8 local_588;
  undefined8 uStack_580;
  long local_578;
  undefined8 local_570;
  undefined8 uStack_568;
  undefined8 *local_560;
  ulong *puStack_558;
  undefined8 **local_550;
  undefined7 uStack_540;
  undefined1 local_539;
  undefined7 uStack_538;
  undefined1 uStack_531;
  undefined7 uStack_530;
  undefined8 **local_529;
  undefined8 ***local_520;
  undefined8 ***pppuStack_518;
  undefined8 **local_510;
  code *pcStack_508;
  undefined1 auStack_4f8 [24];
  undefined8 local_4e0;
  undefined1 uStack_4d8;
  undefined7 uStack_4d7;
  undefined1 uStack_4d0;
  undefined7 uStack_4cf;
  undefined8 **ppuStack_4c8;
  undefined8 local_4c0;
  undefined8 uStack_4b8;
  undefined8 local_4b0;
  ulong local_3d0;
  uint local_3c8;
  ulong local_3c0;
  ulong uStack_3b8;
  ulong local_3b0;
  byte local_3a8;
  undefined1 auStack_3a0 [264];
  undefined1 auStack_298 [24];
  undefined8 local_280;
  byte bStack_278;
  undefined7 uStack_277;
  undefined1 local_270;
  undefined7 uStack_26f;
  undefined8 **ppuStack_268;
  undefined8 local_260;
  undefined8 uStack_258;
  undefined8 local_250;
  undefined1 auStack_168 [24];
  undefined8 local_150;
  undefined8 local_148;
  undefined8 **local_140;
  ulong local_138;
  ulong local_130;
  byte local_128;
  byte local_127;
  undefined8 **local_120;
  undefined8 ***pppuStack_118;
  undefined8 *local_110;
  code *local_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 local_f0;
  undefined1 local_e0 [8];
  undefined8 uStack_d8;
  undefined8 **local_d0;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 **local_b0;
  undefined8 ***local_a0;
  undefined8 uStack_98;
  undefined8 **local_90;
  code *local_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  
  local_598 = param_1;
  uStack_590 = param_3;
  local_588 = param_4;
  uStack_580 = param_5;
  jni::wrapper::jnienv::JNIEnv::get_string(&local_4e0,&local_598,&uStack_590);
  local_280._4_4_ = 0;
  local_280._0_4_ = 0xa5ae8511;
  puVar9 = (ulong *)obfstr::xref::inner(&local_280,&uleb128_001259f3,0xa5ae8511);
  local_a0 = (undefined8 ***)(*puVar9 ^ 0x36e5000710a904fc);
  uStack_98 = (code *)(CONCAT26(uStack_98._6_2_,
                                CONCAT15((char)((ushort)*(undefined2 *)((long)puVar9 + 0xc) >> 8),
                                         (int5)puVar9[1])) ^ 0xd8a04a50c5d5);
  if ((char)local_4e0 != '\x0f') {
    uStack_258 = uStack_4b8;
    local_260 = local_4c0;
    ppuStack_268 = ppuStack_4c8;
    local_250 = local_4b0;
                    /* WARNING: Subroutine does not return */
    core::result::unwrap_failed
              (&local_a0,0xe,&local_280,&PTR_drop_in_place<jni::wrapper::errors::Error>_0032edf8,
               &DAT_0032ef30);
  }
  local_270 = SUB81(ppuStack_4c8,0);
  uStack_26f = (undefined7)((ulong)ppuStack_4c8 >> 8);
  bStack_278 = uStack_4d0;
  uStack_277 = uStack_4cf;
  local_280._0_4_ = (undefined4)CONCAT71(uStack_4d7,uStack_4d8);
  local_280._4_4_ = (undefined4)((uint7)uStack_4d7 >> 0x18);
  jni::wrapper::strings::java_str::
  <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
  from(&local_578,&local_280);
  jni::wrapper::jnienv::JNIEnv::get_string(&local_280,&local_598,&local_588);
  if ((char)local_280 == '\x0f') {
    uStack_d8 = CONCAT71(uStack_26f,local_270);
    local_d0 = ppuStack_268;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from(&local_a0,local_e0);
    uStack_4d0 = SUB81(uStack_98,0);
    uStack_4cf = (undefined7)((ulong)uStack_98 >> 8);
    uStack_4d8 = SUB81(local_a0,0);
    uStack_4d7 = (undefined7)((ulong)local_a0 >> 8);
    ppuStack_4c8 = local_90;
  }
  else {
    local_4b0 = local_250;
    uStack_4d8 = bStack_278;
    uStack_4d7 = uStack_277;
    local_4e0._0_4_ = (undefined4)local_280;
    local_4e0._4_4_ = local_280._4_4_;
    ppuStack_4c8 = ppuStack_268;
    uStack_4d0 = local_270;
    uStack_4cf = uStack_26f;
    uStack_4b8 = uStack_258;
    local_4c0 = local_260;
    if ((char)local_280 != '\x0f') {
      core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_4e0);
      pppuVar16 = (undefined8 ***)0x0;
      lVar12 = 0;
      uVar13 = 1;
      goto LAB_001de91c;
    }
  }
  lVar12 = CONCAT71(uStack_4d7,uStack_4d8);
  uVar13 = CONCAT71(uStack_4cf,uStack_4d0);
  pppuVar16 = (undefined8 ***)ppuStack_4c8;
LAB_001de91c:
  jni::wrapper::jnienv::JNIEnv::get_string(&local_4e0,&local_598,&uStack_580);
  uVar7 = local_4e0._4_4_;
  if ((char)local_4e0 == '\x0f') {
    uStack_b8 = CONCAT71(uStack_4cf,uStack_4d0);
    local_c0 = CONCAT71(uStack_4d7,uStack_4d8);
    local_b0 = ppuStack_4c8;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from(&local_280,&local_c0);
    puStack_558 = (ulong *)CONCAT71(uStack_277,bStack_278);
    local_560 = (undefined8 *)CONCAT44(local_280._4_4_,(undefined4)local_280);
    local_550 = (undefined8 **)CONCAT71(uStack_26f,local_270);
    uStack_531 = bStack_278;
    uStack_530 = uStack_277;
    local_539 = (undefined1)(undefined4)local_280;
    uStack_538 = (undefined7)((ulong)local_560 >> 8);
    local_529 = local_550;
  }
  else {
    uStack_540 = CONCAT43(local_4e0._4_4_,local_4e0._1_3_);
    uStack_538 = uStack_4d7;
    local_539 = uStack_4d8;
    local_250 = local_4b0;
    local_529 = ppuStack_4c8;
    uStack_531 = uStack_4d0;
    uStack_530 = uStack_4cf;
    local_4e0._4_4_ = 0;
    uStack_277 = uStack_4d7;
    local_280._0_4_ = (undefined4)local_4e0;
    local_280._4_4_ = uVar7;
    bStack_278 = uStack_4d8;
    ppuStack_268 = ppuStack_4c8;
    local_270 = uStack_4d0;
    uStack_26f = uStack_4cf;
    uStack_258 = uStack_4b8;
    local_260 = local_4c0;
    local_4e0._0_4_ = 0x8142594e;
    puVar9 = (ulong *)obfstr::xref::inner(&local_4e0,0x11d83f,0x8142594e);
    uVar15 = *puVar9;
    uVar14 = puVar9[1];
    uVar6 = puVar9[2];
    puStack_558 = (ulong *)__rustc[4794b31dd7191200]::__rust_alloc(0x12,1);
    if (puStack_558 == (ulong *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x12,&DAT_0032ef18);
    }
    *puStack_558 = uVar15 ^ 0x77ee67622568ba35;
    puStack_558[1] = uVar14 ^ 0x8c3250eddb4d2683;
    *(byte *)(puStack_558 + 2) = (byte)(short)uVar6 ^ 0xba;
    *(byte *)((long)puStack_558 + 0x11) = (byte)((ushort)(short)uVar6 >> 8) ^ 0xec;
    local_560 = (undefined8 **)0x12;
    local_550 = (undefined8 ***)0x12;
    core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_280);
  }
  local_270 = 0;
  uStack_26f = 0;
  local_280._0_4_ = (undefined4)local_570;
  local_280._4_4_ = (undefined4)((ulong)local_570 >> 0x20);
  bStack_278 = (byte)uStack_568;
  uStack_277 = (undefined7)((ulong)uStack_568 >> 8);
  serde_json::de::from_trait(&local_a0,&local_280);
  if ((char)local_a0 == '\x06') {
    local_150 = (undefined8 ***)uStack_98;
    local_280._4_4_ = 0;
    local_280._0_4_ = 0xb61717ad;
    puVar9 = (ulong *)obfstr::xref::inner(&local_280,&DAT_00121ef2,0xb61717ad);
    local_120 = (undefined8 **)(*puVar9 ^ 0x6561a094e172fd7a);
    pppuStack_118 = (undefined8 ***)(puVar9[1] ^ 0xead5e95c7f120d8d);
    local_110 = (undefined8 *)(CONCAT53(local_110._3_5_,(int3)puVar9[2]) ^ 0x3616c3);
    local_140 = &local_120;
    local_4e0 = &local_140;
    local_138 = 0x13;
    uStack_4d8 = 0xc0;
    uStack_4d7 = 0x1e2e;
    local_260 = 0;
    uStack_4d0 = SUB81(&local_150,0);
    uStack_4cf = (undefined7)((ulong)&local_150 >> 8);
    ppuStack_4c8 = (undefined8 **)<serde_json::error::Error_as_core::fmt::Display>::fmt;
    local_280._0_4_ = 0x32ef68;
    local_280._4_4_ = 0;
    bStack_278 = 2;
    uStack_277 = 0;
    local_270 = SUB81(&local_4e0,0);
    uStack_26f = (undefined7)((ulong)&local_4e0 >> 8);
    ppuStack_268 = (undefined8 **)0x2;
    alloc::fmt::format::format_inner(auStack_4f8,&local_280);
    jni::wrapper::jnienv::JNIEnv::new_string(&local_4e0,&local_598,auStack_4f8);
    if ((char)local_4e0 != '\x0f') {
      uStack_258 = uStack_4b8;
      local_260 = local_4c0;
      bStack_278 = uStack_4d8;
      uStack_277 = uStack_4d7;
      ppuStack_268 = ppuStack_4c8;
      local_270 = uStack_4d0;
      uStack_26f = uStack_4cf;
      local_250 = local_4b0;
      local_280 = local_4e0;
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_280,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_0032edf8,&DAT_0032efb8);
    }
    pppuVar16 = (undefined8 ***)CONCAT71(uStack_4d7,uStack_4d8);
    core::ptr::drop_in_place<serde_json::error::Error>(local_150);
  }
  else {
    local_280._0_4_ = 0x32ef48;
    local_280._4_4_ = 0;
    bStack_278 = 2;
    uStack_277 = 0;
    pppuStack_518 = (undefined8 ***)uStack_98;
    local_520 = local_a0;
    pcStack_508 = local_88;
    local_510 = local_90;
    uStack_98 = <alloc::string::String_as_core::fmt::Display>::fmt;
    local_260 = 0;
    local_270 = SUB81(&local_a0,0);
    uStack_26f = (undefined7)((ulong)&local_a0 >> 8);
    ppuStack_268 = (undefined8 **)0x1;
    local_a0 = (undefined8 ***)&local_560;
    alloc::fmt::format::format_inner(&local_4e0,&local_280);
    lVa
/* ... truncated for readability — see Ghidra output file for full body ... */
```

#### `ckemv_reporter::native_fetch_cves`

- Ghidra address: `0x1df494` (1612 bytes)  ·  mangled: `_ZN14ckemv_reporter17native_fetch_cves17hc104ab3912132366E`
- signature (Ghidra): `code * __rustcall ckemv_reporter::native_fetch_cves(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4);`
- capstone offset: `0xdf494`  instr: 470
- direct calls (20): `jni::wrapper::jnienv::JNIEnv::get_string`, `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `obfstr::xref::inner`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `alloc::fmt::format::format_inner`, `ureq::get`, `ureq::request::Request::set`, `ureq::request::Request::call`, `@0x22a990`, `ureq::response::Response::into_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `jni::wrapper::jnienv::JNIEnv::new_string`, `core::ptr::drop_in_place<ureq::error::Error>`, `core::result::unwrap_failed`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<std::io::error::Error>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<ureq::request::Request>`, `_Unwind_Resume`
- referenced strings (1 unique):
  - `0x2b254`: "called `Result::unwrap()` on an `Err` valueWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (16): `__rust_alloc`, `__rust_dealloc`, `call`, `drop_in_place<jni::wrapper::errors::Error>`, `drop_in_place<ureq::error::Error>`, `format_inner`, `from`, `get`, `get_string`, `handle_error`, `inner`, `into_string`, `memcpy`, `new_string`, `set`, `unwrap_failed`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_reporter::native_fetch_cves */

code * __rustcall
ckemv_reporter::native_fetch_cves
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ushort uVar1;
  long lVar2;
  code *pcVar3;
  ulong uVar4;
  byte bVar5;
  ulong *puVar6;
  ushort *puVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  ushort *puVar12;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  undefined8 local_518;
  undefined8 uStack_510;
  undefined8 local_508;
  ulong *local_500;
  ulong *puStack_4f8;
  undefined8 local_4f0;
  undefined7 uStack_4e0;
  undefined8 local_4c9;
  undefined4 local_4c0;
  undefined4 uStack_4bc;
  undefined1 uStack_4b8;
  undefined7 uStack_4b7;
  undefined1 uStack_4b0;
  undefined7 uStack_4af;
  undefined8 uStack_4a8;
  undefined8 local_4a0;
  undefined8 uStack_498;
  undefined8 local_490;
  ulong **local_3b0;
  code *pcStack_3a8;
  ulong ***local_3a0;
  code *local_398;
  undefined8 local_390;
  undefined8 uStack_388;
  undefined8 local_380;
  ulong local_348;
  byte local_340;
  undefined1 auStack_338 [264];
  char local_230;
  undefined7 uStack_22f;
  byte bStack_228;
  undefined7 uStack_227;
  undefined1 uStack_220;
  undefined7 uStack_21f;
  undefined8 uStack_218;
  undefined8 local_210;
  undefined8 uStack_208;
  undefined8 local_200;
  undefined1 auStack_118 [24];
  ulong *local_100;
  undefined8 local_f8;
  ulong local_f0;
  ulong local_e8;
  byte local_e0;
  byte local_df;
  byte local_de;
  ulong **local_d8;
  code *pcStack_d0;
  char *local_c8;
  code *pcStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined1 local_a0 [16];
  undefined8 local_90;
  undefined1 local_80 [16];
  undefined8 local_70;
  
  local_518 = param_1;
  uStack_510 = param_3;
  local_508 = param_4;
  jni::wrapper::jnienv::JNIEnv::get_string(&local_230,&local_518,&uStack_510);
  if (local_230 == '\x0f') {
    local_90 = uStack_218;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from((ulong)&local_4c0 | 8,local_a0);
  }
  else {
    local_490 = local_200;
    uStack_4b8 = bStack_228;
    uStack_4b7 = uStack_227;
    local_4c0 = (undefined4)CONCAT71(uStack_22f,local_230);
    uStack_4bc = (undefined4)((uint7)uStack_22f >> 0x18);
    uStack_4a8 = uStack_218;
    uStack_4b0 = uStack_220;
    uStack_4af = uStack_21f;
    uStack_498 = uStack_208;
    local_4a0 = local_210;
    if (local_230 != '\x0f') {
      core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_4c0);
      uVar14 = 0;
      lVar9 = 0;
      uVar10 = 1;
      goto LAB_001df544;
    }
  }
  lVar9 = CONCAT71(uStack_4b7,uStack_4b8);
  uVar10 = CONCAT71(uStack_4af,uStack_4b0);
  uVar14 = uStack_4a8;
LAB_001df544:
  jni::wrapper::jnienv::JNIEnv::get_string(&local_4c0,&local_518,&local_508);
  if ((char)local_4c0 == '\x0f') {
    local_70 = uStack_4a8;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from(&local_230,local_80);
    puStack_4f8 = (ulong *)CONCAT71(uStack_227,bStack_228);
    local_500 = (ulong *)CONCAT71(uStack_22f,local_230);
    local_4f0 = CONCAT71(uStack_21f,uStack_220);
    local_4c9 = local_4f0;
  }
  else {
    uStack_4e0 = CONCAT43(uStack_4bc,local_4c0._1_3_);
    local_230 = (char)local_4c0;
    local_200 = local_490;
    local_4c9 = uStack_4a8;
    uStack_4bc = 0;
    uStack_218 = uStack_4a8;
    uStack_208 = uStack_498;
    local_210 = local_4a0;
    local_4c0 = 0x55c0898e;
    uStack_22f = uStack_4e0;
    puVar6 = (ulong *)obfstr::xref::inner(&local_4c0,&GCC_except_table9,0x55c0898e);
    uVar13 = *puVar6;
    uVar11 = puVar6[1];
    uVar4 = puVar6[2];
    puStack_4f8 = (ulong *)__rustc[4794b31dd7191200]::__rust_alloc(0x12,1);
    if (puStack_4f8 == (ulong *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x12,&DAT_0032ef18);
    }
    *(byte *)((long)puStack_4f8 + 0x11) = (byte)((ushort)(short)uVar4 >> 8) ^ 0x40;
    *puStack_4f8 = uVar13 ^ 0xdcd1ba7864b77021;
    puStack_4f8[1] = uVar11 ^ 0x92d13ac198473957;
    *(byte *)(puStack_4f8 + 2) = (byte)(short)uVar4 ^ 0xa5;
    local_500 = (ulong *)0x12;
    local_4f0 = 0x12;
    core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_230);
  }
  local_3b0 = &local_500;
  pcStack_3a8 = <alloc::string::String_as_core::fmt::Display>::fmt;
  local_230 = -0x30;
  uStack_22f = 0x32ef;
  bStack_228 = 2;
  uStack_227 = 0;
  local_210 = 0;
  uStack_220 = SUB81(&local_3b0,0);
  uStack_21f = (undefined7)((ulong)&local_3b0 >> 8);
  uStack_218 = 1;
  alloc::fmt::format::format_inner(&local_4c0,&local_230);
  lVar2 = CONCAT44(uStack_4bc,local_4c0);
  ureq::get(&local_230,CONCAT71(uStack_4b7,uStack_4b8),CONCAT71(uStack_4af,uStack_4b0));
  uStack_4bc = 0;
  local_4c0 = 0x3dfc64fc;
  puVar6 = (ulong *)obfstr::xref::inner(&local_4c0,&DAT_00128687,0x3dfc64fc);
  local_348 = *puVar6 ^ 0x9fe88eab5a6d0a58;
  local_340 = (byte)puVar6[1] ^ 0x15;
  ureq::request::Request::set(&local_3b0,&local_230,&local_348,9,uVar10,uVar14);
  ureq::request::Request::call(&local_4c0,&local_3b0);
  if (CONCAT44(uStack_4bc,local_4c0) == -0x7fffffffffffffff) {
    memcpy(auStack_338,&uStack_4b8,0x108);
    ureq::response::Response::into_string(&local_230,auStack_338);
    bVar5 = bStack_228;
    lVar8 = CONCAT71(uStack_22f,local_230);
    puVar12 = (ushort *)CONCAT71(uStack_227,bStack_228);
    if (lVar8 == -0x8000000000000000) {
      local_3b0 = (ulong **)0xd5b1e42d;
      puVar7 = (ushort *)obfstr::xref::inner(&local_3b0,&DAT_001295ee,0xd5b1e42d);
      uVar1 = *puVar7;
      puVar7 = (ushort *)__rustc[4794b31dd7191200]::__rust_alloc(2,1);
      if (puVar7 == (ushort *)0x0) {
                    /* WARNING: Subroutine does not return */
        alloc::raw_vec::handle_error(1,2,&DAT_0032ef18);
      }
      *puVar7 = uVar1 & 0xff00 ^ 0x2500 | (uVar1 ^ 0xca) & 0xff;
      if ((bVar5 & 3) == 1) {
        uVar14 = *(undefined8 *)((long)puVar12 + -1);
        puVar15 = *(undefined8 **)((long)puVar12 + 7);
        if ((code *)*puVar15 != (code *)0x0) {
          (*(code *)*puVar15)(uVar14);
        }
        if (puVar15[1] != 0) {
          __rustc[4794b31dd7191200]::__rust_dealloc(uVar14,puVar15[1],puVar15[2]);
        }
        __rustc[4794b31dd7191200]::__rust_dealloc((undefined8 *)((long)puVar12 + -1),0x18,8);
      }
      uStack_220 = 2;
      uStack_21f = 0;
      lVar8 = 2;
      puVar12 = puVar7;
    }
    local_230 = (char)lVar8;
    uStack_22f = (undefined7)((ulong)lVar8 >> 8);
    bStack_228 = (byte)puVar12;
    uStack_227 = (undefined7)((ulong)puVar12 >> 8);
    jni::wrapper::jnienv::JNIEnv::new_string(&local_3b0,&local_518,&local_230);
    pcVar3 = pcStack_3a8;
    if ((char)local_3b0 != '\x0f') {
      uStack_208 = uStack_388;
      local_210 = local_390;
      bStack_228 = (byte)pcStack_3a8;
      uStack_227 = (undefined7)((ulong)pcStack_3a8 >> 8);
      uStack_22f = (undefined7)((ulong)local_3b0 >> 8);
      uStack_218 = local_398;
      uStack_220 = SUB81(local_3a0,0);
      uStack_21f = (undefined7)((ulong)local_3a0 >> 8);
      local_200 = local_380;
      local_230 = (char)local_3b0;
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_230,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_0032edf8,&DAT_0032eff0);
    }
  }
  else {
    memcpy(&local_230,&local_4c0,0x110);
    local_3b0 = (ulong **)0xf160d259;
    puVar6 = (ulong *)obfstr::xref::inner(&local_3b0,&uleb128_0011f37f,0xf160d259);
    local_f0 = *puVar6 ^ 0x990a53442dd949b3;
    local_e8 = puVar6[1] ^ 0x7457f4cabf35e455;
    local_e0 = (byte)(short)puVar6[2] ^ 0xd;
    local_df = (byte)((ushort)(short)puVar6[2] >> 8) ^ 0xc4;
    local_de = *(byte *)((long)puVar6 + 0x12) ^ 0x10;
    local_100 = &local_f0;
    local_d8 = &local_100;
    local_f8 = 0x13;
    pcStack_d0 = <&T_as_core::fmt::Display>::fmt;
    local_398 = (code *)0x2;
    local_390 = 0;
    pcStack_c0 = <ureq::error::Error_as_core::fmt::Display>::fmt;
    local_3b0 = (ulong **)&DAT_0032ef68;
    pcStack_3a8 = (code *)0x2;
    local_3a0 = &local_d8;
    local_c8 = &local_230;
    alloc::fmt::format::format_inner(auStack_118,&local_3b0);
    jni::wrapper::jnienv::JNIEnv::new_string(&local_d8,&local_518,auStack_118);
    pcVar3 = pcStack_d0;
    if ((char)local_d8 != '\x0f') {
      pcStack_3a8 = pcStack_d0;
      local_3b0 = local_d8;
      local_398 = pcStack_c0;
      local_3a0 = (ulong ***)local_c8;
      uStack_388 = uStack_b0;
      local_390 = local_b8;
      local_380 = local_a8;
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_3b0,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_0032edf8,&DAT_0032f008);
    }
    core::ptr::drop_in_place<ureq::error::Error>(&local_230);
  }
  if (lVar2 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(CONCAT71(uStack_4b7,uStack_4b8),lVar2,1);
  }
  if (local_500 != (ulong *)0x0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(puStack_4f8,local_500,1);
  }
  if (lVar9 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(uVar10,lVar9,1);
  }
  return pcVar3;
}
```

#### `ckemv_reporter::native_fetch_report`

- Ghidra address: `0x1dfbec` (1624 bytes)  ·  mangled: `_ZN14ckemv_reporter19native_fetch_report17hc0932ed7ded71ccdE`
- signature (Ghidra): `code * __rustcall ckemv_reporter::native_fetch_report(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4);`
- capstone offset: `0xdfbec`  instr: 473
- direct calls (20): `jni::wrapper::jnienv::JNIEnv::get_string`, `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`, `core::ptr::drop_in_place<jni::wrapper::errors::Error>`, `obfstr::xref::inner`, `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`, `alloc::fmt::format::format_inner`, `ureq::get`, `ureq::request::Request::set`, `ureq::request::Request::call`, `@0x22a990`, `ureq::response::Response::into_string`, `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`, `jni::wrapper::jnienv::JNIEnv::new_string`, `core::ptr::drop_in_place<ureq::error::Error>`, `core::result::unwrap_failed`, `alloc::raw_vec::handle_error`, `core::ptr::drop_in_place<std::io::error::Error>`, `core::panicking::panic_in_cleanup`, `core::ptr::drop_in_place<ureq::request::Request>`, `_Unwind_Resume`
- referenced strings (1 unique):
  - `0x2b254`: "called `Result::unwrap()` on an `Err` valueWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
- Ghidra callees (16): `__rust_alloc`, `__rust_dealloc`, `call`, `drop_in_place<jni::wrapper::errors::Error>`, `drop_in_place<ureq::error::Error>`, `format_inner`, `from`, `get`, `get_string`, `handle_error`, `inner`, `into_string`, `memcpy`, `new_string`, `set`, `unwrap_failed`

**Ghidra pseudo-C:**

```c
/* WARNING: Unknown calling convention: __rustcall */
/* ckemv_reporter::native_fetch_report */

code * __rustcall
ckemv_reporter::native_fetch_report
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  ushort uVar1;
  long lVar2;
  code *pcVar3;
  ulong uVar4;
  byte bVar5;
  ulong *puVar6;
  ushort *puVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  ushort *puVar12;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  undefined8 local_518;
  undefined8 uStack_510;
  undefined8 local_508;
  ulong *local_500;
  ulong *puStack_4f8;
  undefined8 local_4f0;
  undefined7 uStack_4e0;
  undefined8 local_4c9;
  undefined4 local_4c0;
  undefined4 uStack_4bc;
  undefined1 uStack_4b8;
  undefined7 uStack_4b7;
  undefined1 uStack_4b0;
  undefined7 uStack_4af;
  undefined8 uStack_4a8;
  undefined8 local_4a0;
  undefined8 uStack_498;
  undefined8 local_490;
  ulong **local_3b0;
  code *pcStack_3a8;
  ulong ***local_3a0;
  code *local_398;
  undefined8 local_390;
  undefined8 uStack_388;
  undefined8 local_380;
  ulong local_348;
  byte local_340;
  undefined1 auStack_338 [264];
  char local_230;
  undefined7 uStack_22f;
  byte bStack_228;
  undefined7 uStack_227;
  undefined1 uStack_220;
  undefined7 uStack_21f;
  undefined8 uStack_218;
  undefined8 local_210;
  undefined8 uStack_208;
  undefined8 local_200;
  undefined1 auStack_120 [24];
  ulong *local_108;
  undefined8 local_100;
  ulong local_f8;
  ulong local_f0;
  ulong local_e8;
  byte local_e0;
  byte local_df;
  ulong **local_d8;
  code *pcStack_d0;
  char *local_c8;
  code *pcStack_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined1 local_a0 [16];
  undefined8 local_90;
  undefined1 local_80 [16];
  undefined8 local_70;
  
  local_518 = param_1;
  uStack_510 = param_3;
  local_508 = param_4;
  jni::wrapper::jnienv::JNIEnv::get_string(&local_230,&local_518,&uStack_510);
  if (local_230 == '\x0f') {
    local_90 = uStack_218;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from((ulong)&local_4c0 | 8,local_a0);
  }
  else {
    local_490 = local_200;
    uStack_4b8 = bStack_228;
    uStack_4b7 = uStack_227;
    local_4c0 = (undefined4)CONCAT71(uStack_22f,local_230);
    uStack_4bc = (undefined4)((uint7)uStack_22f >> 0x18);
    uStack_4a8 = uStack_218;
    uStack_4b0 = uStack_220;
    uStack_4af = uStack_21f;
    uStack_498 = uStack_208;
    local_4a0 = local_210;
    if (local_230 != '\x0f') {
      core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_4c0);
      uVar14 = 0;
      lVar9 = 0;
      uVar10 = 1;
      goto LAB_001dfc9c;
    }
  }
  lVar9 = CONCAT71(uStack_4b7,uStack_4b8);
  uVar10 = CONCAT71(uStack_4af,uStack_4b0);
  uVar14 = uStack_4a8;
LAB_001dfc9c:
  jni::wrapper::jnienv::JNIEnv::get_string(&local_4c0,&local_518,&local_508);
  if ((char)local_4c0 == '\x0f') {
    local_70 = uStack_4a8;
    jni::wrapper::strings::java_str::
    <impl_core::convert::From<jni::wrapper::strings::java_str::JavaStr>for_alloc::string::String>::
    from(&local_230,local_80);
    puStack_4f8 = (ulong *)CONCAT71(uStack_227,bStack_228);
    local_500 = (ulong *)CONCAT71(uStack_22f,local_230);
    local_4f0 = CONCAT71(uStack_21f,uStack_220);
    local_4c9 = local_4f0;
  }
  else {
    uStack_4e0 = CONCAT43(uStack_4bc,local_4c0._1_3_);
    local_230 = (char)local_4c0;
    local_200 = local_490;
    local_4c9 = uStack_4a8;
    uStack_4bc = 0;
    uStack_218 = uStack_4a8;
    uStack_208 = uStack_498;
    local_210 = local_4a0;
    local_4c0 = 0xabbee4f5;
    uStack_22f = uStack_4e0;
    puVar6 = (ulong *)obfstr::xref::inner(&local_4c0,&uleb128_001249e1,0xabbee4f5);
    uVar13 = *puVar6;
    uVar11 = puVar6[1];
    uVar4 = puVar6[2];
    puStack_4f8 = (ulong *)__rustc[4794b31dd7191200]::__rust_alloc(0x12,1);
    if (puStack_4f8 == (ulong *)0x0) {
                    /* WARNING: Subroutine does not return */
      alloc::raw_vec::handle_error(1,0x12,&DAT_0032ef18);
    }
    *(byte *)((long)puStack_4f8 + 0x11) = (byte)((ushort)(short)uVar4 >> 8) ^ 0xae;
    *puStack_4f8 = uVar13 ^ 0x9d7744a1221136e7;
    puStack_4f8[1] = uVar11 ^ 0xbb5dc3f1c9889450;
    *(byte *)(puStack_4f8 + 2) = (byte)(short)uVar4 ^ 0x60;
    local_500 = (ulong *)0x12;
    local_4f0 = 0x12;
    core::ptr::drop_in_place<jni::wrapper::errors::Error>(&local_230);
  }
  local_3b0 = &local_500;
  pcStack_3a8 = <alloc::string::String_as_core::fmt::Display>::fmt;
  local_230 = ' ';
  uStack_22f = 0x32f0;
  bStack_228 = 2;
  uStack_227 = 0;
  local_210 = 0;
  uStack_220 = SUB81(&local_3b0,0);
  uStack_21f = (undefined7)((ulong)&local_3b0 >> 8);
  uStack_218 = 1;
  alloc::fmt::format::format_inner(&local_4c0,&local_230);
  lVar2 = CONCAT44(uStack_4bc,local_4c0);
  ureq::get(&local_230,CONCAT71(uStack_4b7,uStack_4b8),CONCAT71(uStack_4af,uStack_4b0));
  uStack_4bc = 0;
  local_4c0 = 0x7853cd66;
  puVar6 = (ulong *)obfstr::xref::inner(&local_4c0,0x11e61f,0x7853cd66);
  local_348 = *puVar6 ^ 0x49d236de9c7f6dfe;
  local_340 = (byte)puVar6[1] ^ 0x1a;
  ureq::request::Request::set(&local_3b0,&local_230,&local_348,9,uVar10,uVar14);
  ureq::request::Request::call(&local_4c0,&local_3b0);
  if (CONCAT44(uStack_4bc,local_4c0) == -0x7fffffffffffffff) {
    memcpy(auStack_338,&uStack_4b8,0x108);
    ureq::response::Response::into_string(&local_230,auStack_338);
    bVar5 = bStack_228;
    lVar8 = CONCAT71(uStack_22f,local_230);
    puVar12 = (ushort *)CONCAT71(uStack_227,bStack_228);
    if (lVar8 == -0x8000000000000000) {
      local_3b0 = (ulong **)0x287dbd87;
      puVar7 = (ushort *)obfstr::xref::inner(&local_3b0,0x11f13f,0x287dbd87);
      uVar1 = *puVar7;
      puVar7 = (ushort *)__rustc[4794b31dd7191200]::__rust_alloc(2,1);
      if (puVar7 == (ushort *)0x0) {
                    /* WARNING: Subroutine does not return */
        alloc::raw_vec::handle_error(1,2,&DAT_0032ef18);
      }
      *puVar7 = uVar1 & 0xff00 ^ 0xa00 | (uVar1 ^ 0x69) & 0xff;
      if ((bVar5 & 3) == 1) {
        uVar14 = *(undefined8 *)((long)puVar12 + -1);
        puVar15 = *(undefined8 **)((long)puVar12 + 7);
        if ((code *)*puVar15 != (code *)0x0) {
          (*(code *)*puVar15)(uVar14);
        }
        if (puVar15[1] != 0) {
          __rustc[4794b31dd7191200]::__rust_dealloc(uVar14,puVar15[1],puVar15[2]);
        }
        __rustc[4794b31dd7191200]::__rust_dealloc((undefined8 *)((long)puVar12 + -1),0x18,8);
      }
      uStack_220 = 2;
      uStack_21f = 0;
      lVar8 = 2;
      puVar12 = puVar7;
    }
    local_230 = (char)lVar8;
    uStack_22f = (undefined7)((ulong)lVar8 >> 8);
    bStack_228 = (byte)puVar12;
    uStack_227 = (undefined7)((ulong)puVar12 >> 8);
    jni::wrapper::jnienv::JNIEnv::new_string(&local_3b0,&local_518,&local_230);
    pcVar3 = pcStack_3a8;
    if ((char)local_3b0 != '\x0f') {
      uStack_208 = uStack_388;
      local_210 = local_390;
      bStack_228 = (byte)pcStack_3a8;
      uStack_227 = (undefined7)((ulong)pcStack_3a8 >> 8);
      uStack_22f = (undefined7)((ulong)local_3b0 >> 8);
      uStack_218 = local_398;
      uStack_220 = SUB81(local_3a0,0);
      uStack_21f = (undefined7)((ulong)local_3a0 >> 8);
      local_200 = local_380;
      local_230 = (char)local_3b0;
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_230,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_0032edf8,&DAT_0032f040);
    }
  }
  else {
    memcpy(&local_230,&local_4c0,0x110);
    local_3b0 = (ulong **)0x521a50db;
    puVar6 = (ulong *)obfstr::xref::inner(&local_3b0,0x129a97,0x521a50db);
    local_f8 = *puVar6 ^ 0x1048ed30f1e8748c;
    local_e8 = puVar6[2] ^ 0xde9c55b27a5c9f2e;
    local_df = (byte)((ushort)(short)puVar6[3] >> 8) ^ 0xcb;
    local_108 = &local_f8;
    local_f0 = puVar6[1] ^ 0x88b5538cb0339327;
    local_e0 = (byte)(short)puVar6[3] ^ 0x47;
    local_d8 = &local_108;
    local_100 = 0x1a;
    pcStack_d0 = <&T_as_core::fmt::Display>::fmt;
    local_398 = (code *)0x2;
    local_390 = 0;
    pcStack_c0 = <ureq::error::Error_as_core::fmt::Display>::fmt;
    local_3b0 = (ulong **)&DAT_0032ef68;
    pcStack_3a8 = (code *)0x2;
    local_3a0 = &local_d8;
    local_c8 = &local_230;
    alloc::fmt::format::format_inner(auStack_120,&local_3b0);
    jni::wrapper::jnienv::JNIEnv::new_string(&local_d8,&local_518,auStack_120);
    pcVar3 = pcStack_d0;
    if ((char)local_d8 != '\x0f') {
      pcStack_3a8 = pcStack_d0;
      local_3b0 = local_d8;
      local_398 = pcStack_c0;
      local_3a0 = (ulong ***)local_c8;
      uStack_388 = uStack_b0;
      local_390 = local_b8;
      local_380 = local_a8;
                    /* WARNING: Subroutine does not return */
      core::result::unwrap_failed
                ("called `Result::unwrap()` on an `Err` value",0x2b,&local_3b0,
                 &PTR_drop_in_place<jni::wrapper::errors::Error>_0032edf8,&DAT_0032f058);
    }
    core::ptr::drop_in_place<ureq::error::Error>(&local_230);
  }
  if (lVar2 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(CONCAT71(uStack_4b7,uStack_4b8),lVar2,1);
  }
  if (local_500 != (ulong *)0x0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(puStack_4f8,local_500,1);
  }
  if (lVar9 != 0) {
    __rustc[4794b31dd7191200]::__rust_dealloc(uVar10,lVar9,1);
  }
  return pcVar3;
}
```

---

## Appendix — Artefacts on disk

Inside `samples/ckemv/apk_analysis/docker/out/`:

- `ghidra/kernel/` — Ghidra pseudo-C for every operator function in libckemv_android.so
- `ghidra/reporter/` — Ghidra pseudo-C for the 3 reporter operator functions
- `rizin/kernel_aflj.json`, `kernel_izj.json`, `kernel_iIj.json`, `kernel_iSj.json`, `kernel_callgraph.dot`
- `rizin/reporter_*.json` — same for the reporter
- `rust/{kernel,reporter}_symtab_demangled.txt` — rustfilt canonical symbol lists
- `rust/{kernel,reporter}_symtab_crate_counts.txt` — top-level crate occurrence counts

Inside `samples/ckemv/apk_analysis/` itself:
- `kernel_functions.json`, `reporter_functions.json` — capstone+lief per-function metadata
- `{kernel,reporter}_elf_meta.json` — ELF header / sections / segments / dynamic entries
- `CKEMV_OSS_MODULE_INVENTORY.md` — open-source crate inventory with public GitHub URLs
- `CKEMV_NATIVE_FUNCTIONS_REPORT.md` — operator function narrative
- `CKEMV_CLASS_BY_CLASS_REPORT.md` — Java/Kotlin function walk
- `CKEMV_HARVESTER_ANALYSIS.md` — overall writeup