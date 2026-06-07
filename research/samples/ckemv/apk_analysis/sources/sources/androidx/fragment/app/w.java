package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import n.C0342k;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final C0342k f2008b = new C0342k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f2009a;

    public w(B b3) {
        this.f2009a = b3;
    }

    public static Class b(ClassLoader classLoader, String str) {
        C0342k c0342k = f2008b;
        C0342k c0342k2 = (C0342k) c0342k.getOrDefault(classLoader, null);
        if (c0342k2 == null) {
            c0342k2 = new C0342k();
            c0342k.put(classLoader, c0342k2);
        }
        Class cls = (Class) c0342k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0342k2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e3) {
            throw new RuntimeException(X.d.i("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(X.d.i("Unable to instantiate fragment ", str, ": make sure class name exists"), e4);
        }
    }

    public final AbstractComponentCallbacksC0077n a(String str) {
        try {
            return (AbstractComponentCallbacksC0077n) c(this.f2009a.f1819n.f1996e.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(X.d.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(X.d.i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException(X.d.i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(X.d.i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e6);
        }
    }
}
