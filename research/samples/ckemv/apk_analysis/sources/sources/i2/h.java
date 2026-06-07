package i2;

import e2.AbstractC0139v;
import e2.C0122d;
import e2.C0124f;
import e2.C0136s;
import e2.InterfaceC0137t;
import e2.M;
import e2.P;
import e2.Q;
import e2.Z;
import java.util.concurrent.CancellationException;
import m0.z;

/* loaded from: classes.dex */
public final class h implements h2.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X1.j f3210a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0137t f3211b;
    public final /* synthetic */ h2.b c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2.g f3212d;

    public h(X1.j jVar, InterfaceC0137t interfaceC0137t, h2.b bVar, h2.g gVar) {
        this.f3210a = jVar;
        this.f3211b = interfaceC0137t;
        this.c = bVar;
        this.f3212d = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O1.d dVar, Object obj) {
        g gVar;
        int i3;
        h hVar;
        Object obj2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i4 = gVar.f3209i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gVar.f3209i = i4 - Integer.MIN_VALUE;
                Object obj3 = gVar.g;
                P1.a aVar = P1.a.f784b;
                i3 = gVar.f3209i;
                K1.h hVar2 = K1.h.f605a;
                if (i3 != 0) {
                    z.m0(obj3);
                    Q q3 = (Q) this.f3210a.c;
                    if (q3 != null) {
                        q3.a(new CancellationException("Child of the scoped flow was cancelled"));
                        gVar.f3207e = this;
                        gVar.f3208f = obj;
                        gVar.getClass();
                        gVar.f3209i = 1;
                        Z z3 = (Z) q3;
                        while (true) {
                            Object F2 = z3.F();
                            if (!(F2 instanceof M)) {
                                O1.i iVar = gVar.c;
                                X1.g.b(iVar);
                                Q q4 = (Q) iVar.A(C0136s.c);
                                if (q4 != null && !q4.b()) {
                                    throw ((Z) q4).B();
                                }
                            } else if (z3.S(F2) >= 0) {
                                C0124f c0124f = new C0124f(1, v0.f.y(gVar));
                                c0124f.r();
                                c0124f.t(new C0122d(1, z3.J(false, true, new P(1, c0124f))));
                                obj2 = c0124f.q();
                                if (obj2 != aVar) {
                                    obj2 = hVar2;
                                }
                            }
                        }
                        obj2 = hVar2;
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                    hVar = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = gVar.f3208f;
                    hVar = gVar.f3207e;
                    z.m0(obj3);
                }
                hVar.f3210a.c = AbstractC0139v.k(hVar.f3211b, 4, new f(hVar.c, hVar.f3212d, obj, null), 1);
                return hVar2;
            }
        }
        gVar = new g(this, dVar);
        Object obj32 = gVar.g;
        P1.a aVar2 = P1.a.f784b;
        i3 = gVar.f3209i;
        K1.h hVar22 = K1.h.f605a;
        if (i3 != 0) {
        }
        hVar.f3210a.c = AbstractC0139v.k(hVar.f3211b, 4, new f(hVar.c, hVar.f3212d, obj, null), 1);
        return hVar22;
    }
}
