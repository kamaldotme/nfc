.class public final Lz2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/v;


# instance fields
.field public final b:Lz2/h;

.field public final c:Ljava/util/zip/Inflater;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Lz2/p;Ljava/util/zip/Inflater;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/l;->b:Lz2/h;

    iput-object p2, p0, Lz2/l;->c:Ljava/util/zip/Inflater;

    return-void
.end method


# virtual methods
.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lz2/l;->b:Lz2/h;

    invoke-interface {v0}, Lz2/v;->c()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lz2/l;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/l;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/l;->e:Z

    iget-object v0, p0, Lz2/l;->b:Lz2/h;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final z(Lz2/f;J)J
    .locals 10

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_b

    iget-boolean v3, p0, Lz2/l;->e:Z

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eqz v3, :cond_a

    iget-object v3, p0, Lz2/l;->b:Lz2/h;

    iget-object v5, p0, Lz2/l;->c:Ljava/util/zip/Inflater;

    if-nez v2, :cond_1

    :cond_0
    :goto_1
    move-wide v8, v0

    goto/16 :goto_4

    :cond_1
    :try_start_0
    invoke-virtual {p1, v4}, Lz2/f;->G(I)Lz2/q;

    move-result-object v2

    iget v4, v2, Lz2/q;->c:I

    rsub-int v4, v4, 0x2000

    int-to-long v6, v4

    invoke-static {p2, p3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v4, v6

    invoke-virtual {v5}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v3}, Lz2/h;->v()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v3}, Lz2/h;->t()Lz2/f;

    move-result-object v6

    iget-object v6, v6, Lz2/f;->b:Lz2/q;

    invoke-static {v6}, LX1/g;->b(Ljava/lang/Object;)V

    iget v7, v6, Lz2/q;->c:I

    iget v8, v6, Lz2/q;->b:I

    sub-int/2addr v7, v8

    iput v7, p0, Lz2/l;->d:I

    iget-object v6, v6, Lz2/q;->a:[B

    invoke-virtual {v5, v6, v8, v7}, Ljava/util/zip/Inflater;->setInput([BII)V

    :goto_2
    iget-object v6, v2, Lz2/q;->a:[B

    iget v7, v2, Lz2/q;->c:I

    invoke-virtual {v5, v6, v7, v4}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v4

    iget v6, p0, Lz2/l;->d:I

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v7

    sub-int/2addr v6, v7

    iget v7, p0, Lz2/l;->d:I

    sub-int/2addr v7, v6

    iput v7, p0, Lz2/l;->d:I

    int-to-long v6, v6

    invoke-interface {v3, v6, v7}, Lz2/h;->u(J)V

    :goto_3
    if-lez v4, :cond_5

    iget v6, v2, Lz2/q;->c:I

    add-int/2addr v6, v4

    iput v6, v2, Lz2/q;->c:I

    iget-wide v6, p1, Lz2/f;->c:J

    int-to-long v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p1, Lz2/f;->c:J

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_6

    :cond_5
    iget v4, v2, Lz2/q;->b:I

    iget v6, v2, Lz2/q;->c:I

    if-ne v4, v6, :cond_0

    invoke-virtual {v2}, Lz2/q;->a()Lz2/q;

    move-result-object v4

    iput-object v4, p1, Lz2/f;->b:Lz2/q;

    invoke-static {v2}, Lz2/r;->a(Lz2/q;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_4
    cmp-long v0, v8, v0

    if-lez v0, :cond_6

    return-wide v8

    :cond_6
    invoke-virtual {v5}, Ljava/util/zip/Inflater;->finished()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v5}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v3}, Lz2/h;->v()Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "source exhausted prematurely"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_5
    const-wide/16 p1, -0x1

    return-wide p1

    :goto_6
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
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
