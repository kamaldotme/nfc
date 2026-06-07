package S;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final EditText f861b;

    /* renamed from: d, reason: collision with root package name */
    public h f862d;
    public final boolean c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f863e = true;

    public i(EditText editText) {
        this.f861b = editText;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a3.getClass();
                length = editableText.length();
            }
            a3.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        EditText editText = this.f861b;
        if (editText.isInEditMode() || !this.f863e) {
            return;
        }
        if ((this.c || androidx.emoji2.text.j.f1769j != null) && i4 <= i5 && (charSequence instanceof Spannable)) {
            int b3 = androidx.emoji2.text.j.a().b();
            if (b3 != 0) {
                if (b3 == 1) {
                    androidx.emoji2.text.j.a().f((Spannable) charSequence, i3, i5 + i3);
                    return;
                } else if (b3 != 3) {
                    return;
                }
            }
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            if (this.f862d == null) {
                this.f862d = new h(editText);
            }
            a3.g(this.f862d);
        }
    }
}
