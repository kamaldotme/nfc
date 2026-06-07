package r0;

import L1.m;
import W1.p;
import e2.InterfaceC0137t;
import f.C0150G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.z;
import v0.o;

/* loaded from: classes.dex */
public final class j extends Q1.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f4638f;
    public final /* synthetic */ C0150G g;
    public final /* synthetic */ o h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f4639i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0150G c0150g, o oVar, e eVar, O1.d dVar) {
        super(2, dVar);
        this.g = c0150g;
        this.h = oVar;
        this.f4639i = eVar;
    }

    @Override // Q1.b
    public final O1.d b(O1.d dVar, Object obj) {
        return new j(this.g, this.h, this.f4639i, dVar);
    }

    @Override // W1.p
    public final Object e(Object obj, Object obj2) {
        return ((j) b((O1.d) obj2, (InterfaceC0137t) obj)).k(K1.h.f605a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        if (r5.c == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Q1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        P1.a aVar = P1.a.f784b;
        int i3 = this.f4638f;
        if (i3 == 0) {
            z.m0(obj);
            C0150G c0150g = this.g;
            c0150g.getClass();
            o oVar = this.h;
            X1.g.e(oVar, "spec");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) c0150g.f2846b) {
                if (((s0.e) obj2).b(oVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(m.S(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s0.e eVar = (s0.e) it.next();
                eVar.getClass();
                arrayList2.add(new h2.b(new s0.d(eVar, null), O1.j.f782b, -2, 1));
            }
            h hVar = new h((h2.f[]) L1.k.Y(arrayList2).toArray(new h2.f[0]));
            boolean z3 = hVar instanceof h2.m;
            h2.e eVar2 = hVar;
            if (!z3) {
                h2.j jVar = h2.j.c;
                h2.i iVar = h2.i.c;
                if (hVar instanceof h2.e) {
                    h2.e eVar3 = (h2.e) hVar;
                    if (eVar3.f3106b == jVar) {
                        eVar2 = hVar;
                    }
                }
                eVar2 = new h2.e(hVar);
            }
            i iVar2 = new i(this.f4639i, oVar);
            this.f4638f = 1;
            if (eVar2.a(iVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z.m0(obj);
        }
        return K1.h.f605a;
    }
}
