package androidx.recyclerview.widget;

import C0.b;
import J.B;
import K.o;
import K.p;
import X.d;
import Z.C0048o;
import Z.C0050q;
import Z.C0051s;
import Z.H;
import Z.I;
import Z.N;
import Z.T;
import Z.r;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.WeakHashMap;
import v0.l;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public boolean f2070E;

    /* renamed from: F, reason: collision with root package name */
    public int f2071F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f2072G;

    /* renamed from: H, reason: collision with root package name */
    public View[] f2073H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseIntArray f2074I;

    /* renamed from: J, reason: collision with root package name */
    public final SparseIntArray f2075J;

    /* renamed from: K, reason: collision with root package name */
    public final l f2076K;

    /* renamed from: L, reason: collision with root package name */
    public final Rect f2077L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f2070E = false;
        this.f2071F = -1;
        this.f2074I = new SparseIntArray();
        this.f2075J = new SparseIntArray();
        this.f2076K = new l(3);
        this.f2077L = new Rect();
        i1(H.G(context, attributeSet, i3, i4).f1156b);
    }

    @Override // Z.H
    public final int H(N n3, T t3) {
        if (this.f2081p == 0) {
            return this.f2071F;
        }
        if (t3.b() < 1) {
            return 0;
        }
        return e1(t3.b() - 1, n3, t3) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View K0(N n3, T t3, int i3, int i4, int i5) {
        D0();
        int k2 = this.f2083r.k();
        int g = this.f2083r.g();
        int i6 = i4 > i3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i3 != i4) {
            View u3 = u(i3);
            int F2 = H.F(u3);
            if (F2 >= 0 && F2 < i5 && f1(F2, n3, t3) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010b, code lost:
    
        if (r13 == (r2 > r8 ? r9 : false)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x001e, code lost:
    
        if (r22.f1158a.B(r3) != false) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View P(View view, int i3, N n3, T t3) {
        View A3;
        int v3;
        int i4;
        int i5;
        View view2;
        View view3;
        int i6;
        boolean z3;
        boolean z4;
        N n4 = n3;
        T t4 = t3;
        RecyclerView recyclerView = this.f1159b;
        View view4 = null;
        if (recyclerView != null) {
            A3 = recyclerView.A(view);
            if (A3 != null) {
            }
        }
        A3 = null;
        if (A3 == null) {
            return null;
        }
        C0048o c0048o = (C0048o) A3.getLayoutParams();
        int i7 = c0048o.f1327e;
        int i8 = c0048o.f1328f + i7;
        if (super.P(view, i3, n3, t3) == null) {
            return null;
        }
        if ((C0(i3) == 1) != this.f2086u) {
            i5 = v() - 1;
            v3 = -1;
            i4 = -1;
        } else {
            v3 = v();
            i4 = 1;
            i5 = 0;
        }
        boolean z5 = this.f2081p == 1 && P0();
        int e12 = e1(i5, n4, t4);
        int i9 = -1;
        int i10 = -1;
        int i11 = i4;
        int i12 = 0;
        int i13 = 0;
        int i14 = i5;
        View view5 = null;
        while (i14 != v3) {
            int i15 = v3;
            int e13 = e1(i14, n4, t4);
            View u3 = u(i14);
            if (u3 == A3) {
                break;
            }
            if (!u3.hasFocusable() || e13 == e12) {
                C0048o c0048o2 = (C0048o) u3.getLayoutParams();
                int i16 = c0048o2.f1327e;
                view2 = A3;
                int i17 = c0048o2.f1328f + i16;
                if (u3.hasFocusable() && i16 == i7 && i17 == i8) {
                    return u3;
                }
                if (!(u3.hasFocusable() && view4 == null) && (u3.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i17, i8) - Math.max(i16, i7);
                    if (u3.hasFocusable()) {
                        if (min <= i12) {
                            if (min == i12) {
                            }
                        }
                    } else if (view4 == null) {
                        i6 = i12;
                        if (this.c.l(u3) && this.f1160d.l(u3)) {
                            z3 = true;
                            z4 = true;
                        } else {
                            z3 = true;
                            z4 = false;
                        }
                        if (!z4) {
                            if (min <= i13) {
                                if (min == i13) {
                                }
                            }
                            if (u3.hasFocusable()) {
                                int i18 = c0048o2.f1327e;
                                i13 = Math.min(i17, i8) - Math.max(i16, i7);
                                i9 = i18;
                                view5 = u3;
                            } else {
                                int i19 = c0048o2.f1327e;
                                i6 = Math.min(i17, i8) - Math.max(i16, i7);
                                i10 = i19;
                                view5 = view3;
                                view4 = u3;
                            }
                            i14 += i11;
                            n4 = n3;
                            t4 = t3;
                            v3 = i15;
                            A3 = view2;
                            i12 = i6;
                        }
                        view5 = view3;
                        i14 += i11;
                        n4 = n3;
                        t4 = t3;
                        v3 = i15;
                        A3 = view2;
                        i12 = i6;
                    }
                } else {
                    view3 = view5;
                }
                i6 = i12;
                if (u3.hasFocusable()) {
                }
                i14 += i11;
                n4 = n3;
                t4 = t3;
                v3 = i15;
                A3 = view2;
                i12 = i6;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = A3;
                view3 = view5;
            }
            i6 = i12;
            view5 = view3;
            i14 += i11;
            n4 = n3;
            t4 = t3;
            v3 = i15;
            A3 = view2;
            i12 = i6;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        r22.f1340b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(N n3, T t3, C0051s c0051s, r rVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int w3;
        int i10;
        ?? r8;
        int i11;
        View b3;
        int j3 = this.f2083r.j();
        boolean z3 = j3 != 1073741824;
        int i12 = v() > 0 ? this.f2072G[this.f2071F] : 0;
        if (z3) {
            j1();
        }
        boolean z4 = c0051s.f1345e == 1;
        int i13 = this.f2071F;
        if (!z4) {
            i13 = f1(c0051s.f1344d, n3, t3) + g1(c0051s.f1344d, n3, t3);
        }
        int i14 = 0;
        while (i14 < this.f2071F && (i11 = c0051s.f1344d) >= 0 && i11 < t3.b() && i13 > 0) {
            int i15 = c0051s.f1344d;
            int g12 = g1(i15, n3, t3);
            if (g12 > this.f2071F) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + g12 + " spans but GridLayoutManager has only " + this.f2071F + " spans.");
            }
            i13 -= g12;
            if (i13 < 0 || (b3 = c0051s.b(n3)) == null) {
                break;
            }
            this.f2073H[i14] = b3;
            i14++;
        }
        if (z4) {
            i5 = 1;
            i4 = i14;
            i3 = 0;
        } else {
            i3 = i14 - 1;
            i4 = -1;
            i5 = -1;
        }
        int i16 = 0;
        while (i3 != i4) {
            View view = this.f2073H[i3];
            C0048o c0048o = (C0048o) view.getLayoutParams();
            int g13 = g1(H.F(view), n3, t3);
            c0048o.f1328f = g13;
            c0048o.f1327e = i16;
            i16 += g13;
            i3 += i5;
        }
        float f3 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.f2073H[i18];
            if (c0051s.f1349k != null) {
                r8 = 0;
                r8 = 0;
                if (z4) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z4) {
                r8 = 0;
                b(view2, -1, false);
            } else {
                r8 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f1159b;
            Rect rect = this.f2077L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.J(view2));
            }
            h1(view2, j3, r8);
            int c = this.f2083r.c(view2);
            if (c > i17) {
                i17 = c;
            }
            float d3 = (this.f2083r.d(view2) * 1.0f) / ((C0048o) view2.getLayoutParams()).f1328f;
            if (d3 > f3) {
                f3 = d3;
            }
        }
        if (z3) {
            b1(Math.max(Math.round(f3 * this.f2071F), i12));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.f2073H[i19];
                h1(view3, 1073741824, true);
                int c3 = this.f2083r.c(view3);
                if (c3 > i17) {
                    i17 = c3;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.f2073H[i20];
            if (this.f2083r.c(view4) != i17) {
                C0048o c0048o2 = (C0048o) view4.getLayoutParams();
                Rect rect2 = c0048o2.f1171b;
                int i21 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0048o2).topMargin + ((ViewGroup.MarginLayoutParams) c0048o2).bottomMargin;
                int i22 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0048o2).leftMargin + ((ViewGroup.MarginLayoutParams) c0048o2).rightMargin;
                int d12 = d1(c0048o2.f1327e, c0048o2.f1328f);
                if (this.f2081p == 1) {
                    i10 = H.w(d12, 1073741824, i22, ((ViewGroup.MarginLayoutParams) c0048o2).width, false);
                    w3 = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    w3 = H.w(d12, 1073741824, i21, ((ViewGroup.MarginLayoutParams) c0048o2).height, false);
                    i10 = makeMeasureSpec;
                }
                if (t0(view4, i10, w3, (I) view4.getLayoutParams())) {
                    view4.measure(i10, w3);
                }
            }
        }
        rVar.f1339a = i17;
        if (this.f2081p != 1) {
            if (c0051s.f1346f == -1) {
                int i23 = c0051s.f1343b;
                i7 = i23 - i17;
                i6 = i23;
            } else {
                int i24 = c0051s.f1343b;
                i6 = i24 + i17;
                i7 = i24;
            }
            i8 = 0;
            i9 = 0;
        } else if (c0051s.f1346f == -1) {
            int i25 = c0051s.f1343b;
            i7 = 0;
            i6 = 0;
            i9 = i25 - i17;
            i8 = i25;
        } else {
            i9 = c0051s.f1343b;
            i8 = i9 + i17;
            i7 = 0;
            i6 = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.f2073H[i26];
            C0048o c0048o3 = (C0048o) view5.getLayoutParams();
            if (this.f2081p != 1) {
                int E2 = E() + this.f2072G[c0048o3.f1327e];
                i9 = E2;
                i8 = this.f2083r.d(view5) + E2;
            } else if (P0()) {
                int C2 = C() + this.f2072G[this.f2071F - c0048o3.f1327e];
                i6 = C2;
                i7 = C2 - this.f2083r.d(view5);
            } else {
                i7 = C() + this.f2072G[c0048o3.f1327e];
                i6 = this.f2083r.d(view5) + i7;
            }
            H.L(view5, i7, i9, i6, i8);
            if (c0048o3.f1170a.j() || c0048o3.f1170a.m()) {
                rVar.c = true;
            }
            rVar.f1341d = view5.hasFocusable() | rVar.f1341d;
        }
        Arrays.fill(this.f2073H, (Object) null);
    }

    @Override // Z.H
    public final void R(N n3, T t3, View view, p pVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0048o)) {
            S(view, pVar);
            return;
        }
        C0048o c0048o = (C0048o) layoutParams;
        int e12 = e1(c0048o.f1170a.c(), n3, t3);
        if (this.f2081p == 0) {
            pVar.h(o.a(c0048o.f1327e, c0048o.f1328f, e12, 1, false));
        } else {
            pVar.h(o.a(e12, 1, c0048o.f1327e, c0048o.f1328f, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(N n3, T t3, C0050q c0050q, int i3) {
        j1();
        if (t3.b() > 0 && !t3.g) {
            boolean z3 = i3 == 1;
            int f12 = f1(c0050q.f1336b, n3, t3);
            if (z3) {
                while (f12 > 0) {
                    int i4 = c0050q.f1336b;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    c0050q.f1336b = i5;
                    f12 = f1(i5, n3, t3);
                }
            } else {
                int b3 = t3.b() - 1;
                int i6 = c0050q.f1336b;
                while (i6 < b3) {
                    int i7 = i6 + 1;
                    int f13 = f1(i7, n3, t3);
                    if (f13 <= f12) {
                        break;
                    }
                    i6 = i7;
                    f12 = f13;
                }
                c0050q.f1336b = i6;
            }
        }
        c1();
    }

    @Override // Z.H
    public final void T(int i3, int i4) {
        l lVar = this.f2076K;
        lVar.f();
        ((SparseIntArray) lVar.f5084e).clear();
    }

    @Override // Z.H
    public final void U() {
        l lVar = this.f2076K;
        lVar.f();
        ((SparseIntArray) lVar.f5084e).clear();
    }

    @Override // Z.H
    public final void V(int i3, int i4) {
        l lVar = this.f2076K;
        lVar.f();
        ((SparseIntArray) lVar.f5084e).clear();
    }

    @Override // Z.H
    public final void W(int i3, int i4) {
        l lVar = this.f2076K;
        lVar.f();
        ((SparseIntArray) lVar.f5084e).clear();
    }

    @Override // Z.H
    public final void X(int i3, int i4) {
        l lVar = this.f2076K;
        lVar.f();
        ((SparseIntArray) lVar.f5084e).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.X0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final void Y(N n3, T t3) {
        boolean z3 = t3.g;
        SparseIntArray sparseIntArray = this.f2075J;
        SparseIntArray sparseIntArray2 = this.f2074I;
        if (z3) {
            int v3 = v();
            for (int i3 = 0; i3 < v3; i3++) {
                C0048o c0048o = (C0048o) u(i3).getLayoutParams();
                int c = c0048o.f1170a.c();
                sparseIntArray2.put(c, c0048o.f1328f);
                sparseIntArray.put(c, c0048o.f1327e);
            }
        }
        super.Y(n3, t3);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final void Z(T t3) {
        super.Z(t3);
        this.f2070E = false;
    }

    public final void b1(int i3) {
        int i4;
        int[] iArr = this.f2072G;
        int i5 = this.f2071F;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i3) {
            iArr = new int[i5 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i3 / i5;
        int i8 = i3 % i5;
        int i9 = 0;
        for (int i10 = 1; i10 <= i5; i10++) {
            i6 += i8;
            if (i6 <= 0 || i5 - i6 >= i8) {
                i4 = i7;
            } else {
                i4 = i7 + 1;
                i6 -= i5;
            }
            i9 += i4;
            iArr[i10] = i9;
        }
        this.f2072G = iArr;
    }

    public final void c1() {
        View[] viewArr = this.f2073H;
        if (viewArr == null || viewArr.length != this.f2071F) {
            this.f2073H = new View[this.f2071F];
        }
    }

    public final int d1(int i3, int i4) {
        if (this.f2081p != 1 || !P0()) {
            int[] iArr = this.f2072G;
            return iArr[i4 + i3] - iArr[i3];
        }
        int[] iArr2 = this.f2072G;
        int i5 = this.f2071F;
        return iArr2[i5 - i3] - iArr2[(i5 - i3) - i4];
    }

    public final int e1(int i3, N n3, T t3) {
        boolean z3 = t3.g;
        l lVar = this.f2076K;
        if (!z3) {
            int i4 = this.f2071F;
            lVar.getClass();
            return l.e(i3, i4);
        }
        int b3 = n3.b(i3);
        if (b3 == -1) {
            return 0;
        }
        int i5 = this.f2071F;
        lVar.getClass();
        return l.e(b3, i5);
    }

    @Override // Z.H
    public final boolean f(I i3) {
        return i3 instanceof C0048o;
    }

    public final int f1(int i3, N n3, T t3) {
        boolean z3 = t3.g;
        l lVar = this.f2076K;
        if (!z3) {
            int i4 = this.f2071F;
            lVar.getClass();
            return i3 % i4;
        }
        int i5 = this.f2075J.get(i3, -1);
        if (i5 != -1) {
            return i5;
        }
        int b3 = n3.b(i3);
        if (b3 == -1) {
            return 0;
        }
        int i6 = this.f2071F;
        lVar.getClass();
        return b3 % i6;
    }

    public final int g1(int i3, N n3, T t3) {
        boolean z3 = t3.g;
        l lVar = this.f2076K;
        if (!z3) {
            lVar.getClass();
            return 1;
        }
        int i4 = this.f2074I.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        if (n3.b(i3) == -1) {
            return 1;
        }
        lVar.getClass();
        return 1;
    }

    public final void h1(View view, int i3, boolean z3) {
        int i4;
        int i5;
        C0048o c0048o = (C0048o) view.getLayoutParams();
        Rect rect = c0048o.f1171b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0048o).topMargin + ((ViewGroup.MarginLayoutParams) c0048o).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0048o).leftMargin + ((ViewGroup.MarginLayoutParams) c0048o).rightMargin;
        int d12 = d1(c0048o.f1327e, c0048o.f1328f);
        if (this.f2081p == 1) {
            i5 = H.w(d12, i3, i7, ((ViewGroup.MarginLayoutParams) c0048o).width, false);
            i4 = H.w(this.f2083r.l(), this.f1167m, i6, ((ViewGroup.MarginLayoutParams) c0048o).height, true);
        } else {
            int w3 = H.w(d12, i3, i6, ((ViewGroup.MarginLayoutParams) c0048o).height, false);
            int w4 = H.w(this.f2083r.l(), this.f1166l, i7, ((ViewGroup.MarginLayoutParams) c0048o).width, true);
            i4 = w3;
            i5 = w4;
        }
        I i8 = (I) view.getLayoutParams();
        if (z3 ? t0(view, i5, i4, i8) : r0(view, i5, i4, i8)) {
            view.measure(i5, i4);
        }
    }

    public final void i1(int i3) {
        if (i3 == this.f2071F) {
            return;
        }
        this.f2070E = true;
        if (i3 < 1) {
            throw new IllegalArgumentException(d.f("Span count should be at least 1. Provided ", i3));
        }
        this.f2071F = i3;
        this.f2076K.f();
        i0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final int j0(int i3, N n3, T t3) {
        j1();
        c1();
        return super.j0(i3, n3, t3);
    }

    public final void j1() {
        int B3;
        int E2;
        if (this.f2081p == 1) {
            B3 = this.f1168n - D();
            E2 = C();
        } else {
            B3 = this.f1169o - B();
            E2 = E();
        }
        b1(B3 - E2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final int k(T t3) {
        return A0(t3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final int l(T t3) {
        return B0(t3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final int l0(int i3, N n3, T t3) {
        j1();
        c1();
        return super.l0(i3, n3, t3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final int n(T t3) {
        return A0(t3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final int o(T t3) {
        return B0(t3);
    }

    @Override // Z.H
    public final void o0(Rect rect, int i3, int i4) {
        int g;
        int g3;
        if (this.f2072G == null) {
            super.o0(rect, i3, i4);
        }
        int D = D() + C();
        int B3 = B() + E();
        if (this.f2081p == 1) {
            int height = rect.height() + B3;
            RecyclerView recyclerView = this.f1159b;
            WeakHashMap weakHashMap = J.T.f402a;
            g3 = H.g(i4, height, B.d(recyclerView));
            int[] iArr = this.f2072G;
            g = H.g(i3, iArr[iArr.length - 1] + D, B.e(this.f1159b));
        } else {
            int width = rect.width() + D;
            RecyclerView recyclerView2 = this.f1159b;
            WeakHashMap weakHashMap2 = J.T.f402a;
            g = H.g(i3, width, B.e(recyclerView2));
            int[] iArr2 = this.f2072G;
            g3 = H.g(i4, iArr2[iArr2.length - 1] + B3, B.d(this.f1159b));
        }
        this.f1159b.setMeasuredDimension(g, g3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final I r() {
        return this.f2081p == 0 ? new C0048o(-2, -1) : new C0048o(-1, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z.I, Z.o] */
    @Override // Z.H
    public final I s(Context context, AttributeSet attributeSet) {
        ?? i3 = new I(context, attributeSet);
        i3.f1327e = -1;
        i3.f1328f = 0;
        return i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z.I, Z.o] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z.I, Z.o] */
    @Override // Z.H
    public final I t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ?? i3 = new I((ViewGroup.MarginLayoutParams) layoutParams);
            i3.f1327e = -1;
            i3.f1328f = 0;
            return i3;
        }
        ?? i4 = new I(layoutParams);
        i4.f1327e = -1;
        i4.f1328f = 0;
        return i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, Z.H
    public final boolean w0() {
        return this.f2091z == null && !this.f2070E;
    }

    @Override // Z.H
    public final int x(N n3, T t3) {
        if (this.f2081p == 1) {
            return this.f2071F;
        }
        if (t3.b() < 1) {
            return 0;
        }
        return e1(t3.b() - 1, n3, t3) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void y0(T t3, C0051s c0051s, b bVar) {
        int i3;
        int i4 = this.f2071F;
        for (int i5 = 0; i5 < this.f2071F && (i3 = c0051s.f1344d) >= 0 && i3 < t3.b() && i4 > 0; i5++) {
            bVar.a(c0051s.f1344d, Math.max(0, c0051s.g));
            this.f2076K.getClass();
            i4--;
            c0051s.f1344d += c0051s.f1345e;
        }
    }

    public GridLayoutManager(int i3) {
        super(1);
        this.f2070E = false;
        this.f2071F = -1;
        this.f2074I = new SparseIntArray();
        this.f2075J = new SparseIntArray();
        this.f2076K = new l(3);
        this.f2077L = new Rect();
        i1(i3);
    }
}
