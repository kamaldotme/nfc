package J;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class v0 extends u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final y0 f464q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f464q = y0.g(null, windowInsets);
    }

    public v0(y0 y0Var, WindowInsets windowInsets) {
        super(y0Var, windowInsets);
    }

    @Override // J.r0, J.w0
    public final void d(View view) {
    }

    @Override // J.r0, J.w0
    public A.d f(int i3) {
        Insets insets;
        insets = this.c.getInsets(x0.a(i3));
        return A.d.c(insets);
    }
}
