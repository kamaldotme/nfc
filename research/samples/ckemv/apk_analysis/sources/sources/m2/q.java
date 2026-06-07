package m2;

import f.C0150G;
import k.C0306s;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public C0306s f4100a;

    /* renamed from: b, reason: collision with root package name */
    public p f4101b;

    /* renamed from: d, reason: collision with root package name */
    public String f4102d;

    /* renamed from: e, reason: collision with root package name */
    public i f4103e;
    public s g;
    public r h;

    /* renamed from: i, reason: collision with root package name */
    public r f4105i;

    /* renamed from: j, reason: collision with root package name */
    public r f4106j;

    /* renamed from: k, reason: collision with root package name */
    public long f4107k;

    /* renamed from: l, reason: collision with root package name */
    public long f4108l;

    /* renamed from: m, reason: collision with root package name */
    public q2.e f4109m;
    public int c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0150G f4104f = new C0150G(9);

    public static void b(String str, r rVar) {
        if (rVar != null) {
            if (rVar.h != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (rVar.f4114i != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (rVar.f4115j != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (rVar.f4116k != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final r a() {
        int i3 = this.c;
        if (i3 < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        C0306s c0306s = this.f4100a;
        if (c0306s == null) {
            throw new IllegalStateException("request == null".toString());
        }
        p pVar = this.f4101b;
        if (pVar == null) {
            throw new IllegalStateException("protocol == null".toString());
        }
        String str = this.f4102d;
        if (str != null) {
            return new r(c0306s, pVar, str, i3, this.f4103e, this.f4104f.l(), this.g, this.h, this.f4105i, this.f4106j, this.f4107k, this.f4108l, this.f4109m);
        }
        throw new IllegalStateException("message == null".toString());
    }
}
