package J;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class h0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f426e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final U.a f427f = new U.a(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view) {
        C0006e j3 = j(view);
        if (j3 != null) {
            ((View) j3.f418f).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                e(viewGroup.getChildAt(i3));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z3) {
        C0006e j3 = j(view);
        if (j3 != null) {
            j3.c = windowInsets;
            if (!z3) {
                View view2 = (View) j3.f418f;
                int[] iArr = (int[]) j3.g;
                view2.getLocationOnScreen(iArr);
                z3 = true;
                j3.f416d = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                f(viewGroup.getChildAt(i3), windowInsets, z3);
            }
        }
    }

    public static void g(View view, y0 y0Var, List list) {
        C0006e j3 = j(view);
        if (j3 != null) {
            j3.e(y0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                g(viewGroup.getChildAt(i3), y0Var, list);
            }
        }
    }

    public static void h(View view, v0.e eVar) {
        C0006e j3 = j(view);
        if (j3 != null) {
            View view2 = (View) j3.f418f;
            int[] iArr = (int[]) j3.g;
            view2.getLocationOnScreen(iArr);
            int i3 = j3.f416d - iArr[1];
            j3.f417e = i3;
            view2.setTranslationY(i3);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                h(viewGroup.getChildAt(i4), eVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static C0006e j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof g0) {
            return ((g0) tag).f424a;
        }
        return null;
    }
}
