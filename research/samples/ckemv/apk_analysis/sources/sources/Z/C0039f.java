package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: Z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0040g f1264b;
    public final /* synthetic */ ViewPropertyAnimator c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f1265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0042i f1266e;

    public /* synthetic */ C0039f(C0042i c0042i, C0040g c0040g, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f1263a = i3;
        this.f1266e = c0042i;
        this.f1264b = c0040g;
        this.c = viewPropertyAnimator;
        this.f1265d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1263a) {
            case 0:
                this.c.setListener(null);
                View view = this.f1265d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0040g c0040g = this.f1264b;
                W w3 = c0040g.f1270a;
                C0042i c0042i = this.f1266e;
                c0042i.c(w3);
                c0042i.f1289r.remove(c0040g.f1270a);
                c0042i.i();
                return;
            default:
                this.c.setListener(null);
                View view2 = this.f1265d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0040g c0040g2 = this.f1264b;
                W w4 = c0040g2.f1271b;
                C0042i c0042i2 = this.f1266e;
                c0042i2.c(w4);
                c0042i2.f1289r.remove(c0040g2.f1271b);
                c0042i2.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1263a) {
            case 0:
                W w3 = this.f1264b.f1270a;
                this.f1266e.getClass();
                return;
            default:
                W w4 = this.f1264b.f1271b;
                this.f1266e.getClass();
                return;
        }
    }
}
