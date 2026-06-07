.class public Lf/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk/H0;
.implements Lj/y;
.implements Lj/k;
.implements Lk/a0;
.implements LJ/q;


# instance fields
.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    packed-switch p1, :pswitch_data_0

    .line 12
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    return-void

    .line 13
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 17
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 18
    invoke-static {p1}, LF/e;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    goto :goto_1

    .line 19
    :cond_0
    :try_start_0
    const-class v0, Landroid/os/Handler;

    const-class v1, Landroid/os/Looper;

    const-class v2, Landroid/os/Handler$Callback;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v1, v2, v3}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 20
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    filled-new-array {p1, v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    .line 22
    instance-of v0, p1, Ljava/lang/RuntimeException;

    if-nez v0, :cond_2

    .line 23
    instance-of v0, p1, Ljava/lang/Error;

    if-eqz v0, :cond_1

    .line 24
    check-cast p1, Ljava/lang/Error;

    throw p1

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 26
    :cond_2
    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    .line 27
    :catch_1
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    .line 28
    :goto_1
    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    return-void

    .line 29
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    return-void

    .line 31
    :pswitch_4
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 32
    const-string v0, "timeUnit"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v0, Lq2/m;

    .line 34
    sget-object v1, Lp2/d;->h:Lp2/d;

    .line 35
    invoke-direct {v0, v1, p1}, Lq2/m;-><init>(Lp2/d;Ljava/util/concurrent/TimeUnit;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    return-void

    .line 38
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lv0/i;)V
    .locals 11

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/4 v3, 0x0

    const-string v4, "trackers"

    invoke-static {p1, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v4, Ls0/a;

    iget-object v5, p1, Lv0/i;->b:Ljava/lang/Object;

    check-cast v5, Lt0/e;

    invoke-direct {v4, v5, v3}, Ls0/a;-><init>(Lt0/e;I)V

    .line 3
    new-instance v5, Ls0/a;

    iget-object v6, p1, Lv0/i;->c:Ljava/lang/Object;

    check-cast v6, Lt0/a;

    invoke-direct {v5, v6}, Ls0/a;-><init>(Lt0/a;)V

    .line 4
    new-instance v6, Ls0/a;

    iget-object v7, p1, Lv0/i;->e:Ljava/lang/Object;

    check-cast v7, Lt0/e;

    invoke-direct {v6, v7, v2}, Ls0/a;-><init>(Lt0/e;I)V

    .line 5
    new-instance v7, Ls0/a;

    iget-object p1, p1, Lv0/i;->d:Ljava/lang/Object;

    check-cast p1, Lt0/e;

    invoke-direct {v7, p1, v1}, Ls0/a;-><init>(Lt0/e;I)V

    .line 6
    new-instance v8, Ls0/a;

    invoke-direct {v8, p1, v0}, Ls0/a;-><init>(Lt0/e;I)V

    .line 7
    new-instance v9, Ls0/g;

    invoke-direct {v9, p1}, Ls0/g;-><init>(Lt0/e;)V

    .line 8
    new-instance v10, Ls0/f;

    invoke-direct {v10, p1}, Ls0/f;-><init>(Lt0/e;)V

    const/4 p1, 0x7

    new-array p1, p1, [Ls0/e;

    aput-object v4, p1, v3

    const/4 v3, 0x1

    aput-object v5, p1, v3

    aput-object v6, p1, v1

    aput-object v7, p1, v0

    aput-object v8, p1, v2

    const/4 v0, 0x5

    aput-object v9, p1, v0

    const/4 v0, 0x6

    aput-object v10, p1, v0

    .line 9
    invoke-static {p1}, LL1/l;->R([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    return-void
.end method

.method public static m(Lf0/c;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'7d73d21f1bd82c9e5268b6dcf9fde2cb\')"

    invoke-virtual {p0, v0}, Lf0/c;->A(Ljava/lang/String;)V

    return-void
.end method

.method public static o(Lf0/c;)LA1/h;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lc0/a;

    const/4 v6, 0x1

    const/4 v7, 0x1

    const-string v4, "work_spec_id"

    const-string v5, "TEXT"

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "work_spec_id"

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const/4 v14, 0x1

    const/4 v15, 0x2

    const-string v12, "prerequisite_id"

    const-string v13, "TEXT"

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v17}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "prerequisite_id"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v12, Lc0/b;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v13, "id"

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const-string v8, "CASCADE"

    const-string v9, "CASCADE"

    const-string v7, "WorkSpec"

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v6, Lc0/b;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const-string v16, "CASCADE"

    const-string v17, "CASCADE"

    const-string v15, "WorkSpec"

    move-object v14, v6

    invoke-direct/range {v14 .. v19}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lc0/d;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v9, "ASC"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v11, "index_Dependency_work_spec_id"

    const/4 v12, 0x0

    invoke-direct {v7, v11, v12, v8, v10}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v7, Lc0/d;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v10, "index_Dependency_prerequisite_id"

    invoke-direct {v7, v10, v12, v5, v8}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v5, Lc0/e;

    const-string v7, "Dependency"

    invoke-direct {v5, v7, v1, v4, v6}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v7}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v1

    invoke-virtual {v5, v1}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v6, "\n Found:\n"

    if-nez v4, :cond_0

    new-instance v0, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/16 v4, 0x1e

    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    new-instance v4, Lc0/a;

    const-string v15, "id"

    const-string v16, "TEXT"

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x1

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v13, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v22, "state"

    const-string v23, "INTEGER"

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v24, 0x1

    const/16 v25, 0x0

    move-object/from16 v21, v4

    invoke-direct/range {v21 .. v27}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "state"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "worker_class_name"

    const-string v16, "TEXT"

    const/16 v18, 0x0

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "worker_class_name"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "input_merger_class_name"

    const-string v16, "TEXT"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "input_merger_class_name"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "input"

    const-string v16, "BLOB"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "input"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "output"

    const-string v16, "BLOB"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "output"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "initial_delay"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "initial_delay"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "interval_duration"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "interval_duration"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "flex_duration"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "flex_duration"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "run_attempt_count"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "run_attempt_count"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "backoff_policy"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "backoff_policy"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "backoff_delay_duration"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "backoff_delay_duration"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "last_enqueue_time"

    const-string v16, "INTEGER"

    const-string v19, "-1"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "last_enqueue_time"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "minimum_retention_duration"

    const-string v16, "INTEGER"

    const/16 v19, 0x0

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "minimum_retention_duration"

    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "schedule_requested_at"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "schedule_requested_at"

    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "run_in_foreground"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "run_in_foreground"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "out_of_quota_policy"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "out_of_quota_policy"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "period_count"

    const-string v16, "INTEGER"

    const-string v19, "0"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "period_count"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "generation"

    const-string v16, "INTEGER"

    const-string v19, "0"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "generation"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "next_schedule_time_override"

    const-string v16, "INTEGER"

    const-string v19, "9223372036854775807"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "next_schedule_time_override"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "next_schedule_time_override_generation"

    const-string v16, "INTEGER"

    const-string v19, "0"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "next_schedule_time_override_generation"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "stop_reason"

    const-string v16, "INTEGER"

    const-string v19, "-256"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "stop_reason"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "required_network_type"

    const-string v16, "INTEGER"

    const/16 v19, 0x0

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "required_network_type"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "requires_charging"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "requires_charging"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "requires_device_idle"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "requires_device_idle"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "requires_battery_not_low"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "requires_battery_not_low"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "requires_storage_not_low"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "requires_storage_not_low"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "trigger_content_update_delay"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "trigger_content_update_delay"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "trigger_max_content_delay"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "trigger_max_content_delay"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const-string v15, "content_uri_triggers"

    const-string v16, "BLOB"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "content_uri_triggers"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lc0/d;

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const-string v15, "index_WorkSpec_schedule_requested_at"

    invoke-direct {v11, v15, v12, v7, v14}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v10, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v7, Lc0/d;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const-string v14, "index_WorkSpec_last_enqueue_time"

    invoke-direct {v7, v14, v12, v5, v11}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v10, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v5, Lc0/e;

    const-string v7, "WorkSpec"

    invoke-direct {v5, v7, v1, v4, v10}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v7}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v1

    invoke-virtual {v5, v1}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v0, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v4, Lc0/a;

    const/16 v17, 0x1

    const/16 v18, 0x1

    const-string v15, "tag"

    const-string v16, "TEXT"

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "tag"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const/16 v18, 0x2

    const-string v15, "work_spec_id"

    const-string v16, "TEXT"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lc0/b;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const-string v16, "CASCADE"

    const-string v17, "CASCADE"

    const-string v15, "WorkSpec"

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Lc0/d;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const-string v15, "index_WorkTag_work_spec_id"

    invoke-direct {v10, v15, v12, v11, v14}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v10, Lc0/e;

    const-string v11, "WorkTag"

    invoke-direct {v10, v11, v1, v4, v7}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v11}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v1

    invoke-virtual {v10, v1}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    new-instance v0, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    const/4 v4, 0x3

    invoke-direct {v1, v4}, Ljava/util/HashMap;-><init>(I)V

    new-instance v4, Lc0/a;

    const/16 v17, 0x1

    const/16 v18, 0x1

    const-string v15, "work_spec_id"

    const-string v16, "TEXT"

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const/16 v24, 0x1

    const/16 v25, 0x2

    const-string v22, "generation"

    const-string v23, "INTEGER"

    const-string v26, "0"

    const/16 v27, 0x1

    move-object/from16 v21, v4

    invoke-direct/range {v21 .. v27}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const/16 v18, 0x0

    const-string v15, "system_id"

    const-string v16, "INTEGER"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "system_id"

    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lc0/b;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const-string v16, "CASCADE"

    const-string v17, "CASCADE"

    const-string v15, "WorkSpec"

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Lc0/e;

    const-string v10, "SystemIdInfo"

    invoke-direct {v8, v10, v1, v4, v7}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v10}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v1

    invoke-virtual {v8, v1}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    new-instance v0, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v4, Lc0/a;

    const/16 v17, 0x1

    const/16 v18, 0x1

    const-string v15, "name"

    const-string v16, "TEXT"

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "name"

    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const/16 v18, 0x2

    const-string v15, "work_spec_id"

    const-string v16, "TEXT"

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lc0/b;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const-string v16, "CASCADE"

    const-string v17, "CASCADE"

    const-string v15, "WorkSpec"

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Lc0/d;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const-string v11, "index_WorkName_work_spec_id"

    invoke-direct {v8, v11, v12, v10, v9}, Lc0/d;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v8, Lc0/e;

    const-string v9, "WorkName"

    invoke-direct {v8, v9, v1, v4, v7}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v9}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v1

    invoke-virtual {v8, v1}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    new-instance v0, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v4, Lc0/a;

    const/16 v17, 0x1

    const/16 v18, 0x1

    const-string v15, "work_spec_id"

    const-string v16, "TEXT"

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object v14, v4

    invoke-direct/range {v14 .. v20}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lc0/a;

    const/16 v24, 0x1

    const/16 v25, 0x0

    const-string v22, "progress"

    const-string v23, "BLOB"

    const/16 v26, 0x0

    const/16 v27, 0x1

    move-object/from16 v21, v4

    invoke-direct/range {v21 .. v27}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "progress"

    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lc0/b;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const-string v16, "CASCADE"

    const-string v17, "CASCADE"

    const-string v15, "WorkSpec"

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, Lc0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lc0/e;

    const-string v8, "WorkProgress"

    invoke-direct {v7, v8, v1, v4, v3}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v8}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v1

    invoke-virtual {v7, v1}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    new-instance v0, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Lc0/a;

    const/16 v16, 0x1

    const/16 v17, 0x1

    const-string v14, "key"

    const-string v15, "TEXT"

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "key"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lc0/a;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-string v14, "long_value"

    const-string v15, "INTEGER"

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, Lc0/a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "long_value"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lc0/e;

    const-string v7, "Preference"

    invoke-direct {v4, v7, v1, v2, v3}, Lc0/e;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v0, v7}, Lc0/e;->a(Lf0/c;Ljava/lang/String;)Lc0/e;

    move-result-object v0

    invoke-virtual {v4, v0}, Lc0/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, LA1/h;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Preference(androidx.work.impl.model.Preference).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v12, v0}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_6
    new-instance v0, LA1/h;

    const/4 v1, 0x0

    invoke-direct {v0, v5, v1}, LA1/h;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Lj/m;Z)V
    .locals 2

    instance-of v0, p1, Lj/F;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lj/F;

    iget-object v0, v0, Lj/F;->z:Lj/m;

    invoke-virtual {v0}, Lj/m;->k()Lj/m;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj/m;->c(Z)V

    :cond_0
    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Lk/j;

    iget-object v0, v0, Lk/j;->f:Lj/y;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lj/y;->a(Lj/m;Z)V

    :cond_1
    return-void
