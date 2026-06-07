package z2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f5341e;

    public j(x xVar) {
        X1.g.e(xVar, "delegate");
        this.f5341e = xVar;
    }

    @Override // z2.x
    public final x a() {
        return this.f5341e.a();
    }

    @Override // z2.x
    public final x b() {
        return this.f5341e.b();
    }

    @Override // z2.x
    public final long c() {
        return this.f5341e.c();
    }

    @Override // z2.x
    public final x d(long j3) {
        return this.f5341e.d(j3);
    }

    @Override // z2.x
    public final boolean e() {
        return this.f5341e.e();
    }

    @Override // z2.x
    public final void f() {
        this.f5341e.f();
    }

    @Override // z2.x
    public final x g(long j3, TimeUnit timeUnit) {
        X1.g.e(timeUnit, "unit");
        return this.f5341e.g(j3, timeUnit);
    }
}
