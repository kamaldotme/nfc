package e1;

import b1.x;
import g1.AbstractC0178c;
import i1.C0186a;
import i1.C0187b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.z;

/* loaded from: classes.dex */
public abstract class m extends x {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2723a;

    public m(LinkedHashMap linkedHashMap) {
        this.f2723a = linkedHashMap;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        if (c0186a.W() == 9) {
            c0186a.S();
            return null;
        }
        Object c = c();
        try {
            c0186a.b();
            while (c0186a.J()) {
                l lVar = (l) this.f2723a.get(c0186a.Q());
                if (lVar != null && lVar.f2716e) {
                    e(c, c0186a, lVar);
                }
                c0186a.c0();
            }
            c0186a.D();
            return d(c);
        } catch (IllegalAccessException e3) {
            z zVar = AbstractC0178c.f3037a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        } catch (IllegalStateException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        if (obj == null) {
            c0187b.J();
            return;
        }
        c0187b.i();
        try {
            Iterator it = this.f2723a.values().iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(c0187b, obj);
            }
            c0187b.D();
        } catch (IllegalAccessException e3) {
            z zVar = AbstractC0178c.f3037a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, C0186a c0186a, l lVar);
}
