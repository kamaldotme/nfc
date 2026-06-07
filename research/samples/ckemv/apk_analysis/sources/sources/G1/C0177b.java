package g1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m0.z;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177b extends z {

    /* renamed from: d, reason: collision with root package name */
    public final Method f3034d = Class.class.getMethod("isRecord", null);

    /* renamed from: e, reason: collision with root package name */
    public final Method f3035e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f3036f;
    public final Method g;

    public C0177b() {
        Method method = Class.class.getMethod("getRecordComponents", null);
        this.f3035e = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f3036f = componentType.getMethod("getName", null);
        this.g = componentType.getMethod("getType", null);
    }

    @Override // m0.z
    public final Constructor A(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3035e.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i3 = 0; i3 < objArr.length; i3++) {
                clsArr[i3] = (Class) this.g.invoke(objArr[i3], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // m0.z
    public final String[] J(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3035e.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i3 = 0; i3 < objArr.length; i3++) {
                strArr[i3] = (String) this.f3036f.invoke(objArr[i3], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // m0.z
    public final boolean Q(Class cls) {
        try {
            return ((Boolean) this.f3034d.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }

    @Override // m0.z
    public final Method y(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e3);
        }
    }
}
