package v0;

import androidx.work.impl.WorkDatabase;
import f0.C0173i;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402b extends a0.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5065d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0402b(WorkDatabase workDatabase, int i3) {
        super(workDatabase);
        this.f5065d = i3;
        X1.g.e(workDatabase, "database");
    }

    @Override // a0.m
    public final String n() {
        switch (this.f5065d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void s(C0173i c0173i, Object obj) {
        int i3;
        switch (this.f5065d) {
            case 0:
                C0401a c0401a = (C0401a) obj;
                String str = c0401a.f5063a;
                if (str == null) {
                    c0173i.g(1);
                } else {
                    c0173i.h(str, 1);
                }
                String str2 = c0401a.f5064b;
                if (str2 == null) {
                    c0173i.g(2);
                    return;
                } else {
                    c0173i.h(str2, 2);
                    return;
                }
            case 1:
                C0404d c0404d = (C0404d) obj;
                String str3 = c0404d.f5068a;
                if (str3 == null) {
                    c0173i.g(1);
                } else {
                    c0173i.h(str3, 1);
                }
                Long l3 = c0404d.f5069b;
                if (l3 == null) {
                    c0173i.g(2);
                    return;
                } else {
                    c0173i.x(2, l3.longValue());
                    return;
                }
            case 2:
                String str4 = ((g) obj).f5073a;
                if (str4 == null) {
                    c0173i.g(1);
                } else {
                    c0173i.h(str4, 1);
                }
                c0173i.x(2, r12.f5074b);
                c0173i.x(3, r12.c);
                return;
            case 3:
                k kVar = (k) obj;
                String str5 = kVar.f5081a;
                if (str5 == null) {
                    c0173i.g(1);
                } else {
                    c0173i.h(str5, 1);
                }
                String str6 = kVar.f5082b;
                if (str6 == null) {
                    c0173i.g(2);
                    return;
                } else {
                    c0173i.h(str6, 2);
                    return;
                }
            case 4:
                X.d.n(obj);
                throw null;
            case 5:
                o oVar = (o) obj;
                int i4 = 1;
                String str7 = oVar.f5091a;
                if (str7 == null) {
                    c0173i.g(1);
                } else {
                    c0173i.h(str7, 1);
                }
                c0173i.x(2, u2.l.N(oVar.f5092b));
                String str8 = oVar.c;
                if (str8 == null) {
                    c0173i.g(3);
                } else {
                    c0173i.h(str8, 3);
                }
                String str9 = oVar.f5093d;
                if (str9 == null) {
                    c0173i.g(4);
                } else {
                    c0173i.h(str9, 4);
                }
                byte[] b3 = m0.g.b(oVar.f5094e);
                if (b3 == null) {
                    c0173i.g(5);
                } else {
                    c0173i.f(5, b3);
                }
                byte[] b4 = m0.g.b(oVar.f5095f);
                if (b4 == null) {
                    c0173i.g(6);
                } else {
                    c0173i.f(6, b4);
                }
                c0173i.x(7, oVar.g);
                c0173i.x(8, oVar.h);
                c0173i.x(9, oVar.f5096i);
                c0173i.x(10, oVar.f5098k);
                int i5 = oVar.f5099l;
                X.d.o("backoffPolicy", i5);
                int a3 = q.h.a(i5);
                if (a3 == 0) {
                    i3 = 0;
                } else {
                    if (a3 != 1) {
                        throw new RuntimeException();
                    }
                    i3 = 1;
                }
                c0173i.x(11, i3);
                c0173i.x(12, oVar.f5100m);
                c0173i.x(13, oVar.f5101n);
                c0173i.x(14, oVar.f5102o);
                c0173i.x(15, oVar.f5103p);
                c0173i.x(16, oVar.f5104q ? 1L : 0L);
                int i6 = oVar.f5105r;
                X.d.o("policy", i6);
                int a4 = q.h.a(i6);
                if (a4 == 0) {
                    i4 = 0;
                } else if (a4 != 1) {
                    throw new RuntimeException();
                }
                c0173i.x(17, i4);
                c0173i.x(18, oVar.f5106s);
                c0173i.x(19, oVar.f5107t);
                c0173i.x(20, oVar.f5108u);
                c0173i.x(21, oVar.f5109v);
                c0173i.x(22, oVar.f5110w);
                m0.d dVar = oVar.f5097j;
                if (dVar != null) {
                    c0173i.x(23, u2.l.B(dVar.f3964a));
                    c0173i.x(24, dVar.f3965b ? 1L : 0L);
                    c0173i.x(25, dVar.c ? 1L : 0L);
                    c0173i.x(26, dVar.f3966d ? 1L : 0L);
                    c0173i.x(27, dVar.f3967e ? 1L : 0L);
                    c0173i.x(28, dVar.f3968f);
                    c0173i.x(29, dVar.g);
                    c0173i.f(30, u2.l.I(dVar.h));
                    return;
                }
                c0173i.g(23);
                c0173i.g(24);
                c0173i.g(25);
                c0173i.g(26);
                c0173i.g(27);
                c0173i.g(28);
                c0173i.g(29);
                c0173i.g(30);
                return;
            default:
                q qVar = (q) obj;
                String str10 = qVar.f5122a;
                if (str10 == null) {
                    c0173i.g(1);
                } else {
                    c0173i.h(str10, 1);
                }
                String str11 = qVar.f5123b;
                if (str11 == null) {
                    c0173i.g(2);
                    return;
                } else {
                    c0173i.h(str11, 2);
                    return;
                }
        }
    }

    public final void t(Object obj) {
        C0173i a3 = a();
        try {
            s(a3, obj);
            a3.a();
        } finally {
            p(a3);
        }
    }
}
