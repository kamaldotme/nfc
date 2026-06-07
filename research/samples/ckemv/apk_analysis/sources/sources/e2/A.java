package e2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class A extends l2.h {

    /* renamed from: d, reason: collision with root package name */
    public int f2766d;

    public A(int i3) {
        super(0L, l2.k.g);
        this.f2766d = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract O1.d d();

    public Throwable e(Object obj) {
        C0131m c0131m = obj instanceof C0131m ? (C0131m) obj : null;
        if (c0131m != null) {
            return c0131m.f2814a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            v0.f.h(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        X1.g.b(th);
        AbstractC0139v.h(d().j(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = K1.h.f605a;
        l2.i iVar = this.c;
        try {
            O1.d d3 = d();
            X1.g.c(d3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            j2.h hVar = (j2.h) d3;
            O1.d dVar = hVar.f3520f;
            Object obj2 = hVar.h;
            O1.i j3 = dVar.j();
            Object n3 = j2.a.n(j3, obj2);
            j0 o3 = n3 != j2.a.f3511f ? AbstractC0139v.o(dVar, j3, n3) : null;
            try {
                O1.i j4 = dVar.j();
                Object i3 = i();
                Throwable e3 = e(i3);
                Q q3 = (e3 == null && AbstractC0139v.j(this.f2766d)) ? (Q) j4.A(C0136s.c) : null;
                if (q3 != null && !q3.b()) {
                    CancellationException B3 = ((Z) q3).B();
                    b(i3, B3);
                    dVar.c(m0.z.q(B3));
                } else if (e3 != null) {
                    dVar.c(m0.z.q(e3));
                } else {
                    dVar.c(g(i3));
                }
                if (o3 == null || o3.Y()) {
                    j2.a.h(j3, n3);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = m0.z.q(th);
                }
                h(null, K1.e.a(obj));
            } catch (Throwable th2) {
                if (o3 == null || o3.Y()) {
                    j2.a.h(j3, n3);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = m0.z.q(th4);
            }
            h(th3, K1.e.a(obj));
        }
    }
}
