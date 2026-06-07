package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import q1.C0363a;
import r.c;
import r.d;
import r.e;
import r.f;
import r.g;
import r.h;
import r.i;
import s.C0372b;
import t.o;
import t.p;

/* loaded from: classes.dex */
public class Flow extends p {

    /* renamed from: j, reason: collision with root package name */
    public g f1683j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r.g, r.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [s.b, java.lang.Object] */
    @Override // t.p, t.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        ?? iVar = new i();
        iVar.f4601f0 = 0;
        iVar.f4602g0 = 0;
        iVar.f4603h0 = 0;
        iVar.i0 = 0;
        iVar.f4604j0 = 0;
        iVar.f4605k0 = 0;
        iVar.f4606l0 = false;
        iVar.f4607m0 = 0;
        iVar.f4608n0 = 0;
        iVar.f4609o0 = new Object();
        iVar.f4610p0 = null;
        iVar.f4611q0 = -1;
        iVar.f4612r0 = -1;
        iVar.f4613s0 = -1;
        iVar.f4614t0 = -1;
        iVar.f4615u0 = -1;
        iVar.f4616v0 = -1;
        iVar.f4617w0 = 0.5f;
        iVar.f4618x0 = 0.5f;
        iVar.f4619y0 = 0.5f;
        iVar.f4620z0 = 0.5f;
        iVar.f4588A0 = 0.5f;
        iVar.f4589B0 = 0.5f;
        iVar.f4590C0 = 0;
        iVar.f4591D0 = 0;
        iVar.f4592E0 = 2;
        iVar.f4593F0 = 2;
        iVar.f4594G0 = 0;
        iVar.f4595H0 = -1;
        iVar.f4596I0 = 0;
        iVar.f4597J0 = new ArrayList();
        iVar.K0 = null;
        iVar.f4598L0 = null;
        iVar.M0 = null;
        iVar.f4600O0 = 0;
        this.f1683j = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f4881b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 0) {
                    this.f1683j.f4596I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f1683j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f4601f0 = dimensionPixelSize;
                    gVar.f4602g0 = dimensionPixelSize;
                    gVar.f4603h0 = dimensionPixelSize;
                    gVar.i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar2 = this.f1683j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f4603h0 = dimensionPixelSize2;
                    gVar2.f4604j0 = dimensionPixelSize2;
                    gVar2.f4605k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f1683j.i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1683j.f4604j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1683j.f4601f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1683j.f4605k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1683j.f4602g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f1683j.f4594G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f1683j.f4611q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f1683j.f4612r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f1683j.f4613s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f1683j.f4615u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f1683j.f4614t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f1683j.f4616v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f1683j.f4617w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f1683j.f4619y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f1683j.f4588A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f1683j.f4620z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f1683j.f4589B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f1683j.f4618x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f1683j.f4592E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f1683j.f4593F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f1683j.f4590C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f1683j.f4591D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f1683j.f4595H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f4732e = this.f1683j;
        g();
    }

    @Override // t.b
    public final void f(d dVar, boolean z3) {
        g gVar = this.f1683j;
        int i3 = gVar.f4603h0;
        if (i3 > 0 || gVar.i0 > 0) {
            if (z3) {
                gVar.f4604j0 = gVar.i0;
                gVar.f4605k0 = i3;
            } else {
                gVar.f4604j0 = i3;
                gVar.f4605k0 = gVar.i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05ad  */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    @Override // t.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(g gVar, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z3;
        f fVar;
        char c;
        ?? r35;
        int i17;
        int i18;
        int i19;
        boolean z4;
        int i20;
        int i21;
        int i22;
        d[] dVarArr;
        int i23;
        c cVar;
        int i24;
        int i25;
        d dVar;
        int i26;
        int i27;
        int i28;
        boolean z5;
        d dVar2;
        int i29;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (gVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (gVar.f4627e0 > 0) {
            d dVar3 = gVar.f4515I;
            C0363a c0363a = dVar3 != null ? ((e) dVar3).f4562g0 : null;
            if (c0363a == null) {
                gVar.f4607m0 = 0;
                gVar.f4608n0 = 0;
                gVar.f4606l0 = false;
                setMeasuredDimension(gVar.f4607m0, gVar.f4608n0);
            }
            for (int i30 = 0; i30 < gVar.f4627e0; i30++) {
                d dVar4 = gVar.f4626d0[i30];
                if (dVar4 != null && !(dVar4 instanceof h)) {
                    int h = dVar4.h(0);
                    int h3 = dVar4.h(1);
                    if (h != 3 || dVar4.f4542j == 1 || h3 != 3 || dVar4.f4543k == 1) {
                        if (h == 3) {
                            h = 2;
                        }
                        if (h3 == 3) {
                            h3 = 2;
                        }
                        C0372b c0372b = gVar.f4609o0;
                        c0372b.f4663a = h;
                        c0372b.f4664b = h3;
                        c0372b.c = dVar4.l();
                        c0372b.f4665d = dVar4.i();
                        c0363a.d(dVar4, c0372b);
                        dVar4.y(c0372b.f4666e);
                        dVar4.v(c0372b.f4667f);
                        int i31 = c0372b.g;
                        dVar4.f4522P = i31;
                        dVar4.f4555w = i31 > 0;
                    }
                }
            }
        }
        int i32 = gVar.f4604j0;
        int i33 = gVar.f4605k0;
        int i34 = gVar.f4601f0;
        int i35 = gVar.f4602g0;
        int[] iArr2 = new int[2];
        int i36 = (size - i32) - i33;
        int i37 = gVar.f4596I0;
        if (i37 == 1) {
            i36 = (size2 - i34) - i35;
        }
        if (i37 == 0) {
            if (gVar.f4611q0 == -1) {
                gVar.f4611q0 = 0;
            }
            if (gVar.f4612r0 == -1) {
                gVar.f4612r0 = 0;
            }
        } else {
            if (gVar.f4611q0 == -1) {
                gVar.f4611q0 = 0;
            }
            if (gVar.f4612r0 == -1) {
                gVar.f4612r0 = 0;
            }
        }
        d[] dVarArr2 = gVar.f4626d0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            i5 = gVar.f4627e0;
            if (i38 >= i5) {
                break;
            }
            if (gVar.f4626d0[i38].f4528V == 8) {
                i39++;
            }
            i38++;
        }
        if (i39 > 0) {
            dVarArr2 = new d[i5 - i39];
            int i40 = 0;
            i8 = 0;
            while (i40 < gVar.f4627e0) {
                d dVar5 = gVar.f4626d0[i40];
                int i41 = i35;
                int i42 = i34;
                if (dVar5.f4528V != 8) {
                    dVarArr2[i8] = dVar5;
                    i8++;
                }
                i40++;
                i35 = i41;
                i34 = i42;
            }
            i6 = i35;
            i7 = i34;
        } else {
            i6 = i35;
            i7 = i34;
            i8 = i5;
        }
        d[] dVarArr3 = dVarArr2;
        gVar.f4599N0 = dVarArr3;
        gVar.f4600O0 = i8;
        int i43 = gVar.f4594G0;
        ArrayList arrayList = gVar.f4597J0;
        if (i43 != 0) {
            if (i43 == 1) {
                z4 = true;
                i20 = i33;
                i21 = i32;
                i14 = size2;
                int i44 = gVar.f4596I0;
                if (i8 != 0) {
                    arrayList.clear();
                    int i45 = i36;
                    iArr = iArr2;
                    i15 = i6;
                    i16 = i7;
                    i9 = i20;
                    i10 = i21;
                    i13 = mode2;
                    z3 = true;
                    f fVar2 = new f(gVar, i44, gVar.f4556x, gVar.f4557y, gVar.f4558z, gVar.f4508A, i45);
                    arrayList.add(fVar2);
                    if (i44 == 0) {
                        f fVar3 = fVar2;
                        int i46 = 0;
                        i22 = 0;
                        int i47 = 0;
                        while (i46 < i8) {
                            d dVar6 = dVarArr3[i46];
                            int i48 = i45;
                            int D = gVar.D(dVar6, i48);
                            if (dVar6.f4537c0[0] == 3) {
                                i22++;
                            }
                            int i49 = i22;
                            boolean z6 = (i47 == i48 || (gVar.f4590C0 + i47) + D > i48) && fVar3.f4574b != null;
                            if ((z6 || i46 <= 0 || (i26 = gVar.f4595H0) <= 0 || i46 % i26 != 0) && !z6) {
                                i45 = i48;
                                i24 = mode;
                                i25 = size;
                                dVar = dVar6;
                                if (i46 > 0) {
                                    i47 = gVar.f4590C0 + D + i47;
                                    fVar3.a(dVar);
                                    i46++;
                                    i22 = i49;
                                    size = i25;
                                    mode = i24;
                                }
                            } else {
                                i45 = i48;
                                i25 = size;
                                i24 = mode;
                                dVar = dVar6;
                                f fVar4 = new f(gVar, i44, gVar.f4556x, gVar.f4557y, gVar.f4558z, gVar.f4508A, i45);
                                fVar4.f4583n = i46;
                                arrayList.add(fVar4);
                                fVar3 = fVar4;
                            }
                            i47 = D;
                            fVar3.a(dVar);
                            i46++;
                            i22 = i49;
                            size = i25;
                            mode = i24;
                        }
                        i11 = mode;
                        i12 = size;
                    } else {
                        i11 = mode;
                        i12 = size;
                        f fVar5 = fVar2;
                        int i50 = 0;
                        i22 = 0;
                        int i51 = 0;
                        while (i50 < i8) {
                            d dVar7 = dVarArr3[i50];
                            int i52 = i45;
                            int C2 = gVar.C(dVar7, i52);
                            if (dVar7.f4537c0[1] == 3) {
                                i22++;
                            }
                            int i53 = i22;
                            boolean z7 = (i51 == i52 || (gVar.f4591D0 + i51) + C2 > i52) && fVar5.f4574b != null;
                            if ((z7 || i50 <= 0 || (i23 = gVar.f4595H0) <= 0 || i50 % i23 != 0) && !z7) {
                                dVarArr = dVarArr3;
                                if (i50 > 0) {
                                    i51 = gVar.f4591D0 + C2 + i51;
                                    fVar5.a(dVar7);
                                    i50++;
                                    i22 = i53;
                                    dVarArr3 = dVarArr;
                                    i45 = i52;
                                }
                            } else {
                                dVarArr = dVarArr3;
                                f fVar6 = new f(gVar, i44, gVar.f4556x, gVar.f4557y, gVar.f4558z, gVar.f4508A, i52);
                                fVar6.f4583n = i50;
                                arrayList.add(fVar6);
                                fVar5 = fVar6;
                            }
                            i51 = C2;
                            fVar5.a(dVar7);
                            i50++;
                            i22 = i53;
                            dVarArr3 = dVarArr;
                            i45 = i52;
                        }
                    }
                    int i54 = i45;
                    int size3 = arrayList.size();
                    int i55 = gVar.f4604j0;
                    int i56 = gVar.f4601f0;
                    int i57 = gVar.f4605k0;
                    int i58 = gVar.f4602g0;
                    int[] iArr3 = gVar.f4537c0;
                    boolean z8 = iArr3[0] == 2 || iArr3[1] == 2;
                    if (i22 > 0 && z8) {
                        for (int i59 = 0; i59 < size3; i59++) {
                            f fVar7 = (f) arrayList.get(i59);
                            if (i44 == 0) {
                                fVar7.e(i54 - fVar7.d());
                            } else {
                                fVar7.e(i54 - fVar7.c());
                            }
                        }
                    }
                    c cVar2 = gVar.f4508A;
                    c cVar3 = gVar.f4558z;
                    c cVar4 = gVar.f4556x;
                    c cVar5 = gVar.f4557y;
                    c cVar6 = cVar2;
                    c cVar7 = cVar3;
                    int i60 = 0;
                    int i61 = 0;
                    int i62 = 0;
                    while (i60 < size3) {
                        c cVar8 = cVar2;
                        f fVar8 = (f) arrayList.get(i60);
                        if (i44 == 0) {
                            if (i60 < size3 - 1) {
                                cVar6 = ((f) arrayList.get(i60 + 1)).f4574b.f4557y;
                                cVar = cVar3;
                                i58 = 0;
                            } else {
                                i58 = gVar.f4602g0;
                                cVar6 = cVar8;
                                cVar = cVar3;
                            }
                            c cVar9 = fVar8.f4574b.f4508A;
                            fVar8.f(i44, cVar4, cVar5, cVar7, cVar6, i55, i56, i57, i58, i54);
                            int max = Math.max(i61, fVar8.d());
                            int c3 = fVar8.c() + i62;
                            if (i60 > 0) {
                                c3 += gVar.f4591D0;
                            }
                            i62 = c3;
                            i61 = max;
                            cVar5 = cVar9;
                            i56 = 0;
                        } else {
                            cVar = cVar3;
                            if (i60 < size3 - 1) {
                                cVar7 = ((f) arrayList.get(i60 + 1)).f4574b.f4556x;
                                i57 = 0;
                            } else {
                                i57 = gVar.f4605k0;
                                cVar7 = cVar;
                            }
                            c cVar10 = fVar8.f4574b.f4558z;
                            fVar8.f(i44, cVar4, cVar5, cVar7, cVar6, i55, i56, i57, i58, i54);
                            int d3 = fVar8.d() + i61;
                            int max2 = Math.max(i62, fVar8.c());
                            if (i60 > 0) {
                                d3 += gVar.f4590C0;
                            }
                            i62 = max2;
                            i61 = d3;
                            cVar4 = cVar10;
                            i55 = 0;
                        }
                        i60++;
                        cVar2 = cVar8;
                        cVar3 = cVar;
                    }
                    iArr[0] = i61;
                    iArr[1] = i62;
                    c = 0;
                    r35 = z3;
                    int i63 = iArr[c] + i10 + i9;
                    int i64 = iArr[r35] + i16 + i15;
                    i17 = i11;
                    if (i17 == 1073741824) {
                    }
                    if (i18 == 1073741824) {
                    }
                    gVar.f4607m0 = i19;
                    gVar.f4608n0 = r13;
                    gVar.y(i19);
                    gVar.v(r13);
                    gVar.f4606l0 = gVar.f4627e0 > 0 ? r35 : false;
                }
            } else if (i43 != 2) {
                iArr = iArr2;
                i9 = i33;
                i10 = i32;
                i11 = mode;
                i12 = size;
                i13 = mode2;
                i14 = size2;
                i15 = i6;
                i16 = i7;
                c = 0;
                r35 = 1;
                int i632 = iArr[c] + i10 + i9;
                int i642 = iArr[r35] + i16 + i15;
                i17 = i11;
                if (i17 == 1073741824) {
                    i18 = i13;
                    i19 = i12;
                } else {
                    if (i17 == Integer.MIN_VALUE) {
                        i19 = Math.min(i632, i12);
                    } else if (i17 == 0) {
                        i19 = i632;
                    } else {
                        i18 = i13;
                        i19 = 0;
                    }
                    i18 = i13;
                }
                int min = i18 == 1073741824 ? i14 : i18 == Integer.MIN_VALUE ? Math.min(i642, i14) : i18 == 0 ? i642 : 0;
                gVar.f4607m0 = i19;
                gVar.f4608n0 = min;
                gVar.y(i19);
                gVar.v(min);
                gVar.f4606l0 = gVar.f4627e0 > 0 ? r35 : false;
            } else {
                int i65 = gVar.f4596I0;
                if (i65 == 0) {
                    int i66 = gVar.f4595H0;
                    if (i66 <= 0) {
                        int i67 = 0;
                        int i68 = 0;
                        i28 = 0;
                        while (true) {
                            i20 = i33;
                            if (i67 >= i8) {
                                break;
                            }
                            if (i67 > 0) {
                                i68 += gVar.f4590C0;
                            }
                            d dVar8 = dVarArr3[i67];
                            if (dVar8 != null) {
                                int D2 = gVar.D(dVar8, i36) + i68;
                                if (D2 > i36) {
                                    break;
                                }
                                i28++;
                                i68 = D2;
                            }
                            i67++;
                            i33 = i20;
                        }
                    } else {
                        i20 = i33;
                        i28 = i66;
                    }
                    i27 = 0;
                } else {
                    i20 = i33;
                    i27 = gVar.f4595H0;
                    if (i27 <= 0) {
                        int i69 = 0;
                        int i70 = 0;
                        for (int i71 = 0; i71 < i8; i71++) {
                            if (i71 > 0) {
                                i69 += gVar.f4591D0;
                            }
                            d dVar9 = dVarArr3[i71];
                            if (dVar9 != null) {
                                int C3 = gVar.C(dVar9, i36) + i69;
                                if (C3 > i36) {
                                    break;
                                }
                                i70++;
                                i69 = C3;
                            }
                        }
                        i27 = i70;
                    }
                    i28 = 0;
                }
                if (gVar.M0 == null) {
                    gVar.M0 = new int[2];
                }
                boolean z9 = (i27 == 0 && i65 == 1) || (i28 == 0 && i65 == 0);
                while (!z9) {
                    if (i65 == 0) {
                        z5 = z9;
                        i27 = (int) Math.ceil(i8 / i28);
                    } else {
                        z5 = z9;
                        i28 = (int) Math.ceil(i8 / i27);
                    }
                    d[] dVarArr4 = gVar.f4598L0;
                    if (dVarArr4 == null || dVarArr4.length < i28) {
                        gVar.f4598L0 = new d[i28];
                    } else {
                        Arrays.fill(dVarArr4, (Object) null);
                    }
                    d[] dVarArr5 = gVar.K0;
                    if (dVarArr5 == null || dVarArr5.length < i27) {
                        gVar.K0 = new d[i27];
                    } else {
                        Arrays.fill(dVarArr5, (Object) null);
                    }
                    for (int i72 = 0; i72 < i28; i72++) {
                        int i73 = 0;
                        while (i73 < i27) {
                            int i74 = (i73 * i28) + i72;
                            int i75 = i32;
                            if (i65 == 1) {
                                i74 = (i72 * i27) + i73;
                            }
                            int i76 = i74;
                            if (i76 < dVarArr3.length && (dVar2 = dVarArr3[i76]) != null) {
                                int D3 = gVar.D(dVar2, i36);
                                i29 = size2;
                                d dVar10 = gVar.f4598L0[i72];
                                if (dVar10 == null || dVar10.l() < D3) {
                                    gVar.f4598L0[i72] = dVar2;
                                }
                                int C4 = gVar.C(dVar2, i36);
                                d dVar11 = gVar.K0[i73];
                                if (dVar11 == null || dVar11.i() < C4) {
                                    gVar.K0[i73] = dVar2;
                                }
                            } else {
                                i29 = size2;
                            }
                            i73++;
                            i32 = i75;
                            size2 = i29;
                        }
                    }
                    int i77 = i32;
                    int i78 = size2;
                    int i79 = 0;
                    for (int i80 = 0; i80 < i28; i80++) {
                        d dVar12 = gVar.f4598L0[i80];
                        if (dVar12 != null) {
                            if (i80 > 0) {
                                i79 += gVar.f4590C0;
                            }
                            i79 = gVar.D(dVar12, i36) + i79;
                        }
                    }
                    int i81 = 0;
                    for (int i82 = 0; i82 < i27; i82++) {
                        d dVar13 = gVar.K0[i82];
                        if (dVar13 != null) {
                            if (i82 > 0) {
                                i81 += gVar.f4591D0;
                            }
                            i81 = gVar.C(dVar13, i36) + i81;
                        }
                    }
                    iArr2[0] = i79;
                    iArr2[1] = i81;
                    if (i65 == 0) {
                        if (i79 > i36 && i28 > 1) {
                            i28--;
                            z9 = z5;
                        }
                        z9 = true;
                    } else {
                        if (i81 > i36 && i27 > 1) {
                            i27--;
                            z9 = z5;
                        }
                        z9 = true;
                    }
                    i32 = i77;
                    size2 = i78;
                }
                i21 = i32;
                i14 = size2;
                z4 = true;
                int[] iArr4 = gVar.M0;
                iArr4[0] = i28;
                iArr4[1] = i27;
            }
            z3 = z4;
            iArr = iArr2;
            i11 = mode;
            i12 = size;
            i13 = mode2;
            i9 = i20;
            i15 = i6;
            i16 = i7;
            i10 = i21;
            c = 0;
            r35 = z3;
            int i6322 = iArr[c] + i10 + i9;
            int i6422 = iArr[r35] + i16 + i15;
            i17 = i11;
            if (i17 == 1073741824) {
            }
            if (i18 == 1073741824) {
            }
            gVar.f4607m0 = i19;
            gVar.f4608n0 = min;
            gVar.y(i19);
            gVar.v(min);
            gVar.f4606l0 = gVar.f4627e0 > 0 ? r35 : false;
        } else {
            iArr = iArr2;
            i9 = i33;
            i10 = i32;
            i11 = mode;
            i12 = size;
            i13 = mode2;
            i14 = size2;
            i15 = i6;
            i16 = i7;
            z3 = true;
            r35 = 1;
            int i83 = i36;
            int i84 = gVar.f4596I0;
            if (i8 != 0) {
                if (arrayList.size() == 0) {
                    fVar = new f(gVar, i84, gVar.f4556x, gVar.f4557y, gVar.f4558z, gVar.f4508A, i83);
                    arrayList.add(fVar);
                } else {
                    fVar = (f) arrayList.get(0);
                    fVar.c = 0;
                    fVar.f4574b = null;
                    fVar.f4581l = 0;
                    fVar.f4582m = 0;
                    fVar.f4583n = 0;
                    fVar.f4584o = 0;
                    fVar.f4585p = 0;
                    fVar.f(i84, gVar.f4556x, gVar.f4557y, gVar.f4558z, gVar.f4508A, gVar.f4604j0, gVar.f4601f0, gVar.f4605k0, gVar.f4602g0, i83);
                }
                for (int i85 = 0; i85 < i8; i85++) {
                    fVar.a(dVarArr3[i85]);
                }
                c = 0;
                iArr[0] = fVar.d();
                iArr[1] = fVar.c();
                int i63222 = iArr[c] + i10 + i9;
                int i64222 = iArr[r35] + i16 + i15;
                i17 = i11;
                if (i17 == 1073741824) {
                }
                if (i18 == 1073741824) {
                }
                gVar.f4607m0 = i19;
                gVar.f4608n0 = min;
                gVar.y(i19);
                gVar.v(min);
                gVar.f4606l0 = gVar.f4627e0 > 0 ? r35 : false;
            }
            c = 0;
            r35 = z3;
            int i632222 = iArr[c] + i10 + i9;
            int i642222 = iArr[r35] + i16 + i15;
            i17 = i11;
            if (i17 == 1073741824) {
            }
            if (i18 == 1073741824) {
            }
            gVar.f4607m0 = i19;
            gVar.f4608n0 = min;
            gVar.y(i19);
            gVar.v(min);
            gVar.f4606l0 = gVar.f4627e0 > 0 ? r35 : false;
        }
        setMeasuredDimension(gVar.f4607m0, gVar.f4608n0);
    }

    @Override // t.b, android.view.View
    public final void onMeasure(int i3, int i4) {
        h(this.f1683j, i3, i4);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f1683j.f4619y0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i3) {
        this.f1683j.f4613s0 = i3;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f1683j.f4620z0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i3) {
        this.f1683j.f4614t0 = i3;
        requestLayout();
    }

    public void setHorizontalAlign(int i3) {
        this.f1683j.f4592E0 = i3;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f1683j.f4617w0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i3) {
        this.f1683j.f4590C0 = i3;
        requestLayout();
    }

    public void setHorizontalStyle(int i3) {
        this.f1683j.f4611q0 = i3;
        requestLayout();
    }

    public void setMaxElementsWrap(int i3) {
        this.f1683j.f4595H0 = i3;
        requestLayout();
    }

    public void setOrientation(int i3) {
        this.f1683j.f4596I0 = i3;
        requestLayout();
    }

    public void setPadding(int i3) {
        g gVar = this.f1683j;
        gVar.f4601f0 = i3;
        gVar.f4602g0 = i3;
        gVar.f4603h0 = i3;
        gVar.i0 = i3;
        requestLayout();
    }

    public void setPaddingBottom(int i3) {
        this.f1683j.f4602g0 = i3;
        requestLayout();
    }

    public void setPaddingLeft(int i3) {
        this.f1683j.f4604j0 = i3;
        requestLayout();
    }

    public void setPaddingRight(int i3) {
        this.f1683j.f4605k0 = i3;
        requestLayout();
    }

    public void setPaddingTop(int i3) {
        this.f1683j.f4601f0 = i3;
        requestLayout();
    }

    public void setVerticalAlign(int i3) {
        this.f1683j.f4593F0 = i3;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f1683j.f4618x0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i3) {
        this.f1683j.f4591D0 = i3;
        requestLayout();
    }

    public void setVerticalStyle(int i3) {
        this.f1683j.f4612r0 = i3;
        requestLayout();
    }

    public void setWrapMode(int i3) {
        this.f1683j.f4594G0 = i3;
        requestLayout();
    }
}
