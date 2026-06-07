package e2;

/* loaded from: classes.dex */
public final class a0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final O1.d f2795e;

    public a0(O1.i iVar, W1.p pVar) {
        super(iVar, false);
        this.f2795e = v0.f.q(pVar, this, this);
    }

    @Override // e2.Z
    public final void Q() {
        try {
            j2.a.i(v0.f.y(this.f2795e), K1.h.f605a, null);
        } catch (Throwable th) {
            c(m0.z.q(th));
            throw th;
        }
    }
}
