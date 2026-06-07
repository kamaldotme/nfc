package m0;

import androidx.work.CoroutineWorker;
import e2.InterfaceC0137t;

/* loaded from: classes.dex */
public final class e extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public l f3969f;
    public int g;
    public final /* synthetic */ l h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f3970i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, CoroutineWorker coroutineWorker, O1.d dVar) {
        super(2, dVar);
        this.h = lVar;
        this.f3970i = coroutineWorker;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new e(this.h, this.f3970i, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        e eVar = (e) b((O1.d) obj2, (InterfaceC0137t) obj);
        K1.h hVar = K1.h.f605a;
        eVar.k(hVar);
        return hVar;
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        int i3 = this.g;
        if (i3 == 0) {
            z.m0(obj);
            this.f3969f = this.h;
            this.g = 1;
            this.f3970i.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l lVar = this.f3969f;
        z.m0(obj);
        lVar.f3977a.j(obj);
        return K1.h.f605a;
    }
}
