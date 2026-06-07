package r;

import java.util.ArrayList;
import q.C0361e;
import q1.C0363a;
import s.C0372b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public float f4588A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f4589B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f4590C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4591D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f4592E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f4593F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f4594G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f4595H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f4596I0;

    /* renamed from: J0, reason: collision with root package name */
    public ArrayList f4597J0;
    public d[] K0;

    /* renamed from: L0, reason: collision with root package name */
    public d[] f4598L0;
    public int[] M0;

    /* renamed from: N0, reason: collision with root package name */
    public d[] f4599N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f4600O0;

    /* renamed from: f0, reason: collision with root package name */
    public int f4601f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f4602g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f4603h0;
    public int i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f4604j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f4605k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f4606l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4607m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f4608n0;

    /* renamed from: o0, reason: collision with root package name */
    public C0372b f4609o0;

    /* renamed from: p0, reason: collision with root package name */
    public C0363a f4610p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f4611q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f4612r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4613s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4614t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4615u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f4616v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f4617w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f4618x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f4619y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f4620z0;

    @Override // r.i
    public final void B() {
        for (int i3 = 0; i3 < this.f4627e0; i3++) {
            d dVar = this.f4626d0[i3];
        }
    }

    public final int C(d dVar, int i3) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4537c0;
        if (iArr[1] == 3) {
            int i4 = dVar.f4543k;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (dVar.f4550r * i3);
                if (i5 != dVar.i()) {
                    E(iArr[0], dVar.l(), 1, i5, dVar);
                }
                return i5;
            }
            if (i4 == 1) {
                return dVar.i();
            }
            if (i4 == 3) {
                return (int) ((dVar.l() * dVar.f4518L) + 0.5f);
            }
        }
        return dVar.i();
    }

    public final int D(d dVar, int i3) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4537c0;
        if (iArr[0] == 3) {
            int i4 = dVar.f4542j;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (dVar.f4547o * i3);
                if (i5 != dVar.l()) {
                    E(1, i5, iArr[1], dVar.i(), dVar);
                }
                return i5;
            }
            if (i4 == 1) {
                return dVar.l();
            }
            if (i4 == 3) {
                return (int) ((dVar.i() * dVar.f4518L) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final void E(int i3, int i4, int i5, int i6, d dVar) {
        C0363a c0363a;
        d dVar2;
        while (true) {
            c0363a = this.f4610p0;
            if (c0363a != null || (dVar2 = this.f4515I) == null) {
                break;
            } else {
                this.f4610p0 = ((e) dVar2).f4562g0;
            }
        }
        C0372b c0372b = this.f4609o0;
        c0372b.f4663a = i3;
        c0372b.f4664b = i5;
        c0372b.c = i4;
        c0372b.f4665d = i6;
        c0363a.d(dVar, c0372b);
        dVar.y(c0372b.f4666e);
        dVar.v(c0372b.f4667f);
        dVar.f4555w = c0372b.h;
        int i7 = c0372b.g;
        dVar.f4522P = i7;
        dVar.f4555w = i7 > 0;
    }

    @Override // r.d
    public final void a(C0361e c0361e) {
        d dVar;
        super.a(c0361e);
        d dVar2 = this.f4515I;
        boolean z3 = dVar2 != null ? ((e) dVar2).f4563h0 : false;
        int i3 = this.f4594G0;
        ArrayList arrayList = this.f4597J0;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    ((f) arrayList.get(i4)).b(i4, z3, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 == 2 && this.M0 != null && this.f4598L0 != null && this.K0 != null) {
                for (int i5 = 0; i5 < this.f4600O0; i5++) {
                    this.f4599N0[i5].t();
                }
                int[] iArr = this.M0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                d dVar3 = null;
                for (int i8 = 0; i8 < i6; i8++) {
                    d dVar4 = this.f4598L0[z3 ? (i6 - i8) - 1 : i8];
                    if (dVar4 != null && dVar4.f4528V != 8) {
                        c cVar = dVar4.f4556x;
                        if (i8 == 0) {
                            dVar4.e(cVar, this.f4556x, this.f4604j0);
                            dVar4.f4530X = this.f4611q0;
                            dVar4.f4525S = this.f4617w0;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.e(dVar4.f4558z, this.f4558z, this.f4605k0);
                        }
                        if (i8 > 0) {
                            dVar4.e(cVar, dVar3.f4558z, this.f4590C0);
                            dVar3.e(dVar3.f4558z, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    d dVar5 = this.K0[i9];
                    if (dVar5 != null && dVar5.f4528V != 8) {
                        c cVar2 = dVar5.f4557y;
                        if (i9 == 0) {
                            dVar5.e(cVar2, this.f4557y, this.f4601f0);
                            dVar5.f4531Y = this.f4612r0;
                            dVar5.f4526T = this.f4618x0;
                        }
                        if (i9 == i7 - 1) {
                            dVar5.e(dVar5.f4508A, this.f4508A, this.f4602g0);
                        }
                        if (i9 > 0) {
                            dVar5.e(cVar2, dVar3.f4508A, this.f4591D0);
                            dVar3.e(dVar3.f4508A, cVar2, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f4596I0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        d[] dVarArr = this.f4599N0;
                        if (i12 < dVarArr.length && (dVar = dVarArr[i12]) != null && dVar.f4528V != 8) {
                            d dVar6 = this.f4598L0[i10];
                            d dVar7 = this.K0[i11];
                            if (dVar != dVar6) {
                                dVar.e(dVar.f4556x, dVar6.f4556x, 0);
                                dVar.e(dVar.f4558z, dVar6.f4558z, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.e(dVar.f4557y, dVar7.f4557y, 0);
                                dVar.e(dVar.f4508A, dVar7.f4508A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4606l0 = false;
    }
}
