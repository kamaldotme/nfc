package k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: k.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307s0 extends Drawable implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f3775b;
    public boolean c;

    public C0307s0(Drawable drawable) {
        Drawable drawable2 = this.f3775b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3775b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public final void a(Canvas canvas) {
        this.f3775b.draw(canvas);
    }

    public final void b(float f3, float f4) {
        B.b.e(this.f3775b, f3, f4);
    }

    public final void c(int i3, int i4, int i5, int i6) {
        B.b.f(this.f3775b, i3, i4, i5, i6);
    }

    public final boolean d(boolean z3, boolean z4) {
        return super.setVisible(z3, z4) || this.f3775b.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f3775b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3775b.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3775b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3775b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f3775b.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f3775b.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3775b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f3775b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f3775b.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f3775b.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return B.a.d(this.f3775b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f3775b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3775b.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3775b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f3775b.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f3775b.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        B.a.e(this.f3775b, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f3775b.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3775b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f3775b.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f3775b.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        if (this.c) {
            b(f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        if (this.c) {
            c(i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.c) {
            return this.f3775b.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        B.b.g(this.f3775b, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        B.b.h(this.f3775b, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        B.b.i(this.f3775b, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        if (this.c) {
            return d(z3, z4);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
