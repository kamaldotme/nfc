package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class Z implements Q, InterfaceC0129k, e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2793b = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z3) {
        this._state = z3 ? AbstractC0139v.f2828j : AbstractC0139v.f2827i;
    }

    public static C0128j N(j2.k kVar) {
        while (kVar.n()) {
            j2.k j3 = kVar.j();
            if (j3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2.k.c;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (j2.k) obj;
                    if (!kVar.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = j3;
            }
        }
        while (true) {
            kVar = kVar.m();
            if (!kVar.n()) {
                if (kVar instanceof C0128j) {
                    return (C0128j) kVar;
                }
                if (kVar instanceof b0) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof M ? ((M) obj).b() ? "Active" : "New" : obj instanceof C0131m ? "Cancelled" : "Completed";
        }
        X x2 = (X) obj;
        return x2.e() ? "Cancelling" : x2.f() ? "Completing" : "Active";
    }

    @Override // O1.i
    public final O1.g A(O1.h hVar) {
        return u2.d.l(this, hVar);
    }

    public final CancellationException B() {
        CancellationException cancellationException;
        Object F2 = F();
        if (!(F2 instanceof X)) {
            if (F2 instanceof M) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(F2 instanceof C0131m)) {
                return new S(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0131m) F2).f2814a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new S(v(), th, this) : cancellationException;
        }
        Throwable d3 = ((X) F2).d();
        if (d3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = d3 instanceof CancellationException ? (CancellationException) d3 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = v();
        }
        return new S(concat, d3, this);
    }

    public boolean C() {
        return true;
    }

    @Override // O1.i
    public final Object D(Object obj, W1.p pVar) {
        return pVar.e(obj, this);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [j2.k, e2.b0] */
    public final b0 E(M m3) {
        b0 c3 = m3.c();
        if (c3 != null) {
            return c3;
        }
        if (m3 instanceof D) {
            return new j2.k();
        }
        if (m3 instanceof V) {
            R((V) m3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + m3).toString());
    }

    public final Object F() {
        while (true) {
            Object obj = f2793b.get(this);
            if (!(obj instanceof j2.q)) {
                return obj;
            }
            ((j2.q) obj).a(this);
        }
    }

    public boolean G(Throwable th) {
        return false;
    }

    public void H(K1.b bVar) {
        throw bVar;
    }

    public final void I(Q q3) {
        int S2;
        c0 c0Var = c0.f2798b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (q3 == null) {
            atomicReferenceFieldUpdater.set(this, c0Var);
            return;
        }
        Z z3 = (Z) q3;
        do {
            S2 = z3.S(z3.F());
            if (S2 == 0) {
                break;
            }
        } while (S2 != 1);
        InterfaceC0127i interfaceC0127i = (InterfaceC0127i) AbstractC0139v.i(z3, true, new C0128j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0127i);
        if (!(F() instanceof M)) {
            interfaceC0127i.f();
            atomicReferenceFieldUpdater.set(this, c0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [j2.k, e2.b0] */
    public final C J(boolean z3, boolean z4, W1.l lVar) {
        V v3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if (z3) {
            v3 = lVar instanceof T ? (T) lVar : null;
            if (v3 == null) {
                v3 = new O(lVar);
            }
        } else {
            v3 = lVar instanceof V ? (V) lVar : null;
            if (v3 == null) {
                v3 = new P(0, lVar);
            }
        }
        v3.f2784e = this;
        while (true) {
            Object F2 = F();
            if (F2 instanceof D) {
                D d3 = (D) F2;
                if (d3.f2769b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2793b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, F2, v3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != F2) {
                            break;
                        }
                    }
                    return v3;
                }
                ?? kVar = new j2.k();
                L l3 = d3.f2769b ? kVar : new L(kVar);
                do {
                    atomicReferenceFieldUpdater = f2793b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, d3, l3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == d3);
            } else {
                if (!(F2 instanceof M)) {
                    if (z4) {
                        C0131m c0131m = F2 instanceof C0131m ? (C0131m) F2 : null;
                        lVar.h(c0131m != null ? c0131m.f2814a : null);
                    }
                    return c0.f2798b;
                }
                b0 c3 = ((M) F2).c();
                if (c3 == null) {
                    X1.g.c(F2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    R((V) F2);
                } else {
                    C c4 = c0.f2798b;
                    if (z3 && (F2 instanceof X)) {
                        synchronized (F2) {
                            try {
                                th = ((X) F2).d();
                                if (th != null) {
                                    if ((lVar instanceof C0128j) && !((X) F2).f()) {
                                    }
                                }
                                if (p((M) F2, c3, v3)) {
                                    if (th == null) {
                                        return v3;
                                    }
                                    c4 = v3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            lVar.h(th);
                        }
                        return c4;
                    }
                    if (p((M) F2, c3, v3)) {
                        return v3;
                    }
                }
            }
        }
    }

    public boolean K() {
        return false;
    }

    public final Object L(Object obj) {
        Object U2;
        do {
            U2 = U(F(), obj);
            if (U2 == AbstractC0139v.f2824d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0131m c0131m = obj instanceof C0131m ? (C0131m) obj : null;
                throw new IllegalStateException(str, c0131m != null ? c0131m.f2814a : null);
            }
        } while (U2 == AbstractC0139v.f2826f);
        return U2;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, K1.b] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [e2.Z, java.lang.Object] */
    public final void O(b0 b0Var, Throwable th) {
        Object l3 = b0Var.l();
        X1.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        j2.k kVar = (j2.k) l3;
        ?? r12 = 0;
        while (!X1.g.a(kVar, b0Var)) {
            if (kVar instanceof T) {
                V v3 = (V) kVar;
                try {
                    v3.p(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        v0.f.h(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + v3 + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.m();
            r12 = r12;
        }
        if (r12 != 0) {
            H(r12);
        }
        u(th);
    }

    public void P(Object obj) {
    }

    public void Q() {
    }

    public final void R(V v3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        j2.k kVar = new j2.k();
        v3.getClass();
        j2.k.c.lazySet(kVar, v3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j2.k.f3525b;
        atomicReferenceFieldUpdater2.lazySet(kVar, v3);
        loop0: while (true) {
            if (v3.l() != v3) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(v3, v3, kVar)) {
                if (atomicReferenceFieldUpdater2.get(v3) != v3) {
                    break;
                }
            }
            kVar.k(v3);
        }
        j2.k m3 = v3.m();
        do {
            atomicReferenceFieldUpdater = f2793b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, v3, m3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == v3);
    }

    public final int S(Object obj) {
        boolean z3 = obj instanceof D;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2793b;
        if (z3) {
            if (((D) obj).f2769b) {
                return 0;
            }
            D d3 = AbstractC0139v.f2828j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Q();
            return 1;
        }
        if (!(obj instanceof L)) {
            return 0;
        }
        b0 b0Var = ((L) obj).f2778b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Q();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c1, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (e2.AbstractC0139v.i(r2.f2806f, false, new e2.W(r6, r1, r2, r8), 1) == e2.c0.f2798b) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        r2 = N(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        if (r2 != null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return e2.AbstractC0139v.f2825e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e0, code lost:
    
        return z(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof M)) {
            return AbstractC0139v.f2824d;
        }
        if (((obj instanceof D) || (obj instanceof V)) && !(obj instanceof C0128j) && !(obj2 instanceof C0131m)) {
            M m3 = (M) obj;
            Object n3 = obj2 instanceof M ? new N((M) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f2793b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, m3, n3)) {
                    P(obj2);
                    x(m3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == m3);
            return AbstractC0139v.f2826f;
        }
        M m4 = (M) obj;
        b0 E2 = E(m4);
        if (E2 == null) {
            return AbstractC0139v.f2826f;
        }
        C0128j c0128j = null;
        X x2 = m4 instanceof X ? (X) m4 : null;
        if (x2 == null) {
            x2 = new X(E2, null);
        }
        synchronized (x2) {
            if (x2.f()) {
                return AbstractC0139v.f2824d;
            }
            X.c.set(x2, 1);
            if (x2 != m4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2793b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, m4, x2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != m4) {
                        return AbstractC0139v.f2826f;
                    }
                }
            }
            boolean e3 = x2.e();
            C0131m c0131m = obj2 instanceof C0131m ? (C0131m) obj2 : null;
            if (c0131m != null) {
                x2.a(c0131m.f2814a);
            }
            Throwable d3 = x2.d();
            if (!(!e3)) {
                d3 = null;
            }
            if (d3 != null) {
                O(E2, d3);
            }
            C0128j c0128j2 = m4 instanceof C0128j ? (C0128j) m4 : null;
            if (c0128j2 == null) {
                b0 c3 = m4.c();
                if (c3 != null) {
                    c0128j = N(c3);
                }
            } else {
                c0128j = c0128j2;
            }
        }
    }

    @Override // e2.Q
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new S(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // e2.Q
    public boolean b() {
        Object F2 = F();
        return (F2 instanceof M) && ((M) F2).b();
    }

    @Override // O1.g
    public final O1.h getKey() {
        return C0136s.c;
    }

    @Override // O1.i
    public final O1.i i(O1.h hVar) {
        return u2.d.t(this, hVar);
    }

    @Override // O1.i
    public final O1.i o(O1.i iVar) {
        return u2.d.x(this, iVar);
    }

    public final boolean p(M m3, b0 b0Var, V v3) {
        char c3;
        Y y3 = new Y(v3, this, m3);
        do {
            j2.k j3 = b0Var.j();
            if (j3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2.k.c;
                Object obj = atomicReferenceFieldUpdater.get(b0Var);
                while (true) {
                    j3 = (j2.k) obj;
                    if (!j3.n()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(j3);
                }
            }
            j2.k.c.lazySet(v3, j3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j2.k.f3525b;
            atomicReferenceFieldUpdater2.lazySet(v3, b0Var);
            y3.c = b0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(j3, b0Var, y3)) {
                    c3 = y3.a(j3) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(j3) != b0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void q(Object obj) {
    }

    public void r(Object obj) {
        q(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r0 = e2.AbstractC0139v.f2824d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r0 != e2.AbstractC0139v.f2825e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r0 = U(r0, new e2.C0131m(y(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r0 == e2.AbstractC0139v.f2826f) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r0 != e2.AbstractC0139v.f2824d) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r4 = F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if ((r4 instanceof e2.X) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if ((r4 instanceof e2.M) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        r1 = y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        r5 = (e2.M) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0006, code lost:
    
        if ((r9 instanceof e2.U) != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r5.b() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r5 = U(r4, new e2.C0131m(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r5 == e2.AbstractC0139v.f2824d) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r5 == e2.AbstractC0139v.f2826f) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r0 = F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        r6 = E(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
    
        if (r6 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r7 = new e2.X(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ac, code lost:
    
        r4 = e2.Z.f2793b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if ((r0 instanceof e2.M) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00be, code lost:
    
        if (r4.get(r9) == r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b4, code lost:
    
        O(r6, r1);
        r10 = e2.AbstractC0139v.f2824d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0059, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        r10 = e2.AbstractC0139v.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0045, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0046, code lost:
    
        r5 = (e2.X) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0054, code lost:
    
        if (e2.X.f2788e.get(r5) != e2.AbstractC0139v.h) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0056, code lost:
    
        r10 = e2.AbstractC0139v.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0058, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005c, code lost:
    
        r5 = ((e2.X) r4).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0063, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0065, code lost:
    
        r1 = y(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if ((r0 instanceof e2.X) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006c, code lost:
    
        ((e2.X) r4).a(r1);
        r10 = ((e2.X) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007b, code lost:
    
        if ((!r5) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x007d, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x007e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007f, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0081, code lost:
    
        O(((e2.X) r4).f2789b, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0088, code lost:
    
        r10 = e2.AbstractC0139v.f2824d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x006a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008c, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f3, code lost:
    
        if (r0 != e2.AbstractC0139v.f2824d) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0105, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f9, code lost:
    
        if (r0 != e2.AbstractC0139v.f2825e) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        if (r0 != e2.AbstractC0139v.g) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0101, code lost:
    
        q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (((e2.X) r0).f() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Object obj) {
        Object obj2 = AbstractC0139v.f2824d;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(M() + '{' + T(F()) + '}');
        sb.append('@');
        sb.append(AbstractC0139v.f(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (K()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0127i interfaceC0127i = (InterfaceC0127i) c.get(this);
        return (interfaceC0127i == null || interfaceC0127i == c0.f2798b) ? z3 : interfaceC0127i.i(th) || z3;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [K1.b, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, K1.b] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [e2.Z, java.lang.Object] */
    public final void x(M m3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        InterfaceC0127i interfaceC0127i = (InterfaceC0127i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0127i != null) {
            interfaceC0127i.f();
            atomicReferenceFieldUpdater.set(this, c0.f2798b);
        }
        ?? r12 = 0;
        C0131m c0131m = obj instanceof C0131m ? (C0131m) obj : null;
        Throwable th = c0131m != null ? c0131m.f2814a : null;
        if (m3 instanceof V) {
            try {
                ((V) m3).p(th);
                return;
            } catch (Throwable th2) {
                H(new RuntimeException("Exception in completion handler " + m3 + " for " + ((Object) this), th2));
                return;
            }
        }
        b0 c3 = m3.c();
        if (c3 != null) {
            Object l3 = c3.l();
            X1.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            j2.k kVar = (j2.k) l3;
            while (!X1.g.a(kVar, c3)) {
                if (kVar instanceof V) {
                    V v3 = (V) kVar;
                    try {
                        v3.p(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            v0.f.h(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + v3 + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.m();
                r12 = r12;
            }
            if (r12 != 0) {
                H(r12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable y(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z3 = (Z) ((e0) obj);
        Object F2 = z3.F();
        if (F2 instanceof X) {
            cancellationException = ((X) F2).d();
        } else if (F2 instanceof C0131m) {
            cancellationException = ((C0131m) F2).f2814a;
        } else {
            if (F2 instanceof M) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + F2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new S("Parent job is ".concat(T(F2)), cancellationException, z3);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(X x2, Object obj) {
        Throwable th = null;
        C0131m c0131m = obj instanceof C0131m ? (C0131m) obj : null;
        Throwable th2 = c0131m != null ? c0131m.f2814a : null;
        synchronized (x2) {
            x2.e();
            ArrayList<Throwable> g = x2.g(th2);
            if (!g.isEmpty()) {
                Iterator it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) g.get(0);
                }
            } else if (x2.e()) {
                th = new S(v(), null, this);
            }
            if (th != null && g.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                for (Throwable th3 : g) {
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        v0.f.h(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0131m(th, false);
        }
        if (th != null && (u(th) || G(th))) {
            X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0131m.f2813b.compareAndSet((C0131m) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2793b;
        Object n3 = obj instanceof M ? new N((M) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x2, n3) && atomicReferenceFieldUpdater.get(this) == x2) {
        }
        x(x2, obj);
        return obj;
    }
}
