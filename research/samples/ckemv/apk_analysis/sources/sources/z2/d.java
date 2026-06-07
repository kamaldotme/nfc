package z2;

import java.io.IOException;
import java.io.InputStream;
import m0.z;

/* loaded from: classes.dex */
public final class d implements v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5329b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5330d;

    public /* synthetic */ d(Object obj, int i3, Object obj2) {
        this.f5329b = i3;
        this.c = obj;
        this.f5330d = obj2;
    }

    @Override // z2.v
    public final x c() {
        switch (this.f5329b) {
            case 0:
                return (e) this.c;
            default:
                return (x) this.f5330d;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5329b) {
            case 0:
                v vVar = (v) this.f5330d;
                e eVar = (e) this.c;
                eVar.h();
                try {
                    vVar.close();
                    if (eVar.i()) {
                        throw eVar.j(null);
                    }
                    return;
                } catch (IOException e3) {
                    if (!eVar.i()) {
                        throw e3;
                    }
                    throw eVar.j(e3);
                } finally {
                    eVar.i();
                }
            default:
                ((InputStream) this.c).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f5329b) {
            case 0:
                return "AsyncTimeout.source(" + ((v) this.f5330d) + ')';
            default:
                return "source(" + ((InputStream) this.c) + ')';
        }
    }

    @Override // z2.v
    public final long z(f fVar, long j3) {
        switch (this.f5329b) {
            case 0:
                X1.g.e(fVar, "sink");
                v vVar = (v) this.f5330d;
                e eVar = (e) this.c;
                eVar.h();
                try {
                    long z3 = vVar.z(fVar, j3);
                    if (eVar.i()) {
                        throw eVar.j(null);
                    }
                    return z3;
                } catch (IOException e3) {
                    if (eVar.i()) {
                        throw eVar.j(e3);
                    }
                    throw e3;
                } finally {
                    eVar.i();
                }
            default:
                X1.g.e(fVar, "sink");
                if (j3 == 0) {
                    return 0L;
                }
                if (j3 < 0) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
                }
                try {
                    ((x) this.f5330d).f();
                    q G2 = fVar.G(1);
                    int read = ((InputStream) this.c).read(G2.f5355a, G2.c, (int) Math.min(j3, 8192 - G2.c));
                    if (read == -1) {
                        if (G2.f5356b == G2.c) {
                            fVar.f5337b = G2.a();
                            r.a(G2);
                        }
                        return -1L;
                    }
                    G2.c += read;
                    long j4 = read;
                    fVar.c += j4;
                    return j4;
                } catch (AssertionError e4) {
                    if (z.O(e4)) {
                        throw new IOException(e4);
                    }
                    throw e4;
                }
        }
    }
}
