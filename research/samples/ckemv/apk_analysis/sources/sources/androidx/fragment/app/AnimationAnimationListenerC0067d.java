package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0067d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1917b;
    public final /* synthetic */ C0068e c;

    public AnimationAnimationListenerC0067d(View view, ViewGroup viewGroup, C0068e c0068e) {
        this.f1916a = viewGroup;
        this.f1917b = view;
        this.c = c0068e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f1916a.post(new F0.h(8, this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
