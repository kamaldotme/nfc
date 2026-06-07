package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.AbstractC0321z0;

/* loaded from: classes.dex */
public abstract class d extends AbstractC0321z0 {

    /* renamed from: q, reason: collision with root package name */
    public Drawable f752q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f753r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f754s;

    /* renamed from: t, reason: collision with root package name */
    public int f755t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f756u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f757v;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f753r = new Rect();
        this.f754s = new Rect();
        this.f755t = 119;
        this.f756u = true;
        this.f757v = false;
        int[] iArr = A0.a.g;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f755t = obtainStyledAttributes.getInt(1, this.f755t);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f756u = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f752q;
        if (drawable != null) {
            if (this.f757v) {
                this.f757v = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f756u;
                Rect rect = this.f753r;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i3 = this.f755t;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f754s;
                Gravity.apply(i3, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f752q;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f752q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f752q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f752q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f755t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f752q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // k.AbstractC0321z0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        this.f757v = z3 | this.f757v;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f757v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f752q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f752q);
            }
            this.f752q = drawable;
            this.f757v = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f755t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i3) {
        if (this.f755t != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f755t = i3;
            if (i3 == 119 && this.f752q != null) {
                this.f752q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f752q;
    }
}
