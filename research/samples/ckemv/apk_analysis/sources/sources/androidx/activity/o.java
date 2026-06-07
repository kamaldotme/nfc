package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1468b;

    public /* synthetic */ o(int i3, Object obj) {
        this.f1467a = i3;
        this.f1468b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1467a) {
            case 0:
                W1.a aVar = (W1.a) this.f1468b;
                X1.g.e(aVar, "$onBackInvoked");
                aVar.d();
                return;
            case 1:
                ((f.v) this.f1468b).C();
                return;
            default:
                ((Runnable) this.f1468b).run();
                return;
        }
    }
}
