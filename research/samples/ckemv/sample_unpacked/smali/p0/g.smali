.class public final Lp0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/e;
.implements Lw0/v;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:Lv0/j;

.field public final e:Lp0/j;

.field public final f:Lf/G;

.field public final g:Ljava/lang/Object;

.field public h:I

.field public final i:Lf/B;

.field public final j:Ly0/a;

.field public k:Landroid/os/PowerManager$WakeLock;

.field public l:Z

.field public final m:Ln0/m;

.field public final n:Le2/K;

.field public volatile o:Le2/U;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DelayMetCommandHandler"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILp0/j;Ln0/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/g;->b:Landroid/content/Context;

    iput p2, p0, Lp0/g;->c:I

    iput-object p3, p0, Lp0/g;->e:Lp0/j;

    iget-object p1, p4, Ln0/m;->a:Lv0/j;

    iput-object p1, p0, Lp0/g;->d:Lv0/j;

    iput-object p4, p0, Lp0/g;->m:Ln0/m;

    iget-object p1, p3, Lp0/j;->f:Ln0/s;

    iget-object p1, p1, Ln0/s;->m:Lv0/i;

    iget-object p2, p3, Lp0/j;->c:Lv0/i;

    iget-object p3, p2, Lv0/i;->b:Ljava/lang/Object;

    check-cast p3, Lf/B;

    iput-object p3, p0, Lp0/g;->i:Lf/B;

    iget-object p3, p2, Lv0/i;->e:Ljava/lang/Object;

    check-cast p3, Ly0/a;

    iput-object p3, p0, Lp0/g;->j:Ly0/a;

    iget-object p2, p2, Lv0/i;->c:Ljava/lang/Object;

    check-cast p2, Le2/K;

    iput-object p2, p0, Lp0/g;->n:Le2/K;

    new-instance p2, Lf/G;

    invoke-direct {p2, p1}, Lf/G;-><init>(Lv0/i;)V

    iput-object p2, p0, Lp0/g;->f:Lf/G;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lp0/g;->l:Z

    iput p1, p0, Lp0/g;->h:I

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/g;->g:Ljava/lang/Object;

    return-void
.end method

