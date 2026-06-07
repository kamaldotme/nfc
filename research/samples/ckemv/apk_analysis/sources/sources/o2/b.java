package o2;

import X1.g;
import d2.d;
import d2.l;
import java.util.ArrayList;
import k.C0306s;
import m2.c;
import m2.j;
import m2.m;
import m2.p;
import m2.q;
import m2.r;
import m2.s;
import q2.i;
import r2.f;
import v0.e;

/* loaded from: classes.dex */
public final class b implements m {
    @Override // m2.m
    public final r a(f fVar) {
        String str;
        j jVar;
        String str2;
        System.currentTimeMillis();
        C0306s c0306s = fVar.f4660e;
        g.e(c0306s, "request");
        e eVar = new e(c0306s, 6, (Object) null);
        c cVar = (c) c0306s.g;
        if (cVar == null) {
            int i3 = c.f4006n;
            cVar = v0.f.H((j) c0306s.f3772d);
            c0306s.g = cVar;
        }
        if (cVar.f4013j) {
            eVar = new e((Object) null, 6, (Object) null);
        }
        i iVar = fVar.f4657a;
        i iVar2 = iVar instanceof i ? iVar : null;
        if (iVar2 != null) {
            m2.b bVar = iVar2.f4453f;
        }
        C0306s c0306s2 = (C0306s) eVar.f5071b;
        r rVar = (r) eVar.c;
        if (c0306s2 == null && rVar == null) {
            q qVar = new q();
            qVar.f4100a = c0306s;
            qVar.f4101b = p.HTTP_1_1;
            qVar.c = 504;
            qVar.f4102d = "Unsatisfiable Request (only-if-cached)";
            qVar.g = n2.b.c;
            qVar.f4107k = -1L;
            qVar.f4108l = System.currentTimeMillis();
            r a3 = qVar.a();
            g.e(iVar, "call");
            return a3;
        }
        if (c0306s2 == null) {
            g.b(rVar);
            q b3 = rVar.b();
            r a4 = a.a(rVar);
            q.b("cacheResponse", a4);
            b3.f4105i = a4;
            r a5 = b3.a();
            g.e(iVar, "call");
            return a5;
        }
        if (rVar != null) {
            g.e(iVar, "call");
        }
        r b4 = fVar.b(c0306s2);
        String str3 = "networkResponse";
        if (rVar == null) {
            str = "networkResponse";
        } else {
            if (b4.f4112e == 304) {
                q b5 = rVar.b();
                ArrayList arrayList = new ArrayList(20);
                j jVar2 = rVar.g;
                int size = jVar2.size();
                int i4 = 0;
                while (true) {
                    jVar = b4.g;
                    if (i4 >= size) {
                        break;
                    }
                    String b6 = jVar2.b(i4);
                    int i5 = size;
                    String d3 = jVar2.d(i4);
                    j jVar3 = jVar2;
                    if (l.Q("Warning", b6)) {
                        str2 = str3;
                        if (l.V(d3, "1", false)) {
                            i4++;
                            size = i5;
                            jVar2 = jVar3;
                            str3 = str2;
                        }
                    } else {
                        str2 = str3;
                    }
                    if (l.Q("Content-Length", b6) || l.Q("Content-Encoding", b6) || l.Q("Content-Type", b6) || !a.b(b6) || jVar.a(b6) == null) {
                        g.e(b6, "name");
                        g.e(d3, "value");
                        arrayList.add(b6);
                        arrayList.add(d.n0(d3).toString());
                    }
                    i4++;
                    size = i5;
                    jVar2 = jVar3;
                    str3 = str2;
                }
                String str4 = str3;
                int size2 = jVar.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String b7 = jVar.b(i6);
                    if (!l.Q("Content-Length", b7) && !l.Q("Content-Encoding", b7) && !l.Q("Content-Type", b7) && a.b(b7)) {
                        String d4 = jVar.d(i6);
                        g.e(b7, "name");
                        g.e(d4, "value");
                        arrayList.add(b7);
                        arrayList.add(d.n0(d4).toString());
                    }
                }
                b5.f4104f = new j((String[]) arrayList.toArray(new String[0])).c();
                b5.f4107k = b4.f4117l;
                b5.f4108l = b4.f4118m;
                r a6 = a.a(rVar);
                q.b("cacheResponse", a6);
                b5.f4105i = a6;
                r a7 = a.a(b4);
                q.b(str4, a7);
                b5.h = a7;
                b5.a();
                s sVar = b4.h;
                g.b(sVar);
                sVar.close();
                g.b(null);
                throw null;
            }
            str = "networkResponse";
            s sVar2 = rVar.h;
            if (sVar2 != null) {
                n2.b.c(sVar2);
            }
        }
        q b8 = b4.b();
        r a8 = a.a(rVar);
        q.b("cacheResponse", a8);
        b8.f4105i = a8;
        r a9 = a.a(b4);
        q.b(str, a9);
        b8.h = a9;
        return b8.a();
    }
}
