package s;

import java.util.ArrayList;

/* renamed from: s.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380j extends m {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f4687k = new int[2];

    public static void m(int[] iArr, int i3, int i4, int i5, int i6, float f3, int i7) {
        int i8 = i4 - i3;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f3) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f3) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f3) + 0.5f);
        int i11 = (int) ((i8 / f3) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0244, code lost:
    
        if (r3 != 1) goto L128;
     */
    @Override // s.InterfaceC0374d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0374d interfaceC0374d) {
        float f3;
        float f4;
        float f5;
        int i3;
        if (q.h.a(this.f4698j) == 3) {
            r.d dVar = this.f4693b;
            l(dVar.f4556x, dVar.f4558z, 0);
            return;
        }
        C0377g c0377g = this.f4695e;
        boolean z3 = c0377g.f4683j;
        C0376f c0376f = this.h;
        C0376f c0376f2 = this.f4697i;
        if (!z3 && this.f4694d == 3) {
            r.d dVar2 = this.f4693b;
            int i4 = dVar2.f4542j;
            if (i4 == 2) {
                r.d dVar3 = dVar2.f4515I;
                if (dVar3 != null) {
                    if (dVar3.f4538d.f4695e.f4683j) {
                        c0377g.d((int) ((r3.g * dVar2.f4547o) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = dVar2.f4543k;
                if (i5 == 0 || i5 == 3) {
                    l lVar = dVar2.f4539e;
                    C0376f c0376f3 = lVar.h;
                    C0376f c0376f4 = lVar.f4697i;
                    boolean z4 = dVar2.f4556x.f4505d != null;
                    boolean z5 = dVar2.f4557y.f4505d != null;
                    boolean z6 = dVar2.f4558z.f4505d != null;
                    boolean z7 = dVar2.f4508A.f4505d != null;
                    int i6 = dVar2.f4519M;
                    if (z4 && z5 && z6 && z7) {
                        float f6 = dVar2.f4518L;
                        boolean z8 = c0376f3.f4683j;
                        int[] iArr = f4687k;
                        if (z8 && c0376f4.f4683j) {
                            if (c0376f.c && c0376f2.c) {
                                m(iArr, ((C0376f) c0376f.f4685l.get(0)).g + c0376f.f4681f, ((C0376f) c0376f2.f4685l.get(0)).g - c0376f2.f4681f, c0376f3.g + c0376f3.f4681f, c0376f4.g - c0376f4.f4681f, f6, i6);
                                c0377g.d(iArr[0]);
                                this.f4693b.f4539e.f4695e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z9 = c0376f.f4683j;
                        ArrayList arrayList = c0376f3.f4685l;
                        if (z9 && c0376f2.f4683j) {
                            if (!c0376f3.c || !c0376f4.c) {
                                return;
                            }
                            m(iArr, c0376f.g + c0376f.f4681f, c0376f2.g - c0376f2.f4681f, ((C0376f) arrayList.get(0)).g + c0376f3.f4681f, ((C0376f) c0376f4.f4685l.get(0)).g - c0376f4.f4681f, f6, i6);
                            c0377g.d(iArr[0]);
                            this.f4693b.f4539e.f4695e.d(iArr[1]);
                        }
                        if (!c0376f.c || !c0376f2.c || !c0376f3.c || !c0376f4.c) {
                            return;
                        }
                        m(iArr, ((C0376f) c0376f.f4685l.get(0)).g + c0376f.f4681f, ((C0376f) c0376f2.f4685l.get(0)).g - c0376f2.f4681f, ((C0376f) arrayList.get(0)).g + c0376f3.f4681f, ((C0376f) c0376f4.f4685l.get(0)).g - c0376f4.f4681f, f6, i6);
                        c0377g.d(iArr[0]);
                        this.f4693b.f4539e.f4695e.d(iArr[1]);
                    } else if (z4 && z6) {
                        if (!c0376f.c || !c0376f2.c) {
                            return;
                        }
                        float f7 = dVar2.f4518L;
                        int i7 = ((C0376f) c0376f.f4685l.get(0)).g + c0376f.f4681f;
                        int i8 = ((C0376f) c0376f2.f4685l.get(0)).g - c0376f2.f4681f;
                        if (i6 == -1 || i6 == 0) {
                            int g = g(i8 - i7, 0);
                            int i9 = (int) ((g * f7) + 0.5f);
                            int g3 = g(i9, 1);
                            if (i9 != g3) {
                                g = (int) ((g3 / f7) + 0.5f);
                            }
                            c0377g.d(g);
                            this.f4693b.f4539e.f4695e.d(g3);
                        } else if (i6 == 1) {
                            int g4 = g(i8 - i7, 0);
                            int i10 = (int) ((g4 / f7) + 0.5f);
                            int g5 = g(i10, 1);
                            if (i10 != g5) {
                                g4 = (int) ((g5 * f7) + 0.5f);
                            }
                            c0377g.d(g4);
                            this.f4693b.f4539e.f4695e.d(g5);
                        }
                    } else if (z5 && z7) {
                        if (!c0376f3.c || !c0376f4.c) {
                            return;
                        }
                        float f8 = dVar2.f4518L;
                        int i11 = ((C0376f) c0376f3.f4685l.get(0)).g + c0376f3.f4681f;
                        int i12 = ((C0376f) c0376f4.f4685l.get(0)).g - c0376f4.f4681f;
                        if (i6 != -1) {
                            if (i6 == 0) {
                                int g6 = g(i12 - i11, 1);
                                int i13 = (int) ((g6 * f8) + 0.5f);
                                int g7 = g(i13, 0);
                                if (i13 != g7) {
                                    g6 = (int) ((g7 / f8) + 0.5f);
                                }
                                c0377g.d(g7);
                                this.f4693b.f4539e.f4695e.d(g6);
                            }
                        }
                        int g8 = g(i12 - i11, 1);
                        int i14 = (int) ((g8 / f8) + 0.5f);
                        int g9 = g(i14, 0);
                        if (i14 != g9) {
                            g8 = (int) ((g9 * f8) + 0.5f);
                        }
                        c0377g.d(g9);
                        this.f4693b.f4539e.f4695e.d(g8);
                    }
                } else {
                    int i15 = dVar2.f4519M;
                    if (i15 == -1) {
                        f3 = dVar2.f4539e.f4695e.g;
                        f4 = dVar2.f4518L;
                    } else if (i15 == 0) {
                        f5 = dVar2.f4539e.f4695e.g / dVar2.f4518L;
                        i3 = (int) (f5 + 0.5f);
                        c0377g.d(i3);
                    } else if (i15 != 1) {
                        i3 = 0;
                        c0377g.d(i3);
                    } else {
                        f3 = dVar2.f4539e.f4695e.g;
                        f4 = dVar2.f4518L;
                    }
                    f5 = f3 * f4;
                    i3 = (int) (f5 + 0.5f);
                    c0377g.d(i3);
                }
            }
        }
        if (c0376f.c && c0376f2.c) {
            if (c0376f.f4683j && c0376f2.f4683j && c0377g.f4683j) {
                return;
            }
            if (!c0377g.f4683j && this.f4694d == 3) {
                r.d dVar4 = this.f4693b;
                if (dVar4.f4542j == 0 && !dVar4.q()) {
                    C0376f c0376f5 = (C0376f) c0376f.f4685l.get(0);
                    C0376f c0376f6 = (C0376f) c0376f2.f4685l.get(0);
                    int i16 = c0376f5.g + c0376f.f4681f;
                    int i17 = c0376f6.g + c0376f2.f4681f;
                    c0376f.d(i16);
                    c0376f2.d(i17);
                    c0377g.d(i17 - i16);
                    return;
                }
            }
            if (!c0377g.f4683j && this.f4694d == 3 && this.f4692a == 1 && c0376f.f4685l.size() > 0 && c0376f2.f4685l.size() > 0) {
                int min = Math.min((((C0376f) c0376f2.f4685l.get(0)).g + c0376f2.f4681f) - (((C0376f) c0376f.f4685l.get(0)).g + c0376f.f4681f), c0377g.f4686m);
                r.d dVar5 = this.f4693b;
                int i18 = dVar5.f4546n;
                int max = Math.max(dVar5.f4545m, min);
                if (i18 > 0) {
                    max = Math.min(i18, max);
                }
                c0377g.d(max);
            }
            if (c0377g.f4683j) {
                C0376f c0376f7 = (C0376f) c0376f.f4685l.get(0);
                C0376f c0376f8 = (C0376f) c0376f2.f4685l.get(0);
                int i19 = c0376f7.g;
                int i20 = c0376f.f4681f + i19;
                int i21 = c0376f8.g;
                int i22 = c0376f2.f4681f + i21;
                float f9 = this.f4693b.f4525S;
                if (c0376f7 == c0376f8) {
                    f9 = 0.5f;
                } else {
                    i19 = i20;
                    i21 = i22;
                }
                c0376f.d((int) ((((i21 - i19) - c0377g.g) * f9) + i19 + 0.5f));
                c0376f2.d(c0376f.g + c0377g.g);
            }
        }
    }

    @Override // s.m
    public final void d() {
        r.d dVar;
        r.d dVar2;
        r.d dVar3;
        r.d dVar4;
        r.d dVar5 = this.f4693b;
        boolean z3 = dVar5.f4533a;
        C0377g c0377g = this.f4695e;
        if (z3) {
            c0377g.d(dVar5.l());
        }
        boolean z4 = c0377g.f4683j;
        C0376f c0376f = this.f4697i;
        C0376f c0376f2 = this.h;
        if (!z4) {
            r.d dVar6 = this.f4693b;
            int i3 = dVar6.f4537c0[0];
            this.f4694d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (((dVar4 = dVar6.f4515I) != null && dVar4.f4537c0[0] == 1) || dVar4.f4537c0[0] == 4)) {
                    int l3 = (dVar4.l() - this.f4693b.f4556x.c()) - this.f4693b.f4558z.c();
                    C0380j c0380j = dVar4.f4538d;
                    m.b(c0376f2, c0380j.h, this.f4693b.f4556x.c());
                    m.b(c0376f, c0380j.f4697i, -this.f4693b.f4558z.c());
                    c0377g.d(l3);
                    return;
                }
                if (i3 == 1) {
                    c0377g.d(dVar6.l());
                }
            }
        } else if (this.f4694d == 4 && (((dVar2 = (dVar = this.f4693b).f4515I) != null && dVar2.f4537c0[0] == 1) || dVar2.f4537c0[0] == 4)) {
            m.b(c0376f2, dVar2.f4538d.h, dVar.f4556x.c());
            m.b(c0376f, dVar2.f4538d.f4697i, -this.f4693b.f4558z.c());
            return;
        }
        if (c0377g.f4683j) {
            r.d dVar7 = this.f4693b;
            if (dVar7.f4533a) {
                r.c[] cVarArr = dVar7.f4512F;
                r.c cVar = cVarArr[0];
                r.c cVar2 = cVar.f4505d;
                if (cVar2 != null && cVarArr[1].f4505d != null) {
                    if (dVar7.q()) {
                        c0376f2.f4681f = this.f4693b.f4512F[0].c();
                        c0376f.f4681f = -this.f4693b.f4512F[1].c();
                        return;
                    }
                    C0376f h = m.h(this.f4693b.f4512F[0]);
                    if (h != null) {
                        m.b(c0376f2, h, this.f4693b.f4512F[0].c());
                    }
                    C0376f h3 = m.h(this.f4693b.f4512F[1]);
                    if (h3 != null) {
                        m.b(c0376f, h3, -this.f4693b.f4512F[1].c());
                    }
                    c0376f2.f4678b = true;
                    c0376f.f4678b = true;
                    return;
                }
                if (cVar2 != null) {
                    C0376f h4 = m.h(cVar);
                    if (h4 != null) {
                        m.b(c0376f2, h4, this.f4693b.f4512F[0].c());
                        m.b(c0376f, c0376f2, c0377g.g);
                        return;
                    }
                    return;
                }
                r.c cVar3 = cVarArr[1];
                if (cVar3.f4505d != null) {
                    C0376f h5 = m.h(cVar3);
                    if (h5 != null) {
                        m.b(c0376f, h5, -this.f4693b.f4512F[1].c());
                        m.b(c0376f2, c0376f, -c0377g.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof r.i) || dVar7.f4515I == null || dVar7.g(7).f4505d != null) {
                    return;
                }
                r.d dVar8 = this.f4693b;
                m.b(c0376f2, dVar8.f4515I.f4538d.h, dVar8.m());
                m.b(c0376f, c0376f2, c0377g.g);
                return;
            }
        }
        if (this.f4694d == 3) {
            r.d dVar9 = this.f4693b;
            int i4 = dVar9.f4542j;
            if (i4 == 2) {
                r.d dVar10 = dVar9.f4515I;
                if (dVar10 != null) {
                    C0377g c0377g2 = dVar10.f4539e.f4695e;
                    c0377g.f4685l.add(c0377g2);
                    c0377g2.f4684k.add(c0377g);
                    c0377g.f4678b = true;
                    c0377g.f4684k.add(c0376f2);
                    c0377g.f4684k.add(c0376f);
                }
            } else if (i4 == 3) {
                if (dVar9.f4543k == 3) {
                    c0376f2.f4677a = this;
                    c0376f.f4677a = this;
                    l lVar = dVar9.f4539e;
                    lVar.h.f4677a = this;
                    lVar.f4697i.f4677a = this;
                    c0377g.f4677a = this;
                    if (dVar9.r()) {
                        c0377g.f4685l.add(this.f4693b.f4539e.f4695e);
                        this.f4693b.f4539e.f4695e.f4684k.add(c0377g);
                        l lVar2 = this.f4693b.f4539e;
                        lVar2.f4695e.f4677a = this;
                        c0377g.f4685l.add(lVar2.h);
                        c0377g.f4685l.add(this.f4693b.f4539e.f4697i);
                        this.f4693b.f4539e.h.f4684k.add(c0377g);
                        this.f4693b.f4539e.f4697i.f4684k.add(c0377g);
                    } else if (this.f4693b.q()) {
                        this.f4693b.f4539e.f4695e.f4685l.add(c0377g);
                        c0377g.f4684k.add(this.f4693b.f4539e.f4695e);
                    } else {
                        this.f4693b.f4539e.f4695e.f4685l.add(c0377g);
                    }
                } else {
                    C0377g c0377g3 = dVar9.f4539e.f4695e;
                    c0377g.f4685l.add(c0377g3);
                    c0377g3.f4684k.add(c0377g);
                    this.f4693b.f4539e.h.f4684k.add(c0377g);
                    this.f4693b.f4539e.f4697i.f4684k.add(c0377g);
                    c0377g.f4678b = true;
                    c0377g.f4684k.add(c0376f2);
                    c0377g.f4684k.add(c0376f);
                    c0376f2.f4685l.add(c0377g);
                    c0376f.f4685l.add(c0377g);
                }
            }
        }
        r.d dVar11 = this.f4693b;
        r.c[] cVarArr2 = dVar11.f4512F;
        r.c cVar4 = cVarArr2[0];
        r.c cVar5 = cVar4.f4505d;
        if (cVar5 != null && cVarArr2[1].f4505d != null) {
            if (dVar11.q()) {
                c0376f2.f4681f = this.f4693b.f4512F[0].c();
                c0376f.f4681f = -this.f4693b.f4512F[1].c();
                return;
            }
            C0376f h6 = m.h(this.f4693b.f4512F[0]);
            C0376f h7 = m.h(this.f4693b.f4512F[1]);
            h6.b(this);
            h7.b(this);
            this.f4698j = 4;
            return;
        }
        if (cVar5 != null) {
            C0376f h8 = m.h(cVar4);
            if (h8 != null) {
                m.b(c0376f2, h8, this.f4693b.f4512F[0].c());
                c(c0376f, c0376f2, 1, c0377g);
                return;
            }
            return;
        }
        r.c cVar6 = cVarArr2[1];
        if (cVar6.f4505d != null) {
            C0376f h9 = m.h(cVar6);
            if (h9 != null) {
                m.b(c0376f, h9, -this.f4693b.f4512F[1].c());
                c(c0376f2, c0376f, -1, c0377g);
                return;
            }
            return;
        }
        if ((dVar11 instanceof r.i) || (dVar3 = dVar11.f4515I) == null) {
            return;
        }
        m.b(c0376f2, dVar3.f4538d.h, dVar11.m());
        c(c0376f, c0376f2, 1, c0377g);
    }

    @Override // s.m
    public final void e() {
        C0376f c0376f = this.h;
        if (c0376f.f4683j) {
            this.f4693b.f4520N = c0376f.g;
        }
    }

    @Override // s.m
    public final void f() {
        this.c = null;
        this.h.c();
        this.f4697i.c();
        this.f4695e.c();
        this.g = false;
    }

    @Override // s.m
    public final boolean k() {
        return this.f4694d != 3 || this.f4693b.f4542j == 0;
    }

    public final void n() {
        this.g = false;
        C0376f c0376f = this.h;
        c0376f.c();
        c0376f.f4683j = false;
        C0376f c0376f2 = this.f4697i;
        c0376f2.c();
        c0376f2.f4683j = false;
        this.f4695e.f4683j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4693b.f4529W;
    }
}
