package w0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import m0.C0329a;
import m0.z;

/* loaded from: classes.dex */
public abstract class n {
    static {
        X1.g.d(m0.r.b("ProcessUtils"), "tagWithPrefix(\"ProcessUtils\")");
    }

    public static final boolean a(Context context, C0329a c0329a) {
        String str;
        Object obj;
        X1.g.e(context, "context");
        X1.g.e(c0329a, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = C0406a.f5145a.a();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, z.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                X1.g.b(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable unused) {
                m0.r.a().getClass();
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            X1.g.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return X1.g.a(str, context.getApplicationInfo().processName);
    }
}
