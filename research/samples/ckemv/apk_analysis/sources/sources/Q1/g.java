package Q1;

import X1.k;

/* loaded from: classes.dex */
public abstract class g extends b implements X1.e {

    /* renamed from: e, reason: collision with root package name */
    public final int f827e;

    public g(int i3, O1.d dVar) {
        super(dVar);
        this.f827e = i3;
    }

    @Override // X1.e
    public final int g() {
        return this.f827e;
    }

    @Override // Q1.b
    public final String toString() {
        if (this.f821b != null) {
            return super.toString();
        }
        k.f1143a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        X1.g.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
