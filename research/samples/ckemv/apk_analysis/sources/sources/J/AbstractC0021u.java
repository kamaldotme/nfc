package J;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: J.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0021u {
    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i3, Interpolator interpolator, long j3) {
        return new WindowInsetsAnimation(i3, interpolator, j3);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void m() {
    }
}
