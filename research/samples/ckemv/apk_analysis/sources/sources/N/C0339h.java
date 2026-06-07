package n;

import a0.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339h implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4152b;
    public final /* synthetic */ m c;

    public /* synthetic */ C0339h(m mVar, int i3) {
        this.f4152b = i3;
        this.c = mVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4152b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f4152b) {
            case 0:
                m mVar = this.c;
                int g = mVar.g();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    mVar.j(entry.getKey(), entry.getValue());
                }
                return g != mVar.g();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f4152b) {
            case 0:
                this.c.d();
                return;
            default:
                this.c.d();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4152b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = this.c;
                int h = mVar.h(key);
                if (h < 0) {
                    return false;
                }
                Object e3 = mVar.e(h, 1);
                Object value = entry.getValue();
                return e3 == value || (e3 != null && e3.equals(value));
            default:
                return this.c.h(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f4152b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Map f3 = this.c.f();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!f3.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f4152b) {
            case 0:
                return m.o(this, obj);
            default:
                return m.o(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f4152b) {
            case 0:
                m mVar = this.c;
                int i3 = 0;
                for (int g = mVar.g() - 1; g >= 0; g--) {
                    Object e3 = mVar.e(g, 0);
                    Object e4 = mVar.e(g, 1);
                    i3 += (e3 == null ? 0 : e3.hashCode()) ^ (e4 == null ? 0 : e4.hashCode());
                }
                return i3;
            default:
                m mVar2 = this.c;
                int i4 = 0;
                for (int g3 = mVar2.g() - 1; g3 >= 0; g3--) {
                    Object e5 = mVar2.e(g3, 0);
                    i4 += e5 == null ? 0 : e5.hashCode();
                }
                return i4;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f4152b) {
            case 0:
                return this.c.g() == 0;
            default:
                return this.c.g() == 0;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4152b) {
            case 0:
                return new C0340i(this.c);
            default:
                return new C0338g(this.c, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f4152b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                m mVar = this.c;
                int h = mVar.h(obj);
                if (h < 0) {
                    return false;
                }
                mVar.k(h);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f4152b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map f3 = this.c.f();
                int size = f3.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    f3.remove(it.next());
                }
                return size != f3.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f4152b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return m.q(this.c.f(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f4152b) {
            case 0:
                return this.c.g();
            default:
                return this.c.g();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f4152b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.c.r(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f4152b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                m mVar = this.c;
                int g = mVar.g();
                Object[] objArr = new Object[g];
                for (int i3 = 0; i3 < g; i3++) {
                    objArr[i3] = mVar.e(i3, 0);
                }
                return objArr;
        }
    }
}
