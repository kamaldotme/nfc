package Z;

/* renamed from: Z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0034a {

    /* renamed from: a, reason: collision with root package name */
    public int f1226a;

    /* renamed from: b, reason: collision with root package name */
    public int f1227b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public int f1228d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0034a.class != obj.getClass()) {
            return false;
        }
        C0034a c0034a = (C0034a) obj;
        int i3 = this.f1226a;
        if (i3 != c0034a.f1226a) {
            return false;
        }
        if (i3 == 8 && Math.abs(this.f1228d - this.f1227b) == 1 && this.f1228d == c0034a.f1227b && this.f1227b == c0034a.f1228d) {
            return true;
        }
        if (this.f1228d != c0034a.f1228d || this.f1227b != c0034a.f1227b) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(c0034a.c)) {
                return false;
            }
        } else if (c0034a.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1226a * 31) + this.f1227b) * 31) + this.f1228d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i3 = this.f1226a;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f1227b);
        sb.append("c:");
        sb.append(this.f1228d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
