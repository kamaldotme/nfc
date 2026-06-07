// orig: B2/r.java   (R8-renamed suspend lambda)
// Identical to UploadAckFlash — fired by UploadLoop (the 10-second loop)
// after a successful upload. Both show "✅" centered Toast.

package xyz.happify.ckemv.ui

import android.view.Gravity
import android.widget.Toast
import xyz.happify.ckemv.MainActivity

class UploadAckFlashLoop(private val activity: MainActivity) {
    suspend operator fun invoke() {
        Toast.makeText(activity, "✅", Toast.LENGTH_SHORT).apply {
            setGravity(Gravity.CENTER, 0, 0)
            show()
        }
    }
}
