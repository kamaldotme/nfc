package b1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m extends n implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2229b = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f2229b.equals(this.f2229b));
    }

    public final int hashCode() {
        return this.f2229b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2229b.iterator();
    }
}
