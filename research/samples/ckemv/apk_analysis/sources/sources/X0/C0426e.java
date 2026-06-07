package x0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.z;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426e extends z {

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5201d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5202e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5203f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;

    public C0426e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f5201d = atomicReferenceFieldUpdater;
        this.f5202e = atomicReferenceFieldUpdater2;
        this.f5203f = atomicReferenceFieldUpdater3;
        this.g = atomicReferenceFieldUpdater4;
        this.h = atomicReferenceFieldUpdater5;
    }

    @Override // m0.z
    public final void b0(C0429h c0429h, C0429h c0429h2) {
        this.f5202e.lazySet(c0429h, c0429h2);
    }

    @Override // m0.z
    public final void c0(C0429h c0429h, Thread thread) {
        this.f5201d.lazySet(c0429h, thread);
    }

    @Override // m0.z
    public final boolean f(AbstractC0430i abstractC0430i, C0425d c0425d, C0425d c0425d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0430i, c0425d, c0425d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0430i) == c0425d);
        return false;
    }

    @Override // m0.z
    public final boolean g(AbstractC0430i abstractC0430i, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0430i, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0430i) == obj);
        return false;
    }

    @Override // m0.z
    public final boolean h(AbstractC0430i abstractC0430i, C0429h c0429h, C0429h c0429h2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f5203f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0430i, c0429h, c0429h2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0430i) == c0429h);
        return false;
    }
}
