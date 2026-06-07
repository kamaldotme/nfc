package x1;

import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import java.util.Arrays;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433a extends AbstractC0440h {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f5213d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5214e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f5215f = {'A', 'B', 'C', 'D'};

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f5216a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public int[] f5217b = new int[80];
    public int c = 0;

    public static boolean i(char[] cArr, char c) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x1.AbstractC0440h
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        int i4;
        int[] iArr;
        int i5;
        int i6 = 0;
        Arrays.fill(this.f5217b, 0);
        this.c = 0;
        int c = c0356a.c(0);
        int i7 = c0356a.c;
        if (c >= i7) {
            throw C0238h.f3489d;
        }
        int i8 = 1;
        int i9 = 0;
        boolean z3 = true;
        while (c < i7) {
            if (c0356a.a(c) != z3) {
                i9++;
            } else {
                int[] iArr2 = this.f5217b;
                int i10 = this.c;
                iArr2[i10] = i9;
                int i11 = i10 + 1;
                this.c = i11;
                if (i11 >= iArr2.length) {
                    int[] iArr3 = new int[i11 << 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i11);
                    this.f5217b = iArr3;
                }
                z3 = !z3;
                i9 = 1;
            }
            c++;
        }
        int[] iArr4 = this.f5217b;
        int i12 = this.c;
        iArr4[i12] = i9;
        int i13 = i12 + 1;
        this.c = i13;
        if (i13 >= iArr4.length) {
            int[] iArr5 = new int[i13 << 1];
            System.arraycopy(iArr4, 0, iArr5, 0, i13);
            this.f5217b = iArr5;
        }
        int i14 = 1;
        while (i14 < this.c) {
            int j3 = j(i14);
            if (j3 != -1) {
                char[] cArr = f5213d;
                char c3 = cArr[j3];
                char[] cArr2 = f5215f;
                if (i(cArr2, c3)) {
                    int i15 = i6;
                    for (int i16 = i14; i16 < i14 + 7; i16++) {
                        i15 += this.f5217b[i16];
                    }
                    if (i14 == i8 || this.f5217b[i14 - 1] >= i15 / 2) {
                        StringBuilder sb = this.f5216a;
                        sb.setLength(i6);
                        int i17 = i14;
                        while (true) {
                            int j4 = j(i17);
                            if (j4 == -1) {
                                throw C0238h.f3489d;
                            }
                            sb.append((char) j4);
                            i4 = i17 + 8;
                            if ((sb.length() <= i8 || !i(cArr2, cArr[j4])) && i4 < this.c) {
                                i17 = i4;
                                i8 = i8;
                                i6 = i6;
                            }
                        }
                        int i18 = i17 + 7;
                        int i19 = this.f5217b[i18];
                        int i20 = i6;
                        for (int i21 = -8; i21 < -1; i21++) {
                            i20 += this.f5217b[i4 + i21];
                        }
                        if (i4 < this.c && i19 < i20 / 2) {
                            throw C0238h.f3489d;
                        }
                        int[] iArr6 = new int[4];
                        iArr6[i6] = i6;
                        iArr6[i8] = i6;
                        iArr6[2] = i6;
                        iArr6[3] = i6;
                        int[] iArr7 = new int[4];
                        iArr7[i6] = i6;
                        iArr7[i8] = i6;
                        iArr7[2] = i6;
                        iArr7[3] = i6;
                        int length = sb.length() - i8;
                        int i22 = i14;
                        int i23 = i6;
                        while (true) {
                            char charAt = sb.charAt(i23);
                            iArr = f5214e;
                            int i24 = iArr[charAt];
                            for (int i25 = 6; i25 >= 0; i25--) {
                                int i26 = (i25 & 1) + ((i24 & 1) << 1);
                                iArr6[i26] = iArr6[i26] + this.f5217b[i22 + i25];
                                iArr7[i26] = iArr7[i26] + i8;
                                i24 >>= 1;
                            }
                            if (i23 >= length) {
                                break;
                            }
                            i22 += 8;
                            i23++;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i27 = i6;
                        for (int i28 = 2; i27 < i28; i28 = 2) {
                            fArr2[i27] = 0.0f;
                            int i29 = i27 + 2;
                            float f3 = iArr6[i29];
                            float f4 = iArr7[i29];
                            float f5 = ((f3 / f4) + (iArr6[i27] / iArr7[i27])) / 2.0f;
                            fArr2[i29] = f5;
                            fArr[i27] = f5;
                            fArr[i29] = ((f3 * 2.0f) + 1.5f) / f4;
                            i27++;
                        }
                        int i30 = i14;
                        int i31 = 0;
                        loop8: while (true) {
                            int i32 = iArr[sb.charAt(i31)];
                            for (int i33 = 6; i33 >= 0; i33--) {
                                int i34 = (i33 & 1) + ((i32 & 1) << 1);
                                float f6 = this.f5217b[i30 + i33];
                                if (f6 < fArr2[i34] || f6 > fArr[i34]) {
                                    break loop8;
                                }
                                i32 >>= 1;
                            }
                            if (i31 >= length) {
                                for (int i35 = 0; i35 < sb.length(); i35++) {
                                    sb.setCharAt(i35, cArr[sb.charAt(i35)]);
                                }
                                if (!i(cArr2, sb.charAt(0))) {
                                    throw C0238h.f3489d;
                                }
                                if (!i(cArr2, sb.charAt(sb.length() - 1))) {
                                    throw C0238h.f3489d;
                                }
                                if (sb.length() <= 3) {
                                    throw C0238h.f3489d;
                                }
                                if (map == null || !map.containsKey(EnumC0233c.f3479j)) {
                                    sb.deleteCharAt(sb.length() - 1);
                                    i5 = 0;
                                    sb.deleteCharAt(0);
                                } else {
                                    i5 = 0;
                                }
                                for (int i36 = i5; i36 < i14; i36++) {
                                    i5 += this.f5217b[i36];
                                }
                                float f7 = i5;
                                while (i14 < i18) {
                                    i5 += this.f5217b[i14];
                                    i14++;
                                }
                                float f8 = i5;
                                float f9 = i3;
                                return new C0242l(sb.toString(), null, new C0244n[]{new C0244n(f7, f9), new C0244n(f8, f9)}, EnumC0231a.c);
                            }
                            i30 += 8;
                            i31++;
                        }
                        throw C0238h.f3489d;
                    }
                }
            }
            i14 += 2;
            i8 = i8;
            i6 = i6;
        }
        throw C0238h.f3489d;
    }

    public final int j(int i3) {
        int i4 = i3 + 7;
        if (i4 >= this.c) {
            return -1;
        }
        int[] iArr = this.f5217b;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        for (int i9 = i3; i9 < i4; i9 += 2) {
            int i10 = iArr[i9];
            if (i10 < i7) {
                i7 = i10;
            }
            if (i10 > i8) {
                i8 = i10;
            }
        }
        int i11 = (i7 + i8) / 2;
        int i12 = 0;
        for (int i13 = i3 + 1; i13 < i4; i13 += 2) {
            int i14 = iArr[i13];
            if (i14 < i5) {
                i5 = i14;
            }
            if (i14 > i12) {
                i12 = i14;
            }
        }
        int i15 = (i5 + i12) / 2;
        int i16 = 128;
        int i17 = 0;
        for (int i18 = 0; i18 < 7; i18++) {
            i16 >>= 1;
            if (iArr[i3 + i18] > ((i18 & 1) == 0 ? i11 : i15)) {
                i17 |= i16;
            }
        }
        while (true) {
            int[] iArr2 = f5214e;
            if (i6 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i6] == i17) {
                return i6;
            }
            i6++;
        }
    }
}
