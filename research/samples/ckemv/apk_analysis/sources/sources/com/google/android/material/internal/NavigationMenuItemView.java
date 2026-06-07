package com.google.android.material.internal;

import B.b;
import G0.e;
import J.B;
import J.T;
import N.p;
import O0.d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import j.C0209o;
import j.InterfaceC0189A;
import java.util.WeakHashMap;
import k.C0319y0;
import k.o1;
import z.AbstractC0459i;
import z.AbstractC0464n;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements InterfaceC0189A {

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f2448H = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public final CheckedTextView f2449A;

    /* renamed from: B, reason: collision with root package name */
    public FrameLayout f2450B;

    /* renamed from: C, reason: collision with root package name */
    public C0209o f2451C;
    public ColorStateList D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2452E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f2453F;

    /* renamed from: G, reason: collision with root package name */
    public final e f2454G;

    /* renamed from: w, reason: collision with root package name */
    public int f2455w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2456x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2457y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f2458z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2458z = true;
        e eVar = new e(2, this);
        this.f2454G = eVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(xyz.happify.ckemv.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(xyz.happify.ckemv.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(xyz.happify.ckemv.R.id.design_menu_item_text);
        this.f2449A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, eVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2450B == null) {
                this.f2450B = (FrameLayout) ((ViewStub) findViewById(xyz.happify.ckemv.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f2450B.removeAllViews();
            this.f2450B.addView(view);
        }
    }

    @Override // j.InterfaceC0189A
    public final void c(C0209o c0209o) {
        StateListDrawable stateListDrawable;
        this.f2451C = c0209o;
        int i3 = c0209o.f3335a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(c0209o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(xyz.happify.ckemv.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2448H, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f402a;
            B.q(this, stateListDrawable);
        }
        setCheckable(c0209o.isCheckable());
        setChecked(c0209o.isChecked());
        setEnabled(c0209o.isEnabled());
        setTitle(c0209o.f3338e);
        setIcon(c0209o.getIcon());
        setActionView(c0209o.getActionView());
        setContentDescription(c0209o.f3348q);
        o1.a(this, c0209o.f3349r);
        C0209o c0209o2 = this.f2451C;
        CharSequence charSequence = c0209o2.f3338e;
        CheckedTextView checkedTextView = this.f2449A;
        if (charSequence == null && c0209o2.getIcon() == null && this.f2451C.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2450B;
            if (frameLayout != null) {
                C0319y0 c0319y0 = (C0319y0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0319y0).width = -1;
                this.f2450B.setLayoutParams(c0319y0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2450B;
        if (frameLayout2 != null) {
            C0319y0 c0319y02 = (C0319y0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0319y02).width = -2;
            this.f2450B.setLayoutParams(c0319y02);
        }
    }

    @Override // j.InterfaceC0189A
    public C0209o getItemData() {
        return this.f2451C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        C0209o c0209o = this.f2451C;
        if (c0209o != null && c0209o.isCheckable() && this.f2451C.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2448H);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f2457y != z3) {
            this.f2457y = z3;
            this.f2454G.h(this.f2449A, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2449A;
        checkedTextView.setChecked(z3);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.f2458z) ? 1 : 0);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2452E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.D);
            }
            int i3 = this.f2455w;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.f2456x) {
            if (this.f2453F == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0464n.f5302a;
                Drawable a3 = AbstractC0459i.a(resources, xyz.happify.ckemv.R.drawable.navigation_empty_icon, theme);
                this.f2453F = a3;
                if (a3 != null) {
                    int i4 = this.f2455w;
                    a3.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f2453F;
        }
        p.e(this.f2449A, drawable, null, null, null);
    }

    public void setIconPadding(int i3) {
        this.f2449A.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.f2455w = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        this.f2452E = colorStateList != null;
        C0209o c0209o = this.f2451C;
        if (c0209o != null) {
            setIcon(c0209o.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.f2449A.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f2456x = z3;
    }

    public void setTextAppearance(int i3) {
        this.f2449A.setTextAppearance(i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2449A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2449A.setText(charSequence);
    }
}
