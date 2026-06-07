package f2;

import X1.g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import m0.z;

/* loaded from: classes.dex */
public abstract class e {
    private static volatile Choreographer choreographer;

    static {
        Object q3;
        try {
            q3 = new d(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            q3 = z.q(th);
        }
        if (q3 instanceof K1.d) {
            q3 = null;
        }
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            g.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
