package s2;

import Z.C0035b;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import m2.j;
import m2.l;
import m2.o;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: e, reason: collision with root package name */
    public final l f4713e;

    /* renamed from: f, reason: collision with root package name */
    public long f4714f;
    public boolean g;
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, l lVar) {
        super(gVar);
        X1.g.e(lVar, "url");
        this.h = gVar;
        this.f4713e = lVar;
        this.f4714f = -1L;
        this.g = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (this.g && !n2.b.g(this, TimeUnit.MILLISECONDS)) {
            ((q2.l) this.h.f4723e).k();
            a();
        }
        this.c = true;
    }

    @Override // s2.a, z2.v
    public final long z(z2.f fVar, long j3) {
        X1.g.e(fVar, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (!(!this.c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!this.g) {
            return -1L;
        }
        long j4 = this.f4714f;
        g gVar = this.h;
        if (j4 == 0 || j4 == -1) {
            if (j4 != -1) {
                gVar.f4720a.j();
            }
            try {
                this.f4714f = gVar.f4720a.C();
                String obj = d2.d.n0(gVar.f4720a.j()).toString();
                if (this.f4714f < 0 || (obj.length() > 0 && !d2.l.V(obj, ";", false))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f4714f + obj + '\"');
                }
                if (this.f4714f == 0) {
                    this.g = false;
                    gVar.g = ((C0035b) gVar.f4724f).f();
                    o oVar = (o) gVar.f4722d;
                    X1.g.b(oVar);
                    j jVar = (j) gVar.g;
                    X1.g.b(jVar);
                    r2.e.b(oVar.f4079k, this.f4713e, jVar);
                    a();
                }
                if (!this.g) {
                    return -1L;
                }
            } catch (NumberFormatException e3) {
                throw new ProtocolException(e3.getMessage());
            }
        }
        long z3 = super.z(fVar, Math.min(j3, this.f4714f));
        if (z3 != -1) {
            this.f4714f -= z3;
            return z3;
        }
        ((q2.l) gVar.f4723e).k();
        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
        a();
        throw protocolException;
    }
}
