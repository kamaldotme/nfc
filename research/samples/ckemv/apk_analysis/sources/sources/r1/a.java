package R1;

import X1.g;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f846a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        g.b(methods);
        int length = methods.length;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                break;
            }
            Method method2 = methods[i3];
            if (g.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                g.d(parameterTypes, "getParameterTypes(...)");
                if (g.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i3++;
        }
        f846a = method;
        int length2 = methods.length;
        for (int i4 = 0; i4 < length2 && !g.a(methods[i4].getName(), "getSuppressed"); i4++) {
        }
    }
}
