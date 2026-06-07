package v0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public String f5089a;

    /* renamed from: b, reason: collision with root package name */
    public int f5090b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return X1.g.a(this.f5089a, nVar.f5089a) && this.f5090b == nVar.f5090b;
    }

    public final int hashCode() {
        return q.h.a(this.f5090b) + (this.f5089a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f5089a + ", state=" + X.d.z(this.f5090b) + ')';
    }
}
