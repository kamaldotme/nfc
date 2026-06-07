package q2;

import java.io.IOException;
import java.net.ProtocolException;
import z2.v;
import z2.x;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: b, reason: collision with root package name */
    public final v f4432b;
    public final long c;

    /* renamed from: d, reason: collision with root package name */
    public long f4433d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4434e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4435f;
    public boolean g;
    public final /* synthetic */ e h;

    public d(e eVar, v vVar, long j3) {
        X1.g.e(vVar, "delegate");
        this.h = eVar;
        this.f4432b = vVar;
        this.c = j3;
        this.f4434e = true;
        if (j3 == 0) {
            b(null);
        }
    }

    public final void a() {
        this.f4432b.close();
    }

    public final IOException b(IOException iOException) {
        if (this.f4435f) {
            return iOException;
        }
        this.f4435f = true;
        e eVar = this.h;
        if (iOException == null && this.f4434e) {
            this.f4434e = false;
            eVar.f4437b.getClass();
            X1.g.e(eVar.f4436a, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // z2.v
    public final x c() {
        return this.f4432b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            a();
            b(null);
        } catch (IOException e3) {
            throw b(e3);
        }
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f4432b + ')';
    }

    @Override // z2.v
    public final long z(z2.f fVar, long j3) {
        X1.g.e(fVar, "sink");
        if (!(!this.g)) {
            throw new IllegalStateException("closed".toString());
        }
        try {
            long z3 = this.f4432b.z(fVar, j3);
            if (this.f4434e) {
                this.f4434e = false;
                e eVar = this.h;
                m2.b bVar = eVar.f4437b;
                i iVar = eVar.f4436a;
                bVar.getClass();
                X1.g.e(iVar, "call");
            }
            if (z3 == -1) {
                b(null);
                return -1L;
            }
            long j4 = this.f4433d + z3;
            long j5 = this.c;
            if (j5 == -1 || j4 <= j5) {
                this.f4433d = j4;
                if (j4 == j5) {
                    b(null);
                }
                return z3;
            }
            throw new ProtocolException("expected " + j5 + " bytes but received " + j4);
        } catch (IOException e3) {
            throw b(e3);
        }
    }
}
