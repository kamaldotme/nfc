.class public final Lz2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/h;


# instance fields
.field public final b:Lz2/v;

.field public final c:Lz2/f;

.field public d:Z


# direct methods
.method public constructor <init>(Lz2/v;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/p;->b:Lz2/v;

    new-instance p1, Lz2/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/p;->c:Lz2/f;

    return-void
.end method


# virtual methods
.method public final C()J
    .locals 6

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lz2/p;->n(J)V

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v1, v0, 0x1

    int-to-long v2, v1

    invoke-virtual {p0, v2, v3}, Lz2/p;->i(J)Z

    move-result v2

    iget-object v3, p0, Lz2/p;->c:Lz2/f;

    if-eqz v2, :cond_5

    int-to-long v4, v0

    invoke-virtual {v3, v4, v5}, Lz2/f;->b(J)B

    move-result v2

    const/16 v4, 0x30

    if-lt v2, v4, :cond_0

    const/16 v4, 0x39

    if-le v2, v4, :cond_2

    :cond_0
    const/16 v4, 0x61

    if-lt v2, v4, :cond_1

    const/16 v4, 0x66

    if-le v2, v4, :cond_2

    :cond_1
    const/16 v4, 0x41

    if-lt v2, v4, :cond_3

    const/16 v4, 0x46

    if-le v2, v4, :cond_2

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/NumberFormatException;

    const/16 v1, 0x10

    invoke-static {v1}, Lv0/f;->n(I)V

    invoke-static {v1}, Lv0/f;->n(I)V

    invoke-static {v2, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(this, checkRadix(radix))"

    invoke-static {v1, v2}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Expected leading [0-9a-fA-F] character but was 0x"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    invoke-virtual {v3}, Lz2/f;->C()J

    move-result-wide v0

    return-wide v0
.end method

.method public final E()B
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lz2/p;->n(J)V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->E()B

    move-result v0

    return v0
.end method

.method public final H()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lz2/p;->n(J)V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->H()I

    move-result v0

    return v0
.end method

.method public final a(BJJ)J
    .locals 9

    iget-boolean p2, p0, Lz2/p;->d:Z

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_4

    const-wide/16 p2, 0x0

    cmp-long v0, p2, p4

    if-gtz v0, :cond_3

    :goto_0
    cmp-long v0, p2, p4

    const-wide/16 v7, -0x1

    if-gez v0, :cond_2

    iget-object v1, p0, Lz2/p;->c:Lz2/f;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lz2/f;->i(BJJ)J

    move-result-wide v0

    cmp-long v2, v0, v7

    if-eqz v2, :cond_0

    move-wide v7, v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    iget-wide v1, v0, Lz2/f;->c:J

    cmp-long v3, v1, p4

    if-gez v3, :cond_2

    iget-object v3, p0, Lz2/p;->b:Lz2/v;

    const-wide/16 v4, 0x2000

    invoke-interface {v3, v0, v4, v5}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v3

    cmp-long v0, v3, v7

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    :goto_1
    return-wide v7

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "fromIndex=0 toIndex="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()I
    .locals 3

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lz2/p;->n(J)V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->H()I

    move-result v0

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    ushr-int/lit8 v1, v1, 0x18

    const/high16 v2, 0xff0000

    and-int/2addr v2, v0

    ushr-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    const v2, 0xff00

    and-int/2addr v2, v0

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public final c()Lz2/x;
    .locals 1

    iget-object v0, p0, Lz2/p;->b:Lz2/v;

    invoke-interface {v0}, Lz2/v;->c()Lz2/x;

    move-result-object v0

    return-object v0
.end method

.method public final close()V
    .locals 3

    iget-boolean v0, p0, Lz2/p;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/p;->d:Z

    iget-object v0, p0, Lz2/p;->b:Lz2/v;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    iget-wide v1, v0, Lz2/f;->c:J

    invoke-virtual {v0, v1, v2}, Lz2/f;->u(J)V

    :cond_0
    return-void
.end method

.method public final i(J)Z
    .locals 6

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    iget-boolean v0, p0, Lz2/p;->d:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    :cond_0
    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    iget-wide v2, v0, Lz2/f;->c:J

    cmp-long v2, v2, p1

    if-gez v2, :cond_1

    iget-object v2, p0, Lz2/p;->b:Lz2/v;

    const-wide/16 v3, 0x2000

    invoke-interface {v2, v0, v3, v4}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v1, 0x0

    :cond_1
    return v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byteCount < 0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lz2/p;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-virtual {p0, v0, v1}, Lz2/p;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final n(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz2/p;->i(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public final p(J)Lz2/i;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lz2/p;->n(J)V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    invoke-virtual {v0, p1, p2}, Lz2/f;->p(J)Lz2/i;

    move-result-object p1

    return-object p1
.end method

.method public final r(J)Ljava/lang/String;
    .locals 21

    move-object/from16 v6, p0

    move-wide/from16 v7, p1

    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-ltz v0, :cond_3

    const-wide v9, 0x7fffffffffffffffL

    cmp-long v0, v7, v9

    const-wide/16 v11, 0x1

    if-nez v0, :cond_0

    move-wide v13, v9

    goto :goto_0

    :cond_0
    add-long v0, v7, v11

    move-wide v13, v0

    :goto_0
    const/16 v1, 0xa

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide v4, v13

    invoke-virtual/range {v0 .. v5}, Lz2/p;->a(BJJ)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    iget-object v3, v6, Lz2/p;->c:Lz2/f;

    if-eqz v2, :cond_1

    invoke-static {v3, v0, v1}, LA2/a;->a(Lz2/f;J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    cmp-long v0, v13, v9

    if-gez v0, :cond_2

    invoke-virtual {v6, v13, v14}, Lz2/p;->i(J)Z

    move-result v0

    if-eqz v0, :cond_2

    sub-long v0, v13, v11

    invoke-virtual {v3, v0, v1}, Lz2/f;->b(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    add-long/2addr v11, v13

    invoke-virtual {v6, v11, v12}, Lz2/p;->i(J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v3, v13, v14}, Lz2/f;->b(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    invoke-static {v3, v13, v14}, LA2/a;->a(Lz2/f;J)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_2
    new-instance v0, Lz2/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-wide v1, v3, Lz2/f;->c:J

    const/16 v4, 0x20

    int-to-long v4, v4

    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v19

    const-wide/16 v17, 0x0

    move-object v15, v3

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v20}, Lz2/f;->a(Lz2/f;JJ)V

    new-instance v1, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\\n not found: limit="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, v3, Lz2/f;->c:J

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " content="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v0, Lz2/f;->c:J

    invoke-virtual {v0, v3, v4}, Lz2/f;->p(J)Lz2/i;

    move-result-object v0

    invoke-virtual {v0}, Lz2/i;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2026

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "limit < 0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    iget-wide v1, v0, Lz2/f;->c:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lz2/p;->b:Lz2/v;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lz2/f;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public final t()Lz2/f;
    .locals 1

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lz2/p;->b:Lz2/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(J)V
    .locals 5

    iget-boolean v0, p0, Lz2/p;->d:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    iget-object v2, p0, Lz2/p;->c:Lz2/f;

    iget-wide v3, v2, Lz2/f;->c:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lz2/p;->b:Lz2/v;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    :goto_1
    iget-wide v0, v2, Lz2/f;->c:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lz2/f;->u(J)V

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v()Z
    .locals 6

    iget-boolean v0, p0, Lz2/p;->d:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->v()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lz2/p;->b:Lz2/v;

    const-wide/16 v3, 0x2000

    invoke-interface {v2, v0, v3, v4}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final y()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lz2/p;->n(J)V

    iget-object v0, p0, Lz2/p;->c:Lz2/f;

    invoke-virtual {v0}, Lz2/f;->y()S

    move-result v0

    return v0
.end method

.method public final z(Lz2/f;J)J
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    iget-boolean v2, p0, Lz2/p;->d:Z

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    iget-object v2, p0, Lz2/p;->c:Lz2/f;

    iget-wide v3, v2, Lz2/f;->c:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz2/p;->b:Lz2/v;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lz2/v;->z(Lz2/f;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, v2, Lz2/f;->c:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v2, p1, p2, p3}, Lz2/f;->z(Lz2/f;J)J

    move-result-wide v3

    :goto_0
    return-wide v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
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
