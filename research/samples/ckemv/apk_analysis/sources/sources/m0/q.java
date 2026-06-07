package m0;

import a1.InterfaceFutureC0061a;
import android.content.Context;
import androidx.work.WorkerParameters;
import x0.C0432k;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3980b;
    public final WorkerParameters c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f3981d = -256;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3982e;

    public q(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f3980b = context;
        this.c = workerParameters;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.k, java.lang.Object, a1.a] */
    public InterfaceFutureC0061a a() {
        ?? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public void b() {
    }

    public abstract C0432k d();

    public final void e(int i3) {
        this.f3981d = i3;
        b();
    }
}
