package e2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: e2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0140w extends H implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0140w f2829j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f2830k;

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.I, e2.w, e2.H] */
    static {
        Long l3;
        ?? h = new H();
        f2829j = h;
        h.O(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f2830k = timeUnit.toNanos(l3.longValue());
    }

    @Override // e2.I
    public final Thread N() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // e2.I
    public final void R(long j3, F f3) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // e2.H, e2.I
    public final void S() {
        debugStatus = 4;
        super.S();
    }

    @Override // e2.H
    public final void T(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.T(runnable);
    }

    public final synchronized void Y() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            H.g.set(this, null);
            H.h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean V2;
        h0.f2804a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 != 2 && i3 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j3 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long W2 = W();
                        if (W2 == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j3 == Long.MAX_VALUE) {
                                j3 = f2830k + nanoTime;
                            }
                            long j4 = j3 - nanoTime;
                            if (j4 <= 0) {
                                _thread = null;
                                Y();
                                if (V()) {
                                    return;
                                }
                                N();
                                return;
                            }
                            if (W2 > j4) {
                                W2 = j4;
                            }
                        } else {
                            j3 = Long.MAX_VALUE;
                        }
                        if (W2 > 0) {
                            int i4 = debugStatus;
                            if (i4 == 2 || i4 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, W2);
                            }
                        }
                    }
                    if (V2) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                Y();
                if (V()) {
                    return;
                }
                N();
            }
        } finally {
            _thread = null;
            Y();
            if (!V()) {
                N();
            }
        }
    }
}
