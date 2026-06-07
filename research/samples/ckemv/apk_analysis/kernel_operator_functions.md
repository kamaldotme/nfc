# Operator-authored functions in kernel

Total: 47

## `_<ckemv_emv_kernel::types::TransactionStatus as core::fmt::Debug>::fmt`
- offset: `0x439f4`  size: 112 bytes  instr: 28
- calls (1):
  - `core::fmt::Formatter::debug_tuple_field1_finish`
- strings referenced (3):
  - `0x19cb1`: "CompletedFailed/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs{}"
  - `0x19ca7`: "InProgressCompletedFailed/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs{}"
  - `0x19cba`: "Failed/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rs{}"

## `ckemv_android::native_initialize`
- offset: `0x43a64`  size: 2168 bytes  instr: 542
- calls (55):
  - `jni::wrapper::jnienv::JNIEnv::get_string`
  - `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `serde_json::de::from_trait`
  - `core::ptr::drop_in_place<serde_json::error::Error>`
  - `_<ckemv_emv_kernel::types::TransactionContext as core::default::Default>::default`
  - `std::sys::thread_local::os::Storage<T>::get`
  - `_<alloc::collections::btree::map::Iter<K,V> as core::iter::traits::iterator::Iterator>::next`
  - `alloc::str::_<impl str>::to_uppercase`
  - `hashbrown::map::HashMap<K,V,S,A>::insert`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `core::fmt::num::imp::_<impl core::fmt::Display for u64>::fmt`
  - `alloc::fmt::format::format_inner`
  - `_<hashbrown::raw::RawTable<T,A> as core::ops::drop::Drop>::drop`
  - `android_logger::Config::with_tag`
  - `android_logger::init_once`
  - `log::__private_api::loc`
  - `_<log::__private_api::GlobalLogger as log::Log>::log`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::dispatcher::TransactionDispatcher>`
  - `core::ptr::drop_in_place<serde_json::value::Value>`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `std::thread::local::panic_access_error`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`
  - `core::ptr::drop_in_place<core::result::Result<jni::wrapper::strings::java_str::JavaStr,jni::wrapper::errors::Error>>`
  - `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`
  - `core::panicking::panic_in_cleanup`
  - `alloc::sync::Arc<T,A>::drop_slow`
  - `_Unwind_Resume`
- strings referenced (4):
  - `0x19e08`: "CKEMV_NATIVEInitialize: is_contactless=, deterministic_un=, params=ckemv-android/src/lib.rsckemv_androidInvalid stringError: Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\"\u2026"
  - `0x19e63`: "ckemv_androidInvalid stringError: Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19a70`: "a Display implementation returned an error unexpectedly/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/string.rscalled `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalid\u2026"
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_next_command`
- offset: `0x442dc`  size: 1056 bytes  instr: 264
- calls (28):
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `ckemv_core::command::ApduCommand::to_bytes`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::types::KernelAction>`
  - `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`
  - `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`
  - `_Unwind_Resume`
- strings referenced (4):
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_process_response`
- offset: `0x446fc`  size: 1708 bytes  instr: 427
- calls (45):
  - `jni::wrapper::jnienv::JNIEnv::get_string`
  - `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`
  - `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`
  - `ckemv_core::response::Response::from_bytes`
  - `core::ptr::drop_in_place<ckemv_core::error::Error>`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response`
  - `alloc::fmt::format::format_inner`
  - `_<alloc::vec::Vec<T,A> as core::ops::drop::Drop>::drop`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<core::option::Option<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>>`
  - `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`
  - `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`
  - `core::ptr::drop_in_place<core::result::Result<ckemv_core::response::Response,ckemv_core::error::Error>>`
  - `_Unwind_Resume`
- strings referenced (6):
  - `0x19e85`: "Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19e70`: "Invalid stringError: Invalid APDU ResponseNotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_status`
- offset: `0x44da8`  size: 808 bytes  instr: 202
- calls (21):
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::status`
  - `alloc::fmt::format::format_inner`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`
  - `_Unwind_Resume`
- strings referenced (3):
  - `0x19e9a`: "NotInitialized\"\"fci\":\"\"gpo\":\",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_pan`
