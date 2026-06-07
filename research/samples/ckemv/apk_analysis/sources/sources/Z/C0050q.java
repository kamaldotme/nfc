package Z;

import android.view.View;

/* renamed from: Z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0050q {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0055w f1335a;

    /* renamed from: b, reason: collision with root package name */
    public int f1336b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1337d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1338e;

    public C0050q() {
        d();
    }

    public final void a() {
        this.c = this.f1337d ? this.f1335a.g() : this.f1335a.k();
    }

    public final void b(View view, int i3) {
        if (this.f1337d) {
            this.c = this.f1335a.m() + this.f1335a.b(view);
        } else {
            this.c = this.f1335a.e(view);
        }
        this.f1336b = i3;
    }

    public final void c(View view, int i3) {
        int m3 = this.f1335a.m();
        if (m3 >= 0) {
            b(view, i3);
            return;
        }
        this.f1336b = i3;
        if (!this.f1337d) {
            int e3 = this.f1335a.e(view);
            int k2 = e3 - this.f1335a.k();
            this.c = e3;
            if (k2 > 0) {
                int g = (this.f1335a.g() - Math.min(0, (this.f1335a.g() - m3) - this.f1335a.b(view))) - (this.f1335a.c(view) + e3);
                if (g < 0) {
                    this.c -= Math.min(k2, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g3 = (this.f1335a.g() - m3) - this.f1335a.b(view);
        this.c = this.f1335a.g() - g3;
        if (g3 > 0) {
            int c = this.c - this.f1335a.c(view);
            int k3 = this.f1335a.k();
            int min = c - (Math.min(this.f1335a.e(view) - k3, 0) + k3);
            if (min < 0) {
                this.c = Math.min(g3, -min) + this.c;
            }
        }
    }

    public final void d() {
        this.f1336b = -1;
        this.c = Integer.MIN_VALUE;
        this.f1337d = false;
        this.f1338e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1336b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.f1337d + ", mValid=" + this.f1338e + '}';
    }
}
