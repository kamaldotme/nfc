package g2;

import e2.l0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class l extends j2.u {

    /* renamed from: f, reason: collision with root package name */
    public final d f3075f;
    public final AtomicReferenceArray g;

    public l(long j3, l lVar, d dVar, int i3) {
        super(j3, lVar, i3);
        this.f3075f = dVar;
        this.g = new AtomicReferenceArray(f.f3054b * 2);
    }

    @Override // j2.u
    public final int f() {
        return f.f3054b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0060, code lost:
    
        X1.g.b(r4);
        r7 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0067, code lost:
    
        j2.a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // j2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i3, O1.i iVar) {
        int i4 = f.f3054b;
        boolean z3 = i3 >= i4;
        if (z3) {
            i3 -= i4;
        }
        Object obj = this.g.get(i3 * 2);
        while (true) {
            Object k2 = k(i3);
            boolean z4 = k2 instanceof l0;
            d dVar = this.f3075f;
            if (z4 || (k2 instanceof v)) {
                if (j(k2, i3, z3 ? f.f3059j : f.f3060k)) {
                    m(i3, null);
                    l(i3, !z3);
                    if (z3) {
                        X1.g.b(dVar);
                        W1.l lVar = dVar.c;
                        if (lVar != null) {
                            j2.a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (k2 == f.f3059j || k2 == f.f3060k) {
                    break;
                }
                if (k2 != f.g && k2 != f.f3057f) {
                    if (k2 == f.f3058i || k2 == f.f3055d || k2 == f.f3061l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + k2).toString());
                }
            }
        }
    }

    public final boolean j(Object obj, int i3, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.g;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.g.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            d dVar = this.f3075f;
            X1.g.b(dVar);
            dVar.H((this.f3540d * f.f3054b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.g.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, d1.f fVar) {
        this.g.set((i3 * 2) + 1, fVar);
    }
}
