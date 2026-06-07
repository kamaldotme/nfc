package androidx.coordinatorlayout.widget;

import I.b;
import I.c;
import J.AbstractC0011j;
import J.B;
import J.C;
import J.E;
import J.F;
import J.H;
import J.InterfaceC0016o;
import J.InterfaceC0017p;
import J.T;
import J.y0;
import O0.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f.C0150G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import n.C0342k;
import u.AbstractC0390a;
import v.AbstractC0397a;
import v.C0400d;
import v.InterfaceC0398b;
import v.ViewGroupOnHierarchyChangeListenerC0399c;
import v.e;
import v.f;
import v.g;
import v0.i;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0016o, InterfaceC0017p {

    /* renamed from: u, reason: collision with root package name */
    public static final String f1698u;

    /* renamed from: v, reason: collision with root package name */
    public static final Class[] f1699v;

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal f1700w;

    /* renamed from: x, reason: collision with root package name */
    public static final l f1701x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f1702y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1703b;
    public final i c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1704d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1705e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1706f;
    public final int[] g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1707i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f1708j;

    /* renamed from: k, reason: collision with root package name */
    public View f1709k;

    /* renamed from: l, reason: collision with root package name */
    public View f1710l;

    /* renamed from: m, reason: collision with root package name */
    public e f1711m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1712n;

    /* renamed from: o, reason: collision with root package name */
    public y0 f1713o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1714p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f1715q;

    /* renamed from: r, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1716r;

    /* renamed from: s, reason: collision with root package name */
    public C0150G f1717s;

    /* renamed from: t, reason: collision with root package name */
    public final A1.i f1718t;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1698u = r02 != null ? r02.getName() : null;
        f1701x = new l(4);
        f1699v = new Class[]{Context.class, AttributeSet.class};
        f1700w = new ThreadLocal();
        f1702y = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1703b = new ArrayList();
        this.c = new i(7);
        this.f1704d = new ArrayList();
        this.f1705e = new ArrayList();
        this.f1706f = new int[2];
        this.g = new int[2];
        this.f1718t = new A1.i(2);
        int[] iArr = AbstractC0390a.f5014a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1708j = intArray;
            float f3 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.f1708j[i3] = (int) (r1[i3] * f3);
            }
        }
        this.f1715q = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        v();
        super.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC0399c(this));
        WeakHashMap weakHashMap = T.f402a;
        if (B.c(this) == 0) {
            B.s(this, 1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1702y.a();
        return rect == null ? new Rect() : rect;
    }

    public static void l(int i3, Rect rect, Rect rect2, C0400d c0400d, int i4, int i5) {
        int i6 = c0400d.c;
        if (i6 == 0) {
            i6 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, i3);
        int i7 = c0400d.f5048d;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i7, i3);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int i10 = absoluteGravity2 & 7;
        int i11 = absoluteGravity2 & 112;
        int width = i10 != 1 ? i10 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i11 != 16 ? i11 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i8 == 1) {
            width -= i4 / 2;
        } else if (i8 != 5) {
            width -= i4;
        }
        if (i9 == 16) {
            height -= i5 / 2;
        } else if (i9 != 80) {
            height -= i5;
        }
        rect2.set(width, height, i4 + width, i5 + height);
    }

    public static C0400d m(View view) {
        C0400d c0400d = (C0400d) view.getLayoutParams();
        if (!c0400d.f5047b) {
            InterfaceC0398b interfaceC0398b = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0398b = (InterfaceC0398b) cls.getAnnotation(InterfaceC0398b.class);
                if (interfaceC0398b != null) {
                    break;
                }
            }
            if (interfaceC0398b != null) {
                try {
                    AbstractC0397a abstractC0397a = (AbstractC0397a) interfaceC0398b.value().getDeclaredConstructor(null).newInstance(null);
                    AbstractC0397a abstractC0397a2 = c0400d.f5046a;
                    if (abstractC0397a2 != abstractC0397a) {
                        if (abstractC0397a2 != null) {
                            abstractC0397a2.e();
                        }
                        c0400d.f5046a = abstractC0397a;
                        c0400d.f5047b = true;
                        if (abstractC0397a != null) {
                            abstractC0397a.c(c0400d);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC0398b.value().getClass();
                }
            }
            c0400d.f5047b = true;
        }
        return c0400d;
    }

    public static void t(View view, int i3) {
        C0400d c0400d = (C0400d) view.getLayoutParams();
        int i4 = c0400d.f5051i;
        if (i4 != i3) {
            WeakHashMap weakHashMap = T.f402a;
            view.offsetLeftAndRight(i3 - i4);
            c0400d.f5051i = i3;
        }
    }

    public static void u(View view, int i3) {
        C0400d c0400d = (C0400d) view.getLayoutParams();
        int i4 = c0400d.f5052j;
        if (i4 != i3) {
            WeakHashMap weakHashMap = T.f402a;
            view.offsetTopAndBottom(i3 - i4);
            c0400d.f5052j = i3;
        }
    }

    @Override // J.InterfaceC0016o
    public final void a(View view, View view2, int i3, int i4) {
        A1.i iVar = this.f1718t;
        if (i4 == 1) {
            iVar.c = i3;
        } else {
            iVar.f51b = i3;
        }
        this.f1710l = view2;
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            ((C0400d) getChildAt(i5).getLayoutParams()).getClass();
        }
    }

    @Override // J.InterfaceC0017p
    public final void b(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        AbstractC0397a abstractC0397a;
        int childCount = getChildCount();
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0400d c0400d = (C0400d) childAt.getLayoutParams();
                if (c0400d.a(i7) && (abstractC0397a = c0400d.f5046a) != null) {
                    int[] iArr2 = this.f1706f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0397a.k(this, childAt, i4, i5, i6, iArr2);
                    i8 = i5 > 0 ? Math.max(i8, iArr2[0]) : Math.min(i8, iArr2[0]);
                    i9 = i6 > 0 ? Math.max(i9, iArr2[1]) : Math.min(i9, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            o(1);
        }
    }

    @Override // J.InterfaceC0016o
    public final void c(View view, int i3, int i4, int i5, int i6, int i7) {
        b(view, i3, i4, i5, i6, 0, this.g);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0400d) && super.checkLayoutParams(layoutParams);
    }

    @Override // J.InterfaceC0016o
    public final void d(View view, int i3) {
        A1.i iVar = this.f1718t;
        if (i3 == 1) {
            iVar.c = 0;
        } else {
            iVar.f51b = 0;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C0400d c0400d = (C0400d) childAt.getLayoutParams();
            if (c0400d.a(i3)) {
                AbstractC0397a abstractC0397a = c0400d.f5046a;
                if (abstractC0397a != null) {
                    abstractC0397a.p(childAt, view, i3);
                }
                if (i3 == 0) {
                    c0400d.f5056n = false;
                } else if (i3 == 1) {
                    c0400d.f5057o = false;
                }
                c0400d.getClass();
            }
        }
        this.f1710l = null;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        AbstractC0397a abstractC0397a = ((C0400d) view.getLayoutParams()).f5046a;
        if (abstractC0397a != null) {
            abstractC0397a.getClass();
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1715q;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // J.InterfaceC0016o
    public final void e(View view, int i3, int i4, int[] iArr, int i5) {
        AbstractC0397a abstractC0397a;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0400d c0400d = (C0400d) childAt.getLayoutParams();
                if (c0400d.a(i5) && (abstractC0397a = c0400d.f5046a) != null) {
                    int[] iArr2 = this.f1706f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0397a.j(this, childAt, view, i3, i4, iArr2, i5);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z3) {
            o(1);
        }
    }

    @Override // J.InterfaceC0016o
    public final boolean f(View view, View view2, int i3, int i4) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0400d c0400d = (C0400d) childAt.getLayoutParams();
                AbstractC0397a abstractC0397a = c0400d.f5046a;
                if (abstractC0397a != null) {
                    boolean o3 = abstractC0397a.o(childAt, i3, i4);
                    z3 |= o3;
                    if (i4 == 0) {
                        c0400d.f5056n = o3;
                    } else if (i4 == 1) {
                        c0400d.f5057o = o3;
                    }
                } else if (i4 == 0) {
                    c0400d.f5056n = false;
                } else if (i4 == 1) {
                    c0400d.f5057o = false;
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0400d();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0400d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        r();
        return Collections.unmodifiableList(this.f1703b);
    }

    public final y0 getLastWindowInsets() {
        return this.f1713o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        A1.i iVar = this.f1718t;
        return iVar.c | iVar.f51b;
    }

    public Drawable getStatusBarBackground() {
        return this.f1715q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(C0400d c0400d, Rect rect, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0400d).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - ((ViewGroup.MarginLayoutParams) c0400d).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0400d).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) c0400d).bottomMargin));
        rect.set(max, max2, i3 + max, i4 + max2);
    }

    public final void i(View view, Rect rect, boolean z3) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final ArrayList j(View view) {
        C0342k c0342k = (C0342k) this.c.c;
        int i3 = c0342k.f4160d;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < i3; i4++) {
            ArrayList arrayList2 = (ArrayList) c0342k.j(i4);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0342k.h(i4));
            }
        }
        ArrayList arrayList3 = this.f1705e;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = g.f5061a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f5061a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f5062b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean n(View view, int i3, int i4) {
        c cVar = f1702y;
        Rect g = g();
        k(view, g);
        try {
            return g.contains(i3, i4);
        } finally {
            g.setEmpty();
            cVar.c(g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x004b A[EDGE_INSN: B:110:0x004b->B:9:0x004b BREAK  A[LOOP:2: B:102:0x02d9->B:108:0x02f0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(int i3) {
        int i4;
        Rect rect;
        int i5;
        Rect rect2;
        int i6;
        Rect rect3;
        int i7;
        int i8;
        ArrayList arrayList;
        boolean z3;
        int i9;
        int i10;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        C0400d c0400d;
        int i17;
        c cVar;
        int i18;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        ArrayList arrayList2;
        int i19;
        AbstractC0397a abstractC0397a;
        int i20 = i3;
        WeakHashMap weakHashMap = T.f402a;
        int d3 = C.d(this);
        ArrayList arrayList3 = this.f1703b;
        int size = arrayList3.size();
        Rect g = g();
        Rect g3 = g();
        Rect g4 = g();
        int i21 = 0;
        while (true) {
            c cVar2 = f1702y;
            if (i21 >= size) {
                Rect rect7 = g4;
                Rect rect8 = g3;
                Rect rect9 = g;
                rect9.setEmpty();
                cVar2.c(rect9);
                rect8.setEmpty();
                cVar2.c(rect8);
                rect7.setEmpty();
                cVar2.c(rect7);
                return;
            }
            View view = (View) arrayList3.get(i21);
            C0400d c0400d2 = (C0400d) view.getLayoutParams();
            if (i20 == 0 && view.getVisibility() == 8) {
                i6 = i20;
                i5 = d3;
                i4 = i21;
                rect3 = g4;
                rect = g3;
                rect2 = g;
                arrayList = arrayList3;
                i8 = size;
            } else {
                int i22 = 0;
                while (i22 < i21) {
                    if (c0400d2.f5054l == ((View) arrayList3.get(i22))) {
                        C0400d c0400d3 = (C0400d) view.getLayoutParams();
                        if (c0400d3.f5053k != null) {
                            Rect g5 = g();
                            Rect g6 = g();
                            arrayList2 = arrayList3;
                            Rect g7 = g();
                            k(c0400d3.f5053k, g5);
                            i(view, g6, false);
                            i19 = size;
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            c0400d = c0400d2;
                            cVar = cVar2;
                            i18 = i21;
                            i17 = d3;
                            rect4 = g4;
                            rect5 = g3;
                            rect6 = g;
                            l(d3, g5, g7, c0400d3, measuredWidth, measuredHeight);
                            boolean z4 = (g7.left == g6.left && g7.top == g6.top) ? false : true;
                            h(c0400d3, g7, measuredWidth, measuredHeight);
                            int i23 = g7.left - g6.left;
                            int i24 = g7.top - g6.top;
                            if (i23 != 0) {
                                WeakHashMap weakHashMap2 = T.f402a;
                                view.offsetLeftAndRight(i23);
                            }
                            if (i24 != 0) {
                                WeakHashMap weakHashMap3 = T.f402a;
                                view.offsetTopAndBottom(i24);
                            }
                            if (z4 && (abstractC0397a = c0400d3.f5046a) != null) {
                                abstractC0397a.d(this, view, c0400d3.f5053k);
                            }
                            g5.setEmpty();
                            cVar.c(g5);
                            g6.setEmpty();
                            cVar.c(g6);
                            g7.setEmpty();
                            cVar.c(g7);
                            i22++;
                            cVar2 = cVar;
                            size = i19;
                            arrayList3 = arrayList2;
                            d3 = i17;
                            c0400d2 = c0400d;
                            i21 = i18;
                            g4 = rect4;
                            g3 = rect5;
                            g = rect6;
                        }
                    }
                    c0400d = c0400d2;
                    i17 = d3;
                    cVar = cVar2;
                    i18 = i21;
                    rect4 = g4;
                    rect5 = g3;
                    rect6 = g;
                    arrayList2 = arrayList3;
                    i19 = size;
                    i22++;
                    cVar2 = cVar;
                    size = i19;
                    arrayList3 = arrayList2;
                    d3 = i17;
                    c0400d2 = c0400d;
                    i21 = i18;
                    g4 = rect4;
                    g3 = rect5;
                    g = rect6;
                }
                C0400d c0400d4 = c0400d2;
                int i25 = d3;
                b bVar = cVar2;
                i4 = i21;
                Rect rect10 = g4;
                rect = g3;
                Rect rect11 = g;
                ArrayList arrayList4 = arrayList3;
                int i26 = size;
                i(view, rect, true);
                if (c0400d4.g == 0 || rect.isEmpty()) {
                    i5 = i25;
                    rect2 = rect11;
                } else {
                    i5 = i25;
                    int absoluteGravity = Gravity.getAbsoluteGravity(c0400d4.g, i5);
                    int i27 = absoluteGravity & 112;
                    if (i27 == 48) {
                        rect2 = rect11;
                        rect2.top = Math.max(rect2.top, rect.bottom);
                    } else if (i27 != 80) {
                        rect2 = rect11;
                    } else {
                        rect2 = rect11;
                        rect2.bottom = Math.max(rect2.bottom, getHeight() - rect.top);
                    }
                    int i28 = absoluteGravity & 7;
                    if (i28 == 3) {
                        rect2.left = Math.max(rect2.left, rect.right);
                    } else if (i28 == 5) {
                        rect2.right = Math.max(rect2.right, getWidth() - rect.left);
                    }
                }
                if (c0400d4.h != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = T.f402a;
                    if (E.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        C0400d c0400d5 = (C0400d) view.getLayoutParams();
                        AbstractC0397a abstractC0397a2 = c0400d5.f5046a;
                        Rect g8 = g();
                        Rect g9 = g();
                        g9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (abstractC0397a2 == null || !abstractC0397a2.a(view)) {
                            g8.set(g9);
                        } else if (!g9.contains(g8)) {
                            throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g8.toShortString() + " | Bounds:" + g9.toShortString());
                        }
                        g9.setEmpty();
                        bVar.c(g9);
                        if (g8.isEmpty()) {
                            g8.setEmpty();
                            bVar.c(g8);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(c0400d5.h, i5);
                            if ((absoluteGravity2 & 48) != 48 || (i15 = (g8.top - ((ViewGroup.MarginLayoutParams) c0400d5).topMargin) - c0400d5.f5052j) >= (i16 = rect2.top)) {
                                z3 = false;
                            } else {
                                u(view, i16 - i15);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g8.bottom) - ((ViewGroup.MarginLayoutParams) c0400d5).bottomMargin) + c0400d5.f5052j) < (i14 = rect2.bottom)) {
                                u(view, height - i14);
                            } else if (!z3) {
                                i9 = 0;
                                u(view, 0);
                                if ((absoluteGravity2 & 3) == 3 || (i12 = (g8.left - ((ViewGroup.MarginLayoutParams) c0400d5).leftMargin) - c0400d5.f5051i) >= (i13 = rect2.left)) {
                                    i10 = i9;
                                } else {
                                    t(view, i13 - i12);
                                    i10 = 1;
                                }
                                if ((absoluteGravity2 & 5) != 5 && (width = ((getWidth() - g8.right) - ((ViewGroup.MarginLayoutParams) c0400d5).rightMargin) + c0400d5.f5051i) < (i11 = rect2.right)) {
                                    t(view, width - i11);
                                } else if (i10 == 0) {
                                    t(view, i9);
                                }
                                g8.setEmpty();
                                bVar.c(g8);
                                i6 = i3;
                                if (i6 != 2) {
                                    rect3 = rect10;
                                    rect3.set(((C0400d) view.getLayoutParams()).f5058p);
                                    if (rect3.equals(rect)) {
                                        i8 = i26;
                                        arrayList = arrayList4;
                                    } else {
                                        ((C0400d) view.getLayoutParams()).f5058p.set(rect);
                                    }
                                } else {
                                    rect3 = rect10;
                                }
                                i7 = i4 + 1;
                                i8 = i26;
                                while (true) {
                                    arrayList = arrayList4;
                                    if (i7 >= i8) {
                                        break;
                                    }
                                    View view2 = (View) arrayList.get(i7);
                                    AbstractC0397a abstractC0397a3 = ((C0400d) view2.getLayoutParams()).f5046a;
                                    if (abstractC0397a3 != null) {
                                        abstractC0397a3.b(view2);
                                    }
                                    i7++;
                                    arrayList4 = arrayList;
                                }
                            }
                            i9 = 0;
                            if ((absoluteGravity2 & 3) == 3) {
                            }
                            i10 = i9;
                            if ((absoluteGravity2 & 5) != 5) {
                            }
                            if (i10 == 0) {
                            }
                            g8.setEmpty();
                            bVar.c(g8);
                            i6 = i3;
                            if (i6 != 2) {
                            }
                            i7 = i4 + 1;
                            i8 = i26;
                            while (true) {
                                arrayList = arrayList4;
                                if (i7 >= i8) {
                                }
                                i7++;
                                arrayList4 = arrayList;
                            }
                        }
                    }
                }
                i6 = i3;
                if (i6 != 2) {
                }
                i7 = i4 + 1;
                i8 = i26;
                while (true) {
                    arrayList = arrayList4;
                    if (i7 >= i8) {
                    }
                    i7++;
                    arrayList4 = arrayList;
                }
            }
            size = i8;
            i21 = i4 + 1;
            g3 = rect;
            i20 = i6;
            g4 = rect3;
            arrayList3 = arrayList;
            g = rect2;
            d3 = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s(false);
        if (this.f1712n) {
            if (this.f1711m == null) {
                this.f1711m = new e(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1711m);
        }
        if (this.f1713o == null) {
            WeakHashMap weakHashMap = T.f402a;
            if (B.b(this)) {
                F.c(this);
            }
        }
        this.f1707i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s(false);
        if (this.f1712n && this.f1711m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1711m);
        }
        View view = this.f1710l;
        if (view != null) {
            d(view, 0);
        }
        this.f1707i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1714p || this.f1715q == null) {
            return;
        }
        y0 y0Var = this.f1713o;
        int d3 = y0Var != null ? y0Var.d() : 0;
        if (d3 > 0) {
            this.f1715q.setBounds(0, 0, getWidth(), d3);
            this.f1715q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s(true);
        }
        boolean q3 = q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            s(true);
        }
        return q3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        AbstractC0397a abstractC0397a;
        WeakHashMap weakHashMap = T.f402a;
        int d3 = C.d(this);
        ArrayList arrayList = this.f1703b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            if (view.getVisibility() != 8 && ((abstractC0397a = ((C0400d) view.getLayoutParams()).f5046a) == null || !abstractC0397a.g(this, view, d3))) {
                p(view, d3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0193, code lost:
    
        if (r0.h(r30, r20, r8, r21, r24) == false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i4) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        AbstractC0397a abstractC0397a;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int absoluteGravity;
        r();
        int childCount = getChildCount();
        int i20 = 0;
        loop0: while (true) {
            if (i20 >= childCount) {
                z3 = false;
                break;
            }
            View childAt = getChildAt(i20);
            C0342k c0342k = (C0342k) this.c.c;
            int i21 = c0342k.f4160d;
            for (int i22 = 0; i22 < i21; i22++) {
                ArrayList arrayList2 = (ArrayList) c0342k.j(i22);
                if (arrayList2 != null && arrayList2.contains(childAt)) {
                    z3 = true;
                    break loop0;
                }
            }
            i20++;
        }
        if (z3 != this.f1712n) {
            if (z3) {
                if (this.f1707i) {
                    if (this.f1711m == null) {
                        this.f1711m = new e(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f1711m);
                }
                this.f1712n = true;
            } else {
                if (this.f1707i && this.f1711m != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f1711m);
                }
                this.f1712n = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = T.f402a;
        int d3 = C.d(this);
        boolean z4 = d3 == 1;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        int i23 = paddingLeft + paddingRight;
        int i24 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z5 = this.f1713o != null && B.b(this);
        ArrayList arrayList3 = this.f1703b;
        int size3 = arrayList3.size();
        int i25 = suggestedMinimumWidth;
        int i26 = suggestedMinimumHeight;
        int i27 = 0;
        int i28 = 0;
        while (i28 < size3) {
            View view = (View) arrayList3.get(i28);
            if (view.getVisibility() == 8) {
                i17 = i28;
                i10 = size3;
                arrayList = arrayList3;
                i15 = paddingLeft;
                i11 = paddingRight;
                i12 = d3;
            } else {
                C0400d c0400d = (C0400d) view.getLayoutParams();
                int i29 = c0400d.f5049e;
                if (i29 < 0 || mode == 0) {
                    i5 = i27;
                    i6 = i28;
                } else {
                    i5 = i27;
                    int[] iArr = this.f1708j;
                    if (iArr == null) {
                        toString();
                        i6 = i28;
                    } else {
                        i6 = i28;
                        if (i29 < 0 || i29 >= iArr.length) {
                            toString();
                        } else {
                            i18 = iArr[i29];
                            i19 = c0400d.c;
                            if (i19 == 0) {
                                i19 = 8388661;
                            }
                            absoluteGravity = Gravity.getAbsoluteGravity(i19, d3) & 7;
                            if (!(absoluteGravity == 3 || z4) || (absoluteGravity == 5 && z4)) {
                                i7 = Math.max(0, (size - paddingRight) - i18);
                            } else if ((absoluteGravity == 5 && !z4) || (absoluteGravity == 3 && z4)) {
                                i7 = Math.max(0, i18 - paddingLeft);
                            }
                            if (z5 || B.b(view)) {
                                i8 = i3;
                                i9 = i4;
                            } else {
                                int c = this.f1713o.c() + this.f1713o.b();
                                int a3 = this.f1713o.a() + this.f1713o.d();
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - c, mode);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - a3, mode2);
                                i8 = makeMeasureSpec;
                                i9 = makeMeasureSpec2;
                            }
                            abstractC0397a = c0400d.f5046a;
                            if (abstractC0397a == null) {
                                int i30 = i5;
                                i17 = i6;
                                i15 = paddingLeft;
                                i16 = i30;
                                i11 = paddingRight;
                                i13 = i26;
                                i12 = d3;
                                i14 = i25;
                                i10 = size3;
                                arrayList = arrayList3;
                            } else {
                                i10 = size3;
                                arrayList = arrayList3;
                                i11 = paddingRight;
                                i12 = d3;
                                i13 = i26;
                                i14 = i25;
                                int i31 = i6;
                                i15 = paddingLeft;
                                i16 = i5;
                                i17 = i31;
                            }
                            measureChildWithMargins(view, i8, i7, i9, 0);
                            int max = Math.max(i14, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) c0400d).leftMargin + ((ViewGroup.MarginLayoutParams) c0400d).rightMargin);
                            int max2 = Math.max(i13, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) c0400d).topMargin + ((ViewGroup.MarginLayoutParams) c0400d).bottomMargin);
                            i25 = max;
                            i27 = View.combineMeasuredStates(i16, view.getMeasuredState());
                            i26 = max2;
                        }
                    }
                    i18 = 0;
                    i19 = c0400d.c;
                    if (i19 == 0) {
                    }
                    absoluteGravity = Gravity.getAbsoluteGravity(i19, d3) & 7;
                    if (absoluteGravity == 3) {
                    }
                    if (absoluteGravity == 5) {
                        i7 = Math.max(0, i18 - paddingLeft);
                        if (z5) {
                        }
                        i8 = i3;
                        i9 = i4;
                        abstractC0397a = c0400d.f5046a;
                        if (abstractC0397a == null) {
                        }
                        measureChildWithMargins(view, i8, i7, i9, 0);
                        int max3 = Math.max(i14, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) c0400d).leftMargin + ((ViewGroup.MarginLayoutParams) c0400d).rightMargin);
                        int max22 = Math.max(i13, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) c0400d).topMargin + ((ViewGroup.MarginLayoutParams) c0400d).bottomMargin);
                        i25 = max3;
                        i27 = View.combineMeasuredStates(i16, view.getMeasuredState());
                        i26 = max22;
                    }
                    i7 = Math.max(0, i18 - paddingLeft);
                    if (z5) {
                    }
                    i8 = i3;
                    i9 = i4;
                    abstractC0397a = c0400d.f5046a;
                    if (abstractC0397a == null) {
                    }
                    measureChildWithMargins(view, i8, i7, i9, 0);
                    int max32 = Math.max(i14, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) c0400d).leftMargin + ((ViewGroup.MarginLayoutParams) c0400d).rightMargin);
                    int max222 = Math.max(i13, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) c0400d).topMargin + ((ViewGroup.MarginLayoutParams) c0400d).bottomMargin);
                    i25 = max32;
                    i27 = View.combineMeasuredStates(i16, view.getMeasuredState());
                    i26 = max222;
                }
                i7 = 0;
                if (z5) {
                }
                i8 = i3;
                i9 = i4;
                abstractC0397a = c0400d.f5046a;
                if (abstractC0397a == null) {
                }
                measureChildWithMargins(view, i8, i7, i9, 0);
                int max322 = Math.max(i14, view.getMeasuredWidth() + i23 + ((ViewGroup.MarginLayoutParams) c0400d).leftMargin + ((ViewGroup.MarginLayoutParams) c0400d).rightMargin);
                int max2222 = Math.max(i13, view.getMeasuredHeight() + i24 + ((ViewGroup.MarginLayoutParams) c0400d).topMargin + ((ViewGroup.MarginLayoutParams) c0400d).bottomMargin);
                i25 = max322;
                i27 = View.combineMeasuredStates(i16, view.getMeasuredState());
                i26 = max2222;
            }
            i28 = i17 + 1;
            paddingLeft = i15;
            paddingRight = i11;
            d3 = i12;
            size3 = i10;
            arrayList3 = arrayList;
        }
        int i32 = i27;
        setMeasuredDimension(View.resolveSizeAndState(i25, i3, (-16777216) & i32), View.resolveSizeAndState(i26, i4, i32 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0400d c0400d = (C0400d) childAt.getLayoutParams();
                if (c0400d.a(0)) {
                    AbstractC0397a abstractC0397a = c0400d.f5046a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        AbstractC0397a abstractC0397a;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0400d c0400d = (C0400d) childAt.getLayoutParams();
                if (c0400d.a(0) && (abstractC0397a = c0400d.f5046a) != null) {
                    z3 |= abstractC0397a.i(view);
                }
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        e(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        c(view, i3, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f783b);
        SparseArray sparseArray = fVar.f5060d;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            AbstractC0397a abstractC0397a = m(childAt).f5046a;
            if (id != -1 && abstractC0397a != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0397a.m(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, P.b, v.f] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable n3;
        ?? bVar = new P.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            AbstractC0397a abstractC0397a = ((C0400d) childAt.getLayoutParams()).f5046a;
            if (id != -1 && abstractC0397a != null && (n3 = abstractC0397a.n(childAt)) != null) {
                sparseArray.append(id, n3);
            }
        }
        bVar.f5060d = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean q3;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f1709k == null) {
            z3 = q(motionEvent, 1);
        } else {
            z3 = false;
        }
        AbstractC0397a abstractC0397a = ((C0400d) this.f1709k.getLayoutParams()).f5046a;
        if (abstractC0397a != null) {
            q3 = abstractC0397a.q(this.f1709k, motionEvent);
            motionEvent2 = null;
            if (this.f1709k != null) {
                q3 |= super.onTouchEvent(motionEvent);
            } else if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                s(false);
            }
            return q3;
        }
        q3 = false;
        motionEvent2 = null;
        if (this.f1709k != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        s(false);
        return q3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, int i3) {
        Rect g;
        Rect g3;
        int i4;
        C0400d c0400d = (C0400d) view.getLayoutParams();
        View view2 = c0400d.f5053k;
        if (view2 == null && c0400d.f5050f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f1702y;
        if (view2 != null) {
            g = g();
            g3 = g();
            try {
                k(view2, g);
                C0400d c0400d2 = (C0400d) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i3, g, g3, c0400d2, measuredWidth, measuredHeight);
                h(c0400d2, g3, measuredWidth, measuredHeight);
                view.layout(g3.left, g3.top, g3.right, g3.bottom);
                return;
            } finally {
                g.setEmpty();
                cVar.c(g);
                g3.setEmpty();
                cVar.c(g3);
            }
        }
        int i5 = c0400d.f5049e;
        if (i5 < 0) {
            C0400d c0400d3 = (C0400d) view.getLayoutParams();
            g = g();
            g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0400d3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0400d3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0400d3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0400d3).bottomMargin);
            if (this.f1713o != null) {
                WeakHashMap weakHashMap = T.f402a;
                if (B.b(this) && !B.b(view)) {
                    g.left = this.f1713o.b() + g.left;
                    g.top = this.f1713o.d() + g.top;
                    g.right -= this.f1713o.c();
                    g.bottom -= this.f1713o.a();
                }
            }
            g3 = g();
            int i6 = c0400d3.c;
            if ((i6 & 7) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & 112) == 0) {
                i6 |= 48;
            }
            AbstractC0011j.b(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), g, g3, i3);
            view.layout(g3.left, g3.top, g3.right, g3.bottom);
            return;
        }
        C0400d c0400d4 = (C0400d) view.getLayoutParams();
        int i7 = c0400d4.c;
        if (i7 == 0) {
            i7 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i7, i3);
        int i8 = absoluteGravity & 7;
        int i9 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i3 == 1) {
            i5 = width - i5;
        }
        int[] iArr = this.f1708j;
        int i10 = 0;
        if (iArr == null) {
            toString();
        } else {
            if (i5 >= 0 && i5 < iArr.length) {
                i4 = iArr[i5];
                int i11 = i4 - measuredWidth2;
                if (i8 != 1) {
                    i11 += measuredWidth2 / 2;
                } else if (i8 == 5) {
                    i11 += measuredWidth2;
                }
                if (i9 != 16) {
                    i10 = measuredHeight2 / 2;
                } else if (i9 == 80) {
                    i10 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0400d4).leftMargin, Math.min(i11, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0400d4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0400d4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0400d4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            }
            toString();
        }
        i4 = 0;
        int i112 = i4 - measuredWidth2;
        if (i8 != 1) {
        }
        if (i9 != 16) {
        }
        int max3 = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0400d4).leftMargin, Math.min(i112, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0400d4).rightMargin));
        int max22 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0400d4).topMargin, Math.min(i10, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0400d4).bottomMargin));
        view.layout(max3, max22, measuredWidth2 + max3, measuredHeight2 + max22);
    }

    public final boolean q(MotionEvent motionEvent, int i3) {
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1704d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            arrayList.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        l lVar = f1701x;
        if (lVar != null) {
            Collections.sort(arrayList, lVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            C0400d c0400d = (C0400d) view.getLayoutParams();
            AbstractC0397a abstractC0397a = c0400d.f5046a;
            if (!(z4 || z5) || actionMasked == 0) {
                if (!z4 && abstractC0397a != null) {
                    if (i3 == 0) {
                        z4 = abstractC0397a.f(this, view, motionEvent);
                    } else if (i3 == 1) {
                        z4 = abstractC0397a.q(view, motionEvent);
                    }
                    if (z4) {
                        this.f1709k = view;
                    }
                }
                if (c0400d.f5046a == null) {
                    c0400d.f5055m = false;
                }
                boolean z6 = c0400d.f5055m;
                if (z6) {
                    z3 = true;
                } else {
                    c0400d.f5055m = z6;
                    z3 = z6;
                }
                z5 = z3 && !z6;
                if (z3 && !z5) {
                    break;
                }
            } else if (abstractC0397a != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    abstractC0397a.f(this, view, motionEvent2);
                } else if (i3 == 1) {
                    abstractC0397a.q(view, motionEvent2);
                }
            }
        }
        arrayList.clear();
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0144, code lost:
    
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        b bVar;
        ArrayList arrayList = this.f1703b;
        arrayList.clear();
        i iVar = this.c;
        C0342k c0342k = (C0342k) iVar.c;
        int i3 = c0342k.f4160d;
        int i4 = 0;
        while (true) {
            bVar = (b) iVar.f5076b;
            if (i4 >= i3) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) c0342k.j(i4);
            if (arrayList2 != null) {
                arrayList2.clear();
                bVar.c(arrayList2);
            }
            i4++;
        }
        c0342k.clear();
        int childCount = getChildCount();
        int i5 = 0;
        loop1: while (true) {
            C0342k c0342k2 = (C0342k) iVar.c;
            if (i5 >= childCount) {
                ArrayList arrayList3 = (ArrayList) iVar.f5077d;
                arrayList3.clear();
                HashSet hashSet = (HashSet) iVar.f5078e;
                hashSet.clear();
                int i6 = c0342k2.f4160d;
                for (int i7 = 0; i7 < i6; i7++) {
                    iVar.e(c0342k2.h(i7), arrayList3, hashSet);
                }
                arrayList.addAll(arrayList3);
                Collections.reverse(arrayList);
                return;
            }
            View childAt = getChildAt(i5);
            C0400d m3 = m(childAt);
            int i8 = m3.f5050f;
            if (i8 == -1) {
                m3.f5054l = null;
                m3.f5053k = null;
            } else {
                View view = m3.f5053k;
                if (view != null && view.getId() == i8) {
                    View view2 = m3.f5053k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt) {
                            m3.f5054l = null;
                            m3.f5053k = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        }
                    }
                    m3.f5054l = view2;
                }
                View findViewById = findViewById(i8);
                m3.f5053k = findViewById;
                if (findViewById == null) {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i8) + " to anchor view " + childAt);
                    }
                    m3.f5054l = null;
                    m3.f5053k = null;
                } else if (findViewById != this) {
                    for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                        if (parent2 != childAt) {
                            if (parent2 instanceof View) {
                                findViewById = parent2;
                            }
                        } else {
                            if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            m3.f5054l = null;
                            m3.f5053k = null;
                        }
                    }
                    m3.f5054l = findViewById;
                } else {
                    if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                    m3.f5054l = null;
                    m3.f5053k = null;
                }
            }
            if (!c0342k2.containsKey(childAt)) {
                c0342k2.put(childAt, null);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                if (i9 != i5) {
                    View childAt2 = getChildAt(i9);
                    if (childAt2 != m3.f5054l) {
                        WeakHashMap weakHashMap = T.f402a;
                        int d3 = C.d(this);
                        int absoluteGravity = Gravity.getAbsoluteGravity(((C0400d) childAt2.getLayoutParams()).g, d3);
                        if (absoluteGravity == 0 || (Gravity.getAbsoluteGravity(m3.h, d3) & absoluteGravity) != absoluteGravity) {
                            AbstractC0397a abstractC0397a = m3.f5046a;
                            if (abstractC0397a != null) {
                                abstractC0397a.b(childAt);
                            }
                        }
                    }
                    if (!c0342k2.containsKey(childAt2) && !c0342k2.containsKey(childAt2)) {
                        c0342k2.put(childAt2, null);
                    }
                    if (!c0342k2.containsKey(childAt2) || !c0342k2.containsKey(childAt)) {
                        break loop1;
                    }
                    ArrayList arrayList4 = (ArrayList) c0342k2.getOrDefault(childAt2, null);
                    if (arrayList4 == null) {
                        arrayList4 = (ArrayList) bVar.a();
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        c0342k2.put(childAt2, arrayList4);
                    }
                    arrayList4.add(childAt);
                }
            }
            i5++;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        AbstractC0397a abstractC0397a = ((C0400d) view.getLayoutParams()).f5046a;
        if (abstractC0397a != null) {
            abstractC0397a.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.h) {
            return;
        }
        s(false);
        this.h = true;
    }

    public final void s(boolean z3) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            AbstractC0397a abstractC0397a = ((C0400d) childAt.getLayoutParams()).f5046a;
            if (abstractC0397a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    abstractC0397a.f(this, childAt, obtain);
                } else {
                    abstractC0397a.q(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((C0400d) getChildAt(i4).getLayoutParams()).f5055m = false;
        }
        this.f1709k = null;
        this.h = false;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        v();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1716r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1715q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f1715q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f1715q.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1715q;
                WeakHashMap weakHashMap = T.f402a;
                B.c.b(drawable3, C.d(this));
                this.f1715q.setVisible(getVisibility() == 0, false);
                this.f1715q.setCallback(this);
            }
            WeakHashMap weakHashMap2 = T.f402a;
            B.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        setStatusBarBackground(i3 != 0 ? y.c.b(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f1715q;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f1715q.setVisible(z3, false);
    }

    public final void v() {
        WeakHashMap weakHashMap = T.f402a;
        if (!B.b(this)) {
            H.u(this, null);
            return;
        }
        if (this.f1717s == null) {
            this.f1717s = new C0150G(this);
        }
        H.u(this, this.f1717s);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1715q;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0400d) {
            return new C0400d((C0400d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0400d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0400d(layoutParams);
    }
}
