package com.google.android.material.appbar;

import C0.a;
import X.d;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public int f2261d;

    /* renamed from: e, reason: collision with root package name */
    public int f2262e;

    /* renamed from: f, reason: collision with root package name */
    public int f2263f;
    public VelocityTracker g;

    public AppBarLayout$BaseBehavior() {
        this.f2261d = -1;
        this.f2263f = -1;
    }

    @Override // v.AbstractC0397a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f2263f < 0) {
            this.f2263f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i3 = this.f2261d;
            if (i3 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i3)) == -1) {
                return false;
            }
            int y3 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y3 - this.f2262e) > this.f2263f) {
                this.f2262e = y3;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2261d = -1;
        motionEvent.getX();
        motionEvent.getY();
        d.n(view);
        throw null;
    }

    @Override // C0.a, v.AbstractC0397a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final void m(View view, Parcelable parcelable) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final Parcelable n(View view) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final boolean o(View view, int i3, int i4) {
        d.n(view);
        throw null;
    }

    @Override // v.AbstractC0397a
    public final void p(View view, View view2, int i3) {
        d.n(view);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    @Override // v.AbstractC0397a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.g.computeCurrentVelocity(1000);
                this.g.getYVelocity(this.f2261d);
                d.q(view);
                throw null;
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f2261d);
                if (findPointerIndex == -1) {
                    return false;
                }
                this.f2262e = (int) motionEvent.getY(findPointerIndex);
                d.q(view);
                throw null;
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i3 = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f2261d = motionEvent.getPointerId(i3);
                    this.f2262e = (int) (motionEvent.getY(i3) + 0.5f);
                }
                velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return this.c;
            }
        }
        this.c = false;
        this.f2261d = -1;
        VelocityTracker velocityTracker3 = this.g;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.g = null;
        }
        velocityTracker = this.g;
        if (velocityTracker != null) {
        }
        return this.c;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f2261d = -1;
        this.f2263f = -1;
    }
}
