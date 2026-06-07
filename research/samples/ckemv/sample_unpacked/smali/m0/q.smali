.class public abstract Lm0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Landroidx/work/WorkerParameters;

.field public volatile d:I

.field public e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, -0x100

    iput v0, p0, Lm0/q;->d:I

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Lm0/q;->b:Landroid/content/Context;

    iput-object p2, p0, Lm0/q;->c:Landroidx/work/WorkerParameters;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "WorkerParameters is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Application Context is null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()La1/a;
    .locals 3

    new-instance v0, Lx0/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    return-object v0
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public abstract d()Lx0/k;
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lm0/q;->d:I

    invoke-virtual {p0}, Lm0/q;->b()V

    return-void
.end method
