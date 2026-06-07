package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1796b;
    public final AtomicInteger c = new AtomicInteger(0);

    public s(Object obj) {
        this.f1796b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1796b).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f1796b).beforeTextChanged(charSequence, i3, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i4) {
        if (this.c.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f1796b).onSpanAdded(spannable, obj, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (this.c.get() <= 0 || !(obj instanceof u)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i3 > i4) {
                    i3 = 0;
                }
                if (i5 > i6) {
                    i7 = i3;
                    i8 = 0;
                    ((SpanWatcher) this.f1796b).onSpanChanged(spannable, obj, i7, i4, i8, i6);
                }
            }
            i7 = i3;
            i8 = i5;
            ((SpanWatcher) this.f1796b).onSpanChanged(spannable, obj, i7, i4, i8, i6);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i4) {
        if (this.c.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f1796b).onSpanRemoved(spannable, obj, i3, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f1796b).onTextChanged(charSequence, i3, i4, i5);
    }
}
