package J;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public k0 f436a;

    public l0(int i3, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f436a = new j0(AbstractC0021u.i(i3, interpolator, j3));
        } else {
            this.f436a = new k0(i3, interpolator, j3);
        }
    }
}
