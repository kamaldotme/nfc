// orig: B2/v.java   (R8-renamed data class)
// Pure data record used by DecoyView — one bouncing dot in the constellation animation.

package xyz.happify.ckemv.ui

data class AnimationDot(
    var x:      Float,   // current X position (px)
    var y:      Float,   // current Y position (px)
    var radius: Float,   // dot radius (px)
    var vx:     Float,   // velocity X (px per frame)
    var vy:     Float,   // velocity Y (px per frame)
    var color:  Int      // ARGB packed color
)
