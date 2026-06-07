package l1;

import f.C0150G;
import j1.AbstractC0241k;
import j1.C0234d;
import java.util.Arrays;
import k1.C0322a;
import p1.b;
import p1.d;
import q.h;
import r1.C0370a;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f3903b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f3904d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f3905e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f3906f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: a, reason: collision with root package name */
    public C0322a f3907a;

    public static int b(boolean[] zArr, int i3, int i4) {
        int i5 = 0;
        for (int i6 = i3; i6 < i3 + i4; i6++) {
            i5 <<= 1;
            if (zArr[i6]) {
                i5 |= 1;
            }
        }
        return i5;
    }

    public final d a(C0322a c0322a) {
        int i3;
        C0370a c0370a;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str;
        int i9;
        C0322a c0322a2 = c0322a;
        int i10 = 2;
        int i11 = 1;
        this.f3907a = c0322a2;
        boolean z3 = c0322a2.c;
        int i12 = z3 ? 11 : 14;
        int i13 = c0322a2.f3889e;
        int i14 = i12 + (i13 << 2);
        int[] iArr = new int[i14];
        int i15 = ((z3 ? 88 : 112) + (i13 << 4)) * i13;
        boolean[] zArr = new boolean[i15];
        if (z3) {
            for (int i16 = 0; i16 < i14; i16++) {
                iArr[i16] = i16;
            }
        } else {
            int i17 = i14 / 2;
            int i18 = ((((i17 - 1) / 15) * 2) + (i14 + 1)) / 2;
            for (int i19 = 0; i19 < i17; i19++) {
                iArr[(i17 - i19) - 1] = (i18 - r18) - 1;
                iArr[i17 + i19] = i18 + (i19 / 15) + i19 + 1;
            }
        }
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i20 >= i13) {
                break;
            }
            int i22 = ((i13 - i20) << 2) + (z3 ? 9 : 12);
            int i23 = i20 << 1;
            int i24 = (i14 - 1) - i23;
            int i25 = 0;
            while (i25 < i22) {
                int i26 = i25 << 1;
                int i27 = 0;
                while (i27 < i10) {
                    int i28 = i23 + i27;
                    int i29 = iArr[i28];
                    int i30 = i23 + i25;
                    int i31 = iArr[i30];
                    b bVar = c0322a2.f3886a;
                    zArr[i21 + i26 + i27] = bVar.b(i29, i31);
                    int i32 = i24 - i27;
                    zArr[(i22 * 2) + i21 + i26 + i27] = bVar.b(iArr[i30], iArr[i32]);
                    int i33 = i24 - i25;
                    zArr[(i22 * 4) + i21 + i26 + i27] = bVar.b(iArr[i32], iArr[i33]);
                    zArr[(i22 * 6) + i21 + i26 + i27] = bVar.b(iArr[i33], iArr[i28]);
                    i27++;
                    c0322a2 = c0322a;
                    z3 = z3;
                    i10 = 2;
                }
                i25++;
                i11 = 1;
                i10 = 2;
                c0322a2 = c0322a;
            }
            i21 += i22 << 3;
            i20 += i11;
            i10 = 2;
            c0322a2 = c0322a;
        }
        C0322a c0322a3 = this.f3907a;
        int i34 = c0322a3.f3889e;
        if (i34 <= 2) {
            c0370a = C0370a.f4642j;
            i4 = 6;
        } else if (i34 <= 8) {
            c0370a = C0370a.f4646n;
            i4 = 8;
        } else {
            if (i34 <= 22) {
                c0370a = C0370a.f4641i;
                i3 = 10;
            } else {
                c0370a = C0370a.h;
            }
            i4 = i3;
        }
        int i35 = i15 / i4;
        int i36 = c0322a3.f3888d;
        if (i35 < i36) {
            throw C0234d.a();
        }
        int i37 = i15 % i4;
        int[] iArr2 = new int[i35];
        int i38 = 0;
        while (i38 < i35) {
            iArr2[i38] = b(zArr, i37, i4);
            i38++;
            i37 += i4;
        }
        try {
            new C0150G(c0370a).n(iArr2, i35 - i36);
            int i39 = 1 << i4;
            int i40 = i39 - 1;
            int i41 = 0;
            for (int i42 = 0; i42 < i36; i42++) {
                int i43 = iArr2[i42];
                if (i43 == 0 || i43 == i40) {
                    throw C0234d.a();
                }
                if (i43 == 1 || i43 == i39 - 2) {
                    i41++;
                }
            }
            int i44 = (i36 * i4) - i41;
            boolean[] zArr2 = new boolean[i44];
            int i45 = 0;
            int i46 = 0;
            while (i45 < i36) {
                int i47 = iArr2[i45];
                int i48 = 1;
                if (i47 == 1 || i47 == i39 - 2) {
                    i9 = 1;
                    Arrays.fill(zArr2, i46, (i46 + i4) - 1, i47 > 1);
                    i46 = (i4 - 1) + i46;
                } else {
                    int i49 = i4 - 1;
                    while (i49 >= 0) {
                        int i50 = i46 + 1;
                        zArr2[i46] = (i47 & (i48 << i49)) != 0;
                        i49--;
                        i46 = i50;
                        i48 = 1;
                    }
                    i9 = i48;
                }
                i45 += i9;
            }
            int i51 = 8;
            int i52 = (i44 + 7) / 8;
            byte[] bArr = new byte[i52];
            int i53 = 0;
            while (i53 < i52) {
                int i54 = i53 << 3;
                int i55 = i44 - i54;
                bArr[i53] = i55 >= i51 ? (byte) b(zArr2, i54, i51) : (byte) (b(zArr2, i54, i55) << (8 - i55));
                i53++;
                i51 = 8;
            }
            StringBuilder sb = new StringBuilder(20);
            int i56 = 0;
            int i57 = 1;
            int i58 = 1;
            while (i56 < i44) {
                if (i57 != 6) {
                    int i59 = i57 == 4 ? 4 : 5;
                    if (i44 - i56 < i59) {
                        break;
                    }
                    int b3 = b(zArr2, i56, i59);
                    i56 += i59;
                    int a3 = h.a(i57);
                    if (a3 != 0) {
                        i5 = 1;
                        if (a3 != 1) {
                            i6 = 2;
                            if (a3 != 2) {
                                i7 = 3;
                                if (a3 != 3) {
                                    i8 = 4;
                                    if (a3 != 4) {
                                        throw new IllegalStateException("Bad table");
                                    }
                                    str = f3905e[b3];
                                } else {
                                    i8 = 4;
                                    str = f3906f[b3];
                                }
                            } else {
                                i7 = 3;
                                i8 = 4;
                                str = f3904d[b3];
                            }
                        } else {
                            i6 = 2;
                            i7 = 3;
                            i8 = 4;
                            str = c[b3];
                        }
                    } else {
                        i5 = 1;
                        i6 = 2;
                        i7 = 3;
                        i8 = 4;
                        str = f3903b[b3];
                    }
                    if (str.startsWith("CTRL_")) {
                        char charAt = str.charAt(5);
                        i58 = charAt != 'B' ? charAt != 'D' ? charAt != 'P' ? charAt != 'L' ? charAt != 'M' ? i5 : i7 : i6 : 5 : i8 : 6;
                        if (str.charAt(6) != 'L') {
                            int i60 = i58;
                            i58 = i57;
                            i57 = i60;
                        }
                    } else {
                        sb.append(str);
                    }
                    i57 = i58;
                } else {
                    if (i44 - i56 < 5) {
                        break;
                    }
                    int b4 = b(zArr2, i56, 5);
                    int i61 = i56 + 5;
                    if (b4 == 0) {
                        if (i44 - i61 < 11) {
                            break;
                        }
                        b4 = b(zArr2, i61, 11) + 31;
                        i61 = i56 + 16;
                    }
                    int i62 = 0;
                    while (true) {
                        if (i62 >= b4) {
                            i56 = i61;
                            break;
                        }
                        if (i44 - i61 < 8) {
                            i56 = i44;
                            break;
                        }
                        sb.append((char) b(zArr2, i61, 8));
                        i61 += 8;
                        i62++;
                    }
                    i57 = i58;
                }
            }
            return new d(bArr, sb.toString(), null, null);
        } catch (r1.b e3) {
            C0234d c0234d = C0234d.f3484d;
            if (AbstractC0241k.f3492b) {
                throw new Exception(e3);
            }
            throw C0234d.f3484d;
        }
    }
}
