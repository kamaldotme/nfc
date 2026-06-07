package k0;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class g extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f3835b;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i3) {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.setLevel(i3) : super.onLevelChange(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i3);
        } else {
            super.setChangingConfigurations(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i3, PorterDuff.Mode mode) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setColorFilter(i3, mode);
        } else {
            super.setColorFilter(i3, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setFilterBitmap(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f3, float f4) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.e(drawable, f3, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.f(drawable, i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
