package z0;

import L1.k;
import X1.g;
import a0.j;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import m0.r;
import u2.d;
import v0.i;
import v0.l;
import v0.o;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5313a = 0;

    static {
        g.d(r.b("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(l lVar, v0.r rVar, i iVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            v0.g i3 = iVar.i(d.k(oVar));
            Integer valueOf = i3 != null ? Integer.valueOf(i3.c) : null;
            lVar.getClass();
            j a3 = j.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            String str = oVar.f5091a;
            if (str == null) {
                a3.g(1);
            } else {
                a3.h(str, 1);
            }
            WorkDatabase workDatabase = (WorkDatabase) lVar.f5083d;
            workDatabase.b();
            Cursor n3 = workDatabase.n(a3, null);
            try {
                ArrayList arrayList2 = new ArrayList(n3.getCount());
                while (n3.moveToNext()) {
                    arrayList2.add(n3.isNull(0) ? null : n3.getString(0));
                }
                n3.close();
                a3.o();
                sb.append("\n" + str + "\t " + oVar.c + "\t " + valueOf + "\t " + X.d.s(oVar.f5092b) + "\t " + k.W(arrayList2, ",", null, null, null, 62) + "\t " + k.W(rVar.t(str), ",", null, null, null, 62) + '\t');
            } catch (Throwable th) {
                n3.close();
                a3.o();
                throw th;
            }
        }
        g.d(sb.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
