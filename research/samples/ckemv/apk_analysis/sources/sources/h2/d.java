package h2;

import i2.t;
import m0.z;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3102a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3103b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3104d;

    public d(e eVar, X1.j jVar, g gVar) {
        this.f3103b = eVar;
        this.c = jVar;
        this.f3104d = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    @Override // h2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(O1.d dVar, Object obj) {
        c cVar;
        int i3;
        switch (this.f3102a) {
            case 0:
                if (dVar instanceof c) {
                    cVar = (c) dVar;
                    int i4 = cVar.g;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        cVar.g = i4 - Integer.MIN_VALUE;
                        Object obj2 = cVar.f3100e;
                        P1.a aVar = P1.a.f784b;
                        i3 = cVar.g;
                        K1.h hVar = K1.h.f605a;
                        if (i3 != 0) {
                            z.m0(obj2);
                            e eVar = (e) this.f3103b;
                            Object h = eVar.f3106b.h(obj);
                            X1.j jVar = (X1.j) this.c;
                            Object obj3 = jVar.c;
                            if (obj3 == i2.q.f3231a || !((Boolean) eVar.c.e(obj3, h)).booleanValue()) {
                                jVar.c = h;
                                cVar.g = 1;
                                if (((g) this.f3104d).b(cVar, obj) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z.m0(obj2);
                        }
                        return hVar;
                    }
                }
                cVar = new c(this, dVar);
                Object obj22 = cVar.f3100e;
                P1.a aVar2 = P1.a.f784b;
                i3 = cVar.g;
                K1.h hVar2 = K1.h.f605a;
                if (i3 != 0) {
                }
                return hVar2;
            default:
                Object a3 = i2.q.a((O1.i) this.f3103b, obj, this.c, (t) this.f3104d, dVar);
                return a3 == P1.a.f784b ? a3 : K1.h.f605a;
        }
    }

    public d(g gVar, O1.i iVar) {
        this.f3103b = iVar;
        this.c = j2.a.m(iVar);
        this.f3104d = new t(gVar, null);
    }
}
