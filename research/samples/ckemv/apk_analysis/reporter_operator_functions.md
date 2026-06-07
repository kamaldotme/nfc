# Operator-authored functions in reporter

Total: 3

## `ckemv_reporter::native_upload_harvest_data`
- offset: `0xde7a4`  size: 3312 bytes  instr: 828
- calls (76):
  - `jni::wrapper::jnienv::JNIEnv::get_string`
  - `obfstr::xref::inner`
  - `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `serde_json::de::from_trait`
  - `alloc::fmt::format::format_inner`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `core::ptr::drop_in_place<serde_json::error::Error>`
  - `ureq::post`
  - `ureq::request::Request::set`
  - `ureq::request::Request::send_json`
  - `@0x22a990`
  - `ureq::response::Response::into_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `core::ptr::drop_in_place<ureq::error::Error>`
  - `core::result::unwrap_failed`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<std::io::error::Error>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<ureq::request::Request>`
  - `core::ptr::drop_in_place<core::result::Result<jni::wrapper::strings::java_str::JavaStr,jni::wrapper::errors::Error>>`
  - `core::ptr::drop_in_place<serde_json::value::Value>`
- strings referenced (3):
  - `0x2b254`: "called `Result::unwrap()` on an `Err` valueWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_reporter::native_fetch_cves`
- offset: `0xdf494`  size: 1880 bytes  instr: 470
- calls (49):
  - `jni::wrapper::jnienv::JNIEnv::get_string`
  - `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `obfstr::xref::inner`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `alloc::fmt::format::format_inner`
  - `ureq::get`
  - `ureq::request::Request::set`
  - `ureq::request::Request::call`
  - `@0x22a990`
  - `ureq::response::Response::into_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `core::ptr::drop_in_place<ureq::error::Error>`
  - `core::result::unwrap_failed`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<std::io::error::Error>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<ureq::request::Request>`
  - `_Unwind_Resume`
- strings referenced (2):
  - `0x2b254`: "called `Result::unwrap()` on an `Err` valueWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

## `ckemv_reporter::native_fetch_report`
- offset: `0xdfbec`  size: 1892 bytes  instr: 473
- calls (49):
  - `jni::wrapper::jnienv::JNIEnv::get_string`
  - `jni::wrapper::strings::java_str::_<impl core::convert::From<jni::wrapper::strings::java_str::JavaStr> for alloc::string::String>::from`
  - `core::ptr::drop_in_place<jni::wrapper::errors::Error>`
  - `obfstr::xref::inner`
  - `_RNvCs691rhTbG0Ee_7___rustc12___rust_alloc`
  - `alloc::fmt::format::format_inner`
  - `ureq::get`
  - `ureq::request::Request::set`
  - `ureq::request::Request::call`
  - `@0x22a990`
  - `ureq::response::Response::into_string`
  - `_RNvCs691rhTbG0Ee_7___rustc14___rust_dealloc`
  - `jni::wrapper::jnienv::JNIEnv::new_string`
  - `core::ptr::drop_in_place<ureq::error::Error>`
  - `core::result::unwrap_failed`
  - `alloc::raw_vec::handle_error`
  - `core::ptr::drop_in_place<std::io::error::Error>`
  - `core::panicking::panic_in_cleanup`
  - `core::ptr::drop_in_place<ureq::request::Request>`
  - `_Unwind_Resume`
- strings referenced (2):
  - `0x2b254`: "called `Result::unwrap()` on an `Err` valueWrongJValueTypeInvalidCtorReturnInvalidArgListMethodNotFound"

