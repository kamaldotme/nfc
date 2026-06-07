package U0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f961b;
    public float c;

    @Override // U0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f962a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f961b, this.c);
        path.transform(matrix);
    }
}
