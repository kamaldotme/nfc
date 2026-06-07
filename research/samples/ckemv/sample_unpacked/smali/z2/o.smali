.class public final Lz2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/g;


# instance fields
.field public final b:Lz2/t;

.field public final c:Lz2/f;

.field public d:Z


# direct methods
.method public constructor <init>(Lz2/t;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/o;->b:Lz2/t;

    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/o;->c:Lz2/f;

    return-void
.end method


# virtual methods
.method public final B(I)Lz2/g;
    .locals 1

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->O(I)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final F(Lz2/i;)Lz2/g;
    .locals 1

    const-string v0, "byteString"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->J(Lz2/i;)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a()Lz2/g;
    .locals 8

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    iget-wide v1, v0, Lz2/f;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    move-wide v1, v3

    goto :goto_0

    :cond_0
    iget-object v5, v0, Lz2/f;->b:Lz2/q;

    invoke-static {v5}, LX1/g;->b(Ljava/lang/Object;)V

    iget-object v5, v5, Lz2/q;->g:Lz2/q;

    invoke-static {v5}, LX1/g;->b(Ljava/lang/Object;)V

    iget v6, v5, Lz2/q;->c:I

    const/16 v7, 0x2000

    if-ge v6, v7, :cond_1

    iget-boolean v7, v5, Lz2/q;->e:Z

    if-eqz v7, :cond_1

    iget v5, v5, Lz2/q;->b:I

    sub-int/2addr v6, v5

    int-to-long v5, v6

    sub-long/2addr v1, v5

    :cond_1
    :goto_0
    cmp-long v3, v1, v3

    if-lez v3, :cond_2

    iget-object v3, p0, Lz2/o;->b:Lz2/t;

    invoke-interface {v3, v0, v1, v2}, Lz2/t;->m(Lz2/f;J)V

    :cond_2
    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(II[B)Lz2/g;
    .locals 1

    const-string v0, "source"

    invoke-static {p3, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1, p2, p3}, Lz2/f;->I(II[B)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lz2/o;->b:Lz2/t;

    invoke-interface {v0}, Lz2/t;->c()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 6

    iget-object v0, p0, Lz2/o;->b:Lz2/t;

    iget-boolean v1, p0, Lz2/o;->d:Z

    if-nez v1, :cond_3

    :try_start_0
    iget-object v1, p0, Lz2/o;->c:Lz2/f;

    iget-wide v2, v1, Lz2/f;->c:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_0

    invoke-interface {v0, v1, v2, v3}, Lz2/t;->m(Lz2/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    :goto_0
    :try_start_1
    invoke-interface {v0}, Lz2/t;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    if-nez v1, :cond_1

    move-object v1, v0

    :cond_1
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/o;->d:Z

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    throw v1

    :cond_3
    :goto_2
    return-void
.end method

.method public final d([B)Lz2/g;
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-virtual {v0, v1, v2, p1}, Lz2/f;->I(II[B)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(I)Lz2/g;
    .locals 1

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->N(I)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final flush()V
    .locals 5

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    iget-wide v1, v0, Lz2/f;->c:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    iget-object v4, p0, Lz2/o;->b:Lz2/t;

    if-lez v3, :cond_0

    invoke-interface {v4, v0, v1, v2}, Lz2/t;->m(Lz2/f;J)V

    :cond_0
    invoke-interface {v4}, Lz2/t;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final k(J)Lz2/g;
    .locals 1

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1, p2}, Lz2/f;->M(J)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m(Lz2/f;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1, p2, p3}, Lz2/f;->m(Lz2/f;J)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Ljava/lang/String;)Lz2/g;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->Q(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lz2/o;->b:Lz2/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w(I)Lz2/g;
    .locals 1

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->L(I)V

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz2/o;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/o;->c:Lz2/f;

    invoke-virtual {v0, p1}, Lz2/f;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lz2/o;->a()Lz2/g;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