.method public static a(Lp0/g;)V
    .locals 8

    iget-object v0, p0, Lp0/g;->d:Lv0/j;

    iget-object v1, v0, Lv0/j;->a:Ljava/lang/String;

    iget v1, p0, Lp0/g;->h:I

    const/4 v2, 0x2

    if-ge v1, v2, :cond_1

    iput v2, p0, Lp0/g;->h:I

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lp0/g;->b:Landroid/content/Context;

    const-class v3, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "ACTION_STOP_WORK"

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v1, v0}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    new-instance v4, LF0/b;

    iget-object v5, p0, Lp0/g;->e:Lp0/j;

    iget v6, p0, Lp0/g;->c:I

    const/4 v7, 0x4

    invoke-direct {v4, v5, v1, v6, v7}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iget-object p0, p0, Lp0/g;->j:Ly0/a;

    invoke-virtual {p0, v4}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    iget-object v1, v5, Lp0/j;->e:Ln0/g;

    iget-object v4, v0, Lv0/j;->a:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ln0/g;->e(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "ACTION_SCHEDULE_WORK"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {v1, v0}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    new-instance v0, LF0/b;

    const/4 v2, 0x4

    invoke-direct {v0, v5, v1, v6, v2}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {p0, v0}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method

.method public static b(Lp0/g;)V
    .locals 5

    iget v0, p0, Lp0/g;->h:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput v0, p0, Lp0/g;->h:I

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    iget-object v1, p0, Lp0/g;->d:Lv0/j;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lp0/g;->e:Lp0/j;

    iget-object v0, v0, Lp0/j;->e:Ln0/g;

    iget-object v1, p0, Lp0/g;->m:Ln0/m;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ln0/g;->h(Ln0/m;Lm0/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp0/g;->e:Lp0/j;

    iget-object v0, v0, Lp0/j;->d:Lw0/x;

    iget-object v1, p0, Lp0/g;->d:Lv0/j;

    iget-object v2, v0, Lw0/x;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v3

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lw0/x;->a(Lv0/j;)V

    new-instance v3, Lw0/w;

    invoke-direct {v3, v0, v1}, Lw0/w;-><init>(Lw0/x;Lv0/j;)V

    iget-object v4, v0, Lw0/x;->b:Ljava/util/HashMap;

    invoke-virtual {v4, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v0, Lw0/x;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Lw0/x;->a:Lf/G;

    iget-object p0, p0, Lf/G;->b:Ljava/lang/Object;

    check-cast p0, Landroid/os/Handler;

    const-wide/32 v0, 0x927c0

    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_0
    invoke-virtual {p0}, Lp0/g;->d()V

    goto :goto_0

    :cond_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    iget-object p0, p0, Lp0/g;->d:Lv0/j;

    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void
.end method


# virtual methods
.method public final c(Lv0/o;Lr0/c;)V
    .locals 1

    instance-of p1, p2, Lr0/a;

    iget-object p2, p0, Lp0/g;->i:Lf/B;

    if-eqz p1, :cond_0

    new-instance p1, Lp0/f;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lp0/f;-><init>(Lp0/g;I)V

    invoke-virtual {p2, p1}, Lf/B;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lp0/f;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lp0/f;-><init>(Lp0/g;I)V

    invoke-virtual {p2, p1}, Lf/B;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, Lp0/g;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp0/g;->o:Le2/U;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lp0/g;->o:Le2/U;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Le2/Z;->a(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, Lp0/g;->e:Lp0/j;

    iget-object v1, v1, Lp0/j;->d:Lw0/x;

    iget-object v2, p0, Lp0/g;->d:Lv0/j;

    invoke-virtual {v1, v2}, Lw0/x;->a(Lv0/j;)V

    iget-object v1, p0, Lp0/g;->k:Landroid/os/PowerManager$WakeLock;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    iget-object v2, p0, Lp0/g;->k:Landroid/os/PowerManager$WakeLock;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    iget-object v2, p0, Lp0/g;->d:Lv0/j;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lp0/g;->k:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lp0/g;->d:Lv0/j;

    iget-object v0, v0, Lv0/j;->a:Ljava/lang/String;

    iget-object v1, p0, Lp0/g;->b:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lp0/g;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lw0/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    iput-object v1, p0, Lp0/g;->k:Landroid/os/PowerManager$WakeLock;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    iget-object v2, p0, Lp0/g;->k:Landroid/os/PowerManager$WakeLock;

    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lp0/g;->k:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->acquire()V

    iget-object v1, p0, Lp0/g;->e:Lp0/j;

    iget-object v1, v1, Lp0/j;->f:Ln0/s;

    iget-object v1, v1, Ln0/s;->f:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->u()Lv0/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lv0/p;->i(Ljava/lang/String;)Lv0/o;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lp0/g;->i:Lf/B;

    new-instance v1, Lp0/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lp0/f;-><init>(Lp0/g;I)V

    invoke-virtual {v0, v1}, Lf/B;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lv0/o;->b()Z

    move-result v1

    iput-boolean v1, p0, Lp0/g;->l:Z

    if-nez v1, :cond_1

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lp0/g;->i:Lf/B;

    new-instance v1, Lp0/f;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lp0/f;-><init>(Lp0/g;I)V

    invoke-virtual {v0, v1}, Lf/B;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lp0/g;->f:Lf/G;

    iget-object v2, p0, Lp0/g;->n:Le2/K;

    invoke-static {v1, v0, v2, p0}, Lr0/k;->a(Lf/G;Lv0/o;Le2/K;Lr0/e;)Le2/U;

    move-result-object v0

    iput-object v0, p0, Lp0/g;->o:Le2/U;

    :goto_0
    return-void
.end method

.method public final f(Z)V
    .locals 7

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v0

    iget-object v1, p0, Lp0/g;->d:Lv0/j;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lp0/g;->d()V

    const-class v0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    iget v2, p0, Lp0/g;->c:I

    iget-object v3, p0, Lp0/g;->e:Lp0/j;

    iget-object v4, p0, Lp0/g;->j:Ly0/a;

    iget-object v5, p0, Lp0/g;->b:Landroid/content/Context;

    if-eqz p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "ACTION_SCHEDULE_WORK"

    invoke-virtual {p1, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p1, v1}, Lp0/c;->c(Landroid/content/Intent;Lv0/j;)V

    new-instance v1, LF0/b;

    const/4 v6, 0x4

    invoke-direct {v1, v3, p1, v2, v6}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v4, v1}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    :cond_0
    iget-boolean p1, p0, Lp0/g;->l:Z

    if-eqz p1, :cond_1

    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v5, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "ACTION_CONSTRAINTS_CHANGED"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v0, LF0/b;

    const/4 v1, 0x4

    invoke-direct {v0, v3, p1, v2, v1}, LF0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    invoke-virtual {v4, v0}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method
