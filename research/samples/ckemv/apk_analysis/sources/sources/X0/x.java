package X0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import xyz.happify.ckemv.R;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f1122e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1123f;
    public final ViewOnClickListenerC0029a g;

    public x(p pVar, int i3) {
        super(pVar);
        this.f1122e = R.drawable.design_password_eye;
        this.g = new ViewOnClickListenerC0029a(2, this);
        if (i3 != 0) {
            this.f1122e = i3;
        }
    }

    @Override // X0.q
    public final void b() {
        q();
    }

    @Override // X0.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // X0.q
    public final int d() {
        return this.f1122e;
    }

    @Override // X0.q
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // X0.q
    public final boolean k() {
        return true;
    }

    @Override // X0.q
    public final boolean l() {
        EditText editText = this.f1123f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // X0.q
    public final void m(EditText editText) {
        this.f1123f = editText;
        q();
    }

    @Override // X0.q
    public final void r() {
        EditText editText = this.f1123f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1123f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // X0.q
    public final void s() {
        EditText editText = this.f1123f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
