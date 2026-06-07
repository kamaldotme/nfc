package S;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f853a;

    /* renamed from: b, reason: collision with root package name */
    public c f854b;

    public d(TextView textView) {
        this.f853a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        TextView textView = this.f853a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b3 = androidx.emoji2.text.j.a().b();
        if (b3 != 0) {
            if (b3 == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i4);
                }
                return androidx.emoji2.text.j.a().f(charSequence, 0, charSequence.length());
            }
            if (b3 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
        if (this.f854b == null) {
            this.f854b = new c(textView, this);
        }
        a3.g(this.f854b);
        return charSequence;
    }
}
