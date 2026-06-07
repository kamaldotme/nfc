package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064a implements z {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1886a;

    /* renamed from: b, reason: collision with root package name */
    public int f1887b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f1888d;

    /* renamed from: e, reason: collision with root package name */
    public int f1889e;

    /* renamed from: f, reason: collision with root package name */
    public int f1890f;
    public boolean g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f1891i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1892j;

    /* renamed from: k, reason: collision with root package name */
    public int f1893k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1894l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1895m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1896n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1897o;

    /* renamed from: p, reason: collision with root package name */
    public final B f1898p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1899q;

    /* renamed from: r, reason: collision with root package name */
    public int f1900r;

    public C0064a(B b3) {
        b3.B();
        C0080q c0080q = b3.f1819n;
        if (c0080q != null) {
            c0080q.f1996e.getClassLoader();
        }
        this.f1886a = new ArrayList();
        this.f1897o = false;
        this.f1900r = -1;
        this.f1898p = b3;
    }

    @Override // androidx.fragment.app.z
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        B b3 = this.f1898p;
        if (b3.f1811d == null) {
            b3.f1811d = new ArrayList();
        }
        b3.f1811d.add(this);
        return true;
    }

    public final void b(H h) {
        this.f1886a.add(h);
        h.c = this.f1887b;
        h.f1861d = this.c;
        h.f1862e = this.f1888d;
        h.f1863f = this.f1889e;
    }

    public final void c(int i3) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            ArrayList arrayList = this.f1886a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                H h = (H) arrayList.get(i4);
                AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = h.f1860b;
                if (abstractComponentCallbacksC0077n != null) {
                    abstractComponentCallbacksC0077n.f1982r += i3;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(h.f1860b);
                        int i5 = h.f1860b.f1982r;
                    }
                }
            }
        }
    }

    public final int d(boolean z3) {
        if (this.f1899q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new Q());
            e("  ", printWriter, true);
            printWriter.close();
        }
        this.f1899q = true;
        boolean z4 = this.g;
        B b3 = this.f1898p;
        if (z4) {
            this.f1900r = b3.f1814i.getAndIncrement();
        } else {
            this.f1900r = -1;
        }
        b3.u(this, z3);
        return this.f1900r;
    }

    public final void e(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1900r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1899q);
            if (this.f1890f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1890f));
            }
            if (this.f1887b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1887b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.f1888d != 0 || this.f1889e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1888d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1889e));
            }
            if (this.f1891i != 0 || this.f1892j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1891i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1892j);
            }
            if (this.f1893k != 0 || this.f1894l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1893k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1894l);
            }
        }
        ArrayList arrayList = this.f1886a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            H h = (H) arrayList.get(i3);
            switch (h.f1859a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + h.f1859a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(h.f1860b);
            if (z3) {
                if (h.c != 0 || h.f1861d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(h.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(h.f1861d));
                }
                if (h.f1862e != 0 || h.f1863f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(h.f1862e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(h.f1863f));
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f1886a;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            H h = (H) arrayList.get(i3);
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = h.f1860b;
            if (abstractComponentCallbacksC0077n != null) {
                if (abstractComponentCallbacksC0077n.f1960I != null) {
                    abstractComponentCallbacksC0077n.f().f1944a = false;
                }
                int i4 = this.f1890f;
                if (abstractComponentCallbacksC0077n.f1960I != null || i4 != 0) {
                    abstractComponentCallbacksC0077n.f();
                    abstractComponentCallbacksC0077n.f1960I.f1948f = i4;
                }
                abstractComponentCallbacksC0077n.f();
                abstractComponentCallbacksC0077n.f1960I.getClass();
            }
            int i5 = h.f1859a;
            B b3 = this.f1898p;
            switch (i5) {
                case 1:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.Q(abstractComponentCallbacksC0077n, false);
                    b3.a(abstractComponentCallbacksC0077n);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + h.f1859a);
                case 3:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.L(abstractComponentCallbacksC0077n);
                    break;
                case 4:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.D(abstractComponentCallbacksC0077n);
                    break;
                case 5:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.Q(abstractComponentCallbacksC0077n, false);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(abstractComponentCallbacksC0077n);
                    }
                    if (abstractComponentCallbacksC0077n.f1990z) {
                        abstractComponentCallbacksC0077n.f1990z = false;
                        abstractComponentCallbacksC0077n.f1961J = !abstractComponentCallbacksC0077n.f1961J;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.g(abstractComponentCallbacksC0077n);
                    break;
                case 7:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.Q(abstractComponentCallbacksC0077n, false);
                    b3.c(abstractComponentCallbacksC0077n);
                    break;
                case 8:
                    b3.S(abstractComponentCallbacksC0077n);
                    break;
                case 9:
                    b3.S(null);
                    break;
                case 10:
                    b3.R(abstractComponentCallbacksC0077n, h.h);
                    break;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f1886a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            H h = (H) arrayList.get(size);
            AbstractComponentCallbacksC0077n abstractComponentCallbacksC0077n = h.f1860b;
            if (abstractComponentCallbacksC0077n != null) {
                if (abstractComponentCallbacksC0077n.f1960I != null) {
                    abstractComponentCallbacksC0077n.f().f1944a = true;
                }
                int i3 = this.f1890f;
                int i4 = i3 != 4097 ? i3 != 4099 ? i3 != 8194 ? 0 : 4097 : 4099 : 8194;
                if (abstractComponentCallbacksC0077n.f1960I != null || i4 != 0) {
                    abstractComponentCallbacksC0077n.f();
                    abstractComponentCallbacksC0077n.f1960I.f1948f = i4;
                }
                abstractComponentCallbacksC0077n.f();
                abstractComponentCallbacksC0077n.f1960I.getClass();
            }
            int i5 = h.f1859a;
            B b3 = this.f1898p;
            switch (i5) {
                case 1:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.Q(abstractComponentCallbacksC0077n, true);
                    b3.L(abstractComponentCallbacksC0077n);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + h.f1859a);
                case 3:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.a(abstractComponentCallbacksC0077n);
                    break;
                case 4:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.getClass();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(abstractComponentCallbacksC0077n);
                    }
                    if (abstractComponentCallbacksC0077n.f1990z) {
                        abstractComponentCallbacksC0077n.f1990z = false;
                        abstractComponentCallbacksC0077n.f1961J = !abstractComponentCallbacksC0077n.f1961J;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.Q(abstractComponentCallbacksC0077n, true);
                    b3.D(abstractComponentCallbacksC0077n);
                    break;
                case 6:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.c(abstractComponentCallbacksC0077n);
                    break;
                case 7:
                    abstractComponentCallbacksC0077n.y(h.c, h.f1861d, h.f1862e, h.f1863f);
                    b3.Q(abstractComponentCallbacksC0077n, true);
                    b3.g(abstractComponentCallbacksC0077n);
                    break;
                case 8:
                    b3.S(null);
                    break;
                case 9:
                    b3.S(abstractComponentCallbacksC0077n);
                    break;
                case 10:
                    b3.R(abstractComponentCallbacksC0077n, h.g);
                    break;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1900r >= 0) {
            sb.append(" #");
            sb.append(this.f1900r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
