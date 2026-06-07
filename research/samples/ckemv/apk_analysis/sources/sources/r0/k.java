package r0;

import e2.AbstractC0139v;
import e2.K;
import e2.U;
import f.C0150G;
import m0.r;
import m0.z;
import v0.o;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4640a = 0;

    static {
        X1.g.d(r.b("WorkConstraintsTracker"), "tagWithPrefix(\"WorkConstraintsTracker\")");
    }

    public static final U a(C0150G c0150g, o oVar, K k2, e eVar) {
        X1.g.e(c0150g, "<this>");
        X1.g.e(k2, "dispatcher");
        X1.g.e(eVar, "listener");
        U b3 = AbstractC0139v.b();
        AbstractC0139v.k(AbstractC0139v.a(z.a0(k2, b3)), 0, new j(c0150g, oVar, eVar, null), 3);
        return b3;
    }
}
