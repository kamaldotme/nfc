package n0;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import f.ExecutorC0145B;
import f.ExecutorC0146C;
import f0.C0173i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m0.B;
import m0.C0329a;
import u0.InterfaceC0391a;
import v0.C0403c;
import x0.C0432k;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f4220s = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4221b;
    public final String c;

    /* renamed from: d, reason: collision with root package name */
    public final v0.o f4222d;

    /* renamed from: e, reason: collision with root package name */
    public m0.q f4223e;

    /* renamed from: f, reason: collision with root package name */
    public final v0.i f4224f;
    public final C0329a h;

    /* renamed from: i, reason: collision with root package name */
    public final m0.r f4225i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0391a f4226j;

    /* renamed from: k, reason: collision with root package name */
    public final WorkDatabase f4227k;

    /* renamed from: l, reason: collision with root package name */
    public final v0.p f4228l;

    /* renamed from: m, reason: collision with root package name */
    public final C0403c f4229m;

    /* renamed from: n, reason: collision with root package name */
    public final List f4230n;

    /* renamed from: o, reason: collision with root package name */
    public String f4231o;
    public m0.p g = new m0.m();

    /* renamed from: p, reason: collision with root package name */
    public final C0432k f4232p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public final C0432k f4233q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public volatile int f4234r = -256;

    static {
        m0.r.b("WorkerWrapper");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [x0.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [x0.k, java.lang.Object] */
    public u(t tVar) {
        this.f4221b = tVar.f4215a;
        this.f4224f = tVar.c;
        this.f4226j = tVar.f4216b;
        v0.o oVar = tVar.f4219f;
        this.f4222d = oVar;
        this.c = oVar.f5091a;
        this.f4223e = null;
        C0329a c0329a = tVar.f4217d;
        this.h = c0329a;
        this.f4225i = c0329a.c;
        WorkDatabase workDatabase = tVar.f4218e;
        this.f4227k = workDatabase;
        this.f4228l = workDatabase.u();
        this.f4229m = workDatabase.f();
        this.f4230n = tVar.g;
    }

    public final void a(m0.p pVar) {
        boolean z3 = pVar instanceof m0.o;
        v0.o oVar = this.f4222d;
        if (!z3) {
            if (pVar instanceof m0.n) {
                m0.r.a().getClass();
                c();
                return;
            }
            m0.r.a().getClass();
            if (oVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        m0.r.a().getClass();
        if (oVar.c()) {
            d();
            return;
        }
        C0403c c0403c = this.f4229m;
        String str = this.c;
        v0.p pVar2 = this.f4228l;
        WorkDatabase workDatabase = this.f4227k;
        workDatabase.c();
        try {
            pVar2.o(str, 3);
            pVar2.n(str, ((m0.o) this.g).f3979a);
            this.f4225i.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = c0403c.g(str).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (pVar2.g(str2) == 5 && c0403c.h(str2)) {
                    m0.r.a().getClass();
                    pVar2.o(str2, 1);
                    pVar2.m(str2, currentTimeMillis);
                }
            }
            workDatabase.p();
            workDatabase.k();
            e(false);
        } catch (Throwable th) {
            workDatabase.k();
            e(false);
            throw th;
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.f4227k.c();
        try {
            int g = this.f4228l.g(this.c);
            this.f4227k.t().f(this.c);
            if (g == 0) {
                e(false);
            } else if (g == 2) {
                a(this.g);
            } else if (!X.d.d(g)) {
                this.f4234r = -512;
                c();
            }
            this.f4227k.p();
            this.f4227k.k();
        } catch (Throwable th) {
            this.f4227k.k();
            throw th;
        }
    }

    public final void c() {
        String str = this.c;
        v0.p pVar = this.f4228l;
        WorkDatabase workDatabase = this.f4227k;
        workDatabase.c();
        try {
            pVar.o(str, 1);
            this.f4225i.getClass();
            pVar.m(str, System.currentTimeMillis());
            pVar.l(str, this.f4222d.f5109v);
            pVar.k(str, -1L);
            workDatabase.p();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.c;
        v0.p pVar = this.f4228l;
        WorkDatabase workDatabase = this.f4227k;
        workDatabase.c();
        try {
            this.f4225i.getClass();
            pVar.m(str, System.currentTimeMillis());
            WorkDatabase workDatabase2 = pVar.f5111a;
            pVar.o(str, 1);
            workDatabase2.b();
            v0.h hVar = pVar.f5117j;
            C0173i a3 = hVar.a();
            if (str == null) {
                a3.g(1);
            } else {
                a3.h(str, 1);
            }
            workDatabase2.c();
            try {
                a3.b();
                workDatabase2.p();
                workDatabase2.k();
                hVar.p(a3);
                pVar.l(str, this.f4222d.f5109v);
                workDatabase2.b();
                v0.h hVar2 = pVar.f5115f;
                C0173i a4 = hVar2.a();
                if (str == null) {
                    a4.g(1);
                } else {
                    a4.h(str, 1);
                }
                workDatabase2.c();
                try {
                    a4.b();
                    workDatabase2.p();
                    workDatabase2.k();
                    hVar2.p(a4);
                    pVar.k(str, -1L);
                    workDatabase.p();
                } catch (Throwable th) {
                    workDatabase2.k();
                    hVar2.p(a4);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase2.k();
                hVar.p(a3);
                throw th2;
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0045, B:15:0x005e, B:22:0x0072, B:23:0x0078, B:5:0x001f, B:7:0x0026), top: B:2:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0045, B:15:0x005e, B:22:0x0072, B:23:0x0078, B:5:0x001f, B:7:0x0026), top: B:2:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z3) {
        boolean z4;
        this.f4227k.c();
        try {
            v0.p u3 = this.f4227k.u();
            u3.getClass();
            a0.j a3 = a0.j.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            WorkDatabase workDatabase = u3.f5111a;
            workDatabase.b();
            Cursor n3 = workDatabase.n(a3, null);
            try {
                if (n3.moveToFirst()) {
                    if (n3.getInt(0) != 0) {
                        z4 = true;
                        if (!z4) {
                            w0.m.a(this.f4221b, RescheduleReceiver.class, false);
                        }
                        if (z3) {
                            this.f4228l.o(this.c, 1);
                            this.f4228l.p(this.c, this.f4234r);
                            this.f4228l.k(this.c, -1L);
                        }
                        this.f4227k.p();
                        this.f4227k.k();
                        this.f4232p.j(Boolean.valueOf(z3));
                    }
                }
                z4 = false;
                if (!z4) {
                }
                if (z3) {
                }
                this.f4227k.p();
                this.f4227k.k();
                this.f4232p.j(Boolean.valueOf(z3));
            } finally {
                n3.close();
                a3.o();
            }
        } catch (Throwable th) {
            this.f4227k.k();
            throw th;
        }
    }

    public final void f() {
        if (this.f4228l.g(this.c) == 2) {
            m0.r.a().getClass();
            e(true);
        } else {
            m0.r.a().getClass();
            e(false);
        }
    }

    public final void g() {
        String str = this.c;
        WorkDatabase workDatabase = this.f4227k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                v0.p pVar = this.f4228l;
                if (isEmpty) {
                    m0.g gVar = ((m0.m) this.g).f3978a;
                    pVar.l(str, this.f4222d.f5109v);
                    pVar.n(str, gVar);
                    workDatabase.p();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (pVar.g(str2) != 6) {
                    pVar.o(str2, 4);
                }
                linkedList.addAll(this.f4229m.g(str2));
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f4234r == -256) {
            return false;
        }
        m0.r.a().getClass();
        if (this.f4228l.g(this.c) == 0) {
            e(false);
        } else {
            e(!X.d.d(r0));
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        m0.j jVar;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.c;
        sb.append(str);
        sb.append(", tags={ ");
        List<String> list = this.f4230n;
        boolean z4 = true;
        for (String str2 : list) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f4231o = sb.toString();
        v0.o oVar = this.f4222d;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f4227k;
        workDatabase.c();
        try {
            if (oVar.f5092b == 1) {
                if (oVar.c() || (oVar.f5092b == 1 && oVar.f5098k > 0)) {
                    this.f4225i.getClass();
                    if (System.currentTimeMillis() < oVar.a()) {
                        m0.r.a().getClass();
                        e(true);
                        workDatabase.p();
                    }
                }
                workDatabase.p();
                workDatabase.k();
                boolean c = oVar.c();
                m0.g gVar = oVar.f5094e;
                v0.p pVar = this.f4228l;
                C0329a c0329a = this.h;
                if (!c) {
                    c0329a.f3956e.getClass();
                    String str3 = oVar.f5093d;
                    X1.g.e(str3, "className");
                    int i3 = m0.k.f3976a;
                    try {
                        Object newInstance = Class.forName(str3).getDeclaredConstructor(null).newInstance(null);
                        X1.g.c(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                        jVar = (m0.j) newInstance;
                    } catch (Exception unused) {
                        m0.r.a().getClass();
                        jVar = null;
                    }
                    if (jVar == null) {
                        m0.r.a().getClass();
                        g();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(gVar);
                    pVar.getClass();
                    a0.j a3 = a0.j.a("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                    if (str == null) {
                        a3.g(1);
                    } else {
                        a3.h(str, 1);
                    }
                    WorkDatabase workDatabase2 = pVar.f5111a;
                    workDatabase2.b();
                    Cursor n3 = workDatabase2.n(a3, null);
                    try {
                        ArrayList arrayList2 = new ArrayList(n3.getCount());
                        while (n3.moveToNext()) {
                            arrayList2.add(m0.g.a(n3.isNull(0) ? null : n3.getBlob(0)));
                        }
                        n3.close();
                        a3.o();
                        arrayList.addAll(arrayList2);
                        gVar = jVar.a(arrayList);
                    } catch (Throwable th) {
                        n3.close();
                        a3.o();
                        throw th;
                    }
                }
                UUID fromString = UUID.fromString(str);
                ExecutorService executorService = c0329a.f3953a;
                InterfaceC0391a interfaceC0391a = this.f4226j;
                v0.i iVar = this.f4224f;
                w0.t tVar = new w0.t(workDatabase, interfaceC0391a, iVar);
                ?? obj = new Object();
                obj.f2185a = fromString;
                obj.f2186b = gVar;
                new HashSet(list);
                obj.c = executorService;
                obj.f2187d = iVar;
                B b3 = c0329a.f3955d;
                obj.f2188e = b3;
                if (this.f4223e == null) {
                    Context context = this.f4221b;
                    String str4 = oVar.c;
                    b3.getClass();
                    this.f4223e = B.a(context, str4, obj);
                }
                m0.q qVar = this.f4223e;
                if (qVar == null) {
                    m0.r.a().getClass();
                    g();
                    return;
                }
                if (qVar.f3982e) {
                    m0.r.a().getClass();
                    g();
                    return;
                }
                qVar.f3982e = true;
                workDatabase.c();
                try {
                    if (pVar.g(str) == 1) {
                        pVar.o(str, 2);
                        WorkDatabase workDatabase3 = pVar.f5111a;
                        workDatabase3.b();
                        v0.h hVar = pVar.f5116i;
                        C0173i a4 = hVar.a();
                        if (str == null) {
                            a4.g(1);
                        } else {
                            a4.h(str, 1);
                        }
                        workDatabase3.c();
                        try {
                            a4.b();
                            workDatabase3.p();
                            workDatabase3.k();
                            hVar.p(a4);
                            pVar.p(str, -256);
                            z3 = true;
                        } catch (Throwable th2) {
                            workDatabase3.k();
                            hVar.p(a4);
                            throw th2;
                        }
                    } else {
                        z3 = false;
                    }
                    workDatabase.p();
                    if (!z3) {
                        f();
                        return;
                    }
                    if (h()) {
                        return;
                    }
                    w0.r rVar = new w0.r(this.f4221b, this.f4222d, this.f4223e, tVar, this.f4224f);
                    ((ExecutorC0445a) iVar.f5078e).execute(rVar);
                    C0432k c0432k = rVar.f5165b;
                    I1.k kVar = new I1.k(this, 3, c0432k);
                    ExecutorC0146C executorC0146C = new ExecutorC0146C(1);
                    C0432k c0432k2 = this.f4233q;
                    c0432k2.a(kVar, executorC0146C);
                    c0432k.a(new D0.c(this, c0432k, 7, false), (ExecutorC0445a) iVar.f5078e);
                    c0432k2.a(new F0.h(this, this.f4231o), (ExecutorC0145B) iVar.f5076b);
                    return;
                } finally {
                }
            }
            f();
            workDatabase.p();
            m0.r.a().getClass();
        } finally {
            workDatabase.k();
        }
    }
}
