package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0071h implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0074k f1924b;

    public DialogInterfaceOnCancelListenerC0071h(DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k) {
        this.f1924b = dialogInterfaceOnCancelListenerC0074k;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0074k dialogInterfaceOnCancelListenerC0074k = this.f1924b;
        Dialog dialog = dialogInterfaceOnCancelListenerC0074k.f1939d0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0074k.onCancel(dialog);
        }
    }
}
