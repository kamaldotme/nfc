package n0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import f.ExecutorC0145B;
import f0.C0173i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.C0329a;
import m0.z;

/* loaded from: classes.dex */
public final class s extends z {

    /* renamed from: n, reason: collision with root package name */
    public static s f4204n;

    /* renamed from: o, reason: collision with root package name */
    public static s f4205o;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f4206p;

    /* renamed from: d, reason: collision with root package name */
    public final Context f4207d;

    /* renamed from: e, reason: collision with root package name */
    public final C0329a f4208e;

    /* renamed from: f, reason: collision with root package name */
    public final WorkDatabase f4209f;
    public final v0.i g;
    public final List h;

    /* renamed from: i, reason: collision with root package name */
    public final g f4210i;

    /* renamed from: j, reason: collision with root package name */
    public final w0.i f4211j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4212k = false;

    /* renamed from: l, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f4213l;

    /* renamed from: m, reason: collision with root package name */
    public final v0.i f4214m;

    static {
        m0.r.b("WorkManagerImpl");
        f4204n = null;
        f4205o = null;
        f4206p = new Object();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [m0.r, java.lang.Object] */
    public s(Context context, final C0329a c0329a, v0.i iVar, final WorkDatabase workDatabase, final List list, g gVar, v0.i iVar2) {
        Context applicationContext = context.getApplicationContext();
        if (r.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ?? obj = new Object();
        synchronized (m0.r.f3983a) {
            m0.r.f3984b = obj;
        }
        this.f4207d = applicationContext;
        this.g = iVar;
        this.f4209f = workDatabase;
        this.f4210i = gVar;
        this.f4214m = iVar2;
        this.f4208e = c0329a;
        this.h = list;
        this.f4211j = new w0.i(workDatabase, 1);
        final ExecutorC0145B executorC0145B = (ExecutorC0145B) iVar.f5076b;
        int i3 = l.f4193a;
        gVar.a(new c() { // from class: n0.j
            @Override // n0.c
            public final void d(final v0.j jVar, boolean z3) {
                final C0329a c0329a2 = c0329a;
                final WorkDatabase workDatabase2 = workDatabase;
                final List list2 = list;
                executorC0145B.execute(new Runnable() { // from class: n0.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((i) it.next()).a(jVar.f5079a);
                        }
                        l.b(c0329a2, workDatabase2, list3);
                    }
                });
            }
        });
        iVar.f(new w0.f(applicationContext, this));
    }

    public static s p0(Context context) {
        s sVar;
        Object obj = f4206p;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    sVar = f4204n;
                    if (sVar == null) {
                        sVar = f4205o;
                    }
                }
                return sVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (sVar != null) {
            return sVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void q0() {
        synchronized (f4206p) {
            try {
                this.f4212k = true;
                BroadcastReceiver.PendingResult pendingResult = this.f4213l;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f4213l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r0() {
        ArrayList d3;
        int i3 = q0.b.g;
        Context context = this.f4207d;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d3 = q0.b.d(context, jobScheduler)) != null && !d3.isEmpty()) {
            Iterator it = d3.iterator();
            while (it.hasNext()) {
                q0.b.c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f4209f;
        v0.p u3 = workDatabase.u();
        WorkDatabase workDatabase2 = u3.f5111a;
        workDatabase2.b();
        v0.h hVar = u3.f5120m;
        C0173i a3 = hVar.a();
        workDatabase2.c();
        try {
            a3.b();
            workDatabase2.p();
            workDatabase2.k();
            hVar.p(a3);
            l.b(this.f4208e, workDatabase, this.h);
        } catch (Throwable th) {
            workDatabase2.k();
            hVar.p(a3);
            throw th;
        }
    }
}
