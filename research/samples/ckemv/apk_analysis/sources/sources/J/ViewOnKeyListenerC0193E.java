package j;

import J.T;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.WeakHashMap;
import k.C0311u0;
import k.G0;
import k.M0;
import xyz.happify.ckemv.R;

/* renamed from: j.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0193E extends AbstractC0215u implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public final MenuC0207m f3236d;

    /* renamed from: e, reason: collision with root package name */
    public final C0204j f3237e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3238f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3239i;

    /* renamed from: j, reason: collision with root package name */
    public final M0 f3240j;

    /* renamed from: m, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3243m;

    /* renamed from: n, reason: collision with root package name */
    public View f3244n;

    /* renamed from: o, reason: collision with root package name */
    public View f3245o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0219y f3246p;

    /* renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f3247q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3248r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3249s;

    /* renamed from: t, reason: collision with root package name */
    public int f3250t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3252v;

    /* renamed from: k, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0198d f3241k = new ViewTreeObserverOnGlobalLayoutListenerC0198d(1, this);

    /* renamed from: l, reason: collision with root package name */
    public final X0.n f3242l = new X0.n(3, this);

    /* renamed from: u, reason: collision with root package name */
    public int f3251u = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [k.M0, k.G0] */
    public ViewOnKeyListenerC0193E(int i3, int i4, Context context, View view, MenuC0207m menuC0207m, boolean z3) {
        this.c = context;
        this.f3236d = menuC0207m;
        this.f3238f = z3;
        this.f3237e = new C0204j(menuC0207m, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.h = i3;
        this.f3239i = i4;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3244n = view;
        this.f3240j = new G0(context, null, i3, i4);
        menuC0207m.b(this, context);
    }

    @Override // j.InterfaceC0220z
    public final void a(MenuC0207m menuC0207m, boolean z3) {
        if (menuC0207m != this.f3236d) {
            return;
        }
        dismiss();
        InterfaceC0219y interfaceC0219y = this.f3246p;
        if (interfaceC0219y != null) {
            interfaceC0219y.a(menuC0207m, z3);
        }
    }

    @Override // j.InterfaceC0192D
    public final boolean b() {
        return !this.f3248r && this.f3240j.f3568A.isShowing();
    }

    @Override // j.InterfaceC0220z
    public final void c() {
        this.f3249s = false;
        C0204j c0204j = this.f3237e;
        if (c0204j != null) {
            c0204j.notifyDataSetChanged();
        }
    }

    @Override // j.InterfaceC0192D
    public final void dismiss() {
        if (b()) {
            this.f3240j.dismiss();
        }
    }

    @Override // j.InterfaceC0192D
    public final C0311u0 f() {
        return this.f3240j.f3570d;
    }

    @Override // j.InterfaceC0220z
    public final boolean g() {
        return false;
    }

    @Override // j.InterfaceC0220z
    public final void h(InterfaceC0219y interfaceC0219y) {
        this.f3246p = interfaceC0219y;
    }

    @Override // j.InterfaceC0192D
    public final void i() {
        View view;
        if (b()) {
            return;
        }
        if (this.f3248r || (view = this.f3244n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3245o = view;
        M0 m02 = this.f3240j;
        m02.f3568A.setOnDismissListener(this);
        m02.f3581q = this;
        m02.f3590z = true;
        m02.f3568A.setFocusable(true);
        View view2 = this.f3245o;
        boolean z3 = this.f3247q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f3247q = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3241k);
        }
        view2.addOnAttachStateChangeListener(this.f3242l);
        m02.f3580p = view2;
        m02.f3577m = this.f3251u;
        boolean z4 = this.f3249s;
        Context context = this.c;
        C0204j c0204j = this.f3237e;
        if (!z4) {
            this.f3250t = AbstractC0215u.m(c0204j, context, this.g);
            this.f3249s = true;
        }
        m02.r(this.f3250t);
        m02.f3568A.setInputMethodMode(2);
        Rect rect = this.f3366b;
        m02.f3589y = rect != null ? new Rect(rect) : null;
        m02.i();
        C0311u0 c0311u0 = m02.f3570d;
        c0311u0.setOnKeyListener(this);
        if (this.f3252v) {
            MenuC0207m menuC0207m = this.f3236d;
            if (menuC0207m.f3318m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0311u0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC0207m.f3318m);
                }
                frameLayout.setEnabled(false);
                c0311u0.addHeaderView(frameLayout, null, false);
            }
        }
        m02.o(c0204j);
        m02.i();
    }

    @Override // j.InterfaceC0220z
    public final boolean j(SubMenuC0194F subMenuC0194F) {
        if (subMenuC0194F.hasVisibleItems()) {
            View view = this.f3245o;
            C0218x c0218x = new C0218x(this.h, this.f3239i, this.c, view, subMenuC0194F, this.f3238f);
            InterfaceC0219y interfaceC0219y = this.f3246p;
            c0218x.f3373i = interfaceC0219y;
            AbstractC0215u abstractC0215u = c0218x.f3374j;
            if (abstractC0215u != null) {
                abstractC0215u.h(interfaceC0219y);
            }
            boolean u3 = AbstractC0215u.u(subMenuC0194F);
            c0218x.h = u3;
            AbstractC0215u abstractC0215u2 = c0218x.f3374j;
            if (abstractC0215u2 != null) {
                abstractC0215u2.o(u3);
            }
            c0218x.f3375k = this.f3243m;
            this.f3243m = null;
            this.f3236d.c(false);
            M0 m02 = this.f3240j;
            int i3 = m02.g;
            int k2 = m02.k();
            int i4 = this.f3251u;
            View view2 = this.f3244n;
            WeakHashMap weakHashMap = T.f402a;
            if ((Gravity.getAbsoluteGravity(i4, J.C.d(view2)) & 7) == 5) {
                i3 += this.f3244n.getWidth();
            }
            if (!c0218x.b()) {
                if (c0218x.f3372f != null) {
                    c0218x.d(i3, k2, true, true);
                }
            }
            InterfaceC0219y interfaceC0219y2 = this.f3246p;
            if (interfaceC0219y2 != null) {
                interfaceC0219y2.b(subMenuC0194F);
            }
            return true;
        }
        return false;
    }

    @Override // j.AbstractC0215u
    public final void l(MenuC0207m menuC0207m) {
    }

    @Override // j.AbstractC0215u
    public final void n(View view) {
        this.f3244n = view;
    }

    @Override // j.AbstractC0215u
    public final void o(boolean z3) {
        this.f3237e.f3305d = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3248r = true;
        this.f3236d.c(true);
        ViewTreeObserver viewTreeObserver = this.f3247q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3247q = this.f3245o.getViewTreeObserver();
            }
            this.f3247q.removeGlobalOnLayoutListener(this.f3241k);
            this.f3247q = null;
        }
        this.f3245o.removeOnAttachStateChangeListener(this.f3242l);
        PopupWindow.OnDismissListener onDismissListener = this.f3243m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.AbstractC0215u
    public final void p(int i3) {
        this.f3251u = i3;
    }

    @Override // j.AbstractC0215u
    public final void q(int i3) {
        this.f3240j.g = i3;
    }

    @Override // j.AbstractC0215u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3243m = onDismissListener;
    }

    @Override // j.AbstractC0215u
    public final void s(boolean z3) {
        this.f3252v = z3;
    }

    @Override // j.AbstractC0215u
    public final void t(int i3) {
        this.f3240j.m(i3);
    }
}
