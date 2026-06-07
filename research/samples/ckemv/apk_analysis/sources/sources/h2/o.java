package h2;

import e2.C0124f;
import e2.C0136s;
import e2.Q;
import e2.Z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.z;

/* loaded from: classes.dex */
public final class o extends i2.a implements m, f, g {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3120e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f3121d;

    public o(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (X1.g.a(r0, r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // h2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g gVar, O1.d dVar) {
        n nVar;
        P1.a aVar;
        int i3;
        ?? r02;
        q qVar;
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g gVar2;
        o oVar;
        q qVar3;
        Q q3;
        g gVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar instanceof n) {
                nVar = (n) dVar;
                int i4 = nVar.f3119l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    nVar.f3119l = i4 - Integer.MIN_VALUE;
                    Object obj4 = nVar.f3117j;
                    aVar = P1.a.f784b;
                    i3 = nVar.f3119l;
                    int i5 = 1;
                    if (i3 != 0) {
                        z.m0(obj4);
                        synchronized (this) {
                            try {
                                i2.b[] bVarArr = this.f3199a;
                                if (bVarArr == null) {
                                    q[] qVarArr = new q[2];
                                    this.f3199a = qVarArr;
                                    r02 = qVarArr;
                                } else {
                                    int i6 = this.f3200b;
                                    int length = bVarArr.length;
                                    r02 = bVarArr;
                                    if (i6 >= length) {
                                        Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
                                        X1.g.d(copyOf, "copyOf(this, newSize)");
                                        this.f3199a = (i2.b[]) copyOf;
                                        r02 = (i2.b[]) copyOf;
                                    }
                                }
                                int i7 = this.c;
                                do {
                                    ?? r10 = r02[i7];
                                    qVar = r10;
                                    if (r10 == 0) {
                                        ?? obj5 = new Object();
                                        r02[i7] = obj5;
                                        qVar = obj5;
                                    }
                                    i7++;
                                    if (i7 >= r02.length) {
                                        i7 = 0;
                                    }
                                    qVar2 = qVar;
                                    atomicReferenceFieldUpdater = q.f3124a;
                                } while (atomicReferenceFieldUpdater.get(qVar2) != null);
                                atomicReferenceFieldUpdater.set(qVar2, p.f3122a);
                                this.c = i7;
                                this.f3200b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        gVar2 = gVar;
                        oVar = this;
                        qVar3 = qVar;
                    } else if (i3 == 1) {
                        qVar3 = nVar.g;
                        gVar2 = nVar.f3115f;
                        oVar = nVar.f3114e;
                        z.m0(obj4);
                    } else if (i3 == 2) {
                        obj2 = nVar.f3116i;
                        q3 = nVar.h;
                        qVar3 = nVar.g;
                        gVar3 = nVar.f3115f;
                        oVar = nVar.f3114e;
                        z.m0(obj4);
                        obj = obj2;
                        qVar3.getClass();
                        d1.f fVar = p.f3122a;
                        andSet = q.f3124a.getAndSet(qVar3, fVar);
                        X1.g.b(andSet);
                        if (andSet != p.f3123b) {
                        }
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj6 = nVar.f3116i;
                        q3 = nVar.h;
                        qVar3 = nVar.g;
                        gVar3 = nVar.f3115f;
                        oVar = nVar.f3114e;
                        z.m0(obj4);
                        obj = obj6;
                        i5 = 1;
                        obj2 = f3120e.get(oVar);
                        if (q3 != null && !q3.b()) {
                            throw ((Z) q3).B();
                        }
                        obj3 = obj2 == i2.q.f3231a ? null : obj2;
                        nVar.f3114e = oVar;
                        nVar.f3115f = gVar3;
                        nVar.g = qVar3;
                        nVar.h = q3;
                        nVar.f3116i = obj2;
                        nVar.f3119l = 2;
                        if (gVar3.b(nVar, obj3) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        qVar3.getClass();
                        d1.f fVar2 = p.f3122a;
                        andSet = q.f3124a.getAndSet(qVar3, fVar2);
                        X1.g.b(andSet);
                        if (andSet != p.f3123b) {
                            obj2 = f3120e.get(oVar);
                            if (q3 != null) {
                                throw ((Z) q3).B();
                            }
                            if (obj2 == i2.q.f3231a) {
                            }
                            nVar.f3114e = oVar;
                            nVar.f3115f = gVar3;
                            nVar.g = qVar3;
                            nVar.h = q3;
                            nVar.f3116i = obj2;
                            nVar.f3119l = 2;
                            if (gVar3.b(nVar, obj3) == aVar) {
                            }
                            obj = obj2;
                            qVar3.getClass();
                            d1.f fVar22 = p.f3122a;
                            andSet = q.f3124a.getAndSet(qVar3, fVar22);
                            X1.g.b(andSet);
                            if (andSet != p.f3123b) {
                                nVar.f3114e = oVar;
                                nVar.f3115f = gVar3;
                                nVar.g = qVar3;
                                nVar.h = q3;
                                nVar.f3116i = obj;
                                nVar.f3119l = 3;
                                C0124f c0124f = new C0124f(i5, v0.f.y(nVar));
                                c0124f.r();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q.f3124a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(qVar3, fVar22, c0124f);
                                    K1.h hVar = K1.h.f605a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(qVar3) != fVar22) {
                                        c0124f.c(hVar);
                                        break;
                                    }
                                }
                                Object q4 = c0124f.q();
                                if (q4 == P1.a.f784b) {
                                }
                                if (q4 == aVar) {
                                    return aVar;
                                }
                                i5 = 1;
                                obj2 = f3120e.get(oVar);
                                if (q3 != null) {
                                }
                                if (obj2 == i2.q.f3231a) {
                                }
                                nVar.f3114e = oVar;
                                nVar.f3115f = gVar3;
                                nVar.g = qVar3;
                                nVar.h = q3;
                                nVar.f3116i = obj2;
                                nVar.f3119l = 2;
                                if (gVar3.b(nVar, obj3) == aVar) {
                                }
                                obj = obj2;
                                qVar3.getClass();
                                d1.f fVar222 = p.f3122a;
                                andSet = q.f3124a.getAndSet(qVar3, fVar222);
                                X1.g.b(andSet);
                                if (andSet != p.f3123b) {
                                }
                            }
                        }
                    }
                    O1.i iVar = nVar.c;
                    X1.g.b(iVar);
                    q3 = (Q) iVar.A(C0136s.c);
                    gVar3 = gVar2;
                    obj = null;
                    obj2 = f3120e.get(oVar);
                    if (q3 != null) {
                    }
                    if (obj2 == i2.q.f3231a) {
                    }
                    nVar.f3114e = oVar;
                    nVar.f3115f = gVar3;
                    nVar.g = qVar3;
                    nVar.h = q3;
                    nVar.f3116i = obj2;
                    nVar.f3119l = 2;
                    if (gVar3.b(nVar, obj3) == aVar) {
                    }
                    obj = obj2;
                    qVar3.getClass();
                    d1.f fVar2222 = p.f3122a;
                    andSet = q.f3124a.getAndSet(qVar3, fVar2222);
                    X1.g.b(andSet);
                    if (andSet != p.f3123b) {
                    }
                }
            }
            if (i3 != 0) {
            }
            O1.i iVar2 = nVar.c;
            X1.g.b(iVar2);
            q3 = (Q) iVar2.A(C0136s.c);
            gVar3 = gVar2;
            obj = null;
            obj2 = f3120e.get(oVar);
            if (q3 != null) {
            }
            if (obj2 == i2.q.f3231a) {
            }
            nVar.f3114e = oVar;
            nVar.f3115f = gVar3;
            nVar.g = qVar3;
            nVar.h = q3;
            nVar.f3116i = obj2;
            nVar.f3119l = 2;
            if (gVar3.b(nVar, obj3) == aVar) {
            }
            obj = obj2;
            qVar3.getClass();
            d1.f fVar22222 = p.f3122a;
            andSet = q.f3124a.getAndSet(qVar3, fVar22222);
            X1.g.b(andSet);
            if (andSet != p.f3123b) {
            }
        } catch (Throwable th2) {
            synchronized (oVar) {
                try {
                    int i8 = oVar.f3200b - 1;
                    oVar.f3200b = i8;
                    if (i8 == 0) {
                        oVar.c = 0;
                    }
                    X1.g.c(qVar3, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    q.f3124a.set(qVar3, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        nVar = new n(this, dVar);
        Object obj42 = nVar.f3117j;
        aVar = P1.a.f784b;
        i3 = nVar.f3119l;
        int i52 = 1;
    }

    @Override // h2.g
    public final Object b(O1.d dVar, Object obj) {
        c(obj);
        return K1.h.f605a;
    }

    public final void c(Object obj) {
        int i3;
        i2.b[] bVarArr;
        d1.f fVar;
        if (obj == null) {
            obj = i2.q.f3231a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3120e;
            if (X1.g.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i4 = this.f3121d;
            if ((i4 & 1) != 0) {
                this.f3121d = i4 + 2;
                return;
            }
            int i5 = i4 + 1;
            this.f3121d = i5;
            i2.b[] bVarArr2 = this.f3199a;
            while (true) {
                q[] qVarArr = (q[]) bVarArr2;
                if (qVarArr != null) {
                    for (q qVar : qVarArr) {
                        if (qVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = q.f3124a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(qVar);
                                if (obj2 != null && obj2 != (fVar = p.f3123b)) {
                                    d1.f fVar2 = p.f3122a;
                                    if (obj2 != fVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(qVar, obj2, fVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(qVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0124f) obj2).c(K1.h.f605a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(qVar, obj2, fVar)) {
                                        if (atomicReferenceFieldUpdater2.get(qVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f3121d;
                    if (i3 == i5) {
                        this.f3121d = i5 + 1;
                        return;
                    }
                    bVarArr = this.f3199a;
                }
                bVarArr2 = bVarArr;
                i5 = i3;
            }
        }
    }
}
