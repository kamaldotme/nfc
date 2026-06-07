package q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361e {

    /* renamed from: o, reason: collision with root package name */
    public static int f4379o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f4380p = true;

    /* renamed from: b, reason: collision with root package name */
    public final g f4382b;

    /* renamed from: e, reason: collision with root package name */
    public C0359c[] f4384e;

    /* renamed from: k, reason: collision with root package name */
    public final v0.i f4388k;

    /* renamed from: n, reason: collision with root package name */
    public C0359c f4391n;

    /* renamed from: a, reason: collision with root package name */
    public int f4381a = 0;
    public int c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f4383d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4385f = false;
    public boolean[] g = new boolean[32];
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f4386i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f4387j = 32;

    /* renamed from: l, reason: collision with root package name */
    public i[] f4389l = new i[f4379o];

    /* renamed from: m, reason: collision with root package name */
    public int f4390m = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [q.c, q.g] */
    /* JADX WARN: Type inference failed for: r2v6, types: [v0.i, java.lang.Object] */
    public C0361e() {
        this.f4384e = null;
        this.f4384e = new C0359c[32];
        q();
        ?? obj = new Object();
        obj.f5076b = new I.b();
        obj.c = new I.b();
        obj.f5077d = new I.b();
        obj.f5078e = new i[32];
        this.f4388k = obj;
        ?? c0359c = new C0359c(obj);
        c0359c.f4393f = new i[128];
        c0359c.g = new i[128];
        c0359c.h = 0;
        c0359c.f4394i = new f(c0359c);
        this.f4382b = c0359c;
        if (f4380p) {
            this.f4391n = new C0360d(obj);
        } else {
            this.f4391n = new C0359c(obj);
        }
    }

    public static int m(r.c cVar) {
        i iVar = cVar.g;
        if (iVar != null) {
            return (int) (iVar.f4399e + 0.5f);
        }
        return 0;
    }

    public final i a(int i3) {
        i iVar = (i) ((I.b) this.f4388k.f5077d).a();
        if (iVar == null) {
            iVar = new i(i3);
            iVar.f4404l = i3;
        } else {
            iVar.c();
            iVar.f4404l = i3;
        }
        int i4 = this.f4390m;
        int i5 = f4379o;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            f4379o = i6;
            this.f4389l = (i[]) Arrays.copyOf(this.f4389l, i6);
        }
        i[] iVarArr = this.f4389l;
        int i7 = this.f4390m;
        this.f4390m = i7 + 1;
        iVarArr[i7] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i3, float f3, i iVar3, i iVar4, int i4, int i5) {
        C0359c k2 = k();
        if (iVar2 == iVar3) {
            k2.f4377d.g(iVar, 1.0f);
            k2.f4377d.g(iVar4, 1.0f);
            k2.f4377d.g(iVar2, -2.0f);
        } else if (f3 == 0.5f) {
            k2.f4377d.g(iVar, 1.0f);
            k2.f4377d.g(iVar2, -1.0f);
            k2.f4377d.g(iVar3, -1.0f);
            k2.f4377d.g(iVar4, 1.0f);
            if (i3 > 0 || i4 > 0) {
                k2.f4376b = (-i3) + i4;
            }
        } else if (f3 <= 0.0f) {
            k2.f4377d.g(iVar, -1.0f);
            k2.f4377d.g(iVar2, 1.0f);
            k2.f4376b = i3;
        } else if (f3 >= 1.0f) {
            k2.f4377d.g(iVar4, -1.0f);
            k2.f4377d.g(iVar3, 1.0f);
            k2.f4376b = -i4;
        } else {
            float f4 = 1.0f - f3;
            k2.f4377d.g(iVar, f4 * 1.0f);
            k2.f4377d.g(iVar2, f4 * (-1.0f));
            k2.f4377d.g(iVar3, (-1.0f) * f3);
            k2.f4377d.g(iVar4, 1.0f * f3);
            if (i3 > 0 || i4 > 0) {
                k2.f4376b = (i4 * f3) + ((-i3) * f4);
            }
        }
        if (i5 != 8) {
            k2.a(this, i5);
        }
        c(k2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
    
        if (r5.f4403k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00bc, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c6, code lost:
    
        if (r5.f4403k <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00db, code lost:
    
        if (r5.f4403k <= 1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00de, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e8, code lost:
    
        if (r5.f4403k <= 1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C0359c c0359c) {
        boolean z3;
        boolean z4;
        i e3;
        ArrayList arrayList;
        if (this.f4386i + 1 >= this.f4387j || this.h + 1 >= this.f4383d) {
            n();
        }
        if (!c0359c.f4378e) {
            if (this.f4384e.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int k2 = c0359c.f4377d.k();
                    int i3 = 0;
                    while (true) {
                        arrayList = c0359c.c;
                        if (i3 >= k2) {
                            break;
                        }
                        i b3 = c0359c.f4377d.b(i3);
                        if (b3.c != -1 || b3.f4400f) {
                            arrayList.add(b3);
                        }
                        i3++;
                    }
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            i iVar = (i) it.next();
                            if (iVar.f4400f) {
                                c0359c.g(iVar, true);
                            } else {
                                c0359c.h(this.f4384e[iVar.c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
            }
            if (c0359c.f4375a == null && c0359c.f4376b == 0.0f && c0359c.f4377d.k() == 0) {
                return;
            }
            float f3 = c0359c.f4376b;
            if (f3 < 0.0f) {
                c0359c.f4376b = f3 * (-1.0f);
                c0359c.f4377d.j();
            }
            int k3 = c0359c.f4377d.k();
            float f4 = 0.0f;
            float f5 = 0.0f;
            i iVar2 = null;
            i iVar3 = null;
            boolean z6 = false;
            boolean z7 = false;
            for (int i4 = 0; i4 < k3; i4++) {
                float a3 = c0359c.f4377d.a(i4);
                i b4 = c0359c.f4377d.b(i4);
                if (b4.f4404l == 1) {
                    if (iVar2 != null) {
                        if (f4 <= a3) {
                            if (!z6) {
                                if (b4.f4403k > 1) {
                                }
                            }
                        }
                        z6 = true;
                    }
                    iVar2 = b4;
                    f4 = a3;
                } else if (iVar2 == null && a3 < 0.0f) {
                    if (iVar3 != null) {
                        if (f5 <= a3) {
                            if (!z7) {
                                if (b4.f4403k > 1) {
                                }
                            }
                        }
                        z7 = true;
                    }
                    iVar3 = b4;
                    f5 = a3;
                }
            }
            if (iVar2 == null) {
                iVar2 = iVar3;
            }
            if (iVar2 == null) {
                z3 = true;
            } else {
                c0359c.f(iVar2);
                z3 = false;
            }
            if (c0359c.f4377d.k() == 0) {
                c0359c.f4378e = true;
            }
            if (z3) {
                if (this.h + 1 >= this.f4383d) {
                    n();
                }
                i a4 = a(3);
                int i5 = this.f4381a + 1;
                this.f4381a = i5;
                this.h++;
                a4.f4397b = i5;
                ((i[]) this.f4388k.f5078e)[i5] = a4;
                c0359c.f4375a = a4;
                h(c0359c);
                C0359c c0359c2 = this.f4391n;
                c0359c2.getClass();
                c0359c2.f4375a = null;
                c0359c2.f4377d.clear();
                for (int i6 = 0; i6 < c0359c.f4377d.k(); i6++) {
                    c0359c2.f4377d.f(c0359c.f4377d.b(i6), c0359c.f4377d.a(i6), true);
                }
                p(this.f4391n);
                if (a4.c == -1) {
                    if (c0359c.f4375a == a4 && (e3 = c0359c.e(null, a4)) != null) {
                        c0359c.f(e3);
                    }
                    if (!c0359c.f4378e) {
                        c0359c.f4375a.d(c0359c);
                    }
                    this.f4386i--;
                }
                z4 = true;
            } else {
                z4 = false;
            }
            i iVar4 = c0359c.f4375a;
            if (iVar4 == null) {
                return;
            }
            if ((iVar4.f4404l != 1 && c0359c.f4376b < 0.0f) || z4) {
                return;
            }
        }
        h(c0359c);
    }

    public final void d(i iVar, int i3) {
        int i4 = iVar.c;
        if (i4 == -1) {
            iVar.f4399e = i3;
            iVar.f4400f = true;
            int i5 = iVar.f4402j;
            for (int i6 = 0; i6 < i5; i6++) {
                iVar.f4401i[i6].g(iVar, false);
            }
            iVar.f4402j = 0;
            return;
        }
        if (i4 == -1) {
            C0359c k2 = k();
            k2.f4375a = iVar;
            float f3 = i3;
            iVar.f4399e = f3;
            k2.f4376b = f3;
            k2.f4378e = true;
            c(k2);
            return;
        }
        C0359c c0359c = this.f4384e[i4];
        if (c0359c.f4378e) {
            c0359c.f4376b = i3;
            return;
        }
        if (c0359c.f4377d.k() == 0) {
            c0359c.f4378e = true;
            c0359c.f4376b = i3;
            return;
        }
        C0359c k3 = k();
        if (i3 < 0) {
            k3.f4376b = i3 * (-1);
            k3.f4377d.g(iVar, 1.0f);
        } else {
            k3.f4376b = i3;
            k3.f4377d.g(iVar, -1.0f);
        }
        c(k3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(i iVar, i iVar2, int i3, int i4) {
        boolean z3 = false;
        if (i4 == 8 && iVar2.f4400f && iVar.c == -1) {
            iVar.f4399e = iVar2.f4399e + i3;
            iVar.f4400f = true;
            int i5 = iVar.f4402j;
            for (int i6 = 0; i6 < i5; i6++) {
                iVar.f4401i[i6].g(iVar, false);
            }
            iVar.f4402j = 0;
            return;
        }
        C0359c k2 = k();
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            k2.f4376b = i3;
            if (z3) {
                k2.f4377d.g(iVar, 1.0f);
                k2.f4377d.g(iVar2, -1.0f);
                if (i4 != 8) {
                    k2.a(this, i4);
                }
                c(k2);
            }
        }
        k2.f4377d.g(iVar, -1.0f);
        k2.f4377d.g(iVar2, 1.0f);
        if (i4 != 8) {
        }
        c(k2);
    }

    public final void f(i iVar, i iVar2, int i3, int i4) {
        C0359c k2 = k();
        i l3 = l();
        l3.f4398d = 0;
        k2.b(iVar, iVar2, l3, i3);
        if (i4 != 8) {
            k2.f4377d.g(i(i4), (int) (k2.f4377d.h(l3) * (-1.0f)));
        }
        c(k2);
    }

    public final void g(i iVar, i iVar2, int i3, int i4) {
        C0359c k2 = k();
        i l3 = l();
        l3.f4398d = 0;
        k2.c(iVar, iVar2, l3, i3);
        if (i4 != 8) {
            k2.f4377d.g(i(i4), (int) (k2.f4377d.h(l3) * (-1.0f)));
        }
        c(k2);
    }

    public final void h(C0359c c0359c) {
        boolean z3 = f4380p;
        v0.i iVar = this.f4388k;
        if (z3) {
            C0359c c0359c2 = this.f4384e[this.f4386i];
            if (c0359c2 != null) {
                ((I.b) iVar.f5076b).b(c0359c2);
            }
        } else {
            C0359c c0359c3 = this.f4384e[this.f4386i];
            if (c0359c3 != null) {
                ((I.b) iVar.c).b(c0359c3);
            }
        }
        C0359c[] c0359cArr = this.f4384e;
        int i3 = this.f4386i;
        c0359cArr[i3] = c0359c;
        i iVar2 = c0359c.f4375a;
        iVar2.c = i3;
        this.f4386i = i3 + 1;
        iVar2.d(c0359c);
    }

    public final i i(int i3) {
        if (this.h + 1 >= this.f4383d) {
            n();
        }
        i a3 = a(4);
        int i4 = this.f4381a + 1;
        this.f4381a = i4;
        this.h++;
        a3.f4397b = i4;
        a3.f4398d = i3;
        ((i[]) this.f4388k.f5078e)[i4] = a3;
        g gVar = this.f4382b;
        gVar.f4394i.f4392b = a3;
        float[] fArr = a3.h;
        Arrays.fill(fArr, 0.0f);
        fArr[a3.f4398d] = 1.0f;
        gVar.i(a3);
        return a3;
    }

    public final i j(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.f4383d) {
            n();
        }
        if (obj instanceof r.c) {
            r.c cVar = (r.c) obj;
            iVar = cVar.g;
            if (iVar == null) {
                cVar.i();
                iVar = cVar.g;
            }
            int i3 = iVar.f4397b;
            v0.i iVar2 = this.f4388k;
            if (i3 == -1 || i3 > this.f4381a || ((i[]) iVar2.f5078e)[i3] == null) {
                if (i3 != -1) {
                    iVar.c();
                }
                int i4 = this.f4381a + 1;
                this.f4381a = i4;
                this.h++;
                iVar.f4397b = i4;
                iVar.f4404l = 1;
                ((i[]) iVar2.f5078e)[i4] = iVar;
            }
        }
        return iVar;
    }

    public final C0359c k() {
        boolean z3 = f4380p;
        v0.i iVar = this.f4388k;
        if (z3) {
            C0359c c0359c = (C0359c) ((I.b) iVar.f5076b).a();
            if (c0359c == null) {
                return new C0360d(iVar);
            }
            c0359c.f4375a = null;
            c0359c.f4377d.clear();
            c0359c.f4376b = 0.0f;
            c0359c.f4378e = false;
            return c0359c;
        }
        C0359c c0359c2 = (C0359c) ((I.b) iVar.c).a();
        if (c0359c2 == null) {
            return new C0359c(iVar);
        }
        c0359c2.f4375a = null;
        c0359c2.f4377d.clear();
        c0359c2.f4376b = 0.0f;
        c0359c2.f4378e = false;
        return c0359c2;
    }

    public final i l() {
        if (this.h + 1 >= this.f4383d) {
            n();
        }
        i a3 = a(3);
        int i3 = this.f4381a + 1;
        this.f4381a = i3;
        this.h++;
        a3.f4397b = i3;
        ((i[]) this.f4388k.f5078e)[i3] = a3;
        return a3;
    }

    public final void n() {
        int i3 = this.c * 2;
        this.c = i3;
        this.f4384e = (C0359c[]) Arrays.copyOf(this.f4384e, i3);
        v0.i iVar = this.f4388k;
        iVar.f5078e = (i[]) Arrays.copyOf((i[]) iVar.f5078e, this.c);
        int i4 = this.c;
        this.g = new boolean[i4];
        this.f4383d = i4;
        this.f4387j = i4;
    }

    public final void o(g gVar) {
        v0.i iVar;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f4386i) {
                break;
            }
            C0359c c0359c = this.f4384e[i3];
            int i4 = 1;
            if (c0359c.f4375a.f4404l != 1) {
                float f3 = 0.0f;
                if (c0359c.f4376b < 0.0f) {
                    boolean z3 = false;
                    int i5 = 0;
                    while (!z3) {
                        i5 += i4;
                        float f4 = Float.MAX_VALUE;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f4386i;
                            iVar = this.f4388k;
                            if (i8 >= i10) {
                                break;
                            }
                            C0359c c0359c2 = this.f4384e[i8];
                            if (c0359c2.f4375a.f4404l != i4 && !c0359c2.f4378e && c0359c2.f4376b < f3) {
                                int i11 = i4;
                                while (i11 < this.h) {
                                    i iVar2 = ((i[]) iVar.f5078e)[i11];
                                    float h = c0359c2.f4377d.h(iVar2);
                                    if (h > f3) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f5 = iVar2.g[i12] / h;
                                            if ((f5 < f4 && i12 == i9) || i12 > i9) {
                                                i9 = i12;
                                                f4 = f5;
                                                i6 = i8;
                                                i7 = i11;
                                            }
                                        }
                                    }
                                    i11++;
                                    f3 = 0.0f;
                                }
                            }
                            i8++;
                            f3 = 0.0f;
                            i4 = 1;
                        }
                        if (i6 != -1) {
                            C0359c c0359c3 = this.f4384e[i6];
                            c0359c3.f4375a.c = -1;
                            c0359c3.f(((i[]) iVar.f5078e)[i7]);
                            i iVar3 = c0359c3.f4375a;
                            iVar3.c = i6;
                            iVar3.d(c0359c3);
                        } else {
                            z3 = true;
                        }
                        if (i5 > this.h / 2) {
                            z3 = true;
                        }
                        f3 = 0.0f;
                        i4 = 1;
                    }
                }
            }
            i3++;
        }
        p(gVar);
        for (int i13 = 0; i13 < this.f4386i; i13++) {
            C0359c c0359c4 = this.f4384e[i13];
            c0359c4.f4375a.f4399e = c0359c4.f4376b;
        }
    }

    public final void p(C0359c c0359c) {
        for (int i3 = 0; i3 < this.h; i3++) {
            this.g[i3] = false;
        }
        boolean z3 = false;
        int i4 = 0;
        while (!z3) {
            i4++;
            if (i4 >= this.h * 2) {
                return;
            }
            i iVar = c0359c.f4375a;
            if (iVar != null) {
                this.g[iVar.f4397b] = true;
            }
            i d3 = c0359c.d(this.g);
            if (d3 != null) {
                boolean[] zArr = this.g;
                int i5 = d3.f4397b;
                if (zArr[i5]) {
                    return;
                } else {
                    zArr[i5] = true;
                }
            }
            if (d3 != null) {
                float f3 = Float.MAX_VALUE;
                int i6 = -1;
                for (int i7 = 0; i7 < this.f4386i; i7++) {
                    C0359c c0359c2 = this.f4384e[i7];
                    if (c0359c2.f4375a.f4404l != 1 && !c0359c2.f4378e && c0359c2.f4377d.d(d3)) {
                        float h = c0359c2.f4377d.h(d3);
                        if (h < 0.0f) {
                            float f4 = (-c0359c2.f4376b) / h;
                            if (f4 < f3) {
                                i6 = i7;
                                f3 = f4;
                            }
                        }
                    }
                }
                if (i6 > -1) {
                    C0359c c0359c3 = this.f4384e[i6];
                    c0359c3.f4375a.c = -1;
                    c0359c3.f(d3);
                    i iVar2 = c0359c3.f4375a;
                    iVar2.c = i6;
                    iVar2.d(c0359c3);
                }
            } else {
                z3 = true;
            }
        }
    }

    public final void q() {
        boolean z3 = f4380p;
        v0.i iVar = this.f4388k;
        int i3 = 0;
        if (z3) {
            while (true) {
                C0359c[] c0359cArr = this.f4384e;
                if (i3 >= c0359cArr.length) {
                    return;
                }
                C0359c c0359c = c0359cArr[i3];
                if (c0359c != null) {
                    ((I.b) iVar.f5076b).b(c0359c);
                }
                this.f4384e[i3] = null;
                i3++;
            }
        } else {
            while (true) {
                C0359c[] c0359cArr2 = this.f4384e;
                if (i3 >= c0359cArr2.length) {
                    return;
                }
                C0359c c0359c2 = c0359cArr2[i3];
                if (c0359c2 != null) {
                    ((I.b) iVar.c).b(c0359c2);
                }
                this.f4384e[i3] = null;
                i3++;
            }
        }
    }

    public final void r() {
        v0.i iVar;
        int i3 = 0;
        while (true) {
            iVar = this.f4388k;
            i[] iVarArr = (i[]) iVar.f5078e;
            if (i3 >= iVarArr.length) {
                break;
            }
            i iVar2 = iVarArr[i3];
            if (iVar2 != null) {
                iVar2.c();
            }
            i3++;
        }
        I.b bVar = (I.b) iVar.f5077d;
        i[] iVarArr2 = this.f4389l;
        int i4 = this.f4390m;
        bVar.getClass();
        if (i4 > iVarArr2.length) {
            i4 = iVarArr2.length;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            i iVar3 = iVarArr2[i5];
            int i6 = bVar.c;
            Object[] objArr = bVar.f291b;
            if (i6 < objArr.length) {
                objArr[i6] = iVar3;
                bVar.c = i6 + 1;
            }
        }
        this.f4390m = 0;
        Arrays.fill((i[]) iVar.f5078e, (Object) null);
        this.f4381a = 0;
        g gVar = this.f4382b;
        gVar.h = 0;
        gVar.f4376b = 0.0f;
        this.h = 1;
        for (int i7 = 0; i7 < this.f4386i; i7++) {
            this.f4384e[i7].getClass();
        }
        q();
        this.f4386i = 0;
        if (f4380p) {
            this.f4391n = new C0360d(iVar);
        } else {
            this.f4391n = new C0359c(iVar);
        }
    }
}
