package L1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f615b;
    public final boolean c;

    public h(Object[] objArr, boolean z3) {
        X1.g.e(objArr, "values");
        this.f615b = objArr;
        this.c = z3;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i3;
        Object[] objArr = this.f615b;
        X1.g.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i3 = 0;
            while (i3 < length) {
                if (objArr[i3] != null) {
                    i3++;
                }
            }
            return false;
        }
        int length2 = objArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (X1.g.a(obj, objArr[i4])) {
                i3 = i4;
            }
        }
        return false;
        return i3 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        X1.g.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
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
        return this.f615b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f615b;
        X1.g.e(objArr, "array");
        return new b(objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f615b.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f615b;
        X1.g.e(objArr, "<this>");
        if (this.c && X1.g.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        X1.g.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        X1.g.e(objArr, "array");
        return X1.g.j(this, objArr);
    }
}
