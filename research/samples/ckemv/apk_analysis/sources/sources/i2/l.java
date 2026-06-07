package i2;

import L1.w;
import e2.C0136s;
import e2.I;
import e2.Q;
import e2.Z;
import e2.h0;
import e2.m0;
import m0.z;

/* loaded from: classes.dex */
public final class l implements h2.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.h f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3218b;

    public l(g2.h hVar, int i3) {
        this.f3217a = hVar;
        this.f3218b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v2, types: [O1.a, e2.m0, O1.i] */
    @Override // h2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O1.d dVar, Object obj) {
        k kVar;
        Object obj2;
        int i3;
        Object obj3;
        Q q3;
        j2.h hVar;
        Object obj4;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i4 = kVar.g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.g = i4 - Integer.MIN_VALUE;
                Object obj5 = kVar.f3215e;
                obj2 = P1.a.f784b;
                i3 = kVar.g;
                obj3 = K1.h.f605a;
                if (i3 != 0) {
                    z.m0(obj5);
                    w wVar = new w(this.f3218b, obj);
                    kVar.g = 1;
                    if (this.f3217a.g(kVar, wVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            z.m0(obj5);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z.m0(obj5);
                }
                kVar.g = 2;
                O1.i iVar = kVar.c;
                X1.g.b(iVar);
                q3 = (Q) iVar.A(C0136s.c);
                if (q3 == null && !q3.b()) {
                    throw ((Z) q3).B();
                }
                O1.d y3 = v0.f.y(kVar);
                hVar = !(y3 instanceof j2.h) ? (j2.h) y3 : null;
                if (hVar != null) {
                    e2.r rVar = hVar.f3519e;
                    if (rVar.K()) {
                        hVar.g = obj3;
                        hVar.f2766d = 1;
                        rVar.J(iVar, hVar);
                    } else {
                        ?? aVar = new O1.a(m0.f2815d);
                        O1.i o3 = iVar.o(aVar);
                        hVar.g = obj3;
                        hVar.f2766d = 1;
                        rVar.J(o3, hVar);
                        if (aVar.c) {
                            I a3 = h0.a();
                            L1.i iVar2 = a3.f2776f;
                            if (iVar2 != null && !iVar2.isEmpty()) {
                                if (a3.P()) {
                                    hVar.g = obj3;
                                    hVar.f2766d = 1;
                                    a3.M(hVar);
                                } else {
                                    a3.O(true);
                                    try {
                                        hVar.run();
                                        do {
                                        } while (a3.Q());
                                    } finally {
                                        try {
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj4 = obj2;
                    if (obj4 != obj2) {
                        obj4 = obj3;
                    }
                    return obj4 == obj2 ? obj2 : obj3;
                }
                obj4 = obj3;
                if (obj4 != obj2) {
                }
                if (obj4 == obj2) {
                }
            }
        }
        kVar = new k(this, dVar);
        Object obj52 = kVar.f3215e;
        obj2 = P1.a.f784b;
        i3 = kVar.g;
        obj3 = K1.h.f605a;
        if (i3 != 0) {
        }
        kVar.g = 2;
        O1.i iVar3 = kVar.c;
        X1.g.b(iVar3);
        q3 = (Q) iVar3.A(C0136s.c);
        if (q3 == null) {
        }
        O1.d y32 = v0.f.y(kVar);
        if (!(y32 instanceof j2.h)) {
        }
        if (hVar != null) {
        }
        obj4 = obj3;
        if (obj4 != obj2) {
        }
        if (obj4 == obj2) {
        }
    }
}
