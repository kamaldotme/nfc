package androidx.lifecycle;

/* loaded from: classes.dex */
public final class L implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final t f2026b;
    public final EnumC0095l c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2027d;

    public L(t tVar, EnumC0095l enumC0095l) {
        X1.g.e(tVar, "registry");
        X1.g.e(enumC0095l, "event");
        this.f2026b = tVar;
        this.c = enumC0095l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2027d) {
            return;
        }
        this.f2026b.d(this.c);
        this.f2027d = true;
    }
}
