package androidx.appcompat.widget;

import J.B;
import J.C0003b0;
import J.T;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.j;
import e.AbstractC0116a;
import i.AbstractC0184b;
import j.InterfaceC0190B;
import j.MenuC0207m;
import java.util.WeakHashMap;
import k.C0270a;
import k.C0280f;
import k.C0288j;
import k.r1;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final C0270a f1535b;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f1536d;

    /* renamed from: e, reason: collision with root package name */
    public C0288j f1537e;

    /* renamed from: f, reason: collision with root package name */
    public int f1538f;
    public C0003b0 g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1539i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1540j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f1541k;

    /* renamed from: l, reason: collision with root package name */
    public View f1542l;

    /* renamed from: m, reason: collision with root package name */
    public View f1543m;

    /* renamed from: n, reason: collision with root package name */
    public View f1544n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f1545o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1546p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f1547q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1548r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1549s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1550t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1551u;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1535b = new C0270a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.c = context;
        } else {
            this.c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0116a.f2667d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0059a.s(context, resourceId);
        WeakHashMap weakHashMap = T.f402a;
        B.q(this, drawable);
        this.f1548r = obtainStyledAttributes.getResourceId(5, 0);
        this.f1549s = obtainStyledAttributes.getResourceId(4, 0);
        this.f1538f = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1551u = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i4);
        return Math.max(0, i3 - view.getMeasuredWidth());
    }

    public static int g(View view, int i3, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = ((i5 - measuredHeight) / 2) + i4;
        if (z3) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0184b abstractC0184b) {
        View view = this.f1542l;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1551u, (ViewGroup) this, false);
            this.f1542l = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1542l);
        }
        View findViewById = this.f1542l.findViewById(R.id.action_mode_close_button);
        this.f1543m = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0184b));
        MenuC0207m c = abstractC0184b.c();
        C0288j c0288j = this.f1537e;
        if (c0288j != null) {
            c0288j.f();
            C0280f c0280f = c0288j.f3708u;
            if (c0280f != null && c0280f.b()) {
                c0280f.f3374j.dismiss();
            }
        }
        C0288j c0288j2 = new C0288j(getContext());
        this.f1537e = c0288j2;
        c0288j2.f3700m = true;
        c0288j2.f3701n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.f1537e, this.c);
        C0288j c0288j3 = this.f1537e;
        InterfaceC0190B interfaceC0190B = c0288j3.f3696i;
        if (interfaceC0190B == null) {
            InterfaceC0190B interfaceC0190B2 = (InterfaceC0190B) c0288j3.f3694e.inflate(c0288j3.g, (ViewGroup) this, false);
            c0288j3.f3696i = interfaceC0190B2;
            interfaceC0190B2.b(c0288j3.f3693d);
            c0288j3.c();
        }
        InterfaceC0190B interfaceC0190B3 = c0288j3.f3696i;
        if (interfaceC0190B != interfaceC0190B3) {
            ((ActionMenuView) interfaceC0190B3).setPresenter(c0288j3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0190B3;
        this.f1536d = actionMenuView;
        WeakHashMap weakHashMap = T.f402a;
        B.q(actionMenuView, null);
        addView(this.f1536d, layoutParams);
    }

    public final void d() {
        if (this.f1545o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1545o = linearLayout;
            this.f1546p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1547q = (TextView) this.f1545o.findViewById(R.id.action_bar_subtitle);
            int i3 = this.f1548r;
            if (i3 != 0) {
                this.f1546p.setTextAppearance(getContext(), i3);
            }
            int i4 = this.f1549s;
            if (i4 != 0) {
                this.f1547q.setTextAppearance(getContext(), i4);
            }
        }
        this.f1546p.setText(this.f1540j);
        this.f1547q.setText(this.f1541k);
        boolean z3 = !TextUtils.isEmpty(this.f1540j);
        boolean z4 = !TextUtils.isEmpty(this.f1541k);
        this.f1547q.setVisibility(z4 ? 0 : 8);
        this.f1545o.setVisibility((z3 || z4) ? 0 : 8);
        if (this.f1545o.getParent() == null) {
            addView(this.f1545o);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1544n = null;
        this.f1536d = null;
        this.f1537e = null;
        View view = this.f1543m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f1535b.c : getVisibility();
    }

    public int getContentHeight() {
        return this.f1538f;
    }

    public CharSequence getSubtitle() {
        return this.f1541k;
    }

    public CharSequence getTitle() {
        return this.f1540j;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            C0003b0 c0003b0 = this.g;
            if (c0003b0 != null) {
                c0003b0.b();
            }
            super.setVisibility(i3);
        }
    }

    public final C0003b0 i(int i3, long j3) {
        C0003b0 c0003b0 = this.g;
        if (c0003b0 != null) {
            c0003b0.b();
        }
        C0270a c0270a = this.f1535b;
        if (i3 != 0) {
            C0003b0 a3 = T.a(this);
            a3.a(0.0f);
            a3.c(j3);
            c0270a.f3647d.g = a3;
            c0270a.c = i3;
            a3.d(c0270a);
            return a3;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0003b0 a4 = T.a(this);
        a4.a(1.0f);
        a4.c(j3);
        c0270a.f3647d.g = a4;
        c0270a.c = i3;
        a4.d(c0270a);
        return a4;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0116a.f2665a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0288j c0288j = this.f1537e;
        if (c0288j != null) {
            Configuration configuration2 = c0288j.c.getResources().getConfiguration();
            int i3 = configuration2.screenWidthDp;
            int i4 = configuration2.screenHeightDp;
            c0288j.f3704q = (configuration2.smallestScreenWidthDp > 600 || i3 > 600 || (i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960)) ? 5 : (i3 >= 500 || (i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640)) ? 4 : i3 >= 360 ? 3 : 2;
            MenuC0207m menuC0207m = c0288j.f3693d;
            if (menuC0207m != null) {
                menuC0207m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0288j c0288j = this.f1537e;
        if (c0288j != null) {
            c0288j.f();
            C0280f c0280f = this.f1537e.f3708u;
            if (c0280f == null || !c0280f.b()) {
                return;
            }
            c0280f.f3374j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1539i = false;
        }
        if (!this.f1539i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1539i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1539i = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        boolean a3 = r1.a(this);
        int paddingRight = a3 ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1542l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1542l.getLayoutParams();
            int i7 = a3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = a3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i9 = a3 ? paddingRight - i7 : paddingRight + i7;
            int g = g(this.f1542l, i9, paddingTop, paddingTop2, a3) + i9;
            paddingRight = a3 ? g - i8 : g + i8;
        }
        LinearLayout linearLayout = this.f1545o;
        if (linearLayout != null && this.f1544n == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1545o, paddingRight, paddingTop, paddingTop2, a3);
        }
        View view2 = this.f1544n;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, a3);
        }
        int paddingLeft = a3 ? getPaddingLeft() : (i5 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1536d;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i3);
        int i5 = this.f1538f;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        View view = this.f1542l;
        if (view != null) {
            int f3 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1542l.getLayoutParams();
            paddingLeft = f3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1536d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1536d, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1545o;
        if (linearLayout != null && this.f1544n == null) {
            if (this.f1550t) {
                this.f1545o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1545o.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f1545o.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1544n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            int i10 = i9 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f1544n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f1538f > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i11) {
                i11 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public void setContentHeight(int i3) {
        this.f1538f = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1544n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1544n = view;
        if (view != null && (linearLayout = this.f1545o) != null) {
            removeView(linearLayout);
            this.f1545o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1541k = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1540j = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f1550t) {
            requestLayout();
        }
        this.f1550t = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
