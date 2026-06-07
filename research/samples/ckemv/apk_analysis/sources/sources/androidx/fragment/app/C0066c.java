package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1913b;
    public final /* synthetic */ boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f1914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0068e f1915e;

    public C0066c(ViewGroup viewGroup, View view, boolean z3, T t3, C0068e c0068e) {
        this.f1912a = viewGroup;
        this.f1913b = view;
        this.c = z3;
        this.f1914d = t3;
        this.f1915e = c0068e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1912a;
        View view = this.f1913b;
        viewGroup.endViewTransition(view);
        if (this.c) {
            X.d.a(view, this.f1914d.f1881a);
        }
        this.f1915e.d();
    }
}
