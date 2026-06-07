package androidx.fragment.app;

import J.y0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1852b;
    public ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1853d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1854e;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f1854e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T.a.f868b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f1852b == null) {
            this.f1852b = new ArrayList();
        }
        this.f1852b.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0077n ? (AbstractComponentCallbacksC0077n) tag : null) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0077n ? (AbstractComponentCallbacksC0077n) tag : null) != null) {
            return super.addViewInLayout(view, i3, layoutParams, z3);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        y0 y0Var;
        y0 g = y0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1853d;
        if (onApplyWindowInsetsListener != null) {
            y0Var = y0.g(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = J.T.f402a;
            WindowInsets f3 = g.f();
            if (f3 != null) {
                WindowInsets b3 = J.F.b(this, f3);
                if (!b3.equals(f3)) {
                    g = y0.g(this, b3);
                }
            }
            y0Var = g;
        }
        if (!y0Var.f470a.m()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                WeakHashMap weakHashMap2 = J.T.f402a;
                WindowInsets f4 = y0Var.f();
                if (f4 != null) {
                    WindowInsets a3 = J.F.a(childAt, f4);
                    if (!a3.equals(f4)) {
                        y0.g(childAt, a3);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f1854e && this.f1852b != null) {
            for (int i3 = 0; i3 < this.f1852b.size(); i3++) {
                super.drawChild(canvas, (View) this.f1852b.get(i3), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ArrayList arrayList;
        if (!this.f1854e || (arrayList = this.f1852b) == null || arrayList.size() <= 0 || !this.f1852b.contains(view)) {
            return super.drawChild(canvas, view, j3);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f1852b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1854e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        if (z3) {
            a(view);
        }
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        a(getChildAt(i3));
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            a(getChildAt(i5));
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            a(getChildAt(i5));
        }
        super.removeViewsInLayout(i3, i4);
    }

    public void setDrawDisappearingViewsLast(boolean z3) {
        this.f1854e = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1853d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(view);
        }
        super.startViewTransition(view);
    }
}
