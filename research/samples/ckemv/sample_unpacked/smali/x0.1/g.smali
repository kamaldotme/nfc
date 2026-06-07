.class public final Lx0/g;
.super Lm0/z;
.source "SourceFile"


# virtual methods
.method public final b0(Lx0/h;Lx0/h;)V
    .locals 0

    iput-object p2, p1, Lx0/h;->b:Lx0/h;

    return-void
.end method

.method public final c0(Lx0/h;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lx0/h;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final f(Lx0/i;Lx0/d;Lx0/d;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lx0/i;->b:Lx0/d;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lx0/i;->b:Lx0/d;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lx0/i;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lx0/i;->a:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final h(Lx0/i;Lx0/h;Lx0/h;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lx0/i;->c:Lx0/h;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lx0/i;->c:Lx0/h;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
