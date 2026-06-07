package d1;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115a implements GenericArrayType, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Type f2613b;

    public C0115a(Type type) {
        Objects.requireNonNull(type);
        this.f2613b = d.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && d.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f2613b;
    }

    public final int hashCode() {
        return this.f2613b.hashCode();
    }

    public final String toString() {
        return d.i(this.f2613b) + "[]";
    }
}
