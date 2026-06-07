package J;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class z0 extends m0.z {

    /* renamed from: d, reason: collision with root package name */
    public final Window f474d;

    /* renamed from: e, reason: collision with root package name */
    public final A.h f475e;

    public z0(Window window, A.h hVar) {
        this.f474d = window;
        this.f475e = hVar;
    }

    @Override // m0.z
    public final void d0(boolean z3) {
        if (!z3) {
            p0(16);
            return;
        }
        Window window = this.f474d;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // m0.z
    public final void e0(boolean z3) {
        if (!z3) {
            p0(8192);
            return;
        }
        Window window = this.f474d;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    @Override // m0.z
    public final void i0() {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((8 & i3) != 0) {
                if (i3 == 1) {
                    p0(4);
                    this.f474d.clearFlags(1024);
                } else if (i3 == 2) {
                    p0(2);
                } else if (i3 == 8) {
                    ((A.h) this.f475e.c).t();
                }
            }
        }
    }

    public final void p0(int i3) {
        View decorView = this.f474d.getDecorView();
        decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
    }
}
