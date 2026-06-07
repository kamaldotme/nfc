package S0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f865a = {R.attr.state_enabled, R.attr.state_pressed};

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f865a, 0));
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 : iArr) {
            if (i3 == 16842910) {
                z3 = true;
            } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                z4 = true;
            }
        }
        return z3 && z4;
    }
}
