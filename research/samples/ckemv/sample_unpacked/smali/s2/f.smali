.class public final Ls2/f;
.super Ls2/a;
.source "SourceFile"


# instance fields
.field public e:Z


# virtual methods
.method public final close()V
    .locals 1

    iget-boolean v0, p0, Ls2/a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ls2/f;->e:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ls2/a;->a()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ls2/a;->c:Z

    return-void
.end method

.method public final z(Lz2/f;J)J
    .locals 4

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_3

    iget-boolean v0, p0, Ls2/a;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ls2/f;->e:Z

    const-wide/16 v2, -0x1

    if-eqz v0, :cond_0

    return-wide v2

    :cond_0
    invoke-super {p0, p1, p2, p3}, Ls2/a;->z(Lz2/f;J)J

    move-result-wide p1

    cmp-long p3, p1, v2

    if-nez p3, :cond_1

    iput-boolean v1, p0, Ls2/f;->e:Z

    invoke-virtual {p0}, Ls2/a;->a()V

    return-wide v2

    :cond_1
    return-wide p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
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
