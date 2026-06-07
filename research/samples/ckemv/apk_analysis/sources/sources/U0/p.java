package U0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {
    public final r c;

    /* renamed from: d, reason: collision with root package name */
    public final float f955d;

    /* renamed from: e, reason: collision with root package name */
    public final float f956e;

    public p(r rVar, float f3, float f4) {
        this.c = rVar;
        this.f955d = f3;
        this.f956e = f4;
    }

    @Override // U0.t
    public final void a(Matrix matrix, T0.a aVar, int i3, Canvas canvas) {
        r rVar = this.c;
        float f3 = rVar.c;
        float f4 = this.f956e;
        float f5 = rVar.f961b;
        float f6 = this.f955d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3 - f4, f5 - f6), 0.0f);
        Matrix matrix2 = this.f964a;
        matrix2.set(matrix);
        matrix2.preTranslate(f6, f4);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i3;
        rectF.offset(0.0f, -i3);
        int[] iArr = T0.a.f869i;
        iArr[0] = aVar.f877f;
        iArr[1] = aVar.f876e;
        iArr[2] = aVar.f875d;
        Paint paint = aVar.c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, T0.a.f870j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.c;
        return (float) Math.toDegrees(Math.atan((rVar.c - this.f956e) / (rVar.f961b - this.f955d)));
    }
}
