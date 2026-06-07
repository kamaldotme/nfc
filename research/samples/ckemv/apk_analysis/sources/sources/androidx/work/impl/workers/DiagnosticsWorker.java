package androidx.work.impl.workers;

import X1.g;
import a0.j;
import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import m0.d;
import m0.o;
import m0.z;
import n0.s;
import v0.i;
import v0.l;
import v0.p;
import v0.r;
import z0.b;

/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        g.e(context, "context");
        g.e(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final o f() {
        j jVar;
        int B3;
        int B4;
        int B5;
        int B6;
        int B7;
        int B8;
        int B9;
        int B10;
        int B11;
        int B12;
        int B13;
        int B14;
        int B15;
        int B16;
        i iVar;
        l lVar;
        r rVar;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        int i7;
        boolean z7;
        s p02 = s.p0(this.f3980b);
        WorkDatabase workDatabase = p02.f4209f;
        g.d(workDatabase, "workManager.workDatabase");
        p u3 = workDatabase.u();
        l s3 = workDatabase.s();
        r v3 = workDatabase.v();
        i q3 = workDatabase.q();
        p02.f4208e.c.getClass();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        u3.getClass();
        j a3 = j.a("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        a3.x(1, currentTimeMillis);
        WorkDatabase workDatabase2 = u3.f5111a;
        workDatabase2.b();
        Cursor n3 = workDatabase2.n(a3, null);
        try {
            B3 = z.B(n3, "id");
            B4 = z.B(n3, "state");
            B5 = z.B(n3, "worker_class_name");
            B6 = z.B(n3, "input_merger_class_name");
            B7 = z.B(n3, "input");
            B8 = z.B(n3, "output");
            B9 = z.B(n3, "initial_delay");
            B10 = z.B(n3, "interval_duration");
            B11 = z.B(n3, "flex_duration");
            B12 = z.B(n3, "run_attempt_count");
            B13 = z.B(n3, "backoff_policy");
            B14 = z.B(n3, "backoff_delay_duration");
            B15 = z.B(n3, "last_enqueue_time");
            B16 = z.B(n3, "minimum_retention_duration");
            jVar = a3;
        } catch (Throwable th) {
            th = th;
            jVar = a3;
        }
        try {
            int B17 = z.B(n3, "schedule_requested_at");
            int B18 = z.B(n3, "run_in_foreground");
            int B19 = z.B(n3, "out_of_quota_policy");
            int B20 = z.B(n3, "period_count");
            int B21 = z.B(n3, "generation");
            int B22 = z.B(n3, "next_schedule_time_override");
            int B23 = z.B(n3, "next_schedule_time_override_generation");
            int B24 = z.B(n3, "stop_reason");
            int B25 = z.B(n3, "required_network_type");
            int B26 = z.B(n3, "requires_charging");
            int B27 = z.B(n3, "requires_device_idle");
            int B28 = z.B(n3, "requires_battery_not_low");
            int B29 = z.B(n3, "requires_storage_not_low");
            int B30 = z.B(n3, "trigger_content_update_delay");
            int B31 = z.B(n3, "trigger_max_content_delay");
            int B32 = z.B(n3, "content_uri_triggers");
            int i8 = B16;
            ArrayList arrayList = new ArrayList(n3.getCount());
            while (n3.moveToNext()) {
                String string = n3.isNull(B3) ? null : n3.getString(B3);
                int u4 = u2.l.u(n3.getInt(B4));
                String string2 = n3.isNull(B5) ? null : n3.getString(B5);
                String string3 = n3.isNull(B6) ? null : n3.getString(B6);
                m0.g a4 = m0.g.a(n3.isNull(B7) ? null : n3.getBlob(B7));
                m0.g a5 = m0.g.a(n3.isNull(B8) ? null : n3.getBlob(B8));
                long j3 = n3.getLong(B9);
                long j4 = n3.getLong(B10);
                long j5 = n3.getLong(B11);
                int i9 = n3.getInt(B12);
                int r3 = u2.l.r(n3.getInt(B13));
                long j6 = n3.getLong(B14);
                long j7 = n3.getLong(B15);
                int i10 = i8;
                long j8 = n3.getLong(i10);
                int i11 = B3;
                int i12 = B17;
                long j9 = n3.getLong(i12);
                B17 = i12;
                int i13 = B18;
                if (n3.getInt(i13) != 0) {
                    B18 = i13;
                    i3 = B19;
                    z3 = true;
                } else {
                    B18 = i13;
                    i3 = B19;
                    z3 = false;
                }
                int t3 = u2.l.t(n3.getInt(i3));
                B19 = i3;
                int i14 = B20;
                int i15 = n3.getInt(i14);
                B20 = i14;
                int i16 = B21;
                int i17 = n3.getInt(i16);
                B21 = i16;
                int i18 = B22;
                long j10 = n3.getLong(i18);
                B22 = i18;
                int i19 = B23;
                int i20 = n3.getInt(i19);
                B23 = i19;
                int i21 = B24;
                int i22 = n3.getInt(i21);
                B24 = i21;
                int i23 = B25;
                int s4 = u2.l.s(n3.getInt(i23));
                B25 = i23;
                int i24 = B26;
                if (n3.getInt(i24) != 0) {
                    B26 = i24;
                    i4 = B27;
                    z4 = true;
                } else {
                    B26 = i24;
                    i4 = B27;
                    z4 = false;
                }
                if (n3.getInt(i4) != 0) {
                    B27 = i4;
                    i5 = B28;
                    z5 = true;
                } else {
                    B27 = i4;
                    i5 = B28;
                    z5 = false;
                }
                if (n3.getInt(i5) != 0) {
                    B28 = i5;
                    i6 = B29;
                    z6 = true;
                } else {
                    B28 = i5;
                    i6 = B29;
                    z6 = false;
                }
                if (n3.getInt(i6) != 0) {
                    B29 = i6;
                    i7 = B30;
                    z7 = true;
                } else {
                    B29 = i6;
                    i7 = B30;
                    z7 = false;
                }
                long j11 = n3.getLong(i7);
                B30 = i7;
                int i25 = B31;
                long j12 = n3.getLong(i25);
                B31 = i25;
                int i26 = B32;
                B32 = i26;
                arrayList.add(new v0.o(string, u4, string2, string3, a4, a5, j3, j4, j5, new d(s4, z4, z5, z6, z7, j11, j12, u2.l.c(n3.isNull(i26) ? null : n3.getBlob(i26))), i9, r3, j6, j7, j8, j9, z3, t3, i15, i17, j10, i20, i22));
                B3 = i11;
                i8 = i10;
            }
            n3.close();
            jVar.o();
            ArrayList e3 = u3.e();
            ArrayList b3 = u3.b();
            if (!arrayList.isEmpty()) {
                m0.r a6 = m0.r.a();
                int i27 = b.f5313a;
                a6.getClass();
                m0.r a7 = m0.r.a();
                iVar = q3;
                lVar = s3;
                rVar = v3;
                b.a(lVar, rVar, iVar, arrayList);
                a7.getClass();
            } else {
                iVar = q3;
                lVar = s3;
                rVar = v3;
            }
            if (!e3.isEmpty()) {
                m0.r a8 = m0.r.a();
                int i28 = b.f5313a;
                a8.getClass();
                m0.r a9 = m0.r.a();
                b.a(lVar, rVar, iVar, e3);
                a9.getClass();
            }
            if (!b3.isEmpty()) {
                m0.r a10 = m0.r.a();
                int i29 = b.f5313a;
                a10.getClass();
                m0.r a11 = m0.r.a();
                b.a(lVar, rVar, iVar, b3);
                a11.getClass();
            }
            return new o(m0.g.f3972b);
        } catch (Throwable th2) {
            th = th2;
            n3.close();
            jVar.o();
            throw th;
        }
    }
}
