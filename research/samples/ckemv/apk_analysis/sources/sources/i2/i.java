package i2;

import e2.InterfaceC0137t;
import m0.z;

/* loaded from: classes.dex */
public final class i extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3213f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h2.b h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h2.g f3214i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(O1.d dVar, h2.b bVar, h2.g gVar) {
        super(2, dVar);
        this.h = bVar;
        this.f3214i = gVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        i iVar = new i(dVar, this.h, this.f3214i);
        iVar.g = obj;
        return iVar;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((i) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3213f;
        if (i3 == 0) {
            z.m0(obj);
            InterfaceC0137t interfaceC0137t = (InterfaceC0137t) this.g;
            X1.j jVar = new X1.j(0);
            h2.b bVar = this.h;
            h2.f fVar = (h2.f) bVar.f3098e;
            h hVar = new h(jVar, interfaceC0137t, bVar, this.f3214i);
            this.f3213f = 1;
            if (fVar.a(hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z.m0(obj);
        }
        return K1.h.f605a;
    }
}
