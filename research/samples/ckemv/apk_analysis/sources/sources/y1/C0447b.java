package y1;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0447b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5264b;

    public C0447b(int i3, int i4) {
        this.f5263a = i3;
        this.f5264b = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0447b)) {
            return false;
        }
        C0447b c0447b = (C0447b) obj;
        return this.f5263a == c0447b.f5263a && this.f5264b == c0447b.f5264b;
    }

    public final int hashCode() {
        return this.f5263a ^ this.f5264b;
    }

    public final String toString() {
        return this.f5263a + "(" + this.f5264b + ')';
    }
}
