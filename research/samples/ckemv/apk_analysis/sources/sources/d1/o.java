package d1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class o extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final O0.l f2641j = new O0.l(2);

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f2642b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public n f2643d;

    /* renamed from: e, reason: collision with root package name */
    public int f2644e;

    /* renamed from: f, reason: collision with root package name */
    public int f2645f;
    public final n g;
    public m h;

    /* renamed from: i, reason: collision with root package name */
    public m f2646i;

    public o(boolean z3) {
        O0.l lVar = f2641j;
        this.f2644e = 0;
        this.f2645f = 0;
        this.f2642b = lVar;
        this.c = z3;
        this.g = new n(z3);
    }

    public final n a(Object obj, boolean z3) {
        int i3;
        n nVar;
        n nVar2 = this.f2643d;
        O0.l lVar = f2641j;
        Comparator comparator = this.f2642b;
        if (nVar2 != null) {
            Comparable comparable = comparator == lVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = nVar2.f2639f;
                i3 = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i3 == 0) {
                    return nVar2;
                }
                n nVar3 = i3 < 0 ? nVar2.f2636b : nVar2.c;
                if (nVar3 == null) {
                    break;
                }
                nVar2 = nVar3;
            }
        } else {
            i3 = 0;
        }
        if (!z3) {
            return null;
        }
        n nVar4 = this.g;
        if (nVar2 != null) {
            nVar = new n(this.c, nVar2, obj, nVar4, nVar4.f2638e);
            if (i3 < 0) {
                nVar2.f2636b = nVar;
            } else {
                nVar2.c = nVar;
            }
            b(nVar2, true);
        } else {
            if (comparator == lVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.c, nVar2, obj, nVar4, nVar4.f2638e);
            this.f2643d = nVar;
        }
        this.f2644e++;
        this.f2645f++;
        return nVar;
    }

    public final void b(n nVar, boolean z3) {
        while (nVar != null) {
            n nVar2 = nVar.f2636b;
            n nVar3 = nVar.c;
            int i3 = nVar2 != null ? nVar2.f2640i : 0;
            int i4 = nVar3 != null ? nVar3.f2640i : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                n nVar4 = nVar3.f2636b;
                n nVar5 = nVar3.c;
                int i6 = (nVar4 != null ? nVar4.f2640i : 0) - (nVar5 != null ? nVar5.f2640i : 0);
                if (i6 == -1 || (i6 == 0 && !z3)) {
                    e(nVar);
                } else {
                    f(nVar3);
                    e(nVar);
                }
                if (z3) {
                    return;
                }
            } else if (i5 == 2) {
                n nVar6 = nVar2.f2636b;
                n nVar7 = nVar2.c;
                int i7 = (nVar6 != null ? nVar6.f2640i : 0) - (nVar7 != null ? nVar7.f2640i : 0);
                if (i7 == 1 || (i7 == 0 && !z3)) {
                    f(nVar);
                } else {
                    e(nVar2);
                    f(nVar);
                }
                if (z3) {
                    return;
                }
            } else if (i5 == 0) {
                nVar.f2640i = i3 + 1;
                if (z3) {
                    return;
                }
            } else {
                nVar.f2640i = Math.max(i3, i4) + 1;
                if (!z3) {
                    return;
                }
            }
            nVar = nVar.f2635a;
        }
    }

    public final void c(n nVar, boolean z3) {
        n nVar2;
        n nVar3;
        int i3;
        if (z3) {
            n nVar4 = nVar.f2638e;
            nVar4.f2637d = nVar.f2637d;
            nVar.f2637d.f2638e = nVar4;
        }
        n nVar5 = nVar.f2636b;
        n nVar6 = nVar.c;
        n nVar7 = nVar.f2635a;
        int i4 = 0;
        if (nVar5 == null || nVar6 == null) {
            if (nVar5 != null) {
                d(nVar, nVar5);
                nVar.f2636b = null;
            } else if (nVar6 != null) {
                d(nVar, nVar6);
                nVar.c = null;
            } else {
                d(nVar, null);
            }
            b(nVar7, false);
            this.f2644e--;
            this.f2645f++;
            return;
        }
        if (nVar5.f2640i > nVar6.f2640i) {
            n nVar8 = nVar5.c;
            while (true) {
                n nVar9 = nVar8;
                nVar3 = nVar5;
                nVar5 = nVar9;
                if (nVar5 == null) {
                    break;
                } else {
                    nVar8 = nVar5.c;
                }
            }
        } else {
            n nVar10 = nVar6.f2636b;
            while (true) {
                nVar2 = nVar6;
                nVar6 = nVar10;
                if (nVar6 == null) {
                    break;
                } else {
                    nVar10 = nVar6.f2636b;
                }
            }
            nVar3 = nVar2;
        }
        c(nVar3, false);
        n nVar11 = nVar.f2636b;
        if (nVar11 != null) {
            i3 = nVar11.f2640i;
            nVar3.f2636b = nVar11;
            nVar11.f2635a = nVar3;
            nVar.f2636b = null;
        } else {
            i3 = 0;
        }
        n nVar12 = nVar.c;
        if (nVar12 != null) {
            i4 = nVar12.f2640i;
            nVar3.c = nVar12;
            nVar12.f2635a = nVar3;
            nVar.c = null;
        }
        nVar3.f2640i = Math.max(i3, i4) + 1;
        d(nVar, nVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f2643d = null;
        this.f2644e = 0;
        this.f2645f++;
        n nVar = this.g;
        nVar.f2638e = nVar;
        nVar.f2637d = nVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return nVar != null;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.f2635a;
        nVar.f2635a = null;
        if (nVar2 != null) {
            nVar2.f2635a = nVar3;
        }
        if (nVar3 == null) {
            this.f2643d = nVar2;
        } else if (nVar3.f2636b == nVar) {
            nVar3.f2636b = nVar2;
        } else {
            nVar3.c = nVar2;
        }
    }

    public final void e(n nVar) {
        n nVar2 = nVar.f2636b;
        n nVar3 = nVar.c;
        n nVar4 = nVar3.f2636b;
        n nVar5 = nVar3.c;
        nVar.c = nVar4;
        if (nVar4 != null) {
            nVar4.f2635a = nVar;
        }
        d(nVar, nVar3);
        nVar3.f2636b = nVar;
        nVar.f2635a = nVar3;
        int max = Math.max(nVar2 != null ? nVar2.f2640i : 0, nVar4 != null ? nVar4.f2640i : 0) + 1;
        nVar.f2640i = max;
        nVar3.f2640i = Math.max(max, nVar5 != null ? nVar5.f2640i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        m mVar = this.h;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.h = mVar2;
        return mVar2;
    }

    public final void f(n nVar) {
        n nVar2 = nVar.f2636b;
        n nVar3 = nVar.c;
        n nVar4 = nVar2.f2636b;
        n nVar5 = nVar2.c;
        nVar.f2636b = nVar5;
        if (nVar5 != null) {
            nVar5.f2635a = nVar;
        }
        d(nVar, nVar2);
        nVar2.c = nVar;
        nVar.f2635a = nVar2;
        int max = Math.max(nVar3 != null ? nVar3.f2640i : 0, nVar5 != null ? nVar5.f2640i : 0) + 1;
        nVar.f2640i = max;
        nVar2.f2640i = Math.max(max, nVar4 != null ? nVar4.f2640i : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        n nVar;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (nVar == null) {
                return nVar.h;
            }
            return null;
        }
        nVar = null;
        if (nVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        m mVar = this.f2646i;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.f2646i = mVar2;
        return mVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.c) {
            throw new NullPointerException("value == null");
        }
        n a3 = a(obj, true);
        Object obj3 = a3.h;
        a3.h = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        n nVar;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (nVar != null) {
                c(nVar, true);
            }
            if (nVar == null) {
                return nVar.h;
            }
            return null;
        }
        nVar = null;
        if (nVar != null) {
        }
        if (nVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2644e;
    }
}
