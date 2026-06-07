package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0072i implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0074k f1925b;

    public DialogInterfaceOnDismissListenerC0072i(DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k) {
        this.f1925b = dialogInterfaceOnCancelListenerC0074k;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k = this.f1925b;
        Dialog dialog = dialogInterfaceOnCancelListenerC0074k.f1939d0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0074k.onDismiss(dialog);
        }
    }
}
