package l;

import F.e;
import a.AbstractC0059a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c extends AbstractC0059a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3893b = new Object();
    public final ExecutorService c = Executors.newFixedThreadPool(4, new b());

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f3894d;

    public static Handler O(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
