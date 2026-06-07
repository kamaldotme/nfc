package r0;

import a0.l;
import i2.n;
import j2.t;

/* loaded from: classes.dex */
public final class h implements h2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2.f[] f4635a;

    public h(h2.f[] fVarArr) {
        this.f4635a = fVarArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [W1.q, Q1.g] */
    @Override // h2.f
    public final Object a(h2.g gVar, O1.d dVar) {
        h2.f[] fVarArr = this.f4635a;
        n nVar = new n(fVarArr, new l(5, fVarArr), new Q1.g(3, null), gVar, null);
        t tVar = new t(dVar, dVar.j());
        Object N2 = v0.f.N(tVar, tVar, nVar);
        P1.a aVar = P1.a.f784b;
        K1.h hVar = K1.h.f605a;
        if (N2 != aVar) {
            N2 = hVar;
        }
        return N2 == aVar ? N2 : hVar;
    }
}
