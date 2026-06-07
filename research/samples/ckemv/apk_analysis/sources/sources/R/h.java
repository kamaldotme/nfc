package r;

import java.util.ArrayList;
import q.C0359c;
import q.C0361e;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: d0, reason: collision with root package name */
    public float f4621d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f4622e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f4623f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public c f4624g0 = this.f4557y;

    /* renamed from: h0, reason: collision with root package name */
    public int f4625h0 = 0;

    public h() {
        this.f4513G.clear();
        this.f4513G.add(this.f4624g0);
        int length = this.f4512F.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f4512F[i3] = this.f4624g0;
        }
    }

    @Override // r.d
    public final void A(C0361e c0361e) {
        if (this.f4515I == null) {
            return;
        }
        c cVar = this.f4624g0;
        c0361e.getClass();
        int m3 = C0361e.m(cVar);
        if (this.f4625h0 == 1) {
            this.f4520N = m3;
            this.f4521O = 0;
            v(this.f4515I.i());
            y(0);
            return;
        }
        this.f4520N = 0;
        this.f4521O = m3;
        y(this.f4515I.l());
        v(0);
    }

    public final void B(int i3) {
        if (this.f4625h0 == i3) {
            return;
        }
        this.f4625h0 = i3;
        ArrayList arrayList = this.f4513G;
        arrayList.clear();
        if (this.f4625h0 == 1) {
            this.f4624g0 = this.f4556x;
        } else {
            this.f4624g0 = this.f4557y;
        }
        arrayList.add(this.f4624g0);
        c[] cVarArr = this.f4512F;
        int length = cVarArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            cVarArr[i4] = this.f4624g0;
        }
    }

    @Override // r.d
    public final void a(C0361e c0361e) {
        e eVar = (e) this.f4515I;
        if (eVar == null) {
            return;
        }
        c g = eVar.g(2);
        c g3 = eVar.g(4);
        d dVar = this.f4515I;
        boolean z3 = dVar != null && dVar.f4537c0[0] == 2;
        if (this.f4625h0 == 0) {
            g = eVar.g(3);
            g3 = eVar.g(5);
            d dVar2 = this.f4515I;
            z3 = dVar2 != null && dVar2.f4537c0[1] == 2;
        }
        if (this.f4622e0 != -1) {
            q.i j3 = c0361e.j(this.f4624g0);
            c0361e.e(j3, c0361e.j(g), this.f4622e0, 8);
            if (z3) {
                c0361e.f(c0361e.j(g3), j3, 0, 5);
                return;
            }
            return;
        }
        if (this.f4623f0 != -1) {
            q.i j4 = c0361e.j(this.f4624g0);
            q.i j5 = c0361e.j(g3);
            c0361e.e(j4, j5, -this.f4623f0, 8);
            if (z3) {
                c0361e.f(j4, c0361e.j(g), 0, 5);
                c0361e.f(j5, j4, 0, 5);
                return;
            }
            return;
        }
        if (this.f4621d0 != -1.0f) {
            q.i j6 = c0361e.j(this.f4624g0);
            q.i j7 = c0361e.j(g3);
            float f3 = this.f4621d0;
            C0359c k2 = c0361e.k();
            k2.f4377d.g(j6, -1.0f);
            k2.f4377d.g(j7, f3);
            c0361e.c(k2);
        }
    }

    @Override // r.d
    public final boolean b() {
        return true;
    }

    @Override // r.d
    public final c g(int i3) {
        switch (q.h.a(i3)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f4625h0 == 1) {
                    return this.f4624g0;
                }
                break;
            case 2:
            case 4:
                if (this.f4625h0 == 0) {
                    return this.f4624g0;
                }
                break;
        }
        throw new AssertionError(X.d.t(i3));
    }
}
