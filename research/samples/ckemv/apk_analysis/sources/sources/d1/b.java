package d1;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f2614b;
    public final Type c;

    /* renamed from: d, reason: collision with root package name */
    public final Type[] f2615d;

    public b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z3 = true;
            boolean z4 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z4) {
                z3 = false;
            }
            d.b(z3);
        }
        this.f2614b = type == null ? null : d.a(type);
        this.c = d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f2615d = typeArr2;
        int length = typeArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            Objects.requireNonNull(this.f2615d[i3]);
            d.c(this.f2615d[i3]);
            Type[] typeArr3 = this.f2615d;
            typeArr3[i3] = d.a(typeArr3[i3]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && d.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f2615d.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f2614b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f2615d) ^ this.c.hashCode();
        Type type = this.f2614b;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f2615d;
        int length = typeArr.length;
        Type type = this.c;
        if (length == 0) {
            return d.i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(d.i(type));
        sb.append("<");
        sb.append(d.i(typeArr[0]));
        for (int i3 = 1; i3 < length; i3++) {
            sb.append(", ");
            sb.append(d.i(typeArr[i3]));
        }
        sb.append(">");
        return sb.toString();
    }
}