- offset: `0x450d0`  size: 2816 bytes  instr: 704
- calls (75):
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- strings referenced (3):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_atc`
- offset: `0x45bd0`  size: 2816 bytes  instr: 704
- calls (75):
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- strings referenced (3):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_arqc`
- offset: `0x466d0`  size: 2816 bytes  instr: 704
- calls (75):
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- strings referenced (3):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_aid`
- offset: `0x471d0`  size: 2816 bytes  instr: 704
- calls (75):
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::ptr::drop_in_place<alloc::vec::Vec<$LP$u8,u8,alloc::string::String$RP$>>`
- strings referenced (3):
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_android::native_get_tx_parameters`
- offset: `0x47cd0`  size: 3824 bytes  instr: 956
- calls (93):
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
  - `core::hash::BuildHasher::hash_one`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `alloc::collections::btree::map::BTreeMap<K,V,A>::insert`
  - `core::ptr::drop_in_place<serde_json::value::Value>`
  - `@0xbcfe0`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `serde_core::ser::Serializer::collect_map`
  - `_<serde_json::value::Value as core::fmt::Display>::fmt`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `_<hashbrown::raw::RawTable<T,A> as core::ops::drop::Drop>::drop`
  - `alloc::sync::Arc<T,A>::drop_slow`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `alloc::raw_vec::handle_error`
- strings referenced (7):
  - `0x19ba4`: "9F37for<kindcodeargs5F249F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19bbc`: "9F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"
  - `0x19a70`: "a Display implementation returned an error unexpectedly/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/string.rscalled `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalid\u2026"

## `ckemv_android::native_get_raw_data`
- offset: `0x48bc0`  size: 2876 bytes  instr: 719
- calls (56):
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `alloc::fmt::format::format_inner`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `alloc::str::join_generic_copy`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `@0xbcfe0`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `std::sys::sync::mutex::futex::Mutex::lock_contended`
  - `std::panicking::panic_count::is_zero_slow_path`
  - `core::result::unwrap_failed`
  - `once_cell::imp::OnceCell<T>::initialize`
  - `std::sys::sync::mutex::futex::Mutex::wake`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<alloc::vec::Vec<alloc::string::String>>`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>`
  - `core::ptr::drop_in_place<std::sync::poison::PoisonError<std::sync::poison::mutex::MutexGuard<core::option::Option<ckemv_emv_kernel::dispatcher::TransactionDispatcher>>>>`
  - `_Unwind_Resume`
- strings referenced (5):
  - `0x19eb7`: ",\"sfi\":{}\"cdol1\":\"\"cdol2\":\"_\":\""
  - `0x19af2`: "called `Result::unwrap()` on an `Err` valueErrorWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_core::command::ApduCommand::to_bytes`
- offset: `0x534a4`  size: 664 bytes  instr: 166
- calls (15):
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `alloc::raw_vec::handle_error`
  - `_<bytes::bytes_mut::BytesMut as bytes::buf::buf_mut::BufMut>::put_slice`
  - `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`
  - `core::panicking::panic_fmt`
  - `_<bytes::bytes_mut::BytesMut as core::ops::drop::Drop>::drop`
  - `core::panicking::panic_in_cleanup`
  - `_Unwind_Resume`

