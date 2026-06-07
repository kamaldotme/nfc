package S;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c extends androidx.emoji2.text.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f851a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f852b;

    public c(TextView textView, d dVar) {
        this.f851a = new WeakReference(textView);
        this.f852b = new WeakReference(dVar);
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f851a.get();
        InputFilter inputFilter = (InputFilter) this.f852b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a3.getClass();
                        length = text.length();
                    }
                    CharSequence f3 = a3.f(text, 0, length);
                    if (text == f3) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(f3);
                    int selectionEnd = Selection.getSelectionEnd(f3);
                    textView.setText(f3);
                    if (f3 instanceof Spannable) {
                        Spannable spannable = (Spannable) f3;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
