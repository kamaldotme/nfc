.class public final Landroidx/work/impl/workers/CombineContinuationsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final f()Lm0/o;
    .locals 2

    iget-object v0, p0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->b:Lm0/g;

    new-instance v1, Lm0/o;

    invoke-direct {v1, v0}, Lm0/o;-><init>(Lm0/g;)V

    return-object v1
.end method
