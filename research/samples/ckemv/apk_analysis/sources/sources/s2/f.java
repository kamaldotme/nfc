package s2;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f4719e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (!this.f4719e) {
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
        if (this.f4719e) {
            return -1L;
        }
        long z3 = super.z(fVar, j3);
        if (z3 != -1) {
            return z3;
        }
        this.f4719e = true;
        a();
        return -1L;
    }
}
