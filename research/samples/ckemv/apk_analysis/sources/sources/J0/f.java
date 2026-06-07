package J0;

import O0.h;
import O0.i;
import U0.g;
import U0.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {

    /* renamed from: H0, reason: collision with root package name */
    public static final int[] f481H0 = {R.attr.state_enabled};

    /* renamed from: I0, reason: collision with root package name */
    public static final ShapeDrawable f482I0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f483A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f484A0;

    /* renamed from: B, reason: collision with root package name */
    public float f485B;

    /* renamed from: B0, reason: collision with root package name */
    public ColorStateList f486B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f487C;

    /* renamed from: C0, reason: collision with root package name */
    public WeakReference f488C0;
    public float D;

    /* renamed from: D0, reason: collision with root package name */
    public TextUtils.TruncateAt f489D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f490E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f491E0;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f492F;

    /* renamed from: F0, reason: collision with root package name */
    public int f493F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f494G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f495G0;

    /* renamed from: H, reason: collision with root package name */
    public Drawable f496H;

    /* renamed from: I, reason: collision with root package name */
    public ColorStateList f497I;

    /* renamed from: J, reason: collision with root package name */
    public float f498J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f499K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f500L;

    /* renamed from: M, reason: collision with root package name */
    public Drawable f501M;

    /* renamed from: N, reason: collision with root package name */
    public RippleDrawable f502N;

    /* renamed from: O, reason: collision with root package name */
    public ColorStateList f503O;

    /* renamed from: P, reason: collision with root package name */
    public float f504P;

    /* renamed from: Q, reason: collision with root package name */
    public SpannableStringBuilder f505Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f506R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f507S;

    /* renamed from: T, reason: collision with root package name */
    public Drawable f508T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f509U;

    /* renamed from: V, reason: collision with root package name */
    public B0.b f510V;

    /* renamed from: W, reason: collision with root package name */
    public B0.b f511W;

    /* renamed from: X, reason: collision with root package name */
    public float f512X;

    /* renamed from: Y, reason: collision with root package name */
    public float f513Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f514Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f515a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f516b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f517c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f518d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f519e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Context f520f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint f521g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint.FontMetrics f522h0;
    public final RectF i0;

    /* renamed from: j0, reason: collision with root package name */
    public final PointF f523j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Path f524k0;

    /* renamed from: l0, reason: collision with root package name */
    public final i f525l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f526m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f527n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f528o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f529p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f530q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f531r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f532s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f533t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f534u0;

    /* renamed from: v0, reason: collision with root package name */
    public ColorFilter f535v0;

    /* renamed from: w0, reason: collision with root package name */
    public PorterDuffColorFilter f536w0;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f537x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f538y;

    /* renamed from: y0, reason: collision with root package name */
    public PorterDuff.Mode f539y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f540z;

    /* renamed from: z0, reason: collision with root package name */
    public int[] f541z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.happify.ckemv.R.attr.chipStyle, xyz.happify.ckemv.R.style.Widget_MaterialComponents_Chip_Action);
        this.f485B = -1.0f;
        this.f521g0 = new Paint(1);
        this.f522h0 = new Paint.FontMetrics();
        this.i0 = new RectF();
        this.f523j0 = new PointF();
        this.f524k0 = new Path();
        this.f534u0 = 255;
        this.f539y0 = PorterDuff.Mode.SRC_IN;
        this.f488C0 = new WeakReference(null);
        i(context);
        this.f520f0 = context;
        i iVar = new i(this);
        this.f525l0 = iVar;
        this.f492F = "";
        iVar.f767a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f481H0;
        setState(iArr);
        if (!Arrays.equals(this.f541z0, iArr)) {
            this.f541z0 = iArr;
            if (U()) {
                w(getState(), iArr);
            }
        }
        this.f491E0 = true;
        f482I0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z3) {
        if (this.f507S != z3) {
            boolean S2 = S();
            this.f507S = z3;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    o(this.f508T);
                } else {
                    V(this.f508T);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f3) {
        if (this.f485B != f3) {
            this.f485B = f3;
            j e3 = this.f906b.f887a.e();
            e3.f929e = new U0.a(f3);
            e3.f930f = new U0.a(f3);
            e3.g = new U0.a(f3);
            e3.h = new U0.a(f3);
            setShapeAppearanceModel(e3.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f496H;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof B.e;
            drawable2 = drawable3;
            if (z3) {
                ((B.f) ((B.e) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q3 = q();
            this.f496H = drawable != null ? drawable.mutate() : null;
            float q4 = q();
            V(drawable2);
            if (T()) {
                o(this.f496H);
            }
            invalidateSelf();
            if (q3 != q4) {
                v();
            }
        }
    }

    public final void D(float f3) {
        if (this.f498J != f3) {
            float q3 = q();
            this.f498J = f3;
            float q4 = q();
            invalidateSelf();
            if (q3 != q4) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.f499K = true;
        if (this.f497I != colorStateList) {
            this.f497I = colorStateList;
            if (T()) {
                B.b.h(this.f496H, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z3) {
        if (this.f494G != z3) {
            boolean T2 = T();
            this.f494G = z3;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    o(this.f496H);
                } else {
                    V(this.f496H);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.f487C != colorStateList) {
            this.f487C = colorStateList;
            if (this.f495G0) {
                U0.f fVar = this.f906b;
                if (fVar.f889d != colorStateList) {
                    fVar.f889d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f3) {
        if (this.D != f3) {
            this.D = f3;
            this.f521g0.setStrokeWidth(f3);
            if (this.f495G0) {
                this.f906b.f894k = f3;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f501M;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof B.e;
            drawable2 = drawable3;
            if (z3) {
                ((B.f) ((B.e) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float r3 = r();
            this.f501M = drawable != null ? drawable.mutate() : null;
            this.f502N = new RippleDrawable(S0.a.a(this.f490E), this.f501M, f482I0);
            float r4 = r();
            V(drawable2);
            if (U()) {
                o(this.f501M);
            }
            invalidateSelf();
            if (r3 != r4) {
                v();
            }
        }
    }

    public final void J(float f3) {
        if (this.f518d0 != f3) {
            this.f518d0 = f3;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void K(float f3) {
        if (this.f504P != f3) {
            this.f504P = f3;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void L(float f3) {
        if (this.f517c0 != f3) {
            this.f517c0 = f3;
            invalidateSelf();
            if (U()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.f503O != colorStateList) {
            this.f503O = colorStateList;
            if (U()) {
                B.b.h(this.f501M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z3) {
        if (this.f500L != z3) {
            boolean U2 = U();
            this.f500L = z3;
            boolean U3 = U();
            if (U2 != U3) {
                if (U3) {
                    o(this.f501M);
                } else {
                    V(this.f501M);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f3) {
        if (this.f514Z != f3) {
            float q3 = q();
            this.f514Z = f3;
            float q4 = q();
            invalidateSelf();
            if (q3 != q4) {
                v();
            }
        }
    }

    public final void P(float f3) {
        if (this.f513Y != f3) {
            float q3 = q();
            this.f513Y = f3;
            float q4 = q();
            invalidateSelf();
            if (q3 != q4) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.f490E != colorStateList) {
            this.f490E = colorStateList;
            this.f486B0 = this.f484A0 ? S0.a.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final void R(R0.d dVar) {
        i iVar = this.f525l0;
        if (iVar.f771f != dVar) {
            iVar.f771f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f767a;
                Context context = this.f520f0;
                b bVar = iVar.f768b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f770e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.f769d = true;
            }
            h hVar2 = (h) iVar.f770e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.v();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean S() {
        return this.f507S && this.f508T != null && this.f532s0;
    }

    public final boolean T() {
        return this.f494G && this.f496H != null;
    }

    public final boolean U() {
        return this.f500L && this.f501M != null;
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i3;
        RectF rectF;
        int i4;
        int i5;
        int i6;
        RectF rectF2;
        int i7;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i3 = this.f534u0) == 0) {
            return;
        }
        int saveLayerAlpha = i3 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i3) : 0;
        boolean z3 = this.f495G0;
        Paint paint = this.f521g0;
        RectF rectF3 = this.i0;
        if (!z3) {
            paint.setColor(this.f526m0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (!this.f495G0) {
            paint.setColor(this.f527n0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f535v0;
            if (colorFilter == null) {
                colorFilter = this.f536w0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (this.f495G0) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.f495G0) {
            paint.setColor(this.f529p0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f495G0) {
                ColorFilter colorFilter2 = this.f535v0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f536w0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.D / 2.0f;
            rectF3.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.f485B - (this.D / 2.0f);
            canvas.drawRoundRect(rectF3, f5, f5, paint);
        }
        paint.setColor(this.f530q0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f495G0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f524k0;
            U0.f fVar = this.f906b;
            this.f920s.a(fVar.f887a, fVar.f893j, rectF4, this.f919r, path);
            e(canvas, paint, path, this.f906b.f887a, g());
        } else {
            canvas.drawRoundRect(rectF3, s(), s(), paint);
        }
        if (T()) {
            p(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.f496H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f496H.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (S()) {
            p(bounds, rectF3);
            float f8 = rectF3.left;
            float f9 = rectF3.top;
            canvas.translate(f8, f9);
            this.f508T.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f508T.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.f491E0 || this.f492F == null) {
            rectF = rectF3;
            i4 = saveLayerAlpha;
            i5 = 0;
            i6 = 255;
        } else {
            PointF pointF = this.f523j0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f492F;
            i iVar = this.f525l0;
            if (charSequence != null) {
                float q3 = q() + this.f512X + this.f515a0;
                if (B.c.a(this) == 0) {
                    pointF.x = bounds.left + q3;
                } else {
                    pointF.x = bounds.right - q3;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f767a;
                Paint.FontMetrics fontMetrics = this.f522h0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f492F != null) {
                float q4 = q() + this.f512X + this.f515a0;
                float r3 = r() + this.f519e0 + this.f516b0;
                if (B.c.a(this) == 0) {
                    rectF3.left = bounds.left + q4;
                    rectF3.right = bounds.right - r3;
                } else {
                    rectF3.left = bounds.left + r3;
                    rectF3.right = bounds.right - q4;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            R0.d dVar = iVar.f771f;
            TextPaint textPaint2 = iVar.f767a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f771f.e(this.f520f0, textPaint2, iVar.f768b);
            }
            textPaint2.setTextAlign(align);
            boolean z4 = Math.round(iVar.a(this.f492F.toString())) > Math.round(rectF3.width());
            if (z4) {
                i7 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i7 = 0;
            }
            CharSequence charSequence2 = this.f492F;
            if (z4 && this.f489D0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f489D0);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f10 = pointF.x;
            float f11 = pointF.y;
            rectF = rectF3;
            i4 = saveLayerAlpha;
            i5 = 0;
            i6 = 255;
            canvas.drawText(charSequence3, 0, length, f10, f11, textPaint2);
            if (z4) {
                canvas.restoreToCount(i7);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f12 = this.f519e0 + this.f518d0;
                if (B.c.a(this) == 0) {
                    float f13 = bounds.right - f12;
                    rectF2 = rectF;
                    rectF2.right = f13;
                    rectF2.left = f13 - this.f504P;
                } else {
                    rectF2 = rectF;
                    float f14 = bounds.left + f12;
                    rectF2.left = f14;
                    rectF2.right = f14 + this.f504P;
                }
                float exactCenterY = bounds.exactCenterY();
                float f15 = this.f504P;
                float f16 = exactCenterY - (f15 / 2.0f);
                rectF2.top = f16;
                rectF2.bottom = f16 + f15;
            } else {
                rectF2 = rectF;
            }
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.f501M.setBounds(i5, i5, (int) rectF2.width(), (int) rectF2.height());
            this.f502N.setBounds(this.f501M.getBounds());
            this.f502N.jumpToCurrentState();
            this.f502N.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (this.f534u0 < i6) {
            canvas.restoreToCount(i4);
        }
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f534u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f535v0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f483A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(r() + this.f525l0.a(this.f492F.toString()) + q() + this.f512X + this.f515a0 + this.f516b0 + this.f519e0), this.f493F0);
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f495G0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f483A, this.f485B);
        } else {
            outline.setRoundRect(bounds, this.f485B);
        }
        outline.setAlpha(this.f534u0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        R0.d dVar;
        ColorStateList colorStateList;
        return t(this.f538y) || t(this.f540z) || t(this.f487C) || (this.f484A0 && t(this.f486B0)) || (!((dVar = this.f525l0.f771f) == null || (colorStateList = dVar.f841j) == null || !colorStateList.isStateful()) || ((this.f507S && this.f508T != null && this.f506R) || u(this.f496H) || u(this.f508T) || t(this.f537x0)));
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        B.c.b(drawable, B.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f501M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f541z0);
            }
            B.b.h(drawable, this.f503O);
            return;
        }
        Drawable drawable2 = this.f496H;
        if (drawable == drawable2 && this.f499K) {
            B.b.h(drawable2, this.f497I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (T()) {
            onLayoutDirectionChanged |= B.c.b(this.f496H, i3);
        }
        if (S()) {
            onLayoutDirectionChanged |= B.c.b(this.f508T, i3);
        }
        if (U()) {
            onLayoutDirectionChanged |= B.c.b(this.f501M, i3);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        boolean onLevelChange = super.onLevelChange(i3);
        if (T()) {
            onLevelChange |= this.f496H.setLevel(i3);
        }
        if (S()) {
            onLevelChange |= this.f508T.setLevel(i3);
        }
        if (U()) {
            onLevelChange |= this.f501M.setLevel(i3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f495G0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.f541z0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f3 = this.f512X + this.f513Y;
            Drawable drawable = this.f532s0 ? this.f508T : this.f496H;
            float f4 = this.f498J;
            if (f4 <= 0.0f && drawable != null) {
                f4 = drawable.getIntrinsicWidth();
            }
            if (B.c.a(this) == 0) {
                float f5 = rect.left + f3;
                rectF.left = f5;
                rectF.right = f5 + f4;
            } else {
                float f6 = rect.right - f3;
                rectF.right = f6;
                rectF.left = f6 - f4;
            }
            Drawable drawable2 = this.f532s0 ? this.f508T : this.f496H;
            float f7 = this.f498J;
            if (f7 <= 0.0f && drawable2 != null) {
                f7 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f520f0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f7) {
                    f7 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f7 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f7;
        }
    }

    public final float q() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f3 = this.f513Y;
        Drawable drawable = this.f532s0 ? this.f508T : this.f496H;
        float f4 = this.f498J;
        if (f4 <= 0.0f && drawable != null) {
            f4 = drawable.getIntrinsicWidth();
        }
        return f4 + f3 + this.f514Z;
    }

    public final float r() {
        if (U()) {
            return this.f517c0 + this.f504P + this.f518d0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.f495G0 ? this.f906b.f887a.f938e.a(g()) : this.f485B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.f534u0 != i3) {
            this.f534u0 = i3;
            invalidateSelf();
        }
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f535v0 != colorFilter) {
            this.f535v0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f537x0 != colorStateList) {
            this.f537x0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // U0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f539y0 != mode) {
            this.f539y0 = mode;
            ColorStateList colorStateList = this.f537x0;
            this.f536w0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (T()) {
            visible |= this.f496H.setVisible(z3, z4);
        }
        if (S()) {
            visible |= this.f508T.setVisible(z3, z4);
        }
        if (U()) {
            visible |= this.f501M.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        e eVar = (e) this.f488C0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f2368q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f538y;
        int c = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f526m0) : 0);
        boolean z5 = true;
        if (this.f526m0 != c) {
            this.f526m0 = c;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f540z;
        int c3 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f527n0) : 0);
        if (this.f527n0 != c3) {
            this.f527n0 = c3;
            onStateChange = true;
        }
        int b3 = A.a.b(c3, c);
        if ((this.f528o0 != b3) | (this.f906b.c == null)) {
            this.f528o0 = b3;
            k(ColorStateList.valueOf(b3));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f487C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f529p0) : 0;
        if (this.f529p0 != colorForState) {
            this.f529p0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f486B0 == null || !S0.a.b(iArr)) ? 0 : this.f486B0.getColorForState(iArr, this.f530q0);
        if (this.f530q0 != colorForState2) {
            this.f530q0 = colorForState2;
            if (this.f484A0) {
                onStateChange = true;
            }
        }
        R0.d dVar = this.f525l0.f771f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f841j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f531r0);
        if (this.f531r0 != colorForState3) {
            this.f531r0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (state[i3] != 16842912) {
                    i3++;
                } else if (this.f506R) {
                    z3 = true;
                }
            }
        }
        z3 = false;
        if (this.f532s0 == z3 || this.f508T == null) {
            z4 = false;
        } else {
            float q3 = q();
            this.f532s0 = z3;
            if (q3 != q()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f537x0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f533t0) : 0;
        if (this.f533t0 != colorForState4) {
            this.f533t0 = colorForState4;
            ColorStateList colorStateList6 = this.f537x0;
            PorterDuff.Mode mode = this.f539y0;
            this.f536w0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z5 = onStateChange;
        }
        if (u(this.f496H)) {
            z5 |= this.f496H.setState(iArr);
        }
        if (u(this.f508T)) {
            z5 |= this.f508T.setState(iArr);
        }
        if (u(this.f501M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f501M.setState(iArr3);
        }
        if (u(this.f502N)) {
            z5 |= this.f502N.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            v();
        }
        return z5;
    }

    public final void x(boolean z3) {
        if (this.f506R != z3) {
            this.f506R = z3;
            float q3 = q();
            if (!z3 && this.f532s0) {
                this.f532s0 = false;
            }
            float q4 = q();
            invalidateSelf();
            if (q3 != q4) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f508T != drawable) {
            float q3 = q();
            this.f508T = drawable;
            float q4 = q();
            V(this.f508T);
            o(this.f508T);
            invalidateSelf();
            if (q3 != q4) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f509U != colorStateList) {
            this.f509U = colorStateList;
            if (this.f507S && (drawable = this.f508T) != null && this.f506R) {
                B.b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}
