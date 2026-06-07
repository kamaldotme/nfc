package i2;

import m0.z;

/* loaded from: classes.dex */
public final class t extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3235f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h2.g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h2.g gVar, O1.d dVar) {
        super(2, dVar);
        this.h = gVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        t tVar = new t(this.h, dVar);
        tVar.g = obj;
        return tVar;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((t) b((O1.d) obj2, obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3235f;
        if (i3 == 0) {
            z.m0(obj);
            Object obj2 = this.g;
            this.f3235f = 1;
            if (this.h.b(this, obj2) == aVar) {
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
