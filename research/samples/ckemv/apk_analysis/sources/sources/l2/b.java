package l2;

import e2.AbstractC0139v;
import j2.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3914i = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3915j = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3916k = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: l, reason: collision with root package name */
    public static final d1.f f3917l = new d1.f("NOT_IN_STACK", 4);
    private volatile int _isTerminated;

    /* renamed from: b, reason: collision with root package name */
    public final int f3918b;
    public final int c;
    private volatile long controlState;

    /* renamed from: d, reason: collision with root package name */
    public final long f3919d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3920e;

    /* renamed from: f, reason: collision with root package name */
    public final e f3921f;
    public final e g;
    public final s h;
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r4v10, types: [j2.l, l2.e] */
    /* JADX WARN: Type inference failed for: r4v11, types: [j2.l, l2.e] */
    public b(int i3, int i4, long j3, String str) {
        this.f3918b = i3;
        this.c = i4;
        this.f3919d = j3;
        this.f3920e = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(X.d.g("Core pool size ", i3, " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should be greater than or equals to core pool size " + i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(X.d.g("Max pool size ", i4, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f3921f = new j2.l();
        this.g = new j2.l();
        this.h = new s((i3 + 1) * 2);
        this.controlState = i3 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void i(b bVar, Runnable runnable, boolean z3, int i3) {
        i iVar = k.g;
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        bVar.b(runnable, iVar, z3);
    }

    public final boolean A(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f3918b;
        if (i3 < i4) {
            int a3 = a();
            if (a3 == 1 && i4 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        d1.f fVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3914i;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c = aVar.c();
                while (true) {
                    fVar = f3917l;
                    if (c == fVar) {
                        i3 = -1;
                        break;
                    }
                    if (c == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c = aVar2.c();
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i3)) {
                    aVar.g(fVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f3908j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.h) {
            try {
                if (f3916k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3915j;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f3918b) {
                    return 0;
                }
                if (i3 >= this.c) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.h.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a aVar = new a(this, i5);
                this.h.c(i5, aVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i6 = i4 + 1;
                aVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z3) {
        h jVar;
        int i3;
        k.f3934f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f3927b = nanoTime;
            jVar.c = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z4 = false;
        boolean z5 = jVar.c.f3928a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3915j;
        long addAndGet = z5 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar == null || !X1.g.a(aVar.f3913i, this)) {
            aVar = null;
        }
        if (aVar != null && (i3 = aVar.f3910d) != 5 && (jVar.c.f3928a != 0 || i3 != 2)) {
            aVar.h = true;
            m mVar = aVar.f3909b;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f3936b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.c.f3928a == 1 ? this.g.a(jVar) : this.f3921f.a(jVar))) {
                throw new RejectedExecutionException(X.d.j(new StringBuilder(), this.f3920e, " was terminated"));
            }
        }
        if (z3 && aVar != null) {
            z4 = true;
        }
        if (z5) {
            if (z4 || D() || A(addAndGet)) {
                return;
            }
            D();
            return;
        }
        if (z4 || D() || A(atomicLongFieldUpdater.get(this))) {
            return;
        }
        D();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        int i3;
        h hVar;
        if (f3916k.compareAndSet(this, 0, 1)) {
            Thread currentThread = Thread.currentThread();
            a aVar = currentThread instanceof a ? (a) currentThread : null;
            if (aVar == null || !X1.g.a(aVar.f3913i, this)) {
                aVar = null;
            }
            synchronized (this.h) {
                i3 = (int) (f3915j.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object b3 = this.h.b(i4);
                    X1.g.b(b3);
                    a aVar2 = (a) b3;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f3909b;
                        e eVar = this.g;
                        mVar.getClass();
                        h hVar2 = (h) m.f3936b.getAndSet(mVar, null);
                        if (hVar2 != null) {
                            eVar.a(hVar2);
                        }
                        while (true) {
                            h b4 = mVar.b();
                            if (b4 == null) {
                                break;
                            } else {
                                eVar.a(b4);
                            }
                        }
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.g.b();
            this.f3921f.b();
            while (true) {
                if (aVar != null) {
                    hVar = aVar.a(true);
                }
                hVar = (h) this.f3921f.d();
                if (hVar == null && (hVar = (h) this.g.d()) == null) {
                    break;
                }
                try {
                    hVar.run();
                } catch (Throwable th) {
                    Thread currentThread2 = Thread.currentThread();
                    currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f3914i.set(this, 0L);
            f3915j.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, false, 6);
    }

    public final void o(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f3914i.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c = aVar.c();
                    while (true) {
                        if (c == f3917l) {
                            i5 = -1;
                            break;
                        }
                        if (c == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i5 = b3;
                            break;
                        }
                        c = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f3914i.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.h;
        int a3 = sVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) sVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f3909b;
                mVar.getClass();
                int i9 = m.f3936b.get(mVar) != null ? (m.c.get(mVar) - m.f3937d.get(mVar)) + 1 : m.c.get(mVar) - m.f3937d.get(mVar);
                int a4 = q.h.a(aVar.f3910d);
                if (a4 == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (a4 == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (a4 == 2) {
                    i5++;
                } else if (a4 == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (a4 == 4) {
                    i7++;
                }
            }
        }
        long j3 = f3915j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f3920e);
        sb4.append('@');
        sb4.append(AbstractC0139v.f(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f3918b;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.c);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f3921f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
