package v2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import u2.n;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final f f5137a = new Object();

    @Override // v2.l
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // v2.l
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || X1.g.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // v2.l
    public final boolean c() {
        boolean z3 = u2.e.f5031d;
        return u2.e.f5031d;
    }

    @Override // v2.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            n nVar = n.f5043a;
            parameters.setApplicationProtocols((String[]) d1.e.e(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
