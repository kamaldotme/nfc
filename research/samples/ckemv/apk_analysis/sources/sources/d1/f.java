package d1;

import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class f implements p, e0.e, v2.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2619b;
    public final String c;

    public /* synthetic */ f(String str, int i3) {
        this.f2619b = i3;
        this.c = str;
    }

    @Override // v2.j
    public boolean a(SSLSocket sSLSocket) {
        return d2.l.V(sSLSocket.getClass().getName(), this.c + '.', false);
    }

    @Override // e0.e
    public void b(e0.d dVar) {
    }

    @Override // v2.j
    public v2.l c(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!X1.g.a(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new v2.e(cls2);
    }

    @Override // d1.p
    public Object g() {
        switch (this.f2619b) {
            case 0:
                throw new RuntimeException(this.c);
            case 1:
                throw new RuntimeException(this.c);
            default:
                throw new RuntimeException(this.c);
        }
    }

    @Override // e0.e
    public String i() {
        return this.c;
    }

    public String toString() {
        switch (this.f2619b) {
            case 4:
                return "<" + this.c + '>';
            default:
                return super.toString();
        }
    }

    public f(String str) {
        this.f2619b = 3;
        X1.g.e(str, "query");
        this.c = str;
    }

    public f() {
        this.f2619b = 5;
        this.c = "com.google.android.gms.org.conscrypt";
    }
}
