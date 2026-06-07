package r;

import q.C0359c;
import q.C0361e;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364a extends i {

    /* renamed from: f0, reason: collision with root package name */
    public int f4486f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4487g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f4488h0;

    @Override // r.d
    public final void a(C0361e c0361e) {
        boolean z3;
        int i3;
        int i4;
        c[] cVarArr = this.f4512F;
        c cVar = this.f4556x;
        cVarArr[0] = cVar;
        c cVar2 = this.f4557y;
        int i5 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.f4558z;
        cVarArr[1] = cVar3;
        c cVar4 = this.f4508A;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.g = c0361e.j(cVar5);
        }
        int i6 = this.f4486f0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i6];
        for (int i7 = 0; i7 < this.f4627e0; i7++) {
            d dVar = this.f4626d0[i7];
            if ((this.f4487g0 || dVar.b()) && ((((i4 = this.f4486f0) == 0 || i4 == 1) && dVar.f4537c0[0] == 3 && dVar.f4556x.f4505d != null && dVar.f4558z.f4505d != null) || ((i4 == 2 || i4 == 3) && dVar.f4537c0[1] == 3 && dVar.f4557y.f4505d != null && dVar.f4508A.f4505d != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = cVar.e() || cVar3.e();
        boolean z5 = cVar2.e() || cVar4.e();
        int i8 = (z3 || !(((i3 = this.f4486f0) == 0 && z4) || ((i3 == 2 && z5) || ((i3 == 1 && z4) || (i3 == 3 && z5))))) ? 4 : 5;
        int i9 = 0;
        while (i9 < this.f4627e0) {
            d dVar2 = this.f4626d0[i9];
            if (this.f4487g0 || dVar2.b()) {
                q.i j3 = c0361e.j(dVar2.f4512F[this.f4486f0]);
                int i10 = this.f4486f0;
                c cVar7 = dVar2.f4512F[i10];
                cVar7.g = j3;
                c cVar8 = cVar7.f4505d;
                int i11 = (cVar8 == null || cVar8.f4504b != this) ? 0 : cVar7.f4506e;
                if (i10 == 0 || i10 == i5) {
                    q.i iVar = cVar6.g;
                    int i12 = this.f4488h0 - i11;
                    C0359c k2 = c0361e.k();
                    q.i l3 = c0361e.l();
                    l3.f4398d = 0;
                    k2.c(iVar, j3, l3, i12);
                    c0361e.c(k2);
                } else {
                    q.i iVar2 = cVar6.g;
                    int i13 = this.f4488h0 + i11;
                    C0359c k3 = c0361e.k();
                    q.i l4 = c0361e.l();
                    l4.f4398d = 0;
                    k3.b(iVar2, j3, l4, i13);
                    c0361e.c(k3);
                }
                c0361e.e(cVar6.g, j3, this.f4488h0 + i11, i8);
            }
            i9++;
            i5 = 2;
        }
        int i14 = this.f4486f0;
        if (i14 == 0) {
            c0361e.e(cVar3.g, cVar.g, 0, 8);
            c0361e.e(cVar.g, this.f4515I.f4558z.g, 0, 4);
            c0361e.e(cVar.g, this.f4515I.f4556x.g, 0, 0);
            return;
        }
        if (i14 == 1) {
            c0361e.e(cVar.g, cVar3.g, 0, 8);
            c0361e.e(cVar.g, this.f4515I.f4556x.g, 0, 4);
            c0361e.e(cVar.g, this.f4515I.f4558z.g, 0, 0);
        } else if (i14 == 2) {
            c0361e.e(cVar4.g, cVar2.g, 0, 8);
            c0361e.e(cVar2.g, this.f4515I.f4508A.g, 0, 4);
            c0361e.e(cVar2.g, this.f4515I.f4557y.g, 0, 0);
        } else if (i14 == 3) {
            c0361e.e(cVar2.g, cVar4.g, 0, 8);
            c0361e.e(cVar2.g, this.f4515I.f4557y.g, 0, 4);
            c0361e.e(cVar2.g, this.f4515I.f4508A.g, 0, 0);
        }
    }

    @Override // r.d
    public final boolean b() {
        return true;
    }

    @Override // r.d
    public final String toString() {
        String j3 = X.d.j(new StringBuilder("[Barrier] "), this.f4529W, " {");
        for (int i3 = 0; i3 < this.f4627e0; i3++) {
            d dVar = this.f4626d0[i3];
            if (i3 > 0) {
                j3 = X.d.h(j3, ", ");
            }
            j3 = j3 + dVar.f4529W;
        }
        return X.d.h(j3, "}");
    }
}
