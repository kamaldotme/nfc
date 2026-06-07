package com.google.android.material.bottomsheet;

import A1.h;
import F0.b;
import F0.c;
import F0.d;
import F0.i;
import J.B;
import J.C;
import J.C0000a;
import J.C0004c;
import J.C0006e;
import J.E;
import J.F;
import J.H;
import J.T;
import J.g0;
import J.h0;
import J.i0;
import K.j;
import L.a;
import Q.e;
import U0.f;
import U0.g;
import U0.k;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import u2.l;
import v.AbstractC0397a;
import v.C0400d;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0397a {

    /* renamed from: A, reason: collision with root package name */
    public final i f2280A;

    /* renamed from: B, reason: collision with root package name */
    public final ValueAnimator f2281B;

    /* renamed from: C, reason: collision with root package name */
    public final int f2282C;
    public int D;

    /* renamed from: E, reason: collision with root package name */
    public int f2283E;

    /* renamed from: F, reason: collision with root package name */
    public final float f2284F;

    /* renamed from: G, reason: collision with root package name */
    public int f2285G;

    /* renamed from: H, reason: collision with root package name */
    public final float f2286H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2287I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2288J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f2289K;

    /* renamed from: L, reason: collision with root package name */
    public int f2290L;

    /* renamed from: M, reason: collision with root package name */
    public e f2291M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2292N;

    /* renamed from: O, reason: collision with root package name */
    public int f2293O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2294P;

    /* renamed from: Q, reason: collision with root package name */
    public final float f2295Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2296R;

    /* renamed from: S, reason: collision with root package name */
    public int f2297S;

    /* renamed from: T, reason: collision with root package name */
    public int f2298T;

    /* renamed from: U, reason: collision with root package name */
    public WeakReference f2299U;

    /* renamed from: V, reason: collision with root package name */
    public WeakReference f2300V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f2301W;

    /* renamed from: X, reason: collision with root package name */
    public VelocityTracker f2302X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2303Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f2304Z;

    /* renamed from: a, reason: collision with root package name */
    public final int f2305a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2306a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2307b;

    /* renamed from: b0, reason: collision with root package name */
    public HashMap f2308b0;
    public final float c;

    /* renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f2309c0;

    /* renamed from: d, reason: collision with root package name */
    public final int f2310d;

    /* renamed from: d0, reason: collision with root package name */
    public final d f2311d0;

    /* renamed from: e, reason: collision with root package name */
    public int f2312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2313f;
    public int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final g f2314i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f2315j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2316k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2317l;

    /* renamed from: m, reason: collision with root package name */
    public int f2318m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2319n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2320o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2321p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2322q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2323r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f2324s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f2325t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2326u;

    /* renamed from: v, reason: collision with root package name */
    public int f2327v;

    /* renamed from: w, reason: collision with root package name */
    public int f2328w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2329x;

    /* renamed from: y, reason: collision with root package name */
    public final k f2330y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2331z;

    public BottomSheetBehavior() {
        this.f2305a = 0;
        this.f2307b = true;
        this.f2316k = -1;
        this.f2317l = -1;
        this.f2280A = new i(this);
        this.f2284F = 0.5f;
        this.f2286H = -1.0f;
        this.f2289K = true;
        this.f2290L = 4;
        this.f2295Q = 0.1f;
        this.f2301W = new ArrayList();
        this.f2304Z = -1;
        this.f2309c0 = new SparseIntArray();
        this.f2311d0 = new d(this, 0);
    }

    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = T.f402a;
        if (H.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View v3 = v(viewGroup.getChildAt(i3));
                if (v3 != null) {
                    return v3;
                }
            }
        }
        return null;
    }

    public static int w(int i3, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    public final void A(int i3) {
        if (i3 == -1) {
            if (this.f2313f) {
                return;
            } else {
                this.f2313f = true;
            }
        } else {
            if (!this.f2313f && this.f2312e == i3) {
                return;
            }
            this.f2313f = false;
            this.f2312e = Math.max(0, i3);
        }
        I();
    }

    public final void B(int i3) {
        if (i3 == 1 || i3 == 2) {
            throw new IllegalArgumentException(X.d.j(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.f2287I || i3 != 5) {
            int i4 = (i3 == 6 && this.f2307b && y(i3) <= this.D) ? 3 : i3;
            WeakReference weakReference = this.f2299U;
            if (weakReference == null || weakReference.get() == null) {
                C(i3);
                return;
            }
            View view = (View) this.f2299U.get();
            b bVar = new b(this, view, i4);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = T.f402a;
                if (E.b(view)) {
                    view.post(bVar);
                    return;
                }
            }
            bVar.run();
        }
    }

    public final void C(int i3) {
        if (this.f2290L == i3) {
            return;
        }
        this.f2290L = i3;
        if (i3 != 4 && i3 != 3 && i3 != 6) {
            boolean z3 = this.f2287I;
        }
        WeakReference weakReference = this.f2299U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i3 == 3) {
            H(true);
        } else if (i3 == 6 || i3 == 5 || i3 == 4) {
            H(false);
        }
        G(i3, true);
        ArrayList arrayList = this.f2301W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            X.d.q(arrayList.get(0));
            throw null;
        }
    }

    public final boolean D(View view, float f3) {
        if (this.f2288J) {
            return true;
        }
        if (view.getTop() < this.f2285G) {
            return false;
        }
        return Math.abs(((f3 * this.f2295Q) + ((float) view.getTop())) - ((float) this.f2285G)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.f2280A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(View view, int i3, boolean z3) {
        int y3 = y(i3);
        e eVar = this.f2291M;
        if (eVar != null) {
            if (!z3) {
                int left = view.getLeft();
                eVar.f815r = view;
                eVar.c = -1;
                boolean h = eVar.h(left, y3, 0, 0);
                if (!h && eVar.f801a == 0 && eVar.f815r != null) {
                    eVar.f815r = null;
                }
            }
        }
        C(i3);
    }

    public final void F() {
        View view;
        int i3;
        WeakReference weakReference = this.f2299U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 524288);
        T.g(view, 0);
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        SparseIntArray sparseIntArray = this.f2309c0;
        int i4 = sparseIntArray.get(0, -1);
        if (i4 != -1) {
            T.i(view, i4);
            T.g(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2307b && this.f2290L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            F0.e eVar = new F0.e(this, 6);
            ArrayList e3 = T.e(view);
            int i5 = 0;
            while (true) {
                if (i5 >= e3.size()) {
                    int i6 = 0;
                    int i7 = -1;
                    while (true) {
                        int[] iArr = T.f404d;
                        if (i6 >= iArr.length || i7 != -1) {
                            break;
                        }
                        int i8 = iArr[i6];
                        boolean z3 = true;
                        for (int i9 = 0; i9 < e3.size(); i9++) {
                            z3 &= ((j) e3.get(i9)).a() != i8;
                        }
                        if (z3) {
                            i7 = i8;
                        }
                        i6++;
                    }
                    i3 = i7;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((j) e3.get(i5)).f591a).getLabel())) {
                        i3 = ((j) e3.get(i5)).a();
                        break;
                    }
                    i5++;
                }
            }
            if (i3 != -1) {
                j jVar = new j(null, i3, string, eVar, null);
                View.AccessibilityDelegate c = T.c(view);
                C0004c c0004c = c == null ? null : c instanceof C0000a ? ((C0000a) c).f411a : new C0004c(c);
                if (c0004c == null) {
                    c0004c = new C0004c();
                }
                T.l(view, c0004c);
                T.i(view, jVar.a());
                T.e(view).add(jVar);
                T.g(view, 0);
            }
            sparseIntArray.put(0, i3);
        }
        if (this.f2287I && this.f2290L != 5) {
            T.j(view, j.f588j, new F0.e(this, 5));
        }
        int i10 = this.f2290L;
        if (i10 == 3) {
            T.j(view, j.f587i, new F0.e(this, this.f2307b ? 4 : 6));
            return;
        }
        if (i10 == 4) {
            T.j(view, j.h, new F0.e(this, this.f2307b ? 3 : 6));
        } else {
            if (i10 != 6) {
                return;
            }
            T.j(view, j.f587i, new F0.e(this, 4));
            T.j(view, j.h, new F0.e(this, 3));
        }
    }

    public final void G(int i3, boolean z3) {
        g gVar = this.f2314i;
        ValueAnimator valueAnimator = this.f2281B;
        if (i3 == 2) {
            return;
        }
        boolean z4 = this.f2290L == 3 && (this.f2329x || z());
        if (this.f2331z == z4 || gVar == null) {
            return;
        }
        this.f2331z = z4;
        if (z3 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f906b.f893j, z4 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float s3 = this.f2331z ? s() : 1.0f;
        f fVar = gVar.f906b;
        if (fVar.f893j != s3) {
            fVar.f893j = s3;
            gVar.f909f = true;
            gVar.invalidateSelf();
        }
    }

    public final void H(boolean z3) {
        WeakReference weakReference = this.f2299U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f2308b0 != null) {
                    return;
                } else {
                    this.f2308b0 = new HashMap(childCount);
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (childAt != this.f2299U.get() && z3) {
                    this.f2308b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z3) {
                return;
            }
            this.f2308b0 = null;
        }
    }

    public final void I() {
        View view;
        if (this.f2299U != null) {
            r();
            if (this.f2290L != 4 || (view = (View) this.f2299U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // v.AbstractC0397a
    public final void c(C0400d c0400d) {
        this.f2299U = null;
        this.f2291M = null;
    }

    @Override // v.AbstractC0397a
    public final void e() {
        this.f2299U = null;
        this.f2291M = null;
    }

    @Override // v.AbstractC0397a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i3;
        e eVar;
        if (!view.isShown() || !this.f2289K) {
            this.f2292N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2303Y = -1;
            this.f2304Z = -1;
            VelocityTracker velocityTracker = this.f2302X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2302X = null;
            }
        }
        if (this.f2302X == null) {
            this.f2302X = VelocityTracker.obtain();
        }
        this.f2302X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2304Z = (int) motionEvent.getY();
            if (this.f2290L != 2) {
                WeakReference weakReference = this.f2300V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.n(view2, x2, this.f2304Z)) {
                    this.f2303Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2306a0 = true;
                }
            }
            this.f2292N = this.f2303Y == -1 && !coordinatorLayout.n(view, x2, this.f2304Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2306a0 = false;
            this.f2303Y = -1;
            if (this.f2292N) {
                this.f2292N = false;
                return false;
            }
        }
        if (!this.f2292N && (eVar = this.f2291M) != null && eVar.o(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2300V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2292N || this.f2290L == 1 || coordinatorLayout.n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2291M == null || (i3 = this.f2304Z) == -1 || Math.abs(((float) i3) - motionEvent.getY()) <= ((float) this.f2291M.f802b)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [O0.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r8v1, types: [v0.r, java.lang.Object, J.q] */
    @Override // v.AbstractC0397a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        int i4 = this.f2317l;
        g gVar = this.f2314i;
        WeakHashMap weakHashMap = T.f402a;
        if (B.b(coordinatorLayout) && !B.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2299U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i5 = Build.VERSION.SDK_INT;
            boolean z3 = (i5 < 29 || this.f2319n || this.f2313f) ? false : true;
            if (this.f2320o || this.f2321p || this.f2322q || this.f2324s || this.f2325t || this.f2326u || z3) {
                h hVar = new h(this, z3);
                int f3 = C.f(view);
                view.getPaddingTop();
                int e3 = C.e(view);
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.f775a = f3;
                obj.f776b = e3;
                obj.c = paddingBottom;
                ?? obj2 = new Object();
                obj2.f5124b = hVar;
                obj2.c = obj;
                H.u(view, obj2);
                if (E.b(view)) {
                    F.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new Object());
                }
            }
            C0006e c0006e = new C0006e(view);
            if (i5 >= 30) {
                view.setWindowInsetsAnimationCallback(new i0(c0006e));
            } else {
                PathInterpolator pathInterpolator = h0.f426e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                g0 g0Var = new g0(view, c0006e);
                view.setTag(R.id.tag_window_insets_animation_callback, g0Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(g0Var);
                }
            }
            this.f2299U = new WeakReference(view);
            Context context = view.getContext();
            l.H(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.G(context, R.attr.motionDurationMedium2, 300);
            l.G(context, R.attr.motionDurationShort3, 150);
            l.G(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (gVar != null) {
                B.q(view, gVar);
                float f4 = this.f2286H;
                if (f4 == -1.0f) {
                    f4 = H.i(view);
                }
                gVar.j(f4);
            } else {
                ColorStateList colorStateList = this.f2315j;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            F();
            if (B.c(view) == 0) {
                B.s(view, 1);
            }
        }
        if (this.f2291M == null) {
            this.f2291M = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2311d0);
        }
        int top = view.getTop();
        coordinatorLayout.p(view, i3);
        this.f2297S = coordinatorLayout.getWidth();
        this.f2298T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2296R = height;
        int i6 = this.f2298T;
        int i7 = i6 - height;
        int i8 = this.f2328w;
        if (i7 < i8) {
            if (this.f2323r) {
                if (i4 != -1) {
                    i6 = Math.min(i6, i4);
                }
                this.f2296R = i6;
            } else {
                int i9 = i6 - i8;
                if (i4 != -1) {
                    i9 = Math.min(i9, i4);
                }
                this.f2296R = i9;
            }
        }
        this.D = Math.max(0, this.f2298T - this.f2296R);
        this.f2283E = (int) ((1.0f - this.f2284F) * this.f2298T);
        r();
        int i10 = this.f2290L;
        if (i10 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.f2283E);
        } else if (this.f2287I && i10 == 5) {
            view.offsetTopAndBottom(this.f2298T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f2285G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f2290L, false);
        this.f2300V = new WeakReference(v(view));
        ArrayList arrayList = this.f2301W;
        if (arrayList.size() <= 0) {
            return true;
        }
        X.d.q(arrayList.get(0));
        throw null;
    }

    @Override // v.AbstractC0397a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f2316k, marginLayoutParams.width), w(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2317l, marginLayoutParams.height));
        return true;
    }

    @Override // v.AbstractC0397a
    public final boolean i(View view) {
        WeakReference weakReference = this.f2300V;
        return (weakReference == null || view != weakReference.get() || this.f2290L == 3) ? false : true;
    }

    @Override // v.AbstractC0397a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        boolean z3 = this.f2289K;
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.f2300V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i6 = top - i4;
        if (i4 > 0) {
            if (i6 < x()) {
                int x2 = top - x();
                iArr[1] = x2;
                WeakHashMap weakHashMap = T.f402a;
                view.offsetTopAndBottom(-x2);
                C(3);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap2 = T.f402a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
            int i7 = this.f2285G;
            if (i6 > i7 && !this.f2287I) {
                int i8 = top - i7;
                iArr[1] = i8;
                WeakHashMap weakHashMap3 = T.f402a;
                view.offsetTopAndBottom(-i8);
                C(4);
            } else {
                if (!z3) {
                    return;
                }
                iArr[1] = i4;
                WeakHashMap weakHashMap4 = T.f402a;
                view.offsetTopAndBottom(-i4);
                C(1);
            }
        }
        u(view.getTop());
        this.f2293O = i4;
        this.f2294P = true;
    }

    @Override // v.AbstractC0397a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // v.AbstractC0397a
    public final void m(View view, Parcelable parcelable) {
        F0.g gVar = (F0.g) parcelable;
        int i3 = this.f2305a;
        if (i3 != 0) {
            if (i3 == -1 || (i3 & 1) == 1) {
                this.f2312e = gVar.f169e;
            }
            if (i3 == -1 || (i3 & 2) == 2) {
                this.f2307b = gVar.f170f;
            }
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f2287I = gVar.g;
            }
            if (i3 == -1 || (i3 & 8) == 8) {
                this.f2288J = gVar.h;
            }
        }
        int i4 = gVar.f168d;
        if (i4 == 1 || i4 == 2) {
            this.f2290L = 4;
        } else {
            this.f2290L = i4;
        }
    }

    @Override // v.AbstractC0397a
    public final Parcelable n(View view) {
        return new F0.g(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // v.AbstractC0397a
    public final boolean o(View view, int i3, int i4) {
        this.f2293O = 0;
        this.f2294P = false;
        return (i3 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4.getTop() <= r3.f2283E) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (java.lang.Math.abs(r5 - r3.D) < java.lang.Math.abs(r5 - r3.f2285G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
    
        if (r5 < java.lang.Math.abs(r5 - r3.f2285G)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f2285G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f2283E) < java.lang.Math.abs(r5 - r3.f2285G)) goto L50;
     */
    @Override // v.AbstractC0397a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, View view2, int i3) {
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == x()) {
            C(3);
            return;
        }
        WeakReference weakReference = this.f2300V;
        if (weakReference != null && view2 == weakReference.get() && this.f2294P) {
            if (this.f2293O > 0) {
                if (!this.f2307b) {
                }
                E(view, i4, false);
                this.f2294P = false;
            }
            if (this.f2287I) {
                VelocityTracker velocityTracker = this.f2302X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.f2302X.getYVelocity(this.f2303Y);
                }
                if (D(view, yVelocity)) {
                    i4 = 5;
                    E(view, i4, false);
                    this.f2294P = false;
                }
            }
            if (this.f2293O == 0) {
                int top = view.getTop();
                if (!this.f2307b) {
                    int i5 = this.f2283E;
                    if (top < i5) {
                    }
                    i4 = 6;
                }
            } else {
                if (!this.f2307b) {
                    int top2 = view.getTop();
                }
                i4 = 4;
            }
            E(view, i4, false);
            this.f2294P = false;
        }
    }

    @Override // v.AbstractC0397a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f2290L;
        if (i3 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f2291M;
        if (eVar != null && (this.f2289K || i3 == 1)) {
            eVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2303Y = -1;
            this.f2304Z = -1;
            VelocityTracker velocityTracker = this.f2302X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2302X = null;
            }
        }
        if (this.f2302X == null) {
            this.f2302X = VelocityTracker.obtain();
        }
        this.f2302X.addMovement(motionEvent);
        if (this.f2291M != null && ((this.f2289K || this.f2290L == 1) && actionMasked == 2 && !this.f2292N)) {
            float abs = Math.abs(this.f2304Z - motionEvent.getY());
            e eVar2 = this.f2291M;
            if (abs > eVar2.f802b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2292N;
    }

    public final void r() {
        int t3 = t();
        if (this.f2307b) {
            this.f2285G = Math.max(this.f2298T - t3, this.D);
        } else {
            this.f2285G = this.f2298T - t3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        float f3;
        RoundedCorner roundedCorner2;
        int radius;
        int radius2;
        float f4 = 0.0f;
        if (this.f2314i != null && (weakReference = this.f2299U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2299U.get();
            if (z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                g gVar = this.f2314i;
                float a3 = gVar.f906b.f887a.f938e.a(gVar.g());
                roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    radius2 = roundedCorner.getRadius();
                    float f5 = radius2;
                    if (f5 > 0.0f && a3 > 0.0f) {
                        f3 = f5 / a3;
                        g gVar2 = this.f2314i;
                        float a4 = gVar2.f906b.f887a.f939f.a(gVar2.g());
                        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner2 != null) {
                            radius = roundedCorner2.getRadius();
                            float f6 = radius;
                            if (f6 > 0.0f && a4 > 0.0f) {
                                f4 = f6 / a4;
                            }
                        }
                        return Math.max(f3, f4);
                    }
                }
                f3 = 0.0f;
                g gVar22 = this.f2314i;
                float a42 = gVar22.f906b.f887a.f939f.a(gVar22.g());
                roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                }
                return Math.max(f3, f4);
            }
        }
        return 0.0f;
    }

    public final int t() {
        int i3;
        return this.f2313f ? Math.min(Math.max(this.g, this.f2298T - ((this.f2297S * 9) / 16)), this.f2296R) + this.f2327v : (this.f2319n || this.f2320o || (i3 = this.f2318m) <= 0) ? this.f2312e + this.f2327v : Math.max(this.f2312e, i3 + this.h);
    }

    public final void u(int i3) {
        if (((View) this.f2299U.get()) != null) {
            ArrayList arrayList = this.f2301W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i4 = this.f2285G;
            if (i3 <= i4 && i4 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            X.d.q(arrayList.get(0));
            throw null;
        }
    }

    public final int x() {
        if (this.f2307b) {
            return this.D;
        }
        return Math.max(this.f2282C, this.f2323r ? 0 : this.f2328w);
    }

    public final int y(int i3) {
        if (i3 == 3) {
            return x();
        }
        if (i3 == 4) {
            return this.f2285G;
        }
        if (i3 == 5) {
            return this.f2298T;
        }
        if (i3 == 6) {
            return this.f2283E;
        }
        throw new IllegalArgumentException(X.d.f("Invalid state to get top offset: ", i3));
    }

    public final boolean z() {
        WeakReference weakReference = this.f2299U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2299U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i3;
        int i4 = 0;
        this.f2305a = 0;
        this.f2307b = true;
        this.f2316k = -1;
        this.f2317l = -1;
        this.f2280A = new i(this);
        this.f2284F = 0.5f;
        this.f2286H = -1.0f;
        this.f2289K = true;
        this.f2290L = 4;
        this.f2295Q = 0.1f;
        this.f2301W = new ArrayList();
        this.f2304Z = -1;
        this.f2309c0 = new SparseIntArray();
        this.f2311d0 = new d(this, i4);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f22a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2315j = l.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f2330y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f2330y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2314i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f2315j;
            if (colorStateList != null) {
                this.f2314i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2314i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f2281B = ofFloat;
        ofFloat.setDuration(500L);
        this.f2281B.addUpdateListener(new c(i4, this));
        this.f2286H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2316k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2317l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i3 = peekValue.data) == -1) {
            A(i3);
        } else {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z3 = obtainStyledAttributes.getBoolean(8, false);
        if (this.f2287I != z3) {
            this.f2287I = z3;
            if (!z3 && this.f2290L == 5) {
                B(4);
            }
            F();
        }
        this.f2319n = obtainStyledAttributes.getBoolean(13, false);
        boolean z4 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2307b != z4) {
            this.f2307b = z4;
            if (this.f2299U != null) {
                r();
            }
            C((this.f2307b && this.f2290L == 6) ? 3 : this.f2290L);
            G(this.f2290L, true);
            F();
        }
        this.f2288J = obtainStyledAttributes.getBoolean(12, false);
        this.f2289K = obtainStyledAttributes.getBoolean(4, true);
        this.f2305a = obtainStyledAttributes.getInt(10, 0);
        float f3 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f2284F = f3;
            if (this.f2299U != null) {
                this.f2283E = (int) ((1.0f - f3) * this.f2298T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i5 = peekValue2.data;
                if (i5 >= 0) {
                    this.f2282C = i5;
                    G(this.f2290L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2282C = dimensionPixelOffset;
                    G(this.f2290L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2310d = obtainStyledAttributes.getInt(11, 500);
            this.f2320o = obtainStyledAttributes.getBoolean(17, false);
            this.f2321p = obtainStyledAttributes.getBoolean(18, false);
            this.f2322q = obtainStyledAttributes.getBoolean(19, false);
            this.f2323r = obtainStyledAttributes.getBoolean(20, true);
            this.f2324s = obtainStyledAttributes.getBoolean(14, false);
            this.f2325t = obtainStyledAttributes.getBoolean(15, false);
            this.f2326u = obtainStyledAttributes.getBoolean(16, false);
            this.f2329x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
