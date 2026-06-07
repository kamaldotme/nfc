package androidx.fragment.app;

import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.InterfaceC0091h;

/* loaded from: classes.dex */
public final class P implements InterfaceC0091h, d0.e, androidx.lifecycle.P {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.O f1876b;
    public androidx.lifecycle.t c = null;

    /* renamed from: d, reason: collision with root package name */
    public androidx.activity.l f1877d = null;

    public P(androidx.lifecycle.O o3) {
        this.f1876b = o3;
    }

    @Override // d0.e
    public final d0.d b() {
        f();
        return (d0.d) this.f1877d.f1464d;
    }

    @Override // androidx.lifecycle.P
    public final androidx.lifecycle.O c() {
        f();
        return this.f1876b;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        f();
        return this.c;
    }

    public final void e(EnumC0095l enumC0095l) {
        this.c.d(enumC0095l);
    }

    public final void f() {
        if (this.c == null) {
            this.c = new androidx.lifecycle.t(this);
            this.f1877d = new androidx.activity.l(this);
        }
    }
}
