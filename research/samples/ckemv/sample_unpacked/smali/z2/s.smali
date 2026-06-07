.class public final Lz2/s;
.super Lz2/i;
.source "SourceFile"


# instance fields
.field public final transient f:[[B

.field public final transient g:[I


# direct methods
.method public constructor <init>([[B[I)V
    .locals 1

    sget-object v0, Lz2/i;->e:Lz2/i;

    iget-object v0, v0, Lz2/i;->b:[B

    invoke-direct {p0, v0}, Lz2/i;-><init>([B)V

    iput-object p1, p0, Lz2/s;->f:[[B

    iput-object p2, p0, Lz2/s;->g:[I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final b(Ljava/lang/String;)Lz2/i;
    .locals 7

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iget-object v0, p0, Lz2/s;->f:[[B

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    add-int v4, v1, v2

    iget-object v5, p0, Lz2/s;->g:[I

    aget v4, v5, v4

    aget v5, v5, v2

    aget-object v6, v0, v2

    sub-int v3, v5, v3

    invoke-virtual {p1, v6, v4, v3}, Ljava/security/MessageDigest;->update([BII)V

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    new-instance v0, Lz2/i;

    invoke-static {p1}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lz2/i;-><init>([B)V

    return-object v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Lz2/s;->f:[[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lz2/s;->g:[I

    aget v0, v1, v0

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 2

    new-instance v0, Lz2/i;

    invoke-virtual {p0}, Lz2/s;->l()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lz2/i;-><init>([B)V

    invoke-virtual {v0}, Lz2/i;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()[B
    .locals 1

    invoke-virtual {p0}, Lz2/s;->l()[B

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lz2/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lz2/i;

    invoke-virtual {p1}, Lz2/i;->c()I

    move-result v1

    invoke-virtual {p0}, Lz2/s;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-virtual {p0}, Lz2/s;->c()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lz2/s;->h(Lz2/i;I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0
.end method

.method public final f(I)B
    .locals 9

    iget-object v0, p0, Lz2/s;->f:[[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lz2/s;->g:[I

    aget v1, v2, v1

    int-to-long v3, v1

    int-to-long v5, p1

    const-wide/16 v7, 0x1

    invoke-static/range {v3 .. v8}, Lv0/f;->m(JJJ)V

    invoke-static {p0, p1}, LA2/b;->b(Lz2/s;I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v1, -0x1

    aget v3, v2, v3

    :goto_0
    array-length v4, v0

    add-int/2addr v4, v1

    aget v2, v2, v4

    aget-object v0, v0, v1

    sub-int/2addr p1, v3

    add-int/2addr p1, v2

    aget-byte p1, v0, p1

    return p1
.end method

.method public final g(I[BII)Z
    .locals 7

    const-string v0, "other"

    invoke-static {p2, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    invoke-virtual {p0}, Lz2/s;->c()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p1, v1, :cond_4

    if-ltz p3, :cond_4

    array-length v1, p2

    sub-int/2addr v1, p4

    if-le p3, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p4, p1

    invoke-static {p0, p1}, LA2/b;->b(Lz2/s;I)I

    move-result v1

    :goto_0
    if-ge p1, p4, :cond_3

    iget-object v2, p0, Lz2/s;->g:[I

    if-nez v1, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v1, -0x1

    aget v3, v2, v3

    :goto_1
    aget v4, v2, v1

    sub-int/2addr v4, v3

    iget-object v5, p0, Lz2/s;->f:[[B

    array-length v6, v5

    add-int/2addr v6, v1

    aget v2, v2, v6

    add-int/2addr v4, v3

    invoke-static {p4, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int/2addr v4, p1

    sub-int v3, p1, v3

    add-int/2addr v3, v2

    aget-object v2, v5, v1

    invoke-static {v3, p3, v4, v2, p2}, Lv0/f;->j(III[B[B)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr p3, v4

    add-int/2addr p1, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :cond_4
    :goto_2
    return v0
.end method

.method public final h(Lz2/i;I)Z
    .locals 9

    const-string v0, "other"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lz2/s;->c()I

    move-result v0

    sub-int/2addr v0, p2

    const/4 v1, 0x0

    if-gez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p0, v1}, LA2/b;->b(Lz2/s;I)I

    move-result v0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, p2, :cond_3

    iget-object v4, p0, Lz2/s;->g:[I

    if-nez v0, :cond_1

    move v5, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v0, -0x1

    aget v5, v4, v5

    :goto_1
    aget v6, v4, v0

    sub-int/2addr v6, v5

    iget-object v7, p0, Lz2/s;->f:[[B

    array-length v8, v7

    add-int/2addr v8, v0

    aget v4, v4, v8

    add-int/2addr v6, v5

    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v6, v2

    sub-int v5, v2, v5

    add-int/2addr v5, v4

    aget-object v4, v7, v0

    invoke-virtual {p1, v3, v4, v5, v6}, Lz2/i;->g(I[BII)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v3, v6

    add-int/2addr v2, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 9

    iget v0, p0, Lz2/i;->c:I

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lz2/s;->f:[[B

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    :goto_0
    if-ge v2, v1, :cond_2

    add-int v5, v1, v2

    iget-object v6, p0, Lz2/s;->g:[I

    aget v5, v6, v5

    aget v6, v6, v2

    aget-object v7, v0, v2

    sub-int v4, v6, v4

    add-int/2addr v4, v5

    :goto_1
    if-ge v5, v4, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    aget-byte v8, v7, v5

    add-int/2addr v3, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v4, v6

    goto :goto_0

    :cond_2
    iput v3, p0, Lz2/i;->c:I

    move v0, v3

    :goto_2
    return v0
.end method

.method public final i()Lz2/i;
    .locals 2

    new-instance v0, Lz2/i;

    invoke-virtual {p0}, Lz2/s;->l()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lz2/i;-><init>([B)V

    invoke-virtual {v0}, Lz2/i;->i()Lz2/i;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lz2/f;I)V
    .locals 9

    const-string v0, "buffer"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LA2/b;->b(Lz2/s;I)I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, p2, :cond_2

    iget-object v3, p0, Lz2/s;->g:[I

    if-nez v1, :cond_0

    move v4, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v1, -0x1

    aget v4, v3, v4

    :goto_1
    aget v5, v3, v1

    sub-int/2addr v5, v4

    iget-object v6, p0, Lz2/s;->f:[[B

    array-length v7, v6

    add-int/2addr v7, v1

    aget v3, v3, v7

    add-int/2addr v5, v4

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v2

    sub-int v4, v2, v4

    add-int/2addr v4, v3

    aget-object v3, v6, v1

    new-instance v6, Lz2/q;

    add-int v7, v4, v5

    const/4 v8, 0x1

    invoke-direct {v6, v3, v4, v7, v8}, Lz2/q;-><init>([BIIZ)V

    iget-object v3, p1, Lz2/f;->b:Lz2/q;

    if-nez v3, :cond_1

    iput-object v6, v6, Lz2/q;->g:Lz2/q;

    iput-object v6, v6, Lz2/q;->f:Lz2/q;

    iput-object v6, p1, Lz2/f;->b:Lz2/q;

    goto :goto_2

    :cond_1
    iget-object v3, v3, Lz2/q;->g:Lz2/q;

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    invoke-virtual {v3, v6}, Lz2/q;->b(Lz2/q;)V

    :goto_2
    add-int/2addr v2, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-wide v0, p1, Lz2/f;->c:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p1, Lz2/f;->c:J

    return-void
.end method

.method public final l()[B
    .locals 10

    invoke-virtual {p0}, Lz2/s;->c()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lz2/s;->f:[[B

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v3, v2, :cond_0

    add-int v6, v2, v3

    iget-object v7, p0, Lz2/s;->g:[I

    aget v6, v7, v6

    aget v7, v7, v3

    aget-object v8, v1, v3

    sub-int v4, v7, v4

    add-int v9, v6, v4

    invoke-static {v5, v6, v9, v8, v0}, LL1/j;->R(III[B[B)V

    add-int/2addr v5, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Lz2/i;

    invoke-virtual {p0}, Lz2/s;->l()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lz2/i;-><init>([B)V

    invoke-virtual {v0}, Lz2/i;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
