package r;

import java.util.ArrayList;
import q.C0359c;
import q.C0361e;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f4628a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0262, code lost:
    
        if (r2.f4504b == r7) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (r4.f4504b == r12) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0711 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, C0361e c0361e, int i3) {
        int i4;
        C0365b[] c0365bArr;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        float f3;
        d dVar;
        boolean z5;
        boolean z6;
        c[] cVarArr;
        int i7;
        ArrayList arrayList;
        d dVar2;
        int i8;
        d dVar3;
        d dVar4;
        int i9;
        c cVar;
        int i10;
        c cVar2;
        q.i iVar;
        q.i iVar2;
        d dVar5;
        d dVar6;
        c cVar3;
        c cVar4;
        int i11;
        d dVar7;
        int i12;
        int i13;
        d dVar8;
        q.i iVar3;
        q.i iVar4;
        c cVar5;
        d dVar9;
        c cVar6;
        q.i iVar5;
        q.i iVar6;
        d dVar10;
        d dVar11;
        d dVar12;
        int size;
        int i14;
        ArrayList arrayList2;
        int i15;
        float f4;
        d dVar13;
        boolean z7;
        d dVar14;
        C0365b c0365b;
        d dVar15;
        d dVar16;
        int i16;
        int i17;
        d dVar17;
        c cVar7;
        d dVar18;
        e eVar2 = eVar;
        int i18 = 2;
        if (i3 == 0) {
            i4 = eVar2.f4566l0;
            c0365bArr = eVar2.f4569o0;
            i5 = 0;
        } else {
            i4 = eVar2.f4567m0;
            c0365bArr = eVar2.f4568n0;
            i5 = 2;
        }
        int i19 = 0;
        while (i19 < i4) {
            C0365b c0365b2 = c0365bArr[i19];
            boolean z8 = c0365b2.f4502q;
            d dVar19 = c0365b2.f4489a;
            int i20 = 3;
            int i21 = 1;
            int i22 = 8;
            if (z8) {
                i6 = i19;
                z3 = true;
            } else {
                int i23 = c0365b2.f4497l;
                int i24 = i23 * 2;
                d dVar20 = dVar19;
                d dVar21 = dVar20;
                boolean z9 = false;
                while (!z9) {
                    c0365b2.f4494i += i21;
                    dVar20.f4536b0[i23] = null;
                    dVar20.f4534a0[i23] = null;
                    int i25 = dVar20.f4528V;
                    c[] cVarArr2 = dVar20.f4512F;
                    if (i25 != i22) {
                        dVar20.h(i23);
                        cVarArr2[i24].c();
                        int i26 = i24 + 1;
                        cVarArr2[i26].c();
                        cVarArr2[i24].c();
                        cVarArr2[i26].c();
                        if (c0365b2.f4490b == null) {
                            c0365b2.f4490b = dVar20;
                        }
                        c0365b2.f4491d = dVar20;
                        int i27 = dVar20.f4537c0[i23];
                        if (i27 == i20) {
                            int i28 = dVar20.f4544l[i23];
                            if (i28 == 0 || i28 == i20 || i28 == i18) {
                                c0365b2.f4495j++;
                                float f5 = dVar20.f4532Z[i23];
                                if (f5 > 0.0f) {
                                    c0365b2.f4496k += f5;
                                }
                                i17 = i19;
                                if (dVar20.f4528V != 8 && i27 == 3 && (i28 == 0 || i28 == 3)) {
                                    if (f5 < 0.0f) {
                                        c0365b2.f4499n = true;
                                    } else {
                                        c0365b2.f4500o = true;
                                    }
                                    if (c0365b2.h == null) {
                                        c0365b2.h = new ArrayList();
                                    }
                                    c0365b2.h.add(dVar20);
                                }
                                if (c0365b2.f4493f == null) {
                                    c0365b2.f4493f = dVar20;
                                }
                                d dVar22 = c0365b2.g;
                                if (dVar22 != null) {
                                    dVar22.f4534a0[i23] = dVar20;
                                }
                                c0365b2.g = dVar20;
                            } else {
                                i17 = i19;
                            }
                            if (i23 == 0) {
                                if (dVar20.f4542j == 0 && dVar20.f4545m == 0) {
                                    int i29 = dVar20.f4546n;
                                }
                            } else if (dVar20.f4543k == 0 && dVar20.f4548p == 0) {
                                int i30 = dVar20.f4549q;
                            }
                            dVar17 = dVar21;
                            if (dVar17 != dVar20) {
                                dVar17.f4536b0[i23] = dVar20;
                            }
                            cVar7 = cVarArr2[i24 + 1].f4505d;
                            if (cVar7 != null) {
                                dVar18 = cVar7.f4504b;
                                c cVar8 = dVar18.f4512F[i24].f4505d;
                                if (cVar8 != null) {
                                }
                            }
                            dVar18 = null;
                            if (dVar18 != null) {
                                dVar18 = dVar20;
                                z9 = true;
                            }
                            dVar21 = dVar20;
                            i19 = i17;
                            i21 = 1;
                            i22 = 8;
                            i18 = 2;
                            dVar20 = dVar18;
                            i20 = 3;
                        }
                    }
                    i17 = i19;
                    dVar17 = dVar21;
                    if (dVar17 != dVar20) {
                    }
                    cVar7 = cVarArr2[i24 + 1].f4505d;
                    if (cVar7 != null) {
                    }
                    dVar18 = null;
                    if (dVar18 != null) {
                    }
                    dVar21 = dVar20;
                    i19 = i17;
                    i21 = 1;
                    i22 = 8;
                    i18 = 2;
                    dVar20 = dVar18;
                    i20 = 3;
                }
                i6 = i19;
                d dVar23 = c0365b2.f4490b;
                if (dVar23 != null) {
                    dVar23.f4512F[i24].c();
                }
                d dVar24 = c0365b2.f4491d;
                if (dVar24 != null) {
                    dVar24.f4512F[i24 + 1].c();
                }
                c0365b2.c = dVar20;
                if (i23 == 0 && c0365b2.f4498m) {
                    c0365b2.f4492e = dVar20;
                } else {
                    c0365b2.f4492e = dVar19;
                }
                c0365b2.f4501p = c0365b2.f4500o && c0365b2.f4499n;
                z3 = true;
            }
            c0365b2.f4502q = z3;
            d dVar25 = c0365b2.c;
            d dVar26 = c0365b2.f4490b;
            d dVar27 = c0365b2.f4491d;
            d dVar28 = c0365b2.f4492e;
            float f6 = c0365b2.f4496k;
            boolean z10 = eVar2.f4537c0[i3] == 2;
            if (i3 == 0) {
                int i31 = dVar28.f4530X;
                boolean z11 = i31 == 0;
                z6 = i31 == 1;
                z4 = i31 == 2;
                f3 = f6;
                dVar = dVar19;
                z5 = z11;
            } else {
                int i32 = dVar28.f4531Y;
                boolean z12 = i32 == 0;
                boolean z13 = i32 == 1;
                z4 = i32 == 2;
                f3 = f6;
                dVar = dVar19;
                z5 = z12;
                z6 = z13;
            }
            boolean z14 = false;
            while (true) {
                cVarArr = eVar2.f4512F;
                i7 = i4;
                if (z14) {
                    break;
                }
                c cVar9 = dVar.f4512F[i5];
                int i33 = z4 ? 1 : 4;
                int c = cVar9.c();
                boolean z15 = z14;
                int[] iArr = dVar.f4537c0;
                C0365b[] c0365bArr2 = c0365bArr;
                d dVar29 = dVar28;
                boolean z16 = iArr[i3] == 3 && dVar.f4544l[i3] == 0;
                c cVar10 = cVar9.f4505d;
                if (cVar10 != null && dVar != dVar19) {
                    c = cVar10.c() + c;
                }
                int i34 = c;
                if (!z4 || dVar == dVar19 || dVar == dVar26) {
                    dVar14 = dVar19;
                } else {
                    dVar14 = dVar19;
                    i33 = 5;
                }
                c cVar11 = cVar9.f4505d;
                if (cVar11 != null) {
                    if (dVar == dVar26) {
                        dVar15 = dVar26;
                        c0365b = c0365b2;
                        c0361e.f(cVar9.g, cVar11.g, i34, 6);
                    } else {
                        c0365b = c0365b2;
                        dVar15 = dVar26;
                        c0361e.f(cVar9.g, cVar11.g, i34, 8);
                    }
                    c0361e.e(cVar9.g, cVar9.f4505d.g, i34, (!z16 || z4) ? i33 : 5);
                } else {
                    c0365b = c0365b2;
                    dVar15 = dVar26;
                }
                c[] cVarArr3 = dVar.f4512F;
                if (z10) {
                    if (dVar.f4528V == 8 || iArr[i3] != 3) {
                        i16 = 0;
                    } else {
                        i16 = 0;
                        c0361e.f(cVarArr3[i5 + 1].g, cVarArr3[i5].g, 0, 5);
                    }
                    c0361e.f(cVarArr3[i5].g, cVarArr[i5].g, i16, 8);
                }
                c cVar12 = cVarArr3[i5 + 1].f4505d;
                if (cVar12 != null) {
                    dVar16 = cVar12.f4504b;
                    c cVar13 = dVar16.f4512F[i5].f4505d;
                    if (cVar13 != null) {
                    }
                }
                dVar16 = null;
                if (dVar16 != null) {
                    dVar = dVar16;
                    z14 = z15;
                } else {
                    z14 = true;
                }
                i4 = i7;
                dVar19 = dVar14;
                c0365bArr = c0365bArr2;
                dVar28 = dVar29;
                dVar26 = dVar15;
                c0365b2 = c0365b;
            }
            C0365b c0365b3 = c0365b2;
            d dVar30 = dVar28;
            d dVar31 = dVar19;
            d dVar32 = dVar26;
            C0365b[] c0365bArr3 = c0365bArr;
            if (dVar27 != null) {
                int i35 = i5 + 1;
                if (dVar25.f4512F[i35].f4505d != null) {
                    c cVar14 = dVar27.f4512F[i35];
                    if (dVar27.f4537c0[i3] == 3 && dVar27.f4544l[i3] == 0 && !z4) {
                        c cVar15 = cVar14.f4505d;
                        if (cVar15.f4504b == eVar2) {
                            c0361e.e(cVar14.g, cVar15.g, -cVar14.c(), 5);
                            c0361e.g(cVar14.g, dVar25.f4512F[i35].f4505d.g, -cVar14.c(), 6);
                            if (z10) {
                                int i36 = i5 + 1;
                                q.i iVar7 = cVarArr[i36].g;
                                c cVar16 = dVar25.f4512F[i36];
                                c0361e.f(iVar7, cVar16.g, cVar16.c(), 8);
                            }
                            arrayList = c0365b3.h;
                            if (arrayList != null && (size = arrayList.size()) > 1) {
                                float f7 = (c0365b3.f4499n || c0365b3.f4501p) ? f3 : c0365b3.f4495j;
                                d dVar33 = null;
                                float f8 = 0.0f;
                                i14 = 0;
                                while (i14 < size) {
                                    d dVar34 = (d) arrayList.get(i14);
                                    float f9 = dVar34.f4532Z[i3];
                                    c[] cVarArr4 = dVar34.f4512F;
                                    if (f9 < 0.0f) {
                                        if (c0365b3.f4501p) {
                                            q.i iVar8 = cVarArr4[i5 + 1].g;
                                            q.i iVar9 = cVarArr4[i5].g;
                                            z7 = false;
                                            c0361e.e(iVar8, iVar9, 0, 4);
                                            arrayList2 = arrayList;
                                            i15 = size;
                                            i14++;
                                            size = i15;
                                            arrayList = arrayList2;
                                        } else {
                                            f9 = 1.0f;
                                        }
                                    }
                                    if (f9 == 0.0f) {
                                        q.i iVar10 = cVarArr4[i5 + 1].g;
                                        q.i iVar11 = cVarArr4[i5].g;
                                        z7 = false;
                                        c0361e.e(iVar10, iVar11, 0, 8);
                                        arrayList2 = arrayList;
                                        i15 = size;
                                        i14++;
                                        size = i15;
                                        arrayList = arrayList2;
                                    } else {
                                        if (dVar33 != null) {
                                            c[] cVarArr5 = dVar33.f4512F;
                                            q.i iVar12 = cVarArr5[i5].g;
                                            int i37 = i5 + 1;
                                            q.i iVar13 = cVarArr5[i37].g;
                                            arrayList2 = arrayList;
                                            q.i iVar14 = cVarArr4[i5].g;
                                            q.i iVar15 = cVarArr4[i37].g;
                                            i15 = size;
                                            C0359c k2 = c0361e.k();
                                            dVar13 = dVar34;
                                            k2.f4376b = 0.0f;
                                            if (f7 == 0.0f || f8 == f9) {
                                                f4 = f9;
                                                k2.f4377d.g(iVar12, 1.0f);
                                                k2.f4377d.g(iVar13, -1.0f);
                                                k2.f4377d.g(iVar15, 1.0f);
                                                k2.f4377d.g(iVar14, -1.0f);
                                            } else {
                                                if (f8 == 0.0f) {
                                                    k2.f4377d.g(iVar12, 1.0f);
                                                    k2.f4377d.g(iVar13, -1.0f);
                                                } else if (f9 == 0.0f) {
                                                    k2.f4377d.g(iVar14, 1.0f);
                                                    k2.f4377d.g(iVar15, -1.0f);
                                                } else {
                                                    float f10 = (f8 / f7) / (f9 / f7);
                                                    f4 = f9;
                                                    k2.f4377d.g(iVar12, 1.0f);
                                                    k2.f4377d.g(iVar13, -1.0f);
                                                    k2.f4377d.g(iVar15, f10);
                                                    k2.f4377d.g(iVar14, -f10);
                                                }
                                                f4 = f9;
                                            }
                                            c0361e.c(k2);
                                        } else {
                                            arrayList2 = arrayList;
                                            i15 = size;
                                            f4 = f9;
                                            dVar13 = dVar34;
                                        }
                                        f8 = f4;
                                        dVar33 = dVar13;
                                        i14++;
                                        size = i15;
                                        arrayList = arrayList2;
                                    }
                                }
                            }
                            if (dVar32 != null) {
                                dVar4 = dVar32;
                                if (dVar4 == dVar27 || z4) {
                                    c cVar17 = dVar31.f4512F[i5];
                                    int i38 = i5 + 1;
                                    c cVar18 = dVar25.f4512F[i38];
                                    c cVar19 = cVar17.f4505d;
                                    q.i iVar16 = cVar19 != null ? cVar19.g : null;
                                    c cVar20 = cVar18.f4505d;
                                    q.i iVar17 = cVar20 != null ? cVar20.g : null;
                                    c cVar21 = dVar4.f4512F[i5];
                                    c cVar22 = dVar27.f4512F[i38];
                                    if (iVar16 == null || iVar17 == null) {
                                        dVar2 = dVar27;
                                        i8 = i6;
                                    } else {
                                        dVar2 = dVar27;
                                        i8 = i6;
                                        c0361e.b(cVar21.g, iVar16, cVar21.c(), i3 == 0 ? dVar30.f4525S : dVar30.f4526T, iVar17, cVar22.g, cVar22.c(), 7);
                                    }
                                    i9 = i8;
                                    if ((!z5 || z6) && dVar4 != null && dVar4 != dVar2) {
                                        c[] cVarArr6 = dVar4.f4512F;
                                        cVar = cVarArr6[i5];
                                        i10 = i5 + 1;
                                        cVar2 = dVar2.f4512F[i10];
                                        c cVar23 = cVar.f4505d;
                                        iVar = cVar23 != null ? cVar23.g : null;
                                        c cVar24 = cVar2.f4505d;
                                        iVar2 = cVar24 != null ? cVar24.g : null;
                                        if (dVar25 != dVar2) {
                                            c cVar25 = dVar25.f4512F[i10].f4505d;
                                            iVar2 = cVar25 != null ? cVar25.g : null;
                                        }
                                        if (dVar4 == dVar2) {
                                            cVar2 = cVarArr6[i10];
                                        }
                                        if (iVar == null && iVar2 != null) {
                                            c0361e.b(cVar.g, iVar, cVar.c(), 0.5f, iVar2, cVar2.g, dVar2.f4512F[i10].c(), 5);
                                        }
                                    }
                                    i19 = i9 + 1;
                                    i18 = 2;
                                    eVar2 = eVar;
                                    i4 = i7;
                                    c0365bArr = c0365bArr3;
                                } else {
                                    dVar2 = dVar27;
                                    i8 = i6;
                                    dVar3 = dVar31;
                                }
                            } else {
                                dVar2 = dVar27;
                                i8 = i6;
                                dVar3 = dVar31;
                                dVar4 = dVar32;
                            }
                            if (z5 || dVar4 == null) {
                                dVar5 = dVar3;
                                int i39 = 8;
                                if (z6 && dVar4 != null) {
                                    int i40 = c0365b3.f4495j;
                                    boolean z17 = i40 <= 0 && c0365b3.f4494i == i40;
                                    d dVar35 = dVar4;
                                    dVar6 = dVar35;
                                    while (dVar6 != null) {
                                        d dVar36 = dVar6.f4536b0[i3];
                                        while (dVar36 != null && dVar36.f4528V == i39) {
                                            dVar36 = dVar36.f4536b0[i3];
                                        }
                                        if (dVar6 == dVar4 || dVar6 == dVar2 || dVar36 == null) {
                                            dVar7 = dVar35;
                                            i12 = i8;
                                            i13 = i39;
                                        } else {
                                            d dVar37 = dVar36 == dVar2 ? null : dVar36;
                                            c[] cVarArr7 = dVar6.f4512F;
                                            c cVar26 = cVarArr7[i5];
                                            q.i iVar18 = cVar26.g;
                                            int i41 = i5 + 1;
                                            q.i iVar19 = dVar35.f4512F[i41].g;
                                            int c3 = cVar26.c();
                                            int c4 = cVarArr7[i41].c();
                                            if (dVar37 != null) {
                                                cVar5 = dVar37.f4512F[i5];
                                                iVar3 = cVar5.g;
                                                dVar8 = dVar37;
                                                c cVar27 = cVar5.f4505d;
                                                iVar4 = cVar27 != null ? cVar27.g : null;
                                            } else {
                                                dVar8 = dVar37;
                                                c cVar28 = dVar2.f4512F[i5];
                                                iVar3 = cVar28 != null ? cVar28.g : null;
                                                iVar4 = cVarArr7[i41].g;
                                                cVar5 = cVar28;
                                            }
                                            int c5 = cVar5 != null ? cVar5.c() + c4 : c4;
                                            int c6 = dVar35.f4512F[i41].c() + c3;
                                            int i42 = z17 ? 8 : 4;
                                            if (iVar18 == null || iVar19 == null || iVar3 == null || iVar4 == null) {
                                                dVar7 = dVar35;
                                                i12 = i8;
                                                i13 = 8;
                                            } else {
                                                dVar7 = dVar35;
                                                int i43 = c5;
                                                i12 = i8;
                                                i13 = 8;
                                                c0361e.b(iVar18, iVar19, c6, 0.5f, iVar3, iVar4, i43, i42);
                                            }
                                            dVar36 = dVar8;
                                        }
                                        dVar35 = dVar6.f4528V != i13 ? dVar6 : dVar7;
                                        dVar6 = dVar36;
                                        i39 = i13;
                                        i8 = i12;
                                    }
                                    i9 = i8;
                                    c cVar29 = dVar4.f4512F[i5];
                                    cVar3 = dVar5.f4512F[i5].f4505d;
                                    int i44 = i5 + 1;
                                    c cVar30 = dVar2.f4512F[i44];
                                    cVar4 = dVar25.f4512F[i44].f4505d;
                                    if (cVar3 != null) {
                                        if (dVar4 != dVar2) {
                                            c0361e.e(cVar29.g, cVar3.g, cVar29.c(), 5);
                                        } else if (cVar4 != null) {
                                            i11 = 5;
                                            c0361e.b(cVar29.g, cVar3.g, cVar29.c(), 0.5f, cVar30.g, cVar4.g, cVar30.c(), 5);
                                            if (cVar4 != null && dVar4 != dVar2) {
                                                c0361e.e(cVar30.g, cVar4.g, -cVar30.c(), i11);
                                            }
                                            if (!z5) {
                                            }
                                            c[] cVarArr62 = dVar4.f4512F;
                                            cVar = cVarArr62[i5];
                                            i10 = i5 + 1;
                                            cVar2 = dVar2.f4512F[i10];
                                            c cVar232 = cVar.f4505d;
                                            if (cVar232 != null) {
                                            }
                                            c cVar242 = cVar2.f4505d;
                                            if (cVar242 != null) {
                                            }
                                            if (dVar25 != dVar2) {
                                            }
                                            if (dVar4 == dVar2) {
                                            }
                                            if (iVar == null) {
                                                c0361e.b(cVar.g, iVar, cVar.c(), 0.5f, iVar2, cVar2.g, dVar2.f4512F[i10].c(), 5);
                                            }
                                            i19 = i9 + 1;
                                            i18 = 2;
                                            eVar2 = eVar;
                                            i4 = i7;
                                            c0365bArr = c0365bArr3;
                                        }
                                    }
                                    i11 = 5;
                                    if (cVar4 != null) {
                                        c0361e.e(cVar30.g, cVar4.g, -cVar30.c(), i11);
                                    }
                                    if (!z5) {
                                    }
                                    c[] cVarArr622 = dVar4.f4512F;
                                    cVar = cVarArr622[i5];
                                    i10 = i5 + 1;
                                    cVar2 = dVar2.f4512F[i10];
                                    c cVar2322 = cVar.f4505d;
                                    if (cVar2322 != null) {
                                    }
                                    c cVar2422 = cVar2.f4505d;
                                    if (cVar2422 != null) {
                                    }
                                    if (dVar25 != dVar2) {
                                    }
                                    if (dVar4 == dVar2) {
                                    }
                                    if (iVar == null) {
                                    }
                                    i19 = i9 + 1;
                                    i18 = 2;
                                    eVar2 = eVar;
                                    i4 = i7;
                                    c0365bArr = c0365bArr3;
                                }
                            } else {
                                int i45 = c0365b3.f4495j;
                                boolean z18 = i45 > 0 && c0365b3.f4494i == i45;
                                d dVar38 = dVar4;
                                d dVar39 = dVar38;
                                while (dVar39 != null) {
                                    d dVar40 = dVar39.f4536b0[i3];
                                    while (dVar40 != null && dVar40.f4528V == 8) {
                                        dVar40 = dVar40.f4536b0[i3];
                                    }
                                    if (dVar40 != null || dVar39 == dVar2) {
                                        c[] cVarArr8 = dVar39.f4512F;
                                        c cVar31 = cVarArr8[i5];
                                        q.i iVar20 = cVar31.g;
                                        c cVar32 = cVar31.f4505d;
                                        q.i iVar21 = cVar32 != null ? cVar32.g : null;
                                        if (dVar38 != dVar39) {
                                            iVar21 = dVar38.f4512F[i5 + 1].g;
                                        } else if (dVar39 == dVar4 && dVar38 == dVar39) {
                                            c cVar33 = dVar3.f4512F[i5].f4505d;
                                            iVar21 = cVar33 != null ? cVar33.g : null;
                                        }
                                        int c7 = cVar31.c();
                                        int i46 = i5 + 1;
                                        int c8 = cVarArr8[i46].c();
                                        if (dVar40 != null) {
                                            cVar6 = dVar40.f4512F[i5];
                                            dVar9 = dVar40;
                                            iVar5 = cVar6.g;
                                            iVar6 = cVarArr8[i46].g;
                                        } else {
                                            dVar9 = dVar40;
                                            cVar6 = dVar25.f4512F[i46].f4505d;
                                            iVar5 = cVar6 != null ? cVar6.g : null;
                                            iVar6 = cVarArr8[i46].g;
                                        }
                                        q.i iVar22 = iVar6;
                                        if (cVar6 != null) {
                                            c8 = cVar6.c() + c8;
                                        }
                                        if (dVar38 != null) {
                                            c7 += dVar38.f4512F[i46].c();
                                        }
                                        if (iVar20 == null || iVar21 == null || iVar5 == null || iVar22 == null) {
                                            dVar10 = dVar3;
                                            dVar11 = dVar38;
                                            dVar12 = dVar9;
                                        } else {
                                            int c9 = dVar39 == dVar4 ? dVar4.f4512F[i5].c() : c7;
                                            if (dVar39 == dVar2) {
                                                c8 = dVar2.f4512F[i46].c();
                                            }
                                            dVar12 = dVar9;
                                            dVar10 = dVar3;
                                            int i47 = c8;
                                            dVar11 = dVar38;
                                            c0361e.b(iVar20, iVar21, c9, 0.5f, iVar5, iVar22, i47, z18 ? 8 : 5);
                                        }
                                    } else {
                                        dVar12 = dVar40;
                                        dVar10 = dVar3;
                                        dVar11 = dVar38;
                                    }
                                    if (dVar39.f4528V == 8) {
                                        dVar39 = dVar11;
                                    }
                                    dVar38 = dVar39;
                                    dVar39 = dVar12;
                                    dVar3 = dVar10;
                                }
                            }
                            i9 = i8;
                            if (!z5) {
                            }
                            c[] cVarArr6222 = dVar4.f4512F;
                            cVar = cVarArr6222[i5];
                            i10 = i5 + 1;
                            cVar2 = dVar2.f4512F[i10];
                            c cVar23222 = cVar.f4505d;
                            if (cVar23222 != null) {
                            }
                            c cVar24222 = cVar2.f4505d;
                            if (cVar24222 != null) {
                            }
                            if (dVar25 != dVar2) {
                            }
                            if (dVar4 == dVar2) {
                            }
                            if (iVar == null) {
                            }
                            i19 = i9 + 1;
                            i18 = 2;
                            eVar2 = eVar;
                            i4 = i7;
                            c0365bArr = c0365bArr3;
                        }
                    }
                    if (z4) {
                        c cVar34 = cVar14.f4505d;
                        if (cVar34.f4504b == eVar2) {
                            c0361e.e(cVar14.g, cVar34.g, -cVar14.c(), 4);
                        }
                    }
                    c0361e.g(cVar14.g, dVar25.f4512F[i35].f4505d.g, -cVar14.c(), 6);
                    if (z10) {
                    }
                    arrayList = c0365b3.h;
                    if (arrayList != null) {
                        if (c0365b3.f4499n) {
                        }
                        d dVar332 = null;
                        float f82 = 0.0f;
                        i14 = 0;
                        while (i14 < size) {
                        }
                    }
                    if (dVar32 != null) {
                    }
                    if (z5) {
                    }
                    dVar5 = dVar3;
                    int i392 = 8;
                    if (z6) {
                        int i402 = c0365b3.f4495j;
                        if (i402 <= 0) {
                        }
                        d dVar352 = dVar4;
                        dVar6 = dVar352;
                        while (dVar6 != null) {
                        }
                        i9 = i8;
                        c cVar292 = dVar4.f4512F[i5];
                        cVar3 = dVar5.f4512F[i5].f4505d;
                        int i442 = i5 + 1;
                        c cVar302 = dVar2.f4512F[i442];
                        cVar4 = dVar25.f4512F[i442].f4505d;
                        if (cVar3 != null) {
                        }
                        i11 = 5;
                        if (cVar4 != null) {
                        }
                        if (!z5) {
                        }
                        c[] cVarArr62222 = dVar4.f4512F;
                        cVar = cVarArr62222[i5];
                        i10 = i5 + 1;
                        cVar2 = dVar2.f4512F[i10];
                        c cVar232222 = cVar.f4505d;
                        if (cVar232222 != null) {
                        }
                        c cVar242222 = cVar2.f4505d;
                        if (cVar242222 != null) {
                        }
                        if (dVar25 != dVar2) {
                        }
                        if (dVar4 == dVar2) {
                        }
                        if (iVar == null) {
                        }
                        i19 = i9 + 1;
                        i18 = 2;
                        eVar2 = eVar;
                        i4 = i7;
                        c0365bArr = c0365bArr3;
                    }
                    i9 = i8;
                    if (!z5) {
                    }
                    c[] cVarArr622222 = dVar4.f4512F;
                    cVar = cVarArr622222[i5];
                    i10 = i5 + 1;
                    cVar2 = dVar2.f4512F[i10];
                    c cVar2322222 = cVar.f4505d;
                    if (cVar2322222 != null) {
                    }
                    c cVar2422222 = cVar2.f4505d;
                    if (cVar2422222 != null) {
                    }
                    if (dVar25 != dVar2) {
                    }
                    if (dVar4 == dVar2) {
                    }
                    if (iVar == null) {
                    }
                    i19 = i9 + 1;
                    i18 = 2;
                    eVar2 = eVar;
                    i4 = i7;
                    c0365bArr = c0365bArr3;
                }
            }
            if (z10) {
            }
            arrayList = c0365b3.h;
            if (arrayList != null) {
            }
            if (dVar32 != null) {
            }
            if (z5) {
            }
            dVar5 = dVar3;
            int i3922 = 8;
            if (z6) {
            }
            i9 = i8;
            if (!z5) {
            }
            c[] cVarArr6222222 = dVar4.f4512F;
            cVar = cVarArr6222222[i5];
            i10 = i5 + 1;
            cVar2 = dVar2.f4512F[i10];
            c cVar23222222 = cVar.f4505d;
            if (cVar23222222 != null) {
            }
            c cVar24222222 = cVar2.f4505d;
            if (cVar24222222 != null) {
            }
            if (dVar25 != dVar2) {
            }
            if (dVar4 == dVar2) {
            }
            if (iVar == null) {
            }
            i19 = i9 + 1;
            i18 = 2;
            eVar2 = eVar;
            i4 = i7;
            c0365bArr = c0365bArr3;
        }
    }
}
