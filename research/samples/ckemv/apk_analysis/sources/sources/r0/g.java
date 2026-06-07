package r0;

import W1.q;
import m0.z;

/* loaded from: classes.dex */
public final class g extends Q1.g implements q {

    /* renamed from: f, reason: collision with root package name */
    public int f4634f;
    public /* synthetic */ h2.g g;
    public /* synthetic */ Object[] h;

    /* JADX WARN: Type inference failed for: r0v0, types: [r0.g, Q1.g] */
    @Override // W1.q
    public final Object a(h2.g gVar, Object obj, Object obj2) {
        ?? gVar2 = new Q1.g(3, (O1.d) obj2);
        gVar2.g = gVar;
        gVar2.h = (Object[]) obj;
        return gVar2.k(K1.h.f605a);
    }

    @Override // Q1.b
    public final Object k(Object obj) {
        AbstractC0368c abstractC0368c;
        AbstractC0368c abstractC0368c2;
        P1.a aVar = P1.a.f784b;
        int i3 = this.f4634f;
        if (i3 == 0) {
            z.m0(obj);
            h2.g gVar = this.g;
            AbstractC0368c[] abstractC0368cArr = (AbstractC0368c[]) this.h;
            int length = abstractC0368cArr.length;
            int i4 = 0;
            while (true) {
                abstractC0368c = C0366a.f4629a;
                if (i4 >= length) {
                    abstractC0368c2 = null;
                    break;
                }
                abstractC0368c2 = abstractC0368cArr[i4];
                if (!X1.g.a(abstractC0368c2, abstractC0368c)) {
                    break;
                }
                i4++;
            }
            if (abstractC0368c2 != null) {
                abstractC0368c = abstractC0368c2;
            }
            this.f4634f = 1;
            if (gVar.b(this, abstractC0368c) == aVar) {
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
