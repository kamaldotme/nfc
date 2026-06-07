package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.z;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Context f1788b;
    public final G.e c;

    /* renamed from: d, reason: collision with root package name */
    public final U0.e f1789d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1790e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f1791f;
    public Executor g;
    public ThreadPoolExecutor h;

    /* renamed from: i, reason: collision with root package name */
    public z f1792i;

    public p(Context context, G.e eVar) {
        U0.e eVar2 = q.f1793d;
        this.f1790e = new Object();
        z.k(context, "Context cannot be null");
        this.f1788b = context.getApplicationContext();
        this.c = eVar;
        this.f1789d = eVar2;
    }

    public final void a() {
        synchronized (this.f1790e) {
            try {
                this.f1792i = null;
                Handler handler = this.f1791f;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f1791f = null;
                ThreadPoolExecutor threadPoolExecutor = this.h;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.g = null;
                this.h = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f1790e) {
            try {
                if (this.f1792i == null) {
                    return;
                }
                if (this.g == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.h = threadPoolExecutor;
                    this.g = threadPoolExecutor;
                }
                this.g.execute(new B2.u(9, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G.j c() {
        try {
            U0.e eVar = this.f1789d;
            Context context = this.f1788b;
            G.e eVar2 = this.c;
            eVar.getClass();
            F0.e a3 = G.d.a(context, eVar2);
            int i3 = a3.f166b;
            if (i3 != 0) {
                throw new RuntimeException(X.d.g("fetchFonts failed (", i3, ")"));
            }
            G.j[] jVarArr = (G.j[]) a3.c;
            if (jVarArr == null || jVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return jVarArr[0];
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException("provider not found", e3);
        }
    }

    @Override // androidx.emoji2.text.i
    public final void j(z zVar) {
        synchronized (this.f1790e) {
            this.f1792i = zVar;
        }
        b();
    }
}
