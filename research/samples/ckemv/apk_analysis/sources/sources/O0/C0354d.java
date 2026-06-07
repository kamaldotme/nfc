package o0;

import I1.k;
import X1.g;
import android.os.Handler;
import f.C0150G;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import n0.m;
import v0.C0403c;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354d {

    /* renamed from: a, reason: collision with root package name */
    public final C0150G f4287a;

    /* renamed from: b, reason: collision with root package name */
    public final C0403c f4288b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4289d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f4290e;

    public C0354d(C0150G c0150g, C0403c c0403c) {
        g.e(c0150g, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f4287a = c0150g;
        this.f4288b = c0403c;
        this.c = millis;
        this.f4289d = new Object();
        this.f4290e = new LinkedHashMap();
    }

    public final void a(m mVar) {
        Runnable runnable;
        g.e(mVar, "token");
        synchronized (this.f4289d) {
            runnable = (Runnable) this.f4290e.remove(mVar);
        }
        if (runnable != null) {
            ((Handler) this.f4287a.f2846b).removeCallbacks(runnable);
        }
    }

    public final void b(m mVar) {
        k kVar = new k(this, 4, mVar);
        synchronized (this.f4289d) {
        }
        C0150G c0150g = this.f4287a;
        ((Handler) c0150g.f2846b).postDelayed(kVar, this.c);
    }
}
