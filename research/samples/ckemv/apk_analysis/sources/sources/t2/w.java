package t2;

import java.io.IOException;

/* loaded from: classes.dex */
public final class w implements z2.v {

    /* renamed from: b, reason: collision with root package name */
    public final long f4994b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public final z2.f f4995d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final z2.f f4996e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public boolean f4997f;
    public final /* synthetic */ y g;

    /* JADX WARN: Type inference failed for: r1v1, types: [z2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [z2.f, java.lang.Object] */
    public w(y yVar, long j3, boolean z3) {
        this.g = yVar;
        this.f4994b = j3;
        this.c = z3;
    }

    public final void a(long j3) {
        byte[] bArr = n2.b.f4249a;
        this.g.f5000b.D(j3);
    }

    @Override // z2.v
    public final z2.x c() {
        return this.g.f5006k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j3;
        y yVar = this.g;
        synchronized (yVar) {
            this.f4997f = true;
            z2.f fVar = this.f4996e;
            j3 = fVar.c;
            fVar.u(j3);
            yVar.notifyAll();
        }
        if (j3 > 0) {
            a(j3);
        }
        this.g.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[LOOP:0: B:3:0x0010->B:41:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d A[SYNTHETIC] */
    @Override // z2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long z(z2.f fVar, long j3) {
        int i3;
        Throwable th;
        boolean z3;
        long j4;
        X1.g.e(fVar, "sink");
        long j5 = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        while (true) {
            y yVar = this.g;
            synchronized (yVar) {
                yVar.f5006k.h();
                try {
                    synchronized (yVar) {
                        i3 = yVar.f5008m;
                    }
                    if (z3) {
                        if (j4 != -1) {
                            return j4;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j5 = 0;
                } catch (Throwable th2) {
                    yVar.f5006k.l();
                    throw th2;
                }
            }
            if (i3 == 0 || this.c) {
                th = null;
            } else {
                th = yVar.f5009n;
                if (th == null) {
                    synchronized (yVar) {
                        int i4 = yVar.f5008m;
                        X.d.l(i4);
                        th = new D(i4);
                    }
                }
            }
            if (this.f4997f) {
                throw new IOException("stream closed");
            }
            z2.f fVar2 = this.f4996e;
            long j6 = fVar2.c;
            z3 = false;
            if (j6 > j5) {
                j4 = fVar2.z(fVar, Math.min(j3, j6));
                long j7 = yVar.c + j4;
                yVar.c = j7;
                long j8 = j7 - yVar.f5001d;
                if (th == null && j8 >= yVar.f5000b.f4970s.a() / 2) {
                    yVar.f5000b.J(yVar.f4999a, j8);
                    yVar.f5001d = yVar.c;
                }
            } else {
                if (!this.c && th == null) {
                    yVar.k();
                    z3 = true;
                }
                j4 = -1;
            }
            yVar.f5006k.l();
            if (z3) {
            }
        }
    }
}
