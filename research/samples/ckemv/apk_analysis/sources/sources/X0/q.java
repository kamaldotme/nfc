package X0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1080a;

    /* renamed from: b, reason: collision with root package name */
    public final p f1081b;
    public final Context c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f1082d;

    public q(p pVar) {
        this.f1080a = pVar.f1061b;
        this.f1081b = pVar;
        this.c = pVar.getContext();
        this.f1082d = pVar.h;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public K.d h() {
        return null;
    }

    public boolean i(int i3) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(K.p pVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z3) {
    }

    public final void q() {
        this.f1081b.f(false);
    }

    public void r() {
    }

    public void s() {
    }
}
