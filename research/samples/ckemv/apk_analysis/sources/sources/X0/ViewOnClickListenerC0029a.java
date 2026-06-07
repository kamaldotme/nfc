package X0;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: X0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0029a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1023b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnClickListenerC0029a(int i3, Object obj) {
        this.f1023b = i3;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1023b) {
            case 0:
                C0033e c0033e = (C0033e) this.c;
                EditText editText = c0033e.f1032i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0033e.q();
                return;
            case 1:
                ((k) this.c).u();
                return;
            case 2:
                x xVar = (x) this.c;
                EditText editText2 = xVar.f1123f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = xVar.f1123f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    xVar.f1123f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    xVar.f1123f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    xVar.f1123f.setSelection(selectionEnd);
                }
                xVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.m) this.c).C();
                throw null;
        }
    }
}
