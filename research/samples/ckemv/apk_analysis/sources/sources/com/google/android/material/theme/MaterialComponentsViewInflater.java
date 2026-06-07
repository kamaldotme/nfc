package com.google.android.material.theme;

import I0.d;
import N.b;
import O0.k;
import X0.w;
import Z0.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import f.y;
import k.C0247C;
import k.C0275c0;
import k.C0296n;
import k.C0300p;
import k.C0302q;
import u2.l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends y {
    @Override // f.y
    public final C0296n a(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    @Override // f.y
    public final C0300p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // f.y
    public final C0302q c(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k.C, android.widget.CompoundButton, Q0.a, android.view.View] */
    @Override // f.y
    public final C0247C d(Context context, AttributeSet attributeSet) {
        ?? c0247c = new C0247C(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0247c.getContext();
        TypedArray f3 = k.f(context2, attributeSet, A0.a.f32n, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (f3.hasValue(0)) {
            b.c(c0247c, l.m(context2, f3, 0));
        }
        c0247c.g = f3.getBoolean(1, false);
        f3.recycle();
        return c0247c;
    }

    @Override // f.y
    public final C0275c0 e(Context context, AttributeSet attributeSet) {
        C0275c0 c0275c0 = new C0275c0(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0275c0.getContext();
        if (u2.d.A(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = A0.a.f35q;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int m3 = Y0.a.m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m3 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, A0.a.f34p);
                    int m4 = Y0.a.m(c0275c0.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (m4 >= 0) {
                        c0275c0.setLineHeight(m4);
                    }
                }
            }
        }
        return c0275c0;
    }
}
