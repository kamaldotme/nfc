package H;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean u(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
