package v0;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import f0.C0173i;
import java.util.ArrayList;
import m0.z;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f5111a;

    /* renamed from: b, reason: collision with root package name */
    public final C0402b f5112b;
    public final h c;

    /* renamed from: d, reason: collision with root package name */
    public final h f5113d;

    /* renamed from: e, reason: collision with root package name */
    public final h f5114e;

    /* renamed from: f, reason: collision with root package name */
    public final h f5115f;
    public final h g;
    public final h h;

    /* renamed from: i, reason: collision with root package name */
    public final h f5116i;

    /* renamed from: j, reason: collision with root package name */
    public final h f5117j;

    /* renamed from: k, reason: collision with root package name */
    public final h f5118k;

    /* renamed from: l, reason: collision with root package name */
    public final h f5119l;

    /* renamed from: m, reason: collision with root package name */
    public final h f5120m;

    /* renamed from: n, reason: collision with root package name */
    public final h f5121n;

    public p(WorkDatabase workDatabase) {
        this.f5111a = workDatabase;
        this.f5112b = new C0402b(workDatabase, 5);
        new h(workDatabase, 12);
        this.c = new h(workDatabase, 13);
        this.f5113d = new h(workDatabase, 14);
        this.f5114e = new h(workDatabase, 15);
        this.f5115f = new h(workDatabase, 16);
        this.g = new h(workDatabase, 17);
        this.h = new h(workDatabase, 18);
        this.f5116i = new h(workDatabase, 19);
        this.f5117j = new h(workDatabase, 4);
        new h(workDatabase, 5);
        this.f5118k = new h(workDatabase, 6);
        this.f5119l = new h(workDatabase, 7);
        this.f5120m = new h(workDatabase, 8);
        new h(workDatabase, 9);
        new h(workDatabase, 10);
        this.f5121n = new h(workDatabase, 11);
    }

    public final void a(String str) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.c;
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

    public final ArrayList b() {
        a0.j jVar;
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
        a0.j a3 = a0.j.a("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        a3.x(1, 200);
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            int B3 = z.B(n3, "id");
            int B4 = z.B(n3, "state");
            int B5 = z.B(n3, "worker_class_name");
            int B6 = z.B(n3, "input_merger_class_name");
            int B7 = z.B(n3, "input");
            int B8 = z.B(n3, "output");
            int B9 = z.B(n3, "initial_delay");
            int B10 = z.B(n3, "interval_duration");
            int B11 = z.B(n3, "flex_duration");
            int B12 = z.B(n3, "run_attempt_count");
            int B13 = z.B(n3, "backoff_policy");
            int B14 = z.B(n3, "backoff_delay_duration");
            int B15 = z.B(n3, "last_enqueue_time");
            int B16 = z.B(n3, "minimum_retention_duration");
            jVar = a3;
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
                    int u3 = u2.l.u(n3.getInt(B4));
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
                    int s3 = u2.l.s(n3.getInt(i23));
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
                    arrayList.add(new o(string, u3, string2, string3, a4, a5, j3, j4, j5, new m0.d(s3, z4, z5, z6, z7, j11, j12, u2.l.c(n3.isNull(i26) ? null : n3.getBlob(i26))), i9, r3, j6, j7, j8, j9, z3, t3, i15, i17, j10, i20, i22));
                    B3 = i11;
                    i8 = i10;
                }
                n3.close();
                jVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                n3.close();
                jVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a3;
        }
    }

    public final ArrayList c(int i3) {
        a0.j jVar;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        boolean z7;
        a0.j a3 = a0.j.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        a3.x(1, i3);
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            int B3 = z.B(n3, "id");
            int B4 = z.B(n3, "state");
            int B5 = z.B(n3, "worker_class_name");
            int B6 = z.B(n3, "input_merger_class_name");
            int B7 = z.B(n3, "input");
            int B8 = z.B(n3, "output");
            int B9 = z.B(n3, "initial_delay");
            int B10 = z.B(n3, "interval_duration");
            int B11 = z.B(n3, "flex_duration");
            int B12 = z.B(n3, "run_attempt_count");
            int B13 = z.B(n3, "backoff_policy");
            int B14 = z.B(n3, "backoff_delay_duration");
            int B15 = z.B(n3, "last_enqueue_time");
            int B16 = z.B(n3, "minimum_retention_duration");
            jVar = a3;
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
                int i9 = B16;
                ArrayList arrayList = new ArrayList(n3.getCount());
                while (n3.moveToNext()) {
                    String string = n3.isNull(B3) ? null : n3.getString(B3);
                    int u3 = u2.l.u(n3.getInt(B4));
                    String string2 = n3.isNull(B5) ? null : n3.getString(B5);
                    String string3 = n3.isNull(B6) ? null : n3.getString(B6);
                    m0.g a4 = m0.g.a(n3.isNull(B7) ? null : n3.getBlob(B7));
                    m0.g a5 = m0.g.a(n3.isNull(B8) ? null : n3.getBlob(B8));
                    long j3 = n3.getLong(B9);
                    long j4 = n3.getLong(B10);
                    long j5 = n3.getLong(B11);
                    int i10 = n3.getInt(B12);
                    int r3 = u2.l.r(n3.getInt(B13));
                    long j6 = n3.getLong(B14);
                    long j7 = n3.getLong(B15);
                    int i11 = i9;
                    long j8 = n3.getLong(i11);
                    int i12 = B3;
                    int i13 = B17;
                    long j9 = n3.getLong(i13);
                    B17 = i13;
                    int i14 = B18;
                    if (n3.getInt(i14) != 0) {
                        B18 = i14;
                        i4 = B19;
                        z3 = true;
                    } else {
                        B18 = i14;
                        i4 = B19;
                        z3 = false;
                    }
                    int t3 = u2.l.t(n3.getInt(i4));
                    B19 = i4;
                    int i15 = B20;
                    int i16 = n3.getInt(i15);
                    B20 = i15;
                    int i17 = B21;
                    int i18 = n3.getInt(i17);
                    B21 = i17;
                    int i19 = B22;
                    long j10 = n3.getLong(i19);
                    B22 = i19;
                    int i20 = B23;
                    int i21 = n3.getInt(i20);
                    B23 = i20;
                    int i22 = B24;
                    int i23 = n3.getInt(i22);
                    B24 = i22;
                    int i24 = B25;
                    int s3 = u2.l.s(n3.getInt(i24));
                    B25 = i24;
                    int i25 = B26;
                    if (n3.getInt(i25) != 0) {
                        B26 = i25;
                        i5 = B27;
                        z4 = true;
                    } else {
                        B26 = i25;
                        i5 = B27;
                        z4 = false;
                    }
                    if (n3.getInt(i5) != 0) {
                        B27 = i5;
                        i6 = B28;
                        z5 = true;
                    } else {
                        B27 = i5;
                        i6 = B28;
                        z5 = false;
                    }
                    if (n3.getInt(i6) != 0) {
                        B28 = i6;
                        i7 = B29;
                        z6 = true;
                    } else {
                        B28 = i6;
                        i7 = B29;
                        z6 = false;
                    }
                    if (n3.getInt(i7) != 0) {
                        B29 = i7;
                        i8 = B30;
                        z7 = true;
                    } else {
                        B29 = i7;
                        i8 = B30;
                        z7 = false;
                    }
                    long j11 = n3.getLong(i8);
                    B30 = i8;
                    int i26 = B31;
                    long j12 = n3.getLong(i26);
                    B31 = i26;
                    int i27 = B32;
                    B32 = i27;
                    arrayList.add(new o(string, u3, string2, string3, a4, a5, j3, j4, j5, new m0.d(s3, z4, z5, z6, z7, j11, j12, u2.l.c(n3.isNull(i27) ? null : n3.getBlob(i27))), i10, r3, j6, j7, j8, j9, z3, t3, i16, i18, j10, i21, i23));
                    B3 = i12;
                    i9 = i11;
                }
                n3.close();
                jVar.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                n3.close();
                jVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a3;
        }
    }

    public final ArrayList d() {
        a0.j jVar;
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
        a0.j a3 = a0.j.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
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
                int u3 = u2.l.u(n3.getInt(B4));
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
                int s3 = u2.l.s(n3.getInt(i23));
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
                arrayList.add(new o(string, u3, string2, string3, a4, a5, j3, j4, j5, new m0.d(s3, z4, z5, z6, z7, j11, j12, u2.l.c(n3.isNull(i26) ? null : n3.getBlob(i26))), i9, r3, j6, j7, j8, j9, z3, t3, i15, i17, j10, i20, i22));
                B3 = i11;
                i8 = i10;
            }
            n3.close();
            jVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            n3.close();
            jVar.o();
            throw th;
        }
    }

    public final ArrayList e() {
        a0.j jVar;
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
        a0.j a3 = a0.j.a("SELECT * FROM workspec WHERE state=1", 0);
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
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
                int u3 = u2.l.u(n3.getInt(B4));
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
                int s3 = u2.l.s(n3.getInt(i23));
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
                arrayList.add(new o(string, u3, string2, string3, a4, a5, j3, j4, j5, new m0.d(s3, z4, z5, z6, z7, j11, j12, u2.l.c(n3.isNull(i26) ? null : n3.getBlob(i26))), i9, r3, j6, j7, j8, j9, z3, t3, i15, i17, j10, i20, i22));
                B3 = i11;
                i8 = i10;
            }
            n3.close();
            jVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            n3.close();
            jVar.o();
            throw th;
        }
    }

    public final ArrayList f() {
        a0.j jVar;
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
        a0.j a3 = a0.j.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
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
                int u3 = u2.l.u(n3.getInt(B4));
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
                int s3 = u2.l.s(n3.getInt(i23));
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
                arrayList.add(new o(string, u3, string2, string3, a4, a5, j3, j4, j5, new m0.d(s3, z4, z5, z6, z7, j11, j12, u2.l.c(n3.isNull(i26) ? null : n3.getBlob(i26))), i9, r3, j6, j7, j8, j9, z3, t3, i15, i17, j10, i20, i22));
                B3 = i11;
                i8 = i10;
            }
            n3.close();
            jVar.o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            n3.close();
            jVar.o();
            throw th;
        }
    }

    public final int g(String str) {
        a0.j a3 = a0.j.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Integer num = null;
        Cursor n3 = workDatabase.n(a3, null);
        try {
            int i3 = 0;
            if (n3.moveToFirst()) {
                if (!n3.isNull(0)) {
                    num = Integer.valueOf(n3.getInt(0));
                }
                if (num != null) {
                    i3 = u2.l.u(num.intValue());
                }
            }
            return i3;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public final ArrayList h(String str) {
        a0.j a3 = a0.j.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            ArrayList arrayList = new ArrayList(n3.getCount());
            while (n3.moveToNext()) {
                arrayList.add(n3.isNull(0) ? null : n3.getString(0));
            }
            return arrayList;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public final o i(String str) {
        a0.j jVar;
        o oVar;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        a0.j a3 = a0.j.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            int B3 = z.B(n3, "id");
            int B4 = z.B(n3, "state");
            int B5 = z.B(n3, "worker_class_name");
            int B6 = z.B(n3, "input_merger_class_name");
            int B7 = z.B(n3, "input");
            int B8 = z.B(n3, "output");
            int B9 = z.B(n3, "initial_delay");
            int B10 = z.B(n3, "interval_duration");
            int B11 = z.B(n3, "flex_duration");
            int B12 = z.B(n3, "run_attempt_count");
            int B13 = z.B(n3, "backoff_policy");
            int B14 = z.B(n3, "backoff_delay_duration");
            int B15 = z.B(n3, "last_enqueue_time");
            int B16 = z.B(n3, "minimum_retention_duration");
            jVar = a3;
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
                if (n3.moveToFirst()) {
                    String string = n3.isNull(B3) ? null : n3.getString(B3);
                    int u3 = u2.l.u(n3.getInt(B4));
                    String string2 = n3.isNull(B5) ? null : n3.getString(B5);
                    String string3 = n3.isNull(B6) ? null : n3.getString(B6);
                    m0.g a4 = m0.g.a(n3.isNull(B7) ? null : n3.getBlob(B7));
                    m0.g a5 = m0.g.a(n3.isNull(B8) ? null : n3.getBlob(B8));
                    long j3 = n3.getLong(B9);
                    long j4 = n3.getLong(B10);
                    long j5 = n3.getLong(B11);
                    int i8 = n3.getInt(B12);
                    int r3 = u2.l.r(n3.getInt(B13));
                    long j6 = n3.getLong(B14);
                    long j7 = n3.getLong(B15);
                    long j8 = n3.getLong(B16);
                    long j9 = n3.getLong(B17);
                    if (n3.getInt(B18) != 0) {
                        i3 = B19;
                        z3 = true;
                    } else {
                        z3 = false;
                        i3 = B19;
                    }
                    int t3 = u2.l.t(n3.getInt(i3));
                    int i9 = n3.getInt(B20);
                    int i10 = n3.getInt(B21);
                    long j10 = n3.getLong(B22);
                    int i11 = n3.getInt(B23);
                    int i12 = n3.getInt(B24);
                    int s3 = u2.l.s(n3.getInt(B25));
                    if (n3.getInt(B26) != 0) {
                        i4 = B27;
                        z4 = true;
                    } else {
                        z4 = false;
                        i4 = B27;
                    }
                    if (n3.getInt(i4) != 0) {
                        i5 = B28;
                        z5 = true;
                    } else {
                        z5 = false;
                        i5 = B28;
                    }
                    if (n3.getInt(i5) != 0) {
                        i6 = B29;
                        z6 = true;
                    } else {
                        z6 = false;
                        i6 = B29;
                    }
                    if (n3.getInt(i6) != 0) {
                        i7 = B30;
                        z7 = true;
                    } else {
                        z7 = false;
                        i7 = B30;
                    }
                    oVar = new o(string, u3, string2, string3, a4, a5, j3, j4, j5, new m0.d(s3, z4, z5, z6, z7, n3.getLong(i7), n3.getLong(B31), u2.l.c(n3.isNull(B32) ? null : n3.getBlob(B32))), i8, r3, j6, j7, j8, j9, z3, t3, i9, i10, j10, i11, i12);
                } else {
                    oVar = null;
                }
                n3.close();
                jVar.o();
                return oVar;
            } catch (Throwable th) {
                th = th;
                n3.close();
                jVar.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = a3;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, v0.n] */
    public final ArrayList j(String str) {
        a0.j a3 = a0.j.a("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        Cursor n3 = workDatabase.n(a3, null);
        try {
            ArrayList arrayList = new ArrayList(n3.getCount());
            while (n3.moveToNext()) {
                String string = n3.isNull(0) ? null : n3.getString(0);
                int u3 = u2.l.u(n3.getInt(1));
                X1.g.e(string, "id");
                ?? obj = new Object();
                obj.f5089a = string;
                obj.f5090b = u3;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            n3.close();
            a3.o();
        }
    }

    public final void k(String str, long j3) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.f5119l;
        C0173i a3 = hVar.a();
        a3.x(1, j3);
        if (str == null) {
            a3.g(2);
        } else {
            a3.h(str, 2);
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

    public final void l(String str, int i3) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.f5118k;
        C0173i a3 = hVar.a();
        if (str == null) {
            a3.g(1);
        } else {
            a3.h(str, 1);
        }
        a3.x(2, i3);
        workDatabase.c();
        try {
            a3.b();
            workDatabase.p();
        } finally {
            workDatabase.k();
            hVar.p(a3);
        }
    }

    public final void m(String str, long j3) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.h;
        C0173i a3 = hVar.a();
        a3.x(1, j3);
        if (str == null) {
            a3.g(2);
        } else {
            a3.h(str, 2);
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

    public final void n(String str, m0.g gVar) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.g;
        C0173i a3 = hVar.a();
        byte[] b3 = m0.g.b(gVar);
        if (b3 == null) {
            a3.g(1);
        } else {
            a3.f(1, b3);
        }
        if (str == null) {
            a3.g(2);
        } else {
            a3.h(str, 2);
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

    public final void o(String str, int i3) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.f5113d;
        C0173i a3 = hVar.a();
        a3.x(1, u2.l.N(i3));
        if (str == null) {
            a3.g(2);
        } else {
            a3.h(str, 2);
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

    public final void p(String str, int i3) {
        WorkDatabase workDatabase = this.f5111a;
        workDatabase.b();
        h hVar = this.f5121n;
        C0173i a3 = hVar.a();
        a3.x(1, i3);
        if (str == null) {
            a3.g(2);
        } else {
            a3.h(str, 2);
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
}
