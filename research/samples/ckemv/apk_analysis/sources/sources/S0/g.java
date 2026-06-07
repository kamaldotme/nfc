package s0;

import m0.r;
import r0.C0369d;
import v0.o;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: b, reason: collision with root package name */
    public final int f4706b;

    static {
        X1.g.d(r.b("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t0.e eVar) {
        super(eVar);
        X1.g.e(eVar, "tracker");
        this.f4706b = 7;
    }

    @Override // s0.e
    public final int a() {
        return this.f4706b;
    }

    @Override // s0.e
    public final boolean b(o oVar) {
        return oVar.f5097j.f3964a == 4;
    }

    @Override // s0.e
    public final boolean c(Object obj) {
        C0369d c0369d = (C0369d) obj;
        X1.g.e(c0369d, "value");
        return (c0369d.f4631a && c0369d.f4633d) ? false : true;
    }
}
