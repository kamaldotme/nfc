.class public final Lq2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final b:Lm2/o;

.field public final c:Lk/s;

.field public final d:Z

.field public final e:Lq2/m;

.field public final f:Lm2/b;

.field public final g:Lq2/h;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public i:Ljava/lang/Object;

.field public j:Lq2/f;

.field public k:Lq2/l;

.field public l:Z

.field public m:Lq2/e;

.field public n:Z

.field public o:Z

.field public p:Z

.field public volatile q:Z

.field public volatile r:Lq2/e;

.field public volatile s:Lq2/l;


# direct methods
.method public constructor <init>(Lm2/o;Lk/s;Z)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/i;->b:Lm2/o;

    iput-object p2, p0, Lq2/i;->c:Lk/s;

    iput-boolean p3, p0, Lq2/i;->d:Z

    iget-object p2, p1, Lm2/o;->c:Lf/G;

    iget-object p2, p2, Lf/G;->b:Ljava/lang/Object;

    check-cast p2, Lq2/m;

    iput-object p2, p0, Lq2/i;->e:Lq2/m;

    iget-object p1, p1, Lm2/o;->f:LB2/b;

    iget-object p1, p1, LB2/b;->b:Ljava/lang/Object;

    check-cast p1, Lm2/b;

    const-string p2, "$this_asFactory"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq2/i;->f:Lm2/b;

    new-instance p1, Lq2/h;

    invoke-direct {p1, p0}, Lq2/h;-><init>(Lq2/i;)V

    const/4 p2, 0x0

    int-to-long p2, p2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    iput-object p1, p0, Lq2/i;->g:Lq2/h;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lq2/i;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lq2/i;->p:Z

    return-void
.end method


