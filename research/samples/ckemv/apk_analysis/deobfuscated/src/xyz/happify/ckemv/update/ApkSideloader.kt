// orig: B2/h.java   (R8-renamed suspend lambda)
//
// Runs on Dispatchers.Main (startActivity must be on the UI thread).
// Takes the downloaded update_v{x}.apk and fires ACTION_VIEW against its
// own FileProvider URI — that's how a self-updating app on Android 7+
// triggers the standard "Install unknown apps?" prompt for an APK in its
// own private storage.
//
// Combined with REQUEST_INSTALL_PACKAGES in the manifest, this is a
// one-tap path for the user to accept replacement of the running app.

package xyz.happify.ckemv.update

import android.content.Intent
import androidx.core.content.FileProvider
import xyz.happify.ckemv.MainActivity
import java.io.File

class ApkSideloader(
    private val activity: MainActivity,
    private val apkFile:  File
) {
    suspend operator fun invoke() {
        val authority = activity.packageName + ".fileprovider"
        val uri = FileProvider.getUriForFile(activity, authority, apkFile)
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, "application/vnd.android.package-archive")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_GRANT_READ_URI_PERMISSION
            //         268435456                          1            -> 268435457 = 0x10000001
        }
        activity.startActivity(intent)
    }
}
