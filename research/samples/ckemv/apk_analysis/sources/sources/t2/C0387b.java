package t2;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387b {

    /* renamed from: d, reason: collision with root package name */
    public static final z2.i f4915d;

    /* renamed from: e, reason: collision with root package name */
    public static final z2.i f4916e;

    /* renamed from: f, reason: collision with root package name */
    public static final z2.i f4917f;
    public static final z2.i g;
    public static final z2.i h;

    /* renamed from: i, reason: collision with root package name */
    public static final z2.i f4918i;

    /* renamed from: a, reason: collision with root package name */
    public final z2.i f4919a;

    /* renamed from: b, reason: collision with root package name */
    public final z2.i f4920b;
    public final int c;

    static {
        z2.i iVar = z2.i.f5338e;
        f4915d = d1.e.i(":");
        f4916e = d1.e.i(":status");
        f4917f = d1.e.i(":method");
        g = d1.e.i(":path");
        h = d1.e.i(":scheme");
        f4918i = d1.e.i(":authority");
    }

    public C0387b(z2.i iVar, z2.i iVar2) {
        X1.g.e(iVar, "name");
        X1.g.e(iVar2, "value");
        this.f4919a = iVar;
        this.f4920b = iVar2;
        this.c = iVar2.c() + iVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0387b)) {
            return false;
        }
        C0387b c0387b = (C0387b) obj;
        return X1.g.a(this.f4919a, c0387b.f4919a) && X1.g.a(this.f4920b, c0387b.f4920b);
    }

    public final int hashCode() {
        return this.f4920b.hashCode() + (this.f4919a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4919a.j() + ": " + this.f4920b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0387b(String str, String str2) {
        this(d1.e.i(str), d1.e.i(str2));
        X1.g.e(str, "name");
        X1.g.e(str2, "value");
        z2.i iVar = z2.i.f5338e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0387b(z2.i iVar, String str) {
        this(iVar, d1.e.i(str));
        X1.g.e(iVar, "name");
        X1.g.e(str, "value");
        z2.i iVar2 = z2.i.f5338e;
    }
}
