package j2;

import e2.d0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class u extends d implements d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3539e = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: d, reason: collision with root package name */
    public final long f3540d;

    public u(long j3, u uVar, int i3) {
        super(uVar);
        this.f3540d = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // j2.d
    public final boolean c() {
        return f3539e.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3539e.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, O1.i iVar);

    public final void h() {
        if (f3539e.incrementAndGet(this) == g2.f.f3054b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f3539e;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
