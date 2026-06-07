.class public final LF/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:LF/c;

.field public c:Z


# virtual methods
.method public final a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LF/d;->a:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LF/d;->a:Z

    iput-boolean v0, p0, LF/d;->c:Z

    iget-object v0, p0, LF/d;->b:LF/c;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {v0}, LF/c;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    monitor-enter p0

    :try_start_2
    iput-boolean v1, p0, LF/d;->c:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    throw v0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :cond_1
    :goto_0
    monitor-enter p0

    :try_start_4
    iput-boolean v1, p0, LF/d;->c:Z

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p0

    return-void

    :catchall_3
    move-exception v0

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    throw v0

    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method

.method public final b(LF/c;)V
    .locals 1

    monitor-enter p0

    :catch_0
    :goto_0
    :try_start_0
    iget-boolean v0, p0, LF/d;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v0, p0, LF/d;->b:LF/c;

    if-ne v0, p1, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iput-object p1, p0, LF/d;->b:LF/c;

    iget-boolean v0, p0, LF/d;->a:Z

    if-eqz v0, :cond_2

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1}, LF/c;->h()V

    return-void

    :cond_2
    :try_start_3
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
