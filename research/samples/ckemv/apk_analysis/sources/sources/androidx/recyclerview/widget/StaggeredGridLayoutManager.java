package androidx.recyclerview.widget;

import C0.b;
import F0.h;
import J.B;
import K.o;
import K.p;
import Z.AbstractC0055w;
import Z.C0049p;
import Z.C0053u;
import Z.G;
import Z.H;
import Z.I;
import Z.N;
import Z.S;
import Z.T;
import Z.a0;
import Z.b0;
import Z.d0;
import Z.e0;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import m0.z;
import v0.r;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends H implements S {

    /* renamed from: B, reason: collision with root package name */
    public final r f2158B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2159C;
    public boolean D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2160E;

    /* renamed from: F, reason: collision with root package name */
    public d0 f2161F;

    /* renamed from: G, reason: collision with root package name */
    public final Rect f2162G;

    /* renamed from: H, reason: collision with root package name */
    public final a0 f2163H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f2164I;

    /* renamed from: J, reason: collision with root package name */
    public int[] f2165J;

    /* renamed from: K, reason: collision with root package name */
    public final h f2166K;

    /* renamed from: p, reason: collision with root package name */
    public final int f2167p;

    /* renamed from: q, reason: collision with root package name */
    public final e0[] f2168q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0055w f2169r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0055w f2170s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2171t;

    /* renamed from: u, reason: collision with root package name */
    public int f2172u;

    /* renamed from: v, reason: collision with root package name */
    public final C0049p f2173v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2174w;

    /* renamed from: y, reason: collision with root package name */
    public final BitSet f2176y;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2175x = false;

    /* renamed from: z, reason: collision with root package name */
    public int f2177z = -1;

    /* renamed from: A, reason: collision with root package name */
    public int f2157A = Integer.MIN_VALUE;

    /* JADX WARN: Type inference failed for: r2v1, types: [v0.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, Z.p] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2167p = -1;
        this.f2174w = false;
        ?? obj = new Object();
        this.f2158B = obj;
        this.f2159C = 2;
        this.f2162G = new Rect();
        this.f2163H = new a0(this);
        this.f2164I = true;
        this.f2166K = new h(5, this);
        G G2 = H.G(context, attributeSet, i3, i4);
        int i5 = G2.f1155a;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i5 != this.f2171t) {
            this.f2171t = i5;
            AbstractC0055w abstractC0055w = this.f2169r;
            this.f2169r = this.f2170s;
            this.f2170s = abstractC0055w;
            i0();
        }
        int i6 = G2.f1156b;
        c(null);
        if (i6 != this.f2167p) {
            int[] iArr = (int[]) obj.f5124b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            obj.c = null;
            i0();
            this.f2167p = i6;
            this.f2176y = new BitSet(this.f2167p);
            this.f2168q = new e0[this.f2167p];
            for (int i7 = 0; i7 < this.f2167p; i7++) {
                this.f2168q[i7] = new e0(this, i7);
            }
            i0();
        }
        boolean z3 = G2.c;
        c(null);
        d0 d0Var = this.f2161F;
        if (d0Var != null && d0Var.f1250i != z3) {
            d0Var.f1250i = z3;
        }
        this.f2174w = z3;
        i0();
        ?? obj2 = new Object();
        obj2.f1329a = true;
        obj2.f1333f = 0;
        obj2.g = 0;
        this.f2173v = obj2;
        this.f2169r = AbstractC0055w.a(this, this.f2171t);
        this.f2170s = AbstractC0055w.a(this, 1 - this.f2171t);
    }

    public static int a1(int i3, int i4, int i5) {
        if (i4 == 0 && i5 == 0) {
            return i3;
        }
        int mode = View.MeasureSpec.getMode(i3);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i4) - i5), mode) : i3;
    }

    public final int A0(T t3) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0055w abstractC0055w = this.f2169r;
        boolean z3 = this.f2164I;
        return z.o(t3, abstractC0055w, E0(!z3), D0(!z3), this, this.f2164I, this.f2175x);
    }

    public final int B0(T t3) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0055w abstractC0055w = this.f2169r;
        boolean z3 = this.f2164I;
        return z.p(t3, abstractC0055w, E0(!z3), D0(!z3), this, this.f2164I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int, boolean] */
    public final int C0(N n3, C0049p c0049p, T t3) {
        e0 e0Var;
        ?? r6;
        int i3;
        int h;
        int c;
        int k2;
        int c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 1;
        this.f2176y.set(0, this.f2167p, true);
        C0049p c0049p2 = this.f2173v;
        int i10 = c0049p2.f1334i ? c0049p.f1332e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0049p.f1332e == 1 ? c0049p.g + c0049p.f1330b : c0049p.f1333f - c0049p.f1330b;
        int i11 = c0049p.f1332e;
        for (int i12 = 0; i12 < this.f2167p; i12++) {
            if (!this.f2168q[i12].f1258a.isEmpty()) {
                Z0(this.f2168q[i12], i11, i10);
            }
        }
        int g = this.f2175x ? this.f2169r.g() : this.f2169r.k();
        boolean z3 = false;
        while (true) {
            int i13 = c0049p.c;
            if (((i13 < 0 || i13 >= t3.b()) ? i8 : i9) == 0 || (!c0049p2.f1334i && this.f2176y.isEmpty())) {
                break;
            }
            View view = n3.i(c0049p.c, Long.MAX_VALUE).f1205a;
            c0049p.c += c0049p.f1331d;
            b0 b0Var = (b0) view.getLayoutParams();
            int c4 = b0Var.f1170a.c();
            r rVar = this.f2158B;
            int[] iArr = (int[]) rVar.f5124b;
            int i14 = (iArr == null || c4 >= iArr.length) ? -1 : iArr[c4];
            if (i14 == -1) {
                if (Q0(c0049p.f1332e)) {
                    i7 = this.f2167p - i9;
                    i6 = -1;
                    i5 = -1;
                } else {
                    i5 = i9;
                    i6 = this.f2167p;
                    i7 = i8;
                }
                e0 e0Var2 = null;
                if (c0049p.f1332e == i9) {
                    int k3 = this.f2169r.k();
                    int i15 = Integer.MAX_VALUE;
                    while (i7 != i6) {
                        e0 e0Var3 = this.f2168q[i7];
                        int f3 = e0Var3.f(k3);
                        if (f3 < i15) {
                            i15 = f3;
                            e0Var2 = e0Var3;
                        }
                        i7 += i5;
                    }
                } else {
                    int g3 = this.f2169r.g();
                    int i16 = Integer.MIN_VALUE;
                    while (i7 != i6) {
                        e0 e0Var4 = this.f2168q[i7];
                        int h3 = e0Var4.h(g3);
                        if (h3 > i16) {
                            e0Var2 = e0Var4;
                            i16 = h3;
                        }
                        i7 += i5;
                    }
                }
                e0Var = e0Var2;
                rVar.r(c4);
                ((int[]) rVar.f5124b)[c4] = e0Var.f1261e;
            } else {
                e0Var = this.f2168q[i14];
            }
            b0Var.f1236e = e0Var;
            if (c0049p.f1332e == 1) {
                r6 = 0;
                b(view, -1, false);
            } else {
                r6 = 0;
                b(view, 0, false);
            }
            if (this.f2171t == 1) {
                i3 = 1;
                O0(view, H.w(this.f2172u, this.f1166l, r6, ((ViewGroup.MarginLayoutParams) b0Var).width, r6), H.w(this.f1169o, this.f1167m, B() + E(), ((ViewGroup.MarginLayoutParams) b0Var).height, true));
            } else {
                i3 = 1;
                O0(view, H.w(this.f1168n, this.f1166l, D() + C(), ((ViewGroup.MarginLayoutParams) b0Var).width, true), H.w(this.f2172u, this.f1167m, 0, ((ViewGroup.MarginLayoutParams) b0Var).height, false));
            }
            if (c0049p.f1332e == i3) {
                c = e0Var.f(g);
                h = this.f2169r.c(view) + c;
            } else {
                h = e0Var.h(g);
                c = h - this.f2169r.c(view);
            }
            if (c0049p.f1332e == 1) {
                e0 e0Var5 = b0Var.f1236e;
                e0Var5.getClass();
                b0 b0Var2 = (b0) view.getLayoutParams();
                b0Var2.f1236e = e0Var5;
                ArrayList arrayList = e0Var5.f1258a;
                arrayList.add(view);
                e0Var5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    e0Var5.f1259b = Integer.MIN_VALUE;
                }
                if (b0Var2.f1170a.j() || b0Var2.f1170a.m()) {
                    e0Var5.f1260d = e0Var5.f1262f.f2169r.c(view) + e0Var5.f1260d;
                }
            } else {
                e0 e0Var6 = b0Var.f1236e;
                e0Var6.getClass();
                b0 b0Var3 = (b0) view.getLayoutParams();
                b0Var3.f1236e = e0Var6;
                ArrayList arrayList2 = e0Var6.f1258a;
                arrayList2.add(0, view);
                e0Var6.f1259b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    e0Var6.c = Integer.MIN_VALUE;
                }
                if (b0Var3.f1170a.j() || b0Var3.f1170a.m()) {
                    e0Var6.f1260d = e0Var6.f1262f.f2169r.c(view) + e0Var6.f1260d;
                }
            }
            if (N0() && this.f2171t == 1) {
                c3 = this.f2170s.g() - (((this.f2167p - 1) - e0Var.f1261e) * this.f2172u);
                k2 = c3 - this.f2170s.c(view);
            } else {
                k2 = this.f2170s.k() + (e0Var.f1261e * this.f2172u);
                c3 = this.f2170s.c(view) + k2;
            }
            if (this.f2171t == 1) {
                H.L(view, k2, c, c3, h);
            } else {
                H.L(view, c, k2, h, c3);
            }
            Z0(e0Var, c0049p2.f1332e, i10);
            S0(n3, c0049p2);
            if (c0049p2.h && view.hasFocusable()) {
                i4 = 0;
                this.f2176y.set(e0Var.f1261e, false);
            } else {
                i4 = 0;
            }
            i8 = i4;
            i9 = 1;
            z3 = true;
        }
        int i17 = i8;
        if (!z3) {
            S0(n3, c0049p2);
        }
        int k4 = c0049p2.f1332e == -1 ? this.f2169r.k() - K0(this.f2169r.k()) : J0(this.f2169r.g()) - this.f2169r.g();
        return k4 > 0 ? Math.min(c0049p.f1330b, k4) : i17;
    }

    public final View D0(boolean z3) {
        int k2 = this.f2169r.k();
        int g = this.f2169r.g();
        View view = null;
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            int e3 = this.f2169r.e(u3);
            int b3 = this.f2169r.b(u3);
            if (b3 > k2 && e3 < g) {
                if (b3 <= g || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final View E0(boolean z3) {
        int k2 = this.f2169r.k();
        int g = this.f2169r.g();
        int v3 = v();
        View view = null;
        for (int i3 = 0; i3 < v3; i3++) {
            View u3 = u(i3);
            int e3 = this.f2169r.e(u3);
            if (this.f2169r.b(u3) > k2 && e3 < g) {
                if (e3 >= k2 || !z3) {
                    return u3;
                }
                if (view == null) {
                    view = u3;
                }
            }
        }
        return view;
    }

    public final void F0(N n3, T t3, boolean z3) {
        int g;
        int J02 = J0(Integer.MIN_VALUE);
        if (J02 != Integer.MIN_VALUE && (g = this.f2169r.g() - J02) > 0) {
            int i3 = g - (-W0(-g, n3, t3));
            if (!z3 || i3 <= 0) {
                return;
            }
            this.f2169r.p(i3);
        }
    }

    public final void G0(N n3, T t3, boolean z3) {
        int k2;
        int K0 = K0(Integer.MAX_VALUE);
        if (K0 != Integer.MAX_VALUE && (k2 = K0 - this.f2169r.k()) > 0) {
            int W02 = k2 - W0(k2, n3, t3);
            if (!z3 || W02 <= 0) {
                return;
            }
            this.f2169r.p(-W02);
        }
    }

    @Override // Z.H
    public final int H(N n3, T t3) {
        return this.f2171t == 0 ? this.f2167p : super.H(n3, t3);
    }

    public final int H0() {
        if (v() == 0) {
            return 0;
        }
        return H.F(u(0));
    }

    public final int I0() {
        int v3 = v();
        if (v3 == 0) {
            return 0;
        }
        return H.F(u(v3 - 1));
    }

    @Override // Z.H
    public final boolean J() {
        return this.f2159C != 0;
    }

    public final int J0(int i3) {
        int f3 = this.f2168q[0].f(i3);
        for (int i4 = 1; i4 < this.f2167p; i4++) {
            int f4 = this.f2168q[i4].f(i3);
            if (f4 > f3) {
                f3 = f4;
            }
        }
        return f3;
    }

    public final int K0(int i3) {
        int h = this.f2168q[0].h(i3);
        for (int i4 = 1; i4 < this.f2167p; i4++) {
            int h3 = this.f2168q[i4].h(i3);
            if (h3 < h) {
                h = h3;
            }
        }
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(int i3, int i4, int i5) {
        int i6;
        int i7;
        int I02 = this.f2175x ? I0() : H0();
        if (i5 != 8) {
            i6 = i3 + i4;
        } else {
            if (i3 >= i4) {
                i6 = i3 + 1;
                i7 = i4;
                r rVar = this.f2158B;
                rVar.v(i7);
                if (i5 != 1) {
                    rVar.w(i3, i4);
                } else if (i5 == 2) {
                    rVar.x(i3, i4);
                } else if (i5 == 8) {
                    rVar.x(i3, 1);
                    rVar.w(i4, 1);
                }
                if (i6 > I02) {
                    return;
                }
                if (i7 <= (this.f2175x ? H0() : I0())) {
                    i0();
                    return;
                }
                return;
            }
            i6 = i4 + 1;
        }
        i7 = i3;
        r rVar2 = this.f2158B;
        rVar2.v(i7);
        if (i5 != 1) {
        }
        if (i6 > I02) {
        }
    }

    @Override // Z.H
    public final void M(int i3) {
        super.M(i3);
        for (int i4 = 0; i4 < this.f2167p; i4++) {
            e0 e0Var = this.f2168q[i4];
            int i5 = e0Var.f1259b;
            if (i5 != Integer.MIN_VALUE) {
                e0Var.f1259b = i5 + i3;
            }
            int i6 = e0Var.c;
            if (i6 != Integer.MIN_VALUE) {
                e0Var.c = i6 + i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View M0() {
        int v3 = v();
        int i3 = v3 - 1;
        BitSet bitSet = new BitSet(this.f2167p);
        bitSet.set(0, this.f2167p, true);
        char c = (this.f2171t == 1 && N0()) ? (char) 1 : (char) 65535;
        if (this.f2175x) {
            v3 = -1;
        } else {
            i3 = 0;
        }
        int i4 = i3 < v3 ? 1 : -1;
        while (i3 != v3) {
            View u3 = u(i3);
            b0 b0Var = (b0) u3.getLayoutParams();
            if (bitSet.get(b0Var.f1236e.f1261e)) {
                e0 e0Var = b0Var.f1236e;
                if (this.f2175x) {
                    int i5 = e0Var.c;
                    if (i5 == Integer.MIN_VALUE) {
                        e0Var.a();
                        i5 = e0Var.c;
                    }
                    if (i5 < this.f2169r.g()) {
                        ArrayList arrayList = e0Var.f1258a;
                        ((b0) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return u3;
                    }
                    bitSet.clear(b0Var.f1236e.f1261e);
                } else {
                    int i6 = e0Var.f1259b;
                    if (i6 == Integer.MIN_VALUE) {
                        View view = (View) e0Var.f1258a.get(0);
                        b0 b0Var2 = (b0) view.getLayoutParams();
                        e0Var.f1259b = e0Var.f1262f.f2169r.e(view);
                        b0Var2.getClass();
                        i6 = e0Var.f1259b;
                    }
                    if (i6 > this.f2169r.k()) {
                        ((b0) ((View) e0Var.f1258a.get(0)).getLayoutParams()).getClass();
                        return u3;
                    }
                    bitSet.clear(b0Var.f1236e.f1261e);
                }
            }
            i3 += i4;
            if (i3 != v3) {
                View u4 = u(i3);
                if (this.f2175x) {
                    int b3 = this.f2169r.b(u3);
                    int b4 = this.f2169r.b(u4);
                    if (b3 < b4) {
                        return u3;
                    }
                    if (b3 == b4) {
                        if ((b0Var.f1236e.f1261e - ((b0) u4.getLayoutParams()).f1236e.f1261e >= 0) == (c >= 0)) {
                            return u3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int e3 = this.f2169r.e(u3);
                    int e4 = this.f2169r.e(u4);
                    if (e3 > e4) {
                        return u3;
                    }
                    if (e3 == e4) {
                        if ((b0Var.f1236e.f1261e - ((b0) u4.getLayoutParams()).f1236e.f1261e >= 0) == (c >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // Z.H
    public final void N(int i3) {
        super.N(i3);
        for (int i4 = 0; i4 < this.f2167p; i4++) {
            e0 e0Var = this.f2168q[i4];
            int i5 = e0Var.f1259b;
            if (i5 != Integer.MIN_VALUE) {
                e0Var.f1259b = i5 + i3;
            }
            int i6 = e0Var.c;
            if (i6 != Integer.MIN_VALUE) {
                e0Var.c = i6 + i3;
            }
        }
    }

    public final boolean N0() {
        return A() == 1;
    }

    @Override // Z.H
    public final void O(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1159b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2166K);
        }
        for (int i3 = 0; i3 < this.f2167p; i3++) {
            this.f2168q[i3].b();
        }
        recyclerView.requestLayout();
    }

    public final void O0(View view, int i3, int i4) {
        RecyclerView recyclerView = this.f1159b;
        Rect rect = this.f2162G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        b0 b0Var = (b0) view.getLayoutParams();
        int a12 = a1(i3, ((ViewGroup.MarginLayoutParams) b0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) b0Var).rightMargin + rect.right);
        int a13 = a1(i4, ((ViewGroup.MarginLayoutParams) b0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) b0Var).bottomMargin + rect.bottom);
        if (r0(view, a12, a13, b0Var)) {
            view.measure(a12, a13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x004b, code lost:
    
        if (r8.f2171t == 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0050, code lost:
    
        if (r8.f2171t == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x005d, code lost:
    
        if (N0() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x006a, code lost:
    
        if (N0() == false) goto L46;
     */
    @Override // Z.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View P(View view, int i3, N n3, T t3) {
        View A3;
        int i4;
        if (v() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView == null || (A3 = recyclerView.A(view)) == null || this.f1158a.B(A3)) {
            A3 = null;
        }
        if (A3 == null) {
            return null;
        }
        V0();
        if (i3 == 1) {
            if (this.f2171t != 1) {
            }
            i4 = -1;
        } else if (i3 == 2) {
            if (this.f2171t != 1) {
            }
            i4 = 1;
        } else if (i3 != 17) {
            if (i3 != 33) {
                if (i3 == 66) {
                }
            }
            i4 = Integer.MIN_VALUE;
        }
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        b0 b0Var = (b0) A3.getLayoutParams();
        b0Var.getClass();
        e0 e0Var = b0Var.f1236e;
        int I02 = i4 == 1 ? I0() : H0();
        Y0(I02, t3);
        X0(i4);
        C0049p c0049p = this.f2173v;
        c0049p.c = c0049p.f1331d + I02;
        c0049p.f1330b = (int) (this.f2169r.l() * 0.33333334f);
        c0049p.h = true;
        c0049p.f1329a = false;
        C0(n3, c0049p, t3);
        this.D = this.f2175x;
        View g = e0Var.g(I02, i4);
        if (g != null && g != A3) {
            return g;
        }
        if (Q0(i4)) {
            for (int i5 = this.f2167p - 1; i5 >= 0; i5--) {
                View g3 = this.f2168q[i5].g(I02, i4);
                if (g3 != null && g3 != A3) {
                    return g3;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f2167p; i6++) {
                View g4 = this.f2168q[i6].g(I02, i4);
                if (g4 != null && g4 != A3) {
                    return g4;
                }
            }
        }
        boolean z3 = (this.f2174w ^ true) == (i4 == -1);
        View q3 = q(z3 ? e0Var.c() : e0Var.d());
        if (q3 != null && q3 != A3) {
            return q3;
        }
        if (Q0(i4)) {
            for (int i7 = this.f2167p - 1; i7 >= 0; i7--) {
                if (i7 != e0Var.f1261e) {
                    View q4 = q(z3 ? this.f2168q[i7].c() : this.f2168q[i7].d());
                    if (q4 != null && q4 != A3) {
                        return q4;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f2167p; i8++) {
                View q5 = q(z3 ? this.f2168q[i8].c() : this.f2168q[i8].d());
                if (q5 != null && q5 != A3) {
                    return q5;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x040a, code lost:
    
        if (y0() != false) goto L250;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0(N n3, T t3, boolean z3) {
        d0 d0Var;
        int i3;
        int i4;
        d0 d0Var2 = this.f2161F;
        a0 a0Var = this.f2163H;
        if (!(d0Var2 == null && this.f2177z == -1) && t3.b() == 0) {
            d0(n3);
            a0Var.a();
            return;
        }
        boolean z4 = true;
        boolean z5 = (a0Var.f1232e && this.f2177z == -1 && this.f2161F == null) ? false : true;
        r rVar = this.f2158B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = a0Var.g;
        if (z5) {
            a0Var.a();
            d0 d0Var3 = this.f2161F;
            if (d0Var3 != null) {
                int i5 = d0Var3.f1247d;
                if (i5 > 0) {
                    if (i5 == this.f2167p) {
                        for (int i6 = 0; i6 < this.f2167p; i6++) {
                            this.f2168q[i6].b();
                            d0 d0Var4 = this.f2161F;
                            int i7 = d0Var4.f1248e[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += d0Var4.f1251j ? this.f2169r.g() : this.f2169r.k();
                            }
                            e0 e0Var = this.f2168q[i6];
                            e0Var.f1259b = i7;
                            e0Var.c = i7;
                        }
                    } else {
                        d0Var3.f1248e = null;
                        d0Var3.f1247d = 0;
                        d0Var3.f1249f = 0;
                        d0Var3.g = null;
                        d0Var3.h = null;
                        d0Var3.f1246b = d0Var3.c;
                    }
                }
                d0 d0Var5 = this.f2161F;
                this.f2160E = d0Var5.f1252k;
                boolean z6 = d0Var5.f1250i;
                c(null);
                d0 d0Var6 = this.f2161F;
                if (d0Var6 != null && d0Var6.f1250i != z6) {
                    d0Var6.f1250i = z6;
                }
                this.f2174w = z6;
                i0();
                V0();
                d0 d0Var7 = this.f2161F;
                int i8 = d0Var7.f1246b;
                if (i8 != -1) {
                    this.f2177z = i8;
                    a0Var.c = d0Var7.f1251j;
                } else {
                    a0Var.c = this.f2175x;
                }
                if (d0Var7.f1249f > 1) {
                    rVar.f5124b = d0Var7.g;
                    rVar.c = d0Var7.h;
                }
            } else {
                V0();
                a0Var.c = this.f2175x;
            }
            if (!t3.g && (i4 = this.f2177z) != -1) {
                if (i4 < 0 || i4 >= t3.b()) {
                    this.f2177z = -1;
                    this.f2157A = Integer.MIN_VALUE;
                } else {
                    d0 d0Var8 = this.f2161F;
                    if (d0Var8 == null || d0Var8.f1246b == -1 || d0Var8.f1247d < 1) {
                        View q3 = q(this.f2177z);
                        if (q3 != null) {
                            a0Var.f1229a = this.f2175x ? I0() : H0();
                            if (this.f2157A != Integer.MIN_VALUE) {
                                if (a0Var.c) {
                                    a0Var.f1230b = (this.f2169r.g() - this.f2157A) - this.f2169r.b(q3);
                                } else {
                                    a0Var.f1230b = (this.f2169r.k() + this.f2157A) - this.f2169r.e(q3);
                                }
                            } else if (this.f2169r.c(q3) > this.f2169r.l()) {
                                a0Var.f1230b = a0Var.c ? this.f2169r.g() : this.f2169r.k();
                            } else {
                                int e3 = this.f2169r.e(q3) - this.f2169r.k();
                                if (e3 < 0) {
                                    a0Var.f1230b = -e3;
                                } else {
                                    int g = this.f2169r.g() - this.f2169r.b(q3);
                                    if (g < 0) {
                                        a0Var.f1230b = g;
                                    } else {
                                        a0Var.f1230b = Integer.MIN_VALUE;
                                    }
                                }
                            }
                        } else {
                            int i9 = this.f2177z;
                            a0Var.f1229a = i9;
                            int i10 = this.f2157A;
                            if (i10 == Integer.MIN_VALUE) {
                                boolean z7 = x0(i9) == 1;
                                a0Var.c = z7;
                                a0Var.f1230b = z7 ? staggeredGridLayoutManager.f2169r.g() : staggeredGridLayoutManager.f2169r.k();
                            } else if (a0Var.c) {
                                a0Var.f1230b = staggeredGridLayoutManager.f2169r.g() - i10;
                            } else {
                                a0Var.f1230b = staggeredGridLayoutManager.f2169r.k() + i10;
                            }
                            a0Var.f1231d = true;
                        }
                    } else {
                        a0Var.f1230b = Integer.MIN_VALUE;
                        a0Var.f1229a = this.f2177z;
                    }
                    a0Var.f1232e = true;
                }
            }
            if (this.D) {
                int b3 = t3.b();
                for (int v3 = v() - 1; v3 >= 0; v3--) {
                    i3 = H.F(u(v3));
                    if (i3 >= 0 && i3 < b3) {
                        break;
                    }
                }
                i3 = 0;
                a0Var.f1229a = i3;
                a0Var.f1230b = Integer.MIN_VALUE;
                a0Var.f1232e = true;
            } else {
                int b4 = t3.b();
                int v4 = v();
                for (int i11 = 0; i11 < v4; i11++) {
                    int F2 = H.F(u(i11));
                    if (F2 >= 0 && F2 < b4) {
                        i3 = F2;
                        break;
                    }
                }
                i3 = 0;
                a0Var.f1229a = i3;
                a0Var.f1230b = Integer.MIN_VALUE;
                a0Var.f1232e = true;
            }
        }
        if (this.f2161F == null && this.f2177z == -1 && (a0Var.c != this.D || N0() != this.f2160E)) {
            int[] iArr = (int[]) rVar.f5124b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            rVar.c = null;
            a0Var.f1231d = true;
        }
        if (v() > 0 && ((d0Var = this.f2161F) == null || d0Var.f1247d < 1)) {
            if (a0Var.f1231d) {
                for (int i12 = 0; i12 < this.f2167p; i12++) {
                    this.f2168q[i12].b();
                    int i13 = a0Var.f1230b;
                    if (i13 != Integer.MIN_VALUE) {
                        e0 e0Var2 = this.f2168q[i12];
                        e0Var2.f1259b = i13;
                        e0Var2.c = i13;
                    }
                }
            } else if (z5 || a0Var.f1233f == null) {
                for (int i14 = 0; i14 < this.f2167p; i14++) {
                    e0 e0Var3 = this.f2168q[i14];
                    boolean z8 = this.f2175x;
                    int i15 = a0Var.f1230b;
                    int f3 = z8 ? e0Var3.f(Integer.MIN_VALUE) : e0Var3.h(Integer.MIN_VALUE);
                    e0Var3.b();
                    if (f3 != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = e0Var3.f1262f;
                        if ((!z8 || f3 >= staggeredGridLayoutManager2.f2169r.g()) && (z8 || f3 <= staggeredGridLayoutManager2.f2169r.k())) {
                            if (i15 != Integer.MIN_VALUE) {
                                f3 += i15;
                            }
                            e0Var3.c = f3;
                            e0Var3.f1259b = f3;
                        }
                    }
                }
                e0[] e0VarArr = this.f2168q;
                int length = e0VarArr.length;
                int[] iArr2 = a0Var.f1233f;
                if (iArr2 == null || iArr2.length < length) {
                    a0Var.f1233f = new int[staggeredGridLayoutManager.f2168q.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    a0Var.f1233f[i16] = e0VarArr[i16].h(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < this.f2167p; i17++) {
                    e0 e0Var4 = this.f2168q[i17];
                    e0Var4.b();
                    int i18 = a0Var.f1233f[i17];
                    e0Var4.f1259b = i18;
                    e0Var4.c = i18;
                }
            }
        }
        p(n3);
        C0049p c0049p = this.f2173v;
        c0049p.f1329a = false;
        int l3 = this.f2170s.l();
        this.f2172u = l3 / this.f2167p;
        View.MeasureSpec.makeMeasureSpec(l3, this.f2170s.i());
        Y0(a0Var.f1229a, t3);
        if (a0Var.c) {
            X0(-1);
            C0(n3, c0049p, t3);
            X0(1);
            c0049p.c = a0Var.f1229a + c0049p.f1331d;
            C0(n3, c0049p, t3);
        } else {
            X0(1);
            C0(n3, c0049p, t3);
            X0(-1);
            c0049p.c = a0Var.f1229a + c0049p.f1331d;
            C0(n3, c0049p, t3);
        }
        if (this.f2170s.i() != 1073741824) {
            int v5 = v();
            float f4 = 0.0f;
            for (int i19 = 0; i19 < v5; i19++) {
                View u3 = u(i19);
                float c = this.f2170s.c(u3);
                if (c >= f4) {
                    ((b0) u3.getLayoutParams()).getClass();
                    f4 = Math.max(f4, c);
                }
            }
            int i20 = this.f2172u;
            int round = Math.round(f4 * this.f2167p);
            if (this.f2170s.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2170s.l());
            }
            this.f2172u = round / this.f2167p;
            View.MeasureSpec.makeMeasureSpec(round, this.f2170s.i());
            if (this.f2172u != i20) {
                for (int i21 = 0; i21 < v5; i21++) {
                    View u4 = u(i21);
                    b0 b0Var = (b0) u4.getLayoutParams();
                    b0Var.getClass();
                    if (N0() && this.f2171t == 1) {
                        int i22 = -((this.f2167p - 1) - b0Var.f1236e.f1261e);
                        u4.offsetLeftAndRight((this.f2172u * i22) - (i22 * i20));
                    } else {
                        int i23 = b0Var.f1236e.f1261e;
                        int i24 = this.f2172u * i23;
                        int i25 = i23 * i20;
                        if (this.f2171t == 1) {
                            u4.offsetLeftAndRight(i24 - i25);
                        } else {
                            u4.offsetTopAndBottom(i24 - i25);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f2175x) {
                F0(n3, t3, true);
                G0(n3, t3, false);
            } else {
                G0(n3, t3, true);
                F0(n3, t3, false);
            }
        }
        if (z3 && !t3.g && this.f2159C != 0 && v() > 0 && M0() != null) {
            RecyclerView recyclerView = this.f1159b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f2166K);
            }
        }
        z4 = false;
        if (t3.g) {
            a0Var.a();
        }
        this.D = a0Var.c;
        this.f2160E = N0();
        if (z4) {
            a0Var.a();
            P0(n3, t3, false);
        }
    }

    @Override // Z.H
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (v() > 0) {
            View E02 = E0(false);
            View D02 = D0(false);
            if (E02 == null || D02 == null) {
                return;
            }
            int F2 = H.F(E02);
            int F3 = H.F(D02);
            if (F2 < F3) {
                accessibilityEvent.setFromIndex(F2);
                accessibilityEvent.setToIndex(F3);
            } else {
                accessibilityEvent.setFromIndex(F3);
                accessibilityEvent.setToIndex(F2);
            }
        }
    }

    public final boolean Q0(int i3) {
        if (this.f2171t == 0) {
            return (i3 == -1) != this.f2175x;
        }
        return ((i3 == -1) == this.f2175x) == N0();
    }

    @Override // Z.H
    public final void R(N n3, T t3, View view, p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b0)) {
            S(view, pVar);
            return;
        }
        b0 b0Var = (b0) layoutParams;
        if (this.f2171t == 0) {
            e0 e0Var = b0Var.f1236e;
            pVar.h(o.a(e0Var == null ? -1 : e0Var.f1261e, 1, -1, -1, false));
        } else {
            e0 e0Var2 = b0Var.f1236e;
            pVar.h(o.a(-1, -1, e0Var2 == null ? -1 : e0Var2.f1261e, 1, false));
        }
    }

    public final void R0(int i3, T t3) {
        int H02;
        int i4;
        if (i3 > 0) {
            H02 = I0();
            i4 = 1;
        } else {
            H02 = H0();
            i4 = -1;
        }
        C0049p c0049p = this.f2173v;
        c0049p.f1329a = true;
        Y0(H02, t3);
        X0(i4);
        c0049p.c = H02 + c0049p.f1331d;
        c0049p.f1330b = Math.abs(i3);
    }

    public final void S0(N n3, C0049p c0049p) {
        if (!c0049p.f1329a || c0049p.f1334i) {
            return;
        }
        if (c0049p.f1330b == 0) {
            if (c0049p.f1332e == -1) {
                T0(n3, c0049p.g);
                return;
            } else {
                U0(n3, c0049p.f1333f);
                return;
            }
        }
        int i3 = 1;
        if (c0049p.f1332e == -1) {
            int i4 = c0049p.f1333f;
            int h = this.f2168q[0].h(i4);
            while (i3 < this.f2167p) {
                int h3 = this.f2168q[i3].h(i4);
                if (h3 > h) {
                    h = h3;
                }
                i3++;
            }
            int i5 = i4 - h;
            T0(n3, i5 < 0 ? c0049p.g : c0049p.g - Math.min(i5, c0049p.f1330b));
            return;
        }
        int i6 = c0049p.g;
        int f3 = this.f2168q[0].f(i6);
        while (i3 < this.f2167p) {
            int f4 = this.f2168q[i3].f(i6);
            if (f4 < f3) {
                f3 = f4;
            }
            i3++;
        }
        int i7 = f3 - c0049p.g;
        U0(n3, i7 < 0 ? c0049p.f1333f : Math.min(i7, c0049p.f1330b) + c0049p.f1333f);
    }

    @Override // Z.H
    public final void T(int i3, int i4) {
        L0(i3, i4, 1);
    }

    public final void T0(N n3, int i3) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            if (this.f2169r.e(u3) < i3 || this.f2169r.o(u3) < i3) {
                return;
            }
            b0 b0Var = (b0) u3.getLayoutParams();
            b0Var.getClass();
            if (b0Var.f1236e.f1258a.size() == 1) {
                return;
            }
            e0 e0Var = b0Var.f1236e;
            ArrayList arrayList = e0Var.f1258a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f1236e = null;
            if (b0Var2.f1170a.j() || b0Var2.f1170a.m()) {
                e0Var.f1260d -= e0Var.f1262f.f2169r.c(view);
            }
            if (size == 1) {
                e0Var.f1259b = Integer.MIN_VALUE;
            }
            e0Var.c = Integer.MIN_VALUE;
            f0(u3, n3);
        }
    }

    @Override // Z.H
    public final void U() {
        r rVar = this.f2158B;
        int[] iArr = (int[]) rVar.f5124b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        rVar.c = null;
        i0();
    }

    public final void U0(N n3, int i3) {
        while (v() > 0) {
            View u3 = u(0);
            if (this.f2169r.b(u3) > i3 || this.f2169r.n(u3) > i3) {
                return;
            }
            b0 b0Var = (b0) u3.getLayoutParams();
            b0Var.getClass();
            if (b0Var.f1236e.f1258a.size() == 1) {
                return;
            }
            e0 e0Var = b0Var.f1236e;
            ArrayList arrayList = e0Var.f1258a;
            View view = (View) arrayList.remove(0);
            b0 b0Var2 = (b0) view.getLayoutParams();
            b0Var2.f1236e = null;
            if (arrayList.size() == 0) {
                e0Var.c = Integer.MIN_VALUE;
            }
            if (b0Var2.f1170a.j() || b0Var2.f1170a.m()) {
                e0Var.f1260d -= e0Var.f1262f.f2169r.c(view);
            }
            e0Var.f1259b = Integer.MIN_VALUE;
            f0(u3, n3);
        }
    }

    @Override // Z.H
    public final void V(int i3, int i4) {
        L0(i3, i4, 8);
    }

    public final void V0() {
        if (this.f2171t == 1 || !N0()) {
            this.f2175x = this.f2174w;
        } else {
            this.f2175x = !this.f2174w;
        }
    }

    @Override // Z.H
    public final void W(int i3, int i4) {
        L0(i3, i4, 2);
    }

    public final int W0(int i3, N n3, T t3) {
        if (v() == 0 || i3 == 0) {
            return 0;
        }
        R0(i3, t3);
        C0049p c0049p = this.f2173v;
        int C02 = C0(n3, c0049p, t3);
        if (c0049p.f1330b >= C02) {
            i3 = i3 < 0 ? -C02 : C02;
        }
        this.f2169r.p(-i3);
        this.D = this.f2175x;
        c0049p.f1330b = 0;
        S0(n3, c0049p);
        return i3;
    }

    @Override // Z.H
    public final void X(int i3, int i4) {
        L0(i3, i4, 4);
    }

    public final void X0(int i3) {
        C0049p c0049p = this.f2173v;
        c0049p.f1332e = i3;
        c0049p.f1331d = this.f2175x != (i3 == -1) ? -1 : 1;
    }

    @Override // Z.H
    public final void Y(N n3, T t3) {
        P0(n3, t3, true);
    }

    public final void Y0(int i3, T t3) {
        int i4;
        int i5;
        int i6;
        C0049p c0049p = this.f2173v;
        boolean z3 = false;
        c0049p.f1330b = 0;
        c0049p.c = i3;
        C0053u c0053u = this.f1161e;
        if (!(c0053u != null && c0053u.f1356e) || (i6 = t3.f1189a) == -1) {
            i4 = 0;
            i5 = 0;
        } else {
            if (this.f2175x == (i6 < i3)) {
                i4 = this.f2169r.l();
                i5 = 0;
            } else {
                i5 = this.f2169r.l();
                i4 = 0;
            }
        }
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView == null || !recyclerView.h) {
            c0049p.g = this.f2169r.f() + i4;
            c0049p.f1333f = -i5;
        } else {
            c0049p.f1333f = this.f2169r.k() - i5;
            c0049p.g = this.f2169r.g() + i4;
        }
        c0049p.h = false;
        c0049p.f1329a = true;
        if (this.f2169r.i() == 0 && this.f2169r.f() == 0) {
            z3 = true;
        }
        c0049p.f1334i = z3;
    }

    @Override // Z.H
    public final void Z(T t3) {
        this.f2177z = -1;
        this.f2157A = Integer.MIN_VALUE;
        this.f2161F = null;
        this.f2163H.a();
    }

    public final void Z0(e0 e0Var, int i3, int i4) {
        int i5 = e0Var.f1260d;
        int i6 = e0Var.f1261e;
        if (i3 != -1) {
            int i7 = e0Var.c;
            if (i7 == Integer.MIN_VALUE) {
                e0Var.a();
                i7 = e0Var.c;
            }
            if (i7 - i5 >= i4) {
                this.f2176y.set(i6, false);
                return;
            }
            return;
        }
        int i8 = e0Var.f1259b;
        if (i8 == Integer.MIN_VALUE) {
            View view = (View) e0Var.f1258a.get(0);
            b0 b0Var = (b0) view.getLayoutParams();
            e0Var.f1259b = e0Var.f1262f.f2169r.e(view);
            b0Var.getClass();
            i8 = e0Var.f1259b;
        }
        if (i8 + i5 <= i4) {
            this.f2176y.set(i6, false);
        }
    }

    @Override // Z.S
    public final PointF a(int i3) {
        int x02 = x0(i3);
        PointF pointF = new PointF();
        if (x02 == 0) {
            return null;
        }
        if (this.f2171t == 0) {
            pointF.x = x02;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = x02;
        }
        return pointF;
    }

    @Override // Z.H
    public final void a0(Parcelable parcelable) {
        if (parcelable instanceof d0) {
            this.f2161F = (d0) parcelable;
            i0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, Z.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.os.Parcelable, Z.d0, java.lang.Object] */
    @Override // Z.H
    public final Parcelable b0() {
        int h;
        int k2;
        int[] iArr;
        d0 d0Var = this.f2161F;
        if (d0Var != null) {
            ?? obj = new Object();
            obj.f1247d = d0Var.f1247d;
            obj.f1246b = d0Var.f1246b;
            obj.c = d0Var.c;
            obj.f1248e = d0Var.f1248e;
            obj.f1249f = d0Var.f1249f;
            obj.g = d0Var.g;
            obj.f1250i = d0Var.f1250i;
            obj.f1251j = d0Var.f1251j;
            obj.f1252k = d0Var.f1252k;
            obj.h = d0Var.h;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f1250i = this.f2174w;
        obj2.f1251j = this.D;
        obj2.f1252k = this.f2160E;
        r rVar = this.f2158B;
        if (rVar == null || (iArr = (int[]) rVar.f5124b) == null) {
            obj2.f1249f = 0;
        } else {
            obj2.g = iArr;
            obj2.f1249f = iArr.length;
            obj2.h = (List) rVar.c;
        }
        if (v() > 0) {
            obj2.f1246b = this.D ? I0() : H0();
            View D02 = this.f2175x ? D0(true) : E0(true);
            obj2.c = D02 != null ? H.F(D02) : -1;
            int i3 = this.f2167p;
            obj2.f1247d = i3;
            obj2.f1248e = new int[i3];
            for (int i4 = 0; i4 < this.f2167p; i4++) {
                if (this.D) {
                    h = this.f2168q[i4].f(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f2169r.g();
                        h -= k2;
                        obj2.f1248e[i4] = h;
                    } else {
                        obj2.f1248e[i4] = h;
                    }
                } else {
                    h = this.f2168q[i4].h(Integer.MIN_VALUE);
                    if (h != Integer.MIN_VALUE) {
                        k2 = this.f2169r.k();
                        h -= k2;
                        obj2.f1248e[i4] = h;
                    } else {
                        obj2.f1248e[i4] = h;
                    }
                }
            }
        } else {
            obj2.f1246b = -1;
            obj2.c = -1;
            obj2.f1247d = 0;
        }
        return obj2;
    }

    @Override // Z.H
    public final void c(String str) {
        if (this.f2161F == null) {
            super.c(str);
        }
    }

    @Override // Z.H
    public final void c0(int i3) {
        if (i3 == 0) {
            y0();
        }
    }

    @Override // Z.H
    public final boolean d() {
        return this.f2171t == 0;
    }

    @Override // Z.H
    public final boolean e() {
        return this.f2171t == 1;
    }

    @Override // Z.H
    public final boolean f(I i3) {
        return i3 instanceof b0;
    }

    @Override // Z.H
    public final void h(int i3, int i4, T t3, b bVar) {
        C0049p c0049p;
        int f3;
        int i5;
        if (this.f2171t != 0) {
            i3 = i4;
        }
        if (v() == 0 || i3 == 0) {
            return;
        }
        R0(i3, t3);
        int[] iArr = this.f2165J;
        if (iArr == null || iArr.length < this.f2167p) {
            this.f2165J = new int[this.f2167p];
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = this.f2167p;
            c0049p = this.f2173v;
            if (i6 >= i8) {
                break;
            }
            if (c0049p.f1331d == -1) {
                f3 = c0049p.f1333f;
                i5 = this.f2168q[i6].h(f3);
            } else {
                f3 = this.f2168q[i6].f(c0049p.g);
                i5 = c0049p.g;
            }
            int i9 = f3 - i5;
            if (i9 >= 0) {
                this.f2165J[i7] = i9;
                i7++;
            }
            i6++;
        }
        Arrays.sort(this.f2165J, 0, i7);
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = c0049p.c;
            if (i11 < 0 || i11 >= t3.b()) {
                return;
            }
            bVar.a(c0049p.c, this.f2165J[i10]);
            c0049p.c += c0049p.f1331d;
        }
    }

    @Override // Z.H
    public final int j(T t3) {
        return z0(t3);
    }

    @Override // Z.H
    public final int j0(int i3, N n3, T t3) {
        return W0(i3, n3, t3);
    }

    @Override // Z.H
    public final int k(T t3) {
        return A0(t3);
    }

    @Override // Z.H
    public final void k0(int i3) {
        d0 d0Var = this.f2161F;
        if (d0Var != null && d0Var.f1246b != i3) {
            d0Var.f1248e = null;
            d0Var.f1247d = 0;
            d0Var.f1246b = -1;
            d0Var.c = -1;
        }
        this.f2177z = i3;
        this.f2157A = Integer.MIN_VALUE;
        i0();
    }

    @Override // Z.H
    public final int l(T t3) {
        return B0(t3);
    }

    @Override // Z.H
    public final int l0(int i3, N n3, T t3) {
        return W0(i3, n3, t3);
    }

    @Override // Z.H
    public final int m(T t3) {
        return z0(t3);
    }

    @Override // Z.H
    public final int n(T t3) {
        return A0(t3);
    }

    @Override // Z.H
    public final int o(T t3) {
        return B0(t3);
    }

    @Override // Z.H
    public final void o0(Rect rect, int i3, int i4) {
        int g;
        int g3;
        int i5 = this.f2167p;
        int D = D() + C();
        int B3 = B() + E();
        if (this.f2171t == 1) {
            int height = rect.height() + B3;
            RecyclerView recyclerView = this.f1159b;
            WeakHashMap weakHashMap = J.T.f402a;
            g3 = H.g(i4, height, B.d(recyclerView));
            g = H.g(i3, (this.f2172u * i5) + D, B.e(this.f1159b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f1159b;
            WeakHashMap weakHashMap2 = J.T.f402a;
            g = H.g(i3, width, B.e(recyclerView2));
            g3 = H.g(i4, (this.f2172u * i5) + B3, B.d(this.f1159b));
        }
        this.f1159b.setMeasuredDimension(g, g3);
    }

    @Override // Z.H
    public final I r() {
        return this.f2171t == 0 ? new I(-2, -1) : new I(-1, -2);
    }

    @Override // Z.H
    public final I s(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    @Override // Z.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    @Override // Z.H
    public final void u0(RecyclerView recyclerView, int i3) {
        C0053u c0053u = new C0053u(recyclerView.getContext());
        c0053u.f1353a = i3;
        v0(c0053u);
    }

    @Override // Z.H
    public final boolean w0() {
        return this.f2161F == null;
    }

    @Override // Z.H
    public final int x(N n3, T t3) {
        return this.f2171t == 1 ? this.f2167p : super.x(n3, t3);
    }

    public final int x0(int i3) {
        if (v() == 0) {
            return this.f2175x ? 1 : -1;
        }
        return (i3 < H0()) != this.f2175x ? -1 : 1;
    }

    public final boolean y0() {
        int H02;
        if (v() != 0 && this.f2159C != 0 && this.g) {
            if (this.f2175x) {
                H02 = I0();
                H0();
            } else {
                H02 = H0();
                I0();
            }
            r rVar = this.f2158B;
            if (H02 == 0 && M0() != null) {
                int[] iArr = (int[]) rVar.f5124b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                rVar.c = null;
                this.f1162f = true;
                i0();
                return true;
            }
        }
        return false;
    }

    public final int z0(T t3) {
        if (v() == 0) {
            return 0;
        }
        AbstractC0055w abstractC0055w = this.f2169r;
        boolean z3 = this.f2164I;
        return z.n(t3, abstractC0055w, E0(!z3), D0(!z3), this, this.f2164I);
    }
}
