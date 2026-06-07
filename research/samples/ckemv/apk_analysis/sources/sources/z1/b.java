package z1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5317b;
    public final boolean c = false;

    public b(ArrayList arrayList, int i3) {
        this.f5316a = new ArrayList(arrayList);
        this.f5317b = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5316a.equals(bVar.f5316a) && this.c == bVar.c;
    }

    public final int hashCode() {
        return this.f5316a.hashCode() ^ Boolean.valueOf(this.c).hashCode();
    }

    public final String toString() {
        return "{ " + this.f5316a + " }";
    }
}
