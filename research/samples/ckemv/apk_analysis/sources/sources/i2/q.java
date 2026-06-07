package i2;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final d1.f f3231a = new d1.f("NULL", 4);

    /* renamed from: b, reason: collision with root package name */
    public static final d1.f f3232b = new d1.f("UNINITIALIZED", 4);

    public static final Object a(O1.i iVar, Object obj, Object obj2, W1.p pVar, O1.d dVar) {
        Object n3 = j2.a.n(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            X1.m.a(2, pVar);
            Object e3 = pVar.e(obj, sVar);
            j2.a.h(iVar, n3);
            if (e3 == P1.a.f784b) {
                X1.g.e(dVar, "frame");
            }
            return e3;
        } catch (Throwable th) {
            j2.a.h(iVar, n3);
            throw th;
        }
    }
}
