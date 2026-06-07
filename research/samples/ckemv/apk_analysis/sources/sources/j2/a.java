package j2;

import e2.AbstractC0139v;
import e2.C0131m;
import e2.C0132n;
import e2.C0136s;
import e2.I;
import e2.Q;
import e2.Z;
import e2.g0;
import e2.h0;
import e2.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a {
    public static final d1.f c;

    /* renamed from: d, reason: collision with root package name */
    public static final d1.f f3509d;

    /* renamed from: a, reason: collision with root package name */
    public static final d1.f f3507a = new d1.f("NO_DECISION", 4);

    /* renamed from: b, reason: collision with root package name */
    public static final d1.f f3508b = new d1.f("CLOSED", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final d1.f f3510e = new d1.f("CONDITION_FALSE", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final d1.f f3511f = new d1.f("NO_THREAD_ELEMENTS", 4);

    static {
        int i3 = 4;
        c = new d1.f("UNDEFINED", i3);
        f3509d = new d1.f("REUSABLE_CLAIMED", i3);
    }

    public static final void a(W1.l lVar, Object obj, O1.i iVar) {
        K1.b b3 = b(lVar, obj, null);
        if (b3 != null) {
            AbstractC0139v.h(iVar, b3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [K1.b, java.lang.RuntimeException] */
    public static final K1.b b(W1.l lVar, Object obj, K1.b bVar) {
        try {
            lVar.h(obj);
        } catch (Throwable th) {
            if (bVar == null || bVar.getCause() == th) {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
            v0.f.h(bVar, th);
        }
        return bVar;
    }

    public static final Object c(u uVar, long j3) {
        g2.e eVar = g2.e.f3052j;
        while (true) {
            long j4 = uVar.f3540d;
            if (j4 >= j3 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f3514b.get(uVar);
            d1.f fVar = f3508b;
            if (obj == fVar) {
                return fVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 != null) {
                uVar = uVar2;
            } else {
                u uVar3 = (u) eVar.e(Long.valueOf(j4 + 1), uVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f3514b;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar3)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                        uVar = uVar3;
                    } else if (atomicReferenceFieldUpdater.get(uVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final u d(Object obj) {
        if (obj == f3508b) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        X1.g.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (u) obj;
    }

    public static final void e(O1.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f3516a.iterator();
        while (it.hasNext()) {
            try {
                ((f2.b) it.next()).I(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    v0.f.h(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            v0.f.h(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f3508b;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(O1.i iVar, Object obj) {
        if (obj == f3511f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object D = iVar.D(null, x.f3544e);
            X1.g.c(D, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            X.d.n(D);
            throw null;
        }
        z zVar = (z) obj;
        g0[] g0VarArr = zVar.f3549b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        X1.g.b(null);
        Object obj2 = zVar.f3548a[length];
        throw null;
    }

    public static final void i(O1.d dVar, Object obj, W1.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.c(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a3 = K1.e.a(obj);
        Object c0132n = a3 == null ? lVar != null ? new C0132n(obj, lVar) : obj : new C0131m(a3, false);
        e2.r rVar = hVar.f3519e;
        O1.d dVar2 = hVar.f3520f;
        dVar2.j();
        if (rVar.K()) {
            hVar.g = c0132n;
            hVar.f2766d = 1;
            hVar.f3519e.I(dVar2.j(), hVar);
            return;
        }
        I a4 = h0.a();
        if (a4.P()) {
            hVar.g = c0132n;
            hVar.f2766d = 1;
            a4.M(hVar);
            return;
        }
        a4.O(true);
        try {
            Q q3 = (Q) dVar2.j().A(C0136s.c);
            if (q3 == null || q3.b()) {
                Object obj2 = hVar.h;
                O1.i j3 = dVar2.j();
                Object n3 = n(j3, obj2);
                j0 o3 = n3 != f3511f ? AbstractC0139v.o(dVar2, j3, n3) : null;
                try {
                    dVar2.c(obj);
                } finally {
                    if (o3 == null || o3.Y()) {
                        h(j3, n3);
                    }
                }
            } else {
                CancellationException B3 = ((Z) q3).B();
                hVar.b(c0132n, B3);
                hVar.c(m0.z.q(B3));
            }
            do {
            } while (a4.Q());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long k(String str, long j3, long j4, long j5) {
        String str2;
        int i3;
        Long valueOf;
        long j6;
        int i4 = w.f3542a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        v0.f.n(10);
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j7 = -9223372036854775807L;
            if (X1.g.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '-') {
                        j7 = Long.MIN_VALUE;
                        i5 = 1;
                    } else if (charAt == '+') {
                        i3 = 0;
                        i5 = 1;
                        long j8 = 0;
                        long j9 = -256204778801521550L;
                        while (i5 < length) {
                            int digit = Character.digit((int) str2.charAt(i5), 10);
                            if (digit >= 0) {
                                if (j8 < j9) {
                                    if (j9 == -256204778801521550L) {
                                        j9 = j7 / 10;
                                        if (j8 < j9) {
                                        }
                                    }
                                }
                                long j10 = j8 * 10;
                                long j11 = digit;
                                if (j10 >= j7 + j11) {
                                    j8 = j10 - j11;
                                    i5++;
                                }
                            }
                        }
                        valueOf = i3 == 0 ? Long.valueOf(j8) : Long.valueOf(-j8);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j4 <= longValue) {
                            j6 = j5;
                            if (longValue <= j6) {
                                return longValue;
                            }
                        } else {
                            j6 = j5;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j6 + ", but is '" + longValue + '\'').toString());
                    }
                }
            }
            i3 = i5;
            long j82 = 0;
            long j92 = -256204778801521550L;
            while (i5 < length) {
            }
            valueOf = i3 == 0 ? Long.valueOf(j82) : Long.valueOf(-j82);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int l(String str, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) k(str, i3, i4, i5);
    }

    public static final Object m(O1.i iVar) {
        Object D = iVar.D(0, x.f3543d);
        X1.g.b(D);
        return D;
    }

    public static final Object n(O1.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f3511f;
        }
        if (obj instanceof Integer) {
            return iVar.D(new z(((Number) obj).intValue(), iVar), x.f3545f);
        }
        X.d.q(obj);
        throw null;
    }
}
