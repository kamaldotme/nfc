package z2;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class l implements v {

    /* renamed from: b, reason: collision with root package name */
    public final h f5346b;
    public final Inflater c;

    /* renamed from: d, reason: collision with root package name */
    public int f5347d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5348e;

    public l(p pVar, Inflater inflater) {
        this.f5346b = pVar;
        this.c = inflater;
    }

    @Override // z2.v
    public final x c() {
        return this.f5346b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5348e) {
            return;
        }
        this.c.end();
        this.f5348e = true;
        this.f5346b.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[SYNTHETIC] */
    @Override // z2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long z(f fVar, long j3) {
        long j4;
        X1.g.e(fVar, "sink");
        while (j3 >= 0) {
            if (!(!this.f5348e)) {
                throw new IllegalStateException("closed".toString());
            }
            h hVar = this.f5346b;
            Inflater inflater = this.c;
            if (j3 != 0) {
                try {
                    q G2 = fVar.G(1);
                    int min = (int) Math.min(j3, 8192 - G2.c);
                    if (inflater.needsInput() && !hVar.v()) {
                        q qVar = hVar.t().f5337b;
                        X1.g.b(qVar);
                        int i3 = qVar.c;
                        int i4 = qVar.f5356b;
                        int i5 = i3 - i4;
                        this.f5347d = i5;
                        inflater.setInput(qVar.f5355a, i4, i5);
                    }
                    int inflate = inflater.inflate(G2.f5355a, G2.c, min);
                    int i6 = this.f5347d;
                    if (i6 != 0) {
                        int remaining = i6 - inflater.getRemaining();
                        this.f5347d -= remaining;
                        hVar.u(remaining);
                    }
                    if (inflate > 0) {
                        G2.c += inflate;
                        j4 = inflate;
                        fVar.c += j4;
                        if (j4 <= 0) {
                            return j4;
                        }
                        if (inflater.finished() || inflater.needsDictionary()) {
                            return -1L;
                        }
                        if (hVar.v()) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else if (G2.f5356b == G2.c) {
                        fVar.f5337b = G2.a();
                        r.a(G2);
                    }
                } catch (DataFormatException e3) {
                    throw new IOException(e3);
                }
            }
            j4 = 0;
            if (j4 <= 0) {
            }
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }
}
