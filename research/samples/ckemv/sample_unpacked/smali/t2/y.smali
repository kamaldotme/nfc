.class public final Lt2/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lt2/q;

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public final g:Ljava/util/ArrayDeque;

.field public h:Z

.field public final i:Lt2/w;

.field public final j:Lt2/v;

.field public final k:Lt2/x;

.field public final l:Lt2/x;

.field public m:I

.field public n:Ljava/io/IOException;


# direct methods
.method public constructor <init>(ILt2/q;ZZLm2/j;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt2/y;->a:I

    iput-object p2, p0, Lt2/y;->b:Lt2/q;

    iget-object p1, p2, Lt2/q;->t:Lt2/C;

    invoke-virtual {p1}, Lt2/C;->a()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lt2/y;->f:J

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lt2/y;->g:Ljava/util/ArrayDeque;

    new-instance v0, Lt2/w;

    iget-object p2, p2, Lt2/q;->s:Lt2/C;

    invoke-virtual {p2}, Lt2/C;->a()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {v0, p0, v1, v2, p4}, Lt2/w;-><init>(Lt2/y;JZ)V

    iput-object v0, p0, Lt2/y;->i:Lt2/w;

    new-instance p2, Lt2/v;

    invoke-direct {p2, p0, p3}, Lt2/v;-><init>(Lt2/y;Z)V

    iput-object p2, p0, Lt2/y;->j:Lt2/v;

    new-instance p2, Lt2/x;

    invoke-direct {p2, p0}, Lt2/x;-><init>(Lt2/y;)V

    iput-object p2, p0, Lt2/y;->k:Lt2/x;

    new-instance p2, Lt2/x;

    invoke-direct {p2, p0}, Lt2/x;-><init>(Lt2/y;)V

    iput-object p2, p0, Lt2/y;->l:Lt2/x;

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Lt2/y;->g()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-virtual {p1, p5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lt2/y;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Ln2/b;->a:[B

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt2/y;->i:Lt2/w;

    iget-boolean v1, v0, Lt2/w;->c:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, Lt2/w;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt2/y;->j:Lt2/v;

    iget-boolean v1, v0, Lt2/v;->b:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, Lt2/v;->d:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lt2/y;->h()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_2

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lt2/y;->c(ILjava/io/IOException;)V

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    iget-object v0, p0, Lt2/y;->b:Lt2/q;

    iget v1, p0, Lt2/y;->a:I

    invoke-virtual {v0, v1}, Lt2/q;->o(I)Lt2/y;

    :cond_3
    :goto_1
    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lt2/y;->j:Lt2/v;

    iget-boolean v1, v0, Lt2/v;->d:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Lt2/v;->b:Z

    if-nez v0, :cond_2

    iget v0, p0, Lt2/y;->m:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt2/y;->n:Ljava/io/IOException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lt2/D;

    iget v1, p0, Lt2/y;->m:I

    invoke-static {v1}, LX/d;->l(I)V

    invoke-direct {v0, v1}, Lt2/D;-><init>(I)V

    :goto_0
    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(ILjava/io/IOException;)V
    .locals 1

    const-string v0, "rstStatusCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    invoke-virtual {p0, p1, p2}, Lt2/y;->d(ILjava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lt2/y;->b:Lt2/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "statusCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    iget-object p2, p2, Lt2/q;->z:Lt2/z;

    iget v0, p0, Lt2/y;->a:I

    invoke-virtual {p2, v0, p1}, Lt2/z;->D(II)V

    return-void
.end method

.method public final d(ILjava/io/IOException;)Z
    .locals 2

    sget-object v0, Ln2/b;->a:[B

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lt2/y;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iput p1, p0, Lt2/y;->m:I

    iput-object p2, p0, Lt2/y;->n:Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    iget-object p1, p0, Lt2/y;->i:Lt2/w;

    iget-boolean p1, p1, Lt2/w;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt2/y;->j:Lt2/v;

    iget-boolean p1, p1, Lt2/v;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    iget-object p1, p0, Lt2/y;->b:Lt2/q;

    iget p2, p0, Lt2/y;->a:I

    invoke-virtual {p1, p2}, Lt2/q;->o(I)Lt2/y;

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final e(I)V
    .locals 2

    const-string v0, "errorCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lt2/y;->d(ILjava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt2/y;->b:Lt2/q;

    iget v1, p0, Lt2/y;->a:I

    invoke-virtual {v0, v1, p1}, Lt2/q;->I(II)V

    return-void
.end method

.method public final f()Lt2/v;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lt2/y;->h:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lt2/y;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "reply before requesting the sink"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    iget-object v0, p0, Lt2/y;->j:Lt2/v;

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final g()Z
    .locals 4

    iget v0, p0, Lt2/y;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Lt2/y;->b:Lt2/q;

    iget-boolean v3, v3, Lt2/q;->b:Z

    if-ne v3, v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    return v1
.end method

.method public final declared-synchronized h()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lt2/y;->m:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lt2/y;->i:Lt2/w;

    iget-boolean v2, v0, Lt2/w;->c:Z

    if-nez v2, :cond_1

    iget-boolean v0, v0, Lt2/w;->f:Z

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lt2/y;->j:Lt2/v;

    iget-boolean v2, v0, Lt2/v;->b:Z

    if-nez v2, :cond_2

    iget-boolean v0, v0, Lt2/v;->d:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Lt2/y;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final i(Lm2/j;Z)V
    .locals 2

    const-string v0, "headers"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln2/b;->a:[B

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lt2/y;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lt2/y;->i:Lt2/w;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iput-boolean v1, p0, Lt2/y;->h:Z

    iget-object v0, p0, Lt2/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :goto_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Lt2/y;->i:Lt2/w;

    iput-boolean v1, p1, Lt2/w;->c:Z

    :cond_2
    invoke-virtual {p0}, Lt2/y;->h()Z

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez p1, :cond_3

    iget-object p1, p0, Lt2/y;->b:Lt2/q;

    iget p2, p0, Lt2/y;->a:I

    invoke-virtual {p1, p2}, Lt2/q;->o(I)Lt2/y;

    :cond_3
    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized j(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    iget v0, p0, Lt2/y;->m:I

    if-nez v0, :cond_0

    iput p1, p0, Lt2/y;->m:I

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final k()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method
