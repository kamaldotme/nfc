package r0;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0369d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4631a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4632b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4633d;

    public C0369d(boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f4631a = z3;
        this.f4632b = z4;
        this.c = z5;
        this.f4633d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0369d)) {
            return false;
        }
        C0369d c0369d = (C0369d) obj;
        return this.f4631a == c0369d.f4631a && this.f4632b == c0369d.f4632b && this.c == c0369d.c && this.f4633d == c0369d.f4633d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z3 = this.f4631a;
        int i3 = z3;
        if (z3 != 0) {
            i3 = 1;
        }
        int i4 = i3 * 31;
        boolean z4 = this.f4632b;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z5 = this.c;
        int i7 = z5;
        if (z5 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z6 = this.f4633d;
        return i8 + (z6 ? 1 : z6 ? 1 : 0);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f4631a + ", isValidated=" + this.f4632b + ", isMetered=" + this.c + ", isNotRoaming=" + this.f4633d + ')';
    }
}
