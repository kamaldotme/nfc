package g2;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3072a;

    public i(Throwable th) {
        this.f3072a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (X1.g.a(this.f3072a, ((i) obj).f3072a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f3072a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // g2.j
    public final String toString() {
        return "Closed(" + this.f3072a + ')';
    }
}
