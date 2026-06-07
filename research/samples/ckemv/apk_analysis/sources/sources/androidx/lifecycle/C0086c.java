package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086c {
    public static final C0086c c = new C0086c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2040a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2041b = new HashMap();

    public static void b(HashMap hashMap, C0085b c0085b, EnumC0095l enumC0095l, Class cls) {
        EnumC0095l enumC0095l2 = (EnumC0095l) hashMap.get(c0085b);
        if (enumC0095l2 == null || enumC0095l == enumC0095l2) {
            if (enumC0095l2 == null) {
                hashMap.put(c0085b, enumC0095l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0085b.f2039b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0095l2 + ", new value " + enumC0095l);
    }

    public final C0084a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f2040a;
        if (superclass != null) {
            C0084a c0084a = (C0084a) hashMap2.get(superclass);
            if (c0084a == null) {
                c0084a = a(superclass, null);
            }
            hashMap.putAll(c0084a.f2037b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0084a c0084a2 = (C0084a) hashMap2.get(cls2);
            if (c0084a2 == null) {
                c0084a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0084a2.f2037b.entrySet()) {
                b(hashMap, (C0085b) entry.getKey(), (EnumC0095l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e3) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            z zVar = (z) method.getAnnotation(z.class);
            if (zVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC0095l value = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0095l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != EnumC0095l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(hashMap, new C0085b(i3, method), value, cls);
                z3 = true;
            }
        }
        C0084a c0084a3 = new C0084a(hashMap);
        hashMap2.put(cls, c0084a3);
        this.f2041b.put(cls, Boolean.valueOf(z3));
        return c0084a3;
    }
}
