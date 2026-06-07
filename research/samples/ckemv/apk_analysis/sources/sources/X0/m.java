package X0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1056a;

    public m(p pVar) {
        this.f1056a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f1056a;
        if (pVar.f1076t == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f1076t;
        l lVar = pVar.f1079w;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f1076t.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f1076t.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f1076t = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f1076t);
        pVar.j(pVar.b());
    }
}
