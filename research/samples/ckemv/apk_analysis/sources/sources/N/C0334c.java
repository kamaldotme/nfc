package n;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334c implements Collection, Set {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4131f = new int[0];
    public static final Object[] g = new Object[0];
    public static Object[] h;

    /* renamed from: i, reason: collision with root package name */
    public static int f4132i;

    /* renamed from: j, reason: collision with root package name */
    public static Object[] f4133j;

    /* renamed from: k, reason: collision with root package name */
    public static int f4134k;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4135b = f4131f;
    public Object[] c = g;

    /* renamed from: d, reason: collision with root package name */
    public int f4136d = 0;

    /* renamed from: e, reason: collision with root package name */
    public C0332a f4137e;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C0334c.class) {
                try {
                    if (f4134k < 10) {
                        objArr[0] = f4133j;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f4133j = objArr;
                        f4134k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0334c.class) {
                try {
                    if (f4132i < 10) {
                        objArr[0] = h;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        h = objArr;
                        f4132i++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (C0334c.class) {
                try {
                    Object[] objArr = f4133j;
                    if (objArr != null) {
                        this.c = objArr;
                        f4133j = (Object[]) objArr[0];
                        this.f4135b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4134k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (C0334c.class) {
                try {
                    Object[] objArr2 = h;
                    if (objArr2 != null) {
                        this.c = objArr2;
                        h = (Object[]) objArr2[0];
                        this.f4135b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4132i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4135b = new int[i3];
        this.c = new Object[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int c;
        if (obj == null) {
            c = d();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            c = c(hashCode, obj);
        }
        if (c >= 0) {
            return false;
        }
        int i4 = ~c;
        int i5 = this.f4136d;
        int[] iArr = this.f4135b;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.c;
            a(i6);
            int[] iArr2 = this.f4135b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.c, 0, objArr.length);
            }
            b(iArr, objArr, this.f4136d);
        }
        int i7 = this.f4136d;
        if (i4 < i7) {
            int[] iArr3 = this.f4135b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f4136d - i4);
        }
        this.f4135b[i4] = i3;
        this.c[i4] = obj;
        this.f4136d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4136d;
        int[] iArr = this.f4135b;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.c;
            a(size);
            int i3 = this.f4136d;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f4135b, 0, i3);
                System.arraycopy(objArr, 0, this.c, 0, this.f4136d);
            }
            b(iArr, objArr, this.f4136d);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f4136d;
        if (i4 == 0) {
            return -1;
        }
        int a3 = AbstractC0335d.a(i4, i3, this.f4135b);
        if (a3 < 0 || obj.equals(this.c[a3])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f4135b[i5] == i3) {
            if (obj.equals(this.c[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f4135b[i6] == i3; i6--) {
            if (obj.equals(this.c[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i3 = this.f4136d;
        if (i3 != 0) {
            b(this.f4135b, this.c, i3);
            this.f4135b = f4131f;
            this.c = g;
            this.f4136d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i3 = this.f4136d;
        if (i3 == 0) {
            return -1;
        }
        int a3 = AbstractC0335d.a(i3, 0, this.f4135b);
        if (a3 < 0 || this.c[a3] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f4135b[i4] == 0) {
            if (this.c[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f4135b[i5] == 0; i5--) {
            if (this.c[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public final void e(int i3) {
        Object[] objArr = this.c;
        Object obj = objArr[i3];
        int i4 = this.f4136d;
        if (i4 <= 1) {
            b(this.f4135b, objArr, i4);
            this.f4135b = f4131f;
            this.c = g;
            this.f4136d = 0;
            return;
        }
        int[] iArr = this.f4135b;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i5 = i4 - 1;
            this.f4136d = i5;
            if (i3 < i5) {
                int i6 = i3 + 1;
                System.arraycopy(iArr, i6, iArr, i3, i5 - i3);
                Object[] objArr2 = this.c;
                System.arraycopy(objArr2, i6, objArr2, i3, this.f4136d - i3);
            }
            this.c[this.f4136d] = null;
            return;
        }
        a(i4 > 8 ? i4 + (i4 >> 1) : 8);
        this.f4136d--;
        if (i3 > 0) {
            System.arraycopy(iArr, 0, this.f4135b, 0, i3);
            System.arraycopy(objArr, 0, this.c, 0, i3);
        }
        int i7 = this.f4136d;
        if (i3 < i7) {
            int i8 = i3 + 1;
            System.arraycopy(iArr, i8, this.f4135b, i3, i7 - i3);
            System.arraycopy(objArr, i8, this.c, i3, this.f4136d - i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4136d != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f4136d; i3++) {
                try {
                    if (!set.contains(this.c[i3])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4135b;
        int i3 = this.f4136d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d() : c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4136d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f4137e == null) {
            this.f4137e = new C0332a(1, this);
        }
        C0332a c0332a = this.f4137e;
        if (((C0339h) c0332a.f1423b) == null) {
            c0332a.f1423b = new C0339h(c0332a, 1);
        }
        return ((C0339h) c0332a.f1423b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f4136d - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.c[i3])) {
                e(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4136d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i3 = this.f4136d;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.c, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4136d * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4136d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.c[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f4136d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4136d);
        }
        System.arraycopy(this.c, 0, objArr, 0, this.f4136d);
        int length = objArr.length;
        int i3 = this.f4136d;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
