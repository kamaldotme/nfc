package F;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class e {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }
}
