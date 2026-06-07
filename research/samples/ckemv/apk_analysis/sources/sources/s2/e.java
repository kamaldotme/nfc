package s2;

import z2.j;
import z2.t;
import z2.x;

/* loaded from: classes.dex */
public final class e implements t {

    /* renamed from: b, reason: collision with root package name */
    public final j f4717b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4718d;

    public e(g gVar) {
        this.f4718d = gVar;
        this.f4717b = new j(gVar.f4721b.c());
    }

    @Override // z2.t
    public final x c() {
        return this.f4717b;
    }

    @Override // z2.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        g gVar = this.f4718d;
        gVar.getClass();
        j jVar = this.f4717b;
        x xVar = jVar.f5341e;
        jVar.f5341e = x.f5364d;
        xVar.a();
        xVar.b();
        gVar.c = 3;
    }

    @Override // z2.t, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.f4718d.f4721b.flush();
    }

    @Override // z2.t
    public final void m(z2.f fVar, long j3) {
        X1.g.e(fVar, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        n2.b.b(fVar.c, 0L, j3);
        this.f4718d.f4721b.m(fVar, j3);
    }
}
