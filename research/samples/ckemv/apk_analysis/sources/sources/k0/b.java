package k0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0.a f3826a;

    public b(I0.a aVar) {
        this.f3826a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f3826a.f294b.f309p;
        if (colorStateList != null) {
            B.b.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        I0.d dVar = this.f3826a.f294b;
        ColorStateList colorStateList = dVar.f309p;
        if (colorStateList != null) {
            B.b.g(drawable, colorStateList.getColorForState(dVar.f313t, colorStateList.getDefaultColor()));
        }
    }
}
