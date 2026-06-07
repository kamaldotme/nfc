package k;

import a.AbstractC0059a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: k.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0300p extends Button {

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3756b;
    public final C0269Z c;

    /* renamed from: d, reason: collision with root package name */
    public C0314w f3757d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0300p(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        d1.a(context);
        c1.a(this, getContext());
        C0298o c0298o = new C0298o(this);
        this.f3756b = c0298o;
        c0298o.d(attributeSet, i3);
        C0269Z c0269z = new C0269Z(this);
        this.c = c0269z;
        c0269z.f(attributeSet, i3);
        c0269z.b();
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    private C0314w getEmojiTextViewHelper() {
        if (this.f3757d == null) {
            this.f3757d = new C0314w(this);
        }
        return this.f3757d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            c0298o.a();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (r1.f3769b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            return Math.round(c0269z.f3636i.f3717e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r1.f3769b) {
            return super.getAutoSizeMinTextSize();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            return Math.round(c0269z.f3636i.f3716d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r1.f3769b) {
            return super.getAutoSizeStepGranularity();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            return Math.round(c0269z.f3636i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r1.f3769b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0269Z c0269z = this.c;
        return c0269z != null ? c0269z.f3636i.f3718f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (r1.f3769b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            return c0269z.f3636i.f3714a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof N.t ? ((N.t) customSelectionActionModeCallback).f675a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            return c0298o.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0269Z c0269z = this.c;
        if (c0269z == null || r1.f3769b) {
            return;
        }
        c0269z.f3636i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0269Z c0269z = this.c;
        if (c0269z == null || r1.f3769b) {
            return;
        }
        C0289j0 c0289j0 = c0269z.f3636i;
        if (c0289j0.f()) {
            c0289j0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (r1.f3769b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.i(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (r1.f3769b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.j(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (r1.f3769b) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.k(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0059a.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((u2.d) getEmojiTextViewHelper().f3794b.c).m(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.f3631a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3756b;
        if (c0298o != null) {
            c0298o.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0269Z c0269z = this.c;
        c0269z.l(colorStateList);
        c0269z.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0269Z c0269z = this.c;
        c0269z.m(mode);
        c0269z.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z3 = r1.f3769b;
        if (z3) {
            super.setTextSize(i3, f3);
            return;
        }
        C0269Z c0269z = this.c;
        if (c0269z == null || z3) {
            return;
        }
        C0289j0 c0289j0 = c0269z.f3636i;
        if (c0289j0.f()) {
            return;
        }
        c0289j0.g(i3, f3);
    }
}
