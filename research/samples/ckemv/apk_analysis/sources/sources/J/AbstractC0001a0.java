package J;

import android.animation.ValueAnimator;
import android.view.ViewPropertyAnimator;

/* renamed from: J.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0001a0 {
    public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
    }
}
