package J;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: J.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0011j {
    public static void a(int i3, int i4, int i5, Rect rect, int i6, int i7, Rect rect2, int i8) {
        Gravity.apply(i3, i4, i5, rect, i6, i7, rect2, i8);
    }

    public static void b(int i3, int i4, int i5, Rect rect, Rect rect2, int i6) {
        Gravity.apply(i3, i4, i5, rect, rect2, i6);
    }

    public static void c(int i3, Rect rect, Rect rect2, int i4) {
        Gravity.applyDisplay(i3, rect, rect2, i4);
    }
}
