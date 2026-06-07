package com.google.android.material.snackbar;

import K.r;
import U0.e;
import W0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final e f2479i;

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(10);
        this.f2279f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2277d = 0;
        this.f2479i = eVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, v.AbstractC0397a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2479i.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (r.f598b == null) {
                    r.f598b = new r(1);
                }
                synchronized (r.f598b.f599a) {
                }
            }
        } else if (coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (r.f598b == null) {
                r.f598b = new r(1);
            }
            synchronized (r.f598b.f599a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f2479i.getClass();
        return view instanceof c;
    }
}
