package l2;

import e2.J;
import e2.r;
import j2.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c extends J implements Executor {

    /* renamed from: d, reason: collision with root package name */
    public static final c f3922d = new r();

    /* renamed from: e, reason: collision with root package name */
    public static final r f3923e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l2.c, e2.r] */
    /* JADX WARN: Type inference failed for: r2v3, types: [j2.i] */
    static {
        l lVar = l.f3935d;
        int i3 = w.f3542a;
        if (64 >= i3) {
            i3 = 64;
        }
        int l3 = j2.a.l("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12);
        lVar.getClass();
        if (l3 < 1) {
            throw new IllegalArgumentException(X.d.f("Expected positive parallelism level, but got ", l3).toString());
        }
        if (l3 < k.f3932d) {
            if (l3 < 1) {
                throw new IllegalArgumentException(X.d.f("Expected positive parallelism level, but got ", l3).toString());
            }
            lVar = new j2.i(lVar, l3);
        }
        f3923e = lVar;
    }

    @Override // e2.r
    public final void I(O1.i iVar, Runnable runnable) {
        f3923e.I(iVar, runnable);
    }

    @Override // e2.r
    public final void J(O1.i iVar, Runnable runnable) {
        f3923e.J(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        I(O1.j.f782b, runnable);
    }

    @Override // e2.r
    public final String toString() {
        return "Dispatchers.IO";
    }
}
