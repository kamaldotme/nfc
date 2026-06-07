package q2;

import f.C0150G;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import k.C0306s;
import m0.z;
import m2.p;
import m2.r;
import m2.t;
import t2.C;
import t2.q;
import t2.y;
import z2.o;

/* loaded from: classes.dex */
public final class l extends t2.h {

    /* renamed from: b, reason: collision with root package name */
    public final t f4468b;
    public Socket c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f4469d;

    /* renamed from: e, reason: collision with root package name */
    public m2.i f4470e;

    /* renamed from: f, reason: collision with root package name */
    public p f4471f;
    public q g;
    public z2.p h;

    /* renamed from: i, reason: collision with root package name */
    public o f4472i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4473j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4474k;

    /* renamed from: l, reason: collision with root package name */
    public int f4475l;

    /* renamed from: m, reason: collision with root package name */
    public int f4476m;

    /* renamed from: n, reason: collision with root package name */
    public int f4477n;

    /* renamed from: o, reason: collision with root package name */
    public int f4478o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f4479p;

    /* renamed from: q, reason: collision with root package name */
    public long f4480q;

    public l(m mVar, t tVar) {
        X1.g.e(mVar, "connectionPool");
        X1.g.e(tVar, "route");
        this.f4468b = tVar;
        this.f4478o = 1;
        this.f4479p = new ArrayList();
        this.f4480q = Long.MAX_VALUE;
    }

    public static void d(m2.o oVar, t tVar, IOException iOException) {
        X1.g.e(oVar, "client");
        X1.g.e(tVar, "failedRoute");
        X1.g.e(iOException, "failure");
        if (tVar.f4123b.type() != Proxy.Type.DIRECT) {
            m2.a aVar = tVar.f4122a;
            aVar.g.connectFailed(aVar.h.f(), tVar.f4123b.address(), iOException);
        }
        C0150G c0150g = oVar.f4094z;
        synchronized (c0150g) {
            ((LinkedHashSet) c0150g.f2846b).add(tVar);
        }
    }

    @Override // t2.h
    public final synchronized void a(q qVar, C c) {
        X1.g.e(qVar, "connection");
        X1.g.e(c, "settings");
        this.f4478o = (c.f4912a & 16) != 0 ? c.f4913b[4] : Integer.MAX_VALUE;
    }

    @Override // t2.h
    public final void b(y yVar) {
        X1.g.e(yVar, "stream");
        yVar.c(8, null);
    }

