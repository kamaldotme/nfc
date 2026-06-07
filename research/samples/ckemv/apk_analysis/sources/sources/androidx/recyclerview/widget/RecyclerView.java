package androidx.recyclerview.widget;

import A1.i;
import C0.b;
import F.j;
import F.k;
import F0.h;
import H0.a;
import J.B;
import J.C0015n;
import K.AbstractC0028b;
import Q.d;
import U0.e;
import Z.AbstractC0055w;
import Z.AbstractC0058z;
import Z.C;
import Z.C0034a;
import Z.C0035b;
import Z.C0042i;
import Z.C0045l;
import Z.C0053u;
import Z.C0056x;
import Z.C0057y;
import Z.D;
import Z.E;
import Z.H;
import Z.I;
import Z.J;
import Z.K;
import Z.L;
import Z.M;
import Z.N;
import Z.O;
import Z.P;
import Z.RunnableC0047n;
import Z.S;
import Z.T;
import Z.U;
import Z.V;
import Z.W;
import Z.Y;
import Z.f0;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import n.C0336e;
import n.C0342k;
import v0.m;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: t0 */
    public static final int[] f2092t0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: u0 */
    public static final Class[] f2093u0;

    /* renamed from: v0 */
    public static final d f2094v0;

    /* renamed from: A */
    public boolean f2095A;

    /* renamed from: B */
    public int f2096B;

    /* renamed from: C */
    public int f2097C;
    public C D;

    /* renamed from: E */
    public EdgeEffect f2098E;

    /* renamed from: F */
    public EdgeEffect f2099F;

    /* renamed from: G */
    public EdgeEffect f2100G;

    /* renamed from: H */
    public EdgeEffect f2101H;

    /* renamed from: I */
    public D f2102I;

    /* renamed from: J */
    public int f2103J;

    /* renamed from: K */
    public int f2104K;

    /* renamed from: L */
    public VelocityTracker f2105L;

    /* renamed from: M */
    public int f2106M;

    /* renamed from: N */
    public int f2107N;

    /* renamed from: O */
    public int f2108O;

    /* renamed from: P */
    public int f2109P;

    /* renamed from: Q */
    public int f2110Q;

    /* renamed from: R */
    public J f2111R;

    /* renamed from: S */
    public final int f2112S;

    /* renamed from: T */
    public final int f2113T;

    /* renamed from: U */
    public final float f2114U;

    /* renamed from: V */
    public final float f2115V;

    /* renamed from: W */
    public boolean f2116W;

    /* renamed from: a0 */
    public final V f2117a0;

    /* renamed from: b */
    public final e f2118b;

    /* renamed from: b0 */
    public RunnableC0047n f2119b0;
    public final N c;

    /* renamed from: c0 */
    public final b f2120c0;

    /* renamed from: d */
    public P f2121d;

    /* renamed from: d0 */
    public final T f2122d0;

    /* renamed from: e */
    public final G.e f2123e;

    /* renamed from: e0 */
    public K f2124e0;

    /* renamed from: f */
    public final m f2125f;

    /* renamed from: f0 */
    public ArrayList f2126f0;
    public final v0.e g;

    /* renamed from: g0 */
    public boolean f2127g0;
    public boolean h;

    /* renamed from: h0 */
    public boolean f2128h0;

    /* renamed from: i */
    public final Rect f2129i;
    public final C0057y i0;

    /* renamed from: j */
    public final Rect f2130j;

    /* renamed from: j0 */
    public boolean f2131j0;

    /* renamed from: k */
    public final RectF f2132k;

    /* renamed from: k0 */
    public Y f2133k0;

    /* renamed from: l */
    public AbstractC0058z f2134l;

    /* renamed from: l0 */
    public final int[] f2135l0;

    /* renamed from: m */
    public H f2136m;

    /* renamed from: m0 */
    public C0015n f2137m0;

    /* renamed from: n */
    public final ArrayList f2138n;

    /* renamed from: n0 */
    public final int[] f2139n0;

    /* renamed from: o */
    public final ArrayList f2140o;

    /* renamed from: o0 */
    public final int[] f2141o0;

    /* renamed from: p */
    public C0045l f2142p;

    /* renamed from: p0 */
    public final int[] f2143p0;

    /* renamed from: q */
    public boolean f2144q;

    /* renamed from: q0 */
    public final ArrayList f2145q0;

    /* renamed from: r */
    public boolean f2146r;

    /* renamed from: r0 */
    public final h f2147r0;

    /* renamed from: s */
    public boolean f2148s;

    /* renamed from: s0 */
    public final C0057y f2149s0;

    /* renamed from: t */
    public int f2150t;

    /* renamed from: u */
    public boolean f2151u;

    /* renamed from: v */
    public boolean f2152v;

    /* renamed from: w */
    public boolean f2153w;

    /* renamed from: x */
    public int f2154x;

    /* renamed from: y */
    public final AccessibilityManager f2155y;

    /* renamed from: z */
    public boolean f2156z;

    static {
        Class cls = Integer.TYPE;
        f2093u0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2094v0 = new d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xyz.happify.ckemv.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView D = D(viewGroup.getChildAt(i3));
            if (D != null) {
                return D;
            }
        }
        return null;
    }

    public static W I(View view) {
        if (view == null) {
            return null;
        }
        return ((I) view.getLayoutParams()).f1170a;
    }

    private C0015n getScrollingChildHelper() {
        if (this.f2137m0 == null) {
            this.f2137m0 = new C0015n(this);
        }
        return this.f2137m0;
    }

    public static void j(W w3) {
        WeakReference weakReference = w3.f1206b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == w3.f1205a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            w3.f1206b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r6 == 2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean B(MotionEvent motionEvent) {
        boolean z3;
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2140o;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0045l c0045l = (C0045l) arrayList.get(i3);
            int i4 = c0045l.f1314v;
            if (i4 == 1) {
                boolean d3 = c0045l.d(motionEvent.getX(), motionEvent.getY());
                boolean c = c0045l.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (d3 || c)) {
                    if (c) {
                        c0045l.f1315w = 1;
                        c0045l.f1308p = (int) motionEvent.getX();
                    } else if (d3) {
                        c0045l.f1315w = 2;
                        c0045l.f1305m = (int) motionEvent.getY();
                    }
                    c0045l.f(2);
                    z3 = true;
                }
                z3 = false;
            }
            if (z3 && action != 3) {
                this.f2142p = c0045l;
                return true;
            }
        }
        return false;
    }

    public final void C(int[] iArr) {
        int p3 = this.f2125f.p();
        if (p3 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < p3; i5++) {
            W I2 = I(this.f2125f.o(i5));
            if (!I2.q()) {
                int c = I2.c();
                if (c < i3) {
                    i3 = c;
                }
                if (c > i4) {
                    i4 = c;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public final W E(int i3) {
        W w3 = null;
        if (this.f2156z) {
            return null;
        }
        int x2 = this.f2125f.x();
        for (int i4 = 0; i4 < x2; i4++) {
            W I2 = I(this.f2125f.w(i4));
            if (I2 != null && !I2.j() && F(I2) == i3) {
                if (!this.f2125f.B(I2.f1205a)) {
                    return I2;
                }
                w3 = I2;
            }
        }
        return w3;
    }

    public final int F(W w3) {
        if (w3.e(524) || !w3.g()) {
            return -1;
        }
        G.e eVar = this.f2123e;
        int i3 = w3.c;
        ArrayList arrayList = (ArrayList) eVar.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0034a c0034a = (C0034a) arrayList.get(i4);
            int i5 = c0034a.f1226a;
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = c0034a.f1227b;
                    if (i6 <= i3) {
                        int i7 = c0034a.f1228d;
                        if (i6 + i7 > i3) {
                            return -1;
                        }
                        i3 -= i7;
                    } else {
                        continue;
                    }
                } else if (i5 == 8) {
                    int i8 = c0034a.f1227b;
                    if (i8 == i3) {
                        i3 = c0034a.f1228d;
                    } else {
                        if (i8 < i3) {
                            i3--;
                        }
                        if (c0034a.f1228d <= i3) {
                            i3++;
                        }
                    }
                }
            } else if (c0034a.f1227b <= i3) {
                i3 += c0034a.f1228d;
            }
        }
        return i3;
    }

    public final long G(W w3) {
        return this.f2134l.f1373b ? w3.f1208e : w3.c;
    }

    public final W H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        I i3 = (I) view.getLayoutParams();
        boolean z3 = i3.c;
        Rect rect = i3.f1171b;
        if (!z3) {
            return rect;
        }
        if (this.f2122d0.g && (i3.f1170a.m() || i3.f1170a.h())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2138n;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Rect rect2 = this.f2129i;
            rect2.set(0, 0, 0, 0);
            ((E) arrayList.get(i4)).getClass();
            ((I) view.getLayoutParams()).f1170a.c();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i3.c = false;
        return rect;
    }

    public final boolean K() {
        return !this.f2148s || this.f2156z || this.f2123e.h();
    }

    public final boolean L() {
        return this.f2096B > 0;
    }

    public final void M(int i3) {
        if (this.f2136m == null) {
            return;
        }
        setScrollState(2);
        this.f2136m.k0(i3);
        awakenScrollBars();
    }

    public final void N() {
        int x2 = this.f2125f.x();
        for (int i3 = 0; i3 < x2; i3++) {
            ((I) this.f2125f.w(i3).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            I i5 = (I) ((W) arrayList.get(i4)).f1205a.getLayoutParams();
            if (i5 != null) {
                i5.c = true;
            }
        }
    }

    public final void O(int i3, int i4, boolean z3) {
        int i5 = i3 + i4;
        int x2 = this.f2125f.x();
        for (int i6 = 0; i6 < x2; i6++) {
            W I2 = I(this.f2125f.w(i6));
            if (I2 != null && !I2.q()) {
                int i7 = I2.c;
                T t3 = this.f2122d0;
                if (i7 >= i5) {
                    I2.n(-i4, z3);
                    t3.f1193f = true;
                } else if (i7 >= i3) {
                    I2.b(8);
                    I2.n(-i4, z3);
                    I2.c = i3 - 1;
                    t3.f1193f = true;
                }
            }
        }
        N n3 = this.c;
        ArrayList arrayList = n3.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            W w3 = (W) arrayList.get(size);
            if (w3 != null) {
                int i8 = w3.c;
                if (i8 >= i5) {
                    w3.n(-i4, z3);
                } else if (i8 >= i3) {
                    w3.b(8);
                    n3.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f2096B++;
    }

    public final void Q(boolean z3) {
        int i3;
        AccessibilityManager accessibilityManager;
        int i4 = this.f2096B - 1;
        this.f2096B = i4;
        if (i4 < 1) {
            this.f2096B = 0;
            if (z3) {
                int i5 = this.f2154x;
                this.f2154x = 0;
                if (i5 != 0 && (accessibilityManager = this.f2155y) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    AbstractC0028b.b(obtain, i5);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2145q0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    W w3 = (W) arrayList.get(size);
                    if (w3.f1205a.getParent() == this && !w3.q() && (i3 = w3.f1218q) != -1) {
                        WeakHashMap weakHashMap = J.T.f402a;
                        B.s(w3.f1205a, i3);
                        w3.f1218q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2104K) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2104K = motionEvent.getPointerId(i3);
            int x2 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f2108O = x2;
            this.f2106M = x2;
            int y3 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f2109P = y3;
            this.f2107N = y3;
        }
    }

    public final void S() {
        if (this.f2131j0 || !this.f2144q) {
            return;
        }
        WeakHashMap weakHashMap = J.T.f402a;
        B.m(this, this.f2147r0);
        this.f2131j0 = true;
    }

    public final void T() {
        boolean z3;
        if (this.f2156z) {
            G.e eVar = this.f2123e;
            eVar.n((ArrayList) eVar.c);
            eVar.n((ArrayList) eVar.f183d);
            if (this.f2095A) {
                this.f2136m.U();
            }
        }
        if (this.f2102I == null || !this.f2136m.w0()) {
            this.f2123e.d();
        } else {
            this.f2123e.m();
        }
        boolean z4 = this.f2127g0 || this.f2128h0;
        boolean z5 = this.f2148s && this.f2102I != null && ((z3 = this.f2156z) || z4 || this.f2136m.f1162f) && (!z3 || this.f2134l.f1373b);
        T t3 = this.f2122d0;
        t3.f1195j = z5;
        t3.f1196k = z5 && z4 && !this.f2156z && this.f2102I != null && this.f2136m.w0();
    }

    public final void U(boolean z3) {
        this.f2095A = z3 | this.f2095A;
        this.f2156z = true;
        int x2 = this.f2125f.x();
        for (int i3 = 0; i3 < x2; i3++) {
            W I2 = I(this.f2125f.w(i3));
            if (I2 != null && !I2.q()) {
                I2.b(6);
            }
        }
        N();
        N n3 = this.c;
        ArrayList arrayList = n3.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            W w3 = (W) arrayList.get(i4);
            if (w3 != null) {
                w3.b(6);
                w3.a(null);
            }
        }
        AbstractC0058z abstractC0058z = n3.h.f2134l;
        if (abstractC0058z == null || !abstractC0058z.f1373b) {
            n3.d();
        }
    }

    public final void V(W w3, i iVar) {
        w3.f1211j &= -8193;
        boolean z3 = this.f2122d0.h;
        v0.e eVar = this.g;
        if (z3 && w3.m() && !w3.j() && !w3.q()) {
            ((C0336e) eVar.c).e(G(w3), w3);
        }
        C0342k c0342k = (C0342k) eVar.f5071b;
        f0 f0Var = (f0) c0342k.getOrDefault(w3, null);
        if (f0Var == null) {
            f0Var = f0.a();
            c0342k.put(w3, f0Var);
        }
        f0Var.f1269b = iVar;
        f0Var.f1268a |= 4;
    }

    public final void W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2129i;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof I) {
            I i3 = (I) layoutParams;
            if (!i3.c) {
                int i4 = rect.left;
                Rect rect2 = i3.f1171b;
                rect.left = i4 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2136m.h0(this, view, this.f2129i, !this.f2148s, view2 == null);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f2105L;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        e0(0);
        EdgeEffect edgeEffect = this.f2098E;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f2098E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2099F;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f2099F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2100G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f2100G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2101H;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f2101H.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = J.T.f402a;
            B.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (r3 == 0.0f) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(int i3, int i4, MotionEvent motionEvent) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        m();
        AbstractC0058z abstractC0058z = this.f2134l;
        int[] iArr = this.f2143p0;
        if (abstractC0058z != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Z(i3, i4, iArr);
            int i9 = iArr[0];
            int i10 = iArr[1];
            i5 = i9;
            i6 = i10;
            i7 = i3 - i9;
            i8 = i4 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.f2138n.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        s(i5, i6, i7, i8, this.f2139n0, 0, iArr);
        int i11 = iArr[0];
        int i12 = i7 - i11;
        int i13 = iArr[1];
        int i14 = i8 - i13;
        boolean z4 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.f2108O;
        int[] iArr2 = this.f2139n0;
        int i16 = iArr2[0];
        this.f2108O = i15 - i16;
        int i17 = this.f2109P;
        int i18 = iArr2[1];
        this.f2109P = i17 - i18;
        int[] iArr3 = this.f2141o0;
        iArr3[0] = iArr3[0] + i16;
        iArr3[1] = iArr3[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f3 = i12;
                float y3 = motionEvent.getY();
                float f4 = i14;
                if (f3 < 0.0f) {
                    v();
                    N.d.a(this.f2098E, (-f3) / getWidth(), 1.0f - (y3 / getHeight()));
                } else if (f3 > 0.0f) {
                    w();
                    N.d.a(this.f2100G, f3 / getWidth(), y3 / getHeight());
                } else {
                    z3 = false;
                    if (f4 >= 0.0f) {
                        x();
                        N.d.a(this.f2099F, (-f4) / getHeight(), x2 / getWidth());
                    } else if (f4 > 0.0f) {
                        u();
                        N.d.a(this.f2101H, f4 / getHeight(), 1.0f - (x2 / getWidth()));
                    } else if (!z3) {
                        if (f3 == 0.0f) {
                        }
                    }
                    WeakHashMap weakHashMap = J.T.f402a;
                    B.k(this);
                }
                z3 = true;
                if (f4 >= 0.0f) {
                }
                WeakHashMap weakHashMap2 = J.T.f402a;
                B.k(this);
            }
            l(i3, i4);
        }
        if (i5 != 0 || i6 != 0) {
            t(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i5 == 0 && i6 == 0) ? false : true;
    }

    public final void Z(int i3, int i4, int[] iArr) {
        W w3;
        m mVar = this.f2125f;
        c0();
        P();
        int i5 = k.f158a;
        j.a("RV Scroll");
        T t3 = this.f2122d0;
        z(t3);
        N n3 = this.c;
        int j02 = i3 != 0 ? this.f2136m.j0(i3, n3, t3) : 0;
        int l02 = i4 != 0 ? this.f2136m.l0(i4, n3, t3) : 0;
        j.b();
        int p3 = mVar.p();
        for (int i6 = 0; i6 < p3; i6++) {
            View o3 = mVar.o(i6);
            W H2 = H(o3);
            if (H2 != null && (w3 = H2.f1210i) != null) {
                int left = o3.getLeft();
                int top = o3.getTop();
                View view = w3.f1205a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = j02;
            iArr[1] = l02;
        }
    }

    public final void a0(int i3) {
        C0053u c0053u;
        if (this.f2152v) {
            return;
        }
        setScrollState(0);
        V v3 = this.f2117a0;
        v3.h.removeCallbacks(v3);
        v3.f1201d.abortAnimation();
        H h = this.f2136m;
        if (h != null && (c0053u = h.f1161e) != null) {
            c0053u.i();
        }
        H h3 = this.f2136m;
        if (h3 == null) {
            return;
        }
        h3.k0(i3);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        H h = this.f2136m;
        if (h != null) {
            h.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b0(int i3, int i4, boolean z3) {
        H h = this.f2136m;
        if (h == null || this.f2152v) {
            return;
        }
        if (!h.d()) {
            i3 = 0;
        }
        if (!this.f2136m.e()) {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (z3) {
            int i5 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().h(i5, 1);
        }
        this.f2117a0.b(i3, i4, Integer.MIN_VALUE, null);
    }

    public final void c0() {
        int i3 = this.f2150t + 1;
        this.f2150t = i3;
        if (i3 != 1 || this.f2152v) {
            return;
        }
        this.f2151u = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof I) && this.f2136m.f((I) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        H h = this.f2136m;
        if (h != null && h.d()) {
            return this.f2136m.j(this.f2122d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        H h = this.f2136m;
        if (h != null && h.d()) {
            return this.f2136m.k(this.f2122d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        H h = this.f2136m;
        if (h != null && h.d()) {
            return this.f2136m.l(this.f2122d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        H h = this.f2136m;
        if (h != null && h.e()) {
            return this.f2136m.m(this.f2122d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        H h = this.f2136m;
        if (h != null && h.e()) {
            return this.f2136m.n(this.f2122d0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        H h = this.f2136m;
        if (h != null && h.e()) {
            return this.f2136m.o(this.f2122d0);
        }
        return 0;
    }

    public final void d0(boolean z3) {
        if (this.f2150t < 1) {
            this.f2150t = 1;
        }
        if (!z3 && !this.f2152v) {
            this.f2151u = false;
        }
        if (this.f2150t == 1) {
            if (z3 && this.f2151u && !this.f2152v && this.f2136m != null && this.f2134l != null) {
                o();
            }
            if (!this.f2152v) {
                this.f2151u = false;
            }
        }
        this.f2150t--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return getScrollingChildHelper().a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().e(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f2138n;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((E) arrayList.get(i3)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2098E;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2098E;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2099F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2099F;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2100G;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2100G;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2101H;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2101H;
            z3 |= edgeEffect8 != null && edgeEffect8.draw(canvas);
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.f2102I == null || arrayList.size() <= 0 || !this.f2102I.f()) && !z3) {
            return;
        }
        WeakHashMap weakHashMap = J.T.f402a;
        B.k(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e0(int i3) {
        getScrollingChildHelper().i(i3);
    }

    public final void f(W w3) {
        View view = w3.f1205a;
        boolean z3 = view.getParent() == this;
        this.c.j(H(view));
        if (w3.l()) {
            this.f2125f.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z3) {
            this.f2125f.b(view, -1, true);
            return;
        }
        m mVar = this.f2125f;
        int indexOfChild = ((C0057y) mVar.c).f1371a.indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0035b) mVar.f5087d).i(indexOfChild);
            mVar.z(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i3) {
        View view2;
        int i4;
        char c;
        boolean z3;
        this.f2136m.getClass();
        boolean z4 = (this.f2134l == null || this.f2136m == null || L() || this.f2152v) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        T t3 = this.f2122d0;
        N n3 = this.c;
        if (z4 && (i3 == 2 || i3 == 1)) {
            if (this.f2136m.e()) {
                if (focusFinder.findNextFocus(this, view, i3 == 2 ? 130 : 33) == null) {
                    z3 = true;
                    if (!z3 && this.f2136m.d()) {
                        z3 = focusFinder.findNextFocus(this, view, !((this.f2136m.A() != 1) ^ (i3 != 2)) ? 66 : 17) != null;
                    }
                    if (z3) {
                        m();
                        if (A(view) == null) {
                            return null;
                        }
                        c0();
                        this.f2136m.P(view, i3, n3, t3);
                        d0(false);
                    }
                    view2 = focusFinder.findNextFocus(this, view, i3);
                }
            }
            z3 = false;
            if (!z3) {
                if (focusFinder.findNextFocus(this, view, !((this.f2136m.A() != 1) ^ (i3 != 2)) ? 66 : 17) != null) {
                }
            }
            if (z3) {
            }
            view2 = focusFinder.findNextFocus(this, view, i3);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i3);
            if (findNextFocus == null && z4) {
                m();
                if (A(view) == null) {
                    return null;
                }
                c0();
                view2 = this.f2136m.P(view, i3, n3, t3);
                d0(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i3);
            }
            W(view2, null);
            return view;
        }
        if (view2 != null && view2 != this && A(view2) != null) {
            if (view == null || A(view) == null) {
                return view2;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f2129i;
            rect.set(0, 0, width, height);
            int width2 = view2.getWidth();
            int height2 = view2.getHeight();
            Rect rect2 = this.f2130j;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(view2, rect2);
            int i5 = this.f2136m.A() == 1 ? -1 : 1;
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                i4 = 1;
            } else {
                int i8 = rect.right;
                int i9 = rect2.right;
                i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
            }
            int i10 = rect.top;
            int i11 = rect2.top;
            if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                c = 1;
            } else {
                int i12 = rect.bottom;
                int i13 = rect2.bottom;
                c = ((i12 > i13 || i10 >= i13) && i10 > i11) ? (char) 65535 : (char) 0;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 17) {
                        if (i3 != 33) {
                            if (i3 != 66) {
                                if (i3 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i3 + y());
                                }
                                if (c > 0) {
                                    return view2;
                                }
                            } else if (i4 > 0) {
                                return view2;
                            }
                        } else if (c < 0) {
                            return view2;
                        }
                    } else if (i4 < 0) {
                        return view2;
                    }
                } else {
                    if (c > 0) {
                        return view2;
                    }
                    if (c == 0 && i4 * i5 >= 0) {
                        return view2;
                    }
                }
            } else {
                if (c < 0) {
                    return view2;
                }
                if (c == 0 && i4 * i5 <= 0) {
                    return view2;
                }
            }
        }
        return super.focusSearch(view, i3);
    }

    public final void g(E e3) {
        H h = this.f2136m;
        if (h != null) {
            h.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2138n;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(e3);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        H h = this.f2136m;
        if (h != null) {
            return h.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        H h = this.f2136m;
        if (h != null) {
            return h.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0058z getAdapter() {
        return this.f2134l;
    }

    @Override // android.view.View
    public int getBaseline() {
        H h = this.f2136m;
        if (h == null) {
            return super.getBaseline();
        }
        h.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public Y getCompatAccessibilityDelegate() {
        return this.f2133k0;
    }

    public C getEdgeEffectFactory() {
        return this.D;
    }

    public D getItemAnimator() {
        return this.f2102I;
    }

    public int getItemDecorationCount() {
        return this.f2138n.size();
    }

    public H getLayoutManager() {
        return this.f2136m;
    }

    public int getMaxFlingVelocity() {
        return this.f2113T;
    }

    public int getMinFlingVelocity() {
        return this.f2112S;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public J getOnFlingListener() {
        return this.f2111R;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2116W;
    }

    public M getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.f2103J;
    }

    public final void h(K k2) {
        if (this.f2126f0 == null) {
            this.f2126f0 = new ArrayList();
        }
        this.f2126f0.add(k2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f2097C > 0) {
            new IllegalStateException("" + y());
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2144q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2152v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f442d;
    }

    public final void k() {
        int x2 = this.f2125f.x();
        for (int i3 = 0; i3 < x2; i3++) {
            W I2 = I(this.f2125f.w(i3));
            if (!I2.q()) {
                I2.f1207d = -1;
                I2.g = -1;
            }
        }
        N n3 = this.c;
        ArrayList arrayList = n3.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            W w3 = (W) arrayList.get(i4);
            w3.f1207d = -1;
            w3.g = -1;
        }
        ArrayList arrayList2 = n3.f1178a;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            W w4 = (W) arrayList2.get(i5);
            w4.f1207d = -1;
            w4.g = -1;
        }
        ArrayList arrayList3 = n3.f1179b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                W w5 = (W) n3.f1179b.get(i6);
                w5.f1207d = -1;
                w5.g = -1;
            }
        }
    }

    public final void l(int i3, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2098E;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z3 = false;
        } else {
            this.f2098E.onRelease();
            z3 = this.f2098E.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2100G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f2100G.onRelease();
            z3 |= this.f2100G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2099F;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2099F.onRelease();
            z3 |= this.f2099F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2101H;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2101H.onRelease();
            z3 |= this.f2101H.isFinished();
        }
        if (z3) {
            WeakHashMap weakHashMap = J.T.f402a;
            B.k(this);
        }
    }

    public final void m() {
        G.e eVar = this.f2123e;
        if (!this.f2148s || this.f2156z) {
            int i3 = k.f158a;
            j.a("RV FullInvalidate");
            o();
            j.b();
            return;
        }
        if (eVar.h()) {
            eVar.getClass();
            if (eVar.h()) {
                int i4 = k.f158a;
                j.a("RV FullInvalidate");
                o();
                j.b();
            }
        }
    }

    public final void n(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = J.T.f402a;
        setMeasuredDimension(H.g(i3, paddingRight, B.e(this)), H.g(i4, getPaddingBottom() + getPaddingTop(), B.d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f9, code lost:
    
        if (((java.util.ArrayList) r18.f2125f.f5088e).contains(getFocusedChild()) == false) goto L448;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a3  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [Z.W] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o() {
        View view;
        ?? r11;
        View findViewById;
        boolean z3;
        i iVar;
        ?? r22;
        if (this.f2134l == null || this.f2136m == null) {
            return;
        }
        T t3 = this.f2122d0;
        boolean z4 = false;
        t3.f1194i = false;
        if (t3.f1191d == 1) {
            p();
            this.f2136m.m0(this);
            q();
        } else {
            G.e eVar = this.f2123e;
            if ((((ArrayList) eVar.f183d).isEmpty() || ((ArrayList) eVar.c).isEmpty()) && this.f2136m.f1168n == getWidth() && this.f2136m.f1169o == getHeight()) {
                this.f2136m.m0(this);
            } else {
                this.f2136m.m0(this);
                q();
            }
        }
        t3.a(4);
        c0();
        P();
        t3.f1191d = 1;
        boolean z5 = t3.f1195j;
        Long l3 = null;
        N n3 = this.c;
        v0.e eVar2 = this.g;
        if (z5) {
            int p3 = this.f2125f.p() - 1;
            while (p3 >= 0) {
                W I2 = I(this.f2125f.o(p3));
                if (!I2.q()) {
                    long G2 = G(I2);
                    this.f2102I.getClass();
                    i iVar2 = new i(3);
                    iVar2.a(I2);
                    W w3 = (W) ((C0336e) eVar2.c).d(G2, l3);
                    if (w3 == null || w3.q()) {
                        eVar2.b(I2, iVar2);
                    } else {
                        C0342k c0342k = (C0342k) eVar2.f5071b;
                        f0 f0Var = (f0) c0342k.getOrDefault(w3, l3);
                        boolean z6 = (f0Var == null || (f0Var.f1268a & 1) == 0) ? false : true;
                        f0 f0Var2 = (f0) c0342k.getOrDefault(I2, l3);
                        boolean z7 = (f0Var2 == null || (f0Var2.f1268a & 1) == 0) ? false : true;
                        if (z6 && w3 == I2) {
                            eVar2.b(I2, iVar2);
                        } else {
                            i n4 = eVar2.n(w3, 4);
                            eVar2.b(I2, iVar2);
                            i n5 = eVar2.n(I2, 8);
                            if (n4 == null) {
                                int p4 = this.f2125f.p();
                                for (int i3 = 0; i3 < p4; i3++) {
                                    W I3 = I(this.f2125f.o(i3));
                                    if (I3 != I2 && G(I3) == G2) {
                                        AbstractC0058z abstractC0058z = this.f2134l;
                                        if (abstractC0058z == null || !abstractC0058z.f1373b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + I3 + " \n View Holder 2:" + I2 + y());
                                    }
                                }
                                Objects.toString(w3);
                                Objects.toString(I2);
                                y();
                            } else {
                                w3.p(false);
                                if (z6) {
                                    f(w3);
                                }
                                if (w3 != I2) {
                                    if (z7) {
                                        f(I2);
                                    }
                                    w3.h = I2;
                                    f(w3);
                                    n3.j(w3);
                                    I2.p(false);
                                    I2.f1210i = w3;
                                }
                                if (this.f2102I.a(w3, I2, n4, n5)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                p3--;
                l3 = null;
            }
            C0342k c0342k2 = (C0342k) eVar2.f5071b;
            int i4 = c0342k2.f4160d - 1;
            while (i4 >= 0) {
                W w4 = (W) c0342k2.h(i4);
                f0 f0Var3 = (f0) c0342k2.i(i4);
                int i5 = f0Var3.f1268a;
                int i6 = i5 & 3;
                C0057y c0057y = this.f2149s0;
                if (i6 == 3) {
                    RecyclerView recyclerView = c0057y.f1371a;
                    recyclerView.f2136m.f0(w4.f1205a, recyclerView.c);
                    r22 = z4;
                } else if ((i5 & 1) != 0) {
                    i iVar3 = f0Var3.f1269b;
                    if (iVar3 == null) {
                        RecyclerView recyclerView2 = c0057y.f1371a;
                        recyclerView2.f2136m.f0(w4.f1205a, recyclerView2.c);
                        r22 = z4;
                    } else {
                        c0057y.g(w4, iVar3, f0Var3.c);
                        r22 = z4;
                    }
                } else if ((i5 & 14) == 14) {
                    c0057y.f(w4, f0Var3.f1269b, f0Var3.c);
                    r22 = z4;
                } else if ((i5 & 12) == 12) {
                    i iVar4 = f0Var3.f1269b;
                    i iVar5 = f0Var3.c;
                    c0057y.getClass();
                    w4.p(z4);
                    RecyclerView recyclerView3 = c0057y.f1371a;
                    if (!recyclerView3.f2156z) {
                        C0042i c0042i = (C0042i) recyclerView3.f2102I;
                        c0042i.getClass();
                        int i7 = iVar4.f51b;
                        int i8 = iVar5.f51b;
                        if (i7 == i8 && iVar4.c == iVar5.c) {
                            c0042i.c(w4);
                        } else if (c0042i.g(w4, i7, iVar4.c, i8, iVar5.c)) {
                            recyclerView3.S();
                        }
                    } else if (recyclerView3.f2102I.a(w4, w4, iVar4, iVar5)) {
                        recyclerView3.S();
                    }
                    r22 = 0;
                } else {
                    if ((i5 & 4) != 0) {
                        iVar = null;
                        c0057y.g(w4, f0Var3.f1269b, null);
                    } else {
                        iVar = null;
                        if ((i5 & 8) != 0) {
                            c0057y.f(w4, f0Var3.f1269b, f0Var3.c);
                        }
                    }
                    r22 = 0;
                    f0Var3.f1268a = r22;
                    f0Var3.f1269b = iVar;
                    f0Var3.c = iVar;
                    f0.f1267d.c(f0Var3);
                    i4--;
                    z4 = false;
                }
                iVar = null;
                f0Var3.f1268a = r22;
                f0Var3.f1269b = iVar;
                f0Var3.c = iVar;
                f0.f1267d.c(f0Var3);
                i4--;
                z4 = false;
            }
            view = null;
        } else {
            view = null;
        }
        this.f2136m.e0(n3);
        t3.f1190b = t3.f1192e;
        this.f2156z = false;
        this.f2095A = false;
        t3.f1195j = false;
        t3.f1196k = false;
        this.f2136m.f1162f = false;
        ArrayList arrayList = n3.f1179b;
        if (arrayList != null) {
            arrayList.clear();
        }
        H h = this.f2136m;
        if (h.f1165k) {
            h.f1164j = 0;
            h.f1165k = false;
            n3.k();
        }
        this.f2136m.Z(t3);
        Q(true);
        d0(false);
        ((C0342k) eVar2.f5071b).clear();
        ((C0336e) eVar2.c).a();
        int[] iArr = this.f2135l0;
        int i9 = iArr[0];
        int i10 = iArr[1];
        C(iArr);
        if (iArr[0] != i9 || iArr[1] != i10) {
            t(0, 0);
        }
        if (this.f2116W && this.f2134l != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
            }
            long j3 = t3.f1198m;
            if (j3 != -1 && (z3 = this.f2134l.f1373b) && z3) {
                int x2 = this.f2125f.x();
                int i11 = 0;
                r11 = view;
                while (true) {
                    if (i11 >= x2) {
                        break;
                    }
                    W I4 = I(this.f2125f.w(i11));
                    if (I4 != null && !I4.j() && I4.f1208e == j3) {
                        if (!((ArrayList) this.f2125f.f5088e).contains(I4.f1205a)) {
                            r11 = I4;
                            break;
                        }
                        r11 = I4;
                    }
                    i11++;
                    r11 = r11;
                }
            } else {
                r11 = view;
            }
            if (r11 != 0) {
                ArrayList arrayList2 = (ArrayList) this.f2125f.f5088e;
                View view2 = r11.f1205a;
                if (!arrayList2.contains(view2) && view2.hasFocusable()) {
                    view = view2;
                    if (view != null) {
                        int i12 = t3.f1199n;
                        if (i12 != -1 && (findViewById = view.findViewById(i12)) != null && findViewById.isFocusable()) {
                            view = findViewById;
                        }
                        view.requestFocus();
                    }
                }
            }
            if (this.f2125f.p() > 0) {
                int i13 = t3.f1197l;
                int i14 = i13 != -1 ? i13 : 0;
                int b3 = t3.b();
                for (int i15 = i14; i15 < b3; i15++) {
                    W E2 = E(i15);
                    if (E2 == null) {
                        break;
                    }
                    View view3 = E2.f1205a;
                    if (view3.hasFocusable()) {
                        view = view3;
                        break;
                    }
                }
                int min = Math.min(b3, i14) - 1;
                while (true) {
                    if (min < 0) {
                        break;
                    }
                    W E3 = E(min);
                    if (E3 == null) {
                        break;
                    }
                    View view4 = E3.f1205a;
                    if (view4.hasFocusable()) {
                        view = view4;
                        break;
                    }
                    min--;
                }
            }
            if (view != null) {
            }
        }
        t3.f1198m = -1L;
        t3.f1197l = -1;
        t3.f1199n = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r1 >= 30.0f) goto L43;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Z.n] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float f3;
        super.onAttachedToWindow();
        this.f2096B = 0;
        this.f2144q = true;
        this.f2148s = this.f2148s && !isLayoutRequested();
        H h = this.f2136m;
        if (h != null) {
            h.g = true;
        }
        this.f2131j0 = false;
        ThreadLocal threadLocal = RunnableC0047n.f1323f;
        RunnableC0047n runnableC0047n = (RunnableC0047n) threadLocal.get();
        this.f2119b0 = runnableC0047n;
        if (runnableC0047n == null) {
            ?? obj = new Object();
            obj.f1324b = new ArrayList();
            obj.f1326e = new ArrayList();
            this.f2119b0 = obj;
            WeakHashMap weakHashMap = J.T.f402a;
            Display b3 = J.C.b(this);
            if (!isInEditMode() && b3 != null) {
                f3 = b3.getRefreshRate();
            }
            f3 = 60.0f;
            RunnableC0047n runnableC0047n2 = this.f2119b0;
            runnableC0047n2.f1325d = 1.0E9f / f3;
            threadLocal.set(runnableC0047n2);
        }
        this.f2119b0.f1324b.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0053u c0053u;
        super.onDetachedFromWindow();
        D d3 = this.f2102I;
        if (d3 != null) {
            d3.e();
        }
        setScrollState(0);
        V v3 = this.f2117a0;
        v3.h.removeCallbacks(v3);
        v3.f1201d.abortAnimation();
        H h = this.f2136m;
        if (h != null && (c0053u = h.f1161e) != null) {
            c0053u.i();
        }
        this.f2144q = false;
        H h3 = this.f2136m;
        if (h3 != null) {
            h3.g = false;
            h3.O(this);
        }
        this.f2145q0.clear();
        removeCallbacks(this.f2147r0);
        this.g.getClass();
        do {
        } while (f0.f1267d.a() != null);
        RunnableC0047n runnableC0047n = this.f2119b0;
        if (runnableC0047n != null) {
            runnableC0047n.f1324b.remove(this);
            this.f2119b0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2138n;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((E) arrayList.get(i3)).a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float f4;
        if (this.f2136m != null && !this.f2152v && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f2136m.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f2136m.d()) {
                    f4 = motionEvent.getAxisValue(10);
                    if (f3 == 0.0f || f4 != 0.0f) {
                        Y((int) (f4 * this.f2114U), (int) (f3 * this.f2115V), motionEvent);
                    }
                }
                f4 = 0.0f;
                if (f3 == 0.0f) {
                }
                Y((int) (f4 * this.f2114U), (int) (f3 * this.f2115V), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2136m.e()) {
                        f3 = -axisValue;
                        f4 = 0.0f;
                        if (f3 == 0.0f) {
                        }
                        Y((int) (f4 * this.f2114U), (int) (f3 * this.f2115V), motionEvent);
                    } else if (this.f2136m.d()) {
                        f4 = axisValue;
                        f3 = 0.0f;
                        if (f3 == 0.0f) {
                        }
                        Y((int) (f4 * this.f2114U), (int) (f3 * this.f2115V), motionEvent);
                    }
                }
                f3 = 0.0f;
                f4 = 0.0f;
                if (f3 == 0.0f) {
                }
                Y((int) (f4 * this.f2114U), (int) (f3 * this.f2115V), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        if (r0 != false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f2152v) {
            return false;
        }
        this.f2142p = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        H h = this.f2136m;
        if (h == null) {
            return false;
        }
        boolean d3 = h.d();
        boolean e3 = this.f2136m.e();
        if (this.f2105L == null) {
            this.f2105L = VelocityTracker.obtain();
        }
        this.f2105L.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2153w) {
                this.f2153w = false;
            }
            this.f2104K = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2108O = x2;
            this.f2106M = x2;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f2109P = y3;
            this.f2107N = y3;
            if (this.f2103J == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f2141o0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = d3;
            if (e3) {
                i3 = (d3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i3, 0);
        } else if (actionMasked == 1) {
            this.f2105L.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2104K);
            if (findPointerIndex < 0) {
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f2103J != 1) {
                int i4 = x3 - this.f2106M;
                int i5 = y4 - this.f2107N;
                if (d3 == 0 || Math.abs(i4) <= this.f2110Q) {
                    z3 = false;
                } else {
                    this.f2108O = x3;
                    z3 = true;
                }
                if (e3 && Math.abs(i5) > this.f2110Q) {
                    this.f2109P = y4;
                }
                setScrollState(1);
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2104K = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2108O = x4;
            this.f2106M = x4;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2109P = y5;
            this.f2107N = y5;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.f2103J == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7 = k.f158a;
        j.a("RV OnLayout");
        o();
        j.b();
        this.f2148s = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        H h = this.f2136m;
        if (h == null) {
            n(i3, i4);
            return;
        }
        boolean J2 = h.J();
        T t3 = this.f2122d0;
        if (!J2) {
            if (this.f2146r) {
                this.f2136m.f1159b.n(i3, i4);
                return;
            }
            if (t3.f1196k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC0058z abstractC0058z = this.f2134l;
            if (abstractC0058z != null) {
                t3.f1192e = abstractC0058z.a();
            } else {
                t3.f1192e = 0;
            }
            c0();
            this.f2136m.f1159b.n(i3, i4);
            d0(false);
            t3.g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        this.f2136m.f1159b.n(i3, i4);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f2134l == null) {
            return;
        }
        if (t3.f1191d == 1) {
            p();
        }
        this.f2136m.n0(i3, i4);
        t3.f1194i = true;
        q();
        this.f2136m.p0(i3, i4);
        if (this.f2136m.s0()) {
            this.f2136m.n0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            t3.f1194i = true;
            q();
            this.f2136m.p0(i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof P)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        P p3 = (P) parcelable;
        this.f2121d = p3;
        super.onRestoreInstanceState(p3.f783b);
        H h = this.f2136m;
        if (h == null || (parcelable2 = this.f2121d.f1183d) == null) {
            return;
        }
        h.a0(parcelable2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, P.b, Z.P] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new P.b(super.onSaveInstanceState());
        P p3 = this.f2121d;
        if (p3 != null) {
            bVar.f1183d = p3.f1183d;
        } else {
            H h = this.f2136m;
            if (h != null) {
                bVar.f1183d = h.b0();
            } else {
                bVar.f1183d = null;
            }
        }
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.f2101H = null;
        this.f2099F = null;
        this.f2100G = null;
        this.f2098E = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RecyclerView recyclerView;
        boolean z3;
        int i3;
        RecyclerView recyclerView2;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        RecyclerView recyclerView3;
        int minFlingVelocity;
        boolean z4;
        int i4;
        PointF a3;
        int i5;
        boolean z5;
        if (this.f2152v || this.f2153w) {
            return false;
        }
        C0045l c0045l = this.f2142p;
        if (c0045l != null) {
            recyclerView = this;
            if (c0045l.f1314v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean d3 = c0045l.d(motionEvent.getX(), motionEvent.getY());
                    boolean c = c0045l.c(motionEvent.getX(), motionEvent.getY());
                    if (d3 || c) {
                        if (c) {
                            c0045l.f1315w = 1;
                            c0045l.f1308p = (int) motionEvent.getX();
                        } else if (d3) {
                            i3 = 2;
                            c0045l.f1315w = 2;
                            c0045l.f1305m = (int) motionEvent.getY();
                            c0045l.f(i3);
                        }
                        i3 = 2;
                        c0045l.f(i3);
                    }
                } else if (motionEvent.getAction() == 1 && c0045l.f1314v == 2) {
                    c0045l.f1305m = 0.0f;
                    c0045l.f1308p = 0.0f;
                    c0045l.f(1);
                    c0045l.f1315w = 0;
                } else if (motionEvent.getAction() == 2 && c0045l.f1314v == 2) {
                    c0045l.g();
                    int i6 = c0045l.f1315w;
                    int i7 = c0045l.f1297b;
                    if (i6 == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0045l.f1317y;
                        iArr[0] = i7;
                        int i8 = c0045l.f1309q - i7;
                        iArr[1] = i8;
                        float max = Math.max(i7, Math.min(i8, x2));
                        if (Math.abs(c0045l.f1307o - max) >= 2.0f) {
                            int e3 = C0045l.e(c0045l.f1308p, max, iArr, c0045l.f1311s.computeHorizontalScrollRange(), c0045l.f1311s.computeHorizontalScrollOffset(), c0045l.f1309q);
                            if (e3 != 0) {
                                c0045l.f1311s.scrollBy(e3, 0);
                            }
                            c0045l.f1308p = max;
                        }
                    }
                    if (c0045l.f1315w == 2) {
                        float y3 = motionEvent.getY();
                        int[] iArr2 = c0045l.f1316x;
                        iArr2[0] = i7;
                        int i9 = c0045l.f1310r - i7;
                        iArr2[1] = i9;
                        float max2 = Math.max(i7, Math.min(i9, y3));
                        if (Math.abs(c0045l.f1304l - max2) >= 2.0f) {
                            int e4 = C0045l.e(c0045l.f1305m, max2, iArr2, c0045l.f1311s.computeVerticalScrollRange(), c0045l.f1311s.computeVerticalScrollOffset(), c0045l.f1310r);
                            if (e4 != 0) {
                                c0045l.f1311s.scrollBy(0, e4);
                            }
                            c0045l.f1305m = max2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            z3 = true;
            if (action == 3 || action == 1) {
                recyclerView.f2142p = null;
            }
        } else {
            if (motionEvent.getAction() == 0 || !B(motionEvent)) {
                H h = this.f2136m;
                if (h == null) {
                    return false;
                }
                boolean d4 = h.d();
                boolean e5 = this.f2136m.e();
                if (this.f2105L == null) {
                    this.f2105L = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f2141o0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked == 0) {
                    recyclerView2 = this;
                    motionEvent2 = obtain;
                    recyclerView2.f2104K = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    recyclerView2.f2108O = x3;
                    recyclerView2.f2106M = x3;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    recyclerView2.f2109P = y4;
                    recyclerView2.f2107N = y4;
                    int i10 = d4;
                    if (e5) {
                        i10 = (d4 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().h(i10, 0);
                } else {
                    if (actionMasked == 1) {
                        this.f2105L.addMovement(obtain);
                        VelocityTracker velocityTracker = this.f2105L;
                        int i11 = this.f2113T;
                        velocityTracker.computeCurrentVelocity(1000, i11);
                        float f3 = d4 != 0 ? -this.f2105L.getXVelocity(this.f2104K) : 0.0f;
                        float f4 = e5 ? -this.f2105L.getYVelocity(this.f2104K) : 0.0f;
                        if (f3 == 0.0f && f4 == 0.0f) {
                            recyclerView3 = this;
                            i5 = 0;
                            motionEvent4 = obtain;
                        } else {
                            int i12 = (int) f3;
                            int i13 = (int) f4;
                            H h3 = this.f2136m;
                            if (h3 != null && !this.f2152v) {
                                int d5 = h3.d();
                                boolean e6 = this.f2136m.e();
                                int i14 = this.f2112S;
                                if (d5 == 0 || Math.abs(i12) < i14) {
                                    i12 = 0;
                                }
                                if (!e6 || Math.abs(i13) < i14) {
                                    i13 = 0;
                                }
                                if (i12 != 0 || i13 != 0) {
                                    float f5 = i12;
                                    float f6 = i13;
                                    if (!dispatchNestedPreFling(f5, f6)) {
                                        boolean z6 = d5 != 0 || e6;
                                        dispatchNestedFling(f5, f6, z6);
                                        J j3 = this.f2111R;
                                        if (j3 != null) {
                                            C0056x c0056x = (C0056x) j3;
                                            H layoutManager = c0056x.f1368a.getLayoutManager();
                                            if (layoutManager != 0 && c0056x.f1368a.getAdapter() != null && ((Math.abs(i13) > (minFlingVelocity = c0056x.f1368a.getMinFlingVelocity()) || Math.abs(i12) > minFlingVelocity) && ((z4 = layoutManager instanceof S)))) {
                                                a aVar = !z4 ? null : new a(c0056x, c0056x.f1368a.getContext(), 1);
                                                if (aVar != null) {
                                                    int z7 = layoutManager.z();
                                                    if (z7 != 0) {
                                                        AbstractC0055w e7 = layoutManager.e() ? c0056x.e(layoutManager) : layoutManager.d() ? c0056x.d(layoutManager) : null;
                                                        if (e7 != null) {
                                                            int v3 = layoutManager.v();
                                                            motionEvent4 = obtain;
                                                            int i15 = Integer.MIN_VALUE;
                                                            int i16 = Integer.MAX_VALUE;
                                                            int i17 = 0;
                                                            View view = null;
                                                            View view2 = null;
                                                            while (i17 < v3) {
                                                                int i18 = v3;
                                                                View u3 = layoutManager.u(i17);
                                                                if (u3 != null) {
                                                                    int b3 = C0056x.b(u3, e7);
                                                                    if (b3 <= 0 && b3 > i15) {
                                                                        i15 = b3;
                                                                        view2 = u3;
                                                                    }
                                                                    if (b3 >= 0 && b3 < i16) {
                                                                        i16 = b3;
                                                                        view = u3;
                                                                    }
                                                                }
                                                                i17++;
                                                                v3 = i18;
                                                            }
                                                            boolean z8 = !layoutManager.d() ? i13 <= 0 : i12 <= 0;
                                                            if (z8 && view != null) {
                                                                i4 = H.F(view);
                                                            } else if (z8 || view2 == null) {
                                                                if (z8) {
                                                                    view = view2;
                                                                }
                                                                if (view != null) {
                                                                    int F2 = ((z4 && (a3 = ((S) layoutManager).a(layoutManager.z() - 1)) != null && ((a3.x > 0.0f ? 1 : (a3.x == 0.0f ? 0 : -1)) < 0 || (a3.y > 0.0f ? 1 : (a3.y == 0.0f ? 0 : -1)) < 0)) == z8 ? -1 : 1) + H.F(view);
                                                                    if (F2 >= 0 && F2 < z7) {
                                                                        i4 = F2;
                                                                    }
                                                                }
                                                                i4 = -1;
                                                            } else {
                                                                i4 = H.F(view2);
                                                            }
                                                            if (i4 != -1) {
                                                                aVar.f1353a = i4;
                                                                layoutManager.v0(aVar);
                                                                X();
                                                                motionEvent3 = motionEvent4;
                                                                motionEvent3.recycle();
                                                                return true;
                                                            }
                                                            if (z6) {
                                                                if (e6) {
                                                                    d5 = (d5 == true ? 1 : 0) | 2;
                                                                }
                                                                getScrollingChildHelper().h(d5, 1);
                                                                int i19 = -i11;
                                                                int max3 = Math.max(i19, Math.min(i12, i11));
                                                                int max4 = Math.max(i19, Math.min(i13, i11));
                                                                V v4 = this.f2117a0;
                                                                RecyclerView recyclerView4 = v4.h;
                                                                recyclerView4.setScrollState(2);
                                                                v4.c = 0;
                                                                v4.f1200b = 0;
                                                                Interpolator interpolator = v4.f1202e;
                                                                d dVar = f2094v0;
                                                                if (interpolator != dVar) {
                                                                    v4.f1202e = dVar;
                                                                    v4.f1201d = new OverScroller(recyclerView4.getContext(), dVar);
                                                                }
                                                                v4.f1201d.fling(0, 0, max3, max4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                                v4.a();
                                                                X();
                                                                motionEvent3 = motionEvent4;
                                                                motionEvent3.recycle();
                                                                return true;
                                                            }
                                                            recyclerView3 = this;
                                                            i5 = 0;
                                                        }
                                                    }
                                                    motionEvent4 = obtain;
                                                    i4 = -1;
                                                    if (i4 != -1) {
                                                    }
                                                    if (z6) {
                                                    }
                                                }
                                            }
                                        }
                                        motionEvent4 = obtain;
                                        if (z6) {
                                        }
                                    }
                                }
                            }
                            recyclerView3 = this;
                            motionEvent4 = obtain;
                            i5 = 0;
                        }
                        recyclerView3.setScrollState(i5);
                        X();
                        motionEvent3 = motionEvent4;
                        motionEvent3.recycle();
                        return true;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2104K);
                        if (findPointerIndex < 0) {
                            return false;
                        }
                        int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                        int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                        int i20 = this.f2108O - x4;
                        int i21 = this.f2109P - y5;
                        if (this.f2103J != 1) {
                            if (d4 != 0) {
                                i20 = i20 > 0 ? Math.max(0, i20 - this.f2110Q) : Math.min(0, i20 + this.f2110Q);
                                if (i20 != 0) {
                                    z5 = true;
                                    if (e5) {
                                        i21 = i21 > 0 ? Math.max(0, i21 - this.f2110Q) : Math.min(0, i21 + this.f2110Q);
                                        if (i21 != 0) {
                                            z5 = true;
                                        }
                                    }
                                    if (z5) {
                                        setScrollState(1);
                                    }
                                }
                            }
                            z5 = false;
                            if (e5) {
                            }
                            if (z5) {
                            }
                        }
                        int i22 = i20;
                        int i23 = i21;
                        if (this.f2103J == 1) {
                            int[] iArr4 = this.f2143p0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            boolean r3 = r(d4 != 0 ? i22 : 0, e5 ? i23 : 0, iArr4, this.f2139n0, 0);
                            int[] iArr5 = this.f2139n0;
                            if (r3) {
                                i22 -= iArr4[0];
                                i23 -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i24 = i22;
                            int i25 = i23;
                            this.f2108O = x4 - iArr5[0];
                            this.f2109P = y5 - iArr5[1];
                            if (Y(d4 != 0 ? i24 : 0, e5 ? i25 : 0, motionEvent)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC0047n runnableC0047n = this.f2119b0;
                            if (runnableC0047n != null && (i24 != 0 || i25 != 0)) {
                                runnableC0047n.a(this, i24, i25);
                            }
                        }
                    } else if (actionMasked == 3) {
                        X();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f2104K = motionEvent.getPointerId(actionIndex);
                        int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f2108O = x5;
                        this.f2106M = x5;
                        int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f2109P = y6;
                        this.f2107N = y6;
                    } else if (actionMasked == 6) {
                        R(motionEvent);
                    }
                    recyclerView2 = this;
                    motionEvent2 = obtain;
                }
                motionEvent3 = motionEvent2;
                recyclerView2.f2105L.addMovement(motionEvent3);
                motionEvent3.recycle();
                return true;
            }
            recyclerView = this;
            z3 = true;
        }
        X();
        recyclerView.setScrollState(0);
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        View A3;
        int F2;
        View view;
        f0 f0Var;
        T t3 = this.f2122d0;
        t3.a(1);
        z(t3);
        t3.f1194i = false;
        c0();
        v0.e eVar = this.g;
        ((C0342k) eVar.f5071b).clear();
        C0336e c0336e = (C0336e) eVar.c;
        c0336e.a();
        P();
        T();
        View focusedChild = (this.f2116W && hasFocus() && this.f2134l != null) ? getFocusedChild() : null;
        W H2 = (focusedChild == null || (A3 = A(focusedChild)) == null) ? null : H(A3);
        if (H2 == null) {
            t3.f1198m = -1L;
            t3.f1197l = -1;
            t3.f1199n = -1;
        } else {
            t3.f1198m = this.f2134l.f1373b ? H2.f1208e : -1L;
            if (!this.f2156z) {
                if (H2.j()) {
                    F2 = H2.f1207d;
                } else {
                    RecyclerView recyclerView = H2.f1219r;
                    if (recyclerView != null) {
                        F2 = recyclerView.F(H2);
                    }
                }
                t3.f1197l = F2;
                view = H2.f1205a;
                int id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() == -1) {
                        id = view.getId();
                    }
                }
                t3.f1199n = id;
            }
            F2 = -1;
            t3.f1197l = F2;
            view = H2.f1205a;
            int id2 = view.getId();
            while (!view.isFocused()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() == -1) {
                }
            }
            t3.f1199n = id2;
        }
        t3.h = t3.f1195j && this.f2128h0;
        this.f2128h0 = false;
        this.f2127g0 = false;
        t3.g = t3.f1196k;
        t3.f1192e = this.f2134l.a();
        C(this.f2135l0);
        boolean z3 = t3.f1195j;
        C0342k c0342k = (C0342k) eVar.f5071b;
        if (z3) {
            int p3 = this.f2125f.p();
            for (int i3 = 0; i3 < p3; i3++) {
                W I2 = I(this.f2125f.o(i3));
                if (!I2.q() && (!I2.h() || this.f2134l.f1373b)) {
                    D d3 = this.f2102I;
                    D.b(I2);
                    I2.d();
                    d3.getClass();
                    i iVar = new i(3);
                    iVar.a(I2);
                    f0 f0Var2 = (f0) c0342k.getOrDefault(I2, null);
                    if (f0Var2 == null) {
                        f0Var2 = f0.a();
                        c0342k.put(I2, f0Var2);
                    }
                    f0Var2.f1269b = iVar;
                    f0Var2.f1268a |= 4;
                    if (t3.h && I2.m() && !I2.j() && !I2.q() && !I2.h()) {
                        c0336e.e(G(I2), I2);
                    }
                }
            }
        }
        if (t3.f1196k) {
            int x2 = this.f2125f.x();
            for (int i4 = 0; i4 < x2; i4++) {
                W I3 = I(this.f2125f.w(i4));
                if (!I3.q() && I3.f1207d == -1) {
                    I3.f1207d = I3.c;
                }
            }
            boolean z4 = t3.f1193f;
            t3.f1193f = false;
            this.f2136m.Y(this.c, t3);
            t3.f1193f = z4;
            for (int i5 = 0; i5 < this.f2125f.p(); i5++) {
                W I4 = I(this.f2125f.o(i5));
                if (!I4.q() && ((f0Var = (f0) c0342k.getOrDefault(I4, null)) == null || (f0Var.f1268a & 4) == 0)) {
                    D.b(I4);
                    boolean e3 = I4.e(8192);
                    D d4 = this.f2102I;
                    I4.d();
                    d4.getClass();
                    i iVar2 = new i(3);
                    iVar2.a(I4);
                    if (e3) {
                        V(I4, iVar2);
                    } else {
                        f0 f0Var3 = (f0) c0342k.getOrDefault(I4, null);
                        if (f0Var3 == null) {
                            f0Var3 = f0.a();
                            c0342k.put(I4, f0Var3);
                        }
                        f0Var3.f1268a |= 2;
                        f0Var3.f1269b = iVar2;
                    }
                }
            }
            k();
        } else {
            k();
        }
        Q(true);
        d0(false);
        t3.f1191d = 2;
    }

    public final void q() {
        c0();
        P();
        T t3 = this.f2122d0;
        t3.a(6);
        this.f2123e.d();
        t3.f1192e = this.f2134l.a();
        t3.c = 0;
        t3.g = false;
        this.f2136m.Y(this.c, t3);
        t3.f1193f = false;
        this.f2121d = null;
        t3.f1195j = t3.f1195j && this.f2102I != null;
        t3.f1191d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        W I2 = I(view);
        if (I2 != null) {
            if (I2.l()) {
                I2.f1211j &= -257;
            } else if (!I2.q()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0053u c0053u = this.f2136m.f1161e;
        if ((c0053u == null || !c0053u.f1356e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f2136m.h0(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f2140o;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0045l) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2150t != 0 || this.f2152v) {
            this.f2151u = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().e(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        H h = this.f2136m;
        if (h == null || this.f2152v) {
            return;
        }
        boolean d3 = h.d();
        boolean e3 = this.f2136m.e();
        if (d3 || e3) {
            if (!d3) {
                i3 = 0;
            }
            if (!e3) {
                i4 = 0;
            }
            Y(i3, i4, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int a3 = accessibilityEvent != null ? AbstractC0028b.a(accessibilityEvent) : 0;
            this.f2154x |= a3 != 0 ? a3 : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Y y3) {
        this.f2133k0 = y3;
        J.T.l(this, y3);
    }

    public void setAdapter(AbstractC0058z abstractC0058z) {
        setLayoutFrozen(false);
        AbstractC0058z abstractC0058z2 = this.f2134l;
        e eVar = this.f2118b;
        if (abstractC0058z2 != null) {
            abstractC0058z2.f1372a.unregisterObserver(eVar);
            this.f2134l.getClass();
        }
        D d3 = this.f2102I;
        if (d3 != null) {
            d3.e();
        }
        H h = this.f2136m;
        N n3 = this.c;
        if (h != null) {
            h.d0(n3);
            this.f2136m.e0(n3);
        }
        n3.f1178a.clear();
        n3.d();
        G.e eVar2 = this.f2123e;
        eVar2.n((ArrayList) eVar2.c);
        eVar2.n((ArrayList) eVar2.f183d);
        AbstractC0058z abstractC0058z3 = this.f2134l;
        this.f2134l = abstractC0058z;
        if (abstractC0058z != null) {
            abstractC0058z.f1372a.registerObserver(eVar);
        }
        AbstractC0058z abstractC0058z4 = this.f2134l;
        n3.f1178a.clear();
        n3.d();
        M c = n3.c();
        if (abstractC0058z3 != null) {
            c.f1177b--;
        }
        if (c.f1177b == 0) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = c.f1176a;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                ((L) sparseArray.valueAt(i3)).f1173a.clear();
                i3++;
            }
        }
        if (abstractC0058z4 != null) {
            c.f1177b++;
        }
        this.f2122d0.f1193f = true;
        U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(Z.B b3) {
        if (b3 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.h) {
            this.f2101H = null;
            this.f2099F = null;
            this.f2100G = null;
            this.f2098E = null;
        }
        this.h = z3;
        super.setClipToPadding(z3);
        if (this.f2148s) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C c) {
        c.getClass();
        this.D = c;
        this.f2101H = null;
        this.f2099F = null;
        this.f2100G = null;
        this.f2098E = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f2146r = z3;
    }

    public void setItemAnimator(D d3) {
        D d4 = this.f2102I;
        if (d4 != null) {
            d4.e();
            this.f2102I.f1148a = null;
        }
        this.f2102I = d3;
        if (d3 != null) {
            d3.f1148a = this.i0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        N n3 = this.c;
        n3.f1181e = i3;
        n3.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(H h) {
        C0057y c0057y;
        C0053u c0053u;
        if (h == this.f2136m) {
            return;
        }
        setScrollState(0);
        V v3 = this.f2117a0;
        v3.h.removeCallbacks(v3);
        v3.f1201d.abortAnimation();
        H h3 = this.f2136m;
        if (h3 != null && (c0053u = h3.f1161e) != null) {
            c0053u.i();
        }
        H h4 = this.f2136m;
        N n3 = this.c;
        if (h4 != null) {
            D d3 = this.f2102I;
            if (d3 != null) {
                d3.e();
            }
            this.f2136m.d0(n3);
            this.f2136m.e0(n3);
            n3.f1178a.clear();
            n3.d();
            if (this.f2144q) {
                H h5 = this.f2136m;
                h5.g = false;
                h5.O(this);
            }
            this.f2136m.q0(null);
            this.f2136m = null;
        } else {
            n3.f1178a.clear();
            n3.d();
        }
        m mVar = this.f2125f;
        ((C0035b) mVar.f5087d).h();
        ArrayList arrayList = (ArrayList) mVar.f5088e;
        int size = arrayList.size() - 1;
        while (true) {
            c0057y = (C0057y) mVar.c;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            c0057y.getClass();
            W I2 = I(view);
            if (I2 != null) {
                int i3 = I2.f1217p;
                RecyclerView recyclerView = c0057y.f1371a;
                if (recyclerView.L()) {
                    I2.f1218q = i3;
                    recyclerView.f2145q0.add(I2);
                } else {
                    WeakHashMap weakHashMap = J.T.f402a;
                    B.s(I2.f1205a, i3);
                }
                I2.f1217p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = c0057y.f1371a;
        int childCount = recyclerView2.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView2.getChildAt(i4);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f2136m = h;
        if (h != null) {
            if (h.f1159b != null) {
                throw new IllegalArgumentException("LayoutManager " + h + " is already attached to a RecyclerView:" + h.f1159b.y());
            }
            h.q0(this);
            if (this.f2144q) {
                this.f2136m.g = true;
            }
        }
        n3.k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0015n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f442d) {
            WeakHashMap weakHashMap = J.T.f402a;
            J.H.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.f442d = z3;
    }

    public void setOnFlingListener(J j3) {
        this.f2111R = j3;
    }

    @Deprecated
    public void setOnScrollListener(K k2) {
        this.f2124e0 = k2;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f2116W = z3;
    }

    public void setRecycledViewPool(M m3) {
        N n3 = this.c;
        if (n3.g != null) {
            r1.f1177b--;
        }
        n3.g = m3;
        if (m3 == null || n3.h.getAdapter() == null) {
            return;
        }
        n3.g.f1177b++;
    }

    public void setRecyclerListener(O o3) {
    }

    public void setScrollState(int i3) {
        C0053u c0053u;
        if (i3 == this.f2103J) {
            return;
        }
        this.f2103J = i3;
        if (i3 != 2) {
            V v3 = this.f2117a0;
            v3.h.removeCallbacks(v3);
            v3.f1201d.abortAnimation();
            H h = this.f2136m;
            if (h != null && (c0053u = h.f1161e) != null) {
                c0053u.i();
            }
        }
        H h3 = this.f2136m;
        if (h3 != null) {
            h3.c0(i3);
        }
        K k2 = this.f2124e0;
        if (k2 != null) {
            k2.a(this, i3);
        }
        ArrayList arrayList = this.f2126f0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f2126f0.get(size)).a(this, i3);
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 1) {
            this.f2110Q = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f2110Q = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(U u3) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().h(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        C0053u c0053u;
        if (z3 != this.f2152v) {
            i("Do not suppressLayout in layout or scroll");
            if (!z3) {
                this.f2152v = false;
                if (this.f2151u && this.f2136m != null && this.f2134l != null) {
                    requestLayout();
                }
                this.f2151u = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2152v = true;
            this.f2153w = true;
            setScrollState(0);
            V v3 = this.f2117a0;
            v3.h.removeCallbacks(v3);
            v3.f1201d.abortAnimation();
            H h = this.f2136m;
            if (h == null || (c0053u = h.f1161e) == null) {
                return;
            }
            c0053u.i();
        }
    }

    public final void t(int i3, int i4) {
        this.f2097C++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i4);
        K k2 = this.f2124e0;
        if (k2 != null) {
            k2.b(this, i3, i4);
        }
        ArrayList arrayList = this.f2126f0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((K) this.f2126f0.get(size)).b(this, i3, i4);
            }
        }
        this.f2097C--;
    }

    public final void u() {
        if (this.f2101H != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2101H = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void v() {
        if (this.f2098E != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2098E = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void w() {
        if (this.f2100G != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2100G = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void x() {
        if (this.f2099F != null) {
            return;
        }
        this.D.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2099F = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f2134l + ", layout:" + this.f2136m + ", context:" + getContext();
    }

    public final void z(T t3) {
        if (getScrollState() != 2) {
            t3.getClass();
            return;
        }
        OverScroller overScroller = this.f2117a0.f1201d;
        overScroller.getFinalX();
        overScroller.getCurrX();
        t3.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x03c9  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, C0.b] */
    /* JADX WARN: Type inference failed for: r1v13, types: [Z.T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, Z.C] */
    /* JADX WARN: Type inference failed for: r1v9, types: [Z.D, Z.i, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        int i4;
        TypedArray typedArray;
        TypedArray typedArray2;
        char c;
        char c3;
        boolean z3;
        int i5;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        this.f2118b = new e(15, this);
        this.c = new N(this);
        this.g = new v0.e();
        this.f2129i = new Rect();
        this.f2130j = new Rect();
        this.f2132k = new RectF();
        this.f2138n = new ArrayList();
        this.f2140o = new ArrayList();
        this.f2150t = 0;
        this.f2156z = false;
        this.f2095A = false;
        this.f2096B = 0;
        this.f2097C = 0;
        this.D = new Object();
        ?? obj = new Object();
        obj.f1148a = null;
        obj.f1149b = new ArrayList();
        obj.c = 120L;
        obj.f1150d = 120L;
        obj.f1151e = 250L;
        obj.f1152f = 250L;
        obj.g = true;
        obj.h = new ArrayList();
        obj.f1280i = new ArrayList();
        obj.f1281j = new ArrayList();
        obj.f1282k = new ArrayList();
        obj.f1283l = new ArrayList();
        obj.f1284m = new ArrayList();
        obj.f1285n = new ArrayList();
        obj.f1286o = new ArrayList();
        obj.f1287p = new ArrayList();
        obj.f1288q = new ArrayList();
        obj.f1289r = new ArrayList();
        this.f2102I = obj;
        this.f2103J = 0;
        this.f2104K = -1;
        this.f2114U = Float.MIN_VALUE;
        this.f2115V = Float.MIN_VALUE;
        this.f2116W = true;
        this.f2117a0 = new V(this);
        this.f2120c0 = new Object();
        ?? obj2 = new Object();
        obj2.f1189a = -1;
        obj2.f1190b = 0;
        obj2.c = 0;
        obj2.f1191d = 1;
        obj2.f1192e = 0;
        obj2.f1193f = false;
        obj2.g = false;
        obj2.h = false;
        obj2.f1194i = false;
        obj2.f1195j = false;
        obj2.f1196k = false;
        this.f2122d0 = obj2;
        this.f2127g0 = false;
        this.f2128h0 = false;
        C0057y c0057y = new C0057y(this);
        this.i0 = c0057y;
        this.f2131j0 = false;
        this.f2135l0 = new int[2];
        this.f2139n0 = new int[2];
        this.f2141o0 = new int[2];
        this.f2143p0 = new int[2];
        this.f2145q0 = new ArrayList();
        this.f2147r0 = new h(4, this);
        this.f2149s0 = new C0057y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2110Q = viewConfiguration.getScaledTouchSlop();
        this.f2114U = J.U.a(viewConfiguration);
        this.f2115V = J.U.b(viewConfiguration);
        this.f2112S = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2113T = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2102I.f1148a = c0057y;
        this.f2123e = new G.e(new C0057y(this));
        this.f2125f = new m(new C0057y(this));
        WeakHashMap weakHashMap = J.T.f402a;
        if (J.J.c(this) == 0) {
            J.J.m(this, 8);
        }
        if (B.c(this) == 0) {
            B.s(this, 1);
        }
        this.f2155y = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Y(this));
        int[] iArr = Y.a.f1144a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            i4 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i3, 0);
            typedArray = obtainStyledAttributes;
        } else {
            i4 = 8;
            typedArray = obtainStyledAttributes;
        }
        String string = typedArray.getString(i4);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                typedArray2 = typedArray;
                c = 3;
                c3 = 2;
                new C0045l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(xyz.happify.ckemv.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(xyz.happify.ckemv.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(xyz.happify.ckemv.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
        } else {
            typedArray2 = typedArray;
            c = 3;
            c3 = 2;
        }
        typedArray2.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(H.class);
                    try {
                        constructor = asSubclass.getConstructor(f2093u0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context;
                        z3 = true;
                        try {
                            objArr2[1] = attributeSet;
                            objArr2[c3] = Integer.valueOf(i3);
                            objArr2[c] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            NoSuchMethodException noSuchMethodException = e;
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                                constructor.setAccessible(z3);
                                setLayoutManager((H) constructor.newInstance(objArr));
                                i5 = Build.VERSION.SDK_INT;
                                int[] iArr2 = f2092t0;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
                                if (i5 >= 29) {
                                }
                                boolean z4 = obtainStyledAttributes2.getBoolean(0, z3);
                                obtainStyledAttributes2.recycle();
                                setNestedScrollingEnabled(z4);
                            } catch (NoSuchMethodException e4) {
                                e4.initCause(noSuchMethodException);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e4);
                            }
                        }
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        z3 = true;
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((H) constructor.newInstance(objArr));
                    i5 = Build.VERSION.SDK_INT;
                    int[] iArr22 = f2092t0;
                    TypedArray obtainStyledAttributes22 = context.obtainStyledAttributes(attributeSet, iArr22, i3, 0);
                    if (i5 >= 29) {
                        saveAttributeDataForStyleable(context, iArr22, attributeSet, obtainStyledAttributes22, i3, 0);
                    }
                    boolean z42 = obtainStyledAttributes22.getBoolean(0, z3);
                    obtainStyledAttributes22.recycle();
                    setNestedScrollingEnabled(z42);
                } catch (ClassCastException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e6);
                } catch (ClassNotFoundException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e7);
                } catch (IllegalAccessException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e8);
                } catch (InstantiationException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                } catch (InvocationTargetException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e10);
                }
            }
        }
        z3 = true;
        i5 = Build.VERSION.SDK_INT;
        int[] iArr222 = f2092t0;
        TypedArray obtainStyledAttributes222 = context.obtainStyledAttributes(attributeSet, iArr222, i3, 0);
        if (i5 >= 29) {
        }
        boolean z422 = obtainStyledAttributes222.getBoolean(0, z3);
        obtainStyledAttributes222.recycle();
        setNestedScrollingEnabled(z422);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        H h = this.f2136m;
        if (h != null) {
            return h.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
