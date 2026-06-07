package k0;

import a.AbstractC0059a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayDeque;
import n.C0333b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.AbstractC0452b;
import z.AbstractC0453c;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3880k = PorterDuff.Mode.SRC_IN;
    public n c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f3881d;

    /* renamed from: e, reason: collision with root package name */
    public ColorFilter f3882e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3883f;
    public boolean g;
    public final float[] h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f3884i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f3885j;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, k0.n] */
    public p() {
        this.g = true;
        this.h = new float[9];
        this.f3884i = new Matrix();
        this.f3885j = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.f3872d = f3880k;
        constantState.f3871b = new m();
        this.c = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3835b;
        if (drawable == null) {
            return false;
        }
        B.b.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f3885j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3882e;
        if (colorFilter == null) {
            colorFilter = this.f3881d;
        }
        Matrix matrix = this.f3884i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && B.c.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.c;
        Bitmap bitmap = nVar.f3874f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f3874f.getHeight()) {
            nVar.f3874f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f3877k = true;
        }
        if (this.g) {
            n nVar2 = this.c;
            if (nVar2.f3877k || nVar2.g != nVar2.c || nVar2.h != nVar2.f3872d || nVar2.f3876j != nVar2.f3873e || nVar2.f3875i != nVar2.f3871b.getRootAlpha()) {
                n nVar3 = this.c;
                nVar3.f3874f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f3874f);
                m mVar = nVar3.f3871b;
                mVar.a(mVar.g, m.f3857p, canvas2, min, min2);
                n nVar4 = this.c;
                nVar4.g = nVar4.c;
                nVar4.h = nVar4.f3872d;
                nVar4.f3875i = nVar4.f3871b.getRootAlpha();
                nVar4.f3876j = nVar4.f3873e;
                nVar4.f3877k = false;
            }
        } else {
            n nVar5 = this.c;
            nVar5.f3874f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f3874f);
            m mVar2 = nVar5.f3871b;
            mVar2.a(mVar2.g, m.f3857p, canvas3, min, min2);
        }
        n nVar6 = this.c;
        if (nVar6.f3871b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f3878l == null) {
                Paint paint2 = new Paint();
                nVar6.f3878l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f3878l.setAlpha(nVar6.f3871b.getRootAlpha());
            nVar6.f3878l.setColorFilter(colorFilter);
            paint = nVar6.f3878l;
        }
        canvas.drawBitmap(nVar6.f3874f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3835b;
        return drawable != null ? B.a.a(drawable) : this.c.f3871b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3835b;
        return drawable != null ? B.b.c(drawable) : this.f3882e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3835b != null) {
            return new o(this.f3835b.getConstantState());
        }
        this.c.f3870a = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.c.f3871b.f3863i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.c.f3871b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3835b;
        return drawable != null ? B.a.d(drawable) : this.c.f3873e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.c;
            if (nVar != null) {
                m mVar = nVar.f3871b;
                if (mVar.f3868n == null) {
                    mVar.f3868n = Boolean.valueOf(mVar.g.a());
                }
                if (mVar.f3868n.booleanValue() || ((colorStateList = this.c.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, k0.n] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3883f && super.mutate() == this) {
            n nVar = this.c;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.f3872d = f3880k;
            if (nVar != null) {
                constantState.f3870a = nVar.f3870a;
                m mVar = new m(nVar.f3871b);
                constantState.f3871b = mVar;
                if (nVar.f3871b.f3861e != null) {
                    mVar.f3861e = new Paint(nVar.f3871b.f3861e);
                }
                if (nVar.f3871b.f3860d != null) {
                    constantState.f3871b.f3860d = new Paint(nVar.f3871b.f3860d);
                }
                constantState.c = nVar.c;
                constantState.f3872d = nVar.f3872d;
                constantState.f3873e = nVar.f3873e;
            }
            this.c = constantState;
            this.f3883f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.c;
        ColorStateList colorStateList = nVar.c;
        if (colorStateList == null || (mode = nVar.f3872d) == null) {
            z3 = false;
        } else {
            this.f3881d = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        m mVar = nVar.f3871b;
        if (mVar.f3868n == null) {
            mVar.f3868n = Boolean.valueOf(mVar.g.a());
        }
        if (mVar.f3868n.booleanValue()) {
            boolean b3 = nVar.f3871b.g.b(iArr);
            nVar.f3877k |= b3;
            if (b3) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.c.f3871b.getRootAlpha() != i3) {
            this.c.f3871b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.a.e(drawable, z3);
        } else {
            this.c.f3873e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3882e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            u2.l.J(drawable, i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.h(drawable, colorStateList);
            return;
        }
        n nVar = this.c;
        if (nVar.c != colorStateList) {
            nVar.c = colorStateList;
            this.f3881d = a(colorStateList, nVar.f3872d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.i(drawable, mode);
            return;
        }
        n nVar = this.c;
        if (nVar.f3872d != mode) {
            nVar.f3872d = mode;
            this.f3881d = a(nVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f3835b;
        return drawable != null ? drawable.setVisible(z3, z4) : super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v40, types: [k0.i, k0.l, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f3835b;
        if (drawable != null) {
            B.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.c;
        nVar.f3871b = new m();
        TypedArray f3 = AbstractC0452b.f(resources, theme, attributeSet, a.f3821a);
        n nVar2 = this.c;
        m mVar2 = nVar2.f3871b;
        int i6 = !AbstractC0452b.c(xmlPullParser, "tintMode") ? -1 : f3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i7 = 3;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f3872d = mode;
        int i8 = 1;
        ColorStateList colorStateList = null;
        boolean z5 = false;
        if (AbstractC0452b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f3.getValue(1, typedValue);
            int i9 = typedValue.type;
            if (i9 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i9 >= 28 && i9 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f3.getResources();
                int resourceId = f3.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0453c.f5288a;
                try {
                    colorStateList = AbstractC0453c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.c = colorStateList2;
        }
        boolean z6 = nVar2.f3873e;
        if (AbstractC0452b.c(xmlPullParser, "autoMirrored")) {
            z6 = f3.getBoolean(5, z6);
        }
        nVar2.f3873e = z6;
        float f4 = mVar2.f3864j;
        if (AbstractC0452b.c(xmlPullParser, "viewportWidth")) {
            f4 = f3.getFloat(7, f4);
        }
        mVar2.f3864j = f4;
        float f5 = mVar2.f3865k;
        if (AbstractC0452b.c(xmlPullParser, "viewportHeight")) {
            f5 = f3.getFloat(8, f5);
        }
        mVar2.f3865k = f5;
        if (mVar2.f3864j <= 0.0f) {
            throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f5 > 0.0f) {
            mVar2.h = f3.getDimension(3, mVar2.h);
            float dimension = f3.getDimension(2, mVar2.f3863i);
            mVar2.f3863i = dimension;
            if (mVar2.h <= 0.0f) {
                throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (AbstractC0452b.c(xmlPullParser, "alpha")) {
                    alpha = f3.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f3.getString(0);
                if (string != null) {
                    mVar2.f3867m = string;
                    mVar2.f3869o.put(string, mVar2);
                }
                f3.recycle();
                nVar.f3870a = getChangingConfigurations();
                nVar.f3877k = true;
                n nVar3 = this.c;
                m mVar3 = nVar3.f3871b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z7 = true;
                while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i7)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i3 = depth;
                        C0333b c0333b = mVar3.f3869o;
                        if (equals) {
                            ?? lVar = new l();
                            lVar.f3837f = 0.0f;
                            lVar.h = 1.0f;
                            lVar.f3838i = 1.0f;
                            lVar.f3839j = 0.0f;
                            lVar.f3840k = 1.0f;
                            lVar.f3841l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f3842m = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            lVar.f3843n = join3;
                            mVar = mVar3;
                            lVar.f3844o = 4.0f;
                            TypedArray f6 = AbstractC0452b.f(resources, theme, attributeSet, a.c);
                            if (AbstractC0452b.c(xmlPullParser, "pathData")) {
                                String string2 = f6.getString(0);
                                if (string2 != null) {
                                    lVar.f3855b = string2;
                                }
                                String string3 = f6.getString(2);
                                if (string3 != null) {
                                    lVar.f3854a = AbstractC0059a.o(string3);
                                }
                                lVar.g = AbstractC0452b.b(f6, xmlPullParser, theme, "fillColor", 1);
                                float f7 = lVar.f3838i;
                                if (AbstractC0452b.c(xmlPullParser, "fillAlpha")) {
                                    f7 = f6.getFloat(12, f7);
                                }
                                lVar.f3838i = f7;
                                int i10 = !AbstractC0452b.c(xmlPullParser, "strokeLineCap") ? -1 : f6.getInt(8, -1);
                                Paint.Cap cap3 = lVar.f3842m;
                                if (i10 != 0) {
                                    join = join3;
                                    if (i10 != 1) {
                                        cap = i10 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                lVar.f3842m = cap;
                                int i11 = !AbstractC0452b.c(xmlPullParser, "strokeLineJoin") ? -1 : f6.getInt(9, -1);
                                Paint.Join join4 = lVar.f3843n;
                                if (i11 == 0) {
                                    join2 = join;
                                } else if (i11 != 1) {
                                    join2 = i11 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                lVar.f3843n = join2;
                                float f8 = lVar.f3844o;
                                if (AbstractC0452b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f8 = f6.getFloat(10, f8);
                                }
                                lVar.f3844o = f8;
                                lVar.f3836e = AbstractC0452b.b(f6, xmlPullParser, theme, "strokeColor", 3);
                                float f9 = lVar.h;
                                if (AbstractC0452b.c(xmlPullParser, "strokeAlpha")) {
                                    f9 = f6.getFloat(11, f9);
                                }
                                lVar.h = f9;
                                float f10 = lVar.f3837f;
                                if (AbstractC0452b.c(xmlPullParser, "strokeWidth")) {
                                    f10 = f6.getFloat(4, f10);
                                }
                                lVar.f3837f = f10;
                                float f11 = lVar.f3840k;
                                if (AbstractC0452b.c(xmlPullParser, "trimPathEnd")) {
                                    f11 = f6.getFloat(6, f11);
                                }
                                lVar.f3840k = f11;
                                float f12 = lVar.f3841l;
                                if (AbstractC0452b.c(xmlPullParser, "trimPathOffset")) {
                                    f12 = f6.getFloat(7, f12);
                                }
                                lVar.f3841l = f12;
                                float f13 = lVar.f3839j;
                                if (AbstractC0452b.c(xmlPullParser, "trimPathStart")) {
                                    f13 = f6.getFloat(5, f13);
                                }
                                lVar.f3839j = f13;
                                int i12 = lVar.c;
                                if (AbstractC0452b.c(xmlPullParser, "fillType")) {
                                    i12 = f6.getInt(13, i12);
                                }
                                lVar.c = i12;
                            }
                            f6.recycle();
                            jVar.f3846b.add(lVar);
                            if (lVar.getPathName() != null) {
                                c0333b.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f3870a |= lVar.f3856d;
                            z4 = false;
                            i4 = 1;
                            z7 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                l lVar2 = new l();
                                if (AbstractC0452b.c(xmlPullParser, "pathData")) {
                                    TypedArray f14 = AbstractC0452b.f(resources, theme, attributeSet, a.f3823d);
                                    String string4 = f14.getString(0);
                                    if (string4 != null) {
                                        lVar2.f3855b = string4;
                                    }
                                    String string5 = f14.getString(1);
                                    if (string5 != null) {
                                        lVar2.f3854a = AbstractC0059a.o(string5);
                                    }
                                    lVar2.c = !AbstractC0452b.c(xmlPullParser, "fillType") ? 0 : f14.getInt(2, 0);
                                    f14.recycle();
                                }
                                jVar.f3846b.add(lVar2);
                                if (lVar2.getPathName() != null) {
                                    c0333b.put(lVar2.getPathName(), lVar2);
                                }
                                nVar3.f3870a = lVar2.f3856d | nVar3.f3870a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f15 = AbstractC0452b.f(resources, theme, attributeSet, a.f3822b);
                                float f16 = jVar2.c;
                                if (AbstractC0452b.c(xmlPullParser, "rotation")) {
                                    f16 = f15.getFloat(5, f16);
                                }
                                jVar2.c = f16;
                                i4 = 1;
                                jVar2.f3847d = f15.getFloat(1, jVar2.f3847d);
                                jVar2.f3848e = f15.getFloat(2, jVar2.f3848e);
                                float f17 = jVar2.f3849f;
                                if (AbstractC0452b.c(xmlPullParser, "scaleX")) {
                                    f17 = f15.getFloat(3, f17);
                                }
                                jVar2.f3849f = f17;
                                float f18 = jVar2.g;
                                if (AbstractC0452b.c(xmlPullParser, "scaleY")) {
                                    f18 = f15.getFloat(4, f18);
                                }
                                jVar2.g = f18;
                                float f19 = jVar2.h;
                                if (AbstractC0452b.c(xmlPullParser, "translateX")) {
                                    f19 = f15.getFloat(6, f19);
                                }
                                jVar2.h = f19;
                                float f20 = jVar2.f3850i;
                                if (AbstractC0452b.c(xmlPullParser, "translateY")) {
                                    f20 = f15.getFloat(7, f20);
                                }
                                jVar2.f3850i = f20;
                                z4 = false;
                                String string6 = f15.getString(0);
                                if (string6 != null) {
                                    jVar2.f3853l = string6;
                                }
                                jVar2.c();
                                f15.recycle();
                                jVar.f3846b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    c0333b.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f3870a = jVar2.f3852k | nVar3.f3870a;
                            }
                            z4 = false;
                            i4 = 1;
                        }
                        z3 = z4;
                        i5 = 3;
                    } else {
                        mVar = mVar3;
                        i3 = depth;
                        i4 = i8;
                        z3 = z5;
                        i5 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i7 = i5;
                    z5 = z3;
                    i8 = i4;
                    depth = i3;
                    mVar3 = mVar;
                }
                if (!z7) {
                    this.f3881d = a(nVar.c, nVar.f3872d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.g = true;
        this.h = new float[9];
        this.f3884i = new Matrix();
        this.f3885j = new Rect();
        this.c = nVar;
        this.f3881d = a(nVar.c, nVar.f3872d);
    }
}
