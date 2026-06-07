package k;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* renamed from: k.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281f0 {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i3, int i4, TextView textView, TextPaint textPaint, AbstractC0287i0 abstractC0287i0) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i4 == -1) {
            i4 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i4);
        try {
            abstractC0287i0.a(obtain, textView);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }
}
