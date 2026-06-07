.class public final Ls2/d;
.super Ls2/a;
.source "SourceFile"


# instance fields
.field public e:J

.field public final synthetic f:Ls2/g;


# direct methods
.method public constructor <init>(Ls2/g;J)V
    .locals 2

    iput-object p1, p0, Ls2/d;->f:Ls2/g;

    invoke-direct {p0, p1}, Ls2/a;-><init>(Ls2/g;)V

    iput-wide p2, p0, Ls2/d;->e:J

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ls2/a;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-boolean v0, p0, Ls2/a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Ls2/d;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0}, Ln2/b;->g(Lz2/v;Ljava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ls2/d;->f:Ls2/g;

    iget-object v0, v0, Ls2/g;->e:Ljava/lang/Object;

    check-cast v0, Lq2/l;

    invoke-virtual {v0}, Lq2/l;->k()V

    invoke-virtual {p0}, Ls2/a;->a()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ls2/a;->c:Z

    return-void
.end method

.method public final z(Lz2/f;J)J
    .locals 7

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    iget-boolean v2, p0, Ls2/a;->c:Z

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_3

    iget-wide v2, p0, Ls2/d;->e:J

    cmp-long v4, v2, v0

    const-wide/16 v5, -0x1

    if-nez v4, :cond_0

    return-wide v5

    :cond_0
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ls2/a;->z(Lz2/f;J)J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-eqz p3, :cond_2

    iget-wide v2, p0, Ls2/d;->e:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Ls2/d;->e:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_1

    invoke-virtual {p0}, Ls2/a;->a()V

    :cond_1
    return-wide p1

    :cond_2
    iget-object p1, p0, Ls2/d;->f:Ls2/g;

    iget-object p1, p1, Ls2/g;->e:Ljava/lang/Object;

    check-cast p1, Lq2/l;

    invoke-virtual {p1}, Lq2/l;->k()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ls2/a;->a()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "byteCount < 0: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
