package e2;

/* loaded from: classes.dex */
public final class i0 extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2805d = 0;

    static {
        new r();
    }

    @Override // e2.r
    public final void I(O1.i iVar, Runnable runnable) {
        m0 m0Var = (m0) iVar.A(m0.f2815d);
        if (m0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        m0Var.c = true;
    }

    @Override // e2.r
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
