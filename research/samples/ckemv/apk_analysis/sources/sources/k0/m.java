package k0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import n.C0333b;
import n.C0342k;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3857p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3858a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3859b;
    public final Matrix c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f3860d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3861e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3862f;
    public final j g;
    public float h;

    /* renamed from: i, reason: collision with root package name */
    public float f3863i;

    /* renamed from: j, reason: collision with root package name */
    public float f3864j;

    /* renamed from: k, reason: collision with root package name */
    public float f3865k;

    /* renamed from: l, reason: collision with root package name */
    public int f3866l;

    /* renamed from: m, reason: collision with root package name */
    public String f3867m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3868n;

    /* renamed from: o, reason: collision with root package name */
    public final C0333b f3869o;

    /* JADX WARN: Type inference failed for: r0v4, types: [n.b, n.k] */
    public m() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.f3863i = 0.0f;
        this.f3864j = 0.0f;
        this.f3865k = 0.0f;
        this.f3866l = 255;
        this.f3867m = null;
        this.f3868n = null;
        this.f3869o = new C0342k();
        this.g = new j();
        this.f3858a = new Path();
        this.f3859b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3840k != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i3, int i4) {
        Matrix matrix2;
        int i5;
        float f3;
        int i6 = 1;
        jVar.f3845a.set(matrix);
        Matrix matrix3 = jVar.f3845a;
        matrix3.preConcat(jVar.f3851j);
        canvas.save();
        ?? r11 = 0;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = jVar.f3846b;
            if (i7 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i7);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i3, i4);
                i5 = i6;
                matrix2 = matrix3;
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f4 = i3 / this.f3864j;
                float f5 = i4 / this.f3865k;
                float min = Math.min(f4, f5);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f4, f5);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i6]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f6 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f6) / max : 0.0f;
                if (abs != 0.0f) {
                    lVar.getClass();
                    Path path = this.f3858a;
                    path.reset();
                    A.g[] gVarArr = lVar.f3854a;
                    if (gVarArr != null) {
                        A.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3859b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f7 = iVar.f3839j;
                        float f8 = f7 == 0.0f ? 1.0f : 1.0f;
                        float f9 = iVar.f3841l;
                        float f10 = (f7 + f9) % f8;
                        float f11 = (iVar.f3840k + f9) % f8;
                        if (this.f3862f == null) {
                            this.f3862f = new PathMeasure();
                        }
                        this.f3862f.setPath(path, r11);
                        float length = this.f3862f.getLength();
                        float f12 = f10 * length;
                        float f13 = f11 * length;
                        path.reset();
                        if (f12 > f13) {
                            this.f3862f.getSegment(f12, length, path, true);
                            f3 = 0.0f;
                            this.f3862f.getSegment(0.0f, f13, path, true);
                        } else {
                            f3 = 0.0f;
                            this.f3862f.getSegment(f12, f13, path, true);
                        }
                        path.rLineTo(f3, f3);
                        path2.addPath(path, matrix4);
                        J1.l lVar2 = iVar.g;
                        if ((((Shader) lVar2.c) == null && lVar2.f579b == 0) ? r11 : true) {
                            if (this.f3861e == null) {
                                Paint paint = new Paint(1);
                                this.f3861e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3861e;
                            Shader shader = (Shader) lVar2.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.f3838i * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i8 = lVar2.f579b;
                                float f14 = iVar.f3838i;
                                PorterDuff.Mode mode = p.f3880k;
                                paint2.setColor((i8 & 16777215) | (((int) (Color.alpha(i8) * f14)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        J1.l lVar3 = iVar.f3836e;
                        if (((Shader) lVar3.c) != null || lVar3.f579b != 0) {
                            if (this.f3860d == null) {
                                Paint paint3 = new Paint(1);
                                this.f3860d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f3860d;
                            Paint.Join join = iVar.f3843n;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f3842m;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f3844o);
                            Shader shader2 = (Shader) lVar3.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.h * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i9 = lVar3.f579b;
                                float f15 = iVar.h;
                                PorterDuff.Mode mode2 = p.f3880k;
                                paint4.setColor((i9 & 16777215) | (((int) (Color.alpha(i9) * f15)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f3837f * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = 1;
            } else {
                matrix2 = matrix3;
                i5 = i6;
            }
            i7 += i5;
            i6 = i5;
            matrix3 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3866l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i3) {
        this.f3866l = i3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [n.b, n.k] */
    public m(m mVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.f3863i = 0.0f;
        this.f3864j = 0.0f;
        this.f3865k = 0.0f;
        this.f3866l = 255;
        this.f3867m = null;
        this.f3868n = null;
        ?? c0342k = new C0342k();
        this.f3869o = c0342k;
        this.g = new j(mVar.g, c0342k);
        this.f3858a = new Path(mVar.f3858a);
        this.f3859b = new Path(mVar.f3859b);
        this.h = mVar.h;
        this.f3863i = mVar.f3863i;
        this.f3864j = mVar.f3864j;
        this.f3865k = mVar.f3865k;
        this.f3866l = mVar.f3866l;
        this.f3867m = mVar.f3867m;
        String str = mVar.f3867m;
        if (str != null) {
            c0342k.put(str, this);
        }
        this.f3868n = mVar.f3868n;
    }
}
