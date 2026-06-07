package f;

import J.AbstractC0001a0;
import J.C0003b0;
import J.T;
import J.Y;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import e.AbstractC0116a;
import i.InterfaceC0183a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.InterfaceC0276d;
import k.InterfaceC0297n0;
import k.n1;

/* renamed from: f.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152I extends u2.d implements InterfaceC0276d {

    /* renamed from: a, reason: collision with root package name */
    public Context f2852a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2853b;
    public ActionBarOverlayLayout c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f2854d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0297n0 f2855e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f2856f;
    public final View g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public C0151H f2857i;

    /* renamed from: j, reason: collision with root package name */
    public C0151H f2858j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0183a f2859k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2860l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f2861m;

    /* renamed from: n, reason: collision with root package name */
    public int f2862n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2863o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2864p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2865q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2866r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2867s;

    /* renamed from: t, reason: collision with root package name */
    public i.l f2868t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2869u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2870v;

    /* renamed from: w, reason: collision with root package name */
    public final C0149F f2871w;

    /* renamed from: x, reason: collision with root package name */
    public final C0149F f2872x;

    /* renamed from: y, reason: collision with root package name */
    public final C0150G f2873y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f2851z = new AccelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f2850A = new DecelerateInterpolator();

    public C0152I(Activity activity, boolean z3) {
        new ArrayList();
        this.f2861m = new ArrayList();
        this.f2862n = 0;
        this.f2863o = true;
        this.f2867s = true;
        this.f2871w = new C0149F(this, 0);
        this.f2872x = new C0149F(this, 1);
        this.f2873y = new C0150G(this);
        View decorView = activity.getWindow().getDecorView();
        J(decorView);
        if (z3) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void H(boolean z3) {
        C0003b0 i3;
        C0003b0 c0003b0;
        if (z3) {
            if (!this.f2866r) {
                this.f2866r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                M(false);
            }
        } else if (this.f2866r) {
            this.f2866r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            M(false);
        }
        ActionBarContainer actionBarContainer = this.f2854d;
        WeakHashMap weakHashMap = T.f402a;
        if (!J.E.c(actionBarContainer)) {
            if (z3) {
                ((n1) this.f2855e).f3737a.setVisibility(4);
                this.f2856f.setVisibility(0);
                return;
            } else {
                ((n1) this.f2855e).f3737a.setVisibility(0);
                this.f2856f.setVisibility(8);
                return;
            }
        }
        if (z3) {
            n1 n1Var = (n1) this.f2855e;
            i3 = T.a(n1Var.f3737a);
            i3.a(0.0f);
            i3.c(100L);
            i3.d(new i.k(n1Var, 4));
            c0003b0 = this.f2856f.i(0, 200L);
        } else {
            n1 n1Var2 = (n1) this.f2855e;
            C0003b0 a3 = T.a(n1Var2.f3737a);
            a3.a(1.0f);
            a3.c(200L);
            a3.d(new i.k(n1Var2, 0));
            i3 = this.f2856f.i(8, 100L);
            c0003b0 = a3;
        }
        i.l lVar = new i.l();
        ArrayList arrayList = lVar.f3174a;
        arrayList.add(i3);
        View view = (View) i3.f412a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0003b0.f412a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0003b0);
        lVar.b();
    }

    public final Context I() {
        if (this.f2853b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2852a.getTheme().resolveAttribute(xyz.happify.ckemv.R.attr.actionBarWidgetTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                this.f2853b = new ContextThemeWrapper(this.f2852a, i3);
            } else {
                this.f2853b = this.f2852a;
            }
        }
        return this.f2853b;
    }

    public final void J(View view) {
        InterfaceC0297n0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(xyz.happify.ckemv.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(xyz.happify.ckemv.R.id.action_bar);
        if (findViewById instanceof InterfaceC0297n0) {
            wrapper = (InterfaceC0297n0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f2855e = wrapper;
        this.f2856f = (ActionBarContextView) view.findViewById(xyz.happify.ckemv.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(xyz.happify.ckemv.R.id.action_bar_container);
        this.f2854d = actionBarContainer;
        InterfaceC0297n0 interfaceC0297n0 = this.f2855e;
        if (interfaceC0297n0 == null || this.f2856f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0152I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((n1) interfaceC0297n0).f3737a.getContext();
        this.f2852a = context;
        if ((((n1) this.f2855e).f3738b & 4) != 0) {
            this.h = true;
        }
        int i3 = context.getApplicationInfo().targetSdkVersion;
        this.f2855e.getClass();
        L(context.getResources().getBoolean(xyz.happify.ckemv.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2852a.obtainStyledAttributes(null, AbstractC0116a.f2665a, xyz.happify.ckemv.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.f1559i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2870v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2854d;
            WeakHashMap weakHashMap = T.f402a;
            J.H.s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void K(boolean z3) {
        if (this.h) {
            return;
        }
        int i3 = z3 ? 4 : 0;
        n1 n1Var = (n1) this.f2855e;
        int i4 = n1Var.f3738b;
        this.h = true;
        n1Var.a((i3 & 4) | (i4 & (-5)));
    }

    public final void L(boolean z3) {
        if (z3) {
            this.f2854d.setTabContainer(null);
            ((n1) this.f2855e).getClass();
        } else {
            ((n1) this.f2855e).getClass();
            this.f2854d.setTabContainer(null);
        }
        this.f2855e.getClass();
        ((n1) this.f2855e).f3737a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void M(boolean z3) {
        boolean z4 = this.f2866r || !(this.f2864p || this.f2865q);
        View view = this.g;
        C0150G c0150g = this.f2873y;
        if (!z4) {
            if (this.f2867s) {
                this.f2867s = false;
                i.l lVar = this.f2868t;
                if (lVar != null) {
                    lVar.a();
                }
                int i3 = this.f2862n;
                C0149F c0149f = this.f2871w;
                if (i3 != 0 || (!this.f2869u && !z3)) {
                    c0149f.a();
                    return;
                }
                this.f2854d.setAlpha(1.0f);
                this.f2854d.setTransitioning(true);
                i.l lVar2 = new i.l();
                float f3 = -this.f2854d.getHeight();
                if (z3) {
                    this.f2854d.getLocationInWindow(new int[]{0, 0});
                    f3 -= r12[1];
                }
                C0003b0 a3 = T.a(this.f2854d);
                a3.e(f3);
                View view2 = (View) a3.f412a.get();
                if (view2 != null) {
                    AbstractC0001a0.a(view2.animate(), c0150g != null ? new Y(c0150g, view2) : null);
                }
                boolean z5 = lVar2.f3177e;
                ArrayList arrayList = lVar2.f3174a;
                if (!z5) {
                    arrayList.add(a3);
                }
                if (this.f2863o && view != null) {
                    C0003b0 a4 = T.a(view);
                    a4.e(f3);
                    if (!lVar2.f3177e) {
                        arrayList.add(a4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2851z;
                boolean z6 = lVar2.f3177e;
                if (!z6) {
                    lVar2.c = accelerateInterpolator;
                }
                if (!z6) {
                    lVar2.f3175b = 250L;
                }
                if (!z6) {
                    lVar2.f3176d = c0149f;
                }
                this.f2868t = lVar2;
                lVar2.b();
                return;
            }
            return;
        }
        if (this.f2867s) {
            return;
        }
        this.f2867s = true;
        i.l lVar3 = this.f2868t;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f2854d.setVisibility(0);
        int i4 = this.f2862n;
        C0149F c0149f2 = this.f2872x;
        if (i4 == 0 && (this.f2869u || z3)) {
            this.f2854d.setTranslationY(0.0f);
            float f4 = -this.f2854d.getHeight();
            if (z3) {
                this.f2854d.getLocationInWindow(new int[]{0, 0});
                f4 -= r12[1];
            }
            this.f2854d.setTranslationY(f4);
            i.l lVar4 = new i.l();
            C0003b0 a5 = T.a(this.f2854d);
            a5.e(0.0f);
            View view3 = (View) a5.f412a.get();
            if (view3 != null) {
                AbstractC0001a0.a(view3.animate(), c0150g != null ? new Y(c0150g, view3) : null);
            }
            boolean z7 = lVar4.f3177e;
            ArrayList arrayList2 = lVar4.f3174a;
            if (!z7) {
                arrayList2.add(a5);
            }
            if (this.f2863o && view != null) {
                view.setTranslationY(f4);
                C0003b0 a6 = T.a(view);
                a6.e(0.0f);
                if (!lVar4.f3177e) {
                    arrayList2.add(a6);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2850A;
            boolean z8 = lVar4.f3177e;
            if (!z8) {
                lVar4.c = decelerateInterpolator;
            }
            if (!z8) {
                lVar4.f3175b = 250L;
            }
            if (!z8) {
                lVar4.f3176d = c0149f2;
            }
            this.f2868t = lVar4;
            lVar4.b();
        } else {
            this.f2854d.setAlpha(1.0f);
            this.f2854d.setTranslationY(0.0f);
            if (this.f2863o && view != null) {
                view.setTranslationY(0.0f);
            }
            c0149f2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = T.f402a;
            J.F.c(actionBarOverlayLayout);
        }
    }

    public C0152I(Dialog dialog) {
        new ArrayList();
        this.f2861m = new ArrayList();
        this.f2862n = 0;
        this.f2863o = true;
        this.f2867s = true;
        this.f2871w = new C0149F(this, 0);
        this.f2872x = new C0149F(this, 1);
        this.f2873y = new C0150G(this);
        J(dialog.getWindow().getDecorView());
    }
}
