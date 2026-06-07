package u2;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5033d;
    public final Provider c;

    static {
        boolean z3 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z3 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f5033d = z3;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        X1.g.d(newProvider, "newProvider()");
        this.c = newProvider;
    }

    @Override // u2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, list);
        } else {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) d1.e.e(list).toArray(new String[0]));
        }
    }

    @Override // u2.n
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // u2.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.c);
        X1.g.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // u2.n
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k2 = k();
        k2.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k2.getSocketFactory();
        X1.g.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // u2.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        X1.g.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X1.g.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f5032a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        X1.g.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
