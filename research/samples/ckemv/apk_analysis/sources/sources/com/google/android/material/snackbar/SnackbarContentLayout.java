package com.google.android.material.snackbar;

import B0.a;
import J.C;
import J.T;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import u2.l;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public TextView f2480b;
    public Button c;

    /* renamed from: d, reason: collision with root package name */
    public int f2481d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.H(context, R.attr.motionEasingEmphasizedInterpolator, a.f64b);
    }

    public final boolean a(int i3, int i4, int i5) {
        boolean z3;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f2480b.getPaddingTop() == i4 && this.f2480b.getPaddingBottom() == i5) {
            return z3;
        }
        TextView textView = this.f2480b;
        WeakHashMap weakHashMap = T.f402a;
        if (C.g(textView)) {
            C.k(textView, C.f(textView), i4, C.e(textView), i5);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i4, textView.getPaddingRight(), i5);
        return true;
    }

    public Button getActionView() {
        return this.c;
    }

    public TextView getMessageView() {
        return this.f2480b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2480b = (TextView) findViewById(R.id.snackbar_text);
        this.c = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2480b.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f2481d <= 0 || this.c.getMeasuredWidth() <= this.f2481d) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i3, i4);
    }

    public void setMaxInlineActionWidth(int i3) {
        this.f2481d = i3;
    }
}
