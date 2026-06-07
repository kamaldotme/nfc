package l0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C0333b;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0325a {

    /* renamed from: a, reason: collision with root package name */
    public final C0333b f3895a;

    /* renamed from: b, reason: collision with root package name */
    public final C0333b f3896b;
    public final C0333b c;

    public AbstractC0325a(C0333b c0333b, C0333b c0333b2, C0333b c0333b3) {
        this.f3895a = c0333b;
        this.f3896b = c0333b2;
        this.c = c0333b3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        C0333b c0333b = this.c;
        Class cls2 = (Class) c0333b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0333b.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        C0333b c0333b = this.f3895a;
        Method method = (Method) c0333b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0325a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0325a.class);
        c0333b.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        C0333b c0333b = this.f3896b;
        Method method = (Method) c0333b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class b3 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b3.getDeclaredMethod("write", cls, AbstractC0325a.class);
        c0333b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final Parcelable f(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f3898e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f3898e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    public abstract void h(int i3);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f3898e.writeString(null);
            return;
        }
        try {
            ((b) this).f3898e.writeString(b(cVar.getClass()).getName());
            b a3 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a3);
                int i3 = a3.f3900i;
                if (i3 >= 0) {
                    int i4 = a3.f3897d.get(i3);
                    Parcel parcel = a3.f3898e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e6) {
                if (!(e6.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
                }
                throw ((RuntimeException) e6.getCause());
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}
