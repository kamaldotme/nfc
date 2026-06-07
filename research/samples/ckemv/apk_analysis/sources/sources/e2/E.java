package e2;

/* loaded from: classes.dex */
public final class E extends F {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0123e f2770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H f2771e;

    public E(H h, long j3, C0124f c0124f) {
        this.f2771e = h;
        this.f2772b = j3;
        this.c = -1;
        this.f2770d = c0124f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((C0124f) this.f2770d).z(this.f2771e);
    }

    @Override // e2.F
    public final String toString() {
        return super.toString() + this.f2770d;
    }
}
