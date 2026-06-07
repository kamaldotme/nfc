package v2;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import u2.n;

/* loaded from: classes.dex */
public final class a implements l {
    @Override // v2.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // v2.l
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || X1.g.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // v2.l
    public final boolean c() {
        n nVar = n.f5043a;
        return d1.e.k() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // v2.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            n nVar = n.f5043a;
            sSLParameters.setApplicationProtocols((String[]) d1.e.e(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e3) {
            throw new IOException("Android internal error", e3);
        }
    }
}
