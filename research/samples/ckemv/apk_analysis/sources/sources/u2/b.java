package u2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f5027a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5028b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f5027a = x509TrustManager;
        this.f5028b = method;
    }

    @Override // y2.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f5028b.invoke(this.f5027a, x509Certificate);
            X1.g.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e3) {
            throw new AssertionError("unable to get issues and signature", e3);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return X1.g.a(this.f5027a, bVar.f5027a) && X1.g.a(this.f5028b, bVar.f5028b);
    }

    public final int hashCode() {
        return this.f5028b.hashCode() + (this.f5027a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f5027a + ", findByIssuerAndSignatureMethod=" + this.f5028b + ')';
    }
}
