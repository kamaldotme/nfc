.class public final Lq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i;


# static fields
.field public static final synthetic g:I


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroid/app/job/JobScheduler;

.field public final d:Lq0/a;

.field public final e:Landroidx/work/impl/WorkDatabase;

.field public final f:Lm0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobScheduler"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lm0/a;)V
    .locals 3

    const-string v0, "jobscheduler"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    new-instance v1, Lq0/a;

    iget-object v2, p3, Lm0/a;->c:Lm0/r;

    invoke-direct {v1, p1, v2}, Lq0/a;-><init>(Landroid/content/Context;Lm0/r;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/b;->b:Landroid/content/Context;

    iput-object v0, p0, Lq0/b;->c:Landroid/app/job/JobScheduler;

    iput-object v1, p0, Lq0/b;->d:Lq0/a;

    iput-object p2, p0, Lq0/b;->e:Landroidx/work/impl/WorkDatabase;

    iput-object p3, p0, Lq0/b;->f:Lm0/a;

    return-void
.end method

.method public static c(Landroid/app/job/JobScheduler;I)V
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Exception while trying to cancel job (%d)"

    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method

.method public static d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/job/JobInfo;

    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public static f(Landroid/app/job/JobInfo;)Lv0/j;
    .locals 3

    const-string v0, "EXTRA_WORK_SPEC_ID"

    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    new-instance v2, Lv0/j;

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v1}, Lv0/j;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lq0/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lq0/b;->c:Landroid/app/job/JobScheduler;

    invoke-static {v0, v1}, Lq0/b;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/job/JobInfo;

    invoke-static {v3}, Lq0/b;->f(Landroid/app/job/JobInfo;)Lv0/j;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v4, v4, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Lq0/b;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lq0/b;->e:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v0

    iget-object v1, v0, Lv0/i;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v0, v0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v0, Lv0/h;

    invoke-virtual {v0}, La0/m;->a()Lf0/i;

    move-result-object v2

    const/4 v3, 0x1

    if-nez p1, :cond_4

    invoke-interface {v2, v3}, Le0/d;->g(I)V

    goto :goto_3

    :cond_4
    invoke-interface {v2, p1, v3}, Le0/d;->h(Ljava/lang/String;I)V

    :goto_3
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v2}, Lf0/i;->b()I

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v0, v2}, La0/m;->p(Lf0/i;)V

    goto :goto_4

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v0, v2}, La0/m;->p(Lf0/i;)V

    throw p1

    :cond_5
    :goto_4
    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final varargs e([Lv0/o;)V
    .locals 10

    iget-object v0, p0, Lq0/b;->f:Lm0/a;

    new-instance v1, Lw0/i;

    iget-object v2, p0, Lq0/b;->e:Landroidx/work/impl/WorkDatabase;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lw0/i;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    array-length v3, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    aget-object v5, p1, v4

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v6

    iget-object v7, v5, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    :try_start_1
    iget v6, v6, Lv0/o;->b:I

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v6

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v7

    invoke-virtual {v7, v6}, Lv0/i;->i(Lv0/j;)Lv0/g;

    move-result-object v7

    if-eqz v7, :cond_2

    iget v8, v7, Lv0/g;->c:I

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v8, v0, Lm0/a;->g:I

    new-instance v9, Lw0/h;

    invoke-direct {v9, v1, v8}, Lw0/h;-><init>(Lw0/i;I)V

    iget-object v8, v1, Lw0/i;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v8, v9}, Landroidx/work/impl/WorkDatabase;->o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "workDatabase.runInTransa\u2026            id\n        })"

    invoke-static {v8, v9}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    :goto_2
    if-nez v7, :cond_3

    new-instance v7, Lv0/g;

    iget-object v9, v6, Lv0/j;->a:Ljava/lang/String;

    iget v6, v6, Lv0/j;->b:I

    invoke-direct {v7, v6, v8, v9}, Lv0/g;-><init>(IILjava/lang/String;)V

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->q()Lv0/i;

    move-result-object v6

    invoke-virtual {v6, v7}, Lv0/i;->j(Lv0/g;)V

    :cond_3
    invoke-virtual {p0, v5, v8}, Lq0/b;->g(Lv0/o;I)V

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :goto_4
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    throw p1

    :cond_4
    return-void
.end method

