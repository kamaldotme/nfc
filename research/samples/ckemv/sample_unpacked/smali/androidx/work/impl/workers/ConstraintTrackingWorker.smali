.class public final Landroidx/work/impl/workers/ConstraintTrackingWorker;
.super Lm0/q;
.source "SourceFile"

# interfaces
.implements Lr0/e;


# instance fields
.field public final f:Landroidx/work/WorkerParameters;

.field public final g:Ljava/lang/Object;

.field public volatile h:Z

.field public final i:Lx0/k;

.field public j:Lm0/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParameters"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lm0/q;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    iput-object p2, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->f:Landroidx/work/WorkerParameters;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Ljava/lang/Object;

    new-instance p1, Lx0/k;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->j:Lm0/q;

    if-eqz v0, :cond_2

    iget v1, v0, Lm0/q;->d:I

    const/16 v2, -0x100

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_1

    iget v1, p0, Lm0/q;->d:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Lm0/q;->e(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final c(Lv0/o;Lr0/c;)V
    .locals 2

    const-string v0, "workSpec"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    sget v1, Lz0/a;->a:I

    invoke-virtual {p1}, Lv0/o;->toString()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p1, p2, Lr0/b;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Ljava/lang/Object;

    monitor-enter p1

    const/4 p2, 0x1

    :try_start_0
    iput-boolean p2, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_0
    :goto_0
    return-void
.end method

.method public final d()Lx0/k;
    .locals 3

    iget-object v0, p0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LB2/u;

    const/16 v2, 0xf

    invoke-direct {v1, v2, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->i:Lx0/k;

    const-string v1, "future"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
