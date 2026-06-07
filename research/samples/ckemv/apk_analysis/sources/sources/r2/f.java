package r2;

import X1.g;
import java.util.List;
import k.C0306s;
import m2.l;
import m2.m;
import m2.r;
import q2.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final i f4657a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4658b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.e f4659d;

    /* renamed from: e, reason: collision with root package name */
    public final C0306s f4660e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4661f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public int f4662i;

    public f(i iVar, List list, int i3, q2.e eVar, C0306s c0306s, int i4, int i5, int i6) {
        g.e(iVar, "call");
        g.e(list, "interceptors");
        g.e(c0306s, "request");
        this.f4657a = iVar;
        this.f4658b = list;
        this.c = i3;
        this.f4659d = eVar;
        this.f4660e = c0306s;
        this.f4661f = i4;
        this.g = i5;
        this.h = i6;
    }

    public static f a(f fVar, int i3, q2.e eVar, C0306s c0306s, int i4) {
        if ((i4 & 1) != 0) {
            i3 = fVar.c;
        }
        int i5 = i3;
        if ((i4 & 2) != 0) {
            eVar = fVar.f4659d;
        }
        q2.e eVar2 = eVar;
        if ((i4 & 4) != 0) {
            c0306s = fVar.f4660e;
        }
        C0306s c0306s2 = c0306s;
        int i6 = fVar.f4661f;
        int i7 = fVar.g;
        int i8 = fVar.h;
        fVar.getClass();
        g.e(c0306s2, "request");
        return new f(fVar.f4657a, fVar.f4658b, i5, eVar2, c0306s2, i6, i7, i8);
    }

    public final r b(C0306s c0306s) {
        g.e(c0306s, "request");
        List list = this.f4658b;
        int size = list.size();
        int i3 = this.c;
        if (i3 >= size) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f4662i++;
        q2.e eVar = this.f4659d;
        if (eVar != null) {
            if (!eVar.c.b((l) c0306s.f3771b)) {
                throw new IllegalStateException(("network interceptor " + list.get(i3 - 1) + " must retain the same host and port").toString());
            }
            if (this.f4662i != 1) {
                throw new IllegalStateException(("network interceptor " + list.get(i3 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i4 = i3 + 1;
        f a3 = a(this, i4, null, c0306s, 58);
        m mVar = (m) list.get(i3);
        r a4 = mVar.a(a3);
        if (a4 == null) {
            throw new NullPointerException("interceptor " + mVar + " returned null");
        }
        if (eVar != null && i4 < list.size() && a3.f4662i != 1) {
            throw new IllegalStateException(("network interceptor " + mVar + " must call proceed() exactly once").toString());
        }
        if (a4.h != null) {
            return a4;
        }
        throw new IllegalStateException(("interceptor " + mVar + " returned a response with no body").toString());
    }
}
