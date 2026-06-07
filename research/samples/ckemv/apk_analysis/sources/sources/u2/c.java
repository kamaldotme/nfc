package u2;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5029e;
    public final ArrayList c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1.e f5030d;

    static {
        boolean z3 = false;
        if (d1.e.k() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f5029e = z3;
    }

    public c() {
        v2.e eVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            eVar = new v2.e(cls);
        } catch (Exception e3) {
            n.f5043a.getClass();
            n.i("unable to load android socket classes", 5, e3);
            eVar = null;
        }
        ArrayList V2 = L1.j.V(new v2.l[]{eVar, new v2.k(v2.e.f5132f), new v2.k(v2.i.f5138a), new v2.k(v2.g.f5137a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = V2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((v2.l) next).c()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f5030d = new Q1.e(method3, method2, method);
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
    public final y2.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        X1.g.e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i3);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
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
    public final Object g() {
        Q1.e eVar = this.f5030d;
        eVar.getClass();
        Method method = eVar.f823a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = eVar.f824b;
            X1.g.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // u2.n
    public final boolean h(String str) {
        X1.g.e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // u2.n
    public final void j(Object obj, String str) {
        X1.g.e(str, "message");
        Q1.e eVar = this.f5030d;
        eVar.getClass();
        if (obj != null) {
            try {
                Method method = eVar.c;
                X1.g.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(str, 5, null);
    }
}
