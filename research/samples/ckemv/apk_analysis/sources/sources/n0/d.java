package n0;

import androidx.work.OverwritingInputMerger;
import b0.AbstractC0102a;
import f0.C0167c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends AbstractC0102a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f4166d = new d(11, 12, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final d f4167e = new d(12, 13, 1);

    /* renamed from: f, reason: collision with root package name */
    public static final d f4168f = new d(15, 16, 2);
    public static final d g = new d(16, 17, 3);
    public static final d h = new d(1, 2, 4);

    /* renamed from: i, reason: collision with root package name */
    public static final d f4169i = new d(3, 4, 5);

    /* renamed from: j, reason: collision with root package name */
    public static final d f4170j = new d(4, 5, 6);

    /* renamed from: k, reason: collision with root package name */
    public static final d f4171k = new d(6, 7, 7);

    /* renamed from: l, reason: collision with root package name */
    public static final d f4172l = new d(7, 8, 8);

    /* renamed from: m, reason: collision with root package name */
    public static final d f4173m = new d(8, 9, 9);
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i4, int i5) {
        super(i3, i4);
        this.c = i5;
    }

    @Override // b0.AbstractC0102a
    public final void a(C0167c c0167c) {
        Comparable comparable;
        String str;
        switch (this.c) {
            case 0:
                c0167c.A("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                c0167c.A("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                c0167c.A("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                c0167c.A("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                c0167c.A("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                c0167c.A("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                c0167c.A("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                c0167c.A("DROP TABLE `SystemIdInfo`");
                c0167c.A("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                String str2 = "UPDATE WorkSpec\n                SET input_merger_class_name = '" + OverwritingInputMerger.class.getName() + "'\n                WHERE input_merger_class_name IS NULL\n                ";
                X1.g.e(str2, "<this>");
                List f02 = d2.d.f0(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : f02) {
                    if (!d2.l.R((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(L1.m.S(arrayList));
                Iterator it = arrayList.iterator();
                while (true) {
                    int i3 = 0;
                    if (!it.hasNext()) {
                        Iterator it2 = arrayList2.iterator();
                        if (it2.hasNext()) {
                            comparable = (Comparable) it2.next();
                            while (it2.hasNext()) {
                                Comparable comparable2 = (Comparable) it2.next();
                                if (comparable.compareTo(comparable2) > 0) {
                                    comparable = comparable2;
                                }
                            }
                        } else {
                            comparable = null;
                        }
                        Integer num = (Integer) comparable;
                        int intValue = num != null ? num.intValue() : 0;
                        int length = str2.length();
                        f02.size();
                        int Q2 = L1.l.Q(f02);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : f02) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            String str3 = (String) obj2;
                            if ((i3 == 0 || i3 == Q2) && d2.l.R(str3)) {
                                str = null;
                            } else {
                                X1.g.e(str3, "<this>");
                                if (intValue < 0) {
                                    throw new IllegalArgumentException(X.d.g("Requested character count ", intValue, " is less than zero.").toString());
                                }
                                int length2 = str3.length();
                                if (intValue <= length2) {
                                    length2 = intValue;
                                }
                                str = str3.substring(length2);
                                X1.g.d(str, "substring(...)");
                            }
                            if (str != null) {
                                arrayList3.add(str);
                            }
                            i3 = i4;
                        }
                        StringBuilder sb = new StringBuilder(length);
                        L1.k.U(arrayList3, sb, "\n", "", "", -1, "...", null);
                        String sb2 = sb.toString();
                        X1.g.d(sb2, "toString(...)");
                        c0167c.A(sb2);
                        c0167c.A("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )");
                        c0167c.A("INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`");
                        c0167c.A("DROP TABLE `WorkSpec`");
                        c0167c.A("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                        c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)");
                        c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)");
                        return;
                    }
                    String str4 = (String) it.next();
                    int length3 = str4.length();
                    while (true) {
                        if (i3 >= length3) {
                            i3 = -1;
                        } else if (!(!v0.f.A(str4.charAt(i3)))) {
                            i3++;
                        }
                    }
                    if (i3 == -1) {
                        i3 = str4.length();
                    }
                    arrayList2.add(Integer.valueOf(i3));
                }
                break;
            case 4:
                c0167c.A("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                c0167c.A("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                c0167c.A("DROP TABLE IF EXISTS alarmInfo");
                c0167c.A("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 5:
                c0167c.A("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 6:
                c0167c.A("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                c0167c.A("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 7:
                c0167c.A("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 8:
                c0167c.A("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 9:
                c0167c.A("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 10:
                c0167c.A("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c0167c.A("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                c0167c.A("DROP TABLE `WorkSpec`");
                c0167c.A("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            case 11:
                c0167c.A("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c0167c.A("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                c0167c.A("DROP TABLE `WorkSpec`");
                c0167c.A("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c0167c.A("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                return;
            case 12:
                c0167c.A("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
                c0167c.A("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
                return;
            default:
                c0167c.A("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
                return;
        }
    }
}
