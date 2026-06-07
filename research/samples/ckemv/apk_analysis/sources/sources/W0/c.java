package W0;

import J.B;
import J.F;
import J.H;
import J.T;
import U0.g;
import U0.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import u2.l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final b f981j = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final k f982b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public final float f983d;

    /* renamed from: e, reason: collision with root package name */
    public final float f984e;

    /* renamed from: f, reason: collision with root package name */
    public final int f985f;
    public final int g;
    public ColorStateList h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f986i;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(Z0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, A0.a.f41w);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = T.f402a;
            H.s(this, dimensionPixelSize);
        }
        this.c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f982b = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f983d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(l.m(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(O0.k.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f984e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f985f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f981j);
        setFocusable(true);
        if (getBackground() == null) {
            int z3 = l.z(l.l(this, R.attr.colorSurface), l.l(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.f982b;
            if (kVar != null) {
                int i3 = d.f987a;
                g gVar = new g(kVar);
                gVar.k(ColorStateList.valueOf(z3));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i4 = d.f987a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(z3);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.h;
            if (colorStateList != null) {
                B.b.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = T.f402a;
            B.q(this, gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f984e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f983d;
    }

    public int getMaxInlineActionWidth() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f985f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = T.f402a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        int i5 = this.f985f;
        if (i5 <= 0 || getMeasuredWidth() <= i5) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
    }

    public void setAnimationMode(int i3) {
        this.c = i3;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = drawable.mutate();
            B.b.h(drawable, this.h);
            B.b.i(drawable, this.f986i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            B.b.h(mutate, colorStateList);
            B.b.i(mutate, this.f986i);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f986i = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            B.b.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f981j);
        super.setOnClickListener(onClickListener);
    }
}
