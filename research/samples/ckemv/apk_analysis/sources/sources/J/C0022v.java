package J;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* renamed from: J.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022v extends A.h {

    /* renamed from: d, reason: collision with root package name */
    public View f462d;

    /* renamed from: e, reason: collision with root package name */
    public WindowInsetsController f463e;

    @Override // A.h
    public final void t() {
        int ime;
        View view = this.f462d;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f463e;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.t();
        } else {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
    }
}
