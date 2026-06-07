package v0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f5073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5074b;
    public final int c;

    public g(int i3, int i4, String str) {
        X1.g.e(str, "workSpecId");
        this.f5073a = str;
        this.f5074b = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return X1.g.a(this.f5073a, gVar.f5073a) && this.f5074b == gVar.f5074b && this.c == gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Integer.hashCode(this.f5074b) + (this.f5073a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f5073a + ", generation=" + this.f5074b + ", systemId=" + this.c + ')';
    }
}
