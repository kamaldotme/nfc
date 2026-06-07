package J;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f420b;
    public final /* synthetic */ y0 c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f422e;

    public f0(l0 l0Var, y0 y0Var, y0 y0Var2, int i3, View view) {
        this.f419a = l0Var;
        this.f420b = y0Var;
        this.c = y0Var2;
        this.f421d = i3;
        this.f422e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f3;
        l0 l0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        l0 l0Var2 = this.f419a;
        l0Var2.f436a.d(animatedFraction);
        float b3 = l0Var2.f436a.b();
        PathInterpolator pathInterpolator = h0.f426e;
        int i3 = Build.VERSION.SDK_INT;
        y0 y0Var = this.f420b;
        q0 p0Var = i3 >= 30 ? new p0(y0Var) : i3 >= 29 ? new o0(y0Var) : new n0(y0Var);
        int i4 = 1;
        while (i4 <= 256) {
            if ((this.f421d & i4) == 0) {
                p0Var.c(i4, y0Var.f470a.f(i4));
                f3 = b3;
                l0Var = l0Var2;
            } else {
                A.d f4 = y0Var.f470a.f(i4);
                A.d f5 = this.c.f470a.f(i4);
                int i5 = (int) (((f4.f2a - f5.f2a) * r10) + 0.5d);
                int i6 = (int) (((f4.f3b - f5.f3b) * r10) + 0.5d);
                f3 = b3;
                int i7 = (int) (((f4.c - f5.c) * r10) + 0.5d);
                float f6 = (f4.f4d - f5.f4d) * (1.0f - b3);
                l0Var = l0Var2;
                p0Var.c(i4, y0.e(f4, i5, i6, i7, (int) (f6 + 0.5d)));
            }
            i4 <<= 1;
            b3 = f3;
            l0Var2 = l0Var;
        }
        h0.g(this.f422e, p0Var.b(), Collections.singletonList(l0Var2));
    }
}
