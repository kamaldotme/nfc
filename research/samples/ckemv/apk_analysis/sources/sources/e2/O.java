package e2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class O extends T {
    public static final AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(O.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: f, reason: collision with root package name */
    public final W1.l f2780f;

    public O(W1.l lVar) {
        this.f2780f = lVar;
    }

    @Override // W1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        p((Throwable) obj);
        return K1.h.f605a;
    }

    @Override // e2.V
    public final void p(Throwable th) {
        if (g.compareAndSet(this, 0, 1)) {
            this.f2780f.h(th);
        }
    }
}
