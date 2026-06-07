package v2;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final j f5139a;

    /* renamed from: b, reason: collision with root package name */
    public l f5140b;

    public k(j jVar) {
        this.f5139a = jVar;
    }

    @Override // v2.l
    public final boolean a(SSLSocket sSLSocket) {
        return this.f5139a.a(sSLSocket);
    }

    @Override // v2.l
    public final String b(SSLSocket sSLSocket) {
        l e3 = e(sSLSocket);
        if (e3 != null) {
            return e3.b(sSLSocket);
        }
        return null;
    }

    @Override // v2.l
    public final boolean c() {
        return true;
    }

    @Override // v2.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        l e3 = e(sSLSocket);
        if (e3 != null) {
            e3.d(sSLSocket, str, list);
        }
    }

    public final synchronized l e(SSLSocket sSLSocket) {
        try {
            if (this.f5140b == null && this.f5139a.a(sSLSocket)) {
                this.f5140b = this.f5139a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5140b;
    }
}
