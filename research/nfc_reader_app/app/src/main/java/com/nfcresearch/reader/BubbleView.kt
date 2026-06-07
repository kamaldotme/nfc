package com.nfcresearch.reader

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import kotlin.math.sqrt
import kotlin.random.Random

/**
 * Animated background — 16 coloured dots with connecting lines between nearby pairs.
 * Wall-bounce physics refreshed every ~16 ms.
 */
class BubbleView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : View(context, attrs) {

    private data class Dot(
        var x: Float, var y: Float,
        var vx: Float, var vy: Float,
        val color: Int
    )

    private val dots = ArrayList<Dot>(16)

    private val dotPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private val linePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style       = Paint.Style.STROKE
        strokeWidth = 1.2f
    }

    private val COLORS = intArrayOf(
        0xFF4A9EFF.toInt(),
        0xFF7B5EA7.toInt(),
        0xFF3EC9A7.toInt(),
        0xFFFF6B6B.toInt(),
        0xFFFFD166.toInt(),
        0xFF06D6A0.toInt(),
        0xFF5E60CE.toInt(),
        0xFFFF9F1C.toInt()
    )

    private val LINE_THRESHOLD = 220f   // px — connect dots within this distance
    private val DOT_RADIUS     = 5f
    private var lastFrame      = 0L
    private val rng            = Random.Default

    override fun onSizeChanged(w: Int, h: Int, ow: Int, oh: Int) {
        if (w == 0 || h == 0) return
        dots.clear()
        repeat(16) {
            dots += Dot(
                x     = rng.nextFloat() * w,
                y     = rng.nextFloat() * h,
                vx    = (rng.nextFloat() - 0.5f) * 1.4f,
                vy    = (rng.nextFloat() - 0.5f) * 1.4f,
                color = COLORS[it % COLORS.size]
            )
        }
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(0xFF121212.toInt())

        val now = System.currentTimeMillis()
        val dt  = if (lastFrame == 0L) 1f else ((now - lastFrame) / 16f).coerceIn(0.5f, 3f)
        lastFrame = now

        val w = width.toFloat()
        val h = height.toFloat()

        for (d in dots) {
            d.x += d.vx * dt
            d.y += d.vy * dt
            if (d.x < DOT_RADIUS || d.x > w - DOT_RADIUS) {
                d.vx = -d.vx
                d.x  = d.x.coerceIn(DOT_RADIUS, w - DOT_RADIUS)
            }
            if (d.y < DOT_RADIUS || d.y > h - DOT_RADIUS) {
                d.vy = -d.vy
                d.y  = d.y.coerceIn(DOT_RADIUS, h - DOT_RADIUS)
            }
        }

        // Connecting lines
        for (i in dots.indices) {
            for (j in i + 1 until dots.size) {
                val dx   = dots[i].x - dots[j].x
                val dy   = dots[i].y - dots[j].y
                val dist = sqrt(dx * dx + dy * dy)
                if (dist < LINE_THRESHOLD) {
                    val alpha = ((1f - dist / LINE_THRESHOLD) * 90).toInt()
                    linePaint.color = (dots[i].color and 0x00FFFFFF) or (alpha shl 24)
                    canvas.drawLine(dots[i].x, dots[i].y, dots[j].x, dots[j].y, linePaint)
                }
            }
        }

        // Dots
        for (d in dots) {
            dotPaint.color = d.color
            canvas.drawCircle(d.x, d.y, DOT_RADIUS, dotPaint)
        }

        postInvalidateOnAnimation()
    }

    /** Jolt dots on NFC tap — visual feedback matching original green flash. */
    fun burst(count: Int = 12, tint: Int? = null) {
        val n = minOf(count, dots.size)
        for (i in 0 until n) {
            dots[i].vx = (rng.nextFloat() - 0.5f) * 5f
            dots[i].vy = (rng.nextFloat() - 0.5f) * 5f
        }
        invalidate()
    }
}
