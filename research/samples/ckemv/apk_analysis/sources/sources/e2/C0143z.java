package e2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: e2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143z extends j2.t {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2832f = AtomicIntegerFieldUpdater.newUpdater(C0143z.class, "_decision");
    private volatile int _decision;

    @Override // j2.t, e2.Z
    public final void q(Object obj) {
        r(obj);
    }

    @Override // j2.t, e2.Z
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2832f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                j2.a.i(v0.f.y(this.f3538e), AbstractC0139v.l(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
