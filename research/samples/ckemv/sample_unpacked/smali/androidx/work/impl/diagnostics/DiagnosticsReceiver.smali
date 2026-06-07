.class public Landroidx/work/impl/diagnostics/DiagnosticsReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DiagnosticsRcvr"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-static {p1}, Ln0/s;->p0(Landroid/content/Context;)Ln0/s;

    move-result-object p1

    const-class p2, Landroidx/work/impl/workers/DiagnosticsWorker;

    new-instance v0, Lm0/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Lm0/s;-><init>(ILjava/lang/Class;)V

    invoke-virtual {v0}, La0/m;->b()Lm0/A;

    move-result-object p2

    check-cast p2, Lm0/t;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Ln0/n;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p1, v1, v2, p2}, Ln0/n;-><init>(Ln0/s;Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {v0}, Ln0/n;->Q()Lm0/x;

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method
