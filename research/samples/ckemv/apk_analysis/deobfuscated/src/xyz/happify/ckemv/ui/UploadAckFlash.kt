// orig: B2/n.java   (R8-renamed suspend lambda)
// Runs on Dispatchers.Main. Fired by PostTapUploader after a successful upload.
// Shows a centered "✅" Toast for ~2 s — the only user-visible feedback for a
// successful harvest + upload cycle.

package xyz.happify.ckemv.ui

import android.view.Gravity
import android.widget.Toast
import xyz.happify.ckemv.MainActivity

class UploadAckFlash(private val activity: MainActivity) {
    suspend operator fun invoke() {
        Toast.makeText(activity, "✅", Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.CENTER, 0, 0)
            show()
        }
    }
}
