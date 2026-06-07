package f;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0155c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f2882a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == -3 || i3 == -2 || i3 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2882a.get(), message.what);
        } else {
            if (i3 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
