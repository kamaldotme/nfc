package J;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f433a;

    /* renamed from: b, reason: collision with root package name */
    public float f434b;
    public final Interpolator c;

    /* renamed from: d, reason: collision with root package name */
    public final long f435d;

    public k0(int i3, Interpolator interpolator, long j3) {
        this.f433a = i3;
        this.c = interpolator;
        this.f435d = j3;
    }

    public long a() {
        return this.f435d;
    }

    public float b() {
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(this.f434b) : this.f434b;
    }

    public int c() {
        return this.f433a;
    }

    public void d(float f3) {
        this.f434b = f3;
    }
}
