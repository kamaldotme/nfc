package Q;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f799a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        switch (this.f799a) {
            case 0:
                float f4 = f3 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
            default:
                float f5 = f3 - 1.0f;
                return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }
}
