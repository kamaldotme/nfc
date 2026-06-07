package f;

import J.InterfaceC0018q;
import J.T;
import J.n0;
import J.o0;
import J.p0;
import J.q0;
import J.y0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import j.InterfaceC0219y;
import j.MenuC0207m;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.InterfaceC0293l0;
import k.r1;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class m implements InterfaceC0018q, InterfaceC0293l0, InterfaceC0219y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2921b;
    public final /* synthetic */ v c;

    public /* synthetic */ m(v vVar, int i3) {
        this.f2921b = i3;
        this.c = vVar;
    }

    @Override // j.InterfaceC0219y
    public void a(MenuC0207m menuC0207m, boolean z3) {
        u uVar;
        switch (this.f2921b) {
            case 2:
                this.c.q(menuC0207m);
                return;
            default:
                MenuC0207m k2 = menuC0207m.k();
                int i3 = 0;
                boolean z4 = k2 != menuC0207m;
                if (z4) {
                    menuC0207m = k2;
                }
                v vVar = this.c;
                u[] uVarArr = vVar.f2960M;
                int length = uVarArr != null ? uVarArr.length : 0;
                while (true) {
                    if (i3 >= length) {
                        uVar = null;
                    } else {
                        uVar = uVarArr[i3];
                        if (uVar == null || uVar.h != menuC0207m) {
                            i3++;
                        }
                    }
                }
                if (uVar != null) {
                    if (!z4) {
                        vVar.r(uVar, z3);
                        return;
                    } else {
                        vVar.p(uVar.f2933a, uVar, k2);
                        vVar.r(uVar, true);
                        return;
                    }
                }
                return;
        }
    }

    @Override // j.InterfaceC0219y
    public boolean b(MenuC0207m menuC0207m) {
        Window.Callback callback;
        switch (this.f2921b) {
            case 2:
                Window.Callback callback2 = this.c.f2984m.getCallback();
                if (callback2 == null) {
                    return true;
                }
                callback2.onMenuOpened(108, menuC0207m);
                return true;
            default:
                if (menuC0207m != menuC0207m.k()) {
                    return true;
                }
                v vVar = this.c;
                if (!vVar.f2954G || (callback = vVar.f2984m.getCallback()) == null || vVar.f2965R) {
                    return true;
                }
                callback.onMenuOpened(108, menuC0207m);
                return true;
        }
    }

    @Override // J.InterfaceC0018q
    public y0 f(View view, y0 y0Var) {
        boolean z3;
        boolean z4;
        boolean z5;
        y0 y0Var2 = y0Var;
        int d3 = y0Var.d();
        v vVar = this.c;
        vVar.getClass();
        int d4 = y0Var.d();
        ActionBarContextView actionBarContextView = vVar.f2994w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f2994w.getLayoutParams();
            if (vVar.f2994w.isShown()) {
                if (vVar.f2977d0 == null) {
                    vVar.f2977d0 = new Rect();
                    vVar.f2978e0 = new Rect();
                }
                Rect rect = vVar.f2977d0;
                Rect rect2 = vVar.f2978e0;
                rect.set(y0Var.b(), y0Var.d(), y0Var.c(), y0Var.a());
                ViewGroup viewGroup = vVar.f2950B;
                Method method = r1.f3768a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception unused) {
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = vVar.f2950B;
                WeakHashMap weakHashMap = T.f402a;
                y0 a3 = J.I.a(viewGroup2);
                int b3 = a3 == null ? 0 : a3.b();
                int c = a3 == null ? 0 : a3.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z5 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z5 = true;
                }
                Context context = vVar.f2983l;
                if (i3 <= 0 || vVar.D != null) {
                    View view2 = vVar.D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b3 || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b3;
                            marginLayoutParams2.rightMargin = c;
                            vVar.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vVar.D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b3;
                    layoutParams.rightMargin = c;
                    vVar.f2950B.addView(vVar.D, -1, layoutParams);
                }
                View view4 = vVar.D;
                boolean z6 = view4 != null;
                if (z6 && view4.getVisibility() != 0) {
                    View view5 = vVar.D;
                    view5.setBackgroundColor((J.B.g(view5) & 8192) != 0 ? y.d.a(context, R.color.abc_decor_view_status_guard_light) : y.d.a(context, R.color.abc_decor_view_status_guard));
                }
                if (!vVar.f2956I && z6) {
                    d4 = 0;
                }
                z3 = z6;
                z4 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
                z4 = false;
            }
            if (z4) {
                vVar.f2994w.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vVar.D;
        if (view6 != null) {
            view6.setVisibility(z3 ? 0 : 8);
        }
        if (d3 != d4) {
            int b4 = y0Var.b();
            int c3 = y0Var.c();
            int a4 = y0Var.a();
            int i8 = Build.VERSION.SDK_INT;
            q0 p0Var = i8 >= 30 ? new p0(y0Var2) : i8 >= 29 ? new o0(y0Var2) : new n0(y0Var2);
            p0Var.g(A.d.b(b4, d4, c3, a4));
            y0Var2 = p0Var.b();
        }
        WeakHashMap weakHashMap2 = T.f402a;
        WindowInsets f3 = y0Var2.f();
        if (f3 == null) {
            return y0Var2;
        }
        WindowInsets b5 = J.F.b(view, f3);
        return !b5.equals(f3) ? y0.g(view, b5) : y0Var2;
    }
}
