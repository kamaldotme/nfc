package p0;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;
import m0.r;
import v0.C0404d;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4297a = 0;

    static {
        r.b("Alarms");
    }

    public static void a(Context context, v0.j jVar, int i3) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i4 = c.g;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i3, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        r a3 = r.a();
        jVar.toString();
        a3.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, v0.j jVar, long j3) {
        v0.i q3 = workDatabase.q();
        v0.g i3 = q3.i(jVar);
        if (i3 != null) {
            int i4 = i3.c;
            a(context, jVar, i4);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            int i5 = c.g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.c(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i4, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j3, service);
                return;
            }
            return;
        }
        final w0.i iVar = new w0.i(workDatabase, 0);
        Object o3 = workDatabase.o(new Callable() { // from class: w0.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                i iVar2 = i.this;
                X1.g.e(iVar2, "this$0");
                WorkDatabase workDatabase2 = iVar2.f5158a;
                Long i6 = workDatabase2.m().i("next_alarm_manager_id");
                int longValue = i6 != null ? (int) i6.longValue() : 0;
                workDatabase2.m().j(new C0404d("next_alarm_manager_id", Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
                return Integer.valueOf(longValue);
            }
        });
        X1.g.d(o3, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) o3).intValue();
        q3.j(new v0.g(jVar.f5080b, intValue, jVar.f5079a));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        int i6 = c.g;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.c(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j3, service2);
        }
    }
}
