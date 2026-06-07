package Z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n.C0342k;
import v0.C0403c;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public v0.m f1158a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f1159b;
    public final C0403c c;

    /* renamed from: d, reason: collision with root package name */
    public final C0403c f1160d;

    /* renamed from: e, reason: collision with root package name */
    public C0053u f1161e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1162f;
    public boolean g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1163i;

    /* renamed from: j, reason: collision with root package name */
    public int f1164j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1165k;

    /* renamed from: l, reason: collision with root package name */
    public int f1166l;

    /* renamed from: m, reason: collision with root package name */
    public int f1167m;

    /* renamed from: n, reason: collision with root package name */
    public int f1168n;

    /* renamed from: o, reason: collision with root package name */
    public int f1169o;

    public H() {
        F f3 = new F(this, 0);
        F f4 = new F(this, 1);
        this.c = new C0403c(f3);
        this.f1160d = new C0403c(f4);
        this.f1162f = false;
        this.g = false;
        this.h = true;
        this.f1163i = true;
    }

    public static int F(View view) {
        return ((I) view.getLayoutParams()).f1170a.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z.G, java.lang.Object] */
    public static G G(Context context, AttributeSet attributeSet, int i3, int i4) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.a.f1144a, i3, i4);
        obj.f1155a = obtainStyledAttributes.getInt(0, 1);
        obj.f1156b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.f1157d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean K(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (i5 > 0 && i3 != i5) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i3;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i3;
        }
        return true;
    }

    public static void L(View view, int i3, int i4, int i5, int i6) {
        I i7 = (I) view.getLayoutParams();
        Rect rect = i7.f1171b;
        view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) i7).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) i7).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) i7).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) i7).bottomMargin);
    }

    public static int g(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r5 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(int i3, int i4, int i5, int i6, boolean z3) {
        int max = Math.max(0, i3 - i5);
        if (z3) {
            if (i6 < 0) {
                if (i6 == -1) {
                    if (i4 != Integer.MIN_VALUE) {
                        if (i4 != 0) {
                        }
                    }
                    i6 = max;
                }
                i4 = 0;
                i6 = 0;
            }
            i4 = 1073741824;
        } else {
            if (i6 < 0) {
                if (i6 != -1) {
                    if (i6 == -2) {
                        if (i4 == Integer.MIN_VALUE || i4 == 1073741824) {
                            i6 = max;
                            i4 = Integer.MIN_VALUE;
                        } else {
                            i6 = max;
                            i4 = 0;
                        }
                    }
                    i4 = 0;
                    i6 = 0;
                }
                i6 = max;
            }
            i4 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i6, i4);
    }

    public final int A() {
        RecyclerView recyclerView = this.f1159b;
        WeakHashMap weakHashMap = J.T.f402a;
        return J.C.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(N n3, T t3) {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView == null || recyclerView.f2134l == null || !e()) {
            return 1;
        }
        return this.f1159b.f2134l.a();
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((I) view.getLayoutParams()).f1171b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f1159b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f1159b.f2132k;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i3) {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            int p3 = recyclerView.f2125f.p();
            for (int i4 = 0; i4 < p3; i4++) {
                recyclerView.f2125f.o(i4).offsetLeftAndRight(i3);
            }
        }
    }

    public void N(int i3) {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            int p3 = recyclerView.f2125f.p();
            for (int i4 = 0; i4 < p3; i4++) {
                recyclerView.f2125f.o(i4).offsetTopAndBottom(i3);
            }
        }
    }

    public void O(RecyclerView recyclerView) {
    }

    public View P(View view, int i3, N n3, T t3) {
        return null;
    }

    public void Q(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f1159b;
        N n3 = recyclerView.c;
        T t3 = recyclerView.f2122d0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f1159b.canScrollVertically(-1) && !this.f1159b.canScrollHorizontally(-1) && !this.f1159b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        AbstractC0058z abstractC0058z = this.f1159b.f2134l;
        if (abstractC0058z != null) {
            accessibilityEvent.setItemCount(abstractC0058z.a());
        }
    }

    public void R(N n3, T t3, View view, K.p pVar) {
        pVar.h(K.o.a(e() ? F(view) : 0, 1, d() ? F(view) : 0, 1, false));
    }

    public final void S(View view, K.p pVar) {
        W I2 = RecyclerView.I(view);
        if (I2 == null || I2.j() || ((ArrayList) this.f1158a.f5088e).contains(I2.f1205a)) {
            return;
        }
        RecyclerView recyclerView = this.f1159b;
        R(recyclerView.c, recyclerView.f2122d0, view, pVar);
    }

    public void T(int i3, int i4) {
    }

    public void U() {
    }

    public void V(int i3, int i4) {
    }

    public void W(int i3, int i4) {
    }

    public void X(int i3, int i4) {
    }

    public abstract void Y(N n3, T t3);

    public abstract void Z(T t3);

    public void a0(Parcelable parcelable) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, int i3, boolean z3) {
        int b3;
        W I2 = RecyclerView.I(view);
        if (z3 || I2.j()) {
            C0342k c0342k = (C0342k) this.f1159b.g.f5071b;
            f0 f0Var = (f0) c0342k.getOrDefault(I2, null);
            if (f0Var == null) {
                f0Var = f0.a();
                c0342k.put(I2, f0Var);
            }
            f0Var.f1268a |= 1;
        } else {
            this.f1159b.g.o(I2);
        }
        I i4 = (I) view.getLayoutParams();
        if (I2.r() || I2.k()) {
            if (I2.k()) {
                I2.f1215n.j(I2);
            } else {
                I2.f1211j &= -33;
            }
            this.f1158a.c(view, i3, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f1159b) {
                v0.m mVar = this.f1158a;
                int indexOfChild = ((C0057y) mVar.c).f1371a.indexOfChild(view);
                if (indexOfChild != -1) {
                    C0035b c0035b = (C0035b) mVar.f5087d;
                    if (!c0035b.d(indexOfChild)) {
                        b3 = indexOfChild - c0035b.b(indexOfChild);
                        if (i3 == -1) {
                            i3 = this.f1158a.p();
                        }
                        if (b3 != -1) {
                            throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1159b.indexOfChild(view) + this.f1159b.y());
                        }
                        if (b3 != i3) {
                            H h = this.f1159b.f2136m;
                            View u3 = h.u(b3);
                            if (u3 == null) {
                                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b3 + h.f1159b.toString());
                            }
                            h.u(b3);
                            h.f1158a.i(b3);
                            I i5 = (I) u3.getLayoutParams();
                            W I3 = RecyclerView.I(u3);
                            if (I3.j()) {
                                C0342k c0342k2 = (C0342k) h.f1159b.g.f5071b;
                                f0 f0Var2 = (f0) c0342k2.getOrDefault(I3, null);
                                if (f0Var2 == null) {
                                    f0Var2 = f0.a();
                                    c0342k2.put(I3, f0Var2);
                                }
                                f0Var2.f1268a = 1 | f0Var2.f1268a;
                            } else {
                                h.f1159b.g.o(I3);
                            }
                            h.f1158a.c(u3, i3, i5, I3.j());
                        }
                    }
                }
                b3 = -1;
                if (i3 == -1) {
                }
                if (b3 != -1) {
                }
            } else {
                this.f1158a.b(view, i3, false);
                i4.c = true;
                C0053u c0053u = this.f1161e;
                if (c0053u != null && c0053u.f1356e) {
                    c0053u.f1354b.getClass();
                    W I4 = RecyclerView.I(view);
                    if ((I4 != null ? I4.c() : -1) == c0053u.f1353a) {
                        c0053u.f1357f = view;
                    }
                }
            }
        }
        if (i4.f1172d) {
            I2.f1205a.invalidate();
            i4.f1172d = false;
        }
    }

    public Parcelable b0() {
        return null;
    }

    public void c(String str) {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            recyclerView.i(str);
        }
    }

    public void c0(int i3) {
    }

    public abstract boolean d();

    public final void d0(N n3) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            if (!RecyclerView.I(u(v3)).q()) {
                View u3 = u(v3);
                g0(v3);
                n3.f(u3);
            }
        }
    }

    public abstract boolean e();

    public final void e0(N n3) {
        ArrayList arrayList;
        int size = n3.f1178a.size();
        int i3 = size - 1;
        while (true) {
            arrayList = n3.f1178a;
            if (i3 < 0) {
                break;
            }
            View view = ((W) arrayList.get(i3)).f1205a;
            W I2 = RecyclerView.I(view);
            if (!I2.q()) {
                I2.p(false);
                if (I2.l()) {
                    this.f1159b.removeDetachedView(view, false);
                }
                D d3 = this.f1159b.f2102I;
                if (d3 != null) {
                    d3.d(I2);
                }
                I2.p(true);
                W I3 = RecyclerView.I(view);
                I3.f1215n = null;
                I3.f1216o = false;
                I3.f1211j &= -33;
                n3.g(I3);
            }
            i3--;
        }
        arrayList.clear();
        ArrayList arrayList2 = n3.f1179b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f1159b.invalidate();
        }
    }

    public boolean f(I i3) {
        return i3 != null;
    }

    public final void f0(View view, N n3) {
        v0.m mVar = this.f1158a;
        C0057y c0057y = (C0057y) mVar.c;
        int indexOfChild = c0057y.f1371a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((C0035b) mVar.f5087d).g(indexOfChild)) {
                mVar.L(view);
            }
            c0057y.h(indexOfChild);
        }
        n3.f(view);
    }

    public final void g0(int i3) {
        if (u(i3) != null) {
            v0.m mVar = this.f1158a;
            int v3 = mVar.v(i3);
            C0057y c0057y = (C0057y) mVar.c;
            View childAt = c0057y.f1371a.getChildAt(v3);
            if (childAt == null) {
                return;
            }
            if (((C0035b) mVar.f5087d).g(v3)) {
                mVar.L(childAt);
            }
            c0057y.h(v3);
        }
    }

    public void h(int i3, int i4, T t3, C0.b bVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int C2 = C();
        int E2 = E();
        int D = this.f1168n - D();
        int B3 = this.f1169o - B();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - C2;
        int min = Math.min(0, i3);
        int i4 = top - E2;
        int min2 = Math.min(0, i4);
        int i5 = width - D;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - B3);
        if (A() != 1) {
            if (min == 0) {
                min = Math.min(i3, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i5);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int C3 = C();
                int E3 = E();
                int D2 = this.f1168n - D();
                int B4 = this.f1169o - B();
                Rect rect2 = this.f1159b.f2129i;
                y(focusedChild, rect2);
                if (rect2.left - i6 < D2) {
                    if (rect2.right - i6 > C3) {
                        if (rect2.top - i7 < B4) {
                        }
                    }
                }
            }
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            if (z3) {
                recyclerView.scrollBy(i6, i7);
            } else {
                recyclerView.b0(i6, i7, false);
            }
            return true;
        }
        return false;
    }

    public void i(int i3, C0.b bVar) {
    }

    public final void i0() {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int j(T t3);

    public abstract int j0(int i3, N n3, T t3);

    public abstract int k(T t3);

    public abstract void k0(int i3);

    public abstract int l(T t3);

    public abstract int l0(int i3, N n3, T t3);

    public abstract int m(T t3);

    public final void m0(RecyclerView recyclerView) {
        n0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int n(T t3);

    public final void n0(int i3, int i4) {
        this.f1168n = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        this.f1166l = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f2092t0;
        }
        this.f1169o = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f1167m = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f2092t0;
        }
    }

    public abstract int o(T t3);

    public void o0(Rect rect, int i3, int i4) {
        int D = D() + C() + rect.width();
        int B3 = B() + E() + rect.height();
        RecyclerView recyclerView = this.f1159b;
        WeakHashMap weakHashMap = J.T.f402a;
        RecyclerView.e(this.f1159b, g(i3, D, J.B.e(recyclerView)), g(i4, B3, J.B.d(this.f1159b)));
    }

    public final void p(N n3) {
        for (int v3 = v() - 1; v3 >= 0; v3--) {
            View u3 = u(v3);
            W I2 = RecyclerView.I(u3);
            if (!I2.q()) {
                if (!I2.h() || I2.j() || this.f1159b.f2134l.f1373b) {
                    u(v3);
                    this.f1158a.i(v3);
                    n3.h(u3);
                    this.f1159b.g.o(I2);
                } else {
                    g0(v3);
                    n3.g(I2);
                }
            }
        }
    }

    public final void p0(int i3, int i4) {
        int v3 = v();
        if (v3 == 0) {
            this.f1159b.n(i3, i4);
            return;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < v3; i9++) {
            View u3 = u(i9);
            Rect rect = this.f1159b.f2129i;
            y(u3, rect);
            int i10 = rect.left;
            if (i10 < i8) {
                i8 = i10;
            }
            int i11 = rect.right;
            if (i11 > i5) {
                i5 = i11;
            }
            int i12 = rect.top;
            if (i12 < i6) {
                i6 = i12;
            }
            int i13 = rect.bottom;
            if (i13 > i7) {
                i7 = i13;
            }
        }
        this.f1159b.f2129i.set(i8, i6, i5, i7);
        o0(this.f1159b.f2129i, i3, i4);
    }

    public View q(int i3) {
        int v3 = v();
        for (int i4 = 0; i4 < v3; i4++) {
            View u3 = u(i4);
            W I2 = RecyclerView.I(u3);
            if (I2 != null && I2.c() == i3 && !I2.q() && (this.f1159b.f2122d0.g || !I2.j())) {
                return u3;
            }
        }
        return null;
    }

    public final void q0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f1159b = null;
            this.f1158a = null;
            this.f1168n = 0;
            this.f1169o = 0;
        } else {
            this.f1159b = recyclerView;
            this.f1158a = recyclerView.f2125f;
            this.f1168n = recyclerView.getWidth();
            this.f1169o = recyclerView.getHeight();
        }
        this.f1166l = 1073741824;
        this.f1167m = 1073741824;
    }

    public abstract I r();

    public final boolean r0(View view, int i3, int i4, I i5) {
        return (!view.isLayoutRequested() && this.h && K(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) i5).width) && K(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) i5).height)) ? false : true;
    }

    public I s(Context context, AttributeSet attributeSet) {
        return new I(context, attributeSet);
    }

    public boolean s0() {
        return false;
    }

    public I t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof I ? new I((I) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new I((ViewGroup.MarginLayoutParams) layoutParams) : new I(layoutParams);
    }

    public final boolean t0(View view, int i3, int i4, I i5) {
        return (this.h && K(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) i5).width) && K(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) i5).height)) ? false : true;
    }

    public final View u(int i3) {
        v0.m mVar = this.f1158a;
        if (mVar != null) {
            return mVar.o(i3);
        }
        return null;
    }

    public abstract void u0(RecyclerView recyclerView, int i3);

    public final int v() {
        v0.m mVar = this.f1158a;
        if (mVar != null) {
            return mVar.p();
        }
        return 0;
    }

    public final void v0(C0053u c0053u) {
        C0053u c0053u2 = this.f1161e;
        if (c0053u2 != null && c0053u != c0053u2 && c0053u2.f1356e) {
            c0053u2.i();
        }
        this.f1161e = c0053u;
        RecyclerView recyclerView = this.f1159b;
        V v3 = recyclerView.f2117a0;
        v3.h.removeCallbacks(v3);
        v3.f1201d.abortAnimation();
        c0053u.f1354b = recyclerView;
        c0053u.c = this;
        int i3 = c0053u.f1353a;
        if (i3 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f2122d0.f1189a = i3;
        c0053u.f1356e = true;
        c0053u.f1355d = true;
        c0053u.f1357f = recyclerView.f2136m.q(i3);
        c0053u.f1354b.f2117a0.a();
    }

    public boolean w0() {
        return false;
    }

    public int x(N n3, T t3) {
        RecyclerView recyclerView = this.f1159b;
        if (recyclerView == null || recyclerView.f2134l == null || !d()) {
            return 1;
        }
        return this.f1159b.f2134l.a();
    }

    public void y(View view, Rect rect) {
        int[] iArr = RecyclerView.f2092t0;
        I i3 = (I) view.getLayoutParams();
        Rect rect2 = i3.f1171b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i3).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i3).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i3).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i3).bottomMargin);
    }

    public final int z() {
        RecyclerView recyclerView = this.f1159b;
        AbstractC0058z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }
}
