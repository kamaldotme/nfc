.class public final Lt2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/t;


# instance fields
.field public final b:Z

.field public final c:Lz2/f;

.field public d:Z

.field public final synthetic e:Lt2/y;


# direct methods
.method public constructor <init>(Lt2/y;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/v;->e:Lt2/y;

    iput-boolean p2, p0, Lt2/v;->b:Z

    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/v;->c:Lz2/f;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 11

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lt2/y;->l:Lt2/x;

    invoke-virtual {v1}, Lz2/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    :try_start_1
    iget-wide v1, v0, Lt2/y;->e:J

    iget-wide v3, v0, Lt2/y;->f:J

    cmp-long v1, v1, v3

    if-ltz v1, :cond_0

    iget-boolean v1, p0, Lt2/v;->b:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lt2/v;->d:Z

    if-nez v1, :cond_0

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget v1, v0, Lt2/y;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    monitor-exit v0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lt2/y;->k()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_0
    :try_start_4
    iget-object v1, v0, Lt2/y;->l:Lt2/x;

    invoke-virtual {v1}, Lt2/x;->l()V

    invoke-virtual {v0}, Lt2/y;->b()V

    iget-wide v1, v0, Lt2/y;->f:J

    iget-wide v3, v0, Lt2/y;->e:J

    sub-long/2addr v1, v3

    iget-object v3, p0, Lt2/v;->c:Lz2/f;

    iget-wide v3, v3, Lz2/f;->c:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget-wide v1, v0, Lt2/y;->e:J

    add-long/2addr v1, v9

    iput-wide v1, v0, Lt2/y;->e:J

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt2/v;->c:Lz2/f;

    iget-wide v1, p1, Lz2/f;->c:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    cmp-long p1, v9, v1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v7, p1

    goto :goto_2

    :catchall_2
    move-exception p1

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    monitor-exit v0

    iget-object p1, p0, Lt2/v;->e:Lt2/y;

    iget-object p1, p1, Lt2/y;->l:Lt2/x;

    invoke-virtual {p1}, Lz2/e;->h()V

    :try_start_5
    iget-object p1, p0, Lt2/v;->e:Lt2/y;

    iget-object v5, p1, Lt2/y;->b:Lt2/q;

    iget v6, p1, Lt2/y;->a:I

    iget-object v8, p0, Lt2/v;->c:Lz2/f;

    invoke-virtual/range {v5 .. v10}, Lt2/q;->G(IZLz2/f;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    iget-object p1, p0, Lt2/v;->e:Lt2/y;

    iget-object p1, p1, Lt2/y;->l:Lt2/x;

    invoke-virtual {p1}, Lt2/x;->l()V

    return-void

    :catchall_3
    move-exception p1

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    iget-object v0, v0, Lt2/y;->l:Lt2/x;

    invoke-virtual {v0}, Lt2/x;->l()V

    throw p1

    :goto_3
    :try_start_6
    iget-object v1, v0, Lt2/y;->l:Lt2/x;

    invoke-virtual {v1}, Lt2/x;->l()V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_4
    monitor-exit v0

    throw p1
.end method

.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    iget-object v0, v0, Lt2/y;->l:Lt2/x;

    return-object v0
.end method

.method public final close()V
    .locals 13

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    sget-object v1, Ln2/b;->a:[B

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lt2/v;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget v1, v0, Lt2/y;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v2, 0x1

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    iget-object v3, v0, Lt2/y;->j:Lt2/v;

    iget-boolean v3, v3, Lt2/v;->b:Z

    if-nez v3, :cond_3

    iget-object v3, p0, Lt2/v;->c:Lz2/f;

    iget-wide v3, v3, Lz2/f;->c:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    :goto_1
    iget-object v0, p0, Lt2/v;->c:Lz2/f;

    iget-wide v0, v0, Lz2/f;->c:J

    cmp-long v0, v0, v5

    if-lez v0, :cond_3

    invoke-virtual {p0, v2}, Lt2/v;->a(Z)V

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    iget-object v7, v0, Lt2/y;->b:Lt2/q;

    iget v8, v0, Lt2/y;->a:I

    const-wide/16 v11, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-virtual/range {v7 .. v12}, Lt2/q;->G(IZLz2/f;J)V

    :cond_3
    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    monitor-enter v0

    :try_start_4
    iput-boolean v2, p0, Lt2/v;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    iget-object v0, v0, Lt2/y;->b:Lt2/q;

    invoke-virtual {v0}, Lt2/q;->flush()V

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    invoke-virtual {v0}, Lt2/y;->a()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    :try_start_5
    monitor-exit v0

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final flush()V
    .locals 4

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    sget-object v1, Ln2/b;->a:[B

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Lt2/y;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_0
    iget-object v0, p0, Lt2/v;->c:Lz2/f;

    iget-wide v0, v0, Lz2/f;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt2/v;->a(Z)V

    iget-object v0, p0, Lt2/v;->e:Lt2/y;

    iget-object v0, v0, Lt2/y;->b:Lt2/q;

    invoke-virtual {v0}, Lt2/q;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final m(Lz2/f;J)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln2/b;->a:[B

    iget-object v0, p0, Lt2/v;->c:Lz2/f;

    invoke-virtual {v0, p1, p2, p3}, Lz2/f;->m(Lz2/f;J)V

    :goto_0
    iget-wide p1, v0, Lz2/f;->c:J

    const-wide/16 v1, 0x4000

    cmp-long p1, p1, v1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lt2/v;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
