// orig: xyz/happify/ckemv/MeResponse.java   (kept-name; field names pinned by Gson)
//
// Top-level JSON returned by GET /me. The whole scenario set is replaced
// wholesale every time this is fetched. `latest_version`, when newer than
// the build's hard-coded 1.7, triggers the self-updater.

package xyz.happify.ckemv.model

data class MeResponse(
    val name: String,                        // operator/collector display name (logging only)
    val cves: List<CveConfig>,               // fresh scenario list
    val latest_version: AppVersion?          // null = no update advertised
)
