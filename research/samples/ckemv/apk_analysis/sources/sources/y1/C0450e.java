package y1;

import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import j1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p1.C0356a;
import v0.f;
import x1.AbstractC0440h;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450e extends AbstractC0446a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f5268i = {1, 10, 34, 70, 126};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f5269j = {4, 20, 48, 81};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5270k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5271l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5272m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5273n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f5274o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static void l(ArrayList arrayList, C0449d c0449d) {
        if (c0449d == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0449d c0449d2 = (C0449d) it.next();
            if (c0449d2.f5263a == c0449d.f5263a) {
                c0449d2.f5267d++;
                return;
            }
        }
        arrayList.add(c0449d);
    }

    @Override // x1.AbstractC0440h, j1.InterfaceC0240j
    public final void c() {
        this.g.clear();
        this.h.clear();
    }

    @Override // x1.AbstractC0440h
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        C0449d n3 = n(c0356a, false, i3, map);
        ArrayList arrayList = this.g;
        l(arrayList, n3);
        c0356a.e();
        C0449d n4 = n(c0356a, true, i3, map);
        ArrayList arrayList2 = this.h;
        l(arrayList2, n4);
        c0356a.e();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0449d c0449d = (C0449d) it.next();
            if (c0449d.f5267d > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C0449d c0449d2 = (C0449d) it2.next();
                    if (c0449d2.f5267d > 1) {
                        int i4 = ((c0449d2.f5264b * 16) + c0449d.f5264b) % 79;
                        C0448c c0448c = c0449d.c;
                        int i5 = c0448c.f5265a * 9;
                        C0448c c0448c2 = c0449d2.c;
                        int i6 = i5 + c0448c2.f5265a;
                        if (i6 > 72) {
                            i6--;
                        }
                        if (i6 > 8) {
                            i6--;
                        }
                        if (i4 == i6) {
                            String valueOf = String.valueOf((c0449d.f5263a * 4537077) + c0449d2.f5263a);
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i7 = 0;
                            for (int i8 = 0; i8 < 13; i8++) {
                                int charAt = sb.charAt(i8) - '0';
                                if ((i8 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i7 += charAt;
                            }
                            int i9 = 10 - (i7 % 10);
                            if (i9 == 10) {
                                i9 = 0;
                            }
                            sb.append(i9);
                            String sb2 = sb.toString();
                            C0244n[] c0244nArr = c0448c.c;
                            C0244n c0244n = c0244nArr[0];
                            C0244n c0244n2 = c0244nArr[1];
                            C0244n[] c0244nArr2 = c0448c2.c;
                            return new C0242l(sb2, null, new C0244n[]{c0244n, c0244n2, c0244nArr2[0], c0244nArr2[1]}, EnumC0231a.f3468n);
                        }
                    }
                }
            }
        }
        throw C0238h.f3489d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0093, code lost:
    
        if (r6 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0095, code lost:
    
        r17 = false;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009a, code lost:
    
        r16 = false;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b1, code lost:
    
        if (r6 < 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0447b m(C0356a c0356a, C0448c c0448c, boolean z3) {
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int[] iArr3 = this.f5259b;
        Arrays.fill(iArr3, 0);
        int[] iArr4 = c0448c.f5266b;
        if (z3) {
            AbstractC0440h.h(iArr4[0], c0356a, iArr3);
        } else {
            AbstractC0440h.g(iArr4[1], c0356a, iArr3);
            int i3 = 0;
            for (int length = iArr3.length - 1; i3 < length; length--) {
                int i4 = iArr3[i3];
                iArr3[i3] = iArr3[length];
                iArr3[length] = i4;
                i3++;
            }
        }
        int i5 = z3 ? 16 : 15;
        float O2 = f.O(iArr3) / i5;
        int i6 = 0;
        while (true) {
            int length2 = iArr3.length;
            fArr = this.f5260d;
            fArr2 = this.c;
            iArr = this.f5262f;
            iArr2 = this.f5261e;
            if (i6 >= length2) {
                break;
            }
            float f3 = iArr3[i6] / O2;
            int i7 = (int) (0.5f + f3);
            if (i7 <= 0) {
                i7 = 1;
            } else if (i7 > 8) {
                i7 = 8;
            }
            int i8 = i6 / 2;
            if ((i6 & 1) == 0) {
                iArr2[i8] = i7;
                fArr2[i8] = f3 - i7;
            } else {
                iArr[i8] = i7;
                fArr[i8] = f3 - i7;
            }
            i6++;
        }
        int O3 = f.O(iArr2);
        int O4 = f.O(iArr);
        if (z3) {
            if (O3 > 12) {
                z4 = false;
                z5 = true;
            } else if (O3 < 4) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
            if (O4 <= 12) {
            }
            z6 = false;
            z7 = true;
        } else {
            if (O3 > 11) {
                z4 = false;
                z5 = true;
            } else if (O3 < 5) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
            if (O4 <= 10) {
            }
            z6 = false;
            z7 = true;
        }
        int i9 = (O3 + O4) - i5;
        boolean z8 = (O3 & 1) == z3;
        boolean z9 = (O4 & 1) == 1;
        if (i9 != -1) {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw C0238h.f3489d;
                }
                if (z8) {
                    if (z9) {
                        throw C0238h.f3489d;
                    }
                    z5 = true;
                } else {
                    if (!z9) {
                        throw C0238h.f3489d;
                    }
                    z7 = true;
                }
            } else if (z8) {
                if (!z9) {
                    throw C0238h.f3489d;
                }
                if (O3 < O4) {
                    z4 = true;
                    z7 = true;
                } else {
                    z5 = true;
                    z6 = true;
                }
            } else if (z9) {
                throw C0238h.f3489d;
            }
        } else if (z8) {
            if (z9) {
                throw C0238h.f3489d;
            }
            z4 = true;
        } else {
            if (!z9) {
                throw C0238h.f3489d;
            }
            z6 = true;
        }
        if (z4) {
            if (z5) {
                throw C0238h.f3489d;
            }
            AbstractC0446a.j(iArr2, fArr2);
        }
        if (z5) {
            AbstractC0446a.i(iArr2, fArr2);
        }
        if (z6) {
            if (z7) {
                throw C0238h.f3489d;
            }
            AbstractC0446a.j(iArr, fArr2);
        }
        if (z7) {
            AbstractC0446a.i(iArr, fArr);
        }
        int i10 = 0;
        int i11 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i12 = iArr2[length3];
            i10 = (i10 * 9) + i12;
            i11 += i12;
        }
        int i13 = 0;
        int i14 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i15 = iArr[length4];
            i13 = (i13 * 9) + i15;
            i14 += i15;
        }
        int i16 = (i13 * 3) + i10;
        if (!z3) {
            if ((i14 & 1) != 0 || i14 > 10 || i14 < 4) {
                throw C0238h.f3489d;
            }
            int i17 = (10 - i14) / 2;
            int i18 = f5273n[i17];
            return new C0447b((u2.d.o(iArr, 9 - i18, false) * f5269j[i17]) + u2.d.o(iArr2, i18, true) + f5271l[i17], i16);
        }
        if ((i11 & 1) != 0 || i11 > 12 || i11 < 4) {
            throw C0238h.f3489d;
        }
        int i19 = (12 - i11) / 2;
        int i20 = f5272m[i19];
        return new C0447b((u2.d.o(iArr2, i20, false) * f5268i[i19]) + u2.d.o(iArr, 9 - i20, true) + f5270k[i19], i16);
    }

    public final C0449d n(C0356a c0356a, boolean z3, int i3, Map map) {
        try {
            C0448c p3 = p(c0356a, i3, z3, o(c0356a, z3));
            o oVar = map == null ? null : (o) map.get(EnumC0233c.f3480k);
            if (oVar != null) {
                int[] iArr = p3.f5266b;
                float f3 = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z3) {
                    f3 = (c0356a.c - 1) - f3;
                }
                oVar.a(new C0244n(f3, i3));
            }
            C0447b m3 = m(c0356a, p3, true);
            C0447b m4 = m(c0356a, p3, false);
            return new C0449d((m3.f5263a * 1597) + m4.f5263a, (m4.f5264b * 4) + m3.f5264b, p3);
        } catch (C0238h unused) {
            return null;
        }
    }

    public final int[] o(C0356a c0356a, boolean z3) {
        int[] iArr = this.f5258a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i3 = c0356a.c;
        int i4 = 0;
        boolean z4 = false;
        while (i4 < i3) {
            z4 = !c0356a.a(i4);
            if (z3 == z4) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        int i6 = i4;
        while (i4 < i3) {
            if (c0356a.a(i4) != z4) {
                iArr[i5] = iArr[i5] + 1;
            } else {
                if (i5 != 3) {
                    i5++;
                } else {
                    if (AbstractC0446a.k(iArr)) {
                        return new int[]{i6, i4};
                    }
                    i6 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i5--;
                }
                iArr[i5] = 1;
                z4 = !z4;
            }
            i4++;
        }
        throw C0238h.f3489d;
    }

    public final C0448c p(C0356a c0356a, int i3, boolean z3, int[] iArr) {
        int i4;
        int i5;
        boolean a3 = c0356a.a(iArr[0]);
        int i6 = iArr[0] - 1;
        while (i6 >= 0 && a3 != c0356a.a(i6)) {
            i6--;
        }
        int i7 = i6 + 1;
        int i8 = iArr[0] - i7;
        int[] iArr2 = this.f5258a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i8;
        int[][] iArr3 = f5274o;
        for (int i9 = 0; i9 < 9; i9++) {
            if (AbstractC0440h.f(iArr2, iArr3[i9], 0.45f) < 0.2f) {
                int i10 = iArr[1];
                if (z3) {
                    int i11 = c0356a.c - 1;
                    i4 = i11 - i10;
                    i5 = i11 - i7;
                } else {
                    i4 = i10;
                    i5 = i7;
                }
                return new C0448c(i9, i5, i4, i3, new int[]{i7, i10});
            }
        }
        throw C0238h.f3489d;
    }
}
