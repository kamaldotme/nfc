package u2;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5026d;
    public final ArrayList c;

    static {
        f5026d = d1.e.k() && Build.VERSION.SDK_INT >= 29;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        ArrayList V2 = L1.j.V(new v2.l[]{(!d1.e.k() || Build.VERSION.SDK_INT < 29) ? null : new Object(), new v2.k(v2.e.f5132f), new v2.k(v2.i.f5138a), new v2.k(v2.g.f5137a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = V2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v2.l) next).c()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    @Override // u2.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        v2.b bVar = x509TrustManagerExtensions != null ? new v2.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new y2.a(c(x509TrustManager));
    }

    @Override // u2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        X1.g.e(list, "protocols");
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((v2.l) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        v2.l lVar = (v2.l) obj;
        if (lVar != null) {
            lVar.d(sSLSocket, str, list);
        }
    }

    @Override // u2.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v2.l) obj).a(sSLSocket)) {
                break;
            }
        }
        v2.l lVar = (v2.l) obj;
        if (lVar != null) {
            return lVar.b(sSLSocket);
        }
        return null;
    }

    @Override // u2.n
    public final boolean h(String str) {
        X1.g.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
