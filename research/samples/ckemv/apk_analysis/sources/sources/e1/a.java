package E1;

import j1.C0244n;
import java.util.ArrayList;
import java.util.Arrays;
import p1.b;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f148a = {0, 4, 1, 5};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f149b = {6, 2, 7, 3};
    public static final int[] c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f150d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(b bVar) {
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int i5 = bVar.c;
        if (i5 > 0) {
            C0244n[] c0244nArr = new C0244n[8];
            int[] iArr = c;
            int i6 = bVar.f4328b;
            C0244n[] c3 = c(bVar, i5, i6, 0, 0, iArr);
            int[] iArr2 = f148a;
            for (int i7 = 0; i7 < 4; i7++) {
                c0244nArr[iArr2[i7]] = c3[i7];
            }
            C0244n c0244n = c0244nArr[4];
            if (c0244n != null) {
                int i8 = (int) c0244n.f3505a;
                i3 = (int) c0244n.f3506b;
                i4 = i8;
            } else {
                i3 = 0;
                i4 = 0;
            }
            C0244n[] c4 = c(bVar, i5, i6, i3, i4, f150d);
            int[] iArr3 = f149b;
            for (int i9 = 0; i9 < 4; i9++) {
                c0244nArr[iArr3[i9]] = c4[i9];
            }
            if (c0244nArr[0] != null || c0244nArr[3] != null) {
                arrayList.add(c0244nArr);
            }
        }
        return arrayList;
    }

    public static int[] b(b bVar, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i6 = 0;
        while (bVar.b(i3, i4) && i3 > 0) {
            int i7 = i6 + 1;
            if (i6 >= 3) {
                break;
            }
            i3--;
            i6 = i7;
        }
        int length = iArr.length;
        int i8 = i3;
        int i9 = 0;
        boolean z3 = false;
        while (i3 < i5) {
            if (bVar.b(i3, i4) != z3) {
                iArr2[i9] = iArr2[i9] + 1;
            } else {
                if (i9 != length - 1) {
                    i9++;
                } else {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i8, i3};
                    }
                    i8 += iArr2[0] + iArr2[1];
                    int i10 = i9 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i10);
                    iArr2[i10] = 0;
                    iArr2[i9] = 0;
                    i9--;
                }
                iArr2[i9] = 1;
                z3 = !z3;
            }
            i3++;
        }
        if (i9 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i8, i3 - 1};
    }

    public static C0244n[] c(b bVar, int i3, int i4, int i5, int i6, int[] iArr) {
        boolean z3;
        C0244n[] c0244nArr = new C0244n[4];
        int[] iArr2 = new int[iArr.length];
        int i7 = i5;
        while (true) {
            if (i7 >= i3) {
                z3 = false;
                break;
            }
            int[] b3 = b(bVar, i6, i7, i4, iArr, iArr2);
            if (b3 != null) {
                int i8 = i7;
                int[] iArr3 = b3;
                while (i8 > 0) {
                    int i9 = i8 - 1;
                    int[] b4 = b(bVar, i6, i9, i4, iArr, iArr2);
                    if (b4 == null) {
                        break;
                    }
                    iArr3 = b4;
                    i8 = i9;
                }
                float f3 = i8;
                c0244nArr[0] = new C0244n(iArr3[0], f3);
                c0244nArr[1] = new C0244n(iArr3[1], f3);
                z3 = true;
                i7 = i8;
            } else {
                i7 += 5;
            }
        }
        int i10 = i7 + 1;
        if (z3) {
            int[] iArr4 = {(int) c0244nArr[0].f3505a, (int) c0244nArr[1].f3505a};
            int i11 = i10;
            int i12 = 0;
            while (i11 < i3) {
                int[] b5 = b(bVar, iArr4[0], i11, i4, iArr, iArr2);
                if (b5 != null && Math.abs(iArr4[0] - b5[0]) < 5 && Math.abs(iArr4[1] - b5[1]) < 5) {
                    iArr4 = b5;
                    i12 = 0;
                } else {
                    if (i12 > 25) {
                        break;
                    }
                    i12++;
                }
                i11++;
            }
            i10 = i11 - (i12 + 1);
            float f4 = i10;
            c0244nArr[2] = new C0244n(iArr4[0], f4);
            c0244nArr[3] = new C0244n(iArr4[1], f4);
        }
        if (i10 - i7 < 10) {
            Arrays.fill(c0244nArr, (Object) null);
        }
        return c0244nArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            i3 += iArr[i5];
            i4 += iArr2[i5];
        }
        if (i3 < i4) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i3;
        float f4 = f3 / i4;
        float f5 = 0.8f * f4;
        float f6 = 0.0f;
        for (int i6 = 0; i6 < length; i6++) {
            float f7 = iArr2[i6] * f4;
            float f8 = iArr[i6];
            float f9 = f8 > f7 ? f8 - f7 : f7 - f8;
            if (f9 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f9;
        }
        return f6 / f3;
    }
}
