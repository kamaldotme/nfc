package J;

import a.AbstractC0059a;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class r0 extends w0 {
    public static boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f449i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f450j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f451k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f452l;
    public final WindowInsets c;

    /* renamed from: d, reason: collision with root package name */
    public A.d[] f453d;

    /* renamed from: e, reason: collision with root package name */
    public A.d f454e;

    /* renamed from: f, reason: collision with root package name */
    public y0 f455f;
    public A.d g;

    public r0(y0 y0Var, WindowInsets windowInsets) {
        super(y0Var);
        this.f454e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private A.d r(int i3, boolean z3) {
        A.d dVar = A.d.f1e;
        for (int i4 = 1; i4 <= 256; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                dVar = A.d.a(dVar, s(i4, z3));
            }
        }
        return dVar;
    }

    private A.d t() {
        y0 y0Var = this.f455f;
        return y0Var != null ? y0Var.f470a.h() : A.d.f1e;
    }

    private A.d u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = f449i;
        if (method != null && f450j != null && f451k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) f451k.get(f452l.get(invoke));
                if (rect != null) {
                    return A.d.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                e3.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f449i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f450j = cls;
            f451k = cls.getDeclaredField("mVisibleInsets");
            f452l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f451k.setAccessible(true);
            f452l.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            e3.getMessage();
        }
        h = true;
    }

    @Override // J.w0
    public void d(View view) {
        A.d u3 = u(view);
        if (u3 == null) {
            u3 = A.d.f1e;
        }
        w(u3);
    }

    @Override // J.w0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.g, ((r0) obj).g);
        }
        return false;
    }

    @Override // J.w0
    public A.d f(int i3) {
        return r(i3, false);
    }

    @Override // J.w0
    public final A.d j() {
        if (this.f454e == null) {
            WindowInsets windowInsets = this.c;
            this.f454e = A.d.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f454e;
    }

    @Override // J.w0
    public y0 l(int i3, int i4, int i5, int i6) {
        y0 g = y0.g(null, this.c);
        int i7 = Build.VERSION.SDK_INT;
        q0 p0Var = i7 >= 30 ? new p0(g) : i7 >= 29 ? new o0(g) : new n0(g);
        p0Var.g(y0.e(j(), i3, i4, i5, i6));
        p0Var.e(y0.e(h(), i3, i4, i5, i6));
        return p0Var.b();
    }

    @Override // J.w0
    public boolean n() {
        return this.c.isRound();
    }

    @Override // J.w0
    public void o(A.d[] dVarArr) {
        this.f453d = dVarArr;
    }

    @Override // J.w0
    public void p(y0 y0Var) {
        this.f455f = y0Var;
    }

    public A.d s(int i3, boolean z3) {
        A.d h3;
        int i4;
        if (i3 == 1) {
            return z3 ? A.d.b(0, Math.max(t().f3b, j().f3b), 0, 0) : A.d.b(0, j().f3b, 0, 0);
        }
        if (i3 == 2) {
            if (z3) {
                A.d t3 = t();
                A.d h4 = h();
                return A.d.b(Math.max(t3.f2a, h4.f2a), 0, Math.max(t3.c, h4.c), Math.max(t3.f4d, h4.f4d));
            }
            A.d j3 = j();
            y0 y0Var = this.f455f;
            h3 = y0Var != null ? y0Var.f470a.h() : null;
            int i5 = j3.f4d;
            if (h3 != null) {
                i5 = Math.min(i5, h3.f4d);
            }
            return A.d.b(j3.f2a, 0, j3.c, i5);
        }
        A.d dVar = A.d.f1e;
        if (i3 == 8) {
            A.d[] dVarArr = this.f453d;
            h3 = dVarArr != null ? dVarArr[AbstractC0059a.y(8)] : null;
            if (h3 != null) {
                return h3;
            }
            A.d j4 = j();
            A.d t4 = t();
            int i6 = j4.f4d;
            if (i6 > t4.f4d) {
                return A.d.b(0, 0, 0, i6);
            }
            A.d dVar2 = this.g;
            return (dVar2 == null || dVar2.equals(dVar) || (i4 = this.g.f4d) <= t4.f4d) ? dVar : A.d.b(0, 0, 0, i4);
        }
        if (i3 == 16) {
            return i();
        }
        if (i3 == 32) {
            return g();
        }
        if (i3 == 64) {
            return k();
        }
        if (i3 != 128) {
            return dVar;
        }
        y0 y0Var2 = this.f455f;
        C0010i e3 = y0Var2 != null ? y0Var2.f470a.e() : e();
        if (e3 == null) {
            return dVar;
        }
        int i7 = Build.VERSION.SDK_INT;
        return A.d.b(i7 >= 28 ? AbstractC0009h.d(e3.f428a) : 0, i7 >= 28 ? AbstractC0009h.f(e3.f428a) : 0, i7 >= 28 ? AbstractC0009h.e(e3.f428a) : 0, i7 >= 28 ? AbstractC0009h.c(e3.f428a) : 0);
    }

    public void w(A.d dVar) {
        this.g = dVar;
    }
}
