package X1;

import b2.InterfaceC0106a;

/* loaded from: classes.dex */
public abstract class f extends b implements e, InterfaceC0106a, K1.a {
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1138i;

    public f(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.h = i3;
        this.f1138i = 0;
    }

    public final InterfaceC0106a c() {
        k.f1143a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f1134e.equals(fVar.f1134e) && this.f1135f.equals(fVar.f1135f) && this.f1138i == fVar.f1138i && this.h == fVar.h && g.a(this.c, fVar.c) && g.a(b(), fVar.b());
        }
        if (!(obj instanceof f)) {
            return false;
        }
        InterfaceC0106a interfaceC0106a = this.f1132b;
        if (interfaceC0106a == null) {
            c();
            this.f1132b = this;
            interfaceC0106a = this;
        }
        return obj.equals(interfaceC0106a);
    }

    @Override // X1.e
    public final int g() {
        return this.h;
    }

    public final int hashCode() {
        return this.f1135f.hashCode() + ((this.f1134e.hashCode() + (b() == null ? 0 : b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC0106a interfaceC0106a = this.f1132b;
        if (interfaceC0106a == null) {
            c();
            this.f1132b = this;
            interfaceC0106a = this;
        }
        if (interfaceC0106a != this) {
            return interfaceC0106a.toString();
        }
        String str = this.f1134e;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : X.d.i("function ", str, " (Kotlin reflection is not available)");
    }
}
