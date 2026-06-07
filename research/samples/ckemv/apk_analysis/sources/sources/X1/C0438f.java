package x1;

import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import java.util.Map;
import p1.C0356a;

/* renamed from: x1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438f extends AbstractC0440h {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5230b = {6, 8, 10, 12, 14};
    public static final int[] c = {1, 1, 1, 1};

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f5231d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f5232e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a, reason: collision with root package name */
    public int f5233a = -1;

    public static int i(int[] iArr) {
        float f3 = 0.38f;
        int i3 = -1;
        for (int i4 = 0; i4 < 20; i4++) {
            float f4 = AbstractC0440h.f(iArr, f5232e[i4], 0.5f);
            if (f4 < f3) {
                i3 = i4;
                f3 = f4;
            } else if (f4 == f3) {
                i3 = -1;
            }
        }
        if (i3 >= 0) {
            return i3 % 10;
        }
        throw C0238h.f3489d;
    }

    public static int[] j(int i3, C0356a c0356a, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i4 = c0356a.c;
        int i5 = i3;
        boolean z3 = false;
        int i6 = 0;
        while (i3 < i4) {
            if (c0356a.a(i3) != z3) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (AbstractC0440h.f(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i5, i3};
                    }
                    i5 += iArr2[0] + iArr2[1];
                    int i7 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z3 = !z3;
            }
            i3++;
        }
        throw C0238h.f3489d;
    }

    @Override // x1.AbstractC0440h
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        int[] j3;
        boolean z3;
        int i4 = c0356a.c;
        int b3 = c0356a.b(0);
        if (b3 == i4) {
            throw C0238h.f3489d;
        }
        int[] j4 = j(b3, c0356a, c);
        int i5 = j4[1];
        int i6 = j4[0];
        this.f5233a = (i5 - i6) / 4;
        k(c0356a, i6);
        int[][] iArr = f5231d;
        c0356a.e();
        try {
            int i7 = c0356a.c;
            int b4 = c0356a.b(0);
            if (b4 == i7) {
                throw C0238h.f3489d;
            }
            try {
                j3 = j(b4, c0356a, iArr[0]);
            } catch (C0238h unused) {
                j3 = j(b4, c0356a, iArr[1]);
            }
            k(c0356a, j3[0]);
            int i8 = j3[0];
            int i9 = c0356a.c;
            j3[0] = i9 - j3[1];
            j3[1] = i9 - i8;
            c0356a.e();
            StringBuilder sb = new StringBuilder(20);
            int i10 = j4[1];
            int i11 = j3[0];
            int[] iArr2 = new int[10];
            int[] iArr3 = new int[5];
            int[] iArr4 = new int[5];
            while (i10 < i11) {
                AbstractC0440h.g(i10, c0356a, iArr2);
                for (int i12 = 0; i12 < 5; i12++) {
                    int i13 = i12 * 2;
                    iArr3[i12] = iArr2[i13];
                    iArr4[i12] = iArr2[i13 + 1];
                }
                sb.append((char) (i(iArr3) + 48));
                sb.append((char) (i(iArr4) + 48));
                for (int i14 = 0; i14 < 10; i14++) {
                    i10 += iArr2[i14];
                }
            }
            String sb2 = sb.toString();
            int[] iArr5 = map != null ? (int[]) map.get(EnumC0233c.g) : null;
            if (iArr5 == null) {
                iArr5 = f5230b;
            }
            int length = sb2.length();
            int length2 = iArr5.length;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i15 >= length2) {
                    z3 = false;
                    break;
                }
                int i17 = iArr5[i15];
                if (length == i17) {
                    z3 = true;
                    break;
                }
                if (i17 > i16) {
                    i16 = i17;
                }
                i15++;
            }
            if ((z3 || length <= i16) && !z3) {
                throw C0234d.a();
            }
            float f3 = i3;
            return new C0242l(sb2, null, new C0244n[]{new C0244n(j4[1], f3), new C0244n(j3[0], f3)}, EnumC0231a.f3464j);
        } catch (Throwable th) {
            c0356a.e();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(C0356a c0356a, int i3) {
        int min = Math.min(this.f5233a * 10, i3);
        for (int i4 = i3 - 1; min > 0 && i4 >= 0 && !c0356a.a(i4); i4--) {
            min--;
        }
        throw C0238h.f3489d;
    }
}
