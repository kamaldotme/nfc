.class public final Lw0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final f:J


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ln0/s;

.field public final d:Lw0/i;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "ForceStopRunnable"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xe42

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lw0/f;->f:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ln0/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lw0/f;->b:Landroid/content/Context;

    iput-object p2, p0, Lw0/f;->c:Ln0/s;

    iget-object p1, p2, Ln0/s;->j:Lw0/i;

    iput-object p1, p0, Lw0/f;->d:Lw0/i;

    const/4 p1, 0x0

    iput p1, p0, Lw0/f;->e:I

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 5

    const-string v0, "alarm"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_0

    const/high16 v1, 0xa000000

    goto :goto_0

    :cond_0
    const/high16 v1, 0x8000000

    :goto_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    new-instance v3, Landroid/content/ComponentName;

    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v3, -0x1

    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-wide v3, Lw0/f;->f:J

    add-long/2addr v1, v3

    if-eqz v0, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 16

    move-object/from16 v1, p0

    const/4 v0, 0x1

    const-string v2, "last_force_stop_ms"

    iget-object v3, v1, Lw0/f;->d:Lw0/i;

    iget-object v4, v1, Lw0/f;->c:Ln0/s;

    iget-object v5, v4, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    sget v6, Lq0/b;->g:I

    iget-object v6, v1, Lw0/f;->b:Landroid/content/Context;

    const-string v7, "jobscheduler"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/app/job/JobScheduler;

    invoke-static {v6, v7}, Lq0/b;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    const/4 v11, 0x0

    invoke-static {v10, v11}, La0/j;->a(Ljava/lang/String;I)La0/j;

    move-result-object v10

    iget-object v9, v9, Lv0/i;->b:Ljava/lang/Object;

    check-cast v9, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->b()V

    const/4 v12, 0x0

    invoke-virtual {v9, v10, v12}, Landroidx/work/impl/WorkDatabase;->n(Le0/e;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v9

    :try_start_0
    new-instance v13, Ljava/util/ArrayList;

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v9, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object v14, v12

    goto :goto_1

    :cond_0
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    :goto_1
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_10

    :cond_1
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    invoke-virtual {v10}, La0/j;->o()V

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    goto :goto_2

    :cond_2
    move v9, v11

    :goto_2
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v9}, Ljava/util/HashSet;-><init>(I)V

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/app/job/JobInfo;

    invoke-static {v9}, Lq0/b;->f(Landroid/app/job/JobInfo;)Lv0/j;

    move-result-object v12

    if-eqz v12, :cond_3

    iget-object v9, v12, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Landroid/app/job/JobInfo;->getId()I

    move-result v9

    invoke-static {v7, v9}, Lq0/b;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v10, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v7, v0

    goto :goto_4

    :cond_6
    move v7, v11

    :goto_4
    const-wide/16 v8, -0x1

    if-eqz v7, :cond_8

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_1
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v10

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v10, v13, v8, v9}, Lv0/p;->k(Ljava/lang/String;J)V

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()V

    goto :goto_7

    :goto_6
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :cond_8
    :goto_7
    iget-object v5, v4, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v10

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->t()Lv0/m;

    move-result-object v12

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_2
    invoke-virtual {v10}, Lv0/p;->e()Ljava/util/ArrayList;

    move-result-object v13

    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v14

    xor-int/2addr v14, v0

    if-eqz v14, :cond_9

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_9

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lv0/o;

    iget-object v15, v15, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v10, v15, v0}, Lv0/p;->o(Ljava/lang/String;I)V

    const/16 v11, -0x200

    invoke-virtual {v10, v15, v11}, Lv0/p;->p(Ljava/lang/String;I)V

    invoke-virtual {v10, v15, v8, v9}, Lv0/p;->k(Ljava/lang/String;J)V

    const/4 v11, 0x0

    goto :goto_8

    :catchall_2
    move-exception v0

    goto/16 :goto_f

    :cond_9
    iget-object v8, v12, Lv0/m;->c:Ljava/lang/Object;

    check-cast v8, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v9, v12, Lv0/m;->e:Ljava/lang/Object;

    check-cast v9, Lv0/h;

    invoke-virtual {v9}, La0/m;->a()Lf0/i;

    move-result-object v10

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v10}, Lf0/i;->b()I

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v9, v10}, La0/m;->p(Lf0/i;)V

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()V

    if-nez v14, :cond_b

    if-eqz v7, :cond_a

    goto :goto_9

    :cond_a
    const/4 v5, 0x0

    goto :goto_a

    :cond_b
    :goto_9
    move v5, v0

    :goto_a
    iget-object v7, v4, Ln0/s;->j:Lw0/i;

    iget-object v7, v7, Lw0/i;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->m()Lv0/e;

    move-result-object v7

    const-string v8, "reschedule_needed"

    invoke-virtual {v7, v8}, Lv0/e;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    const-wide/16 v9, 0x0

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    const-wide/16 v13, 0x1

    cmp-long v7, v11, v13

    if-nez v7, :cond_c

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ln0/s;->r0()V

    iget-object v0, v4, Ln0/s;->j:Lw0/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lv0/d;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v2, v8, v3}, Lv0/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v0, v0, Lw0/i;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->m()Lv0/e;

    move-result-object v0

    invoke-virtual {v0, v2}, Lv0/e;->j(Lv0/d;)V

    goto/16 :goto_e

    :cond_c
    :try_start_5
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1f

    if-lt v7, v8, :cond_d

    const/high16 v8, 0x22000000

    goto :goto_b

    :cond_d
    const/high16 v8, 0x20000000

    :goto_b
    new-instance v11, Landroid/content/Intent;

    invoke-direct {v11}, Landroid/content/Intent;-><init>()V

    new-instance v12, Landroid/content/ComponentName;

    const-class v13, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    invoke-direct {v12, v6, v13}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v11, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string v12, "ACTION_FORCE_STOP_RESCHEDULE"

    invoke-virtual {v11, v12}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const/4 v12, -0x1

    invoke-static {v6, v12, v11, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    const/16 v11, 0x1e

    if-lt v7, v11, :cond_11

    if-eqz v8, :cond_e

    invoke-virtual {v8}, Landroid/app/PendingIntent;->cancel()V

    :cond_e
    const-string v7, "activity"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/app/ActivityManager;

    invoke-static {v6}, LK/f;->e(Landroid/app/ActivityManager;)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_12

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_12

    iget-object v7, v3, Lw0/i;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->m()Lv0/e;

    move-result-object v7

    invoke-virtual {v7, v2}, Lv0/e;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_f

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    :cond_f
    const/4 v11, 0x0

    :goto_c
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-ge v11, v7, :cond_12

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, LK/f;->c(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object v7

    invoke-static {v7}, LK/f;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v8

    const/16 v12, 0xa

    if-ne v8, v12, :cond_10

    invoke-static {v7}, LK/f;->b(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v7

    cmp-long v7, v7, v9

    if-ltz v7, :cond_10

    goto :goto_d

    :cond_10
    add-int/2addr v11, v0

    goto :goto_c

    :cond_11
    if-nez v8, :cond_12

    invoke-static {v6}, Lw0/f;->b(Landroid/content/Context;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_d

    :cond_12
    if-eqz v5, :cond_13

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v4, Ln0/s;->e:Lm0/a;

    iget-object v2, v4, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    iget-object v3, v4, Ln0/s;->h:Ljava/util/List;

    invoke-static {v0, v2, v3}, Ln0/l;->b(Lm0/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    goto :goto_e

    :catch_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_d
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ln0/s;->r0()V

    iget-object v0, v4, Ln0/s;->e:Lm0/a;

    iget-object v0, v0, Lm0/a;->c:Lm0/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lv0/d;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-direct {v0, v2, v4}, Lv0/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v2, v3, Lw0/i;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->m()Lv0/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Lv0/e;->j(Lv0/d;)V

    :cond_13
    :goto_e
    return-void

    :catchall_3
    move-exception v0

    :try_start_6
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v9, v10}, La0/m;->p(Lf0/i;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_f
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->k()V

    throw v0

    :goto_10
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    invoke-virtual {v10}, La0/j;->o()V

    throw v0
.end method

.method public final run()V
    .locals 6

    iget-object v0, p0, Lw0/f;->c:Ln0/s;

    :try_start_0
    iget-object v1, v0, Ln0/s;->e:Lm0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v3, p0, Lw0/f;->b:Landroid/content/Context;

    if-eqz v2, :cond_0

    :try_start_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    invoke-static {v3, v1}, Lw0/n;->a(Landroid/content/Context;Lm0/a;)Z

    move-result v1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ln0/s;->q0()V

    return-void

    :catch_0
    :cond_1
    :goto_0
    :try_start_2
    invoke-static {v3}, Lu2/d;->s(Landroid/content/Context;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {p0}, Lw0/f;->a()V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v0}, Ln0/s;->q0()V

    return-void

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_1

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_1

    :catch_4
    move-exception v1

    goto :goto_1

    :catch_5
    move-exception v1

    goto :goto_1

    :catch_6
    move-exception v1

    goto :goto_1

    :catch_7
    move-exception v1

    :goto_1
    :try_start_5
    iget v2, p0, Lw0/f;->e:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lw0/f;->e:I

    const/4 v4, 0x3

    if-lt v2, v4, :cond_3

    invoke-static {v3}, LF/l;->a(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    goto :goto_2

    :cond_2
    const-string v2, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"

    :goto_2
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, v0, Ln0/s;->e:Lm0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3

    :cond_3
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, Lw0/f;->e:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    int-to-long v1, v1

    const-wide/16 v4, 0x12c

    mul-long/2addr v1, v4

    :try_start_6
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_0

    :catch_8
    move-exception v1

    :try_start_7
    const-string v2, "Unexpected SQLite exception during migrations"

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-direct {v3, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, v0, Ln0/s;->e:Lm0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_3
    invoke-virtual {v0}, Ln0/s;->q0()V

    throw v1
.end method
