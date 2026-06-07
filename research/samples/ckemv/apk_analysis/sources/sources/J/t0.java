package J;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class t0 extends s0 {
    public t0(y0 y0Var, WindowInsets windowInsets) {
        super(y0Var, windowInsets);
    }

    @Override // J.w0
    public y0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return y0.g(null, consumeDisplayCutout);
    }

    @Override // J.w0
    public C0010i e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0010i(displayCutout);
    }

    @Override // J.r0, J.w0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Objects.equals(this.c, t0Var.c) && Objects.equals(this.g, t0Var.g);
    }

    @Override // J.w0
    public int hashCode() {
        return this.c.hashCode();
    }
}
