package M1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends L1.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f649b;
    public final e c;

    public f(e eVar, int i3) {
        this.f649b = i3;
        switch (i3) {
            case 1:
                X1.g.e(eVar, "backing");
                this.c = eVar;
                return;
            default:
                X1.g.e(eVar, "backing");
                this.c = eVar;
                return;
        }
    }

    @Override // L1.g
    public final int a() {
        switch (this.f649b) {
            case 0:
                return this.c.f644j;
            default:
                return this.c.f644j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f649b) {
            case 0:
                X1.g.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f649b) {
            case 0:
                X1.g.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                X1.g.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f649b) {
            case 0:
                this.c.clear();
                return;
            default:
                this.c.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f649b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                X1.g.e(entry, "element");
                return this.c.e(entry);
            default:
                return this.c.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f649b) {
            case 0:
                X1.g.e(collection, "elements");
                return this.c.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f649b) {
            case 0:
                return this.c.isEmpty();
            default:
                return this.c.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f649b) {
            case 0:
                e eVar = this.c;
                eVar.getClass();
                return new c(eVar, 0);
            default:
                e eVar2 = this.c;
                eVar2.getClass();
                return new c(eVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f649b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                X1.g.e(entry, "element");
                e eVar = this.c;
                eVar.getClass();
                eVar.c();
                int g = eVar.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = eVar.c;
                X1.g.b(objArr);
                if (!X1.g.a(objArr[g], entry.getValue())) {
                    return false;
                }
                eVar.k(g);
                return true;
            default:
                e eVar2 = this.c;
                eVar2.c();
                int g3 = eVar2.g(obj);
                if (g3 >= 0) {
                    eVar2.k(g3);
                    if (g3 >= 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f649b) {
            case 0:
                X1.g.e(collection, "elements");
                this.c.c();
                return super.removeAll(collection);
            default:
                X1.g.e(collection, "elements");
                this.c.c();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f649b) {
            case 0:
                X1.g.e(collection, "elements");
                this.c.c();
                return super.retainAll(collection);
            default:
                X1.g.e(collection, "elements");
                this.c.c();
                return super.retainAll(collection);
        }
    }
}
