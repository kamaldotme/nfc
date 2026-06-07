package v0;

import Z.W;
import Z.f0;
import android.database.Cursor;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.work.impl.WorkDatabase;
import j1.AbstractC0236f;
import j1.C0238h;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import n.C0336e;
import n.C0342k;
import n.C0343l;
import p1.C0356a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5070a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5071b;
    public Object c;

    public /* synthetic */ e(Object obj, int i3, Object obj2) {
        this.f5070a = i3;
        this.f5071b = obj;
        this.c = obj2;
    }

    public e a(e eVar) {
        D1.a aVar = (D1.a) eVar.f5071b;
        D1.a aVar2 = (D1.a) this.f5071b;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (k()) {
            return eVar;
        }
        if (eVar.k()) {
            return this;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = (int[]) eVar.c;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i3 = length2; i3 < iArr.length; i3++) {
            iArr3[i3] = aVar2.a(iArr2[i3 - length2], iArr[i3]);
        }
        return new e(aVar2, iArr3);
    }

    public void b(W w3, A1.i iVar) {
        C0342k c0342k = (C0342k) this.f5071b;
        f0 f0Var = (f0) c0342k.getOrDefault(w3, null);
        if (f0Var == null) {
            f0Var = f0.a();
            c0342k.put(w3, f0Var);
        }
        f0Var.c = iVar;
        f0Var.f1268a |= 8;
    }

    public void c(String str, PrintWriter printWriter) {
        C0343l c0343l = ((W.a) this.c).c;
        if (c0343l.f4163d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c0343l.f4163d <= 0) {
                return;
            }
            X.d.q(c0343l.c[0]);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0343l.f4162b[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    public int d(int i3) {
        if (i3 == 0) {
            return g(0);
        }
        D1.a aVar = (D1.a) this.f5071b;
        int[] iArr = (int[]) this.c;
        if (i3 == 1) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4 = aVar.a(i4, i5);
            }
            return i4;
        }
        int i6 = iArr[0];
        int length = iArr.length;
        for (int i7 = 1; i7 < length; i7++) {
            i6 = aVar.a(aVar.c(i3, i6), iArr[i7]);
        }
        return i6;
    }

    public p1.b e() {
        int[] iArr;
        e eVar = this;
        if (((p1.b) eVar.c) == null) {
            p1.e eVar2 = (p1.e) eVar.f5071b;
            p1.b bVar = eVar2.f4343d;
            if (bVar == null) {
                AbstractC0236f abstractC0236f = eVar2.f4341a;
                int i3 = abstractC0236f.f3485a;
                int i4 = abstractC0236f.f3486b;
                if (i3 < 40 || i4 < 40) {
                    p1.b bVar2 = new p1.b(i3, i4);
                    if (eVar2.f4342b.length < i3) {
                        eVar2.f4342b = new byte[i3];
                    }
                    int i5 = 0;
                    while (true) {
                        iArr = eVar2.c;
                        if (i5 >= 32) {
                            break;
                        }
                        iArr[i5] = 0;
                        i5++;
                    }
                    for (int i6 = 1; i6 < 5; i6++) {
                        byte[] b3 = abstractC0236f.b((i4 * i6) / 5, eVar2.f4342b);
                        int i7 = (i3 << 2) / 5;
                        for (int i8 = i3 / 5; i8 < i7; i8++) {
                            int i9 = (b3[i8] & 255) >> 3;
                            iArr[i9] = iArr[i9] + 1;
                        }
                    }
                    int a3 = p1.e.a(iArr);
                    byte[] a4 = abstractC0236f.a();
                    for (int i10 = 0; i10 < i4; i10++) {
                        int i11 = i10 * i3;
                        for (int i12 = 0; i12 < i3; i12++) {
                            if ((a4[i11 + i12] & 255) < a3) {
                                bVar2.f(i12, i10);
                            }
                        }
                    }
                    eVar2.f4343d = bVar2;
                } else {
                    byte[] a5 = abstractC0236f.a();
                    int i13 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i13++;
                    }
                    int i14 = i4 >> 3;
                    if ((i4 & 7) != 0) {
                        i14++;
                    }
                    int i15 = i4 - 8;
                    int i16 = i3 - 8;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i14, i13);
                    int i17 = 0;
                    while (true) {
                        int i18 = 8;
                        if (i17 >= i14) {
                            break;
                        }
                        int i19 = i17 << 3;
                        if (i19 > i15) {
                            i19 = i15;
                        }
                        int i20 = 0;
                        while (i20 < i13) {
                            int i21 = i20 << 3;
                            if (i21 > i16) {
                                i21 = i16;
                            }
                            int i22 = (i19 * i3) + i21;
                            int i23 = 0;
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 255;
                            while (i23 < i18) {
                                int i27 = i19;
                                int i28 = i25;
                                int i29 = i26;
                                int i30 = 0;
                                while (i30 < i18) {
                                    p1.e eVar3 = eVar2;
                                    int i31 = a5[i22 + i30] & 255;
                                    i24 += i31;
                                    if (i31 < i29) {
                                        i29 = i31;
                                    }
                                    if (i31 > i28) {
                                        i28 = i31;
                                    }
                                    i30++;
                                    eVar2 = eVar3;
                                    i18 = 8;
                                }
                                p1.e eVar4 = eVar2;
                                if (i28 - i29 <= 24) {
                                    i23++;
                                    i22 += i3;
                                    i18 = 8;
                                    i26 = i29;
                                    i25 = i28;
                                    i19 = i27;
                                    eVar2 = eVar4;
                                }
                                while (true) {
                                    i23++;
                                    i22 += i3;
                                    if (i23 < 8) {
                                        int i32 = 0;
                                        for (int i33 = 8; i32 < i33; i33 = 8) {
                                            i24 += a5[i22 + i32] & 255;
                                            i32++;
                                        }
                                    }
                                }
                                i23++;
                                i22 += i3;
                                i18 = 8;
                                i26 = i29;
                                i25 = i28;
                                i19 = i27;
                                eVar2 = eVar4;
                            }
                            p1.e eVar5 = eVar2;
                            int i34 = i19;
                            int i35 = i24 >> 6;
                            int i36 = i26;
                            if (i25 - i36 <= 24) {
                                i35 = i36 / 2;
                                if (i17 > 0 && i20 > 0) {
                                    int[] iArr3 = iArr2[i17 - 1];
                                    int i37 = i20 - 1;
                                    int i38 = (((iArr2[i17][i37] * 2) + iArr3[i20]) + iArr3[i37]) / 4;
                                    if (i36 < i38) {
                                        i35 = i38;
                                    }
                                }
                            }
                            iArr2[i17][i20] = i35;
                            i20++;
                            i18 = 8;
                            i19 = i34;
                            eVar2 = eVar5;
                        }
                        i17++;
                    }
                    p1.e eVar6 = eVar2;
                    p1.b bVar3 = new p1.b(i3, i4);
                    int i39 = 0;
                    while (i39 < i14) {
                        int i40 = i39 << 3;
                        if (i40 > i15) {
                            i40 = i15;
                        }
                        int min = i39 < 2 ? 2 : Math.min(i39, i14 - 3);
                        int i41 = 0;
                        while (i41 < i13) {
                            int i42 = i41 << 3;
                            if (i42 > i16) {
                                i42 = i16;
                            }
                            int min2 = i41 < 2 ? 2 : Math.min(i41, i13 - 3);
                            int i43 = -2;
                            int i44 = 0;
                            for (int i45 = 2; i43 <= i45; i45 = 2) {
                                int[] iArr4 = iArr2[min + i43];
                                i44 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i44;
                                i43++;
                            }
                            int i46 = i44 / 25;
                            int i47 = (i40 * i3) + i42;
                            int i48 = min;
                            int i49 = 0;
                            while (true) {
                                if (i49 < 8) {
                                    int i50 = i13;
                                    int i51 = 0;
                                    for (int i52 = 8; i51 < i52; i52 = 8) {
                                        byte[] bArr = a5;
                                        if ((a5[i47 + i51] & 255) <= i46) {
                                            bVar3.f(i42 + i51, i40 + i49);
                                        }
                                        i51++;
                                        a5 = bArr;
                                    }
                                    i49++;
                                    i47 += i3;
                                    i13 = i50;
                                }
                            }
                            i41++;
                            min = i48;
                        }
                        i39++;
                    }
                    eVar2 = eVar6;
                    eVar2.f4343d = bVar3;
                }
                bVar = eVar2.f4343d;
                eVar = this;
            }
            eVar.c = bVar;
        }
        return (p1.b) eVar.c;
    }

    public C0356a f(C0356a c0356a, int i3) {
        int[] iArr;
        p1.e eVar = (p1.e) this.f5071b;
        AbstractC0236f abstractC0236f = eVar.f4341a;
        int i4 = abstractC0236f.f3485a;
        if (c0356a.c < i4) {
            c0356a = new C0356a(i4);
        } else {
            int length = c0356a.f4327b.length;
            for (int i5 = 0; i5 < length; i5++) {
                c0356a.f4327b[i5] = 0;
            }
        }
        if (eVar.f4342b.length < i4) {
            eVar.f4342b = new byte[i4];
        }
        int i6 = 0;
        while (true) {
            iArr = eVar.c;
            if (i6 >= 32) {
                break;
            }
            iArr[i6] = 0;
            i6++;
        }
        byte[] b3 = abstractC0236f.b(i3, eVar.f4342b);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = (b3[i7] & 255) >> 3;
            iArr[i8] = iArr[i8] + 1;
        }
        int a3 = p1.e.a(iArr);
        if (i4 < 3) {
            for (int i9 = 0; i9 < i4; i9++) {
                if ((b3[i9] & 255) < a3) {
                    c0356a.f(i9);
                }
            }
        } else {
            int i10 = 1;
            int i11 = b3[0] & 255;
            int i12 = b3[1] & 255;
            while (i10 < i4 - 1) {
                int i13 = i10 + 1;
                int i14 = b3[i13] & 255;
                if ((((i12 << 2) - i11) - i14) / 2 < a3) {
                    c0356a.f(i10);
                }
                i11 = i12;
                i10 = i13;
                i12 = i14;
            }
        }
        return c0356a;
    }

    public int g(int i3) {
        return ((int[]) this.c)[(r0.length - 1) - i3];
    }

    public int h() {
        return ((int[]) this.c).length - 1;
    }

    public Long i(String str) {
        a0.j a3 = a0.j.a("SELECT long_value FROM Preference where `key`=?", 1);
        a3.h(str, 1);
        WorkDatabase workDatabase = (WorkDatabase) this.f5071b;
        workDatabase.b();
        Long l3 = null;
        Cursor n3 = workDatabase.n(a3, null);
        try {
            if (n3.moveToFirst() && !n3.isNull(0)) {
                l3 = Long.valueOf(n3.getLong(0));
            }
            return l3;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public void j(C0404d c0404d) {
        WorkDatabase workDatabase = (WorkDatabase) this.f5071b;
        workDatabase.b();
        workDatabase.c();
        try {
            ((C0402b) this.c).t(c0404d);
            workDatabase.p();
        } finally {
            workDatabase.k();
        }
    }

    public boolean k() {
        return ((int[]) this.c)[0] == 0;
    }

    public e l(int i3) {
        D1.a aVar = (D1.a) this.f5071b;
        if (i3 == 0) {
            return aVar.c;
        }
        if (i3 == 1) {
            return this;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = aVar.c(iArr[i4], i3);
        }
        return new e(aVar, iArr2);
    }

    public e m(e eVar) {
        D1.a aVar = (D1.a) eVar.f5071b;
        D1.a aVar2 = (D1.a) this.f5071b;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (k() || eVar.k()) {
            return aVar2.c;
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length;
        int[] iArr2 = (int[]) eVar.c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            for (int i5 = 0; i5 < length2; i5++) {
                int i6 = i3 + i5;
                iArr3[i6] = aVar2.a(iArr3[i6], aVar2.c(i4, iArr2[i5]));
            }
        }
        return new e(aVar2, iArr3);
    }

    public A1.i n(W w3, int i3) {
        f0 f0Var;
        A1.i iVar;
        C0342k c0342k = (C0342k) this.f5071b;
        int e3 = c0342k.e(w3);
        if (e3 >= 0 && (f0Var = (f0) c0342k.j(e3)) != null) {
            int i4 = f0Var.f1268a;
            if ((i4 & i3) != 0) {
                int i5 = i4 & (~i3);
                f0Var.f1268a = i5;
                if (i3 == 4) {
                    iVar = f0Var.f1269b;
                } else {
                    if (i3 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    iVar = f0Var.c;
                }
                if ((i5 & 12) == 0) {
                    c0342k.i(e3);
                    f0Var.f1268a = 0;
                    f0Var.f1269b = null;
                    f0Var.c = null;
                    f0.f1267d.c(f0Var);
                }
                return iVar;
            }
        }
        return null;
    }

    public void o(W w3) {
        f0 f0Var = (f0) ((C0342k) this.f5071b).getOrDefault(w3, null);
        if (f0Var == null) {
            return;
        }
        f0Var.f1268a &= -2;
    }

    public void p(W w3) {
        C0336e c0336e = (C0336e) this.c;
        int f3 = c0336e.f() - 1;
        while (true) {
            if (f3 < 0) {
                break;
            }
            if (w3 == c0336e.g(f3)) {
                Object[] objArr = c0336e.f4142d;
                Object obj = objArr[f3];
                Object obj2 = C0336e.f4140f;
                if (obj != obj2) {
                    objArr[f3] = obj2;
                    c0336e.f4141b = true;
                }
            } else {
                f3--;
            }
        }
        f0 f0Var = (f0) ((C0342k) this.f5071b).remove(w3);
        if (f0Var != null) {
            f0Var.f1268a = 0;
            f0Var.f1269b = null;
            f0Var.c = null;
            f0.f1267d.c(f0Var);
        }
    }

    public e q(e eVar) {
        if (!((D1.a) this.f5071b).equals((D1.a) eVar.f5071b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (eVar.k()) {
            return this;
        }
        int[] iArr = (int[]) eVar.c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i3 = 0;
        while (true) {
            D1.a aVar = (D1.a) eVar.f5071b;
            if (i3 >= length) {
                return a(new e(aVar, iArr2));
            }
            int i4 = iArr[i3];
            aVar.getClass();
            iArr2[i3] = (929 - i4) % 929;
            i3++;
        }
    }

    public String toString() {
        int lastIndexOf;
        switch (this.f5070a) {
            case 1:
                StringBuilder sb = new StringBuilder(h() * 8);
                for (int h = h(); h >= 0; h--) {
                    int g = g(h);
                    if (g != 0) {
                        if (g < 0) {
                            sb.append(" - ");
                            g = -g;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (h == 0 || g != 1) {
                            sb.append(g);
                        }
                        if (h != 0) {
                            if (h == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(h);
                            }
                        }
                    }
                }
                return sb.toString();
            case 2:
                return "Bounds{lower=" + ((A.d) this.f5071b) + " upper=" + ((A.d) this.c) + "}";
            case 3:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                androidx.lifecycle.r rVar = (androidx.lifecycle.r) this.f5071b;
                if (rVar == null) {
                    sb2.append("null");
                } else {
                    String simpleName = rVar.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = rVar.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(lastIndexOf + 1);
                    }
                    sb2.append(simpleName);
                    sb2.append('{');
                    sb2.append(Integer.toHexString(System.identityHashCode(rVar)));
                }
                sb2.append("}}");
                return sb2.toString();
            case 4:
            default:
                return super.toString();
            case 5:
                try {
                    return e().toString();
                } catch (C0238h unused) {
                    return "";
                }
        }
    }

    public e(D1.a aVar, int[] iArr) {
        this.f5070a = 1;
        if (iArr.length != 0) {
            this.f5071b = aVar;
            int length = iArr.length;
            int i3 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i3 < length && iArr[i3] == 0) {
                    i3++;
                }
                if (i3 == length) {
                    this.c = new int[]{0};
                    return;
                }
                int i4 = length - i3;
                int[] iArr2 = new int[i4];
                this.c = iArr2;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                return;
            }
            this.c = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public e(WorkDatabase workDatabase) {
        this.f5070a = 0;
        this.f5071b = workDatabase;
        this.c = new C0402b(workDatabase, 1);
    }

    public e(p1.e eVar) {
        this.f5070a = 5;
        this.f5071b = eVar;
    }

    public e() {
        this.f5070a = 4;
        this.f5071b = new C0342k();
        this.c = new C0336e();
    }

    public e(androidx.lifecycle.r rVar, O o3) {
        M b3;
        this.f5070a = 3;
        this.f5071b = rVar;
        X1.g.e(o3, "store");
        U0.e eVar = W.a.f980d;
        X1.g.e(eVar, "factory");
        V.a aVar = V.a.f970b;
        X1.g.e(aVar, "defaultCreationExtras");
        String canonicalName = W.a.class.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            X1.g.e(concat, "key");
            LinkedHashMap linkedHashMap = o3.f2032a;
            M m3 = (M) linkedHashMap.get(concat);
            if (W.a.class.isInstance(m3)) {
                X1.g.c(m3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(aVar.f971a);
                linkedHashMap2.put(N.f2031b, concat);
                try {
                    b3 = eVar.b(W.a.class);
                } catch (AbstractMethodError unused) {
                    b3 = eVar.b(W.a.class);
                }
                m3 = b3;
                X1.g.e(m3, "viewModel");
                M m4 = (M) linkedHashMap.put(concat, m3);
                if (m4 != null) {
                    m4.a();
                }
            }
            this.c = (W.a) m3;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public e(ArrayList arrayList, ArrayList arrayList2) {
        this.f5070a = 7;
        int size = arrayList.size();
        this.f5071b = new int[size];
        this.c = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ((int[]) this.f5071b)[i3] = ((Integer) arrayList.get(i3)).intValue();
            ((float[]) this.c)[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    public e(int i3, int i4) {
        this.f5070a = 7;
        this.f5071b = new int[]{i3, i4};
        this.c = new float[]{0.0f, 1.0f};
    }

    public e(int i3, int i4, int i5) {
        this.f5070a = 7;
        this.f5071b = new int[]{i3, i4, i5};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
