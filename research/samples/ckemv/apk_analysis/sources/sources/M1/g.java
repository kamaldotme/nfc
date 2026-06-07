package M1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends AbstractCollection implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final e f650b;

    public g(e eVar) {
        X1.g.e(eVar, "backing");
        this.f650b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        X1.g.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f650b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f650b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f650b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        e eVar = this.f650b;
        eVar.getClass();
        return new c(eVar, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f650b;
        eVar.c();
        int h = eVar.h(obj);
        if (h < 0) {
            return false;
        }
        eVar.k(h);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        X1.g.e(collection, "elements");
        this.f650b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        X1.g.e(collection, "elements");
        this.f650b.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f650b.f644j;
    }
}
