package t0;

import android.content.Context;
import android.net.ConnectivityManager;
import m0.r;
import w0.l;

/* loaded from: classes.dex */
public final class h extends e {

    /* renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f4897f;
    public final g g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, v0.i iVar) {
        super(context, iVar);
        X1.g.e(iVar, "taskExecutor");
        Object systemService = this.f4892b.getSystemService("connectivity");
        X1.g.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f4897f = (ConnectivityManager) systemService;
        this.g = new g(this);
    }

    @Override // t0.e
    public final Object a() {
        return i.a(this.f4897f);
    }

    @Override // t0.e
    public final void c() {
        try {
            r a3 = r.a();
            int i3 = i.f4898a;
            a3.getClass();
            l.a(this.f4897f, this.g);
        } catch (IllegalArgumentException unused) {
            r a4 = r.a();
            int i4 = i.f4898a;
            a4.getClass();
        } catch (SecurityException unused2) {
            r a5 = r.a();
            int i5 = i.f4898a;
            a5.getClass();
        }
    }

    @Override // t0.e
    public final void d() {
        try {
            r a3 = r.a();
            int i3 = i.f4898a;
            a3.getClass();
            w0.j.c(this.f4897f, this.g);
        } catch (IllegalArgumentException unused) {
            r a4 = r.a();
            int i4 = i.f4898a;
            a4.getClass();
        } catch (SecurityException unused2) {
            r a5 = r.a();
            int i5 = i.f4898a;
            a5.getClass();
        }
    }
}
