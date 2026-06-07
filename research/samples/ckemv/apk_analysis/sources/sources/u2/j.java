package u2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m2.p;

/* loaded from: classes.dex */
public final class j extends n {
    public final Method c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f5036d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f5037e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f5038f;
    public final Class g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.f5036d = method2;
        this.f5037e = method3;
        this.f5038f = cls;
        this.g = cls2;
    }

    @Override // u2.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f5037e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        }
    }

    @Override // u2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p) obj) != p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(L1.m.S(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p) it.next()).f4099b);
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f5038f, this.g}, new i(arrayList2)));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        }
    }

    @Override // u2.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f5036d.invoke(null, sSLSocket));
            X1.g.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f5035b;
            if (!z3 && iVar.c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.c;
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        }
    }
}
