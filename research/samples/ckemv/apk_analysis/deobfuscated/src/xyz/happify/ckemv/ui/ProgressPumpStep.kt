// orig: B2/k.java   (R8-renamed FlowCollector)
// Receives a single progress value and applies it to the progress bar.

package xyz.happify.ckemv.ui

import xyz.happify.ckemv.MainActivity

class ProgressPumpStep(private val activity: MainActivity) {
    operator fun invoke(value: Int) {
        activity.progressBar.progress = value
    }
}
