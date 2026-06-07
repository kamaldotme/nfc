package U0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final u[] f945a = new u[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f946b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f947d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f948e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f949f = new Path();
    public final u g = new u();
    public final float[] h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f950i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f951j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f952k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public final boolean f953l = true;

    public m() {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f945a[i3] = new u();
            this.f946b[i3] = new Matrix();
            this.c[i3] = new Matrix();
        }
    }

    public final void a(k kVar, float f3, RectF rectF, A.h hVar, Path path) {
        int i3;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i4;
        m mVar = this;
        path.rewind();
        Path path2 = mVar.f948e;
        path2.rewind();
        Path path3 = mVar.f949f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i5 = 0;
        while (true) {
            i3 = 4;
            matrixArr = mVar.c;
            fArr = mVar.h;
            matrixArr2 = mVar.f946b;
            uVarArr = mVar.f945a;
            if (i5 >= 4) {
                break;
            }
            c cVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f939f : kVar.f938e : kVar.h : kVar.g;
            u2.l lVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? kVar.f936b : kVar.f935a : kVar.f937d : kVar.c;
            u uVar = uVarArr[i5];
            lVar.getClass();
            lVar.o(uVar, f3, cVar.a(rectF));
            int i6 = i5 + 1;
            float f4 = (i6 % 4) * 90;
            matrixArr2[i5].reset();
            PointF pointF = mVar.f947d;
            if (i5 == 1) {
                i4 = i6;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i5 == 2) {
                i4 = i6;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i5 != 3) {
                i4 = i6;
                pointF.set(rectF.right, rectF.top);
            } else {
                i4 = i6;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i5].setTranslate(pointF.x, pointF.y);
            matrixArr2[i5].preRotate(f4);
            u uVar2 = uVarArr[i5];
            fArr[0] = uVar2.c;
            fArr[1] = uVar2.f967d;
            matrixArr2[i5].mapPoints(fArr);
            matrixArr[i5].reset();
            matrixArr[i5].setTranslate(fArr[0], fArr[1]);
            matrixArr[i5].preRotate(f4);
            i5 = i4;
        }
        int i7 = 0;
        while (i7 < i3) {
            u uVar3 = uVarArr[i7];
            fArr[0] = uVar3.f965a;
            fArr[1] = uVar3.f966b;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i7].b(matrixArr2[i7], path);
            if (hVar != null) {
                u uVar4 = uVarArr[i7];
                Matrix matrix = matrixArr2[i7];
                g gVar = (g) hVar.c;
                BitSet bitSet = gVar.f908e;
                uVar4.getClass();
                bitSet.set(i7, false);
                uVar4.a(uVar4.f969f);
                gVar.c[i7] = new n(new ArrayList(uVar4.h), new Matrix(matrix));
            }
            int i8 = i7 + 1;
            int i9 = i8 % 4;
            u uVar5 = uVarArr[i7];
            fArr[0] = uVar5.c;
            fArr[1] = uVar5.f967d;
            matrixArr2[i7].mapPoints(fArr);
            u uVar6 = uVarArr[i9];
            float f5 = uVar6.f965a;
            float[] fArr2 = mVar.f950i;
            fArr2[0] = f5;
            fArr2[1] = uVar6.f966b;
            matrixArr2[i9].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i7];
            fArr[0] = uVar7.c;
            fArr[1] = uVar7.f967d;
            matrixArr2[i7].mapPoints(fArr);
            if (i7 == 1 || i7 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = mVar.g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            (i7 != 1 ? i7 != 2 ? i7 != 3 ? kVar.f941j : kVar.f940i : kVar.f943l : kVar.f942k).getClass();
            uVar8.c(max, 0.0f);
            Path path4 = mVar.f951j;
            path4.reset();
            uVar8.b(matrixArr[i7], path4);
            if (mVar.f953l && (mVar.b(path4, i7) || mVar.b(path4, i9))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = uVar8.f965a;
                fArr[1] = uVar8.f966b;
                matrixArr[i7].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i7], path2);
            } else {
                uVar8.b(matrixArr[i7], path);
            }
            if (hVar != null) {
                Matrix matrix2 = matrixArr[i7];
                g gVar2 = (g) hVar.c;
                gVar2.f908e.set(i7 + 4, false);
                uVar8.a(uVar8.f969f);
                gVar2.f907d[i7] = new n(new ArrayList(uVar8.h), new Matrix(matrix2));
            }
            i3 = 4;
            mVar = this;
            i7 = i8;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i3) {
        Path path2 = this.f952k;
        path2.reset();
        this.f945a[i3].b(this.f946b[i3], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
