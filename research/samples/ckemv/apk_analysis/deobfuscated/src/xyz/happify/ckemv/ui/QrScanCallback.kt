// orig: B2/b.java   (R8-renamed ActivityResultCallback)
//
// Receives the result from ZXing's CaptureActivity (QR scanner).
// If a non-null string was decoded, writes it directly into stats.api_key.
// This is the QR-scan path for provisioning an API key onto the device.
// (The other path is the paste-key AlertDialog inside MainActivity.)
//
// The class also contains a SupportSQLiteOpenHelper.Factory implementation
// used internally by Room/WorkManager — that is not operator-authored code;
// it's an R8 artefact from sharing the same class slot.

package xyz.happify.ckemv.ui

import android.content.ContentValues
import androidx.activity.result.ActivityResultCallback
import com.journeyapps.barcodescanner.ScanIntentResult
import xyz.happify.ckemv.MainActivity

class QrScanCallback(private val activity: MainActivity) :
    ActivityResultCallback<ScanIntentResult> {

    override fun onActivityResult(result: ScanIntentResult) {
        val decoded = result.contents ?: return     // null = scan cancelled
        val db = activity.dbHelper.writableDatabase
        val cv = ContentValues().apply { put("api_key", decoded) }
        db.update("stats", cv, "id = 1", null)
    }
}
