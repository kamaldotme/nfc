package X0;

import android.text.Editable;

/* loaded from: classes.dex */
public final class l extends O0.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1055b;

    public l(p pVar) {
        this.f1055b = pVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1055b.b().a();
    }

    @Override // O0.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        this.f1055b.b().b();
    }
}
