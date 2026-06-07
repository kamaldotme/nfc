package z2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class o implements g {

    /* renamed from: b, reason: collision with root package name */
    public final t f5351b;
    public final f c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5352d;

    /* JADX WARN: Type inference failed for: r2v1, types: [z2.f, java.lang.Object] */
    public o(t tVar) {
        X1.g.e(tVar, "sink");
        this.f5351b = tVar;
        this.c = new Object();
    }

    @Override // z2.g
    public final g B(int i3) {
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.O(i3);
        a();
        return this;
    }

    @Override // z2.g
    public final g F(i iVar) {
        X1.g.e(iVar, "byteString");
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.J(iVar);
        a();
        return this;
    }

    public final g a() {
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.c;
        long j3 = fVar.c;
        if (j3 == 0) {
            j3 = 0;
        } else {
            q qVar = fVar.f5337b;
            X1.g.b(qVar);
            q qVar2 = qVar.g;
            X1.g.b(qVar2);
            if (qVar2.c < 8192 && qVar2.f5358e) {
                j3 -= r6 - qVar2.f5356b;
            }
        }
        if (j3 > 0) {
            this.f5351b.m(fVar, j3);
        }
        return this;
    }

    public final g b(int i3, int i4, byte[] bArr) {
        X1.g.e(bArr, "source");
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.I(i3, i4, bArr);
        a();
        return this;
    }

    @Override // z2.t
    public final x c() {
        return this.f5351b.c();
    }

    @Override // z2.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t tVar = this.f5351b;
        if (this.f5352d) {
            return;
        }
        try {
            f fVar = this.c;
            long j3 = fVar.c;
            if (j3 > 0) {
                tVar.m(fVar, j3);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            tVar.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f5352d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // z2.g
    public final g d(byte[] bArr) {
        X1.g.e(bArr, "source");
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.c;
        fVar.getClass();
        fVar.I(0, bArr.length, bArr);
        a();
        return this;
    }

    @Override // z2.g
    public final g e(int i3) {
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.N(i3);
        a();
        return this;
    }

    @Override // z2.g, z2.t, java.io.Flushable
    public final void flush() {
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.c;
        long j3 = fVar.c;
        t tVar = this.f5351b;
        if (j3 > 0) {
            tVar.m(fVar, j3);
        }
        tVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5352d;
    }

    @Override // z2.g
    public final g k(long j3) {
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.M(j3);
        a();
        return this;
    }

    @Override // z2.t
    public final void m(f fVar, long j3) {
        X1.g.e(fVar, "source");
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.m(fVar, j3);
        a();
    }

    @Override // z2.g
    public final g q(String str) {
        X1.g.e(str, "string");
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.Q(str);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f5351b + ')';
    }

    @Override // z2.g
    public final g w(int i3) {
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        this.c.L(i3);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        X1.g.e(byteBuffer, "source");
        if (!(!this.f5352d)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.c.write(byteBuffer);
        a();
        return write;
    }
}
