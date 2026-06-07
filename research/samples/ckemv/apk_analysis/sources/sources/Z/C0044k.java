package Z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: Z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044k extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1291a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1292b = false;
    public final Object c;

    public C0044k(View view) {
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1291a) {
            case 0:
                this.f1292b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1291a) {
            case 0:
                if (this.f1292b) {
                    this.f1292b = false;
                    return;
                }
                C0045l c0045l = (C0045l) this.c;
                if (((Float) c0045l.f1318z.getAnimatedValue()).floatValue() == 0.0f) {
                    c0045l.f1294A = 0;
                    c0045l.f(0);
                    return;
                } else {
                    c0045l.f1294A = 2;
                    c0045l.f1311s.invalidate();
                    return;
                }
            default:
                j0.y yVar = j0.w.f3454a;
                View view = (View) this.c;
                yVar.f0(view, 1.0f);
                if (this.f1292b) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1291a) {
            case 1:
                WeakHashMap weakHashMap = J.T.f402a;
                View view = (View) this.c;
                if (J.B.h(view) && view.getLayerType() == 0) {
                    this.f1292b = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C0044k(C0045l c0045l) {
        this.c = c0045l;
    }
}
