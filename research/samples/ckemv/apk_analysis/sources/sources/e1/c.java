package e1;

import b1.x;
import b1.y;
import c1.InterfaceC0110a;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2696b;
    public final androidx.activity.l c;

    public /* synthetic */ c(androidx.activity.l lVar, int i3) {
        this.f2696b = i3;
        this.c = lVar;
    }

    public static x b(androidx.activity.l lVar, b1.l lVar2, TypeToken typeToken, InterfaceC0110a interfaceC0110a) {
        x a3;
        Object g = lVar.b(TypeToken.get(interfaceC0110a.value())).g();
        boolean nullSafe = interfaceC0110a.nullSafe();
        if (g instanceof x) {
            a3 = (x) g;
        } else {
            if (!(g instanceof y)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + g.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            a3 = ((y) g).a(lVar2, typeToken);
        }
        return (a3 == null || !nullSafe) ? a3 : new b1.j(a3, 2);
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        switch (this.f2696b) {
            case 0:
                Type type = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                d1.d.b(Collection.class.isAssignableFrom(rawType));
                Type h = d1.d.h(type, rawType, d1.d.f(type, rawType, Collection.class), new HashMap());
                Class cls = h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments()[0] : Object.class;
                return new b(lVar, cls, lVar.d(TypeToken.get(cls)), this.c.b(typeToken));
            default:
                InterfaceC0110a interfaceC0110a = (InterfaceC0110a) typeToken.getRawType().getAnnotation(InterfaceC0110a.class);
                if (interfaceC0110a == null) {
                    return null;
                }
                return b(this.c, lVar, typeToken, interfaceC0110a);
        }
    }
}
