package e1;

import b1.x;
import b1.y;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class r implements y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2735b;
    public final /* synthetic */ Class c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f2736d;

    public /* synthetic */ r(Class cls, x xVar, int i3) {
        this.f2735b = i3;
        this.c = cls;
        this.f2736d = xVar;
    }

    @Override // b1.y
    public final x a(b1.l lVar, TypeToken typeToken) {
        switch (this.f2735b) {
            case 0:
                if (typeToken.getRawType() == this.c) {
                    return this.f2736d;
                }
                return null;
            default:
                Class<?> rawType = typeToken.getRawType();
                if (this.c.isAssignableFrom(rawType)) {
                    return new b(this, rawType);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f2735b) {
            case 0:
                return "Factory[type=" + this.c.getName() + ",adapter=" + this.f2736d + "]";
            default:
                return "Factory[typeHierarchy=" + this.c.getName() + ",adapter=" + this.f2736d + "]";
        }
    }
}
