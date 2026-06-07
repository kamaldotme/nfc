package p2;

import X1.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4352a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4353b;
    public c c;

    /* renamed from: d, reason: collision with root package name */
    public long f4354d;

    public a(boolean z3, String str) {
        g.e(str, "name");
        this.f4352a = str;
        this.f4353b = z3;
        this.f4354d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f4352a;
    }
}
