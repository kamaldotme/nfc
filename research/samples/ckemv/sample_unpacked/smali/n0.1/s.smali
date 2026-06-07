.class public final Ln0/s;
.super Lm0/z;
.source "SourceFile"


# static fields
.field public static n:Ln0/s;

.field public static o:Ln0/s;

.field public static final p:Ljava/lang/Object;


# instance fields
.field public final d:Landroid/content/Context;

.field public final e:Lm0/a;

.field public final f:Landroidx/work/impl/WorkDatabase;

.field public final g:Lv0/i;

.field public final h:Ljava/util/List;

.field public final i:Ln0/g;

.field public final j:Lw0/i;

.field public k:Z

.field public l:Landroid/content/BroadcastReceiver$PendingResult;

.field public final m:Lv0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Ln0/s;->n:Ln0/s;

    sput-object v0, Ln0/s;->o:Ln0/s;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln0/s;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/a;Lv0/i;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ln0/g;Lv0/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ln0/s;->k:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Ln0/r;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lm0/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lm0/r;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sput-object v0, Lm0/r;->b:Lm0/r;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Ln0/s;->d:Landroid/content/Context;

    iput-object p3, p0, Ln0/s;->g:Lv0/i;

    iput-object p4, p0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Ln0/s;->i:Ln0/g;

    iput-object p7, p0, Ln0/s;->m:Lv0/i;

    iput-object p2, p0, Ln0/s;->e:Lm0/a;

    iput-object p5, p0, Ln0/s;->h:Ljava/util/List;

    new-instance p7, Lw0/i;

    const/4 v0, 0x1

    invoke-direct {p7, p4, v0}, Lw0/i;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    iput-object p7, p0, Ln0/s;->j:Lw0/i;

    iget-object p7, p3, Lv0/i;->b:Ljava/lang/Object;

    check-cast p7, Lf/B;

    sget v0, Ln0/l;->a:I

    new-instance v0, Ln0/j;

    invoke-direct {v0, p7, p5, p2, p4}, Ln0/j;-><init>(Lf/B;Ljava/util/List;Lm0/a;Landroidx/work/impl/WorkDatabase;)V

    invoke-virtual {p6, v0}, Ln0/g;->a(Ln0/c;)V

    new-instance p2, Lw0/f;

    invoke-direct {p2, p1, p0}, Lw0/f;-><init>(Landroid/content/Context;Ln0/s;)V

    invoke-virtual {p3, p2}, Lv0/i;->f(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static p0(Landroid/content/Context;)Ln0/s;
    .locals 2

    sget-object v0, Ln0/s;->p:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Ln0/s;->n:Ln0/s;

    if-eqz v1, :cond_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    sget-object v1, Ln0/s;->o:Ln0/s;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    :try_start_2
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p0
.end method


# virtual methods
.method public final q0()V
    .locals 2

    sget-object v0, Ln0/s;->p:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ln0/s;->k:Z

    iget-object v1, p0, Ln0/s;->l:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Ln0/s;->l:Landroid/content/BroadcastReceiver$PendingResult;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final r0()V
    .locals 4

    sget v0, Lq0/b;->g:I

    iget-object v0, p0, Ln0/s;->d:Landroid/content/Context;

    const-string v1, "jobscheduler"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/job/JobScheduler;

    if-eqz v1, :cond_0

    invoke-static {v0, v1}, Lq0/b;->d(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/job/JobInfo;

    invoke-virtual {v2}, Landroid/app/job/JobInfo;->getId()I

    move-result v2

    invoke-static {v1, v2}, Lq0/b;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v1

    iget-object v2, v1, Lv0/p;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->b()V

    iget-object v1, v1, Lv0/p;->m:Lv0/h;

    invoke-virtual {v1}, La0/m;->a()Lf0/i;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->c()V

    :try_start_0
    invoke-virtual {v3}, Lf0/i;->b()I

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v1, v3}, La0/m;->p(Lf0/i;)V

    iget-object v1, p0, Ln0/s;->e:Lm0/a;

    iget-object v2, p0, Ln0/s;->h:Ljava/util/List;

    invoke-static {v1, v0, v2}, Ln0/l;->b(Lm0/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->k()V

    invoke-virtual {v1, v3}, La0/m;->p(Lf0/i;)V

    throw v0
.end method
