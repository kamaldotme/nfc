package j0;

import a.AbstractC0059a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: j0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222B extends AnimatorListenerAdapter implements n {

    /* renamed from: a, reason: collision with root package name */
    public final View f3380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3381b;
    public final ViewGroup c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3383e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3384f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3382d = true;

    public C0222B(View view, int i3) {
        this.f3380a = view;
        this.f3381b = i3;
        this.c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // j0.n
    public final void a() {
    }

    @Override // j0.n
    public final void b() {
        f(false);
    }

    @Override // j0.n
    public final void c() {
    }

    @Override // j0.n
    public final void d(o oVar) {
        if (!this.f3384f) {
            w.f3454a.g0(this.f3380a, this.f3381b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        oVar.v(this);
    }

    @Override // j0.n
    public final void e() {
        f(true);
    }

    public final void f(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f3382d || this.f3383e == z3 || (viewGroup = this.c) == null) {
            return;
        }
        this.f3383e = z3;
        AbstractC0059a.M(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3384f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f3384f) {
            w.f3454a.g0(this.f3380a, this.f3381b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f3384f) {
            return;
        }
        w.f3454a.g0(this.f3380a, this.f3381b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f3384f) {
            return;
        }
        w.f3454a.g0(this.f3380a, 0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
