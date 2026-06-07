package g2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3073b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f3074a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return X1.g.a(this.f3074a, ((k) obj).f3074a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f3074a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f3074a;
        if (obj instanceof i) {
            return ((i) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
