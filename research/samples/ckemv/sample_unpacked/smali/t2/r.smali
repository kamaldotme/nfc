.class public final Lt2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/d;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lq2/l;

.field public final b:Lr2/f;

.field public final c:Lt2/q;

.field public volatile d:Lt2/y;

.field public final e:Lm2/p;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln2/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lt2/r;->g:Ljava/util/List;

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln2/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lt2/r;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lm2/o;Lq2/l;Lr2/f;Lt2/q;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt2/r;->a:Lq2/l;

    iput-object p3, p0, Lt2/r;->b:Lr2/f;

    iput-object p4, p0, Lt2/r;->c:Lt2/q;

    sget-object p2, Lm2/p;->g:Lm2/p;

    iget-object p1, p1, Lm2/o;->s:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lm2/p;->f:Lm2/p;

    :goto_0
    iput-object p2, p0, Lt2/r;->e:Lm2/p;

    return-void
.end method


# virtual methods
.method public final a(Lm2/r;)Lz2/v;
    .locals 0

    iget-object p1, p0, Lt2/r;->d:Lt2/y;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object p1, p1, Lt2/y;->i:Lt2/w;

    return-object p1
.end method

.method public final b(Lk/s;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lt2/r;->d:Lt2/y;

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Lk/s;->e:Ljava/lang/Object;

    check-cast v2, LX0/o;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    iget-object v6, v0, Lk/s;->d:Ljava/lang/Object;

    check-cast v6, Lm2/j;

    invoke-virtual {v6}, Lm2/j;->size()I

    move-result v7

    const/4 v8, 0x4

    add-int/2addr v7, v8

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v7, Lt2/b;

    sget-object v9, Lt2/b;->f:Lz2/i;

    iget-object v10, v0, Lk/s;->c:Ljava/io/Serializable;

    check-cast v10, Ljava/lang/String;

    invoke-direct {v7, v9, v10}, Lt2/b;-><init>(Lz2/i;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lt2/b;

    sget-object v9, Lt2/b;->g:Lz2/i;

    const-string v10, "url"

    iget-object v11, v0, Lk/s;->b:Ljava/lang/Object;

    check-cast v11, Lm2/l;

    invoke-static {v11, v10}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Lm2/l;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11}, Lm2/l;->d()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x3f

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :cond_2
    invoke-direct {v7, v9, v10}, Lt2/b;-><init>(Lz2/i;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "Host"

    iget-object v0, v0, Lk/s;->d:Ljava/lang/Object;

    check-cast v0, Lm2/j;

    invoke-virtual {v0, v7}, Lm2/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v7, Lt2/b;

    sget-object v9, Lt2/b;->i:Lz2/i;

    invoke-direct {v7, v9, v0}, Lt2/b;-><init>(Lz2/i;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, Lt2/b;

    sget-object v7, Lt2/b;->h:Lz2/i;

    iget-object v9, v11, Lm2/l;->a:Ljava/lang/String;

    invoke-direct {v0, v7, v9}, Lt2/b;-><init>(Lz2/i;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lm2/j;->size()I

    move-result v0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v0, :cond_6

    invoke-virtual {v6, v7}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "US"

    invoke-static {v10, v11}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v9, v10}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lt2/r;->g:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const-string v10, "te"

    invoke-static {v9, v10}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v6, v7}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "trailers"

    invoke-static {v10, v11}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_4
    new-instance v10, Lt2/b;

    invoke-virtual {v6, v7}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v9, v11}, Lt2/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_6
    iget-object v6, v1, Lt2/r;->c:Lt2/q;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    xor-int/lit8 v0, v2, 0x1

    iget-object v7, v6, Lt2/q;->z:Lt2/z;

    monitor-enter v7

    :try_start_0
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget v9, v6, Lt2/q;->g:I

    const v10, 0x3fffffff    # 1.9999999f

    if-le v9, v10, :cond_7

    const/16 v9, 0x8

    invoke-virtual {v6, v9}, Lt2/q;->A(I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_7
    :goto_2
    iget-boolean v9, v6, Lt2/q;->h:Z

    if-nez v9, :cond_11

    iget v15, v6, Lt2/q;->g:I

    add-int/lit8 v9, v15, 0x2

    iput v9, v6, Lt2/q;->g:I

    new-instance v14, Lt2/y;

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v9, v14

    move v10, v15

    move-object v11, v6

    move v12, v0

    move-object v3, v14

    move-object/from16 v14, v16

    invoke-direct/range {v9 .. v14}, Lt2/y;-><init>(ILt2/q;ZZLm2/j;)V

    if-eqz v2, :cond_9

    iget-wide v9, v6, Lt2/q;->w:J

    iget-wide v11, v6, Lt2/q;->x:J

    cmp-long v2, v9, v11

    if-gez v2, :cond_9

    iget-wide v9, v3, Lt2/y;->e:J

    iget-wide v11, v3, Lt2/y;->f:J

    cmp-long v2, v9, v11

    if-ltz v2, :cond_8

    goto :goto_3

    :cond_8
    const/4 v2, 0x0

    goto :goto_4

    :cond_9
    :goto_3
    move v2, v4

    :goto_4
    invoke-virtual {v3}, Lt2/y;->h()Z

    move-result v9

    if-eqz v9, :cond_a

    iget-object v9, v6, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_a
    :try_start_2
    monitor-exit v6

    iget-object v9, v6, Lt2/q;->z:Lt2/z;

    monitor-enter v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-boolean v10, v9, Lt2/z;->f:Z

    if-nez v10, :cond_10

    iget-object v10, v9, Lt2/z;->g:Lt2/d;

    invoke-virtual {v10, v5}, Lt2/d;->d(Ljava/util/ArrayList;)V

    iget-object v5, v9, Lt2/z;->d:Lz2/f;

    iget-wide v10, v5, Lz2/f;->c:J

    iget v5, v9, Lt2/z;->e:I

    int-to-long v12, v5

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    cmp-long v5, v10, v12

    if-nez v5, :cond_b

    move/from16 v17, v8

    goto :goto_5

    :cond_b
    const/16 v17, 0x0

    :goto_5
    if-eqz v0, :cond_c

    or-int/lit8 v17, v17, 0x1

    :cond_c
    move/from16 v0, v17

    long-to-int v8, v12

    invoke-virtual {v9, v15, v8, v4, v0}, Lt2/z;->i(IIII)V

    iget-object v0, v9, Lt2/z;->b:Lz2/g;

    iget-object v4, v9, Lt2/z;->d:Lz2/f;

    invoke-interface {v0, v4, v12, v13}, Lz2/t;->m(Lz2/f;J)V

    if-lez v5, :cond_d

    sub-long/2addr v10, v12

    invoke-virtual {v9, v15, v10, v11}, Lt2/z;->I(IJ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_d
    :goto_6
    :try_start_4
    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v7

    if-eqz v2, :cond_e

    iget-object v0, v6, Lt2/q;->z:Lt2/z;

    invoke-virtual {v0}, Lt2/z;->flush()V

    :cond_e
    iput-object v3, v1, Lt2/r;->d:Lt2/y;

    iget-boolean v0, v1, Lt2/r;->f:Z

    if-nez v0, :cond_f

    iget-object v0, v1, Lt2/r;->d:Lt2/y;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v0, v0, Lt2/y;->k:Lt2/x;

    iget-object v2, v1, Lt2/r;->b:Lr2/f;

    iget v2, v2, Lr2/f;->g:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    iget-object v0, v1, Lt2/r;->d:Lt2/y;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v0, v0, Lt2/y;->l:Lt2/x;

    iget-object v2, v1, Lt2/r;->b:Lr2/f;

    iget v2, v2, Lr2/f;->h:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3, v4}, Lz2/x;->g(JLjava/util/concurrent/TimeUnit;)Lz2/x;

    return-void

    :cond_f
    iget-object v0, v1, Lt2/r;->d:Lt2/y;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Lt2/y;->e(I)V

    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_7
    :try_start_6
    monitor-exit v9

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_9

    :cond_11
    :try_start_7
    new-instance v0, Lt2/a;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_8
    :try_start_8
    monitor-exit v6

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_9
    monitor-exit v7

    throw v0
.end method

.method public final c(Lm2/r;)J
    .locals 2

    invoke-static {p1}, Lr2/e;->a(Lm2/r;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ln2/b;->j(Lm2/r;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt2/r;->f:Z

    iget-object v0, p0, Lt2/r;->d:Lt2/y;

    if-eqz v0, :cond_0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lt2/y;->e(I)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lt2/r;->d:Lt2/y;

    invoke-static {v0}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt2/y;->f()Lt2/v;

    move-result-object v0

    invoke-virtual {v0}, Lt2/v;->close()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lt2/r;->c:Lt2/q;

    invoke-virtual {v0}, Lt2/q;->flush()V

    return-void
.end method

.method public final f(Z)Lm2/q;
    .locals 11

    iget-object v0, p0, Lt2/r;->d:Lt2/y;

    if-eqz v0, :cond_8

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lt2/y;->k:Lt2/x;

    invoke-virtual {v1}, Lz2/e;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v1, v0, Lt2/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Lt2/y;->m:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lt2/y;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :try_start_2
    iget-object v1, v0, Lt2/y;->k:Lt2/x;

    invoke-virtual {v1}, Lt2/x;->l()V

    iget-object v1, v0, Lt2/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_6

    iget-object v1, v0, Lt2/y;->g:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "headersQueue.removeFirst()"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lm2/j;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object v0, p0, Lt2/r;->e:Lm2/p;

    const-string v2, "protocol"

    invoke-static {v0, v2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Lm2/j;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v4

    move v6, v5

    :goto_1
    if-ge v6, v3, :cond_3

    invoke-virtual {v1, v6}, Lm2/j;->b(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v6}, Lm2/j;->d(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, ":status"

    invoke-static {v8, v10}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "HTTP/1.1 "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lm0/z;->Z(Ljava/lang/String;)LJ1/l;

    move-result-object v7

    goto :goto_2

    :cond_1
    sget-object v10, Lt2/r;->h:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, "name"

    invoke-static {v8, v10}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "value"

    invoke-static {v9, v10}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, Ld2/d;->n0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    if-eqz v7, :cond_5

    new-instance v1, Lm2/q;

    invoke-direct {v1}, Lm2/q;-><init>()V

    iput-object v0, v1, Lm2/q;->b:Lm2/p;

    iget v0, v7, LJ1/l;->b:I

    iput v0, v1, Lm2/q;->c:I

    iget-object v0, v7, LJ1/l;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v3, "message"

    invoke-static {v0, v3}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Lm2/q;->d:Ljava/lang/String;

    new-array v0, v5, [Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    new-instance v2, Lf/G;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lf/G;-><init>(I)V

    iget-object v3, v2, Lf/G;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    const-string v5, "<this>"

    invoke-static {v3, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "elements"

    invoke-static {v0, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LL1/j;->Q([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iput-object v2, v1, Lm2/q;->f:Lf/G;

    if-eqz p1, :cond_4

    iget p1, v1, Lm2/q;->c:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v1

    :goto_3
    return-object v4

    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_6
    :try_start_3
    iget-object p1, v0, Lt2/y;->n:Ljava/io/IOException;

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    new-instance p1, Lt2/D;

    iget v1, v0, Lt2/y;->m:I

    invoke-static {v1}, LX/d;->l(I)V

    invoke-direct {p1, v1}, Lt2/D;-><init>(I)V

    :goto_4
    throw p1

    :goto_5
    iget-object v1, v0, Lt2/y;->k:Lt2/x;

    invoke-virtual {v1}, Lt2/x;->l()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_6
    monitor-exit v0

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "stream wasn\'t created"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g()Lq2/l;
    .locals 1

    iget-object v0, p0, Lt2/r;->a:Lq2/l;

    return-object v0
.end method

.method public final h(Lk/s;J)Lz2/t;
    .locals 0

    iget-object p1, p0, Lt2/r;->d:Lt2/y;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lt2/y;->f()Lt2/v;

    move-result-object p1

    return-object p1
.end method
