.class public final Ln0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/a;


# instance fields
.field public a:Landroid/os/PowerManager$WakeLock;

.field public final b:Landroid/content/Context;

.field public final c:Lm0/a;

.field public final d:Lv0/i;

.field public final e:Landroidx/work/impl/WorkDatabase;

.field public final f:Ljava/util/HashMap;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/util/HashSet;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Processor"

    invoke-static {v0}, Lm0/r;->b(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/a;Lv0/i;Landroidx/work/impl/WorkDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/g;->b:Landroid/content/Context;

    iput-object p2, p0, Ln0/g;->c:Lm0/a;

    iput-object p3, p0, Ln0/g;->d:Lv0/i;

    iput-object p4, p0, Ln0/g;->e:Landroidx/work/impl/WorkDatabase;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ln0/g;->g:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ln0/g;->f:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Ln0/g;->i:Ljava/util/HashSet;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln0/g;->j:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, p0, Ln0/g;->a:Landroid/os/PowerManager$WakeLock;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/g;->k:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ln0/g;->h:Ljava/util/HashMap;

    return-void
.end method

.method public static d(Ln0/u;I)Z
    .locals 2

    if-eqz p0, :cond_1

    iput p1, p0, Ln0/u;->r:I

    invoke-virtual {p0}, Ln0/u;->h()Z

    iget-object v0, p0, Ln0/u;->q:Lx0/k;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lx0/i;->cancel(Z)Z

    iget-object v0, p0, Ln0/u;->e:Lm0/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln0/u;->q:Lx0/k;

    iget-object v0, v0, Lx0/i;->a:Ljava/lang/Object;

    instance-of v0, v0, Lx0/a;

    if-eqz v0, :cond_0

    iget-object p0, p0, Ln0/u;->e:Lm0/q;

    invoke-virtual {p0, p1}, Lm0/q;->e(I)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, Ln0/u;->d:Lv0/o;

    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    :cond_1
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ln0/c;)V
    .locals 2

    iget-object v0, p0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln0/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/String;)Ln0/u;
    .locals 4

    iget-object v0, p0, Ln0/g;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    iget-object v0, p0, Ln0/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u;

    :cond_1
    iget-object v3, p0, Ln0/g;->h:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v2, :cond_3

    iget-object p1, p0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v2, p0, Ln0/g;->f:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    if-nez v1, :cond_2

    iget-object v1, p0, Ln0/g;->b:Landroid/content/Context;

    sget v2, Lu0/c;->k:I

    new-instance v2, Landroid/content/Intent;

    const-class v3, Landroidx/work/impl/foreground/SystemForegroundService;

    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "ACTION_STOP_FOREGROUND"

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Ln0/g;->b:Landroid/content/Context;

    invoke-virtual {v1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    :try_start_2
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    iget-object v1, p0, Ln0/g;->a:Landroid/os/PowerManager$WakeLock;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    const/4 v1, 0x0

    iput-object v1, p0, Ln0/g;->a:Landroid/os/PowerManager$WakeLock;

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit p1

    goto :goto_4

    :goto_3
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :cond_3
    :goto_4
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ln0/u;
    .locals 1

    iget-object v0, p0, Ln0/g;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/u;

    if-nez v0, :cond_0

    iget-object v0, p0, Ln0/g;->g:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ln0/u;

    :cond_0
    return-object v0
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, Ln0/g;->c(Ljava/lang/String;)Ln0/u;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final f(Ln0/c;)V
    .locals 2

    iget-object v0, p0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ln0/g;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g(Ljava/lang/String;Lm0/h;)V
    .locals 4

    iget-object v0, p0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ln0/g;->g:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/u;

    if-eqz v1, :cond_1

    iget-object v2, p0, Ln0/g;->a:Landroid/os/PowerManager$WakeLock;

    if-nez v2, :cond_0

    iget-object v2, p0, Ln0/g;->b:Landroid/content/Context;

    const-string v3, "ProcessorForegroundLck"

    invoke-static {v2, v3}, Lw0/p;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v2

    iput-object v2, p0, Ln0/g;->a:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->acquire()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Ln0/g;->f:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ln0/g;->b:Landroid/content/Context;

    iget-object v1, v1, Ln0/u;->d:Lv0/o;

    invoke-static {v1}, Lu2/d;->k(Lv0/o;)Lv0/j;

    move-result-object v1

    invoke-static {p1, v1, p2}, Lu0/c;->b(Landroid/content/Context;Lv0/j;Lm0/h;)Landroid/content/Intent;

    move-result-object p1

    iget-object p2, p0, Ln0/g;->b:Landroid/content/Context;

    invoke-static {p2, p1}, Ly/e;->b(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final h(Ln0/m;Lm0/r;)Z
    .locals 11

    iget-object p2, p1, Ln0/m;->a:Lv0/j;

    iget-object v0, p2, Lv0/j;->a:Ljava/lang/String;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Ln0/g;->e:Landroidx/work/impl/WorkDatabase;

    new-instance v2, Ln0/e;

    invoke-direct {v2, p0, v8, v0}, Ln0/e;-><init>(Ln0/g;Ljava/util/ArrayList;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroidx/work/impl/WorkDatabase;->o(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lv0/o;

    const/4 v1, 0x0

    if-nez v7, :cond_0

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p2}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ln0/g;->d:Lv0/i;

    iget-object p1, p1, Lv0/i;->e:Ljava/lang/Object;

    check-cast p1, Ly0/a;

    new-instance v0, Ln0/f;

    invoke-direct {v0, p0, p2}, Ln0/f;-><init>(Ln0/g;Lv0/j;)V

    invoke-virtual {p1, v0}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    return v1

    :cond_0
    iget-object v9, p0, Ln0/g;->k:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    invoke-virtual {p0, v0}, Ln0/g;->e(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ln0/g;->h:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/m;

    iget-object v2, v2, Ln0/m;->a:Lv0/j;

    iget v2, v2, Lv0/j;->b:I

    iget v3, p2, Lv0/j;->b:I

    if-ne v2, v3, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p2}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ln0/g;->d:Lv0/i;

    iget-object p1, p1, Lv0/i;->e:Ljava/lang/Object;

    check-cast p1, Ly0/a;

    new-instance v0, Ln0/f;

    invoke-direct {v0, p0, p2}, Ln0/f;-><init>(Ln0/g;Lv0/j;)V

    invoke-virtual {p1, v0}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    :goto_0
    monitor-exit v9

    return v1

    :cond_2
    iget v2, v7, Lv0/o;->t:I

    iget v3, p2, Lv0/j;->b:I

    if-eq v2, v3, :cond_3

    iget-object p1, p0, Ln0/g;->d:Lv0/i;

    iget-object p1, p1, Lv0/i;->e:Ljava/lang/Object;

    check-cast p1, Ly0/a;

    new-instance v0, Ln0/f;

    invoke-direct {v0, p0, p2}, Ln0/f;-><init>(Ln0/g;Lv0/j;)V

    invoke-virtual {p1, v0}, Ly0/a;->execute(Ljava/lang/Runnable;)V

    monitor-exit v9

    return v1

    :cond_3
    new-instance v10, Ln0/t;

    iget-object v2, p0, Ln0/g;->b:Landroid/content/Context;

    iget-object v3, p0, Ln0/g;->c:Lm0/a;

    iget-object v4, p0, Ln0/g;->d:Lv0/i;

    iget-object v6, p0, Ln0/g;->e:Landroidx/work/impl/WorkDatabase;

    move-object v1, v10

    move-object v5, p0

    invoke-direct/range {v1 .. v8}, Ln0/t;-><init>(Landroid/content/Context;Lm0/a;Lv0/i;Lu0/a;Landroidx/work/impl/WorkDatabase;Lv0/o;Ljava/util/ArrayList;)V

    new-instance v1, Ln0/u;

    invoke-direct {v1, v10}, Ln0/u;-><init>(Ln0/t;)V

    iget-object v2, v1, Ln0/u;->p:Lx0/k;

    new-instance v3, Landroidx/emoji2/text/k;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v2, v1, v4}, Landroidx/emoji2/text/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object v4, p0, Ln0/g;->d:Lv0/i;

    iget-object v4, v4, Lv0/i;->e:Ljava/lang/Object;

    check-cast v4, Ly0/a;

    invoke-virtual {v2, v3, v4}, Lx0/i;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v2, p0, Ln0/g;->g:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ln0/g;->h:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ln0/g;->d:Lv0/i;

    iget-object p1, p1, Lv0/i;->b:Ljava/lang/Object;

    check-cast p1, Lf/B;

    invoke-virtual {p1, v1}, Lf/B;->execute(Ljava/lang/Runnable;)V

    invoke-static {}, Lm0/r;->a()Lm0/r;

    move-result-object p1

    invoke-virtual {p2}, Lv0/j;->toString()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    return p1

    :goto_1
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
