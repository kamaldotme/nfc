.class public final Lt2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/v;


# instance fields
.field public final b:J

.field public c:Z

.field public final d:Lz2/f;

.field public final e:Lz2/f;

.field public f:Z

.field public final synthetic g:Lt2/y;


# direct methods
.method public constructor <init>(Lt2/y;JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/w;->g:Lt2/y;

    iput-wide p2, p0, Lt2/w;->b:J

    iput-boolean p4, p0, Lt2/w;->c:Z

    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/w;->d:Lz2/f;

    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/w;->e:Lz2/f;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 1

    sget-object v0, Ln2/b;->a:[B

    iget-object v0, p0, Lt2/w;->g:Lt2/y;

    iget-object v0, v0, Lt2/y;->b:Lt2/q;

    invoke-virtual {v0, p1, p2}, Lt2/q;->D(J)V

    return-void
.end method

.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lt2/w;->g:Lt2/y;

    iget-object v0, v0, Lt2/y;->k:Lt2/x;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Lt2/w;->g:Lt2/y;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lt2/w;->f:Z

    iget-object v1, p0, Lt2/w;->e:Lz2/f;

    iget-wide v2, v1, Lz2/f;->c:J

    invoke-virtual {v1, v2, v3}, Lz2/f;->u(J)V

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    invoke-virtual {p0, v2, v3}, Lt2/w;->a(J)V

    :cond_0
    iget-object v0, p0, Lt2/w;->g:Lt2/y;

    invoke-virtual {v0}, Lt2/y;->a()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final z(Lz2/f;J)J
    .locals 15

    move-object v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v0, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_9

    :goto_0
    iget-object v6, v1, Lt2/w;->g:Lt2/y;

    monitor-enter v6

    :try_start_0
    iget-object v7, v6, Lt2/y;->k:Lt2/x;

    invoke-virtual {v7}, Lz2/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget v7, v6, Lt2/y;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    monitor-exit v6

    if-eqz v7, :cond_0

    iget-boolean v7, v1, Lt2/w;->c:Z

    if-nez v7, :cond_0

    iget-object v7, v6, Lt2/y;->n:Ljava/io/IOException;

    if-nez v7, :cond_1

    new-instance v7, Lt2/D;

    monitor-enter v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget v8, v6, Lt2/y;->m:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit v6

    invoke-static {v8}, LX/d;->l(I)V

    invoke-direct {v7, v8}, Lt2/D;-><init>(I)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    monitor-exit v6

    throw v2

    :cond_0
    const/4 v7, 0x0

    :cond_1
    :goto_1
    iget-boolean v8, v1, Lt2/w;->f:Z

    if-nez v8, :cond_8

    iget-object v8, v1, Lt2/w;->e:Lz2/f;

    iget-wide v9, v8, Lz2/f;->c:J

    cmp-long v11, v9, v4

    const-wide/16 v12, -0x1

    const/4 v14, 0x0

    if-lez v11, :cond_2

    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    invoke-virtual {v8, v0, v9, v10}, Lz2/f;->z(Lz2/f;J)J

    move-result-wide v8

    iget-wide v10, v6, Lt2/y;->c:J

    add-long/2addr v10, v8

    iput-wide v10, v6, Lt2/y;->c:J

    iget-wide v4, v6, Lt2/y;->d:J

    sub-long/2addr v10, v4

    if-nez v7, :cond_4

    iget-object v4, v6, Lt2/y;->b:Lt2/q;

    iget-object v4, v4, Lt2/q;->s:Lt2/C;

    invoke-virtual {v4}, Lt2/C;->a()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-long v4, v4

    cmp-long v4, v10, v4

    if-ltz v4, :cond_4

    iget-object v4, v6, Lt2/y;->b:Lt2/q;

    iget v5, v6, Lt2/y;->a:I

    invoke-virtual {v4, v5, v10, v11}, Lt2/q;->J(IJ)V

    iget-wide v4, v6, Lt2/y;->c:J

    iput-wide v4, v6, Lt2/y;->d:J

    goto :goto_2

    :cond_2
    iget-boolean v4, v1, Lt2/w;->c:Z

    if-nez v4, :cond_3

    if-nez v7, :cond_3

    invoke-virtual {v6}, Lt2/y;->k()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v14, 0x1

    :cond_3
    move-wide v8, v12

    :cond_4
    :goto_2
    :try_start_6
    iget-object v4, v6, Lt2/y;->k:Lt2/x;

    invoke-virtual {v4}, Lt2/x;->l()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v6

    if-eqz v14, :cond_5

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_5
    cmp-long v0, v8, v12

    if-eqz v0, :cond_6

    return-wide v8

    :cond_6
    if-nez v7, :cond_7

    return-wide v12

    :cond_7
    throw v7

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_8
    :try_start_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_3
    move-exception v0

    move-object v2, v0

    monitor-exit v6

    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_3
    :try_start_8
    iget-object v2, v6, Lt2/y;->k:Lt2/x;

    invoke-virtual {v2}, Lt2/x;->l()V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_4
    monitor-exit v6

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "byteCount < 0: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
