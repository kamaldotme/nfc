package X1;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1141a;

    public i(Class cls) {
        g.e(cls, "jClass");
        this.f1141a = cls;
    }

    @Override // X1.c
    public final Class a() {
        return this.f1141a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (g.a(this.f1141a, ((i) obj).f1141a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1141a.hashCode();
    }

    public final String toString() {
        return this.f1141a.toString() + " (Kotlin reflection is not available)";
    }
}
