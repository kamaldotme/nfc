package e1;

import b1.x;
import i1.C0186a;
import i1.C0187b;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends x {

    /* renamed from: d, reason: collision with root package name */
    public static final C0118a f2693d = new C0118a(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2694a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2695b;
    public final Object c;

    public b(b1.l lVar, x xVar, Class cls) {
        this.f2695b = new q(lVar, xVar, cls);
        this.c = cls;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        switch (this.f2694a) {
            case 0:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c0186a.a();
                while (c0186a.J()) {
                    arrayList.add(((x) ((q) this.f2695b).c).a(c0186a));
                }
                c0186a.A();
                int size = arrayList.size();
                Class cls = (Class) this.c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object newInstance = Array.newInstance((Class<?>) cls, size);
                for (int i3 = 0; i3 < size; i3++) {
                    Array.set(newInstance, i3, arrayList.get(i3));
                }
                return newInstance;
            case 1:
                if (c0186a.W() == 9) {
                    c0186a.S();
                    return null;
                }
                Collection collection = (Collection) ((d1.p) this.c).g();
                c0186a.a();
                while (c0186a.J()) {
                    collection.add(((x) ((q) this.f2695b).c).a(c0186a));
                }
                c0186a.A();
                return collection;
            default:
                Object a3 = ((r) this.f2695b).f2736d.a(c0186a);
                if (a3 != null) {
                    Class cls2 = (Class) this.c;
                    if (!cls2.isInstance(a3)) {
                        throw new RuntimeException("Expected a " + cls2.getName() + " but was " + a3.getClass().getName() + "; at path " + c0186a.I(true));
                    }
                }
                return a3;
        }
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        switch (this.f2694a) {
            case 0:
                if (obj == null) {
                    c0187b.J();
                    return;
                }
                c0187b.b();
                int length = Array.getLength(obj);
                for (int i3 = 0; i3 < length; i3++) {
                    ((q) this.f2695b).b(c0187b, Array.get(obj, i3));
                }
                c0187b.A();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c0187b.J();
                    return;
                }
                c0187b.b();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((q) this.f2695b).b(c0187b, it.next());
                }
                c0187b.A();
                return;
            default:
                ((r) this.f2695b).f2736d.b(c0187b, obj);
                return;
        }
    }

    public b(b1.l lVar, Type type, x xVar, d1.p pVar) {
        this.f2695b = new q(lVar, xVar, type);
        this.c = pVar;
    }

    public b(r rVar, Class cls) {
        this.f2695b = rVar;
        this.c = cls;
    }
}
