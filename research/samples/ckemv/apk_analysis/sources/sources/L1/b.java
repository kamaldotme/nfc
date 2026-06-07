package L1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class b implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f610a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f611b;
    public final Object c;

    public b(Object[] objArr) {
        X1.g.e(objArr, "array");
        this.c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f610a) {
            case 0:
                return this.f611b < ((e) this.c).a();
            case 1:
                return this.f611b < ((Object[]) this.c).length;
        }
        while (true) {
            int i3 = this.f611b;
            it = (Iterator) this.c;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f611b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f610a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f611b;
                this.f611b = i3 + 1;
                return ((e) this.c).get(i3);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i4 = this.f611b;
                    this.f611b = i4 + 1;
                    return objArr[i4];
                } catch (ArrayIndexOutOfBoundsException e3) {
                    this.f611b--;
                    throw new NoSuchElementException(e3.getMessage());
                }
        }
        while (true) {
            int i5 = this.f611b;
            it = (Iterator) this.c;
            if (i5 > 0 && it.hasNext()) {
                it.next();
                this.f611b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f610a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(e eVar) {
        this.c = eVar;
    }

    public b(c2.b bVar) {
        this.c = bVar.f2254a.iterator();
        this.f611b = bVar.f2255b;
    }
}
