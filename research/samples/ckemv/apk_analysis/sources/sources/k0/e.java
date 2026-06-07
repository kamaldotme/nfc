package k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3831a;

    public e(Drawable.ConstantState constantState) {
        this.f3831a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3831a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3831a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f3831a.newDrawable();
        fVar.f3835b = newDrawable;
        newDrawable.setCallback(fVar.g);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3831a.newDrawable(resources);
        fVar.f3835b = newDrawable;
        newDrawable.setCallback(fVar.g);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f3831a.newDrawable(resources, theme);
        fVar.f3835b = newDrawable;
        newDrawable.setCallback(fVar.g);
        return fVar;
    }
}
