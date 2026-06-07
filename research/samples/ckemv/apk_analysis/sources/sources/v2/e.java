package v2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import u2.n;

/* loaded from: classes.dex */
public class e implements l {

    /* renamed from: f, reason: collision with root package name */
    public static final d1.f f5132f = new d1.f();

    /* renamed from: a, reason: collision with root package name */
    public final Class f5133a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f5134b;
    public final Method c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f5135d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f5136e;

    public e(Class cls) {
        this.f5133a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        X1.g.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f5134b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.f5135d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f5136e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // v2.l
    public final boolean a(SSLSocket sSLSocket) {
        return this.f5133a.isInstance(sSLSocket);
    }

    @Override // v2.l
    public final String b(SSLSocket sSLSocket) {
        if (!this.f5133a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5135d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, d2.a.f2653a);
            }
            return null;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if ((cause instanceof NullPointerException) && X1.g.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e4);
        }
    }

    @Override // v2.l
    public final boolean c() {
        boolean z3 = u2.c.f5029e;
        return u2.c.f5029e;
    }

    @Override // v2.l
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X1.g.e(list, "protocols");
        if (this.f5133a.isInstance(sSLSocket)) {
            try {
                this.f5134b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.f5136e;
                n nVar = n.f5043a;
                method.invoke(sSLSocket, d1.e.f(list));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }
}
