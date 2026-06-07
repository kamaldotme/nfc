package com.google.android.material.transformation;

import J.E;
import J.T;
import X.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.AbstractC0397a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends AbstractC0397a {
    public ExpandableBehavior() {
    }

    @Override // v.AbstractC0397a
    public abstract void b(View view);

    @Override // v.AbstractC0397a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        d.q(view2);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        WeakHashMap weakHashMap = T.f402a;
        if (!E.c(view)) {
            ArrayList j3 = coordinatorLayout.j(view);
            int size = j3.size();
            for (int i4 = 0; i4 < size; i4++) {
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
