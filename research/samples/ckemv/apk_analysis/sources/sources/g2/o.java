package g2;

import e2.l0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o extends d {

    /* renamed from: m, reason: collision with root package name */
    public final int f3076m;

    public o(int i3, int i4, W1.l lVar) {
        super(i3, lVar);
        String str;
        this.f3076m = i4;
        if (i4 != 1) {
            if (i3 < 1) {
                throw new IllegalArgumentException(X.d.g("Buffered channel capacity must be at least 1, but ", i3, " was specified").toString());
            }
            return;
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        X1.k.f1143a.getClass();
        new X1.d(d.class);
        String str2 = null;
        if (!d.class.isAnonymousClass()) {
            if (d.class.isLocalClass()) {
                String simpleName = d.class.getSimpleName();
                Method enclosingMethod = d.class.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = d.class.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int b02 = d2.d.b0(simpleName, '$', 0, false, 6);
                        if (b02 != -1) {
                            simpleName = simpleName.substring(b02 + 1, simpleName.length());
                            X1.g.d(simpleName, "substring(...)");
                        }
                        str2 = simpleName;
                    } else {
                        str2 = d2.d.k0(simpleName, enclosingConstructor.getName() + '$');
                    }
                } else {
                    str2 = d2.d.k0(simpleName, enclosingMethod.getName() + '$');
                }
            } else {
                boolean isArray = d.class.isArray();
                LinkedHashMap linkedHashMap = X1.d.c;
                if (isArray) {
                    Class<?> componentType = d.class.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        str2 = str.concat("Array");
                    }
                    if (str2 == null) {
                        str2 = "Array";
                    }
                } else {
                    str2 = (String) linkedHashMap.get(d.class.getName());
                    if (str2 == null) {
                        str2 = d.class.getSimpleName();
                    }
                }
            }
        }
        throw new IllegalArgumentException(X.d.j(sb, str2, " instead").toString());
    }

    public final Object I(Object obj, boolean z3) {
        l lVar;
        W1.l lVar2;
        K1.b b3;
        K1.h hVar = K1.h.f605a;
        if (this.f3076m == 3) {
            Object l3 = super.l(obj);
            if ((!(l3 instanceof j)) || (l3 instanceof i)) {
                return l3;
            }
            if (!z3 || (lVar2 = this.c) == null || (b3 = j2.a.b(lVar2, obj, null)) == null) {
                return hVar;
            }
            throw b3;
        }
        d1.p pVar = f.f3055d;
        l lVar3 = (l) d.h.get(this);
        while (true) {
            long andIncrement = d.f3044d.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean v3 = v(andIncrement, false);
            int i3 = f.f3054b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (lVar3.f3540d != j5) {
                l b4 = d.b(this, j5, lVar3);
                if (b4 != null) {
                    lVar = b4;
                } else if (v3) {
                    return new i(s());
                }
            } else {
                lVar = lVar3;
            }
            int f3 = d.f(this, lVar, i4, obj, j3, pVar, v3);
            if (f3 == 0) {
                lVar.a();
                return hVar;
            }
            if (f3 == 1) {
                return hVar;
            }
            if (f3 == 2) {
                if (v3) {
                    lVar.h();
                    return new i(s());
                }
                l0 l0Var = pVar instanceof l0 ? (l0) pVar : null;
                if (l0Var != null) {
                    l0Var.a(lVar, i4 + i3);
                }
                o((lVar.f3540d * j4) + i4);
                return hVar;
            }
            if (f3 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (f3 == 4) {
                if (j3 < d.f3045e.get(this)) {
                    lVar.a();
                }
                return new i(s());
            }
            if (f3 == 5) {
                lVar.a();
            }
            lVar3 = lVar;
        }
    }

    @Override // g2.d, g2.u
    public final Object g(O1.d dVar, Object obj) {
        K1.b b3;
        if (!(I(obj, true) instanceof i)) {
            return K1.h.f605a;
        }
        W1.l lVar = this.c;
        if (lVar == null || (b3 = j2.a.b(lVar, obj, null)) == null) {
            throw s();
        }
        v0.f.h(b3, s());
        throw b3;
    }

    @Override // g2.d, g2.u
    public final Object l(Object obj) {
        return I(obj, false);
    }

    @Override // g2.d
    public final boolean w() {
        return this.f3076m == 2;
    }
}
