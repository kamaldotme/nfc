package k;

import a.AbstractC0059a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: k.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320z extends MultiAutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3806e = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3807b;
    public final C0269Z c;

    /* renamed from: d, reason: collision with root package name */
    public final C0246B f3808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0320z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.happify.ckemv.R.attr.autoCompleteTextViewStyle);
        d1.a(context);
        c1.a(this, getContext());
        v0.m F2 = v0.m.F(getContext(), attributeSet, f3806e, xyz.happify.ckemv.R.attr.autoCompleteTextViewStyle, 0);
        if (((TypedArray) F2.f5087d).hasValue(0)) {
            setDropDownBackgroundDrawable(F2.r(0));
        }
        F2.J();
        C0298o c0298o = new C0298o(this);
        this.f3807b = c0298o;
        c0298o.d(attributeSet, xyz.happify.ckemv.R.attr.autoCompleteTextViewStyle);
        C0269Z c0269z = new C0269Z(this);
        this.c = c0269z;
        c0269z.f(attributeSet, xyz.happify.ckemv.R.attr.autoCompleteTextViewStyle);
        c0269z.b();
        C0246B c0246b = new C0246B(this);
        this.f3808d = c0246b;
        c0246b.b(attributeSet, xyz.happify.ckemv.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a3 = c0246b.a(keyListener);
            if (a3 == keyListener) {
                return;
            }
            super.setKeyListener(a3);
            setRawInputType(inputType);
            setFocusable(isFocusable);
            setClickable(isClickable);
            setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3807b;
        if (c0298o != null) {
            c0298o.a();
        }
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3807b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3807b;
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        u2.d.w(onCreateInputConnection, editorInfo, this);
        return this.f3808d.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0298o c0298o = this.f3807b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3807b;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC0059a.s(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f3808d.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3808d.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3807b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3807b;
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
}
