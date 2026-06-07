package j2;

import b2.InterfaceC0106a;
import e2.AbstractC0139v;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends X1.b implements W1.a, InterfaceC0106a {
    public final boolean h;

    public j(Object obj) {
        super(obj, AbstractC0139v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.h = false;
    }

    public final InterfaceC0106a c() {
        if (!this.h) {
            InterfaceC0106a interfaceC0106a = this.f1132b;
            if (interfaceC0106a != null) {
                return interfaceC0106a;
            }
            f();
            this.f1132b = this;
        }
        return this;
    }

    @Override // W1.a
    public final Object d() {
        return this.c.getClass().getSimpleName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return b().equals(jVar.b()) && this.f1134e.equals(jVar.f1134e) && this.f1135f.equals(jVar.f1135f) && X1.g.a(this.c, jVar.c);
        }
        if (obj instanceof j) {
            return obj.equals(c());
        }
        return false;
    }

    public final InterfaceC0106a f() {
        X1.k.f1143a.getClass();
        return this;
    }

    public final int hashCode() {
        return this.f1135f.hashCode() + ((this.f1134e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC0106a c = c();
        return c != this ? c.toString() : X.d.j(new StringBuilder("property "), this.f1134e, " (Kotlin reflection is not available)");
    }
}
