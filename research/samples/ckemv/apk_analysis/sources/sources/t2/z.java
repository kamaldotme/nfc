package t2;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class z implements Closeable {
    public static final Logger h = Logger.getLogger(f.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final z2.g f5010b;
    public final boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final z2.f f5011d;

    /* renamed from: e, reason: collision with root package name */
    public int f5012e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5013f;
    public final C0389d g;

    /* JADX WARN: Type inference failed for: r1v1, types: [z2.f, java.lang.Object] */
    public z(z2.g gVar, boolean z3) {
        this.f5010b = gVar;
        this.c = z3;
        ?? obj = new Object();
        this.f5011d = obj;
        this.f5012e = 16384;
        this.g = new C0389d(obj);
    }

    public final synchronized void A(int i3, int i4, boolean z3) {
        if (this.f5013f) {
            throw new IOException("closed");
        }
        i(0, 8, 6, z3 ? 1 : 0);
        this.f5010b.e(i3);
        this.f5010b.e(i4);
        this.f5010b.flush();
    }

    public final synchronized void D(int i3, int i4) {
        X.d.o("errorCode", i4);
        if (this.f5013f) {
            throw new IOException("closed");
        }
        if (q.h.a(i4) == -1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        i(i3, 4, 3, 0);
        this.f5010b.e(q.h.a(i4));
        this.f5010b.flush();
    }

    public final synchronized void G(int i3, long j3) {
        if (this.f5013f) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j3).toString());
        }
        i(i3, 4, 8, 0);
        this.f5010b.e((int) j3);
        this.f5010b.flush();
    }

    public final void I(int i3, long j3) {
        while (j3 > 0) {
            long min = Math.min(this.f5012e, j3);
            j3 -= min;
            i(i3, (int) min, 9, j3 == 0 ? 4 : 0);
            this.f5010b.m(this.f5011d, min);
        }
    }

    public final synchronized void a(C c) {
        try {
            X1.g.e(c, "peerSettings");
            if (this.f5013f) {
                throw new IOException("closed");
            }
            int i3 = this.f5012e;
            int i4 = c.f4912a;
            if ((i4 & 32) != 0) {
                i3 = c.f4913b[5];
            }
            this.f5012e = i3;
            if (((i4 & 2) != 0 ? c.f4913b[1] : -1) != -1) {
                C0389d c0389d = this.g;
                int i5 = (i4 & 2) != 0 ? c.f4913b[1] : -1;
                c0389d.getClass();
                int min = Math.min(i5, 16384);
                int i6 = c0389d.f4929e;
                if (i6 != min) {
                    if (min < i6) {
                        c0389d.c = Math.min(c0389d.c, min);
                    }
                    c0389d.f4928d = true;
                    c0389d.f4929e = min;
                    int i7 = c0389d.f4931i;
                    if (min < i7) {
                        if (min == 0) {
                            L1.j.T(r6, null, 0, c0389d.f4930f.length);
                            c0389d.g = c0389d.f4930f.length - 1;
                            c0389d.h = 0;
                            c0389d.f4931i = 0;
                        } else {
                            c0389d.a(i7 - min);
                        }
                    }
                }
            }
            i(0, 0, 4, 1);
            this.f5010b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(boolean z3, int i3, z2.f fVar, int i4) {
        if (this.f5013f) {
            throw new IOException("closed");
        }
        i(i3, i4, 0, z3 ? 1 : 0);
        if (i4 > 0) {
            X1.g.b(fVar);
            this.f5010b.m(fVar, i4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5013f = true;
        this.f5010b.close();
    }

    public final synchronized void flush() {
        if (this.f5013f) {
            throw new IOException("closed");
        }
        this.f5010b.flush();
    }

    public final void i(int i3, int i4, int i5, int i6) {
        Level level = Level.FINE;
        Logger logger = h;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(i3, i4, i5, i6, false));
        }
        if (i4 > this.f5012e) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f5012e + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i3) != 0) {
            throw new IllegalArgumentException(X.d.f("reserved bit set: ", i3).toString());
        }
        byte[] bArr = n2.b.f4249a;
        z2.g gVar = this.f5010b;
        X1.g.e(gVar, "<this>");
        gVar.w((i4 >>> 16) & 255);
        gVar.w((i4 >>> 8) & 255);
        gVar.w(i4 & 255);
        gVar.w(i5 & 255);
        gVar.w(i6 & 255);
        gVar.e(i3 & Integer.MAX_VALUE);
    }

    public final synchronized void o(int i3, int i4, byte[] bArr) {
        try {
            X.d.o("errorCode", i4);
            X1.g.e(bArr, "debugData");
            if (this.f5013f) {
                throw new IOException("closed");
            }
            if (q.h.a(i4) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            i(0, bArr.length + 8, 7, 0);
            this.f5010b.e(i3);
            this.f5010b.e(q.h.a(i4));
            if (!(bArr.length == 0)) {
                this.f5010b.d(bArr);
            }
            this.f5010b.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}
