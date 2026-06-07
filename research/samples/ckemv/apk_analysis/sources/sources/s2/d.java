package s2;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import q2.l;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public long f4715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f4716f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j3) {
        super(gVar);
        this.f4716f = gVar;
        this.f4715e = j3;
        if (j3 == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (this.f4715e != 0 && !n2.b.g(this, TimeUnit.MILLISECONDS)) {
            ((l) this.f4716f.f4723e).k();
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
        long j4 = this.f4715e;
        if (j4 == 0) {
            return -1L;
        }
        long z3 = super.z(fVar, Math.min(j4, j3));
        if (z3 == -1) {
            ((l) this.f4716f.f4723e).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j5 = this.f4715e - z3;
        this.f4715e = j5;
        if (j5 == 0) {
            a();
        }
        return z3;
    }
}
