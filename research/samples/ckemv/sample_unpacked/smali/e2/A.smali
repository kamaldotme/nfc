.class public abstract Le2/A;
.super Ll2/h;
.source "SourceFile"


# instance fields
.field public d:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const-wide/16 v0, 0x0

    sget-object v2, Ll2/k;->g:Ll2/i;

    invoke-direct {p0, v0, v1, v2}, Ll2/h;-><init>(JLl2/i;)V

    iput p1, p0, Le2/A;->d:I

    return-void
.end method


# virtual methods
.method public abstract b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract d()LO1/d;
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    instance-of v0, p1, Le2/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Le2/m;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Le2/m;->a:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lv0/f;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    new-instance p2, Le2/u;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Le2/A;->d()LO1/d;

    move-result-object p1

    invoke-interface {p1}, LO1/d;->j()LO1/i;

    move-result-object p1

    invoke-static {p1, p2}, Le2/v;->h(LO1/i;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 11

    sget-object v0, LK1/h;->a:LK1/h;

    iget-object v1, p0, Ll2/h;->c:Ll2/i;

    :try_start_0
    invoke-virtual {p0}, Le2/A;->d()LO1/d;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v2, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lj2/h;

    iget-object v3, v2, Lj2/h;->f:LO1/d;

    iget-object v2, v2, Lj2/h;->h:Ljava/lang/Object;

    invoke-interface {v3}, LO1/d;->j()LO1/i;

    move-result-object v4

    invoke-static {v4, v2}, Lj2/a;->n(LO1/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lj2/a;->f:Ld1/f;

    const/4 v6, 0x0

    if-eq v2, v5, :cond_0

    invoke-static {v3, v4, v2}, Le2/v;->o(LO1/d;LO1/i;Ljava/lang/Object;)Le2/j0;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    goto/16 :goto_5

    :cond_0
    move-object v5, v6

    :goto_0
    :try_start_1
    invoke-interface {v3}, LO1/d;->j()LO1/i;

    move-result-object v7

    invoke-virtual {p0}, Le2/A;->i()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {p0, v8}, Le2/A;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    if-nez v9, :cond_1

    iget v10, p0, Le2/A;->d:I

    invoke-static {v10}, Le2/v;->j(I)Z

    move-result v10

    if-eqz v10, :cond_1

    sget-object v10, Le2/s;->c:Le2/s;

    invoke-interface {v7, v10}, LO1/i;->A(LO1/h;)LO1/g;

    move-result-object v7

    check-cast v7, Le2/Q;

    goto :goto_1

    :catchall_1
    move-exception v3

    goto :goto_4

    :cond_1
    move-object v7, v6

    :goto_1
    if-eqz v7, :cond_2

    invoke-interface {v7}, Le2/Q;->b()Z

    move-result v10

    if-nez v10, :cond_2

    check-cast v7, Le2/Z;

    invoke-virtual {v7}, Le2/Z;->B()Ljava/util/concurrent/CancellationException;

    move-result-object v7

    invoke-virtual {p0, v8, v7}, Le2/A;->b(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    invoke-static {v7}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object v7

    invoke-interface {v3, v7}, LO1/d;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    if-eqz v9, :cond_3

    invoke-static {v9}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object v7

    invoke-interface {v3, v7}, LO1/d;->c(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v8}, Le2/A;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v3, v7}, LO1/d;->c(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_2
    if-eqz v5, :cond_4

    :try_start_2
    invoke-virtual {v5}, Le2/j0;->Y()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    invoke-static {v4, v2}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    invoke-static {v0}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object v0

    :goto_3
    invoke-static {v0}, LK1/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v6, v0}, Le2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_4
    if-eqz v5, :cond_6

    :try_start_4
    invoke-virtual {v5}, Le2/j0;->Y()Z

    move-result v5

    if-eqz v5, :cond_7

    :cond_6
    invoke-static {v4, v2}, Lj2/a;->h(LO1/i;Ljava/lang/Object;)V

    :cond_7
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_5
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    invoke-static {v0}, Lm0/z;->q(Ljava/lang/Throwable;)LK1/d;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LK1/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Le2/A;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    return-void
.end method
