package j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final y f3454a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0227c f3455b;

    /* JADX WARN: Type inference failed for: r0v1, types: [j0.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [j0.y, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3454a = new Object();
        } else {
            f3454a = new Object();
        }
        f3455b = new C0227c(5, Float.class, "translationAlpha");
        new C0227c(6, Rect.class, "clipBounds");
    }

    public static void a(View view, int i3, int i4, int i5, int i6) {
        f3454a.p0(view, i3, i4, i5, i6);
    }
}
