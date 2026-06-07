package J;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f465b;

    /* renamed from: a, reason: collision with root package name */
    public final y0 f466a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f465b = (i3 >= 30 ? new p0() : i3 >= 29 ? new o0() : new n0()).b().f470a.a().f470a.b().f470a.c();
    }

    public w0(y0 y0Var) {
        this.f466a = y0Var;
    }

    public y0 a() {
        return this.f466a;
    }

    public y0 b() {
        return this.f466a;
    }

    public y0 c() {
        return this.f466a;
    }

    public void d(View view) {
    }

    public C0010i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return n() == w0Var.n() && m() == w0Var.m() && I.a.a(j(), w0Var.j()) && I.a.a(h(), w0Var.h()) && I.a.a(e(), w0Var.e());
    }

    public A.d f(int i3) {
        return A.d.f1e;
    }

    public A.d g() {
        return j();
    }

    public A.d h() {
        return A.d.f1e;
    }

    public int hashCode() {
        return I.a.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public A.d i() {
        return j();
    }

    public A.d j() {
        return A.d.f1e;
    }

    public A.d k() {
        return j();
    }

    public y0 l(int i3, int i4, int i5, int i6) {
        return f465b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void o(A.d[] dVarArr) {
    }

    public void p(y0 y0Var) {
    }

    public void q(A.d dVar) {
    }
}
