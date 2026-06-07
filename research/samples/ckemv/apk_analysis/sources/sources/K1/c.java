package K1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f600b;
    public final Object c;

    public c(Object obj, Object obj2) {
        this.f600b = obj;
        this.c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return X1.g.a(this.f600b, cVar.f600b) && X1.g.a(this.c, cVar.c);
    }

    public final int hashCode() {
        Object obj = this.f600b;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.c;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f600b + ", " + this.c + ')';
    }
}
