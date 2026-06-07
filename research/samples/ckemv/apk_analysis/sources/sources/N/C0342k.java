package n;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0342k {

    /* renamed from: e, reason: collision with root package name */
    public static Object[] f4157e;

    /* renamed from: f, reason: collision with root package name */
    public static int f4158f;
    public static Object[] g;
    public static int h;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4159b = AbstractC0335d.f4138a;
    public Object[] c = AbstractC0335d.f4139b;

    /* renamed from: d, reason: collision with root package name */
    public int f4160d = 0;

    public static void c(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C0342k.class) {
                try {
                    if (h < 10) {
                        objArr[0] = g;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        g = objArr;
                        h++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0342k.class) {
                try {
                    if (f4158f < 10) {
                        objArr[0] = f4157e;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f4157e = objArr;
                        f4158f++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (C0342k.class) {
                try {
                    Object[] objArr = g;
                    if (objArr != null) {
                        this.c = objArr;
                        g = (Object[]) objArr[0];
                        this.f4159b = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        h--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (C0342k.class) {
                try {
                    Object[] objArr2 = f4157e;
                    if (objArr2 != null) {
                        this.c = objArr2;
                        f4157e = (Object[]) objArr2[0];
                        this.f4159b = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4158f--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4159b = new int[i3];
        this.c = new Object[i3 << 1];
    }

    public final void b(int i3) {
        int i4 = this.f4160d;
        int[] iArr = this.f4159b;
        if (iArr.length < i3) {
            Object[] objArr = this.c;
            a(i3);
            if (this.f4160d > 0) {
                System.arraycopy(iArr, 0, this.f4159b, 0, i4);
                System.arraycopy(objArr, 0, this.c, 0, i4 << 1);
            }
            c(iArr, objArr, i4);
        }
        if (this.f4160d != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i3 = this.f4160d;
        if (i3 > 0) {
            int[] iArr = this.f4159b;
            Object[] objArr = this.c;
            this.f4159b = AbstractC0335d.f4138a;
            this.c = AbstractC0335d.f4139b;
            this.f4160d = 0;
            c(iArr, objArr, i3);
        }
        if (this.f4160d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i3, Object obj) {
        int i4 = this.f4160d;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0335d.a(i4, i3, this.f4159b);
            if (a3 < 0 || obj.equals(this.c[a3 << 1])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && this.f4159b[i5] == i3) {
                if (obj.equals(this.c[i5 << 1])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && this.f4159b[i6] == i3; i6--) {
                if (obj.equals(this.c[i6 << 1])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0342k) {
            C0342k c0342k = (C0342k) obj;
            if (this.f4160d != c0342k.f4160d) {
                return false;
            }
            for (int i3 = 0; i3 < this.f4160d; i3++) {
                try {
                    Object h3 = h(i3);
                    Object j3 = j(i3);
                    Object orDefault = c0342k.getOrDefault(h3, null);
                    if (j3 == null) {
                        if (orDefault != null || !c0342k.containsKey(h3)) {
                            return false;
                        }
                    } else if (!j3.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f4160d != map.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f4160d; i4++) {
                try {
                    Object h4 = h(i4);
                    Object j4 = j(i4);
                    Object obj2 = map.get(h4);
                    if (j4 == null) {
                        if (obj2 != null || !map.containsKey(h4)) {
                            return false;
                        }
                    } else if (!j4.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i3 = this.f4160d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0335d.a(i3, 0, this.f4159b);
            if (a3 < 0 || this.c[a3 << 1] == null) {
                return a3;
            }
            int i4 = a3 + 1;
            while (i4 < i3 && this.f4159b[i4] == 0) {
                if (this.c[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a3 - 1; i5 >= 0 && this.f4159b[i5] == 0; i5--) {
                if (this.c[i5 << 1] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i3 = this.f4160d * 2;
        Object[] objArr = this.c;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e3 = e(obj);
        return e3 >= 0 ? this.c[(e3 << 1) + 1] : obj2;
    }

    public final Object h(int i3) {
        return this.c[i3 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f4159b;
        Object[] objArr = this.c;
        int i3 = this.f4160d;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i3) {
        Object[] objArr = this.c;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f4160d;
        int i6 = 0;
        if (i5 <= 1) {
            c(this.f4159b, objArr, i5);
            this.f4159b = AbstractC0335d.f4138a;
            this.c = AbstractC0335d.f4139b;
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f4159b;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i7) {
                    int i8 = i3 + 1;
                    int i9 = i7 - i3;
                    System.arraycopy(iArr, i8, iArr, i3, i9);
                    Object[] objArr2 = this.c;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i4, i9 << 1);
                }
                Object[] objArr3 = this.c;
                int i10 = i7 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                a(i5 > 8 ? i5 + (i5 >> 1) : 8);
                if (i5 != this.f4160d) {
                    throw new ConcurrentModificationException();
                }
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f4159b, 0, i3);
                    System.arraycopy(objArr, 0, this.c, 0, i4);
                }
                if (i3 < i7) {
                    int i11 = i3 + 1;
                    int i12 = i7 - i3;
                    System.arraycopy(iArr, i11, this.f4159b, i3, i12);
                    System.arraycopy(objArr, i11 << 1, this.c, i4, i12 << 1);
                }
            }
            i6 = i7;
        }
        if (i5 != this.f4160d) {
            throw new ConcurrentModificationException();
        }
        this.f4160d = i6;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f4160d <= 0;
    }

    public final Object j(int i3) {
        return this.c[(i3 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int d3;
        int i4 = this.f4160d;
        if (obj == null) {
            d3 = f();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            d3 = d(hashCode, obj);
        }
        if (d3 >= 0) {
            int i5 = (d3 << 1) + 1;
            Object[] objArr = this.c;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~d3;
        int[] iArr = this.f4159b;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.c;
            a(i7);
            if (i4 != this.f4160d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f4159b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.c, 0, objArr2.length);
            }
            c(iArr, objArr2, i4);
        }
        if (i6 < i4) {
            int[] iArr3 = this.f4159b;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.c;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f4160d - i6) << 1);
        }
        int i9 = this.f4160d;
        if (i4 == i9) {
            int[] iArr4 = this.f4159b;
            if (i6 < iArr4.length) {
                iArr4[i6] = i3;
                Object[] objArr4 = this.c;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f4160d = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int e3 = e(obj);
        if (e3 >= 0) {
            return i(e3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e3 = e(obj);
        if (e3 < 0) {
            return null;
        }
        int i3 = (e3 << 1) + 1;
        Object[] objArr = this.c;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f4160d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4160d * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f4160d; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object h3 = h(i3);
            if (h3 != this) {
                sb.append(h3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j3 = j(i3);
            if (j3 != this) {
                sb.append(j3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e3 = e(obj);
        if (e3 < 0) {
            return false;
        }
        Object j3 = j(e3);
        if (obj2 != j3 && (obj2 == null || !obj2.equals(j3))) {
            return false;
        }
        i(e3);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e3 = e(obj);
        if (e3 < 0) {
            return false;
        }
        Object j3 = j(e3);
        if (j3 != obj2 && (obj2 == null || !obj2.equals(j3))) {
            return false;
        }
        int i3 = (e3 << 1) + 1;
        Object[] objArr = this.c;
        Object obj4 = objArr[i3];
        objArr[i3] = obj3;
        return true;
    }
}
