package androidx.lifecycle;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0096m f2049a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0099p f2050b;

    public final void a(r rVar, EnumC0095l enumC0095l) {
        EnumC0096m a3 = enumC0095l.a();
        EnumC0096m enumC0096m = this.f2049a;
        X1.g.e(enumC0096m, "state1");
        if (a3.compareTo(enumC0096m) < 0) {
            enumC0096m = a3;
        }
        this.f2049a = enumC0096m;
        this.f2050b.b(rVar, enumC0095l);
        this.f2049a = a3;
    }
}
