package e2;

/* renamed from: e2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2816a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.l f2817b;

    public C0132n(Object obj, W1.l lVar) {
        this.f2816a = obj;
        this.f2817b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0132n)) {
            return false;
        }
        C0132n c0132n = (C0132n) obj;
        return X1.g.a(this.f2816a, c0132n.f2816a) && X1.g.a(this.f2817b, c0132n.f2817b);
    }

    public final int hashCode() {
        Object obj = this.f2816a;
        return this.f2817b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f2816a + ", onCancellation=" + this.f2817b + ')';
    }
}
