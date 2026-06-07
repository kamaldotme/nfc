package s;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373c extends m {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4670k;

    /* renamed from: l, reason: collision with root package name */
    public int f4671l;

    public C0373c(r.d dVar, int i3) {
        super(dVar);
        r.d dVar2;
        this.f4670k = new ArrayList();
        this.f4696f = i3;
        r.d dVar3 = this.f4693b;
        r.d k2 = dVar3.k(i3);
        while (true) {
            r.d dVar4 = k2;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            } else {
                k2 = dVar3.k(this.f4696f);
            }
        }
        this.f4693b = dVar2;
        int i4 = this.f4696f;
        m mVar = i4 == 0 ? dVar2.f4538d : i4 == 1 ? dVar2.f4539e : null;
        ArrayList arrayList = this.f4670k;
        arrayList.add(mVar);
        r.d j3 = dVar2.j(this.f4696f);
        while (j3 != null) {
            int i5 = this.f4696f;
            arrayList.add(i5 == 0 ? j3.f4538d : i5 == 1 ? j3.f4539e : null);
            j3 = j3.j(this.f4696f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar2 = (m) it.next();
            int i6 = this.f4696f;
            if (i6 == 0) {
                mVar2.f4693b.f4535b = this;
            } else if (i6 == 1) {
                mVar2.f4693b.c = this;
            }
        }
        if (this.f4696f == 0 && ((r.e) this.f4693b.f4515I).f4563h0 && arrayList.size() > 1) {
            this.f4693b = ((m) arrayList.get(arrayList.size() - 1)).f4693b;
        }
        this.f4671l = this.f4696f == 0 ? this.f4693b.f4530X : this.f4693b.f4531Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c5, code lost:
    
        r1.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
    
        r13 = r13 + 1;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03c8, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc  */
    @Override // s.InterfaceC0374d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0374d interfaceC0374d) {
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        int i9;
        boolean z3;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        int i14;
        float f4;
        int max;
        int i15;
        boolean z5;
        int i16;
        C0376f c0376f = this.h;
        if (c0376f.f4683j) {
            C0376f c0376f2 = this.f4697i;
            if (c0376f2.f4683j) {
                r.d dVar = this.f4693b.f4515I;
                boolean z6 = (dVar == null || !(dVar instanceof r.e)) ? false : ((r.e) dVar).f4563h0;
                int i17 = c0376f2.g - c0376f.g;
                ArrayList arrayList3 = this.f4670k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i3 = -1;
                    i4 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((m) arrayList3.get(i18)).f4693b.f4528V != 8) {
                        break;
                    } else {
                        i18++;
                    }
                }
                int i19 = size - 1;
                int i20 = i19;
                while (true) {
                    if (i20 < 0) {
                        break;
                    }
                    if (((m) arrayList3.get(i20)).f4693b.f4528V != 8) {
                        i3 = i20;
                        break;
                    }
                    i20--;
                }
                int i21 = 0;
                while (i21 < 2) {
                    int i22 = 0;
                    i8 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    f3 = 0.0f;
                    while (i22 < size) {
                        m mVar = (m) arrayList3.get(i22);
                        r.d dVar2 = mVar.f4693b;
                        ArrayList arrayList4 = arrayList3;
                        if (dVar2.f4528V == i4) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i8 += mVar.h.f4681f;
                            }
                            C0377g c0377g = mVar.f4695e;
                            int i25 = c0377g.g;
                            i15 = i18;
                            boolean z7 = mVar.f4694d != 3;
                            if (z7) {
                                int i26 = this.f4696f;
                                if (i26 == 0 && !dVar2.f4538d.f4695e.f4683j) {
                                    return;
                                }
                                if (i26 == 1 && !dVar2.f4539e.f4695e.f4683j) {
                                    return;
                                } else {
                                    z5 = z7;
                                }
                            } else {
                                z5 = z7;
                                if (mVar.f4692a == 1 && i21 == 0) {
                                    i16 = c0377g.f4686m;
                                    i23++;
                                } else if (c0377g.f4683j) {
                                    i16 = i25;
                                }
                                z5 = true;
                                if (z5) {
                                    i23++;
                                    float f5 = dVar2.f4532Z[this.f4696f];
                                    if (f5 >= 0.0f) {
                                        f3 += f5;
                                    }
                                } else {
                                    i8 += i16;
                                }
                                if (i22 < i19 && i22 < i3) {
                                    i8 += -mVar.f4697i.f4681f;
                                }
                            }
                            i16 = i25;
                            if (z5) {
                            }
                            if (i22 < i19) {
                                i8 += -mVar.f4697i.f4681f;
                            }
                        }
                        i22++;
                        arrayList3 = arrayList4;
                        i18 = i15;
                        i4 = 8;
                    }
                    arrayList = arrayList3;
                    i5 = i18;
                    if (i8 < i17 || i23 == 0) {
                        i6 = i23;
                        i7 = i24;
                        break;
                    } else {
                        i21++;
                        arrayList3 = arrayList;
                        i18 = i5;
                        i4 = 8;
                    }
                }
                arrayList = arrayList3;
                i5 = i18;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                f3 = 0.0f;
                int i27 = c0376f.g;
                if (z6) {
                    i27 = c0376f2.g;
                }
                if (i8 > i17) {
                    i27 = z6 ? i27 + ((int) (((i8 - i17) / 2.0f) + 0.5f)) : i27 - ((int) (((i8 - i17) / 2.0f) + 0.5f));
                }
                if (i6 > 0) {
                    float f6 = i17 - i8;
                    int i28 = (int) ((f6 / i6) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        ArrayList arrayList5 = arrayList;
                        m mVar2 = (m) arrayList5.get(i29);
                        int i31 = i28;
                        r.d dVar3 = mVar2.f4693b;
                        int i32 = i8;
                        int i33 = i27;
                        if (dVar3.f4528V != 8 && mVar2.f4694d == 3) {
                            C0377g c0377g2 = mVar2.f4695e;
                            if (!c0377g2.f4683j) {
                                if (f3 > 0.0f) {
                                    z4 = z6;
                                    i14 = (int) (((dVar3.f4532Z[this.f4696f] * f6) / f3) + 0.5f);
                                } else {
                                    z4 = z6;
                                    i14 = i31;
                                }
                                if (this.f4696f == 0) {
                                    int i34 = dVar3.f4546n;
                                    f4 = f6;
                                    max = Math.max(dVar3.f4545m, mVar2.f4692a == 1 ? Math.min(i14, c0377g2.f4686m) : i14);
                                    if (i34 > 0) {
                                        max = Math.min(i34, max);
                                    }
                                } else {
                                    f4 = f6;
                                    int i35 = dVar3.f4549q;
                                    max = Math.max(dVar3.f4548p, mVar2.f4692a == 1 ? Math.min(i14, c0377g2.f4686m) : i14);
                                    if (i35 > 0) {
                                        max = Math.min(i35, max);
                                    }
                                }
                                i29++;
                                i28 = i31;
                                i8 = i32;
                                i27 = i33;
                                z6 = z4;
                                f6 = f4;
                                arrayList = arrayList5;
                            }
                        }
                        z4 = z6;
                        f4 = f6;
                        i29++;
                        i28 = i31;
                        i8 = i32;
                        i27 = i33;
                        z6 = z4;
                        f6 = f4;
                        arrayList = arrayList5;
                    }
                    i9 = i27;
                    z3 = z6;
                    arrayList2 = arrayList;
                    int i36 = i8;
                    if (i30 > 0) {
                        i6 -= i30;
                        int i37 = 0;
                        i8 = 0;
                        while (i37 < size) {
                            m mVar3 = (m) arrayList2.get(i37);
                            if (mVar3.f4693b.f4528V == 8) {
                                i13 = i5;
                            } else {
                                i13 = i5;
                                if (i37 > 0 && i37 >= i13) {
                                    i8 += mVar3.h.f4681f;
                                }
                                i8 += mVar3.f4695e.g;
                                if (i37 < i19 && i37 < i3) {
                                    i8 += -mVar3.f4697i.f4681f;
                                }
                            }
                            i37++;
                            i5 = i13;
                        }
                        i10 = i5;
                    } else {
                        i10 = i5;
                        i8 = i36;
                    }
                    i12 = 2;
                    if (this.f4671l == 2 && i30 == 0) {
                        i11 = 0;
                        this.f4671l = 0;
                    } else {
                        i11 = 0;
                    }
                } else {
                    i9 = i27;
                    z3 = z6;
                    arrayList2 = arrayList;
                    i10 = i5;
                    i11 = 0;
                    i12 = 2;
                }
                if (i8 > i17) {
                    this.f4671l = i12;
                }
                if (i7 > 0 && i6 == 0 && i10 == i3) {
                    this.f4671l = i12;
                }
                int i38 = this.f4671l;
                if (i38 == 1) {
                    int i39 = i7 > 1 ? (i17 - i8) / (i7 - 1) : i7 == 1 ? (i17 - i8) / 2 : i11;
                    if (i6 > 0) {
                        i39 = i11;
                    }
                    int i40 = i9;
                    for (int i41 = i11; i41 < size; i41++) {
                        m mVar4 = (m) arrayList2.get(z3 ? size - (i41 + 1) : i41);
                        int i42 = mVar4.f4693b.f4528V;
                        C0376f c0376f3 = mVar4.f4697i;
                        C0376f c0376f4 = mVar4.h;
                        if (i42 == 8) {
                            c0376f4.d(i40);
                            c0376f3.d(i40);
                        } else {
                            if (i41 > 0) {
                                i40 = z3 ? i40 - i39 : i40 + i39;
                            }
                            if (i41 > 0 && i41 >= i10) {
                                i40 = z3 ? i40 - c0376f4.f4681f : i40 + c0376f4.f4681f;
                            }
                            if (z3) {
                                c0376f3.d(i40);
                            } else {
                                c0376f4.d(i40);
                            }
                            C0377g c0377g3 = mVar4.f4695e;
                            int i43 = c0377g3.g;
                            if (mVar4.f4694d == 3 && mVar4.f4692a == 1) {
                                i43 = c0377g3.f4686m;
                            }
                            i40 = z3 ? i40 - i43 : i40 + i43;
                            if (z3) {
                                c0376f4.d(i40);
                            } else {
                                c0376f3.d(i40);
                            }
                            mVar4.g = true;
                            if (i41 < i19 && i41 < i3) {
                                i40 = z3 ? i40 - (-c0376f3.f4681f) : i40 + (-c0376f3.f4681f);
                            }
                        }
                    }
                    return;
                }
                if (i38 == 0) {
                    int i44 = (i17 - i8) / (i7 + 1);
                    if (i6 > 0) {
                        i44 = i11;
                    }
                    int i45 = i9;
                    for (int i46 = i11; i46 < size; i46++) {
                        m mVar5 = (m) arrayList2.get(z3 ? size - (i46 + 1) : i46);
                        int i47 = mVar5.f4693b.f4528V;
                        C0376f c0376f5 = mVar5.f4697i;
                        C0376f c0376f6 = mVar5.h;
                        if (i47 == 8) {
                            c0376f6.d(i45);
                            c0376f5.d(i45);
                        } else {
                            int i48 = z3 ? i45 - i44 : i45 + i44;
                            if (i46 > 0 && i46 >= i10) {
                                i48 = z3 ? i48 - c0376f6.f4681f : i48 + c0376f6.f4681f;
                            }
                            if (z3) {
                                c0376f5.d(i48);
                            } else {
                                c0376f6.d(i48);
                            }
                            C0377g c0377g4 = mVar5.f4695e;
                            int i49 = c0377g4.g;
                            if (mVar5.f4694d == 3 && mVar5.f4692a == 1) {
                                i49 = Math.min(i49, c0377g4.f4686m);
                            }
                            i45 = z3 ? i48 - i49 : i48 + i49;
                            if (z3) {
                                c0376f6.d(i45);
                            } else {
                                c0376f5.d(i45);
                            }
                            if (i46 < i19 && i46 < i3) {
                                i45 = z3 ? i45 - (-c0376f5.f4681f) : i45 + (-c0376f5.f4681f);
                            }
                        }
                    }
                    return;
                }
                if (i38 == 2) {
                    float f7 = this.f4696f == 0 ? this.f4693b.f4525S : this.f4693b.f4526T;
                    if (z3) {
                        f7 = 1.0f - f7;
                    }
                    int i50 = (int) (((i17 - i8) * f7) + 0.5f);
                    if (i50 < 0 || i6 > 0) {
                        i50 = i11;
                    }
                    int i51 = z3 ? i9 - i50 : i9 + i50;
                    for (int i52 = i11; i52 < size; i52++) {
                        m mVar6 = (m) arrayList2.get(z3 ? size - (i52 + 1) : i52);
                        int i53 = mVar6.f4693b.f4528V;
                        C0376f c0376f7 = mVar6.f4697i;
                        C0376f c0376f8 = mVar6.h;
                        if (i53 == 8) {
                            c0376f8.d(i51);
                            c0376f7.d(i51);
                        } else {
                            if (i52 > 0 && i52 >= i10) {
                                i51 = z3 ? i51 - c0376f8.f4681f : i51 + c0376f8.f4681f;
                            }
                            if (z3) {
                                c0376f7.d(i51);
                            } else {
                                c0376f8.d(i51);
                            }
                            C0377g c0377g5 = mVar6.f4695e;
                            int i54 = c0377g5.g;
                            if (mVar6.f4694d == 3 && mVar6.f4692a == 1) {
                                i54 = c0377g5.f4686m;
                            }
                            i51 += i54;
                            if (z3) {
                                c0376f8.d(i51);
                            } else {
                                c0376f7.d(i51);
                            }
                            if (i52 < i19 && i52 < i3) {
                                i51 = z3 ? i51 - (-c0376f7.f4681f) : i51 + (-c0376f7.f4681f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // s.m
    public final void d() {
        ArrayList arrayList = this.f4670k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        r.d dVar = ((m) arrayList.get(0)).f4693b;
        r.d dVar2 = ((m) arrayList.get(size - 1)).f4693b;
        int i3 = this.f4696f;
        C0376f c0376f = this.f4697i;
        C0376f c0376f2 = this.h;
        if (i3 == 0) {
            r.c cVar = dVar.f4556x;
            r.c cVar2 = dVar2.f4558z;
            C0376f i4 = m.i(cVar, 0);
            int c = cVar.c();
            r.d m3 = m();
            if (m3 != null) {
                c = m3.f4556x.c();
            }
            if (i4 != null) {
                m.b(c0376f2, i4, c);
            }
            C0376f i5 = m.i(cVar2, 0);
            int c3 = cVar2.c();
            r.d n3 = n();
            if (n3 != null) {
                c3 = n3.f4558z.c();
            }
            if (i5 != null) {
                m.b(c0376f, i5, -c3);
            }
        } else {
            r.c cVar3 = dVar.f4557y;
            r.c cVar4 = dVar2.f4508A;
            C0376f i6 = m.i(cVar3, 1);
            int c4 = cVar3.c();
            r.d m4 = m();
            if (m4 != null) {
                c4 = m4.f4557y.c();
            }
            if (i6 != null) {
                m.b(c0376f2, i6, c4);
            }
            C0376f i7 = m.i(cVar4, 1);
            int c5 = cVar4.c();
            r.d n4 = n();
            if (n4 != null) {
                c5 = n4.f4508A.c();
            }
            if (i7 != null) {
                m.b(c0376f, i7, -c5);
            }
        }
        c0376f2.f4677a = this;
        c0376f.f4677a = this;
    }

    @Override // s.m
    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4670k;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i3)).e();
            i3++;
        }
    }

    @Override // s.m
    public final void f() {
        this.c = null;
        Iterator it = this.f4670k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // s.m
    public final long j() {
        ArrayList arrayList = this.f4670k;
        int size = arrayList.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j3 = r5.f4697i.f4681f + ((m) arrayList.get(i3)).j() + j3 + r5.h.f4681f;
        }
        return j3;
    }

    @Override // s.m
    public final boolean k() {
        ArrayList arrayList = this.f4670k;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!((m) arrayList.get(i3)).k()) {
                return false;
            }
        }
        return true;
    }

    public final r.d m() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4670k;
            if (i3 >= arrayList.size()) {
                return null;
            }
            r.d dVar = ((m) arrayList.get(i3)).f4693b;
            if (dVar.f4528V != 8) {
                return dVar;
            }
            i3++;
        }
    }

    public final r.d n() {
        ArrayList arrayList = this.f4670k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r.d dVar = ((m) arrayList.get(size)).f4693b;
            if (dVar.f4528V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String concat = "ChainRun ".concat(this.f4696f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f4670k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            concat = X.d.h(X.d.h(concat, "<") + mVar, "> ");
        }
        return concat;
    }
}
