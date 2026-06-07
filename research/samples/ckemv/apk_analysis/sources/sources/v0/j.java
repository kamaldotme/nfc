package v0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5079a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5080b;

    public j(String str, int i3) {
        X1.g.e(str, "workSpecId");
        this.f5079a = str;
        this.f5080b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return X1.g.a(this.f5079a, jVar.f5079a) && this.f5080b == jVar.f5080b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5080b) + (this.f5079a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f5079a + ", generation=" + this.f5080b + ')';
    }
}
