.class public final Lw0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lx0/k;

.field public final synthetic c:Ljava/util/UUID;

.field public final synthetic d:Lm0/h;

.field public final synthetic e:Landroid/content/Context;

.field public final synthetic f:Lw0/t;


# direct methods
.method public constructor <init>(Lw0/t;Lx0/k;Ljava/util/UUID;Lm0/h;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw0/s;->f:Lw0/t;

    iput-object p2, p0, Lw0/s;->b:Lx0/k;

    iput-object p3, p0, Lw0/s;->c:Ljava/util/UUID;

    iput-object p4, p0, Lw0/s;->d:Lm0/h;

    iput-object p5, p0, Lw0/s;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lw0/s;->b:Lx0/k;

    iget-object v0, v0, Lx0/i;->a:Ljava/lang/Object;

    instance-of v0, v0, Lx0/a;

    if-nez v0, :cond_1

    iget-object v0, p0, Lw0/s;->c:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lw0/s;->f:Lw0/t;

    iget-object v1, v1, Lw0/t;->c:Lv0/p;

    invoke-virtual {v1, v0}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v2, v1, Lv0/o;->b:I

    invoke-static {v2}, LX/d;->d(I)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lw0/s;->f:Lw0/t;

    iget-object v2, v2, Lw0/t;->b:Lu0/a;

    iget-object v3, p0, Lw0/s;->d:Lm0/h;

    check-cast v2, Ln0/g;

    invoke-virtual {v2, v0, v3}, Ln0/g;->g(Ljava/lang/String;Lm0/h;)V

    iget-object v0, p0, Lw0/s;->e:Landroid/content/Context;

    invoke-static {v1}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v1

    iget-object v2, p0, Lw0/s;->d:Lm0/h;

    invoke-static {v0, v1, v2}, Lu0/c;->a(Landroid/content/Context;Lv0/j;Lm0/h;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lw0/s;->e:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lw0/s;->b:Lx0/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx0/k;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    iget-object v1, p0, Lw0/s;->b:Lx0/k;

    invoke-virtual {v1, v0}, Lx0/k;->k(Ljava/lang/Throwable;)Z

    :goto_2
    return-void
.end method
