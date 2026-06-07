package J;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f469b;

    /* renamed from: a, reason: collision with root package name */
    public final w0 f470a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f469b = v0.f464q;
        } else {
            f469b = w0.f465b;
        }
    }

    public y0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f470a = new v0(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f470a = new u0(this, windowInsets);
        } else if (i3 >= 28) {
            this.f470a = new t0(this, windowInsets);
        } else {
            this.f470a = new s0(this, windowInsets);
        }
    }

    public static A.d e(A.d dVar, int i3, int i4, int i5, int i6) {
        int max = Math.max(0, dVar.f2a - i3);
        int max2 = Math.max(0, dVar.f3b - i4);
        int max3 = Math.max(0, dVar.c - i5);
        int max4 = Math.max(0, dVar.f4d - i6);
        return (max == i3 && max2 == i4 && max3 == i5 && max4 == i6) ? dVar : A.d.b(max, max2, max3, max4);
    }

    public static y0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        y0 y0Var = new y0(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = T.f402a;
            if (E.b(view)) {
                y0 a3 = I.a(view);
                w0 w0Var = y0Var.f470a;
                w0Var.p(a3);
                w0Var.d(view.getRootView());
            }
        }
        return y0Var;
    }

    public final int a() {
        return this.f470a.j().f4d;
    }

    public final int b() {
        return this.f470a.j().f2a;
    }

    public final int c() {
        return this.f470a.j().c;
    }

    public final int d() {
        return this.f470a.j().f3b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        return I.a.a(this.f470a, ((y0) obj).f470a);
    }

    public final WindowInsets f() {
        w0 w0Var = this.f470a;
        if (w0Var instanceof r0) {
            return ((r0) w0Var).c;
        }
        return null;
    }

    public final int hashCode() {
        w0 w0Var = this.f470a;
        if (w0Var == null) {
            return 0;
        }
        return w0Var.hashCode();
    }

    public y0() {
        this.f470a = new w0(this);
    }
}
