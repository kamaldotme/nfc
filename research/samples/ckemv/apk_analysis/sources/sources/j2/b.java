package j2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b extends q {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3512a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f3507a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        r1 = r0.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.compareAndSet(r4, r2, r3) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r0.get(r4) == r2) goto L17;
     */
    @Override // j2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3512a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        d1.f fVar = a.f3507a;
        if (obj2 == fVar) {
            d1.f c = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract d1.f c(Object obj);
}
