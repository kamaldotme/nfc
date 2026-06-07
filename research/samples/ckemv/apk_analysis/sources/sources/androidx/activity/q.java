package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class q implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W1.l f1470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W1.l f1471b;
    public final /* synthetic */ W1.a c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W1.a f1472d;

    public q(W1.l lVar, W1.l lVar2, W1.a aVar, W1.a aVar2) {
        this.f1470a = lVar;
        this.f1471b = lVar2;
        this.c = aVar;
        this.f1472d = aVar2;
    }

    public final void onBackCancelled() {
        this.f1472d.d();
    }

    public final void onBackInvoked() {
        this.c.d();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        this.f1471b.h(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        X1.g.e(backEvent, "backEvent");
        this.f1470a.h(new b(backEvent));
    }
}
