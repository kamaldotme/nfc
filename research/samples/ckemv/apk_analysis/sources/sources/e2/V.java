package e2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class V extends j2.k implements C, M, W1.l {

    /* renamed from: e, reason: collision with root package name */
    public Z f2784e;

    @Override // e2.M
    public final boolean b() {
        return true;
    }

    @Override // e2.M
    public final b0 c() {
        return null;
    }

    @Override // e2.C
    public final void f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z o3 = o();
        while (true) {
            Object F2 = o3.F();
            if (!(F2 instanceof V)) {
                if (!(F2 instanceof M) || ((M) F2).c() == null) {
                    return;
                }
                while (true) {
                    Object l3 = l();
                    if (l3 instanceof j2.r) {
                        j2.k kVar = ((j2.r) l3).f3537a;
                        return;
                    }
                    if (l3 == this) {
                        return;
                    }
                    X1.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    j2.k kVar2 = (j2.k) l3;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = j2.k.f3526d;
                    j2.r rVar = (j2.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new j2.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = j2.k.f3525b;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, l3, rVar)) {
                            kVar2.j();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == l3);
                }
            } else {
                if (F2 != this) {
                    return;
                }
                D d3 = AbstractC0139v.f2828j;
                do {
                    atomicReferenceFieldUpdater2 = Z.f2793b;
                    if (atomicReferenceFieldUpdater2.compareAndSet(o3, F2, d3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(o3) == F2);
            }
        }
    }

    public final Z o() {
        Z z3 = this.f2784e;
        if (z3 != null) {
            return z3;
        }
        X1.g.h("job");
        throw null;
    }

    public abstract void p(Throwable th);

    @Override // j2.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0139v.f(this) + "[job@" + AbstractC0139v.f(o()) + ']';
    }
}
