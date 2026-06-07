package J;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class u0 extends t0 {

    /* renamed from: n, reason: collision with root package name */
    public A.d f459n;

    /* renamed from: o, reason: collision with root package name */
    public A.d f460o;

    /* renamed from: p, reason: collision with root package name */
    public A.d f461p;

    public u0(y0 y0Var, WindowInsets windowInsets) {
        super(y0Var, windowInsets);
        this.f459n = null;
        this.f460o = null;
        this.f461p = null;
    }

    @Override // J.w0
    public A.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.f460o == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.f460o = A.d.c(mandatorySystemGestureInsets);
        }
        return this.f460o;
    }

    @Override // J.w0
    public A.d i() {
        Insets systemGestureInsets;
        if (this.f459n == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.f459n = A.d.c(systemGestureInsets);
        }
        return this.f459n;
    }

    @Override // J.w0
    public A.d k() {
        Insets tappableElementInsets;
        if (this.f461p == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.f461p = A.d.c(tappableElementInsets);
        }
        return this.f461p;
    }

    @Override // J.r0, J.w0
    public y0 l(int i3, int i4, int i5, int i6) {
        WindowInsets inset;
        inset = this.c.inset(i3, i4, i5, i6);
        return y0.g(null, inset);
    }

    @Override // J.s0, J.w0
    public void q(A.d dVar) {
    }
}
