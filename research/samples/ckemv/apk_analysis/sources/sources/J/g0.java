package J;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0006e f424a;

    /* renamed from: b, reason: collision with root package name */
    public y0 f425b;

    public g0(View view, C0006e c0006e) {
        y0 y0Var;
        this.f424a = c0006e;
        WeakHashMap weakHashMap = T.f402a;
        y0 a3 = I.a(view);
        if (a3 != null) {
            int i3 = Build.VERSION.SDK_INT;
            y0Var = (i3 >= 30 ? new p0(a3) : i3 >= 29 ? new o0(a3) : new n0(a3)).b();
        } else {
            y0Var = null;
        }
        this.f425b = y0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 w0Var;
        if (!view.isLaidOut()) {
            this.f425b = y0.g(view, windowInsets);
            return h0.i(view, windowInsets);
        }
        y0 g = y0.g(view, windowInsets);
        if (this.f425b == null) {
            WeakHashMap weakHashMap = T.f402a;
            this.f425b = I.a(view);
        }
        if (this.f425b == null) {
            this.f425b = g;
            return h0.i(view, windowInsets);
        }
        C0006e j3 = h0.j(view);
        if (j3 != null && Objects.equals((WindowInsets) j3.c, windowInsets)) {
            return h0.i(view, windowInsets);
        }
        y0 y0Var = this.f425b;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            w0Var = g.f470a;
            if (i3 > 256) {
                break;
            }
            if (!w0Var.f(i3).equals(y0Var.f470a.f(i3))) {
                i4 |= i3;
            }
            i3 <<= 1;
        }
        if (i4 == 0) {
            return h0.i(view, windowInsets);
        }
        y0 y0Var2 = this.f425b;
        l0 l0Var = new l0(i4, (i4 & 8) != 0 ? w0Var.f(8).f4d > y0Var2.f470a.f(8).f4d ? h0.f426e : h0.f427f : h0.g, 160L);
        l0Var.f436a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(l0Var.f436a.a());
        A.d f3 = w0Var.f(i4);
        A.d f4 = y0Var2.f470a.f(i4);
        int min = Math.min(f3.f2a, f4.f2a);
        int i5 = f3.f3b;
        int i6 = f4.f3b;
        int min2 = Math.min(i5, i6);
        int i7 = f3.c;
        int i8 = f4.c;
        int min3 = Math.min(i7, i8);
        int i9 = f3.f4d;
        int i10 = i4;
        int i11 = f4.f4d;
        v0.e eVar = new v0.e(A.d.b(min, min2, min3, Math.min(i9, i11)), 2, A.d.b(Math.max(f3.f2a, f4.f2a), Math.max(i5, i6), Math.max(i7, i8), Math.max(i9, i11)));
        h0.f(view, windowInsets, false);
        duration.addUpdateListener(new f0(l0Var, g, y0Var2, i10, view));
        duration.addListener(new Z(l0Var, view, 1));
        ViewTreeObserverOnPreDrawListenerC0020t.a(view, new G.m(view, l0Var, eVar, duration));
        this.f425b = g;
        return h0.i(view, windowInsets);
    }
}
