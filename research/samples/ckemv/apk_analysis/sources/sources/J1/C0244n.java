package j1;

/* renamed from: j1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0244n {

    /* renamed from: a, reason: collision with root package name */
    public final float f3505a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3506b;

    public C0244n(float f3, float f4) {
        this.f3505a = f3;
        this.f3506b = f4;
    }

    public static float a(C0244n c0244n, C0244n c0244n2) {
        return v0.f.s(c0244n.f3505a, c0244n.f3506b, c0244n2.f3505a, c0244n2.f3506b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0244n) {
            C0244n c0244n = (C0244n) obj;
            if (this.f3505a == c0244n.f3505a && this.f3506b == c0244n.f3506b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3506b) + (Float.floatToIntBits(this.f3505a) * 31);
    }

    public final String toString() {
        return "(" + this.f3505a + ',' + this.f3506b + ')';
    }
}
