package com.google.android.material.appbar;

import C0.a;
import J.T;
import a.AbstractC0059a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.AbstractC0397a;
import v.C0400d;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends a {
    public final int c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
    }

    @Override // v.AbstractC0397a
    public final void b(View view) {
    }

    @Override // v.AbstractC0397a
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0397a abstractC0397a = ((C0400d) view2.getLayoutParams()).f5046a;
        if (abstractC0397a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC0397a).getClass();
            int i3 = this.c;
            int i4 = bottom - (i3 == 0 ? 0 : AbstractC0059a.i((int) (0.0f * i3), 0, i3));
            WeakHashMap weakHashMap = T.f402a;
            view.offsetTopAndBottom(i4);
        }
        return false;
    }

    @Override // v.AbstractC0397a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 != -1 && i6 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    @Override // v.AbstractC0397a
    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    @Override // C0.a
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i3) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.p(view, i3);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0.a.f38t);
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
