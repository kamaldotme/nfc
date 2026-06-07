package j2;

import e2.AbstractC0139v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3525b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3526d = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((j2.r) r6).f3537a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k j() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3525b;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar2);
                    if (obj == this) {
                        if (kVar == kVar2) {
                            return kVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != kVar) {
                                break;
                            }
                        }
                        return kVar2;
                    }
                    if (n()) {
                        return null;
                    }
                    if (obj == null) {
                        return kVar2;
                    }
                    if (obj instanceof q) {
                        ((q) obj).a(kVar2);
                        break;
                    }
                    if (!(obj instanceof r)) {
                        X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) atomicReferenceFieldUpdater.get(kVar2);
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void k(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (l() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (n()) {
                kVar.j();
                return;
            }
            return;
        }
    }

    public final Object l() {
        while (true) {
            Object obj = f3525b.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k m() {
        k kVar;
        Object l3 = l();
        r rVar = l3 instanceof r ? (r) l3 : null;
        if (rVar != null && (kVar = rVar.f3537a) != null) {
            return kVar;
        }
        X1.g.c(l3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) l3;
    }

    public boolean n() {
        return l() instanceof r;
    }

    public String toString() {
        return new j(this) + '@' + AbstractC0139v.f(this);
    }
}
