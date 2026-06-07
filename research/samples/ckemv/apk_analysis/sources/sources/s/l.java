package s;

/* loaded from: classes.dex */
public final class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public C0376f f4690k;

    /* renamed from: l, reason: collision with root package name */
    public C0371a f4691l;

    @Override // s.InterfaceC0374d
    public final void a(InterfaceC0374d interfaceC0374d) {
        float f3;
        float f4;
        float f5;
        int i3;
        if (q.h.a(this.f4698j) == 3) {
            r.d dVar = this.f4693b;
            l(dVar.f4557y, dVar.f4508A, 1);
            return;
        }
        C0377g c0377g = this.f4695e;
        if (c0377g.c && !c0377g.f4683j && this.f4694d == 3) {
            r.d dVar2 = this.f4693b;
            int i4 = dVar2.f4543k;
            if (i4 == 2) {
                r.d dVar3 = dVar2.f4515I;
                if (dVar3 != null) {
                    if (dVar3.f4539e.f4695e.f4683j) {
                        c0377g.d((int) ((r5.g * dVar2.f4550r) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                C0377g c0377g2 = dVar2.f4538d.f4695e;
                if (c0377g2.f4683j) {
                    int i5 = dVar2.f4519M;
                    if (i5 == -1) {
                        f3 = c0377g2.g;
                        f4 = dVar2.f4518L;
                    } else if (i5 == 0) {
                        f5 = c0377g2.g * dVar2.f4518L;
                        i3 = (int) (f5 + 0.5f);
                        c0377g.d(i3);
                    } else if (i5 != 1) {
                        i3 = 0;
                        c0377g.d(i3);
                    } else {
                        f3 = c0377g2.g;
                        f4 = dVar2.f4518L;
                    }
                    f5 = f3 / f4;
                    i3 = (int) (f5 + 0.5f);
                    c0377g.d(i3);
                }
            }
        }
        C0376f c0376f = this.h;
        if (c0376f.c) {
            C0376f c0376f2 = this.f4697i;
            if (c0376f2.c) {
                if (c0376f.f4683j && c0376f2.f4683j && c0377g.f4683j) {
                    return;
                }
                if (!c0377g.f4683j && this.f4694d == 3) {
                    r.d dVar4 = this.f4693b;
                    if (dVar4.f4542j == 0 && !dVar4.r()) {
                        C0376f c0376f3 = (C0376f) c0376f.f4685l.get(0);
                        C0376f c0376f4 = (C0376f) c0376f2.f4685l.get(0);
                        int i6 = c0376f3.g + c0376f.f4681f;
                        int i7 = c0376f4.g + c0376f2.f4681f;
                        c0376f.d(i6);
                        c0376f2.d(i7);
                        c0377g.d(i7 - i6);
                        return;
                    }
                }
                if (!c0377g.f4683j && this.f4694d == 3 && this.f4692a == 1 && c0376f.f4685l.size() > 0 && c0376f2.f4685l.size() > 0) {
                    C0376f c0376f5 = (C0376f) c0376f.f4685l.get(0);
                    int i8 = (((C0376f) c0376f2.f4685l.get(0)).g + c0376f2.f4681f) - (c0376f5.g + c0376f.f4681f);
                    int i9 = c0377g.f4686m;
                    if (i8 < i9) {
                        c0377g.d(i8);
                    } else {
                        c0377g.d(i9);
                    }
                }
                if (c0377g.f4683j && c0376f.f4685l.size() > 0 && c0376f2.f4685l.size() > 0) {
                    C0376f c0376f6 = (C0376f) c0376f.f4685l.get(0);
                    C0376f c0376f7 = (C0376f) c0376f2.f4685l.get(0);
                    int i10 = c0376f6.g;
                    int i11 = c0376f.f4681f + i10;
                    int i12 = c0376f7.g;
                    int i13 = c0376f2.f4681f + i12;
                    float f6 = this.f4693b.f4526T;
                    if (c0376f6 == c0376f7) {
                        f6 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    c0376f.d((int) ((((i12 - i10) - c0377g.g) * f6) + i10 + 0.5f));
                    c0376f2.d(c0376f.g + c0377g.g);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v123, types: [s.a, s.g] */
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
            c0377g.d(dVar5.i());
        }
        boolean z4 = c0377g.f4683j;
        C0376f c0376f = this.f4697i;
        C0376f c0376f2 = this.h;
        if (!z4) {
            r.d dVar6 = this.f4693b;
            this.f4694d = dVar6.f4537c0[1];
            if (dVar6.f4555w) {
                this.f4691l = new C0377g(this);
            }
            int i3 = this.f4694d;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = this.f4693b.f4515I) != null && dVar4.f4537c0[1] == 1) {
                    int i4 = (dVar4.i() - this.f4693b.f4557y.c()) - this.f4693b.f4508A.c();
                    l lVar = dVar4.f4539e;
                    m.b(c0376f2, lVar.h, this.f4693b.f4557y.c());
                    m.b(c0376f, lVar.f4697i, -this.f4693b.f4508A.c());
                    c0377g.d(i4);
                    return;
                }
                if (i3 == 1) {
                    c0377g.d(this.f4693b.i());
                }
            }
        } else if (this.f4694d == 4 && (dVar2 = (dVar = this.f4693b).f4515I) != null && dVar2.f4537c0[1] == 1) {
            l lVar2 = dVar2.f4539e;
            m.b(c0376f2, lVar2.h, dVar.f4557y.c());
            m.b(c0376f, lVar2.f4697i, -this.f4693b.f4508A.c());
            return;
        }
        boolean z5 = c0377g.f4683j;
        C0376f c0376f3 = this.f4690k;
        if (z5) {
            r.d dVar7 = this.f4693b;
            if (dVar7.f4533a) {
                r.c[] cVarArr = dVar7.f4512F;
                r.c cVar = cVarArr[2];
                r.c cVar2 = cVar.f4505d;
                if (cVar2 != null && cVarArr[3].f4505d != null) {
                    if (dVar7.r()) {
                        c0376f2.f4681f = this.f4693b.f4512F[2].c();
                        c0376f.f4681f = -this.f4693b.f4512F[3].c();
                    } else {
                        C0376f h = m.h(this.f4693b.f4512F[2]);
                        if (h != null) {
                            m.b(c0376f2, h, this.f4693b.f4512F[2].c());
                        }
                        C0376f h3 = m.h(this.f4693b.f4512F[3]);
                        if (h3 != null) {
                            m.b(c0376f, h3, -this.f4693b.f4512F[3].c());
                        }
                        c0376f2.f4678b = true;
                        c0376f.f4678b = true;
                    }
                    r.d dVar8 = this.f4693b;
                    if (dVar8.f4555w) {
                        m.b(c0376f3, c0376f2, dVar8.f4522P);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    C0376f h4 = m.h(cVar);
                    if (h4 != null) {
                        m.b(c0376f2, h4, this.f4693b.f4512F[2].c());
                        m.b(c0376f, c0376f2, c0377g.g);
                        r.d dVar9 = this.f4693b;
                        if (dVar9.f4555w) {
                            m.b(c0376f3, c0376f2, dVar9.f4522P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r.c cVar3 = cVarArr[3];
                if (cVar3.f4505d != null) {
                    C0376f h5 = m.h(cVar3);
                    if (h5 != null) {
                        m.b(c0376f, h5, -this.f4693b.f4512F[3].c());
                        m.b(c0376f2, c0376f, -c0377g.g);
                    }
                    r.d dVar10 = this.f4693b;
                    if (dVar10.f4555w) {
                        m.b(c0376f3, c0376f2, dVar10.f4522P);
                        return;
                    }
                    return;
                }
                r.c cVar4 = cVarArr[4];
                if (cVar4.f4505d != null) {
                    C0376f h6 = m.h(cVar4);
                    if (h6 != null) {
                        m.b(c0376f3, h6, 0);
                        m.b(c0376f2, c0376f3, -this.f4693b.f4522P);
                        m.b(c0376f, c0376f2, c0377g.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof r.i) || dVar7.f4515I == null || dVar7.g(7).f4505d != null) {
                    return;
                }
                r.d dVar11 = this.f4693b;
                m.b(c0376f2, dVar11.f4515I.f4539e.h, dVar11.n());
                m.b(c0376f, c0376f2, c0377g.g);
                r.d dVar12 = this.f4693b;
                if (dVar12.f4555w) {
                    m.b(c0376f3, c0376f2, dVar12.f4522P);
                    return;
                }
                return;
            }
        }
        if (z5 || this.f4694d != 3) {
            c0377g.b(this);
        } else {
            r.d dVar13 = this.f4693b;
            int i5 = dVar13.f4543k;
            if (i5 == 2) {
                r.d dVar14 = dVar13.f4515I;
                if (dVar14 != null) {
                    C0377g c0377g2 = dVar14.f4539e.f4695e;
                    c0377g.f4685l.add(c0377g2);
                    c0377g2.f4684k.add(c0377g);
                    c0377g.f4678b = true;
                    c0377g.f4684k.add(c0376f2);
                    c0377g.f4684k.add(c0376f);
                }
            } else if (i5 == 3 && !dVar13.r()) {
                r.d dVar15 = this.f4693b;
                if (dVar15.f4542j != 3) {
                    C0377g c0377g3 = dVar15.f4538d.f4695e;
                    c0377g.f4685l.add(c0377g3);
                    c0377g3.f4684k.add(c0377g);
                    c0377g.f4678b = true;
                    c0377g.f4684k.add(c0376f2);
                    c0377g.f4684k.add(c0376f);
                }
            }
        }
        r.d dVar16 = this.f4693b;
        r.c[] cVarArr2 = dVar16.f4512F;
        r.c cVar5 = cVarArr2[2];
        r.c cVar6 = cVar5.f4505d;
        if (cVar6 != null && cVarArr2[3].f4505d != null) {
            if (dVar16.r()) {
                c0376f2.f4681f = this.f4693b.f4512F[2].c();
                c0376f.f4681f = -this.f4693b.f4512F[3].c();
            } else {
                C0376f h7 = m.h(this.f4693b.f4512F[2]);
                C0376f h8 = m.h(this.f4693b.f4512F[3]);
                h7.b(this);
                h8.b(this);
                this.f4698j = 4;
            }
            if (this.f4693b.f4555w) {
                c(c0376f3, c0376f2, 1, this.f4691l);
            }
        } else if (cVar6 != null) {
            C0376f h9 = m.h(cVar5);
            if (h9 != null) {
                m.b(c0376f2, h9, this.f4693b.f4512F[2].c());
                c(c0376f, c0376f2, 1, c0377g);
                if (this.f4693b.f4555w) {
                    c(c0376f3, c0376f2, 1, this.f4691l);
                }
                if (this.f4694d == 3) {
                    r.d dVar17 = this.f4693b;
                    if (dVar17.f4518L > 0.0f) {
                        C0380j c0380j = dVar17.f4538d;
                        if (c0380j.f4694d == 3) {
                            c0380j.f4695e.f4684k.add(c0377g);
                            c0377g.f4685l.add(this.f4693b.f4538d.f4695e);
                            c0377g.f4677a = this;
                        }
                    }
                }
            }
        } else {
            r.c cVar7 = cVarArr2[3];
            if (cVar7.f4505d != null) {
                C0376f h10 = m.h(cVar7);
                if (h10 != null) {
                    m.b(c0376f, h10, -this.f4693b.f4512F[3].c());
                    c(c0376f2, c0376f, -1, c0377g);
                    if (this.f4693b.f4555w) {
                        c(c0376f3, c0376f2, 1, this.f4691l);
                    }
                }
            } else {
                r.c cVar8 = cVarArr2[4];
                if (cVar8.f4505d != null) {
                    C0376f h11 = m.h(cVar8);
                    if (h11 != null) {
                        m.b(c0376f3, h11, 0);
                        c(c0376f2, c0376f3, -1, this.f4691l);
                        c(c0376f, c0376f2, 1, c0377g);
                    }
                } else if (!(dVar16 instanceof r.i) && (dVar3 = dVar16.f4515I) != null) {
                    m.b(c0376f2, dVar3.f4539e.h, dVar16.n());
                    c(c0376f, c0376f2, 1, c0377g);
                    if (this.f4693b.f4555w) {
                        c(c0376f3, c0376f2, 1, this.f4691l);
                    }
                    if (this.f4694d == 3) {
                        r.d dVar18 = this.f4693b;
                        if (dVar18.f4518L > 0.0f) {
                            C0380j c0380j2 = dVar18.f4538d;
                            if (c0380j2.f4694d == 3) {
                                c0380j2.f4695e.f4684k.add(c0377g);
                                c0377g.f4685l.add(this.f4693b.f4538d.f4695e);
                                c0377g.f4677a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0377g.f4685l.size() == 0) {
            c0377g.c = true;
        }
    }

    @Override // s.m
    public final void e() {
        C0376f c0376f = this.h;
        if (c0376f.f4683j) {
            this.f4693b.f4521O = c0376f.g;
        }
    }

    @Override // s.m
    public final void f() {
        this.c = null;
        this.h.c();
        this.f4697i.c();
        this.f4690k.c();
        this.f4695e.c();
        this.g = false;
    }

    @Override // s.m
    public final boolean k() {
        return this.f4694d != 3 || this.f4693b.f4543k == 0;
    }

    public final void m() {
        this.g = false;
        C0376f c0376f = this.h;
        c0376f.c();
        c0376f.f4683j = false;
        C0376f c0376f2 = this.f4697i;
        c0376f2.c();
        c0376f2.f4683j = false;
        C0376f c0376f3 = this.f4690k;
        c0376f3.c();
        c0376f3.f4683j = false;
        this.f4695e.f4683j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4693b.f4529W;
    }
}
