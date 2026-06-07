package o;

import a.AbstractC0059a;
import a1.InterfaceFutureC0061a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements InterfaceFutureC0061a {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f4265d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f4266e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0059a f4267f;
    public static final Object g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4268a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0348c f4269b;
    public volatile f c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.a] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    static {
        ?? r4;
        try {
            th = null;
            r4 = new C0349d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0348c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r4 = new Object();
        }
        f4267f = r4;
        if (th != null) {
            f4266e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        C0348c c0348c;
        C0348c c0348c2;
        C0348c c0348c3;
        do {
            fVar = gVar.c;
        } while (!f4267f.h(gVar, fVar, f.c));
        while (true) {
            c0348c = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f4263a;
            if (thread != null) {
                fVar.f4263a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f4264b;
        }
        do {
            c0348c2 = gVar.f4269b;
        } while (!f4267f.f(gVar, c0348c2, C0348c.f4256d));
        while (true) {
            c0348c3 = c0348c;
            c0348c = c0348c2;
            if (c0348c == null) {
                break;
            }
            c0348c2 = c0348c.c;
            c0348c.c = c0348c3;
        }
        while (c0348c3 != null) {
            C0348c c0348c4 = c0348c3.c;
            d(c0348c3.f4257a, c0348c3.f4258b);
            c0348c3 = c0348c4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f4266e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object e(Object obj) {
        if (obj instanceof C0346a) {
            Throwable th = ((C0346a) obj).f4255a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0347b) {
            ((AbstractC0347b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    @Override // a1.InterfaceFutureC0061a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C0348c c0348c = this.f4269b;
        C0348c c0348c2 = C0348c.f4256d;
        if (c0348c != c0348c2) {
            C0348c c0348c3 = new C0348c(runnable, executor);
            do {
                c0348c3.c = c0348c;
                if (f4267f.f(this, c0348c, c0348c3)) {
                    return;
                } else {
                    c0348c = this.f4269b;
                }
            } while (c0348c != c0348c2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e4) {
                sb.append("FAILURE, cause=[");
                sb.append(e4.getCause());
                sb.append("]");
                return;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f4268a;
        if (obj == null) {
            if (f4267f.g(this, obj, f4265d ? new C0346a(new CancellationException("Future.cancel() was called."), z3) : z3 ? C0346a.f4254b : C0346a.c)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    public final void f(f fVar) {
        fVar.f4263a = null;
        while (true) {
            f fVar2 = this.c;
            if (fVar2 == f.c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f4264b;
                if (fVar2.f4263a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f4264b = fVar4;
                    if (fVar3.f4263a == null) {
                        break;
                    }
                } else if (!f4267f.h(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009f -> B:33:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(long j3, TimeUnit timeUnit) {
        long j4;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f4268a;
            if ((obj != null) & true) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.c;
                f fVar2 = f.c;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        AbstractC0059a abstractC0059a = f4267f;
                        abstractC0059a.I(fVar3, fVar);
                        if (abstractC0059a.h(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4268a;
                                    if ((obj2 != null) & true) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    f(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            f(fVar3);
                            j4 = 0;
                            if (nanos > j4) {
                                Object obj3 = this.f4268a;
                                if ((obj3 != null) & true) {
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
                                String gVar = toString();
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
                                throw new TimeoutException(str + " for " + gVar);
                            }
                        } else {
                            fVar = this.c;
                        }
                    } while (fVar != fVar2);
                }
                return e(this.f4268a);
            }
            j4 = 0;
            if (nanos > j4) {
            }
        } else {
            throw new InterruptedException();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4268a instanceof C0346a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f4268a != null) & true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4268a instanceof C0346a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
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
            Object obj2 = this.f4268a;
            if ((obj2 != null) & true) {
                return e(obj2);
            }
            f fVar = this.c;
            f fVar2 = f.c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0059a abstractC0059a = f4267f;
                    abstractC0059a.I(fVar3, fVar);
                    if (abstractC0059a.h(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4268a;
                            } else {
                                f(fVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return e(obj);
                    }
                    fVar = this.c;
                } while (fVar != fVar2);
            }
            return e(this.f4268a);
        }
        throw new InterruptedException();
    }
}
