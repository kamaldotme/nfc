package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f2057a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2058b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            X1.g.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            X.d.n(newInstance);
            throw null;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r7.booleanValue() != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Class cls) {
        Constructor<?> constructor;
        HashMap hashMap = f2057a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : "";
                X1.g.d(name, "fullPackage");
                if (name.length() != 0) {
                    X1.g.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    X1.g.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                X1.g.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = d2.l.T(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    concat = name + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap hashMap2 = f2058b;
            if (constructor != null) {
                hashMap2.put(cls, v0.f.B(constructor));
            } else {
                C0086c c0086c = C0086c.c;
                HashMap hashMap3 = c0086c.f2041b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                int i4 = 0;
                if (bool == null) {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        for (Method method : declaredMethods) {
                            if (((z) method.getAnnotation(z.class)) != null) {
                                c0086c.a(cls, declaredMethods);
                                break;
                            }
                        }
                        hashMap3.put(cls, Boolean.FALSE);
                        Class superclass = cls.getSuperclass();
                        if (superclass != null && q.class.isAssignableFrom(superclass)) {
                            X1.g.d(superclass, "superclass");
                            if (b(superclass) != 1) {
                                Object obj = hashMap2.get(superclass);
                                X1.g.b(obj);
                                arrayList = new ArrayList((Collection) obj);
                            }
                        }
                        Class<?>[] interfaces = cls.getInterfaces();
                        X1.g.d(interfaces, "klass.interfaces");
                        int length = interfaces.length;
                        while (true) {
                            if (i4 < length) {
                                Class<?> cls2 = interfaces[i4];
                                if (cls2 != null && q.class.isAssignableFrom(cls2)) {
                                    X1.g.d(cls2, "intrface");
                                    if (b(cls2) == 1) {
                                        break;
                                    }
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj2 = hashMap2.get(cls2);
                                    X1.g.b(obj2);
                                    arrayList.addAll((Collection) obj2);
                                }
                                i4++;
                            } else if (arrayList != null) {
                                hashMap2.put(cls, arrayList);
                            }
                        }
                    } catch (NoClassDefFoundError e4) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                    }
                }
            }
            i3 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
