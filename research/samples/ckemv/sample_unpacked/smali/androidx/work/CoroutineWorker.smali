.class public abstract Landroidx/work/CoroutineWorker;
.super Lm0/q;
.source "SourceFile"


# instance fields
.field public final f:Le2/U;

.field public final g:Lx0/k;

.field public final h:Ll2/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    const-string v0, "appContext"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lm0/q;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Le2/v;->b()Le2/U;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/CoroutineWorker;->f:Le2/U;

    new-instance p1, Lx0/k;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/CoroutineWorker;->g:Lx0/k;

    new-instance v0, LB2/u;

    const/16 v1, 0xd

    invoke-direct {v0, v1, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    iget-object p2, p2, Landroidx/work/WorkerParameters;->d:Lv0/i;

    iget-object p2, p2, Lv0/i;->b:Ljava/lang/Object;

    check-cast p2, Lf/B;

    invoke-virtual {p1, v0, p2}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    sget-object p1, Le2/B;->a:Ll2/d;

    iput-object p1, p0, Landroidx/work/CoroutineWorker;->h:Ll2/d;

    return-void
.end method


# virtual methods
.method public final a()La1/a;
    .locals 5

    invoke-static {}, Le2/v;->b()Le2/U;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/CoroutineWorker;->h:Ll2/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Lm0/z;->a0(LO1/i;LO1/i;)LO1/i;

    move-result-object v1

    invoke-static {v1}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v1

    new-instance v2, Lm0/l;

    invoke-direct {v2, v0}, Lm0/l;-><init>(Le2/U;)V

    new-instance v0, Lm0/e;

    const/4 v3, 0x0

    invoke-direct {v0, v2, p0, v3}, Lm0/e;-><init>(Lm0/l;Landroidx/work/CoroutineWorker;LO1/d;)V

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v3}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    return-object v2
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Landroidx/work/CoroutineWorker;->g:Lx0/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx0/i;->cancel(Z)Z

    return-void
.end method

.method public final d()Lx0/k;
    .locals 4

    iget-object v0, p0, Landroidx/work/CoroutineWorker;->h:Ll2/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Landroidx/work/CoroutineWorker;->f:Le2/U;

    invoke-static {v0, v1}, Lu2/d;->x(LO1/g;LO1/i;)LO1/i;

    move-result-object v0

    invoke-static {v0}, Le2/v;->a(LO1/i;)Lj2/e;

    move-result-object v0

    new-instance v1, Lm0/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lm0/f;-><init>(Landroidx/work/CoroutineWorker;LO1/d;)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Le2/v;->k(Le2/t;ILW1/p;I)Le2/f0;

    iget-object v0, p0, Landroidx/work/CoroutineWorker;->g:Lx0/k;

    return-object v0
.end method

.method public abstract f()Lm0/p;
.end method
