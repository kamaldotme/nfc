package n0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.C0329a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4193a = 0;

    static {
        m0.r.b("Schedulers");
    }

    public static void a(v0.p pVar, m0.r rVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            rVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pVar.k(((v0.o) it.next()).f5091a, currentTimeMillis);
            }
        }
    }

    public static void b(C0329a c0329a, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        v0.p u3 = workDatabase.u();
        workDatabase.c();
        try {
            ArrayList d3 = u3.d();
            a(u3, c0329a.c, d3);
            ArrayList c = u3.c(c0329a.f3958i);
            a(u3, c0329a.c, c);
            c.addAll(d3);
            ArrayList b3 = u3.b();
            workDatabase.p();
            workDatabase.k();
            if (c.size() > 0) {
                v0.o[] oVarArr = (v0.o[]) c.toArray(new v0.o[c.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.b()) {
                        iVar.e(oVarArr);
                    }
                }
            }
            if (b3.size() > 0) {
                v0.o[] oVarArr2 = (v0.o[]) b3.toArray(new v0.o[b3.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    if (!iVar2.b()) {
                        iVar2.e(oVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
