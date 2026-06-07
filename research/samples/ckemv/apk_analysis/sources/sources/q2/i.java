package q2;

import L1.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k.C0306s;
import m2.o;
import m2.r;

/* loaded from: classes.dex */
public final class i implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final o f4450b;
    public final C0306s c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4451d;

    /* renamed from: e, reason: collision with root package name */
    public final m f4452e;

    /* renamed from: f, reason: collision with root package name */
    public final m2.b f4453f;
    public final h g;
    public final AtomicBoolean h;

    /* renamed from: i, reason: collision with root package name */
    public Object f4454i;

    /* renamed from: j, reason: collision with root package name */
    public f f4455j;

    /* renamed from: k, reason: collision with root package name */
    public l f4456k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4457l;

    /* renamed from: m, reason: collision with root package name */
    public e f4458m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4459n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4460o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4461p;

    /* renamed from: q, reason: collision with root package name */
    public volatile boolean f4462q;

    /* renamed from: r, reason: collision with root package name */
    public volatile e f4463r;

    /* renamed from: s, reason: collision with root package name */
    public volatile l f4464s;

    public i(o oVar, C0306s c0306s, boolean z3) {
        X1.g.e(oVar, "client");
        X1.g.e(c0306s, "originalRequest");
        this.f4450b = oVar;
        this.c = c0306s;
        this.f4451d = z3;
        this.f4452e = (m) oVar.c.f2846b;
        m2.b bVar = (m2.b) oVar.f4076f.f76b;
        X1.g.e(bVar, "$this_asFactory");
        this.f4453f = bVar;
        h hVar = new h(this);
        hVar.g(0, TimeUnit.MILLISECONDS);
        this.g = hVar;
        this.h = new AtomicBoolean();
        this.f4461p = true;
    }

    public final void a(l lVar) {
        byte[] bArr = n2.b.f4249a;
        if (this.f4456k != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f4456k = lVar;
        lVar.f4479p.add(new g(this, this.f4454i));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket h;
        byte[] bArr = n2.b.f4249a;
        l lVar = this.f4456k;
        if (lVar != null) {
            synchronized (lVar) {
                h = h();
            }
            if (this.f4456k == null) {
                if (h != null) {
                    n2.b.d(h);
                }
                this.f4453f.getClass();
            } else if (h != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.f4457l && this.g.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            m2.b bVar = this.f4453f;
            X1.g.b(interruptedIOException);
            bVar.getClass();
        } else {
            this.f4453f.getClass();
        }
        return interruptedIOException;
    }

    public final r c() {
        if (!this.h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.g.h();
        u2.n nVar = u2.n.f5043a;
        this.f4454i = u2.n.f5043a.g();
        this.f4453f.getClass();
        try {
            v0.i iVar = this.f4450b.f4073b;
            synchronized (iVar) {
                ((ArrayDeque) iVar.f5078e).add(this);
            }
            return e();
        } finally {
            this.f4450b.f4073b.g(this);
        }
    }

    public final Object clone() {
        return new i(this.f4450b, this.c, this.f4451d);
    }

    public final void d(boolean z3) {
        e eVar;
        synchronized (this) {
            if (!this.f4461p) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z3 && (eVar = this.f4463r) != null) {
            eVar.f4438d.cancel();
            eVar.f4436a.f(eVar, true, true, null);
        }
        this.f4458m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r e() {
        ArrayList arrayList = new ArrayList();
        q.T(arrayList, this.f4450b.f4074d);
        arrayList.add(new r2.a(this.f4450b));
        arrayList.add(new r2.a(this.f4450b.f4079k));
        this.f4450b.getClass();
        arrayList.add(new Object());
        arrayList.add(a.f4424a);
        if (!this.f4451d) {
            q.T(arrayList, this.f4450b.f4075e);
        }
        arrayList.add(new r2.b(this.f4451d));
        C0306s c0306s = this.c;
        o oVar = this.f4450b;
        boolean z3 = false;
        try {
            r b3 = new r2.f(this, arrayList, 0, null, c0306s, oVar.f4091w, oVar.f4092x, oVar.f4093y).b(this.c);
            if (this.f4462q) {
                n2.b.c(b3);
                throw new IOException("Canceled");
            }
            g(null);
            return b3;
        } catch (IOException e3) {
            try {
                IOException g = g(e3);
                X1.g.c(g, "null cannot be cast to non-null type kotlin.Throwable");
                throw g;
            } catch (Throwable th) {
                th = th;
                z3 = true;
                if (!z3) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z3) {
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:12:0x0022, B:14:0x0026, B:15:0x0028, B:17:0x002c, B:21:0x0035, B:23:0x0039, B:9:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IOException f(e eVar, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        X1.g.e(eVar, "exchange");
        if (!X1.g.a(eVar, this.f4463r)) {
            return iOException;
        }
        synchronized (this) {
            z5 = false;
            if (z3) {
                try {
                    if (!this.f4459n) {
                    }
                    if (z3) {
                        this.f4459n = false;
                    }
                    if (z4) {
                        this.f4460o = false;
                    }
                    z7 = this.f4459n;
                    boolean z8 = z7 && !this.f4460o;
                    if (!z7 && !this.f4460o) {
                        if (!this.f4461p) {
                            z5 = true;
                        }
                    }
                    z6 = z5;
                    z5 = z8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z4 || !this.f4460o) {
                z6 = false;
            }
            if (z3) {
            }
            if (z4) {
            }
            z7 = this.f4459n;
            if (z7) {
            }
            if (!z7) {
                if (!this.f4461p) {
                }
            }
            z6 = z5;
            z5 = z8;
        }
        if (z5) {
            this.f4463r = null;
            l lVar = this.f4456k;
            if (lVar != null) {
                synchronized (lVar) {
                    lVar.f4476m++;
                }
            }
        }
        return z6 ? b(iOException) : iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z3;
        synchronized (this) {
            z3 = false;
            if (this.f4461p) {
                this.f4461p = false;
                if (!this.f4459n) {
                    if (!this.f4460o) {
                        z3 = true;
                    }
                }
            }
        }
        return z3 ? b(iOException) : iOException;
    }

    public final Socket h() {
        l lVar = this.f4456k;
        X1.g.b(lVar);
        byte[] bArr = n2.b.f4249a;
        ArrayList arrayList = lVar.f4479p;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (X1.g.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i3);
        this.f4456k = null;
        if (arrayList.isEmpty()) {
            lVar.f4480q = System.nanoTime();
            m mVar = this.f4452e;
            mVar.getClass();
            byte[] bArr2 = n2.b.f4249a;
            boolean z3 = lVar.f4473j;
            p2.c cVar = mVar.c;
            if (z3 || mVar.f4481a == 0) {
                lVar.f4473j = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = mVar.f4484e;
                concurrentLinkedQueue.remove(lVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = lVar.f4469d;
                X1.g.b(socket);
                return socket;
            }
            cVar.c(mVar.f4483d, 0L);
        }
        return null;
    }
}
