package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import e.AbstractC0116a;

/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3675a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3676b = {-16842910};
    public static final int[] c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3677d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3678e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3679f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0116a.f2671j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList d3 = d(context, i3);
        if (d3 != null && d3.isStateful()) {
            return d3.getColorForState(f3676b, d3.getDefaultColor());
        }
        ThreadLocal threadLocal = f3675a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        return A.a.d(c(context, i3), Math.round(Color.alpha(r4) * f3));
    }

    public static int c(Context context, int i3) {
        int[] iArr = g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = y.f.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
