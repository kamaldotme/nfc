package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import f.AbstractActivityC0159g;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f1448e;

    /* renamed from: b, reason: collision with root package name */
    public final long f1446b = SystemClock.uptimeMillis() + 10000;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1447d = false;

    public j(AbstractActivityC0159g abstractActivityC0159g) {
        this.f1448e = abstractActivityC0159g;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c = runnable;
        View decorView = this.f1448e.getWindow().getDecorView();
        if (!this.f1447d) {
            decorView.postOnAnimation(new B2.u(7, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.c;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f1446b) {
                this.f1447d = false;
                this.f1448e.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.c = null;
        l lVar = this.f1448e.f1454j;
        synchronized (lVar.c) {
            z3 = lVar.f1463b;
        }
        if (z3) {
            this.f1447d = false;
            this.f1448e.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1448e.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
