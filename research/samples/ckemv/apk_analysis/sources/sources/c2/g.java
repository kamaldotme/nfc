package c2;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f2257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2258b;

    public g(h hVar) {
        this.f2258b = hVar;
        this.f2257a = hVar.f2259a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2257a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f2258b.f2260b.h(this.f2257a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
