package v2;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends u2.l {

    /* renamed from: e, reason: collision with root package name */
    public final X509TrustManager f5127e;

    /* renamed from: f, reason: collision with root package name */
    public final X509TrustManagerExtensions f5128f;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f5127e = x509TrustManager;
        this.f5128f = x509TrustManagerExtensions;
    }

    @Override // u2.l
    public final List d(List list, String str) {
        X1.g.e(list, "chain");
        X1.g.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f5128f.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            X1.g.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e3) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
            sSLPeerUnverifiedException.initCause(e3);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f5127e == this.f5127e;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f5127e);
    }
}