# virtual methods
.method public final a(Lq2/l;)V
    .locals 2

    sget-object v0, Ln2/b;->a:[B

    iget-object v0, p0, Lq2/i;->k:Lq2/l;

    if-nez v0, :cond_0

    iput-object p1, p0, Lq2/i;->k:Lq2/l;

    iget-object p1, p1, Lq2/l;->p:Ljava/util/ArrayList;

    new-instance v0, Lq2/g;

    iget-object v1, p0, Lq2/i;->i:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lq2/g;-><init>(Lq2/i;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    sget-object v0, Ln2/b;->a:[B

    iget-object v0, p0, Lq2/i;->k:Lq2/l;

    if-eqz v0, :cond_3

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lq2/i;->h()Ljava/net/Socket;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lq2/i;->k:Lq2/l;

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    invoke-static {v1}, Ln2/b;->d(Ljava/net/Socket;)V

    :cond_0
    iget-object v0, p0, Lq2/i;->f:Lm2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    :goto_0
    iget-boolean v0, p0, Lq2/i;->l:Z

    if-eqz v0, :cond_4

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lq2/i;->g:Lq2/h;

    invoke-virtual {v0}, Lz2/e;->i()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz p1, :cond_7

    iget-object p1, p0, Lq2/i;->f:Lm2/b;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lq2/i;->f:Lm2/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    return-object v0
.end method

.method public final c()Lm2/r;
    .locals 3

    iget-object v0, p0, Lq2/i;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lq2/i;->g:Lq2/h;

    invoke-virtual {v0}, Lz2/e;->h()V

    sget-object v0, Lu2/n;->a:Lu2/n;

    sget-object v0, Lu2/n;->a:Lu2/n;

    invoke-virtual {v0}, Lu2/n;->g()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lq2/i;->i:Ljava/lang/Object;

    iget-object v0, p0, Lq2/i;->f:Lm2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, Lq2/i;->b:Lm2/o;

    iget-object v0, v0, Lm2/o;->b:Lv0/i;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, v0, Lv0/i;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0

    invoke-virtual {p0}, Lq2/i;->e()Lm2/r;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, Lq2/i;->b:Lm2/o;

    iget-object v1, v1, Lm2/o;->b:Lv0/i;

    invoke-virtual {v1, p0}, Lv0/i;->g(Lq2/i;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v1, p0, Lq2/i;->b:Lm2/o;

    iget-object v1, v1, Lm2/o;->b:Lv0/i;

    invoke-virtual {v1, p0}, Lv0/i;->g(Lq2/i;)V

    throw v0

    :cond_0
    const-string v0, "Already Executed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lq2/i;

    iget-boolean v1, p0, Lq2/i;->d:Z

    iget-object v2, p0, Lq2/i;->b:Lm2/o;

    iget-object v3, p0, Lq2/i;->c:Lk/s;

    invoke-direct {v0, v2, v3, v1}, Lq2/i;-><init>(Lm2/o;Lk/s;Z)V

    return-object v0
.end method

.method public final d(Z)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lq2/i;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq2/i;->r:Lq2/e;

    if-eqz p1, :cond_0

    iget-object v1, p1, Lq2/e;->d:Lr2/d;

    invoke-interface {v1}, Lr2/d;->cancel()V

    const/4 v1, 0x1

    iget-object v2, p1, Lq2/e;->a:Lq2/i;

    invoke-virtual {v2, p1, v1, v1, v0}, Lq2/i;->f(Lq2/e;ZZLjava/io/IOException;)Ljava/io/IOException;

    :cond_0
    iput-object v0, p0, Lq2/i;->m:Lq2/e;

    return-void

    :cond_1
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final e()Lm2/r;
    .locals 11

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lq2/i;->b:Lm2/o;

    iget-object v0, v0, Lm2/o;->d:Ljava/util/List;

    invoke-static {v2, v0}, LL1/q;->T(Ljava/util/ArrayList;Ljava/util/List;)V

    new-instance v0, Lr2/a;

    iget-object v1, p0, Lq2/i;->b:Lm2/o;

    invoke-direct {v0, v1}, Lr2/a;-><init>(Lm2/o;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lr2/a;

    iget-object v1, p0, Lq2/i;->b:Lm2/o;

    iget-object v1, v1, Lm2/o;->k:Lm2/b;

    invoke-direct {v0, v1}, Lr2/a;-><init>(Lm2/b;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lo2/b;

    iget-object v1, p0, Lq2/i;->b:Lm2/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lq2/a;->a:Lq2/a;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lq2/i;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lq2/i;->b:Lm2/o;

    iget-object v0, v0, Lm2/o;->e:Ljava/util/List;

    invoke-static {v2, v0}, LL1/q;->T(Ljava/util/ArrayList;Ljava/util/List;)V

    :cond_0
    new-instance v0, Lr2/b;

    iget-boolean v1, p0, Lq2/i;->d:Z

    invoke-direct {v0, v1}, Lr2/b;-><init>(Z)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, Lr2/f;

    iget-object v5, p0, Lq2/i;->c:Lk/s;

    iget-object v0, p0, Lq2/i;->b:Lm2/o;

    iget v6, v0, Lm2/o;->w:I

    iget v7, v0, Lm2/o;->x:I

    iget v8, v0, Lm2/o;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lr2/f;-><init>(Lq2/i;Ljava/util/List;ILq2/e;Lk/s;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lq2/i;->c:Lk/s;

    invoke-virtual {v9, v2}, Lr2/f;->b(Lk/s;)Lm2/r;

    move-result-object v2

    iget-boolean v3, p0, Lq2/i;->q:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, Lq2/i;->g(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, Ln2/b;->c(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x1

    :try_start_2
    invoke-virtual {p0, v1}, Lq2/i;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-static {v1, v3}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v1

    move v10, v2

    move-object v2, v1

    move v1, v10

    :goto_0
    if-nez v1, :cond_2

    invoke-virtual {p0, v0}, Lq2/i;->g(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_2
    throw v2
.end method

.method public final f(Lq2/e;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    const-string v0, "exchange"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/i;->r:Lq2/e;

    invoke-static {p1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    monitor-enter p0

    const/4 p1, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v1, p0, Lq2/i;->n:Z

    if-nez v1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    iget-boolean v1, p0, Lq2/i;->o:Z

    if-eqz v1, :cond_7

    :cond_2
    if-eqz p2, :cond_3

    iput-boolean v0, p0, Lq2/i;->n:Z

    :cond_3
    if-eqz p3, :cond_4

    iput-boolean v0, p0, Lq2/i;->o:Z

    :cond_4
    iget-boolean p2, p0, Lq2/i;->n:Z

    if-nez p2, :cond_5

    iget-boolean p3, p0, Lq2/i;->o:Z

    if-nez p3, :cond_5

    move p3, p1

    goto :goto_1

    :cond_5
    move p3, v0

    :goto_1
    if-nez p2, :cond_6

    iget-boolean p2, p0, Lq2/i;->o:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, Lq2/i;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_6

    move v0, p1

    :cond_6
    move p2, v0

    move v0, p3

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :cond_7
    move p2, v0

    :goto_3
    monitor-exit p0

    if-eqz v0, :cond_8

    const/4 p3, 0x0

    iput-object p3, p0, Lq2/i;->r:Lq2/e;

    iget-object p3, p0, Lq2/i;->k:Lq2/l;

    if-eqz p3, :cond_8

    monitor-enter p3

    :try_start_1
    iget v0, p3, Lq2/l;->m:I

    add-int/2addr v0, p1

    iput v0, p3, Lq2/l;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p3

    goto :goto_4

    :catchall_1
    move-exception p1

    monitor-exit p3

    throw p1

    :cond_8
    :goto_4
    if-eqz p2, :cond_9

    invoke-virtual {p0, p4}, Lq2/i;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_9
    return-object p4
.end method

.method public final g(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lq2/i;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lq2/i;->p:Z

    iget-boolean v0, p0, Lq2/i;->n:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lq2/i;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, Lq2/i;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final h()Ljava/net/Socket;
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, Lq2/i;->k:Lq2/l;

    invoke-static {v1}, LX1/g;->b(Ljava/lang/Object;)V

    sget-object v2, Ln2/b;->a:[B

    iget-object v2, v1, Lq2/l;->p:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/Reference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v4, v0

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_1
    if-eq v4, v6, :cond_6

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, p0, Lq2/i;->k:Lq2/l;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    iput-wide v4, v1, Lq2/l;->q:J

    iget-object v2, p0, Lq2/i;->e:Lq2/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ln2/b;->a:[B

    iget-boolean v4, v1, Lq2/l;->j:Z

    iget-object v5, v2, Lq2/m;->c:Lp2/c;

    if-nez v4, :cond_3

    iget v4, v2, Lq2/m;->a:I

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v0, 0x0

    iget-object v2, v2, Lq2/m;->d:Lp2/b;

    invoke-virtual {v5, v2, v0, v1}, Lp2/c;->c(Lp2/a;J)V

    goto :goto_3

    :cond_3
    :goto_2
    iput-boolean v0, v1, Lq2/l;->j:Z

    iget-object v0, v2, Lq2/m;->e:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v5}, Lp2/c;->a()V

    :cond_4
    iget-object v0, v1, Lq2/l;->d:Ljava/net/Socket;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_5
    :goto_3
    return-object v3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