    public final void c(int i3, int i4, int i5, boolean z3, i iVar, m2.b bVar) {
        t tVar;
        X1.g.e(iVar, "call");
        X1.g.e(bVar, "eventListener");
        if (this.f4471f != null) {
            throw new IllegalStateException("already connected".toString());
        }
        List list = this.f4468b.f4122a.f4002j;
        b bVar2 = new b(list);
        m2.a aVar = this.f4468b.f4122a;
        if (aVar.c == null) {
            if (!list.contains(m2.g.f4037f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f4468b.f4122a.h.f4064d;
            u2.n nVar = u2.n.f5043a;
            if (!u2.n.f5043a.h(str)) {
                throw new n(new UnknownServiceException(X.d.i("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f4001i.contains(p.H2_PRIOR_KNOWLEDGE)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar2 = null;
        do {
            try {
                t tVar2 = this.f4468b;
                if (tVar2.f4122a.c == null || tVar2.f4123b.type() != Proxy.Type.HTTP) {
                    try {
                        e(i3, i4, iVar, bVar);
                    } catch (IOException e3) {
                        e = e3;
                        Socket socket = this.f4469d;
                        if (socket != null) {
                            n2.b.d(socket);
                        }
                        Socket socket2 = this.c;
                        if (socket2 != null) {
                            n2.b.d(socket2);
                        }
                        this.f4469d = null;
                        this.c = null;
                        this.h = null;
                        this.f4472i = null;
                        this.f4470e = null;
                        this.f4471f = null;
                        this.g = null;
                        this.f4478o = 1;
                        t tVar3 = this.f4468b;
                        InetSocketAddress inetSocketAddress = tVar3.c;
                        Proxy proxy = tVar3.f4123b;
                        X1.g.e(inetSocketAddress, "inetSocketAddress");
                        X1.g.e(proxy, "proxy");
                        if (nVar2 == null) {
                            nVar2 = new n(e);
                        } else {
                            v0.f.h(nVar2.f4485b, e);
                            nVar2.c = e;
                        }
                        if (!z3) {
                            throw nVar2;
                        }
                        bVar2.f4427d = true;
                        if (!bVar2.c) {
                            throw nVar2;
                        }
                        if (e instanceof ProtocolException) {
                            throw nVar2;
                        }
                        if (e instanceof InterruptedIOException) {
                            throw nVar2;
                        }
                        if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw nVar2;
                        }
                        if (e instanceof SSLPeerUnverifiedException) {
                            throw nVar2;
                        }
                    }
                } else {
                    f(i3, i4, i5, iVar, bVar);
                    if (this.c == null) {
                        tVar = this.f4468b;
                        if (tVar.f4122a.c == null && tVar.f4123b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f4480q = System.nanoTime();
                        return;
                    }
                }
                g(bVar2, iVar, bVar);
                t tVar4 = this.f4468b;
                InetSocketAddress inetSocketAddress2 = tVar4.c;
                Proxy proxy2 = tVar4.f4123b;
                X1.g.e(inetSocketAddress2, "inetSocketAddress");
                X1.g.e(proxy2, "proxy");
                tVar = this.f4468b;
                if (tVar.f4122a.c == null) {
                }
                this.f4480q = System.nanoTime();
                return;
            } catch (IOException e4) {
                e = e4;
            }
        } while (e instanceof SSLException);
        throw nVar2;
    }

    public final void e(int i3, int i4, i iVar, m2.b bVar) {
        Socket createSocket;
        t tVar = this.f4468b;
        Proxy proxy = tVar.f4123b;
        m2.a aVar = tVar.f4122a;
        Proxy.Type type = proxy.type();
        int i5 = type == null ? -1 : j.f4465a[type.ordinal()];
        if (i5 == 1 || i5 == 2) {
            createSocket = aVar.f3997b.createSocket();
            X1.g.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        InetSocketAddress inetSocketAddress = this.f4468b.c;
        bVar.getClass();
        X1.g.e(iVar, "call");
        X1.g.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i4);
        try {
            u2.n nVar = u2.n.f5043a;
            u2.n.f5043a.e(createSocket, this.f4468b.c, i3);
            try {
                this.h = new z2.p(z.l0(createSocket));
                this.f4472i = new o(z.j0(createSocket));
            } catch (NullPointerException e3) {
                if (X1.g.a(e3.getMessage(), "throw with null exception")) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e4) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f4468b.c);
            connectException.initCause(e4);
            throw connectException;
        }
    }

    public final void f(int i3, int i4, int i5, i iVar, m2.b bVar) {
        G.e eVar = new G.e();
        t tVar = this.f4468b;
        m2.l lVar = tVar.f4122a.h;
        X1.g.e(lVar, "url");
        eVar.c = lVar;
        eVar.j("CONNECT", null);
        m2.a aVar = tVar.f4122a;
        eVar.i("Host", n2.b.u(aVar.h, true));
        eVar.i("Proxy-Connection", "Keep-Alive");
        eVar.i("User-Agent", "okhttp/4.12.0");
        C0306s a3 = eVar.a();
        m2.q qVar = new m2.q();
        qVar.f4100a = a3;
        qVar.f4101b = p.HTTP_1_1;
        qVar.c = 407;
        qVar.f4102d = "Preemptive Authenticate";
        qVar.g = n2.b.c;
        qVar.f4107k = -1L;
        qVar.f4108l = -1L;
        C0150G c0150g = qVar.f4104f;
        c0150g.getClass();
        u2.d.c("Proxy-Authenticate");
        u2.d.e("OkHttp-Preemptive", "Proxy-Authenticate");
        c0150g.q("Proxy-Authenticate");
        c0150g.i("Proxy-Authenticate", "OkHttp-Preemptive");
        qVar.a();
        aVar.f4000f.getClass();
        e(i3, i4, iVar, bVar);
        String str = "CONNECT " + n2.b.u((m2.l) a3.f3771b, true) + " HTTP/1.1";
        z2.p pVar = this.h;
        X1.g.b(pVar);
        o oVar = this.f4472i;
        X1.g.b(oVar);
        s2.g gVar = new s2.g(null, this, pVar, oVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f5353b.c().g(i4, timeUnit);
        oVar.f5351b.c().g(i5, timeUnit);
        gVar.j((m2.j) a3.f3772d, str);
        gVar.d();
        m2.q f3 = gVar.f(false);
        X1.g.b(f3);
        f3.f4100a = a3;
        r a4 = f3.a();
        long j3 = n2.b.j(a4);
        if (j3 != -1) {
            s2.d i6 = gVar.i(j3);
            n2.b.s(i6, Integer.MAX_VALUE, timeUnit);
            i6.close();
        }
        int i7 = a4.f4112e;
        if (i7 != 200) {
            if (i7 != 407) {
                throw new IOException(X.d.f("Unexpected response code for CONNECT: ", i7));
            }
            aVar.f4000f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.c.v() || !oVar.c.v()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i iVar, m2.b bVar2) {
        m2.a aVar = this.f4468b.f4122a;
        SSLSocketFactory sSLSocketFactory = aVar.c;
        p pVar = p.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.f4001i;
            p pVar2 = p.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(pVar2)) {
                this.f4469d = this.c;
                this.f4471f = pVar;
                return;
            } else {
                this.f4469d = this.c;
                this.f4471f = pVar2;
                l();
                return;
            }
        }
        bVar2.getClass();
        X1.g.e(iVar, "call");
        m2.a aVar2 = this.f4468b.f4122a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            X1.g.b(sSLSocketFactory2);
            Socket socket = this.c;
            m2.l lVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.f4064d, lVar.f4065e, true);
            X1.g.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                m2.g a3 = bVar.a(sSLSocket2);
                if (a3.f4039b) {
                    u2.n nVar = u2.n.f5043a;
                    u2.n.f5043a.d(sSLSocket2, aVar2.h.f4064d, aVar2.f4001i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                X1.g.d(session, "sslSocketSession");
                m2.i x2 = z.x(session);
                HostnameVerifier hostnameVerifier = aVar2.f3998d;
                X1.g.b(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.h.f4064d, session)) {
                    m2.d dVar = aVar2.f3999e;
                    X1.g.b(dVar);
                    this.f4470e = new m2.i(x2.f4051a, x2.f4052b, x2.c, new k(dVar, x2, aVar2));
                    X1.g.e(aVar2.h.f4064d, "hostname");
                    Iterator it = dVar.f4017a.iterator();
                    if (it.hasNext()) {
                        X.d.q(it.next());
                        throw null;
                    }
                    if (a3.f4039b) {
                        u2.n nVar2 = u2.n.f5043a;
                        str = u2.n.f5043a.f(sSLSocket2);
                    }
                    this.f4469d = sSLSocket2;
                    this.h = new z2.p(z.l0(sSLSocket2));
                    this.f4472i = new o(z.j0(sSLSocket2));
                    if (str != null) {
                        pVar = v0.f.v(str);
                    }
                    this.f4471f = pVar;
                    u2.n nVar3 = u2.n.f5043a;
                    u2.n.f5043a.a(sSLSocket2);
                    if (this.f4471f == p.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a4 = x2.a();
                if (!(!a4.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.f4064d + " not verified (no certificates)");
                }
                Object obj = a4.get(0);
                X1.g.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.f4064d);
                sb.append(" not verified:\n              |    certificate: ");
                m2.d dVar2 = m2.d.c;
                StringBuilder sb2 = new StringBuilder("sha256/");
                z2.i iVar2 = z2.i.f5338e;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                X1.g.d(encoded, "publicKey.encoded");
                sb2.append(d1.e.l(encoded).b("SHA-256").a());
                sb.append(sb2.toString());
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a5 = y2.c.a(x509Certificate, 7);
                List a6 = y2.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a6.size() + a5.size());
                arrayList.addAll(a5);
                arrayList.addAll(a6);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(d2.e.O(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    u2.n nVar4 = u2.n.f5043a;
                    u2.n.f5043a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    n2.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (y2.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(m2.a aVar, ArrayList arrayList) {
        m2.i iVar;
        X1.g.e(aVar, "address");
        byte[] bArr = n2.b.f4249a;
        if (this.f4479p.size() < this.f4478o && !this.f4473j) {
            t tVar = this.f4468b;
            if (!tVar.f4122a.a(aVar)) {
                return false;
            }
            m2.l lVar = aVar.h;
            String str = lVar.f4064d;
            m2.a aVar2 = tVar.f4122a;
            if (X1.g.a(str, aVar2.h.f4064d)) {
                return true;
            }
            if (this.g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t tVar2 = (t) it.next();
                    Proxy.Type type = tVar2.f4123b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && tVar.f4123b.type() == type2) {
                        if (X1.g.a(tVar.c, tVar2.c)) {
                            if (aVar.f3998d != y2.c.f5277a) {
                                return false;
                            }
                            byte[] bArr2 = n2.b.f4249a;
                            m2.l lVar2 = aVar2.h;
                            if (lVar.f4065e == lVar2.f4065e) {
                                String str2 = lVar2.f4064d;
                                String str3 = lVar.f4064d;
                                if (!X1.g.a(str3, str2)) {
                                    if (!this.f4474k && (iVar = this.f4470e) != null) {
                                        List a3 = iVar.a();
                                        if (!a3.isEmpty()) {
                                            Object obj = a3.get(0);
                                            X1.g.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    m2.d dVar = aVar.f3999e;
                                    X1.g.b(dVar);
                                    m2.i iVar2 = this.f4470e;
                                    X1.g.b(iVar2);
                                    List a4 = iVar2.a();
                                    X1.g.e(str3, "hostname");
                                    X1.g.e(a4, "peerCertificates");
                                    Iterator it2 = dVar.f4017a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    X.d.q(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z3) {
        long j3;
        byte[] bArr = n2.b.f4249a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        X1.g.b(socket);
        Socket socket2 = this.f4469d;
        X1.g.b(socket2);
        z2.p pVar = this.h;
        X1.g.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        q qVar = this.g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.h) {
                    return false;
                }
                if (qVar.f4968q < qVar.f4967p) {
                    if (nanoTime >= qVar.f4969r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j3 = nanoTime - this.f4480q;
        }
        if (j3 < 10000000000L || !z3) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z4 = !pVar.v();
                socket2.setSoTimeout(soTimeout);
                return z4;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final r2.d j(m2.o oVar, r2.f fVar) {
        Socket socket = this.f4469d;
        X1.g.b(socket);
        z2.p pVar = this.h;
        X1.g.b(pVar);
        o oVar2 = this.f4472i;
        X1.g.b(oVar2);
        q qVar = this.g;
        if (qVar != null) {
            return new t2.r(oVar, this, fVar, qVar);
        }
        int i3 = fVar.g;
        socket.setSoTimeout(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f5353b.c().g(i3, timeUnit);
        oVar2.f5351b.c().g(fVar.h, timeUnit);
        return new s2.g(oVar, this, pVar, oVar2);
    }

    public final synchronized void k() {
        this.f4473j = true;
    }

    public final void l() {
        Socket socket = this.f4469d;
        X1.g.b(socket);
        z2.p pVar = this.h;
        X1.g.b(pVar);
        o oVar = this.f4472i;
        X1.g.b(oVar);
        socket.setSoTimeout(0);
        p2.d dVar = p2.d.h;
        s2.g gVar = new s2.g(dVar);
        String str = this.f4468b.f4122a.h.f4064d;
        X1.g.e(str, "peerName");
        gVar.f4723e = socket;
        String str2 = n2.b.f4253f + ' ' + str;
        X1.g.e(str2, "<set-?>");
        gVar.f4724f = str2;
        gVar.f4720a = pVar;
        gVar.f4721b = oVar;
        gVar.g = this;
        gVar.c = 0;
        q qVar = new q(gVar);
        this.g = qVar;
        C c = q.f4953C;
        this.f4478o = (c.f4912a & 16) != 0 ? c.f4913b[4] : Integer.MAX_VALUE;
        t2.z zVar = qVar.f4977z;
        synchronized (zVar) {
            try {
                if (zVar.f5013f) {
                    throw new IOException("closed");
                }
                if (zVar.c) {
                    Logger logger = t2.z.h;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(n2.b.h(">> CONNECTION " + t2.f.f4934a.d(), new Object[0]));
                    }
                    zVar.f5010b.F(t2.f.f4934a);
                    zVar.f5010b.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t2.z zVar2 = qVar.f4977z;
        C c3 = qVar.f4970s;
        synchronized (zVar2) {
            try {
                X1.g.e(c3, "settings");
                if (zVar2.f5013f) {
                    throw new IOException("closed");
                }
                zVar2.i(0, Integer.bitCount(c3.f4912a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    if (((1 << i3) & c3.f4912a) != 0) {
                        zVar2.f5010b.B(i3 != 4 ? i3 != 7 ? i3 : 4 : 3);
                        zVar2.f5010b.e(c3.f4913b[i3]);
                    }
                    i3++;
                }
                zVar2.f5010b.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qVar.f4970s.a() != 65535) {
            qVar.f4977z.G(0, r1 - 65535);
        }
        dVar.f().c(new p2.b(qVar.f4958e, qVar.f4954A, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        t tVar = this.f4468b;
        sb.append(tVar.f4122a.h.f4064d);
        sb.append(':');
        sb.append(tVar.f4122a.h.f4065e);
        sb.append(", proxy=");
        sb.append(tVar.f4123b);
        sb.append(" hostAddress=");
        sb.append(tVar.c);
        sb.append(" cipherSuite=");
        m2.i iVar = this.f4470e;
        if (iVar == null || (obj = iVar.f4052b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f4471f);
        sb.append('}');
        return sb.toString();
    }
}
