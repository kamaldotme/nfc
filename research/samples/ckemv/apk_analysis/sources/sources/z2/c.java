package z2;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5327b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5328d;

    public /* synthetic */ c(Object obj, int i3, Object obj2) {
        this.f5327b = i3;
        this.c = obj;
        this.f5328d = obj2;
    }

    @Override // z2.t
    public final x c() {
        switch (this.f5327b) {
            case 0:
                return (e) this.c;
            default:
                return (x) this.f5328d;
        }
    }

    @Override // z2.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5327b) {
            case 0:
                t tVar = (t) this.f5328d;
                e eVar = (e) this.c;
                eVar.h();
                try {
                    tVar.close();
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
                ((OutputStream) this.c).close();
                return;
        }
    }

    @Override // z2.t, java.io.Flushable
    public final void flush() {
        switch (this.f5327b) {
            case 0:
                t tVar = (t) this.f5328d;
                e eVar = (e) this.c;
                eVar.h();
                try {
                    tVar.flush();
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
                ((OutputStream) this.c).flush();
                return;
        }
    }

    @Override // z2.t
    public final void m(f fVar, long j3) {
        switch (this.f5327b) {
            case 0:
                X1.g.e(fVar, "source");
                v0.f.m(fVar.c, 0L, j3);
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    q qVar = fVar.f5337b;
                    X1.g.b(qVar);
                    while (true) {
                        if (j4 < 65536) {
                            j4 += qVar.c - qVar.f5356b;
                            if (j4 >= j3) {
                                j4 = j3;
                            } else {
                                qVar = qVar.f5359f;
                                X1.g.b(qVar);
                            }
                        }
                    }
                    t tVar = (t) this.f5328d;
                    e eVar = (e) this.c;
                    eVar.h();
                    try {
                        tVar.m(fVar, j4);
                        if (eVar.i()) {
                            throw eVar.j(null);
                        }
                        j3 -= j4;
                    } catch (IOException e3) {
                        if (!eVar.i()) {
                            throw e3;
                        }
                        throw eVar.j(e3);
                    } finally {
                        eVar.i();
                    }
                }
            default:
                X1.g.e(fVar, "source");
                v0.f.m(fVar.c, 0L, j3);
                while (j3 > 0) {
                    ((x) this.f5328d).f();
                    q qVar2 = fVar.f5337b;
                    X1.g.b(qVar2);
                    int min = (int) Math.min(j3, qVar2.c - qVar2.f5356b);
                    ((OutputStream) this.c).write(qVar2.f5355a, qVar2.f5356b, min);
                    int i3 = qVar2.f5356b + min;
                    qVar2.f5356b = i3;
                    long j5 = min;
                    j3 -= j5;
                    fVar.c -= j5;
                    if (i3 == qVar2.c) {
                        fVar.f5337b = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f5327b) {
            case 0:
                return "AsyncTimeout.sink(" + ((t) this.f5328d) + ')';
            default:
                return "sink(" + ((OutputStream) this.c) + ')';
        }
    }
}
