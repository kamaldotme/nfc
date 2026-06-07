package v0;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5068a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f5069b;

    public C0404d(String str, Long l3) {
        this.f5068a = str;
        this.f5069b = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0404d)) {
            return false;
        }
        C0404d c0404d = (C0404d) obj;
        return X1.g.a(this.f5068a, c0404d.f5068a) && X1.g.a(this.f5069b, c0404d.f5069b);
    }

    public final int hashCode() {
        int hashCode = this.f5068a.hashCode() * 31;
        Long l3 = this.f5069b;
        return hashCode + (l3 == null ? 0 : l3.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f5068a + ", value=" + this.f5069b + ')';
    }
}
