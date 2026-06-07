package J;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class j0 extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f432e;

    public j0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f432e = windowInsetsAnimation;
    }

    @Override // J.k0
    public final long a() {
        long durationMillis;
        durationMillis = this.f432e.getDurationMillis();
        return durationMillis;
    }

    @Override // J.k0
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f432e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // J.k0
    public final int c() {
        int typeMask;
        typeMask = this.f432e.getTypeMask();
        return typeMask;
    }

    @Override // J.k0
    public final void d(float f3) {
        this.f432e.setFraction(f3);
    }
}
