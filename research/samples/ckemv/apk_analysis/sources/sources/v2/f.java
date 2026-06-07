package v2;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class f implements j {
    @Override // v2.j
    public final boolean a(SSLSocket sSLSocket) {
        boolean z3 = u2.e.f5031d;
        return u2.d.r() && (sSLSocket instanceof BCSSLSocket);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, v2.l] */
    @Override // v2.j
    public final l c(SSLSocket sSLSocket) {
        return new Object();
    }
}
