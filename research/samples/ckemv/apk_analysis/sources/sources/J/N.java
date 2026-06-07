package J;

import android.view.View;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class N {
    public static int a(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static B0 c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new B0(windowInsetsController);
        }
        return null;
    }

    public static boolean d(View view) {
        return view.isImportantForContentCapture();
    }

    public static void e(View view, int i3) {
        view.setImportantForContentCapture(i3);
    }

    public static void f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
