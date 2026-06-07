package e2;

/* renamed from: e2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0141x {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0142y f2831a;

    static {
        String str;
        f2.d dVar;
        int i3 = j2.w.f3542a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null || !Boolean.parseBoolean(str)) {
            dVar = RunnableC0140w.f2829j;
        } else {
            l2.d dVar2 = B.f2767a;
            f2.d dVar3 = j2.o.f3534a;
            f2.d dVar4 = dVar3.g;
            dVar = !(dVar3 instanceof InterfaceC0142y) ? RunnableC0140w.f2829j : dVar3;
        }
        f2831a = dVar;
    }
}
