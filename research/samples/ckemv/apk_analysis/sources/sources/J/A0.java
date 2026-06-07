package J;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class A0 extends m0.z {

    /* renamed from: d, reason: collision with root package name */
    public final WindowInsetsController f392d;

    /* renamed from: e, reason: collision with root package name */
    public final A.h f393e;

    /* renamed from: f, reason: collision with root package name */
    public Window f394f;

    public A0(WindowInsetsController windowInsetsController, A.h hVar) {
        this.f392d = windowInsetsController;
        this.f393e = hVar;
    }

    @Override // m0.z
    public final void d0(boolean z3) {
        Window window = this.f394f;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f392d.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f392d.setSystemBarsAppearance(0, 16);
    }

    @Override // m0.z
    public final void e0(boolean z3) {
        Window window = this.f394f;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f392d.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f392d.setSystemBarsAppearance(0, 8);
    }

    @Override // m0.z
    public final void i0() {
        ((A.h) this.f393e.c).t();
        this.f392d.show(0);
    }
}