## `ckemv_emv_kernel::tags::get_tag_name`
- offset: `0x60308`  size: 2880 bytes  instr: 720
- strings referenced (85):
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
  - `0x20681`: "Application TemplatePAN Sequence NumberService CodeLanguage PreferenceIssuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equival\u2026"
  - `0x206a8`: "Service CodeLanguage PreferenceIssuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 DataApplication LabelAp\u2026"
  - `0x20675`: "FCI TemplateApplication TemplatePAN Sequence NumberService CodeLanguage PreferenceIssuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Tra\u2026"
  - `0x20695`: "PAN Sequence NumberService CodeLanguage PreferenceIssuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Account Number)Track 2 Equivalent DataTrack 1 Data\u2026"
  - `0x20666`: "Record TemplateFCI TemplateApplication TemplatePAN Sequence NumberService CodeLanguage PreferenceIssuer Country CodeApplication Effective DateApplication Expiration DateCardholder NamePAN (Primary Acc\u2026"
  - `0x204e2`: "FCI Issuer Discretionary DataFCI Proprietary TemplateAFL (Application File Locator)Signed Static Application Data (SSAD)Issuer Public Key RemainderIssuer Public Key CertificateCA Public Key IndexCVM L\u2026"
  - `0x20644`: "Response Message Template Format 2Record TemplateFCI TemplateApplication TemplatePAN Sequence NumberService CodeLanguage PreferenceIssuer Country CodeApplication Effective DateApplication Expiration D\u2026"
  - `0x204c3`: "Application Usage Control (AUC)FCI Issuer Discretionary DataFCI Proprietary TemplateAFL (Application File Locator)Signed Static Application Data (SSAD)Issuer Public Key RemainderIssuer Public Key Cert\u2026"
  - `0x20622`: "Response Message Template Format 1Response Message Template Format 2Record TemplateFCI TemplateApplication TemplatePAN Sequence NumberService CodeLanguage PreferenceIssuer Country CodeApplication Effe\u2026"
  - `0x204a9`: "Application Version NumberApplication Usage Control (AUC)FCI Issuer Discretionary DataFCI Proprietary TemplateAFL (Application File Locator)Signed Static Application Data (SSAD)Issuer Public Key Remai\u2026"
  - `0x205fd`: "AIP (Application Interchange Profile)Response Message Template Format 1Response Message Template Format 2Record TemplateFCI TemplateApplication TemplatePAN Sequence NumberService CodeLanguage Preferen\u2026"
  - `0x20478`: "Application Selection Registered Proprietary DataApplication Version NumberApplication Usage Control (AUC)FCI Issuer Discretionary DataFCI Proprietary TemplateAFL (Application File Locator)Signed Stat\u2026"
  - `0x205f6`: "DF NameAIP (Application Interchange Profile)Response Message Template Format 1Response Message Template Format 2Record TemplateFCI TemplateApplication TemplatePAN Sequence NumberService CodeLanguage P\u2026"
  - `0x2045c`: "Issuer Action Code - DefaultApplication Selection Registered Proprietary DataApplication Version NumberApplication Usage Control (AUC)FCI Issuer Discretionary DataFCI Proprietary TemplateAFL (Applicat\u2026"
  - `0x205d8`: "Application Priority IndicatorDF NameAIP (Application Interchange Profile)Response Message Template Format 1Response Message Template Format 2Record TemplateFCI TemplateApplication TemplatePAN Sequenc\u2026"
  - `0x20441`: "Issuer Action Code - DenialIssuer Action Code - DefaultApplication Selection Registered Proprietary DataApplication Version NumberApplication Usage Control (AUC)FCI Issuer Discretionary DataFCI Propri\u2026"
  - `0x205d3`: "CDOL1Application Priority IndicatorDF NameAIP (Application Interchange Profile)Response Message Template Format 1Response Message Template Format 2Record TemplateFCI TemplateApplication TemplatePAN Se\u2026"
  - `0x20426`: "Issuer Action Code - OnlineIssuer Action Code - DenialIssuer Action Code - DefaultApplication Selection Registered Proprietary DataApplication Version NumberApplication Usage Control (AUC)FCI Issuer D\u2026"
  - `0x205ce`: "CDOL2CDOL1Application Priority IndicatorDF NameAIP (Application Interchange Profile)Response Message Template Format 1Response Message Template Format 2Record TemplateFCI TemplateApplication TemplateP\u2026"

## `ckemv_emv_kernel::types::generate_negative_correlated_time`
- offset: `0x61538`  size: 452 bytes  instr: 113

