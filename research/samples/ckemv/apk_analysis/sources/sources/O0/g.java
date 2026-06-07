package O0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f758a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f759b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public int f760d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f765k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f761e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f762f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f763i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f764j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f766l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f758a = charSequence;
        this.f759b = textPaint;
        this.c = i3;
        this.f760d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f758a == null) {
            this.f758a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.f758a;
        int i3 = this.f762f;
        TextPaint textPaint = this.f759b;
        if (i3 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f766l);
        }
        int min = Math.min(charSequence.length(), this.f760d);
        this.f760d = min;
        if (this.f765k && this.f762f == 1) {
            this.f761e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f761e);
        obtain.setIncludePad(this.f764j);
        obtain.setTextDirection(this.f765k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f766l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f762f);
        float f3 = this.g;
        if (f3 != 0.0f || this.h != 1.0f) {
            obtain.setLineSpacing(f3, this.h);
        }
        if (this.f762f > 1) {
            obtain.setHyphenationFrequency(this.f763i);
        }
        return obtain.build();
    }
}
