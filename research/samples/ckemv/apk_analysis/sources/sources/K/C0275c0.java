package k;

import a.AbstractC0059a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import f.C0150G;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: k.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0275c0 extends TextView {

    /* renamed from: b, reason: collision with root package name */
    public final C0298o f3671b;
    public final C0269Z c;

    /* renamed from: d, reason: collision with root package name */
    public final C0246B f3672d;

    /* renamed from: e, reason: collision with root package name */
    public C0314w f3673e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3674f;
    public C0150G g;
    public Future h;

    public C0275c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0314w getEmojiTextViewHelper() {
        if (this.f3673e == null) {
            this.f3673e = new C0314w(this);
        }
        return this.f3673e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0298o c0298o = this.f3671b;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0271a0 getSuperCaller() {
        if (this.g == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.g = new C0273b0(this);
            } else {
                this.g = new C0150G(this);
            }
        }
        return this.g;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0298o c0298o = this.f3671b;
        if (c0298o != null) {
            return c0298o.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0298o c0298o = this.f3671b;
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
    public CharSequence getText() {
        l();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0246B c0246b;
        if (Build.VERSION.SDK_INT >= 28 || (c0246b = this.f3672d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0246b.c;
        return textClassifier == null ? AbstractC0263T.a((TextView) c0246b.f3553b) : textClassifier;
    }

    public H.e getTextMetricsParamsCompat() {
        return AbstractC0059a.x(this);
    }

    public final void l() {
        Future future = this.h;
        if (future == null) {
            return;
        }
        try {
            this.h = null;
            X.d.q(future.get());
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0059a.x(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.c.getClass();
        C0269Z.h(this, onCreateInputConnection, editorInfo);
        u2.d.w(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0269Z c0269z = this.c;
        if (c0269z == null || r1.f3769b) {
            return;
        }
        c0269z.f3636i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        l();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
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
        C0298o c0298o = this.f3671b;
        if (c0298o != null) {
            c0298o.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0298o c0298o = this.f3671b;
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i3);
        } else {
            AbstractC0059a.K(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i3);
        } else {
            AbstractC0059a.L(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        m0.z.j(i3);
        if (i3 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i3 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(H.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0059a.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0298o c0298o = this.f3671b;
        if (c0298o != null) {
            c0298o.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0298o c0298o = this.f3671b;
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
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0246B c0246b;
        if (Build.VERSION.SDK_INT >= 28 || (c0246b = this.f3672d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0246b.c = textClassifier;
        }
    }

    public void setTextFuture(Future<H.f> future) {
        this.h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(H.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f266b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        N.p.h(this, i3);
        getPaint().set(eVar.f265a);
        N.q.e(this, eVar.c);
        N.q.h(this, eVar.f267d);
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typeface2;
        if (this.f3674f) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            m0.z zVar = A.i.f9a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i3);
        }
        this.f3674f = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f3674f = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275c0(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        d1.a(context);
        this.f3674f = false;
        this.g = null;
        c1.a(this, getContext());
        C0298o c0298o = new C0298o(this);
        this.f3671b = c0298o;
        c0298o.d(attributeSet, i3);
        C0269Z c0269z = new C0269Z(this);
        this.c = c0269z;
        c0269z.f(attributeSet, i3);
        c0269z.b();
        C0246B c0246b = new C0246B();
        c0246b.f3553b = this;
        this.f3672d = c0246b;
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC0059a.s(context, i3) : null, i4 != 0 ? AbstractC0059a.s(context, i4) : null, i5 != 0 ? AbstractC0059a.s(context, i5) : null, i6 != 0 ? AbstractC0059a.s(context, i6) : null);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC0059a.s(context, i3) : null, i4 != 0 ? AbstractC0059a.s(context, i4) : null, i5 != 0 ? AbstractC0059a.s(context, i5) : null, i6 != 0 ? AbstractC0059a.s(context, i6) : null);
        C0269Z c0269z = this.c;
        if (c0269z != null) {
            c0269z.b();
        }
    }
}
