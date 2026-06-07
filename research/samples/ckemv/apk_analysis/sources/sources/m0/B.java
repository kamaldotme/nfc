package m0;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class B {
    static {
        r.b("WorkerFactory");
    }

    public static q a(Context context, String str, WorkerParameters workerParameters) {
        Class cls;
        q qVar = null;
        try {
            cls = Class.forName(str).asSubclass(q.class);
        } catch (Throwable unused) {
            r.a().getClass();
            cls = null;
        }
        if (cls != null) {
            try {
                qVar = (q) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable unused2) {
                r.a().getClass();
            }
        }
        if (qVar == null || !qVar.f3982e) {
            return qVar;
        }
        throw new IllegalStateException("WorkerFactory (" + B.class.getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
