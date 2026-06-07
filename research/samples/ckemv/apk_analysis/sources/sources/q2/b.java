package q2;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f4425a;

    /* renamed from: b, reason: collision with root package name */
    public int f4426b;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4427d;

    public b(List list) {
        X1.g.e(list, "connectionSpecs");
        this.f4425a = list;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k.e1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String[], java.io.Serializable] */
    public final m2.g a(SSLSocket sSLSocket) {
        m2.g gVar;
        int i3;
        boolean z3;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i4 = this.f4426b;
        List list = this.f4425a;
        int size = list.size();
        while (true) {
            if (i4 >= size) {
                gVar = null;
                break;
            }
            gVar = (m2.g) list.get(i4);
            if (gVar.b(sSLSocket)) {
                this.f4426b = i4 + 1;
                break;
            }
            i4++;
        }
        if (gVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f4427d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            X1.g.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            X1.g.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i5 = this.f4426b;
        int size2 = list.size();
        while (true) {
            i3 = 0;
            if (i5 >= size2) {
                z3 = false;
                break;
            }
            if (((m2.g) list.get(i5)).b(sSLSocket)) {
                z3 = true;
                break;
            }
            i5++;
        }
        this.c = z3;
        boolean z4 = this.f4427d;
        String[] strArr = gVar.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            X1.g.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = n2.b.o(enabledCipherSuites2, strArr, m2.f.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = gVar.f4040d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            X1.g.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = n2.b.o(enabledProtocols3, r6, N1.a.c);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        X1.g.d(supportedCipherSuites, "supportedCipherSuites");
        m2.e eVar = m2.f.c;
        byte[] bArr = n2.b.f4249a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z4 && i3 != -1) {
            X1.g.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i3];
            X1.g.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            X1.g.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        ?? obj = new Object();
        obj.f3681a = gVar.f4038a;
        obj.c = strArr;
        obj.f3683d = r6;
        obj.f3682b = gVar.f4039b;
        X1.g.d(enabledCipherSuites, "cipherSuitesIntersection");
        obj.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        X1.g.d(enabledProtocols, "tlsVersionsIntersection");
        obj.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        m2.g a3 = obj.a();
        if (a3.c() != null) {
            sSLSocket.setEnabledProtocols(a3.f4040d);
        }
        if (a3.a() != null) {
            sSLSocket.setEnabledCipherSuites(a3.c);
        }
        return gVar;
    }
}
