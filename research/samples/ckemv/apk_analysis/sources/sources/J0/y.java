package j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class y extends m0.z {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3456d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f3457e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3458f = true;
    public static boolean g = true;

    @Override // m0.z
    public void g0(View view, int i3) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g0(view, i3);
        } else if (g) {
            try {
                view.setTransitionVisibility(i3);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public void p0(View view, int i3, int i4, int i5, int i6) {
        if (f3458f) {
            try {
                view.setLeftTopRightBottom(i3, i4, i5, i6);
            } catch (NoSuchMethodError unused) {
                f3458f = false;
            }
        }
    }

    public void q0(View view, Matrix matrix) {
        if (f3456d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f3456d = false;
            }
        }
    }

    public void r0(View view, Matrix matrix) {
        if (f3457e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f3457e = false;
            }
        }
    }
}
