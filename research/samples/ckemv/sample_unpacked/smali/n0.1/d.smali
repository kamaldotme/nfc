.class public final Ln0/d;
.super Lb0/a;
.source "SourceFile"


# static fields
.field public static final d:Ln0/d;

.field public static final e:Ln0/d;

.field public static final f:Ln0/d;

.field public static final g:Ln0/d;

.field public static final h:Ln0/d;

.field public static final i:Ln0/d;

.field public static final j:Ln0/d;

.field public static final k:Ln0/d;

.field public static final l:Ln0/d;

.field public static final m:Ln0/d;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    new-instance v0, Ln0/d;

    const/16 v1, 0xb

    const/16 v2, 0xc

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->d:Ln0/d;

    new-instance v0, Ln0/d;

    const/16 v1, 0xc

    const/16 v2, 0xd

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->e:Ln0/d;

    new-instance v0, Ln0/d;

    const/16 v1, 0xf

    const/16 v2, 0x10

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->f:Ln0/d;

    new-instance v0, Ln0/d;

    const/16 v1, 0x10

    const/16 v2, 0x11

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->g:Ln0/d;

    new-instance v0, Ln0/d;

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->h:Ln0/d;

    new-instance v0, Ln0/d;

    const/4 v1, 0x3

    const/4 v2, 0x4

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->i:Ln0/d;

    new-instance v0, Ln0/d;

    const/4 v1, 0x4

    const/4 v2, 0x5

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->j:Ln0/d;

    new-instance v0, Ln0/d;

    const/4 v1, 0x6

    const/4 v2, 0x7

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->k:Ln0/d;

    new-instance v0, Ln0/d;

    const/4 v1, 0x7

    const/16 v2, 0x8

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->l:Ln0/d;

    new-instance v0, Ln0/d;

    const/16 v1, 0x8

    const/16 v2, 0x9

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Ln0/d;-><init>(III)V

    sput-object v0, Ln0/d;->m:Ln0/d;

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    iput p3, p0, Ln0/d;->c:I

    invoke-direct {p0, p1, p2}, Lb0/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final a(Lf0/c;)V
    .locals 10

    iget v0, p0, Ln0/d;->c:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_1
    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "DROP TABLE `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_2
    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "DROP TABLE `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_3
    const-string v0, "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_4
    const-string v0, "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_5
    const-string v0, "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_6
    const-string v0, "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_7
    const-string v0, "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_8
    const-string v0, "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS alarmInfo"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UPDATE WorkSpec\n                SET input_merger_class_name = \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'\n                WHERE input_merger_class_name IS NULL\n                "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ld2/d;->f0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ld2/l;->R(Ljava/lang/String;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3}, LL1/m;->S(Ljava/lang/Iterable;)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    :goto_2
    const/4 v8, -0x1

    if-ge v6, v7, :cond_3

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Lv0/f;->A(C)Z

    move-result v9

    xor-int/lit8 v9, v9, 0x1

    if-eqz v9, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    move v6, v8

    :goto_3
    if-ne v6, v8, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    :cond_4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_6

    move-object v4, v5

    goto :goto_5

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Comparable;

    invoke-interface {v4, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v8

    if-lez v8, :cond_7

    move-object v4, v7

    goto :goto_4

    :cond_8
    :goto_5
    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_6

    :cond_9
    move v3, v6

    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    invoke-static {v2}, LL1/l;->Q(Ljava/util/List;)I

    move-result v4

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v6, 0x1

    if-ltz v6, :cond_f

    check-cast v8, Ljava/lang/String;

    if-eqz v6, :cond_a

    if-ne v6, v4, :cond_b

    :cond_a
    invoke-static {v8}, Ld2/l;->R(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    move-object v6, v5

    goto :goto_9

    :cond_b
    invoke-static {v8, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v3, :cond_e

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v6

    if-le v3, v6, :cond_c

    goto :goto_8

    :cond_c
    move v6, v3

    :goto_8
    invoke-virtual {v8, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    const-string v8, "substring(...)"

    invoke-static {v6, v8}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_9
    if-eqz v6, :cond_d

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    move v6, v9

    goto :goto_7

    :cond_e
    const-string p1, "Requested character count "

    const-string v0, " is less than zero."

    invoke-static {p1, v3, v0}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string v0, "Index overflow has happened."

    invoke-direct {p1, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v7, v1}, LL1/k;->V(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (\n                `id` TEXT NOT NULL,\n                `state` INTEGER NOT NULL,\n                `worker_class_name` TEXT NOT NULL,\n                `input_merger_class_name` TEXT NOT NULL,\n                `input` BLOB NOT NULL,\n                `output` BLOB NOT NULL,\n                `initial_delay` INTEGER NOT NULL,\n                `interval_duration` INTEGER NOT NULL,\n                `flex_duration` INTEGER NOT NULL,\n                `run_attempt_count` INTEGER NOT NULL,\n                `backoff_policy` INTEGER NOT NULL,\n                `backoff_delay_duration` INTEGER NOT NULL,\n                `last_enqueue_time` INTEGER NOT NULL,\n                `minimum_retention_duration` INTEGER NOT NULL,\n                `schedule_requested_at` INTEGER NOT NULL,\n                `run_in_foreground` INTEGER NOT NULL,\n                `out_of_quota_policy` INTEGER NOT NULL,\n                `period_count` INTEGER NOT NULL DEFAULT 0,\n                `generation` INTEGER NOT NULL DEFAULT 0,\n                `required_network_type` INTEGER NOT NULL,\n                `requires_charging` INTEGER NOT NULL,\n                `requires_device_idle` INTEGER NOT NULL,\n                `requires_battery_not_low` INTEGER NOT NULL,\n                `requires_storage_not_low` INTEGER NOT NULL,\n                `trigger_content_update_delay` INTEGER NOT NULL,\n                `trigger_max_content_delay` INTEGER NOT NULL,\n                `content_uri_triggers` BLOB NOT NULL,\n                PRIMARY KEY(`id`)\n                )"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "INSERT INTO `_new_WorkSpec` (\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            ) SELECT\n            `id`,\n            `state`,\n            `worker_class_name`,\n            `input_merger_class_name`,\n            `input`,\n            `output`,\n            `initial_delay`,\n            `interval_duration`,\n            `flex_duration`,\n            `run_attempt_count`,\n            `backoff_policy`,\n            `backoff_delay_duration`,\n            `last_enqueue_time`,\n            `minimum_retention_duration`,\n            `schedule_requested_at`,\n            `run_in_foreground`,\n            `out_of_quota_policy`,\n            `period_count`,\n            `generation`,\n            `required_network_type`,\n            `requires_charging`,\n            `requires_device_idle`,\n            `requires_battery_not_low`,\n            `requires_storage_not_low`,\n            `trigger_content_update_delay`,\n            `trigger_max_content_delay`,\n            `content_uri_triggers`\n            FROM `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "DROP TABLE `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at`ON `WorkSpec` (`schedule_requested_at`)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON`WorkSpec` (`last_enqueue_time`)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_a
    const-string v0, "DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "DROP TABLE `SystemIdInfo`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_b
    const-string v0, "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL "

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "UPDATE workspec SET content_uri_triggers = x\'\' WHERE content_uri_triggers is NULL"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    :pswitch_c
    const-string v0, "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {p1, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
