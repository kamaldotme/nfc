package p0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f0.C0173i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m0.r;
import n0.m;
import v0.C0403c;
import v0.o;
import y0.ExecutorC0445a;

/* loaded from: classes.dex */
public final class c implements n0.c {
    public static final /* synthetic */ int g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4298b;
    public final HashMap c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f4299d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final r f4300e;

    /* renamed from: f, reason: collision with root package name */
    public final v0.r f4301f;

    static {
        r.b("CommandHandler");
    }

    public c(Context context, r rVar, v0.r rVar2) {
        this.f4298b = context;
        this.f4300e = rVar;
        this.f4301f = rVar2;
    }

    public static v0.j b(Intent intent) {
        return new v0.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, v0.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f5079a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f5080b);
    }

    public final void a(Intent intent, int i3, j jVar) {
        List<m> list;
        int i4 = 4;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            r a3 = r.a();
            Objects.toString(intent);
            a3.getClass();
            e eVar = new e(this.f4298b, this.f4300e, i3, jVar);
            ArrayList f3 = jVar.f4323f.f4209f.u().f();
            int i5 = d.f4302a;
            Iterator it = f3.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (it.hasNext()) {
                m0.d dVar = ((o) it.next()).f5097j;
                z3 |= dVar.f3966d;
                z4 |= dVar.f3965b;
                z5 |= dVar.f3967e;
                z6 |= dVar.f3964a != 1;
                if (z3 && z4 && z5 && z6) {
                    break;
                }
            }
            int i6 = ConstraintProxyUpdateReceiver.f2203a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f4303a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(f3.size());
            eVar.f4304b.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = f3.iterator();
            while (it2.hasNext()) {
                o oVar = (o) it2.next();
                if (currentTimeMillis >= oVar.a() && (!oVar.b() || eVar.f4305d.k(oVar))) {
                    arrayList.add(oVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                o oVar2 = (o) it3.next();
                String str = oVar2.f5091a;
                v0.j k2 = u2.d.k(oVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, k2);
                r.a().getClass();
                ((ExecutorC0445a) jVar.c.f5078e).execute(new F0.b(jVar, intent3, eVar.c, i4));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            r a4 = r.a();
            Objects.toString(intent);
            a4.getClass();
            jVar.f4323f.r0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            r.a().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            v0.j b3 = b(intent);
            r a5 = r.a();
            b3.toString();
            a5.getClass();
            WorkDatabase workDatabase = jVar.f4323f.f4209f;
            workDatabase.c();
            try {
                o i7 = workDatabase.u().i(b3.f5079a);
                if (i7 == null) {
                    r a6 = r.a();
                    b3.toString();
                    a6.getClass();
                } else if (X.d.d(i7.f5092b)) {
                    r a7 = r.a();
                    b3.toString();
                    a7.getClass();
                } else {
                    long a8 = i7.a();
                    boolean b4 = i7.b();
                    Context context2 = this.f4298b;
                    if (b4) {
                        r a9 = r.a();
                        b3.toString();
                        a9.getClass();
                        b.b(context2, workDatabase, b3, a8);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((ExecutorC0445a) jVar.c.f5078e).execute(new F0.b(jVar, intent4, i3, i4));
                    } else {
                        r a10 = r.a();
                        b3.toString();
                        a10.getClass();
                        b.b(context2, workDatabase, b3, a8);
                    }
                    workDatabase.p();
                }
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f4299d) {
                try {
                    v0.j b5 = b(intent);
                    r a11 = r.a();
                    b5.toString();
                    a11.getClass();
                    if (this.c.containsKey(b5)) {
                        r a12 = r.a();
                        b5.toString();
                        a12.getClass();
                    } else {
                        g gVar = new g(this.f4298b, i3, jVar, this.f4301f.D(b5));
                        this.c.put(b5, gVar);
                        gVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                r a13 = r.a();
                intent.toString();
                a13.getClass();
                return;
            } else {
                v0.j b6 = b(intent);
                boolean z7 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                r a14 = r.a();
                intent.toString();
                a14.getClass();
                d(b6, z7);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        v0.r rVar = this.f4301f;
        if (containsKey) {
            int i8 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            m A3 = rVar.A(new v0.j(string, i8));
            list = arrayList2;
            if (A3 != null) {
                arrayList2.add(A3);
                list = arrayList2;
            }
        } else {
            list = rVar.z(string);
        }
        for (m mVar : list) {
            r.a().getClass();
            C0403c c0403c = jVar.f4326k;
            c0403c.getClass();
            X1.g.e(mVar, "workSpecId");
            c0403c.p(mVar, -512);
            WorkDatabase workDatabase2 = jVar.f4323f.f4209f;
            int i9 = b.f4297a;
            v0.i q3 = workDatabase2.q();
            v0.j jVar2 = mVar.f4194a;
            v0.g i10 = q3.i(jVar2);
            if (i10 != null) {
                b.a(this.f4298b, jVar2, i10.c);
                r a15 = r.a();
                jVar2.toString();
                a15.getClass();
                WorkDatabase workDatabase3 = (WorkDatabase) q3.f5076b;
                workDatabase3.b();
                v0.h hVar = (v0.h) q3.f5077d;
                C0173i a16 = hVar.a();
                String str2 = jVar2.f5079a;
                if (str2 == null) {
                    a16.g(1);
                } else {
                    a16.h(str2, 1);
                }
                a16.x(2, jVar2.f5080b);
                workDatabase3.c();
                try {
                    a16.b();
                    workDatabase3.p();
                } finally {
                    workDatabase3.k();
                    hVar.p(a16);
                }
            }
            jVar.d(jVar2, false);
        }
    }

    @Override // n0.c
    public final void d(v0.j jVar, boolean z3) {
        synchronized (this.f4299d) {
            try {
                g gVar = (g) this.c.remove(jVar);
                this.f4301f.A(jVar);
                if (gVar != null) {
                    gVar.f(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
