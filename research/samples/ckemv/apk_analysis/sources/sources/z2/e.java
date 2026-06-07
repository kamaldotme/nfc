package z2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends x {
    public static final ReentrantLock h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f5331i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f5332j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f5333k;

    /* renamed from: l, reason: collision with root package name */
    public static e f5334l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5335e;

    /* renamed from: f, reason: collision with root package name */
    public e f5336f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        X1.g.d(newCondition, "newCondition(...)");
        f5331i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f5332j = millis;
        f5333k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [z2.e, java.lang.Object] */
    public final void h() {
        e eVar;
        long j3 = this.c;
        boolean z3 = this.f5365a;
        if (j3 != 0 || z3) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (!(!this.f5335e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f5335e = true;
                if (f5334l == null) {
                    f5334l = new Object();
                    Thread thread = new Thread("Okio Watchdog");
                    thread.setDaemon(true);
                    thread.start();
                }
                long nanoTime = System.nanoTime();
                if (j3 != 0 && z3) {
                    this.g = Math.min(j3, c() - nanoTime) + nanoTime;
                } else if (j3 != 0) {
                    this.g = j3 + nanoTime;
                } else {
                    if (!z3) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j4 = this.g - nanoTime;
                e eVar2 = f5334l;
                X1.g.b(eVar2);
                while (true) {
                    eVar = eVar2.f5336f;
                    if (eVar == null || j4 < eVar.g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f5336f = eVar;
                eVar2.f5336f = this;
                if (eVar2 == f5334l) {
                    f5331i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.f5335e) {
                return false;
            }
            this.f5335e = false;
            e eVar = f5334l;
            while (eVar != null) {
                e eVar2 = eVar.f5336f;
                if (eVar2 == this) {
                    eVar.f5336f = this.f5336f;
                    this.f5336f = null;
                    return false;
                }
                eVar = eVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
