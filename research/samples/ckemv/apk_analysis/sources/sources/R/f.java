package r;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4573a;

    /* renamed from: d, reason: collision with root package name */
    public c f4575d;

    /* renamed from: e, reason: collision with root package name */
    public c f4576e;

    /* renamed from: f, reason: collision with root package name */
    public c f4577f;
    public c g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4578i;

    /* renamed from: j, reason: collision with root package name */
    public int f4579j;

    /* renamed from: k, reason: collision with root package name */
    public int f4580k;

    /* renamed from: q, reason: collision with root package name */
    public int f4586q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4587r;

    /* renamed from: b, reason: collision with root package name */
    public d f4574b = null;
    public int c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4581l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4582m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4583n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f4584o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4585p = 0;

    public f(g gVar, int i3, c cVar, c cVar2, c cVar3, c cVar4, int i4) {
        this.f4587r = gVar;
        this.h = 0;
        this.f4578i = 0;
        this.f4579j = 0;
        this.f4580k = 0;
        this.f4586q = 0;
        this.f4573a = i3;
        this.f4575d = cVar;
        this.f4576e = cVar2;
        this.f4577f = cVar3;
        this.g = cVar4;
        this.h = gVar.f4604j0;
        this.f4578i = gVar.f4601f0;
        this.f4579j = gVar.f4605k0;
        this.f4580k = gVar.f4602g0;
        this.f4586q = i4;
    }

    public final void a(d dVar) {
        int i3 = this.f4573a;
        g gVar = this.f4587r;
        if (i3 == 0) {
            int D = gVar.D(dVar, this.f4586q);
            if (dVar.f4537c0[0] == 3) {
                this.f4585p++;
                D = 0;
            }
            this.f4581l = D + (dVar.f4528V != 8 ? gVar.f4590C0 : 0) + this.f4581l;
            int C2 = gVar.C(dVar, this.f4586q);
            if (this.f4574b == null || this.c < C2) {
                this.f4574b = dVar;
                this.c = C2;
                this.f4582m = C2;
            }
        } else {
            int D2 = gVar.D(dVar, this.f4586q);
            int C3 = gVar.C(dVar, this.f4586q);
            if (dVar.f4537c0[1] == 3) {
                this.f4585p++;
                C3 = 0;
            }
            this.f4582m = C3 + (dVar.f4528V != 8 ? gVar.f4591D0 : 0) + this.f4582m;
            if (this.f4574b == null || this.c < D2) {
                this.f4574b = dVar;
                this.c = D2;
                this.f4581l = D2;
            }
        }
        this.f4584o++;
    }

    public final void b(int i3, boolean z3, boolean z4) {
        g gVar;
        int i4;
        int i5;
        d dVar;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f4584o;
        int i12 = 0;
        while (true) {
            gVar = this.f4587r;
            if (i12 >= i11 || (i10 = this.f4583n + i12) >= gVar.f4600O0) {
                break;
            }
            d dVar2 = gVar.f4599N0[i10];
            if (dVar2 != null) {
                dVar2.t();
            }
            i12++;
        }
        if (i11 == 0 || this.f4574b == null) {
            return;
        }
        boolean z5 = z4 && i3 == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.f4583n + (z3 ? (i11 - 1) - i15 : i15);
            if (i16 >= gVar.f4600O0) {
                break;
            }
            if (gVar.f4599N0[i16].f4528V == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.f4573a != 0) {
            d dVar3 = this.f4574b;
            dVar3.f4530X = gVar.f4611q0;
            int i17 = this.h;
            if (i3 > 0) {
                i17 += gVar.f4590C0;
            }
            c cVar = dVar3.f4556x;
            c cVar2 = dVar3.f4558z;
            if (z3) {
                cVar2.a(this.f4577f, i17);
                if (z4) {
                    cVar.a(this.f4575d, this.f4579j);
                }
                if (i3 > 0) {
                    this.f4577f.f4504b.f4556x.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f4575d, i17);
                if (z4) {
                    cVar2.a(this.f4577f, this.f4579j);
                }
                if (i3 > 0) {
                    this.f4575d.f4504b.f4558z.a(cVar, 0);
                }
            }
            int i18 = 0;
            d dVar4 = null;
            while (i18 < i11) {
                int i19 = this.f4583n + i18;
                if (i19 >= gVar.f4600O0) {
                    return;
                }
                d dVar5 = gVar.f4599N0[i19];
                if (i18 == 0) {
                    dVar5.e(dVar5.f4557y, this.f4576e, this.f4578i);
                    int i20 = gVar.f4612r0;
                    float f3 = gVar.f4618x0;
                    if (this.f4583n == 0) {
                        i5 = gVar.f4614t0;
                        i4 = -1;
                        if (i5 != -1) {
                            f3 = gVar.f4620z0;
                            i20 = i5;
                            dVar5.f4531Y = i20;
                            dVar5.f4526T = f3;
                        }
                    } else {
                        i4 = -1;
                    }
                    if (z4 && (i5 = gVar.f4616v0) != i4) {
                        f3 = gVar.f4589B0;
                        i20 = i5;
                    }
                    dVar5.f4531Y = i20;
                    dVar5.f4526T = f3;
                }
                if (i18 == i11 - 1) {
                    dVar5.e(dVar5.f4508A, this.g, this.f4580k);
                }
                if (dVar4 != null) {
                    c cVar3 = dVar5.f4557y;
                    int i21 = gVar.f4591D0;
                    c cVar4 = dVar4.f4508A;
                    cVar3.a(cVar4, i21);
                    c cVar5 = dVar5.f4557y;
                    if (i18 == i13) {
                        int i22 = this.f4578i;
                        if (cVar5.f()) {
                            cVar5.f4507f = i22;
                        }
                    }
                    cVar4.a(cVar5, 0);
                    if (i18 == i14 + 1) {
                        int i23 = this.f4580k;
                        if (cVar4.f()) {
                            cVar4.f4507f = i23;
                        }
                    }
                }
                if (dVar5 != dVar3) {
                    if (z3) {
                        int i24 = gVar.f4592E0;
                        if (i24 == 0) {
                            dVar5.f4558z.a(cVar2, 0);
                        } else if (i24 == 1) {
                            dVar5.f4556x.a(cVar, 0);
                        } else if (i24 == 2) {
                            dVar5.f4556x.a(cVar, 0);
                            dVar5.f4558z.a(cVar2, 0);
                        }
                    } else {
                        int i25 = gVar.f4592E0;
                        if (i25 == 0) {
                            dVar5.f4556x.a(cVar, 0);
                        } else if (i25 == 1) {
                            dVar5.f4558z.a(cVar2, 0);
                        } else if (i25 == 2) {
                            if (z5) {
                                dVar5.f4556x.a(this.f4575d, this.h);
                                dVar5.f4558z.a(this.f4577f, this.f4579j);
                            } else {
                                dVar5.f4556x.a(cVar, 0);
                                dVar5.f4558z.a(cVar2, 0);
                            }
                        }
                        i18++;
                        dVar4 = dVar5;
                    }
                }
                i18++;
                dVar4 = dVar5;
            }
            return;
        }
        d dVar6 = this.f4574b;
        dVar6.f4531Y = gVar.f4612r0;
        int i26 = this.f4578i;
        if (i3 > 0) {
            i26 += gVar.f4591D0;
        }
        c cVar6 = this.f4576e;
        c cVar7 = dVar6.f4557y;
        cVar7.a(cVar6, i26);
        c cVar8 = dVar6.f4508A;
        if (z4) {
            cVar8.a(this.g, this.f4580k);
        }
        if (i3 > 0) {
            this.f4576e.f4504b.f4508A.a(cVar7, 0);
        }
        if (gVar.f4593F0 == 3 && !dVar6.f4555w) {
            for (int i27 = 0; i27 < i11; i27++) {
                int i28 = this.f4583n + (z3 ? (i11 - 1) - i27 : i27);
                if (i28 >= gVar.f4600O0) {
                    break;
                }
                dVar = gVar.f4599N0[i28];
                if (dVar.f4555w) {
                    break;
                }
            }
        }
        dVar = dVar6;
        int i29 = 0;
        d dVar7 = null;
        while (i29 < i11) {
            int i30 = z3 ? (i11 - 1) - i29 : i29;
            int i31 = this.f4583n + i30;
            if (i31 >= gVar.f4600O0) {
                return;
            }
            d dVar8 = gVar.f4599N0[i31];
            if (i29 == 0) {
                dVar8.e(dVar8.f4556x, this.f4575d, this.h);
            }
            if (i30 == 0) {
                int i32 = gVar.f4611q0;
                float f4 = gVar.f4617w0;
                if (this.f4583n == 0) {
                    i9 = gVar.f4613s0;
                    i6 = i32;
                    i7 = -1;
                    if (i9 != -1) {
                        f4 = gVar.f4619y0;
                        i8 = i9;
                        dVar8.f4530X = i8;
                        dVar8.f4525S = f4;
                    }
                } else {
                    i6 = i32;
                    i7 = -1;
                }
                if (!z4 || (i9 = gVar.f4615u0) == i7) {
                    i8 = i6;
                    dVar8.f4530X = i8;
                    dVar8.f4525S = f4;
                } else {
                    f4 = gVar.f4588A0;
                    i8 = i9;
                    dVar8.f4530X = i8;
                    dVar8.f4525S = f4;
                }
            }
            if (i29 == i11 - 1) {
                dVar8.e(dVar8.f4558z, this.f4577f, this.f4579j);
            }
            if (dVar7 != null) {
                c cVar9 = dVar8.f4556x;
                int i33 = gVar.f4590C0;
                c cVar10 = dVar7.f4558z;
                cVar9.a(cVar10, i33);
                c cVar11 = dVar8.f4556x;
                if (i29 == i13) {
                    int i34 = this.h;
                    if (cVar11.f()) {
                        cVar11.f4507f = i34;
                    }
                }
                cVar10.a(cVar11, 0);
                if (i29 == i14 + 1) {
                    int i35 = this.f4579j;
                    if (cVar10.f()) {
                        cVar10.f4507f = i35;
                    }
                }
            }
            if (dVar8 != dVar6) {
                int i36 = gVar.f4593F0;
                c = 3;
                if (i36 == 3 && dVar.f4555w && dVar8 != dVar && dVar8.f4555w) {
                    dVar8.f4509B.a(dVar.f4509B, 0);
                } else if (i36 == 0) {
                    dVar8.f4557y.a(cVar7, 0);
                } else if (i36 == 1) {
                    dVar8.f4508A.a(cVar8, 0);
                } else if (z5) {
                    dVar8.f4557y.a(this.f4576e, this.f4578i);
                    dVar8.f4508A.a(this.g, this.f4580k);
                } else {
                    dVar8.f4557y.a(cVar7, 0);
                    dVar8.f4508A.a(cVar8, 0);
                }
            } else {
                c = 3;
            }
            i29++;
            dVar7 = dVar8;
        }
    }

    public final int c() {
        return this.f4573a == 1 ? this.f4582m - this.f4587r.f4591D0 : this.f4582m;
    }

    public final int d() {
        return this.f4573a == 0 ? this.f4581l - this.f4587r.f4590C0 : this.f4581l;
    }

    public final void e(int i3) {
        g gVar;
        int i4;
        int i5 = this.f4585p;
        if (i5 == 0) {
            return;
        }
        int i6 = this.f4584o;
        int i7 = i3 / i5;
        int i8 = 0;
        while (true) {
            gVar = this.f4587r;
            if (i8 >= i6 || (i4 = this.f4583n + i8) >= gVar.f4600O0) {
                break;
            }
            d dVar = gVar.f4599N0[i4];
            if (this.f4573a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f4537c0;
                    if (iArr[0] == 3 && dVar.f4542j == 0) {
                        gVar.E(1, i7, iArr[1], dVar.i(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f4537c0;
                if (iArr2[1] == 3 && dVar.f4543k == 0) {
                    gVar.E(iArr2[0], dVar.l(), 1, i7, dVar);
                }
            }
            i8++;
        }
        this.f4581l = 0;
        this.f4582m = 0;
        this.f4574b = null;
        this.c = 0;
        int i9 = this.f4584o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.f4583n + i10;
            if (i11 >= gVar.f4600O0) {
                return;
            }
            d dVar2 = gVar.f4599N0[i11];
            if (this.f4573a == 0) {
                int l3 = dVar2.l();
                int i12 = gVar.f4590C0;
                if (dVar2.f4528V == 8) {
                    i12 = 0;
                }
                this.f4581l = l3 + i12 + this.f4581l;
                int C2 = gVar.C(dVar2, this.f4586q);
                if (this.f4574b == null || this.c < C2) {
                    this.f4574b = dVar2;
                    this.c = C2;
                    this.f4582m = C2;
                }
            } else {
                int D = gVar.D(dVar2, this.f4586q);
                int C3 = gVar.C(dVar2, this.f4586q);
                int i13 = gVar.f4591D0;
                if (dVar2.f4528V == 8) {
                    i13 = 0;
                }
                this.f4582m = C3 + i13 + this.f4582m;
                if (this.f4574b == null || this.c < D) {
                    this.f4574b = dVar2;
                    this.c = D;
                    this.f4581l = D;
                }
            }
        }
    }

    public final void f(int i3, c cVar, c cVar2, c cVar3, c cVar4, int i4, int i5, int i6, int i7, int i8) {
        this.f4573a = i3;
        this.f4575d = cVar;
        this.f4576e = cVar2;
        this.f4577f = cVar3;
        this.g = cVar4;
        this.h = i4;
        this.f4578i = i5;
        this.f4579j = i6;
        this.f4580k = i7;
        this.f4586q = i8;
    }
}
