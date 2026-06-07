package g2;

import e2.AbstractC0119a;
import e2.AbstractC0139v;
import e2.C0131m;
import e2.S;
import e2.X;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q extends AbstractC0119a implements r, h {

    /* renamed from: e, reason: collision with root package name */
    public final h f3079e;

    public q(O1.i iVar, d dVar) {
        super(iVar, true);
        this.f3079e = dVar;
    }

    @Override // e2.AbstractC0119a
    public final void V(Throwable th, boolean z3) {
        if (this.f3079e.k(th) || z3) {
            return;
        }
        AbstractC0139v.h(this.f2794d, th);
    }

    @Override // e2.AbstractC0119a
    public final void W(Object obj) {
        this.f3079e.k(null);
    }

    @Override // e2.Z, e2.Q
    public final void a(CancellationException cancellationException) {
        Object F2 = F();
        if (F2 instanceof C0131m) {
            return;
        }
        if ((F2 instanceof X) && ((X) F2).e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new S(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // e2.AbstractC0119a, e2.Z, e2.Q
    public final boolean b() {
        return super.b();
    }

    @Override // g2.u
    public final boolean d() {
        return this.f3079e.d();
    }

    @Override // g2.u
    public final void e(L1.a aVar) {
        this.f3079e.e(aVar);
    }

    @Override // g2.u
    public final Object g(O1.d dVar, Object obj) {
        return this.f3079e.g(dVar, obj);
    }

    @Override // g2.t
    public final Object h() {
        return this.f3079e.h();
    }

    @Override // g2.t
    public final a iterator() {
        return this.f3079e.iterator();
    }

    @Override // g2.u
    public final boolean k(Throwable th) {
        return this.f3079e.k(th);
    }

    @Override // g2.u
    public final Object l(Object obj) {
        return this.f3079e.l(obj);
    }

    @Override // g2.t
    public final Object n(O1.d dVar) {
        return this.f3079e.n(dVar);
    }

    @Override // e2.Z
    public final void t(CancellationException cancellationException) {
        this.f3079e.a(cancellationException);
        s(cancellationException);
    }
}
