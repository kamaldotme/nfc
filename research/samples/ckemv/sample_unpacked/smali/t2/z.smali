.class public final Lt2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final h:Ljava/util/logging/Logger;


# instance fields
.field public final b:Lz2/g;

.field public final c:Z

.field public final d:Lz2/f;

.field public e:I

.field public f:Z

.field public final g:Lt2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lt2/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lt2/z;->h:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lz2/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/z;->b:Lz2/g;

    iput-boolean p2, p0, Lt2/z;->c:Z

    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/z;->d:Lz2/f;

    const/16 p2, 0x4000

    iput p2, p0, Lt2/z;->e:I

    new-instance p2, Lt2/d;

    invoke-direct {p2, p1}, Lt2/d;-><init>(Lz2/f;)V

    iput-object p2, p0, Lt2/z;->g:Lt2/d;

    return-void
.end method


# virtual methods
.method public final declared-synchronized A(IIZ)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lt2/z;->f:Z

    if-nez v0, :cond_0

    const/16 v0, 0x8

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, p3}, Lt2/z;->i(IIII)V

    iget-object p3, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p3, p1}, Lz2/g;->e(I)Lz2/g;

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1, p2}, Lz2/g;->e(I)Lz2/g;

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1}, Lz2/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized D(II)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {v0, p2}, LX/d;->o(Ljava/lang/String;I)V

    iget-boolean v0, p0, Lt2/z;->f:Z

    if-nez v0, :cond_1

    invoke-static {p2}, Lq/h;->a(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x3

    invoke-virtual {p0, p1, v1, v2, v0}, Lt2/z;->i(IIII)V

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-static {p2}, Lq/h;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, Lz2/g;->e(I)Lz2/g;

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1}, Lz2/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized G(IJ)V
    .locals 3

    const-string v0, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lt2/z;->f:Z

    if-nez v1, :cond_1

    const-wide/16 v1, 0x0

    cmp-long v1, p2, v1

    if-eqz v1, :cond_0

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, p2, v1

    if-gtz v1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/16 v2, 0x8

    invoke-virtual {p0, p1, v1, v2, v0}, Lt2/z;->i(IIII)V

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    long-to-int p2, p2

    invoke-interface {p1, p2}, Lz2/g;->e(I)Lz2/g;

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1}, Lz2/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final I(IJ)V
    .locals 5

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget v2, p0, Lt2/z;->e:I

    int-to-long v2, v2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long/2addr p2, v2

    long-to-int v4, v2

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x9

    invoke-virtual {p0, p1, v4, v1, v0}, Lt2/z;->i(IIII)V

    iget-object v0, p0, Lt2/z;->b:Lz2/g;

    iget-object v1, p0, Lt2/z;->d:Lz2/f;

    invoke-interface {v0, v1, v2, v3}, Lz2/t;->m(Lz2/f;J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final declared-synchronized a(Lt2/C;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "peerSettings"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lt2/z;->f:Z

    if-nez v0, :cond_7

    iget v0, p0, Lt2/z;->e:I

    iget v1, p1, Lt2/C;->a:I

    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_0

    iget-object v0, p1, Lt2/C;->b:[I

    const/4 v2, 0x5

    aget v0, v0, v2

    :cond_0
    iput v0, p0, Lt2/z;->e:I

    and-int/lit8 v0, v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p1, Lt2/C;->b:[I

    aget v0, v0, v3

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v4, 0x0

    if-eq v0, v2, :cond_6

    iget-object v0, p0, Lt2/z;->g:Lt2/d;

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    iget-object p1, p1, Lt2/C;->b:[I

    aget v2, p1, v3

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x4000

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v1, v0, Lt2/d;->e:I

    if-ne v1, p1, :cond_3

    goto :goto_1

    :cond_3
    if-ge p1, v1, :cond_4

    iget v1, v0, Lt2/d;->c:I

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lt2/d;->c:I

    :cond_4
    iput-boolean v3, v0, Lt2/d;->d:Z

    iput p1, v0, Lt2/d;->e:I

    iget v1, v0, Lt2/d;->i:I

    if-ge p1, v1, :cond_6

    if-nez p1, :cond_5

    iget-object p1, v0, Lt2/d;->f:[Lt2/b;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LL1/j;->U([Ljava/lang/Object;Ld1/f;)V

    iget-object p1, v0, Lt2/d;->f:[Lt2/b;

    array-length p1, p1

    sub-int/2addr p1, v3

    iput p1, v0, Lt2/d;->g:I

    iput v4, v0, Lt2/d;->h:I

    iput v4, v0, Lt2/d;->i:I

    goto :goto_1

    :cond_5
    sub-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lt2/d;->a(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_6
    :goto_1
    const/4 p1, 0x4

    invoke-virtual {p0, v4, v4, p1, v3}, Lt2/z;->i(IIII)V

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1}, Lz2/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b(ZILz2/f;I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lt2/z;->f:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p4, v0, p1}, Lt2/z;->i(IIII)V

    if-lez p4, :cond_0

    invoke-static {p3}, LX1/g;->b(Ljava/lang/Object;)V

    int-to-long p1, p4

    iget-object p4, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p4, p3, p1, p2}, Lz2/t;->m(Lz2/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lt2/z;->f:Z

    iget-object v0, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {v0}, Lz2/t;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lt2/z;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {v0}, Lz2/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final i(IIII)V
    .locals 2

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v1, Lt2/z;->h:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, p4, v0}, Lt2/f;->a(IIIIZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lt2/z;->e:I

    if-gt p2, v0, :cond_2

    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    sget-object v0, Ln2/b;->a:[B

    iget-object v0, p0, Lt2/z;->b:Lz2/g;

    const-string v1, "<this>"

    invoke-static {v0, v1}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    ushr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v0, v1}, Lz2/g;->w(I)Lz2/g;

    ushr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v0, v1}, Lz2/g;->w(I)Lz2/g;

    and-int/lit16 p2, p2, 0xff

    invoke-interface {v0, p2}, Lz2/g;->w(I)Lz2/g;

    and-int/lit16 p2, p3, 0xff

    invoke-interface {v0, p2}, Lz2/g;->w(I)Lz2/g;

    and-int/lit16 p2, p4, 0xff

    invoke-interface {v0, p2}, Lz2/g;->w(I)Lz2/g;

    const p2, 0x7fffffff

    and-int/2addr p1, p2

    invoke-interface {v0, p1}, Lz2/g;->e(I)Lz2/g;

    return-void

    :cond_1
    const-string p2, "reserved bit set: "

    invoke-static {p2, p1}, LX/d;->f(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "FRAME_SIZE_ERROR length > "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Lt2/z;->e:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ": "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final declared-synchronized o(II[B)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {v0, p2}, LX/d;->o(Ljava/lang/String;I)V

    const-string v0, "debugData"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lt2/z;->f:Z

    if-nez v0, :cond_3

    invoke-static {p2}, Lq/h;->a(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    array-length v0, p3

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, Lt2/z;->i(IIII)V

    iget-object v0, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {v0, p1}, Lz2/g;->e(I)Lz2/g;

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-static {p2}, Lq/h;->a(I)I

    move-result p2

    invoke-interface {p1, p2}, Lz2/g;->e(I)Lz2/g;

    array-length p1, p3

    const/4 p2, 0x1

    if-nez p1, :cond_0

    move v2, p2

    :cond_0
    xor-int/lit8 p1, v2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1, p3}, Lz2/g;->d([B)Lz2/g;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lt2/z;->b:Lz2/g;

    invoke-interface {p1}, Lz2/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    const-string p1, "errorCode.httpCode == -1"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    throw p1
.end method
