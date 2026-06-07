package J;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s0 extends r0 {

    /* renamed from: m, reason: collision with root package name */
    public A.d f456m;

    public s0(y0 y0Var, WindowInsets windowInsets) {
        super(y0Var, windowInsets);
        this.f456m = null;
    }

    @Override // J.w0
    public y0 b() {
        return y0.g(null, this.c.consumeStableInsets());
    }

    @Override // J.w0
    public y0 c() {
        return y0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // J.w0
    public final A.d h() {
        if (this.f456m == null) {
            WindowInsets windowInsets = this.c;
            this.f456m = A.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f456m;
    }

    @Override // J.w0
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // J.w0
    public void q(A.d dVar) {
        this.f456m = dVar;
    }
}
