package e2;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0119a extends Z implements O1.d, InterfaceC0137t {

    /* renamed from: d, reason: collision with root package name */
    public final O1.i f2794d;

    public AbstractC0119a(O1.i iVar, boolean z3) {
        super(z3);
        I((Q) iVar.A(C0136s.c));
        this.f2794d = iVar.o(this);
    }

    @Override // e2.Z
    public final void H(K1.b bVar) {
        AbstractC0139v.h(this.f2794d, bVar);
    }

    @Override // e2.Z
    public final String M() {
        return super.M();
    }

    @Override // e2.Z
    public final void P(Object obj) {
        if (!(obj instanceof C0131m)) {
            W(obj);
            return;
        }
        C0131m c0131m = (C0131m) obj;
        Throwable th = c0131m.f2814a;
        c0131m.getClass();
        V(th, C0131m.f2813b.get(c0131m) != 0);
    }

    public void V(Throwable th, boolean z3) {
    }

    public void W(Object obj) {
    }

    public final void X(int i3, AbstractC0119a abstractC0119a, W1.p pVar) {
        int a3 = q.h.a(i3);
        if (a3 == 0) {
            u2.l.M(pVar, abstractC0119a, this);
            return;
        }
        if (a3 != 1) {
            if (a3 == 2) {
                v0.f.y(v0.f.q(pVar, abstractC0119a, this)).c(K1.h.f605a);
                return;
            }
            if (a3 != 3) {
                throw new RuntimeException();
            }
            try {
                O1.i iVar = this.f2794d;
                Object n3 = j2.a.n(iVar, null);
                try {
                    X1.m.a(2, pVar);
                    Object e3 = pVar.e(abstractC0119a, this);
                    if (e3 != P1.a.f784b) {
                        c(e3);
                    }
                } finally {
                    j2.a.h(iVar, n3);
                }
            } catch (Throwable th) {
                c(m0.z.q(th));
            }
        }
    }

    @Override // e2.Z, e2.Q
    public boolean b() {
        return super.b();
    }

    @Override // O1.d
    public final void c(Object obj) {
        Throwable a3 = K1.e.a(obj);
        if (a3 != null) {
            obj = new C0131m(a3, false);
        }
        Object L2 = L(obj);
        if (L2 == AbstractC0139v.f2825e) {
            return;
        }
        r(L2);
    }

    @Override // O1.d
    public final O1.i j() {
        return this.f2794d;
    }

    @Override // e2.InterfaceC0137t
    public final O1.i m() {
        return this.f2794d;
    }

    @Override // e2.Z
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
