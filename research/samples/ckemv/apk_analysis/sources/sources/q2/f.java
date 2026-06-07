package q2;

import L1.q;
import f.C0150G;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import m2.t;
import t2.C0386a;
import t2.D;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f4441a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.a f4442b;
    public final i c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.b f4443d;

    /* renamed from: e, reason: collision with root package name */
    public F0.e f4444e;

    /* renamed from: f, reason: collision with root package name */
    public m2.k f4445f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4446i;

    /* renamed from: j, reason: collision with root package name */
    public t f4447j;

    public f(m mVar, m2.a aVar, i iVar, m2.b bVar) {
        X1.g.e(mVar, "connectionPool");
        X1.g.e(bVar, "eventListener");
        this.f4441a = mVar;
        this.f4442b = aVar;
        this.c = iVar;
        this.f4443d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(int i3, int i4, int i5, boolean z3, boolean z4) {
        ArrayList arrayList;
        String str;
        int i6;
        List list;
        boolean contains;
        C0150G c0150g;
        F0.e eVar;
        m2.k kVar;
        Socket h;
        while (!this.c.f4462q) {
            l lVar = this.c.f4456k;
            if (lVar != null) {
                synchronized (lVar) {
                    try {
                        if (!lVar.f4473j && b(lVar.f4468b.f4122a.h)) {
                            h = null;
                        }
                        h = this.c.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.f4456k != null) {
                    if (h != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!lVar.i(z4)) {
                        return lVar;
                    }
                    lVar.k();
                    if (this.f4447j == null && (eVar = this.f4444e) != null && !eVar.b() && (kVar = this.f4445f) != null && !kVar.c()) {
                        throw new IOException("exhausted all routes");
                    }
                } else {
                    if (h != null) {
                        n2.b.d(h);
                    }
                    m2.b bVar = this.f4443d;
                    i iVar = this.c;
                    bVar.getClass();
                    X1.g.e(iVar, "call");
                }
            }
            this.g = 0;
            this.h = 0;
            this.f4446i = 0;
            if (this.f4441a.a(this.f4442b, this.c, null, false)) {
                lVar = this.c.f4456k;
                X1.g.b(lVar);
                m2.b bVar2 = this.f4443d;
                i iVar2 = this.c;
                bVar2.getClass();
                X1.g.e(iVar2, "call");
            } else {
                t tVar = this.f4447j;
                try {
                    if (tVar != null) {
                        this.f4447j = null;
                    } else {
                        F0.e eVar2 = this.f4444e;
                        if (eVar2 == null || !eVar2.b()) {
                            m2.k kVar2 = this.f4445f;
                            if (kVar2 == null) {
                                m2.a aVar = this.f4442b;
                                i iVar3 = this.c;
                                kVar2 = new m2.k(aVar, iVar3.f4450b.f4094z, iVar3, this.f4443d);
                                this.f4445f = kVar2;
                            }
                            if (!kVar2.c()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (kVar2.f4056b < ((List) kVar2.h).size()) {
                                boolean z5 = kVar2.f4056b < ((List) kVar2.h).size();
                                m2.a aVar2 = (m2.a) kVar2.f4057d;
                                if (!z5) {
                                    throw new SocketException("No route to " + aVar2.h.f4064d + "; exhausted proxy configurations: " + ((List) kVar2.h));
                                }
                                List list2 = (List) kVar2.h;
                                int i7 = kVar2.f4056b;
                                kVar2.f4056b = i7 + 1;
                                Proxy proxy = (Proxy) list2.get(i7);
                                ArrayList arrayList2 = new ArrayList();
                                kVar2.f4060i = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    m2.l lVar2 = aVar2.h;
                                    str = lVar2.f4064d;
                                    i6 = lVar2.f4065e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    X1.g.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    X1.g.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        X1.g.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        X1.g.d(str, "address.hostAddress");
                                    }
                                    i6 = inetSocketAddress.getPort();
                                }
                                if (1 > i6 || i6 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i6 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i6));
                                } else {
                                    byte[] bArr = n2.b.f4249a;
                                    X1.g.e(str, "<this>");
                                    X1.j jVar = n2.b.f4252e;
                                    jVar.getClass();
                                    if (((Pattern) jVar.c).matcher(str).matches()) {
                                        list = v0.f.B(InetAddress.getByName(str));
                                    } else {
                                        ((m2.b) kVar2.g).getClass();
                                        X1.g.e((i) kVar2.f4059f, "call");
                                        List e3 = aVar2.f3996a.e(str);
                                        if (e3.isEmpty()) {
                                            throw new UnknownHostException(aVar2.f3996a + " returned no addresses for " + str);
                                        }
                                        list = e3;
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i6));
                                    }
                                }
                                Iterator it2 = kVar2.f4060i.iterator();
                                while (it2.hasNext()) {
                                    t tVar2 = new t((m2.a) kVar2.f4057d, proxy, (InetSocketAddress) it2.next());
                                    C0150G c0150g2 = (C0150G) kVar2.f4058e;
                                    synchronized (c0150g2) {
                                        contains = ((LinkedHashSet) c0150g2.f2846b).contains(tVar2);
                                    }
                                    if (contains) {
                                        kVar2.c.add(tVar2);
                                    } else {
                                        arrayList.add(tVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                q.T(arrayList, kVar2.c);
                                kVar2.c.clear();
                            }
                            F0.e eVar3 = new F0.e(arrayList);
                            this.f4444e = eVar3;
                            if (this.c.f4462q) {
                                throw new IOException("Canceled");
                            }
                            if (this.f4441a.a(this.f4442b, this.c, arrayList, false)) {
                                lVar = this.c.f4456k;
                                X1.g.b(lVar);
                                m2.b bVar3 = this.f4443d;
                                i iVar4 = this.c;
                                bVar3.getClass();
                                X1.g.e(iVar4, "call");
                            } else {
                                if (!eVar3.b()) {
                                    throw new NoSuchElementException();
                                }
                                int i8 = eVar3.f166b;
                                eVar3.f166b = i8 + 1;
                                tVar = (t) arrayList.get(i8);
                                lVar = new l(this.f4441a, tVar);
                                this.c.f4464s = lVar;
                                lVar.c(i3, i4, i5, z3, this.c, this.f4443d);
                                this.c.f4464s = null;
                                c0150g = this.c.f4450b.f4094z;
                                synchronized (c0150g) {
                                    ((LinkedHashSet) c0150g.f2846b).remove(tVar);
                                }
                                if (this.f4441a.a(this.f4442b, this.c, arrayList, true)) {
                                    l lVar3 = this.c.f4456k;
                                    X1.g.b(lVar3);
                                    this.f4447j = tVar;
                                    Socket socket = lVar.f4469d;
                                    X1.g.b(socket);
                                    n2.b.d(socket);
                                    m2.b bVar4 = this.f4443d;
                                    i iVar5 = this.c;
                                    bVar4.getClass();
                                    X1.g.e(iVar5, "call");
                                    lVar = lVar3;
                                } else {
                                    synchronized (lVar) {
                                        this.f4441a.c(lVar);
                                        this.c.a(lVar);
                                    }
                                    m2.b bVar5 = this.f4443d;
                                    i iVar6 = this.c;
                                    bVar5.getClass();
                                    X1.g.e(iVar6, "call");
                                }
                            }
                        } else {
                            F0.e eVar4 = this.f4444e;
                            X1.g.b(eVar4);
                            if (!eVar4.b()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = eVar4.f166b;
                            eVar4.f166b = i9 + 1;
                            tVar = (t) ((List) eVar4.c).get(i9);
                        }
                    }
                    lVar.c(i3, i4, i5, z3, this.c, this.f4443d);
                    this.c.f4464s = null;
                    c0150g = this.c.f4450b.f4094z;
                    synchronized (c0150g) {
                    }
                } catch (Throwable th2) {
                    this.c.f4464s = null;
                    throw th2;
                }
                arrayList = null;
                lVar = new l(this.f4441a, tVar);
                this.c.f4464s = lVar;
            }
            if (!lVar.i(z4)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(m2.l lVar) {
        X1.g.e(lVar, "url");
        m2.l lVar2 = this.f4442b.h;
        return lVar.f4065e == lVar2.f4065e && X1.g.a(lVar.f4064d, lVar2.f4064d);
    }

    public final void c(IOException iOException) {
        X1.g.e(iOException, "e");
        this.f4447j = null;
        if ((iOException instanceof D) && ((D) iOException).f4914b == 8) {
            this.g++;
        } else if (iOException instanceof C0386a) {
            this.h++;
        } else {
            this.f4446i++;
        }
    }
}
