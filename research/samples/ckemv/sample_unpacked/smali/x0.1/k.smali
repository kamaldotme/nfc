.class public final Lx0/k;
.super Lx0/i;
.source "SourceFile"


# virtual methods
.method public final j(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lx0/i;->g:Ljava/lang/Object;

    :cond_0
    sget-object v0, Lx0/i;->f:Lm0/z;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lm0/z;->g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lx0/i;->c(Lx0/i;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final k(Ljava/lang/Throwable;)Z
    .locals 2

    new-instance v0, Lx0/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, Lx0/c;-><init>(Ljava/lang/Throwable;)V

    sget-object p1, Lx0/i;->f:Lm0/z;

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Lm0/z;->g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lx0/i;->c(Lx0/i;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final l(La1/a;)Z
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lx0/i;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lx0/i;->f(La1/a;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lx0/i;->f:Lm0/z;

    invoke-virtual {v0, p0, v3, p1}, Lm0/z;->g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p0}, Lx0/i;->c(Lx0/i;)V

    :goto_0
    move v1, v2

    goto :goto_2

    :cond_0
    new-instance v0, Lx0/f;

    invoke-direct {v0, p0, p1}, Lx0/f;-><init>(Lx0/i;La1/a;)V

    sget-object v4, Lx0/i;->f:Lm0/z;

    invoke-virtual {v4, p0, v3, v0}, Lm0/z;->g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :try_start_0
    sget-object v1, Lx0/j;->b:Lx0/j;

    invoke-interface {p1, v0, v1}, La1/a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    new-instance v1, Lx0/c;

    invoke-direct {v1, p1}, Lx0/c;-><init>(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    sget-object v1, Lx0/c;->b:Lx0/c;

    :goto_1
    sget-object p1, Lx0/i;->f:Lm0/z;

    invoke-virtual {p1, p0, v0, v1}, Lm0/z;->g(Lx0/i;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx0/i;->a:Ljava/lang/Object;

    :cond_2
    instance-of v2, v0, Lx0/a;

    if-eqz v2, :cond_3

    check-cast v0, Lx0/a;

    iget-boolean v0, v0, Lx0/a;->a:Z

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_3
    :goto_2
    return v1
.end method
