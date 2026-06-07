package androidx.core.widget;

import J.B;
import J.C0015n;
import J.H;
import J.InterfaceC0017p;
import J.T;
import N.e;
import N.i;
import N.j;
import N.k;
import N.l;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v0.f;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0017p {

    /* renamed from: B, reason: collision with root package name */
    public static final float f1736B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final i f1737C = new i(0);
    public static final int[] D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public float f1738A;

    /* renamed from: b, reason: collision with root package name */
    public final float f1739b;
    public long c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1740d;

    /* renamed from: e, reason: collision with root package name */
    public final OverScroller f1741e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1742f;
    public final EdgeEffect g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1743i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1744j;

    /* renamed from: k, reason: collision with root package name */
    public View f1745k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1746l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f1747m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1748n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1749o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1750p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1751q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1752r;

    /* renamed from: s, reason: collision with root package name */
    public int f1753s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1754t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f1755u;

    /* renamed from: v, reason: collision with root package name */
    public int f1756v;

    /* renamed from: w, reason: collision with root package name */
    public int f1757w;

    /* renamed from: x, reason: collision with root package name */
    public l f1758x;

    /* renamed from: y, reason: collision with root package name */
    public final A1.i f1759y;

    /* renamed from: z, reason: collision with root package name */
    public final C0015n f1760z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.happify.ckemv.R.attr.nestedScrollViewStyle);
        this.f1740d = new Rect();
        this.f1743i = true;
        this.f1744j = false;
        this.f1745k = null;
        this.f1746l = false;
        this.f1749o = true;
        this.f1753s = -1;
        this.f1754t = new int[2];
        this.f1755u = new int[2];
        int i3 = Build.VERSION.SDK_INT;
        this.f1742f = i3 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.g = i3 >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f1739b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f1741e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1750p = viewConfiguration.getScaledTouchSlop();
        this.f1751q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1752r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D, xyz.happify.ckemv.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1759y = new A1.i(2);
        this.f1760z = new C0015n(this);
        setNestedScrollingEnabled(true);
        T.l(this, f1737C);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1738A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1738A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1738A;
    }

    public static boolean l(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, view2);
    }

    @Override // J.InterfaceC0016o
    public final void a(View view, View view2, int i3, int i4) {
        A1.i iVar = this.f1759y;
        if (i4 == 1) {
            iVar.c = i3;
        } else {
            iVar.f51b = i3;
        }
        this.f1760z.h(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // J.InterfaceC0017p
    public final void b(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        n(i6, i7, iArr);
    }

    @Override // J.InterfaceC0016o
    public final void c(View view, int i3, int i4, int i5, int i6, int i7) {
        n(i6, i7, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void computeScroll() {
        int round;
        int i3;
        OverScroller overScroller = this.f1741e;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i4 = currY - this.f1757w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.g;
        EdgeEffect edgeEffect2 = this.f1742f;
        if (i4 <= 0 || f.w(edgeEffect2) == 0.0f) {
            if (i4 < 0 && f.w(edgeEffect) != 0.0f) {
                float f3 = height;
                round = Math.round(f.G(edgeEffect, (i4 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (round != i4) {
                    edgeEffect.finish();
                }
            }
            this.f1757w = currY;
            int[] iArr = this.f1755u;
            iArr[1] = 0;
            this.f1760z.c(0, i4, iArr, null, 1);
            i3 = i4 - iArr[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                p(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i3 - scrollY2;
                iArr[1] = 0;
                this.f1760z.e(0, scrollY2, 0, i5, this.f1754t, 1, iArr);
                i3 = i5 - iArr[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                w(1);
            }
            if (!overScroller.isFinished()) {
                w(1);
                return;
            } else {
                WeakHashMap weakHashMap = T.f402a;
                B.k(this);
                return;
            }
        }
        round = Math.round(f.G(edgeEffect2, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (round != i4) {
            edgeEffect2.finish();
        }
        i4 -= round;
        this.f1757w = currY;
        int[] iArr2 = this.f1755u;
        iArr2[1] = 0;
        this.f1760z.c(0, i4, iArr2, null, 1);
        i3 = i4 - iArr2[1];
        int scrollRange2 = getScrollRange();
        if (i3 != 0) {
        }
        if (i3 != 0) {
        }
        if (!overScroller.isFinished()) {
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // J.InterfaceC0016o
    public final void d(View view, int i3) {
        A1.i iVar = this.f1759y;
        if (i3 == 1) {
            iVar.c = 0;
        } else {
            iVar.f51b = 0;
        }
        w(i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return this.f1760z.a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f1760z.b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f1760z.c(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f1760z.e(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1742f;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = T.f402a;
                B.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.g;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (j.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            i4 = getPaddingLeft();
        }
        if (j.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = T.f402a;
            B.k(this);
        }
        canvas.restoreToCount(save2);
    }

    @Override // J.InterfaceC0016o
    public final void e(View view, int i3, int i4, int[] iArr, int i5) {
        this.f1760z.c(i3, i4, iArr, null, i5);
    }

    @Override // J.InterfaceC0016o
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1740d;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (findFocus != null && findFocus.isFocused() && (!m(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        A1.i iVar = this.f1759y;
        return iVar.c | iVar.f51b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1760z.g(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.f1740d.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? k(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? k(130) : g(130);
                }
                if (keyCode == 62) {
                    q(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return k(33);
                }
                if (keyCode == 93) {
                    return k(130);
                }
                if (keyCode == 122) {
                    q(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                q(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1760z.f442d;
    }

    public final void j(int i3) {
        if (getChildCount() > 0) {
            this.f1741e.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1760z.h(2, 1);
            this.f1757w = getScrollY();
            WeakHashMap weakHashMap = T.f402a;
            B.k(this);
        }
    }

    public final boolean k(int i3) {
        int childCount;
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f1740d;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i3, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i3, int i4) {
        Rect rect = this.f1740d;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1760z.d(scrollY2, i3 - scrollY2, i4, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1753s) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.h = (int) motionEvent.getY(i3);
            this.f1753s = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f1747m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1744j = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        float f3;
        if (motionEvent.getAction() == 8 && !this.f1746l) {
            if ((motionEvent.getSource() & 2) == 2) {
                f3 = motionEvent.getAxisValue(9);
                i3 = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                f3 = motionEvent.getAxisValue(26);
                i3 = getWidth() / 2;
            } else {
                i3 = 0;
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                s(-((int) (f3 * getVerticalScrollFactorCompat())), i3, 1, (motionEvent.getSource() & 8194) == 8194);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        OverScroller overScroller = this.f1741e;
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f1746l) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = this.f1753s;
                    if (i4 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i4)) != -1) {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y3 - this.h) > this.f1750p && (getNestedScrollAxes() & 2) == 0) {
                            this.f1746l = true;
                            this.h = y3;
                            if (this.f1747m == null) {
                                this.f1747m = VelocityTracker.obtain();
                            }
                            this.f1747m.addMovement(motionEvent);
                            this.f1756v = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        o(motionEvent);
                    }
                }
            }
            this.f1746l = false;
            this.f1753s = -1;
            VelocityTracker velocityTracker = this.f1747m;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1747m = null;
            }
            if (this.f1741e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = T.f402a;
                B.k(this);
            }
            w(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.h = y4;
                    this.f1753s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1747m;
                    if (velocityTracker2 == null) {
                        this.f1747m = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1747m.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!v(motionEvent) && overScroller.isFinished()) {
                        z3 = false;
                    }
                    this.f1746l = z3;
                    this.f1760z.h(2, 0);
                }
            }
            if (!v(motionEvent) && overScroller.isFinished()) {
                z3 = false;
            }
            this.f1746l = z3;
            VelocityTracker velocityTracker3 = this.f1747m;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1747m = null;
            }
        }
        return this.f1746l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i3, i4, i5, i6);
        int i8 = 0;
        this.f1743i = false;
        View view = this.f1745k;
        if (view != null && l(view, this)) {
            View view2 = this.f1745k;
            Rect rect = this.f1740d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        this.f1745k = null;
        if (!this.f1744j) {
            if (this.f1758x != null) {
                scrollTo(getScrollX(), this.f1758x.f674b);
                this.f1758x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1744j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f1748n && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        j((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.f1760z.b(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f1760z.c(i3, i4, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        n(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (findNextFocus == null || (true ^ m(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f1758x = lVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, N.l] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f674b = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m(findFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f1740d;
        findFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(findFocus, rect);
        int h = h(rect);
        if (h != 0) {
            if (this.f1749o) {
                u(0, h, false);
            } else {
                scrollBy(0, h);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        OverScroller overScroller = this.f1741e;
        int i3 = this.f1750p;
        EdgeEffect edgeEffect = this.f1742f;
        EdgeEffect edgeEffect2 = this.g;
        if (this.f1747m == null) {
            this.f1747m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1756v = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        obtain.offsetLocation(0.0f, this.f1756v);
        C0015n c0015n = this.f1760z;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1747m;
                velocityTracker.computeCurrentVelocity(1000, this.f1752r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1753s);
                if (Math.abs(yVelocity) >= this.f1751q) {
                    if (f.w(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (f.w(edgeEffect2) != 0.0f) {
                        int i4 = -yVelocity;
                        if (t(edgeEffect2, i4)) {
                            edgeEffect2.onAbsorb(i4);
                        } else {
                            j(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f4 = i5;
                        if (!c0015n.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            j(i5);
                        }
                    }
                } else if (this.f1741e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap = T.f402a;
                    B.k(this);
                }
                this.f1753s = -1;
                this.f1746l = false;
                VelocityTracker velocityTracker2 = this.f1747m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1747m = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1753s);
                if (findPointerIndex != -1) {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i6 = this.h - y3;
                    float x2 = motionEvent.getX(findPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (f.w(edgeEffect) != 0.0f) {
                        float f5 = -f.G(edgeEffect, -height, x2);
                        if (f.w(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f3 = f5;
                    } else if (f.w(edgeEffect2) != 0.0f) {
                        float G2 = f.G(edgeEffect2, height, 1.0f - x2);
                        if (f.w(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f3 = G2;
                    }
                    int round = Math.round(f3 * getHeight());
                    if (round != 0) {
                        invalidate();
                    }
                    int i7 = i6 - round;
                    if (!this.f1746l && Math.abs(i7) > i3) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1746l = true;
                        i7 = i7 > 0 ? i7 - i3 : i7 + i3;
                    }
                    if (this.f1746l) {
                        int s3 = s(i7, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.h = y3 - s3;
                        this.f1756v += s3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1746l && getChildCount() > 0 && this.f1741e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap2 = T.f402a;
                    B.k(this);
                }
                this.f1753s = -1;
                this.f1746l = false;
                VelocityTracker velocityTracker3 = this.f1747m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1747m = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.h = (int) motionEvent.getY(actionIndex);
                this.f1753s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1753s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1746l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.h = y4;
            this.f1753s = pointerId;
            c0015n.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1747m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(int i3, int i4, int i5, int i6) {
        boolean z3;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            z3 = false;
        } else {
            i4 = 0;
            z3 = true;
        }
        if (i7 <= i6) {
            if (i7 >= 0) {
                i6 = i7;
                z4 = false;
                if (z4 && !this.f1760z.g(1)) {
                    this.f1741e.springBack(i4, i6, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i4, i6);
                return z3 || z4;
            }
            i6 = 0;
        }
        z4 = true;
        if (z4) {
            this.f1741e.springBack(i4, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i4, i6);
        if (z3) {
            return true;
        }
    }

    public final void q(int i3) {
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f1740d;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        r(i3, i4, i5);
    }

    public final boolean r(int i3, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z7) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 < scrollY || i5 > i6) {
            s(z4 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1743i) {
            this.f1745k = view2;
        } else {
            Rect rect = this.f1740d;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h = h(rect);
            if (h != 0) {
                scrollBy(0, h);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h = h(rect);
        boolean z4 = h != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, h);
            } else {
                u(0, h, false);
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f1747m) != null) {
            velocityTracker.recycle();
            this.f1747m = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1743i = true;
        super.requestLayout();
    }

    public final int s(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        C0015n c0015n = this.f1760z;
        if (i5 == 1) {
            c0015n.h(2, i5);
        }
        boolean c = this.f1760z.c(0, i3, this.f1755u, this.f1754t, i5);
        int[] iArr = this.f1755u;
        int[] iArr2 = this.f1754t;
        if (c) {
            i6 = i3 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z5 = p(i6, 0, scrollY, scrollRange) && !c0015n.g(i5);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1760z.e(0, scrollY2, 0, i6 - scrollY2, this.f1754t, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.g;
        EdgeEffect edgeEffect2 = this.f1742f;
        if (i10 < 0) {
            if (z4) {
                f.G(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z4) {
            f.G(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            WeakHashMap weakHashMap = T.f402a;
            B.k(this);
        } else if (z5 && i5 == 0) {
            this.f1747m.clear();
        }
        if (i5 == 1) {
            w(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f1748n) {
            this.f1748n = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0015n c0015n = this.f1760z;
        if (c0015n.f442d) {
            WeakHashMap weakHashMap = T.f402a;
            H.z(c0015n.c);
        }
        c0015n.f442d = z3;
    }

    public void setOnScrollChangeListener(k kVar) {
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f1749o = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f1760z.h(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float w3 = f.w(edgeEffect) * getHeight();
        float abs = Math.abs(-i3) * 0.35f;
        float f3 = this.f1739b * 0.015f;
        double log = Math.log(abs / f3);
        double d3 = f1736B;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * log) * ((double) f3))) < w3;
    }

    public final void u(int i3, int i4, boolean z3) {
        OverScroller overScroller = this.f1741e;
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1741e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z3) {
                this.f1760z.h(2, 1);
            } else {
                w(1);
            }
            this.f1757w = getScrollY();
            WeakHashMap weakHashMap = T.f402a;
            B.k(this);
        } else {
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            scrollBy(i3, i4);
        }
        this.c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f1742f;
        if (f.w(edgeEffect) != 0.0f) {
            f.G(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.g;
        if (f.w(edgeEffect2) == 0.0f) {
            return z3;
        }
        f.G(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i3) {
        this.f1760z.i(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
