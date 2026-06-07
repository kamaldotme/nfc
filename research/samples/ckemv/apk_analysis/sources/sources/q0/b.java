package q0;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f0.C0173i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import m0.C0329a;
import m0.r;
import n0.i;
import v0.C0404d;
import v0.g;
import v0.h;
import v0.j;
import v0.o;

/* loaded from: classes.dex */
public final class b implements i {
    public static final /* synthetic */ int g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4415b;
    public final JobScheduler c;

    /* renamed from: d, reason: collision with root package name */
    public final C0362a f4416d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f4417e;

    /* renamed from: f, reason: collision with root package name */
    public final C0329a f4418f;

    static {
        r.b("SystemJobScheduler");
    }

    public b(Context context, WorkDatabase workDatabase, C0329a c0329a) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C0362a c0362a = new C0362a(context, c0329a.c);
        this.f4415b = context;
        this.c = jobScheduler;
        this.f4416d = c0362a;
        this.f4417e = workDatabase;
        this.f4418f = c0329a;
    }

    public static void c(JobScheduler jobScheduler, int i3) {
        try {
            jobScheduler.cancel(i3);
        } catch (Throwable unused) {
            r a3 = r.a();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i3));
            a3.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable unused) {
            r.a().getClass();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // n0.i
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f4415b;
        JobScheduler jobScheduler = this.c;
        ArrayList d3 = d(context, jobScheduler);
        if (d3 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = d3.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f3 = f(jobInfo);
                if (f3 != null && str.equals(f3.f5079a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c(jobScheduler, ((Integer) it2.next()).intValue());
        }
        v0.i q3 = this.f4417e.q();
        WorkDatabase workDatabase = (WorkDatabase) q3.f5076b;
        workDatabase.b();
        h hVar = (h) q3.f5078e;
        C0173i a3 = hVar.a();
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        workDatabase.c();
        try {
            a3.b();
            workDatabase.p();
        } finally {
            workDatabase.k();
            hVar.p(a3);
        }
    }

    @Override // n0.i
    public final boolean b() {
        return true;
    }

    @Override // n0.i
    public final void e(o... oVarArr) {
        int intValue;
        C0329a c0329a = this.f4418f;
        WorkDatabase workDatabase = this.f4417e;
        final w0.i iVar = new w0.i(workDatabase, 0);
        for (o oVar : oVarArr) {
            workDatabase.c();
            try {
                o i3 = workDatabase.u().i(oVar.f5091a);
                if (i3 == null) {
                    r.a().getClass();
                    workDatabase.p();
                } else if (i3.f5092b != 1) {
                    r.a().getClass();
                    workDatabase.p();
                } else {
                    j k2 = u2.d.k(oVar);
                    g i4 = workDatabase.q().i(k2);
                    if (i4 != null) {
                        intValue = i4.c;
                    } else {
                        c0329a.getClass();
                        final int i5 = c0329a.g;
                        Object o3 = iVar.f5158a.o(new Callable() { // from class: w0.h

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ int f5157b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                i iVar2 = i.this;
                                X1.g.e(iVar2, "this$0");
                                WorkDatabase workDatabase2 = iVar2.f5158a;
                                Long i6 = workDatabase2.m().i("next_job_scheduler_id");
                                int longValue = i6 != null ? (int) i6.longValue() : 0;
                                workDatabase2.m().j(new C0404d("next_job_scheduler_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                                int i7 = this.f5157b;
                                if (i7 > longValue || longValue > i5) {
                                    workDatabase2.m().j(new C0404d("next_job_scheduler_id", Long.valueOf(i7 + 1)));
                                    longValue = i7;
                                }
                                return Integer.valueOf(longValue);
                            }
                        });
                        X1.g.d(o3, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) o3).intValue();
                    }
                    if (i4 == null) {
                        workDatabase.q().j(new g(k2.f5080b, intValue, k2.f5079a));
                    }
                    g(oVar, intValue);
                    workDatabase.p();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(o oVar, int i3) {
        int i4;
        JobScheduler jobScheduler = this.c;
        C0362a c0362a = this.f4416d;
        c0362a.getClass();
        m0.d dVar = oVar.f5097j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", oVar.f5091a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", oVar.f5107t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", oVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i3, c0362a.f4413a).setRequiresCharging(dVar.f3965b);
        boolean z3 = dVar.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z3).setExtras(persistableBundle);
        int i5 = Build.VERSION.SDK_INT;
        int i6 = dVar.f3964a;
        if (i5 < 30 || i6 != 6) {
            int a3 = q.h.a(i6);
            if (a3 != 0) {
                if (a3 != 1) {
                    if (a3 != 2) {
                        i4 = 3;
                        if (a3 != 3) {
                            i4 = 4;
                            if (a3 != 4) {
                                r a4 = r.a();
                                X.d.r(i6);
                                a4.getClass();
                            }
                        }
                    } else {
                        i4 = 2;
                    }
                }
                i4 = 1;
            } else {
                i4 = 0;
            }
            extras.setRequiredNetworkType(i4);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z3) {
            extras.setBackoffCriteria(oVar.f5100m, oVar.f5099l == 2 ? 0 : 1);
        }
        long a5 = oVar.a();
        c0362a.f4414b.getClass();
        long max = Math.max(a5 - System.currentTimeMillis(), 0L);
        if (i5 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!oVar.f5104q) {
            extras.setImportantWhileForeground(true);
        }
        Set<m0.c> set = dVar.h;
        if (!set.isEmpty()) {
            for (m0.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f3961a, cVar.f3962b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f3968f);
            extras.setTriggerContentMaxDelay(dVar.g);
        }
        extras.setPersisted(false);
        int i7 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(dVar.f3966d);
        extras.setRequiresStorageNotLow(dVar.f3967e);
        Object[] objArr = oVar.f5098k > 0;
        Object[] objArr2 = max > 0;
        if (i7 >= 31 && oVar.f5104q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        r.a().getClass();
        try {
            if (jobScheduler.schedule(build) == 0) {
                r.a().getClass();
                if (oVar.f5104q && oVar.f5105r == 1) {
                    oVar.f5104q = false;
                    r.a().getClass();
                    g(oVar, i3);
                }
            }
        } catch (IllegalStateException e3) {
            ArrayList d3 = d(this.f4415b, jobScheduler);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(d3 != null ? d3.size() : 0), Integer.valueOf(this.f4417e.u().f().size()), Integer.valueOf(this.f4418f.f3958i));
            r.a().getClass();
            throw new IllegalStateException(format, e3);
        } catch (Throwable unused) {
            r a6 = r.a();
            oVar.toString();
            a6.getClass();
        }
    }
}
