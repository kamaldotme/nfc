package w0;

import android.content.Context;
import android.os.Build;
import x0.C0432k;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class r implements Runnable {
    public static final /* synthetic */ int h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0432k f5165b = new Object();
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public final v0.o f5166d;

    /* renamed from: e, reason: collision with root package name */
    public final m0.q f5167e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.i f5168f;
    public final v0.i g;

    static {
        m0.r.b("WorkForegroundRunnable");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.k, java.lang.Object] */
    public r(Context context, v0.o oVar, m0.q qVar, t tVar, v0.i iVar) {
        this.c = context;
        this.f5166d = oVar;
        this.f5167e = qVar;
        this.f5168f = tVar;
        this.g = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [x0.i, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f5166d.f5104q || Build.VERSION.SDK_INT >= 31) {
            this.f5165b.j(null);
            return;
        }
        ?? obj = new Object();
        v0.i iVar = this.g;
        ((ExecutorC0445a) iVar.f5078e).execute(new I1.k(this, 6, obj));
        obj.a(new D0.c(this, obj, 11, false), (ExecutorC0445a) iVar.f5078e);
    }
}
