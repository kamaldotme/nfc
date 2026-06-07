package K1;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f601b;

    public d(Throwable th) {
        X1.g.e(th, "exception");
        this.f601b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (X1.g.a(this.f601b, ((d) obj).f601b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f601b.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f601b + ')';
    }
}
