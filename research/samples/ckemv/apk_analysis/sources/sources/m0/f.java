package m0;

import androidx.work.CoroutineWorker;
import e2.InterfaceC0137t;

/* loaded from: classes.dex */
public final class f extends Q1.g implements W1.p {

    /* renamed from: f, reason: collision with root package name */
    public int f3971f;
    public final /* synthetic */ CoroutineWorker g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, O1.d dVar) {
        super(2, dVar);
        this.g = coroutineWorker;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new f(this.g, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((f) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f3971f;
        CoroutineWorker coroutineWorker = this.g;
        try {
            if (i3 == 0) {
                z.m0(obj);
                this.f3971f = 1;
                obj = coroutineWorker.f();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z.m0(obj);
            }
            coroutineWorker.g.j((p) obj);
        } catch (Throwable th) {
            coroutineWorker.g.k(th);
        }
        return K1.h.f605a;
    }
}
