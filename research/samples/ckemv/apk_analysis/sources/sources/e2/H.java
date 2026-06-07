package e2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class H extends I implements InterfaceC0142y {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_delayed");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2773i = AtomicIntegerFieldUpdater.newUpdater(H.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // e2.InterfaceC0142y
    public final void G(long j3, C0124f c0124f) {
        long j4 = j3 > 0 ? j3 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j3 : 0L;
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            E e3 = new E(this, j4 + nanoTime, c0124f);
            X(nanoTime, e3);
            c0124f.t(new C0122d(1, e3));
        }
    }

    @Override // e2.r
    public final void I(O1.i iVar, Runnable runnable) {
        T(runnable);
    }

    @Override // e2.I
    public void S() {
        F b3;
        ThreadLocal threadLocal = h0.f2804a;
        h0.f2804a.set(null);
        f2773i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            d1.f fVar = AbstractC0139v.c;
            if (obj != null) {
                if (!(obj instanceof j2.n)) {
                    if (obj != fVar) {
                        j2.n nVar = new j2.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((j2.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        do {
        } while (W() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            G g3 = (G) h.get(this);
            if (g3 == null) {
                return;
            }
            synchronized (g3) {
                b3 = j2.y.f3546b.get(g3) > 0 ? g3.b(0) : null;
            }
            if (b3 == null) {
                return;
            } else {
                R(nanoTime, b3);
            }
        }
    }

    public void T(Runnable runnable) {
        if (!U(runnable)) {
            RunnableC0140w.f2829j.T(runnable);
            return;
        }
        Thread N2 = N();
        if (Thread.currentThread() != N2) {
            LockSupport.unpark(N2);
        }
    }

    public final boolean U(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f2773i.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof j2.n)) {
                if (obj == AbstractC0139v.c) {
                    return false;
                }
                j2.n nVar = new j2.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            j2.n nVar2 = (j2.n) obj;
            int a3 = nVar2.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                j2.n c = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final boolean V() {
        L1.i iVar = this.f2776f;
        if (!(iVar != null ? iVar.isEmpty() : true)) {
            return false;
        }
        G g3 = (G) h.get(this);
        if (g3 != null && j2.y.f3546b.get(g3) != 0) {
            return false;
        }
        Object obj = g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof j2.n) {
            long j3 = j2.n.f3530f.get((j2.n) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0139v.c) {
            return true;
        }
        return false;
    }

    public final long W() {
        Runnable runnable;
        F f3;
        F b3;
        if (Q()) {
            return 0L;
        }
        G g3 = (G) h.get(this);
        if (g3 != null && j2.y.f3546b.get(g3) != 0) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (g3) {
                    F[] fArr = g3.f3547a;
                    F f4 = fArr != null ? fArr[0] : null;
                    b3 = f4 == null ? null : (nanoTime - f4.f2772b < 0 || !U(f4)) ? null : g3.b(0);
                }
            } while (b3 != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            }
            if (!(obj instanceof j2.n)) {
                if (obj == AbstractC0139v.c) {
                    break;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop1;
            }
            j2.n nVar = (j2.n) obj;
            Object d3 = nVar.d();
            if (d3 != j2.n.g) {
                runnable = (Runnable) d3;
                break;
            }
            j2.n c = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        runnable = null;
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        L1.i iVar = this.f2776f;
        if (((iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = g.get(this);
        if (obj2 != null) {
            if (!(obj2 instanceof j2.n)) {
                if (obj2 != AbstractC0139v.c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
            long j3 = j2.n.f3530f.get((j2.n) obj2);
            if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        G g4 = (G) h.get(this);
        if (g4 != null) {
            synchronized (g4) {
                F[] fArr2 = g4.f3547a;
                f3 = fArr2 != null ? fArr2[0] : null;
            }
            if (f3 != null) {
                long nanoTime2 = f3.f2772b - System.nanoTime();
                if (nanoTime2 < 0) {
                    return 0L;
                }
                return nanoTime2;
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [e2.G, java.lang.Object] */
    public final void X(long j3, F f3) {
        int b3;
        Thread N2;
        boolean z3 = f2773i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        if (z3) {
            b3 = 1;
        } else {
            G g3 = (G) atomicReferenceFieldUpdater.get(this);
            if (g3 == null) {
                ?? obj = new Object();
                obj.c = j3;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                X1.g.b(obj2);
                g3 = (G) obj2;
            }
            b3 = f3.b(j3, g3, this);
        }
        if (b3 != 0) {
            if (b3 == 1) {
                R(j3, f3);
                return;
            } else {
                if (b3 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        G g4 = (G) atomicReferenceFieldUpdater.get(this);
        if (g4 != null) {
            synchronized (g4) {
                F[] fArr = g4.f3547a;
                r4 = fArr != null ? fArr[0] : null;
            }
        }
        if (r4 != f3 || Thread.currentThread() == (N2 = N())) {
            return;
        }
        LockSupport.unpark(N2);
    }
}
