package x0;

import a1.InterfaceFutureC0061a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import m0.z;

/* renamed from: x0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0430i implements InterfaceFutureC0061a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5207d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f5208e = Logger.getLogger(AbstractC0430i.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final z f5209f;
    public static final Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f5210a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0425d f5211b;
    public volatile C0429h c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [m0.z] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new C0426e(AtomicReferenceFieldUpdater.newUpdater(C0429h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0429h.class, C0429h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0430i.class, C0429h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0430i.class, C0425d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0430i.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r4 = new Object();
        }
        f5209f = r4;
        if (th != null) {
            f5208e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(AbstractC0430i abstractC0430i) {
        C0425d c0425d;
        C0425d c0425d2;
        C0425d c0425d3 = null;
        while (true) {
            C0429h c0429h = abstractC0430i.c;
            if (f5209f.h(abstractC0430i, c0429h, C0429h.c)) {
                while (c0429h != null) {
                    Thread thread = c0429h.f5205a;
                    if (thread != null) {
                        c0429h.f5205a = null;
                        LockSupport.unpark(thread);
                    }
                    c0429h = c0429h.f5206b;
                }
                do {
                    c0425d = abstractC0430i.f5211b;
                } while (!f5209f.f(abstractC0430i, c0425d, C0425d.f5198d));
                while (true) {
                    c0425d2 = c0425d3;
                    c0425d3 = c0425d;
                    if (c0425d3 == null) {
                        break;
                    }
                    c0425d = c0425d3.c;
                    c0425d3.c = c0425d2;
                }
                while (c0425d2 != null) {
                    c0425d3 = c0425d2.c;
                    Runnable runnable = c0425d2.f5199a;
                    if (runnable instanceof RunnableC0427f) {
                        RunnableC0427f runnableC0427f = (RunnableC0427f) runnable;
                        abstractC0430i = runnableC0427f.f5204b;
                        if (abstractC0430i.f5210a == runnableC0427f) {
                            if (f5209f.g(abstractC0430i, runnableC0427f, f(runnableC0427f.c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, c0425d2.f5200b);
                    }
                    c0425d2 = c0425d3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f5208e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C0422a) {
            Throwable th = ((C0422a) obj).f5195b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C0424c) {
            throw new ExecutionException(((C0424c) obj).f5197a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0061a interfaceFutureC0061a) {
        if (interfaceFutureC0061a instanceof AbstractC0430i) {
            Object obj = ((AbstractC0430i) interfaceFutureC0061a).f5210a;
            if (!(obj instanceof C0422a)) {
                return obj;
            }
            C0422a c0422a = (C0422a) obj;
            return c0422a.f5194a ? c0422a.f5195b != null ? new C0422a(c0422a.f5195b, false) : C0422a.f5193d : obj;
        }
        boolean isCancelled = interfaceFutureC0061a.isCancelled();
        if ((!f5207d) && isCancelled) {
            return C0422a.f5193d;
        }
        try {
            Object g3 = g(interfaceFutureC0061a);
            return g3 == null ? g : g3;
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new C0422a(e3, false);
            }
            return new C0424c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0061a, e3));
        } catch (ExecutionException e4) {
            return new C0424c(e4.getCause());
        } catch (Throwable th) {
            return new C0424c(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // a1.InterfaceFutureC0061a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C0425d c0425d = this.f5211b;
        C0425d c0425d2 = C0425d.f5198d;
        if (c0425d != c0425d2) {
            C0425d c0425d3 = new C0425d(runnable, executor);
            do {
                c0425d3.c = c0425d;
                if (f5209f.f(this, c0425d, c0425d3)) {
                    return;
                } else {
                    c0425d = this.f5211b;
                }
            } while (c0425d != c0425d2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g3 = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(g3 == this ? "this future" : String.valueOf(g3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f5210a;
        if (!(obj == null) && !(obj instanceof RunnableC0427f)) {
            return false;
        }
        C0422a c0422a = f5207d ? new C0422a(new CancellationException("Future.cancel() was called."), z3) : z3 ? C0422a.c : C0422a.f5193d;
        AbstractC0430i abstractC0430i = this;
        boolean z4 = false;
        while (true) {
            if (f5209f.g(abstractC0430i, obj, c0422a)) {
                c(abstractC0430i);
                if (!(obj instanceof RunnableC0427f)) {
                    return true;
                }
                InterfaceFutureC0061a interfaceFutureC0061a = ((RunnableC0427f) obj).c;
                if (!(interfaceFutureC0061a instanceof AbstractC0430i)) {
                    interfaceFutureC0061a.cancel(z3);
                    return true;
                }
                abstractC0430i = (AbstractC0430i) interfaceFutureC0061a;
                obj = abstractC0430i.f5210a;
                if (!(obj == null) && !(obj instanceof RunnableC0427f)) {
                    return true;
                }
                z4 = true;
            } else {
                obj = abstractC0430i.f5210a;
                if (!(obj instanceof RunnableC0427f)) {
                    return z4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j3, TimeUnit timeUnit) {
        long j4;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f5210a;
            if ((obj != null) & (!(obj instanceof RunnableC0427f))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0429h c0429h = this.c;
                C0429h c0429h2 = C0429h.c;
                if (c0429h != c0429h2) {
                    C0429h c0429h3 = new C0429h();
                    do {
                        z zVar = f5209f;
                        zVar.b0(c0429h3, c0429h);
                        if (zVar.h(this, c0429h, c0429h3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5210a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC0427f))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(c0429h3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(c0429h3);
                            j4 = 0;
                            if (nanos > j4) {
                                Object obj3 = this.f5210a;
                                if ((obj3 != null) & (!(obj3 instanceof RunnableC0427f))) {
                                    return e(obj3);
                                }
                                if (!Thread.interrupted()) {
                                    nanos = nanoTime - System.nanoTime();
                                    j4 = 0;
                                    if (nanos > j4) {
                                    }
                                } else {
                                    throw new InterruptedException();
                                }
                            } else {
                                String abstractC0430i = toString();
                                String obj4 = timeUnit.toString();
                                Locale locale = Locale.ROOT;
                                String lowerCase = obj4.toLowerCase(locale);
                                String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
                                if (nanos + 1000 < 0) {
                                    String h = X.d.h(str, " (plus ");
                                    long j5 = -nanos;
                                    long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                                    long nanos2 = j5 - timeUnit.toNanos(convert);
                                    boolean z3 = convert == 0 || nanos2 > 1000;
                                    if (convert > 0) {
                                        String str2 = h + convert + " " + lowerCase;
                                        if (z3) {
                                            str2 = X.d.h(str2, ",");
                                        }
                                        h = X.d.h(str2, " ");
                                    }
                                    if (z3) {
                                        h = h + nanos2 + " nanoseconds ";
                                    }
                                    str = X.d.h(h, "delay)");
                                }
                                if (isDone()) {
                                    throw new TimeoutException(X.d.h(str, " but future completed as timeout expired"));
                                }
                                throw new TimeoutException(str + " for " + abstractC0430i);
                            }
                        } else {
                            c0429h = this.c;
                        }
                    } while (c0429h != c0429h2);
                }
                return e(this.f5210a);
            }
            j4 = 0;
            if (nanos > j4) {
            }
        } else {
            throw new InterruptedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f5210a;
        if (obj instanceof RunnableC0427f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0061a interfaceFutureC0061a = ((RunnableC0427f) obj).c;
            return X.d.j(sb, interfaceFutureC0061a == this ? "this future" : String.valueOf(interfaceFutureC0061a), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C0429h c0429h) {
        c0429h.f5205a = null;
        while (true) {
            C0429h c0429h2 = this.c;
            if (c0429h2 == C0429h.c) {
                return;
            }
            C0429h c0429h3 = null;
            while (c0429h2 != null) {
                C0429h c0429h4 = c0429h2.f5206b;
                if (c0429h2.f5205a != null) {
                    c0429h3 = c0429h2;
                } else if (c0429h3 != null) {
                    c0429h3.f5206b = c0429h4;
                    if (c0429h3.f5205a == null) {
                        break;
                    }
                } else if (!f5209f.h(this, c0429h2, c0429h4)) {
                    break;
                }
                c0429h2 = c0429h4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5210a instanceof C0422a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC0427f)) & (this.f5210a != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5210a instanceof C0422a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5210a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC0427f))) {
                return e(obj2);
            }
            C0429h c0429h = this.c;
            C0429h c0429h2 = C0429h.c;
            if (c0429h != c0429h2) {
                C0429h c0429h3 = new C0429h();
                do {
                    z zVar = f5209f;
                    zVar.b0(c0429h3, c0429h);
                    if (zVar.h(this, c0429h, c0429h3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5210a;
                            } else {
                                i(c0429h3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC0427f))));
                        return e(obj);
                    }
                    c0429h = this.c;
                } while (c0429h != c0429h2);
            }
            return e(this.f5210a);
        }
        throw new InterruptedException();
    }
}
