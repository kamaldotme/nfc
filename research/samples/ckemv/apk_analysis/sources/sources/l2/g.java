package l2;

import e2.J;

/* loaded from: classes.dex */
public abstract class g extends J {

    /* renamed from: d, reason: collision with root package name */
    public final b f3926d;

    public g(int i3, int i4, long j3, String str) {
        this.f3926d = new b(i3, i4, j3, str);
    }

    @Override // e2.r
    public final void I(O1.i iVar, Runnable runnable) {
        b.i(this.f3926d, runnable, false, 6);
    }

    @Override // e2.r
    public final void J(O1.i iVar, Runnable runnable) {
        b.i(this.f3926d, runnable, true, 2);
    }
}
