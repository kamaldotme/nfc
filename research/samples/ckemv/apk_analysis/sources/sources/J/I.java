package J;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class I {
    public static y0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        y0 g = y0.g(null, rootWindowInsets);
        w0 w0Var = g.f470a;
        w0Var.p(g);
        w0Var.d(view.getRootView());
        return g;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
