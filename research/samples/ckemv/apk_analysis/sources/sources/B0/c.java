package B0;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public long f68a;

    /* renamed from: b, reason: collision with root package name */
    public long f69b;
    public TimeInterpolator c;

    /* renamed from: d, reason: collision with root package name */
    public int f70d;

    /* renamed from: e, reason: collision with root package name */
    public int f71e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.f64b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f68a == cVar.f68a && this.f69b == cVar.f69b && this.f70d == cVar.f70d && this.f71e == cVar.f71e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f68a;
        long j4 = this.f69b;
        return ((((a().getClass().hashCode() + (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31)) * 31) + this.f70d) * 31) + this.f71e;
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f68a + " duration: " + this.f69b + " interpolator: " + a().getClass() + " repeatCount: " + this.f70d + " repeatMode: " + this.f71e + "}\n";
    }
}
