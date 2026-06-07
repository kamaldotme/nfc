// orig: B2/p.java   (R8-renamed suspend lambda)
// Runs on Dispatchers.Main. Hides the green progress bar.

package xyz.happify.ckemv.ui

import android.view.View
import xyz.happify.ckemv.MainActivity

class HideProgressBar(private val activity: MainActivity) {
    suspend operator fun invoke() {
        activity.progressBar.visibility = View.INVISIBLE
    }
}