.method public final g(Lv0/o;I)V
    .locals 13

    iget-object v0, p0, Lq0/b;->c:Landroid/app/job/JobScheduler;

    iget-object v1, p0, Lq0/b;->d:Lq0/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p1, Lv0/o;->j:Lm0/d;

    new-instance v3, Landroid/os/PersistableBundle;

    invoke-direct {v3}, Landroid/os/PersistableBundle;-><init>()V

    const-string v4, "EXTRA_WORK_SPEC_ID"

    iget-object v5, p1, Lv0/o;->a:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "EXTRA_WORK_SPEC_GENERATION"

    iget v5, p1, Lv0/o;->t:I

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "EXTRA_IS_PERIODIC"

    invoke-virtual {p1}, Lv0/o;->c()Z

    move-result v5

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    new-instance v4, Landroid/app/job/JobInfo$Builder;

    iget-object v5, v1, Lq0/a;->a:Landroid/content/ComponentName;

    invoke-direct {v4, p2, v5}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    iget-boolean v5, v2, Lm0/d;->b:Z

    invoke-virtual {v4, v5}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v4

    iget-boolean v5, v2, Lm0/d;->c:Z

    invoke-virtual {v4, v5}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    move-result-object v3

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/16 v9, 0x1e

    iget v10, v2, Lm0/d;->a:I

    if-lt v4, v9, :cond_0

    const/4 v9, 0x6

    if-ne v10, v9, :cond_0

    new-instance v9, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v9}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v10, 0x19

    invoke-virtual {v9, v10}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v9

    invoke-virtual {v9}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v9

    invoke-static {v3, v9}, LH/d;->q(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    goto :goto_1

    :cond_0
    invoke-static {v10}, Lq/h;->a(I)I

    move-result v9

    if-eqz v9, :cond_3

    if-eq v9, v7, :cond_1

    if-eq v9, v6, :cond_2

    const/4 v11, 0x3

    if-eq v9, v11, :cond_4

    const/4 v11, 0x4

    if-eq v9, v11, :cond_4

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v9

    invoke-static {v10}, LX/d;->r(I)Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    move v11, v7

    goto :goto_0

    :cond_2
    move v11, v6

    goto :goto_0

    :cond_3
    move v11, v8

    :cond_4
    :goto_0
    invoke-virtual {v3, v11}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    :goto_1
    if-nez v5, :cond_6

    iget v5, p1, Lv0/o;->l:I

    if-ne v5, v6, :cond_5

    move v5, v8

    goto :goto_2

    :cond_5
    move v5, v7

    :goto_2
    iget-wide v9, p1, Lv0/o;->m:J

    invoke-virtual {v3, v9, v10, v5}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    :cond_6
    invoke-virtual {p1}, Lv0/o;->a()J

    move-result-wide v5

    iget-object v1, v1, Lq0/a;->b:Lm0/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sub-long/2addr v5, v9

    const-wide/16 v9, 0x0

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    const/16 v1, 0x1c

    if-gt v4, v1, :cond_7

    invoke-virtual {v3, v5, v6}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    goto :goto_3

    :cond_7
    cmp-long v1, v5, v9

    if-lez v1, :cond_8

    invoke-virtual {v3, v5, v6}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    goto :goto_3

    :cond_8
    iget-boolean v1, p1, Lv0/o;->q:Z

    if-nez v1, :cond_9

    invoke-static {v3}, LH/d;->p(Landroid/app/job/JobInfo$Builder;)V

    :cond_9
    :goto_3
    iget-object v1, v2, Lm0/d;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v7

    if-eqz v4, :cond_b

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm0/c;

    iget-boolean v11, v4, Lm0/c;->b:Z

    new-instance v12, Landroid/app/job/JobInfo$TriggerContentUri;

    iget-object v4, v4, Lm0/c;->a:Landroid/net/Uri;

    invoke-direct {v12, v4, v11}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    invoke-virtual {v3, v12}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    goto :goto_4

    :cond_a
    iget-wide v11, v2, Lm0/d;->f:J

    invoke-virtual {v3, v11, v12}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    iget-wide v11, v2, Lm0/d;->g:J

    invoke-virtual {v3, v11, v12}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    :cond_b
    invoke-virtual {v3, v8}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-boolean v4, v2, Lm0/d;->d:Z

    invoke-virtual {v3, v4}, Landroid/app/job/JobInfo$Builder;->setRequiresBatteryNotLow(Z)Landroid/app/job/JobInfo$Builder;

    iget-boolean v2, v2, Lm0/d;->e:Z

    invoke-virtual {v3, v2}, Landroid/app/job/JobInfo$Builder;->setRequiresStorageNotLow(Z)Landroid/app/job/JobInfo$Builder;

    iget v2, p1, Lv0/o;->k:I

    if-lez v2, :cond_c

    move v2, v7

    goto :goto_5

    :cond_c
    move v2, v8

    :goto_5
    cmp-long v4, v5, v9

    if-lez v4, :cond_d

    move v4, v7

    goto :goto_6

    :cond_d
    move v4, v8

    :goto_6
    const/16 v5, 0x1f

    if-lt v1, v5, :cond_e

    iget-boolean v1, p1, Lv0/o;->q:Z

    if-eqz v1, :cond_e

    if-nez v2, :cond_e

    if-nez v4, :cond_e

    invoke-static {v3}, LF0/a;->i(Landroid/app/job/JobInfo$Builder;)V

    :cond_e
    invoke-virtual {v3}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object v1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    move-result v1

    if-nez v1, :cond_f

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v1, p1, Lv0/o;->q:Z

    if-eqz v1, :cond_f

    iget v1, p1, Lv0/o;->r:I

    if-ne v1, v7, :cond_f

    iput-boolean v8, p1, Lv0/o;->q:Z

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Lq0/b;->g(Lv0/o;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :catch_0
    move-exception p1

    goto :goto_8

    :catchall_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p1}, Lv0/o;->toString()Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_f
    :goto_7
    return-void

    :goto_8
    iget-object p2, p0, Lq0/b;->b:Landroid/content/Context;

    invoke-static {p2, v0}, Lq0/b;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_10

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v8

    :cond_10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lq0/b;->e:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v1

    invoke-virtual {v1}, Lv0/p;->f()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lq0/b;->f:Lm0/a;

    iget v2, v2, Lm0/a;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    invoke-static {p2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
