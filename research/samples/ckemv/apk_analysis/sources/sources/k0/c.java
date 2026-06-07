package k0;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3827b;

    public c(f fVar) {
        this.f3827b = fVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f3827b.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        this.f3827b.scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f3827b.unscheduleSelf(runnable);
    }
}
