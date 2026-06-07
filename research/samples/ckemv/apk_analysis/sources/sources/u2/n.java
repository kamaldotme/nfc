package u2;

import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m2.o;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f5043a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f5044b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r2) >= 9) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33, types: [u2.n] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    static {
        ?? obj;
        if (d1.e.k()) {
            for (Map.Entry entry : v2.c.f5130b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (v2.c.f5129a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(v2.d.f5131a);
                }
            }
            obj = a.f5026d ? new a() : 0;
            if (obj == 0) {
                r1 = c.f5029e ? new c() : null;
                X1.g.b(r1);
                obj = r1;
            }
        } else {
            if (X1.g.a("Conscrypt", Security.getProviders()[0].getName())) {
                obj = h.f5033d ? new h() : 0;
            }
            if (X1.g.a("BC", Security.getProviders()[0].getName())) {
                obj = e.f5031d ? new e() : 0;
            }
            if (X1.g.a("OpenJSSE", Security.getProviders()[0].getName())) {
                obj = m.f5042d ? new m() : 0;
            }
            obj = k.c ? new Object() : 0;
            if (obj == 0) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    X1.g.d(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f5043a = obj;
        f5044b = Logger.getLogger(o.class.getName());
        if (r1 == null) {
            obj = new Object();
            f5043a = obj;
            f5044b = Logger.getLogger(o.class.getName());
        }
        obj = r1;
        f5043a = obj;
        f5044b = Logger.getLogger(o.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            X1.g.d(method, "putMethod");
            X1.g.d(method2, "getMethod");
            X1.g.d(method3, "removeMethod");
            X1.g.d(cls3, "clientProviderClass");
            X1.g.d(cls4, "serverProviderClass");
            r1 = new j(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r1 == null) {
        }
        obj = r1;
        f5043a = obj;
        f5044b = Logger.getLogger(o.class.getName());
    }

    public static void i(String str, int i3, Throwable th) {
        X1.g.e(str, "message");
        f5044b.log(i3 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public l b(X509TrustManager x509TrustManager) {
        return new y2.a(c(x509TrustManager));
    }

    public y2.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        X1.g.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new y2.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i3) {
        X1.g.e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i3);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f5044b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        X1.g.e(str, "hostname");
        return true;
    }

    public void j(Object obj, String str) {
        X1.g.e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(str, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        X1.g.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k2 = k();
            k2.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k2.getSocketFactory();
            X1.g.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e3) {
            throw new AssertionError("No System TLS: " + e3, e3);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        X1.g.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X1.g.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        X1.g.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
