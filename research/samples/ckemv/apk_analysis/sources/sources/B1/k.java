package b1;

import i1.C0186a;
import i1.C0187b;

/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: a, reason: collision with root package name */
    public x f2223a;

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        x xVar = this.f2223a;
        if (xVar != null) {
            return xVar.a(c0186a);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        x xVar = this.f2223a;
        if (xVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        xVar.b(c0187b, obj);
    }
}
