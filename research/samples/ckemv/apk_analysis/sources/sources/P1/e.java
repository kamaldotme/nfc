package p1;

import j1.AbstractC0236f;
import j1.C0238h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4340e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0236f f4341a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f4342b = f4340e;
    public final int[] c = new int[32];

    /* renamed from: d, reason: collision with root package name */
    public b f4343d;

    public e(AbstractC0236f abstractC0236f) {
        this.f4341a = abstractC0236f;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr[i6];
            if (i7 > i3) {
                i5 = i6;
                i3 = i7;
            }
            if (i7 > i4) {
                i4 = i7;
            }
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 - i5;
            int i12 = iArr[i10] * i11 * i11;
            if (i12 > i9) {
                i8 = i10;
                i9 = i12;
            }
        }
        if (i5 <= i8) {
            int i13 = i5;
            i5 = i8;
            i8 = i13;
        }
        if (i5 - i8 <= length / 16) {
            throw C0238h.f3489d;
        }
        int i14 = i5 - 1;
        int i15 = -1;
        int i16 = i14;
        while (i14 > i8) {
            int i17 = i14 - i8;
            int i18 = (i4 - iArr[i14]) * (i5 - i14) * i17 * i17;
            if (i18 > i15) {
                i16 = i14;
                i15 = i18;
            }
            i14--;
        }
        return i16 << 3;
    }
}
