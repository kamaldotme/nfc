package e1;

import b1.x;
import c1.InterfaceC0111b;
import com.google.gson.reflect.TypeToken;
import i1.C0186a;
import i1.C0187b;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.security.AccessController;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2732a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2733b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2734d;

    public q(b1.l lVar, x xVar, Type type) {
        this.f2732a = 0;
        this.f2733b = lVar;
        this.c = xVar;
        this.f2734d = type;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        switch (this.f2732a) {
            case 0:
                return ((x) this.c).a(c0186a);
            default:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                String U2 = c0186a.U();
                Enum r02 = (Enum) ((HashMap) this.f2733b).get(U2);
                return r02 == null ? (Enum) ((HashMap) this.c).get(U2) : r02;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if ((r1 instanceof e1.m) != false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.reflect.Type] */
    @Override // b1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0187b c0187b, Object obj) {
        switch (this.f2732a) {
            case 0:
                ?? r02 = (Type) this.f2734d;
                Class<?> cls = (obj == null || !((r02 instanceof Class) || (r02 instanceof TypeVariable))) ? r02 : obj.getClass();
                x xVar = (x) this.c;
                if (cls != r02) {
                    x d3 = ((b1.l) this.f2733b).d(TypeToken.get((Type) cls));
                    if (d3 instanceof m) {
                        x xVar2 = xVar;
                        while (xVar2 instanceof b1.k) {
                            x xVar3 = ((b1.k) xVar2).f2223a;
                            if (xVar3 == null) {
                                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                            }
                            if (xVar3 == xVar2) {
                                break;
                            } else {
                                xVar2 = xVar3;
                            }
                        }
                    }
                    xVar = d3;
                }
                xVar.b(c0187b, obj);
                return;
            default:
                Enum r6 = (Enum) obj;
                c0187b.Q(r6 == null ? null : (String) ((HashMap) this.f2734d).get(r6));
                return;
        }
    }

    public q(Class cls) {
        this.f2732a = 1;
        this.f2733b = new HashMap();
        this.c = new HashMap();
        this.f2734d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new t(cls))) {
                Enum r4 = (Enum) field.get(null);
                String name = r4.name();
                String str = r4.toString();
                InterfaceC0111b interfaceC0111b = (InterfaceC0111b) field.getAnnotation(InterfaceC0111b.class);
                if (interfaceC0111b != null) {
                    name = interfaceC0111b.value();
                    for (String str2 : interfaceC0111b.alternate()) {
                        ((HashMap) this.f2733b).put(str2, r4);
                    }
                }
                ((HashMap) this.f2733b).put(name, r4);
                ((HashMap) this.c).put(str, r4);
                ((HashMap) this.f2734d).put(r4, name);
            }
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
