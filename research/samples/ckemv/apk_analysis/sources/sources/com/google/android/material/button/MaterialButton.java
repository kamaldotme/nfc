package com.google.android.material.button;

import A.h;
import B.b;
import G0.a;
import G0.c;
import J.C;
import J.T;
import N.p;
import O0.k;
import U0.j;
import U0.v;
import X.d;
import a.AbstractC0059a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.C0300p;
import u2.l;
import v0.f;

/* loaded from: classes.dex */
public class MaterialButton extends C0300p implements Checkable, v {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f2332s = {R.attr.state_checkable};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f2333t = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    public final c f2334e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f2335f;
    public a g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f2336i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2337j;

    /* renamed from: k, reason: collision with root package name */
    public String f2338k;

    /* renamed from: l, reason: collision with root package name */
    public int f2339l;

    /* renamed from: m, reason: collision with root package name */
    public int f2340m;

    /* renamed from: n, reason: collision with root package name */
    public int f2341n;

    /* renamed from: o, reason: collision with root package name */
    public int f2342o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2343p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2344q;

    /* renamed from: r, reason: collision with root package name */
    public int f2345r;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(Z0.a.a(context, attributeSet, xyz.happify.ckemv.R.attr.materialButtonStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Button), attributeSet, xyz.happify.ckemv.R.attr.materialButtonStyle);
        this.f2335f = new LinkedHashSet();
        this.f2343p = false;
        this.f2344q = false;
        Context context2 = getContext();
        TypedArray f3 = k.f(context2, attributeSet, A0.a.f27i, xyz.happify.ckemv.R.attr.materialButtonStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2342o = f3.getDimensionPixelSize(12, 0);
        int i3 = f3.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.h = k.g(i3, mode);
        this.f2336i = l.m(getContext(), f3, 14);
        this.f2337j = l.p(getContext(), f3, 10);
        this.f2345r = f3.getInteger(11, 1);
        this.f2339l = f3.getDimensionPixelSize(13, 0);
        c cVar = new c(this, U0.k.b(context2, attributeSet, xyz.happify.ckemv.R.attr.materialButtonStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Button).a());
        this.f2334e = cVar;
        cVar.c = f3.getDimensionPixelOffset(1, 0);
        cVar.f210d = f3.getDimensionPixelOffset(2, 0);
        cVar.f211e = f3.getDimensionPixelOffset(3, 0);
        cVar.f212f = f3.getDimensionPixelOffset(4, 0);
        if (f3.hasValue(8)) {
            int dimensionPixelSize = f3.getDimensionPixelSize(8, -1);
            cVar.g = dimensionPixelSize;
            float f4 = dimensionPixelSize;
            j e3 = cVar.f209b.e();
            e3.f929e = new U0.a(f4);
            e3.f930f = new U0.a(f4);
            e3.g = new U0.a(f4);
            e3.h = new U0.a(f4);
            cVar.c(e3.a());
            cVar.f220p = true;
        }
        cVar.h = f3.getDimensionPixelSize(20, 0);
        cVar.f213i = k.g(f3.getInt(7, -1), mode);
        cVar.f214j = l.m(getContext(), f3, 6);
        cVar.f215k = l.m(getContext(), f3, 19);
        cVar.f216l = l.m(getContext(), f3, 16);
        cVar.f221q = f3.getBoolean(5, false);
        cVar.f224t = f3.getDimensionPixelSize(9, 0);
        cVar.f222r = f3.getBoolean(21, true);
        WeakHashMap weakHashMap = T.f402a;
        int f5 = C.f(this);
        int paddingTop = getPaddingTop();
        int e4 = C.e(this);
        int paddingBottom = getPaddingBottom();
        if (f3.hasValue(0)) {
            cVar.f219o = true;
            setSupportBackgroundTintList(cVar.f214j);
            setSupportBackgroundTintMode(cVar.f213i);
        } else {
            cVar.e();
        }
        C.k(this, f5 + cVar.c, paddingTop + cVar.f211e, e4 + cVar.f210d, paddingBottom + cVar.f212f);
        f3.recycle();
        setCompoundDrawablePadding(this.f2342o);
        d(this.f2337j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f3 = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f3 = Math.max(f3, getLayout().getLineWidth(i3));
        }
        return (int) Math.ceil(f3);
    }

