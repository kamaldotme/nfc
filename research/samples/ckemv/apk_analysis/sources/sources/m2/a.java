package m2;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f3996a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f3997b;
    public final SSLSocketFactory c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f3998d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3999e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4000f;
    public final ProxySelector g;
    public final l h;

    /* renamed from: i, reason: collision with root package name */
    public final List f4001i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4002j;

    public a(String str, int i3, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, y2.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        X1.g.e(str, "uriHost");
        X1.g.e(bVar, "dns");
        X1.g.e(socketFactory, "socketFactory");
        X1.g.e(bVar2, "proxyAuthenticator");
        X1.g.e(list, "protocols");
        X1.g.e(list2, "connectionSpecs");
        X1.g.e(proxySelector, "proxySelector");
        this.f3996a = bVar;
        this.f3997b = socketFactory;
        this.c = sSLSocketFactory;
        this.f3998d = cVar;
        this.f3999e = dVar;
        this.f4000f = bVar2;
        this.g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (d2.l.Q(str2, "http")) {
            kVar.f4057d = "http";
        } else {
            if (!d2.l.Q(str2, "https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f4057d = "https";
        }
        String P2 = v0.f.P(b.f(str, 0, 0, false, 7));
        if (P2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.g = P2;
        if (1 > i3 || i3 >= 65536) {
            throw new IllegalArgumentException(X.d.f("unexpected port: ", i3).toString());
        }
        kVar.f4056b = i3;
        this.h = kVar.a();
        this.f4001i = n2.b.v(list);
        this.f4002j = n2.b.v(list2);
    }

    public final boolean a(a aVar) {
        X1.g.e(aVar, "that");
        return X1.g.a(this.f3996a, aVar.f3996a) && X1.g.a(this.f4000f, aVar.f4000f) && X1.g.a(this.f4001i, aVar.f4001i) && X1.g.a(this.f4002j, aVar.f4002j) && X1.g.a(this.g, aVar.g) && X1.g.a(null, null) && X1.g.a(this.c, aVar.c) && X1.g.a(this.f3998d, aVar.f3998d) && X1.g.a(this.f3999e, aVar.f3999e) && this.h.f4065e == aVar.h.f4065e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (X1.g.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3999e) + ((Objects.hashCode(this.f3998d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.f4002j.hashCode() + ((this.f4001i.hashCode() + ((this.f4000f.hashCode() + ((this.f3996a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.f4064d);
        sb.append(':');
        sb.append(lVar.f4065e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
