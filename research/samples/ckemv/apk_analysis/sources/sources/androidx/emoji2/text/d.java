package androidx.emoji2.text;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1763b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1764a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1764a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
