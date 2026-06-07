package e2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124f extends A implements InterfaceC0123e, Q1.c, l0 {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(C0124f.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0124f.class, Object.class, "_state");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2800i = AtomicReferenceFieldUpdater.newUpdater(C0124f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public final O1.d f2801e;

    /* renamed from: f, reason: collision with root package name */
    public final O1.i f2802f;

    public C0124f(int i3, O1.d dVar) {
        super(i3);
        this.f2801e = dVar;
        this.f2802f = dVar.j();
        this._decisionAndIndex = 536870911;
        this._state = C0120b.f2796b;
    }

    public static Object A(d0 d0Var, Object obj, int i3, W1.l lVar) {
        if ((obj instanceof C0131m) || !AbstractC0139v.j(i3)) {
            return obj;
        }
        if (lVar != null || (d0Var instanceof C0122d)) {
            return new C0130l(obj, d0Var instanceof C0122d ? (C0122d) d0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @Override // e2.l0
    public final void a(j2.u uVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = g;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        u(uVar);
    }

    @Override // e2.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C0131m) {
                return;
            }
            if (!(obj2 instanceof C0130l)) {
                C0130l c0130l = new C0130l(obj2, (C0122d) null, (W1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0130l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0130l c0130l2 = (C0130l) obj2;
            if (!(!(c0130l2.f2812e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            C0130l a3 = C0130l.a(c0130l2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            C0122d c0122d = c0130l2.f2810b;
            if (c0122d != null) {
                k(c0122d, cancellationException);
            }
            W1.l lVar = c0130l2.c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // O1.d
    public final void c(Object obj) {
        Throwable a3 = K1.e.a(obj);
        if (a3 != null) {
            obj = new C0131m(a3, false);
        }
        y(obj, this.f2766d, null);
    }

    @Override // e2.A
    public final O1.d d() {
        return this.f2801e;
    }

    @Override // e2.A
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // Q1.c
    public final Q1.c f() {
        O1.d dVar = this.f2801e;
        if (dVar instanceof Q1.c) {
            return (Q1.c) dVar;
        }
        return null;
    }

    @Override // e2.A
    public final Object g(Object obj) {
        return obj instanceof C0130l ? ((C0130l) obj).f2809a : obj;
    }

    @Override // e2.A
    public final Object i() {
        return h.get(this);
    }

    @Override // O1.d
    public final O1.i j() {
        return this.f2802f;
    }

    public final void k(C0122d c0122d, Throwable th) {
        try {
            c0122d.b(th);
        } catch (Throwable th2) {
            AbstractC0139v.h(this.f2802f, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(W1.l lVar, Throwable th) {
        try {
            lVar.h(th);
        } catch (Throwable th2) {
            AbstractC0139v.h(this.f2802f, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(j2.u uVar, Throwable th) {
        O1.i iVar = this.f2802f;
        int i3 = g.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            uVar.g(i3, iVar);
        } catch (Throwable th2) {
            AbstractC0139v.h(iVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof d0) {
                C0125g c0125g = new C0125g(this, th, (obj instanceof C0122d) || (obj instanceof j2.u));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0125g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                d0 d0Var = (d0) obj;
                if (d0Var instanceof C0122d) {
                    k((C0122d) obj, th);
                } else if (d0Var instanceof j2.u) {
                    m((j2.u) obj, th);
                }
                if (!v()) {
                    o();
                }
                p(this.f2766d);
                return;
            }
            return;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2800i;
        C c = (C) atomicReferenceFieldUpdater.get(this);
        if (c == null) {
            return;
        }
        c.f();
        atomicReferenceFieldUpdater.set(this, c0.f2798b);
    }

    public final void p(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = g;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z3 = i3 == 4;
                O1.d dVar = this.f2801e;
                if (z3 || !(dVar instanceof j2.h) || AbstractC0139v.j(i3) != AbstractC0139v.j(this.f2766d)) {
                    AbstractC0139v.m(this, dVar, z3);
                    return;
                }
                r rVar = ((j2.h) dVar).f3519e;
                O1.i j3 = ((j2.h) dVar).f3520f.j();
                if (rVar.K()) {
                    rVar.I(j3, this);
                    return;
                }
                I a3 = h0.a();
                if (a3.P()) {
                    a3.M(this);
                    return;
                }
                a3.O(true);
                try {
                    AbstractC0139v.m(this, dVar, true);
                    do {
                    } while (a3.Q());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean v3 = v();
        do {
            atomicIntegerFieldUpdater = g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (v3) {
                    x();
                }
                Object obj = h.get(this);
                if (obj instanceof C0131m) {
                    throw ((C0131m) obj).f2814a;
                }
                if (AbstractC0139v.j(this.f2766d)) {
                    Q q3 = (Q) this.f2802f.A(C0136s.c);
                    if (q3 != null && !q3.b()) {
                        CancellationException B3 = ((Z) q3).B();
                        b(obj, B3);
                        throw B3;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((C) f2800i.get(this)) == null) {
            s();
        }
        if (v3) {
            x();
        }
        return P1.a.f784b;
    }

    public final void r() {
        C s3 = s();
        if (s3 != null && (!(h.get(this) instanceof d0))) {
            s3.f();
            f2800i.set(this, c0.f2798b);
        }
    }

    public final C s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Q q3 = (Q) this.f2802f.A(C0136s.c);
        if (q3 == null) {
            return null;
        }
        C i3 = AbstractC0139v.i(q3, true, new C0126h(this), 2);
        do {
            atomicReferenceFieldUpdater = f2800i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, i3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return i3;
    }

    public final void t(W1.l lVar) {
        u(lVar instanceof C0122d ? (C0122d) lVar : new C0122d(2, lVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0139v.n(this.f2801e));
        sb.append("){");
        Object obj = h.get(this);
        sb.append(obj instanceof d0 ? "Active" : obj instanceof C0125g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0139v.f(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        w(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bd, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0120b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            if ((obj2 instanceof C0122d) || (obj2 instanceof j2.u)) {
                break;
            }
            if (obj2 instanceof C0131m) {
                C0131m c0131m = (C0131m) obj2;
                c0131m.getClass();
                if (!C0131m.f2813b.compareAndSet(c0131m, 0, 1)) {
                    w(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof C0125g) {
                    if (!(obj2 instanceof C0131m)) {
                        c0131m = null;
                    }
                    Throwable th = c0131m != null ? c0131m.f2814a : null;
                    if (obj instanceof C0122d) {
                        k((C0122d) obj, th);
                        return;
                    } else {
                        X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((j2.u) obj, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj2 instanceof C0130l)) {
                if (obj instanceof j2.u) {
                    return;
                }
                X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0130l c0130l = new C0130l(obj2, (C0122d) obj, (W1.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0130l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0130l c0130l2 = (C0130l) obj2;
            if (c0130l2.f2810b != null) {
                w(obj, obj2);
                throw null;
            }
            if (obj instanceof j2.u) {
                return;
            }
            X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C0122d c0122d = (C0122d) obj;
            Throwable th2 = c0130l2.f2812e;
            if (th2 != null) {
                k(c0122d, th2);
                return;
            }
            C0130l a3 = C0130l.a(c0130l2, c0122d, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.f2766d == 2) {
            O1.d dVar = this.f2801e;
            X1.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (j2.h.f3518i.get((j2.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void x() {
        O1.d dVar = this.f2801e;
        Throwable th = null;
        j2.h hVar = dVar instanceof j2.h ? (j2.h) dVar : null;
        if (hVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2.h.f3518i;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            d1.f fVar = j2.a.f3509d;
            if (obj != fVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                    break;
                }
            }
        }
        if (th == null) {
            return;
        }
        o();
        n(th);
    }

    public final void y(Object obj, int i3, W1.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d0) {
                Object A3 = A((d0) obj2, obj, i3, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, A3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    o();
                }
                p(i3);
                return;
            }
            if (obj2 instanceof C0125g) {
                C0125g c0125g = (C0125g) obj2;
                c0125g.getClass();
                if (C0125g.c.compareAndSet(c0125g, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, c0125g.f2814a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void z(r rVar) {
        K1.h hVar = K1.h.f605a;
        O1.d dVar = this.f2801e;
        j2.h hVar2 = dVar instanceof j2.h ? (j2.h) dVar : null;
        y(hVar, (hVar2 != null ? hVar2.f3519e : null) == rVar ? 4 : this.f2766d, null);
    }
}
