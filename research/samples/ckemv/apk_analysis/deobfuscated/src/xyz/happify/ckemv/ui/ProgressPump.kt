// orig: B2/l.java   (R8-renamed suspend lambda)
//
// Runs on Dispatchers.Main. Collects from MainActivity.progressFlow (a
// MutableStateFlow<Int>) and forwards each emitted value into
// ProgressPumpStep, which calls progressBar.setProgress(value).
//
// This decoupling is necessary because NfcTapHandler runs on Dispatchers.IO
// and cannot touch views directly.

package xyz.happify.ckemv.ui

import kotlinx.coroutines.flow.collect
import xyz.happify.ckemv.MainActivity

class ProgressPump(private val activity: MainActivity) {
    suspend operator fun invoke() {
        activity.progressFlow.collect { value ->
            ProgressPumpStep(activity)(value)
        }
    }
}
