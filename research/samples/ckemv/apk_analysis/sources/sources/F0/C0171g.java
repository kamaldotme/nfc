package f0;

import J1.l;
import a.AbstractC0059a;
import android.content.Context;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171g implements e0.c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f3020b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final l f3021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3022e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3023f;
    public final K1.f g;
    public boolean h;

    public C0171g(Context context, String str, l lVar, boolean z3, boolean z4) {
        X1.g.e(context, "context");
        X1.g.e(lVar, "callback");
        this.f3020b = context;
        this.c = str;
        this.f3021d = lVar;
        this.f3022e = z3;
        this.f3023f = z4;
        this.g = AbstractC0059a.A(new a0.l(2, this));
    }

    public final C0170f a() {
        return (C0170f) this.g.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.c != K1.g.f604a) {
            a().close();
        }
    }

    @Override // e0.c
    public final C0167c s() {
        return a().a(true);
    }

    @Override // e0.c
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.g.c != K1.g.f604a) {
            C0170f a3 = a();
            X1.g.e(a3, "sQLiteOpenHelper");
            a3.setWriteAheadLoggingEnabled(z3);
        }
        this.h = z3;
    }
}
