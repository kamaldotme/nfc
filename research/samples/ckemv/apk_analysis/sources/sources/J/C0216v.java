package j;

import android.widget.PopupWindow;

/* renamed from: j.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216v implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0218x f3367b;

    public C0216v(C0218x c0218x) {
        this.f3367b = c0218x;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3367b.c();
    }
}
