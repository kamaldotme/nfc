// orig: B2/m.java   (R8-renamed suspend lambda)
// Runs on Dispatchers.Main. Makes the green progress bar visible.

package xyz.happify.ckemv.ui

import android.view.View
import xyz.happify.ckemv.MainActivity

class ShowProgressBar(private val activity: MainActivity) {
    suspend operator fun invoke() {
        activity.progressBar.visibility = View.VISIBLE
    }
}
