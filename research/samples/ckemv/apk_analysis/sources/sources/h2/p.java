package h2;

import j2.v;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import m0.z;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final d1.f f3122a = new d1.f("NONE", 4);

    /* renamed from: b, reason: collision with root package name */
    public static final d1.f f3123b = new d1.f("PENDING", 4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0055, B:19:0x006a, B:21:0x0072, B:23:0x0078, B:25:0x007e, B:28:0x008f, B:30:0x0097, B:31:0x009e, B:32:0x00a0, B:33:0x00a1, B:34:0x00ac, B:42:0x0048, B:44:0x004f), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v2, types: [h2.h, O1.d] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v14, types: [g2.a] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r2v1, types: [h2.g] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v4, types: [g2.t] */
    /* JADX WARN: Type inference failed for: r9v6, types: [g2.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008c -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, g2.q qVar, boolean z3, O1.d dVar) {
        ?? r02;
        int i3;
        g2.q qVar2;
        g2.a aVar;
        ?? r22;
        ?? r11;
        g2.q qVar3;
        Object b3;
        try {
            if (dVar instanceof h) {
                h hVar = (h) dVar;
                int i4 = hVar.f3110j;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hVar.f3110j = i4 - Integer.MIN_VALUE;
                    r02 = hVar;
                    Object obj = r02.f3109i;
                    P1.a aVar2 = P1.a.f784b;
                    i3 = r02.f3110j;
                    if (i3 != 0) {
                        z.m0(obj);
                        g2.a it = qVar.f3079e.iterator();
                        qVar3 = qVar;
                        r11 = it;
                        r02.f3107e = gVar;
                        r02.f3108f = qVar3;
                        r02.g = r11;
                        r02.h = z3;
                        r02.f3110j = 1;
                        b3 = r11.b(r02);
                        if (b3 == aVar2) {
                        }
                    } else if (i3 == 1) {
                        z3 = r02.h;
                        aVar = r02.g;
                        ?? r9 = r02.f3108f;
                        g gVar2 = r02.f3107e;
                        z.m0(obj);
                        r22 = gVar2;
                        qVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = r02.h;
                        aVar = r02.g;
                        ?? r92 = r02.f3108f;
                        g gVar3 = r02.f3107e;
                        z.m0(obj);
                        g gVar4 = gVar3;
                        g2.q qVar4 = r92;
                        r11 = aVar;
                        gVar = gVar4;
                        qVar3 = qVar4;
                        r02.f3107e = gVar;
                        r02.f3108f = qVar3;
                        r02.g = r11;
                        r02.h = z3;
                        r02.f3110j = 1;
                        b3 = r11.b(r02);
                        if (b3 == aVar2) {
                            return aVar2;
                        }
                        r22 = gVar;
                        aVar = r11;
                        obj = b3;
                        qVar2 = qVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z3) {
                                qVar2.a(null);
                            }
                            return K1.h.f605a;
                        }
                        Object obj2 = aVar.f3038b;
                        d1.f fVar = g2.f.f3065p;
                        if (obj2 == fVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
                        }
                        aVar.f3038b = fVar;
                        if (obj2 == g2.f.f3061l) {
                            Throwable r3 = aVar.f3039d.r();
                            if (r3 == null) {
                                r3 = new NoSuchElementException("Channel was closed");
                            }
                            int i5 = v.f3541a;
                            throw r3;
                        }
                        r02.f3107e = r22;
                        r02.f3108f = qVar2;
                        r02.g = aVar;
                        r02.h = z3;
                        r02.f3110j = 2;
                        Object b4 = r22.b(r02, obj2);
                        gVar4 = r22;
                        qVar4 = qVar2;
                        if (b4 == aVar2) {
                            return aVar2;
                        }
                        r11 = aVar;
                        gVar = gVar4;
                        qVar3 = qVar4;
                        r02.f3107e = gVar;
                        r02.f3108f = qVar3;
                        r02.g = r11;
                        r02.h = z3;
                        r02.f3110j = 1;
                        b3 = r11.b(r02);
                        if (b3 == aVar2) {
                        }
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z3) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    qVar.a(cancellationException);
                }
                throw th2;
            }
        }
        r02 = new Q1.b(dVar);
        Object obj3 = r02.f3109i;
        P1.a aVar22 = P1.a.f784b;
        i3 = r02.f3110j;
    }
}
