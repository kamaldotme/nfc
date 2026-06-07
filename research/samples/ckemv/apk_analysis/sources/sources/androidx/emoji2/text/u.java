package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import m0.z;

/* loaded from: classes.dex */
public final class u extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final n f1799b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f1798a = new Paint.FontMetricsInt();
    public float c = 1.0f;

    public u(n nVar) {
        z.k(nVar, "metadata cannot be null");
        this.f1799b = nVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        j.a().getClass();
        n nVar = this.f1799b;
        v0.i iVar = nVar.f1782b;
        Typeface typeface = (Typeface) iVar.f5078e;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText((char[]) iVar.c, nVar.f1781a * 2, 2, f3, i6, paint);
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1798a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        n nVar = this.f1799b;
        this.c = abs / (nVar.c().a(14) != 0 ? ((ByteBuffer) r8.f473d).getShort(r1 + r8.f471a) : (short) 0);
        R.a c = nVar.c();
        int a3 = c.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c.f473d).getShort(a3 + c.f471a);
        }
        short s3 = (short) ((nVar.c().a(12) != 0 ? ((ByteBuffer) r5.f473d).getShort(r7 + r5.f471a) : (short) 0) * this.c);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