## `_<ckemv_emv_kernel::types::TransactionContext as core::default::Default>::default`
- offset: `0x616fc`  size: 100 bytes  instr: 25
- calls (2):
  - `std::sys::thread_local::os::Storage<T>::get`
  - `std::thread::local::panic_access_error`

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_context`
- offset: `0x62590`  size: 184 bytes  instr: 46
- calls (1):
  - `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::status`
- offset: `0x62648`  size: 156 bytes  instr: 39
- calls (2):
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `alloc::raw_vec::handle_error`
- strings referenced (1):
  - `0x20961`: "Dispatcher failed before kernel activation315041592E5359532E4444463031325041592E5359532E4444463031ckemv-emv-kernel/src/dispatcher.rsSelecting PPSE/PSE ()Selecting Application AID: No supported applica\u2026"

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::get_results`
- offset: `0x626e4`  size: 372 bytes  instr: 93
- calls (6):
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `ckemv_emv_kernel::results::EmvResults::fallback_track2`
  - `@0xbcfe0`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::results::EmvResults>`
  - `_Unwind_Resume`

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::next_command`
- offset: `0x62858`  size: 1336 bytes  instr: 334
- calls (17):
  - `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`
  - `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`
  - `alloc::fmt::format::format_inner`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_<hex::error::FromHexError as core::fmt::Display>::fmt`
  - `core::result::unwrap_failed`
  - `alloc::raw_vec::handle_error`
  - `core::panicking::panic_in_cleanup`
  - `_Unwind_Resume`
- strings referenced (5):
  - `0x2098b`: "315041592E5359532E4444463031325041592E5359532E4444463031ckemv-emv-kernel/src/dispatcher.rsSelecting PPSE/PSE ()Selecting Application AID: No supported applications found on this cardA0000000031010PPSE\u2026"
  - `0x209a7`: "325041592E5359532E4444463031ckemv-emv-kernel/src/dispatcher.rsSelecting PPSE/PSE ()Selecting Application AID: No supported applications found on this cardA0000000031010PPSE selected, moving to AID sel\u2026"
  - `0x20a15`: "No supported applications found on this cardA0000000031010PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20830`: "a Display implementation returned an error unexpectedly/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/string.rscalled `Result::unwrap()` on an `Err` valueErrorInvalidHexCharactercin\u2026"
  - `0x208b2`: "called `Result::unwrap()` on an `Err` valueErrorInvalidHexCharactercindexOddLengthInvalidStringLength/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsDispatcher failed before \u2026"

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::process_response`
- offset: `0x62d90`  size: 2572 bytes  instr: 643
- calls (56):
  - `iso7816_tlv::ber::tlv::Tlv::parse_all`
  - `ckemv_emv_kernel::results::build_tlv_tree`
  - `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `alloc::fmt::format::format_inner`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `core::ptr::drop_in_place<core::option::Option<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>>`
  - `_<alloc::vec::Vec<T,A> as core::ops::drop::Drop>::drop`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse`
  - `core::ptr::drop_in_place<alloc::vec::Vec<alloc::string::String>>`
  - `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`
  - `alloc::vec::Vec<T,A>::push`
  - `_<ckemv_emv_kernel::types::TransactionContext as core::clone::Clone>::clone`
  - `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::visa::VisaKernel>`
  - `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::mchip::MastercardKernel>`
  - `@0xbcfe0`
  - `alloc::alloc::exchange_malloc`
  - `core::ptr::drop_in_place<core::option::Option<alloc::boxed::Box<dyn ckemv_emv_kernel::types::EmvKernelStrategy>>>`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::types::StepResult>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<alloc::vec::Vec<iso7816_tlv::ber::tlv::Tlv>>`
  - `_Unwind_Resume`
