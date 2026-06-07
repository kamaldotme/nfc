package androidx.fragment.app;

import J.ViewTreeObserverOnPreDrawListenerC0020t;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class r extends AnimationSet implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f1998b;
    public final View c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1999d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2001f;

    public r(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2001f = true;
        this.f1998b = viewGroup;
        this.c = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation) {
        this.f2001f = true;
        if (this.f1999d) {
            return !this.f2000e;
        }
        if (!super.getTransformation(j3, transformation)) {
            this.f1999d = true;
            ViewTreeObserverOnPreDrawListenerC0020t.a(this.f1998b, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f1999d;
        ViewGroup viewGroup = this.f1998b;
        if (z3 || !this.f2001f) {
            viewGroup.endViewTransition(this.c);
            this.f2000e = true;
        } else {
            this.f2001f = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation, float f3) {
        this.f2001f = true;
        if (this.f1999d) {
            return !this.f2000e;
        }
        if (!super.getTransformation(j3, transformation, f3)) {
            this.f1999d = true;
            ViewTreeObserverOnPreDrawListenerC0020t.a(this.f1998b, this);
        }
        return true;
    }
}
