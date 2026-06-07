package q2;

import java.io.IOException;
import java.net.ProtocolException;
import z2.t;
import z2.x;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: b, reason: collision with root package name */
    public final t f4428b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4429d;

    /* renamed from: e, reason: collision with root package name */
    public long f4430e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4431f;
    public final /* synthetic */ e g;

    public c(e eVar, t tVar, long j3) {
        X1.g.e(tVar, "delegate");
        this.g = eVar;
        this.f4428b = tVar;
        this.c = j3;
    }

    public final void a() {
        this.f4428b.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f4429d) {
            return iOException;
        }
        this.f4429d = true;
        return this.g.a(false, true, iOException);
    }

    @Override // z2.t
    public final x c() {
        return this.f4428b.c();
    }

    @Override // z2.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4431f) {
            return;
        }
        this.f4431f = true;
        long j3 = this.c;
        if (j3 != -1 && this.f4430e != j3) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    @Override // z2.t, java.io.Flushable
    public final void flush() {
        try {
            i();
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final void i() {
        this.f4428b.flush();
    }

    @Override // z2.t
    public final void m(z2.f fVar, long j3) {
        X1.g.e(fVar, "source");
        if (!(!this.f4431f)) {
            throw new IllegalStateException("closed".toString());
        }
        long j4 = this.c;
        if (j4 == -1 || this.f4430e + j3 <= j4) {
            try {
                this.f4428b.m(fVar, j3);
                this.f4430e += j3;
                return;
            } catch (IOException e3) {
                throw b(e3);
            }
        }
        throw new ProtocolException("expected " + j4 + " bytes but received " + (this.f4430e + j3));
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f4428b + ')';
    }
}
