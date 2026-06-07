package w0;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import f0.C0173i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m0.C0329a;
import v0.C0404d;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final long f5151f;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5152b;
    public final n0.s c;

    /* renamed from: d, reason: collision with root package name */
    public final i f5153d;

    /* renamed from: e, reason: collision with root package name */
    public int f5154e = 0;

    static {
        m0.r.b("ForceStopRunnable");
        f5151f = TimeUnit.DAYS.toMillis(3650L);
    }

    public f(Context context, n0.s sVar) {
        this.f5152b = context.getApplicationContext();
        this.c = sVar;
        this.f5153d = sVar.f4211j;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i3 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
        long currentTimeMillis = System.currentTimeMillis() + f5151f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        boolean z3;
        int i3;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        i iVar = this.f5153d;
        n0.s sVar = this.c;
        WorkDatabase workDatabase = sVar.f4209f;
        int i4 = q0.b.g;
        Context context = this.f5152b;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList d3 = q0.b.d(context, jobScheduler);
        v0.i q3 = workDatabase.q();
        q3.getClass();
        a0.j a3 = a0.j.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase workDatabase2 = (WorkDatabase) q3.f5076b;
        workDatabase2.b();
        Cursor n3 = workDatabase2.n(a3, null);
        try {
            ArrayList arrayList = new ArrayList(n3.getCount());
            while (n3.moveToNext()) {
                arrayList.add(n3.isNull(0) ? null : n3.getString(0));
            }
            HashSet hashSet = new HashSet(d3 != null ? d3.size() : 0);
            if (d3 != null && !d3.isEmpty()) {
                Iterator it = d3.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    v0.j f3 = q0.b.f(jobInfo);
                    if (f3 != null) {
                        hashSet.add(f3.f5079a);
                    } else {
                        q0.b.c(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        m0.r.a().getClass();
                        z3 = true;
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                workDatabase.c();
                try {
                    v0.p u3 = workDatabase.u();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        u3.k((String) it3.next(), -1L);
                    }
                    workDatabase.p();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = sVar.f4209f;
            v0.p u4 = workDatabase.u();
            v0.m t3 = workDatabase.t();
            workDatabase.c();
            try {
                ArrayList e3 = u4.e();
                boolean z4 = !e3.isEmpty();
                if (z4) {
                    Iterator it4 = e3.iterator();
                    while (it4.hasNext()) {
                        String str = ((v0.o) it4.next()).f5091a;
                        u4.o(str, 1);
                        u4.p(str, -512);
                        u4.k(str, -1L);
                    }
                }
                WorkDatabase workDatabase3 = (WorkDatabase) t3.c;
                workDatabase3.b();
                v0.h hVar = (v0.h) t3.f5088e;
                C0173i a4 = hVar.a();
                workDatabase3.c();
                try {
                    a4.b();
                    workDatabase3.p();
                    workDatabase3.k();
                    hVar.p(a4);
                    workDatabase.p();
                    workDatabase.k();
                    boolean z5 = z4 || z3;
                    Long i5 = sVar.f4211j.f5158a.m().i("reschedule_needed");
                    if (i5 != null && i5.longValue() == 1) {
                        m0.r.a().getClass();
                        sVar.r0();
                        i iVar2 = sVar.f4211j;
                        iVar2.getClass();
                        iVar2.f5158a.m().j(new C0404d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i3 = Build.VERSION.SDK_INT;
                        int i6 = i3 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
                    } catch (IllegalArgumentException | SecurityException unused) {
                        m0.r.a().getClass();
                    }
                    if (i3 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long i7 = iVar.f5158a.m().i("last_force_stop_ms");
                            long longValue = i7 != null ? i7.longValue() : 0L;
                            for (int i8 = 0; i8 < historicalProcessExitReasons.size(); i8++) {
                                ApplicationExitInfo c = K.f.c(historicalProcessExitReasons.get(i8));
                                reason = c.getReason();
                                if (reason == 10) {
                                    timestamp = c.getTimestamp();
                                    if (timestamp >= longValue) {
                                        m0.r.a().getClass();
                                        sVar.r0();
                                        sVar.f4208e.c.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        iVar.getClass();
                                        iVar.f5158a.m().j(new C0404d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                                        return;
                                    }
                                }
                            }
                        }
                    } else if (broadcast == null) {
                        b(context);
                        m0.r.a().getClass();
                        sVar.r0();
                        sVar.f4208e.c.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        iVar.getClass();
                        iVar.f5158a.m().j(new C0404d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (z5) {
                        m0.r.a().getClass();
                        n0.l.b(sVar.f4208e, sVar.f4209f, sVar.h);
                    }
                } catch (Throwable th2) {
                    workDatabase3.k();
                    hVar.p(a4);
                    throw th2;
                }
            } finally {
                workDatabase.k();
            }
        } finally {
            n3.close();
            a3.o();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0.s sVar = this.c;
        try {
            C0329a c0329a = sVar.f4208e;
            c0329a.getClass();
            boolean isEmpty = TextUtils.isEmpty(null);
            Context context = this.f5152b;
            if (isEmpty) {
                m0.r.a().getClass();
            } else {
                boolean a3 = n.a(context, c0329a);
                m0.r.a().getClass();
                if (!a3) {
                    return;
                }
            }
            while (true) {
                try {
                    u2.d.s(context);
                    m0.r.a().getClass();
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e3) {
                        int i3 = this.f5154e + 1;
                        this.f5154e = i3;
                        if (i3 >= 3) {
                            String str = F.l.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            m0.r.a().getClass();
                            IllegalStateException illegalStateException = new IllegalStateException(str, e3);
                            sVar.f4208e.getClass();
                            throw illegalStateException;
                        }
                        m0.r.a().getClass();
                        try {
                            Thread.sleep(this.f5154e * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e4) {
                    m0.r.a().getClass();
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e4);
                    sVar.f4208e.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            sVar.q0();
        }
    }
}
