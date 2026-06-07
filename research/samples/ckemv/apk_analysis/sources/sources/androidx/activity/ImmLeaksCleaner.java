package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0095l;
import androidx.lifecycle.InterfaceC0099p;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC0099p {

    /* renamed from: b, reason: collision with root package name */
    public static int f1434b;

    @Override // androidx.lifecycle.InterfaceC0099p
    public final void b(androidx.lifecycle.r rVar, EnumC0095l enumC0095l) {
        if (enumC0095l != EnumC0095l.ON_DESTROY) {
            return;
        }
        if (f1434b == 0) {
            try {
                f1434b = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f1434b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1434b == 1) {
            throw null;
        }
    }
}
