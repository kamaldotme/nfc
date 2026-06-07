package M1;

import L1.j;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import u2.l;

/* loaded from: classes.dex */
public final class b extends L1.f implements RandomAccess, Serializable {
    public static final b h;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f631b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public int f632d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f633e;

    /* renamed from: f, reason: collision with root package name */
    public final b f634f;
    public final b g;

    static {
        b bVar = new b(0);
        bVar.f633e = true;
        h = bVar;
    }

    public b(Object[] objArr, int i3, int i4, boolean z3, b bVar, b bVar2) {
        this.f631b = objArr;
        this.c = i3;
        this.f632d = i4;
        this.f633e = z3;
        this.f634f = bVar;
        this.g = bVar2;
        if (bVar != null) {
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }
    }

    @Override // L1.f
    public final int a() {
        f();
        return this.f632d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.c + this.f632d, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        X1.g.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.c + this.f632d, collection, size);
        return size > 0;
    }

    @Override // L1.f
    public final Object b(int i3) {
        g();
        f();
        int i4 = this.f632d;
        if (i3 >= 0 && i3 < i4) {
            return i(this.c + i3);
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        j(this.c, this.f632d);
    }

    public final void d(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        b bVar = this.f634f;
        if (bVar != null) {
            bVar.d(i3, collection, i4);
            this.f631b = bVar.f631b;
            this.f632d += i4;
        } else {
            h(i3, i4);
            Iterator it = collection.iterator();
            for (int i5 = 0; i5 < i4; i5++) {
                this.f631b[i3 + i5] = it.next();
            }
        }
    }

    public final void e(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.f634f;
        if (bVar == null) {
            h(i3, 1);
            this.f631b[i3] = obj;
        } else {
            bVar.e(i3, obj);
            this.f631b = bVar.f631b;
            this.f632d++;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f631b;
            int i3 = this.f632d;
            if (i3 != list.size()) {
                return false;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (!X1.g.a(objArr[this.c + i4], list.get(i4))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f() {
        b bVar = this.g;
        if (bVar != null && ((AbstractList) bVar).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        b bVar;
        if (this.f633e || ((bVar = this.g) != null && bVar.f633e)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        f();
        int i4 = this.f632d;
        if (i3 >= 0 && i3 < i4) {
            return this.f631b[this.c + i3];
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    public final void h(int i3, int i4) {
        int i5 = this.f632d + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f631b;
        if (i5 > objArr.length) {
            int length = objArr.length;
            int i6 = length + (length >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            X1.g.d(copyOf, "copyOf(...)");
            this.f631b = copyOf;
        }
        Object[] objArr2 = this.f631b;
        j.S(objArr2, objArr2, i3 + i4, i3, this.c + this.f632d);
        this.f632d += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f631b;
        int i3 = this.f632d;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[this.c + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i3) {
        ((AbstractList) this).modCount++;
        b bVar = this.f634f;
        if (bVar != null) {
            this.f632d--;
            return bVar.i(i3);
        }
        Object[] objArr = this.f631b;
        Object obj = objArr[i3];
        int i4 = this.f632d;
        int i5 = this.c;
        j.S(objArr, objArr, i3, i3 + 1, i4 + i5);
        Object[] objArr2 = this.f631b;
        int i6 = (i5 + this.f632d) - 1;
        X1.g.e(objArr2, "<this>");
        objArr2[i6] = null;
        this.f632d--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i3 = 0; i3 < this.f632d; i3++) {
            if (X1.g.a(this.f631b[this.c + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f632d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f634f;
        if (bVar != null) {
            bVar.j(i3, i4);
        } else {
            Object[] objArr = this.f631b;
            j.S(objArr, objArr, i3, i3 + i4, this.f632d);
            Object[] objArr2 = this.f631b;
            int i5 = this.f632d;
            l.F(objArr2, i5 - i4, i5);
        }
        this.f632d -= i4;
    }

    public final int k(int i3, int i4, Collection collection, boolean z3) {
        int i5;
        b bVar = this.f634f;
        if (bVar != null) {
            i5 = bVar.k(i3, i4, collection, z3);
        } else {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                int i8 = i3 + i6;
                if (collection.contains(this.f631b[i8]) == z3) {
                    Object[] objArr = this.f631b;
                    i6++;
                    objArr[i7 + i3] = objArr[i8];
                    i7++;
                } else {
                    i6++;
                }
            }
            int i9 = i4 - i7;
            Object[] objArr2 = this.f631b;
            j.S(objArr2, objArr2, i3 + i7, i4 + i3, this.f632d);
            Object[] objArr3 = this.f631b;
            int i10 = this.f632d;
            l.F(objArr3, i10 - i9, i10);
            i5 = i9;
        }
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f632d -= i5;
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i3 = this.f632d - 1; i3 >= 0; i3--) {
            if (X1.g.a(this.f631b[this.c + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        X1.g.e(collection, "elements");
        g();
        f();
        return k(this.c, this.f632d, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        X1.g.e(collection, "elements");
        g();
        f();
        return k(this.c, this.f632d, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        g();
        f();
        int i4 = this.f632d;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
        }
        Object[] objArr = this.f631b;
        int i5 = this.c;
        Object obj2 = objArr[i5 + i3];
        objArr[i5 + i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        u2.d.d(i3, i4, this.f632d);
        Object[] objArr = this.f631b;
        int i5 = this.c + i3;
        int i6 = i4 - i3;
        boolean z3 = this.f633e;
        b bVar = this.g;
        return new b(objArr, i5, i6, z3, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        X1.g.e(objArr, "destination");
        f();
        int length = objArr.length;
        int i3 = this.f632d;
        int i4 = this.c;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f631b, i4, i3 + i4, objArr.getClass());
            X1.g.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        j.S(this.f631b, objArr, 0, i4, i3 + i4);
        int i5 = this.f632d;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        Object[] objArr = this.f631b;
        int i3 = this.f632d;
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.c + i4];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        f();
        int i4 = this.f632d;
        if (i3 >= 0 && i3 <= i4) {
            return new a(this, i3);
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        g();
        f();
        int i4 = this.f632d;
        if (i3 >= 0 && i3 <= i4) {
            e(this.c + i3, obj);
            return;
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        X1.g.e(collection, "elements");
        g();
        f();
        int i4 = this.f632d;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            d(this.c + i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f631b;
        int i3 = this.f632d;
        int i4 = this.c;
        int i5 = i3 + i4;
        X1.g.e(objArr, "<this>");
        l.e(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        X1.g.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public b() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i3) {
        this(new Object[i3], 0, 0, false, null, null);
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
