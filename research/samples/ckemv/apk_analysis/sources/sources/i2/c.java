package i2;

import e2.AbstractC0139v;
import e2.B;
import e2.InterfaceC0137t;
import m0.z;

/* loaded from: classes.dex */
public final class c extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3201f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h2.g h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h2.b f3202i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(O1.d dVar, h2.b bVar, h2.g gVar) {
        super(2, dVar);
        this.h = gVar;
        this.f3202i = bVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        c cVar = new c(dVar, this.f3202i, this.h);
        cVar.g = obj;
        return cVar;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((c) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3201f;
        K1.h hVar = K1.h.f605a;
        if (i3 == 0) {
            z.m0(obj);
            InterfaceC0137t interfaceC0137t = (InterfaceC0137t) this.g;
            h2.b bVar = this.f3202i;
            int i4 = bVar.f3096b;
            if (i4 == -3) {
                i4 = -2;
            }
            W1.p dVar = new d(bVar, null);
            g2.d a3 = u2.d.a(i4, bVar.c, 4);
            O1.i e3 = AbstractC0139v.e(interfaceC0137t.m(), bVar.f3095a, true);
            l2.d dVar2 = B.f2767a;
            if (e3 != dVar2 && e3.A(O1.e.f781b) == null) {
                e3 = e3.o(dVar2);
            }
            g2.q qVar = new g2.q(e3, a3);
            qVar.X(3, qVar, dVar);
            this.f3201f = 1;
            Object a4 = h2.p.a(this.h, qVar, true, this);
            if (a4 != aVar) {
                a4 = hVar;
            }
            if (a4 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z.m0(obj);
        }
        return hVar;
    }
}
