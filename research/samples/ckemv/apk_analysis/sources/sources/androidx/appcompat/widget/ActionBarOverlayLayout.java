package androidx.appcompat.widget;

import A1.i;
import J.B;
import J.F;
import J.H;
import J.InterfaceC0016o;
import J.InterfaceC0017p;
import J.T;
import J.n0;
import J.o0;
import J.p0;
import J.q0;
import J.w0;
import J.y0;
import a.AbstractC0059a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import f.C0152I;
import f.m;
import i.l;
import j.MenuC0207m;
import java.util.WeakHashMap;
import k.C0278e;
import k.C0288j;
import k.InterfaceC0276d;
import k.InterfaceC0295m0;
import k.InterfaceC0297n0;
import k.RunnableC0274c;
import k.i1;
import k.n1;
import xyz.happify.ckemv.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0295m0, InterfaceC0016o, InterfaceC0017p {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f1552C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public final RunnableC0274c f1553A;

    /* renamed from: B, reason: collision with root package name */
    public final i f1554B;

    /* renamed from: b, reason: collision with root package name */
    public int f1555b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f1556d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f1557e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0297n0 f1558f;
    public Drawable g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1559i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1560j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1561k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1562l;

    /* renamed from: m, reason: collision with root package name */
    public int f1563m;

    /* renamed from: n, reason: collision with root package name */
    public int f1564n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f1565o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f1566p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f1567q;

    /* renamed from: r, reason: collision with root package name */
    public y0 f1568r;

    /* renamed from: s, reason: collision with root package name */
    public y0 f1569s;

    /* renamed from: t, reason: collision with root package name */
    public y0 f1570t;

    /* renamed from: u, reason: collision with root package name */
    public y0 f1571u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0276d f1572v;

    /* renamed from: w, reason: collision with root package name */
    public OverScroller f1573w;

    /* renamed from: x, reason: collision with root package name */
    public ViewPropertyAnimator f1574x;

    /* renamed from: y, reason: collision with root package name */
    public final D0.a f1575y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0274c f1576z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.f1565o = new Rect();
        this.f1566p = new Rect();
        this.f1567q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        y0 y0Var = y0.f469b;
        this.f1568r = y0Var;
        this.f1569s = y0Var;
        this.f1570t = y0Var;
        this.f1571u = y0Var;
        this.f1575y = new D0.a(3, this);
        this.f1576z = new RunnableC0274c(this, 0);
        this.f1553A = new RunnableC0274c(this, 1);
        i(context);
        this.f1554B = new i(2);
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z3) {
        boolean z4;
        C0278e c0278e = (C0278e) frameLayout.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0278e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0278e).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0278e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0278e).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0278e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0278e).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c0278e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c0278e).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // J.InterfaceC0016o
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // J.InterfaceC0017p
    public final void b(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        c(view, i3, i4, i5, i6, i7);
    }

    @Override // J.InterfaceC0016o
    public final void c(View view, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i3, i4, i5, i6);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0278e;
    }

    @Override // J.InterfaceC0016o
    public final void d(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.g == null || this.h) {
            return;
        }
        if (this.f1557e.getVisibility() == 0) {
            i3 = (int) (this.f1557e.getTranslationY() + this.f1557e.getBottom() + 0.5f);
        } else {
            i3 = 0;
        }
        this.g.setBounds(0, i3, getWidth(), this.g.getIntrinsicHeight() + i3);
        this.g.draw(canvas);
    }

    @Override // J.InterfaceC0016o
    public final void e(View view, int i3, int i4, int[] iArr, int i5) {
    }

    @Override // J.InterfaceC0016o
    public final boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1557e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        i iVar = this.f1554B;
        return iVar.c | iVar.f51b;
    }

    public CharSequence getTitle() {
        k();
        return ((n1) this.f1558f).f3737a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1576z);
        removeCallbacks(this.f1553A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1574x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1552C);
        this.f1555b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1573w = new OverScroller(context);
    }

    public final void j(int i3) {
        k();
        if (i3 == 2) {
            this.f1558f.getClass();
        } else if (i3 == 5) {
            this.f1558f.getClass();
        } else {
            if (i3 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0297n0 wrapper;
        if (this.f1556d == null) {
            this.f1556d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1557e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0297n0) {
                wrapper = (InterfaceC0297n0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1558f = wrapper;
        }
    }

    public final void l(MenuC0207m menuC0207m, m mVar) {
        k();
        n1 n1Var = (n1) this.f1558f;
        C0288j c0288j = n1Var.f3746m;
        Toolbar toolbar = n1Var.f3737a;
        if (c0288j == null) {
            n1Var.f3746m = new C0288j(toolbar.getContext());
        }
        C0288j c0288j2 = n1Var.f3746m;
        c0288j2.f3695f = mVar;
        if (menuC0207m == null && toolbar.f1655b == null) {
            return;
        }
        toolbar.f();
        MenuC0207m menuC0207m2 = toolbar.f1655b.f1579q;
        if (menuC0207m2 == menuC0207m) {
            return;
        }
        if (menuC0207m2 != null) {
            menuC0207m2.r(toolbar.f1648K);
            menuC0207m2.r(toolbar.f1649L);
        }
        if (toolbar.f1649L == null) {
            toolbar.f1649L = new i1(toolbar);
        }
        c0288j2.f3705r = true;
        if (menuC0207m != null) {
            menuC0207m.b(c0288j2, toolbar.f1661k);
            menuC0207m.b(toolbar.f1649L, toolbar.f1661k);
        } else {
            c0288j2.e(toolbar.f1661k, null);
            toolbar.f1649L.e(toolbar.f1661k, null);
            c0288j2.c();
            toolbar.f1649L.c();
        }
        toolbar.f1655b.setPopupTheme(toolbar.f1662l);
        toolbar.f1655b.setPresenter(c0288j2);
        toolbar.f1648K = c0288j2;
        toolbar.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r0 != false) goto L9;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        y0 g = y0.g(this, windowInsets);
        boolean g3 = g(this.f1557e, new Rect(g.b(), g.d(), g.c(), g.a()), false);
        WeakHashMap weakHashMap = T.f402a;
        Rect rect = this.f1565o;
        H.b(this, g, rect);
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        w0 w0Var = g.f470a;
        y0 l3 = w0Var.l(i3, i4, i5, i6);
        this.f1568r = l3;
        if (!this.f1569s.equals(l3)) {
            this.f1569s = this.f1568r;
            g3 = true;
        }
        Rect rect2 = this.f1566p;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        }
        requestLayout();
        return w0Var.a().f470a.c().f470a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = T.f402a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0278e c0278e = (C0278e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0278e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0278e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int measuredHeight;
        k();
        measureChildWithMargins(this.f1557e, i3, 0, i4, 0);
        C0278e c0278e = (C0278e) this.f1557e.getLayoutParams();
        int max = Math.max(0, this.f1557e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0278e).leftMargin + ((ViewGroup.MarginLayoutParams) c0278e).rightMargin);
        int max2 = Math.max(0, this.f1557e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0278e).topMargin + ((ViewGroup.MarginLayoutParams) c0278e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1557e.getMeasuredState());
        WeakHashMap weakHashMap = T.f402a;
        boolean z3 = (B.g(this) & 256) != 0;
        if (z3) {
            measuredHeight = this.f1555b;
            if (this.f1560j && this.f1557e.getTabContainer() != null) {
                measuredHeight += this.f1555b;
            }
        } else {
            measuredHeight = this.f1557e.getVisibility() != 8 ? this.f1557e.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1565o;
        Rect rect2 = this.f1567q;
        rect2.set(rect);
        y0 y0Var = this.f1568r;
        this.f1570t = y0Var;
        if (this.f1559i || z3) {
            A.d b3 = A.d.b(y0Var.b(), this.f1570t.d() + measuredHeight, this.f1570t.c(), this.f1570t.a());
            y0 y0Var2 = this.f1570t;
            int i5 = Build.VERSION.SDK_INT;
            q0 p0Var = i5 >= 30 ? new p0(y0Var2) : i5 >= 29 ? new o0(y0Var2) : new n0(y0Var2);
            p0Var.g(b3);
            this.f1570t = p0Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f1570t = y0Var.f470a.l(0, measuredHeight, 0, 0);
        }
        g(this.f1556d, rect2, true);
        if (!this.f1571u.equals(this.f1570t)) {
            y0 y0Var3 = this.f1570t;
            this.f1571u = y0Var3;
            ContentFrameLayout contentFrameLayout = this.f1556d;
            WindowInsets f3 = y0Var3.f();
            if (f3 != null) {
                WindowInsets a3 = F.a(contentFrameLayout, f3);
                if (!a3.equals(f3)) {
                    y0.g(contentFrameLayout, a3);
                }
            }
        }
        measureChildWithMargins(this.f1556d, i3, 0, i4, 0);
        C0278e c0278e2 = (C0278e) this.f1556d.getLayoutParams();
        int max3 = Math.max(max, this.f1556d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0278e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0278e2).rightMargin);
        int max4 = Math.max(max2, this.f1556d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0278e2).topMargin + ((ViewGroup.MarginLayoutParams) c0278e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1556d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (!this.f1561k || !z3) {
            return false;
        }
        this.f1573w.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1573w.getFinalY() > this.f1557e.getHeight()) {
            h();
            this.f1553A.run();
        } else {
            h();
            this.f1576z.run();
        }
        this.f1562l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f1563m + i4;
        this.f1563m = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        C0152I c0152i;
        l lVar;
        this.f1554B.f51b = i3;
        this.f1563m = getActionBarHideOffset();
        h();
        InterfaceC0276d interfaceC0276d = this.f1572v;
        if (interfaceC0276d == null || (lVar = (c0152i = (C0152I) interfaceC0276d).f2868t) == null) {
            return;
        }
        lVar.a();
        c0152i.f2868t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f1557e.getVisibility() != 0) {
            return false;
        }
        return this.f1561k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1561k || this.f1562l) {
            return;
        }
        if (this.f1563m <= this.f1557e.getHeight()) {
            h();
            postDelayed(this.f1576z, 600L);
        } else {
            h();
            postDelayed(this.f1553A, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        k();
        int i4 = this.f1564n ^ i3;
        this.f1564n = i3;
        boolean z3 = (i3 & 4) == 0;
        boolean z4 = (i3 & 256) != 0;
        InterfaceC0276d interfaceC0276d = this.f1572v;
        if (interfaceC0276d != null) {
            ((C0152I) interfaceC0276d).f2863o = !z4;
            if (z3 || !z4) {
                C0152I c0152i = (C0152I) interfaceC0276d;
                if (c0152i.f2865q) {
                    c0152i.f2865q = false;
                    c0152i.M(true);
                }
            } else {
                C0152I c0152i2 = (C0152I) interfaceC0276d;
                if (!c0152i2.f2865q) {
                    c0152i2.f2865q = true;
                    c0152i2.M(true);
                }
            }
        }
        if ((i4 & 256) == 0 || this.f1572v == null) {
            return;
        }
        WeakHashMap weakHashMap = T.f402a;
        F.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.c = i3;
        InterfaceC0276d interfaceC0276d = this.f1572v;
        if (interfaceC0276d != null) {
            ((C0152I) interfaceC0276d).f2862n = i3;
        }
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f1557e.setTranslationY(-Math.max(0, Math.min(i3, this.f1557e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0276d interfaceC0276d) {
        this.f1572v = interfaceC0276d;
        if (getWindowToken() != null) {
            ((C0152I) this.f1572v).f2862n = this.c;
            int i3 = this.f1564n;
            if (i3 != 0) {
                onWindowSystemUiVisibilityChanged(i3);
                WeakHashMap weakHashMap = T.f402a;
                F.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f1560j = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f1561k) {
            this.f1561k = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        k();
        n1 n1Var = (n1) this.f1558f;
        n1Var.f3739d = i3 != 0 ? AbstractC0059a.s(n1Var.f3737a.getContext(), i3) : null;
        n1Var.c();
    }

    public void setLogo(int i3) {
        k();
        n1 n1Var = (n1) this.f1558f;
        n1Var.f3740e = i3 != 0 ? AbstractC0059a.s(n1Var.f3737a.getContext(), i3) : null;
        n1Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f1559i = z3;
        this.h = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    @Override // k.InterfaceC0295m0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((n1) this.f1558f).f3744k = callback;
    }

    @Override // k.InterfaceC0295m0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        n1 n1Var = (n1) this.f1558f;
        if (n1Var.g) {
            return;
        }
        n1Var.h = charSequence;
        if ((n1Var.f3738b & 8) != 0) {
            Toolbar toolbar = n1Var.f3737a;
            toolbar.setTitle(charSequence);
            if (n1Var.g) {
                T.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        n1 n1Var = (n1) this.f1558f;
        n1Var.f3739d = drawable;
        n1Var.c();
    }
}
