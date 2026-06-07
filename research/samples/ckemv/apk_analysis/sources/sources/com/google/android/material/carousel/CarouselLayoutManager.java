package com.google.android.material.carousel;

import A1.m;
import H0.a;
import H0.b;
import H0.c;
import H0.d;
import U0.e;
import Z.H;
import Z.I;
import Z.N;
import Z.S;
import Z.T;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends H implements S {

    /* renamed from: p, reason: collision with root package name */
    public int f2354p;

    /* renamed from: q, reason: collision with root package name */
    public m f2355q;

    public CarouselLayoutManager() {
        new b();
        i0();
        B0(0);
    }

    public static e x0(List list, float f3, boolean z3) {
        float f4 = Float.MAX_VALUE;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((d) list.get(i7)).getClass();
            float abs = Math.abs(0.0f - f3);
            if (0.0f <= f3 && abs <= f4) {
                i3 = i7;
                f4 = abs;
            }
            if (0.0f > f3 && abs <= f6) {
                i5 = i7;
                f6 = abs;
            }
            if (0.0f <= f7) {
                f7 = 0.0f;
                i4 = i7;
            }
            if (0.0f > f5) {
                f5 = 0.0f;
                i6 = i7;
            }
        }
        if (i3 == -1) {
            i3 = i4;
        }
        if (i5 == -1) {
            i5 = i6;
        }
        return new e((d) list.get(i3), (d) list.get(i5));
    }

    public final int A0(int i3, N n3, T t3) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        int i4 = this.f2354p;
        int i5 = i4 + i3;
        if (i5 < 0 || i5 > 0) {
            i3 = 0 - i4;
        }
        this.f2354p = i4 + i3;
        C0();
        throw null;
    }

    public final void B0(int i3) {
        c cVar;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(X.d.f("invalid orientation:", i3));
        }
        c(null);
        m mVar = this.f2355q;
        if (mVar == null || i3 != mVar.f56a) {
            if (i3 == 0) {
                cVar = new c(this, 1);
            } else {
                if (i3 != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.f2355q = cVar;
            i0();
        }
    }

    public final void C0() {
        z0();
        throw null;
    }

    @Override // Z.H
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(H.F(u(0)));
            accessibilityEvent.setToIndex(H.F(u(v() - 1)));
        }
    }

    @Override // Z.H
    public final void Y(N n3, T t3) {
        if (t3.b() <= 0) {
            d0(n3);
        } else {
            z0();
            View view = n3.i(0, Long.MAX_VALUE).f1205a;
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // Z.H
    public final void Z(T t3) {
        if (v() == 0) {
            return;
        }
        H.F(u(0));
    }

    @Override // Z.S
    public final PointF a(int i3) {
        return null;
    }

    @Override // Z.H
    public final boolean d() {
        return y0();
    }

    @Override // Z.H
    public final boolean e() {
        return !y0();
    }

    @Override // Z.H
    public final boolean h0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        return false;
    }

    @Override // Z.H
    public final int j(T t3) {
        throw null;
    }

    @Override // Z.H
    public final int j0(int i3, N n3, T t3) {
        if (!y0()) {
            return 0;
        }
        A0(i3, n3, t3);
        return 0;
    }

    @Override // Z.H
    public final int k(T t3) {
        return this.f2354p;
    }

    @Override // Z.H
    public final void k0(int i3) {
    }

    @Override // Z.H
    public final int l(T t3) {
        return 0 - 0;
    }

    @Override // Z.H
    public final int l0(int i3, N n3, T t3) {
        if (!e()) {
            return 0;
        }
        A0(i3, n3, t3);
        return 0;
    }

    @Override // Z.H
    public final int m(T t3) {
        throw null;
    }

    @Override // Z.H
    public final int n(T t3) {
        return this.f2354p;
    }

    @Override // Z.H
    public final int o(T t3) {
        return 0 - 0;
    }

    @Override // Z.H
    public final I r() {
        return new I(-2, -2);
    }

    @Override // Z.H
    public final void u0(RecyclerView recyclerView, int i3) {
        a aVar = new a(this, recyclerView.getContext(), 0);
        aVar.f1353a = i3;
        v0(aVar);
    }

    @Override // Z.H
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerX();
        throw null;
    }

    public final boolean y0() {
        return this.f2355q.f56a == 0;
    }

    public final boolean z0() {
        return y0() && A() == 1;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        new b();
        B0(H.G(context, attributeSet, i3, i4).f1155a);
        i0();
    }
}
