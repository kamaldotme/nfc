package I;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f292d;

    public c() {
        super(12);
        this.f292d = new Object();
    }

    @Override // I.b
    public final Object a() {
        Object a3;
        synchronized (this.f292d) {
            a3 = super.a();
        }
        return a3;
    }

    @Override // I.b
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.f292d) {
            c = super.c(obj);
        }
        return c;
    }
}
