package L1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f616e = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public int f617b;
    public Object[] c = f616e;

    /* renamed from: d, reason: collision with root package name */
    public int f618d;

    @Override // L1.f
    public final int a() {
        return this.f618d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f618d;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i5);
        }
        if (i3 == i5) {
            c(obj);
            return;
        }
        if (i3 == 0) {
            e(i5 + 1);
            int i6 = this.f617b;
            if (i6 == 0) {
                Object[] objArr = this.c;
                X1.g.e(objArr, "<this>");
                i6 = objArr.length;
            }
            int i7 = i6 - 1;
            this.f617b = i7;
            this.c[i7] = obj;
            this.f618d++;
            return;
        }
        e(i5 + 1);
        int g = g(this.f617b + i3);
        int i8 = this.f618d;
        if (i3 < ((i8 + 1) >> 1)) {
            if (g == 0) {
                Object[] objArr2 = this.c;
                X1.g.e(objArr2, "<this>");
                i4 = objArr2.length - 1;
            } else {
                i4 = g - 1;
            }
            int i9 = this.f617b;
            if (i9 == 0) {
                Object[] objArr3 = this.c;
                X1.g.e(objArr3, "<this>");
                i9 = objArr3.length;
            }
            int i10 = i9 - 1;
            int i11 = this.f617b;
            if (i4 >= i11) {
                Object[] objArr4 = this.c;
                objArr4[i10] = objArr4[i11];
                j.S(objArr4, objArr4, i11, i11 + 1, i4 + 1);
            } else {
                Object[] objArr5 = this.c;
                j.S(objArr5, objArr5, i11 - 1, i11, objArr5.length);
                Object[] objArr6 = this.c;
                objArr6[objArr6.length - 1] = objArr6[0];
                j.S(objArr6, objArr6, 0, 1, i4 + 1);
            }
            this.c[i4] = obj;
            this.f617b = i10;
        } else {
            int g3 = g(i8 + this.f617b);
            if (g < g3) {
                Object[] objArr7 = this.c;
                j.S(objArr7, objArr7, g + 1, g, g3);
            } else {
                Object[] objArr8 = this.c;
                j.S(objArr8, objArr8, 1, 0, g3);
                Object[] objArr9 = this.c;
                objArr9[0] = objArr9[objArr9.length - 1];
                j.S(objArr9, objArr9, g + 1, g, objArr9.length - 1);
            }
            this.c[g] = obj;
        }
        this.f618d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        X1.g.e(collection, "elements");
        int i4 = this.f618d;
        if (i3 >= 0 && i3 <= i4) {
            if (collection.isEmpty()) {
                return false;
            }
            int i5 = this.f618d;
            if (i3 == i5) {
                return addAll(collection);
            }
            e(collection.size() + i5);
            int g = g(this.f618d + this.f617b);
            int g3 = g(this.f617b + i3);
            int size = collection.size();
            if (i3 < ((this.f618d + 1) >> 1)) {
                int i6 = this.f617b;
                int i7 = i6 - size;
                if (g3 < i6) {
                    Object[] objArr = this.c;
                    j.S(objArr, objArr, i7, i6, objArr.length);
                    if (size >= g3) {
                        Object[] objArr2 = this.c;
                        j.S(objArr2, objArr2, objArr2.length - size, 0, g3);
                    } else {
                        Object[] objArr3 = this.c;
                        j.S(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.c;
                        j.S(objArr4, objArr4, 0, size, g3);
                    }
                } else if (i7 >= 0) {
                    Object[] objArr5 = this.c;
                    j.S(objArr5, objArr5, i7, i6, g3);
                } else {
                    Object[] objArr6 = this.c;
                    i7 += objArr6.length;
                    int i8 = g3 - i6;
                    int length = objArr6.length - i7;
                    if (length >= i8) {
                        j.S(objArr6, objArr6, i7, i6, g3);
                    } else {
                        j.S(objArr6, objArr6, i7, i6, i6 + length);
                        Object[] objArr7 = this.c;
                        j.S(objArr7, objArr7, 0, this.f617b + length, g3);
                    }
                }
                this.f617b = i7;
                int i9 = g3 - size;
                if (i9 < 0) {
                    i9 += this.c.length;
                }
                d(i9, collection);
            } else {
                int i10 = g3 + size;
                if (g3 < g) {
                    int i11 = size + g;
                    Object[] objArr8 = this.c;
                    if (i11 <= objArr8.length) {
                        j.S(objArr8, objArr8, i10, g3, g);
                    } else if (i10 >= objArr8.length) {
                        j.S(objArr8, objArr8, i10 - objArr8.length, g3, g);
                    } else {
                        int length2 = g - (i11 - objArr8.length);
                        j.S(objArr8, objArr8, 0, length2, g);
                        Object[] objArr9 = this.c;
                        j.S(objArr9, objArr9, i10, g3, length2);
                    }
                } else {
                    Object[] objArr10 = this.c;
                    j.S(objArr10, objArr10, size, 0, g);
                    Object[] objArr11 = this.c;
                    if (i10 >= objArr11.length) {
                        j.S(objArr11, objArr11, i10 - objArr11.length, g3, objArr11.length);
                    } else {
                        j.S(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.c;
                        j.S(objArr12, objArr12, i10, g3, objArr12.length - size);
                    }
                }
                d(g3, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
    }

    @Override // L1.f
    public final Object b(int i3) {
        int i4 = this.f618d;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
        }
        if (i3 == l.Q(this)) {
            if (isEmpty()) {
                throw new NoSuchElementException("ArrayDeque is empty.");
            }
            int g = g(l.Q(this) + this.f617b);
            Object[] objArr = this.c;
            Object obj = objArr[g];
            objArr[g] = null;
            this.f618d--;
            return obj;
        }
        if (i3 == 0) {
            return h();
        }
        int g3 = g(this.f617b + i3);
        Object[] objArr2 = this.c;
        Object obj2 = objArr2[g3];
        if (i3 < (this.f618d >> 1)) {
            int i5 = this.f617b;
            if (g3 >= i5) {
                j.S(objArr2, objArr2, i5 + 1, i5, g3);
            } else {
                j.S(objArr2, objArr2, 1, 0, g3);
                Object[] objArr3 = this.c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f617b;
                j.S(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.c;
            int i7 = this.f617b;
            objArr4[i7] = null;
            this.f617b = f(i7);
        } else {
            int g4 = g(l.Q(this) + this.f617b);
            if (g3 <= g4) {
                Object[] objArr5 = this.c;
                j.S(objArr5, objArr5, g3, g3 + 1, g4 + 1);
            } else {
                Object[] objArr6 = this.c;
                j.S(objArr6, objArr6, g3, g3 + 1, objArr6.length);
                Object[] objArr7 = this.c;
                objArr7[objArr7.length - 1] = objArr7[0];
                j.S(objArr7, objArr7, 0, 1, g4 + 1);
            }
            this.c[g4] = null;
        }
        this.f618d--;
        return obj2;
    }

    public final void c(Object obj) {
        e(a() + 1);
        this.c[g(a() + this.f617b)] = obj;
        this.f618d = a() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int g = g(this.f618d + this.f617b);
        int i3 = this.f617b;
        if (i3 < g) {
            j.T(this.c, null, i3, g);
        } else if (!isEmpty()) {
            Object[] objArr = this.c;
            Arrays.fill(objArr, this.f617b, objArr.length, (Object) null);
            j.T(this.c, null, 0, g);
        }
        this.f617b = 0;
        this.f618d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.c.length;
        while (i3 < length && it.hasNext()) {
            this.c[i3] = it.next();
            i3++;
        }
        int i4 = this.f617b;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.c[i5] = it.next();
        }
        this.f618d = collection.size() + a();
    }

    public final void e(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.c;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f616e) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.c = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        j.S(objArr, objArr2, 0, this.f617b, objArr.length);
        Object[] objArr3 = this.c;
        int length2 = objArr3.length;
        int i5 = this.f617b;
        j.S(objArr3, objArr2, length2 - i5, 0, i5);
        this.f617b = 0;
        this.c = objArr2;
    }

    public final int f(int i3) {
        X1.g.e(this.c, "<this>");
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int g(int i3) {
        Object[] objArr = this.c;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int a3 = a();
        if (i3 >= 0 && i3 < a3) {
            return this.c[g(this.f617b + i3)];
        }
        throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + a3);
    }

    public final Object h() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.c;
        int i3 = this.f617b;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f617b = f(i3);
        this.f618d = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int g = g(a() + this.f617b);
        int i4 = this.f617b;
        if (i4 < g) {
            while (i4 < g) {
                if (X1.g.a(obj, this.c[i4])) {
                    i3 = this.f617b;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 < g) {
            return -1;
        }
        int length = this.c.length;
        while (true) {
            if (i4 >= length) {
                for (int i5 = 0; i5 < g; i5++) {
                    if (X1.g.a(obj, this.c[i5])) {
                        i4 = i5 + this.c.length;
                        i3 = this.f617b;
                    }
                }
                return -1;
            }
            if (X1.g.a(obj, this.c[i4])) {
                i3 = this.f617b;
                break;
            }
            i4++;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int g = g(this.f618d + this.f617b);
        int i4 = this.f617b;
        if (i4 < g) {
            length = g - 1;
            if (i4 <= length) {
                while (!X1.g.a(obj, this.c[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i3 = this.f617b;
                return length - i3;
            }
            return -1;
        }
        if (i4 > g) {
            int i5 = g - 1;
            while (true) {
                if (-1 >= i5) {
                    Object[] objArr = this.c;
                    X1.g.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i6 = this.f617b;
                    if (i6 <= length) {
                        while (!X1.g.a(obj, this.c[length])) {
                            if (length != i6) {
                                length--;
                            }
                        }
                        i3 = this.f617b;
                    }
                } else {
                    if (X1.g.a(obj, this.c[i5])) {
                        length = i5 + this.c.length;
                        i3 = this.f617b;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int g;
        X1.g.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.c.length != 0) {
            int g3 = g(this.f618d + this.f617b);
            int i3 = this.f617b;
            if (i3 < g3) {
                g = i3;
                while (i3 < g3) {
                    Object obj = this.c[i3];
                    if (!collection.contains(obj)) {
                        this.c[g] = obj;
                        g++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                j.T(this.c, null, g, g3);
            } else {
                int length = this.c.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (!collection.contains(obj2)) {
                        this.c[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                g = g(i4);
                for (int i5 = 0; i5 < g3; i5++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (!collection.contains(obj3)) {
                        this.c[g] = obj3;
                        g = f(g);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                int i6 = g - this.f617b;
                if (i6 < 0) {
                    i6 += this.c.length;
                }
                this.f618d = i6;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int g;
        X1.g.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.c.length != 0) {
            int g3 = g(this.f618d + this.f617b);
            int i3 = this.f617b;
            if (i3 < g3) {
                g = i3;
                while (i3 < g3) {
                    Object obj = this.c[i3];
                    if (collection.contains(obj)) {
                        this.c[g] = obj;
                        g++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                j.T(this.c, null, g, g3);
            } else {
                int length = this.c.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.c;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        this.c[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                g = g(i4);
                for (int i5 = 0; i5 < g3; i5++) {
                    Object[] objArr2 = this.c;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        this.c[g] = obj3;
                        g = f(g);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                int i6 = g - this.f617b;
                if (i6 < 0) {
                    i6 += this.c.length;
                }
                this.f618d = i6;
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int a3 = a();
        if (i3 < 0 || i3 >= a3) {
            throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + a3);
        }
        int g = g(this.f617b + i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[g];
        objArr[g] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        X1.g.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f618d;
        if (length < i3) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            X1.g.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int g = g(this.f618d + this.f617b);
        int i4 = this.f617b;
        if (i4 < g) {
            j.S(this.c, objArr, 0, i4, g);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.c;
            j.S(objArr2, objArr, 0, this.f617b, objArr2.length);
            Object[] objArr3 = this.c;
            j.S(objArr3, objArr, objArr3.length - this.f617b, 0, g);
        }
        int i5 = this.f618d;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        X1.g.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        e(collection.size() + a());
        d(g(a() + this.f617b), collection);
        return true;
    }
}
