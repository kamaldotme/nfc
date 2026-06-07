package d1;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f2616b;
    public final Type c;

    public c(Type[] typeArr, Type[] typeArr2) {
        d.b(typeArr2.length <= 1);
        d.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            d.c(typeArr[0]);
            this.c = null;
            this.f2616b = d.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        d.c(typeArr2[0]);
        d.b(typeArr[0] == Object.class);
        this.c = d.a(typeArr2[0]);
        this.f2616b = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && d.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.c;
        return type != null ? new Type[]{type} : d.f2617a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f2616b};
    }

    public final int hashCode() {
        Type type = this.c;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f2616b.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.c;
        if (type != null) {
            return "? super " + d.i(type);
        }
        Type type2 = this.f2616b;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + d.i(type2);
    }
}
