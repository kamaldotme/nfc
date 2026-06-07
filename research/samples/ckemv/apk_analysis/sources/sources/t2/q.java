package t2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: C, reason: collision with root package name */
    public static final C f4953C;

    /* renamed from: A, reason: collision with root package name */
    public final l f4954A;

    /* renamed from: B, reason: collision with root package name */
    public final LinkedHashSet f4955B;
    public final h c;

    /* renamed from: e, reason: collision with root package name */
    public final String f4958e;

    /* renamed from: f, reason: collision with root package name */
    public int f4959f;
    public int g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final p2.d f4960i;

    /* renamed from: j, reason: collision with root package name */
    public final p2.c f4961j;

    /* renamed from: k, reason: collision with root package name */
    public final p2.c f4962k;

    /* renamed from: l, reason: collision with root package name */
    public final p2.c f4963l;

    /* renamed from: m, reason: collision with root package name */
    public final B f4964m;

    /* renamed from: n, reason: collision with root package name */
    public long f4965n;

    /* renamed from: o, reason: collision with root package name */
    public long f4966o;

    /* renamed from: p, reason: collision with root package name */
    public long f4967p;

    /* renamed from: q, reason: collision with root package name */
    public long f4968q;

    /* renamed from: r, reason: collision with root package name */
    public long f4969r;

    /* renamed from: s, reason: collision with root package name */
    public final C f4970s;

    /* renamed from: t, reason: collision with root package name */
    public C f4971t;

    /* renamed from: u, reason: collision with root package name */
    public long f4972u;

    /* renamed from: v, reason: collision with root package name */
    public long f4973v;

    /* renamed from: w, reason: collision with root package name */
    public long f4974w;

    /* renamed from: x, reason: collision with root package name */
    public long f4975x;

    /* renamed from: y, reason: collision with root package name */
    public final Socket f4976y;

    /* renamed from: z, reason: collision with root package name */
    public final z f4977z;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4956b = true;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4957d = new LinkedHashMap();

    static {
        C c = new C();
        c.c(7, 65535);
        c.c(5, 16384);
        f4953C = c;
    }

    public q(s2.g gVar) {
        this.c = (h) gVar.g;
        String str = (String) gVar.f4724f;
        if (str == null) {
            X1.g.h("connectionName");
            throw null;
        }
        this.f4958e = str;
        this.g = 3;
        p2.d dVar = (p2.d) gVar.f4722d;
        this.f4960i = dVar;
        p2.c f3 = dVar.f();
        this.f4961j = f3;
        this.f4962k = dVar.f();
        this.f4963l = dVar.f();
        this.f4964m = B.f4911a;
        C c = new C();
        c.c(7, 16777216);
        this.f4970s = c;
        this.f4971t = f4953C;
        this.f4975x = r3.a();
        Socket socket = (Socket) gVar.f4723e;
        if (socket == null) {
            X1.g.h("socket");
            throw null;
        }
        this.f4976y = socket;
        z2.g gVar2 = gVar.f4721b;
        if (gVar2 == null) {
            X1.g.h("sink");
            throw null;
        }
        this.f4977z = new z(gVar2, true);
        z2.h hVar = gVar.f4720a;
        if (hVar == null) {
            X1.g.h("source");
            throw null;
        }
        this.f4954A = new l(this, new u(hVar, true));
        this.f4955B = new LinkedHashSet();
        int i3 = gVar.c;
        if (i3 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i3);
            f3.c(new o(str.concat(" ping"), this, nanos), nanos);
        }
    }

    public final void A(int i3) {
        X.d.o("statusCode", i3);
        synchronized (this.f4977z) {
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                this.f4977z.o(this.f4959f, i3, n2.b.f4249a);
            }
        }
    }

    public final synchronized void D(long j3) {
        long j4 = this.f4972u + j3;
        this.f4972u = j4;
        long j5 = j4 - this.f4973v;
        if (j5 >= this.f4970s.a() / 2) {
            J(0, j5);
            this.f4973v += j5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f4977z.f5012e);
        r6 = r2;
        r8.f4974w += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(int i3, boolean z3, z2.f fVar, long j3) {
        int min;
        long j4;
        if (j3 == 0) {
            this.f4977z.b(z3, i3, fVar, 0);
            return;
        }
        loop0: while (j3 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j5 = this.f4974w;
                            long j6 = this.f4975x;
                            if (j5 < j6) {
                                break;
                            } else if (!this.f4957d.containsKey(Integer.valueOf(i3))) {
                                break loop0;
                            } else {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j3 -= j4;
            this.f4977z.b(z3 && j3 == 0, i3, fVar, min);
        }
    }

    public final void I(int i3, int i4) {
        X.d.o("errorCode", i4);
        this.f4961j.c(new j(this.f4958e + '[' + i3 + "] writeSynReset", this, i3, i4, 2), 0L);
    }

    public final void J(int i3, long j3) {
        this.f4961j.c(new p(this.f4958e + '[' + i3 + "] windowUpdate", this, i3, j3), 0L);
    }

    public final void a(int i3, int i4, IOException iOException) {
        int i5;
        Object[] objArr;
        X.d.o("connectionCode", i3);
        X.d.o("streamCode", i4);
        byte[] bArr = n2.b.f4249a;
        try {
            A(i3);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f4957d.isEmpty()) {
                objArr = this.f4957d.values().toArray(new y[0]);
                this.f4957d.clear();
            } else {
                objArr = null;
            }
        }
        y[] yVarArr = (y[]) objArr;
        if (yVarArr != null) {
            for (y yVar : yVarArr) {
                try {
                    yVar.c(i4, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f4977z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f4976y.close();
        } catch (IOException unused4) {
        }
        this.f4961j.e();
        this.f4962k.e();
        this.f4963l.e();
    }

    public final void b(IOException iOException) {
        a(2, 2, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(1, 9, null);
    }

    public final void flush() {
        this.f4977z.flush();
    }

    public final synchronized y i(int i3) {
        return (y) this.f4957d.get(Integer.valueOf(i3));
    }

    public final synchronized y o(int i3) {
        y yVar;
        yVar = (y) this.f4957d.remove(Integer.valueOf(i3));
        notifyAll();
        return yVar;
    }
}
