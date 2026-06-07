package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class D implements r {

    /* renamed from: j, reason: collision with root package name */
    public static final D f2013j = new D();

    /* renamed from: b, reason: collision with root package name */
    public int f2014b;
    public int c;

    /* renamed from: f, reason: collision with root package name */
    public Handler f2017f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2015d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2016e = true;
    public final t g = new t(this);
    public final B2.u h = new B2.u(10, this);

    /* renamed from: i, reason: collision with root package name */
    public final A.h f2018i = new A.h(26, this);

    public final void a() {
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 == 1) {
            if (this.f2015d) {
                this.g.d(EnumC0095l.ON_RESUME);
                this.f2015d = false;
            } else {
                Handler handler = this.f2017f;
                X1.g.b(handler);
                handler.removeCallbacks(this.h);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.g;
    }
}
