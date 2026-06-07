package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: Z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1242a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f1243b;
    public final /* synthetic */ View c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0042i f1245e;

    public C0037d(C0042i c0042i, W w3, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1245e = c0042i;
        this.f1243b = w3;
        this.f1244d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1242a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1242a) {
            case 0:
                this.f1244d.setListener(null);
                this.c.setAlpha(1.0f);
                C0042i c0042i = this.f1245e;
                W w3 = this.f1243b;
                c0042i.c(w3);
                c0042i.f1288q.remove(w3);
                c0042i.i();
                return;
            default:
                this.f1244d.setListener(null);
                C0042i c0042i2 = this.f1245e;
                W w4 = this.f1243b;
                c0042i2.c(w4);
                c0042i2.f1286o.remove(w4);
                c0042i2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1242a) {
            case 0:
                this.f1245e.getClass();
                return;
            default:
                this.f1245e.getClass();
                return;
        }
    }

    public C0037d(C0042i c0042i, W w3, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1245e = c0042i;
        this.f1243b = w3;
        this.c = view;
        this.f1244d = viewPropertyAnimator;
    }
}
