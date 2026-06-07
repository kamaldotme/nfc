package W0;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 0) {
            X.d.q(message.obj);
            throw null;
        }
        if (i3 != 1) {
            return false;
        }
        X.d.q(message.obj);
        throw null;
    }
}
