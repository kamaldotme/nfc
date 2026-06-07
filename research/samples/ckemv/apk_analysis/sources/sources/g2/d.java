package g2;

import e2.AbstractC0139v;
import e2.C0124f;
import e2.InterfaceC0123e;
import e2.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.z;

/* loaded from: classes.dex */
public class d implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3044d = AtomicLongFieldUpdater.newUpdater(d.class, "sendersAndCloseStatus");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3045e = AtomicLongFieldUpdater.newUpdater(d.class, "receivers");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3046f = AtomicLongFieldUpdater.newUpdater(d.class, "bufferEnd");
    public static final AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(d.class, "completedExpandBuffersAndPauseFlag");
    public static final AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "sendSegment");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3047i = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "receiveSegment");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3048j = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "bufferEndSegment");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3049k = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_closeCause");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3050l = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* renamed from: b, reason: collision with root package name */
    public final int f3051b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    public final W1.l c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public d(int i3, W1.l lVar) {
        this.f3051b = i3;
        this.c = lVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(X.d.g("Invalid channel capacity: ", i3, ", should be >=0").toString());
        }
        l lVar2 = f.f3053a;
        this.bufferEnd = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f3046f.get(this);
        l lVar3 = new l(0L, null, this, 3);
        this.sendSegment = lVar3;
        this.receiveSegment = lVar3;
        if (x()) {
            lVar3 = f.f3053a;
            X1.g.c(lVar3, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = lVar3;
        this._closeCause = f.f3068s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object A(d dVar, O1.d dVar2) {
        b bVar;
        int i3;
        Object B3;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i4 = bVar.g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.g = i4 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f3040e;
                Object obj2 = P1.a.f784b;
                i3 = bVar2.g;
                if (i3 != 0) {
                    z.m0(obj);
                    l lVar = (l) f3047i.get(dVar);
                    while (true) {
                        dVar.getClass();
                        if (dVar.v(f3044d.get(dVar), true)) {
                            return new i(dVar.r());
                        }
                        long andIncrement = f3045e.getAndIncrement(dVar);
                        long j3 = f.f3054b;
                        long j4 = andIncrement / j3;
                        int i5 = (int) (andIncrement % j3);
                        if (lVar.f3540d != j4) {
                            l q3 = dVar.q(j4, lVar);
                            if (q3 == null) {
                                continue;
                            } else {
                                lVar = q3;
                            }
                        }
                        Object F2 = dVar.F(lVar, i5, andIncrement, null);
                        if (F2 == f.f3062m) {
                            throw new IllegalStateException("unexpected".toString());
                        }
                        if (F2 == f.f3064o) {
                            if (andIncrement < dVar.t()) {
                                lVar.a();
                            }
                        } else {
                            if (F2 != f.f3063n) {
                                lVar.a();
                                return F2;
                            }
                            bVar2.g = 1;
                            B3 = dVar.B(lVar, i5, andIncrement, bVar2);
                            if (B3 == obj2) {
                                return obj2;
                            }
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z.m0(obj);
                    B3 = ((k) obj).f3074a;
                }
                return B3;
            }
        }
        bVar = new b(dVar, dVar2);
        b bVar22 = bVar;
        Object obj3 = bVar22.f3040e;
        Object obj22 = P1.a.f784b;
        i3 = bVar22.g;
        if (i3 != 0) {
        }
        return B3;
    }

    public static boolean E(Object obj) {
        if (obj instanceof InterfaceC0123e) {
            X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.a((InterfaceC0123e) obj, K1.h.f605a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final l b(d dVar, long j3, l lVar) {
        Object c;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        dVar.getClass();
        l lVar2 = f.f3053a;
        e eVar = e.f3052j;
        loop0: while (true) {
            c = j2.a.c(lVar, j3);
            if (!j2.a.f(c)) {
                j2.u d3 = j2.a.d(c);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    j2.u uVar = (j2.u) atomicReferenceFieldUpdater.get(dVar);
                    if (uVar.f3540d >= d3.f3540d) {
                        break loop0;
                    }
                    if (!d3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dVar, uVar, d3)) {
                        if (atomicReferenceFieldUpdater.get(dVar) != uVar) {
                            if (d3.e()) {
                                d3.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean f3 = j2.a.f(c);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3045e;
        if (f3) {
            dVar.d();
            if (lVar.f3540d * f.f3054b >= atomicLongFieldUpdater2.get(dVar)) {
                return null;
            }
            lVar.a();
            return null;
        }
        l lVar3 = (l) j2.a.d(c);
        long j6 = lVar3.f3540d;
        if (j6 <= j3) {
            return lVar3;
        }
        long j7 = f.f3054b * j6;
        do {
            atomicLongFieldUpdater = f3044d;
            j4 = atomicLongFieldUpdater.get(dVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(dVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
        if (j6 * f.f3054b >= atomicLongFieldUpdater2.get(dVar)) {
            return null;
        }
        lVar3.a();
        return null;
    }

    public static final void c(d dVar, Object obj, C0124f c0124f) {
        W1.l lVar = dVar.c;
        if (lVar != null) {
            j2.a.a(lVar, obj, c0124f.f2802f);
        }
        c0124f.c(z.q(dVar.s()));
    }

    public static final int f(d dVar, l lVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        dVar.getClass();
        lVar.m(i3, obj);
        if (z3) {
            return dVar.G(lVar, i3, obj, j3, obj2, z3);
        }
        Object k2 = lVar.k(i3);
        if (k2 == null) {
            if (dVar.i(j3)) {
                if (lVar.j(null, i3, f.f3055d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.j(null, i3, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof l0) {
            lVar.m(i3, null);
            if (dVar.D(k2, obj)) {
                lVar.n(i3, f.f3058i);
                return 0;
            }
            d1.f fVar = f.f3060k;
            if (lVar.g.getAndSet((i3 * 2) + 1, fVar) != fVar) {
                lVar.l(i3, true);
            }
            return 5;
        }
        return dVar.G(lVar, i3, obj, j3, obj2, z3);
    }

    public static void u(d dVar) {
        dVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if ((atomicLongFieldUpdater.addAndGet(dVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(dVar) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(l lVar, int i3, long j3, O1.d dVar) {
        c cVar;
        int i4;
        k kVar;
        j2.p pVar;
        int i5;
        l lVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i6 = cVar.g;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.g = i6 - Integer.MIN_VALUE;
                Object obj = cVar.f3042e;
                P1.a aVar = P1.a.f784b;
                i4 = cVar.g;
                boolean z3 = true;
                if (i4 != 0) {
                    z.m0(obj);
                    cVar.getClass();
                    cVar.getClass();
                    cVar.g = 1;
                    C0124f g3 = AbstractC0139v.g(v0.f.y(cVar));
                    try {
                        s sVar = new s(g3);
                        Object F2 = F(lVar, i3, j3, sVar);
                        if (F2 == f.f3062m) {
                            sVar.a(lVar, i3);
                        } else {
                            Object obj2 = f.f3064o;
                            W1.l lVar3 = this.c;
                            O1.i iVar = g3.f2802f;
                            if (F2 == obj2) {
                                if (j3 < t()) {
                                    lVar.a();
                                }
                                l lVar4 = (l) f3047i.get(this);
                                while (true) {
                                    if (v(f3044d.get(this), z3)) {
                                        g3.c(new k(new i(r())));
                                        break;
                                    }
                                    long andIncrement = f3045e.getAndIncrement(this);
                                    long j4 = f.f3054b;
                                    long j5 = andIncrement / j4;
                                    int i7 = (int) (andIncrement % j4);
                                    if (lVar4.f3540d != j5) {
                                        l q3 = q(j5, lVar4);
                                        if (q3 != null) {
                                            lVar2 = q3;
                                        }
                                    } else {
                                        lVar2 = lVar4;
                                    }
                                    l lVar5 = lVar2;
                                    Object F3 = F(lVar2, i7, andIncrement, sVar);
                                    if (F3 == f.f3062m) {
                                        sVar.a(lVar5, i7);
                                        break;
                                    }
                                    if (F3 == f.f3064o) {
                                        if (andIncrement < t()) {
                                            lVar5.a();
                                        }
                                        lVar4 = lVar5;
                                        z3 = true;
                                    } else {
                                        if (F3 == f.f3063n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        lVar5.a();
                                        kVar = new k(F3);
                                        pVar = lVar3 != null ? new j2.p(lVar3, F3, iVar) : null;
                                        i5 = g3.f2766d;
                                    }
                                }
                            } else {
                                lVar.a();
                                kVar = new k(F2);
                                pVar = lVar3 != null ? new j2.p(lVar3, F2, iVar) : null;
                                i5 = g3.f2766d;
                            }
                            g3.y(kVar, i5, pVar);
                        }
                        obj = g3.q();
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        g3.x();
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z.m0(obj);
                }
                return ((k) obj).f3074a;
            }
        }
        cVar = new c(this, dVar);
        Object obj3 = cVar.f3042e;
        P1.a aVar2 = P1.a.f784b;
        i4 = cVar.g;
        boolean z32 = true;
        if (i4 != 0) {
        }
        return ((k) obj3).f3074a;
    }

    public final void C(l0 l0Var, boolean z3) {
        Throwable s3;
        if (l0Var instanceof InterfaceC0123e) {
            O1.d dVar = (O1.d) l0Var;
            if (z3) {
                s3 = r();
                if (s3 == null) {
                    s3 = new NoSuchElementException("Channel was closed");
                }
            } else {
                s3 = s();
            }
            dVar.c(z.q(s3));
            return;
        }
        if (l0Var instanceof s) {
            ((s) l0Var).f3080b.c(new k(new i(r())));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0124f c0124f = aVar.c;
        X1.g.b(c0124f);
        aVar.c = null;
        aVar.f3038b = f.f3061l;
        Throwable r3 = aVar.f3039d.r();
        if (r3 == null) {
            c0124f.c(Boolean.FALSE);
        } else {
            c0124f.c(z.q(r3));
        }
    }

    public final boolean D(Object obj, Object obj2) {
        boolean z3 = obj instanceof s;
        W1.l lVar = this.c;
        if (z3) {
            X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0124f c0124f = ((s) obj).f3080b;
            return f.a(c0124f, new k(obj2), lVar != null ? new j2.p(lVar, obj2, c0124f.f2802f) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC0123e) {
                X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC0123e interfaceC0123e = (InterfaceC0123e) obj;
                return f.a(interfaceC0123e, obj2, lVar != null ? new j2.p(lVar, obj2, ((C0124f) interfaceC0123e).f2802f) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        X1.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0124f c0124f2 = aVar.c;
        X1.g.b(c0124f2);
        aVar.c = null;
        aVar.f3038b = obj2;
        Boolean bool = Boolean.TRUE;
        W1.l lVar2 = aVar.f3039d.c;
        return f.a(c0124f2, bool, lVar2 != null ? new j2.p(lVar2, obj2, c0124f2.f2802f) : null);
    }

    public final Object F(l lVar, int i3, long j3, Object obj) {
        Object k2 = lVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = lVar.g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3044d;
        if (k2 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f3063n;
                }
                if (lVar.j(k2, i3, obj)) {
                    p();
                    return f.f3062m;
                }
            }
        } else if (k2 == f.f3055d && lVar.j(k2, i3, f.f3058i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            lVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k3 = lVar.k(i3);
            if (k3 == null || k3 == f.f3056e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (lVar.j(k3, i3, f.h)) {
                        p();
                        return f.f3064o;
                    }
                } else {
                    if (obj == null) {
                        return f.f3063n;
                    }
                    if (lVar.j(k3, i3, obj)) {
                        p();
                        return f.f3062m;
                    }
                }
            } else {
                if (k3 != f.f3055d) {
                    d1.f fVar = f.f3059j;
                    if (k3 != fVar && k3 != f.h) {
                        if (k3 == f.f3061l) {
                            p();
                            return f.f3064o;
                        }
                        if (k3 != f.g && lVar.j(k3, i3, f.f3057f)) {
                            boolean z3 = k3 instanceof v;
                            if (z3) {
                                k3 = ((v) k3).f3081a;
                            }
                            if (E(k3)) {
                                lVar.n(i3, f.f3058i);
                                p();
                                Object obj3 = atomicReferenceArray.get(i3 * 2);
                                lVar.m(i3, null);
                                return obj3;
                            }
                            lVar.n(i3, fVar);
                            lVar.l(i3, false);
                            if (z3) {
                                p();
                            }
                            return f.f3064o;
                        }
                    }
                    return f.f3064o;
                }
                if (lVar.j(k3, i3, f.f3058i)) {
                    p();
                    Object obj4 = atomicReferenceArray.get(i3 * 2);
                    lVar.m(i3, null);
                    return obj4;
                }
            }
        }
    }

    public final int G(l lVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k2 = lVar.k(i3);
            if (k2 == null) {
                if (!i(j3) || z3) {
                    if (z3) {
                        if (lVar.j(null, i3, f.f3059j)) {
                            lVar.l(i3, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.j(null, i3, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.j(null, i3, f.f3055d)) {
                    return 1;
                }
            } else {
                if (k2 != f.f3056e) {
                    d1.f fVar = f.f3060k;
                    if (k2 == fVar) {
                        lVar.m(i3, null);
                        return 5;
                    }
                    if (k2 == f.h) {
                        lVar.m(i3, null);
                        return 5;
                    }
                    if (k2 == f.f3061l) {
                        lVar.m(i3, null);
                        d();
                        return 4;
                    }
                    lVar.m(i3, null);
                    if (k2 instanceof v) {
                        k2 = ((v) k2).f3081a;
                    }
                    if (D(k2, obj)) {
                        lVar.n(i3, f.f3058i);
                        return 0;
                    }
                    if (lVar.g.getAndSet((i3 * 2) + 1, fVar) != fVar) {
                        lVar.l(i3, true);
                    }
                    return 5;
                }
                if (lVar.j(k2, i3, f.f3055d)) {
                    return 1;
                }
            }
        }
    }

    public final void H(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        if (x()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f3046f;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int i3 = f.c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
            if (i4 >= i3) {
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(this);
                    long j7 = atomicLongFieldUpdater2.get(this);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z3 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j7, j8 + 4611686018427387904L);
                    }
                }
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                return;
            }
            long j9 = atomicLongFieldUpdater.get(this);
            if (j9 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j9 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // g2.t
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    @Override // g2.u
    public final boolean d() {
        return v(f3044d.get(this), false);
    }

    @Override // g2.u
    public final void e(L1.a aVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f3050l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d1.f fVar = f.f3066q;
            if (obj != fVar) {
                if (obj == f.f3067r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            d1.f fVar2 = f.f3067r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, fVar, fVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != fVar) {
                    break;
                }
            }
            aVar.h(r());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ee, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        c(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:
    
        r2.x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // g2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(O1.d dVar, Object obj) {
        l lVar;
        Object obj2;
        C0124f c0124f;
        C0124f c0124f2;
        K1.h hVar;
        C0124f c0124f3;
        l lVar2;
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        l lVar3 = (l) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3044d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean v3 = v(andIncrement, false);
            int i3 = f.f3054b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            long j6 = lVar3.f3540d;
            K1.h hVar2 = K1.h.f605a;
            P1.a aVar = P1.a.f784b;
            if (j6 != j5) {
                l b3 = b(this, j5, lVar3);
                if (b3 != null) {
                    lVar = b3;
                } else if (v3) {
                    obj2 = z(dVar, obj);
                    if (obj2 != aVar) {
                        return hVar2;
                    }
                }
            } else {
                lVar = lVar3;
            }
            int f3 = f(this, lVar, i4, obj, j3, null, v3);
            if (f3 == 0) {
                lVar.a();
                return hVar2;
            }
            if (f3 == 1) {
                break;
            }
            if (f3 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3045e;
                if (f3 == 3) {
                    C0124f g3 = AbstractC0139v.g(v0.f.y(dVar));
                    l lVar4 = lVar;
                    try {
                        int f4 = f(this, lVar4, i4, obj, j3, g3, false);
                        try {
                            if (f4 != 0) {
                                if (f4 != 1) {
                                    if (f4 == 2) {
                                        c0124f2 = g3;
                                        hVar = hVar2;
                                        c0124f2.a(lVar, i4 + i3);
                                    } else if (f4 == 4) {
                                        c0124f2 = g3;
                                        hVar = hVar2;
                                        if (j3 < atomicLongFieldUpdater2.get(this)) {
                                            lVar.a();
                                        }
                                        c(this, obj, c0124f2);
                                    } else {
                                        if (f4 != 5) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        lVar.a();
                                        l lVar5 = (l) atomicReferenceFieldUpdater.get(this);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean v4 = v(andIncrement2, false);
                                            int i5 = f.f3054b;
                                            long j8 = i5;
                                            long j9 = j7 / j8;
                                            int i6 = (int) (j7 % j8);
                                            if (lVar5.f3540d != j9) {
                                                try {
                                                    l b4 = b(this, j9, lVar5);
                                                    if (b4 != null) {
                                                        c0124f3 = g3;
                                                        lVar2 = b4;
                                                    } else if (v4) {
                                                        break;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    C0124f c0124f4 = g3;
                                                }
                                            } else {
                                                c0124f3 = g3;
                                                lVar2 = lVar5;
                                            }
                                            g3 = c0124f3;
                                            l lVar6 = lVar2;
                                            int f5 = f(this, lVar2, i6, obj, j7, g3, v4);
                                            if (f5 == 0) {
                                                c0124f2 = g3;
                                                hVar = hVar2;
                                                lVar6.a();
                                                break;
                                            }
                                            if (f5 == 1) {
                                                break;
                                            }
                                            if (f5 == 2) {
                                                c0124f2 = g3;
                                                obj3 = obj;
                                                if (v4) {
                                                    lVar6.h();
                                                } else {
                                                    c0124f2.a(lVar6, i6 + i5);
                                                }
                                            } else {
                                                if (f5 == 3) {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                                if (f5 == 4) {
                                                    break;
                                                }
                                                if (f5 == 5) {
                                                    lVar6.a();
                                                }
                                                lVar5 = lVar6;
                                            }
                                        }
                                        c(this, obj3, c0124f2);
                                        hVar = hVar2;
                                    }
                                    obj2 = c0124f2.q();
                                    if (obj2 != aVar) {
                                        obj2 = hVar;
                                    }
                                    if (obj2 != aVar) {
                                        return hVar;
                                    }
                                }
                                c0124f2 = g3;
                                hVar = hVar2;
                                c0124f2.c(hVar);
                                obj2 = c0124f2.q();
                                if (obj2 != aVar) {
                                }
                                if (obj2 != aVar) {
                                }
                            } else {
                                c0124f2 = g3;
                                hVar = hVar2;
                                lVar.a();
                            }
                            c0124f2.c(hVar);
                            obj2 = c0124f2.q();
                            if (obj2 != aVar) {
                            }
                            if (obj2 != aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0124f = lVar4;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c0124f = g3;
                    }
                } else if (f3 != 4) {
                    if (f3 == 5) {
                        lVar.a();
                    }
                    lVar3 = lVar;
                } else {
                    if (j3 < atomicLongFieldUpdater2.get(this)) {
                        lVar.a();
                    }
                    Object z3 = z(dVar, obj);
                    if (z3 == aVar) {
                        return z3;
                    }
                }
            } else {
                if (!v3) {
                    return hVar2;
                }
                lVar.h();
                obj2 = z(dVar, obj);
                if (obj2 != aVar) {
                    return hVar2;
                }
            }
        }
        return obj2;
    }

    @Override // g2.t
    public final Object h() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3045e;
        long j3 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3044d;
        long j4 = atomicLongFieldUpdater2.get(this);
        if (v(j4, true)) {
            return new i(r());
        }
        long j5 = j4 & 1152921504606846975L;
        Object obj = k.f3073b;
        if (j3 >= j5) {
            return obj;
        }
        Object obj2 = f.f3060k;
        l lVar = (l) f3047i.get(this);
        while (!v(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = f.f3054b;
            long j7 = andIncrement / j6;
            int i3 = (int) (andIncrement % j6);
            if (lVar.f3540d != j7) {
                l q3 = q(j7, lVar);
                if (q3 == null) {
                    continue;
                } else {
                    lVar = q3;
                }
            }
            Object F2 = F(lVar, i3, andIncrement, obj2);
            if (F2 == f.f3062m) {
                l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
                if (l0Var != null) {
                    l0Var.a(lVar, i3);
                }
                H(andIncrement);
                lVar.h();
            } else if (F2 == f.f3064o) {
                if (andIncrement < t()) {
                    lVar.a();
                }
            } else {
                if (F2 == f.f3063n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                lVar.a();
                obj = F2;
            }
            return obj;
        }
        return new i(r());
    }

    public final boolean i(long j3) {
        return j3 < f3046f.get(this) || j3 < f3045e.get(this) + ((long) this.f3051b);
    }

    @Override // g2.t
    public final a iterator() {
        return new a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r3 = g2.f.f3068s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r4 = g2.d.f3049k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r4.compareAndSet(r13, r3, r14) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r4.get(r13) == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r15 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r9.compareAndSet(r13, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r11 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        r14 = g2.d.f3050l;
        r15 = r14.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r15 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r0 = g2.f.f3066q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r14.compareAndSet(r13, r15, r0) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r15 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r14.get(r13) == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        X1.m.a(1, r15);
        ((W1.l) r15).h(r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        r0 = g2.f.f3067r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r9.get(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r9.get(r13);
        r14 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r14 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006c, code lost:
    
        if (r9.compareAndSet(r13, r5, (r3 << 60) + r14) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0061, code lost:
    
        r14 = r5 & 1152921504606846975L;
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r7 = g2.f.f3053a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9.compareAndSet(r13, r5, (1 << 60) + (r5 & 1152921504606846975L)) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Throwable th, boolean z3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3044d;
    }

    @Override // g2.u
    public final boolean k(Throwable th) {
        return j(th, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r1;
     */
    @Override // g2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(Object obj) {
        l lVar;
        l lVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3044d;
        boolean v3 = v(atomicLongFieldUpdater.get(this), false);
        j jVar = k.f3073b;
        if (v3 || !(!i(r0 & 1152921504606846975L))) {
            d1.p pVar = f.f3059j;
            l lVar3 = (l) h.get(this);
            while (true) {
                long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
                long j3 = andIncrement & 1152921504606846975L;
                boolean v4 = v(andIncrement, false);
                int i3 = f.f3054b;
                long j4 = i3;
                long j5 = j3 / j4;
                int i4 = (int) (j3 % j4);
                if (lVar3.f3540d != j5) {
                    l b3 = b(this, j5, lVar3);
                    if (b3 != null) {
                        lVar = b3;
                    } else if (v4) {
                        return new i(s());
                    }
                } else {
                    lVar = lVar3;
                }
                l lVar4 = lVar;
                int f3 = f(this, lVar, i4, obj, j3, pVar, v4);
                K1.h hVar = K1.h.f605a;
                if (f3 == 0) {
                    lVar4.a();
                    break;
                }
                if (f3 == 1) {
                    break;
                }
                if (f3 == 2) {
                    if (v4) {
                        lVar4.h();
                        return new i(s());
                    }
                    l0 l0Var = pVar instanceof l0 ? (l0) pVar : null;
                    if (l0Var != null) {
                        lVar2 = lVar4;
                        l0Var.a(lVar2, i4 + i3);
                    } else {
                        lVar2 = lVar4;
                    }
                    lVar2.h();
                    return jVar;
                }
                if (f3 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                }
                if (f3 == 4) {
                    if (j3 < f3045e.get(this)) {
                        lVar4.a();
                    }
                    return new i(s());
                }
                if (f3 == 5) {
                    lVar4.a();
                }
                lVar3 = lVar4;
            }
        } else {
            return jVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (g2.l) ((j2.d) j2.d.c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l m(long j3) {
        Object obj;
        long j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f3048j.get(this);
        l lVar = (l) h.get(this);
        if (lVar.f3540d > ((l) obj2).f3540d) {
            obj2 = lVar;
        }
        l lVar2 = (l) f3047i.get(this);
        if (lVar2.f3540d > ((l) obj2).f3540d) {
            obj2 = lVar2;
        }
        j2.d dVar = (j2.d) obj2;
        loop0: while (true) {
            dVar.getClass();
            Object obj3 = j2.d.f3514b.get(dVar);
            d1.f fVar = j2.a.f3508b;
            obj = null;
            if (obj3 == fVar) {
                break;
            }
            j2.d dVar2 = (j2.d) obj3;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = j2.d.f3514b;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, fVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        l lVar3 = (l) dVar;
        if (w()) {
            l lVar4 = lVar3;
            loop2: do {
                int i3 = f.f3054b - 1;
                while (true) {
                    if (-1 >= i3) {
                        break;
                    }
                    j4 = (lVar4.f3540d * f.f3054b) + i3;
                    if (j4 < f3045e.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object k2 = lVar4.k(i3);
                        if (k2 != null && k2 != f.f3056e) {
                            if (k2 == f.f3055d) {
                                break loop2;
                            }
                        } else {
                            if (lVar4.j(k2, i3, f.f3061l)) {
                                lVar4.h();
                                break;
                            }
                        }
                    }
                    i3--;
                }
            } while (lVar4 != null);
            j4 = -1;
            if (j4 != -1) {
                o(j4);
            }
        }
        loop5: for (l lVar5 = lVar3; lVar5 != null; lVar5 = (l) ((j2.d) j2.d.c.get(lVar5))) {
            for (int i4 = f.f3054b - 1; -1 < i4; i4--) {
                if ((lVar5.f3540d * f.f3054b) + i4 < j3) {
                    break loop5;
                }
                while (true) {
                    Object k3 = lVar5.k(i4);
                    if (k3 != null && k3 != f.f3056e) {
                        if (!(k3 instanceof v)) {
                            if (!(k3 instanceof l0)) {
                                break;
                            }
                            if (lVar5.j(k3, i4, f.f3061l)) {
                                obj = j2.a.g(obj, k3);
                                lVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (lVar5.j(k3, i4, f.f3061l)) {
                                obj = j2.a.g(obj, ((v) k3).f3081a);
                                lVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar5.j(k3, i4, f.f3061l)) {
                            lVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    C((l0) arrayList.get(size), true);
                }
            } else {
                C((l0) obj, true);
            }
        }
        return lVar3;
    }

    @Override // g2.t
    public final Object n(O1.d dVar) {
        return A(this, dVar);
    }

    public final void o(long j3) {
        K1.b b3;
        l lVar = (l) f3047i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3045e;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f3051b + j4, f3046f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = f.f3054b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (lVar.f3540d != j6) {
                    l q3 = q(j6, lVar);
                    if (q3 == null) {
                        continue;
                    } else {
                        lVar = q3;
                    }
                }
                Object F2 = F(lVar, i3, j4, null);
                if (F2 != f.f3064o) {
                    lVar.a();
                    W1.l lVar2 = this.c;
                    if (lVar2 != null && (b3 = j2.a.b(lVar2, F2, null)) != null) {
                        throw b3;
                    }
                } else if (j4 < t()) {
                    lVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00c4, code lost:
    
        if ((r0.addAndGet(r16, r14 - r9) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00cd, code lost:
    
        if ((r0.get(r16) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        Object c;
        if (x()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3048j;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f3046f.getAndIncrement(this);
            long j3 = andIncrement / f.f3054b;
            if (t() <= andIncrement) {
                if (lVar.f3540d < j3 && lVar.b() != null) {
                    y(j3, lVar);
                }
                u(this);
                return;
            }
            if (lVar.f3540d != j3) {
                e eVar = e.f3052j;
                while (true) {
                    c = j2.a.c(lVar, j3);
                    if (!j2.a.f(c)) {
                        j2.u d3 = j2.a.d(c);
                        while (true) {
                            j2.u uVar = (j2.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f3540d >= d3.f3540d) {
                                break;
                            }
                            if (!d3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d3)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (d3.e()) {
                                        d3.d();
                                    }
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                l lVar2 = null;
                if (j2.a.f(c)) {
                    d();
                    y(j3, lVar);
                    u(this);
                } else {
                    l lVar3 = (l) j2.a.d(c);
                    long j4 = lVar3.f3540d;
                    if (j4 > j3) {
                        long j5 = j4 * f.f3054b;
                        if (f3046f.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
                        } else {
                            u(this);
                        }
                    } else {
                        lVar2 = lVar3;
                    }
                }
                if (lVar2 == null) {
                    continue;
                } else {
                    lVar = lVar2;
                }
            }
            int i3 = (int) (andIncrement % f.f3054b);
            Object k2 = lVar.k(i3);
            boolean z3 = k2 instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3045e;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !lVar.j(k2, i3, f.g)) {
                while (true) {
                    Object k3 = lVar.k(i3);
                    if (!(k3 instanceof l0)) {
                        if (k3 != f.f3059j) {
                            if (k3 != null) {
                                if (k3 == f.f3055d || k3 == f.h || k3 == f.f3058i || k3 == f.f3060k || k3 == f.f3061l) {
                                    break loop0;
                                }
                                if (k3 != f.f3057f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k3).toString());
                                }
                            } else if (lVar.j(k3, i3, f.f3056e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (lVar.j(k3, i3, new v((l0) k3))) {
                            break loop0;
                        }
                    } else if (lVar.j(k3, i3, f.g)) {
                        if (E(k3)) {
                            lVar.n(i3, f.f3055d);
                            break;
                        } else {
                            lVar.n(i3, f.f3059j);
                            lVar.l(i3, false);
                        }
                    }
                }
            } else if (E(k2)) {
                lVar.n(i3, f.f3055d);
                break;
            } else {
                lVar.n(i3, f.f3059j);
                lVar.l(i3, false);
                u(this);
            }
        }
        u(this);
    }

    public final l q(long j3, l lVar) {
        Object c;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        l lVar2 = f.f3053a;
        e eVar = e.f3052j;
        loop0: while (true) {
            c = j2.a.c(lVar, j3);
            if (!j2.a.f(c)) {
                j2.u d3 = j2.a.d(c);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3047i;
                    j2.u uVar = (j2.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3540d >= d3.f3540d) {
                        break loop0;
                    }
                    if (!d3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, d3)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (d3.e()) {
                                d3.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (j2.a.f(c)) {
            d();
            if (lVar.f3540d * f.f3054b >= t()) {
                return null;
            }
            lVar.a();
            return null;
        }
        l lVar3 = (l) j2.a.d(c);
        boolean x2 = x();
        long j5 = lVar3.f3540d;
        if (!x2 && j3 <= f3046f.get(this) / f.f3054b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3048j;
                j2.u uVar2 = (j2.u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f3540d >= j5) {
                    break;
                }
                if (!lVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, lVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (lVar3.e()) {
                            lVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j5 <= j3) {
            return lVar3;
        }
        long j6 = f.f3054b * j5;
        do {
            atomicLongFieldUpdater = f3045e;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * f.f3054b >= t()) {
            return null;
        }
        lVar3.a();
        return null;
    }

    public final Throwable r() {
        return (Throwable) f3049k.get(this);
    }

    public final Throwable s() {
        Throwable r3 = r();
        return r3 == null ? new IllegalStateException("Channel was closed") : r3;
    }

    public final long t() {
        return f3044d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:
    
        r3 = (g2.l) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a3, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f3044d.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f3051b + ',');
        sb.append("data=[");
        int i4 = 0;
        List R2 = L1.l.R(f3047i.get(this), h.get(this), f3048j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : R2) {
            if (((l) obj) != f.f3053a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((l) next).f3540d;
            do {
                Object next2 = it.next();
                long j4 = ((l) next2).f3540d;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        l lVar = (l) next;
        long j5 = f3045e.get(this);
        long t3 = t();
        loop2: while (true) {
            int i5 = f.f3054b;
            int i6 = i4;
            while (true) {
                if (i6 >= i5) {
                    break;
                }
                long j6 = (lVar.f3540d * f.f3054b) + i6;
                if (j6 >= t3 && j6 >= j5) {
                    break loop2;
                }
                Object k2 = lVar.k(i6);
                Object obj2 = lVar.g.get(i6 * 2);
                if (k2 instanceof InterfaceC0123e) {
                    str = (j6 >= j5 || j6 < t3) ? (j6 >= t3 || j6 < j5) ? "cont" : "send" : "receive";
                } else if (k2 instanceof s) {
                    str = "receiveCatching";
                } else if (k2 instanceof v) {
                    str = "EB(" + k2 + ')';
                } else if (X1.g.a(k2, f.f3057f) || X1.g.a(k2, f.g)) {
                    str = "resuming_sender";
                } else {
                    if (k2 != null && !X1.g.a(k2, f.f3056e) && !X1.g.a(k2, f.f3058i) && !X1.g.a(k2, f.h) && !X1.g.a(k2, f.f3060k) && !X1.g.a(k2, f.f3059j) && !X1.g.a(k2, f.f3061l)) {
                        str = k2.toString();
                    }
                    i6++;
                }
                if (obj2 != null) {
                    sb.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb.append(str + ',');
                }
                i6++;
            }
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(d2.d.Y(sb)) == ',') {
            X1.g.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
    
        r0 = (g2.l) ((j2.d) j2.d.c.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(long j3, boolean z3) {
        int i3 = (int) (j3 >> 60);
        if (i3 == 0 || i3 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3045e;
        if (i3 == 2) {
            m(j3 & 1152921504606846975L);
            if (z3) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3047i;
                    l lVar = (l) atomicReferenceFieldUpdater.get(this);
                    long j4 = atomicLongFieldUpdater.get(this);
                    if (t() <= j4) {
                        break;
                    }
                    long j5 = f.f3054b;
                    long j6 = j4 / j5;
                    if (lVar.f3540d != j6 && (lVar = q(j6, lVar)) == null) {
                        if (((l) atomicReferenceFieldUpdater.get(this)).f3540d < j6) {
                            break;
                        }
                    } else {
                        lVar.a();
                        int i4 = (int) (j4 % j5);
                        while (true) {
                            Object k2 = lVar.k(i4);
                            if (k2 == null || k2 == f.f3056e) {
                                if (lVar.j(k2, i4, f.h)) {
                                    p();
                                    break;
                                }
                            } else {
                                if (k2 == f.f3055d) {
                                    return false;
                                }
                                if (k2 != f.f3059j && k2 != f.f3061l && k2 != f.f3058i && k2 != f.h) {
                                    if (k2 == f.g) {
                                        return false;
                                    }
                                    if (k2 != f.f3057f && j4 == atomicLongFieldUpdater.get(this)) {
                                        return false;
                                    }
                                }
                            }
                        }
                        f3045e.compareAndSet(this, j4, j4 + 1);
                    }
                }
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException(X.d.f("unexpected close status: ", i3).toString());
            }
            l m3 = m(j3 & 1152921504606846975L);
            K1.b bVar = null;
            Object obj = null;
            loop0: do {
                int i5 = f.f3054b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    long j7 = (m3.f3540d * f.f3054b) + i5;
                    while (true) {
                        Object k3 = m3.k(i5);
                        if (k3 == f.f3058i) {
                            break loop0;
                        }
                        d1.f fVar = f.f3055d;
                        AtomicReferenceArray atomicReferenceArray = m3.g;
                        W1.l lVar2 = this.c;
                        if (k3 == fVar) {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (m3.j(k3, i5, f.f3061l)) {
                                if (lVar2 != null) {
                                    bVar = j2.a.b(lVar2, atomicReferenceArray.get(i5 * 2), bVar);
                                }
                                m3.m(i5, null);
                                m3.h();
                            }
                        } else if (k3 == f.f3056e || k3 == null) {
                            if (m3.j(k3, i5, f.f3061l)) {
                                m3.h();
                                break;
                            }
                        } else if (!(k3 instanceof l0) && !(k3 instanceof v)) {
                            d1.f fVar2 = f.g;
                            if (k3 == fVar2 || k3 == f.f3057f) {
                                break loop0;
                            }
                            if (k3 != fVar2) {
                                break;
                            }
                        } else {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            l0 l0Var = k3 instanceof v ? ((v) k3).f3081a : (l0) k3;
                            if (m3.j(k3, i5, f.f3061l)) {
                                if (lVar2 != null) {
                                    bVar = j2.a.b(lVar2, atomicReferenceArray.get(i5 * 2), bVar);
                                }
                                obj = j2.a.g(obj, l0Var);
                                m3.m(i5, null);
                                m3.h();
                            }
                        }
                    }
                    i5--;
                }
            } while (m3 != null);
            if (obj != null) {
                if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        C((l0) arrayList.get(size), false);
                    }
                } else {
                    C((l0) obj, false);
                }
            }
            if (bVar != null) {
                throw bVar;
            }
        }
        return true;
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j3 = f3046f.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(long j3, l lVar) {
        l lVar2;
        l lVar3;
        while (lVar.f3540d < j3 && (lVar3 = (l) lVar.b()) != null) {
            lVar = lVar3;
        }
        while (true) {
            if (!lVar.c() || (lVar2 = (l) lVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3048j;
                    j2.u uVar = (j2.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3540d >= lVar.f3540d) {
                        return;
                    }
                    if (!lVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, lVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (lVar.e()) {
                                lVar.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                        return;
                    }
                    return;
                }
            }
            lVar = lVar2;
        }
    }

    public final Object z(O1.d dVar, Object obj) {
        K1.b b3;
        C0124f c0124f = new C0124f(1, v0.f.y(dVar));
        c0124f.r();
        W1.l lVar = this.c;
        if (lVar == null || (b3 = j2.a.b(lVar, obj, null)) == null) {
            c0124f.c(z.q(s()));
        } else {
            v0.f.h(b3, s());
            c0124f.c(z.q(b3));
        }
        Object q3 = c0124f.q();
        return q3 == P1.a.f784b ? q3 : K1.h.f605a;
    }
}
