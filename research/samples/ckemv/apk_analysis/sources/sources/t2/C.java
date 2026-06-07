package t2;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f4912a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4913b = new int[10];

    public final int a() {
        if ((this.f4912a & 128) != 0) {
            return this.f4913b[7];
        }
        return 65535;
    }

    public final void b(C c) {
        X1.g.e(c, "other");
        for (int i3 = 0; i3 < 10; i3++) {
            if (((1 << i3) & c.f4912a) != 0) {
                c(i3, c.f4913b[i3]);
            }
        }
    }

    public final void c(int i3, int i4) {
        if (i3 >= 0) {
            int[] iArr = this.f4913b;
            if (i3 >= iArr.length) {
                return;
            }
            this.f4912a = (1 << i3) | this.f4912a;
            iArr[i3] = i4;
        }
    }
}
