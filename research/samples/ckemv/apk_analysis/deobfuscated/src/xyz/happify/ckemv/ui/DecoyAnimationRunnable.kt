// orig: B2/u.java case 0   (R8 fused many Runnables into u; only case 0 is operator-authored)
//
// Runs on a background Thread (started in DecoyView constructor).
// Updates dot positions at ~60 FPS. Bounces off view edges.
// Stops when DecoyView.animating becomes false (view detached).

package xyz.happify.ckemv.ui

class DecoyAnimationRunnable(private val view: DecoyView) : Runnable {
    override fun run() {
        while (view.animating) {
            for (dot in view.dots) {
                dot.x += dot.vx
                dot.y += dot.vy
                // Bounce off left / right edge (accounting for radius)
                if (dot.x - dot.radius < 0 || dot.x + dot.radius > view.width)  dot.vx *= -1f
                // Bounce off top / bottom edge
                if (dot.y - dot.radius < 0 || dot.y + dot.radius > view.height) dot.vy *= -1f
            }
            view.postInvalidate()
            Thread.sleep(16)   // ~60 FPS
        }
    }
}
