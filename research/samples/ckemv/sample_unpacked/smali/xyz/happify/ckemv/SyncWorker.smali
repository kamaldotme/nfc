.class public final Lxyz/happify/ckemv/SyncWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final f()Lm0/p;
    .locals 4

    new-instance v0, LB2/a;

    iget-object v1, p0, Lm0/q;->b:Landroid/content/Context;

    const-string v2, "getApplicationContext(...)"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LB2/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, LB2/a;->i()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v2, Lxyz/happify/ckemv/Reporter;->INSTANCE:Lxyz/happify/ckemv/Reporter;

    const-string v3, "http://127.0.0.1:4444"

    invoke-virtual {v2, v1, v3}, Lxyz/happify/ckemv/Reporter;->fetchCves(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "Error"

    invoke-static {v1, v3, v2}, Ld2/l;->V(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    :try_start_0
    new-instance v2, Lb1/l;

    invoke-direct {v2}, Lb1/l;-><init>()V

    invoke-virtual {v2, v1}, Lb1/l;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxyz/happify/ckemv/MeResponse;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lxyz/happify/ckemv/MeResponse;->getCves()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-virtual {v0, v1}, LB2/a;->A(Ljava/util/List;)V

    new-instance v0, Lm0/o;

    sget-object v1, Lm0/g;->b:Lm0/g;

    invoke-direct {v0, v1}, Lm0/o;-><init>(Lm0/g;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_1
    new-instance v0, Lm0/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method
