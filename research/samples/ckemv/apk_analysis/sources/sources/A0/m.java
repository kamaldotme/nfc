package a0;

import a.AbstractC0059a;
import androidx.work.impl.WorkDatabase;
import f0.C0173i;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.A;
import v0.o;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public Object f1422a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1423b;
    public Object c;

    public m(WorkDatabase workDatabase) {
        X1.g.e(workDatabase, "database");
        this.f1422a = workDatabase;
        this.f1423b = new AtomicBoolean(false);
        this.c = AbstractC0059a.A(new l(0, this));
    }

    public static boolean o(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean q(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public C0173i a() {
        ((WorkDatabase) this.f1422a).a();
        return ((AtomicBoolean) this.f1423b).compareAndSet(false, true) ? (C0173i) ((K1.f) this.c).a() : m();
    }

    public A b() {
        A c = c();
        m0.d dVar = ((o) this.f1423b).f5097j;
        boolean z3 = (dVar.h.isEmpty() ^ true) || dVar.f3966d || dVar.f3965b || dVar.c;
        o oVar = (o) this.f1423b;
        if (oVar.f5104q) {
            if (!(!z3)) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
            }
            if (oVar.g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
            }
        }
        UUID randomUUID = UUID.randomUUID();
        X1.g.d(randomUUID, "randomUUID()");
        this.f1422a = randomUUID;
        String uuid = randomUUID.toString();
        X1.g.d(uuid, "id.toString()");
        o oVar2 = (o) this.f1423b;
        X1.g.e(oVar2, "other");
        this.f1423b = new o(uuid, oVar2.f5092b, oVar2.c, oVar2.f5093d, new m0.g(oVar2.f5094e), new m0.g(oVar2.f5095f), oVar2.g, oVar2.h, oVar2.f5096i, new m0.d(oVar2.f5097j), oVar2.f5098k, oVar2.f5099l, oVar2.f5100m, oVar2.f5101n, oVar2.f5102o, oVar2.f5103p, oVar2.f5104q, oVar2.f5105r, oVar2.f5106s, oVar2.f5108u, oVar2.f5109v, oVar2.f5110w, 524288);
        return c;
    }

    public abstract A c();

    public abstract void d();

    public abstract Object e(int i3, int i4);

    public abstract Map f();

    public abstract int g();

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj, Object obj2);

    public abstract void k(int i3);

    public abstract Object l(int i3, Object obj);

    public C0173i m() {
        String n3 = n();
        WorkDatabase workDatabase = (WorkDatabase) this.f1422a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().s().i(n3);
    }

    public abstract String n();

    public void p(C0173i c0173i) {
        X1.g.e(c0173i, "statement");
        if (c0173i == ((C0173i) ((K1.f) this.c).a())) {
            ((AtomicBoolean) this.f1423b).set(false);
        }
    }

    public Object[] r(int i3, Object[] objArr) {
        int g = g();
        if (objArr.length < g) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), g);
        }
        for (int i4 = 0; i4 < g; i4++) {
            objArr[i4] = e(i4, i3);
        }
        if (objArr.length > g) {
            objArr[g] = null;
        }
        return objArr;
    }
}
