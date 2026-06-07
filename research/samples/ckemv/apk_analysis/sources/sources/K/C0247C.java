package k;

import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import xyz.happify.ckemv.R;

/* renamed from: k.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0247C extends RadioButton implements N.v {

    /* renamed from: b, reason: collision with root package name */
    public final d0.d f3554b;
    public final C0298o c;

    /* renamed from: d, reason: collision with root package name */
    public final C0269Z f3555d;

    /* renamed from: e, reason: collision with root package name */
    public C0314w f3556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0247C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        d1.a(context);
        c1.a(this, getContext());
        d0.d dVar = new d0.d(this);
        this.f3554b = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0298o c0298o = new C0298o(this);
        this.c = c0298o;
        c0298o.d(attributeSet, R.attr.radioButtonStyle);
        C0269Z c0269z = new C0269Z(this);
        this.f3555d = c0269z;
        c0269z.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0314w getEmojiTextViewHelper() {
        if (this.f3556e == null) {
            this.f3556e = new C0314w(this);
        }
        return this.f3556e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.a();
        }
        C0269Z c0269z = this.f3555d;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        d0.d dVar = this.f3554b;
        if (dVar != null) {
            dVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            return c0298o.c();
        }
        return null;
    }

    @Override // N.v
    public ColorStateList getSupportButtonTintList() {
        d0.d dVar = this.f3554b;
        if (dVar != null) {
            return (ColorStateList) dVar.f2611e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        d0.d dVar = this.f3554b;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2612f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3555d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3555d.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.f(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        d0.d dVar = this.f3554b;
        if (dVar != null) {
            if (dVar.c) {
                dVar.c = false;
            } else {
                dVar.c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.f3555d;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.f3555d;
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
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.c;
        if (c0298o != null) {
            c0298o.i(mode);
        }
    }

    @Override // N.v
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        d0.d dVar = this.f3554b;
        if (dVar != null) {
            dVar.f2611e = colorStateList;
            dVar.f2608a = true;
            dVar.a();
        }
    }

    @Override // N.v
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        d0.d dVar = this.f3554b;
        if (dVar != null) {
            dVar.f2612f = mode;
            dVar.f2609b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0269Z c0269z = this.f3555d;
        c0269z.l(colorStateList);
        c0269z.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0269Z c0269z = this.f3555d;
        c0269z.m(mode);
        c0269z.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(AbstractC0059a.s(getContext(), i3));
    }
}
