package e2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126h extends T {

    /* renamed from: f, reason: collision with root package name */
    public final C0124f f2803f;

    public C0126h(C0124f c0124f) {
        this.f2803f = c0124f;
    }

    @Override // W1.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        p((Throwable) obj);
        return K1.h.f605a;
    }

    @Override // e2.V
    public final void p(Throwable th) {
        Z o3 = o();
        C0124f c0124f = this.f2803f;
        c0124f.getClass();
        CancellationException B3 = o3.B();
        if (c0124f.v()) {
            O1.d dVar = c0124f.f2801e;
            X1.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            j2.h hVar = (j2.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2.h.f3518i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                d1.f fVar = j2.a.f3509d;
                if (!X1.g.a(obj, fVar)) {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, B3)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0124f.n(B3);
        if (c0124f.v()) {
            return;
        }
        c0124f.o();
    }
}
