package k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import xyz.happify.ckemv.R;

/* renamed from: k.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0311u0 extends ListView {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3780b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f3781d;

    /* renamed from: e, reason: collision with root package name */
    public int f3782e;

    /* renamed from: f, reason: collision with root package name */
    public int f3783f;
    public int g;
    public C0307s0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3784i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3785j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3786k;

    /* renamed from: l, reason: collision with root package name */
    public N.g f3787l;

    /* renamed from: m, reason: collision with root package name */
    public F0.h f3788m;

    public C0311u0(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f3780b = new Rect();
        this.c = 0;
        this.f3781d = 0;
        this.f3782e = 0;
        this.f3783f = 0;
        this.f3785j = z3;
        setCacheColorHint(0);
    }

    public final int a(int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i3, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0147 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i3) {
        boolean z3;
        boolean z4;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = false;
        if (actionMasked == 1) {
            z3 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z3 = true;
                    if (z3 || z5) {
                        this.f3786k = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.g - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (z3) {
                        N.g gVar = this.f3787l;
                        if (gVar != null) {
                            if (gVar.f671q) {
                                gVar.d();
                            }
                            gVar.f671q = false;
                        }
                    } else {
                        if (this.f3787l == null) {
                            this.f3787l = new N.g(this);
                        }
                        N.g gVar2 = this.f3787l;
                        boolean z6 = gVar2.f671q;
                        gVar2.f671q = true;
                        gVar2.onTouch(this, motionEvent);
                    }
                    return z3;
                }
                z3 = false;
                if (z3) {
                }
                this.f3786k = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.g - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (z3) {
                }
                return z3;
            }
            z3 = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i3);
        if (findPointerIndex >= 0) {
            int x2 = (int) motionEvent.getX(findPointerIndex);
            int y3 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x2, y3);
            if (pointToPosition == -1) {
                z5 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f3 = x2;
                float f4 = y3;
                this.f3786k = true;
                AbstractC0301p0.a(this, f3, f4);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.g;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.g = pointToPosition;
                AbstractC0301p0.a(childAt3, f3 - childAt3.getLeft(), f4 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z7 = (selector == null || pointToPosition == -1) ? false : true;
                if (z7) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f3780b;
                rect.set(left, top, right, bottom);
                rect.left -= this.c;
                rect.top -= this.f3781d;
                rect.right += this.f3782e;
                rect.bottom += this.f3783f;
                if (F.b.a()) {
                    z4 = AbstractC0305r0.a(this);
                } else {
                    Field field = AbstractC0309t0.f3778a;
                    if (field != null) {
                        try {
                            z4 = field.getBoolean(this);
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        }
                    }
                    z4 = false;
                }
                if (childAt3.isEnabled() != z4) {
                    boolean z8 = !z4;
                    if (F.b.a()) {
                        AbstractC0305r0.b(this, z8);
                    } else {
                        Field field2 = AbstractC0309t0.f3778a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z8));
                            } catch (IllegalAccessException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z7) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    B.b.e(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    B.b.e(selector2, f3, f4);
                }
                C0307s0 c0307s0 = this.h;
                if (c0307s0 != null) {
                    c0307s0.c = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z3 = true;
                z5 = false;
            }
            if (z3) {
            }
            this.f3786k = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.g - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (z3) {
            }
            return z3;
        }
        z3 = false;
        if (z3) {
        }
        this.f3786k = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.g - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z3) {
        }
        return z3;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f3780b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f3788m != null) {
            return;
        }
        super.drawableStateChanged();
        C0307s0 c0307s0 = this.h;
        if (c0307s0 != null) {
            c0307s0.c = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f3786k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f3785j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f3785j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f3785j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f3785j && this.f3784i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f3788m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f3788m == null) {
            F0.h hVar = new F0.h(13, this);
            this.f3788m = hVar;
            post(hVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i3 < 30 || !AbstractC0303q0.f3764d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            AbstractC0303q0.f3762a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0303q0.f3763b.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0303q0.c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e3) {
                            e3.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f3786k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        F0.h hVar = this.f3788m;
        if (hVar != null) {
            C0311u0 c0311u0 = (C0311u0) hVar.c;
            c0311u0.f3788m = null;
            c0311u0.removeCallbacks(hVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f3784i = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0307s0 c0307s0;
        if (drawable != null) {
            c0307s0 = new C0307s0(drawable);
            c0307s0.c = true;
        } else {
            c0307s0 = null;
        }
        this.h = c0307s0;
        super.setSelector(c0307s0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.c = rect.left;
        this.f3781d = rect.top;
        this.f3782e = rect.right;
        this.f3783f = rect.bottom;
    }
}
