.class public final Lt2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final C:Lt2/C;


# instance fields
.field public final A:Lt2/l;

.field public final B:Ljava/util/LinkedHashSet;

.field public final b:Z

.field public final c:Lt2/h;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:Z

.field public final i:Lp2/d;

.field public final j:Lp2/c;

.field public final k:Lp2/c;

.field public final l:Lp2/c;

.field public final m:Lt2/B;

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public final s:Lt2/C;

.field public t:Lt2/C;

.field public u:J

.field public v:J

.field public w:J

.field public x:J

.field public final y:Ljava/net/Socket;

.field public final z:Lt2/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lt2/C;

    invoke-direct {v0}, Lt2/C;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lt2/C;->c(II)V

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lt2/C;->c(II)V

    sput-object v0, Lt2/q;->C:Lt2/C;

    return-void
.end method

.method public constructor <init>(Ls2/g;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt2/q;->b:Z

    iget-object v1, p1, Ls2/g;->g:Ljava/lang/Object;

    check-cast v1, Lt2/h;

    iput-object v1, p0, Lt2/q;->c:Lt2/h;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Ls2/g;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    iput-object v1, p0, Lt2/q;->e:Ljava/lang/String;

    const/4 v3, 0x3

    iput v3, p0, Lt2/q;->g:I

    iget-object v3, p1, Ls2/g;->d:Ljava/lang/Object;

    check-cast v3, Lp2/d;

    iput-object v3, p0, Lt2/q;->i:Lp2/d;

    invoke-virtual {v3}, Lp2/d;->f()Lp2/c;

    move-result-object v4

    iput-object v4, p0, Lt2/q;->j:Lp2/c;

    invoke-virtual {v3}, Lp2/d;->f()Lp2/c;

    move-result-object v5

    iput-object v5, p0, Lt2/q;->k:Lp2/c;

    invoke-virtual {v3}, Lp2/d;->f()Lp2/c;

    move-result-object v3

    iput-object v3, p0, Lt2/q;->l:Lp2/c;

    sget-object v3, Lt2/B;->a:Lt2/B;

    iput-object v3, p0, Lt2/q;->m:Lt2/B;

    new-instance v3, Lt2/C;

    invoke-direct {v3}, Lt2/C;-><init>()V

    const/4 v5, 0x7

    const/high16 v6, 0x1000000

    invoke-virtual {v3, v5, v6}, Lt2/C;->c(II)V

    iput-object v3, p0, Lt2/q;->s:Lt2/C;

    sget-object v3, Lt2/q;->C:Lt2/C;

    iput-object v3, p0, Lt2/q;->t:Lt2/C;

    invoke-virtual {v3}, Lt2/C;->a()I

    move-result v3

    int-to-long v5, v3

    iput-wide v5, p0, Lt2/q;->x:J

    iget-object v3, p1, Ls2/g;->e:Ljava/lang/Object;

    check-cast v3, Ljava/net/Socket;

    if-eqz v3, :cond_3

    iput-object v3, p0, Lt2/q;->y:Ljava/net/Socket;

    new-instance v3, Lt2/z;

    iget-object v5, p1, Ls2/g;->b:Lz2/g;

    if-eqz v5, :cond_2

    invoke-direct {v3, v5, v0}, Lt2/z;-><init>(Lz2/g;Z)V

    iput-object v3, p0, Lt2/q;->z:Lt2/z;

    new-instance v3, Lt2/l;

    new-instance v5, Lt2/u;

    iget-object v6, p1, Ls2/g;->a:Lz2/h;

    if-eqz v6, :cond_1

    invoke-direct {v5, v6, v0}, Lt2/u;-><init>(Lz2/h;Z)V

    invoke-direct {v3, p0, v5}, Lt2/l;-><init>(Lt2/q;Lt2/u;)V

    iput-object v3, p0, Lt2/q;->A:Lt2/l;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lt2/q;->B:Ljava/util/LinkedHashSet;

    iget p1, p1, Ls2/g;->c:I

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    const-string p1, " ping"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lt2/o;

    invoke-direct {v0, p1, p0, v2, v3}, Lt2/o;-><init>(Ljava/lang/String;Lt2/q;J)V

    invoke-virtual {v4, v0, v2, v3}, Lp2/c;->c(Lp2/a;J)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "source"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_2
    const-string p1, "sink"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string p1, "socket"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string p1, "connectionName"

    invoke-static {p1}, LX1/g;->h(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final A(I)V
    .locals 4

    const-string v0, "statusCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    iget-object v0, p0, Lt2/q;->z:Lt2/z;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v1, p0, Lt2/q;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Lt2/q;->h:Z

    iget v1, p0, Lt2/q;->f:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0

    iget-object v2, p0, Lt2/q;->z:Lt2/z;

    sget-object v3, Ln2/b;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lt2/z;->o(II[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public final declared-synchronized D(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lt2/q;->u:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lt2/q;->u:J

    iget-wide p1, p0, Lt2/q;->v:J

    sub-long/2addr v0, p1

    iget-object p1, p0, Lt2/q;->s:Lt2/C;

    invoke-virtual {p1}, Lt2/C;->a()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lt2/q;->J(IJ)V

    iget-wide p1, p0, Lt2/q;->v:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lt2/q;->v:J
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

.method public final G(IZLz2/f;J)V
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, Lt2/q;->z:Lt2/z;

    invoke-virtual {p4, p2, p1, p3, v3}, Lt2/z;->b(ZILz2/f;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, Lt2/q;->w:J

    iget-wide v6, p0, Lt2/q;->x:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    iget-object v2, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, Lt2/q;->z:Lt2/z;

    iget v4, v4, Lt2/z;->e:I

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, Lt2/q;->w:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, Lt2/q;->w:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lt2/q;->z:Lt2/z;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lt2/z;->b(ZILz2/f;I)V

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final I(II)V
    .locals 8

    const-string v0, "errorCode"

    invoke-static {v0, p2}, LX/d;->o(Ljava/lang/String;I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] writeSynReset"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lt2/j;

    const/4 v7, 0x2

    move-object v2, v0

    move-object v4, p0

    move v5, p1

    move v6, p2

    invoke-direct/range {v2 .. v7}, Lt2/j;-><init>(Ljava/lang/String;Lt2/q;III)V

    iget-object p1, p0, Lt2/q;->j:Lp2/c;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lp2/c;->c(Lp2/a;J)V

    return-void
.end method

.method public final J(IJ)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] windowUpdate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lt2/p;

    move-object v2, v0

    move-object v4, p0

    move v5, p1

    move-wide v6, p2

    invoke-direct/range {v2 .. v7}, Lt2/p;-><init>(Ljava/lang/String;Lt2/q;IJ)V

    iget-object p1, p0, Lt2/q;->j:Lp2/c;

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v0, p2, p3}, Lp2/c;->c(Lp2/a;J)V

    return-void
.end method

.method public final a(IILjava/io/IOException;)V
    .locals 3

    const-string v0, "connectionCode"

    invoke-static {v0, p1}, LX/d;->o(Ljava/lang/String;I)V

    const-string v0, "streamCode"

    invoke-static {v0, p2}, LX/d;->o(Ljava/lang/String;I)V

    sget-object v0, Ln2/b;->a:[B

    :try_start_0
    invoke-virtual {p0, p1}, Lt2/q;->A(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [Lt2/y;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    check-cast p1, [Lt2/y;

    if-eqz p1, :cond_1

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lt2/y;->c(ILjava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    :try_start_3
    iget-object p1, p0, Lt2/q;->z:Lt2/z;

    invoke-virtual {p1}, Lt2/z;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Lt2/q;->y:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lt2/q;->j:Lp2/c;

    invoke-virtual {p1}, Lp2/c;->e()V

    iget-object p1, p0, Lt2/q;->k:Lp2/c;

    invoke-virtual {p1}, Lp2/c;->e()V

    iget-object p1, p0, Lt2/q;->l:Lp2/c;

    invoke-virtual {p1}, Lp2/c;->e()V

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final b(Ljava/io/IOException;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, v0, p1}, Lt2/q;->a(IILjava/io/IOException;)V

    return-void
.end method

.method public final close()V
    .locals 3

    const/16 v0, 0x9

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lt2/q;->a(IILjava/io/IOException;)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lt2/q;->z:Lt2/z;

    invoke-virtual {v0}, Lt2/z;->flush()V

    return-void
.end method

.method public final declared-synchronized i(I)Lt2/y;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt2/y;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized o(I)Lt2/y;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt2/y;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
