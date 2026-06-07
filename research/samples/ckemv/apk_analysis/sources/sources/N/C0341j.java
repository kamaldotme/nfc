package n;

import a0.m;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: n.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341j implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f4156b;

    public C0341j(m mVar) {
        this.f4156b = mVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f4156b.d();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f4156b.i(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f4156b.g() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0338g(this.f4156b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        m mVar = this.f4156b;
        int i3 = mVar.i(obj);
        if (i3 < 0) {
            return false;
        }
        mVar.k(i3);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        m mVar = this.f4156b;
        int g = mVar.g();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < g) {
            if (collection.contains(mVar.e(i3, 1))) {
                mVar.k(i3);
                i3--;
                g--;
                z3 = true;
            }
            i3++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        m mVar = this.f4156b;
        int g = mVar.g();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < g) {
            if (!collection.contains(mVar.e(i3, 1))) {
                mVar.k(i3);
                i3--;
                g--;
                z3 = true;
            }
            i3++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f4156b.g();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f4156b.r(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        m mVar = this.f4156b;
        int g = mVar.g();
        Object[] objArr = new Object[g];
        for (int i3 = 0; i3 < g; i3++) {
            objArr[i3] = mVar.e(i3, 1);
        }
        return objArr;
    }
}
