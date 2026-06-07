package g2;

import e2.AbstractC0139v;
import e2.C0124f;
import e2.l0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.z;

/* loaded from: classes.dex */
public final class a implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f3038b = f.f3065p;
    public C0124f c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3039d;

    public a(d dVar) {
        this.f3039d = dVar;
    }

    @Override // e2.l0
    public final void a(j2.u uVar, int i3) {
        C0124f c0124f = this.c;
        if (c0124f != null) {
            c0124f.a(uVar, i3);
        }
    }

    public final Object b(h2.h hVar) {
        C0124f c0124f;
        Boolean bool;
        j2.p pVar;
        int i3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f3047i;
        d dVar = this.f3039d;
        l lVar = (l) atomicReferenceFieldUpdater.get(dVar);
        while (true) {
            dVar.getClass();
            if (dVar.v(d.f3044d.get(dVar), true)) {
                this.f3038b = f.f3061l;
                Throwable r3 = dVar.r();
                if (r3 == null) {
                    return Boolean.FALSE;
                }
                int i4 = j2.v.f3541a;
                throw r3;
            }
            long andIncrement = d.f3045e.getAndIncrement(dVar);
            long j3 = f.f3054b;
            long j4 = andIncrement / j3;
            int i5 = (int) (andIncrement % j3);
            if (lVar.f3540d != j4) {
                l q3 = dVar.q(j4, lVar);
                if (q3 == null) {
                    continue;
                } else {
                    lVar = q3;
                }
            }
            Object F2 = dVar.F(lVar, i5, andIncrement, null);
            d1.f fVar = f.f3062m;
            if (F2 == fVar) {
                throw new IllegalStateException("unreachable".toString());
            }
            d1.f fVar2 = f.f3064o;
            if (F2 != fVar2) {
                if (F2 != f.f3063n) {
                    lVar.a();
                    this.f3038b = F2;
                    return Boolean.TRUE;
                }
                d dVar2 = this.f3039d;
                C0124f g = AbstractC0139v.g(v0.f.y(hVar));
                try {
                    this.c = g;
                    c0124f = g;
                } catch (Throwable th) {
                    th = th;
                    c0124f = g;
                }
                try {
                    Object F3 = dVar2.F(lVar, i5, andIncrement, this);
                    if (F3 == fVar) {
                        a(lVar, i5);
                    } else {
                        O1.i iVar = c0124f.f2802f;
                        W1.l lVar2 = dVar2.c;
                        if (F3 == fVar2) {
                            if (andIncrement < dVar2.t()) {
                                lVar.a();
                            }
                            l lVar3 = (l) d.f3047i.get(dVar2);
                            while (true) {
                                if (dVar2.v(d.f3044d.get(dVar2), true)) {
                                    C0124f c0124f2 = this.c;
                                    X1.g.b(c0124f2);
                                    this.c = null;
                                    this.f3038b = f.f3061l;
                                    Throwable r4 = dVar.r();
                                    if (r4 == null) {
                                        c0124f2.c(Boolean.FALSE);
                                    } else {
                                        c0124f2.c(z.q(r4));
                                    }
                                } else {
                                    long andIncrement2 = d.f3045e.getAndIncrement(dVar2);
                                    long j5 = f.f3054b;
                                    long j6 = andIncrement2 / j5;
                                    int i6 = (int) (andIncrement2 % j5);
                                    if (lVar3.f3540d != j6) {
                                        l q4 = dVar2.q(j6, lVar3);
                                        if (q4 != null) {
                                            lVar3 = q4;
                                        }
                                    }
                                    W1.l lVar4 = lVar2;
                                    Object F4 = dVar2.F(lVar3, i6, andIncrement2, this);
                                    if (F4 == f.f3062m) {
                                        a(lVar3, i6);
                                        break;
                                    }
                                    if (F4 == f.f3064o) {
                                        if (andIncrement2 < dVar2.t()) {
                                            lVar3.a();
                                        }
                                        lVar2 = lVar4;
                                    } else {
                                        if (F4 == f.f3063n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        lVar3.a();
                                        this.f3038b = F4;
                                        this.c = null;
                                        bool = Boolean.TRUE;
                                        pVar = lVar4 != null ? new j2.p(lVar4, F4, iVar) : null;
                                        i3 = c0124f.f2766d;
                                    }
                                }
                            }
                        } else {
                            lVar.a();
                            this.f3038b = F3;
                            this.c = null;
                            bool = Boolean.TRUE;
                            pVar = lVar2 != null ? new j2.p(lVar2, F3, iVar) : null;
                            i3 = c0124f.f2766d;
                        }
                        c0124f.y(bool, i3, pVar);
                    }
                    return c0124f.q();
                } catch (Throwable th2) {
                    th = th2;
                    c0124f.x();
                    throw th;
                }
            }
            if (andIncrement < dVar.t()) {
                lVar.a();
            }
        }
    }
}
