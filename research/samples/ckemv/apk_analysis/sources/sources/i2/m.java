package i2;

import e2.InterfaceC0137t;
import java.util.concurrent.atomic.AtomicInteger;
import m0.z;

/* loaded from: classes.dex */
public final class m extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3219f;
    public final /* synthetic */ h2.f[] g;
    public final /* synthetic */ int h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f3220i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g2.h f3221j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h2.f[] fVarArr, int i3, AtomicInteger atomicInteger, g2.h hVar, O1.d dVar) {
        super(2, dVar);
        this.g = fVarArr;
        this.h = i3;
        this.f3220i = atomicInteger;
        this.f3221j = hVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new m(this.g, this.h, this.f3220i, this.f3221j, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((m) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3219f;
        AtomicInteger atomicInteger = this.f3220i;
        g2.h hVar = this.f3221j;
        try {
            if (i3 == 0) {
                z.m0(obj);
                h2.f[] fVarArr = this.g;
                int i4 = this.h;
                h2.f fVar = fVarArr[i4];
                l lVar = new l(hVar, i4);
                this.f3219f = 1;
                if (fVar.a(lVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z.m0(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                hVar.k(null);
            }
            return K1.h.f605a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                hVar.k(null);
            }
        }
    }
}
