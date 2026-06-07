package e1;

import b1.x;
import b1.y;
import com.google.gson.reflect.TypeToken;
import h1.C0181a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118a implements y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2692b;

    public /* synthetic */ C0118a(int i3) {
        this.f2692b = i3;
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        switch (this.f2692b) {
            case 0:
                Type type = typeToken.getType();
                boolean z3 = type instanceof GenericArrayType;
                if (!z3 && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z3 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new b(lVar, lVar.d(TypeToken.get(genericComponentType)), d1.d.g(genericComponentType));
            case 1:
                if (typeToken.getRawType() == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new q(rawType);
            case 3:
                if (typeToken.getRawType() == java.sql.Date.class) {
                    return new C0181a(0);
                }
                return null;
            case 4:
                if (typeToken.getRawType() == Time.class) {
                    return new C0181a(1);
                }
                return null;
            default:
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                lVar.getClass();
                return new C0181a(lVar.d(TypeToken.get(Date.class)));
        }
    }
}
