package e2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0139v {

    /* renamed from: b, reason: collision with root package name */
    public static final d1.f f2823b;
    public static final d1.f c;

    /* renamed from: d, reason: collision with root package name */
    public static final d1.f f2824d;

    /* renamed from: e, reason: collision with root package name */
    public static final d1.f f2825e;

    /* renamed from: f, reason: collision with root package name */
    public static final d1.f f2826f;
    public static final d1.f g;
    public static final d1.f h;

    /* renamed from: a, reason: collision with root package name */
    public static final d1.f f2822a = new d1.f("RESUME_TOKEN", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final D f2827i = new D(false);

    /* renamed from: j, reason: collision with root package name */
    public static final D f2828j = new D(true);

    static {
        int i3 = 4;
        f2823b = new d1.f("REMOVED_TASK", i3);
        c = new d1.f("CLOSED_EMPTY", i3);
        int i4 = 4;
        f2824d = new d1.f("COMPLETING_ALREADY", i4);
        f2825e = new d1.f("COMPLETING_WAITING_CHILDREN", i4);
        f2826f = new d1.f("COMPLETING_RETRY", i4);
        g = new d1.f("TOO_LATE_TO_CANCEL", i4);
        h = new d1.f("SEALED", i4);
    }

    public static final j2.e a(O1.i iVar) {
        if (iVar.A(C0136s.c) == null) {
            iVar = iVar.o(b());
        }
        return new j2.e(iVar);
    }

    public static U b() {
        return new U(null);
    }

    public static final Object c(W1.p pVar, O1.d dVar) {
        j2.t tVar = new j2.t(dVar, dVar.j());
        return v0.f.N(tVar, tVar, pVar);
    }

    public static final Object d(long j3, O1.d dVar) {
        K1.h hVar = K1.h.f605a;
        if (j3 <= 0) {
            return hVar;
        }
        C0124f c0124f = new C0124f(1, v0.f.y(dVar));
        c0124f.r();
        if (j3 < Long.MAX_VALUE) {
            O1.g A3 = c0124f.f2802f.A(O1.e.f781b);
            InterfaceC0142y interfaceC0142y = A3 instanceof InterfaceC0142y ? (InterfaceC0142y) A3 : null;
            if (interfaceC0142y == null) {
                interfaceC0142y = AbstractC0141x.f2831a;
            }
            interfaceC0142y.G(j3, c0124f);
        }
        Object q3 = c0124f.q();
        return q3 == P1.a.f784b ? q3 : hVar;
    }

    public static final O1.i e(O1.i iVar, O1.i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0133o c0133o = C0133o.f2819e;
        boolean booleanValue = ((Boolean) iVar.D(bool, c0133o)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.D(bool, c0133o)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.o(iVar2);
        }
        O1.j jVar = O1.j.f782b;
        O1.i iVar3 = (O1.i) iVar.D(jVar, new C0133o(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.D(jVar, C0133o.f2818d);
        }
        return iVar3.o((O1.i) obj);
    }

    public static final String f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0124f g(O1.d dVar) {
        C0124f c0124f;
        C0124f c0124f2;
        if (!(dVar instanceof j2.h)) {
            return new C0124f(1, dVar);
        }
        j2.h hVar = (j2.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2.h.f3518i;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            d1.f fVar = j2.a.f3509d;
            c0124f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, fVar);
                c0124f2 = null;
                break;
            }
            if (obj instanceof C0124f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, fVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0124f2 = (C0124f) obj;
                break loop0;
            }
            if (obj != fVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0124f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0124f.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0124f2);
            if (!(obj2 instanceof C0130l) || ((C0130l) obj2).f2811d == null) {
                C0124f.g.set(c0124f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0124f2, C0120b.f2796b);
                c0124f = c0124f2;
            } else {
                c0124f2.o();
            }
            if (c0124f != null) {
                return c0124f;
            }
        }
        return new C0124f(2, dVar);
    }

    public static final void h(O1.i iVar, Throwable th) {
        try {
            f2.b bVar = (f2.b) iVar.A(C0136s.f2821b);
            if (bVar != null) {
                bVar.I(iVar, th);
            } else {
                j2.a.e(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                v0.f.h(runtimeException, th);
                th = runtimeException;
            }
            j2.a.e(iVar, th);
        }
    }

    public static /* synthetic */ C i(Q q3, boolean z3, V v3, int i3) {
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        return ((Z) q3).J(z3, (i3 & 2) != 0, v3);
    }

    public static final boolean j(int i3) {
        return i3 == 1 || i3 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [e2.f0, e2.a] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static f0 k(InterfaceC0137t interfaceC0137t, int i3, W1.p pVar, int i4) {
        O1.j jVar = O1.j.f782b;
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        O1.i e3 = e(interfaceC0137t.m(), jVar, true);
        l2.d dVar = B.f2767a;
        if (e3 != dVar && e3.A(O1.e.f781b) == null) {
            e3 = e3.o(dVar);
        }
        if (i3 == 0) {
            throw null;
        }
        ?? a0Var = i3 == 2 ? new a0(e3, pVar) : new AbstractC0119a(e3, true);
        a0Var.X(i3, a0Var, pVar);
        return a0Var;
    }

    public static final Object l(Object obj) {
        return obj instanceof C0131m ? m0.z.q(((C0131m) obj).f2814a) : obj;
    }

    public static final void m(A a3, O1.d dVar, boolean z3) {
        Object i3 = a3.i();
        Throwable e3 = a3.e(i3);
        Object q3 = e3 != null ? m0.z.q(e3) : a3.g(i3);
        if (!z3) {
            dVar.c(q3);
            return;
        }
        X1.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        j2.h hVar = (j2.h) dVar;
        O1.d dVar2 = hVar.f3520f;
        O1.i j3 = dVar2.j();
        Object n3 = j2.a.n(j3, hVar.h);
        j0 o3 = n3 != j2.a.f3511f ? o(dVar2, j3, n3) : null;
        try {
            dVar2.c(q3);
        } finally {
            if (o3 == null || o3.Y()) {
                j2.a.h(j3, n3);
            }
        }
    }

    public static final String n(O1.d dVar) {
        Object q3;
        if (dVar instanceof j2.h) {
            return dVar.toString();
        }
        try {
            q3 = dVar + '@' + f(dVar);
        } catch (Throwable th) {
            q3 = m0.z.q(th);
        }
        if (K1.e.a(q3) != null) {
            q3 = dVar.getClass().getName() + '@' + f(dVar);
        }
        return (String) q3;
    }

    public static final j0 o(O1.d dVar, O1.i iVar, Object obj) {
        j0 j0Var = null;
        if (!(dVar instanceof Q1.c)) {
            return null;
        }
        if (iVar.A(k0.f2808b) != null) {
            Q1.c cVar = (Q1.c) dVar;
            while (true) {
                if ((cVar instanceof C0143z) || (cVar = cVar.f()) == null) {
                    break;
                }
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.Z(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object p(f2.d dVar, W1.p pVar, O1.d dVar2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        M m3;
        O1.i j3 = dVar2.j();
        Boolean bool = Boolean.FALSE;
        dVar.getClass();
        O1.i o3 = !bool.booleanValue() ? j3.o(dVar) : e(j3, dVar, false);
        Q q3 = (Q) o3.A(C0136s.c);
        if (q3 != null && !q3.b()) {
            throw ((Z) q3).B();
        }
        if (o3 == j3) {
            j2.t tVar = new j2.t(dVar2, o3);
            return v0.f.N(tVar, tVar, pVar);
        }
        O1.e eVar = O1.e.f781b;
        if (X1.g.a(o3.A(eVar), j3.A(eVar))) {
            j0 j0Var = new j0(dVar2, o3);
            O1.i iVar = j0Var.f2794d;
            Object n3 = j2.a.n(iVar, null);
            try {
                return v0.f.N(j0Var, j0Var, pVar);
            } finally {
                j2.a.h(iVar, n3);
            }
        }
        j2.t tVar2 = new j2.t(dVar2, o3);
        u2.l.M(pVar, tVar2, tVar2);
        do {
            atomicIntegerFieldUpdater = C0143z.f2832f;
            int i3 = atomicIntegerFieldUpdater.get(tVar2);
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object F2 = tVar2.F();
                N n4 = F2 instanceof N ? (N) F2 : null;
                if (n4 != null && (m3 = n4.f2779a) != null) {
                    F2 = m3;
                }
                if (F2 instanceof C0131m) {
                    throw ((C0131m) F2).f2814a;
                }
                return F2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1));
        return P1.a.f784b;
    }
}
