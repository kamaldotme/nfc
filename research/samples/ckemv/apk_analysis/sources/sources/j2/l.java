package j2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3527a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3527a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a3 = nVar.a(obj);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                n c = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3527a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f3527a.get(this);
        nVar.getClass();
        long j3 = n.f3530f.get(nVar);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3527a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d3 = nVar.d();
            if (d3 != n.g) {
                return d3;
            }
            n c = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
