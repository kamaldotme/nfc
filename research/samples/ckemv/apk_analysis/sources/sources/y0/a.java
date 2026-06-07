package Y0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import k.C0275c0;
import u2.d;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class a extends C0275c0 {
    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i3 = -1;
        for (int i4 = 0; i4 < iArr.length && i3 < 0; i4++) {
            int i5 = iArr[i4];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i5, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i3 = dimensionPixelSize;
            } else {
                i3 = typedArray.getDimensionPixelSize(i5, -1);
            }
        }
        return i3;
    }

    @Override // k.C0275c0, android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        if (d.A(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i3, A0.a.f34p);
            int m3 = m(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m3 >= 0) {
                setLineHeight(m3);
            }
        }
    }
}
