package e2;

import f.ExecutorC0145B;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class K extends J implements InterfaceC0142y {

    /* renamed from: d, reason: collision with root package name */
    public final Executor f2777d;

    /* JADX WARN: Multi-variable type inference failed */
    public K(ExecutorC0145B executorC0145B) {
        Method method;
        this.f2777d = executorC0145B;
        Method method2 = j2.c.f3513a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executorC0145B instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executorC0145B : null;
            if (scheduledThreadPoolExecutor != null && (method = j2.c.f3513a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // e2.InterfaceC0142y
    public final void G(long j3, C0124f c0124f) {
        Executor executor = this.f2777d;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new D0.c(this, 3, c0124f), j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                Q q3 = (Q) c0124f.f2802f.A(C0136s.c);
                if (q3 != null) {
                    q3.a(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0124f.t(new C0122d(0, scheduledFuture));
        } else {
            RunnableC0140w.f2829j.G(j3, c0124f);
        }
    }

    @Override // e2.r
    public final void I(O1.i iVar, Runnable runnable) {
        try {
            this.f2777d.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            Q q3 = (Q) iVar.A(C0136s.c);
            if (q3 != null) {
                q3.a(cancellationException);
            }
            B.f2768b.I(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2777d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof K) && ((K) obj).f2777d == this.f2777d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2777d);
    }

    @Override // e2.r
    public final String toString() {
        return this.f2777d.toString();
    }
}
