package e2;

/* loaded from: classes.dex */
public abstract class r extends O1.a implements O1.f {
    public static final C0135q c = new C0135q(O1.e.f781b, C0134p.c);

    public r() {
        super(O1.e.f781b);
    }

    @Override // O1.a, O1.i
    public final O1.g A(O1.h hVar) {
        X1.g.e(hVar, "key");
        if (!(hVar instanceof C0135q)) {
            if (O1.e.f781b == hVar) {
                return this;
            }
            return null;
        }
        C0135q c0135q = (C0135q) hVar;
        O1.h hVar2 = this.f777b;
        X1.g.e(hVar2, "key");
        if (hVar2 != c0135q && c0135q.c != hVar2) {
            return null;
        }
        O1.g a3 = c0135q.a(this);
        if (a3 instanceof O1.g) {
            return a3;
        }
        return null;
    }

    public abstract void I(O1.i iVar, Runnable runnable);

    public void J(O1.i iVar, Runnable runnable) {
        I(iVar, runnable);
    }

    public boolean K() {
        return !(this instanceof i0);
    }

    @Override // O1.a, O1.i
    public final O1.i i(O1.h hVar) {
        X1.g.e(hVar, "key");
        boolean z3 = hVar instanceof C0135q;
        O1.j jVar = O1.j.f782b;
        if (z3) {
            C0135q c0135q = (C0135q) hVar;
            O1.h hVar2 = this.f777b;
            X1.g.e(hVar2, "key");
            if ((hVar2 == c0135q || c0135q.c == hVar2) && c0135q.a(this) != null) {
                return jVar;
            }
        } else if (O1.e.f781b == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0139v.f(this);
    }
}
