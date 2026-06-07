package H1;

import j1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final d f285f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final p1.b f286a;
    public boolean c;

    /* renamed from: e, reason: collision with root package name */
    public final o f289e;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f287b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final int[] f288d = new int[5];

    public e(p1.b bVar, o oVar) {
        this.f286a = bVar;
        this.f289e = oVar;
    }

    public static float a(int[] iArr, int i3) {
        return ((i3 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = iArr[i4];
            if (i5 == 0) {
                return false;
            }
            i3 += i5;
        }
        if (i3 < 7) {
            return false;
        }
        float f3 = i3 / 7.0f;
        float f4 = f3 / 2.0f;
        return Math.abs(f3 - ((float) iArr[0])) < f4 && Math.abs(f3 - ((float) iArr[1])) < f4 && Math.abs((f3 * 3.0f) - ((float) iArr[2])) < 3.0f * f4 && Math.abs(f3 - ((float) iArr[3])) < f4 && Math.abs(f3 - ((float) iArr[4])) < f4;
    }

    public static double e(c cVar, c cVar2) {
        double d3 = cVar.f3505a - cVar2.f3505a;
        double d4 = cVar.f3506b - cVar2.f3506b;
        return (d4 * d4) + (d3 * d3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ee, code lost:
    
        r10 = r6.f284d;
        r11 = r10 + 1;
        r10 = r10;
        r7 = (r7 * r10) + r1;
        r1 = r11;
        r5.set(r3, new H1.c(r7 / r1, ((r6.f3506b * r10) + r9) / r1, ((r10 * r8) + r2) / r1, r11));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i3, int i4, int[] iArr) {
        float a3;
        float a4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a5 = (int) a(iArr, i4);
        int i10 = iArr[2];
        p1.b bVar = this.f286a;
        int i11 = bVar.c;
        int[] iArr2 = this.f288d;
        Arrays.fill(iArr2, 0);
        int i12 = i3;
        while (i12 >= 0 && bVar.b(a5, i12)) {
            iArr2[2] = iArr2[2] + 1;
            i12--;
        }
        if (i12 >= 0) {
            while (i12 >= 0 && !bVar.b(a5, i12)) {
                int i13 = iArr2[1];
                if (i13 > i10) {
                    break;
                }
                iArr2[1] = i13 + 1;
                i12--;
            }
            if (i12 >= 0 && iArr2[1] <= i10) {
                while (i12 >= 0 && bVar.b(a5, i12)) {
                    int i14 = iArr2[0];
                    if (i14 > i10) {
                        break;
                    }
                    iArr2[0] = i14 + 1;
                    i12--;
                }
                if (iArr2[0] <= i10) {
                    int i15 = i3 + 1;
                    while (i15 < i11 && bVar.b(a5, i15)) {
                        iArr2[2] = iArr2[2] + 1;
                        i15++;
                    }
                    if (i15 != i11) {
                        while (i15 < i11 && !bVar.b(a5, i15)) {
                            int i16 = iArr2[3];
                            if (i16 >= i10) {
                                break;
                            }
                            iArr2[3] = i16 + 1;
                            i15++;
                        }
                        if (i15 != i11 && iArr2[3] < i10) {
                            while (i15 < i11 && bVar.b(a5, i15)) {
                                int i17 = iArr2[4];
                                if (i17 >= i10) {
                                    break;
                                }
                                iArr2[4] = i17 + 1;
                                i15++;
                            }
                            int i18 = iArr2[4];
                            if (i18 < i10 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + i18) - i9) * 5 < i9 * 2 && b(iArr2)) {
                                a3 = a(iArr2, i15);
                                if (!Float.isNaN(a3)) {
                                    int i19 = (int) a3;
                                    int i20 = iArr[2];
                                    Arrays.fill(iArr2, 0);
                                    int i21 = a5;
                                    while (i21 >= 0 && bVar.b(i21, i19)) {
                                        iArr2[2] = iArr2[2] + 1;
                                        i21--;
                                    }
                                    int i22 = bVar.f4328b;
                                    if (i21 >= 0) {
                                        while (i21 >= 0 && !bVar.b(i21, i19)) {
                                            int i23 = iArr2[1];
                                            if (i23 > i20) {
                                                break;
                                            }
                                            iArr2[1] = i23 + 1;
                                            i21--;
                                        }
                                        if (i21 >= 0 && iArr2[1] <= i20) {
                                            while (i21 >= 0 && bVar.b(i21, i19)) {
                                                int i24 = iArr2[0];
                                                if (i24 > i20) {
                                                    break;
                                                }
                                                iArr2[0] = i24 + 1;
                                                i21--;
                                            }
                                            if (iArr2[0] <= i20) {
                                                int i25 = a5 + 1;
                                                while (i25 < i22 && bVar.b(i25, i19)) {
                                                    iArr2[2] = iArr2[2] + 1;
                                                    i25++;
                                                }
                                                if (i25 != i22) {
                                                    while (i25 < i22 && !bVar.b(i25, i19)) {
                                                        int i26 = iArr2[3];
                                                        if (i26 >= i20) {
                                                            break;
                                                        }
                                                        iArr2[3] = i26 + 1;
                                                        i25++;
                                                    }
                                                    if (i25 != i22 && iArr2[3] < i20) {
                                                        while (i25 < i22 && bVar.b(i25, i19)) {
                                                            int i27 = iArr2[4];
                                                            if (i27 >= i20) {
                                                                break;
                                                            }
                                                            iArr2[4] = i27 + 1;
                                                            i25++;
                                                        }
                                                        int i28 = iArr2[4];
                                                        if (i28 < i20 && Math.abs(((((iArr2[0] + iArr2[1]) + iArr2[2]) + iArr2[3]) + i28) - i9) * 5 < i9 && b(iArr2)) {
                                                            a4 = a(iArr2, i25);
                                                            if (!Float.isNaN(a4)) {
                                                                int i29 = (int) a4;
                                                                Arrays.fill(iArr2, 0);
                                                                int i30 = 0;
                                                                while (i19 >= i30 && i29 >= i30 && bVar.b(i29 - i30, i19 - i30)) {
                                                                    iArr2[2] = iArr2[2] + 1;
                                                                    i30++;
                                                                }
                                                                if (iArr2[2] != 0) {
                                                                    while (i19 >= i30 && i29 >= i30 && !bVar.b(i29 - i30, i19 - i30)) {
                                                                        iArr2[1] = iArr2[1] + 1;
                                                                        i30++;
                                                                    }
                                                                    if (iArr2[1] != 0) {
                                                                        while (i19 >= i30 && i29 >= i30 && bVar.b(i29 - i30, i19 - i30)) {
                                                                            iArr2[0] = iArr2[0] + 1;
                                                                            i30++;
                                                                        }
                                                                        if (iArr2[0] != 0) {
                                                                            int i31 = 1;
                                                                            while (true) {
                                                                                int i32 = i19 + i31;
                                                                                i5 = bVar.c;
                                                                                if (i32 >= i5 || (i8 = i29 + i31) >= i22 || !bVar.b(i8, i32)) {
                                                                                    break;
                                                                                }
                                                                                iArr2[2] = iArr2[2] + 1;
                                                                                i31++;
                                                                            }
                                                                            while (true) {
                                                                                int i33 = i19 + i31;
                                                                                if (i33 >= i5 || (i7 = i29 + i31) >= i22 || bVar.b(i7, i33)) {
                                                                                    break;
                                                                                }
                                                                                iArr2[3] = iArr2[3] + 1;
                                                                                i31++;
                                                                            }
                                                                            if (iArr2[3] != 0) {
                                                                                while (true) {
                                                                                    int i34 = i19 + i31;
                                                                                    if (i34 >= i5 || (i6 = i29 + i31) >= i22 || !bVar.b(i6, i34)) {
                                                                                        break;
                                                                                    }
                                                                                    iArr2[4] = iArr2[4] + 1;
                                                                                    i31++;
                                                                                }
                                                                                if (iArr2[4] != 0) {
                                                                                    int i35 = 0;
                                                                                    int i36 = 0;
                                                                                    while (true) {
                                                                                        if (i35 < 5) {
                                                                                            int i37 = iArr2[i35];
                                                                                            if (i37 == 0) {
                                                                                                break;
                                                                                            }
                                                                                            i36 += i37;
                                                                                            i35++;
                                                                                        } else if (i36 >= 7) {
                                                                                            float f3 = i36 / 7.0f;
                                                                                            float f4 = f3 / 1.333f;
                                                                                            if (Math.abs(f3 - iArr2[0]) < f4 && Math.abs(f3 - iArr2[1]) < f4 && Math.abs((f3 * 3.0f) - iArr2[2]) < 3.0f * f4 && Math.abs(f3 - iArr2[3]) < f4 && Math.abs(f3 - iArr2[4]) < f4) {
                                                                                                float f5 = i9 / 7.0f;
                                                                                                int i38 = 0;
                                                                                                while (true) {
                                                                                                    ArrayList arrayList = this.f287b;
                                                                                                    if (i38 < arrayList.size()) {
                                                                                                        c cVar = (c) arrayList.get(i38);
                                                                                                        if (Math.abs(a3 - cVar.f3506b) <= f5) {
                                                                                                            float f6 = cVar.f3505a;
                                                                                                            if (Math.abs(a4 - f6) <= f5) {
                                                                                                                float f7 = cVar.c;
                                                                                                                float abs = Math.abs(f5 - f7);
                                                                                                                if (abs <= 1.0f || abs <= f7) {
                                                                                                                    break;
                                                                                                                }
                                                                                                            } else {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        i38++;
                                                                                                    } else {
                                                                                                        c cVar2 = new c(a4, a3, f5, 1);
                                                                                                        arrayList.add(cVar2);
                                                                                                        o oVar = this.f289e;
                                                                                                        if (oVar != null) {
                                                                                                            oVar.a(cVar2);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    a4 = Float.NaN;
                                    if (!Float.isNaN(a4)) {
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        a3 = Float.NaN;
        if (!Float.isNaN(a3)) {
        }
        return false;
    }

    public final boolean d() {
        ArrayList arrayList = this.f287b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f3 = 0.0f;
        int i3 = 0;
        float f4 = 0.0f;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f284d >= 2) {
                i3++;
                f4 += cVar.c;
            }
        }
        if (i3 < 3) {
            return false;
        }
        float f5 = f4 / size;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f3 += Math.abs(((c) it2.next()).c - f5);
        }
        return f3 <= f4 * 0.05f;
    }
}
