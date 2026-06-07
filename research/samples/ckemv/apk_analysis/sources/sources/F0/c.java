package F0;

import Z.C0045l;
import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f163b;

    public /* synthetic */ c(int i3, Object obj) {
        this.f162a = i3;
        this.f163b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f162a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                U0.g gVar = ((BottomSheetBehavior) this.f163b).f2314i;
                if (gVar != null) {
                    U0.f fVar = gVar.f906b;
                    if (fVar.f893j != floatValue) {
                        fVar.f893j = floatValue;
                        gVar.f909f = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((TextInputLayout) this.f163b).f2545v0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0045l c0045l = (C0045l) this.f163b;
                c0045l.c.setAlpha(floatValue2);
                c0045l.f1298d.setAlpha(floatValue2);
                c0045l.f1311s.invalidate();
                return;
        }
    }
}
