package xyz.happify.ckemv

/**
 * Wire shape of `GET https://tqqemv.xyz/me`. Parsed with Gson in
 * [ConfigRefreshLoop].
 */
data class MeResponse(
    val name: String,                 // operator/collector display name
    val cves: List<CveConfig>,        // scenarios to play against every tap
    val latest_version: AppVersion,   // for the self-updater check
)
