package F1;

import G1.d;
import G1.h;
import G1.i;
import H1.c;
import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import j1.EnumC0243m;
import j1.InterfaceC0240j;
import j1.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p1.b;
import v0.e;
import v0.f;
import v0.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC0240j {

    /* renamed from: b, reason: collision with root package name */
    public static final C0244n[] f176b = new C0244n[0];

    /* renamed from: a, reason: collision with root package name */
    public final d f177a = new d(0);

    /* JADX WARN: Removed duplicated region for block: B:198:0x02d4  */
    /* JADX WARN: Type inference failed for: r2v0, types: [v0.r, java.lang.Object] */
    @Override // j1.InterfaceC0240j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l a(e eVar, Map map) {
        ArrayList arrayList;
        c cVar;
        c cVar2;
        c cVar3;
        char c;
        d dVar;
        b bVar;
        H1.a aVar;
        float f3;
        float f4;
        float f5;
        Map map2;
        C0244n[] c0244nArr;
        d dVar2;
        p1.d d3;
        int i3;
        double d4;
        double abs;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        d dVar3 = this.f177a;
        int i14 = 0;
        int i15 = 1;
        if (map == null || !map.containsKey(EnumC0233c.c)) {
            b e3 = eVar.e();
            ?? obj = new Object();
            obj.f5124b = e3;
            o oVar = map == null ? null : (o) map.get(EnumC0233c.f3480k);
            obj.c = oVar;
            H1.e eVar2 = new H1.e(e3, oVar);
            boolean z3 = map != null && map.containsKey(EnumC0233c.f3476e);
            int i16 = e3.c;
            int i17 = (i16 * 3) / 388;
            if (i17 < 3 || z3) {
                i17 = 3;
            }
            int[] iArr = new int[5];
            int i18 = i17 - 1;
            boolean z4 = false;
            while (true) {
                arrayList = eVar2.f287b;
                if (i18 >= i16 || z4) {
                    break;
                }
                Arrays.fill(iArr, i14);
                int i19 = i14;
                while (true) {
                    i4 = e3.f4328b;
                    if (i14 >= i4) {
                        break;
                    }
                    if (e3.b(i14, i18)) {
                        if ((i19 & 1) == i15) {
                            i19 += i15;
                        }
                        iArr[i19] = iArr[i19] + i15;
                        i5 = i15;
                    } else if ((i19 & 1) == 0) {
                        if (i19 != 4) {
                            i6 = i14;
                            i5 = 1;
                            int i20 = i19 + 1;
                            iArr[i20] = iArr[i20] + 1;
                            i19 = i20;
                        } else if (!H1.e.b(iArr)) {
                            i5 = 1;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                            i14 = i14;
                            i19 = 3;
                        } else if (eVar2.c(i18, i14, iArr)) {
                            if (eVar2.c) {
                                z4 = eVar2.d();
                                i10 = 0;
                                i5 = 1;
                                i8 = 2;
                            } else {
                                if (arrayList.size() > 1) {
                                    Iterator it = arrayList.iterator();
                                    c cVar4 = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i7 = i14;
                                            i8 = 2;
                                            i9 = 0;
                                            break;
                                        }
                                        c cVar5 = (c) it.next();
                                        i7 = i14;
                                        if (cVar5.f284d >= 2) {
                                            if (cVar4 != null) {
                                                eVar2.c = true;
                                                i8 = 2;
                                                i9 = ((int) (Math.abs(cVar4.f3505a - cVar5.f3505a) - Math.abs(cVar4.f3506b - cVar5.f3506b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i14 = i7;
                                    }
                                } else {
                                    i7 = i14;
                                    i9 = 0;
                                    i8 = 2;
                                }
                                if (i9 > iArr[i8]) {
                                    i18 += (i9 - r7) - 2;
                                    i5 = 1;
                                    i14 = i4 - 1;
                                } else {
                                    i5 = 1;
                                    i14 = i7;
                                }
                                i10 = 0;
                            }
                            Arrays.fill(iArr, i10);
                            i19 = i10;
                            i17 = i8;
                        } else {
                            i6 = i14;
                            i5 = 1;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                            i19 = 3;
                        }
                        i14 = i6;
                    } else {
                        i5 = i15;
                        iArr[i19] = iArr[i19] + i5;
                    }
                    i14 += i5;
                    i15 = i5;
                }
                if (H1.e.b(iArr) && eVar2.c(i18, i4, iArr)) {
                    int i21 = iArr[0];
                    if (eVar2.c) {
                        z4 = eVar2.d();
                    }
                    i17 = i21;
                }
                i18 += i17;
                i14 = 0;
                i15 = 1;
            }
            if (arrayList.size() < 3) {
                throw C0238h.f3489d;
            }
            arrayList.sort(H1.e.f285f);
            c[] cVarArr = new c[3];
            int i22 = 0;
            double d5 = Double.MAX_VALUE;
            while (i22 < arrayList.size() - 2) {
                c cVar6 = (c) arrayList.get(i22);
                float f6 = cVar6.c;
                i22++;
                int i23 = i22;
                for (int i24 = 1; i23 < arrayList.size() - i24; i24 = 1) {
                    c cVar7 = (c) arrayList.get(i23);
                    double e4 = H1.e.e(cVar6, cVar7);
                    i23 += i24;
                    int i25 = i23;
                    while (i25 < arrayList.size()) {
                        c cVar8 = (c) arrayList.get(i25);
                        if (cVar8.c <= 1.4f * f6) {
                            double e5 = H1.e.e(cVar7, cVar8);
                            double e6 = H1.e.e(cVar6, cVar8);
                            if (e4 < e5) {
                                if (e5 <= e6) {
                                    d4 = e4;
                                    e5 = e6;
                                    e6 = e5;
                                } else if (e4 < e6) {
                                    d4 = e4;
                                } else {
                                    d4 = e6;
                                    e6 = e4;
                                }
                                abs = Math.abs(e5 - (d4 * 2.0d)) + Math.abs(e5 - (e6 * 2.0d));
                                if (abs < d5) {
                                    cVarArr[0] = cVar6;
                                    i3 = 1;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d5 = abs;
                                }
                            } else {
                                if (e5 >= e6) {
                                    d4 = e6;
                                    e6 = e5;
                                } else if (e4 < e6) {
                                    d4 = e5;
                                    e5 = e6;
                                    e6 = e4;
                                    abs = Math.abs(e5 - (d4 * 2.0d)) + Math.abs(e5 - (e6 * 2.0d));
                                    if (abs < d5) {
                                    }
                                } else {
                                    d4 = e5;
                                }
                                e5 = e4;
                                abs = Math.abs(e5 - (d4 * 2.0d)) + Math.abs(e5 - (e6 * 2.0d));
                                if (abs < d5) {
                                }
                            }
                            i25 += i3;
                        }
                        i3 = 1;
                        i25 += i3;
                    }
                }
            }
            if (d5 == Double.MAX_VALUE) {
                throw C0238h.f3489d;
            }
            float a3 = C0244n.a(cVarArr[0], cVarArr[1]);
            float a4 = C0244n.a(cVarArr[1], cVarArr[2]);
            float a5 = C0244n.a(cVarArr[0], cVarArr[2]);
            if (a4 >= a3 && a4 >= a5) {
                cVar = cVarArr[0];
                cVar2 = cVarArr[1];
                cVar3 = cVarArr[2];
            } else if (a5 < a4 || a5 < a3) {
                cVar = cVarArr[2];
                cVar2 = cVarArr[0];
                cVar3 = cVarArr[1];
            } else {
                cVar = cVarArr[1];
                cVar2 = cVarArr[0];
                cVar3 = cVarArr[2];
            }
            float f7 = cVar.f3505a;
            float f8 = cVar3.f3505a - f7;
            float f9 = cVar2.f3506b;
            float f10 = cVar.f3506b;
            if (((f9 - f10) * f8) - ((cVar2.f3505a - f7) * (cVar3.f3506b - f10)) < 0.0f) {
                c = 0;
                c cVar9 = cVar3;
                cVar3 = cVar2;
                cVar2 = cVar9;
            } else {
                c = 0;
            }
            cVarArr[c] = cVar2;
            cVarArr[1] = cVar;
            cVarArr[2] = cVar3;
            float a6 = (obj.a(cVar, cVar2) + obj.a(cVar, cVar3)) / 2.0f;
            if (a6 < 1.0f) {
                throw C0238h.f3489d;
            }
            int K2 = (f.K(C0244n.a(cVar, cVar2) / a6) + f.K(C0244n.a(cVar, cVar3) / a6)) / 2;
            int i26 = K2 + 7;
            int i27 = i26 & 3;
            if (i27 == 0) {
                i26 = K2 + 8;
            } else if (i27 == 2) {
                i26 = K2 + 6;
            } else if (i27 == 3) {
                throw C0238h.f3489d;
            }
            int[] iArr2 = i.f251e;
            if (i26 % 4 != 1) {
                throw C0234d.a();
            }
            try {
                i c3 = i.c((i26 - 17) / 4);
                int i28 = (c3.f253a * 4) + 10;
                int length = c3.f254b.length;
                float f11 = cVar.f3505a;
                float f12 = cVar3.f3506b;
                float f13 = cVar3.f3505a;
                float f14 = cVar2.f3506b;
                float f15 = cVar2.f3505a;
                if (length > 0) {
                    float f16 = 1.0f - (3.0f / i28);
                    int i29 = (int) (((((f13 - f11) + f15) - f11) * f16) + f11);
                    int i30 = (int) (((((f12 - f10) + f14) - f10) * f16) + f10);
                    dVar = dVar3;
                    bVar = e3;
                    int i31 = 4;
                    r rVar = obj;
                    while (i31 <= 16) {
                        try {
                            aVar = rVar.s(a6, i29, i30, i31);
                            break;
                        } catch (C0238h unused) {
                            i31 <<= 1;
                            rVar = rVar;
                        }
                    }
                } else {
                    dVar = dVar3;
                    bVar = e3;
                }
                aVar = null;
                float f17 = i26 - 3.5f;
                if (aVar != null) {
                    f5 = f17 - 3.0f;
                    f3 = aVar.f3505a;
                    f4 = aVar.f3506b;
                } else {
                    f3 = (f13 - f11) + f15;
                    f4 = (f12 - f10) + f14;
                    f5 = f17;
                }
                b C2 = u2.d.C(bVar, i26, i26, p1.f.a(3.5f, 3.5f, f17, 3.5f, f5, f5, 3.5f, f17, cVar.f3505a, cVar.f3506b, cVar3.f3505a, cVar3.f3506b, f3, f4, cVar2.f3505a, cVar2.f3506b));
                if (aVar == null) {
                    c0244nArr = new C0244n[]{cVar2, cVar, cVar3};
                    dVar2 = dVar;
                    map2 = map;
                } else {
                    C0244n[] c0244nArr2 = {cVar2, cVar, cVar3, aVar};
                    map2 = map;
                    c0244nArr = c0244nArr2;
                    dVar2 = dVar;
                }
                d3 = dVar2.d(C2, map2);
            } catch (IllegalArgumentException unused2) {
                throw C0234d.a();
            }
        } else {
            b e7 = eVar.e();
            int[] e8 = e7.e();
            int[] c4 = e7.c();
            if (e8 == null || c4 == null) {
                throw C0238h.f3489d;
            }
            int i32 = e8[0];
            int i33 = e8[1];
            int i34 = 0;
            boolean z5 = true;
            while (true) {
                i12 = e7.f4328b;
                i13 = e7.c;
                if (i32 >= i12 || i33 >= i13) {
                    break;
                }
                if (z5 != e7.b(i32, i33)) {
                    i34++;
                    if (i34 == 5) {
                        break;
                    }
                    z5 = !z5;
                }
                i32++;
                i33++;
            }
            if (i32 == i12 || i33 == i13) {
                throw C0238h.f3489d;
            }
            int i35 = e8[0];
            float f18 = (i32 - i35) / 7.0f;
            int i36 = e8[1];
            int i37 = c4[1];
            int i38 = c4[0];
            if (i35 >= i38 || i36 >= i37) {
                throw C0238h.f3489d;
            }
            int i39 = i37 - i36;
            if (i39 != i38 - i35 && (i38 = i35 + i39) >= i12) {
                throw C0238h.f3489d;
            }
            int round = Math.round(((i38 - i35) + 1) / f18);
            int round2 = Math.round((i39 + 1) / f18);
            if (round <= 0 || round2 <= 0) {
                throw C0238h.f3489d;
            }
            if (round2 != round) {
                throw C0238h.f3489d;
            }
            int i40 = (int) (f18 / 2.0f);
            int i41 = i36 + i40;
            int i42 = i35 + i40;
            int i43 = (((int) ((round - 1) * f18)) + i42) - i38;
            if (i43 > 0) {
                if (i43 > i40) {
                    throw C0238h.f3489d;
                }
                i42 -= i43;
            }
            int i44 = (((int) ((round2 - 1) * f18)) + i41) - i37;
            if (i44 > 0) {
                if (i44 > i40) {
                    throw C0238h.f3489d;
                }
                i41 -= i44;
            }
            b bVar2 = new b(round, round2);
            for (int i45 = 0; i45 < round2; i45++) {
                int i46 = ((int) (i45 * f18)) + i41;
                for (int i47 = 0; i47 < round; i47++) {
                    if (e7.b(((int) (i47 * f18)) + i42, i46)) {
                        bVar2.f(i47, i45);
                    }
                }
            }
            d3 = dVar3.d(bVar2, map);
            c0244nArr = f176b;
        }
        Object obj2 = d3.f4338e;
        if (obj2 instanceof h) {
            ((h) obj2).getClass();
            if (c0244nArr.length >= 3) {
                C0244n c0244n = c0244nArr[0];
                c0244nArr[0] = c0244nArr[2];
                c0244nArr[2] = c0244n;
            }
        }
        C0242l c0242l = new C0242l(d3.f4336b, d3.f4335a, c0244nArr, EnumC0231a.f3467m);
        List list = d3.c;
        if (list != null) {
            c0242l.b(EnumC0243m.c, list);
        }
        String str = d3.f4337d;
        if (str != null) {
            c0242l.b(EnumC0243m.f3498d, str);
        }
        int i48 = d3.f4339f;
        if (i48 >= 0 && (i11 = d3.g) >= 0) {
            c0242l.b(EnumC0243m.f3502j, Integer.valueOf(i11));
            c0242l.b(EnumC0243m.f3503k, Integer.valueOf(i48));
        }
        return c0242l;
    }

    @Override // j1.InterfaceC0240j
    public final C0242l b(e eVar) {
        return a(eVar, null);
    }

    @Override // j1.InterfaceC0240j
    public final void c() {
    }
}
