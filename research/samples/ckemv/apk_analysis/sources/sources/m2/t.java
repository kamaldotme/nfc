package m2;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f4122a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f4123b;
    public final InetSocketAddress c;

    public t(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X1.g.e(aVar, "address");
        X1.g.e(inetSocketAddress, "socketAddress");
        this.f4122a = aVar;
        this.f4123b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (X1.g.a(tVar.f4122a, this.f4122a) && X1.g.a(tVar.f4123b, this.f4123b) && X1.g.a(tVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.f4123b.hashCode() + ((this.f4122a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
