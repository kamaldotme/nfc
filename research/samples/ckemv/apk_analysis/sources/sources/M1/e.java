package M1;

import a2.C0062a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import u2.l;

/* loaded from: classes.dex */
public final class e implements Map, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final e f638o;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f639b;
    public Object[] c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f640d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f641e;

    /* renamed from: f, reason: collision with root package name */
    public int f642f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f643i;

    /* renamed from: j, reason: collision with root package name */
    public int f644j;

    /* renamed from: k, reason: collision with root package name */
    public f f645k;

    /* renamed from: l, reason: collision with root package name */
    public g f646l;

    /* renamed from: m, reason: collision with root package name */
    public f f647m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f648n;

    static {
        e eVar = new e(0);
        eVar.f648n = true;
        f638o = eVar;
    }

    public e() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i3 = i(obj);
            int i4 = this.f642f * 2;
            int length = this.f641e.length / 2;
            if (i4 > length) {
                i4 = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.f641e;
                int i6 = iArr[i3];
                if (i6 <= 0) {
                    int i7 = this.g;
                    Object[] objArr = this.f639b;
                    if (i7 < objArr.length) {
                        int i8 = i7 + 1;
                        this.g = i8;
                        objArr[i7] = obj;
                        this.f640d[i7] = i3;
                        iArr[i3] = i8;
                        this.f644j++;
                        this.f643i++;
                        if (i5 > this.f642f) {
                            this.f642f = i5;
                        }
                        return i7;
                    }
                    f(1);
                } else {
                    if (X1.g.a(this.f639b[i6 - 1], obj)) {
                        return -i6;
                    }
                    i5++;
                    if (i5 > i4) {
                        j(this.f641e.length * 2);
                        break;
                    }
                    i3 = i3 == 0 ? this.f641e.length - 1 : i3 - 1;
                }
            }
        }
    }

    public final e b() {
        c();
        this.f648n = true;
        if (this.f644j > 0) {
            return this;
        }
        e eVar = f638o;
        X1.g.c(eVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return eVar;
    }

    public final void c() {
        if (this.f648n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        int i3;
        c();
        C0062a c0062a = new C0062a(0, this.g - 1, 1);
        int i4 = c0062a.c;
        int i5 = c0062a.f1425d;
        boolean z3 = i5 <= 0 ? i4 <= 0 : i4 >= 0;
        int i6 = z3 ? 0 : i4;
        while (z3) {
            if (i6 != i4) {
                i3 = i6 + i5;
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                z3 = false;
                i3 = i6;
            }
            int[] iArr = this.f640d;
            int i7 = iArr[i6];
            if (i7 >= 0) {
                this.f641e[i7] = 0;
                iArr[i6] = -1;
            }
            i6 = i3;
        }
        l.F(this.f639b, 0, this.g);
        Object[] objArr = this.c;
        if (objArr != null) {
            l.F(objArr, 0, this.g);
        }
        this.f644j = 0;
        this.g = 0;
        this.f643i++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final boolean d(Collection collection) {
        X1.g.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean e(Map.Entry entry) {
        X1.g.e(entry, "entry");
        int g = g(entry.getKey());
        if (g < 0) {
            return false;
        }
        Object[] objArr = this.c;
        X1.g.b(objArr);
        return X1.g.a(objArr[g], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        f fVar = this.f647m;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 0);
        this.f647m = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f644j != map.size() || !d(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i3) {
        Object[] objArr;
        Object[] objArr2 = this.f639b;
        int length = objArr2.length;
        int i4 = this.g;
        int i5 = length - i4;
        int i6 = i4 - this.f644j;
        if (i5 < i3 && i5 + i6 >= i3 && i6 >= objArr2.length / 4) {
            j(this.f641e.length);
            return;
        }
        int i7 = i4 + i3;
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > objArr2.length) {
            int length2 = objArr2.length;
            int i8 = length2 + (length2 >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i8);
            X1.g.d(copyOf, "copyOf(...)");
            this.f639b = copyOf;
            Object[] objArr3 = this.c;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i8);
                X1.g.d(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.c = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f640d, i8);
            X1.g.d(copyOf2, "copyOf(...)");
            this.f640d = copyOf2;
            if (i8 < 1) {
                i8 = 1;
            }
            int highestOneBit = Integer.highestOneBit(i8 * 3);
            if (highestOneBit > this.f641e.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i3 = i(obj);
        int i4 = this.f642f;
        while (true) {
            int i5 = this.f641e[i3];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (X1.g.a(this.f639b[i6], obj)) {
                    return i6;
                }
            }
            i4--;
            if (i4 < 0) {
                return -1;
            }
            i3 = i3 == 0 ? this.f641e.length - 1 : i3 - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.c;
        X1.g.b(objArr);
        return objArr[g];
    }

    public final int h(Object obj) {
        int i3 = this.g;
        while (true) {
            i3--;
            if (i3 < 0) {
                return -1;
            }
            if (this.f640d[i3] >= 0) {
                Object[] objArr = this.c;
                X1.g.b(objArr);
                if (X1.g.a(objArr[i3], obj)) {
                    return i3;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i3 = 0;
        while (cVar.hasNext()) {
            int i4 = cVar.f471a;
            e eVar = (e) cVar.f473d;
            if (i4 >= eVar.g) {
                throw new NoSuchElementException();
            }
            cVar.f471a = i4 + 1;
            cVar.f472b = i4;
            Object obj = eVar.f639b[i4];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = eVar.c;
            X1.g.b(objArr);
            Object obj2 = objArr[cVar.f472b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.f();
            i3 += hashCode ^ hashCode2;
        }
        return i3;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.h;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f644j == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0066, code lost:
    
        r3[r0] = r7;
        r6.f640d[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i3) {
        int i4;
        this.f643i++;
        int i5 = 0;
        if (this.g > this.f644j) {
            Object[] objArr = this.c;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i4 = this.g;
                if (i6 >= i4) {
                    break;
                }
                if (this.f640d[i6] >= 0) {
                    Object[] objArr2 = this.f639b;
                    objArr2[i7] = objArr2[i6];
                    if (objArr != null) {
                        objArr[i7] = objArr[i6];
                    }
                    i7++;
                }
                i6++;
            }
            l.F(this.f639b, i7, i4);
            if (objArr != null) {
                l.F(objArr, i7, this.g);
            }
            this.g = i7;
        }
        int[] iArr = this.f641e;
        if (i3 != iArr.length) {
            this.f641e = new int[i3];
            this.h = Integer.numberOfLeadingZeros(i3) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        while (i5 < this.g) {
            int i8 = i5 + 1;
            int i9 = i(this.f639b[i5]);
            int i10 = this.f642f;
            while (true) {
                int[] iArr2 = this.f641e;
                if (iArr2[i9] == 0) {
                    break;
                }
                i10--;
                if (i10 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                i9 = i9 == 0 ? iArr2.length - 1 : i9 - 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x001e->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(int i3) {
        Object[] objArr = this.f639b;
        X1.g.e(objArr, "<this>");
        objArr[i3] = null;
        int i4 = this.f640d[i3];
        int i5 = this.f642f * 2;
        int length = this.f641e.length / 2;
        if (i5 > length) {
            i5 = length;
        }
        int i6 = i5;
        int i7 = 0;
        int i8 = i4;
        while (true) {
            i4 = i4 == 0 ? this.f641e.length - 1 : i4 - 1;
            i7++;
            if (i7 > this.f642f) {
                this.f641e[i8] = 0;
                break;
            }
            int[] iArr = this.f641e;
            int i9 = iArr[i4];
            if (i9 == 0) {
                iArr[i8] = 0;
                break;
            }
            if (i9 < 0) {
                iArr[i8] = -1;
            } else {
                int i10 = i9 - 1;
                int i11 = i(this.f639b[i10]) - i4;
                int[] iArr2 = this.f641e;
                if ((i11 & (iArr2.length - 1)) >= i7) {
                    iArr2[i8] = i9;
                    this.f640d[i10] = i8;
                }
                i6--;
                if (i6 >= 0) {
                    this.f641e[i8] = -1;
                    break;
                }
            }
            i8 = i4;
            i7 = 0;
            i6--;
            if (i6 >= 0) {
            }
        }
        this.f640d[i3] = -1;
        this.f644j--;
        this.f643i++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        f fVar = this.f645k;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this, 1);
        this.f645k = fVar2;
        return fVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a3 = a(obj);
        Object[] objArr = this.c;
        if (objArr == null) {
            int length = this.f639b.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.c = objArr;
        }
        if (a3 >= 0) {
            objArr[a3] = obj2;
            return null;
        }
        int i3 = (-a3) - 1;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        X1.g.e(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a3 = a(entry.getKey());
            Object[] objArr = this.c;
            if (objArr == null) {
                int length = this.f639b.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.c = objArr;
            }
            if (a3 >= 0) {
                objArr[a3] = entry.getValue();
            } else {
                int i3 = (-a3) - 1;
                if (!X1.g.a(entry.getValue(), objArr[i3])) {
                    objArr[i3] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            g = -1;
        } else {
            k(g);
        }
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.c;
        X1.g.b(objArr);
        Object obj2 = objArr[g];
        objArr[g] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f644j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f644j * 3) + 2);
        sb.append("{");
        c cVar = new c(this, 0);
        int i3 = 0;
        while (cVar.hasNext()) {
            if (i3 > 0) {
                sb.append(", ");
            }
            int i4 = cVar.f471a;
            e eVar = (e) cVar.f473d;
            if (i4 >= eVar.g) {
                throw new NoSuchElementException();
            }
            cVar.f471a = i4 + 1;
            cVar.f472b = i4;
            Object obj = eVar.f639b[i4];
            if (obj == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = eVar.c;
            X1.g.b(objArr);
            Object obj2 = objArr[cVar.f472b];
            if (obj2 == eVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.f();
            i3++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        X1.g.d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        g gVar = this.f646l;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f646l = gVar2;
        return gVar2;
    }

    public e(int i3) {
        if (i3 >= 0) {
            Object[] objArr = new Object[i3];
            int[] iArr = new int[i3];
            int highestOneBit = Integer.highestOneBit((i3 < 1 ? 1 : i3) * 3);
            this.f639b = objArr;
            this.c = null;
            this.f640d = iArr;
            this.f641e = new int[highestOneBit];
            this.f642f = 2;
            this.g = 0;
            this.h = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