    public final boolean a() {
        c cVar = this.f2334e;
        return cVar != null && cVar.f221q;
    }

    public final boolean b() {
        c cVar = this.f2334e;
        return (cVar == null || cVar.f219o) ? false : true;
    }

    public final void c() {
        int i3 = this.f2345r;
        boolean z3 = true;
        if (i3 != 1 && i3 != 2) {
            z3 = false;
        }
        if (z3) {
            p.e(this, this.f2337j, null, null, null);
            return;
        }
        if (i3 == 3 || i3 == 4) {
            p.e(this, null, null, this.f2337j, null);
        } else if (i3 == 16 || i3 == 32) {
            p.e(this, null, this.f2337j, null, null);
        }
    }

    public final void d(boolean z3) {
        Drawable drawable = this.f2337j;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2337j = mutate;
            b.h(mutate, this.f2336i);
            PorterDuff.Mode mode = this.h;
            if (mode != null) {
                b.i(this.f2337j, mode);
            }
            int i3 = this.f2339l;
            if (i3 == 0) {
                i3 = this.f2337j.getIntrinsicWidth();
            }
            int i4 = this.f2339l;
            if (i4 == 0) {
                i4 = this.f2337j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2337j;
            int i5 = this.f2340m;
            int i6 = this.f2341n;
            drawable2.setBounds(i5, i6, i3 + i5, i4 + i6);
            this.f2337j.setVisible(true, z3);
        }
        if (z3) {
            c();
            return;
        }
        Drawable[] a3 = p.a(this);
        Drawable drawable3 = a3[0];
        Drawable drawable4 = a3[1];
        Drawable drawable5 = a3[2];
        int i7 = this.f2345r;
        if (((i7 == 1 || i7 == 2) && drawable3 != this.f2337j) || (((i7 == 3 || i7 == 4) && drawable5 != this.f2337j) || ((i7 == 16 || i7 == 32) && drawable4 != this.f2337j))) {
            c();
        }
    }

