package k;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: k.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0277d0 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i3, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i3, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int b(TextView textView) {
        return textView.getMaxLines();
    }
}
