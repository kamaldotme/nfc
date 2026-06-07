package X0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0033e f1029b;

    public /* synthetic */ C0032d(C0033e c0033e, int i3) {
        this.f1028a = i3;
        this.f1029b = c0033e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1028a) {
            case 1:
                this.f1029b.f1081b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1028a) {
            case 0:
                this.f1029b.f1081b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
