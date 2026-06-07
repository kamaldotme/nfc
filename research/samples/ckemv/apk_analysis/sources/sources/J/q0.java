package J;

import a.AbstractC0059a;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f447a;

    /* renamed from: b, reason: collision with root package name */
    public A.d[] f448b;

    public q0() {
        this(new y0());
    }

    public final void a() {
        A.d[] dVarArr = this.f448b;
        if (dVarArr != null) {
            A.d dVar = dVarArr[AbstractC0059a.y(1)];
            A.d dVar2 = this.f448b[AbstractC0059a.y(2)];
            y0 y0Var = this.f447a;
            if (dVar2 == null) {
                dVar2 = y0Var.f470a.f(2);
            }
            if (dVar == null) {
                dVar = y0Var.f470a.f(1);
            }
            g(A.d.a(dVar, dVar2));
            A.d dVar3 = this.f448b[AbstractC0059a.y(16)];
            if (dVar3 != null) {
                f(dVar3);
            }
            A.d dVar4 = this.f448b[AbstractC0059a.y(32)];
            if (dVar4 != null) {
                d(dVar4);
            }
            A.d dVar5 = this.f448b[AbstractC0059a.y(64)];
            if (dVar5 != null) {
                h(dVar5);
            }
        }
    }

    public abstract y0 b();

    public void c(int i3, A.d dVar) {
        if (this.f448b == null) {
            this.f448b = new A.d[9];
        }
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                this.f448b[AbstractC0059a.y(i4)] = dVar;
            }
        }
    }

    public void d(A.d dVar) {
    }

    public abstract void e(A.d dVar);

    public void f(A.d dVar) {
    }

    public abstract void g(A.d dVar);

    public void h(A.d dVar) {
    }

    public q0(y0 y0Var) {
        this.f447a = y0Var;
    }
}
