package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.AbstractC0116a;
import xyz.happify.ckemv.R;

/* renamed from: k.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251G extends C0246B {

    /* renamed from: e, reason: collision with root package name */
    public final SeekBar f3562e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3563f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3564i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3565j;

    public C0251G(SeekBar seekBar) {
        super(seekBar);
        this.g = null;
        this.h = null;
        this.f3564i = false;
        this.f3565j = false;
        this.f3562e = seekBar;
    }

    @Override // k.C0246B
    public final void b(AttributeSet attributeSet, int i3) {
        super.b(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f3562e;
        Context context = seekBar.getContext();
        int[] iArr = AbstractC0116a.g;
        v0.m F2 = v0.m.F(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        J.T.k(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) F2.f5087d, R.attr.seekBarStyle);
        Drawable s3 = F2.s(0);
        if (s3 != null) {
            seekBar.setThumb(s3);
        }
        Drawable r3 = F2.r(1);
        Drawable drawable = this.f3563f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f3563f = r3;
        if (r3 != null) {
            r3.setCallback(seekBar);
            B.c.b(r3, J.C.d(seekBar));
            if (r3.isStateful()) {
                r3.setState(seekBar.getDrawableState());
            }
            f();
        }
        seekBar.invalidate();
        TypedArray typedArray = (TypedArray) F2.f5087d;
        if (typedArray.hasValue(3)) {
            this.h = AbstractC0299o0.b(typedArray.getInt(3, -1), this.h);
            this.f3565j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = F2.q(2);
            this.f3564i = true;
        }
        F2.J();
        f();
    }

    public final void f() {
        Drawable drawable = this.f3563f;
        if (drawable != null) {
            if (this.f3564i || this.f3565j) {
                Drawable mutate = drawable.mutate();
                this.f3563f = mutate;
                if (this.f3564i) {
                    B.b.h(mutate, this.g);
                }
                if (this.f3565j) {
                    B.b.i(this.f3563f, this.h);
                }
                if (this.f3563f.isStateful()) {
                    this.f3563f.setState(this.f3562e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f3563f != null) {
            int max = this.f3562e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f3563f.getIntrinsicWidth();
                int intrinsicHeight = this.f3563f.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f3563f.setBounds(-i3, -i4, i3, i4);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f3563f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
