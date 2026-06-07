package J;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class H {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static y0 b(View view, y0 y0Var, Rect rect) {
        WindowInsets f3 = y0Var.f();
        if (f3 != null) {
            return y0.g(view, view.computeSystemWindowInsets(f3, rect));
        }
        rect.setEmpty();
        return y0Var;
    }

    public static boolean c(View view, float f3, float f4, boolean z3) {
        return view.dispatchNestedFling(f3, f4, z3);
    }

    public static boolean d(View view, float f3, float f4) {
        return view.dispatchNestedPreFling(f3, f4);
    }

    public static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
    }

    public static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static y0 j(View view) {
        if (!m0.f439d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = m0.f437a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) m0.f438b.get(obj);
            Rect rect2 = (Rect) m0.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i3 = Build.VERSION.SDK_INT;
            q0 p0Var = i3 >= 30 ? new p0() : i3 >= 29 ? new o0() : new n0();
            p0Var.e(A.d.b(rect.left, rect.top, rect.right, rect.bottom));
            p0Var.g(A.d.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            y0 b3 = p0Var.b();
            b3.f470a.p(b3);
            b3.f470a.d(view.getRootView());
            return b3;
        } catch (IllegalAccessException e3) {
            e3.getMessage();
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f3) {
        view.setElevation(f3);
    }

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, InterfaceC0018q interfaceC0018q) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0018q);
        }
        if (interfaceC0018q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new G(view, interfaceC0018q));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f3) {
        view.setTranslationZ(f3);
    }

    public static void x(View view, float f3) {
        view.setZ(f3);
    }

    public static boolean y(View view, int i3) {
        return view.startNestedScroll(i3);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
