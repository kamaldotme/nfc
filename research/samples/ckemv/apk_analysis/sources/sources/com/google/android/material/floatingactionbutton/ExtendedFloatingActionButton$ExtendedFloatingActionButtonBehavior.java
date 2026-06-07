package com.google.android.material.floatingactionbutton;

import A0.a;
import X.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import v.AbstractC0397a;
import v.C0400d;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends AbstractC0397a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // v.AbstractC0397a
    public final /* bridge */ /* synthetic */ boolean a(View view) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final void c(C0400d c0400d) {
        if (c0400d.h == 0) {
            c0400d.h = 80;
        }
    }

    @Override // v.AbstractC0397a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        d.n(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f25e);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
