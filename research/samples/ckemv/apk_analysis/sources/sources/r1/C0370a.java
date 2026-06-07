package r1;

import v0.l;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370a {
    public static final C0370a h = new C0370a(4201, 4096, 1);

    /* renamed from: i, reason: collision with root package name */
    public static final C0370a f4641i = new C0370a(1033, 1024, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C0370a f4642j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0370a f4643k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0370a f4644l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0370a f4645m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0370a f4646n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0370a f4647o;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4648a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4649b;
    public final l c;

    /* renamed from: d, reason: collision with root package name */
    public final l f4650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4651e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4652f;
    public final int g;

    static {
        C0370a c0370a = new C0370a(67, 64, 1);
        f4642j = c0370a;
        f4643k = new C0370a(19, 16, 1);
        f4644l = new C0370a(285, 256, 0);
        C0370a c0370a2 = new C0370a(301, 256, 1);
        f4645m = c0370a2;
        f4646n = c0370a2;
        f4647o = c0370a;
    }

    public C0370a(int i3, int i4, int i5) {
        this.f4652f = i3;
        this.f4651e = i4;
        this.g = i5;
        this.f4648a = new int[i4];
        this.f4649b = new int[i4];
        int i6 = 1;
        for (int i7 = 0; i7 < i4; i7++) {
            this.f4648a[i7] = i6;
            i6 <<= 1;
            if (i6 >= i4) {
                i6 = (i6 ^ i3) & (i4 - 1);
            }
        }
        for (int i8 = 0; i8 < i4 - 1; i8++) {
            this.f4649b[this.f4648a[i8]] = i8;
        }
        this.c = new l(this, new int[]{0});
        this.f4650d = new l(this, new int[]{1});
    }

    public final int a(int i3) {
        if (i3 == 0) {
            throw new ArithmeticException();
        }
        return this.f4648a[(this.f4651e - this.f4649b[i3]) - 1];
    }

    public final int b(int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return 0;
        }
        int[] iArr = this.f4649b;
        return this.f4648a[(iArr[i3] + iArr[i4]) % (this.f4651e - 1)];
    }

    public final String toString() {
        return "GF(0x" + Integer.toHexString(this.f4652f) + ',' + this.f4651e + ')';
    }
}
