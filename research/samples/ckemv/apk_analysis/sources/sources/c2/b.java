package c2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f2254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2255b;

    public b(c cVar, int i3) {
        X1.g.e(cVar, "sequence");
        this.f2254a = cVar;
        this.f2255b = i3;
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i3 + '.').toString());
    }

    @Override // c2.c
    public final Iterator iterator() {
        return new L1.b(this);
    }
}
