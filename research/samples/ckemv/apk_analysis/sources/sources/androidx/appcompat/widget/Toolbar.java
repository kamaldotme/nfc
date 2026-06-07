package androidx.appcompat.widget;

import A.h;
import B2.u;
import J.AbstractC0013l;
import J.B;
import J.C;
import J.E;
import J.T;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import e.AbstractC0116a;
import i.j;
import j.C0209o;
import j.MenuC0207m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0275c0;
import k.C0288j;
import k.C0316x;
import k.C0318y;
import k.InterfaceC0297n0;
import k.Q0;
import k.g1;
import k.h1;
import k.i1;
import k.j1;
import k.k1;
import k.l1;
import k.m1;
import k.n1;
import k.o1;
import k.r1;
import v0.m;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1639A;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1640B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1641C;
    public boolean D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f1642E;

    /* renamed from: F, reason: collision with root package name */
    public final ArrayList f1643F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f1644G;

    /* renamed from: H, reason: collision with root package name */
    public final h f1645H;

    /* renamed from: I, reason: collision with root package name */
    public final g1 f1646I;

    /* renamed from: J, reason: collision with root package name */
    public n1 f1647J;

    /* renamed from: K, reason: collision with root package name */
    public C0288j f1648K;

    /* renamed from: L, reason: collision with root package name */
    public i1 f1649L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1650M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1651N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1652O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1653P;

    /* renamed from: Q, reason: collision with root package name */
    public final F0.h f1654Q;

    /* renamed from: b, reason: collision with root package name */
    public ActionMenuView f1655b;
    public C0275c0 c;

    /* renamed from: d, reason: collision with root package name */
    public C0275c0 f1656d;

    /* renamed from: e, reason: collision with root package name */
    public C0316x f1657e;

    /* renamed from: f, reason: collision with root package name */
    public C0318y f1658f;
    public final Drawable g;
    public final CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public C0316x f1659i;

    /* renamed from: j, reason: collision with root package name */
    public View f1660j;

    /* renamed from: k, reason: collision with root package name */
    public Context f1661k;

    /* renamed from: l, reason: collision with root package name */
    public int f1662l;

    /* renamed from: m, reason: collision with root package name */
    public int f1663m;

    /* renamed from: n, reason: collision with root package name */
    public int f1664n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1665o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1666p;

    /* renamed from: q, reason: collision with root package name */
    public int f1667q;

    /* renamed from: r, reason: collision with root package name */
    public int f1668r;

    /* renamed from: s, reason: collision with root package name */
    public int f1669s;

    /* renamed from: t, reason: collision with root package name */
    public int f1670t;

    /* renamed from: u, reason: collision with root package name */
    public Q0 f1671u;

    /* renamed from: v, reason: collision with root package name */
    public int f1672v;

    /* renamed from: w, reason: collision with root package name */
    public int f1673w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1674x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1675y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f1676z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, k.j1] */
    public static j1 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f3723b = 0;
        marginLayoutParams.f3722a = 8388627;
        return marginLayoutParams;
    }

    public static j1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof j1;
        if (z3) {
            j1 j1Var = (j1) layoutParams;
            j1 j1Var2 = new j1(j1Var);
            j1Var2.f3723b = 0;
            j1Var2.f3723b = j1Var.f3723b;
            return j1Var2;
        }
        if (z3) {
            j1 j1Var3 = new j1((j1) layoutParams);
            j1Var3.f3723b = 0;
            return j1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            j1 j1Var4 = new j1(layoutParams);
            j1Var4.f3723b = 0;
            return j1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        j1 j1Var5 = new j1(marginLayoutParams);
        j1Var5.f3723b = 0;
        ((ViewGroup.MarginLayoutParams) j1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) j1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) j1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) j1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return j1Var5;
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0013l.b(marginLayoutParams) + AbstractC0013l.c(marginLayoutParams);
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i3) {
        WeakHashMap weakHashMap = T.f402a;
        boolean z3 = C.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, C.d(this));
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                j1 j1Var = (j1) childAt.getLayoutParams();
                if (j1Var.f3723b == 0 && t(childAt) && j(j1Var.f3722a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            j1 j1Var2 = (j1) childAt2.getLayoutParams();
            if (j1Var2.f3723b == 0 && t(childAt2) && j(j1Var2.f3722a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        j1 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (j1) layoutParams;
        h.f3723b = 1;
        if (!z3 || this.f1660j == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.f1643F.add(view);
        }
    }

    public final void c() {
        if (this.f1659i == null) {
            C0316x c0316x = new C0316x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1659i = c0316x;
            c0316x.setImageDrawable(this.g);
            this.f1659i.setContentDescription(this.h);
            j1 h = h();
            h.f3722a = (this.f1665o & 112) | 8388611;
            h.f3723b = 2;
            this.f1659i.setLayoutParams(h);
            this.f1659i.setOnClickListener(new com.google.android.material.datepicker.j(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof j1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k.Q0, java.lang.Object] */
    public final void d() {
        if (this.f1671u == null) {
            ?? obj = new Object();
            obj.f3613a = 0;
            obj.f3614b = 0;
            obj.c = Integer.MIN_VALUE;
            obj.f3615d = Integer.MIN_VALUE;
            obj.f3616e = 0;
            obj.f3617f = 0;
            obj.g = false;
            obj.h = false;
            this.f1671u = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1655b;
        if (actionMenuView.f1579q == null) {
            MenuC0207m menuC0207m = (MenuC0207m) actionMenuView.getMenu();
            if (this.f1649L == null) {
                this.f1649L = new i1(this);
            }
            this.f1655b.setExpandedActionViewsExclusive(true);
            menuC0207m.b(this.f1649L, this.f1661k);
            u();
        }
    }

    public final void f() {
        if (this.f1655b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1655b = actionMenuView;
            actionMenuView.setPopupTheme(this.f1662l);
            this.f1655b.setOnMenuItemClickListener(this.f1646I);
            ActionMenuView actionMenuView2 = this.f1655b;
            g1 g1Var = new g1(this);
            actionMenuView2.f1584v = null;
            actionMenuView2.f1585w = g1Var;
            j1 h = h();
            h.f3722a = (this.f1665o & 112) | 8388613;
            this.f1655b.setLayoutParams(h);
            b(this.f1655b, false);
        }
    }

    public final void g() {
        if (this.f1657e == null) {
            this.f1657e = new C0316x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            j1 h = h();
            h.f3722a = (this.f1665o & 112) | 8388611;
            this.f1657e.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0316x c0316x = this.f1659i;
        if (c0316x != null) {
            return c0316x.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0316x c0316x = this.f1659i;
        if (c0316x != null) {
            return c0316x.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q0 q02 = this.f1671u;
        if (q02 != null) {
            return q02.g ? q02.f3613a : q02.f3614b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f1673w;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q0 q02 = this.f1671u;
        if (q02 != null) {
            return q02.f3613a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q0 q02 = this.f1671u;
        if (q02 != null) {
            return q02.f3614b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q0 q02 = this.f1671u;
        if (q02 != null) {
            return q02.g ? q02.f3614b : q02.f3613a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f1672v;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0207m menuC0207m;
        ActionMenuView actionMenuView = this.f1655b;
        return (actionMenuView == null || (menuC0207m = actionMenuView.f1579q) == null || !menuC0207m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1673w, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = T.f402a;
        return C.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = T.f402a;
        return C.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1672v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0318y c0318y = this.f1658f;
        if (c0318y != null) {
            return c0318y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0318y c0318y = this.f1658f;
        if (c0318y != null) {
            return c0318y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1655b.getMenu();
    }

    public View getNavButtonView() {
        return this.f1657e;
    }

    public CharSequence getNavigationContentDescription() {
        C0316x c0316x = this.f1657e;
        if (c0316x != null) {
            return c0316x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0316x c0316x = this.f1657e;
        if (c0316x != null) {
            return c0316x.getDrawable();
        }
        return null;
    }

    public C0288j getOuterActionMenuPresenter() {
        return this.f1648K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1655b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1661k;
    }

    public int getPopupTheme() {
        return this.f1662l;
    }

    public CharSequence getSubtitle() {
        return this.f1676z;
    }

    public final TextView getSubtitleTextView() {
        return this.f1656d;
    }

    public CharSequence getTitle() {
        return this.f1675y;
    }

    public int getTitleMarginBottom() {
        return this.f1670t;
    }

    public int getTitleMarginEnd() {
        return this.f1668r;
    }

    public int getTitleMarginStart() {
        return this.f1667q;
    }

    public int getTitleMarginTop() {
        return this.f1669s;
    }

    public final TextView getTitleTextView() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [k.n1, java.lang.Object] */
    public InterfaceC0297n0 getWrapper() {
        Drawable drawable;
        if (this.f1647J == null) {
            ?? obj = new Object();
            obj.f3747n = 0;
            obj.f3737a = this;
            obj.h = getTitle();
            obj.f3742i = getSubtitle();
            obj.g = obj.h != null;
            obj.f3741f = getNavigationIcon();
            m F2 = m.F(getContext(), null, AbstractC0116a.f2665a, R.attr.actionBarStyle, 0);
            obj.f3748o = F2.r(15);
            TypedArray typedArray = (TypedArray) F2.f5087d;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.g = true;
                obj.h = text;
                if ((obj.f3738b & 8) != 0) {
                    Toolbar toolbar = obj.f3737a;
                    toolbar.setTitle(text);
                    if (obj.g) {
                        T.m(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f3742i = text2;
                if ((obj.f3738b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable r3 = F2.r(20);
            if (r3 != null) {
                obj.f3740e = r3;
                obj.c();
            }
            Drawable r4 = F2.r(17);
            if (r4 != null) {
                obj.f3739d = r4;
                obj.c();
            }
            if (obj.f3741f == null && (drawable = obj.f3748o) != null) {
                obj.f3741f = drawable;
                int i3 = obj.f3738b & 4;
                Toolbar toolbar2 = obj.f3737a;
                if (i3 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.c;
                if (view != null && (obj.f3738b & 16) != 0) {
                    removeView(view);
                }
                obj.c = inflate;
                if (inflate != null && (obj.f3738b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f3738b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1671u.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1663m = resourceId2;
                C0275c0 c0275c0 = this.c;
                if (c0275c0 != null) {
                    c0275c0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1664n = resourceId3;
                C0275c0 c0275c02 = this.f1656d;
                if (c0275c02 != null) {
                    c0275c02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            F2.J();
            if (R.string.abc_action_bar_up_description != obj.f3747n) {
                obj.f3747n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = obj.f3747n;
                    obj.f3743j = i4 != 0 ? getContext().getString(i4) : null;
                    obj.b();
                }
            }
            obj.f3743j = getNavigationContentDescription();
            setNavigationOnClickListener(new m1(obj));
            this.f1647J = obj;
        }
        return this.f1647J;
    }

    public final int j(int i3) {
        WeakHashMap weakHashMap = T.f402a;
        int d3 = C.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, d3) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : d3 == 1 ? 5 : 3;
    }

    public final int k(View view, int i3) {
        j1 j1Var = (j1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = j1Var.f3722a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f1674x & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) j1Var).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public void n(int i3) {
        getMenuInflater().inflate(i3, getMenu());
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f1643F.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1654Q);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029b A[LOOP:0: B:40:0x0299->B:41:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b8 A[LOOP:1: B:44:0x02b6->B:45:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d6 A[LOOP:2: B:48:0x02d4->B:49:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0325 A[LOOP:3: B:57:0x0323->B:58:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        boolean t3;
        boolean t4;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int i21;
        int size2;
        int i22;
        int size3;
        int i23;
        int i24;
        int size4;
        int i25;
        WeakHashMap weakHashMap = T.f402a;
        boolean z5 = C.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.f1644G;
        iArr[1] = 0;
        iArr[0] = 0;
        int d3 = B.d(this);
        int min = d3 >= 0 ? Math.min(d3, i6 - i4) : 0;
        if (!t(this.f1657e)) {
            i7 = paddingLeft;
        } else {
            if (z5) {
                i8 = q(this.f1657e, i26, min, iArr);
                i7 = paddingLeft;
                if (t(this.f1659i)) {
                    if (z5) {
                        i8 = q(this.f1659i, i8, min, iArr);
                    } else {
                        i7 = p(this.f1659i, i7, min, iArr);
                    }
                }
                if (t(this.f1655b)) {
                    if (z5) {
                        i7 = p(this.f1655b, i7, min, iArr);
                    } else {
                        i8 = q(this.f1655b, i8, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i7);
                iArr[1] = Math.max(0, currentContentInsetRight - (i26 - i8));
                int max = Math.max(i7, currentContentInsetLeft);
                int min2 = Math.min(i8, i26 - currentContentInsetRight);
                if (t(this.f1660j)) {
                    if (z5) {
                        min2 = q(this.f1660j, min2, min, iArr);
                    } else {
                        max = p(this.f1660j, max, min, iArr);
                    }
                }
                if (t(this.f1658f)) {
                    if (z5) {
                        min2 = q(this.f1658f, min2, min, iArr);
                    } else {
                        max = p(this.f1658f, max, min, iArr);
                    }
                }
                t3 = t(this.c);
                t4 = t(this.f1656d);
                if (t3) {
                    i9 = paddingRight;
                    i10 = 0;
                } else {
                    j1 j1Var = (j1) this.c.getLayoutParams();
                    i9 = paddingRight;
                    i10 = ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin + this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j1Var).topMargin;
                }
                if (t4) {
                    i11 = width;
                } else {
                    j1 j1Var2 = (j1) this.f1656d.getLayoutParams();
                    i11 = width;
                    i10 += this.f1656d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j1Var2).topMargin + ((ViewGroup.MarginLayoutParams) j1Var2).bottomMargin;
                }
                if (!t3 || t4) {
                    C0275c0 c0275c0 = !t3 ? this.c : this.f1656d;
                    C0275c0 c0275c02 = !t4 ? this.f1656d : this.c;
                    j1 j1Var3 = (j1) c0275c0.getLayoutParams();
                    j1 j1Var4 = (j1) c0275c02.getLayoutParams();
                    if ((t3 || this.c.getMeasuredWidth() <= 0) && (!t4 || this.f1656d.getMeasuredWidth() <= 0)) {
                        i12 = paddingLeft;
                        z4 = false;
                    } else {
                        i12 = paddingLeft;
                        z4 = true;
                    }
                    i13 = this.f1674x & 112;
                    i14 = min;
                    if (i13 != 48) {
                        i15 = max;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) j1Var3).topMargin + this.f1669s;
                    } else if (i13 != 80) {
                        int i27 = (((height - paddingTop2) - paddingBottom) - i10) / 2;
                        i15 = max;
                        int i28 = ((ViewGroup.MarginLayoutParams) j1Var3).topMargin + this.f1669s;
                        if (i27 < i28) {
                            i27 = i28;
                        } else {
                            int i29 = (((height - paddingBottom) - i10) - i27) - paddingTop2;
                            int i30 = ((ViewGroup.MarginLayoutParams) j1Var3).bottomMargin;
                            int i31 = this.f1670t;
                            if (i29 < i30 + i31) {
                                i27 = Math.max(0, i27 - ((((ViewGroup.MarginLayoutParams) j1Var4).bottomMargin + i31) - i29));
                            }
                        }
                        paddingTop = paddingTop2 + i27;
                    } else {
                        i15 = max;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) j1Var4).bottomMargin) - this.f1670t) - i10;
                    }
                    if (z5) {
                        int i32 = (z4 ? this.f1667q : 0) - iArr[0];
                        int max2 = Math.max(0, i32) + i15;
                        iArr[0] = Math.max(0, -i32);
                        if (t3) {
                            j1 j1Var5 = (j1) this.c.getLayoutParams();
                            int measuredWidth = this.c.getMeasuredWidth() + max2;
                            int measuredHeight = this.c.getMeasuredHeight() + paddingTop;
                            this.c.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i16 = measuredWidth + this.f1668r;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) j1Var5).bottomMargin;
                        } else {
                            i16 = max2;
                        }
                        if (t4) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j1) this.f1656d.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f1656d.getMeasuredWidth() + max2;
                            this.f1656d.layout(max2, i33, measuredWidth2, this.f1656d.getMeasuredHeight() + i33);
                            i17 = measuredWidth2 + this.f1668r;
                        } else {
                            i17 = max2;
                        }
                        max = z4 ? Math.max(i16, i17) : max2;
                    } else {
                        int i34 = (z4 ? this.f1667q : 0) - iArr[1];
                        min2 -= Math.max(0, i34);
                        iArr[1] = Math.max(0, -i34);
                        if (t3) {
                            j1 j1Var6 = (j1) this.c.getLayoutParams();
                            int measuredWidth3 = min2 - this.c.getMeasuredWidth();
                            int measuredHeight2 = this.c.getMeasuredHeight() + paddingTop;
                            this.c.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i18 = measuredWidth3 - this.f1668r;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) j1Var6).bottomMargin;
                        } else {
                            i18 = min2;
                        }
                        if (t4) {
                            int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((j1) this.f1656d.getLayoutParams())).topMargin;
                            this.f1656d.layout(min2 - this.f1656d.getMeasuredWidth(), i35, min2, this.f1656d.getMeasuredHeight() + i35);
                            i19 = min2 - this.f1668r;
                        } else {
                            i19 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i18, i19);
                        }
                        max = i15;
                    }
                } else {
                    i12 = paddingLeft;
                    i14 = min;
                }
                ArrayList arrayList = this.f1642E;
                a(arrayList, 3);
                size = arrayList.size();
                i20 = max;
                for (i21 = 0; i21 < size; i21++) {
                    i20 = p((View) arrayList.get(i21), i20, i14, iArr);
                }
                int i36 = i14;
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i22 = 0; i22 < size2; i22++) {
                    min2 = q((View) arrayList.get(i22), min2, i36, iArr);
                }
                a(arrayList, 1);
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i38;
                int i40 = i37;
                i23 = 0;
                int i41 = 0;
                while (i23 < size3) {
                    View view = (View) arrayList.get(i23);
                    j1 j1Var7 = (j1) view.getLayoutParams();
                    int i42 = ((ViewGroup.MarginLayoutParams) j1Var7).leftMargin - i40;
                    int i43 = ((ViewGroup.MarginLayoutParams) j1Var7).rightMargin - i39;
                    int max3 = Math.max(0, i42);
                    int max4 = Math.max(0, i43);
                    int max5 = Math.max(0, -i42);
                    int max6 = Math.max(0, -i43);
                    i41 += view.getMeasuredWidth() + max3 + max4;
                    i23++;
                    i39 = max6;
                    i40 = max5;
                }
                i24 = ((((i11 - i12) - i9) / 2) + i12) - (i41 / 2);
                int i44 = i41 + i24;
                if (i24 >= i20) {
                    i20 = i44 > min2 ? i24 - (i44 - min2) : i24;
                }
                size4 = arrayList.size();
                for (i25 = 0; i25 < size4; i25++) {
                    i20 = p((View) arrayList.get(i25), i20, i36, iArr);
                }
                arrayList.clear();
            }
            i7 = p(this.f1657e, paddingLeft, min, iArr);
        }
        i8 = i26;
        if (t(this.f1659i)) {
        }
        if (t(this.f1655b)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i7);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - i8));
        int max7 = Math.max(i7, currentContentInsetLeft2);
        int min22 = Math.min(i8, i26 - currentContentInsetRight2);
        if (t(this.f1660j)) {
        }
        if (t(this.f1658f)) {
        }
        t3 = t(this.c);
        t4 = t(this.f1656d);
        if (t3) {
        }
        if (t4) {
        }
        if (t3) {
        }
        if (!t3) {
        }
        if (!t4) {
        }
        j1 j1Var32 = (j1) c0275c0.getLayoutParams();
        j1 j1Var42 = (j1) c0275c02.getLayoutParams();
        if (t3) {
        }
        i12 = paddingLeft;
        z4 = false;
        i13 = this.f1674x & 112;
        i14 = min;
        if (i13 != 48) {
        }
        if (z5) {
        }
        ArrayList arrayList2 = this.f1642E;
        a(arrayList2, 3);
        size = arrayList2.size();
        i20 = max7;
        while (i21 < size) {
        }
        int i362 = i14;
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i22 < size2) {
        }
        a(arrayList2, 1);
        int i372 = iArr[0];
        int i382 = iArr[1];
        size3 = arrayList2.size();
        int i392 = i382;
        int i402 = i372;
        i23 = 0;
        int i412 = 0;
        while (i23 < size3) {
        }
        i24 = ((((i11 - i12) - i9) / 2) + i12) - (i412 / 2);
        int i442 = i412 + i24;
        if (i24 >= i20) {
        }
        size4 = arrayList2.size();
        while (i25 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a3 = r1.a(this);
        int i12 = !a3 ? 1 : 0;
        int i13 = 0;
        if (t(this.f1657e)) {
            s(this.f1657e, i3, 0, i4, this.f1666p);
            i5 = l(this.f1657e) + this.f1657e.getMeasuredWidth();
            i6 = Math.max(0, m(this.f1657e) + this.f1657e.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f1657e.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (t(this.f1659i)) {
            s(this.f1659i, i3, 0, i4, this.f1666p);
            i5 = l(this.f1659i) + this.f1659i.getMeasuredWidth();
            i6 = Math.max(i6, m(this.f1659i) + this.f1659i.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1659i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.f1644G;
        iArr[a3 ? 1 : 0] = max2;
        if (t(this.f1655b)) {
            s(this.f1655b, i3, max, i4, this.f1666p);
            i8 = l(this.f1655b) + this.f1655b.getMeasuredWidth();
            i6 = Math.max(i6, m(this.f1655b) + this.f1655b.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1655b.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (t(this.f1660j)) {
            max3 += r(this.f1660j, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, m(this.f1660j) + this.f1660j.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1660j.getMeasuredState());
        }
        if (t(this.f1658f)) {
            max3 += r(this.f1658f, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, m(this.f1658f) + this.f1658f.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1658f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((j1) childAt.getLayoutParams()).f3723b == 0 && t(childAt)) {
                max3 += r(childAt, i3, max3, i4, 0, iArr);
                i6 = Math.max(i6, m(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        int i15 = this.f1669s + this.f1670t;
        int i16 = this.f1667q + this.f1668r;
        if (t(this.c)) {
            r(this.c, i3, max3 + i16, i4, i15, iArr);
            int l3 = l(this.c) + this.c.getMeasuredWidth();
            i9 = m(this.c) + this.c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.c.getMeasuredState());
            i11 = l3;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (t(this.f1656d)) {
            i11 = Math.max(i11, r(this.f1656d, i3, max3 + i16, i4, i9 + i15, iArr));
            i9 += m(this.f1656d) + this.f1656d.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f1656d.getMeasuredState());
        }
        int max4 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i11, getSuggestedMinimumWidth()), i3, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.f1650M) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof l1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l1 l1Var = (l1) parcelable;
        super.onRestoreInstanceState(l1Var.f783b);
        ActionMenuView actionMenuView = this.f1655b;
        MenuC0207m menuC0207m = actionMenuView != null ? actionMenuView.f1579q : null;
        int i3 = l1Var.f3731d;
        if (i3 != 0 && this.f1649L != null && menuC0207m != null && (findItem = menuC0207m.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (l1Var.f3732e) {
            F0.h hVar = this.f1654Q;
            removeCallbacks(hVar);
            post(hVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        Q0 q02 = this.f1671u;
        boolean z3 = i3 == 1;
        if (z3 == q02.g) {
            return;
        }
        q02.g = z3;
        if (!q02.h) {
            q02.f3613a = q02.f3616e;
            q02.f3614b = q02.f3617f;
            return;
        }
        if (z3) {
            int i4 = q02.f3615d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = q02.f3616e;
            }
            q02.f3613a = i4;
            int i5 = q02.c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = q02.f3617f;
            }
            q02.f3614b = i5;
            return;
        }
        int i6 = q02.c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = q02.f3616e;
        }
        q02.f3613a = i6;
        int i7 = q02.f3615d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = q02.f3617f;
        }
        q02.f3614b = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, P.b, k.l1] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0288j c0288j;
        C0209o c0209o;
        ?? bVar = new P.b(super.onSaveInstanceState());
        i1 i1Var = this.f1649L;
        if (i1Var != null && (c0209o = i1Var.c) != null) {
            bVar.f3731d = c0209o.f3335a;
        }
        ActionMenuView actionMenuView = this.f1655b;
        bVar.f3732e = (actionMenuView == null || (c0288j = actionMenuView.f1583u) == null || !c0288j.i()) ? false : true;
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1641C = false;
        }
        if (!this.f1641C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1641C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1641C = false;
        }
        return true;
    }

    public final int p(View view, int i3, int i4, int[] iArr) {
        j1 j1Var = (j1) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) j1Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int k2 = k(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin + max;
    }

    public final int q(View view, int i3, int i4, int[] iArr) {
        j1 j1Var = (j1) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) j1Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int k2 = k(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) j1Var).leftMargin);
    }

    public final int r(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f1653P != z3) {
            this.f1653P = z3;
            u();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC0059a.s(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f1650M = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f1673w) {
            this.f1673w = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f1672v) {
            this.f1672v = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC0059a.s(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC0059a.s(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f1657e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(k1 k1Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1655b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f1662l != i3) {
            this.f1662l = i3;
            if (i3 == 0) {
                this.f1661k = getContext();
            } else {
                this.f1661k = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f1670t = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f1668r = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f1667q = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f1669s = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void u() {
        boolean z3;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a3 = h1.a(this);
            i1 i1Var = this.f1649L;
            if (i1Var != null && i1Var.c != null && a3 != null) {
                WeakHashMap weakHashMap = T.f402a;
                if (E.b(this) && this.f1653P) {
                    z3 = true;
                    if (!z3 && this.f1652O == null) {
                        if (this.f1651N == null) {
                            this.f1651N = h1.b(new u(12, this));
                        }
                        h1.c(a3, this.f1651N);
                        this.f1652O = a3;
                        return;
                    }
                    if (!z3 || (onBackInvokedDispatcher = this.f1652O) == null) {
                    }
                    h1.d(onBackInvokedDispatcher, this.f1651N);
                    this.f1652O = null;
                    return;
                }
            }
            z3 = false;
            if (!z3) {
            }
            if (z3) {
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1674x = 8388627;
        this.f1642E = new ArrayList();
        this.f1643F = new ArrayList();
        this.f1644G = new int[2];
        this.f1645H = new h(9);
        new ArrayList();
        this.f1646I = new g1(this);
        this.f1654Q = new F0.h(14, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0116a.f2685x;
        m F2 = m.F(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        T.k(this, context, iArr, attributeSet, (TypedArray) F2.f5087d, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        this.f1663m = typedArray.getResourceId(28, 0);
        this.f1664n = typedArray.getResourceId(19, 0);
        this.f1674x = typedArray.getInteger(0, 8388627);
        this.f1665o = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1670t = dimensionPixelOffset;
        this.f1669s = dimensionPixelOffset;
        this.f1668r = dimensionPixelOffset;
        this.f1667q = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1667q = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1668r = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1669s = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1670t = dimensionPixelOffset5;
        }
        this.f1666p = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q0 q02 = this.f1671u;
        q02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q02.f3616e = dimensionPixelSize;
            q02.f3613a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q02.f3617f = dimensionPixelSize2;
            q02.f3614b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            q02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1672v = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1673w = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.g = F2.r(4);
        this.h = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1661k = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable r3 = F2.r(16);
        if (r3 != null) {
            setNavigationIcon(r3);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable r4 = F2.r(11);
        if (r4 != null) {
            setLogo(r4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(F2.q(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(F2.q(20));
        }
        if (typedArray.hasValue(14)) {
            n(typedArray.getResourceId(14, 0));
        }
        F2.J();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, k.j1] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f3722a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2666b);
        marginLayoutParams.f3722a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f3723b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0316x c0316x = this.f1659i;
        if (c0316x != null) {
            c0316x.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1659i.setImageDrawable(drawable);
        } else {
            C0316x c0316x = this.f1659i;
            if (c0316x != null) {
                c0316x.setImageDrawable(this.g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1658f == null) {
                this.f1658f = new C0318y(getContext(), null, 0);
            }
            if (!o(this.f1658f)) {
                b(this.f1658f, true);
            }
        } else {
            C0318y c0318y = this.f1658f;
            if (c0318y != null && o(c0318y)) {
                removeView(this.f1658f);
                this.f1643F.remove(this.f1658f);
            }
        }
        C0318y c0318y2 = this.f1658f;
        if (c0318y2 != null) {
            c0318y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1658f == null) {
            this.f1658f = new C0318y(getContext(), null, 0);
        }
        C0318y c0318y = this.f1658f;
        if (c0318y != null) {
            c0318y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0316x c0316x = this.f1657e;
        if (c0316x != null) {
            c0316x.setContentDescription(charSequence);
            o1.a(this.f1657e, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f1657e)) {
                b(this.f1657e, true);
            }
        } else {
            C0316x c0316x = this.f1657e;
            if (c0316x != null && o(c0316x)) {
                removeView(this.f1657e);
                this.f1643F.remove(this.f1657e);
            }
        }
        C0316x c0316x2 = this.f1657e;
        if (c0316x2 != null) {
            c0316x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1656d == null) {
                Context context = getContext();
                C0275c0 c0275c0 = new C0275c0(context, null);
                this.f1656d = c0275c0;
                c0275c0.setSingleLine();
                this.f1656d.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f1664n;
                if (i3 != 0) {
                    this.f1656d.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f1640B;
                if (colorStateList != null) {
                    this.f1656d.setTextColor(colorStateList);
                }
            }
            if (!o(this.f1656d)) {
                b(this.f1656d, true);
            }
        } else {
            C0275c0 c0275c02 = this.f1656d;
            if (c0275c02 != null && o(c0275c02)) {
                removeView(this.f1656d);
                this.f1643F.remove(this.f1656d);
            }
        }
        C0275c0 c0275c03 = this.f1656d;
        if (c0275c03 != null) {
            c0275c03.setText(charSequence);
        }
        this.f1676z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1640B = colorStateList;
        C0275c0 c0275c0 = this.f1656d;
        if (c0275c0 != null) {
            c0275c0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                C0275c0 c0275c0 = new C0275c0(context, null);
                this.c = c0275c0;
                c0275c0.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f1663m;
                if (i3 != 0) {
                    this.c.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f1639A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!o(this.c)) {
                b(this.c, true);
            }
        } else {
            C0275c0 c0275c02 = this.c;
            if (c0275c02 != null && o(c0275c02)) {
                removeView(this.c);
                this.f1643F.remove(this.c);
            }
        }
        C0275c0 c0275c03 = this.c;
        if (c0275c03 != null) {
            c0275c03.setText(charSequence);
        }
        this.f1675y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1639A = colorStateList;
        C0275c0 c0275c0 = this.c;
        if (c0275c0 != null) {
            c0275c0.setTextColor(colorStateList);
        }
    }
}
