package com.google.android.material.behavior;

import A.h;
import D0.b;
import J.B;
import J.T;
import K.j;
import Q.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import v.AbstractC0397a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0397a {

    /* renamed from: a, reason: collision with root package name */
    public e f2275a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2276b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f2277d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final float f2278e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f2279f = 0.0f;
    public float g = 0.5f;
    public final b h = new b(this);

    @Override // v.AbstractC0397a
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f2276b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2276b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2276b = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f2275a == null) {
            this.f2275a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.h);
        }
        return !this.c && this.f2275a.o(motionEvent);
    }

    @Override // v.AbstractC0397a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        WeakHashMap weakHashMap = T.f402a;
        if (B.c(view) == 0) {
            B.s(view, 1);
            T.i(view, 1048576);
            T.g(view, 0);
            if (r(view)) {
                T.j(view, j.f588j, new h(1, this));
            }
        }
        return false;
    }

    @Override // v.AbstractC0397a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2275a == null) {
            return false;
        }
        if (this.c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2275a.i(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
