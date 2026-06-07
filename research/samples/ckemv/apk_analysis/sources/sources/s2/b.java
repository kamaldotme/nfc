package s2;

import z2.j;
import z2.t;
import z2.x;

/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: b, reason: collision with root package name */
    public final j f4711b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f4712d;

    public b(g gVar) {
        this.f4712d = gVar;
        this.f4711b = new j(gVar.f4721b.c());
    }

    @Override // z2.t
    public final x c() {
        return this.f4711b;
    }

    @Override // z2.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f4712d.f4721b.q("0\r\n\r\n");
        g gVar = this.f4712d;
        j jVar = this.f4711b;
        gVar.getClass();
        x xVar = jVar.f5341e;
        jVar.f5341e = x.f5364d;
        xVar.a();
        xVar.b();
        this.f4712d.c = 3;
    }

    @Override // z2.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.f4712d.f4721b.flush();
    }

    @Override // z2.t
    public final void m(z2.f fVar, long j3) {
        X1.g.e(fVar, "source");
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j3 == 0) {
            return;
        }
        g gVar = this.f4712d;
        gVar.f4721b.k(j3);
        z2.g gVar2 = gVar.f4721b;
        gVar2.q("\r\n");
        gVar2.m(fVar, j3);
        gVar2.q("\r\n");
    }
}
