package X0;

import J.C0004c;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import k.C0275c0;

/* loaded from: classes.dex */
public final class C extends C0004c {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1020d;

    public C(TextInputLayout textInputLayout) {
        this.f1020d = textInputLayout;
    }

    @Override // J.C0004c
    public final void d(View view, K.p pVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f413a;
        AccessibilityNodeInfo accessibilityNodeInfo = pVar.f595a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1020d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean z3 = !isEmpty;
        boolean z4 = true;
        boolean z5 = !TextUtils.isEmpty(hint);
        boolean z6 = !textInputLayout.f2543u0;
        boolean z7 = !TextUtils.isEmpty(error);
        if (!z7 && TextUtils.isEmpty(counterOverflowDescription)) {
            z4 = false;
        }
        String charSequence = z5 ? hint.toString() : "";
        y yVar = textInputLayout.c;
        C0275c0 c0275c0 = yVar.c;
        if (c0275c0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0275c0);
            accessibilityNodeInfo.setTraversalAfter(c0275c0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(yVar.f1126e);
        }
        if (z3) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (z6 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z4) {
            if (!z7) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0275c0 c0275c02 = textInputLayout.f2522k.f1111y;
        if (c0275c02 != null) {
            accessibilityNodeInfo.setLabelFor(c0275c02);
        }
        textInputLayout.f2511d.b().n(pVar);
    }

    @Override // J.C0004c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1020d.f2511d.b().o(accessibilityEvent);
    }
}
