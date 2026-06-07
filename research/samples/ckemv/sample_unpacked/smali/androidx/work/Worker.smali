.class public abstract Landroidx/work/Worker;
.super Lm0/q;
.source "SourceFile"


# instance fields
.field public f:Lx0/k;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm0/q;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final a()La1/a;
    .locals 5

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v1, v1, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    new-instance v2, LD0/c;

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-direct {v2, p0, v0, v3, v4}, LD0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final d()Lx0/k;
    .locals 3

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/work/Worker;->f:Lx0/k;

    iget-object v0, p0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    iget-object v0, v0, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LF0/h;

    const/16 v2, 0xf

    invoke-direct {v1, v2, p0}, LF0/h;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object v0, p0, Landroidx/work/Worker;->f:Lx0/k;

    return-object v0
.end method

.method public abstract f()Lm0/o;
.end method
