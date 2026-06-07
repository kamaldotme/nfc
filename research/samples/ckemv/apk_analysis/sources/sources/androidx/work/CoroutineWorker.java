package androidx.work;

import B2.u;
import X1.g;
import a1.InterfaceFutureC0061a;
import android.content.Context;
import e2.AbstractC0139v;
import e2.B;
import e2.U;
import f.ExecutorC0145B;
import j2.e;
import l2.d;
import m0.f;
import m0.l;
import m0.p;
import m0.q;
import m0.z;
import x0.C0432k;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends q {

    /* renamed from: f, reason: collision with root package name */
    public final U f2183f;
    public final C0432k g;
    public final d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [x0.k, x0.i, java.lang.Object] */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, "appContext");
        g.e(workerParameters, "params");
        this.f2183f = AbstractC0139v.b();
        ?? obj = new Object();
        this.g = obj;
        obj.a(new u(13, this), (ExecutorC0145B) workerParameters.f2187d.f5076b);
        this.h = B.f2767a;
    }

    @Override // m0.q
    public final InterfaceFutureC0061a a() {
        U b3 = AbstractC0139v.b();
        d dVar = this.h;
        dVar.getClass();
        e a3 = AbstractC0139v.a(z.a0(dVar, b3));
        l lVar = new l(b3);
        AbstractC0139v.k(a3, 0, new m0.e(lVar, this, null), 3);
        return lVar;
    }

    @Override // m0.q
    public final void b() {
        this.g.cancel(false);
    }

    @Override // m0.q
    public final C0432k d() {
        d dVar = this.h;
        dVar.getClass();
        AbstractC0139v.k(AbstractC0139v.a(u2.d.x(dVar, this.f2183f)), 0, new f(this, null), 3);
        return this.g;
    }

    public abstract p f();
}
