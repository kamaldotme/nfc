package U0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f957b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final float f958d;

    /* renamed from: e, reason: collision with root package name */
    public final float f959e;

    /* renamed from: f, reason: collision with root package name */
    public float f960f;
    public float g;

    public q(float f3, float f4, float f5, float f6) {
        this.f957b = f3;
        this.c = f4;
        this.f958d = f5;
        this.f959e = f6;
    }

    @Override // U0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f962a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f957b, this.c, this.f958d, this.f959e);
        path.arcTo(rectF, this.f960f, this.g, false);
        path.transform(matrix);
    }
}
