.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final f()Lm0/o;
    .locals 81

    move-object/from16 v1, p0

    iget-object v0, v1, Lm0/q;->b:Landroid/content/Context;

    invoke-static {v0}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object v0

    iget-object v2, v0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    const-string v3, "workManager.workDatabase"

    invoke-static {v2, v3}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->s()Lv0/l;

    move-result-object v4

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->v()Lv0/r;

    move-result-object v5

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v2

    iget-object v0, v0, Ln0/s;->e:Lm0/a;

    iget-object v0, v0, Lm0/a;->c:Lm0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v8, 0x1

    invoke-virtual {v0, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    sub-long/2addr v6, v8

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    const/4 v8, 0x1

    invoke-static {v0, v8}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v9

    invoke-virtual {v9, v8, v6, v7}, La0/j;->x(IJ)V

    iget-object v0, v3, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v6, 0x0

    invoke-virtual {v0, v9, v6}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v7

    :try_start_0
    const-string v0, "id"

    invoke-static {v7, v0}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v10, "state"

    invoke-static {v7, v10}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "worker_class_name"

    invoke-static {v7, v11}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "input_merger_class_name"

    invoke-static {v7, v12}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "input"

    invoke-static {v7, v13}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "output"

    invoke-static {v7, v14}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "initial_delay"

    invoke-static {v7, v15}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v6, "interval_duration"

    invoke-static {v7, v6}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v8, "flex_duration"

    invoke-static {v7, v8}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v1, "run_attempt_count"

    invoke-static {v7, v1}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move-object/from16 v16, v2

    const-string v2, "backoff_policy"

    invoke-static {v7, v2}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    move-object/from16 v17, v4

    const-string v4, "backoff_delay_duration"

    invoke-static {v7, v4}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    move-object/from16 v18, v5

    const-string v5, "last_enqueue_time"

    invoke-static {v7, v5}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    move-object/from16 v19, v3

    const-string v3, "minimum_retention_duration"

    invoke-static {v7, v3}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v20, v9

    :try_start_1
    const-string v9, "schedule_requested_at"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v21, v9

    const-string v9, "run_in_foreground"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v22, v9

    const-string v9, "out_of_quota_policy"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v23, v9

    const-string v9, "period_count"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v24, v9

    const-string v9, "generation"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v25, v9

    const-string v9, "next_schedule_time_override"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v26, v9

    const-string v9, "next_schedule_time_override_generation"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v27, v9

    const-string v9, "stop_reason"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v28, v9

    const-string v9, "required_network_type"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v29, v9

    const-string v9, "requires_charging"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v30, v9

    const-string v9, "requires_device_idle"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v31, v9

    const-string v9, "requires_battery_not_low"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v32, v9

    const-string v9, "requires_storage_not_low"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v33, v9

    const-string v9, "trigger_content_update_delay"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v34, v9

    const-string v9, "trigger_max_content_delay"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v35, v9

    const-string v9, "content_uri_triggers"

    invoke-static {v7, v9}, Lm0/z;->B(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    move/from16 v36, v9

    new-instance v9, Ljava/util/ArrayList;

    move/from16 v37, v3

    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_0

    const/16 v39, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v39, v3

    :goto_1
    invoke-interface {v7, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lu2/l;->u(I)I

    move-result v40

    invoke-interface {v7, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v41, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v41, v3

    :goto_2
    invoke-interface {v7, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v42, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v7, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v42, v3

    :goto_3
    invoke-interface {v7, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v7, v13}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v3

    :goto_4
    invoke-static {v3}, Lm0/g;->a([B)Lm0/g;

    move-result-object v43

    invoke-interface {v7, v14}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v7, v14}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v3

    :goto_5
    invoke-static {v3}, Lm0/g;->a([B)Lm0/g;

    move-result-object v44

    invoke-interface {v7, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v45

    invoke-interface {v7, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v47

    invoke-interface {v7, v8}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v49

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v52

    invoke-interface {v7, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    invoke-static {v3}, Lu2/l;->r(I)I

    move-result v53

    invoke-interface {v7, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v54

    invoke-interface {v7, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v56

    move/from16 v3, v37

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v58

    move/from16 v37, v0

    move/from16 v0, v21

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v60

    move/from16 v21, v0

    move/from16 v0, v22

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v22

    const/16 v38, 0x0

    if-eqz v22, :cond_5

    move/from16 v22, v0

    move/from16 v0, v23

    const/16 v62, 0x1

    goto :goto_6

    :cond_5
    move/from16 v22, v0

    move/from16 v0, v23

    move/from16 v62, v38

    :goto_6
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v23

    invoke-static/range {v23 .. v23}, Lu2/l;->t(I)I

    move-result v63

    move/from16 v23, v0

    move/from16 v0, v24

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v64

    move/from16 v24, v0

    move/from16 v0, v25

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    move/from16 v25, v0

    move/from16 v0, v26

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v66

    move/from16 v26, v0

    move/from16 v0, v27

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v68

    move/from16 v27, v0

    move/from16 v0, v28

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v69

    move/from16 v28, v0

    move/from16 v0, v29

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v29

    invoke-static/range {v29 .. v29}, Lu2/l;->s(I)I

    move-result v71

    move/from16 v29, v0

    move/from16 v0, v30

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    if-eqz v30, :cond_6

    move/from16 v30, v0

    move/from16 v0, v31

    const/16 v72, 0x1

    goto :goto_7

    :cond_6
    move/from16 v30, v0

    move/from16 v0, v31

    move/from16 v72, v38

    :goto_7
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    if-eqz v31, :cond_7

    move/from16 v31, v0

    move/from16 v0, v32

    const/16 v73, 0x1

    goto :goto_8

    :cond_7
    move/from16 v31, v0

    move/from16 v0, v32

    move/from16 v73, v38

    :goto_8
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v32

    if-eqz v32, :cond_8

    move/from16 v32, v0

    move/from16 v0, v33

    const/16 v74, 0x1

    goto :goto_9

    :cond_8
    move/from16 v32, v0

    move/from16 v0, v33

    move/from16 v74, v38

    :goto_9
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v33

    if-eqz v33, :cond_9

    move/from16 v33, v0

    move/from16 v0, v34

    const/16 v75, 0x1

    goto :goto_a

    :cond_9
    move/from16 v33, v0

    move/from16 v0, v34

    move/from16 v75, v38

    :goto_a
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v76

    move/from16 v34, v0

    move/from16 v0, v35

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v78

    move/from16 v35, v0

    move/from16 v0, v36

    invoke-interface {v7, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_a

    const/16 v36, 0x0

    goto :goto_b

    :cond_a
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v36

    :goto_b
    invoke-static/range {v36 .. v36}, Lu2/l;->c([B)Ljava/util/LinkedHashSet;

    move-result-object v80

    new-instance v51, Lm0/d;

    move-object/from16 v70, v51

    invoke-direct/range {v70 .. v80}, Lm0/d;-><init>(IZZZZJJLjava/util/Set;)V

    move/from16 v36, v0

    new-instance v0, Lv0/o;

    move-object/from16 v38, v0

    invoke-direct/range {v38 .. v69}, Lv0/o;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lm0/g;Lm0/g;JJJLm0/d;IIJJJJZIIIJII)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v0, v37

    move/from16 v37, v3

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_b
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v20 .. v20}, La0/j;->o()V

    invoke-virtual/range {v19 .. v19}, Lv0/p;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Lv0/p;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_c

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    sget v3, Lz0/b;->a:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    move-object/from16 v5, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    invoke-static {v3, v4, v5, v9}, Lz0/b;->a(Lv0/l;Lv0/r;Lv0/i;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_c

    :cond_c
    move-object/from16 v5, v16

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    :goto_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v6, 0x1

    xor-int/2addr v2, v6

    if-eqz v2, :cond_d

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    sget v6, Lz0/b;->a:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-static {v3, v4, v5, v0}, Lz0/b;->a(Lv0/l;Lv0/r;Lv0/i;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_d
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_e

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v2, Lz0/b;->a:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-static {v3, v4, v5, v1}, Lz0/b;->a(Lv0/l;Lv0/r;Lv0/i;Ljava/util/ArrayList;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_e
    new-instance v0, Lm0/o;

    sget-object v1, Lm0/g;->b:Lm0/g;

    invoke-direct {v0, v1}, Lm0/o;-><init>(Lm0/g;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object/from16 v20, v9

    :goto_d
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {v20 .. v20}, La0/j;->o()V

    throw v0
.end method
