package e1;

import b1.x;
import i1.C0186a;
import i1.C0187b;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends x {

    /* renamed from: a, reason: collision with root package name */
    public final q f2704a;

    /* renamed from: b, reason: collision with root package name */
    public final q f2705b;
    public final d1.p c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f2706d;

    public g(h hVar, b1.l lVar, Type type, x xVar, Type type2, x xVar2, d1.p pVar) {
        this.f2706d = hVar;
        this.f2704a = new q(lVar, xVar, type);
        this.f2705b = new q(lVar, xVar2, type2);
        this.c = pVar;
    }

    @Override // b1.x
    public final Object a(C0186a c0186a) {
        int W2 = c0186a.W();
        if (W2 == 9) {
            c0186a.S();
            return null;
        }
        Map map = (Map) this.c.g();
        q qVar = this.f2705b;
        q qVar2 = this.f2704a;
        if (W2 == 1) {
            c0186a.a();
            while (c0186a.J()) {
                c0186a.a();
                Object a3 = ((x) qVar2.c).a(c0186a);
                if (map.put(a3, ((x) qVar.c).a(c0186a)) != null) {
                    throw new RuntimeException("duplicate key: " + a3);
                }
                c0186a.A();
            }
            c0186a.A();
        } else {
            c0186a.b();
            while (c0186a.J()) {
                d1.e.c.getClass();
                int i3 = c0186a.f3183i;
                if (i3 == 0) {
                    i3 = c0186a.o();
                }
                if (i3 == 13) {
                    c0186a.f3183i = 9;
                } else if (i3 == 12) {
                    c0186a.f3183i = 8;
                } else {
                    if (i3 != 14) {
                        throw new IllegalStateException("Expected a name but was " + X.d.x(c0186a.W()) + c0186a.L());
                    }
                    c0186a.f3183i = 10;
                }
                Object a4 = ((x) qVar2.c).a(c0186a);
                if (map.put(a4, ((x) qVar.c).a(c0186a)) != null) {
                    throw new RuntimeException("duplicate key: " + a4);
                }
            }
            c0186a.D();
        }
        return map;
    }

    @Override // b1.x
    public final void b(C0187b c0187b, Object obj) {
        String str;
        Map map = (Map) obj;
        if (map == null) {
            c0187b.J();
            return;
        }
        boolean z3 = this.f2706d.c;
        q qVar = this.f2705b;
        if (!z3) {
            c0187b.i();
            for (Map.Entry entry : map.entrySet()) {
                c0187b.G(String.valueOf(entry.getKey()));
                qVar.b(c0187b, entry.getValue());
            }
            c0187b.D();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i3 = 0;
        boolean z4 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            q qVar2 = this.f2704a;
            qVar2.getClass();
            try {
                f fVar = new f();
                qVar2.b(fVar, key);
                ArrayList arrayList3 = fVar.f2701m;
                if (!arrayList3.isEmpty()) {
                    throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                }
                b1.n nVar = fVar.f2703o;
                arrayList.add(nVar);
                arrayList2.add(entry2.getValue());
                nVar.getClass();
                z4 |= (nVar instanceof b1.m) || (nVar instanceof b1.q);
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
        if (z4) {
            c0187b.b();
            int size = arrayList.size();
            while (i3 < size) {
                c0187b.b();
                u.f2765z.b(c0187b, (b1.n) arrayList.get(i3));
                qVar.b(c0187b, arrayList2.get(i3));
                c0187b.A();
                i3++;
            }
            c0187b.A();
            return;
        }
        c0187b.i();
        int size2 = arrayList.size();
        while (i3 < size2) {
            b1.n nVar2 = (b1.n) arrayList.get(i3);
            nVar2.getClass();
            boolean z5 = nVar2 instanceof b1.r;
            if (z5) {
                if (!z5) {
                    throw new IllegalStateException("Not a JSON Primitive: " + nVar2);
                }
                b1.r rVar = (b1.r) nVar2;
                Serializable serializable = rVar.f2232b;
                if (serializable instanceof Number) {
                    str = String.valueOf(rVar.a());
                } else if (serializable instanceof Boolean) {
                    str = Boolean.toString(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(rVar.b()));
                } else {
                    if (!(serializable instanceof String)) {
                        throw new AssertionError();
                    }
                    str = rVar.b();
                }
            } else {
                if (!(nVar2 instanceof b1.p)) {
                    throw new AssertionError();
                }
                str = "null";
            }
            c0187b.G(str);
            qVar.b(c0187b, arrayList2.get(i3));
            i3++;
        }
        c0187b.D();
    }
}
