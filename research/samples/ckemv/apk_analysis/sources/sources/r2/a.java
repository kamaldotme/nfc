package r2;

import L1.t;
import X0.o;
import X1.g;
import a.AbstractC0059a;
import f.C0150G;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import k.C0306s;
import m2.j;
import m2.l;
import m2.m;
import m2.n;
import m2.q;
import m2.r;
import m2.s;
import q2.i;
import t2.C0386a;
import z2.k;
import z2.p;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4653a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4654b;

    public a(m2.b bVar) {
        g.e(bVar, "cookieJar");
        this.f4654b = bVar;
    }

    public static int d(r rVar, int i3) {
        String a3 = r.a("Retry-After", rVar);
        if (a3 == null) {
            return i3;
        }
        Pattern compile = Pattern.compile("\\d+");
        g.d(compile, "compile(...)");
        if (!compile.matcher(a3).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a3);
        g.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m2.m
    public final r a(f fVar) {
        s sVar;
        t tVar;
        int i3;
        q2.e eVar;
        SSLSocketFactory sSLSocketFactory;
        y2.c cVar;
        m2.d dVar;
        switch (this.f4653a) {
            case 0:
                C0306s c0306s = fVar.f4660e;
                G.e e3 = c0306s.e();
                o oVar = (o) c0306s.f3773e;
                if (oVar != null) {
                    n nVar = (n) oVar.c;
                    if (nVar != null) {
                        e3.i("Content-Type", nVar.f4069a);
                    }
                    long j3 = oVar.f1058a;
                    if (j3 != -1) {
                        e3.i("Content-Length", String.valueOf(j3));
                        ((C0150G) e3.f183d).q("Transfer-Encoding");
                    } else {
                        e3.i("Transfer-Encoding", "chunked");
                        ((C0150G) e3.f183d).q("Content-Length");
                    }
                }
                j jVar = (j) c0306s.f3772d;
                String a3 = jVar.a("Host");
                boolean z3 = false;
                l lVar = (l) c0306s.f3771b;
                if (a3 == null) {
                    e3.i("Host", n2.b.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    e3.i("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    e3.i("Accept-Encoding", "gzip");
                    z3 = true;
                }
                m2.b bVar = (m2.b) this.f4654b;
                bVar.getClass();
                g.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    e3.i("User-Agent", "okhttp/4.12.0");
                }
                r b3 = fVar.b(e3.a());
                j jVar2 = b3.g;
                e.b(bVar, lVar, jVar2);
                q b4 = b3.b();
                b4.f4100a = c0306s;
                if (z3 && d2.l.Q("gzip", r.a("Content-Encoding", b3)) && e.a(b3) && (sVar = b3.h) != null) {
                    k kVar = new k(sVar.b());
                    C0150G c = jVar2.c();
                    c.q("Content-Encoding");
                    c.q("Content-Length");
                    b4.f4104f = c.l().c();
                    r.a("Content-Type", b3);
                    b4.g = new s(-1L, new p(kVar), 1);
                }
                return b4.a();
            default:
                C0306s c0306s2 = fVar.f4660e;
                i iVar = fVar.f4657a;
                boolean z4 = true;
                t tVar2 = t.f622b;
                r rVar = null;
                int i4 = 0;
                C0306s c0306s3 = c0306s2;
                boolean z5 = true;
                while (true) {
                    iVar.getClass();
                    g.e(c0306s3, "request");
                    if (iVar.f4458m != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    synchronized (iVar) {
                        try {
                            if (!(iVar.f4460o ^ z4)) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                            }
                            if (!(iVar.f4459n ^ z4)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z5) {
                        q2.m mVar = iVar.f4452e;
                        l lVar2 = (l) c0306s3.f3771b;
                        boolean z6 = lVar2.f4067i;
                        m2.o oVar2 = iVar.f4450b;
                        if (z6) {
                            SSLSocketFactory sSLSocketFactory2 = oVar2.f4084p;
                            if (sSLSocketFactory2 == null) {
                                throw new IllegalStateException("CLEARTEXT-only client");
                            }
                            y2.c cVar2 = oVar2.f4088t;
                            dVar = oVar2.f4089u;
                            sSLSocketFactory = sSLSocketFactory2;
                            cVar = cVar2;
                        } else {
                            sSLSocketFactory = null;
                            cVar = null;
                            dVar = null;
                        }
                        tVar = tVar2;
                        i3 = i4;
                        iVar.f4455j = new q2.f(mVar, new m2.a(lVar2.f4064d, lVar2.f4065e, oVar2.f4080l, oVar2.f4083o, sSLSocketFactory, cVar, dVar, oVar2.f4082n, oVar2.f4087s, oVar2.f4086r, oVar2.f4081m), iVar, iVar.f4453f);
                    } else {
                        tVar = tVar2;
                        i3 = i4;
                    }
                    try {
                        if (iVar.f4462q) {
                            throw new IOException("Canceled");
                        }
                        try {
                            r b5 = fVar.b(c0306s3);
                            if (rVar != null) {
                                q b6 = b5.b();
                                q b7 = rVar.b();
                                b7.g = null;
                                r a4 = b7.a();
                                if (a4.h != null) {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                                b6.f4106j = a4;
                                b5 = b6.a();
                            }
                            rVar = b5;
                            eVar = iVar.f4458m;
                            c0306s3 = b(rVar, eVar);
                        } catch (IOException e4) {
                            if (!c(e4, iVar, c0306s3, !(e4 instanceof C0386a))) {
                                Iterator it = tVar.iterator();
                                while (it.hasNext()) {
                                    v0.f.h(e4, (Exception) it.next());
                                }
                                throw e4;
                            }
                            ArrayList arrayList = new ArrayList(tVar.size() + 1);
                            arrayList.addAll(tVar);
                            arrayList.add(e4);
                            iVar.d(true);
                            tVar2 = arrayList;
                            z4 = true;
                            i4 = i3;
                            z5 = false;
                        } catch (q2.n e5) {
                            t tVar3 = tVar;
                            if (!c(e5.c, iVar, c0306s3, false)) {
                                IOException iOException = e5.f4485b;
                                g.e(iOException, "<this>");
                                Iterator it2 = tVar3.iterator();
                                while (it2.hasNext()) {
                                    v0.f.h(iOException, (Exception) it2.next());
                                }
                                throw iOException;
                            }
                            IOException iOException2 = e5.f4485b;
                            ArrayList arrayList2 = new ArrayList(tVar3.size() + 1);
                            arrayList2.addAll(tVar3);
                            arrayList2.add(iOException2);
                            iVar.d(true);
                            tVar2 = arrayList2;
                            z5 = false;
                            z4 = true;
                            i4 = i3;
                        }
                        if (c0306s3 == null) {
                            if (eVar != null && eVar.f4439e) {
                                if (!(!iVar.f4457l)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                iVar.f4457l = true;
                                iVar.g.i();
                            }
                            iVar.d(false);
                            return rVar;
                        }
                        s sVar2 = rVar.h;
                        if (sVar2 != null) {
                            n2.b.c(sVar2);
                        }
                        i4 = i3 + 1;
                        if (i4 > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i4);
                        }
                        iVar.d(true);
                        tVar2 = tVar;
                        z5 = true;
                        z4 = true;
                    } catch (Throwable th2) {
                        iVar.d(true);
                        throw th2;
                    }
                }
                break;
        }
    }

    public C0306s b(r rVar, q2.e eVar) {
        String a3;
        m2.k kVar;
        q2.l lVar;
        m2.t tVar = (eVar == null || (lVar = eVar.g) == null) ? null : lVar.f4468b;
        int i3 = rVar.f4112e;
        String str = (String) rVar.f4110b.c;
        if (i3 != 307 && i3 != 308) {
            if (i3 == 401) {
                ((m2.o) this.f4654b).h.getClass();
                return null;
            }
            if (i3 == 421) {
                if (eVar == null || !(!g.a(eVar.c.f4442b.h.f4064d, eVar.g.f4468b.f4122a.h.f4064d))) {
                    return null;
                }
                q2.l lVar2 = eVar.g;
                synchronized (lVar2) {
                    lVar2.f4474k = true;
                }
                return rVar.f4110b;
            }
            if (i3 == 503) {
                r rVar2 = rVar.f4116k;
                if ((rVar2 == null || rVar2.f4112e != 503) && d(rVar, Integer.MAX_VALUE) == 0) {
                    return rVar.f4110b;
                }
                return null;
            }
            if (i3 == 407) {
                g.b(tVar);
                if (tVar.f4123b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((m2.o) this.f4654b).f4082n.getClass();
                return null;
            }
            if (i3 == 408) {
                if (!((m2.o) this.f4654b).g) {
                    return null;
                }
                r rVar3 = rVar.f4116k;
                if ((rVar3 == null || rVar3.f4112e != 408) && d(rVar, 0) <= 0) {
                    return rVar.f4110b;
                }
                return null;
            }
            switch (i3) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        m2.o oVar = (m2.o) this.f4654b;
        if (!oVar.f4077i || (a3 = r.a("Location", rVar)) == null) {
            return null;
        }
        C0306s c0306s = rVar.f4110b;
        l lVar3 = (l) c0306s.f3771b;
        lVar3.getClass();
        try {
            kVar = new m2.k();
            kVar.d(lVar3, a3);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a4 = kVar != null ? kVar.a() : null;
        if (a4 == null) {
            return null;
        }
        if (!g.a(a4.f4062a, ((l) c0306s.f3771b).f4062a) && !oVar.f4078j) {
            return null;
        }
        G.e e3 = c0306s.e();
        if (AbstractC0059a.H(str)) {
            boolean a5 = g.a(str, "PROPFIND");
            int i4 = rVar.f4112e;
            boolean z3 = a5 || i4 == 308 || i4 == 307;
            if (!(true ^ g.a(str, "PROPFIND")) || i4 == 308 || i4 == 307) {
                e3.j(str, z3 ? (o) c0306s.f3773e : null);
            } else {
                e3.j("GET", null);
            }
            if (!z3) {
                ((C0150G) e3.f183d).q("Transfer-Encoding");
                ((C0150G) e3.f183d).q("Content-Length");
                ((C0150G) e3.f183d).q("Content-Type");
            }
        }
        if (!n2.b.a((l) c0306s.f3771b, a4)) {
            ((C0150G) e3.f183d).q("Authorization");
        }
        e3.c = a4;
        return e3.a();
    }

    public boolean c(IOException iOException, i iVar, C0306s c0306s, boolean z3) {
        m2.k kVar;
        q2.l lVar;
        if (!((m2.o) this.f4654b).g) {
            return false;
        }
        if ((z3 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z3)) {
            return false;
        }
        q2.f fVar = iVar.f4455j;
        g.b(fVar);
        int i3 = fVar.g;
        if (i3 != 0 || fVar.h != 0 || fVar.f4446i != 0) {
            if (fVar.f4447j == null) {
                m2.t tVar = null;
                if (i3 <= 1 && fVar.h <= 1 && fVar.f4446i <= 0 && (lVar = fVar.c.f4456k) != null) {
                    synchronized (lVar) {
                        if (lVar.f4475l == 0) {
                            if (n2.b.a(lVar.f4468b.f4122a.h, fVar.f4442b.h)) {
                                tVar = lVar.f4468b;
                            }
                        }
                    }
                }
                if (tVar != null) {
                    fVar.f4447j = tVar;
                } else {
                    F0.e eVar = fVar.f4444e;
                    if ((eVar == null || !eVar.b()) && (kVar = fVar.f4445f) != null && !kVar.c()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public a(m2.o oVar) {
        g.e(oVar, "client");
        this.f4654b = oVar;
    }
}
