package r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import q.C0359c;
import q.C0361e;
import q1.C0363a;
import s.C0373c;
import s.C0375e;
import s.C0380j;
import s.l;
import v0.m;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f4559d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final m f4560e0 = new m(this);

    /* renamed from: f0, reason: collision with root package name */
    public final C0375e f4561f0;

    /* renamed from: g0, reason: collision with root package name */
    public C0363a f4562g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f4563h0;
    public final C0361e i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f4564j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f4565k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f4566l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4567m0;

    /* renamed from: n0, reason: collision with root package name */
    public C0365b[] f4568n0;

    /* renamed from: o0, reason: collision with root package name */
    public C0365b[] f4569o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f4570p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f4571q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4572r0;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s.e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [s.b, java.lang.Object] */
    public e() {
        ?? obj = new Object();
        obj.f4673b = true;
        obj.c = true;
        obj.f4675e = new ArrayList();
        new ArrayList();
        obj.f4676f = null;
        obj.g = new Object();
        obj.h = new ArrayList();
        obj.f4672a = this;
        obj.f4674d = this;
        this.f4561f0 = obj;
        this.f4562g0 = null;
        this.f4563h0 = false;
        this.i0 = new C0361e();
        this.f4566l0 = 0;
        this.f4567m0 = 0;
        this.f4568n0 = new C0365b[4];
        this.f4569o0 = new C0365b[4];
        this.f4570p0 = 263;
        this.f4571q0 = false;
        this.f4572r0 = false;
    }

    public final void B(d dVar, int i3) {
        if (i3 == 0) {
            int i4 = this.f4566l0 + 1;
            C0365b[] c0365bArr = this.f4569o0;
            if (i4 >= c0365bArr.length) {
                this.f4569o0 = (C0365b[]) Arrays.copyOf(c0365bArr, c0365bArr.length * 2);
            }
            C0365b[] c0365bArr2 = this.f4569o0;
            int i5 = this.f4566l0;
            c0365bArr2[i5] = new C0365b(dVar, 0, this.f4563h0);
            this.f4566l0 = i5 + 1;
            return;
        }
        if (i3 == 1) {
            int i6 = this.f4567m0 + 1;
            C0365b[] c0365bArr3 = this.f4568n0;
            if (i6 >= c0365bArr3.length) {
                this.f4568n0 = (C0365b[]) Arrays.copyOf(c0365bArr3, c0365bArr3.length * 2);
            }
            C0365b[] c0365bArr4 = this.f4568n0;
            int i7 = this.f4567m0;
            c0365bArr4[i7] = new C0365b(dVar, 1, this.f4563h0);
            this.f4567m0 = i7 + 1;
        }
    }

    public final void C(C0361e c0361e) {
        a(c0361e);
        int size = this.f4559d0.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) this.f4559d0.get(i3);
            boolean[] zArr = dVar.f4514H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0364a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i4 = 0; i4 < size; i4++) {
                d dVar2 = (d) this.f4559d0.get(i4);
                if (dVar2 instanceof C0364a) {
                    C0364a c0364a = (C0364a) dVar2;
                    for (int i5 = 0; i5 < c0364a.f4627e0; i5++) {
                        d dVar3 = c0364a.f4626d0[i5];
                        int i6 = c0364a.f4486f0;
                        if (i6 == 0 || i6 == 1) {
                            dVar3.f4514H[0] = true;
                        } else if (i6 == 2 || i6 == 3) {
                            dVar3.f4514H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            d dVar4 = (d) this.f4559d0.get(i7);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.a(c0361e);
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            d dVar5 = (d) this.f4559d0.get(i8);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f4537c0;
                int i9 = iArr[0];
                int i10 = iArr[1];
                if (i9 == 2) {
                    dVar5.w(1);
                }
                if (i10 == 2) {
                    dVar5.x(1);
                }
                dVar5.a(c0361e);
                if (i9 == 2) {
                    dVar5.w(i9);
                }
                if (i10 == 2) {
                    dVar5.x(i10);
                }
            } else {
                dVar5.h = -1;
                dVar5.f4541i = -1;
                int[] iArr2 = this.f4537c0;
                int i11 = iArr2[0];
                int[] iArr3 = dVar5.f4537c0;
                if (i11 != 2 && iArr3[0] == 4) {
                    c cVar = dVar5.f4556x;
                    int i12 = cVar.f4506e;
                    int l3 = l();
                    c cVar2 = dVar5.f4558z;
                    int i13 = l3 - cVar2.f4506e;
                    cVar.g = c0361e.j(cVar);
                    cVar2.g = c0361e.j(cVar2);
                    c0361e.d(cVar.g, i12);
                    c0361e.d(cVar2.g, i13);
                    dVar5.h = 2;
                    dVar5.f4520N = i12;
                    int i14 = i13 - i12;
                    dVar5.f4516J = i14;
                    int i15 = dVar5.f4523Q;
                    if (i14 < i15) {
                        dVar5.f4516J = i15;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    c cVar3 = dVar5.f4557y;
                    int i16 = cVar3.f4506e;
                    int i17 = i();
                    c cVar4 = dVar5.f4508A;
                    int i18 = i17 - cVar4.f4506e;
                    cVar3.g = c0361e.j(cVar3);
                    cVar4.g = c0361e.j(cVar4);
                    c0361e.d(cVar3.g, i16);
                    c0361e.d(cVar4.g, i18);
                    if (dVar5.f4522P > 0 || dVar5.f4528V == 8) {
                        c cVar5 = dVar5.f4509B;
                        q.i j3 = c0361e.j(cVar5);
                        cVar5.g = j3;
                        c0361e.d(j3, dVar5.f4522P + i16);
                    }
                    dVar5.f4541i = 2;
                    dVar5.f4521O = i16;
                    int i19 = i18 - i16;
                    dVar5.f4517K = i19;
                    int i20 = dVar5.f4524R;
                    if (i19 < i20) {
                        dVar5.f4517K = i20;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.a(c0361e);
                }
            }
        }
        if (this.f4566l0 > 0) {
            j.a(this, c0361e, 0);
        }
        if (this.f4567m0 > 0) {
            j.a(this, c0361e, 1);
        }
    }

    public final boolean D(int i3, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = z3 & true;
        C0375e c0375e = this.f4561f0;
        e eVar = c0375e.f4672a;
        int h = eVar.h(0);
        int h3 = eVar.h(1);
        int m3 = eVar.m();
        int n3 = eVar.n();
        ArrayList arrayList = c0375e.f4675e;
        l lVar = eVar.f4539e;
        C0380j c0380j = eVar.f4538d;
        if (z8 && (h == 2 || h3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s.m mVar = (s.m) it.next();
                if (mVar.f4696f == i3 && !mVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i3 == 0) {
                if (z8 && h == 2) {
                    eVar.w(1);
                    eVar.y(c0375e.d(eVar, 0));
                    c0380j.f4695e.d(eVar.l());
                }
            } else if (z8 && h3 == 2) {
                eVar.x(1);
                eVar.v(c0375e.d(eVar, 1));
                lVar.f4695e.d(eVar.i());
            }
        }
        int[] iArr = eVar.f4537c0;
        if (i3 == 0) {
            z4 = false;
            int i4 = iArr[0];
            if (i4 == 1 || i4 == 4) {
                int l3 = eVar.l() + m3;
                c0380j.f4697i.d(l3);
                c0380j.f4695e.d(l3 - m3);
                z6 = true;
                z5 = true;
            } else {
                z5 = true;
                z6 = z4;
            }
        } else {
            z4 = false;
            z5 = true;
            int i5 = iArr[1];
            if (i5 == 1 || i5 == 4) {
                int i6 = eVar.i() + n3;
                lVar.f4697i.d(i6);
                lVar.f4695e.d(i6 - n3);
                z6 = true;
            }
            z6 = z4;
        }
        c0375e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            s.m mVar2 = (s.m) it2.next();
            if (mVar2.f4696f == i3 && (mVar2.f4693b != eVar || mVar2.g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            s.m mVar3 = (s.m) it3.next();
            if (mVar3.f4696f == i3 && (z6 || mVar3.f4693b != eVar)) {
                if (!mVar3.h.f4683j || !mVar3.f4697i.f4683j || (!(mVar3 instanceof C0373c) && !mVar3.f4695e.f4683j)) {
                    z7 = z4;
                    break;
                }
            }
        }
        z7 = z5;
        eVar.w(h);
        eVar.x(h3);
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff A[LOOP:4: B:48:0x00fd->B:49:0x00ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        boolean z5;
        int max;
        ?? r7;
        boolean z6;
        int max2;
        boolean z7;
        boolean z8;
        int size;
        int i3;
        boolean[] zArr = j.f4628a;
        this.f4520N = 0;
        this.f4521O = 0;
        int max3 = Math.max(0, l());
        int max4 = Math.max(0, i());
        this.f4571q0 = false;
        this.f4572r0 = false;
        int i4 = this.f4570p0;
        boolean z9 = ((i4 & 64) == 64) || (i4 & 128) == 128;
        C0361e c0361e = this.i0;
        c0361e.getClass();
        c0361e.f4385f = false;
        if (this.f4570p0 != 0 && z9) {
            c0361e.f4385f = true;
        }
        int[] iArr = this.f4537c0;
        char c = iArr[1];
        char c3 = iArr[0];
        ArrayList arrayList2 = this.f4559d0;
        boolean z10 = c3 == 2 || c == 2;
        this.f4566l0 = 0;
        this.f4567m0 = 0;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            d dVar = (d) this.f4559d0.get(i5);
            if (dVar instanceof e) {
                ((e) dVar).E();
            }
        }
        int i6 = 0;
        boolean z11 = false;
        boolean z12 = true;
        while (z12) {
            int i7 = i6 + 1;
            try {
                c0361e.r();
                this.f4566l0 = 0;
                this.f4567m0 = 0;
                f(c0361e);
                for (int i8 = 0; i8 < size2; i8++) {
                    ((d) this.f4559d0.get(i8)).f(c0361e);
                }
                C(c0361e);
            } catch (Exception e3) {
                e = e3;
            }
            try {
                q.g gVar = c0361e.f4382b;
                if (c0361e.f4385f) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= c0361e.f4386i) {
                            for (int i10 = 0; i10 < c0361e.f4386i; i10++) {
                                C0359c c0359c = c0361e.f4384e[i10];
                                c0359c.f4375a.f4399e = c0359c.f4376b;
                            }
                        } else {
                            if (!c0361e.f4384e[i9].f4378e) {
                                c0361e.o(gVar);
                                break;
                            }
                            i9++;
                        }
                    }
                } else {
                    c0361e.o(gVar);
                }
                arrayList = arrayList2;
                z3 = z11;
            } catch (Exception e4) {
                e = e4;
                z12 = true;
                e.printStackTrace();
                z3 = z11;
                arrayList = arrayList2;
                System.out.println("EXCEPTION : " + e);
                if (!z12) {
                    A(c0361e);
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((d) this.f4559d0.get(i11)).A(c0361e);
                    }
                    if (z10) {
                    }
                    z4 = z3;
                    z5 = false;
                    max = Math.max(this.f4523Q, l());
                    if (max > l()) {
                    }
                    max2 = Math.max(this.f4524R, i());
                    if (max2 > i()) {
                    }
                    if (!z8) {
                    }
                    z12 = z7;
                    z11 = z8;
                    i6 = i7;
                    arrayList2 = arrayList;
                }
                zArr[2] = false;
                A(c0361e);
                size = this.f4559d0.size();
                while (i3 < size) {
                }
                if (z10) {
                }
                z4 = z3;
                z5 = false;
                max = Math.max(this.f4523Q, l());
                if (max > l()) {
                }
                max2 = Math.max(this.f4524R, i());
                if (max2 > i()) {
                }
                if (!z8) {
                }
                z12 = z7;
                z11 = z8;
                i6 = i7;
                arrayList2 = arrayList;
            }
            zArr[2] = false;
            A(c0361e);
            size = this.f4559d0.size();
            for (i3 = 0; i3 < size; i3++) {
                ((d) this.f4559d0.get(i3)).A(c0361e);
            }
            if (z10 || i7 >= 8 || !zArr[2]) {
                z4 = z3;
                z5 = false;
            } else {
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < size2; i14++) {
                    d dVar2 = (d) this.f4559d0.get(i14);
                    i12 = Math.max(i12, dVar2.l() + dVar2.f4520N);
                    i13 = Math.max(i13, dVar2.i() + dVar2.f4521O);
                }
                int max5 = Math.max(this.f4523Q, i12);
                int max6 = Math.max(this.f4524R, i13);
                if (c3 != 2 || l() >= max5) {
                    z4 = z3;
                    z5 = false;
                } else {
                    y(max5);
                    iArr[0] = 2;
                    z5 = true;
                    z4 = true;
                }
                if (c == 2 && i() < max6) {
                    v(max6);
                    iArr[1] = 2;
                    z5 = true;
                    z4 = true;
                }
            }
            max = Math.max(this.f4523Q, l());
            if (max > l()) {
                y(max);
                r7 = 1;
                iArr[0] = 1;
                z5 = true;
                z6 = true;
            } else {
                r7 = 1;
                z6 = z4;
            }
            max2 = Math.max(this.f4524R, i());
            if (max2 > i()) {
                v(max2);
                iArr[r7] = r7;
                z8 = r7;
                z7 = z8;
            } else {
                z7 = z5;
                z8 = z6;
            }
            if (!z8) {
                if (iArr[0] == 2 && max3 > 0 && l() > max3) {
                    this.f4571q0 = r7;
                    iArr[0] = r7;
                    y(max3);
                    z8 = r7;
                    z7 = z8;
                }
                if (iArr[r7] == 2 && max4 > 0 && i() > max4) {
                    this.f4572r0 = r7;
                    iArr[r7] = r7;
                    v(max4);
                    z8 = true;
                    z12 = true;
                    z11 = z8;
                    i6 = i7;
                    arrayList2 = arrayList;
                }
            }
            z12 = z7;
            z11 = z8;
            i6 = i7;
            arrayList2 = arrayList;
        }
        boolean z13 = z11;
        this.f4559d0 = arrayList2;
        if (z13) {
            iArr[0] = c3;
            iArr[1] = c;
        }
        u(c0361e.f4388k);
    }

    @Override // r.d
    public final void s() {
        this.i0.r();
        this.f4564j0 = 0;
        this.f4565k0 = 0;
        this.f4559d0.clear();
        super.s();
    }

    @Override // r.d
    public final void u(v0.i iVar) {
        super.u(iVar);
        int size = this.f4559d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) this.f4559d0.get(i3)).u(iVar);
        }
    }

    @Override // r.d
    public final void z(boolean z3, boolean z4) {
        super.z(z3, z4);
        int size = this.f4559d0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) this.f4559d0.get(i3)).z(z3, z4);
        }
    }
}
