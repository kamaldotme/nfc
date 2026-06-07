package androidx.work.impl.workers;

import B2.u;
import X1.g;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import m0.q;
import m0.r;
import r0.AbstractC0368c;
import r0.C0367b;
import r0.e;
import v0.o;
import x0.C0432k;
import z0.AbstractC0466a;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends q implements e {

    /* renamed from: f, reason: collision with root package name */
    public final WorkerParameters f2212f;
    public final Object g;
    public volatile boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final C0432k f2213i;

    /* renamed from: j, reason: collision with root package name */
    public q f2214j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [x0.k, java.lang.Object] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, "appContext");
        g.e(workerParameters, "workerParameters");
        this.f2212f = workerParameters;
        this.g = new Object();
        this.f2213i = new Object();
    }

    @Override // m0.q
    public final void b() {
        q qVar = this.f2214j;
        if (qVar == null || qVar.f3981d != -256) {
            return;
        }
        qVar.e(Build.VERSION.SDK_INT >= 31 ? this.f3981d : 0);
    }

    @Override // r0.e
    public final void c(o oVar, AbstractC0368c abstractC0368c) {
        g.e(oVar, "workSpec");
        g.e(abstractC0368c, "state");
        r a3 = r.a();
        int i3 = AbstractC0466a.f5312a;
        oVar.toString();
        a3.getClass();
        if (abstractC0368c instanceof C0367b) {
            synchronized (this.g) {
                this.h = true;
            }
        }
    }

    @Override // m0.q
    public final C0432k d() {
        this.c.c.execute(new u(15, this));
        C0432k c0432k = this.f2213i;
        g.d(c0432k, "future");
        return c0432k;
    }
}
