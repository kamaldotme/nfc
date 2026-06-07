package J;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import n.C0333b;

/* loaded from: classes.dex */
public final class Z extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f410b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Z(Object obj, View view, int i3) {
        this.f409a = i3;
        this.c = obj;
        this.f410b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f409a) {
            case 0:
                ((c0) this.c).e((View) this.f410b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f409a) {
            case 0:
                ((c0) this.c).a();
                return;
            case 1:
                ((l0) this.c).f436a.d(1.0f);
                h0.e((View) this.f410b);
                return;
            default:
                ((C0333b) this.c).remove(animator);
                ((j0.o) this.f410b).f3432n.remove(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f409a) {
            case 0:
                ((c0) this.c).g();
                return;
            case 1:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                ((j0.o) this.f410b).f3432n.add(animator);
                return;
        }
    }

    public Z(j0.o oVar, C0333b c0333b) {
        this.f409a = 2;
        this.f410b = oVar;
        this.c = c0333b;
    }
}
