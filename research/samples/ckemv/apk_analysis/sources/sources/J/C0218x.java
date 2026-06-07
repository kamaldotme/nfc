package j;

import J.T;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* renamed from: j.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0218x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3368a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuC0207m f3369b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3371e;

    /* renamed from: f, reason: collision with root package name */
    public View f3372f;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0219y f3373i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0215u f3374j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3375k;
    public int g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final C0216v f3376l = new C0216v(this);

    public C0218x(int i3, int i4, Context context, View view, MenuC0207m menuC0207m, boolean z3) {
        this.f3368a = context;
        this.f3369b = menuC0207m;
        this.f3372f = view;
        this.c = z3;
        this.f3370d = i3;
        this.f3371e = i4;
    }

    public final AbstractC0215u a() {
        AbstractC0215u viewOnKeyListenerC0193E;
        if (this.f3374j == null) {
            Context context = this.f3368a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            AbstractC0217w.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC0193E = new ViewOnKeyListenerC0201g(this.f3368a, this.f3372f, this.f3370d, this.f3371e, this.c);
            } else {
                View view = this.f3372f;
                int i3 = this.f3371e;
                boolean z3 = this.c;
                viewOnKeyListenerC0193E = new ViewOnKeyListenerC0193E(this.f3370d, i3, this.f3368a, view, this.f3369b, z3);
            }
            viewOnKeyListenerC0193E.l(this.f3369b);
            viewOnKeyListenerC0193E.r(this.f3376l);
            viewOnKeyListenerC0193E.n(this.f3372f);
            viewOnKeyListenerC0193E.h(this.f3373i);
            viewOnKeyListenerC0193E.o(this.h);
            viewOnKeyListenerC0193E.p(this.g);
            this.f3374j = viewOnKeyListenerC0193E;
        }
        return this.f3374j;
    }

    public final boolean b() {
        AbstractC0215u abstractC0215u = this.f3374j;
        return abstractC0215u != null && abstractC0215u.b();
    }

    public void c() {
        this.f3374j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f3375k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i3, int i4, boolean z3, boolean z4) {
        AbstractC0215u a3 = a();
        a3.s(z4);
        if (z3) {
            int i5 = this.g;
            View view = this.f3372f;
            WeakHashMap weakHashMap = T.f402a;
            if ((Gravity.getAbsoluteGravity(i5, J.C.d(view)) & 7) == 5) {
                i3 -= this.f3372f.getWidth();
            }
            a3.q(i3);
            a3.t(i4);
            int i6 = (int) ((this.f3368a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a3.f3366b = new Rect(i3 - i6, i4 - i6, i3 + i6, i4 + i6);
        }
        a3.i();
    }
}
