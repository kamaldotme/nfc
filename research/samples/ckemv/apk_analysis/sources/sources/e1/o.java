package e1;

import g1.AbstractC0178c;
import i1.C0186a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import m0.z;

/* loaded from: classes.dex */
public final class o extends m {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f2725e;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f2726b;
    public final Object[] c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2727d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f2725e = hashMap;
    }

    public o(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f2727d = new HashMap();
        z zVar = AbstractC0178c.f3037a;
        Constructor A3 = zVar.A(cls);
        this.f2726b = A3;
        AbstractC0178c.e(A3);
        String[] J2 = zVar.J(cls);
        for (int i3 = 0; i3 < J2.length; i3++) {
            this.f2727d.put(J2[i3], Integer.valueOf(i3));
        }
        Class<?>[] parameterTypes = this.f2726b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i4 = 0; i4 < parameterTypes.length; i4++) {
            this.c[i4] = f2725e.get(parameterTypes[i4]);
        }
    }

    @Override // e1.m
    public final Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // e1.m
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f2726b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e3) {
            z zVar = AbstractC0178c.f3037a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0178c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e5) {
            e = e5;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0178c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC0178c.b(constructor) + "' with args " + Arrays.toString(objArr), e6.getCause());
        }
    }

    @Override // e1.m
    public final void e(Object obj, C0186a c0186a, l lVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.f2727d;
        String str = lVar.c;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC0178c.b(this.f2726b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int intValue = num.intValue();
        Object a3 = lVar.f2718i.a(c0186a);
        if (a3 != null || !lVar.f2721l) {
            objArr[intValue] = a3;
            return;
        }
        throw new RuntimeException("null is not allowed as value for record component '" + str + "' of primitive type; at path " + c0186a.I(false));
    }
}
