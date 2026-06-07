.class public final Lq2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/t;


# instance fields
.field public final b:Lz2/t;

.field public final c:J

.field public d:Z

.field public e:J

.field public f:Z

.field public final synthetic g:Lq2/e;


# direct methods
.method public constructor <init>(Lq2/e;Lz2/t;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "delegate"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq2/c;->g:Lq2/e;

    iput-object p2, p0, Lq2/c;->b:Lz2/t;

    iput-wide p3, p0, Lq2/c;->c:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lq2/c;->b:Lz2/t;

    invoke-interface {v0}, Lz2/t;->close()V

    return-void
.end method

.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3

    iget-boolean v0, p0, Lq2/c;->d:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lq2/c;->d:Z

    const/4 v1, 0x0

    iget-object v2, p0, Lq2/c;->g:Lq2/e;

    invoke-virtual {v2, v1, v0, p1}, Lq2/e;->a(ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lq2/c;->b:Lz2/t;

    invoke-interface {v0}, Lz2/t;->c()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lq2/c;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lq2/c;->f:Z

    const-wide/16 v0, -0x1

    iget-wide v2, p0, Lq2/c;->c:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lq2/c;->e:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lq2/c;->a()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lq2/c;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lq2/c;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final flush()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lq2/c;->i()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lq2/c;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method

.method public final i()V
    .locals 1

    iget-object v0, p0, Lq2/c;->b:Lz2/t;

    invoke-interface {v0}, Lz2/t;->flush()V

    return-void
.end method

.method public final m(Lz2/f;J)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lq2/c;->f:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lq2/c;->c:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-wide v2, p0, Lq2/c;->e:J

    add-long/2addr v2, p2

    cmp-long v2, v2, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "expected "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " bytes but received "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lq2/c;->e:J

    add-long/2addr v0, p2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lq2/c;->b:Lz2/t;

    invoke-interface {v0, p1, p2, p3}, Lz2/t;->m(Lz2/f;J)V

    iget-wide v0, p0, Lq2/c;->e:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lq2/c;->e:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lq2/c;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Lq2/c;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq2/c;->b:Lz2/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
