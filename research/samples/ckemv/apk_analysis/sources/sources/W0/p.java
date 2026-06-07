package w0;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5162a = 0;

    static {
        X1.g.d(m0.r.b("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        X1.g.e(context, "context");
        X1.g.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        X1.g.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (q.f5163a) {
        }
        X1.g.d(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
