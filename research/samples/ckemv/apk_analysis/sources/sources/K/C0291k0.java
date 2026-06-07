package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: k.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291k0 extends ToggleButton {

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3724b;
    public final C0269Z c;

    /* renamed from: d, reason: collision with root package name */
    public C0314w f3725d;

    public C0291k0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        c1.a(this, getContext());
        C0298o c0298o = new C0298o(this);
        this.f3724b = c0298o;
        c0298o.d(attributeSet, R.attr.buttonStyleToggle);
        C0269Z c0269z = new C0269Z(this);
        this.c = c0269z;
        c0269z.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0314w getEmojiTextViewHelper() {
        if (this.f3725d == null) {
            this.f3725d = new C0314w(this);
        }
        return this.f3725d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3724b;
        if (c0298o != null) {
            c0298o.a();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3724b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3724b;
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.f3724b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3724b;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((u2.d) getEmojiTextViewHelper().f3794b.c).m(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3724b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3724b;
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
}
