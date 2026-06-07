package m0;

import a1.InterfaceFutureC0061a;
import e2.U;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import x0.C0422a;
import x0.C0432k;

/* loaded from: classes.dex */
public final class l implements InterfaceFutureC0061a {

    /* renamed from: a, reason: collision with root package name */
    public final C0432k f3977a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.k, java.lang.Object] */
    public l(U u3) {
        u3.J(false, true, new L1.a(3, this));
    }

    @Override // a1.InterfaceFutureC0061a
    public final void a(Runnable runnable, Executor executor) {
        this.f3977a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f3977a.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3977a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3977a.f5210a instanceof C0422a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3977a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f3977a.get(j3, timeUnit);
    }
}
