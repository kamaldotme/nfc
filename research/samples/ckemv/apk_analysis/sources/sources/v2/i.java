package v2;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import u2.n;

/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final h f5138a = new Object();

    @Override // v2.l
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // v2.l
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // v2.l
    public final boolean c() {
        boolean z3 = u2.h.f5033d;
        return u2.h.f5033d;
    }

    @Override // v2.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            n nVar = n.f5043a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) d1.e.e(list).toArray(new String[0]));
        }
    }
}
