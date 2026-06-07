package k;

import android.widget.TextView;

/* renamed from: k.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0267X {
    public static int a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void b(TextView textView, int i3, int i4, int i5, int i6) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
    }

    public static void c(TextView textView, int[] iArr, int i3) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
    }

    public static boolean d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
