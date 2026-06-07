package U0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class o extends t {
    public final q c;

    public o(q qVar) {
        this.c = qVar;
    }

    @Override // U0.t
    public final void a(Matrix matrix, T0.a aVar, int i3, Canvas canvas) {
        q qVar = this.c;
        float f3 = qVar.f960f;
        float f4 = qVar.g;
        RectF rectF = new RectF(qVar.f957b, qVar.c, qVar.f958d, qVar.f959e);
        aVar.getClass();
        boolean z3 = f4 < 0.0f;
        Path path = aVar.g;
        int[] iArr = T0.a.f871k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f877f;
            iArr[2] = aVar.f876e;
            iArr[3] = aVar.f875d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f3, f4);
            path.close();
            float f5 = -i3;
            rectF.inset(f5, f5);
            iArr[0] = 0;
            iArr[1] = aVar.f875d;
            iArr[2] = aVar.f876e;
            iArr[3] = aVar.f877f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f6 = 1.0f - (i3 / width);
        float[] fArr = T0.a.f872l;
        fArr[1] = f6;
        fArr[2] = ((1.0f - f6) / 2.0f) + f6;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f874b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f3, f4, true, paint);
        canvas.restore();
    }
}
