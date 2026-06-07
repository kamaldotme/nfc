.class public final Lt2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final b:Lz2/h;

.field public final c:Z

.field public final d:Lt2/t;

.field public final e:Lt2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lt2/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(Http2::class.java.name)"

    invoke-static {v0, v1}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lt2/u;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lz2/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/u;->b:Lz2/h;

    iput-boolean p2, p0, Lt2/u;->c:Z

    new-instance p2, Lt2/t;

    invoke-direct {p2, p1}, Lt2/t;-><init>(Lz2/h;)V

    iput-object p2, p0, Lt2/u;->d:Lt2/t;

    new-instance p1, Lt2/c;

    invoke-direct {p1, p2}, Lt2/c;-><init>(Lt2/t;)V

    iput-object p1, p0, Lt2/u;->e:Lt2/c;

    return-void
.end method


# virtual methods
.method public final A(Lt2/l;III)V
    .locals 10

    const/4 v0, 0x1

    if-eqz p4, :cond_9

    and-int/lit8 v1, p3, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v3, p3, 0x8

    if-eqz v3, :cond_1

    iget-object v3, p0, Lt2/u;->b:Lz2/h;

    invoke-interface {v3}, Lz2/h;->E()B

    move-result v3

    sget-object v4, Ln2/b;->a:[B

    and-int/lit16 v3, v3, 0xff

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, p3, 0x20

    if-eqz v4, :cond_2

    iget-object v4, p0, Lt2/u;->b:Lz2/h;

    invoke-interface {v4}, Lz2/h;->H()I

    invoke-interface {v4}, Lz2/h;->E()B

    sget-object v4, Ln2/b;->a:[B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, -0x5

    :cond_2
    invoke-static {p2, p3, v3}, Lt2/s;->a(III)I

    move-result p2

    invoke-virtual {p0, p2, v3, p3, p4}, Lt2/u;->o(IIII)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, Lt2/l;->c:Lt2/q;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p4, :cond_3

    and-int/lit8 p2, p4, 0x1

    if-nez p2, :cond_3

    move v2, v0

    :cond_3
    const-wide/16 p2, 0x0

    const/16 v9, 0x5b

    if-eqz v2, :cond_4

    iget-object p1, p1, Lt2/l;->c:Lt2/q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] onHeaders"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lt2/n;

    move-object v3, v0

    move-object v5, p1

    move v6, p4

    move v8, v1

    invoke-direct/range {v3 .. v8}, Lt2/n;-><init>(Ljava/lang/String;Lt2/q;ILjava/util/List;Z)V

    iget-object p1, p1, Lt2/q;->k:Lp2/c;

    invoke-virtual {p1, v0, p2, p3}, Lp2/c;->c(Lp2/a;J)V

    goto/16 :goto_2

    :cond_4
    iget-object p1, p1, Lt2/l;->c:Lt2/q;

    monitor-enter p1

    :try_start_0
    invoke-virtual {p1, p4}, Lt2/q;->i(I)Lt2/y;

    move-result-object v2

    if-nez v2, :cond_8

    iget-boolean v2, p1, Lt2/q;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_5

    monitor-exit p1

    goto :goto_2

    :cond_5
    :try_start_1
    iget v2, p1, Lt2/q;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p4, v2, :cond_6

    monitor-exit p1

    goto :goto_2

    :cond_6
    :try_start_2
    rem-int/lit8 v2, p4, 0x2

    iget v3, p1, Lt2/q;->g:I

    rem-int/lit8 v3, v3, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v2, v3, :cond_7

    monitor-exit p1

    goto :goto_2

    :cond_7
    :try_start_3
    invoke-static {v7}, Ln2/b;->t(Ljava/util/List;)Lm2/j;

    move-result-object v8

    new-instance v2, Lt2/y;

    const/4 v6, 0x0

    move-object v3, v2

    move v4, p4

    move-object v5, p1

    move v7, v1

    invoke-direct/range {v3 .. v8}, Lt2/y;-><init>(ILt2/q;ZZLm2/j;)V

    iput p4, p1, Lt2/q;->f:I

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v3, p1, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lt2/q;->i:Lp2/d;

    invoke-virtual {v1}, Lp2/d;->f()Lp2/c;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p1, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, "] onStream"

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance v3, Lt2/i;

    invoke-direct {v3, p4, p1, v2, v0}, Lt2/i;-><init>(Ljava/lang/String;Lt2/q;Ljava/lang/Object;I)V

    invoke-virtual {v1, v3, p2, p3}, Lp2/c;->c(Lp2/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_8
    monitor-exit p1

    invoke-static {v7}, Ln2/b;->t(Ljava/util/List;)Lm2/j;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Lt2/y;->i(Lm2/j;Z)V

    :goto_2
    return-void

    :goto_3
    monitor-exit p1

    throw p2

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final D(Lt2/l;III)V
    .locals 3

    if-eqz p4, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt2/u;->b:Lz2/h;

    invoke-interface {v0}, Lz2/h;->E()B

    move-result v0

    sget-object v1, Ln2/b;->a:[B

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt2/u;->b:Lz2/h;

    invoke-interface {v1}, Lz2/h;->H()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    add-int/lit8 p2, p2, -0x4

    invoke-static {p2, p3, v0}, Lt2/s;->a(III)I

    move-result p2

    invoke-virtual {p0, p2, v0, p3, p4}, Lt2/u;->o(IIII)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lt2/l;->c:Lt2/q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter p1

    :try_start_0
    iget-object p3, p1, Lt2/q;->B:Ljava/util/LinkedHashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p2, 0x2

    invoke-virtual {p1, v1, p2}, Lt2/q;->I(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    :try_start_1
    iget-object p3, p1, Lt2/q;->B:Ljava/util/LinkedHashSet;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    iget-object p3, p1, Lt2/q;->k:Lp2/c;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p1, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x5b

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] onRequest"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance v0, Lt2/n;

    invoke-direct {v0, p4, p1, v1, p2}, Lt2/n;-><init>(Ljava/lang/String;Lt2/q;ILjava/util/List;)V

    const-wide/16 p1, 0x0

    invoke-virtual {p3, v0, p1, p2}, Lp2/c;->c(Lp2/a;J)V

    :goto_1
    return-void

    :goto_2
    monitor-exit p1

    throw p2

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(ZLt2/l;)Z
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v3, 0x1

    const-string v4, "handler"

    invoke-static {v0, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, v1, Lt2/u;->b:Lz2/h;

    const-wide/16 v6, 0x9

    invoke-interface {v5, v6, v7}, Lz2/h;->n(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v5, v1, Lt2/u;->b:Lz2/h;

    invoke-static {v5}, Ln2/b;->r(Lz2/h;)I

    move-result v5

    const/16 v6, 0x4000

    if-gt v5, v6, :cond_2c

    iget-object v7, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v7}, Lz2/h;->E()B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    iget-object v8, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v8}, Lz2/h;->E()B

    move-result v8

    and-int/lit16 v9, v8, 0xff

    iget-object v10, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v10}, Lz2/h;->H()I

    move-result v10

    const v11, 0x7fffffff

    and-int v15, v10, v11

    sget-object v11, Lt2/u;->f:Ljava/util/logging/Logger;

    sget-object v12, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v11, v12}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v12

    if-eqz v12, :cond_0

    invoke-static {v15, v5, v7, v9, v3}, Lt2/f;->a(IIIIZ)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/4 v11, 0x4

    if-eqz p1, :cond_3

    if-ne v7, v11, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a SETTINGS frame but was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lt2/f;->b:[Ljava/lang/String;

    array-length v4, v3

    if-ge v7, v4, :cond_2

    aget-object v3, v3, v7

    goto :goto_0

    :cond_2
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "0x%02x"

    invoke-static {v4, v3}, Ln2/b;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/16 v12, 0xe

    const/16 v13, 0x8

    const/4 v6, 0x3

    const/4 v14, 0x2

    const-wide/16 v2, 0x0

    packed-switch v7, :pswitch_data_0

    iget-object v0, v1, Lt2/u;->b:Lz2/h;

    int-to-long v2, v5

    invoke-interface {v0, v2, v3}, Lz2/h;->u(J)V

    :cond_4
    :goto_2
    const/4 v0, 0x1

    goto/16 :goto_b

    :pswitch_0
    if-ne v5, v11, :cond_8

    iget-object v4, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v4}, Lz2/h;->H()I

    move-result v4

    int-to-long v4, v4

    const-wide/32 v6, 0x7fffffff

    and-long/2addr v4, v6

    cmp-long v2, v4, v2

    if-eqz v2, :cond_7

    if-nez v15, :cond_5

    iget-object v2, v0, Lt2/l;->c:Lt2/q;

    monitor-enter v2

    :try_start_1
    iget-wide v6, v2, Lt2/q;->x:J

    add-long/2addr v6, v4

    iput-wide v6, v2, Lt2/q;->x:J

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_5
    iget-object v0, v0, Lt2/l;->c:Lt2/q;

    invoke-virtual {v0, v15}, Lt2/q;->i(I)Lt2/y;

    move-result-object v3

    if-eqz v3, :cond_4

    monitor-enter v3

    :try_start_2
    iget-wide v6, v3, Lt2/y;->f:J

    add-long/2addr v6, v4

    iput-wide v6, v3, Lt2/y;->f:J

    if-lez v2, :cond_6

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_6
    monitor-exit v3

    goto :goto_2

    :catchall_1
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "windowSizeIncrement was 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    invoke-static {v2, v5}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    if-lt v5, v13, :cond_e

    if-nez v15, :cond_d

    iget-object v2, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v2}, Lz2/h;->H()I

    move-result v2

    iget-object v3, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v3}, Lz2/h;->H()I

    move-result v3

    sub-int/2addr v5, v13

    invoke-static {v12}, Lq/h;->b(I)[I

    move-result-object v6

    array-length v7, v6

    move v8, v4

    :goto_3
    if-ge v8, v7, :cond_c

    aget v9, v6, v8

    invoke-static {v9}, Lq/h;->a(I)I

    move-result v10

    if-ne v10, v3, :cond_b

    if-eqz v9, :cond_c

    sget-object v3, Lz2/i;->e:Lz2/i;

    if-lez v5, :cond_9

    iget-object v3, v1, Lt2/u;->b:Lz2/h;

    int-to-long v5, v5

    invoke-interface {v3, v5, v6}, Lz2/h;->p(J)Lz2/i;

    move-result-object v3

    :cond_9
    const-string v5, "debugData"

    invoke-static {v3, v5}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lz2/i;->c()I

    iget-object v3, v0, Lt2/l;->c:Lt2/q;

    monitor-enter v3

    :try_start_3
    iget-object v5, v3, Lt2/q;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    new-array v6, v4, [Lt2/y;

    invoke-interface {v5, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x1

    iput-boolean v6, v3, Lt2/q;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit v3

    check-cast v5, [Lt2/y;

    array-length v3, v5

    :goto_4
    if-ge v4, v3, :cond_4

    aget-object v6, v5, v4

    iget v7, v6, Lt2/y;->a:I

    if-le v7, v2, :cond_a

    invoke-virtual {v6}, Lt2/y;->g()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v6, v13}, Lt2/y;->j(I)V

    iget-object v7, v0, Lt2/l;->c:Lt2/q;

    iget v6, v6, Lt2/y;->a:I

    invoke-virtual {v7, v6}, Lt2/q;->o(I)Lt2/y;

    :cond_a
    const/4 v6, 0x1

    add-int/2addr v4, v6

    goto :goto_4

    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_b
    const/4 v9, 0x1

    add-int/2addr v8, v9

    goto :goto_3

    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY unexpected error code: "

    invoke-static {v2, v3}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY length < 8: "

    invoke-static {v2, v5}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    if-ne v5, v13, :cond_14

    if-nez v15, :cond_13

    iget-object v4, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v4}, Lz2/h;->H()I

    move-result v4

    iget-object v5, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v5}, Lz2/h;->H()I

    move-result v22

    const/4 v5, 0x1

    and-int/lit8 v7, v8, 0x1

    if-eqz v7, :cond_12

    iget-object v2, v0, Lt2/l;->c:Lt2/q;

    monitor-enter v2

    const-wide/16 v7, 0x1

    if-eq v4, v5, :cond_11

    if-eq v4, v14, :cond_10

    if-eq v4, v6, :cond_f

    goto :goto_5

    :cond_f
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    goto :goto_5

    :catchall_3
    move-exception v0

    goto :goto_6

    :cond_10
    iget-wide v3, v2, Lt2/q;->q:J

    add-long/2addr v3, v7

    iput-wide v3, v2, Lt2/q;->q:J

    goto :goto_5

    :cond_11
    iget-wide v3, v2, Lt2/q;->o:J

    add-long/2addr v3, v7

    iput-wide v3, v2, Lt2/q;->o:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_5
    monitor-exit v2

    goto/16 :goto_2

    :goto_6
    monitor-exit v2

    throw v0

    :cond_12
    iget-object v5, v0, Lt2/l;->c:Lt2/q;

    iget-object v5, v5, Lt2/q;->j:Lp2/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v0, Lt2/l;->c:Lt2/q;

    iget-object v7, v7, Lt2/q;->e:Ljava/lang/String;

    const-string v8, " ping"

    invoke-static {v6, v7, v8}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    iget-object v0, v0, Lt2/l;->c:Lt2/q;

    new-instance v6, Lt2/j;

    const/16 v23, 0x0

    move-object/from16 v18, v6

    move-object/from16 v20, v0

    move/from16 v21, v4

    invoke-direct/range {v18 .. v23}, Lt2/j;-><init>(Ljava/lang/String;Lt2/q;III)V

    invoke-virtual {v5, v6, v2, v3}, Lp2/c;->c(Lp2/a;J)V

    goto/16 :goto_2

    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PING length != 8: "

    invoke-static {v2, v5}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    invoke-virtual {v1, v0, v5, v9, v15}, Lt2/u;->D(Lt2/l;III)V

    goto/16 :goto_2

    :pswitch_4
    if-nez v15, :cond_23

    const/4 v7, 0x1

    and-int/2addr v8, v7

    if-eqz v8, :cond_16

    if-nez v5, :cond_15

    goto/16 :goto_2

    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    const/4 v7, 0x6

    rem-int/lit8 v8, v5, 0x6

    if-nez v8, :cond_22

    new-instance v8, Lt2/C;

    invoke-direct {v8}, Lt2/C;-><init>()V

    invoke-static {v4, v5}, Lu2/l;->P(II)La2/c;

    move-result-object v4

    invoke-static {v4, v7}, Lu2/l;->O(La2/c;I)La2/a;

    move-result-object v4

    iget v5, v4, La2/a;->b:I

    iget v7, v4, La2/a;->c:I

    iget v4, v4, La2/a;->d:I

    if-lez v4, :cond_17

    if-le v5, v7, :cond_18

    :cond_17
    if-gez v4, :cond_21

    if-gt v7, v5, :cond_21

    :cond_18
    :goto_7
    iget-object v9, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v9}, Lz2/h;->y()S

    move-result v10

    sget-object v12, Ln2/b;->a:[B

    const v12, 0xffff

    and-int/2addr v10, v12

    invoke-interface {v9}, Lz2/h;->H()I

    move-result v9

    if-eq v10, v14, :cond_1e

    if-eq v10, v6, :cond_1d

    if-eq v10, v11, :cond_1b

    const/4 v12, 0x5

    if-eq v10, v12, :cond_19

    const/16 v12, 0x4000

    goto :goto_8

    :cond_19
    const/16 v12, 0x4000

    if-lt v9, v12, :cond_1a

    const v13, 0xffffff

    if-gt v9, v13, :cond_1a

    goto :goto_8

    :cond_1a
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    invoke-static {v2, v9}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    const/16 v12, 0x4000

    if-ltz v9, :cond_1c

    const/4 v10, 0x7

    goto :goto_8

    :cond_1c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    const/16 v12, 0x4000

    move v10, v11

    goto :goto_8

    :cond_1e
    const/16 v12, 0x4000

    if-eqz v9, :cond_20

    const/4 v13, 0x1

    if-ne v9, v13, :cond_1f

    goto :goto_8

    :cond_1f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    :goto_8
    invoke-virtual {v8, v10, v9}, Lt2/C;->c(II)V

    if-eq v5, v7, :cond_21

    add-int/2addr v5, v4

    goto :goto_7

    :cond_21
    iget-object v4, v0, Lt2/l;->c:Lt2/q;

    iget-object v5, v4, Lt2/q;->j:Lp2/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v4, Lt2/q;->e:Ljava/lang/String;

    const-string v7, " applyAndAckSettings"

    invoke-static {v6, v4, v7}, LX/d;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lt2/k;

    invoke-direct {v6, v4, v0, v8}, Lt2/k;-><init>(Ljava/lang/String;Lt2/l;Lt2/C;)V

    invoke-virtual {v5, v6, v2, v3}, Lp2/c;->c(Lp2/a;J)V

    goto/16 :goto_2

    :cond_22
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS length % 6 != 0: "

    invoke-static {v2, v5}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS streamId != 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_5
    if-ne v5, v11, :cond_29

    if-eqz v15, :cond_28

    iget-object v5, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v5}, Lz2/h;->H()I

    move-result v5

    invoke-static {v12}, Lq/h;->b(I)[I

    move-result-object v6

    array-length v7, v6

    move v8, v4

    :goto_9
    if-ge v8, v7, :cond_24

    aget v9, v6, v8

    invoke-static {v9}, Lq/h;->a(I)I

    move-result v11

    if-ne v11, v5, :cond_25

    move v4, v9

    :cond_24
    const/4 v9, 0x1

    goto :goto_a

    :cond_25
    const/4 v9, 0x1

    add-int/2addr v8, v9

    goto :goto_9

    :goto_a
    if-eqz v4, :cond_27

    iget-object v0, v0, Lt2/l;->c:Lt2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v15, :cond_26

    and-int/lit8 v5, v10, 0x1

    if-nez v5, :cond_26

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v0, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5b

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "] onReset"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    new-instance v5, Lt2/j;

    const/16 v17, 0x1

    move-object v12, v5

    move-object v14, v0

    move/from16 v16, v4

    invoke-direct/range {v12 .. v17}, Lt2/j;-><init>(Ljava/lang/String;Lt2/q;III)V

    iget-object v0, v0, Lt2/q;->k:Lp2/c;

    invoke-virtual {v0, v5, v2, v3}, Lp2/c;->c(Lp2/a;J)V

    goto/16 :goto_2

    :cond_26
    invoke-virtual {v0, v15}, Lt2/q;->o(I)Lt2/y;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, v4}, Lt2/y;->j(I)V

    goto/16 :goto_2

    :cond_27
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM unexpected error code: "

    invoke-static {v2, v5}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM length: "

    const-string v3, " != 4"

    invoke-static {v2, v5, v3}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_6
    const/4 v0, 0x5

    if-ne v5, v0, :cond_2b

    if-eqz v15, :cond_2a

    iget-object v0, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v0}, Lz2/h;->H()I

    invoke-interface {v0}, Lz2/h;->E()B

    goto/16 :goto_2

    :cond_2a
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    new-instance v0, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY length: "

    const-string v3, " != 5"

    invoke-static {v2, v5, v3}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_7
    invoke-virtual {v1, v0, v5, v9, v15}, Lt2/u;->A(Lt2/l;III)V

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {v1, v0, v5, v9, v15}, Lt2/u;->i(Lt2/l;III)V

    goto/16 :goto_2

    :goto_b
    return v0

    :cond_2c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR: "

    invoke-static {v2, v5}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lt2/l;)V
    .locals 4

    const-string v0, "handler"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lt2/u;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lt2/u;->a(ZLt2/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Required SETTINGS preface not received"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lt2/f;->a:Lz2/i;

    iget-object v0, p1, Lz2/i;->b:[B

    array-length v0, v0

    int-to-long v0, v0

    iget-object v2, p0, Lt2/u;->b:Lz2/h;

    invoke-interface {v2, v0, v1}, Lz2/h;->p(J)Lz2/i;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v2, Lt2/u;->f:Ljava/util/logging/Logger;

    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "<< CONNECTION "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lz2/i;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ln2/b;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    invoke-static {p1, v0}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v0}, Lz2/i;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expected a connection header but was "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lt2/u;->b:Lz2/h;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final i(Lt2/l;III)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p3

    move/from16 v5, p4

    const/4 v3, 0x1

    if-eqz v5, :cond_f

    and-int/lit8 v4, v2, 0x1

    if-eqz v4, :cond_0

    move v8, v3

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    and-int/lit8 v4, v2, 0x20

    if-nez v4, :cond_e

    and-int/lit8 v4, v2, 0x8

    if-eqz v4, :cond_1

    iget-object v4, v1, Lt2/u;->b:Lz2/h;

    invoke-interface {v4}, Lz2/h;->E()B

    move-result v4

    sget-object v7, Ln2/b;->a:[B

    and-int/lit16 v4, v4, 0xff

    move v9, v4

    move/from16 v4, p2

    goto :goto_1

    :cond_1
    move/from16 v4, p2

    const/4 v9, 0x0

    :goto_1
    invoke-static {v4, v2, v9}, Lt2/s;->a(III)I

    move-result v7

    iget-object v2, v1, Lt2/u;->b:Lz2/h;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "source"

    invoke-static {v2, v4}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lt2/l;->c:Lt2/q;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_2

    and-int/lit8 v4, v5, 0x1

    if-nez v4, :cond_2

    move v4, v3

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    const-wide/16 v10, 0x0

    if-eqz v4, :cond_3

    iget-object v0, v0, Lt2/l;->c:Lt2/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lz2/f;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    int-to-long v3, v7

    invoke-interface {v2, v3, v4}, Lz2/h;->n(J)V

    invoke-interface {v2, v6, v3, v4}, Lz2/v;->z(Lz2/f;J)J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lt2/q;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v12, Lt2/m;

    move-object v2, v12

    move-object v4, v0

    move/from16 v5, p4

    invoke-direct/range {v2 .. v8}, Lt2/m;-><init>(Ljava/lang/String;Lt2/q;ILz2/f;IZ)V

    iget-object v0, v0, Lt2/q;->k:Lp2/c;

    invoke-virtual {v0, v12, v10, v11}, Lp2/c;->c(Lp2/a;J)V

    goto/16 :goto_9

    :cond_3
    iget-object v4, v0, Lt2/l;->c:Lt2/q;

    invoke-virtual {v4, v5}, Lt2/q;->i(I)Lt2/y;

    move-result-object v4

    if-nez v4, :cond_4

    iget-object v3, v0, Lt2/l;->c:Lt2/q;

    const/4 v4, 0x2

    invoke-virtual {v3, v5, v4}, Lt2/q;->I(II)V

    iget-object v0, v0, Lt2/l;->c:Lt2/q;

    int-to-long v3, v7

    invoke-virtual {v0, v3, v4}, Lt2/q;->D(J)V

    invoke-interface {v2, v3, v4}, Lz2/h;->u(J)V

    goto/16 :goto_9

    :cond_4
    sget-object v0, Ln2/b;->a:[B

    iget-object v0, v4, Lt2/y;->i:Lt2/w;

    int-to-long v12, v7

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v14, v12

    :goto_3
    cmp-long v5, v14, v10

    if-lez v5, :cond_c

    iget-object v5, v0, Lt2/w;->g:Lt2/y;

    monitor-enter v5

    :try_start_0
    iget-boolean v7, v0, Lt2/w;->c:Z

    iget-object v6, v0, Lt2/w;->e:Lz2/f;

    move-object/from16 p2, v4

    iget-wide v3, v6, Lz2/f;->c:J

    add-long/2addr v3, v14

    iget-wide v10, v0, Lt2/w;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    cmp-long v3, v3, v10

    if-lez v3, :cond_5

    const/4 v3, 0x1

    goto :goto_4

    :cond_5
    const/4 v3, 0x0

    :goto_4
    monitor-exit v5

    if-eqz v3, :cond_6

    invoke-interface {v2, v14, v15}, Lz2/h;->u(J)V

    iget-object v0, v0, Lt2/w;->g:Lt2/y;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Lt2/y;->e(I)V

    goto :goto_8

    :cond_6
    if-eqz v7, :cond_7

    invoke-interface {v2, v14, v15}, Lz2/h;->u(J)V

    goto :goto_8

    :cond_7
    iget-object v3, v0, Lt2/w;->d:Lz2/f;

    invoke-interface {v2, v3, v14, v15}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v5, v3, v5

    if-eqz v5, :cond_b

    sub-long/2addr v14, v3

    iget-object v3, v0, Lt2/w;->g:Lt2/y;

    monitor-enter v3

    :try_start_1
    iget-boolean v4, v0, Lt2/w;->f:Z

    if-eqz v4, :cond_8

    iget-object v4, v0, Lt2/w;->d:Lz2/f;

    iget-wide v5, v4, Lz2/f;->c:J

    invoke-virtual {v4, v5, v6}, Lz2/f;->u(J)V

    const-wide/16 v10, 0x0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_7

    :cond_8
    iget-object v4, v0, Lt2/w;->e:Lz2/f;

    iget-wide v5, v4, Lz2/f;->c:J

    const-wide/16 v10, 0x0

    cmp-long v5, v5, v10

    if-nez v5, :cond_9

    const/4 v5, 0x1

    goto :goto_5

    :cond_9
    const/4 v5, 0x0

    :goto_5
    iget-object v6, v0, Lt2/w;->d:Lz2/f;

    invoke-virtual {v4, v6}, Lz2/f;->K(Lz2/v;)J

    if-eqz v5, :cond_a

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_a
    :goto_6
    monitor-exit v3

    move-object/from16 v4, p2

    const/4 v3, 0x1

    goto :goto_3

    :goto_7
    monitor-exit v3

    throw v0

    :cond_b
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v5

    throw v0

    :cond_c
    move-object/from16 p2, v4

    invoke-virtual {v0, v12, v13}, Lt2/w;->a(J)V

    :goto_8
    if-eqz v8, :cond_d

    sget-object v0, Ln2/b;->b:Lm2/j;

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lt2/y;->i(Lm2/j;Z)V

    :cond_d
    :goto_9
    iget-object v0, v1, Lt2/u;->b:Lz2/h;

    int-to-long v2, v9

    invoke-interface {v0, v2, v3}, Lz2/h;->u(J)V

    return-void

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o(IIII)Ljava/util/List;
    .locals 5

    const/16 v0, 0x20

    const/16 v1, 0x40

    const/16 v2, 0x80

    iget-object v3, p0, Lt2/u;->d:Lt2/t;

    iput p1, v3, Lt2/t;->f:I

    iput p1, v3, Lt2/t;->c:I

    iput p2, v3, Lt2/t;->g:I

    iput p3, v3, Lt2/t;->d:I

    iput p4, v3, Lt2/t;->e:I

    :cond_0
    :goto_0
    iget-object p1, p0, Lt2/u;->e:Lt2/c;

    iget-object p2, p1, Lt2/c;->c:Lz2/p;

    invoke-virtual {p2}, Lz2/p;->v()Z

    move-result p3

    iget-object p4, p1, Lt2/c;->b:Ljava/util/ArrayList;

    if-nez p3, :cond_c

    invoke-virtual {p2}, Lz2/p;->E()B

    move-result p2

    sget-object p3, Ln2/b;->a:[B

    and-int/lit16 p3, p2, 0xff

    if-eq p3, v2, :cond_b

    and-int/lit16 v3, p2, 0x80

    if-ne v3, v2, :cond_3

    const/16 p2, 0x7f

    invoke-virtual {p1, p3, p2}, Lt2/c;->e(II)I

    move-result p2

    add-int/lit8 p3, p2, -0x1

    if-ltz p3, :cond_1

    sget-object v3, Lt2/e;->a:[Lt2/b;

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    if-gt p3, v4, :cond_1

    aget-object p1, v3, p3

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v3, Lt2/e;->a:[Lt2/b;

    array-length v3, v3

    sub-int/2addr p3, v3

    iget v3, p1, Lt2/c;->e:I

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, p3

    if-ltz v3, :cond_2

    iget-object p1, p1, Lt2/c;->d:[Lt2/b;

    array-length p3, p1

    if-ge v3, p3, :cond_2

    aget-object p1, p1, v3

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Header index too large "

    invoke-static {p3, p2}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-ne p3, v1, :cond_4

    sget-object p2, Lt2/e;->a:[Lt2/b;

    invoke-virtual {p1}, Lt2/c;->d()Lz2/i;

    move-result-object p2

    invoke-static {p2}, Lt2/e;->a(Lz2/i;)V

    invoke-virtual {p1}, Lt2/c;->d()Lz2/i;

    move-result-object p3

    new-instance p4, Lt2/b;

    invoke-direct {p4, p2, p3}, Lt2/b;-><init>(Lz2/i;Lz2/i;)V

    invoke-virtual {p1, p4}, Lt2/c;->c(Lt2/b;)V

    goto :goto_0

    :cond_4
    and-int/lit8 v3, p2, 0x40

    if-ne v3, v1, :cond_5

    const/16 p2, 0x3f

    invoke-virtual {p1, p3, p2}, Lt2/c;->e(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lt2/c;->b(I)Lz2/i;

    move-result-object p2

    invoke-virtual {p1}, Lt2/c;->d()Lz2/i;

    move-result-object p3

    new-instance p4, Lt2/b;

    invoke-direct {p4, p2, p3}, Lt2/b;-><init>(Lz2/i;Lz2/i;)V

    invoke-virtual {p1, p4}, Lt2/c;->c(Lt2/b;)V

    goto/16 :goto_0

    :cond_5
    and-int/2addr p2, v0

    if-ne p2, v0, :cond_8

    const/16 p2, 0x1f

    invoke-virtual {p1, p3, p2}, Lt2/c;->e(II)I

    move-result p2

    iput p2, p1, Lt2/c;->a:I

    if-ltz p2, :cond_7

    const/16 p3, 0x1000

    if-gt p2, p3, :cond_7

    iget p3, p1, Lt2/c;->g:I

    if-ge p2, p3, :cond_0

    if-nez p2, :cond_6

    iget-object p2, p1, Lt2/c;->d:[Lt2/b;

    const/4 p3, 0x0

    invoke-static {p2, p3}, LL1/j;->U([Ljava/lang/Object;Ld1/f;)V

    iget-object p2, p1, Lt2/c;->d:[Lt2/b;

    array-length p2, p2

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lt2/c;->e:I

    const/4 p2, 0x0

    iput p2, p1, Lt2/c;->f:I

    iput p2, p1, Lt2/c;->g:I

    goto/16 :goto_0

    :cond_6
    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, Lt2/c;->a(I)I

    goto/16 :goto_0

    :cond_7
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Invalid dynamic table size update "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p1, p1, Lt2/c;->a:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    const/16 p2, 0x10

    if-eq p3, p2, :cond_a

    if-nez p3, :cond_9

    goto :goto_1

    :cond_9
    const/16 p2, 0xf

    invoke-virtual {p1, p3, p2}, Lt2/c;->e(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lt2/c;->b(I)Lz2/i;

    move-result-object p2

    invoke-virtual {p1}, Lt2/c;->d()Lz2/i;

    move-result-object p1

    new-instance p3, Lt2/b;

    invoke-direct {p3, p2, p1}, Lt2/b;-><init>(Lz2/i;Lz2/i;)V

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    :goto_1
    sget-object p2, Lt2/e;->a:[Lt2/b;

    invoke-virtual {p1}, Lt2/c;->d()Lz2/i;

    move-result-object p2

    invoke-static {p2}, Lt2/e;->a(Lz2/i;)V

    invoke-virtual {p1}, Lt2/c;->d()Lz2/i;

    move-result-object p1

    new-instance p3, Lt2/b;

    invoke-direct {p3, p2, p1}, Lt2/b;-><init>(Lz2/i;Lz2/i;)V

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "index == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {p4}, LL1/k;->Y(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    return-object p1
.end method
