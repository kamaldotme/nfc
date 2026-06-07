package J;

import android.animation.ValueAnimator;
import android.view.View;
import f.C0150G;
import f.C0152I;

/* loaded from: classes.dex */
public final /* synthetic */ class Y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f407a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f408b;

    public /* synthetic */ Y(X0.k kVar) {
        this.f408b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f407a) {
            case 0:
                ((View) ((C0152I) ((C0150G) this.f408b).f2846b).f2854d.getParent()).invalidate();
                return;
            default:
                X0.k kVar = (X0.k) this.f408b;
                kVar.getClass();
                kVar.f1082d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }

    public /* synthetic */ Y(C0150G c0150g, View view) {
        this.f408b = c0150g;
    }
}
