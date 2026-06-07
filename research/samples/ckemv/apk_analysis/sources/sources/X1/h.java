package X1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class h implements e, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f1140b;

    public h(int i3) {
        this.f1140b = i3;
    }

    @Override // X1.e
    public final int g() {
        return this.f1140b;
    }

    public final String toString() {
        k.f1143a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        g.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
