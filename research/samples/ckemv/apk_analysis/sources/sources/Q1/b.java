package Q1;

import O1.i;
import e2.C0124f;
import j2.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.z;

/* loaded from: classes.dex */
public abstract class b implements O1.d, c, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final O1.d f821b;
    public final i c;

    /* renamed from: d, reason: collision with root package name */
    public transient O1.d f822d;

    public b(O1.d dVar) {
        i j3 = dVar != null ? dVar.j() : null;
        this.f821b = dVar;
        this.c = j3;
    }

    public O1.d b(O1.d dVar, Object obj) {
        X1.g.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // O1.d
    public final void c(Object obj) {
        O1.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            O1.d dVar2 = bVar.f821b;
            X1.g.b(dVar2);
            try {
                obj = bVar.k(obj);
                if (obj == P1.a.f784b) {
                    return;
                }
            } catch (Throwable th) {
                obj = z.q(th);
            }
            bVar.l();
            if (!(dVar2 instanceof b)) {
                dVar2.c(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // Q1.c
    public final c f() {
        O1.d dVar = this.f821b;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    public final StackTraceElement i() {
        int i3;
        String str;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v3 = dVar.v();
        if (v3 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i4 = i3 >= 0 ? dVar.l()[i3] : -1;
        e eVar = f.f826b;
        e eVar2 = f.f825a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f826b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f826b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2) {
            Method method = eVar.f823a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = eVar.f824b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = eVar.c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = dVar.c();
        } else {
            str = str2 + '/' + dVar.c();
        }
        return new StackTraceElement(str, dVar.m(), dVar.f(), i4);
    }

    @Override // O1.d
    public final i j() {
        i iVar = this.c;
        X1.g.b(iVar);
        return iVar;
    }

    public abstract Object k(Object obj);

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O1.d dVar = this.f822d;
        if (dVar != null && dVar != this) {
            i iVar = this.c;
            X1.g.b(iVar);
            O1.g A3 = iVar.A(O1.e.f781b);
            X1.g.b(A3);
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f3518i;
            } while (atomicReferenceFieldUpdater.get(hVar) == j2.a.f3509d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0124f c0124f = obj instanceof C0124f ? (C0124f) obj : null;
            if (c0124f != null) {
                c0124f.o();
            }
        }
        this.f822d = a.f820b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object i3 = i();
        if (i3 == null) {
            i3 = getClass().getName();
        }
        sb.append(i3);
        return sb.toString();
    }
}
