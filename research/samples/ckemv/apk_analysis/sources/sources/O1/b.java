package O1;

import W1.p;

/* loaded from: classes.dex */
public final class b extends X1.h implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final b f778d = new b(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final b f779e = new b(2, 1);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, int i4) {
        super(i3);
        this.c = i4;
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        c cVar;
        switch (this.c) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                X1.g.e(str, "acc");
                X1.g.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                X1.g.e(iVar, "acc");
                X1.g.e(gVar2, "element");
                i i3 = iVar.i(gVar2.getKey());
                j jVar = j.f782b;
                if (i3 == jVar) {
                    return gVar2;
                }
                e eVar = e.f781b;
                f fVar = (f) i3.A(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, i3);
                } else {
                    i i4 = i3.i(eVar);
                    if (i4 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, i4));
                }
                return cVar;
        }
    }
}
