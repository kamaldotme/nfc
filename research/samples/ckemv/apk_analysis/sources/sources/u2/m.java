package u2;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5042d;
    public final Provider c = new OpenJSSE();

    static {
        boolean z3 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, l.class.getClassLoader());
            z3 = true;
        } catch (ClassNotFoundException unused) {
        }
        f5042d = z3;
    }

    @Override // u2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.d(sSLSocket, str, list);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
        SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            sSLParameters.setApplicationProtocols((String[]) d1.e.e(list).toArray(new String[0]));
            sSLSocket2.setSSLParameters(sSLParameters);
        }
    }

    @Override // u2.n
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) || (applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol()) == null || X1.g.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // u2.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.c);
        X1.g.d(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // u2.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        X1.g.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X1.g.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        X1.g.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
