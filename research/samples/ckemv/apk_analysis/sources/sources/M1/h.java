package M1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends L1.g implements Serializable {
    public static final h c;

    /* renamed from: b, reason: collision with root package name */
    public final e f651b;

    static {
        e eVar = e.f638o;
        c = new h(e.f638o);
    }

    public h(e eVar) {
        X1.g.e(eVar, "backing");
        this.f651b = eVar;
    }

    @Override // L1.g
    public final int a() {
        return this.f651b.f644j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f651b.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        X1.g.e(collection, "elements");
        this.f651b.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f651b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f651b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f651b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        e eVar = this.f651b;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        e eVar = this.f651b;
        eVar.c();
        int g = eVar.g(obj);
        if (g >= 0) {
            eVar.k(g);
            if (g >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        X1.g.e(collection, "elements");
        this.f651b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        X1.g.e(collection, "elements");
        this.f651b.c();
        return super.retainAll(collection);
    }

    public h() {
        this(new e());
    }
}
