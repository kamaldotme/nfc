package j2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3514b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(d dVar) {
        this._prev = dVar;
    }

    public final void a() {
        c.lazySet(this, null);
    }

    public final d b() {
        Object obj = f3514b.get(this);
        if (obj == a.f3508b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d b3;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d b4 = b();
            X1.g.b(b4);
            while (b4.c() && (b3 = b4.b()) != null) {
                b4 = b3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b4);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(b4, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(b4) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f3514b.set(dVar, b4);
            }
            if (!b4.c() || b4.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
