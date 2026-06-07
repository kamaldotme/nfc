package androidx.fragment.app;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC0096m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1803A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1804B;

    /* renamed from: C, reason: collision with root package name */
    public ArrayList f1805C;
    public ArrayList D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f1806E;

    /* renamed from: F, reason: collision with root package name */
    public D f1807F;

    /* renamed from: G, reason: collision with root package name */
    public final F0.h f1808G;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1810b;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f1811d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f1812e;
    public androidx.activity.u g;

    /* renamed from: k, reason: collision with root package name */
    public final v0.r f1816k;

    /* renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1817l;

    /* renamed from: m, reason: collision with root package name */
    public int f1818m;

    /* renamed from: n, reason: collision with root package name */
    public C0080q f1819n;

    /* renamed from: o, reason: collision with root package name */
    public v0.f f1820o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractComponentCallbacksC0077n f1821p;

    /* renamed from: q, reason: collision with root package name */
    public AbstractComponentCallbacksC0077n f1822q;

    /* renamed from: r, reason: collision with root package name */
    public final w f1823r;

    /* renamed from: s, reason: collision with root package name */
    public final U0.e f1824s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.activity.result.d f1825t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.activity.result.d f1826u;

    /* renamed from: v, reason: collision with root package name */
    public androidx.activity.result.d f1827v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayDeque f1828w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1829x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1830y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1831z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1809a = new ArrayList();
    public final v0.m c = new v0.m();

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C0082t f1813f = new LayoutInflaterFactory2C0082t(this);
    public final v h = new v(this);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1814i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    public final Map f1815j = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v10, types: [v0.r, java.lang.Object] */
    public B() {
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new U0.e(20, this);
        ?? obj = new Object();
        obj.f5124b = new CopyOnWriteArrayList();
        obj.c = this;
        this.f1816k = obj;
        this.f1817l = new CopyOnWriteArrayList();
        this.f1818m = -1;
        this.f1823r = new w(this);
        this.f1824s = new U0.e(21);
        this.f1828w = new ArrayDeque();
        this.f1808G = new F0.h(11, this);
    }

    public static boolean E(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        abstractComponentCallbacksC0077n.getClass();
        Iterator it = abstractComponentCallbacksC0077n.f1985u.c.n().iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = (AbstractComponentCallbacksC0077n) it.next();
            if (abstractComponentCallbacksC0077n2 != null) {
                z3 = E(abstractComponentCallbacksC0077n2);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (abstractComponentCallbacksC0077n == null) {
            return true;
        }
        return abstractComponentCallbacksC0077n.f1955C && (abstractComponentCallbacksC0077n.f1983s == null || F(abstractComponentCallbacksC0077n.f1986v));
    }

    public static boolean G(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (abstractComponentCallbacksC0077n == null) {
            return true;
        }
        B b3 = abstractComponentCallbacksC0077n.f1983s;
        return abstractComponentCallbacksC0077n.equals(b3.f1822q) && G(b3.f1821p);
    }

    public final ViewGroup A(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        ViewGroup viewGroup = abstractComponentCallbacksC0077n.f1956E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0077n.f1988x > 0 && this.f1820o.F()) {
            View C2 = this.f1820o.C(abstractComponentCallbacksC0077n.f1988x);
            if (C2 instanceof ViewGroup) {
                return (ViewGroup) C2;
            }
        }
        return null;
    }

    public final w B() {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.f1821p;
        return abstractComponentCallbacksC0077n != null ? abstractComponentCallbacksC0077n.f1983s.B() : this.f1823r;
    }

    public final U0.e C() {
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.f1821p;
        return abstractComponentCallbacksC0077n != null ? abstractComponentCallbacksC0077n.f1983s.C() : this.f1824s;
    }

    public final void D(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        if (abstractComponentCallbacksC0077n.f1990z) {
            return;
        }
        abstractComponentCallbacksC0077n.f1990z = true;
        abstractComponentCallbacksC0077n.f1961J = true ^ abstractComponentCallbacksC0077n.f1961J;
        T(abstractComponentCallbacksC0077n);
    }

    public final void H(int i3, boolean z3) {
        HashMap hashMap;
        C0080q c0080q;
        if (this.f1819n == null && i3 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i3 != this.f1818m) {
            this.f1818m = i3;
            v0.m mVar = this.c;
            Iterator it = ((ArrayList) mVar.c).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) mVar.f5087d;
                if (!hasNext) {
                    break;
                }
                G g = (G) hashMap.get(((AbstractComponentCallbacksC0077n) it.next()).f1972f);
                if (g != null) {
                    g.k();
                }
            }
            for (G g3 : hashMap.values()) {
                if (g3 != null) {
                    g3.k();
                    AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g3.c;
                    if (abstractComponentCallbacksC0077n.f1977m && abstractComponentCallbacksC0077n.f1982r <= 0) {
                        mVar.D(g3);
                    }
                }
            }
            U();
            if (this.f1829x && (c0080q = this.f1819n) != null && this.f1818m == 7) {
                c0080q.h.k().a();
                this.f1829x = false;
            }
        }
    }

    public final void I() {
        if (this.f1819n == null) {
            return;
        }
        this.f1830y = false;
        this.f1831z = false;
        this.f1807F.h = false;
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null) {
                abstractComponentCallbacksC0077n.f1985u.I();
            }
        }
    }

    public final boolean J() {
        w(false);
        v(true);
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.f1822q;
        if (abstractComponentCallbacksC0077n != null && abstractComponentCallbacksC0077n.g().J()) {
            return true;
        }
        boolean K2 = K(this.f1805C, this.D, -1, 0);
        if (K2) {
            this.f1810b = true;
            try {
                M(this.f1805C, this.D);
            } finally {
                d();
            }
        }
        V();
        if (this.f1804B) {
            this.f1804B = false;
            U();
        }
        ((HashMap) this.c.f5087d).values().removeAll(Collections.singleton(null));
        return K2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if ((r8 & 1) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r0 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r8 = (androidx.fragment.app.C0064a) r4.f1811d.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r7 < 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r7 != r8.f1900r) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        int i5;
        ArrayList arrayList3 = this.f1811d;
        if (arrayList3 == null) {
            return false;
        }
        if (i3 >= 0 || (i4 & 1) != 0) {
            if (i3 >= 0) {
                i5 = arrayList3.size() - 1;
                while (i5 >= 0) {
                    C0064a c0064a = (C0064a) this.f1811d.get(i5);
                    if (i3 >= 0 && i3 == c0064a.f1900r) {
                        break;
                    }
                    i5--;
                }
                if (i5 < 0) {
                    return false;
                }
            } else {
                i5 = -1;
            }
            if (i5 == this.f1811d.size() - 1) {
                return false;
            }
            for (int size = this.f1811d.size() - 1; size > i5; size--) {
                arrayList.add(this.f1811d.remove(size));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size2 = arrayList3.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.f1811d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void L(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        boolean z3 = !(abstractComponentCallbacksC0077n.f1982r > 0);
        if (!abstractComponentCallbacksC0077n.f1953A || z3) {
            v0.m mVar = this.c;
            synchronized (((ArrayList) mVar.c)) {
                ((ArrayList) mVar.c).remove(abstractComponentCallbacksC0077n);
            }
            abstractComponentCallbacksC0077n.f1976l = false;
            if (E(abstractComponentCallbacksC0077n)) {
                this.f1829x = true;
            }
            abstractComponentCallbacksC0077n.f1977m = true;
            T(abstractComponentCallbacksC0077n);
        }
    }

    public final void M(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            if (!((C0064a) arrayList.get(i3)).f1897o) {
                if (i4 != i3) {
                    x(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0064a) arrayList.get(i4)).f1897o) {
                        i4++;
                    }
                }
                x(arrayList, arrayList2, i3, i4);
                i3 = i4 - 1;
            }
            i3++;
        }
        if (i4 != size) {
            x(arrayList, arrayList2, i4, size);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, androidx.fragment.app.H] */
    public final void N(Parcelable parcelable) {
        v0.r rVar;
        int i3;
        G g;
        if (parcelable == null) {
            return;
        }
        C c = (C) parcelable;
        if (c.f1832b == null) {
            return;
        }
        v0.m mVar = this.c;
        ((HashMap) mVar.f5087d).clear();
        Iterator it = c.f1832b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rVar = this.f1816k;
            if (!hasNext) {
                break;
            }
            F f3 = (F) it.next();
            if (f3 != null) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = (AbstractComponentCallbacksC0077n) this.f1807F.c.get(f3.c);
                if (abstractComponentCallbacksC0077n != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC0077n.toString();
                    }
                    g = new G(rVar, mVar, abstractComponentCallbacksC0077n, f3);
                } else {
                    g = new G(this.f1816k, this.c, this.f1819n.f1996e.getClassLoader(), B(), f3);
                }
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = g.c;
                abstractComponentCallbacksC0077n2.f1983s = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0077n2.toString();
                }
                g.m(this.f1819n.f1996e.getClassLoader());
                mVar.C(g);
                g.f1858e = this.f1818m;
            }
        }
        D d3 = this.f1807F;
        d3.getClass();
        Iterator it2 = new ArrayList(d3.c.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n3 = (AbstractComponentCallbacksC0077n) it2.next();
            if (!(((HashMap) mVar.f5087d).get(abstractComponentCallbacksC0077n3.f1972f) != null)) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC0077n3.toString();
                    Objects.toString(c.f1832b);
                }
                this.f1807F.b(abstractComponentCallbacksC0077n3);
                abstractComponentCallbacksC0077n3.f1983s = this;
                G g3 = new G(rVar, mVar, abstractComponentCallbacksC0077n3);
                g3.f1858e = 1;
                g3.k();
                abstractComponentCallbacksC0077n3.f1977m = true;
                g3.k();
            }
        }
        ArrayList<String> arrayList = c.c;
        ((ArrayList) mVar.c).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                AbstractComponentCallbacksC0077n k2 = mVar.k(str);
                if (k2 == null) {
                    throw new IllegalStateException(X.d.i("No instantiated fragment for (", str, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    k2.toString();
                }
                mVar.a(k2);
            }
        }
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n4 = null;
        if (c.f1833d != null) {
            this.f1811d = new ArrayList(c.f1833d.length);
            int i4 = 0;
            while (true) {
                C0065b[] c0065bArr = c.f1833d;
                if (i4 >= c0065bArr.length) {
                    break;
                }
                C0065b c0065b = c0065bArr[i4];
                c0065b.getClass();
                C0064a c0064a = new C0064a(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int[] iArr = c0065b.f1901b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    ?? obj = new Object();
                    int i7 = i5 + 1;
                    obj.f1859a = iArr[i5];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        c0064a.toString();
                        int i8 = iArr[i7];
                    }
                    String str2 = (String) c0065b.c.get(i6);
                    if (str2 != null) {
                        obj.f1860b = mVar.k(str2);
                    } else {
                        obj.f1860b = abstractComponentCallbacksC0077n4;
                    }
                    obj.g = EnumC0096m.values()[c0065b.f1902d[i6]];
                    obj.h = EnumC0096m.values()[c0065b.f1903e[i6]];
                    int i9 = iArr[i7];
                    obj.c = i9;
                    int i10 = iArr[i5 + 2];
                    obj.f1861d = i10;
                    int i11 = i5 + 4;
                    int i12 = iArr[i5 + 3];
                    obj.f1862e = i12;
                    i5 += 5;
                    int i13 = iArr[i11];
                    obj.f1863f = i13;
                    c0064a.f1887b = i9;
                    c0064a.c = i10;
                    c0064a.f1888d = i12;
                    c0064a.f1889e = i13;
                    c0064a.b(obj);
                    i6++;
                    abstractComponentCallbacksC0077n4 = null;
                }
                c0064a.f1890f = c0065b.f1904f;
                c0064a.h = c0065b.g;
                c0064a.f1900r = c0065b.h;
                c0064a.g = true;
                c0064a.f1891i = c0065b.f1905i;
                c0064a.f1892j = c0065b.f1906j;
                c0064a.f1893k = c0065b.f1907k;
                c0064a.f1894l = c0065b.f1908l;
                c0064a.f1895m = c0065b.f1909m;
                c0064a.f1896n = c0065b.f1910n;
                c0064a.f1897o = c0065b.f1911o;
                c0064a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    c0064a.toString();
                    PrintWriter printWriter = new PrintWriter(new Q());
                    c0064a.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1811d.add(c0064a);
                i4++;
                abstractComponentCallbacksC0077n4 = null;
            }
            i3 = 0;
        } else {
            i3 = 0;
            this.f1811d = null;
        }
        this.f1814i.set(c.f1834e);
        String str3 = c.f1835f;
        if (str3 != null) {
            AbstractComponentCallbacksC0077n k3 = mVar.k(str3);
            this.f1822q = k3;
            p(k3);
        }
        ArrayList arrayList2 = c.g;
        if (arrayList2 != null) {
            while (i3 < arrayList2.size()) {
                Bundle bundle = (Bundle) c.h.get(i3);
                bundle.setClassLoader(this.f1819n.f1996e.getClassLoader());
                this.f1815j.put(arrayList2.get(i3), bundle);
                i3++;
            }
        }
        this.f1828w = new ArrayDeque(c.f1836i);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.C, java.lang.Object] */
    public final C O() {
        int i3;
        ArrayList arrayList;
        C0065b[] c0065bArr;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0070g c0070g = (C0070g) it.next();
            if (c0070g.f1923e) {
                c0070g.f1923e = false;
                c0070g.d();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((C0070g) it2.next()).f();
        }
        w(true);
        this.f1830y = true;
        this.f1807F.h = true;
        v0.m mVar = this.c;
        mVar.getClass();
        HashMap hashMap = (HashMap) mVar.f5087d;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it3 = hashMap.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            G g = (G) it3.next();
            if (g != null) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
                F f3 = new F(abstractComponentCallbacksC0077n);
                if (abstractComponentCallbacksC0077n.f1969b <= -1 || f3.f1850n != null) {
                    f3.f1850n = abstractComponentCallbacksC0077n.c;
                } else {
                    Bundle bundle = new Bundle();
                    abstractComponentCallbacksC0077n.q(bundle);
                    abstractComponentCallbacksC0077n.f1967P.e(bundle);
                    C O2 = abstractComponentCallbacksC0077n.f1985u.O();
                    if (O2 != null) {
                        bundle.putParcelable("android:support:fragments", O2);
                    }
                    g.f1855a.m(false);
                    Bundle bundle2 = bundle.isEmpty() ? null : bundle;
                    if (abstractComponentCallbacksC0077n.f1957F != null) {
                        g.o();
                    }
                    if (abstractComponentCallbacksC0077n.f1970d != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0077n.f1970d);
                    }
                    if (abstractComponentCallbacksC0077n.f1971e != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", abstractComponentCallbacksC0077n.f1971e);
                    }
                    if (!abstractComponentCallbacksC0077n.f1959H) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0077n.f1959H);
                    }
                    f3.f1850n = bundle2;
                    if (abstractComponentCallbacksC0077n.f1973i != null) {
                        if (bundle2 == null) {
                            f3.f1850n = new Bundle();
                        }
                        f3.f1850n.putString("android:target_state", abstractComponentCallbacksC0077n.f1973i);
                        int i4 = abstractComponentCallbacksC0077n.f1974j;
                        if (i4 != 0) {
                            f3.f1850n.putInt("android:target_req_state", i4);
                        }
                    }
                }
                arrayList2.add(f3);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0077n);
                    Objects.toString(f3.f1850n);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        v0.m mVar2 = this.c;
        synchronized (((ArrayList) mVar2.c)) {
            try {
                if (((ArrayList) mVar2.c).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) mVar2.c).size());
                    Iterator it4 = ((ArrayList) mVar2.c).iterator();
                    while (it4.hasNext()) {
                        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = (AbstractComponentCallbacksC0077n) it4.next();
                        arrayList.add(abstractComponentCallbacksC0077n2.f1972f);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            abstractComponentCallbacksC0077n2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f1811d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            c0065bArr = null;
        } else {
            c0065bArr = new C0065b[size];
            for (i3 = 0; i3 < size; i3++) {
                c0065bArr[i3] = new C0065b((C0064a) this.f1811d.get(i3));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(this.f1811d.get(i3));
                }
            }
        }
        ?? obj = new Object();
        obj.f1835f = null;
        ArrayList arrayList4 = new ArrayList();
        obj.g = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        obj.h = arrayList5;
        obj.f1832b = arrayList2;
        obj.c = arrayList;
        obj.f1833d = c0065bArr;
        obj.f1834e = this.f1814i.get();
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n3 = this.f1822q;
        if (abstractComponentCallbacksC0077n3 != null) {
            obj.f1835f = abstractComponentCallbacksC0077n3.f1972f;
        }
        arrayList4.addAll(this.f1815j.keySet());
        arrayList5.addAll(this.f1815j.values());
        obj.f1836i = new ArrayList(this.f1828w);
        return obj;
    }

    public final void P() {
        synchronized (this.f1809a) {
            try {
                if (this.f1809a.size() == 1) {
                    this.f1819n.f1997f.removeCallbacks(this.f1808G);
                    this.f1819n.f1997f.post(this.f1808G);
                    V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n, boolean z3) {
        ViewGroup A3 = A(abstractComponentCallbacksC0077n);
        if (A3 == null || !(A3 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) A3).setDrawDisappearingViewsLast(!z3);
    }

    public final void R(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n, EnumC0096m enumC0096m) {
        if (abstractComponentCallbacksC0077n.equals(this.c.k(abstractComponentCallbacksC0077n.f1972f)) && (abstractComponentCallbacksC0077n.f1984t == null || abstractComponentCallbacksC0077n.f1983s == this)) {
            abstractComponentCallbacksC0077n.f1963L = enumC0096m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0077n + " is not an active fragment of FragmentManager " + this);
    }

    public final void S(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (abstractComponentCallbacksC0077n != null) {
            if (!abstractComponentCallbacksC0077n.equals(this.c.k(abstractComponentCallbacksC0077n.f1972f)) || (abstractComponentCallbacksC0077n.f1984t != null && abstractComponentCallbacksC0077n.f1983s != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0077n + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = this.f1822q;
        this.f1822q = abstractComponentCallbacksC0077n;
        p(abstractComponentCallbacksC0077n2);
        p(this.f1822q);
    }

    public final void T(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        ViewGroup A3 = A(abstractComponentCallbacksC0077n);
        if (A3 != null) {
            C0076m c0076m = abstractComponentCallbacksC0077n.f1960I;
            if ((c0076m == null ? 0 : c0076m.f1947e) + (c0076m == null ? 0 : c0076m.f1946d) + (c0076m == null ? 0 : c0076m.c) + (c0076m == null ? 0 : c0076m.f1945b) > 0) {
                if (A3.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    A3.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0077n);
                }
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = (AbstractComponentCallbacksC0077n) A3.getTag(R.id.visible_removing_fragment_view_tag);
                C0076m c0076m2 = abstractComponentCallbacksC0077n.f1960I;
                boolean z3 = c0076m2 != null ? c0076m2.f1944a : false;
                if (abstractComponentCallbacksC0077n2.f1960I == null) {
                    return;
                }
                abstractComponentCallbacksC0077n2.f().f1944a = z3;
            }
        }
    }

    public final void U() {
        Iterator it = this.c.m().iterator();
        while (it.hasNext()) {
            G g = (G) it.next();
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
            if (abstractComponentCallbacksC0077n.f1958G) {
                if (this.f1810b) {
                    this.f1804B = true;
                } else {
                    abstractComponentCallbacksC0077n.f1958G = false;
                    g.k();
                }
            }
        }
    }

    public final void V() {
        synchronized (this.f1809a) {
            try {
                if (!this.f1809a.isEmpty()) {
                    v vVar = this.h;
                    vVar.f2005a = true;
                    W1.a aVar = vVar.c;
                    if (aVar != null) {
                        aVar.d();
                    }
                    return;
                }
                v vVar2 = this.h;
                ArrayList arrayList = this.f1811d;
                vVar2.f2005a = arrayList != null && arrayList.size() > 0 && G(this.f1821p);
                W1.a aVar2 = vVar2.c;
                if (aVar2 != null) {
                    aVar2.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G a(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        G f3 = f(abstractComponentCallbacksC0077n);
        abstractComponentCallbacksC0077n.f1983s = this;
        v0.m mVar = this.c;
        mVar.C(f3);
        if (!abstractComponentCallbacksC0077n.f1953A) {
            mVar.a(abstractComponentCallbacksC0077n);
            abstractComponentCallbacksC0077n.f1977m = false;
            if (abstractComponentCallbacksC0077n.f1957F == null) {
                abstractComponentCallbacksC0077n.f1961J = false;
            }
            if (E(abstractComponentCallbacksC0077n)) {
                this.f1829x = true;
            }
        }
        return f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0080q c0080q, v0.f fVar, AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        androidx.lifecycle.M b3;
        if (this.f1819n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1819n = c0080q;
        this.f1820o = fVar;
        this.f1821p = abstractComponentCallbacksC0077n;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1817l;
        if (abstractComponentCallbacksC0077n != 0) {
            copyOnWriteArrayList.add(new x(abstractComponentCallbacksC0077n));
        } else if (c0080q instanceof E) {
            copyOnWriteArrayList.add(c0080q);
        }
        if (this.f1821p != null) {
            V();
        }
        if (c0080q instanceof androidx.activity.v) {
            androidx.activity.u h = c0080q.h.h();
            this.g = h;
            h.a(abstractComponentCallbacksC0077n != 0 ? abstractComponentCallbacksC0077n : c0080q, this.h);
        }
        if (abstractComponentCallbacksC0077n != 0) {
            D d3 = abstractComponentCallbacksC0077n.f1983s.f1807F;
            HashMap hashMap = d3.f1838d;
            D d4 = (D) hashMap.get(abstractComponentCallbacksC0077n.f1972f);
            if (d4 == null) {
                d4 = new D(d3.f1840f);
                hashMap.put(abstractComponentCallbacksC0077n.f1972f, d4);
            }
            this.f1807F = d4;
        } else if (c0080q instanceof androidx.lifecycle.P) {
            androidx.lifecycle.O c = c0080q.h.c();
            X1.g.e(c, "store");
            U0.e eVar = D.f1837i;
            X1.g.e(eVar, "factory");
            V.a aVar = V.a.f970b;
            X1.g.e(aVar, "defaultCreationExtras");
            String canonicalName = D.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            X1.g.e(concat, "key");
            LinkedHashMap linkedHashMap = c.f2032a;
            androidx.lifecycle.M m3 = (androidx.lifecycle.M) linkedHashMap.get(concat);
            if (D.class.isInstance(m3)) {
                X1.g.c(m3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(aVar.f971a);
                linkedHashMap2.put(androidx.lifecycle.N.f2031b, concat);
                try {
                    b3 = eVar.b(D.class);
                } catch (AbstractMethodError unused) {
                    b3 = eVar.b(D.class);
                }
                m3 = b3;
                X1.g.e(m3, "viewModel");
                androidx.lifecycle.M m4 = (androidx.lifecycle.M) linkedHashMap.put(concat, m3);
                if (m4 != null) {
                    m4.a();
                }
            }
            this.f1807F = (D) m3;
        } else {
            this.f1807F = new D(false);
        }
        D d5 = this.f1807F;
        d5.h = this.f1830y || this.f1831z;
        this.c.f5088e = d5;
        C0080q c0080q2 = this.f1819n;
        if (c0080q2 instanceof androidx.activity.result.h) {
            androidx.activity.g gVar = c0080q2.h.f1456l;
            String str = "FragmentManager:" + (abstractComponentCallbacksC0077n != 0 ? X.d.j(new StringBuilder(), abstractComponentCallbacksC0077n.f1972f, ":") : "");
            this.f1825t = gVar.d(X.d.h(str, "StartActivityForResult"), new I1.v(3), new C0083u(this, 2));
            this.f1826u = gVar.d(X.d.h(str, "StartIntentSenderForResult"), new I1.v(1), new C0083u(this, 0));
            this.f1827v = gVar.d(X.d.h(str, "RequestPermissions"), new I1.v(2), new C0083u(this, 1));
        }
    }

    public final void c(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        if (abstractComponentCallbacksC0077n.f1953A) {
            abstractComponentCallbacksC0077n.f1953A = false;
            if (abstractComponentCallbacksC0077n.f1976l) {
                return;
            }
            this.c.a(abstractComponentCallbacksC0077n);
            if (Log.isLoggable("FragmentManager", 2)) {
                abstractComponentCallbacksC0077n.toString();
            }
            if (E(abstractComponentCallbacksC0077n)) {
                this.f1829x = true;
            }
        }
    }

    public final void d() {
        this.f1810b = false;
        this.D.clear();
        this.f1805C.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.m().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((G) it.next()).c.f1956E;
            if (viewGroup != null) {
                hashSet.add(C0070g.g(viewGroup, C()));
            }
        }
        return hashSet;
    }

    public final G f(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        String str = abstractComponentCallbacksC0077n.f1972f;
        v0.m mVar = this.c;
        G g = (G) ((HashMap) mVar.f5087d).get(str);
        if (g != null) {
            return g;
        }
        G g3 = new G(this.f1816k, mVar, abstractComponentCallbacksC0077n);
        g3.m(this.f1819n.f1996e.getClassLoader());
        g3.f1858e = this.f1818m;
        return g3;
    }

    public final void g(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0077n);
        }
        if (abstractComponentCallbacksC0077n.f1953A) {
            return;
        }
        abstractComponentCallbacksC0077n.f1953A = true;
        if (abstractComponentCallbacksC0077n.f1976l) {
            if (Log.isLoggable("FragmentManager", 2)) {
                abstractComponentCallbacksC0077n.toString();
            }
            v0.m mVar = this.c;
            synchronized (((ArrayList) mVar.c)) {
                ((ArrayList) mVar.c).remove(abstractComponentCallbacksC0077n);
            }
            abstractComponentCallbacksC0077n.f1976l = false;
            if (E(abstractComponentCallbacksC0077n)) {
                this.f1829x = true;
            }
            T(abstractComponentCallbacksC0077n);
        }
    }

    public final void h() {
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null) {
                abstractComponentCallbacksC0077n.D = true;
                abstractComponentCallbacksC0077n.f1985u.h();
            }
        }
    }

    public final boolean i() {
        if (this.f1818m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null && !abstractComponentCallbacksC0077n.f1990z && abstractComponentCallbacksC0077n.f1985u.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f1818m < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null && F(abstractComponentCallbacksC0077n) && !abstractComponentCallbacksC0077n.f1990z && abstractComponentCallbacksC0077n.f1985u.j()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0077n);
                z3 = true;
            }
        }
        if (this.f1812e != null) {
            for (int i3 = 0; i3 < this.f1812e.size(); i3++) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = (AbstractComponentCallbacksC0077n) this.f1812e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0077n2)) {
                    abstractComponentCallbacksC0077n2.getClass();
                }
            }
        }
        this.f1812e = arrayList;
        return z3;
    }

    public final void k() {
        this.f1803A = true;
        w(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0070g) it.next()).f();
        }
        s(-1);
        this.f1819n = null;
        this.f1820o = null;
        this.f1821p = null;
        if (this.g != null) {
            Iterator it2 = this.h.f2006b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.c) it2.next()).cancel();
            }
            this.g = null;
        }
        androidx.activity.result.d dVar = this.f1825t;
        if (dVar != null) {
            dVar.f1482e.f(dVar.f1481d);
            androidx.activity.result.d dVar2 = this.f1826u;
            dVar2.f1482e.f(dVar2.f1481d);
            androidx.activity.result.d dVar3 = this.f1827v;
            dVar3.f1482e.f(dVar3.f1481d);
        }
    }

    public final void l() {
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null) {
                abstractComponentCallbacksC0077n.D = true;
                abstractComponentCallbacksC0077n.f1985u.l();
            }
        }
    }

    public final void m(boolean z3) {
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null) {
                abstractComponentCallbacksC0077n.f1985u.m(z3);
            }
        }
    }

    public final boolean n() {
        if (this.f1818m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null && !abstractComponentCallbacksC0077n.f1990z && abstractComponentCallbacksC0077n.f1985u.n()) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.f1818m < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null && !abstractComponentCallbacksC0077n.f1990z) {
                abstractComponentCallbacksC0077n.f1985u.o();
            }
        }
    }

    public final void p(AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n) {
        if (abstractComponentCallbacksC0077n != null) {
            if (abstractComponentCallbacksC0077n.equals(this.c.k(abstractComponentCallbacksC0077n.f1972f))) {
                abstractComponentCallbacksC0077n.f1983s.getClass();
                boolean G2 = G(abstractComponentCallbacksC0077n);
                Boolean bool = abstractComponentCallbacksC0077n.f1975k;
                if (bool == null || bool.booleanValue() != G2) {
                    abstractComponentCallbacksC0077n.f1975k = Boolean.valueOf(G2);
                    B b3 = abstractComponentCallbacksC0077n.f1985u;
                    b3.V();
                    b3.p(b3.f1822q);
                }
            }
        }
    }

    public final void q(boolean z3) {
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null) {
                abstractComponentCallbacksC0077n.f1985u.q(z3);
            }
        }
    }

    public final boolean r() {
        boolean z3 = false;
        if (this.f1818m < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n : this.c.u()) {
            if (abstractComponentCallbacksC0077n != null && F(abstractComponentCallbacksC0077n) && !abstractComponentCallbacksC0077n.f1990z && abstractComponentCallbacksC0077n.f1985u.r()) {
                z3 = true;
            }
        }
        return z3;
    }

    public final void s(int i3) {
        try {
            this.f1810b = true;
            for (G g : ((HashMap) this.c.f5087d).values()) {
                if (g != null) {
                    g.f1858e = i3;
                }
            }
            H(i3, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0070g) it.next()).f();
            }
            this.f1810b = false;
            w(true);
        } catch (Throwable th) {
            this.f1810b = false;
            throw th;
        }
    }

    public final void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String h = X.d.h(str, "    ");
        v0.m mVar = this.c;
        mVar.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) mVar.f5087d;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (G g : hashMap.values()) {
                printWriter.print(str);
                if (g != null) {
                    AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = g.c;
                    printWriter.println(abstractComponentCallbacksC0077n);
                    abstractComponentCallbacksC0077n.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0077n.f1987w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0077n.f1988x));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0077n.f1989y);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1969b);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1972f);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0077n.f1982r);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1976l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1977m);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1978n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0077n.f1979o);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1990z);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1953A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1955C);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0077n.f1954B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0077n.f1959H);
                    if (abstractComponentCallbacksC0077n.f1983s != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1983s);
                    }
                    if (abstractComponentCallbacksC0077n.f1984t != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1984t);
                    }
                    if (abstractComponentCallbacksC0077n.f1986v != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1986v);
                    }
                    if (abstractComponentCallbacksC0077n.g != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0077n.g);
                    }
                    if (abstractComponentCallbacksC0077n.c != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0077n.c);
                    }
                    if (abstractComponentCallbacksC0077n.f1970d != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1970d);
                    }
                    if (abstractComponentCallbacksC0077n.f1971e != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1971e);
                    }
                    Object obj = abstractComponentCallbacksC0077n.h;
                    if (obj == null) {
                        B b3 = abstractComponentCallbacksC0077n.f1983s;
                        obj = (b3 == null || (str2 = abstractComponentCallbacksC0077n.f1973i) == null) ? null : b3.c.k(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1974j);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0076m c0076m = abstractComponentCallbacksC0077n.f1960I;
                    printWriter.println(c0076m == null ? false : c0076m.f1944a);
                    C0076m c0076m2 = abstractComponentCallbacksC0077n.f1960I;
                    if (c0076m2 != null && c0076m2.f1945b != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0076m c0076m3 = abstractComponentCallbacksC0077n.f1960I;
                        printWriter.println(c0076m3 == null ? 0 : c0076m3.f1945b);
                    }
                    C0076m c0076m4 = abstractComponentCallbacksC0077n.f1960I;
                    if (c0076m4 != null && c0076m4.c != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0076m c0076m5 = abstractComponentCallbacksC0077n.f1960I;
                        printWriter.println(c0076m5 == null ? 0 : c0076m5.c);
                    }
                    C0076m c0076m6 = abstractComponentCallbacksC0077n.f1960I;
                    if (c0076m6 != null && c0076m6.f1946d != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0076m c0076m7 = abstractComponentCallbacksC0077n.f1960I;
                        printWriter.println(c0076m7 == null ? 0 : c0076m7.f1946d);
                    }
                    C0076m c0076m8 = abstractComponentCallbacksC0077n.f1960I;
                    if (c0076m8 != null && c0076m8.f1947e != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0076m c0076m9 = abstractComponentCallbacksC0077n.f1960I;
                        printWriter.println(c0076m9 == null ? 0 : c0076m9.f1947e);
                    }
                    if (abstractComponentCallbacksC0077n.f1956E != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1956E);
                    }
                    if (abstractComponentCallbacksC0077n.f1957F != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0077n.f1957F);
                    }
                    C0076m c0076m10 = abstractComponentCallbacksC0077n.f1960I;
                    if (c0076m10 != null) {
                        c0076m10.getClass();
                    }
                    if (abstractComponentCallbacksC0077n.h() != null) {
                        new v0.e(abstractComponentCallbacksC0077n, abstractComponentCallbacksC0077n.c()).c(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0077n.f1985u + ":");
                    abstractComponentCallbacksC0077n.f1985u.t(X.d.h(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) mVar.c;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size3; i3++) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = (AbstractComponentCallbacksC0077n) arrayList.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0077n2.toString());
            }
        }
        ArrayList arrayList2 = this.f1812e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n3 = (AbstractComponentCallbacksC0077n) this.f1812e.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0077n3.toString());
            }
        }
        ArrayList arrayList3 = this.f1811d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size; i5++) {
                C0064a c0064a = (C0064a) this.f1811d.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0064a.toString());
                c0064a.e(h, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1814i.get());
        synchronized (this.f1809a) {
            try {
                int size4 = this.f1809a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i6 = 0; i6 < size4; i6++) {
                        Object obj2 = (z) this.f1809a.get(i6);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i6);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1819n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1820o);
        if (this.f1821p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1821p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1818m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1830y);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1831z);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1803A);
        if (this.f1829x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1829x);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.f1821p;
        if (abstractComponentCallbacksC0077n != null) {
            sb.append(abstractComponentCallbacksC0077n.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1821p)));
            sb.append("}");
        } else {
            C0080q c0080q = this.f1819n;
            if (c0080q != null) {
                sb.append(c0080q.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1819n)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(z zVar, boolean z3) {
        if (!z3) {
            if (this.f1819n == null) {
                if (!this.f1803A) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f1830y || this.f1831z) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1809a) {
            try {
                if (this.f1819n == null) {
                    if (!z3) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1809a.add(zVar);
                    P();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(boolean z3) {
        if (this.f1810b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1819n == null) {
            if (!this.f1803A) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1819n.f1997f.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z3 && (this.f1830y || this.f1831z)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1805C == null) {
            this.f1805C = new ArrayList();
            this.D = new ArrayList();
        }
        this.f1810b = false;
    }

    public final boolean w(boolean z3) {
        v(z3);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1805C;
            ArrayList arrayList2 = this.D;
            synchronized (this.f1809a) {
                try {
                    if (this.f1809a.isEmpty()) {
                        break;
                    }
                    int size = this.f1809a.size();
                    boolean z5 = false;
                    for (int i3 = 0; i3 < size; i3++) {
                        z5 |= ((z) this.f1809a.get(i3)).a(arrayList, arrayList2);
                    }
                    this.f1809a.clear();
                    this.f1819n.f1997f.removeCallbacks(this.f1808G);
                    if (!z5) {
                        break;
                    }
                    z4 = true;
                    this.f1810b = true;
                    try {
                        M(this.f1805C, this.D);
                    } finally {
                        d();
                    }
                } finally {
                }
            }
        }
        V();
        if (this.f1804B) {
            this.f1804B = false;
            U();
        }
        ((HashMap) this.c.f5087d).values().removeAll(Collections.singleton(null));
        return z4;
    }

    public final void x(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        ViewGroup viewGroup;
        v0.m mVar;
        v0.m mVar2;
        v0.m mVar3;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z3 = ((C0064a) arrayList3.get(i3)).f1897o;
        ArrayList arrayList5 = this.f1806E;
        if (arrayList5 == null) {
            this.f1806E = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1806E;
        v0.m mVar4 = this.c;
        arrayList6.addAll(mVar4.u());
        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = this.f1822q;
        int i6 = i3;
        boolean z4 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i4) {
                v0.m mVar5 = mVar4;
                this.f1806E.clear();
                if (!z3 && this.f1818m >= 1) {
                    for (int i8 = i3; i8 < i4; i8++) {
                        Iterator it = ((C0064a) arrayList.get(i8)).f1886a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = ((H) it.next()).f1860b;
                            if (abstractComponentCallbacksC0077n2 == null || abstractComponentCallbacksC0077n2.f1983s == null) {
                                mVar = mVar5;
                            } else {
                                mVar = mVar5;
                                mVar.C(f(abstractComponentCallbacksC0077n2));
                            }
                            mVar5 = mVar;
                        }
                    }
                }
                for (int i9 = i3; i9 < i4; i9++) {
                    C0064a c0064a = (C0064a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0064a.c(-1);
                        c0064a.g();
                    } else {
                        c0064a.c(1);
                        c0064a.f();
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
                for (int i10 = i3; i10 < i4; i10++) {
                    C0064a c0064a2 = (C0064a) arrayList.get(i10);
                    if (booleanValue) {
                        for (int size = c0064a2.f1886a.size() - 1; size >= 0; size--) {
                            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n3 = ((H) c0064a2.f1886a.get(size)).f1860b;
                            if (abstractComponentCallbacksC0077n3 != null) {
                                f(abstractComponentCallbacksC0077n3).k();
                            }
                        }
                    } else {
                        Iterator it2 = c0064a2.f1886a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n4 = ((H) it2.next()).f1860b;
                            if (abstractComponentCallbacksC0077n4 != null) {
                                f(abstractComponentCallbacksC0077n4).k();
                            }
                        }
                    }
                }
                H(this.f1818m, true);
                HashSet hashSet = new HashSet();
                for (int i11 = i3; i11 < i4; i11++) {
                    Iterator it3 = ((C0064a) arrayList.get(i11)).f1886a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n5 = ((H) it3.next()).f1860b;
                        if (abstractComponentCallbacksC0077n5 != null && (viewGroup = abstractComponentCallbacksC0077n5.f1956E) != null) {
                            hashSet.add(C0070g.g(viewGroup, C()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0070g c0070g = (C0070g) it4.next();
                    c0070g.f1922d = booleanValue;
                    c0070g.h();
                    c0070g.d();
                }
                for (int i12 = i3; i12 < i4; i12++) {
                    C0064a c0064a3 = (C0064a) arrayList.get(i12);
                    if (((Boolean) arrayList2.get(i12)).booleanValue() && c0064a3.f1900r >= 0) {
                        c0064a3.f1900r = -1;
                    }
                    c0064a3.getClass();
                }
                return;
            }
            C0064a c0064a4 = (C0064a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                mVar2 = mVar4;
                int i13 = 1;
                ArrayList arrayList7 = this.f1806E;
                ArrayList arrayList8 = c0064a4.f1886a;
                int size2 = arrayList8.size() - 1;
                while (size2 >= 0) {
                    H h = (H) arrayList8.get(size2);
                    int i14 = h.f1859a;
                    if (i14 != i13) {
                        if (i14 != 3) {
                            switch (i14) {
                                case 8:
                                    abstractComponentCallbacksC0077n = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0077n = h.f1860b;
                                    break;
                                case 10:
                                    h.h = h.g;
                                    break;
                            }
                            size2--;
                            i13 = 1;
                        }
                        arrayList7.add(h.f1860b);
                        size2--;
                        i13 = 1;
                    }
                    arrayList7.remove(h.f1860b);
                    size2--;
                    i13 = 1;
                }
            } else {
                ArrayList arrayList9 = this.f1806E;
                int i15 = 0;
                while (true) {
                    ArrayList arrayList10 = c0064a4.f1886a;
                    if (i15 < arrayList10.size()) {
                        H h3 = (H) arrayList10.get(i15);
                        int i16 = h3.f1859a;
                        if (i16 != i7) {
                            if (i16 != 2) {
                                if (i16 == 3 || i16 == 6) {
                                    arrayList9.remove(h3.f1860b);
                                    AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n6 = h3.f1860b;
                                    if (abstractComponentCallbacksC0077n6 == abstractComponentCallbacksC0077n) {
                                        arrayList10.add(i15, new H(9, abstractComponentCallbacksC0077n6));
                                        i15++;
                                        mVar3 = mVar4;
                                        i5 = 1;
                                        abstractComponentCallbacksC0077n = null;
                                    }
                                } else if (i16 == 7) {
                                    mVar3 = mVar4;
                                    i5 = 1;
                                } else if (i16 == 8) {
                                    arrayList10.add(i15, new H(9, abstractComponentCallbacksC0077n));
                                    i15++;
                                    abstractComponentCallbacksC0077n = h3.f1860b;
                                }
                                mVar3 = mVar4;
                                i5 = 1;
                            } else {
                                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n7 = h3.f1860b;
                                int i17 = abstractComponentCallbacksC0077n7.f1988x;
                                int size3 = arrayList9.size() - 1;
                                boolean z5 = false;
                                while (size3 >= 0) {
                                    v0.m mVar6 = mVar4;
                                    AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n8 = (AbstractComponentCallbacksC0077n) arrayList9.get(size3);
                                    if (abstractComponentCallbacksC0077n8.f1988x == i17) {
                                        if (abstractComponentCallbacksC0077n8 == abstractComponentCallbacksC0077n7) {
                                            z5 = true;
                                        } else {
                                            if (abstractComponentCallbacksC0077n8 == abstractComponentCallbacksC0077n) {
                                                arrayList10.add(i15, new H(9, abstractComponentCallbacksC0077n8));
                                                i15++;
                                                abstractComponentCallbacksC0077n = null;
                                            }
                                            H h4 = new H(3, abstractComponentCallbacksC0077n8);
                                            h4.c = h3.c;
                                            h4.f1862e = h3.f1862e;
                                            h4.f1861d = h3.f1861d;
                                            h4.f1863f = h3.f1863f;
                                            arrayList10.add(i15, h4);
                                            arrayList9.remove(abstractComponentCallbacksC0077n8);
                                            i15++;
                                            abstractComponentCallbacksC0077n = abstractComponentCallbacksC0077n;
                                        }
                                    }
                                    size3--;
                                    mVar4 = mVar6;
                                }
                                mVar3 = mVar4;
                                i5 = 1;
                                if (z5) {
                                    arrayList10.remove(i15);
                                    i15--;
                                } else {
                                    h3.f1859a = 1;
                                    arrayList9.add(abstractComponentCallbacksC0077n7);
                                }
                            }
                            i15 += i5;
                            i7 = i5;
                            mVar4 = mVar3;
                        } else {
                            mVar3 = mVar4;
                            i5 = i7;
                        }
                        arrayList9.add(h3.f1860b);
                        i15 += i5;
                        i7 = i5;
                        mVar4 = mVar3;
                    } else {
                        mVar2 = mVar4;
                    }
                }
            }
            z4 = z4 || c0064a4.g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            mVar4 = mVar2;
        }
    }

    public final void y(ArrayList arrayList, ArrayList arrayList2) {
    }

    public final AbstractComponentCallbacksC0077n z(int i3) {
        v0.m mVar = this.c;
        ArrayList arrayList = (ArrayList) mVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = (AbstractComponentCallbacksC0077n) arrayList.get(size);
            if (abstractComponentCallbacksC0077n != null && abstractComponentCallbacksC0077n.f1987w == i3) {
                return abstractComponentCallbacksC0077n;
            }
        }
        for (G g : ((HashMap) mVar.f5087d).values()) {
            if (g != null) {
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n2 = g.c;
                if (abstractComponentCallbacksC0077n2.f1987w == i3) {
                    return abstractComponentCallbacksC0077n2;
                }
            }
        }
        return null;
    }
}
