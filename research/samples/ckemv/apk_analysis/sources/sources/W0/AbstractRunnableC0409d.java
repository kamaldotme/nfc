package w0;

import androidx.work.impl.WorkDatabase;
import f0.C0173i;
import java.util.Iterator;
import java.util.LinkedList;
import v0.C0403c;

/* renamed from: w0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0409d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final v0.l f5149b = new v0.l(5);

    public static void a(n0.s sVar, String str) {
        n0.u b3;
        WorkDatabase workDatabase = sVar.f4209f;
        v0.p u3 = workDatabase.u();
        C0403c f3 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int g = u3.g(str2);
            if (g != 3 && g != 4) {
                WorkDatabase workDatabase2 = u3.f5111a;
                workDatabase2.b();
                v0.h hVar = u3.f5114e;
                C0173i a3 = hVar.a();
                if (str2 == null) {
                    a3.g(1);
                } else {
                    a3.h(str2, 1);
                }
                workDatabase2.c();
                try {
                    a3.b();
                    workDatabase2.p();
                } finally {
                    workDatabase2.k();
                    hVar.p(a3);
                }
            }
            linkedList.addAll(f3.g(str2));
        }
        n0.g gVar = sVar.f4210i;
        synchronized (gVar.f4185k) {
            m0.r.a().getClass();
            gVar.f4183i.add(str);
            b3 = gVar.b(str);
        }
        n0.g.d(b3, 1);
        Iterator it = sVar.h.iterator();
        while (it.hasNext()) {
            ((n0.i) it.next()).a(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        v0.l lVar = this.f5149b;
        try {
            b();
            lVar.h(m0.x.f3987a);
        } catch (Throwable th) {
            lVar.h(new m0.u(th));
        }
    }
}
