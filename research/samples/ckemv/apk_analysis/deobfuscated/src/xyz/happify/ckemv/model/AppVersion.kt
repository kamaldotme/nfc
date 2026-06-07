// orig: xyz/happify/ckemv/AppVersion.java   (kept-name; field names pinned by Gson)
//
// What the C2 says the latest published build is. Returned inside MeResponse.
// Compared against the hard-coded internal version (1.7) in ConfigUpdateLoop.

package xyz.happify.ckemv.model

data class AppVersion(
    val major: Int,
    val minor: Int,
    val hash:  String        // build commit hash; informational only
)
