package h2;

import m0.z;

/* loaded from: classes.dex */
public final class k extends Q1.g implements W1.q {

    /* renamed from: f, reason: collision with root package name */
    public int f3111f;
    public /* synthetic */ g g;
    public /* synthetic */ Object h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W1.p f3112i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(W1.p pVar, O1.d dVar) {
        super(3, dVar);
        this.f3112i = pVar;
    }

    @Override // W1.q
    public final Object a(g gVar, Object obj, Object obj2) {
        k kVar = new k(this.f3112i, (O1.d) obj2);
        kVar.g = gVar;
        kVar.h = obj;
        return kVar.k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        g gVar;
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3111f;
        if (i3 == 0) {
            z.m0(obj);
            gVar = this.g;
            Object obj2 = this.h;
            this.g = gVar;
            this.f3111f = 1;
            obj = this.f3112i.e(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z.m0(obj);
                return K1.h.f605a;
            }
            gVar = this.g;
            z.m0(obj);
        }
        this.g = null;
        this.f3111f = 2;
        if (gVar.b(this, obj) == aVar) {
            return aVar;
        }
        return K1.h.f605a;
    }
}
