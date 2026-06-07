package j2;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final f2.d f3534a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [c2.a] */
    static {
        String str;
        Object next;
        int i3 = w.f3542a;
        f2.d dVar = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator p3 = X.d.p();
        X1.g.e(p3, "<this>");
        L1.r rVar = new L1.r(1, p3);
        if (!(rVar instanceof c2.a)) {
            rVar = new c2.a(rVar);
        }
        List Q2 = c2.d.Q(rVar);
        Iterator it = Q2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int b3 = ((f2.a) next).b();
                do {
                    Object next2 = it.next();
                    int b4 = ((f2.a) next2).b();
                    if (b3 < b4) {
                        next = next2;
                        b3 = b4;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        f2.a aVar = (f2.a) next;
        if (aVar != null) {
            try {
                dVar = aVar.a(Q2);
            } catch (Throwable unused2) {
                aVar.c();
            }
            if (dVar != null) {
                f3534a = dVar;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
