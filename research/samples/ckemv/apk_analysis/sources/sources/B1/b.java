package B1;

import A.h;
import C1.f;
import j1.C0232b;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.InterfaceC0240j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p1.C0356a;
import p1.d;
import v0.C0403c;
import v0.e;

/* loaded from: classes.dex */
public final class b implements InterfaceC0240j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0242l[] f74a = new C0242l[0];

    public static int d(C0244n c0244n, C0244n c0244n2) {
        if (c0244n == null || c0244n2 == null) {
            return 0;
        }
        return (int) Math.abs(c0244n.f3505a - c0244n2.f3505a);
    }

    public static int e(C0244n c0244n, C0244n c0244n2) {
        if (c0244n == null || c0244n2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(c0244n.f3505a - c0244n2.f3505a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x028a, code lost:
    
        if (r23 == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x028c, code lost:
    
        r5 = ((C1.c) r1.f131e).f123f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0293, code lost:
    
        r5 = ((C1.c) r1.f131e).g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x065b, code lost:
    
        r1 = new j1.C0242l(r0.f4336b, null, r6, j1.EnumC0231a.f3466l);
        r1.b(j1.EnumC0243m.f3498d, r0.f4337d);
        r0 = (B1.c) r0.f4338e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0670, code lost:
    
        if (r0 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0672, code lost:
    
        r1.b(j1.EnumC0243m.f3501i, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0677, code lost:
    
        r12 = r34;
        r12.add(r1);
        r1 = 2;
        r3 = r12;
        r5 = r26;
        r4 = r30;
        r2 = 1;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0152, code lost:
    
        if (r13.f117f != r8.f117f) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x043d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f2  */
    @Override // j1.InterfaceC0240j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l a(e eVar, Map map) {
        C0242l c0242l;
        C1.c cVar;
        f fVar;
        C1.a r3;
        C1.e eVar2;
        C1.c cVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C0403c c0403c;
        C1.a aVar;
        ArrayList arrayList;
        p1.b bVar;
        Iterator it;
        int i12;
        int i13;
        int i14;
        C0403c[] c0403cArr;
        C1.c cVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        C1.a aVar2;
        int i19;
        int i20;
        int i21;
        ArrayList arrayList2;
        p1.b bVar2;
        int i22;
        C0403c[] c0403cArr2;
        C1.c cVar4;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        char c = 2;
        int i28 = 1;
        ArrayList arrayList3 = new ArrayList();
        p1.b e3 = eVar.e();
        ArrayList a3 = E1.a.a(e3);
        int i29 = 0;
        if (a3.isEmpty()) {
            int[] iArr = (int[]) e3.f4330e.clone();
            int i30 = e3.f4329d;
            int i31 = e3.f4328b;
            int i32 = e3.c;
            p1.b bVar3 = new p1.b(i31, i32, i30, iArr);
            C0356a c0356a = new C0356a(i31);
            C0356a c0356a2 = new C0356a(i31);
            int i33 = (i32 + 1) / 2;
            for (int i34 = 0; i34 < i33; i34++) {
                c0356a = bVar3.d(c0356a, i34);
                int i35 = (i32 - 1) - i34;
                c0356a2 = bVar3.d(c0356a2, i35);
                c0356a.e();
                c0356a2.e();
                int[] iArr2 = c0356a2.f4327b;
                int i36 = bVar3.f4329d;
                int[] iArr3 = bVar3.f4330e;
                System.arraycopy(iArr2, 0, iArr3, i34 * i36, i36);
                System.arraycopy(c0356a.f4327b, 0, iArr3, i35 * i36, i36);
            }
            a3 = E1.a.a(bVar3);
            e3 = bVar3;
        }
        Iterator it2 = a3.iterator();
        while (it2.hasNext()) {
            C0244n[] c0244nArr = (C0244n[]) it2.next();
            C0244n c0244n = c0244nArr[4];
            C0244n c0244n2 = c0244nArr[5];
            C0244n c0244n3 = c0244nArr[6];
            C0244n c0244n4 = c0244nArr[7];
            int min = Math.min(Math.min(e(c0244nArr[i29], c0244n), (e(c0244nArr[6], c0244nArr[c]) * 17) / 18), Math.min(e(c0244nArr[i28], c0244nArr[5]), (e(c0244nArr[7], c0244nArr[3]) * 17) / 18));
            int max = Math.max(Math.max(d(c0244nArr[i29], c0244nArr[4]), (d(c0244nArr[6], c0244nArr[c]) * 17) / 18), Math.max(d(c0244nArr[i28], c0244nArr[5]), (d(c0244nArr[7], c0244nArr[3]) * 17) / 18));
            h hVar = C1.h.f134a;
            int i37 = i28;
            f fVar2 = null;
            C1.c cVar5 = new C1.c(e3, c0244n, c0244n2, c0244n3, c0244n4);
            f fVar3 = null;
            while (true) {
                if (c0244n != null) {
                    cVar = cVar5;
                    fVar2 = C1.h.d(e3, cVar5, c0244n, true, min, max);
                } else {
                    cVar = cVar5;
                }
                fVar = fVar2;
                if (c0244n3 != null) {
                    fVar3 = C1.h.d(e3, cVar, c0244n3, false, min, max);
                }
                if (fVar != null || fVar3 != null) {
                    if (fVar == null || (r3 = fVar.r()) == null) {
                        if (fVar3 != null) {
                            r3 = fVar3.r();
                            if (r3 != null) {
                                C1.c a4 = C1.h.a(fVar);
                                C1.c a5 = C1.h.a(fVar3);
                                if (a4 == null) {
                                    a4 = a5;
                                } else if (a5 != null) {
                                    a4 = new C1.c(a4.f119a, a4.f120b, a4.c, a5.f121d, a5.f122e);
                                }
                                eVar2 = new C1.e(r3, a4);
                                if (eVar2 != null) {
                                    throw C0238h.f3489d;
                                }
                                cVar5 = (C1.c) eVar2.f131e;
                                cVar2 = cVar;
                                i3 = cVar2.f124i;
                                i4 = cVar2.h;
                                if (i37 == 0 || cVar5 == null || (cVar5.h >= i4 && cVar5.f124i <= i3)) {
                                    break;
                                }
                                i37 = i29;
                                fVar2 = fVar;
                            }
                        }
                        r3 = null;
                        if (r3 != null) {
                        }
                    } else {
                        if (fVar3 != null) {
                            C1.a r4 = fVar3.r();
                            if (r4 != null) {
                                if (r3.f114b != r4.f114b) {
                                    if (r3.c != r4.c) {
                                    }
                                }
                            }
                        }
                        if (r3 != null) {
                        }
                    }
                }
                eVar2 = null;
                if (eVar2 != null) {
                }
            }
            eVar2.f131e = cVar2;
            int i38 = eVar2.f129b;
            int i39 = i38 + 1;
            C0403c[] c0403cArr3 = (C0403c[]) eVar2.f130d;
            c0403cArr3[i29] = fVar;
            c0403cArr3[i39] = fVar3;
            int i40 = fVar != null ? i28 : i29;
            int i41 = i28;
            while (i41 <= i39) {
                int i42 = i40 != 0 ? i41 : i39 - i41;
                if (c0403cArr3[i42] == null) {
                    C0403c fVar4 = (i42 == 0 || i42 == i39) ? new f(cVar2, i42 == 0 ? i28 : 0) : new C0403c(cVar2);
                    c0403cArr3[i42] = fVar4;
                    int i43 = i4;
                    int i44 = min;
                    int i45 = max;
                    int i46 = -1;
                    while (i43 <= i3) {
                        Iterator it3 = it2;
                        int i47 = i40 != 0 ? 1 : -1;
                        int i48 = i42 - i47;
                        int i49 = i41;
                        if (i48 < 0 || i48 > i38 + 1) {
                            i18 = i4;
                            aVar2 = null;
                        } else {
                            C0403c c0403c2 = c0403cArr3[i48];
                            i18 = i4;
                            aVar2 = ((C1.a[]) c0403c2.f5067d)[c0403c2.i(i43)];
                        }
                        if (aVar2 != null) {
                            i20 = i40 != 0 ? aVar2.c : aVar2.f114b;
                        } else {
                            C1.a f3 = c0403cArr3[i42].f(i43);
                            if (f3 != null) {
                                i20 = i40 != 0 ? f3.f114b : f3.c;
                            } else {
                                i19 = i42;
                                if (i48 >= 0 && i48 <= i38 + 1) {
                                    f3 = c0403cArr3[i48].f(i43);
                                }
                                if (f3 != null) {
                                    i20 = i40 != 0 ? f3.c : f3.f114b;
                                } else {
                                    int i50 = i19;
                                    int i51 = 0;
                                    while (true) {
                                        int i52 = i50 - i47;
                                        if (i52 < 0 || i52 > i38 + 1) {
                                            break;
                                        }
                                        C1.a[] aVarArr = (C1.a[]) c0403cArr3[i52].f5067d;
                                        int length = aVarArr.length;
                                        int i53 = 0;
                                        while (i53 < length) {
                                            int i54 = length;
                                            C1.a aVar3 = aVarArr[i53];
                                            if (aVar3 != null) {
                                                int i55 = aVar3.f114b;
                                                int i56 = aVar3.c;
                                                i20 = ((i56 - i55) * i47 * i51) + (i40 != 0 ? i56 : i55);
                                            } else {
                                                i53++;
                                                length = i54;
                                            }
                                        }
                                        i51++;
                                        i50 = i52;
                                    }
                                }
                                if (i20 >= 0 || i20 > cVar2.g) {
                                    i21 = i46;
                                    if (i21 == -1) {
                                        i46 = i21;
                                    } else {
                                        arrayList2 = arrayList3;
                                        bVar2 = e3;
                                        i22 = i21;
                                        c0403cArr2 = c0403cArr3;
                                        cVar4 = cVar2;
                                        i23 = i39;
                                        i24 = i38;
                                        i25 = i45;
                                        i26 = i19;
                                        i27 = i3;
                                        i45 = i25;
                                        i46 = i22;
                                        i43++;
                                        i38 = i24;
                                        c0403cArr3 = c0403cArr2;
                                        i39 = i23;
                                        i42 = i26;
                                        it2 = it3;
                                        i41 = i49;
                                        i4 = i18;
                                        i3 = i27;
                                        e3 = bVar2;
                                        cVar2 = cVar4;
                                        arrayList3 = arrayList2;
                                    }
                                } else {
                                    int i57 = i46;
                                    i46 = i20;
                                    i21 = i57;
                                }
                                i26 = i19;
                                p1.b bVar4 = e3;
                                i27 = i3;
                                bVar2 = e3;
                                c0403cArr2 = c0403cArr3;
                                cVar4 = cVar2;
                                i22 = i21;
                                i23 = i39;
                                arrayList2 = arrayList3;
                                i24 = i38;
                                C1.a c3 = C1.h.c(bVar4, cVar2.f123f, cVar2.g, i40, i46, i43, i44, i45);
                                if (c3 != null) {
                                    ((C1.a[]) fVar4.f5067d)[fVar4.i(i43)] = c3;
                                    int i58 = c3.c;
                                    int i59 = c3.f114b;
                                    i44 = Math.min(i44, i58 - i59);
                                    i45 = Math.max(i45, i58 - i59);
                                    i43++;
                                    i38 = i24;
                                    c0403cArr3 = c0403cArr2;
                                    i39 = i23;
                                    i42 = i26;
                                    it2 = it3;
                                    i41 = i49;
                                    i4 = i18;
                                    i3 = i27;
                                    e3 = bVar2;
                                    cVar2 = cVar4;
                                    arrayList3 = arrayList2;
                                } else {
                                    i25 = i45;
                                    i45 = i25;
                                    i46 = i22;
                                    i43++;
                                    i38 = i24;
                                    c0403cArr3 = c0403cArr2;
                                    i39 = i23;
                                    i42 = i26;
                                    it2 = it3;
                                    i41 = i49;
                                    i4 = i18;
                                    i3 = i27;
                                    e3 = bVar2;
                                    cVar2 = cVar4;
                                    arrayList3 = arrayList2;
                                }
                            }
                        }
                        i19 = i42;
                        if (i20 >= 0) {
                        }
                        i21 = i46;
                        if (i21 == -1) {
                        }
                    }
                    arrayList = arrayList3;
                    bVar = e3;
                    it = it2;
                    i12 = i41;
                    i13 = i4;
                    i14 = i3;
                    c0403cArr = c0403cArr3;
                    cVar3 = cVar2;
                    i15 = i39;
                    i16 = i38;
                    int i60 = i45;
                    i17 = 1;
                    min = i44;
                    max = i60;
                } else {
                    arrayList = arrayList3;
                    bVar = e3;
                    it = it2;
                    i12 = i41;
                    i13 = i4;
                    i14 = i3;
                    c0403cArr = c0403cArr3;
                    cVar3 = cVar2;
                    i15 = i39;
                    i16 = i38;
                    i17 = i28;
                }
                i38 = i16;
                c0403cArr3 = c0403cArr;
                i39 = i15;
                i28 = i17;
                it2 = it;
                i4 = i13;
                i3 = i14;
                e3 = bVar;
                cVar2 = cVar3;
                arrayList3 = arrayList;
                i41 = i12 + 1;
            }
            int i61 = i28;
            ArrayList arrayList4 = arrayList3;
            p1.b bVar5 = e3;
            Iterator it4 = it2;
            C0403c[] c0403cArr4 = c0403cArr3;
            int i62 = i39;
            int i63 = i38;
            C1.a aVar4 = (C1.a) eVar2.c;
            int i64 = aVar4.f117f;
            int[] iArr4 = new int[2];
            iArr4[i61] = i63 + 2;
            iArr4[0] = i64;
            C1.b[][] bVarArr = (C1.b[][]) Array.newInstance((Class<?>) C1.b.class, iArr4);
            for (C1.b[] bVarArr2 : bVarArr) {
                int i65 = 0;
                while (true) {
                    if (i65 < bVarArr2.length) {
                        bVarArr2[i65] = new C1.b();
                        i65++;
                    }
                }
            }
            char c4 = 0;
            eVar2.a(c0403cArr4[0]);
            eVar2.a(c0403cArr4[i62]);
            int i66 = 928;
            while (true) {
                C0403c c0403c3 = c0403cArr4[c4];
                if (c0403c3 != null && (c0403c = c0403cArr4[i62]) != null) {
                    int i67 = 0;
                    while (true) {
                        C1.a[] aVarArr2 = (C1.a[]) c0403c3.f5067d;
                        if (i67 >= aVarArr2.length) {
                            break;
                        }
                        C1.a aVar5 = aVarArr2[i67];
                        if (aVar5 != null && (aVar = ((C1.a[]) c0403c.f5067d)[i67]) != null && aVar5.f117f == aVar.f117f) {
                            for (int i68 = 1; i68 <= i63; i68++) {
                                C1.a aVar6 = ((C1.a[]) c0403cArr4[i68].f5067d)[i67];
                                if (aVar6 != null) {
                                    int i69 = aVarArr2[i67].f117f;
                                    aVar6.f117f = i69;
                                    if (!aVar6.b(i69)) {
                                        ((C1.a[]) c0403cArr4[i68].f5067d)[i67] = null;
                                    }
                                }
                            }
                        }
                        i67++;
                    }
                }
                C0403c c0403c4 = c0403cArr4[0];
                if (c0403c4 != null) {
                    int i70 = 0;
                    i5 = 0;
                    while (true) {
                        C1.a[] aVarArr3 = (C1.a[]) c0403c4.f5067d;
                        if (i70 >= aVarArr3.length) {
                            break;
                        }
                        C1.a aVar7 = aVarArr3[i70];
                        if (aVar7 != null) {
                            int i71 = aVar7.f117f;
                            int i72 = i5;
                            int i73 = 0;
                            for (int i74 = 1; i74 < i62 && i73 < 2; i74 += i7) {
                                C1.a aVar8 = ((C1.a[]) c0403cArr4[i74].f5067d)[i70];
                                if (aVar8 != null) {
                                    if (!aVar8.b(aVar8.f117f)) {
                                        if (aVar8.b(i71)) {
                                            aVar8.f117f = i71;
                                            i73 = 0;
                                        } else {
                                            i7 = 1;
                                            i73++;
                                            if (aVar8.b(aVar8.f117f)) {
                                                i72 += i7;
                                            }
                                        }
                                    }
                                    i7 = 1;
                                    if (aVar8.b(aVar8.f117f)) {
                                    }
                                } else {
                                    i7 = 1;
                                }
                            }
                            i6 = 1;
                            i5 = i72;
                        } else {
                            i6 = 1;
                        }
                        i70 += i6;
                    }
                } else {
                    i5 = 0;
                }
                C0403c c0403c5 = c0403cArr4[i62];
                if (c0403c5 != null) {
                    int i75 = 0;
                    i8 = 0;
                    while (true) {
                        C1.a[] aVarArr4 = (C1.a[]) c0403c5.f5067d;
                        if (i75 >= aVarArr4.length) {
                            break;
                        }
                        C1.a aVar9 = aVarArr4[i75];
                        if (aVar9 != null) {
                            int i76 = aVar9.f117f;
                            int i77 = i8;
                            int i78 = 0;
                            for (int i79 = i62; i79 > 0 && i78 < 2; i79--) {
                                C1.a aVar10 = ((C1.a[]) c0403cArr4[i79].f5067d)[i75];
                                if (aVar10 != null) {
                                    if (!aVar10.b(aVar10.f117f)) {
                                        if (aVar10.b(i76)) {
                                            aVar10.f117f = i76;
                                            i78 = 0;
                                        } else {
                                            i78++;
                                        }
                                    }
                                    if (!aVar10.b(aVar10.f117f)) {
                                        i77++;
                                    }
                                }
                            }
                            i9 = 1;
                            i8 = i77;
                        } else {
                            i9 = 1;
                        }
                        i75 += i9;
                    }
                } else {
                    i8 = 0;
                }
                int i80 = i5 + i8;
                if (i80 == 0) {
                    i80 = 0;
                } else {
                    int i81 = 1;
                    while (i81 < i62) {
                        C1.a[] aVarArr5 = (C1.a[]) c0403cArr4[i81].f5067d;
                        int i82 = 0;
                        while (i82 < aVarArr5.length) {
                            C1.a aVar11 = aVarArr5[i82];
                            if (aVar11 != null && !aVar11.b(aVar11.f117f)) {
                                C1.a aVar12 = aVarArr5[i82];
                                C1.a[] aVarArr6 = (C1.a[]) c0403cArr4[i81 - 1].f5067d;
                                C0403c c0403c6 = c0403cArr4[i81 + 1];
                                C1.a[] aVarArr7 = c0403c6 != null ? (C1.a[]) c0403c6.f5067d : aVarArr6;
                                C1.a[] aVarArr8 = new C1.a[14];
                                aVarArr8[2] = aVarArr6[i82];
                                aVarArr8[3] = aVarArr7[i82];
                                if (i82 > 0) {
                                    int i83 = i82 - 1;
                                    aVarArr8[0] = aVarArr5[i83];
                                    aVarArr8[4] = aVarArr6[i83];
                                    aVarArr8[5] = aVarArr7[i83];
                                }
                                if (i82 > 1) {
                                    int i84 = i82 - 2;
                                    aVarArr8[8] = aVarArr5[i84];
                                    aVarArr8[10] = aVarArr6[i84];
                                    aVarArr8[11] = aVarArr7[i84];
                                }
                                if (i82 < aVarArr5.length - 1) {
                                    int i85 = i82 + 1;
                                    aVarArr8[1] = aVarArr5[i85];
                                    aVarArr8[6] = aVarArr6[i85];
                                    aVarArr8[7] = aVarArr7[i85];
                                }
                                if (i82 < aVarArr5.length - 2) {
                                    int i86 = i82 + 2;
                                    aVarArr8[9] = aVarArr5[i86];
                                    aVarArr8[12] = aVarArr6[i86];
                                    aVarArr8[13] = aVarArr7[i86];
                                }
                                int i87 = 0;
                                while (i87 < 14) {
                                    C1.a aVar13 = aVarArr8[i87];
                                    if (aVar13 != null && aVar13.b(aVar13.f117f)) {
                                        i10 = i80;
                                        if (aVar13.f115d == aVar12.f115d) {
                                            aVar12.f117f = aVar13.f117f;
                                            break;
                                        }
                                    } else {
                                        i10 = i80;
                                    }
                                    i87++;
                                    i80 = i10;
                                }
                            }
                            i10 = i80;
                            i82++;
                            i80 = i10;
                        }
                        i81++;
                        i80 = i80;
                    }
                }
                if (i80 <= 0 || i80 >= i66) {
                    break;
                }
                i66 = i80;
                c4 = 0;
            }
            int i88 = 0;
            for (C0403c c0403c7 : c0403cArr4) {
                if (c0403c7 != null) {
                    for (C1.a aVar14 : (C1.a[]) c0403c7.f5067d) {
                        if (aVar14 != null && (i11 = aVar14.f117f) >= 0 && i11 < bVarArr.length) {
                            bVarArr[i11][i88].b(aVar14.f116e);
                        }
                    }
                }
                i88++;
            }
            C1.b bVar6 = bVarArr[0][1];
            int[] a6 = bVar6.a();
            int i89 = aVar4.f117f;
            int i90 = i63 * i89;
            int i91 = aVar4.c;
            int i92 = i90 - (2 << i91);
            if (a6.length == 0) {
                if (i92 <= 0 || i92 > 928) {
                    throw C0238h.f3489d;
                }
                bVar6.b(i92);
            } else if (a6[0] != i92 && i92 > 0 && i92 <= 928) {
                bVar6.b(i92);
            }
            ArrayList arrayList5 = new ArrayList();
            int[] iArr5 = new int[i90];
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            for (int i93 = 0; i93 < i89; i93++) {
                int i94 = 0;
                while (i94 < i63) {
                    int i95 = i94 + 1;
                    int[] a7 = bVarArr[i93][i95].a();
                    int i96 = (i93 * i63) + i94;
                    if (a7.length == 0) {
                        arrayList5.add(Integer.valueOf(i96));
                    } else if (a7.length == 1) {
                        iArr5[i96] = a7[0];
                    } else {
                        arrayList7.add(Integer.valueOf(i96));
                        arrayList6.add(a7);
                    }
                    i94 = i95;
                }
            }
            int size = arrayList6.size();
            int[][] iArr6 = new int[size];
            for (int i97 = 0; i97 < size; i97++) {
                iArr6[i97] = (int[]) arrayList6.get(i97);
            }
            int[] a8 = a.a(arrayList5);
            int[] a9 = a.a(arrayList7);
            int length2 = a9.length;
            int[] iArr7 = new int[length2];
            int i98 = 100;
            while (true) {
                int i99 = i98 - 1;
                if (i98 <= 0) {
                    throw C0232b.a();
                }
                for (int i100 = 0; i100 < length2; i100++) {
                    iArr5[a9[i100]] = iArr6[i100][iArr7[i100]];
                }
                try {
                    d b3 = C1.h.b(iArr5, i91, a8);
                    break;
                } catch (C0232b unused) {
                    ArrayList arrayList8 = arrayList4;
                    if (length2 == 0) {
                        throw C0232b.a();
                    }
                    int i101 = 0;
                    while (true) {
                        if (i101 >= length2) {
                            break;
                        }
                        int i102 = iArr7[i101];
                        if (i102 < iArr6[i101].length - 1) {
                            iArr7[i101] = i102 + 1;
                            break;
                        }
                        iArr7[i101] = 0;
                        if (i101 == length2 - 1) {
                            throw C0232b.a();
                        }
                        i101++;
                    }
                    i98 = i99;
                    arrayList4 = arrayList8;
                }
            }
        }
        C0242l[] c0242lArr = (C0242l[]) arrayList3.toArray(f74a);
        if (c0242lArr.length == 0 || (c0242l = c0242lArr[0]) == null) {
            throw C0238h.f3489d;
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
