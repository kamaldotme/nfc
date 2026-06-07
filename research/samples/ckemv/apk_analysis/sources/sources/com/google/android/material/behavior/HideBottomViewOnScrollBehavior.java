package com.google.android.material.behavior;

import B0.a;
import X.d;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import u2.l;
import v.AbstractC0397a;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0397a {

    /* renamed from: b, reason: collision with root package name */
    public int f2271b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2272d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2273e;
    public ViewPropertyAnimator h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2270a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f2274f = 0;
    public int g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // v.AbstractC0397a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f2274f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2271b = l.G(view.getContext(), R.attr.motionDurationLong2, 225);
        this.c = l.G(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2272d = l.H(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f65d);
        this.f2273e = l.H(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, a.c);
        return false;
    }

    @Override // v.AbstractC0397a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2270a;
        if (i3 > 0) {
            if (this.g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                d.q(it.next());
                throw null;
            }
            this.h = view.animate().translationY(this.f2274f).setInterpolator(this.f2273e).setDuration(this.c).setListener(new D0.a(0, this));
            return;
        }
        if (i3 >= 0 || this.g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            d.q(it2.next());
            throw null;
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f2272d).setDuration(this.f2271b).setListener(new D0.a(0, this));
    }

    @Override // v.AbstractC0397a
    public boolean o(View view, int i3, int i4) {
        return i3 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
