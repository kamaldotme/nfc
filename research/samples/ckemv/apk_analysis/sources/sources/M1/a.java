package M1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final b f628a;

    /* renamed from: b, reason: collision with root package name */
    public int f629b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f630d;

    public a(b bVar, int i3) {
        int i4;
        X1.g.e(bVar, "list");
        this.f628a = bVar;
        this.f629b = i3;
        this.c = -1;
        i4 = ((AbstractList) bVar).modCount;
        this.f630d = i4;
    }

    public final void a() {
        int i3;
        i3 = ((AbstractList) this.f628a).modCount;
        if (i3 != this.f630d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i3;
        a();
        int i4 = this.f629b;
        this.f629b = i4 + 1;
        b bVar = this.f628a;
        bVar.add(i4, obj);
        this.c = -1;
        i3 = ((AbstractList) bVar).modCount;
        this.f630d = i3;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f629b < this.f628a.f632d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f629b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        int i3 = this.f629b;
        b bVar = this.f628a;
        if (i3 >= bVar.f632d) {
            throw new NoSuchElementException();
        }
        this.f629b = i3 + 1;
        this.c = i3;
        return bVar.f631b[bVar.c + i3];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f629b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        int i3 = this.f629b;
        if (i3 <= 0) {
            throw new NoSuchElementException();
        }
        int i4 = i3 - 1;
        this.f629b = i4;
        this.c = i4;
        b bVar = this.f628a;
        return bVar.f631b[bVar.c + i4];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f629b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3;
        a();
        int i4 = this.c;
        if (i4 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        b bVar = this.f628a;
        bVar.b(i4);
        this.f629b = this.c;
        this.c = -1;
        i3 = ((AbstractList) bVar).modCount;
        this.f630d = i3;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i3 = this.c;
        if (i3 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
        this.f628a.set(i3, obj);
    }
}
