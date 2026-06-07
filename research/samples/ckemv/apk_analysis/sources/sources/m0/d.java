package m0;

import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: i, reason: collision with root package name */
    public static final d f3963i = new d(1, false, false, false, false, -1, -1, L1.v.f624b);

    /* renamed from: a, reason: collision with root package name */
    public final int f3964a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3965b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3966d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3967e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3968f;
    public final long g;
    public final Set h;

    public d(int i3, boolean z3, boolean z4, boolean z5, boolean z6, long j3, long j4, Set set) {
        X.d.o("requiredNetworkType", i3);
        X1.g.e(set, "contentUriTriggers");
        this.f3964a = i3;
        this.f3965b = z3;
        this.c = z4;
        this.f3966d = z5;
        this.f3967e = z6;
        this.f3968f = j3;
        this.g = j4;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !X1.g.a(d.class, obj.getClass())) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3965b == dVar.f3965b && this.c == dVar.c && this.f3966d == dVar.f3966d && this.f3967e == dVar.f3967e && this.f3968f == dVar.f3968f && this.g == dVar.g && this.f3964a == dVar.f3964a) {
            return X1.g.a(this.h, dVar.h);
        }
        return false;
    }

    public final int hashCode() {
        int a3 = ((((((((q.h.a(this.f3964a) * 31) + (this.f3965b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.f3966d ? 1 : 0)) * 31) + (this.f3967e ? 1 : 0)) * 31;
        long j3 = this.f3968f;
        int i3 = (a3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.g;
        return this.h.hashCode() + ((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + X.d.y(this.f3964a) + ", requiresCharging=" + this.f3965b + ", requiresDeviceIdle=" + this.c + ", requiresBatteryNotLow=" + this.f3966d + ", requiresStorageNotLow=" + this.f3967e + ", contentTriggerUpdateDelayMillis=" + this.f3968f + ", contentTriggerMaxDelayMillis=" + this.g + ", contentUriTriggers=" + this.h + ", }";
    }

    public d(d dVar) {
        X1.g.e(dVar, "other");
        this.f3965b = dVar.f3965b;
        this.c = dVar.c;
        this.f3964a = dVar.f3964a;
        this.f3966d = dVar.f3966d;
        this.f3967e = dVar.f3967e;
        this.h = dVar.h;
        this.f3968f = dVar.f3968f;
        this.g = dVar.g;
    }
}
