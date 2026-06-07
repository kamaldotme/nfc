package s0;

import X1.h;

/* loaded from: classes.dex */
public final class b extends h implements W1.a {
    public final /* synthetic */ e c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f4700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, c cVar) {
        super(0);
        this.c = eVar;
        this.f4700d = cVar;
    }

    @Override // W1.a
    public final Object d() {
        t0.e eVar = this.c.f4704a;
        c cVar = this.f4700d;
        eVar.getClass();
        X1.g.e(cVar, "listener");
        synchronized (eVar.c) {
            if (eVar.f4893d.remove(cVar) && eVar.f4893d.isEmpty()) {
                eVar.d();
            }
        }
        return K1.h.f605a;
    }
}
