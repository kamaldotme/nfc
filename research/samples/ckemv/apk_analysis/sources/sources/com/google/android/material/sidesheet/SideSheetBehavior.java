package com.google.android.material.sidesheet;

import F0.d;
import F0.i;
import J.B;
import J.E;
import J.H;
import J.T;
import L.a;
import Q.e;
import U0.g;
import U0.j;
import U0.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.z;
import u2.l;
import v.AbstractC0397a;
import v.C0400d;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0397a {

    /* renamed from: a, reason: collision with root package name */
    public z f2460a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2461b;
    public final ColorStateList c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2462d;

    /* renamed from: e, reason: collision with root package name */
    public final i f2463e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2464f;
    public final boolean g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public e f2465i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2466j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2467k;

    /* renamed from: l, reason: collision with root package name */
    public int f2468l;

    /* renamed from: m, reason: collision with root package name */
    public int f2469m;

    /* renamed from: n, reason: collision with root package name */
    public int f2470n;

    /* renamed from: o, reason: collision with root package name */
    public int f2471o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2472p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2473q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2474r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f2475s;

    /* renamed from: t, reason: collision with root package name */
    public int f2476t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f2477u;

    /* renamed from: v, reason: collision with root package name */
    public final d f2478v;

    public SideSheetBehavior() {
        this.f2463e = new i(this);
        this.g = true;
        this.h = 5;
        this.f2467k = 0.1f;
        this.f2474r = -1;
        this.f2477u = new LinkedHashSet();
        this.f2478v = new d(this, 1);
    }

    @Override // v.AbstractC0397a
    public final void c(C0400d c0400d) {
        this.f2472p = null;
        this.f2465i = null;
    }

    @Override // v.AbstractC0397a
    public final void e() {
        this.f2472p = null;
        this.f2465i = null;
    }

    @Override // v.AbstractC0397a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && T.d(view) == null) || !this.g) {
            this.f2466j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2475s) != null) {
            velocityTracker.recycle();
            this.f2475s = null;
        }
        if (this.f2475s == null) {
            this.f2475s = VelocityTracker.obtain();
        }
        this.f2475s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2476t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2466j) {
            this.f2466j = false;
            return false;
        }
        return (this.f2466j || (eVar = this.f2465i) == null || !eVar.o(motionEvent)) ? false : true;
    }

    @Override // v.AbstractC0397a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i5 = 0;
        int i6 = 1;
        g gVar = this.f2461b;
        WeakHashMap weakHashMap = T.f402a;
        if (B.b(coordinatorLayout) && !B.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2472p == null) {
            this.f2472p = new WeakReference(view);
            Context context = view.getContext();
            l.H(context, R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            l.G(context, R.attr.motionDurationMedium2, 300);
            l.G(context, R.attr.motionDurationShort3, 150);
            l.G(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                B.q(view, gVar);
                float f3 = this.f2464f;
                if (f3 == -1.0f) {
                    f3 = H.i(view);
                }
                gVar.j(f3);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    H.q(view, colorStateList);
                }
            }
            int i7 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i7) {
                view.setVisibility(i7);
            }
            u();
            if (B.c(view) == 0) {
                B.s(view, 1);
            }
            if (T.d(view) == null) {
                T.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i8 = Gravity.getAbsoluteGravity(((C0400d) view.getLayoutParams()).c, i3) == 3 ? 1 : 0;
        z zVar = this.f2460a;
        if (zVar == null || zVar.K() != i8) {
            k kVar = this.f2462d;
            C0400d c0400d = null;
            if (i8 == 0) {
                this.f2460a = new V0.a(this, i6);
                if (kVar != null) {
                    WeakReference weakReference = this.f2472p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0400d)) {
                        c0400d = (C0400d) view3.getLayoutParams();
                    }
                    if (c0400d == null || ((ViewGroup.MarginLayoutParams) c0400d).rightMargin <= 0) {
                        j e3 = kVar.e();
                        e3.f930f = new U0.a(0.0f);
                        e3.g = new U0.a(0.0f);
                        k a3 = e3.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException(X.d.g("Invalid sheet edge position value: ", i8, ". Must be 0 or 1."));
                }
                this.f2460a = new V0.a(this, i5);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f2472p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0400d)) {
                        c0400d = (C0400d) view2.getLayoutParams();
                    }
                    if (c0400d == null || ((ViewGroup.MarginLayoutParams) c0400d).leftMargin <= 0) {
                        j e4 = kVar.e();
                        e4.f929e = new U0.a(0.0f);
                        e4.h = new U0.a(0.0f);
                        k a4 = e4.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a4);
                        }
                    }
                }
            }
        }
        if (this.f2465i == null) {
            this.f2465i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2478v);
        }
        int G2 = this.f2460a.G(view);
        coordinatorLayout.p(view, i3);
        this.f2469m = coordinatorLayout.getWidth();
        this.f2470n = this.f2460a.H(coordinatorLayout);
        this.f2468l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2471o = marginLayoutParams != null ? this.f2460a.d(marginLayoutParams) : 0;
        int i9 = this.h;
        if (i9 == 1 || i9 == 2) {
            i5 = G2 - this.f2460a.G(view);
        } else if (i9 != 3) {
            if (i9 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            i5 = this.f2460a.D();
        }
        view.offsetLeftAndRight(i5);
        if (this.f2473q == null && (i4 = this.f2474r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f2473q = new WeakReference(findViewById);
        }
        Iterator it = this.f2477u.iterator();
        while (it.hasNext()) {
            X.d.q(it.next());
        }
        return true;
    }

    @Override // v.AbstractC0397a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // v.AbstractC0397a
    public final void m(View view, Parcelable parcelable) {
        int i3 = ((V0.d) parcelable).f979d;
        if (i3 == 1 || i3 == 2) {
            i3 = 5;
        }
        this.h = i3;
    }

    @Override // v.AbstractC0397a
    public final Parcelable n(View view) {
        return new V0.d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // v.AbstractC0397a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.f2465i.i(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2475s) != null) {
            velocityTracker.recycle();
            this.f2475s = null;
        }
        if (this.f2475s == null) {
            this.f2475s = VelocityTracker.obtain();
        }
        this.f2475s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f2466j && s()) {
            float abs = Math.abs(this.f2476t - motionEvent.getX());
            e eVar = this.f2465i;
            if (abs > eVar.f802b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2466j;
    }

    public final void r(int i3) {
        View view;
        if (this.h == i3) {
            return;
        }
        this.h = i3;
        WeakReference weakReference = this.f2472p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f2477u.iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
        u();
    }

    public final boolean s() {
        return this.f2465i != null && (this.g || this.h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r1.n(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r(2);
        r2.f2463e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(View view, int i3, boolean z3) {
        int C2;
        if (i3 == 3) {
            C2 = this.f2460a.C();
        } else {
            if (i3 != 5) {
                throw new IllegalArgumentException(X.d.f("Invalid state to get outer edge offset: ", i3));
            }
            C2 = this.f2460a.D();
        }
        e eVar = this.f2465i;
        if (eVar != null) {
            if (!z3) {
                int top = view.getTop();
                eVar.f815r = view;
                eVar.c = -1;
                boolean h = eVar.h(C2, top, 0, 0);
                if (!h && eVar.f801a == 0 && eVar.f815r != null) {
                    eVar.f815r = null;
                }
            }
        }
        r(i3);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f2472p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        T.i(view, 262144);
        T.g(view, 0);
        T.i(view, 1048576);
        T.g(view, 0);
        final int i3 = 5;
        if (this.h != 5) {
            T.j(view, K.j.f588j, new K.B() { // from class: V0.b
                @Override // K.B
                public final boolean e(View view2) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i4 = i3;
                    if (i4 == 1 || i4 == 2) {
                        throw new IllegalArgumentException(X.d.j(new StringBuilder("STATE_"), i4 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2472p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i4);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2472p.get();
                        c cVar = new c(i4, 0, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f402a;
                            if (E.b(view3)) {
                                view3.post(cVar);
                            }
                        }
                        cVar.run();
                    }
                    return true;
                }
            });
        }
        final int i4 = 3;
        if (this.h != 3) {
            T.j(view, K.j.h, new K.B() { // from class: V0.b
                @Override // K.B
                public final boolean e(View view2) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i42 = i4;
                    if (i42 == 1 || i42 == 2) {
                        throw new IllegalArgumentException(X.d.j(new StringBuilder("STATE_"), i42 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2472p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i42);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2472p.get();
                        c cVar = new c(i42, 0, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent != null && parent.isLayoutRequested()) {
                            WeakHashMap weakHashMap = T.f402a;
                            if (E.b(view3)) {
                                view3.post(cVar);
                            }
                        }
                        cVar.run();
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2463e = new i(this);
        this.g = true;
        this.h = 5;
        this.f2467k = 0.1f;
        this.f2474r = -1;
        this.f2477u = new LinkedHashSet();
        this.f2478v = new d(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f40v);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = l.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2462d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2474r = resourceId;
            WeakReference weakReference = this.f2473q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2473q = null;
            WeakReference weakReference2 = this.f2472p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = T.f402a;
                    if (E.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2462d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2461b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f2461b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2461b.setTint(typedValue.data);
            }
        }
        this.f2464f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
