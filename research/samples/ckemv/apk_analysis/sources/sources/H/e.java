package H;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f265a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f266b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f267d;

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = d.i(textPaint).setBreakStrategy(i3);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i4);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f265a = textPaint;
        this.f266b = textDirectionHeuristic;
        this.c = i3;
        this.f267d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.c == eVar.c && this.f267d == eVar.f267d) {
            TextPaint textPaint = this.f265a;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = eVar.f265a;
            return textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null) && this.f266b == eVar.f266b;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f265a;
        return I.a.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f266b, Integer.valueOf(this.c), Integer.valueOf(this.f267d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f265a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        sb.append(", textDir=" + this.f266b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.f267d);
        sb.append("}");
        return sb.toString();
    }

    public e(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f265a = textPaint;
        textDirection = params.getTextDirection();
        this.f266b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f267d = hyphenationFrequency;
    }
}
