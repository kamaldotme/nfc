package e1;

import g1.AbstractC0178c;
import i1.C0186a;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class n extends m {

    /* renamed from: b, reason: collision with root package name */
    public final d1.p f2724b;

    public n(d1.p pVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f2724b = pVar;
    }

    @Override // e1.m
    public final Object c() {
        return this.f2724b.g();
    }

    @Override // e1.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // e1.m
    public final void e(Object obj, C0186a c0186a, l lVar) {
        Object a3 = lVar.f2718i.a(c0186a);
        if (a3 == null && lVar.f2721l) {
            return;
        }
        boolean z3 = lVar.f2717f;
        Field field = lVar.f2714b;
        if (z3) {
            p.b(obj, field);
        } else if (lVar.f2722m) {
            throw new RuntimeException("Cannot set value of 'static final' " + AbstractC0178c.d(field, false));
        }
        field.set(obj, a3);
    }
}
