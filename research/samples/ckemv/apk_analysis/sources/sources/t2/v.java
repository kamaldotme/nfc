package t2;

/* loaded from: classes.dex */
public final class v implements z2.t {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4991b;
    public final z2.f c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f4992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f4993e;

    /* JADX WARN: Type inference failed for: r1v1, types: [z2.f, java.lang.Object] */
    public v(y yVar, boolean z3) {
        this.f4993e = yVar;
        this.f4991b = z3;
    }

    public final void a(boolean z3) {
        long min;
        boolean z4;
        y yVar = this.f4993e;
        synchronized (yVar) {
            yVar.f5007l.h();
            while (yVar.f5002e >= yVar.f5003f && !this.f4991b && !this.f4992d) {
                try {
                    synchronized (yVar) {
                        int i3 = yVar.f5008m;
                        if (i3 != 0) {
                            break;
                        } else {
                            yVar.k();
                        }
                    }
                } catch (Throwable th) {
                    yVar.f5007l.l();
                    throw th;
                }
            }
            yVar.f5007l.l();
            yVar.b();
            min = Math.min(yVar.f5003f - yVar.f5002e, this.c.c);
            yVar.f5002e += min;
            z4 = z3 && min == this.c.c;
        }
        this.f4993e.f5007l.h();
        try {
            y yVar2 = this.f4993e;
            yVar2.f5000b.G(yVar2.f4999a, z4, this.c, min);
        } finally {
            this.f4993e.f5007l.l();
        }
    }

    @Override // z2.t
    public final z2.x c() {
        return this.f4993e.f5007l;
    }

    @Override // z2.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z3;
        y yVar = this.f4993e;
        byte[] bArr = n2.b.f4249a;
        synchronized (yVar) {
            if (this.f4992d) {
                return;
            }
            synchronized (yVar) {
                z3 = yVar.f5008m == 0;
            }
            y yVar2 = this.f4993e;
            if (!yVar2.f5005j.f4991b) {
                if (this.c.c > 0) {
                    while (this.c.c > 0) {
                        a(true);
                    }
                } else if (z3) {
                    yVar2.f5000b.G(yVar2.f4999a, true, null, 0L);
                }
            }
            synchronized (this.f4993e) {
                this.f4992d = true;
            }
            this.f4993e.f5000b.flush();
            this.f4993e.a();
        }
    }

    @Override // z2.t, java.io.Flushable
    public final void flush() {
        y yVar = this.f4993e;
        byte[] bArr = n2.b.f4249a;
        synchronized (yVar) {
            yVar.b();
        }
        while (this.c.c > 0) {
            a(false);
            this.f4993e.f5000b.flush();
        }
    }

    @Override // z2.t
    public final void m(z2.f fVar, long j3) {
        X1.g.e(fVar, "source");
        byte[] bArr = n2.b.f4249a;
        z2.f fVar2 = this.c;
        fVar2.m(fVar, j3);
        while (fVar2.c >= 16384) {
            a(false);
        }
    }
}
