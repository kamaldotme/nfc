package d1;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes.dex */
public final class g implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2620b;
    public final /* synthetic */ Type c;

    public /* synthetic */ g(Type type, int i3) {
        this.f2620b = i3;
        this.c = type;
    }

    @Override // d1.p
    public final Object g() {
        switch (this.f2620b) {
            case 0:
                Type type = this.c;
                if (!(type instanceof ParameterizedType)) {
                    throw new RuntimeException("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new RuntimeException("Invalid EnumSet type: " + type.toString());
            default:
                Type type3 = this.c;
                if (!(type3 instanceof ParameterizedType)) {
                    throw new RuntimeException("Invalid EnumMap type: " + type3.toString());
                }
                Type type4 = ((ParameterizedType) type3).getActualTypeArguments()[0];
                if (type4 instanceof Class) {
                    return new EnumMap((Class) type4);
                }
                throw new RuntimeException("Invalid EnumMap type: " + type3.toString());
        }
    }
}
