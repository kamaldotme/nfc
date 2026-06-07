// (synthesised) — collects every constant the operator wrote as a string
// literal at multiple call sites. R8 inlined them; recovering them as one
// `object` is the cleanest reading.

package xyz.happify.ckemv.net

object C2 {
    /** Hard-coded C2 host. Appears as a string literal at five call sites:
     *  SyncWorker, UploadLoop, ConfigUpdateLoop, PostTapUploader, MainActivity.w (self-updater).
     *  Changing it requires a new APK. */
    const val BASE_URL = "https://tqqemv.xyz"
}
