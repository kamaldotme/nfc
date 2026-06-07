package s;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q1.C0363a;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375e {

    /* renamed from: a, reason: collision with root package name */
    public r.e f4672a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4673b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public r.e f4674d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4675e;

    /* renamed from: f, reason: collision with root package name */
    public C0363a f4676f;
    public C0372b g;
    public ArrayList h;

    /* JADX WARN: Type inference failed for: r10v2, types: [s.k, java.lang.Object] */
    public final void a(C0376f c0376f, int i3, ArrayList arrayList, k kVar) {
        m mVar = c0376f.f4679d;
        if (mVar.c == null) {
            r.e eVar = this.f4672a;
            if (mVar != eVar.f4538d) {
                k kVar2 = kVar;
                if (mVar == eVar.f4539e) {
                    return;
                }
                if (kVar == null) {
                    ?? obj = new Object();
                    obj.f4688a = null;
                    obj.f4689b = new ArrayList();
                    obj.f4688a = mVar;
                    arrayList.add(obj);
                    kVar2 = obj;
                }
                mVar.c = kVar2;
                kVar2.f4689b.add(mVar);
                C0376f c0376f2 = mVar.h;
                Iterator it = c0376f2.f4684k.iterator();
                while (it.hasNext()) {
                    InterfaceC0374d interfaceC0374d = (InterfaceC0374d) it.next();
                    if (interfaceC0374d instanceof C0376f) {
                        a((C0376f) interfaceC0374d, i3, arrayList, kVar2);
                    }
                }
                C0376f c0376f3 = mVar.f4697i;
                Iterator it2 = c0376f3.f4684k.iterator();
                while (it2.hasNext()) {
                    InterfaceC0374d interfaceC0374d2 = (InterfaceC0374d) it2.next();
                    if (interfaceC0374d2 instanceof C0376f) {
                        a((C0376f) interfaceC0374d2, i3, arrayList, kVar2);
                    }
                }
                if (i3 == 1 && (mVar instanceof l)) {
                    Iterator it3 = ((l) mVar).f4690k.f4684k.iterator();
                    while (it3.hasNext()) {
                        InterfaceC0374d interfaceC0374d3 = (InterfaceC0374d) it3.next();
                        if (interfaceC0374d3 instanceof C0376f) {
                            a((C0376f) interfaceC0374d3, i3, arrayList, kVar2);
                        }
                    }
                }
                Iterator it4 = c0376f2.f4685l.iterator();
                while (it4.hasNext()) {
                    a((C0376f) it4.next(), i3, arrayList, kVar2);
                }
                Iterator it5 = c0376f3.f4685l.iterator();
                while (it5.hasNext()) {
                    a((C0376f) it5.next(), i3, arrayList, kVar2);
                }
                if (i3 == 1 && (mVar instanceof l)) {
                    Iterator it6 = ((l) mVar).f4690k.f4685l.iterator();
                    while (it6.hasNext()) {
                        a((C0376f) it6.next(), i3, arrayList, kVar2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(r.e eVar) {
        r.c cVar;
        int i3;
        C0380j c0380j;
        l lVar;
        int i4;
        int i5;
        int i6;
        int i7;
        C0380j c0380j2;
        l lVar2;
        int i8;
        int i9;
        Iterator it = eVar.f4559d0.iterator();
        while (it.hasNext()) {
            r.d dVar = (r.d) it.next();
            int[] iArr = dVar.f4537c0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            if (dVar.f4528V == 8) {
                dVar.f4533a = true;
            } else {
                float f3 = dVar.f4547o;
                if (f3 < 1.0f && i10 == 3) {
                    dVar.f4542j = 2;
                }
                float f4 = dVar.f4550r;
                if (f4 < 1.0f && i11 == 3) {
                    dVar.f4543k = 2;
                }
                int i12 = 1;
                if (dVar.f4518L > 0.0f) {
                    if (i10 == 3 && (i11 == 2 || i11 == 1)) {
                        dVar.f4542j = 3;
                    } else if (i11 == 3 && (i10 == 2 || i10 == 1)) {
                        dVar.f4543k = 3;
                    } else if (i10 == 3 && i11 == 3) {
                        if (dVar.f4542j == 0) {
                            dVar.f4542j = 3;
                        }
                        if (dVar.f4543k == 0) {
                            dVar.f4543k = 3;
                        }
                    }
                }
                r.c cVar2 = dVar.f4558z;
                r.c cVar3 = dVar.f4556x;
                if (i10 == 3 && dVar.f4542j == 1 && (cVar3.f4505d == null || cVar2.f4505d == null)) {
                    i10 = 2;
                }
                r.c cVar4 = dVar.f4508A;
                r.c cVar5 = dVar.f4557y;
                int i13 = (i11 == 3 && dVar.f4543k == 1 && (cVar5.f4505d == null || cVar4.f4505d == null)) ? 2 : i11;
                C0380j c0380j3 = dVar.f4538d;
                c0380j3.f4694d = i10;
                int i14 = dVar.f4542j;
                c0380j3.f4692a = i14;
                l lVar3 = dVar.f4539e;
                lVar3.f4694d = i13;
                int i15 = dVar.f4543k;
                lVar3.f4692a = i15;
                if (i10 == 4 || i10 == 1) {
                    cVar = cVar5;
                    i3 = 2;
                } else {
                    cVar = cVar5;
                    i3 = 2;
                    if (i10 != 2) {
                        int[] iArr2 = eVar.f4537c0;
                        r.c[] cVarArr = dVar.f4512F;
                        if (i10 == 3) {
                            c0380j = c0380j3;
                        } else if (i13 != i3 && i13 != 1) {
                            lVar = lVar3;
                            c0380j = c0380j3;
                            i4 = 3;
                            if (i13 == i4) {
                            }
                            i5 = 1;
                            i6 = 3;
                            if (i10 == i6) {
                            }
                        } else if (i14 == 3) {
                            if (i13 == i3) {
                                c0380j2 = c0380j3;
                                lVar2 = lVar3;
                                f(i3, 0, i3, 0, dVar);
                            } else {
                                c0380j2 = c0380j3;
                                lVar2 = lVar3;
                            }
                            int i16 = dVar.i();
                            f(1, (int) ((i16 * dVar.f4518L) + 0.5f), 1, i16, dVar);
                            c0380j2.f4695e.d(dVar.l());
                            lVar2.f4695e.d(dVar.i());
                            dVar.f4533a = true;
                        } else {
                            c0380j = c0380j3;
                            if (i14 == 1) {
                                f(2, 0, i13, 0, dVar);
                                c0380j.f4695e.f4686m = dVar.l();
                            } else {
                                if (i14 == 2) {
                                    int i17 = iArr2[0];
                                    if (i17 == 1 || i17 == 4) {
                                        f(1, (int) ((f3 * eVar.l()) + 0.5f), i13, dVar.i(), dVar);
                                        c0380j.f4695e.d(dVar.l());
                                        lVar3.f4695e.d(dVar.i());
                                        dVar.f4533a = true;
                                    }
                                } else if (cVarArr[0].f4505d == null || cVarArr[1].f4505d == null) {
                                    f(2, 0, i13, 0, dVar);
                                    c0380j.f4695e.d(dVar.l());
                                    lVar3.f4695e.d(dVar.i());
                                    dVar.f4533a = true;
                                }
                                if (i13 == i4) {
                                    if (i10 != 2 && i10 != 1) {
                                        i6 = i4;
                                        i5 = 1;
                                        if (i10 == i6) {
                                            if (i14 != i5) {
                                            }
                                            f(2, 0, 2, 0, dVar);
                                            c0380j.f4695e.f4686m = dVar.l();
                                            lVar.f4695e.f4686m = dVar.i();
                                        }
                                    } else if (i15 == i4) {
                                        if (i10 == 2) {
                                            f(2, 0, 2, 0, dVar);
                                        }
                                        int l3 = dVar.l();
                                        float f5 = dVar.f4518L;
                                        if (dVar.f4519M == -1) {
                                            f5 = 1.0f / f5;
                                        }
                                        f(1, l3, 1, (int) ((l3 * f5) + 0.5f), dVar);
                                        c0380j.f4695e.d(dVar.l());
                                        lVar.f4695e.d(dVar.i());
                                        dVar.f4533a = true;
                                    } else if (i15 == 1) {
                                        f(i10, 0, 2, 0, dVar);
                                        lVar.f4695e.f4686m = dVar.i();
                                    } else {
                                        if (i15 == 2) {
                                            int i18 = iArr2[1];
                                            if (i18 == 1 || i18 == 4) {
                                                f(i10, dVar.l(), 1, (int) ((f4 * eVar.i()) + 0.5f), dVar);
                                                c0380j.f4695e.d(dVar.l());
                                                lVar.f4695e.d(dVar.i());
                                                dVar.f4533a = true;
                                            }
                                        } else if (cVarArr[2].f4505d == null || cVarArr[3].f4505d == null) {
                                            f(2, 0, i13, 0, dVar);
                                            c0380j.f4695e.d(dVar.l());
                                            lVar.f4695e.d(dVar.i());
                                            dVar.f4533a = true;
                                        }
                                        if (i10 == i6 && i13 == i6) {
                                            if (i14 != i5 || i15 == i5) {
                                                f(2, 0, 2, 0, dVar);
                                                c0380j.f4695e.f4686m = dVar.l();
                                                lVar.f4695e.f4686m = dVar.i();
                                            } else if (i15 == 2 && i14 == 2 && ((i7 = iArr2[0]) == 1 || i7 == 1)) {
                                                int i19 = iArr2[i5];
                                                if (i19 == 1 || i19 == 1) {
                                                    f(1, (int) ((f3 * eVar.l()) + 0.5f), 1, (int) ((f4 * eVar.i()) + 0.5f), dVar);
                                                    c0380j.f4695e.d(dVar.l());
                                                    lVar.f4695e.d(dVar.i());
                                                    dVar.f4533a = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                i5 = 1;
                                i6 = 3;
                                if (i10 == i6) {
                                }
                            }
                        }
                        lVar = lVar3;
                        i4 = 3;
                        if (i13 == i4) {
                        }
                        i5 = 1;
                        i6 = 3;
                        if (i10 == i6) {
                        }
                    }
                }
                if (i13 == 4 || i13 == 1 || i13 == i3) {
                    int l4 = dVar.l();
                    if (i10 == 4) {
                        i8 = (eVar.l() - cVar3.f4506e) - cVar2.f4506e;
                        i10 = 1;
                    } else {
                        i8 = l4;
                    }
                    int i20 = dVar.i();
                    if (i13 == 4) {
                        i9 = (eVar.i() - cVar.f4506e) - cVar4.f4506e;
                    } else {
                        i9 = i20;
                        i12 = i13;
                    }
                    f(i10, i8, i12, i9, dVar);
                    c0380j3.f4695e.d(dVar.l());
                    lVar3.f4695e.d(dVar.i());
                    dVar.f4533a = true;
                } else {
                    int[] iArr22 = eVar.f4537c0;
                    r.c[] cVarArr2 = dVar.f4512F;
                    if (i10 == 3) {
                    }
                    lVar = lVar3;
                    i4 = 3;
                    if (i13 == i4) {
                    }
                    i5 = 1;
                    i6 = 3;
                    if (i10 == i6) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f4675e;
        arrayList.clear();
        r.e eVar = this.f4674d;
        eVar.f4538d.f();
        l lVar = eVar.f4539e;
        lVar.f();
        arrayList.add(eVar.f4538d);
        arrayList.add(lVar);
        Iterator it = eVar.f4559d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            r.d dVar = (r.d) it.next();
            if (dVar instanceof r.h) {
                m mVar = new m(dVar);
                dVar.f4538d.f();
                dVar.f4539e.f();
                mVar.f4696f = ((r.h) dVar).f4625h0;
                arrayList.add(mVar);
            } else {
                if (dVar.q()) {
                    if (dVar.f4535b == null) {
                        dVar.f4535b = new C0373c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f4535b);
                } else {
                    arrayList.add(dVar.f4538d);
                }
                if (dVar.r()) {
                    if (dVar.c == null) {
                        dVar.c = new C0373c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.c);
                } else {
                    arrayList.add(dVar.f4539e);
                }
                if (dVar instanceof r.i) {
                    arrayList.add(new m(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar2 = (m) it3.next();
            if (mVar2.f4693b != eVar) {
                mVar2.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        r.e eVar2 = this.f4672a;
        e(eVar2.f4538d, 0, arrayList2);
        e(eVar2.f4539e, 1, arrayList2);
        this.f4673b = false;
    }

    public final int d(r.e eVar, int i3) {
        ArrayList arrayList;
        int i4;
        int i5;
        long max;
        float f3;
        r.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i6 = 0;
        long j3 = 0;
        while (i6 < size) {
            m mVar = ((k) arrayList2.get(i6)).f4688a;
            if (!(mVar instanceof C0373c) ? !(i3 != 0 ? (mVar instanceof l) : (mVar instanceof C0380j)) : ((C0373c) mVar).f4696f != i3) {
                C0376f c0376f = (i3 == 0 ? eVar2.f4538d : eVar2.f4539e).h;
                C0376f c0376f2 = (i3 == 0 ? eVar2.f4538d : eVar2.f4539e).f4697i;
                boolean contains = mVar.h.f4685l.contains(c0376f);
                C0376f c0376f3 = mVar.f4697i;
                boolean contains2 = c0376f3.f4685l.contains(c0376f2);
                long j4 = mVar.j();
                C0376f c0376f4 = mVar.h;
                if (contains && contains2) {
                    long b3 = k.b(c0376f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i4 = size;
                    long a3 = k.a(c0376f3, 0L);
                    long j5 = b3 - j4;
                    int i7 = c0376f3.f4681f;
                    arrayList = arrayList3;
                    i5 = i6;
                    if (j5 >= (-i7)) {
                        j5 += i7;
                    }
                    long j6 = (-a3) - j4;
                    long j7 = c0376f4.f4681f;
                    long j8 = j6 - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    r.d dVar = mVar.f4693b;
                    if (i3 == 0) {
                        f3 = dVar.f4525S;
                    } else if (i3 == 1) {
                        f3 = dVar.f4526T;
                    } else {
                        dVar.getClass();
                        f3 = -1.0f;
                    }
                    float f4 = (float) (f3 > 0.0f ? (((float) j5) / (1.0f - f3)) + (((float) j8) / f3) : 0L);
                    max = (c0376f4.f4681f + ((((f4 * f3) + 0.5f) + j4) + (((1.0f - f3) * f4) + 0.5f))) - c0376f3.f4681f;
                } else {
                    arrayList = arrayList2;
                    i4 = size;
                    i5 = i6;
                    max = contains ? Math.max(k.b(c0376f4, c0376f4.f4681f), c0376f4.f4681f + j4) : contains2 ? Math.max(-k.a(c0376f3, c0376f3.f4681f), (-c0376f3.f4681f) + j4) : (mVar.j() + c0376f4.f4681f) - c0376f3.f4681f;
                }
            } else {
                arrayList = arrayList2;
                i4 = size;
                i5 = i6;
                max = 0;
            }
            j3 = Math.max(j3, max);
            i6 = i5 + 1;
            eVar2 = eVar;
            size = i4;
            arrayList2 = arrayList;
        }
        return (int) j3;
    }

    public final void e(m mVar, int i3, ArrayList arrayList) {
        C0376f c0376f;
        Iterator it = mVar.h.f4684k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0376f = mVar.f4697i;
            if (!hasNext) {
                break;
            }
            InterfaceC0374d interfaceC0374d = (InterfaceC0374d) it.next();
            if (interfaceC0374d instanceof C0376f) {
                a((C0376f) interfaceC0374d, i3, arrayList, null);
            } else if (interfaceC0374d instanceof m) {
                a(((m) interfaceC0374d).h, i3, arrayList, null);
            }
        }
        Iterator it2 = c0376f.f4684k.iterator();
        while (it2.hasNext()) {
            InterfaceC0374d interfaceC0374d2 = (InterfaceC0374d) it2.next();
            if (interfaceC0374d2 instanceof C0376f) {
                a((C0376f) interfaceC0374d2, i3, arrayList, null);
            } else if (interfaceC0374d2 instanceof m) {
                a(((m) interfaceC0374d2).f4697i, i3, arrayList, null);
            }
        }
        if (i3 == 1) {
            Iterator it3 = ((l) mVar).f4690k.f4684k.iterator();
            while (it3.hasNext()) {
                InterfaceC0374d interfaceC0374d3 = (InterfaceC0374d) it3.next();
                if (interfaceC0374d3 instanceof C0376f) {
                    a((C0376f) interfaceC0374d3, i3, arrayList, null);
                }
            }
        }
    }

    public final void f(int i3, int i4, int i5, int i6, r.d dVar) {
        C0372b c0372b = this.g;
        c0372b.f4663a = i3;
        c0372b.f4664b = i5;
        c0372b.c = i4;
        c0372b.f4665d = i6;
        this.f4676f.d(dVar, c0372b);
        dVar.y(c0372b.f4666e);
        dVar.v(c0372b.f4667f);
        dVar.f4555w = c0372b.h;
        int i7 = c0372b.g;
        dVar.f4522P = i7;
        dVar.f4555w = i7 > 0;
    }

    public final void g() {
        C0371a c0371a;
        Iterator it = this.f4672a.f4559d0.iterator();
        while (it.hasNext()) {
            r.d dVar = (r.d) it.next();
            if (!dVar.f4533a) {
                int[] iArr = dVar.f4537c0;
                boolean z3 = false;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = dVar.f4542j;
                int i6 = dVar.f4543k;
                boolean z4 = i3 == 2 || (i3 == 3 && i5 == 1);
                if (i4 == 2 || (i4 == 3 && i6 == 1)) {
                    z3 = true;
                }
                C0380j c0380j = dVar.f4538d;
                C0377g c0377g = c0380j.f4695e;
                boolean z5 = c0377g.f4683j;
                l lVar = dVar.f4539e;
                C0377g c0377g2 = lVar.f4695e;
                boolean z6 = c0377g2.f4683j;
                if (z5 && z6) {
                    f(1, c0377g.g, 1, c0377g2.g, dVar);
                    dVar.f4533a = true;
                } else if (z5 && z3) {
                    f(1, c0377g.g, 2, c0377g2.g, dVar);
                    if (i4 == 3) {
                        lVar.f4695e.f4686m = dVar.i();
                    } else {
                        lVar.f4695e.d(dVar.i());
                        dVar.f4533a = true;
                    }
                } else if (z6 && z4) {
                    f(2, c0377g.g, 1, c0377g2.g, dVar);
                    if (i3 == 3) {
                        c0380j.f4695e.f4686m = dVar.l();
                    } else {
                        c0380j.f4695e.d(dVar.l());
                        dVar.f4533a = true;
                    }
                }
                if (dVar.f4533a && (c0371a = lVar.f4691l) != null) {
                    c0371a.d(dVar.f4522P);
                }
            }
        }
    }
}
