package t2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements z2.v {

    /* renamed from: b, reason: collision with root package name */
    public final z2.h f4983b;
    public int c;

    /* renamed from: d, reason: collision with root package name */
    public int f4984d;

    /* renamed from: e, reason: collision with root package name */
    public int f4985e;

    /* renamed from: f, reason: collision with root package name */
    public int f4986f;
    public int g;

    public t(z2.h hVar) {
        this.f4983b = hVar;
    }

    @Override // z2.v
    public final z2.x c() {
        return this.f4983b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // z2.v
    public final long z(z2.f fVar, long j3) {
        int i3;
        int H2;
        X1.g.e(fVar, "sink");
        do {
            int i4 = this.f4986f;
            z2.h hVar = this.f4983b;
            if (i4 != 0) {
                long z3 = hVar.z(fVar, Math.min(j3, i4));
                if (z3 == -1) {
                    return -1L;
                }
                this.f4986f -= (int) z3;
                return z3;
            }
            hVar.u(this.g);
            this.g = 0;
            if ((this.f4984d & 4) != 0) {
                return -1L;
            }
            i3 = this.f4985e;
            int r3 = n2.b.r(hVar);
            this.f4986f = r3;
            this.c = r3;
            int E2 = hVar.E() & 255;
            this.f4984d = hVar.E() & 255;
            Logger logger = u.f4987f;
            if (logger.isLoggable(Level.FINE)) {
                z2.i iVar = f.f4934a;
                logger.fine(f.a(this.f4985e, this.c, E2, this.f4984d, true));
            }
            H2 = hVar.H() & Integer.MAX_VALUE;
            this.f4985e = H2;
            if (E2 != 9) {
                throw new IOException(E2 + " != TYPE_CONTINUATION");
            }
        } while (H2 == i3);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }
}
