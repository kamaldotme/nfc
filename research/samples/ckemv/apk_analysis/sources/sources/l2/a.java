package l2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3908j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: b, reason: collision with root package name */
    public final m f3909b;
    public final X1.j c;

    /* renamed from: d, reason: collision with root package name */
    public int f3910d;

    /* renamed from: e, reason: collision with root package name */
    public long f3911e;

    /* renamed from: f, reason: collision with root package name */
    public long f3912f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f3913i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i3) {
        this.f3913i = bVar;
        setDaemon(true);
        this.f3909b = new m();
        this.c = new X1.j(0);
        this.f3910d = 4;
        this.nextParkedWorker = b.f3917l;
        Y1.e.f1147b.getClass();
        this.g = Y1.e.c.b();
        f(i3);
    }

    public final h a(boolean z3) {
        h e3;
        h e4;
        b bVar;
        long j3;
        int i3 = this.f3910d;
        h hVar = null;
        m mVar = this.f3909b;
        b bVar2 = this.f3913i;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f3915j;
            do {
                bVar = this.f3913i;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3936b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 == null || hVar2.c.f3928a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                break;
                            }
                        }
                        hVar = hVar2;
                    }
                    int i4 = m.f3937d.get(mVar);
                    int i5 = m.c.get(mVar);
                    while (true) {
                        if (i4 == i5 || m.f3938e.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        h c = mVar.c(i5, true);
                        if (c != null) {
                            hVar = c;
                            break;
                        }
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.g.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f3915j.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f3910d = 1;
        }
        if (z3) {
            boolean z4 = d(bVar2.f3918b * 2) == 0;
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            h hVar4 = (h) m.f3936b.getAndSet(mVar, null);
            if (hVar4 == null) {
                hVar4 = mVar.b();
            }
            if (hVar4 != null) {
                return hVar4;
            }
            if (!z4 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            h e5 = e();
            if (e5 != null) {
                return e5;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i4 = this.g;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.g = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int d3 = d(2);
        b bVar = this.f3913i;
        if (d3 == 0) {
            h hVar = (h) bVar.f3921f.d();
            return hVar != null ? hVar : (h) bVar.g.d();
        }
        h hVar2 = (h) bVar.g.d();
        return hVar2 != null ? hVar2 : (h) bVar.f3921f.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3913i.f3920e);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i4 = this.f3910d;
        boolean z3 = i4 == 1;
        if (z3) {
            b.f3915j.addAndGet(this.f3913i, 4398046511104L);
        }
        if (i4 != i3) {
            this.f3910d = i3;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h i(int i3) {
        int i4;
        h hVar;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f3915j;
        b bVar = this.f3913i;
        int i5 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i5 < 2) {
            return null;
        }
        int d3 = d(i5);
        int i6 = 0;
        long j4 = Long.MAX_VALUE;
        while (i6 < i5) {
            int i7 = d3 + 1;
            if (i7 > i5) {
                i7 = 1;
            }
            a aVar = (a) bVar.h.b(i7);
            if (aVar == null || aVar == this) {
                i4 = i7;
            } else {
                m mVar = aVar.f3909b;
                if (i3 == 3) {
                    hVar = mVar.b();
                } else {
                    mVar.getClass();
                    int i8 = m.f3937d.get(mVar);
                    int i9 = m.c.get(mVar);
                    boolean z3 = i3 == 1;
                    while (i8 != i9 && (!z3 || m.f3938e.get(mVar) != 0)) {
                        int i10 = i8 + 1;
                        hVar = mVar.c(i8, z3);
                        if (hVar != null) {
                            break;
                        }
                        i8 = i10;
                    }
                    hVar = hVar2;
                }
                X1.j jVar = this.c;
                if (hVar == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f3936b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar3 == null) {
                            break;
                        }
                        if (((hVar3.c.f3928a == 1 ? 1 : 2) & i3) == 0) {
                            break;
                        }
                        k.f3934f.getClass();
                        i4 = i7;
                        long nanoTime = System.nanoTime() - hVar3.f3927b;
                        long j5 = k.f3931b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            hVar2 = null;
                            break;
                        }
                        do {
                            hVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, hVar3, null)) {
                                jVar.c = hVar3;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == hVar3);
                        i7 = i4;
                        hVar2 = null;
                    }
                } else {
                    jVar.c = hVar;
                    i4 = i7;
                }
                j3 = -1;
                if (j3 == -1) {
                    h hVar4 = (h) jVar.c;
                    jVar.c = hVar2;
                    return hVar4;
                }
                if (j3 > 0) {
                    j4 = Math.min(j4, j3);
                }
            }
            i6++;
            d3 = i4;
            hVar2 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.f3912f = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        int i3;
        loop0: while (true) {
            boolean z3 = false;
            while (true) {
                b bVar = this.f3913i;
                bVar.getClass();
                int i4 = 5;
                if (b.f3916k.get(bVar) == 0 && this.f3910d != 5) {
                    h a3 = a(this.h);
                    int i5 = 3;
                    if (a3 != null) {
                        this.f3912f = 0L;
                        int i6 = a3.c.f3928a;
                        this.f3911e = 0L;
                        if (this.f3910d == 3) {
                            this.f3910d = 2;
                        }
                        b bVar2 = this.f3913i;
                        if (i6 != 0 && h(2) && !bVar2.D() && !bVar2.A(b.f3915j.get(bVar2))) {
                            bVar2.D();
                        }
                        bVar2.getClass();
                        try {
                            a3.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (i6 != 0) {
                            b.f3915j.addAndGet(bVar2, -2097152L);
                            if (this.f3910d != 5) {
                                this.f3910d = 4;
                            }
                        }
                    } else {
                        this.h = false;
                        if (this.f3912f == 0) {
                            Object obj = this.nextParkedWorker;
                            d1.f fVar = b.f3917l;
                            if (obj != fVar) {
                                f3908j.set(this, -1);
                                while (this.nextParkedWorker != b.f3917l) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3908j;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        b bVar3 = this.f3913i;
                                        bVar3.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f3916k;
                                        if (atomicIntegerFieldUpdater2.get(bVar3) == 0 && this.f3910d != i4) {
                                            h(i5);
                                            Thread.interrupted();
                                            if (this.f3911e == 0) {
                                                this.f3911e = System.nanoTime() + this.f3913i.f3919d;
                                            }
                                            LockSupport.parkNanos(this.f3913i.f3919d);
                                            if (System.nanoTime() - this.f3911e >= 0) {
                                                this.f3911e = 0L;
                                                b bVar4 = this.f3913i;
                                                synchronized (bVar4.h) {
                                                    try {
                                                        if (!(atomicIntegerFieldUpdater2.get(bVar4) != 0)) {
                                                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f3915j;
                                                            if (((int) (atomicLongFieldUpdater2.get(bVar4) & 2097151)) > bVar4.f3918b) {
                                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                    int i7 = this.indexInArray;
                                                                    f(0);
                                                                    bVar4.o(this, i7, 0);
                                                                    int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar4) & 2097151);
                                                                    if (andDecrement != i7) {
                                                                        Object b3 = bVar4.h.b(andDecrement);
                                                                        X1.g.b(b3);
                                                                        a aVar = (a) b3;
                                                                        bVar4.h.c(i7, aVar);
                                                                        aVar.f(i7);
                                                                        bVar4.o(aVar, andDecrement, i7);
                                                                    }
                                                                    bVar4.h.c(andDecrement, null);
                                                                    this.f3910d = 5;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                            i4 = 5;
                                            i5 = 3;
                                        }
                                    }
                                }
                            } else {
                                b bVar5 = this.f3913i;
                                bVar5.getClass();
                                if (this.nextParkedWorker == fVar) {
                                    do {
                                        atomicLongFieldUpdater = b.f3914i;
                                        j3 = atomicLongFieldUpdater.get(bVar5);
                                        i3 = this.indexInArray;
                                        this.nextParkedWorker = bVar5.h.b((int) (j3 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(bVar5, j3, ((j3 + 2097152) & (-2097152)) | i3));
                                }
                            }
                        } else {
                            if (z3) {
                                h(3);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f3912f);
                                this.f3912f = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    }
                }
            }
        }
        h(5);
    }
}
