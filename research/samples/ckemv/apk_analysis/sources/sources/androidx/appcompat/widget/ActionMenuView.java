package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import d1.e;
import f.C0150G;
import j.C0209o;
import j.InterfaceC0190B;
import j.InterfaceC0205k;
import j.InterfaceC0206l;
import j.InterfaceC0219y;
import j.MenuC0207m;
import k.AbstractC0321z0;
import k.C0280f;
import k.C0286i;
import k.C0288j;
import k.C0292l;
import k.C0319y0;
import k.InterfaceC0290k;
import k.InterfaceC0294m;
import k.r1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0321z0 implements InterfaceC0206l, InterfaceC0190B {

    /* renamed from: A, reason: collision with root package name */
    public final int f1577A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0294m f1578B;

    /* renamed from: q, reason: collision with root package name */
    public MenuC0207m f1579q;

    /* renamed from: r, reason: collision with root package name */
    public Context f1580r;

    /* renamed from: s, reason: collision with root package name */
    public int f1581s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1582t;

    /* renamed from: u, reason: collision with root package name */
    public C0288j f1583u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0219y f1584v;

    /* renamed from: w, reason: collision with root package name */
    public InterfaceC0205k f1585w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1586x;

    /* renamed from: y, reason: collision with root package name */
    public int f1587y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1588z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f1588z = (int) (56.0f * f3);
        this.f1577A = (int) (f3 * 4.0f);
        this.f1580r = context;
        this.f1581s = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.l, android.widget.LinearLayout$LayoutParams] */
    public static C0292l l() {
        ?? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.f3726a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [k.l, android.widget.LinearLayout$LayoutParams] */
    public static C0292l m(ViewGroup.LayoutParams layoutParams) {
        C0292l c0292l;
        if (layoutParams == null) {
            return l();
        }
        if (layoutParams instanceof C0292l) {
            C0292l c0292l2 = (C0292l) layoutParams;
            ?? layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams) c0292l2);
            layoutParams2.f3726a = c0292l2.f3726a;
            c0292l = layoutParams2;
        } else {
            c0292l = new LinearLayout.LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0292l).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0292l).gravity = 16;
        }
        return c0292l;
    }

    @Override // j.InterfaceC0190B
    public final void b(MenuC0207m menuC0207m) {
        this.f1579q = menuC0207m;
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0292l;
    }

    @Override // j.InterfaceC0206l
    public final boolean d(C0209o c0209o) {
        return this.f1579q.q(c0209o, null, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return l();
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1579q == null) {
            Context context = getContext();
            MenuC0207m menuC0207m = new MenuC0207m(context);
            this.f1579q = menuC0207m;
            menuC0207m.f3312e = new C0150G(this);
            C0288j c0288j = new C0288j(context);
            this.f1583u = c0288j;
            c0288j.f3700m = true;
            c0288j.f3701n = true;
            InterfaceC0219y interfaceC0219y = this.f1584v;
            if (interfaceC0219y == null) {
                interfaceC0219y = new e(7);
            }
            c0288j.f3695f = interfaceC0219y;
            this.f1579q.b(c0288j, this.f1580r);
            C0288j c0288j2 = this.f1583u;
            c0288j2.f3696i = this;
            this.f1579q = c0288j2.f3693d;
        }
        return this.f1579q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0288j c0288j = this.f1583u;
        C0286i c0286i = c0288j.f3697j;
        if (c0286i != null) {
            return c0286i.getDrawable();
        }
        if (c0288j.f3699l) {
            return c0288j.f3698k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1581s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // k.AbstractC0321z0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0319y0 generateDefaultLayoutParams() {
        return l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.y0] */
    @Override // k.AbstractC0321z0
    /* renamed from: i */
    public final C0319y0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // k.AbstractC0321z0
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0319y0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public final boolean n(int i3) {
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0290k)) {
            z3 = ((InterfaceC0290k) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC0290k)) ? z3 : z3 | ((InterfaceC0290k) childAt2).a();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0288j c0288j = this.f1583u;
        if (c0288j != null) {
            c0288j.c();
            if (this.f1583u.i()) {
                this.f1583u.f();
                this.f1583u.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0288j c0288j = this.f1583u;
        if (c0288j != null) {
            c0288j.f();
            C0280f c0280f = c0288j.f3708u;
            if (c0280f == null || !c0280f.b()) {
                return;
            }
            c0280f.f3374j.dismiss();
        }
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f1586x) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i3;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = r1.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0292l c0292l = (C0292l) childAt.getLayoutParams();
                if (c0292l.f3726a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i7 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0292l).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0292l).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0292l).leftMargin) + ((LinearLayout.LayoutParams) c0292l).rightMargin;
                    n(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0292l c0292l2 = (C0292l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0292l2.f3726a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0292l2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0292l2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0292l c0292l3 = (C0292l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0292l3.f3726a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) c0292l3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0292l3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // k.AbstractC0321z0, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        ?? r12;
        int i12;
        int i13;
        int i14;
        MenuC0207m menuC0207m;
        boolean z4 = this.f1586x;
        boolean z5 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f1586x = z5;
        if (z4 != z5) {
            this.f1587y = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f1586x && (menuC0207m = this.f1579q) != null && size != this.f1587y) {
            this.f1587y = size;
            menuC0207m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1586x || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                C0292l c0292l = (C0292l) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) c0292l).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0292l).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f1588z;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        boolean z6 = false;
        int i24 = 0;
        int i25 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f1577A;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i26 = size3;
            if (childAt.getVisibility() == 8) {
                i12 = i16;
                i13 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i27 = i21 + 1;
                if (z7) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0292l c0292l2 = (C0292l) childAt.getLayoutParams();
                c0292l2.f3730f = false;
                c0292l2.c = 0;
                c0292l2.f3727b = 0;
                c0292l2.f3728d = false;
                ((LinearLayout.LayoutParams) c0292l2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0292l2).rightMargin = 0;
                c0292l2.f3729e = z7 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i28 = c0292l2.f3726a ? 1 : i18;
                C0292l c0292l3 = (C0292l) childAt.getLayoutParams();
                i12 = i16;
                i13 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i28 <= 0 || (z8 && i28 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i28 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i20;
                    if (measuredWidth % i20 != 0) {
                        i14++;
                    }
                    if (z8 && i14 < 2) {
                        i14 = 2;
                    }
                }
                c0292l3.f3728d = !c0292l3.f3726a && z8;
                c0292l3.f3727b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i20, 1073741824), makeMeasureSpec);
                i22 = Math.max(i22, i14);
                if (c0292l2.f3728d) {
                    i24++;
                }
                if (c0292l2.f3726a) {
                    z6 = true;
                }
                i18 -= i14;
                i25 = Math.max(i25, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j3 |= 1 << i23;
                }
                i21 = i27;
            }
            i23++;
            size3 = i26;
            paddingBottom = i13;
            i16 = i12;
        }
        int i29 = i16;
        int i30 = size3;
        int i31 = i25;
        boolean z9 = z6 && i21 == 2;
        boolean z10 = false;
        while (i24 > 0 && i18 > 0) {
            int i32 = Integer.MAX_VALUE;
            int i33 = 0;
            int i34 = 0;
            long j4 = 0;
            while (i34 < childCount2) {
                int i35 = i31;
                C0292l c0292l4 = (C0292l) getChildAt(i34).getLayoutParams();
                boolean z11 = z10;
                if (c0292l4.f3728d) {
                    int i36 = c0292l4.f3727b;
                    if (i36 < i32) {
                        j4 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        i33++;
                        j4 |= 1 << i34;
                    }
                }
                i34++;
                z10 = z11;
                i31 = i35;
            }
            i7 = i31;
            z3 = z10;
            j3 |= j4;
            if (i33 > i18) {
                i6 = mode;
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                C0292l c0292l5 = (C0292l) childAt2.getLayoutParams();
                int i39 = mode;
                int i40 = childMeasureSpec;
                int i41 = childCount2;
                long j5 = 1 << i38;
                if ((j4 & j5) != 0) {
                    if (z9 && c0292l5.f3729e) {
                        r12 = 1;
                        r12 = 1;
                        if (i18 == 1) {
                            childAt2.setPadding(i5 + i20, 0, i5, 0);
                        }
                    } else {
                        r12 = 1;
                    }
                    c0292l5.f3727b += r12;
                    c0292l5.f3730f = r12;
                    i18--;
                } else if (c0292l5.f3727b == i37) {
                    j3 |= j5;
                }
                i38++;
                childMeasureSpec = i40;
                mode = i39;
                childCount2 = i41;
            }
            i31 = i7;
            z10 = true;
        }
        i6 = mode;
        i7 = i31;
        z3 = z10;
        int i42 = childMeasureSpec;
        int i43 = childCount2;
        boolean z12 = !z6 && i21 == 1;
        if (i18 <= 0 || j3 == 0 || (i18 >= i21 - 1 && !z12 && i22 <= 1)) {
            i8 = i43;
        } else {
            float bitCount = Long.bitCount(j3);
            if (!z12) {
                if ((j3 & 1) != 0 && !((C0292l) getChildAt(0).getLayoutParams()).f3729e) {
                    bitCount -= 0.5f;
                }
                int i44 = i43 - 1;
                if ((j3 & (1 << i44)) != 0 && !((C0292l) getChildAt(i44).getLayoutParams()).f3729e) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > 0.0f ? (int) ((i18 * i20) / bitCount) : 0;
            i8 = i43;
            for (int i46 = 0; i46 < i8; i46++) {
                if ((j3 & (1 << i46)) != 0) {
                    View childAt3 = getChildAt(i46);
                    C0292l c0292l6 = (C0292l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0292l6.c = i45;
                        c0292l6.f3730f = true;
                        if (i46 == 0 && !c0292l6.f3729e) {
                            ((LinearLayout.LayoutParams) c0292l6).leftMargin = (-i45) / 2;
                        }
                        z3 = true;
                    } else if (c0292l6.f3726a) {
                        c0292l6.c = i45;
                        c0292l6.f3730f = true;
                        ((LinearLayout.LayoutParams) c0292l6).rightMargin = (-i45) / 2;
                        z3 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) c0292l6).leftMargin = i45 / 2;
                        }
                        if (i46 != i8 - 1) {
                            ((LinearLayout.LayoutParams) c0292l6).rightMargin = i45 / 2;
                        }
                    }
                }
            }
        }
        if (z3) {
            int i47 = 0;
            while (i47 < i8) {
                View childAt4 = getChildAt(i47);
                C0292l c0292l7 = (C0292l) childAt4.getLayoutParams();
                if (c0292l7.f3730f) {
                    i11 = i42;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0292l7.f3727b * i20) + c0292l7.c, 1073741824), i11);
                } else {
                    i11 = i42;
                }
                i47++;
                i42 = i11;
            }
        }
        if (i6 != 1073741824) {
            i10 = i29;
            i9 = i7;
        } else {
            i9 = i30;
            i10 = i29;
        }
        setMeasuredDimension(i10, i9);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f1583u.f3705r = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0294m interfaceC0294m) {
        this.f1578B = interfaceC0294m;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0288j c0288j = this.f1583u;
        C0286i c0286i = c0288j.f3697j;
        if (c0286i != null) {
            c0286i.setImageDrawable(drawable);
        } else {
            c0288j.f3699l = true;
            c0288j.f3698k = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
        this.f1582t = z3;
    }

    public void setPopupTheme(int i3) {
        if (this.f1581s != i3) {
            this.f1581s = i3;
            if (i3 == 0) {
                this.f1580r = getContext();
            } else {
                this.f1580r = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0288j c0288j) {
        this.f1583u = c0288j;
        c0288j.f3696i = this;
        this.f1579q = c0288j.f3693d;
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }
}
