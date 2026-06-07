package androidx.recyclerview.widget;

import C0.b;
import X.d;
import Z.AbstractC0055w;
import Z.C0050q;
import Z.C0051s;
import Z.C0052t;
import Z.C0053u;
import Z.G;
import Z.H;
import Z.I;
import Z.N;
import Z.S;
import Z.T;
import Z.W;
import Z.r;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import m0.z;

/* loaded from: classes.dex */
public class LinearLayoutManager extends H implements S {

    /* renamed from: A, reason: collision with root package name */
    public final C0050q f2078A;

    /* renamed from: B, reason: collision with root package name */
    public final r f2079B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2080C;
    public final int[] D;

    /* renamed from: p, reason: collision with root package name */
    public int f2081p;

    /* renamed from: q, reason: collision with root package name */
    public C0051s f2082q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0055w f2083r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2084s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2085t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2086u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2087v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2088w;

    /* renamed from: x, reason: collision with root package name */
    public int f2089x;

    /* renamed from: y, reason: collision with root package name */
    public int f2090y;

    /* renamed from: z, reason: collision with root package name */
    public C0052t f2091z;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, Z.r] */
    public LinearLayoutManager(int i3) {
        this.f2081p = 1;
        this.f2085t = false;
        this.f2086u = false;
        this.f2087v = false;
        this.f2088w = true;
        this.f2089x = -1;
        this.f2090y = Integer.MIN_VALUE;
        this.f2091z = null;
        this.f2078A = new C0050q();
        this.f2079B = new Object();
        this.f2080C = 2;
        this.D = new int[2];
        W0(i3);
        c(null);
        if (this.f2085t) {
            this.f2085t = false;
            i0();
        }
    }

    public final int A0(T t3) {
        if (v() == 0) {
            return 0;
        }
        D0();
        AbstractC0055w abstractC0055w = this.f2083r;
        boolean z3 = !this.f2088w;
        return z.o(t3, abstractC0055w, G0(z3), F0(z3), this, this.f2088w, this.f2086u);
    }

    public final int B0(T t3) {
        if (v() == 0) {
            return 0;
        }
        D0();
        AbstractC0055w abstractC0055w = this.f2083r;
        boolean z3 = !this.f2088w;
        return z.p(t3, abstractC0055w, G0(z3), F0(z3), this, this.f2088w);
    }

    public final int C0(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 17 ? i3 != 33 ? i3 != 66 ? (i3 == 130 && this.f2081p == 1) ? 1 : Integer.MIN_VALUE : this.f2081p == 0 ? 1 : Integer.MIN_VALUE : this.f2081p == 1 ? -1 : Integer.MIN_VALUE : this.f2081p == 0 ? -1 : Integer.MIN_VALUE : (this.f2081p != 1 && P0()) ? -1 : 1 : (this.f2081p != 1 && P0()) ? 1 : -1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z.s] */
    public final void D0() {
        if (this.f2082q == null) {
            ?? obj = new Object();
            obj.f1342a = true;
            obj.h = 0;
            obj.f1347i = 0;
            obj.f1349k = null;
            this.f2082q = obj;
        }
    }

    public final int E0(N n3, C0051s c0051s, T t3, boolean z3) {
        int i3;
        int i4 = c0051s.c;
        int i5 = c0051s.g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                c0051s.g = i5 + i4;
            }
            S0(n3, c0051s);
        }
        int i6 = c0051s.c + c0051s.h;
        while (true) {
            if ((!c0051s.f1350l && i6 <= 0) || (i3 = c0051s.f1344d) < 0 || i3 >= t3.b()) {
                break;
            }
            r rVar = this.f2079B;
            rVar.f1339a = 0;
            rVar.f1340b = false;
            rVar.c = false;
            rVar.f1341d = false;
            Q0(n3, t3, c0051s, rVar);
            if (!rVar.f1340b) {
                int i7 = c0051s.f1343b;
                int i8 = rVar.f1339a;
                c0051s.f1343b = (c0051s.f1346f * i8) + i7;
                if (!rVar.c || c0051s.f1349k != null || !t3.g) {
                    c0051s.c -= i8;
                    i6 -= i8;
                }
                int i9 = c0051s.g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + i8;
                    c0051s.g = i10;
                    int i11 = c0051s.c;
                    if (i11 < 0) {
                        c0051s.g = i10 + i11;
                    }
                    S0(n3, c0051s);
                }
                if (z3 && rVar.f1341d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - c0051s.c;
    }

    public final View F0(boolean z3) {
        return this.f2086u ? J0(0, v(), z3) : J0(v() - 1, -1, z3);
    }

    public final View G0(boolean z3) {
        return this.f2086u ? J0(v() - 1, -1, z3) : J0(0, v(), z3);
    }

    public final int H0() {
        View J02 = J0(v() - 1, -1, false);
        if (J02 == null) {
            return -1;
        }
        return H.F(J02);
    }

    public final View I0(int i3, int i4) {
        int i5;
        int i6;
        D0();
        if (i4 <= i3 && i4 >= i3) {
            return u(i3);
        }
        if (this.f2083r.e(u(i3)) < this.f2083r.k()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.f2081p == 0 ? this.c.e(i3, i4, i5, i6) : this.f1160d.e(i3, i4, i5, i6);
    }

    @Override // Z.H
    public final boolean J() {
        return true;
    }

    public final View J0(int i3, int i4, boolean z3) {
        D0();
        int i5 = z3 ? 24579 : 320;
        return this.f2081p == 0 ? this.c.e(i3, i4, i5, 320) : this.f1160d.e(i3, i4, i5, 320);
    }

    public View K0(N n3, T t3, int i3, int i4, int i5) {
        D0();
        int k2 = this.f2083r.k();
        int g = this.f2083r.g();
        int i6 = i4 > i3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i3 != i4) {
            View u3 = u(i3);
            int F2 = H.F(u3);
            if (F2 >= 0 && F2 < i5) {
                if (((I) u3.getLayoutParams()).f1170a.j()) {
                    if (view2 == null) {
                        view2 = u3;
                    }
                } else {
                    if (this.f2083r.e(u3) < g && this.f2083r.b(u3) >= k2) {
                        return u3;
                    }
                    if (view == null) {
                        view = u3;
                    }
                }
            }
            i3 += i6;
        }
        return view != null ? view : view2;
    }

    public final int L0(int i3, N n3, T t3, boolean z3) {
        int g;
        int g3 = this.f2083r.g() - i3;
        if (g3 <= 0) {
            return 0;
        }
        int i4 = -V0(-g3, n3, t3);
        int i5 = i3 + i4;
        if (!z3 || (g = this.f2083r.g() - i5) <= 0) {
            return i4;
        }
        this.f2083r.p(g);
        return g + i4;
    }

    public final int M0(int i3, N n3, T t3, boolean z3) {
        int k2;
        int k3 = i3 - this.f2083r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i4 = -V0(k3, n3, t3);
        int i5 = i3 + i4;
        if (!z3 || (k2 = i5 - this.f2083r.k()) <= 0) {
            return i4;
        }
        this.f2083r.p(-k2);
        return i4 - k2;
    }

    public final View N0() {
        return u(this.f2086u ? 0 : v() - 1);
    }

    @Override // Z.H
    public final void O(RecyclerView recyclerView) {
    }

    public final View O0() {
        return u(this.f2086u ? v() - 1 : 0);
    }

    @Override // Z.H
    public View P(View view, int i3, N n3, T t3) {
        int C02;
        U0();
        if (v() == 0 || (C02 = C0(i3)) == Integer.MIN_VALUE) {
            return null;
        }
        D0();
        Y0(C02, (int) (this.f2083r.l() * 0.33333334f), false, t3);
        C0051s c0051s = this.f2082q;
        c0051s.g = Integer.MIN_VALUE;
        c0051s.f1342a = false;
        E0(n3, c0051s, t3, true);
        View I02 = C02 == -1 ? this.f2086u ? I0(v() - 1, -1) : I0(0, v()) : this.f2086u ? I0(0, v()) : I0(v() - 1, -1);
        View O02 = C02 == -1 ? O0() : N0();
        if (!O02.hasFocusable()) {
            return I02;
        }
        if (I02 == null) {
            return null;
        }
        return O02;
    }

    public final boolean P0() {
        return A() == 1;
    }

    @Override // Z.H
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (v() > 0) {
            View J02 = J0(0, v(), false);
            accessibilityEvent.setFromIndex(J02 == null ? -1 : H.F(J02));
            accessibilityEvent.setToIndex(H0());
        }
    }

    public void Q0(N n3, T t3, C0051s c0051s, r rVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        View b3 = c0051s.b(n3);
        if (b3 == null) {
            rVar.f1340b = true;
            return;
        }
        I i7 = (I) b3.getLayoutParams();
        if (c0051s.f1349k == null) {
            if (this.f2086u == (c0051s.f1346f == -1)) {
                b(b3, -1, false);
            } else {
                b(b3, 0, false);
            }
        } else {
            if (this.f2086u == (c0051s.f1346f == -1)) {
                b(b3, -1, true);
            } else {
                b(b3, 0, true);
            }
        }
        I i8 = (I) b3.getLayoutParams();
        Rect J2 = this.f1159b.J(b3);
        int i9 = J2.left + J2.right;
        int i10 = J2.top + J2.bottom;
        int w3 = H.w(this.f1168n, this.f1166l, D() + C() + ((ViewGroup.MarginLayoutParams) i8).leftMargin + ((ViewGroup.MarginLayoutParams) i8).rightMargin + i9, ((ViewGroup.MarginLayoutParams) i8).width, d());
        int w4 = H.w(this.f1169o, this.f1167m, B() + E() + ((ViewGroup.MarginLayoutParams) i8).topMargin + ((ViewGroup.MarginLayoutParams) i8).bottomMargin + i10, ((ViewGroup.MarginLayoutParams) i8).height, e());
        if (r0(b3, w3, w4, i8)) {
            b3.measure(w3, w4);
        }
        rVar.f1339a = this.f2083r.c(b3);
        if (this.f2081p == 1) {
            if (P0()) {
                i6 = this.f1168n - D();
                i3 = i6 - this.f2083r.d(b3);
            } else {
                i3 = C();
                i6 = this.f2083r.d(b3) + i3;
            }
            if (c0051s.f1346f == -1) {
                i4 = c0051s.f1343b;
                i5 = i4 - rVar.f1339a;
            } else {
                i5 = c0051s.f1343b;
                i4 = rVar.f1339a + i5;
            }
        } else {
            int E2 = E();
            int d3 = this.f2083r.d(b3) + E2;
            if (c0051s.f1346f == -1) {
                int i11 = c0051s.f1343b;
                int i12 = i11 - rVar.f1339a;
                i6 = i11;
                i4 = d3;
                i3 = i12;
                i5 = E2;
            } else {
                int i13 = c0051s.f1343b;
                int i14 = rVar.f1339a + i13;
                i3 = i13;
                i4 = d3;
                i5 = E2;
                i6 = i14;
            }
        }
        H.L(b3, i3, i5, i6, i4);
        if (i7.f1170a.j() || i7.f1170a.m()) {
            rVar.c = true;
        }
        rVar.f1341d = b3.hasFocusable();
    }

    public void R0(N n3, T t3, C0050q c0050q, int i3) {
    }

    public final void S0(N n3, C0051s c0051s) {
        if (!c0051s.f1342a || c0051s.f1350l) {
            return;
        }
        int i3 = c0051s.g;
        int i4 = c0051s.f1347i;
        if (c0051s.f1346f == -1) {
            int v3 = v();
            if (i3 < 0) {
                return;
            }
            int f3 = (this.f2083r.f() - i3) + i4;
            if (this.f2086u) {
                for (int i5 = 0; i5 < v3; i5++) {
                    View u3 = u(i5);
                    if (this.f2083r.e(u3) < f3 || this.f2083r.o(u3) < f3) {
                        T0(n3, 0, i5);
                        return;
                    }
                }
                return;
            }
            int i6 = v3 - 1;
            for (int i7 = i6; i7 >= 0; i7--) {
                View u4 = u(i7);
                if (this.f2083r.e(u4) < f3 || this.f2083r.o(u4) < f3) {
                    T0(n3, i6, i7);
                    return;
                }
            }
            return;
        }
        if (i3 < 0) {
            return;
        }
        int i8 = i3 - i4;
        int v4 = v();
        if (!this.f2086u) {
            for (int i9 = 0; i9 < v4; i9++) {
                View u5 = u(i9);
                if (this.f2083r.b(u5) > i8 || this.f2083r.n(u5) > i8) {
                    T0(n3, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = v4 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View u6 = u(i11);
            if (this.f2083r.b(u6) > i8 || this.f2083r.n(u6) > i8) {
                T0(n3, i10, i11);
                return;
            }
        }
    }

    public final void T0(N n3, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        if (i4 <= i3) {
            while (i3 > i4) {
                View u3 = u(i3);
                g0(i3);
                n3.f(u3);
                i3--;
            }
            return;
        }
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            View u4 = u(i5);
            g0(i5);
            n3.f(u4);
        }
    }

    public final void U0() {
        if (this.f2081p == 1 || !P0()) {
            this.f2086u = this.f2085t;
        } else {
            this.f2086u = !this.f2085t;
        }
    }

    public final int V0(int i3, N n3, T t3) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        D0();
        this.f2082q.f1342a = true;
        int i4 = i3 > 0 ? 1 : -1;
        int abs = Math.abs(i3);
        Y0(i4, abs, true, t3);
        C0051s c0051s = this.f2082q;
        int E02 = E0(n3, c0051s, t3, false) + c0051s.g;
        if (E02 < 0) {
            return 0;
        }
        if (abs > E02) {
            i3 = i4 * E02;
        }
        this.f2083r.p(-i3);
        this.f2082q.f1348j = i3;
        return i3;
    }

    public final void W0(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException(d.f("invalid orientation:", i3));
        }
        c(null);
        if (i3 != this.f2081p || this.f2083r == null) {
            AbstractC0055w a3 = AbstractC0055w.a(this, i3);
            this.f2083r = a3;
            this.f2078A.f1335a = a3;
            this.f2081p = i3;
            i0();
        }
    }

    public void X0(boolean z3) {
        c(null);
        if (this.f2087v == z3) {
            return;
        }
        this.f2087v = z3;
        i0();
    }

    @Override // Z.H
    public void Y(N n3, T t3) {
        View focusedChild;
        View focusedChild2;
        int i3;
        int i4;
        int i5;
        List list;
        int i6;
        int i7;
        int L02;
        int i8;
        View q3;
        int e3;
        int i9;
        int i10;
        int i11 = -1;
        if (!(this.f2091z == null && this.f2089x == -1) && t3.b() == 0) {
            d0(n3);
            return;
        }
        C0052t c0052t = this.f2091z;
        if (c0052t != null && (i10 = c0052t.f1351b) >= 0) {
            this.f2089x = i10;
        }
        D0();
        this.f2082q.f1342a = false;
        U0();
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1158a.B(focusedChild)) {
            focusedChild = null;
        }
        C0050q c0050q = this.f2078A;
        if (!c0050q.f1338e || this.f2089x != -1 || this.f2091z != null) {
            c0050q.d();
            c0050q.f1337d = this.f2086u ^ this.f2087v;
            if (!t3.g && (i3 = this.f2089x) != -1) {
                if (i3 < 0 || i3 >= t3.b()) {
                    this.f2089x = -1;
                    this.f2090y = Integer.MIN_VALUE;
                } else {
                    int i12 = this.f2089x;
                    c0050q.f1336b = i12;
                    C0052t c0052t2 = this.f2091z;
                    if (c0052t2 != null && c0052t2.f1351b >= 0) {
                        boolean z3 = c0052t2.f1352d;
                        c0050q.f1337d = z3;
                        if (z3) {
                            c0050q.c = this.f2083r.g() - this.f2091z.c;
                        } else {
                            c0050q.c = this.f2083r.k() + this.f2091z.c;
                        }
                    } else if (this.f2090y == Integer.MIN_VALUE) {
                        View q4 = q(i12);
                        if (q4 == null) {
                            if (v() > 0) {
                                c0050q.f1337d = (this.f2089x < H.F(u(0))) == this.f2086u;
                            }
                            c0050q.a();
                        } else if (this.f2083r.c(q4) > this.f2083r.l()) {
                            c0050q.a();
                        } else if (this.f2083r.e(q4) - this.f2083r.k() < 0) {
                            c0050q.c = this.f2083r.k();
                            c0050q.f1337d = false;
                        } else if (this.f2083r.g() - this.f2083r.b(q4) < 0) {
                            c0050q.c = this.f2083r.g();
                            c0050q.f1337d = true;
                        } else {
                            c0050q.c = c0050q.f1337d ? this.f2083r.m() + this.f2083r.b(q4) : this.f2083r.e(q4);
                        }
                    } else {
                        boolean z4 = this.f2086u;
                        c0050q.f1337d = z4;
                        if (z4) {
                            c0050q.c = this.f2083r.g() - this.f2090y;
                        } else {
                            c0050q.c = this.f2083r.k() + this.f2090y;
                        }
                    }
                    c0050q.f1338e = true;
                }
            }
            if (v() != 0) {
                RecyclerView recyclerView2 = this.f1159b;
                if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f1158a.B(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    I i13 = (I) focusedChild2.getLayoutParams();
                    if (!i13.f1170a.j() && i13.f1170a.c() >= 0 && i13.f1170a.c() < t3.b()) {
                        c0050q.c(focusedChild2, H.F(focusedChild2));
                        c0050q.f1338e = true;
                    }
                }
                if (this.f2084s == this.f2087v) {
                    View K0 = c0050q.f1337d ? this.f2086u ? K0(n3, t3, 0, v(), t3.b()) : K0(n3, t3, v() - 1, -1, t3.b()) : this.f2086u ? K0(n3, t3, v() - 1, -1, t3.b()) : K0(n3, t3, 0, v(), t3.b());
                    if (K0 != null) {
                        c0050q.b(K0, H.F(K0));
                        if (!t3.g && w0() && (this.f2083r.e(K0) >= this.f2083r.g() || this.f2083r.b(K0) < this.f2083r.k())) {
                            c0050q.c = c0050q.f1337d ? this.f2083r.g() : this.f2083r.k();
                        }
                        c0050q.f1338e = true;
                    }
                }
            }
            c0050q.a();
            c0050q.f1336b = this.f2087v ? t3.b() - 1 : 0;
            c0050q.f1338e = true;
        } else if (focusedChild != null && (this.f2083r.e(focusedChild) >= this.f2083r.g() || this.f2083r.b(focusedChild) <= this.f2083r.k())) {
            c0050q.c(focusedChild, H.F(focusedChild));
        }
        C0051s c0051s = this.f2082q;
        c0051s.f1346f = c0051s.f1348j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        x0(t3, iArr);
        int k2 = this.f2083r.k() + Math.max(0, iArr[0]);
        int h = this.f2083r.h() + Math.max(0, iArr[1]);
        if (t3.g && (i8 = this.f2089x) != -1 && this.f2090y != Integer.MIN_VALUE && (q3 = q(i8)) != null) {
            if (this.f2086u) {
                i9 = this.f2083r.g() - this.f2083r.b(q3);
                e3 = this.f2090y;
            } else {
                e3 = this.f2083r.e(q3) - this.f2083r.k();
                i9 = this.f2090y;
            }
            int i14 = i9 - e3;
            if (i14 > 0) {
                k2 += i14;
            } else {
                h -= i14;
            }
        }
        if (!c0050q.f1337d ? !this.f2086u : this.f2086u) {
            i11 = 1;
        }
        R0(n3, t3, c0050q, i11);
        p(n3);
        this.f2082q.f1350l = this.f2083r.i() == 0 && this.f2083r.f() == 0;
        this.f2082q.getClass();
        this.f2082q.f1347i = 0;
        if (c0050q.f1337d) {
            a1(c0050q.f1336b, c0050q.c);
            C0051s c0051s2 = this.f2082q;
            c0051s2.h = k2;
            E0(n3, c0051s2, t3, false);
            C0051s c0051s3 = this.f2082q;
            i5 = c0051s3.f1343b;
            int i15 = c0051s3.f1344d;
            int i16 = c0051s3.c;
            if (i16 > 0) {
                h += i16;
            }
            Z0(c0050q.f1336b, c0050q.c);
            C0051s c0051s4 = this.f2082q;
            c0051s4.h = h;
            c0051s4.f1344d += c0051s4.f1345e;
            E0(n3, c0051s4, t3, false);
            C0051s c0051s5 = this.f2082q;
            i4 = c0051s5.f1343b;
            int i17 = c0051s5.c;
            if (i17 > 0) {
                a1(i15, i5);
                C0051s c0051s6 = this.f2082q;
                c0051s6.h = i17;
                E0(n3, c0051s6, t3, false);
                i5 = this.f2082q.f1343b;
            }
        } else {
            Z0(c0050q.f1336b, c0050q.c);
            C0051s c0051s7 = this.f2082q;
            c0051s7.h = h;
            E0(n3, c0051s7, t3, false);
            C0051s c0051s8 = this.f2082q;
            i4 = c0051s8.f1343b;
            int i18 = c0051s8.f1344d;
            int i19 = c0051s8.c;
            if (i19 > 0) {
                k2 += i19;
            }
            a1(c0050q.f1336b, c0050q.c);
            C0051s c0051s9 = this.f2082q;
            c0051s9.h = k2;
            c0051s9.f1344d += c0051s9.f1345e;
            E0(n3, c0051s9, t3, false);
            C0051s c0051s10 = this.f2082q;
            i5 = c0051s10.f1343b;
            int i20 = c0051s10.c;
            if (i20 > 0) {
                Z0(i18, i4);
                C0051s c0051s11 = this.f2082q;
                c0051s11.h = i20;
                E0(n3, c0051s11, t3, false);
                i4 = this.f2082q.f1343b;
            }
        }
        if (v() > 0) {
            if (this.f2086u ^ this.f2087v) {
                int L03 = L0(i4, n3, t3, true);
                i6 = i5 + L03;
                i7 = i4 + L03;
                L02 = M0(i6, n3, t3, false);
            } else {
                int M0 = M0(i5, n3, t3, true);
                i6 = i5 + M0;
                i7 = i4 + M0;
                L02 = L0(i7, n3, t3, false);
            }
            i5 = i6 + L02;
            i4 = i7 + L02;
        }
        if (t3.f1196k && v() != 0 && !t3.g && w0()) {
            List list2 = n3.f1180d;
            int size = list2.size();
            int F2 = H.F(u(0));
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < size; i23++) {
                W w3 = (W) list2.get(i23);
                if (!w3.j()) {
                    boolean z5 = w3.c() < F2;
                    boolean z6 = this.f2086u;
                    View view = w3.f1205a;
                    if (z5 != z6) {
                        i21 += this.f2083r.c(view);
                    } else {
                        i22 += this.f2083r.c(view);
                    }
                }
            }
            this.f2082q.f1349k = list2;
            if (i21 > 0) {
                a1(H.F(O0()), i5);
                C0051s c0051s12 = this.f2082q;
                c0051s12.h = i21;
                c0051s12.c = 0;
                c0051s12.a(null);
                E0(n3, this.f2082q, t3, false);
            }
            if (i22 > 0) {
                Z0(H.F(N0()), i4);
                C0051s c0051s13 = this.f2082q;
                c0051s13.h = i22;
                c0051s13.c = 0;
                list = null;
                c0051s13.a(null);
                E0(n3, this.f2082q, t3, false);
            } else {
                list = null;
            }
            this.f2082q.f1349k = list;
        }
        if (t3.g) {
            c0050q.d();
        } else {
            AbstractC0055w abstractC0055w = this.f2083r;
            abstractC0055w.f1366a = abstractC0055w.l();
        }
        this.f2084s = this.f2087v;
    }

    public final void Y0(int i3, int i4, boolean z3, T t3) {
        int k2;
        this.f2082q.f1350l = this.f2083r.i() == 0 && this.f2083r.f() == 0;
        this.f2082q.f1346f = i3;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        x0(t3, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        boolean z4 = i3 == 1;
        C0051s c0051s = this.f2082q;
        int i5 = z4 ? max2 : max;
        c0051s.h = i5;
        if (!z4) {
            max = max2;
        }
        c0051s.f1347i = max;
        if (z4) {
            c0051s.h = this.f2083r.h() + i5;
            View N02 = N0();
            C0051s c0051s2 = this.f2082q;
            c0051s2.f1345e = this.f2086u ? -1 : 1;
            int F2 = H.F(N02);
            C0051s c0051s3 = this.f2082q;
            c0051s2.f1344d = F2 + c0051s3.f1345e;
            c0051s3.f1343b = this.f2083r.b(N02);
            k2 = this.f2083r.b(N02) - this.f2083r.g();
        } else {
            View O02 = O0();
            C0051s c0051s4 = this.f2082q;
            c0051s4.h = this.f2083r.k() + c0051s4.h;
            C0051s c0051s5 = this.f2082q;
            c0051s5.f1345e = this.f2086u ? 1 : -1;
            int F3 = H.F(O02);
            C0051s c0051s6 = this.f2082q;
            c0051s5.f1344d = F3 + c0051s6.f1345e;
            c0051s6.f1343b = this.f2083r.e(O02);
            k2 = (-this.f2083r.e(O02)) + this.f2083r.k();
        }
        C0051s c0051s7 = this.f2082q;
        c0051s7.c = i4;
        if (z3) {
            c0051s7.c = i4 - k2;
        }
        c0051s7.g = k2;
    }

    @Override // Z.H
    public void Z(T t3) {
        this.f2091z = null;
        this.f2089x = -1;
        this.f2090y = Integer.MIN_VALUE;
        this.f2078A.d();
    }

    public final void Z0(int i3, int i4) {
        this.f2082q.c = this.f2083r.g() - i4;
        C0051s c0051s = this.f2082q;
        c0051s.f1345e = this.f2086u ? -1 : 1;
        c0051s.f1344d = i3;
        c0051s.f1346f = 1;
        c0051s.f1343b = i4;
        c0051s.g = Integer.MIN_VALUE;
    }

    @Override // Z.S
    public final PointF a(int i3) {
        if (v() == 0) {
            return null;
        }
        int i4 = (i3 < H.F(u(0))) != this.f2086u ? -1 : 1;
        return this.f2081p == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    @Override // Z.H
    public final void a0(Parcelable parcelable) {
        if (parcelable instanceof C0052t) {
            this.f2091z = (C0052t) parcelable;
            i0();
        }
    }

    public final void a1(int i3, int i4) {
        this.f2082q.c = i4 - this.f2083r.k();
        C0051s c0051s = this.f2082q;
        c0051s.f1344d = i3;
        c0051s.f1345e = this.f2086u ? 1 : -1;
        c0051s.f1346f = -1;
        c0051s.f1343b = i4;
        c0051s.g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z.t, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Z.t, android.os.Parcelable, java.lang.Object] */
    @Override // Z.H
    public final Parcelable b0() {
        C0052t c0052t = this.f2091z;
        if (c0052t != null) {
            ?? obj = new Object();
            obj.f1351b = c0052t.f1351b;
            obj.c = c0052t.c;
            obj.f1352d = c0052t.f1352d;
            return obj;
        }
        ?? obj2 = new Object();
        if (v() > 0) {
            D0();
            boolean z3 = this.f2084s ^ this.f2086u;
            obj2.f1352d = z3;
            if (z3) {
                View N02 = N0();
                obj2.c = this.f2083r.g() - this.f2083r.b(N02);
                obj2.f1351b = H.F(N02);
            } else {
                View O02 = O0();
                obj2.f1351b = H.F(O02);
                obj2.c = this.f2083r.e(O02) - this.f2083r.k();
            }
        } else {
            obj2.f1351b = -1;
        }
        return obj2;
    }

    @Override // Z.H
    public final void c(String str) {
        if (this.f2091z == null) {
            super.c(str);
        }
    }

    @Override // Z.H
    public final boolean d() {
        return this.f2081p == 0;
    }

    @Override // Z.H
    public final boolean e() {
        return this.f2081p == 1;
    }

    @Override // Z.H
    public final void h(int i3, int i4, T t3, b bVar) {
        if (this.f2081p != 0) {
            i3 = i4;
        }
        if (v() == 0 || i3 == 0) {
            return;
        }
        D0();
        Y0(i3 > 0 ? 1 : -1, Math.abs(i3), true, t3);
        y0(t3, this.f2082q, bVar);
    }

    @Override // Z.H
    public final void i(int i3, b bVar) {
        boolean z3;
        int i4;
        C0052t c0052t = this.f2091z;
        if (c0052t == null || (i4 = c0052t.f1351b) < 0) {
            U0();
            z3 = this.f2086u;
            i4 = this.f2089x;
            if (i4 == -1) {
                i4 = z3 ? i3 - 1 : 0;
            }
        } else {
            z3 = c0052t.f1352d;
        }
        int i5 = z3 ? -1 : 1;
        for (int i6 = 0; i6 < this.f2080C && i4 >= 0 && i4 < i3; i6++) {
            bVar.a(i4, 0);
            i4 += i5;
        }
    }

    @Override // Z.H
    public final int j(T t3) {
        return z0(t3);
    }

    @Override // Z.H
    public int j0(int i3, N n3, T t3) {
        if (this.f2081p == 1) {
            return 0;
        }
        return V0(i3, n3, t3);
    }

    @Override // Z.H
    public int k(T t3) {
        return A0(t3);
    }

    @Override // Z.H
    public final void k0(int i3) {
        this.f2089x = i3;
        this.f2090y = Integer.MIN_VALUE;
        C0052t c0052t = this.f2091z;
        if (c0052t != null) {
            c0052t.f1351b = -1;
        }
        i0();
    }

    @Override // Z.H
    public int l(T t3) {
        return B0(t3);
    }

    @Override // Z.H
    public int l0(int i3, N n3, T t3) {
        if (this.f2081p == 0) {
            return 0;
        }
        return V0(i3, n3, t3);
    }

    @Override // Z.H
    public final int m(T t3) {
        return z0(t3);
    }

    @Override // Z.H
    public int n(T t3) {
        return A0(t3);
    }

    @Override // Z.H
    public int o(T t3) {
        return B0(t3);
    }

    @Override // Z.H
    public final View q(int i3) {
        int v3 = v();
        if (v3 == 0) {
            return null;
        }
        int F2 = i3 - H.F(u(0));
        if (F2 >= 0 && F2 < v3) {
            View u3 = u(F2);
            if (H.F(u3) == i3) {
                return u3;
            }
        }
        return super.q(i3);
    }

    @Override // Z.H
    public I r() {
        return new I(-2, -2);
    }

    @Override // Z.H
    public final boolean s0() {
        if (this.f1167m == 1073741824 || this.f1166l == 1073741824) {
            return false;
        }
        int v3 = v();
        for (int i3 = 0; i3 < v3; i3++) {
            ViewGroup.LayoutParams layoutParams = u(i3).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.H
    public void u0(RecyclerView recyclerView, int i3) {
        C0053u c0053u = new C0053u(recyclerView.getContext());
        c0053u.f1353a = i3;
        v0(c0053u);
    }

    @Override // Z.H
    public boolean w0() {
        return this.f2091z == null && this.f2084s == this.f2087v;
    }

    public void x0(T t3, int[] iArr) {
        int i3;
        int l3 = t3.f1189a != -1 ? this.f2083r.l() : 0;
        if (this.f2082q.f1346f == -1) {
            i3 = 0;
        } else {
            i3 = l3;
            l3 = 0;
        }
        iArr[0] = l3;
        iArr[1] = i3;
    }

    public void y0(T t3, C0051s c0051s, b bVar) {
        int i3 = c0051s.f1344d;
        if (i3 < 0 || i3 >= t3.b()) {
            return;
        }
        bVar.a(i3, Math.max(0, c0051s.g));
    }

    public final int z0(T t3) {
        if (v() == 0) {
            return 0;
        }
        D0();
        AbstractC0055w abstractC0055w = this.f2083r;
        boolean z3 = !this.f2088w;
        return z.n(t3, abstractC0055w, G0(z3), F0(z3), this, this.f2088w);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, Z.r] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2081p = 1;
        this.f2085t = false;
        this.f2086u = false;
        this.f2087v = false;
        this.f2088w = true;
        this.f2089x = -1;
        this.f2090y = Integer.MIN_VALUE;
        this.f2091z = null;
        this.f2078A = new C0050q();
        this.f2079B = new Object();
        this.f2080C = 2;
        this.D = new int[2];
        G G2 = H.G(context, attributeSet, i3, i4);
        W0(G2.f1155a);
        boolean z3 = G2.c;
        c(null);
        if (z3 != this.f2085t) {
            this.f2085t = z3;
            i0();
        }
        X0(G2.f1157d);
    }
}
