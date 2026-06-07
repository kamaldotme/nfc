package e1;

import b1.x;
import b1.y;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes.dex */
public final class h implements y {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.activity.l f2707b;
    public final boolean c = false;

    public h(androidx.activity.l lVar) {
        this.f2707b = lVar;
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            d1.d.b(Map.class.isAssignableFrom(rawType));
            Type h = d1.d.h(type, rawType, d1.d.f(type, rawType, Map.class), new HashMap());
            actualTypeArguments = h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new g(this, lVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? u.c : lVar.d(TypeToken.get(type2)), actualTypeArguments[1], lVar.d(TypeToken.get(actualTypeArguments[1])), this.f2707b.b(typeToken));
    }
}
