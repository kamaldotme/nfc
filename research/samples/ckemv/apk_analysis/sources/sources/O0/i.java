package O0;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i {
    public float c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f770e;

    /* renamed from: f, reason: collision with root package name */
    public R0.d f771f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f767a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final J0.b f768b = new J0.b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f769d = true;

    public i(h hVar) {
        this.f770e = new WeakReference(null);
        this.f770e = new WeakReference(hVar);
    }

    public final float a(String str) {
        if (!this.f769d) {
            return this.c;
        }
        TextPaint textPaint = this.f767a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f769d = false;
        return this.c;
    }
}
