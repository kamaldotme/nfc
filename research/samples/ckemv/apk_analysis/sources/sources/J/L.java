package J;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;
import n.C0342k;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class L {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, Q q3) {
        C0342k c0342k = (C0342k) view.getTag(R.id.tag_unhandled_key_listeners);
        C0342k c0342k2 = c0342k;
        if (c0342k == null) {
            C0342k c0342k3 = new C0342k();
            view.setTag(R.id.tag_unhandled_key_listeners, c0342k3);
            c0342k2 = c0342k3;
        }
        Objects.requireNonNull(q3);
        ?? obj = new Object();
        c0342k2.put(q3, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, Q q3) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0342k c0342k = (C0342k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0342k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0342k.getOrDefault(q3, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
