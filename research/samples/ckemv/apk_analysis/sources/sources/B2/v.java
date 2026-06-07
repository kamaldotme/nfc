package B2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f101a;

    /* renamed from: b, reason: collision with root package name */
    public float f102b;
    public float c;

    /* renamed from: d, reason: collision with root package name */
    public float f103d;

    /* renamed from: e, reason: collision with root package name */
    public float f104e;

    /* renamed from: f, reason: collision with root package name */
    public int f105f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f101a, vVar.f101a) == 0 && Float.compare(this.f102b, vVar.f102b) == 0 && Float.compare(this.c, vVar.c) == 0 && Float.compare(this.f103d, vVar.f103d) == 0 && Float.compare(this.f104e, vVar.f104e) == 0 && this.f105f == vVar.f105f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f105f) + ((Float.hashCode(this.f104e) + ((Float.hashCode(this.f103d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.f102b) + (Float.hashCode(this.f101a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Circle(x=" + this.f101a + ", y=" + this.f102b + ", radius=" + this.c + ", dx=" + this.f103d + ", dy=" + this.f104e + ", color=" + this.f105f + ")";
    }
}
