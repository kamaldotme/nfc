package androidx.work.impl.background.systemjob;

import G.m;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import n0.c;
import n0.g;
import n0.s;
import q0.d;
import q0.e;
import v0.C0403c;
import v0.i;
import v0.j;
import v0.r;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2205f = 0;

    /* renamed from: b, reason: collision with root package name */
    public s f2206b;
    public final HashMap c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final r f2207d = new r();

    /* renamed from: e, reason: collision with root package name */
    public C0403c f2208e;

    static {
        m0.r.b("SystemJobService");
    }

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // n0.c
    public final void d(j jVar, boolean z3) {
        JobParameters jobParameters;
        m0.r a3 = m0.r.a();
        String str = jVar.f5079a;
        a3.getClass();
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(jVar);
        }
        this.f2207d.A(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            s p02 = s.p0(getApplicationContext());
            this.f2206b = p02;
            g gVar = p02.f4210i;
            this.f2208e = new C0403c(gVar, p02.g);
            gVar.a(this);
        } catch (IllegalStateException e3) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
            }
            m0.r.a().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        s sVar = this.f2206b;
        if (sVar != null) {
            sVar.f4210i.f(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f2206b == null) {
            m0.r.a().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        j a3 = a(jobParameters);
        if (a3 == null) {
            m0.r.a().getClass();
            return false;
        }
        synchronized (this.c) {
            try {
                if (this.c.containsKey(a3)) {
                    m0.r a4 = m0.r.a();
                    a3.toString();
                    a4.getClass();
                    return false;
                }
                m0.r a5 = m0.r.a();
                a3.toString();
                a5.getClass();
                this.c.put(a3, jobParameters);
                int i3 = Build.VERSION.SDK_INT;
                m0.r rVar = new m0.r();
                if (q0.c.b(jobParameters) != null) {
                    Arrays.asList(q0.c.b(jobParameters));
                }
                if (q0.c.a(jobParameters) != null) {
                    Arrays.asList(q0.c.a(jobParameters));
                }
                if (i3 >= 28) {
                    d.a(jobParameters);
                }
                C0403c c0403c = this.f2208e;
                ((i) c0403c.f5067d).f(new m((g) c0403c.c, this.f2207d.D(a3), rVar));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f2206b == null) {
            m0.r.a().getClass();
            return true;
        }
        j a3 = a(jobParameters);
        if (a3 == null) {
            m0.r.a().getClass();
            return false;
        }
        m0.r a4 = m0.r.a();
        a3.toString();
        a4.getClass();
        synchronized (this.c) {
            this.c.remove(a3);
        }
        n0.m A3 = this.f2207d.A(a3);
        if (A3 != null) {
            int a5 = Build.VERSION.SDK_INT >= 31 ? e.a(jobParameters) : -512;
            C0403c c0403c = this.f2208e;
            c0403c.getClass();
            c0403c.p(A3, a5);
        }
        g gVar = this.f2206b.f4210i;
        String str = a3.f5079a;
        synchronized (gVar.f4185k) {
            contains = gVar.f4183i.contains(str);
        }
        return !contains;
    }
}
