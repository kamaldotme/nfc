package S;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f860a;

    public h(EditText editText) {
        this.f860a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.h
    public final void a() {
        i.a((EditText) this.f860a.get(), 1);
    }
}
