package L1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f625a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f626b;

    public w(int i3, Object obj) {
        this.f625a = i3;
        this.f626b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f625a == wVar.f625a && X1.g.a(this.f626b, wVar.f626b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f625a) * 31;
        Object obj = this.f626b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f625a + ", value=" + this.f626b + ')';
    }
}
