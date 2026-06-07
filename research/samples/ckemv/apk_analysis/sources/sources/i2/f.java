package i2;

import e2.InterfaceC0137t;
import m0.z;

/* loaded from: classes.dex */
public final class f extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3205f;
    public final /* synthetic */ h2.b g;
    public final /* synthetic */ h2.g h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h2.b bVar, h2.g gVar, Object obj, O1.d dVar) {
        super(2, dVar);
        this.g = bVar;
        this.h = gVar;
        this.f3206i = obj;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new f(this.g, this.h, this.f3206i, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((f) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3205f;
        if (i3 == 0) {
            z.m0(obj);
            W1.q qVar = (W1.q) this.g.f3099f;
            this.f3205f = 1;
            if (qVar.a(this.h, this.f3206i, this) == aVar) {
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
