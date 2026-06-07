package R0;

import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import u2.l;
import v0.f;
import z.AbstractC0464n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f836b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f837d;

    /* renamed from: e, reason: collision with root package name */
    public final float f838e;

    /* renamed from: f, reason: collision with root package name */
    public final float f839f;
    public final float g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final float f840i;

    /* renamed from: j, reason: collision with root package name */
    public final ColorStateList f841j;

    /* renamed from: k, reason: collision with root package name */
    public float f842k;

    /* renamed from: l, reason: collision with root package name */
    public final int f843l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f844m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f845n;

    public d(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, A0.a.f42x);
        this.f842k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f841j = l.m(context, obtainStyledAttributes, 3);
        l.m(context, obtainStyledAttributes, 4);
        l.m(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.f837d = obtainStyledAttributes.getInt(1, 1);
        int i4 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f843l = obtainStyledAttributes.getResourceId(i4, 0);
        this.f836b = obtainStyledAttributes.getString(i4);
        obtainStyledAttributes.getBoolean(14, false);
        this.f835a = l.m(context, obtainStyledAttributes, 6);
        this.f838e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f839f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i3, A0.a.f34p);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.f840i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f845n;
        int i3 = this.c;
        if (typeface == null && (str = this.f836b) != null) {
            this.f845n = Typeface.create(str, i3);
        }
        if (this.f845n == null) {
            int i4 = this.f837d;
            if (i4 == 1) {
                this.f845n = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f845n = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f845n = Typeface.DEFAULT;
            } else {
                this.f845n = Typeface.MONOSPACE;
            }
            this.f845n = Typeface.create(this.f845n, i3);
        }
    }

    public final Typeface b(Context context) {
        if (this.f844m) {
            return this.f845n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a3 = AbstractC0464n.a(context, this.f843l);
                this.f845n = a3;
                if (a3 != null) {
                    this.f845n = Typeface.create(a3, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f844m = true;
        return this.f845n;
    }

    public final void c(Context context, f fVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i3 = this.f843l;
        if (i3 == 0) {
            this.f844m = true;
        }
        if (this.f844m) {
            fVar.E(this.f845n, true);
            return;
        }
        try {
            b bVar = new b(this, fVar);
            ThreadLocal threadLocal = AbstractC0464n.f5302a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                AbstractC0464n.b(context, i3, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f844m = true;
            fVar.D(1);
        } catch (Exception unused2) {
            this.f844m = true;
            fVar.D(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i3 = this.f843l;
        if (i3 != 0) {
            ThreadLocal threadLocal = AbstractC0464n.f5302a;
            if (!context.isRestricted()) {
                typeface = AbstractC0464n.b(context, i3, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, f fVar) {
        f(context, textPaint, fVar);
        ColorStateList colorStateList = this.f841j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f835a;
        textPaint.setShadowLayer(this.g, this.f838e, this.f839f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, f fVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f845n);
        c(context, new c(this, context, textPaint, fVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface C2 = AbstractC0059a.C(context.getResources().getConfiguration(), typeface);
        if (C2 != null) {
            typeface = C2;
        }
        textPaint.setTypeface(typeface);
        int i3 = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i3 & 1) != 0);
        textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f842k);
        if (this.h) {
            textPaint.setLetterSpacing(this.f840i);
        }
    }
}