    public final void e(int i3, int i4) {
        if (this.f2337j == null || getLayout() == null) {
            return;
        }
        int i5 = this.f2345r;
        if (!(i5 == 1 || i5 == 2) && i5 != 3 && i5 != 4) {
            if (i5 == 16 || i5 == 32) {
                this.f2340m = 0;
                if (i5 == 16) {
                    this.f2341n = 0;
                    d(false);
                    return;
                }
                int i6 = this.f2339l;
                if (i6 == 0) {
                    i6 = this.f2337j.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i6) - this.f2342o) - getPaddingBottom()) / 2);
                if (this.f2341n != max) {
                    this.f2341n = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2341n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f2345r;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2340m = 0;
            d(false);
            return;
        }
        int i8 = this.f2339l;
        if (i8 == 0) {
            i8 = this.f2337j.getIntrinsicWidth();
        }
        int textLayoutWidth = i3 - getTextLayoutWidth();
        WeakHashMap weakHashMap = T.f402a;
        int e3 = (((textLayoutWidth - C.e(this)) - i8) - this.f2342o) - C.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            e3 /= 2;
        }
        if ((C.d(this) == 1) != (this.f2345r == 4)) {
            e3 = -e3;
        }
        if (this.f2340m != e3) {
            this.f2340m = e3;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f2338k)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f2338k;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f2334e.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2337j;
    }

    public int getIconGravity() {
        return this.f2345r;
    }

    public int getIconPadding() {
        return this.f2342o;
    }

    public int getIconSize() {
        return this.f2339l;
    }

    public ColorStateList getIconTint() {
        return this.f2336i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.h;
    }

    public int getInsetBottom() {
        return this.f2334e.f212f;
    }

    public int getInsetTop() {
        return this.f2334e.f211e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f2334e.f216l;
        }
        return null;
    }

    public U0.k getShapeAppearanceModel() {
        if (b()) {
            return this.f2334e.f209b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f2334e.f215k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f2334e.h;
        }
        return 0;
    }

    @Override // k.C0300p
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f2334e.f214j : super.getSupportBackgroundTintList();
    }

    @Override // k.C0300p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f2334e.f213i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2343p;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            f.M(this, this.f2334e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f2332s);
        }
        if (this.f2343p) {
            View.mergeDrawableStates(onCreateDrawableState, f2333t);
        }
        return onCreateDrawableState;
    }

    @Override // k.C0300p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2343p);
    }

    @Override // k.C0300p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f2343p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // k.C0300p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof G0.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        G0.b bVar = (G0.b) parcelable;
        super.onRestoreInstanceState(bVar.f783b);
        setChecked(bVar.f207d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, P.b, G0.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new P.b(super.onSaveInstanceState());
        bVar.f207d = this.f2343p;
        return bVar;
    }

    @Override // k.C0300p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2334e.f222r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2337j != null) {
            if (this.f2337j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2338k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (!b()) {
            super.setBackgroundColor(i3);
            return;
        }
        c cVar = this.f2334e;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i3);
        }
    }

    @Override // k.C0300p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        c cVar = this.f2334e;
        cVar.f219o = true;
        ColorStateList colorStateList = cVar.f214j;
        MaterialButton materialButton = cVar.f208a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.f213i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.C0300p, android.view.View
    public void setBackgroundResource(int i3) {
        setBackgroundDrawable(i3 != 0 ? AbstractC0059a.s(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (b()) {
            this.f2334e.f221q = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (a() && isEnabled() && this.f2343p != z3) {
            this.f2343p = z3;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z4 = this.f2343p;
                if (!materialButtonToggleGroup.g) {
                    materialButtonToggleGroup.b(getId(), z4);
                }
            }
            if (this.f2344q) {
                return;
            }
            this.f2344q = true;
            Iterator it = this.f2335f.iterator();
            if (it.hasNext()) {
                d.q(it.next());
                throw null;
            }
            this.f2344q = false;
        }
    }

    public void setCornerRadius(int i3) {
        if (b()) {
            c cVar = this.f2334e;
            if (cVar.f220p && cVar.g == i3) {
                return;
            }
            cVar.g = i3;
            cVar.f220p = true;
            float f3 = i3;
            j e3 = cVar.f209b.e();
            e3.f929e = new U0.a(f3);
            e3.f930f = new U0.a(f3);
            e3.g = new U0.a(f3);
            e3.h = new U0.a(f3);
            cVar.c(e3.a());
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (b()) {
            this.f2334e.b(false).j(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2337j != drawable) {
            this.f2337j = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i3) {
        if (this.f2345r != i3) {
            this.f2345r = i3;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i3) {
        if (this.f2342o != i3) {
            this.f2342o = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        setIcon(i3 != 0 ? AbstractC0059a.s(getContext(), i3) : null);
    }

    public void setIconSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2339l != i3) {
            this.f2339l = i3;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2336i != colorStateList) {
            this.f2336i = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(y.f.c(getContext(), i3));
    }

    public void setInsetBottom(int i3) {
        c cVar = this.f2334e;
        cVar.d(cVar.f211e, i3);
    }

    public void setInsetTop(int i3) {
        c cVar = this.f2334e;
        cVar.d(i3, cVar.f212f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.g = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        a aVar = this.g;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((h) aVar).c).invalidate();
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f2334e;
            if (cVar.f216l != colorStateList) {
                cVar.f216l = colorStateList;
                MaterialButton materialButton = cVar.f208a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(S0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i3) {
        if (b()) {
            setRippleColor(y.f.c(getContext(), i3));
        }
    }

    @Override // U0.v
    public void setShapeAppearanceModel(U0.k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2334e.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (b()) {
            c cVar = this.f2334e;
            cVar.f218n = z3;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f2334e;
            if (cVar.f215k != colorStateList) {
                cVar.f215k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i3) {
        if (b()) {
            setStrokeColor(y.f.c(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (b()) {
            c cVar = this.f2334e;
            if (cVar.h != i3) {
                cVar.h = i3;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // k.C0300p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f2334e;
        if (cVar.f214j != colorStateList) {
            cVar.f214j = colorStateList;
            if (cVar.b(false) != null) {
                b.h(cVar.b(false), cVar.f214j);
            }
        }
    }

    @Override // k.C0300p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f2334e;
        if (cVar.f213i != mode) {
            cVar.f213i = mode;
            if (cVar.b(false) == null || cVar.f213i == null) {
                return;
            }
            b.i(cVar.b(false), cVar.f213i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i3) {
        super.setTextAlignment(i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f2334e.f222r = z3;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2343p);
    }
}
