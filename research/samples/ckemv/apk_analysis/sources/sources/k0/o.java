package k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f3879a;

    public o(Drawable.ConstantState constantState) {
        this.f3879a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f3879a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3879a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f3835b = (VectorDrawable) this.f3879a.newDrawable();
        return pVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f3835b = (VectorDrawable) this.f3879a.newDrawable(resources);
        return pVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f3835b = (VectorDrawable) this.f3879a.newDrawable(resources, theme);
        return pVar;
    }
}
