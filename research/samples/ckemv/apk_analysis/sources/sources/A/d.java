package A;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f1e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4d;

    public d(int i3, int i4, int i5, int i6) {
        this.f2a = i3;
        this.f3b = i4;
        this.c = i5;
        this.f4d = i6;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f2a, dVar2.f2a), Math.max(dVar.f3b, dVar2.f3b), Math.max(dVar.c, dVar2.c), Math.max(dVar.f4d, dVar2.f4d));
    }

    public static d b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f1e : new d(i3, i4, i5, i6);
    }

    public static d c(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i3, i4, i5, i6);
    }

    public final Insets d() {
        return c.a(this.f2a, this.f3b, this.c, this.f4d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4d == dVar.f4d && this.f2a == dVar.f2a && this.c == dVar.c && this.f3b == dVar.f3b;
    }

    public final int hashCode() {
        return (((((this.f2a * 31) + this.f3b) * 31) + this.c) * 31) + this.f4d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2a + ", top=" + this.f3b + ", right=" + this.c + ", bottom=" + this.f4d + '}';
    }
}
