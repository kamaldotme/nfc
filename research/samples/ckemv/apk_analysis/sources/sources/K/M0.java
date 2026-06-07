package k;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import j.C0209o;
import j.MenuC0207m;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class M0 extends G0 implements H0 {

    /* renamed from: E, reason: collision with root package name */
    public static final Method f3601E;
    public H0 D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f3601E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // k.H0
    public final void d(MenuC0207m menuC0207m, C0209o c0209o) {
        H0 h02 = this.D;
        if (h02 != null) {
            h02.d(menuC0207m, c0209o);
        }
    }

    @Override // k.H0
    public final void j(MenuC0207m menuC0207m, MenuItem menuItem) {
        H0 h02 = this.D;
        if (h02 != null) {
            h02.j(menuC0207m, menuItem);
        }
    }

    @Override // k.G0
    public final C0311u0 q(Context context, boolean z3) {
        L0 l02 = new L0(context, z3);
        l02.setHoverListener(this);
        return l02;
    }
}
