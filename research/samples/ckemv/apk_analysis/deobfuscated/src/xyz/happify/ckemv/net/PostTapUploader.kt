// orig: B2/o.java   (R8-renamed suspend lambda)
//
// Single-shot uploader fired at the end of NfcTapHandler. Same body as one
// iteration of UploadLoop, minus the loop. If this succeeds, the slow loop
// finds nothing to upload on its next tick. If it fails (no network at the
// moment of the tap), UploadLoop will retry.

package xyz.happify.ckemv.net

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import xyz.happify.ckemv.MainActivity
import xyz.happify.ckemv.jni.Reporter
import xyz.happify.ckemv.model.CardRecord
import xyz.happify.ckemv.nfc.toUploadJson
import xyz.happify.ckemv.ui.UploadAckFlash

class PostTapUploader(
    private val card:    CardRecord,
    private val apiKey:  String,
    private val activity: MainActivity,
    private val cardId:  Long
) {
    suspend operator fun invoke() {
        val body = card.toUploadJson().toString()
        val resp = Reporter.uploadHarvestData(body, apiKey, C2.BASE_URL)
        if ("Success" in resp) {
            activity.dbHelper.deleteCard(cardId)
            activity.dbHelper.writableDatabase.execSQL(
                "UPDATE stats SET total_scans = total_scans + 1 WHERE id = 1"
            )
            withContext(Dispatchers.Main) { UploadAckFlash(activity)() }
        }
    }
}
