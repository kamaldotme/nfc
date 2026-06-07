package q2;

/* loaded from: classes.dex */
public final class k extends X1.h implements W1.a {
    public final /* synthetic */ m2.d c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m2.i f4466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m2.a f4467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m2.d dVar, m2.i iVar, m2.a aVar) {
        super(0);
        this.c = dVar;
        this.f4466d = iVar;
        this.f4467e = aVar;
    }

    @Override // W1.a
    public final Object d() {
        u2.l lVar = this.c.f4018b;
        X1.g.b(lVar);
        return lVar.d(this.f4466d.a(), this.f4467e.h.f4064d);
    }
}
