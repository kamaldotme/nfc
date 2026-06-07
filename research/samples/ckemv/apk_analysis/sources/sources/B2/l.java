package B2;

import e2.InterfaceC0137t;
import m0.z;
import xyz.happify.ckemv.MainActivity;

/* loaded from: classes.dex */
public final class l extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f86f;
    public final /* synthetic */ MainActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MainActivity mainActivity, O1.d dVar) {
        super(2, dVar);
        this.g = mainActivity;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new l(this.g, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((l) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f86f;
        K1.h hVar = K1.h.f605a;
        if (i3 == 0) {
            z.m0(obj);
            MainActivity mainActivity = this.g;
            h2.o oVar = mainActivity.D;
            k kVar = new k(mainActivity, null);
            this.f86f = 1;
            int i4 = h2.l.f3113a;
            h2.k kVar2 = new h2.k(kVar, null);
            O1.j jVar = O1.j.f782b;
            Object a3 = new h2.b(kVar2, oVar, jVar, -2, 1).f(jVar, 0, 1).a(i2.p.f3230a, this);
            if (a3 != aVar) {
                a3 = hVar;
            }
            if (a3 != aVar) {
                a3 = hVar;
            }
            if (a3 == aVar) {
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
