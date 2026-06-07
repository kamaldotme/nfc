package w0;

import android.content.Context;
import java.util.UUID;
import u0.C0393c;
import x0.C0422a;
import x0.C0432k;

/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0432k f5169b;
    public final /* synthetic */ UUID c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0.h f5170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f5171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f5172f;

    public s(t tVar, C0432k c0432k, UUID uuid, m0.h hVar, Context context) {
        this.f5172f = tVar;
        this.f5169b = c0432k;
        this.c = uuid;
        this.f5170d = hVar;
        this.f5171e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f5169b.f5210a instanceof C0422a)) {
                String uuid = this.c.toString();
                v0.o i3 = this.f5172f.c.i(uuid);
                if (i3 == null || X.d.d(i3.f5092b)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((n0.g) this.f5172f.f5174b).g(uuid, this.f5170d);
                this.f5171e.startService(C0393c.a(this.f5171e, u2.d.k(i3), this.f5170d));
            }
            this.f5169b.j(null);
        } catch (Throwable th) {
            this.f5169b.k(th);
        }
    }
}
