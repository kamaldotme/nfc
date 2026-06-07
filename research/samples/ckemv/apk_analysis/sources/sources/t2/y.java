package t2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f4999a;

    /* renamed from: b, reason: collision with root package name */
    public final q f5000b;
    public long c;

    /* renamed from: d, reason: collision with root package name */
    public long f5001d;

    /* renamed from: e, reason: collision with root package name */
    public long f5002e;

    /* renamed from: f, reason: collision with root package name */
    public long f5003f;
    public final ArrayDeque g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final w f5004i;

    /* renamed from: j, reason: collision with root package name */
    public final v f5005j;

    /* renamed from: k, reason: collision with root package name */
    public final x f5006k;

    /* renamed from: l, reason: collision with root package name */
    public final x f5007l;

    /* renamed from: m, reason: collision with root package name */
    public int f5008m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f5009n;

    public y(int i3, q qVar, boolean z3, boolean z4, m2.j jVar) {
        this.f4999a = i3;
        this.f5000b = qVar;
        this.f5003f = qVar.f4971t.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.f5004i = new w(this, qVar.f4970s.a(), z4);
        this.f5005j = new v(this, z3);
        this.f5006k = new x(this);
        this.f5007l = new x(this);
        if (jVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!g())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(jVar);
        }
    }

    public final void a() {
        boolean z3;
        boolean h;
        byte[] bArr = n2.b.f4249a;
        synchronized (this) {
            try {
                w wVar = this.f5004i;
                if (!wVar.c && wVar.f4997f) {
                    v vVar = this.f5005j;
                    if (vVar.f4991b || vVar.f4992d) {
                        z3 = true;
                        h = h();
                    }
                }
                z3 = false;
                h = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(9, null);
        } else {
            if (h) {
                return;
            }
            this.f5000b.o(this.f4999a);
        }
    }

    public final void b() {
        v vVar = this.f5005j;
        if (vVar.f4992d) {
            throw new IOException("stream closed");
        }
        if (vVar.f4991b) {
            throw new IOException("stream finished");
        }
        if (this.f5008m != 0) {
            IOException iOException = this.f5009n;
            if (iOException != null) {
                throw iOException;
            }
            int i3 = this.f5008m;
            X.d.l(i3);
            throw new D(i3);
        }
    }

    public final void c(int i3, IOException iOException) {
        X.d.o("rstStatusCode", i3);
        if (d(i3, iOException)) {
            q qVar = this.f5000b;
            qVar.getClass();
            X.d.o("statusCode", i3);
            qVar.f4977z.D(this.f4999a, i3);
        }
    }

    public final boolean d(int i3, IOException iOException) {
        byte[] bArr = n2.b.f4249a;
        synchronized (this) {
            if (this.f5008m != 0) {
                return false;
            }
            this.f5008m = i3;
            this.f5009n = iOException;
            notifyAll();
            if (this.f5004i.c) {
                if (this.f5005j.f4991b) {
                    return false;
                }
            }
            this.f5000b.o(this.f4999a);
            return true;
        }
    }

    public final void e(int i3) {
        X.d.o("errorCode", i3);
        if (d(i3, null)) {
            this.f5000b.I(this.f4999a, i3);
        }
    }

    public final v f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f5005j;
    }

    public final boolean g() {
        return this.f5000b.f4956b == ((this.f4999a & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.f5008m != 0) {
            return false;
        }
        w wVar = this.f5004i;
        if (wVar.c || wVar.f4997f) {
            v vVar = this.f5005j;
            if (vVar.f4991b || vVar.f4992d) {
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(m2.j jVar, boolean z3) {
        boolean h;
        X1.g.e(jVar, "headers");
        byte[] bArr = n2.b.f4249a;
        synchronized (this) {
            try {
                if (this.h && z3) {
                    this.f5004i.getClass();
                    if (z3) {
                        this.f5004i.c = true;
                    }
                    h = h();
                    notifyAll();
                }
                this.h = true;
                this.g.add(jVar);
                if (z3) {
                }
                h = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h) {
            return;
        }
        this.f5000b.o(this.f4999a);
    }

    public final synchronized void j(int i3) {
        X.d.o("errorCode", i3);
        if (this.f5008m == 0) {
            this.f5008m = i3;
            notifyAll();
        }
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
