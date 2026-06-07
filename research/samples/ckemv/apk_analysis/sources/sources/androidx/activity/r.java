package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1473a = new Object();

    public final OnBackInvokedCallback a(W1.l lVar, W1.l lVar2, W1.a aVar, W1.a aVar2) {
        X1.g.e(lVar, "onBackStarted");
        X1.g.e(lVar2, "onBackProgressed");
        X1.g.e(aVar, "onBackInvoked");
        X1.g.e(aVar2, "onBackCancelled");
        return new q(lVar, lVar2, aVar, aVar2);
    }
}
