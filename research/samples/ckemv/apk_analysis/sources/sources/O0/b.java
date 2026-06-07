package O0;

import J.B;
import J.C;
import J.T;
import a.AbstractC0059a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f696A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f697B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f698C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f699E;

    /* renamed from: F, reason: collision with root package name */
    public float f700F;

    /* renamed from: G, reason: collision with root package name */
    public float f701G;

    /* renamed from: H, reason: collision with root package name */
    public float f702H;

    /* renamed from: I, reason: collision with root package name */
    public float f703I;

    /* renamed from: J, reason: collision with root package name */
    public float f704J;

    /* renamed from: K, reason: collision with root package name */
    public int f705K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f706L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f707M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f708N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f709O;

    /* renamed from: P, reason: collision with root package name */
    public TimeInterpolator f710P;

    /* renamed from: Q, reason: collision with root package name */
    public TimeInterpolator f711Q;

    /* renamed from: R, reason: collision with root package name */
    public float f712R;

    /* renamed from: S, reason: collision with root package name */
    public float f713S;

    /* renamed from: T, reason: collision with root package name */
    public float f714T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f715U;

    /* renamed from: V, reason: collision with root package name */
    public float f716V;

    /* renamed from: W, reason: collision with root package name */
    public float f717W;

    /* renamed from: X, reason: collision with root package name */
    public float f718X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f719Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f720Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f721a;

    /* renamed from: a0, reason: collision with root package name */
    public float f722a0;

    /* renamed from: b, reason: collision with root package name */
    public float f723b;

    /* renamed from: b0, reason: collision with root package name */
    public float f724b0;
    public final Rect c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f725c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f726d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f728e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f733j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f734k;

    /* renamed from: l, reason: collision with root package name */
    public float f735l;

    /* renamed from: m, reason: collision with root package name */
    public float f736m;

    /* renamed from: n, reason: collision with root package name */
    public float f737n;

    /* renamed from: o, reason: collision with root package name */
    public float f738o;

    /* renamed from: p, reason: collision with root package name */
    public float f739p;

    /* renamed from: q, reason: collision with root package name */
    public float f740q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f741r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f742s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f743t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f744u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f745v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f746w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f747x;

    /* renamed from: y, reason: collision with root package name */
    public R0.a f748y;

    /* renamed from: f, reason: collision with root package name */
    public int f730f = 16;
    public int g = 16;
    public float h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f732i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f749z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f727d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f729e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f731f0 = 1;

    public b(View view) {
        this.f721a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f708N = textPaint;
        this.f709O = new TextPaint(textPaint);
        this.f726d = new Rect();
        this.c = new Rect();
        this.f728e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i3, int i4, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i4) * f3) + (Color.alpha(i3) * f4)), Math.round((Color.red(i4) * f3) + (Color.red(i3) * f4)), Math.round((Color.green(i4) * f3) + (Color.green(i3) * f4)), Math.round((Color.blue(i4) * f3) + (Color.blue(i3) * f4)));
    }

    public static float f(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return B0.a.a(f3, f4, f5);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f402a;
        boolean z3 = C.d(this.f721a) == 1;
        if (this.D) {
            return (z3 ? H.h.f271d : H.h.c).b(charSequence, charSequence.length());
        }
        return z3;
    }

    public final void c(float f3, boolean z3) {
        float f4;
        float f5;
        Typeface typeface;
        boolean z4;
        Layout.Alignment alignment;
        if (this.f696A == null) {
            return;
        }
        float width = this.f726d.width();
        float width2 = this.c.width();
        if (Math.abs(f3 - 1.0f) < 1.0E-5f) {
            f4 = this.f732i;
            f5 = this.f716V;
            this.f700F = 1.0f;
            typeface = this.f741r;
        } else {
            float f6 = this.h;
            float f7 = this.f717W;
            Typeface typeface2 = this.f744u;
            if (Math.abs(f3 - 0.0f) < 1.0E-5f) {
                this.f700F = 1.0f;
            } else {
                this.f700F = f(this.h, this.f732i, f3, this.f711Q) / this.h;
            }
            float f8 = this.f732i / this.h;
            width = (!z3 && width2 * f8 > width) ? Math.min(width / f8, width2) : width2;
            f4 = f6;
            f5 = f7;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f708N;
        if (width > 0.0f) {
            boolean z5 = this.f701G != f4;
            boolean z6 = this.f718X != f5;
            boolean z7 = this.f747x != typeface;
            StaticLayout staticLayout = this.f719Y;
            boolean z8 = z5 || z6 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z7 || this.f707M;
            this.f701G = f4;
            this.f718X = f5;
            this.f747x = typeface;
            this.f707M = false;
            textPaint.setLinearText(this.f700F != 1.0f);
            z4 = z8;
        } else {
            z4 = false;
        }
        if (this.f697B == null || z4) {
            textPaint.setTextSize(this.f701G);
            textPaint.setTypeface(this.f747x);
            textPaint.setLetterSpacing(this.f718X);
            boolean b3 = b(this.f696A);
            this.f698C = b3;
            int i3 = this.f727d0;
            if (i3 <= 1 || b3) {
                i3 = 1;
            }
            if (i3 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f730f, b3 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f698C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f698C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.f696A, textPaint, (int) width);
            gVar.f766l = this.f749z;
            gVar.f765k = b3;
            gVar.f761e = alignment;
            gVar.f764j = false;
            gVar.f762f = i3;
            float f9 = this.f729e0;
            gVar.g = 0.0f;
            gVar.h = f9;
            gVar.f763i = this.f731f0;
            StaticLayout a3 = gVar.a();
            a3.getClass();
            this.f719Y = a3;
            this.f697B = a3.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f709O;
        textPaint.setTextSize(this.f732i);
        textPaint.setTypeface(this.f741r);
        textPaint.setLetterSpacing(this.f716V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f706L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f743t;
            if (typeface != null) {
                this.f742s = AbstractC0059a.C(configuration, typeface);
            }
            Typeface typeface2 = this.f746w;
            if (typeface2 != null) {
                this.f745v = AbstractC0059a.C(configuration, typeface2);
            }
            Typeface typeface3 = this.f742s;
            if (typeface3 == null) {
                typeface3 = this.f743t;
            }
            this.f741r = typeface3;
            Typeface typeface4 = this.f745v;
            if (typeface4 == null) {
                typeface4 = this.f746w;
            }
            this.f744u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z3) {
        float measureText;
        StaticLayout staticLayout;
        View view = this.f721a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z3) {
            return;
        }
        c(1.0f, z3);
        CharSequence charSequence = this.f697B;
        TextPaint textPaint = this.f708N;
        if (charSequence != null && (staticLayout = this.f719Y) != null) {
            this.f725c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f749z);
        }
        CharSequence charSequence2 = this.f725c0;
        if (charSequence2 != null) {
            this.f720Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f720Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.f698C ? 1 : 0);
        int i3 = absoluteGravity & 112;
        Rect rect = this.f726d;
        if (i3 == 48) {
            this.f736m = rect.top;
        } else if (i3 != 80) {
            this.f736m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f736m = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f738o = rect.centerX() - (this.f720Z / 2.0f);
        } else if (i4 != 5) {
            this.f738o = rect.left;
        } else {
            this.f738o = rect.right - this.f720Z;
        }
        c(0.0f, z3);
        float height = this.f719Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f719Y;
        if (staticLayout2 == null || this.f727d0 <= 1) {
            CharSequence charSequence3 = this.f697B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f719Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f730f, this.f698C ? 1 : 0);
        int i5 = absoluteGravity2 & 112;
        Rect rect2 = this.c;
        if (i5 == 48) {
            this.f735l = rect2.top;
        } else if (i5 != 80) {
            this.f735l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f735l = textPaint.descent() + (rect2.bottom - height);
        }
        int i6 = absoluteGravity2 & 8388615;
        if (i6 == 1) {
            this.f737n = rect2.centerX() - (measureText / 2.0f);
        } else if (i6 != 5) {
            this.f737n = rect2.left;
        } else {
            this.f737n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f699E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f699E = null;
        }
        l(this.f723b);
        float f3 = this.f723b;
        float f4 = f(rect2.left, rect.left, f3, this.f710P);
        RectF rectF = this.f728e;
        rectF.left = f4;
        rectF.top = f(this.f735l, this.f736m, f3, this.f710P);
        rectF.right = f(rect2.right, rect.right, f3, this.f710P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f3, this.f710P);
        this.f739p = f(this.f737n, this.f738o, f3, this.f710P);
        this.f740q = f(this.f735l, this.f736m, f3, this.f710P);
        l(f3);
        U.a aVar = B0.a.f64b;
        this.f722a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, aVar);
        WeakHashMap weakHashMap = T.f402a;
        B.k(view);
        this.f724b0 = f(1.0f, 0.0f, f3, aVar);
        B.k(view);
        ColorStateList colorStateList = this.f734k;
        ColorStateList colorStateList2 = this.f733j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f734k), f3));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f5 = this.f716V;
        float f6 = this.f717W;
        if (f5 != f6) {
            textPaint.setLetterSpacing(f(f6, f5, f3, aVar));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.f702H = f(0.0f, this.f712R, f3, null);
        this.f703I = f(0.0f, this.f713S, f3, null);
        this.f704J = f(0.0f, this.f714T, f3, null);
        int a3 = a(e(null), e(this.f715U), f3);
        this.f705K = a3;
        textPaint.setShadowLayer(this.f702H, this.f703I, this.f704J, a3);
        B.k(view);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f734k == colorStateList && this.f733j == colorStateList) {
            return;
        }
        this.f734k = colorStateList;
        this.f733j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        R0.a aVar = this.f748y;
        if (aVar != null) {
            aVar.f830f = true;
        }
        if (this.f743t == typeface) {
            return false;
        }
        this.f743t = typeface;
        Typeface C2 = AbstractC0059a.C(this.f721a.getContext().getResources().getConfiguration(), typeface);
        this.f742s = C2;
        if (C2 == null) {
            C2 = this.f743t;
        }
        this.f741r = C2;
        return true;
    }

    public final void k(float f3) {
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f3 != this.f723b) {
            this.f723b = f3;
            float f4 = this.c.left;
            Rect rect = this.f726d;
            float f5 = f(f4, rect.left, f3, this.f710P);
            RectF rectF = this.f728e;
            rectF.left = f5;
            rectF.top = f(this.f735l, this.f736m, f3, this.f710P);
            rectF.right = f(r1.right, rect.right, f3, this.f710P);
            rectF.bottom = f(r1.bottom, rect.bottom, f3, this.f710P);
            this.f739p = f(this.f737n, this.f738o, f3, this.f710P);
            this.f740q = f(this.f735l, this.f736m, f3, this.f710P);
            l(f3);
            U.a aVar = B0.a.f64b;
            this.f722a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f3, aVar);
            WeakHashMap weakHashMap = T.f402a;
            View view = this.f721a;
            B.k(view);
            this.f724b0 = f(1.0f, 0.0f, f3, aVar);
            B.k(view);
            ColorStateList colorStateList = this.f734k;
            ColorStateList colorStateList2 = this.f733j;
            TextPaint textPaint = this.f708N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f734k), f3));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f6 = this.f716V;
            float f7 = this.f717W;
            if (f6 != f7) {
                textPaint.setLetterSpacing(f(f7, f6, f3, aVar));
            } else {
                textPaint.setLetterSpacing(f6);
            }
            this.f702H = f(0.0f, this.f712R, f3, null);
            this.f703I = f(0.0f, this.f713S, f3, null);
            this.f704J = f(0.0f, this.f714T, f3, null);
            int a3 = a(e(null), e(this.f715U), f3);
            this.f705K = a3;
            textPaint.setShadowLayer(this.f702H, this.f703I, this.f704J, a3);
            B.k(view);
        }
    }

    public final void l(float f3) {
        c(f3, false);
        WeakHashMap weakHashMap = T.f402a;
        B.k(this.f721a);
    }

    public final void m(Typeface typeface) {
        boolean z3;
        boolean j3 = j(typeface);
        if (this.f746w != typeface) {
            this.f746w = typeface;
            Typeface C2 = AbstractC0059a.C(this.f721a.getContext().getResources().getConfiguration(), typeface);
            this.f745v = C2;
            if (C2 == null) {
                C2 = this.f746w;
            }
            this.f744u = C2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (j3 || z3) {
            h(false);
        }
    }
}
