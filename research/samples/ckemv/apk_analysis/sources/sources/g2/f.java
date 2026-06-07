package g2;

import e2.AbstractC0139v;
import e2.C0124f;
import e2.C0130l;
import e2.InterfaceC0123e;
import e2.d0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l f3053a = new l(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3054b = j2.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = j2.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final d1.f f3055d = new d1.f("BUFFERED", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final d1.f f3056e = new d1.f("SHOULD_BUFFER", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final d1.f f3057f = new d1.f("S_RESUMING_BY_RCV", 4);
    public static final d1.f g = new d1.f("RESUMING_BY_EB", 4);
    public static final d1.f h = new d1.f("POISONED", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final d1.f f3058i = new d1.f("DONE_RCV", 4);

    /* renamed from: j, reason: collision with root package name */
    public static final d1.f f3059j = new d1.f("INTERRUPTED_SEND", 4);

    /* renamed from: k, reason: collision with root package name */
    public static final d1.f f3060k = new d1.f("INTERRUPTED_RCV", 4);

    /* renamed from: l, reason: collision with root package name */
    public static final d1.f f3061l = new d1.f("CHANNEL_CLOSED", 4);

    /* renamed from: m, reason: collision with root package name */
    public static final d1.f f3062m = new d1.f("SUSPEND", 4);

    /* renamed from: n, reason: collision with root package name */
    public static final d1.f f3063n = new d1.f("SUSPEND_NO_WAITER", 4);

    /* renamed from: o, reason: collision with root package name */
    public static final d1.f f3064o = new d1.f("FAILED", 4);

    /* renamed from: p, reason: collision with root package name */
    public static final d1.f f3065p = new d1.f("NO_RECEIVE_RESULT", 4);

    /* renamed from: q, reason: collision with root package name */
    public static final d1.f f3066q = new d1.f("CLOSE_HANDLER_CLOSED", 4);

    /* renamed from: r, reason: collision with root package name */
    public static final d1.f f3067r = new d1.f("CLOSE_HANDLER_INVOKED", 4);

    /* renamed from: s, reason: collision with root package name */
    public static final d1.f f3068s = new d1.f("NO_CLOSE_CAUSE", 4);

    public static final boolean a(InterfaceC0123e interfaceC0123e, Object obj, W1.l lVar) {
        d1.f fVar;
        C0124f c0124f = (C0124f) interfaceC0123e;
        c0124f.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0124f.h;
            Object obj2 = atomicReferenceFieldUpdater.get(c0124f);
            boolean z3 = obj2 instanceof d0;
            fVar = AbstractC0139v.f2822a;
            if (!z3) {
                boolean z4 = obj2 instanceof C0130l;
                fVar = null;
                break;
            }
            Object A3 = C0124f.A((d0) obj2, obj, c0124f.f2766d, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(c0124f, obj2, A3)) {
                if (atomicReferenceFieldUpdater.get(c0124f) != obj2) {
                    break;
                }
            }
            if (!c0124f.v()) {
                c0124f.o();
            }
        }
        if (fVar == null) {
            return false;
        }
        c0124f.p(c0124f.f2766d);
        return true;
    }
}
