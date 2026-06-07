package i2;

import m0.z;

/* loaded from: classes.dex */
public final class e extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3204f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h2.b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h2.b bVar, O1.d dVar) {
        super(2, dVar);
        this.h = bVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        e eVar = new e(this.h, dVar);
        eVar.g = obj;
        return eVar;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((e) b((O1.d) obj2, (h2.g) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3204f;
        if (i3 == 0) {
            z.m0(obj);
            h2.g gVar = (h2.g) this.g;
            this.f3204f = 1;
            if (this.h.e(gVar, this) == aVar) {
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
