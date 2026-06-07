package S;

import android.text.Editable;
import androidx.emoji2.text.t;

/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f847a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile a f848b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new t(cls, charSequence) : super.newEditable(charSequence);
    }
}