- strings referenced (11):
  - `0x20a41`: "A0000000031010PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20000`: "minal Country CodeAmount, Other (Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indica\u2026"
  - `0x20aa3`: "PPSE failed, falling back to default AIDAPDU Error: "
  - `0x20020`: "(Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indicator (FFI)Card Transaction Qualif\u2026"
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x20a4f`: "PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20a86`: "Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x20a15`: "No supported applications found on this cardA0000000031010PPSE selected, moving to AID selectionUnsupported AID: Dispatcher processed responsePPSE failed, falling back to default AIDAPDU Error: "
  - `0x202b8`: " CertificateApplication Currency CodePDOL (Processing Options Data Object List)Application Transaction Counter (ATC)Issuer Public Key ExponentCryptogram Information DataApplication CryptogramUpper Con\u2026"

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::extract_aids_from_ppse`
- offset: `0x6379c`  size: 292 bytes  instr: 73
- calls (11):
  - `iso7816_tlv::ber::tlv::Tlv::parse_all`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive`
  - `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`
  - `_<alloc::vec::into_iter::IntoIter<T,A> as core::ops::drop::Drop>::drop`
  - `core::ptr::drop_in_place<alloc::vec::Vec<alloc::string::String>>`
  - `_Unwind_Resume`
  - `core::panicking::panic_in_cleanup`

## `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive`
- offset: `0x638c0`  size: 280 bytes  instr: 70
- calls (6):
  - `iso7816_tlv::ber::tag::Tag::to_bytes`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `ckemv_emv_kernel::dispatcher::TransactionDispatcher::find_aids_recursive`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_Unwind_Resume`
- strings referenced (1):
  - `0x19810`: "0123456789ABCDEF\u0001"

## `_<ckemv_emv_kernel::types::TransactionContext as core::clone::Clone>::clone`
- offset: `0x639d8`  size: 148 bytes  instr: 37
- calls (1):
  - `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`

## `ckemv_emv_kernel::results::EmvResults::fallback_track2`
- offset: `0x63bec`  size: 644 bytes  instr: 161
- calls (8):
  - `core::slice::memchr::memchr_aligned`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `@0xbcfe0`
  - `core::str::slice_error_fail`
  - `alloc::raw_vec::handle_error`

## `ckemv_emv_kernel::results::build_tlv_tree`
- offset: `0x63e70`  size: 1228 bytes  instr: 307
- calls (33):
  - `iso7816_tlv::ber::tag::Tag::to_bytes`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `ckemv_emv_kernel::tags::get_tag_name`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `@0xbcfe0`
  - `ckemv_emv_kernel::results::build_tlv_tree`
  - `_<alloc::vec::Vec<T,A> as core::ops::drop::Drop>::drop`
  - `iso7816_tlv::ber::tlv::Tlv::to_vec`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `iso7816_tlv::ber::tag::Tag::is_constructed`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::types::ParsedTlv>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<alloc::vec::Vec<ckemv_emv_kernel::types::ParsedTlv>>`
  - `_Unwind_Resume`
- strings referenced (2):
  - `0x19810`: "0123456789ABCDEF\u0001"

## `ckemv_emv_kernel::results::extract_emv_data`
- offset: `0x6433c`  size: 5216 bytes  instr: 1304
- calls (83):
  - `iso7816_tlv::ber::tag::Tag::to_bytes`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `iso7816_tlv::ber::tlv::Tlv::to_vec`
  - `@0xbcfe0`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`
  - `@0xbd000`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `core::str::pattern::StrSearcher::new`
  - `iso7816_tlv::ber::tag::Tag::is_constructed`
  - `ckemv_emv_kernel::results::extract_emv_data`
- strings referenced (10):
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x19bb8`: "5F249F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19b84`: "5F349F47mut nametrue"
  - `0x19bd8`: "9F36main as 9F32Kind9F48/"
  - `0x19be4`: "9F32Kind9F48/"
  - `0x19b60`: "9F46 -> chardyn Long    u128Zero <= 5F349F47mut nametrue"
  - `0x19bec`: "9F48/"
  - `0x19b88`: "9F47mut nametrue"
  - `0x20c3b`: "FStatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/visa.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex\u2026"

## `_<ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt`
- offset: `0x6592c`  size: 104 bytes  instr: 26
- calls (1):
  - `core::fmt::Formatter::debug_struct_field2_finish`
- strings referenced (3):
  - `0x20c3c`: "StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/visa.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex:\u2026"
  - `0x20c46`: "sw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/visa.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requestin\u2026"
  - `0x20c49`: "sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/visa.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesting P\u2026"

## `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::next_command`
- offset: `0x65a04`  size: 1104 bytes  instr: 276
- calls (22):
  - `alloc::fmt::format::format_inner`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `ckemv_emv_kernel::dol::build_dol_payload`
  - `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `@0xbcfe0`
  - `alloc::alloc::handle_alloc_error`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `alloc::raw_vec::handle_error`
  - `core::panicking::panic_in_cleanup`
  - `_Unwind_Resume`
- strings referenced (4):
  - `0x20d48`: "Requesting 1st Generate AC (ARQC/TC)Selected Visa ApplicationGPO returned ARQC. Visa Fast-Path completed.Failed to parse AFL: GPO returned ARQC and no records to read. Complete.GPO successful. No reco\u2026"
  - `0x20d05`: "Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (ARQC/TC)Selected Visa ApplicationGPO returned ARQC. Visa Fast-Path completed.Failed to parse AFL: GPO ret\u2026"
  - `0x20018`: ", Other (Numeric)Amount, Authorized (Numeric)Transaction Currency CodeTerminal Verification Results (TVR)Issuer Authentication DataAuthorization Response CodeForm Factor Indicator (FFI)Card Transactio\u2026"

## `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`
- offset: `0x65e54`  size: 3940 bytes  instr: 985
- calls (68):
  - `iso7816_tlv::ber::tlv::Tlv::parse_all`
  - `ckemv_emv_kernel::results::extract_emv_data`
  - `ckemv_emv_kernel::results::build_tlv_tree`
  - `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `alloc::fmt::format::format_inner`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `@0xbcfe0`
  - `ckemv_emv_kernel::crypto::oda::verify_certificates`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::visa::VisaState>`
  - `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`
  - `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `alloc::raw_vec::handle_error`
  - `core::panicking::panic_bounds_check`
  - `_Unwind_Resume`
  - `core::ptr::drop_in_place<alloc::vec::Vec<iso7816_tlv::ber::tlv::Tlv>>`
- strings referenced (23):
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
  - `0x20cd2`: "AFL length must be a multiple of 4Invalid AFL hex: Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (ARQC/TC)Selected Visa ApplicationGPO returned ARQC. Vi\u2026"
  - `0x20df9`: "GPO successful. No records to read.GPO successful. Found  records to read.GPO successful (no AFL). Waiting for GenAC.Read record / All records read. Fast-Path ARQC already captured. Complete. All reco\u2026"
  - `0x20dc6`: "GPO returned ARQC and no records to read. Complete.GPO successful. No records to read.GPO successful. Found  records to read.GPO successful (no AFL). Waiting for GenAC.Read record / All records read. \u2026"
  - `0x20cba`: "Invalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (ARQC/TC)Selected Visa Applicat\u2026"

## `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::status`
- offset: `0x66db8`  size: 68 bytes  instr: 17

## `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_context`
- offset: `0x66dfc`  size: 152 bytes  instr: 38
- calls (1):
  - `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`

## `_<ckemv_emv_kernel::kernels::visa::VisaKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_results`
- offset: `0x66e94`  size: 3448 bytes  instr: 862
- calls (54):
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `_<alloc::vec::Vec<T,A> as core::clone::Clone>::clone`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_Unwind_Resume`

## `ckemv_emv_kernel::dol::build_dol_payload`
- offset: `0x67c88`  size: 6212 bytes  instr: 1553
- calls (118):
  - `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `alloc::fmt::format::format_inner`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_RNvCs691rhTbG0Ee_7___rustc19___rust_alloc_zeroed`
  - `core::hash::BuildHasher::hash_one`
  - `alloc::raw_vec::handle_error`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `ckemv_emv_kernel::types::generate_negative_correlated_time`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `hashbrown::map::HashMap<K,V,S,A>::insert`
  - `@0xbd000`
  - `@0xbcfe0`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
- strings referenced (5):
  - `0x19bc4`: "9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19bbc`: "9F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"
  - `0x19810`: "0123456789ABCDEF\u0001"
  - `0x19ba4`: "9F37for<kindcodeargs5F249F02Byte9F21) = 5931i128Void9F36main as 9F32Kind9F48/"

## `ckemv_emv_kernel::crypto::oda::recover_cert`
- offset: `0x695a8`  size: 2416 bytes  instr: 604
- calls (37):
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `@0xbcfe0`
  - `num_bigint::biguint::convert::from_bitwise_digits_le`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `num_bigint::biguint::BigUint::modpow`
  - `num_bigint::biguint::convert::to_bitwise_digits_le`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `@0xbcff0`
  - `alloc::fmt::format::format_inner`
  - `alloc::alloc::handle_alloc_error`
  - `alloc::raw_vec::handle_error`
  - `core::panicking::panic_bounds_check`
  - `_Unwind_Resume`
- strings referenced (1):
  - `0x21130`: "Recovered length does not match modulus lengthMissing Issuer RemainderIssuer PK Certificate Hash mismatchInvalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID h\u2026"

## `ckemv_emv_kernel::crypto::oda::verify_issuer_public_key`
- offset: `0x69f18`  size: 1728 bytes  instr: 432
- calls (36):
  - `ckemv_emv_kernel::crypto::oda::recover_cert`
  - `@0xbcfe0`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `sha1::compress::compress`
  - `@0xbd060`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `core::slice::index::slice_index_order_fail`
  - `core::slice::index::slice_end_index_len_fail`
  - `core::panicking::panic_bounds_check`
  - `alloc::raw_vec::handle_error`
  - `_Unwind_Resume`
- strings referenced (3):
  - `0x21199`: "Invalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK \u2026"
  - `0x21176`: "Issuer PK Certificate Hash mismatchInvalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Iss\u2026"
  - `0x2115e`: "Missing Issuer RemainderIssuer PK Certificate Hash mismatchInvalid Issuer Cert formatMissing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Pu\u2026"

## `ckemv_emv_kernel::crypto::oda::verify_icc_public_key`
- offset: `0x6a5d8`  size: 1760 bytes  instr: 440
- calls (38):
  - `ckemv_emv_kernel::crypto::oda::recover_cert`
  - `@0xbcfe0`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `sha1::compress::compress`
  - `@0xbd060`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `core::slice::index::slice_index_order_fail`
  - `core::slice::index::slice_end_index_len_fail`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `core::panicking::panic_bounds_check`
  - `alloc::raw_vec::handle_error`
  - `_Unwind_Resume`
- strings referenced (3):
  - `0x211c8`: "Invalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK Cert hexAID too short\u2026"
  - `0x1a3c8`: "ICC PK Certificate Hash mismatchindex out of bounds: the len is "
  - `0x211b3`: "Missing ICC RemainderInvalid ICC Cert formatNo AID foundInvalid AID hexNo CA PK Index foundInvalid CA PK IndexCA Public Key not foundNo Issuer PK Cert foundInvalid Issuer PK Cert hex030Invalid ICC PK \u2026"

## `ckemv_emv_kernel::crypto::oda::build_static_data`
- offset: `0x6acb8`  size: 1392 bytes  instr: 348
- calls (18):
  - `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `@0xbcfe0`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `_Unwind_Resume`

## `ckemv_emv_kernel::crypto::oda::verify_certificates`
- offset: `0x6b228`  size: 2624 bytes  instr: 656
- calls (56):
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`
  - `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::crypto::PublicKey>`
  - `alloc::fmt::format::format_inner`
  - `ckemv_emv_kernel::crypto::oda::verify_issuer_public_key`
  - `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}`
  - `ckemv_emv_kernel::crypto::oda::build_static_data`
  - `ckemv_emv_kernel::crypto::oda::verify_icc_public_key`
  - `alloc::raw_vec::handle_error`
  - `_Unwind_Resume`
- strings referenced (11):
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

## `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}`
- offset: `0x6bc68`  size: 136 bytes  instr: 34
- calls (4):
  - `alloc::fmt::format::format_inner`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_Unwind_Resume`

## `ckemv_emv_kernel::crypto::oda::verify_certificates::_{{closure}}`
- offset: `0x6bcf0`  size: 136 bytes  instr: 34
- calls (4):
  - `alloc::fmt::format::format_inner`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_Unwind_Resume`

## `_<ckemv_core::response::status::StatusWord as core::fmt::Debug>::fmt`
- offset: `0x6bf08`  size: 104 bytes  instr: 26
- calls (1):
  - `core::fmt::Formatter::debug_struct_field2_finish`
- strings referenced (3):
  - `0x212da`: "StatusWordsw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex\u2026"
  - `0x212e4`: "sw1sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesti\u2026"
  - `0x212e7`: "sw2/rustc/6b00bc3880198600130e1cf62b8f8a93494488cc/library/alloc/src/slice.rsckemv-emv-kernel/src/kernels/mchip.rsInvalid AFL record rangeAFL length must be a multiple of 4Invalid AFL hex: Requesting \u2026"

## `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::next_command`
- offset: `0x6bfe0`  size: 1784 bytes  instr: 446
- calls (36):
  - `alloc::fmt::format::format_inner`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `ckemv_emv_kernel::dol::build_dol_payload`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `@0xbcfe0`
  - `_<bytes::bytes::Bytes as core::convert::From<alloc::vec::Vec<u8>>>::from`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `hashbrown::map::HashMap<K,V,S,A>::insert`
  - `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`
  - `alloc::alloc::handle_alloc_error`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
  - `alloc::raw_vec::handle_error`
  - `core::panicking::panic_in_cleanup`
  - `_Unwind_Resume`
- strings referenced (4):
  - `0x213a4`: "Requesting Processing Options (GPO)Reading Record (SFI: , Record: )Requesting 1st Generate AC (TC)Requesting 2nd Generate AC (TC/AAC)Selected Mastercard ApplicationFailed to parse AFL: GPO successful.\u2026"
  - `0x213e7`: "Requesting 1st Generate AC (TC)Requesting 2nd Generate AC (TC/AAC)Selected Mastercard ApplicationFailed to parse AFL: GPO successful. No records to read.GPO successful. Found  records to read.GPO succ\u2026"
  - `0x19bcc`: "5931i128Void9F36main as 9F32Kind9F48/"
  - `0x21406`: "Requesting 2nd Generate AC (TC/AAC)Selected Mastercard ApplicationFailed to parse AFL: GPO successful. No records to read.GPO successful. Found  records to read.GPO successful. No AFL returned. Procee\u2026"

## `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::process_response`
- offset: `0x6c6d8`  size: 4420 bytes  instr: 1105
- calls (81):
  - `iso7816_tlv::ber::tlv::Tlv::parse_all`
  - `ckemv_emv_kernel::results::extract_emv_data`
  - `ckemv_emv_kernel::results::build_tlv_tree`
  - `core::ptr::drop_in_place<iso7816_tlv::ber::tlv::Tlv>`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_<alloc::string::String as core::iter::traits::collect::FromIterator<char>>::from_iter`
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `_<alloc::vec::Vec<u8> as hex::FromHex>::from_hex`
  - `_<T as alloc::slice::<impl $u5b$T$u5d$>::to_vec_in::ConvertVec>::to_vec`
  - `core::ptr::drop_in_place<ckemv_emv_kernel::kernels::mchip::MChipState>`
  - `alloc::fmt::format::format_inner`
  - `alloc::raw_vec::RawVec<T,A>::grow_one`
  - `ckemv_emv_kernel::crypto::oda::verify_certificates`
  - `_<alloc::vec::Vec<T> as alloc::vec::spec_from_iter::SpecFromIter<T,I>>::from_iter`
  - `alloc::raw_vec::RawVecInner<A>::reserve::do_reserve_and_handle`
- strings referenced (16):
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

## `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::status`
- offset: `0x6d81c`  size: 68 bytes  instr: 17

## `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_context`
- offset: `0x6d860`  size: 152 bytes  instr: 38
- calls (1):
  - `_<hashbrown::raw::RawTable<T,A> as core::clone::Clone>::clone`

## `_<ckemv_emv_kernel::kernels::mchip::MastercardKernel as ckemv_emv_kernel::types::EmvKernelStrategy>::get_results`
- offset: `0x6d8f8`  size: 3448 bytes  instr: 862
- calls (54):
  - `_<alloc::string::String as core::clone::Clone>::clone`
  - `_<alloc::vec::Vec<T,A> as core::clone::Clone>::clone`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `_Unwind_Resume`

## `ckemv_core::response::Response::from_bytes`
- offset: `0x7a018`  size: 184 bytes  instr: 46
- calls (1):
  - `bytes::bytes::Bytes::copy_from_slice`
- strings referenced (1):
  - `0x235df`: "Response too short: must be at least 2 bytesInvalid character  at position Odd number of digitsInvalid string length/Users/arthur/.cargo/registry/src/index.crates.io-1949cf8c6b5b557f/iso7816-tlv-0.4.4\u2026"

