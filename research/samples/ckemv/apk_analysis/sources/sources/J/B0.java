package J;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0.z f395a;

    public B0(WindowInsetsController windowInsetsController) {
        this.f395a = new A0(windowInsetsController, new A.h(windowInsetsController));
    }

    public B0(Window window, View view) {
        WindowInsetsController insetsController;
        A.h hVar = new A.h(view);
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            A0 a02 = new A0(insetsController, hVar);
            a02.f394f = window;
            this.f395a = a02;
            return;
        }
        this.f395a = new z0(window, hVar);
    }
}
