package k1;

import j1.C0234d;
import j1.C0238h;
import j1.C0242l;
import j1.C0244n;
import j1.EnumC0231a;
import j1.EnumC0233c;
import j1.EnumC0243m;
import j1.InterfaceC0240j;
import j1.o;
import java.util.List;
import java.util.Map;
import m1.C0331a;
import p1.d;
import v0.e;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323b implements InterfaceC0240j {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[LOOP:0: B:25:0x005c->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r1v4, types: [l1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [l1.a, java.lang.Object] */
    @Override // j1.InterfaceC0240j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0242l a(e eVar, Map map) {
        C0244n[] c0244nArr;
        C0244n[] c0244nArr2;
        C0234d c0234d;
        C0244n[] c0244nArr3;
        List list;
        String str;
        o oVar;
        C0322a a3;
        C0331a c0331a = new C0331a(eVar.e());
        d dVar = null;
        try {
            a3 = c0331a.a(false);
            c0244nArr = a3.f3887b;
        } catch (C0234d e3) {
            e = e3;
            c0244nArr = null;
        } catch (C0238h e4) {
            e = e4;
            c0244nArr = null;
        }
        try {
            c0244nArr2 = c0244nArr;
            c0234d = null;
            dVar = new Object().a(a3);
            e = null;
        } catch (C0234d e5) {
            e = e5;
            c0244nArr2 = c0244nArr;
            c0234d = e;
            e = null;
            if (dVar == null) {
            }
            c0244nArr3 = c0244nArr2;
            if (map != null) {
                while (r9 < r0) {
                }
            }
            EnumC0231a enumC0231a = EnumC0231a.f3459b;
            System.currentTimeMillis();
            C0242l c0242l = new C0242l(dVar.f4336b, dVar.f4335a, c0244nArr3, enumC0231a, 0);
            list = dVar.c;
            if (list != null) {
            }
            str = dVar.f4337d;
            if (str != null) {
            }
            return c0242l;
        } catch (C0238h e6) {
            e = e6;
            c0244nArr2 = c0244nArr;
            c0234d = null;
            if (dVar == null) {
            }
            c0244nArr3 = c0244nArr2;
            if (map != null) {
            }
            EnumC0231a enumC0231a2 = EnumC0231a.f3459b;
            System.currentTimeMillis();
            C0242l c0242l2 = new C0242l(dVar.f4336b, dVar.f4335a, c0244nArr3, enumC0231a2, 0);
            list = dVar.c;
            if (list != null) {
            }
            str = dVar.f4337d;
            if (str != null) {
            }
            return c0242l2;
        }
        if (dVar == null) {
            try {
                C0322a a4 = c0331a.a(true);
                c0244nArr2 = a4.f3887b;
                dVar = new Object().a(a4);
            } catch (C0234d | C0238h e7) {
                if (e != null) {
                    throw e;
                }
                if (c0234d != null) {
                    throw c0234d;
                }
                throw e7;
            }
        }
        c0244nArr3 = c0244nArr2;
        if (map != null && (oVar = (o) map.get(EnumC0233c.f3480k)) != null) {
            for (C0244n c0244n : c0244nArr3) {
                oVar.a(c0244n);
            }
        }
        EnumC0231a enumC0231a22 = EnumC0231a.f3459b;
        System.currentTimeMillis();
        C0242l c0242l22 = new C0242l(dVar.f4336b, dVar.f4335a, c0244nArr3, enumC0231a22, 0);
        list = dVar.c;
        if (list != null) {
            c0242l22.b(EnumC0243m.c, list);
        }
        str = dVar.f4337d;
        if (str != null) {
            c0242l22.b(EnumC0243m.f3498d, str);
        }
        return c0242l22;
    }

    @Override // j1.InterfaceC0240j
    public final C0242l b(e eVar) {
        return a(eVar, null);
    }

    @Override // j1.InterfaceC0240j
    public final void c() {
    }
}
