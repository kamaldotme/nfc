package v2;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class h implements j {
    @Override // v2.j
    public final boolean a(SSLSocket sSLSocket) {
        boolean z3 = u2.h.f5033d;
        return u2.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, v2.l] */
    @Override // v2.j
    public final l c(SSLSocket sSLSocket) {
        return new Object();
    }
}
