package m2;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {
    public static final d c = new d(L1.k.Z(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f4017a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.l f4018b;

    public d(Set set, u2.l lVar) {
        X1.g.e(set, "pins");
        this.f4017a = set;
        this.f4018b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (X1.g.a(dVar.f4017a, this.f4017a) && X1.g.a(dVar.f4018b, this.f4018b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4017a.hashCode() + 1517) * 41;
        u2.l lVar = this.f4018b;
        return hashCode + (lVar != null ? lVar.hashCode() : 0);
    }
}
