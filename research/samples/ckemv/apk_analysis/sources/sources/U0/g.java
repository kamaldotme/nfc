package U0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: x, reason: collision with root package name */
    public static final Paint f905x;

    /* renamed from: b, reason: collision with root package name */
    public f f906b;
    public final t[] c;

    /* renamed from: d, reason: collision with root package name */
    public final t[] f907d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f908e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f909f;
    public final Matrix g;
    public final Path h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f910i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f911j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f912k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f913l;

    /* renamed from: m, reason: collision with root package name */
    public final Region f914m;

    /* renamed from: n, reason: collision with root package name */
    public k f915n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f916o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f917p;

    /* renamed from: q, reason: collision with root package name */
    public final T0.a f918q;

    /* renamed from: r, reason: collision with root package name */
    public final A.h f919r;

    /* renamed from: s, reason: collision with root package name */
    public final m f920s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f921t;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuffColorFilter f922u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f923v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f924w;

    static {
        Paint paint = new Paint(1);
        f905x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f906b;
        this.f920s.a(fVar.f887a, fVar.f893j, rectF, this.f919r, path);
        if (this.f906b.f892i != 1.0f) {
            Matrix matrix = this.g;
            matrix.reset();
            float f3 = this.f906b.f892i;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f923v, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z3) {
        int color;
        int c;
        if (colorStateList == null || mode == null) {
            return (!z3 || (c = c((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z3) {
            colorForState = c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int c(int i3) {
        int i4;
        f fVar = this.f906b;
        float f3 = fVar.f897n + fVar.f898o + fVar.f896m;
        N0.a aVar = fVar.f888b;
        if (aVar == null || !aVar.f681a || A.a.d(i3, 255) != aVar.f683d) {
            return i3;
        }
        float min = (aVar.f684e <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i3);
        int z3 = u2.l.z(A.a.d(i3, 255), aVar.f682b, min);
        if (min > 0.0f && (i4 = aVar.c) != 0) {
            z3 = A.a.b(A.a.d(i4, N0.a.f680f), z3);
        }
        return A.a.d(z3, alpha);
    }

    public final void d(Canvas canvas) {
        this.f908e.cardinality();
        int i3 = this.f906b.f901r;
        Path path = this.h;
        T0.a aVar = this.f918q;
        if (i3 != 0) {
            canvas.drawPath(path, aVar.f873a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            t tVar = this.c[i4];
            int i5 = this.f906b.f900q;
            Matrix matrix = t.f963b;
            tVar.a(matrix, aVar, i5, canvas);
            this.f907d[i4].a(matrix, aVar, this.f906b.f900q, canvas);
        }
        if (this.f924w) {
            f fVar = this.f906b;
            int sin = (int) (Math.sin(Math.toRadians(fVar.f902s)) * fVar.f901r);
            f fVar2 = this.f906b;
            int cos = (int) (Math.cos(Math.toRadians(fVar2.f902s)) * fVar2.f901r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f905x);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (r1 < 29) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint = this.f916o;
        paint.setColorFilter(this.f921t);
        int alpha = paint.getAlpha();
        int i3 = this.f906b.f895l;
        paint.setAlpha(((i3 + (i3 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f917p;
        paint2.setColorFilter(this.f922u);
        paint2.setStrokeWidth(this.f906b.f894k);
        int alpha2 = paint2.getAlpha();
        int i4 = this.f906b.f895l;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.f909f;
        Path path = this.h;
        if (z3) {
            float f3 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f906b.f887a;
            j e3 = kVar.e();
            c cVar = kVar.f938e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e3.f929e = cVar;
            c cVar2 = kVar.f939f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e3.f930f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e3.h = cVar3;
            c cVar4 = kVar.g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e3.g = cVar4;
            k a3 = e3.a();
            this.f915n = a3;
            float f4 = this.f906b.f893j;
            RectF rectF = this.f912k;
            rectF.set(g());
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f920s.a(a3, f4, rectF, null, this.f910i);
            a(g(), path);
            this.f909f = false;
        }
        f fVar = this.f906b;
        int i5 = fVar.f899p;
        if (i5 != 1 && fVar.f900q > 0) {
            if (i5 != 2) {
                int i6 = Build.VERSION.SDK_INT;
                if (!fVar.f887a.d(g())) {
                    if (!path.isConvex()) {
                    }
                }
            }
            canvas.save();
            f fVar2 = this.f906b;
            int sin = (int) (Math.sin(Math.toRadians(fVar2.f902s)) * fVar2.f901r);
            f fVar3 = this.f906b;
            canvas.translate(sin, (int) (Math.cos(Math.toRadians(fVar3.f902s)) * fVar3.f901r));
            if (this.f924w) {
                RectF rectF2 = this.f923v;
                int width = (int) (rectF2.width() - getBounds().width());
                int height = (int) (rectF2.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap((this.f906b.f900q * 2) + ((int) rectF2.width()) + width, (this.f906b.f900q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f5 = (getBounds().left - this.f906b.f900q) - width;
                float f6 = (getBounds().top - this.f906b.f900q) - height;
                canvas2.translate(-f5, -f6);
                d(canvas2);
                canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
            } else {
                d(canvas);
                canvas.restore();
            }
        }
        f fVar4 = this.f906b;
        Paint.Style style = fVar4.f904u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, fVar4.f887a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a3 = kVar.f939f.a(rectF) * this.f906b.f893j;
            canvas.drawRoundRect(rectF, a3, a3, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f917p;
        Path path = this.f910i;
        k kVar = this.f915n;
        RectF rectF = this.f912k;
        rectF.set(g());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, kVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f911j;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f906b.f895l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f906b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.f906b;
        if (fVar.f899p == 2) {
            return;
        }
        if (fVar.f887a.d(g())) {
            outline.setRoundRect(getBounds(), this.f906b.f887a.f938e.a(g()) * this.f906b.f893j);
            return;
        }
        RectF g = g();
        Path path = this.h;
        a(g, path);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i3 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f906b.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f913l;
        region.set(bounds);
        RectF g = g();
        Path path = this.h;
        a(g, path);
        Region region2 = this.f914m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f906b.f904u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f917p.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f906b.f888b = new N0.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f909f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f906b.f891f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f906b.f890e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f906b.f889d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f906b.c) != null && colorStateList4.isStateful())));
    }

    public final void j(float f3) {
        f fVar = this.f906b;
        if (fVar.f897n != f3) {
            fVar.f897n = f3;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        f fVar = this.f906b;
        if (fVar.c != colorStateList) {
            fVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f906b.c == null || color2 == (colorForState2 = this.f906b.c.getColorForState(iArr, (color2 = (paint2 = this.f916o).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f906b.f889d == null || color == (colorForState = this.f906b.f889d.getColorForState(iArr, (color = (paint = this.f917p).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f921t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f922u;
        f fVar = this.f906b;
        this.f921t = b(fVar.f891f, fVar.g, this.f916o, true);
        f fVar2 = this.f906b;
        this.f922u = b(fVar2.f890e, fVar2.g, this.f917p, false);
        f fVar3 = this.f906b;
        if (fVar3.f903t) {
            int colorForState = fVar3.f891f.getColorForState(getState(), 0);
            T0.a aVar = this.f918q;
            aVar.getClass();
            aVar.f875d = A.a.d(colorForState, 68);
            aVar.f876e = A.a.d(colorForState, 20);
            aVar.f877f = A.a.d(colorForState, 0);
            aVar.f873a.setColor(aVar.f875d);
        }
        return (I.a.a(porterDuffColorFilter, this.f921t) && I.a.a(porterDuffColorFilter2, this.f922u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f906b = new f(this.f906b);
        return this;
    }

    public final void n() {
        f fVar = this.f906b;
        float f3 = fVar.f897n + fVar.f898o;
        fVar.f900q = (int) Math.ceil(0.75f * f3);
        this.f906b.f901r = (int) Math.ceil(f3 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f909f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z3 = l(iArr) || m();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        f fVar = this.f906b;
        if (fVar.f895l != i3) {
            fVar.f895l = i3;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f906b.getClass();
        super.invalidateSelf();
    }

    @Override // U0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f906b.f887a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f906b.f891f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f906b;
        if (fVar.g != mode) {
            fVar.g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i3, int i4) {
        this(k.b(context, attributeSet, i3, i4).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.c = new t[4];
        this.f907d = new t[4];
        this.f908e = new BitSet(8);
        this.g = new Matrix();
        this.h = new Path();
        this.f910i = new Path();
        this.f911j = new RectF();
        this.f912k = new RectF();
        this.f913l = new Region();
        this.f914m = new Region();
        Paint paint = new Paint(1);
        this.f916o = paint;
        Paint paint2 = new Paint(1);
        this.f917p = paint2;
        this.f918q = new T0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f944a;
        } else {
            mVar = new m();
        }
        this.f920s = mVar;
        this.f923v = new RectF();
        this.f924w = true;
        this.f906b = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f919r = new A.h(17, this);
    }
}