.end method

.method public b(Lj/m;)Z
    .locals 3

    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Lk/j;

    iget-object v1, v0, Lk/j;->d:Lj/m;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move-object v1, p1

    check-cast v1, Lj/F;

    iget-object v1, v1, Lj/F;->A:Lj/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lk/j;->f:Lj/y;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lj/y;->b(Lj/m;)Z

    move-result v2

    :cond_1
    return v2
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public d(Lj/m;Lj/o;)V
    .locals 7

    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Lj/g;

    iget-object v1, v0, Lj/g;->h:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, v0, Lj/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj/f;

    iget-object v6, v6, Lj/f;->b:Lj/m;

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_1
    if-ne v4, v5, :cond_2

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lj/f;

    :cond_3
    new-instance v1, Lj/e;

    invoke-direct {v1, p0, v2, p2, p1}, Lj/e;-><init>(Lf/G;Lj/f;Lj/o;Lj/m;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    add-long/2addr v2, v4

    iget-object p2, v0, Lj/g;->h:Landroid/os/Handler;

    invoke-virtual {p2, v1, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public e(Lj/m;)V
    .locals 1

    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Lj/k;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lj/k;->e(Lj/m;)V

    :cond_0
    return-void
.end method

.method public f(Landroid/view/View;LJ/y0;)LJ/y0;
    .locals 6

    const/4 p1, 0x1

    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:LJ/y0;

    invoke-static {v1, p2}, LI/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:LJ/y0;

    invoke-virtual {p2}, LJ/y0;->d()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, p1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    iget-object v1, p2, LJ/y0;->a:LJ/w0;

    invoke-virtual {v1}, LJ/w0;->m()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    :goto_2
    if-ge v2, v3, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    sget-object v5, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-static {v4}, LJ/B;->b(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Lv/d;

    iget-object v4, v4, Lv/d;->a:Lv/a;

    if-eqz v4, :cond_3

    invoke-virtual {v1}, LJ/w0;->m()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/2addr v2, p1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-object p2
.end method

.method public g(Lj/m;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->B:Lk/m;

    if-eqz p1, :cond_1

    check-cast p1, Lk/g1;

    iget-object p1, p1, Lk/g1;->b:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->H:LA/h;

    iget-object p1, p1, LA/h;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LX/d;->q(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public h(I)V
    .locals 0

    return-void
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p2}, Ld2/d;->n0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j(Lj/m;Landroid/view/MenuItem;)V
    .locals 0

    iget-object p2, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast p2, Lj/g;

    iget-object p2, p2, Lj/g;->h:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public k(Lv0/o;)Z
    .locals 7

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ls0/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, p1}, Ls0/e;->b(Lv0/o;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Ls0/e;->a:Lt0/e;

    invoke-virtual {v3}, Lt0/e;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls0/e;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    sget v0, Lr0/k;->a:I

    sget-object v4, Lr0/f;->c:Lr0/f;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/16 v5, 0x1f

    move-object v0, v6

    invoke-static/range {v0 .. v5}, LL1/k;->W(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LW1/l;I)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    return p1
.end method

.method public l()Lm2/j;
    .locals 3

    new-instance v0, Lm2/j;

    iget-object v1, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-direct {v0, v1}, Lm2/j;-><init>([Ljava/lang/String;)V

    return-object v0
.end method

.method public n([II)V
    .locals 21

    move-object/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x1

    array-length v3, v0

    if-eqz v3, :cond_27

    array-length v3, v0

    const/4 v4, 0x0

    if-le v3, v2, :cond_2

    aget v5, v0, v4

    if-nez v5, :cond_2

    move v5, v2

    :goto_0
    if-ge v5, v3, :cond_0

    aget v6, v0, v5

    if-nez v6, :cond_0

    add-int/2addr v5, v2

    goto :goto_0

    :cond_0
    if-ne v5, v3, :cond_1

    filled-new-array {v4}, [I

    move-result-object v3

    goto :goto_1

    :cond_1
    sub-int/2addr v3, v5

    new-array v6, v3, [I

    invoke-static {v0, v5, v6, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v3, v6

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    new-array v5, v1, [I

    move-object/from16 v6, p0

    move v8, v2

    move v7, v4

    :goto_2
    iget-object v9, v6, Lf/G;->b:Ljava/lang/Object;

    check-cast v9, Lr1/a;

    if-ge v7, v1, :cond_8

    iget v10, v9, Lr1/a;->g:I

    add-int/2addr v10, v7

    iget-object v11, v9, Lr1/a;->a:[I

    aget v10, v11, v10

    if-nez v10, :cond_3

    array-length v9, v3

    sub-int/2addr v9, v2

    aget v9, v3, v9

    goto :goto_5

    :cond_3
    if-ne v10, v2, :cond_5

    array-length v9, v3

    move v10, v4

    move v11, v10

    :goto_3
    if-ge v11, v9, :cond_4

    aget v12, v3, v11

    sget-object v13, Lr1/a;->h:Lr1/a;

    xor-int/2addr v10, v12

    add-int/2addr v11, v2

    goto :goto_3

    :cond_4
    move v9, v10

    goto :goto_5

    :cond_5
    aget v11, v3, v4

    array-length v12, v3

    move v13, v2

    :goto_4
    if-ge v13, v12, :cond_6

    invoke-virtual {v9, v10, v11}, Lr1/a;->b(II)I

    move-result v11

    aget v14, v3, v13

    xor-int/2addr v11, v14

    add-int/2addr v13, v2

    goto :goto_4

    :cond_6
    move v9, v11

    :goto_5
    add-int/lit8 v10, v1, -0x1

    sub-int/2addr v10, v7

    aput v9, v5, v10

    if-eqz v9, :cond_7

    move v8, v4

    :cond_7
    add-int/2addr v7, v2

    goto :goto_2

    :cond_8
    if-eqz v8, :cond_9

    return-void

    :cond_9
    new-instance v3, Lv0/l;

    invoke-direct {v3, v9, v5}, Lv0/l;-><init>(Lr1/a;[I)V

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz v1, :cond_26

    add-int/lit8 v5, v1, 0x1

    new-array v5, v5, [I

    aput v2, v5, v4

    new-instance v7, Lv0/l;

    invoke-direct {v7, v9, v5}, Lv0/l;-><init>(Lr1/a;[I)V

    invoke-virtual {v7}, Lv0/l;->d()I

    move-result v5

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v8

    if-ge v5, v8, :cond_a

    goto :goto_6

    :cond_a
    move-object/from16 v20, v7

    move-object v7, v3

    move-object/from16 v3, v20

    :goto_6
    iget-object v5, v9, Lr1/a;->c:Lv0/l;

    iget-object v8, v9, Lr1/a;->d:Lv0/l;

    move-object v10, v5

    :goto_7
    move-object/from16 v20, v7

    move-object v7, v3

    move-object/from16 v3, v20

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v11

    div-int/lit8 v12, v1, 0x2

    if-lt v11, v12, :cond_18

    invoke-virtual {v3}, Lv0/l;->g()Z

    move-result v11

    if-nez v11, :cond_17

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v11

    invoke-virtual {v3, v11}, Lv0/l;->c(I)I

    move-result v11

    invoke-virtual {v9, v11}, Lr1/a;->a(I)I

    move-result v11

    move-object v12, v5

    :goto_8
    invoke-virtual {v7}, Lv0/l;->d()I

    move-result v13

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v14

    if-lt v13, v14, :cond_10

    invoke-virtual {v7}, Lv0/l;->g()Z

    move-result v13

    if-nez v13, :cond_10

    invoke-virtual {v7}, Lv0/l;->d()I

    move-result v13

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v14

    sub-int/2addr v13, v14

    invoke-virtual {v7}, Lv0/l;->d()I

    move-result v14

    invoke-virtual {v7, v14}, Lv0/l;->c(I)I

    move-result v14

    invoke-virtual {v9, v14, v11}, Lr1/a;->b(II)I

    move-result v14

    if-ltz v13, :cond_f

    if-nez v14, :cond_b

    move-object v4, v5

    goto :goto_9

    :cond_b
    add-int/lit8 v15, v13, 0x1

    new-array v15, v15, [I

    aput v14, v15, v4

    new-instance v4, Lv0/l;

    invoke-direct {v4, v9, v15}, Lv0/l;-><init>(Lr1/a;[I)V

    :goto_9
    invoke-virtual {v12, v4}, Lv0/l;->a(Lv0/l;)Lv0/l;

    move-result-object v12

    if-ltz v13, :cond_e

    iget-object v4, v3, Lv0/l;->d:Ljava/lang/Object;

    check-cast v4, Lr1/a;

    if-nez v14, :cond_c

    iget-object v4, v4, Lr1/a;->c:Lv0/l;

    goto :goto_b

    :cond_c
    iget-object v15, v3, Lv0/l;->e:Ljava/lang/Object;

    check-cast v15, [I

    array-length v2, v15

    add-int/2addr v13, v2

    new-array v13, v13, [I

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v2, :cond_d

    move/from16 v16, v2

    aget v2, v15, v1

    invoke-virtual {v4, v2, v14}, Lr1/a;->b(II)I

    move-result v2

    aput v2, v13, v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    move/from16 v2, v16

    goto :goto_a

    :cond_d
    new-instance v1, Lv0/l;

    invoke-direct {v1, v4, v13}, Lv0/l;-><init>(Lr1/a;[I)V

    move-object v4, v1

    :goto_b
    invoke-virtual {v7, v4}, Lv0/l;->a(Lv0/l;)Lv0/l;

    move-result-object v7

    move/from16 v1, p2

    const/4 v2, 0x1

    const/4 v4, 0x0

    goto :goto_8

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_10
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v8, Lv0/l;->d:Ljava/lang/Object;

    check-cast v1, Lr1/a;

    iget-object v2, v12, Lv0/l;->d:Ljava/lang/Object;

    check-cast v2, Lr1/a;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v12}, Lv0/l;->g()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual {v8}, Lv0/l;->g()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_e

    :cond_11
    iget-object v1, v12, Lv0/l;->e:Ljava/lang/Object;

    check-cast v1, [I

    array-length v4, v1

    iget-object v11, v8, Lv0/l;->e:Ljava/lang/Object;

    check-cast v11, [I

    array-length v12, v11

    add-int v13, v4, v12

    const/4 v14, 0x1

    sub-int/2addr v13, v14

    new-array v13, v13, [I

    const/4 v14, 0x0

    :goto_c
    if-ge v14, v4, :cond_13

    aget v15, v1, v14

    move-object/from16 v16, v1

    const/4 v1, 0x0

    :goto_d
    if-ge v1, v12, :cond_12

    add-int v17, v14, v1

    aget v18, v13, v17

    move/from16 v19, v4

    aget v4, v11, v1

    invoke-virtual {v2, v15, v4}, Lr1/a;->b(II)I

    move-result v4

    xor-int v4, v18, v4

    aput v4, v13, v17

    const/4 v4, 0x1

    add-int/2addr v1, v4

    move/from16 v4, v19

    goto :goto_d

    :cond_12
    move/from16 v19, v4

    const/4 v4, 0x1

    add-int/2addr v14, v4

    move-object/from16 v1, v16

    move/from16 v4, v19

    goto :goto_c

    :cond_13
    new-instance v1, Lv0/l;

    invoke-direct {v1, v2, v13}, Lv0/l;-><init>(Lr1/a;[I)V

    goto :goto_f

    :cond_14
    :goto_e
    iget-object v1, v2, Lr1/a;->c:Lv0/l;

    :goto_f
    invoke-virtual {v1, v10}, Lv0/l;->a(Lv0/l;)Lv0/l;

    move-result-object v1

    invoke-virtual {v7}, Lv0/l;->d()I

    move-result v2

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v4

    if-ge v2, v4, :cond_15

    move-object v10, v8

    const/4 v2, 0x1

    const/4 v4, 0x0

    move-object v8, v1

    move/from16 v1, p2

    goto/16 :goto_7

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Division algorithm failed to reduce polynomial?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "GenericGFPolys do not have same GenericGF field"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Lr1/b;

    const-string v1, "r_{i-1} was zero"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    move v1, v4

    invoke-virtual {v8, v1}, Lv0/l;->c(I)I

    move-result v2

    if-eqz v2, :cond_25

    invoke-virtual {v9, v2}, Lr1/a;->a(I)I

    move-result v2

    invoke-virtual {v8, v2}, Lv0/l;->i(I)Lv0/l;

    move-result-object v4

    invoke-virtual {v3, v2}, Lv0/l;->i(I)Lv0/l;

    move-result-object v2

    filled-new-array {v4, v2}, [Lv0/l;

    move-result-object v2

    aget-object v3, v2, v1

    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-virtual {v3}, Lv0/l;->d()I

    move-result v5

    if-ne v5, v4, :cond_19

    invoke-virtual {v3, v4}, Lv0/l;->c(I)I

    move-result v3

    filled-new-array {v3}, [I

    move-result-object v3

    goto :goto_12

    :cond_19
    new-array v4, v5, [I

    move v8, v1

    const/4 v7, 0x1

    :goto_10
    iget v10, v9, Lr1/a;->e:I

    if-ge v7, v10, :cond_1b

    if-ge v8, v5, :cond_1b

    invoke-virtual {v3, v7}, Lv0/l;->b(I)I

    move-result v10

    if-nez v10, :cond_1a

    invoke-virtual {v9, v7}, Lr1/a;->a(I)I

    move-result v10

    aput v10, v4, v8

    const/4 v10, 0x1

    add-int/2addr v8, v10

    goto :goto_11

    :cond_1a
    const/4 v10, 0x1

    :goto_11
    add-int/2addr v7, v10

    goto :goto_10

    :cond_1b
    if-ne v8, v5, :cond_24

    move-object v3, v4

    :goto_12
    array-length v4, v3

    new-array v5, v4, [I

    move v7, v1

    :goto_13
    if-ge v7, v4, :cond_20

    aget v8, v3, v7

    invoke-virtual {v9, v8}, Lr1/a;->a(I)I

    move-result v8

    move v11, v1

    const/4 v10, 0x1

    :goto_14
    if-ge v11, v4, :cond_1e

    if-eq v7, v11, :cond_1d

    aget v12, v3, v11

    invoke-virtual {v9, v12, v8}, Lr1/a;->b(II)I

    move-result v12

    const/4 v13, 0x1

    and-int/lit8 v14, v12, 0x1

    if-nez v14, :cond_1c

    or-int/2addr v12, v13

    goto :goto_15

    :cond_1c
    and-int/lit8 v12, v12, -0x2

    :goto_15
    invoke-virtual {v9, v10, v12}, Lr1/a;->b(II)I

    move-result v10

    goto :goto_16

    :cond_1d
    const/4 v13, 0x1

    :goto_16
    add-int/2addr v11, v13

    goto :goto_14

    :cond_1e
    invoke-virtual {v2, v8}, Lv0/l;->b(I)I

    move-result v11

    invoke-virtual {v9, v10}, Lr1/a;->a(I)I

    move-result v10

    invoke-virtual {v9, v11, v10}, Lr1/a;->b(II)I

    move-result v10

    aput v10, v5, v7

    iget v11, v9, Lr1/a;->g:I

    if-eqz v11, :cond_1f

    invoke-virtual {v9, v10, v8}, Lr1/a;->b(II)I

    move-result v8

    aput v8, v5, v7

    :cond_1f
    const/4 v8, 0x1

    add-int/2addr v7, v8

    goto :goto_13

    :cond_20
    const/4 v8, 0x1

    move v4, v1

    :goto_17
    array-length v1, v3

    if-ge v4, v1, :cond_23

    array-length v1, v0

    sub-int/2addr v1, v8

    aget v2, v3, v4

    if-eqz v2, :cond_22

    iget-object v7, v9, Lr1/a;->b:[I

    aget v2, v7, v2

    sub-int/2addr v1, v2

    if-ltz v1, :cond_21

    aget v2, v0, v1

    aget v7, v5, v4

    xor-int/2addr v2, v7

    aput v2, v0, v1

    const/4 v1, 0x1

    add-int/2addr v4, v1

    move v8, v1

    goto :goto_17

    :cond_21
    new-instance v0, Lr1/b;

    const-string v1, "Bad error location"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_23
    return-void

    :cond_24
    new-instance v0, Lr1/b;

    const-string v1, "Error locator degree does not match number of roots"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v0, Lr1/b;

    const-string v1, "sigmaTilde(0) was zero"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_27
    move-object/from16 v6, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public p(Ljava/util/HashMap;)V
    .locals 8

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/lang/Boolean;

    if-eq v3, v4, :cond_e

    const-class v4, Ljava/lang/Byte;

    if-eq v3, v4, :cond_e

    const-class v4, Ljava/lang/Integer;

    if-eq v3, v4, :cond_e

    const-class v4, Ljava/lang/Long;

    if-eq v3, v4, :cond_e

    const-class v4, Ljava/lang/Float;

    if-eq v3, v4, :cond_e

    const-class v4, Ljava/lang/Double;

    if-eq v3, v4, :cond_e

    const-class v4, Ljava/lang/String;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/Boolean;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/Byte;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/Integer;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/Long;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/Float;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/Double;

    if-eq v3, v4, :cond_e

    const-class v4, [Ljava/lang/String;

    if-ne v3, v4, :cond_1

    goto/16 :goto_7

    :cond_1
    const-class v4, [Z

    const/4 v5, 0x0

    if-ne v3, v4, :cond_3

    check-cast v0, [Z

    sget-object v3, Lm0/g;->b:Lm0/g;

    array-length v3, v0

    new-array v3, v3, [Ljava/lang/Boolean;

    :goto_1
    array-length v4, v0

    if-ge v5, v4, :cond_2

    aget-boolean v4, v0, v5

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    const-class v4, [B

    if-ne v3, v4, :cond_5

    check-cast v0, [B

    sget-object v3, Lm0/g;->b:Lm0/g;

    array-length v3, v0

    new-array v3, v3, [Ljava/lang/Byte;

    :goto_2
    array-length v4, v0

    if-ge v5, v4, :cond_4

    aget-byte v4, v0, v5

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_5
    const-class v4, [I

    if-ne v3, v4, :cond_7

    check-cast v0, [I

    sget-object v3, Lm0/g;->b:Lm0/g;

    array-length v3, v0

    new-array v3, v3, [Ljava/lang/Integer;

    :goto_3
    array-length v4, v0

    if-ge v5, v4, :cond_6

    aget v4, v0, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    const-class v4, [J

    if-ne v3, v4, :cond_9

    check-cast v0, [J

    sget-object v3, Lm0/g;->b:Lm0/g;

    array-length v3, v0

    new-array v3, v3, [Ljava/lang/Long;

    :goto_4
    array-length v4, v0

    if-ge v5, v4, :cond_8

    aget-wide v6, v0, v5

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_8
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    const-class v4, [F

    if-ne v3, v4, :cond_b

    check-cast v0, [F

    sget-object v3, Lm0/g;->b:Lm0/g;

    array-length v3, v0

    new-array v3, v3, [Ljava/lang/Float;

    :goto_5
    array-length v4, v0

    if-ge v5, v4, :cond_a

    aget v4, v0, v5

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_a
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_b
    const-class v4, [D

    if-ne v3, v4, :cond_d

    check-cast v0, [D

    sget-object v3, Lm0/g;->b:Lm0/g;

    array-length v3, v0

    new-array v3, v3, [Ljava/lang/Double;

    :goto_6
    array-length v4, v0

    if-ge v5, v4, :cond_c

    aget-wide v6, v0, v5

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_c
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Key "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " has invalid type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_7
    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_f
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {p1, v2}, Ld2/l;->Q(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v0, v0, -0x2

    :cond_0
    add-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_1
    return-void
.end method
