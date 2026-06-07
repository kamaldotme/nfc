package d1;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f2652a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [d1.x] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    static {
        ?? r7;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    r7 = new t(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    r7 = new Object();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                r7 = new v(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            r7 = new u(intValue, declaredMethod3);
        }
        f2652a = r7;
    }

    public abstract Object a(Class cls);
}
