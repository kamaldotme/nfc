package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073j extends v0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0.f f1926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0074k f1927e;

    public C0073j(DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k, C0075l c0075l) {
        this.f1927e = dialogInterfaceOnCancelListenerC0074k;
        this.f1926d = c0075l;
    }

    @Override // v0.f
    public final View C(int i3) {
        v0.f fVar = this.f1926d;
        if (fVar.F()) {
            return fVar.C(i3);
        }
        Dialog dialog = this.f1927e.f1939d0;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    @Override // v0.f
    public final boolean F() {
        return this.f1926d.F() || this.f1927e.f1942g0;
    }
}
