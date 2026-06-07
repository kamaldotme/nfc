.class public final Lt2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/v;


# instance fields
.field public final b:Lz2/h;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Lz2/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/t;->b:Lz2/h;

    return-void
.end method


# virtual methods
.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lt2/t;->b:Lz2/h;

    invoke-interface {v0}, Lz2/v;->c()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final z(Lz2/f;J)J
    .locals 8

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget v0, p0, Lt2/t;->f:I

    const-wide/16 v1, -0x1

    iget-object v3, p0, Lt2/t;->b:Lz2/h;

    if-nez v0, :cond_4

    iget v0, p0, Lt2/t;->g:I

    int-to-long v4, v0

    invoke-interface {v3, v4, v5}, Lz2/h;->u(J)V

    const/4 v0, 0x0

    iput v0, p0, Lt2/t;->g:I

    iget v0, p0, Lt2/t;->d:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    iget v0, p0, Lt2/t;->e:I

    invoke-static {v3}, Ln2/b;->r(Lz2/h;)I

    move-result v1

    iput v1, p0, Lt2/t;->f:I

    iput v1, p0, Lt2/t;->c:I

    invoke-interface {v3}, Lz2/h;->E()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v3}, Lz2/h;->E()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    iput v2, p0, Lt2/t;->d:I

    sget-object v2, Lt2/u;->f:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lt2/f;->a:Lz2/i;

    iget v4, p0, Lt2/t;->e:I

    iget v5, p0, Lt2/t;->c:I

    iget v6, p0, Lt2/t;->d:I

    const/4 v7, 0x1

    invoke-static {v4, v5, v1, v6, v7}, Lt2/f;->a(IIIIZ)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v3}, Lz2/h;->H()I

    move-result v2

    const v3, 0x7fffffff

    and-int/2addr v2, v3

    iput v2, p0, Lt2/t;->e:I

    const/16 v3, 0x9

    if-ne v1, v3, :cond_3

    if-ne v2, v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TYPE_CONTINUATION streamId changed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " != TYPE_CONTINUATION"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_5

    return-wide v1

    :cond_5
    iget p3, p0, Lt2/t;->f:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Lt2/t;->f:I

    return-wide p1
.end method
