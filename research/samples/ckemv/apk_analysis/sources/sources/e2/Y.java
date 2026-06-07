package e2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends j2.b {

    /* renamed from: b, reason: collision with root package name */
    public final j2.k f2790b;
    public j2.k c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f2791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2792e;

    public Y(j2.k kVar, Z z3, M m3) {
        this.f2791d = z3;
        this.f2792e = m3;
        this.f2790b = kVar;
    }

    @Override // j2.b
    public final void b(Object obj, Object obj2) {
        j2.k kVar = (j2.k) obj;
        boolean z3 = obj2 == null;
        j2.k kVar2 = this.f2790b;
        j2.k kVar3 = z3 ? kVar2 : this.c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2.k.f3525b;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z3) {
                j2.k kVar4 = this.c;
                X1.g.b(kVar4);
                kVar2.k(kVar4);
            }
        }
    }

    @Override // j2.b
    public final d1.f c(Object obj) {
        if (this.f2791d.F() == this.f2792e) {
            return null;
        }
        return j2.a.f3510e;
    }
}
