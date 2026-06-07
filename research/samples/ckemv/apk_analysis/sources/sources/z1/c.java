package z1;

import A1.f;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p1.C0356a;
import u2.d;
import v0.m;
import x1.AbstractC0440h;
import y1.AbstractC0446a;
import y1.C0447b;
import y1.C0448c;

/* loaded from: classes.dex */
public final class c extends AbstractC0446a {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5318k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5319l = {4, 20, 52, 104, 204};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f5320m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    public static final int[][] f5321n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f5322o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    public static final int[][] f5323p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    public final ArrayList g = new ArrayList(11);
    public final ArrayList h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int[] f5324i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    public boolean f5325j;

    public static C0242l o(List list) {
        f aVar;
        int size = list.size() << 1;
        int i3 = size - 1;
        if (((C0467a) list.get(list.size() - 1)).f5315b == null) {
            i3 = size - 2;
        }
        C0356a c0356a = new C0356a(i3 * 12);
        int i4 = ((C0467a) list.get(0)).f5315b.f5263a;
        int i5 = 0;
        for (int i6 = 11; i6 >= 0; i6--) {
            if (((1 << i6) & i4) != 0) {
                c0356a.f(i5);
            }
            i5++;
        }
        for (int i7 = 1; i7 < list.size(); i7++) {
            C0467a c0467a = (C0467a) list.get(i7);
            int i8 = c0467a.f5314a.f5263a;
            for (int i9 = 11; i9 >= 0; i9--) {
                if (((1 << i9) & i8) != 0) {
                    c0356a.f(i5);
                }
                i5++;
            }
            C0447b c0447b = c0467a.f5315b;
            if (c0447b != null) {
                for (int i10 = 11; i10 >= 0; i10--) {
                    if (((1 << i10) & c0447b.f5263a) != 0) {
                        c0356a.f(i5);
                    }
                    i5++;
                }
            }
        }
        if (c0356a.a(1)) {
            aVar = new A1.b(c0356a, 2);
        } else if (c0356a.a(2)) {
            int j3 = m.j(1, 4, c0356a);
            if (j3 == 4) {
                aVar = new A1.a(c0356a, 0);
            } else if (j3 != 5) {
                int j4 = m.j(1, 5, c0356a);
                if (j4 == 12) {
                    aVar = new A1.b(c0356a, 0);
                } else if (j4 != 13) {
                    switch (m.j(1, 7, c0356a)) {
                        case 56:
                            aVar = new A1.c(c0356a, "310", "11");
                            break;
                        case 57:
                            aVar = new A1.c(c0356a, "320", "11");
                            break;
                        case 58:
                            aVar = new A1.c(c0356a, "310", "13");
                            break;
                        case 59:
                            aVar = new A1.c(c0356a, "320", "13");
                            break;
                        case 60:
                            aVar = new A1.c(c0356a, "310", "15");
                            break;
                        case 61:
                            aVar = new A1.c(c0356a, "320", "15");
                            break;
                        case 62:
                            aVar = new A1.c(c0356a, "310", "17");
                            break;
                        case 63:
                            aVar = new A1.c(c0356a, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c0356a)));
                    }
                } else {
                    aVar = new A1.b(c0356a, 1);
                }
            } else {
                aVar = new A1.a(c0356a, 1);
            }
        } else {
            aVar = new f(c0356a);
        }
        String j5 = aVar.j();
        C0244n[] c0244nArr = ((C0467a) list.get(0)).c.c;
        C0244n[] c0244nArr2 = ((C0467a) list.get(list.size() - 1)).c.c;
        return new C0242l(j5, null, new C0244n[]{c0244nArr[0], c0244nArr[1], c0244nArr2[0], c0244nArr2[1]}, EnumC0231a.f3469o);
    }

    @Override // x1.AbstractC0440h, j1.InterfaceC0240j
    public final void c() {
        this.g.clear();
        this.h.clear();
    }

    @Override // x1.AbstractC0440h
    public final C0242l d(int i3, C0356a c0356a, Map map) {
        ArrayList arrayList = this.g;
        arrayList.clear();
        this.f5325j = false;
        try {
            return o(q(c0356a, i3));
        } catch (C0238h unused) {
            arrayList.clear();
            this.f5325j = true;
            return o(q(c0356a, i3));
        }
    }

    public final boolean l() {
        ArrayList arrayList = this.g;
        C0467a c0467a = (C0467a) arrayList.get(0);
        C0447b c0447b = c0467a.f5314a;
        C0447b c0447b2 = c0467a.f5315b;
        if (c0447b2 == null) {
            return false;
        }
        int i3 = 2;
        int i4 = c0447b2.f5264b;
        for (int i5 = 1; i5 < arrayList.size(); i5++) {
            C0467a c0467a2 = (C0467a) arrayList.get(i5);
            i4 += c0467a2.f5314a.f5264b;
            int i6 = i3 + 1;
            C0447b c0447b3 = c0467a2.f5315b;
            if (c0447b3 != null) {
                i4 += c0447b3.f5264b;
                i3 += 2;
            } else {
                i3 = i6;
            }
        }
        return ((i3 + (-4)) * 211) + (i4 % 211) == c0447b.f5263a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (l() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r1 = new java.util.ArrayList(r10);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        return m(r1, r11 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m(ArrayList arrayList, int i3) {
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i3 >= arrayList2.size()) {
                throw C0238h.f3489d;
            }
            b bVar = (b) arrayList2.get(i3);
            ArrayList arrayList3 = this.g;
            arrayList3.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((b) it.next()).f5316a);
            }
            arrayList3.addAll(bVar.f5316a);
            int[][] iArr = f5323p;
            int i4 = 0;
            while (true) {
                if (i4 < 10) {
                    int[] iArr2 = iArr[i4];
                    if (arrayList3.size() <= iArr2.length) {
                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                            if (((C0467a) arrayList3.get(i5)).c.f5265a != iArr2[i5]) {
                                break;
                            }
                        }
                        break;
                    }
                    i4++;
                }
            }
            i3++;
        }
    }

    public final List n(boolean z3) {
        ArrayList arrayList = this.h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.g.clear();
        if (z3) {
            Collections.reverse(arrayList);
        }
        try {
            list = m(new ArrayList(), 0);
        } catch (C0238h unused) {
        }
        if (z3) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    public final C0447b p(C0356a c0356a, C0448c c0448c, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int[][] iArr;
        int[] iArr2 = this.f5259b;
        Arrays.fill(iArr2, 0);
        if (z4) {
            AbstractC0440h.h(c0448c.f5266b[0], c0356a, iArr2);
        } else {
            AbstractC0440h.g(c0448c.f5266b[1], c0356a, iArr2);
            int i3 = 0;
            for (int length = iArr2.length - 1; i3 < length; length--) {
                int i4 = iArr2[i3];
                iArr2[i3] = iArr2[length];
                iArr2[length] = i4;
                i3++;
            }
        }
        float O2 = v0.f.O(iArr2) / 17.0f;
        int[] iArr3 = c0448c.f5266b;
        float f3 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(O2 - f3) / f3 > 0.3f) {
            throw C0238h.f3489d;
        }
        int i5 = 0;
        while (true) {
            int length2 = iArr2.length;
            float[] fArr = this.f5260d;
            float[] fArr2 = this.c;
            int[] iArr4 = this.f5262f;
            int[] iArr5 = this.f5261e;
            if (i5 >= length2) {
                int O3 = v0.f.O(iArr5);
                int O4 = v0.f.O(iArr4);
                if (O3 > 13) {
                    z5 = false;
                    z6 = true;
                } else if (O3 < 4) {
                    z6 = false;
                    z5 = true;
                } else {
                    z5 = false;
                    z6 = false;
                }
                if (O4 > 13) {
                    z7 = false;
                    z8 = true;
                } else if (O4 < 4) {
                    z8 = false;
                    z7 = true;
                } else {
                    z7 = false;
                    z8 = false;
                }
                int i6 = (O3 + O4) - 17;
                boolean z9 = (O3 & 1) == 1;
                boolean z10 = (O4 & 1) == 0;
                boolean z11 = z5;
                boolean z12 = z6;
                boolean z13 = z7;
                boolean z14 = z8;
                if (i6 != -1) {
                    if (i6 != 0) {
                        if (i6 != 1) {
                            throw C0238h.f3489d;
                        }
                        if (z9) {
                            if (z10) {
                                throw C0238h.f3489d;
                            }
                            z12 = true;
                            z11 = z5;
                            z13 = z7;
                            z14 = z8;
                        } else {
                            if (!z10) {
                                throw C0238h.f3489d;
                            }
                            z14 = true;
                            z11 = z5;
                            z12 = z6;
                            z13 = z7;
                        }
                    } else if (z9) {
                        if (!z10) {
                            throw C0238h.f3489d;
                        }
                        if (O3 < O4) {
                            z11 = true;
                            z14 = true;
                            z12 = z6;
                            z13 = z7;
                        } else {
                            z12 = true;
                            z13 = true;
                            z11 = z5;
                            z14 = z8;
                        }
                    } else if (z10) {
                        throw C0238h.f3489d;
                    }
                } else if (z9) {
                    if (z10) {
                        throw C0238h.f3489d;
                    }
                    z11 = true;
                    z12 = z6;
                    z13 = z7;
                    z14 = z8;
                } else {
                    if (!z10) {
                        throw C0238h.f3489d;
                    }
                    z13 = true;
                    z11 = z5;
                    z12 = z6;
                    z14 = z8;
                }
                if (z11) {
                    if (z12) {
                        throw C0238h.f3489d;
                    }
                    AbstractC0446a.j(iArr5, fArr2);
                }
                if (z12) {
                    AbstractC0446a.i(iArr5, fArr2);
                }
                if (z13) {
                    if (z14) {
                        throw C0238h.f3489d;
                    }
                    AbstractC0446a.j(iArr4, fArr2);
                }
                if (z14) {
                    AbstractC0446a.i(iArr4, fArr);
                }
                int i7 = c0448c.f5265a;
                int i8 = (((i7 * 4) + (z3 ? 0 : 2)) + (!z4 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    iArr = f5322o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i7 != 0 || !z3 || !z4) {
                        i9 += iArr5[length3] * iArr[i8][length3 * 2];
                    }
                    i10 += iArr5[length3];
                    length3--;
                }
                int i11 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i7 != 0 || !z3 || !z4) {
                        i11 += iArr4[length4] * iArr[i8][(length4 * 2) + 1];
                    }
                }
                int i12 = i9 + i11;
                if ((i10 & 1) != 0 || i10 > 13 || i10 < 4) {
                    throw C0238h.f3489d;
                }
                int i13 = (13 - i10) / 2;
                int i14 = f5318k[i13];
                return new C0447b((d.o(iArr5, i14, true) * f5319l[i13]) + d.o(iArr4, 9 - i14, false) + f5320m[i13], i12);
            }
            float f4 = (iArr2[i5] * 1.0f) / O2;
            int i15 = (int) (0.5f + f4);
            if (i15 <= 0) {
                if (f4 < 0.3f) {
                    throw C0238h.f3489d;
                }
                i15 = 1;
            } else if (i15 > 8) {
                if (f4 > 8.7f) {
                    throw C0238h.f3489d;
                }
                i15 = 8;
            }
            int i16 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArr5[i16] = i15;
                fArr2[i16] = f4 - i15;
            } else {
                iArr4[i16] = i15;
                fArr[i16] = f4 - i15;
            }
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r6.equals(r2) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List q(C0356a c0356a, int i3) {
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.g;
            if (z3) {
                if (l()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.h;
                boolean z4 = !arrayList2.isEmpty();
                int i4 = 0;
                boolean z5 = false;
                while (true) {
                    if (i4 >= arrayList2.size()) {
                        break;
                    }
                    b bVar = (b) arrayList2.get(i4);
                    int i5 = bVar.f5317b;
                    ArrayList arrayList3 = bVar.f5316a;
                    if (i5 <= i3) {
                        z5 = arrayList3.equals(arrayList);
                        i4++;
                    }
                }
                if (!z5) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (it.hasNext()) {
                            b bVar2 = (b) it.next();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C0467a c0467a = (C0467a) it2.next();
                                Iterator it3 = bVar2.f5316a.iterator();
                                while (it3.hasNext()) {
                                    if (c0467a.equals((C0467a) it3.next())) {
                                        break;
                                    }
                                }
                            }
                            break loop2;
                        }
                        arrayList2.add(i4, new b(arrayList, i3));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            b bVar3 = (b) it4.next();
                            if (bVar3.f5316a.size() != arrayList.size()) {
                                Iterator it5 = bVar3.f5316a.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it4.remove();
                                        break;
                                    }
                                    if (!arrayList.contains((C0467a) it5.next())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (z4) {
                    List n3 = n(false);
                    if (n3 != null) {
                        return n3;
                    }
                    List n4 = n(true);
                    if (n4 != null) {
                        return n4;
                    }
                }
                throw C0238h.f3489d;
            }
            try {
                arrayList.add(r(c0356a, arrayList, i3));
            } catch (C0238h e3) {
                if (arrayList.isEmpty()) {
                    throw e3;
                }
                z3 = true;
            }
        }
    }

    public final C0467a r(C0356a c0356a, ArrayList arrayList, int i3) {
        int i4;
        int i5;
        int c;
        int i6;
        C0448c c0448c;
        int[][] iArr;
        int i7;
        int i8 = 2;
        int i9 = 0;
        int i10 = 1;
        boolean z3 = arrayList.size() % 2 == 0;
        if (this.f5325j) {
            z3 = !z3;
        }
        int i11 = -1;
        boolean z4 = true;
        while (true) {
            int[] iArr2 = this.f5258a;
            iArr2[i9] = i9;
            iArr2[i10] = i9;
            iArr2[i8] = i9;
            int i12 = 3;
            iArr2[3] = i9;
            int i13 = c0356a.c;
            int i14 = i11 >= 0 ? i11 : arrayList.isEmpty() ? i9 : ((C0467a) arrayList.get(arrayList.size() - i10)).c.f5266b[i10];
            int i15 = arrayList.size() % i8 != 0 ? i10 : i9;
            if (this.f5325j) {
                i15 ^= 1;
            }
            int i16 = i9;
            while (i14 < i13) {
                i16 = c0356a.a(i14) ^ i10;
                if (i16 == 0) {
                    break;
                }
                i14++;
            }
            int i17 = i9;
            boolean z5 = i16;
            int i18 = i14;
            while (i14 < i13) {
                if (c0356a.a(i14) != z5) {
                    iArr2[i17] = iArr2[i17] + i10;
                    i4 = i10;
                } else {
                    if (i17 == i12) {
                        if (i15 != 0) {
                            int length = iArr2.length;
                            for (int i19 = 0; i19 < length / 2; i19++) {
                                int i20 = iArr2[i19];
                                int i21 = (length - i19) - 1;
                                iArr2[i19] = iArr2[i21];
                                iArr2[i21] = i20;
                            }
                        }
                        if (AbstractC0446a.k(iArr2)) {
                            int[] iArr3 = this.f5324i;
                            iArr3[0] = i18;
                            iArr3[1] = i14;
                            if (z3) {
                                int i22 = i18 - 1;
                                while (i22 >= 0 && !c0356a.a(i22)) {
                                    i22--;
                                }
                                i18 = i22 + 1;
                                i6 = iArr3[0] - i18;
                                i5 = 1;
                                c = iArr3[1];
                            } else {
                                i5 = 1;
                                c = c0356a.c(i14 + 1);
                                i6 = c - iArr3[1];
                            }
                            int i23 = c;
                            int i24 = i18;
                            System.arraycopy(iArr2, 0, iArr2, i5, iArr2.length - i5);
                            iArr2[0] = i6;
                            C0447b c0447b = null;
                            try {
                                iArr = f5321n;
                            } catch (C0238h unused) {
                                c0448c = null;
                            }
                            for (i7 = 0; i7 < 6; i7++) {
                                if (AbstractC0440h.f(iArr2, iArr[i7], 0.45f) < 0.2f) {
                                    c0448c = new C0448c(i7, i24, i23, i3, new int[]{i24, i23});
                                    if (c0448c == null) {
                                        int i25 = iArr3[0];
                                        i11 = c0356a.a(i25) ? c0356a.b(c0356a.c(i25)) : c0356a.c(c0356a.b(i25));
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                        C0447b p3 = p(c0356a, c0448c, z3, true);
                                        if (!arrayList.isEmpty() && ((C0467a) arrayList.get(arrayList.size() - 1)).f5315b == null) {
                                            throw C0238h.f3489d;
                                        }
                                        try {
                                            c0447b = p(c0356a, c0448c, z3, false);
                                        } catch (C0238h unused2) {
                                        }
                                        return new C0467a(p3, c0447b, c0448c);
                                    }
                                    i8 = 2;
                                    i9 = 0;
                                    i10 = 1;
                                }
                            }
                            throw C0238h.f3489d;
                            break;
                        }
                        if (i15 != 0) {
                            int length2 = iArr2.length;
                            for (int i26 = 0; i26 < length2 / 2; i26++) {
                                int i27 = iArr2[i26];
                                int i28 = (length2 - i26) - 1;
                                iArr2[i26] = iArr2[i28];
                                iArr2[i28] = i27;
                            }
                        }
                        i4 = 1;
                        i18 += iArr2[0] + iArr2[1];
                        iArr2[0] = iArr2[2];
                        i12 = 3;
                        iArr2[1] = iArr2[3];
                        iArr2[2] = 0;
                        iArr2[3] = 0;
                        i17--;
                    } else {
                        i4 = i10;
                        i17++;
                    }
                    iArr2[i17] = i4;
                    z5 = !z5;
                }
                i14++;
                i10 = i4;
            }
            throw C0238h.f3489d;
        }
    }
}
