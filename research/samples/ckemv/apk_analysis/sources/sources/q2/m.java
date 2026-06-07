package q2;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f4481a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4482b;
    public final p2.c c;

    /* renamed from: d, reason: collision with root package name */
    public final p2.b f4483d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f4484e;

    public m(p2.d dVar, TimeUnit timeUnit) {
        X1.g.e(dVar, "taskRunner");
        this.f4481a = 5;
        this.f4482b = timeUnit.toNanos(5L);
        this.c = dVar.f();
        this.f4483d = new p2.b(this, X.d.j(new StringBuilder(), n2.b.f4253f, " ConnectionPool"));
        this.f4484e = new ConcurrentLinkedQueue();
    }

    public final boolean a(m2.a aVar, i iVar, ArrayList arrayList, boolean z3) {
        X1.g.e(aVar, "address");
        X1.g.e(iVar, "call");
        Iterator it = this.f4484e.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            X1.g.d(lVar, "connection");
            synchronized (lVar) {
                if (z3) {
                    if (lVar.g == null) {
                        continue;
                    }
                }
                if (lVar.h(aVar, arrayList)) {
                    iVar.a(lVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(l lVar, long j3) {
        byte[] bArr = n2.b.f4249a;
        ArrayList arrayList = lVar.f4479p;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i3);
            if (reference.get() != null) {
                i3++;
            } else {
                String str = "A connection to " + lVar.f4468b.f4122a.h + " was leaked. Did you forget to close a response body?";
                u2.n nVar = u2.n.f5043a;
                u2.n.f5043a.j(((g) reference).f4448a, str);
                arrayList.remove(i3);
                lVar.f4473j = true;
                if (arrayList.isEmpty()) {
                    lVar.f4480q = j3 - this.f4482b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final void c(l lVar) {
        byte[] bArr = n2.b.f4249a;
        this.f4484e.add(lVar);
        this.c.c(this.f4483d, 0L);
    }
}
