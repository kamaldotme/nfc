package p2;

import F0.h;
import X1.g;
import f.C0150G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class d {
    public static final d h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f4362i;

    /* renamed from: a, reason: collision with root package name */
    public final C0150G f4363a;
    public boolean c;

    /* renamed from: d, reason: collision with root package name */
    public long f4365d;

    /* renamed from: b, reason: collision with root package name */
    public int f4364b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4366e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4367f = new ArrayList();
    public final h g = new h(17, this);

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, f.G] */
    static {
        String str = n2.b.f4253f + " TaskRunner";
        g.e(str, "name");
        n2.a aVar = new n2.a(true, str);
        ?? obj = new Object();
        obj.f2846b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        h = new d(obj);
        Logger logger = Logger.getLogger(d.class.getName());
        g.d(logger, "getLogger(TaskRunner::class.java.name)");
        f4362i = logger;
    }

    public d(C0150G c0150g) {
        this.f4363a = c0150g;
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = n2.b.f4249a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f4352a);
        try {
            long a3 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a3);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j3) {
        byte[] bArr = n2.b.f4249a;
        c cVar = aVar.c;
        g.b(cVar);
        if (cVar.f4359d != aVar) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z3 = cVar.f4361f;
        cVar.f4361f = false;
        cVar.f4359d = null;
        this.f4366e.remove(cVar);
        if (j3 != -1 && !z3 && !cVar.c) {
            cVar.d(aVar, j3, true);
        }
        if (!cVar.f4360e.isEmpty()) {
            this.f4367f.add(cVar);
        }
    }

    public final a c() {
        boolean z3;
        boolean z4;
        long j3;
        long j4;
        byte[] bArr = n2.b.f4249a;
        while (true) {
            ArrayList arrayList = this.f4367f;
            if (arrayList.isEmpty()) {
                return null;
            }
            C0150G c0150g = this.f4363a;
            c0150g.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j5 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).f4360e.get(0);
                long max = Math.max(0L, aVar2.f4354d - nanoTime);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar != null) {
                        z3 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = n2.b.f4249a;
                aVar.f4354d = -1L;
                c cVar = aVar.c;
                g.b(cVar);
                cVar.f4360e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f4359d = aVar;
                this.f4366e.add(cVar);
                if (z3 || (!this.c && (!arrayList.isEmpty()))) {
                    h hVar = this.g;
                    g.e(hVar, "runnable");
                    ((ThreadPoolExecutor) c0150g.f2846b).execute(hVar);
                }
                return aVar;
            }
            if (this.c) {
                if (j5 < this.f4365d - nanoTime) {
                    notify();
                }
                return null;
            }
            this.c = true;
            this.f4365d = nanoTime + j5;
            try {
                try {
                    j3 = j5 / 1000000;
                    j4 = j5 - (1000000 * j3);
                } catch (InterruptedException unused) {
                    d();
                    z4 = false;
                }
                if (j3 <= 0) {
                    if (j5 > 0) {
                    }
                    z4 = false;
                    this.c = z4;
                }
                wait(j3, (int) j4);
                z4 = false;
                this.c = z4;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f4366e;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((c) arrayList.get(size)).b();
            }
        }
        ArrayList arrayList2 = this.f4367f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f4360e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        g.e(cVar, "taskQueue");
        byte[] bArr = n2.b.f4249a;
        if (cVar.f4359d == null) {
            boolean z3 = !cVar.f4360e.isEmpty();
            ArrayList arrayList = this.f4367f;
            if (z3) {
                g.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z4 = this.c;
        C0150G c0150g = this.f4363a;
        if (z4) {
            c0150g.getClass();
            notify();
        } else {
            c0150g.getClass();
            h hVar = this.g;
            g.e(hVar, "runnable");
            ((ThreadPoolExecutor) c0150g.f2846b).execute(hVar);
        }
    }

    public final c f() {
        int i3;
        synchronized (this) {
            i3 = this.f4364b;
            this.f4364b = i3 + 1;
        }
        return new c(this, X.d.f("Q", i3));
    }
}
