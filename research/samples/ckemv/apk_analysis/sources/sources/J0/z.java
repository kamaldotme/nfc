package j0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class z extends y {
    @Override // m0.z
    public final float L(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // m0.z
    public final void f0(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // j0.y, m0.z
    public final void g0(View view, int i3) {
        view.setTransitionVisibility(i3);
    }

    @Override // j0.y
    public final void p0(View view, int i3, int i4, int i5, int i6) {
        view.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // j0.y
    public final void q0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // j0.y
    public final void r0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
