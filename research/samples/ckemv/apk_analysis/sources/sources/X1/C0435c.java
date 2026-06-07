package x1;

import j1.C0232b;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import java.util.Arrays;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435c extends AbstractC0440h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5219d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5220a;

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f5221b = new StringBuilder(20);
    public final int[] c = new int[9];

    public C0435c(boolean z3) {
        this.f5220a = z3;
    }

    public static int i(int[] iArr) {
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 : iArr) {
                if (i5 < i4 && i5 > i3) {
                    i4 = i5;
                }
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = iArr[i9];
                if (i10 > i4) {
                    i7 |= 1 << ((length - 1) - i9);
                    i6++;
                    i8 += i10;
                }
            }
            if (i6 == 3) {
                for (int i11 = 0; i11 < length && i6 > 0; i11++) {
                    int i12 = iArr[i11];
                    if (i12 > i4) {
                        i6--;
                        if ((i12 << 1) >= i8) {
                            return -1;
                        }
                    }
                }
                return i7;
            }
            if (i6 <= 3) {
                return -1;
            }
            i3 = i4;
        }
    }

    @Override // x1.AbstractC0440h
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        char c;
        int[] iArr = this.c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f5221b;
        sb.setLength(0);
        int i4 = c0356a.c;
        int b3 = c0356a.b(0);
        int length = iArr.length;
        boolean z3 = false;
        int i5 = 0;
        int i6 = b3;
        while (b3 < i4) {
            if (c0356a.a(b3) != z3) {
                iArr[i5] = iArr[i5] + 1;
            } else {
                if (i5 != length - 1) {
                    i5++;
                } else if (i(iArr) == 148 && c0356a.d(Math.max(0, i6 - ((b3 - i6) / 2)), i6)) {
                    int b4 = c0356a.b(new int[]{i6, b3}[1]);
                    while (true) {
                        AbstractC0440h.g(b4, c0356a, iArr);
                        int i7 = i(iArr);
                        if (i7 < 0) {
                            throw C0238h.f3489d;
                        }
                        int i8 = 0;
                        while (true) {
                            if (i8 < 43) {
                                if (f5219d[i8] == i7) {
                                    c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8);
                                    break;
                                }
                                i8++;
                            } else {
                                if (i7 != 148) {
                                    throw C0238h.f3489d;
                                }
                                c = '*';
                            }
                        }
                        sb.append(c);
                        int i9 = b4;
                        for (int i10 : iArr) {
                            i9 += i10;
                        }
                        int b5 = c0356a.b(i9);
                        if (c == '*') {
                            sb.setLength(sb.length() - 1);
                            int i11 = 0;
                            for (int i12 : iArr) {
                                i11 += i12;
                            }
                            int i13 = (b5 - b4) - i11;
                            if (b5 != c0356a.c && (i13 << 1) < i11) {
                                throw C0238h.f3489d;
                            }
                            if (this.f5220a) {
                                int length2 = sb.length() - 1;
                                int i14 = 0;
                                for (int i15 = 0; i15 < length2; i15++) {
                                    i14 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i15));
                                }
                                if (sb.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i14 % 43)) {
                                    throw C0232b.a();
                                }
                                sb.setLength(length2);
                            }
                            if (sb.length() == 0) {
                                throw C0238h.f3489d;
                            }
                            float f3 = (r5[1] + r5[0]) / 2.0f;
                            float f4 = (i11 / 2.0f) + b4;
                            float f5 = i3;
                            return new C0242l(sb.toString(), null, new C0244n[]{new C0244n(f3, f5), new C0244n(f4, f5)}, EnumC0231a.f3460d);
                        }
                        b4 = b5;
                    }
                } else {
                    i6 += iArr[0] + iArr[1];
                    int i16 = i5 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i16);
                    iArr[i16] = 0;
                    iArr[i5] = 0;
                    i5--;
                }
                iArr[i5] = 1;
                z3 = !z3;
            }
            b3++;
        }
        throw C0238h.f3489d;
    }
}
