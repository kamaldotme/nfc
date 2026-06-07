package s0;

import K1.h;
import W1.p;
import g2.r;
import java.util.Objects;
import m0.z;
import u2.l;

/* loaded from: classes.dex */
public final class d extends Q1.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f4703f;
    public /* synthetic */ Object g;
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, O1.d dVar) {
        super(2, dVar);
        this.h = eVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        d dVar2 = new d(this.h, dVar);
        dVar2.g = obj;
        return dVar2;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((d) b((O1.d) obj2, (r) obj)).k(h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f4703f;
        if (i3 == 0) {
            z.m0(obj);
            r rVar = (r) this.g;
            e eVar = this.h;
            c cVar = new c(eVar, rVar);
            t0.e eVar2 = eVar.f4704a;
            eVar2.getClass();
            synchronized (eVar2.c) {
                try {
                    if (eVar2.f4893d.add(cVar)) {
                        if (eVar2.f4893d.size() == 1) {
                            eVar2.f4894e = eVar2.a();
                            m0.r a3 = m0.r.a();
                            int i4 = t0.f.f4895a;
                            Objects.toString(eVar2.f4894e);
                            a3.getClass();
                            eVar2.c();
                        }
                        cVar.a(eVar2.f4894e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(this.h, cVar);
            this.f4703f = 1;
            if (l.b(rVar, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z.m0(obj);
        }
        return h.f605a;
    }
}
