package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: Z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1254b;
    public final /* synthetic */ View c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0042i f1257f;

    public C0038e(C0042i c0042i, W w3, int i3, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1257f = c0042i;
        this.f1253a = w3;
        this.f1254b = i3;
        this.c = view;
        this.f1255d = i4;
        this.f1256e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i3 = this.f1254b;
        View view = this.c;
        if (i3 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f1255d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1256e.setListener(null);
        C0042i c0042i = this.f1257f;
        W w3 = this.f1253a;
        c0042i.c(w3);
        c0042i.f1287p.remove(w3);
        c0042i.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1257f.getClass();
    }
}
