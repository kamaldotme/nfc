package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f1469a = new Object();

    public final OnBackInvokedCallback a(W1.a aVar) {
        X1.g.e(aVar, "onBackInvoked");
        return new o(0, aVar);
    }

    public final void b(Object obj, int i3, Object obj2) {
        X1.g.e(obj, "dispatcher");
        X1.g.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        X1.g.e(obj, "dispatcher");
        X1.g.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
