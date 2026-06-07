package e2;

/* loaded from: classes.dex */
public final class P extends V {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2781f;
    public final Object g;

    public /* synthetic */ P(int i3, Object obj) {
        this.f2781f = i3;
        this.g = obj;
    }

    @Override // W1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        switch (this.f2781f) {
            case 0:
                p((Throwable) obj);
                return K1.h.f605a;
            default:
                p((Throwable) obj);
                return K1.h.f605a;
        }
    }

    @Override // e2.V
    public final void p(Throwable th) {
        switch (this.f2781f) {
            case 0:
                ((W1.l) this.g).h(th);
                return;
            default:
                ((O1.d) this.g).c(K1.h.f605a);
                return;
        }
    }
}
