package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class w implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1800b = false;
    public Spannable c;

    public w(Spannable spannable) {
        this.c = spannable;
    }

    public final void a() {
        Spannable spannable = this.c;
        if (!this.f1800b) {
            if ((Build.VERSION.SDK_INT < 28 ? new U0.e(19) : new U0.e(19)).h(spannable)) {
                this.c = new SpannableString(spannable);
            }
        }
        this.f1800b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.c.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.c.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.c.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        a();
        this.c.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.c.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.c.toString();
    }

    public w(CharSequence charSequence) {
        this.c = new SpannableString(charSequence);
    }
}
