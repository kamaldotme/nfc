package d1;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f2617a = new Type[0];

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0115a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0115a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void b(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Type type) {
        b(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static void e(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            X.d.q(it.next());
            throw null;
        }
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i3 = 0; i3 < length; i3++) {
                Class<?> cls3 = interfaces[i3];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i3];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i3], interfaces[i3], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            b(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013e A[EDGE_INSN: B:16:0x013e->B:17:0x013e BREAK  A[LOOP:0: B:2:0x0004->B:21:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[LOOP:0: B:2:0x0004->B:21:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [d1.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [d1.c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type h(Type type, Class cls, Type type2, HashMap hashMap) {
        Type h;
        Type bVar;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                if (type3 != null) {
                    return type3 == Void.TYPE ? type2 : type3;
                }
                hashMap.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type f3 = f(type, cls, cls2);
                    if (f3 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        for (int i3 = 0; i3 < length; i3++) {
                            if (typeVariable2.equals(typeParameters[i3])) {
                                type2 = ((ParameterizedType) f3).getActualTypeArguments()[i3];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type h3 = h(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, h3)) {
                            type2 = cls3;
                        } else {
                            bVar = new C0115a(h3);
                            type2 = bVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type h4 = h(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, h4)) {
                        bVar = new C0115a(h4);
                        type2 = bVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type h5 = h(type, cls, ownerType, hashMap);
                    boolean z3 = !Objects.equals(h5, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    for (int i4 = 0; i4 < length2; i4++) {
                        Type h6 = h(type, cls, actualTypeArguments[i4], hashMap);
                        if (!Objects.equals(h6, actualTypeArguments[i4])) {
                            if (!z3) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z3 = true;
                            }
                            actualTypeArguments[i4] = h6;
                        }
                    }
                    if (z3) {
                        bVar = new b(h5, type2.getRawType(), actualTypeArguments);
                        type2 = bVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type h7 = h(type, cls, lowerBounds[0], hashMap);
                        if (h7 != lowerBounds[0]) {
                            type2 = new c(new Type[]{Object.class}, h7 instanceof WildcardType ? ((WildcardType) h7).getLowerBounds() : new Type[]{h7});
                        }
                    } else if (upperBounds.length == 1 && (h = h(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new c(h instanceof WildcardType ? ((WildcardType) h).getUpperBounds() : new Type[]{h}, f2617a);
                    }
                }
            }
        }
        if (typeVariable != null) {
            hashMap.put(typeVariable, type2);
        }
        return type2;
    }

    public static String i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
