package xyz.happify.ckemv

/**
 * JNI bridge to `libckemv_reporter.so` (Rust ureq+rustls+ring, ~3 MB).
 *
 * All three calls are blocking HTTP — caller (always a coroutine
 * scope under `Dispatchers.IO`) treats them as suspend-like.
 *
 * `uploadHarvestData` is the workhorse — called by [UploadLoop] every
 * 10 s and by [ImmediateUploader] right after a successful tap.
 * Success is signalled by the response body containing the substring
 * "Success".
 *
 * `fetchCves` is called by [ConfigRefreshLoop] every 60 s — returns a
 * `MeResponse` JSON.
 *
 * `fetchReport` is declared but not called anywhere on the device
 * side; presumably for an operator-side debug tool.
 *
 * The reporter binary statically links `rustls 0.23.37` (full Mozilla
 * CA bundle, no pinning) and `ring 0.17.14`. UA is `ureq/2.12.1`.
 */
object Reporter {

    init {
        System.loadLibrary("ckemv_reporter")
    }

    external fun uploadHarvestData(json: String, apiKey: String, url: String): String
    external fun fetchCves(apiKey: String, url: String): String
    external fun fetchReport(apiKey: String, url: String): String
}
