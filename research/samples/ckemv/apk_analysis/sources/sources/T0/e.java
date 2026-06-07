package t0;

import I1.k;
import android.content.Context;
import java.util.LinkedHashSet;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final v0.i f4891a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4892b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f4893d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4894e;

    public e(Context context, v0.i iVar) {
        X1.g.e(iVar, "taskExecutor");
        this.f4891a = iVar;
        Context applicationContext = context.getApplicationContext();
        X1.g.d(applicationContext, "context.applicationContext");
        this.f4892b = applicationContext;
        this.c = new Object();
        this.f4893d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.f4894e;
            if (obj2 == null || !X1.g.a(obj2, obj)) {
                this.f4894e = obj;
                ((ExecutorC0445a) this.f4891a.f5078e).execute(new k(L1.k.Y(this.f4893d), 5, this));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
