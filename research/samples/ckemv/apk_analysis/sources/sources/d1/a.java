package D1;

import v0.e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f142e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f143a = new int[929];

    /* renamed from: b, reason: collision with root package name */
    public final int[] f144b = new int[929];
    public final e c;

    /* renamed from: d, reason: collision with root package name */
    public final e f145d;

    public a() {
        int i3 = 1;
        for (int i4 = 0; i4 < 929; i4++) {
            this.f143a[i4] = i3;
            i3 = (i3 * 3) % 929;
        }
        for (int i5 = 0; i5 < 928; i5++) {
            this.f144b[this.f143a[i5]] = i5;
        }
        this.c = new e(this, new int[]{0});
        this.f145d = new e(this, new int[]{1});
    }

    public final int a(int i3, int i4) {
        return (i3 + i4) % 929;
    }

    public final int b(int i3) {
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        return this.f143a[928 - this.f144b[i3]];
    }

    public final int c(int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return 0;
        }
        int[] iArr = this.f144b;
        return this.f143a[(iArr[i3] + iArr[i4]) % 928];
    }
}
