.class public final Landroidx/emoji2/text/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/emoji2/text/i;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:LG/e;

.field public final d:LU0/e;

.field public final e:Ljava/lang/Object;

.field public f:Landroid/os/Handler;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljava/util/concurrent/ThreadPoolExecutor;

.field public i:Lm0/z;


# direct methods
.method public constructor <init>(Landroid/content/Context;LG/e;)V
    .locals 2

    sget-object v0, Landroidx/emoji2/text/q;->d:LU0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    const-string v1, "Context cannot be null"

    invoke-static {p1, v1}, Lm0/z;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/emoji2/text/p;->b:Landroid/content/Context;

    iput-object p2, p0, Landroidx/emoji2/text/p;->c:LG/e;

    iput-object v0, p0, Landroidx/emoji2/text/p;->d:LU0/e;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Landroidx/emoji2/text/p;->i:Lm0/z;

    iget-object v2, p0, Landroidx/emoji2/text/p;->f:Landroid/os/Handler;

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iput-object v1, p0, Landroidx/emoji2/text/p;->f:Landroid/os/Handler;

    iget-object v2, p0, Landroidx/emoji2/text/p;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :cond_1
    iput-object v1, p0, Landroidx/emoji2/text/p;->g:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Landroidx/emoji2/text/p;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b()V
    .locals 10

    iget-object v0, p0, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/emoji2/text/p;->i:Lm0/z;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/emoji2/text/p;->g:Ljava/util/concurrent/Executor;

    if-nez v1, :cond_1

    const-string v1, "emojiCompat"

    new-instance v9, Landroidx/emoji2/text/a;

    invoke-direct {v9, v1}, Landroidx/emoji2/text/a;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const-wide/16 v5, 0xf

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    iput-object v1, p0, Landroidx/emoji2/text/p;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    iput-object v1, p0, Landroidx/emoji2/text/p;->g:Ljava/util/concurrent/Executor;

    :cond_1
    iget-object v1, p0, Landroidx/emoji2/text/p;->g:Ljava/util/concurrent/Executor;

    new-instance v2, LB2/u;

    const/16 v3, 0x9

    invoke-direct {v2, v3, p0}, LB2/u;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c()LG/j;
    .locals 4

    :try_start_0
    iget-object v0, p0, Landroidx/emoji2/text/p;->d:LU0/e;

    iget-object v1, p0, Landroidx/emoji2/text/p;->b:Landroid/content/Context;

    iget-object v2, p0, Landroidx/emoji2/text/p;->c:LG/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, LG/d;->a(Landroid/content/Context;LG/e;)LF0/e;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget v1, v0, LF0/e;->b:I

    if-nez v1, :cond_1

    iget-object v0, v0, LF0/e;->c:Ljava/lang/Object;

    check-cast v0, [LG/j;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "fetchFonts failed (empty result)"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "fetchFonts failed ("

    const-string v3, ")"

    invoke-static {v2, v1, v3}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "provider not found"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final j(Lm0/z;)V
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/emoji2/text/p;->i:Lm0/z;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/emoji2/text/p;->b()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
