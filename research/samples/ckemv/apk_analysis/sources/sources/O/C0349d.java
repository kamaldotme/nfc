package o;

import a.AbstractC0059a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349d extends AbstractC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4259b;
    public final AtomicReferenceFieldUpdater c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4260d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4261e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4262f;

    public C0349d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4259b = atomicReferenceFieldUpdater;
        this.c = atomicReferenceFieldUpdater2;
        this.f4260d = atomicReferenceFieldUpdater3;
        this.f4261e = atomicReferenceFieldUpdater4;
        this.f4262f = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0059a
    public final void I(f fVar, f fVar2) {
        this.c.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0059a
    public final void J(f fVar, Thread thread) {
        this.f4259b.lazySet(fVar, thread);
    }

    @Override // a.AbstractC0059a
    public final boolean f(g gVar, C0348c c0348c, C0348c c0348c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4261e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0348c, c0348c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0348c);
        return false;
    }

    @Override // a.AbstractC0059a
    public final boolean g(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4262f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0059a
    public final boolean h(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4260d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
