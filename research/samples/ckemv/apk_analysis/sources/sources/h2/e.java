package h2;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f3105a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.l f3106b;
    public final W1.p c;

    public e(r0.h hVar) {
        j jVar = j.c;
        i iVar = i.c;
        this.f3105a = hVar;
        this.f3106b = jVar;
        this.c = iVar;
    }

    @Override // h2.f
    public final Object a(g gVar, O1.d dVar) {
        X1.j jVar = new X1.j(0);
        jVar.c = i2.q.f3231a;
        Object a3 = this.f3105a.a(new d(this, jVar, gVar), dVar);
        return a3 == P1.a.f784b ? a3 : K1.h.f605a;
    }
}
