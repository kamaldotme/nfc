package f2;

import W1.l;
import X1.h;

/* loaded from: classes.dex */
public final class c extends h implements l {
    public final /* synthetic */ d c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f3026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, D0.c cVar) {
        super(1);
        this.c = dVar;
        this.f3026d = cVar;
    }

    @Override // W1.l
    public final Object h(Object obj) {
        this.c.f3027d.removeCallbacks(this.f3026d);
        return K1.h.f605a;
    }
}
