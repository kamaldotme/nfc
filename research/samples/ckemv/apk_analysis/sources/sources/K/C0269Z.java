package k;

import a.AbstractC0059a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import e.AbstractC0116a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: k.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269Z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3631a;

    /* renamed from: b, reason: collision with root package name */
    public e1 f3632b;
    public e1 c;

    /* renamed from: d, reason: collision with root package name */
    public e1 f3633d;

    /* renamed from: e, reason: collision with root package name */
    public e1 f3634e;

    /* renamed from: f, reason: collision with root package name */
    public e1 f3635f;
    public e1 g;
    public e1 h;

    /* renamed from: i, reason: collision with root package name */
    public final C0289j0 f3636i;

    /* renamed from: j, reason: collision with root package name */
    public int f3637j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3638k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3639l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3640m;

    public C0269Z(TextView textView) {
        this.f3631a = textView;
        this.f3636i = new C0289j0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k.e1] */
    public static e1 c(Context context, C0308t c0308t, int i3) {
        ColorStateList h;
        synchronized (c0308t) {
            h = c0308t.f3777a.h(context, i3);
        }
        if (h == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f3682b = true;
        obj.c = h;
        return obj;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i3 >= 30) {
            M.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i3 >= 30) {
            M.a.a(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 : i4;
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = text.length();
        if (i6 < 0 || i4 > length) {
            u2.d.F(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            u2.d.F(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            u2.d.F(editorInfo, text, i6, i4);
            return;
        }
        int i8 = i4 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(text.length() - i4, i10 - Math.min(i6, (int) (i10 * 0.8d)));
        int min2 = Math.min(i6, i10 - min);
        int i11 = i6 - min2;
        if (Character.isLowSurrogate(text.charAt(i11))) {
            i11++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
            min--;
        }
        int i12 = min2 + i9;
        u2.d.F(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i11, i12 + min + i11), min2, i12);
    }

    public final void a(Drawable drawable, e1 e1Var) {
        if (drawable == null || e1Var == null) {
            return;
        }
        C0308t.d(drawable, e1Var, this.f3631a.getDrawableState());
    }

    public final void b() {
        e1 e1Var = this.f3632b;
        TextView textView = this.f3631a;
        if (e1Var != null || this.c != null || this.f3633d != null || this.f3634e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3632b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f3633d);
            a(compoundDrawables[3], this.f3634e);
        }
        if (this.f3635f == null && this.g == null) {
            return;
        }
        Drawable[] a3 = AbstractC0265V.a(textView);
        a(a3[0], this.f3635f);
        a(a3[2], this.g);
    }

    public final ColorStateList d() {
        e1 e1Var = this.h;
        if (e1Var != null) {
            return (ColorStateList) e1Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        e1 e1Var = this.h;
        if (e1Var != null) {
            return (PorterDuff.Mode) e1Var.f3683d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i3) {
        boolean z3;
        boolean z4;
        String str;
        String str2;
        boolean z5;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.f3631a;
        Context context = textView.getContext();
        C0308t a3 = C0308t.a();
        int[] iArr = AbstractC0116a.h;
        v0.m F2 = v0.m.F(context, attributeSet, iArr, i3, 0);
        J.T.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) F2.f5087d, i3);
        TypedArray typedArray = (TypedArray) F2.f5087d;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3632b = c(context, a3, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a3, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3633d = c(context, a3, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3634e = c(context, a3, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f3635f = c(context, a3, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a3, typedArray.getResourceId(6, 0));
        }
        F2.J();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0116a.f2684w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            v0.m mVar = new v0.m(context, obtainStyledAttributes);
            if (z6 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            n(context, mVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getString(i6) : null;
            mVar.J();
        } else {
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        v0.m mVar2 = new v0.m(context, obtainStyledAttributes2);
        if (z6 || !obtainStyledAttributes2.hasValue(14)) {
            z5 = z3;
        } else {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar2);
        mVar2.J();
        if (!z6 && z4) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f3639l;
        if (typeface != null) {
            if (this.f3638k == -1) {
                textView.setTypeface(typeface, this.f3637j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC0267X.d(textView, str);
        }
        if (str2 != null) {
            AbstractC0266W.b(textView, AbstractC0266W.a(str2));
        }
        int[] iArr3 = AbstractC0116a.f2670i;
        C0289j0 c0289j0 = this.f3636i;
        Context context2 = c0289j0.f3720j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i3, 0);
        TextView textView2 = c0289j0.f3719i;
        J.T.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i3);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0289j0.f3714a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                c0289j0.f3718f = C0289j0.b(iArr4);
                c0289j0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0289j0.j()) {
            c0289j0.f3714a = 0;
        } else if (c0289j0.f3714a == 1) {
            if (!c0289j0.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0289j0.k(dimension2, dimension3, dimension);
            }
            c0289j0.h();
        }
        if (r1.f3769b && c0289j0.f3714a != 0) {
            int[] iArr5 = c0289j0.f3718f;
            if (iArr5.length > 0) {
                if (AbstractC0267X.a(textView) != -1.0f) {
                    AbstractC0267X.b(textView, Math.round(c0289j0.f3716d), Math.round(c0289j0.f3717e), Math.round(c0289j0.c), 0);
                } else {
                    AbstractC0267X.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b3 = resourceId4 != -1 ? a3.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b4 = resourceId5 != -1 ? a3.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b5 = resourceId6 != -1 ? a3.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b6 = resourceId7 != -1 ? a3.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b7 = resourceId8 != -1 ? a3.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b8 = resourceId9 != -1 ? a3.b(context, resourceId9) : null;
        if (b7 != null || b8 != null) {
            Drawable[] a4 = AbstractC0265V.a(textView);
            if (b7 == null) {
                b7 = a4[0];
            }
            if (b4 == null) {
                b4 = a4[1];
            }
            if (b8 == null) {
                b8 = a4[2];
            }
            if (b6 == null) {
                b6 = a4[3];
            }
            AbstractC0265V.b(textView, b7, b4, b8, b6);
        } else if (b3 != null || b4 != null || b5 != null || b6 != null) {
            Drawable[] a5 = AbstractC0265V.a(textView);
            Drawable drawable = a5[0];
            if (drawable == null && a5[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b3 == null) {
                    b3 = compoundDrawables[0];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[1];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[2];
                }
                if (b6 == null) {
                    b6 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b3, b4, b5, b6);
            } else {
                if (b4 == null) {
                    b4 = a5[1];
                }
                Drawable drawable2 = a5[2];
                if (b6 == null) {
                    b6 = a5[3];
                }
                AbstractC0265V.b(textView, drawable, b4, drawable2, b6);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = y.f.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            N.q.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i4 = -1;
            N.q.g(textView, AbstractC0299o0.b(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i4 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i4);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i4);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, i4);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i4) {
            AbstractC0059a.K(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i4) {
            AbstractC0059a.L(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i4) {
            m0.z.j(dimensionPixelSize3);
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0116a.f2684w);
        v0.m mVar = new v0.m(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3631a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, mVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC0267X.d(textView, string);
        }
        mVar.J();
        Typeface typeface = this.f3639l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3637j);
        }
    }

    public final void i(int i3, int i4, int i5, int i6) {
        C0289j0 c0289j0 = this.f3636i;
        if (c0289j0.j()) {
            DisplayMetrics displayMetrics = c0289j0.f3720j.getResources().getDisplayMetrics();
            c0289j0.k(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (c0289j0.h()) {
                c0289j0.a();
            }
        }
    }

    public final void j(int[] iArr, int i3) {
        C0289j0 c0289j0 = this.f3636i;
        if (c0289j0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0289j0.f3720j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                c0289j0.f3718f = C0289j0.b(iArr2);
                if (!c0289j0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0289j0.g = false;
            }
            if (c0289j0.h()) {
                c0289j0.a();
            }
        }
    }

    public final void k(int i3) {
        C0289j0 c0289j0 = this.f3636i;
        if (c0289j0.j()) {
            if (i3 == 0) {
                c0289j0.f3714a = 0;
                c0289j0.f3716d = -1.0f;
                c0289j0.f3717e = -1.0f;
                c0289j0.c = -1.0f;
                c0289j0.f3718f = new int[0];
                c0289j0.f3715b = false;
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException(X.d.f("Unknown auto-size text type: ", i3));
            }
            DisplayMetrics displayMetrics = c0289j0.f3720j.getResources().getDisplayMetrics();
            c0289j0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0289j0.h()) {
                c0289j0.a();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.e1] */
    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new Object();
        }
        e1 e1Var = this.h;
        e1Var.c = colorStateList;
        e1Var.f3682b = colorStateList != null;
        this.f3632b = e1Var;
        this.c = e1Var;
        this.f3633d = e1Var;
        this.f3634e = e1Var;
        this.f3635f = e1Var;
        this.g = e1Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.e1] */
    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new Object();
        }
        e1 e1Var = this.h;
        e1Var.f3683d = mode;
        e1Var.f3681a = mode != null;
        this.f3632b = e1Var;
        this.c = e1Var;
        this.f3633d = e1Var;
        this.f3634e = e1Var;
        this.f3635f = e1Var;
        this.g = e1Var;
    }

    public final void n(Context context, v0.m mVar) {
        String string;
        int i3 = this.f3637j;
        TypedArray typedArray = (TypedArray) mVar.f5087d;
        this.f3637j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f3638k = i5;
            if (i5 != -1) {
                this.f3637j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3640m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f3639l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f3639l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f3639l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3639l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f3638k;
        int i9 = this.f3637j;
        if (!context.isRestricted()) {
            try {
                Typeface t3 = mVar.t(i7, this.f3637j, new C0264U(this, i8, i9, new WeakReference(this.f3631a)));
                if (t3 != null) {
                    if (i4 < 28 || this.f3638k == -1) {
                        this.f3639l = t3;
                    } else {
                        this.f3639l = AbstractC0268Y.a(Typeface.create(t3, 0), this.f3638k, (this.f3637j & 2) != 0);
                    }
                }
                this.f3640m = this.f3639l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3639l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3638k == -1) {
            this.f3639l = Typeface.create(string, this.f3637j);
        } else {
            this.f3639l = AbstractC0268Y.a(Typeface.create(string, 0), this.f3638k, (this.f3637j & 2) != 0);
        }
    }
}
