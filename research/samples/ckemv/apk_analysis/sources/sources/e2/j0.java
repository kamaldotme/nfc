package e2;

/* loaded from: classes.dex */
public final class j0 extends j2.t {

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal f2807f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j0(O1.d dVar, O1.i iVar) {
        super(dVar, iVar.A(r0) == null ? iVar.o(r0) : iVar);
        k0 k0Var = k0.f2808b;
        this.f2807f = new ThreadLocal();
        if (dVar.j().A(O1.e.f781b) instanceof r) {
            return;
        }
        Object n3 = j2.a.n(iVar, null);
        j2.a.h(iVar, n3);
        Z(iVar, n3);
    }

    public final boolean Y() {
        boolean z3 = this.threadLocalIsSet && this.f2807f.get() == null;
        this.f2807f.remove();
        return !z3;
    }

    public final void Z(O1.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f2807f.set(new K1.c(iVar, obj));
    }

    @Override // j2.t, e2.Z
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            K1.c cVar = (K1.c) this.f2807f.get();
            if (cVar != null) {
                j2.a.h((O1.i) cVar.f600b, cVar.c);
            }
            this.f2807f.remove();
        }
        Object l3 = AbstractC0139v.l(obj);
        O1.d dVar = this.f3538e;
        O1.i j3 = dVar.j();
        Object n3 = j2.a.n(j3, null);
        j0 o3 = n3 != j2.a.f3511f ? AbstractC0139v.o(dVar, j3, n3) : null;
        try {
            this.f3538e.c(l3);
        } finally {
            if (o3 == null || o3.Y()) {
                j2.a.h(j3, n3);
            }
        }
    }
}
