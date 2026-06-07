package j2;

import e2.AbstractC0141x;
import e2.C0124f;
import e2.InterfaceC0142y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class i extends e2.r implements InterfaceC0142y {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3521i = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: d, reason: collision with root package name */
    public final e2.r f3522d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142y f3524f;
    public final l g;
    public final Object h;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(l2.l lVar, int i3) {
        this.f3522d = lVar;
        this.f3523e = i3;
        InterfaceC0142y interfaceC0142y = lVar instanceof InterfaceC0142y ? (InterfaceC0142y) lVar : null;
        this.f3524f = interfaceC0142y == null ? AbstractC0141x.f2831a : interfaceC0142y;
        this.g = new l();
        this.h = new Object();
    }

    @Override // e2.InterfaceC0142y
    public final void G(long j3, C0124f c0124f) {
        this.f3524f.G(j3, c0124f);
    }

    @Override // e2.r
    public final void I(O1.i iVar, Runnable runnable) {
        Runnable L2;
        this.g.a(runnable);
        if (f3521i.get(this) >= this.f3523e || !M() || (L2 = L()) == null) {
            return;
        }
        this.f3522d.I(this, new D0.c(this, L2, 5, false));
    }

    @Override // e2.r
    public final void J(O1.i iVar, Runnable runnable) {
        Runnable L2;
        this.g.a(runnable);
        if (f3521i.get(this) >= this.f3523e || !M() || (L2 = L()) == null) {
            return;
        }
        this.f3522d.J(this, new D0.c(this, L2, 5, false));
    }

    public final Runnable L() {
        while (true) {
            Runnable runnable = (Runnable) this.g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3521i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean M() {
        synchronized (this.h) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3521i;
            if (atomicIntegerFieldUpdater.get(this) >= this.f3523e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
