package J;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o0 extends q0 {
    public final WindowInsets.Builder c;

    public o0() {
        this.c = A.b.e();
    }

    @Override // J.q0
    public y0 b() {
        WindowInsets build;
        a();
        build = this.c.build();
        y0 g = y0.g(null, build);
        g.f470a.o(this.f448b);
        return g;
    }

    @Override // J.q0
    public void d(A.d dVar) {
        this.c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // J.q0
    public void e(A.d dVar) {
        this.c.setStableInsets(dVar.d());
    }

    @Override // J.q0
    public void f(A.d dVar) {
        this.c.setSystemGestureInsets(dVar.d());
    }

    @Override // J.q0
    public void g(A.d dVar) {
        this.c.setSystemWindowInsets(dVar.d());
    }

    @Override // J.q0
    public void h(A.d dVar) {
        this.c.setTappableElementInsets(dVar.d());
    }

    public o0(y0 y0Var) {
        super(y0Var);
        WindowInsets.Builder e3;
        WindowInsets f3 = y0Var.f();
        if (f3 != null) {
            e3 = A.b.f(f3);
        } else {
            e3 = A.b.e();
        }
        this.c = e3;
    }
}
