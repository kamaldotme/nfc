package m2;

import f.C0150G;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final List f4071A = n2.b.k(p.HTTP_2, p.HTTP_1_1);

    /* renamed from: B, reason: collision with root package name */
    public static final List f4072B = n2.b.k(g.f4036e, g.f4037f);

    /* renamed from: b, reason: collision with root package name */
    public final v0.i f4073b;
    public final C0150G c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4074d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4075e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.b f4076f;
    public final boolean g;
    public final b h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4077i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4078j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4079k;

    /* renamed from: l, reason: collision with root package name */
    public final b f4080l;

    /* renamed from: m, reason: collision with root package name */
    public final ProxySelector f4081m;

    /* renamed from: n, reason: collision with root package name */
    public final b f4082n;

    /* renamed from: o, reason: collision with root package name */
    public final SocketFactory f4083o;

    /* renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f4084p;

    /* renamed from: q, reason: collision with root package name */
    public final X509TrustManager f4085q;

    /* renamed from: r, reason: collision with root package name */
    public final List f4086r;

    /* renamed from: s, reason: collision with root package name */
    public final List f4087s;

    /* renamed from: t, reason: collision with root package name */
    public final y2.c f4088t;

    /* renamed from: u, reason: collision with root package name */
    public final d f4089u;

    /* renamed from: v, reason: collision with root package name */
    public final u2.l f4090v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4091w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4092x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4093y;

    /* renamed from: z, reason: collision with root package name */
    public final C0150G f4094z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        List list;
        v0.i iVar = new v0.i(4);
        C0150G c0150g = new C0150G(8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        B2.b bVar = new B2.b();
        b bVar2 = b.f4003a;
        b bVar3 = b.f4004b;
        b bVar4 = b.c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        X1.g.d(socketFactory, "getDefault()");
        List list2 = f4072B;
        List list3 = f4071A;
        y2.c cVar = y2.c.f5277a;
        d dVar = d.c;
        this.f4073b = iVar;
        this.c = c0150g;
        this.f4074d = n2.b.v(arrayList);
        this.f4075e = n2.b.v(arrayList2);
        this.f4076f = bVar;
        this.g = true;
        this.h = bVar2;
        this.f4077i = true;
        this.f4078j = true;
        this.f4079k = bVar3;
        this.f4080l = bVar4;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f4081m = proxySelector == null ? w2.a.f5181a : proxySelector;
        this.f4082n = bVar2;
        this.f4083o = socketFactory;
        this.f4086r = list2;
        this.f4087s = list3;
        this.f4088t = cVar;
        this.f4091w = 10000;
        this.f4092x = 10000;
        this.f4093y = 10000;
        this.f4094z = new C0150G(13);
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f4038a) {
                    u2.n nVar = u2.n.f5043a;
                    X509TrustManager m3 = u2.n.f5043a.m();
                    this.f4085q = m3;
                    this.f4084p = u2.n.f5043a.l(m3);
                    u2.l b3 = u2.n.f5043a.b(m3);
                    this.f4090v = b3;
                    this.f4089u = X1.g.a(dVar.f4018b, b3) ? dVar : new d(dVar.f4017a, b3);
                    list = this.f4074d;
                    X1.g.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.f4075e;
                    X1.g.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!(true ^ list4.contains(null))) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    List list5 = this.f4086r;
                    boolean z3 = list5 instanceof Collection;
                    X509TrustManager x509TrustManager = this.f4085q;
                    u2.l lVar = this.f4090v;
                    SSLSocketFactory sSLSocketFactory = this.f4084p;
                    if (!z3 || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f4038a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null".toString());
                                }
                                if (lVar == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                                }
                                if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null".toString());
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (lVar != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    if (!X1.g.a(this.f4089u, d.c)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    return;
                }
            }
        }
        this.f4084p = null;
        this.f4090v = null;
        this.f4085q = null;
        this.f4089u = d.c;
        list = this.f4074d;
        X1.g.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
