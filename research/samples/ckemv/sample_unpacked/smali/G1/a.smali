.class public final LG1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Cloneable;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-array v0, p1, [J

    iput-object v0, p0, LG1/a;->b:Ljava/lang/Cloneable;

    .line 7
    new-array v0, p1, [Z

    iput-object v0, p0, LG1/a;->c:Ljava/lang/Object;

    .line 8
    new-array p1, p1, [I

    iput-object p1, p0, LG1/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp1/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x15

    .line 2
    iget v1, p1, Lp1/b;->c:I

    if-lt v1, v0, :cond_0

    and-int/lit8 v0, v1, 0x3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    iput-object p1, p0, LG1/a;->b:Ljava/lang/Cloneable;

    return-void

    .line 4
    :cond_0
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object p1

    throw p1
.end method


# virtual methods
.method public a(III)I
    .locals 2

    iget-boolean v0, p0, LG1/a;->a:Z

    iget-object v1, p0, LG1/a;->b:Ljava/lang/Cloneable;

    check-cast v1, Lp1/b;

    if-eqz v0, :cond_0

    invoke-virtual {v1, p2, p1}, Lp1/b;->b(II)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1, p2}, Lp1/b;->b(II)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    shl-int/lit8 p1, p3, 0x1

    or-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    shl-int/lit8 p1, p3, 0x1

    return p1
.end method

.method public b()[I
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LG1/a;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, LG1/a;->b:Ljava/lang/Cloneable;

    check-cast v0, [J

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v3, v1, :cond_4

    aget-wide v5, v0, v3

    add-int/lit8 v7, v4, 0x1

    const-wide/16 v8, 0x0

    cmp-long v5, v5, v8

    const/4 v6, 0x1

    if-lez v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    iget-object v8, p0, LG1/a;->c:Ljava/lang/Object;

    check-cast v8, [Z

    aget-boolean v9, v8, v4

    if-eq v5, v9, :cond_3

    iget-object v9, p0, LG1/a;->d:Ljava/lang/Object;

    check-cast v9, [I

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x2

    :goto_2
    aput v6, v9, v4

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_3
    iget-object v6, p0, LG1/a;->d:Ljava/lang/Object;

    check-cast v6, [I

    aput v2, v6, v4

    :goto_3
    aput-boolean v5, v8, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_0

    :cond_4
    iput-boolean v2, p0, LG1/a;->a:Z

    iget-object v0, p0, LG1/a;->d:Ljava/lang/Object;

    check-cast v0, [I

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_4
    monitor-exit p0

    throw v0
.end method

.method public c()LG1/f;
    .locals 6

    iget-object v0, p0, LG1/a;->d:Ljava/lang/Object;

    check-cast v0, LG1/f;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/4 v3, 0x6

    const/16 v4, 0x8

    if-ge v1, v3, :cond_1

    invoke-virtual {p0, v1, v4, v2}, LG1/a;->a(III)I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    invoke-virtual {p0, v1, v4, v2}, LG1/a;->a(III)I

    move-result v2

    invoke-virtual {p0, v4, v4, v2}, LG1/a;->a(III)I

    move-result v2

    invoke-virtual {p0, v4, v1, v2}, LG1/a;->a(III)I

    move-result v1

    const/4 v2, 0x5

    :goto_1
    if-ltz v2, :cond_2

    invoke-virtual {p0, v4, v2, v1}, LG1/a;->a(III)I

    move-result v1

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_2
    iget-object v2, p0, LG1/a;->b:Ljava/lang/Cloneable;

    check-cast v2, Lp1/b;

    iget v2, v2, Lp1/b;->c:I

    add-int/lit8 v3, v2, -0x7

    add-int/lit8 v5, v2, -0x1

    :goto_2
    if-lt v5, v3, :cond_3

    invoke-virtual {p0, v4, v5, v0}, LG1/a;->a(III)I

    move-result v0

    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v2, -0x8

    :goto_3
    if-ge v3, v2, :cond_4

    invoke-virtual {p0, v3, v4, v0}, LG1/a;->a(III)I

    move-result v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-static {v1, v0}, LG1/f;->a(II)LG1/f;

    move-result-object v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    xor-int/lit16 v1, v1, 0x5412

    xor-int/lit16 v0, v0, 0x5412

    invoke-static {v1, v0}, LG1/f;->a(II)LG1/f;

    move-result-object v2

    :goto_4
    iput-object v2, p0, LG1/a;->d:Ljava/lang/Object;

    if-eqz v2, :cond_6

    return-object v2

    :cond_6
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v0

    throw v0
.end method

.method public d()LG1/i;
    .locals 7

    iget-object v0, p0, LG1/a;->c:Ljava/lang/Object;

    check-cast v0, LG1/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LG1/a;->b:Ljava/lang/Cloneable;

    check-cast v0, Lp1/b;

    iget v0, v0, Lp1/b;->c:I

    add-int/lit8 v1, v0, -0x11

    div-int/lit8 v1, v1, 0x4

    const/4 v2, 0x6

    if-gt v1, v2, :cond_1

    invoke-static {v1}, LG1/i;->c(I)LG1/i;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v1, v0, -0xb

    const/4 v2, 0x5

    const/4 v3, 0x0

    move v4, v2

    move v5, v3

    :goto_0
    if-ltz v4, :cond_3

    add-int/lit8 v6, v0, -0x9

    :goto_1
    if-lt v6, v1, :cond_2

    invoke-virtual {p0, v6, v4, v5}, LG1/a;->a(III)I

    move-result v5

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    :cond_3
    invoke-static {v5}, LG1/i;->b(I)LG1/i;

    move-result-object v4

    if-eqz v4, :cond_4

    iget v5, v4, LG1/i;->a:I

    mul-int/lit8 v5, v5, 0x4

    add-int/lit8 v5, v5, 0x11

    if-ne v5, v0, :cond_4

    iput-object v4, p0, LG1/a;->c:Ljava/lang/Object;

    return-object v4

    :cond_4
    :goto_2
    if-ltz v2, :cond_6

    add-int/lit8 v4, v0, -0x9

    :goto_3
    if-lt v4, v1, :cond_5

    invoke-virtual {p0, v2, v4, v3}, LG1/a;->a(III)I

    move-result v3

    add-int/lit8 v4, v4, -0x1

    goto :goto_3

    :cond_5
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    :cond_6
    invoke-static {v3}, LG1/i;->b(I)LG1/i;

    move-result-object v1

    if-eqz v1, :cond_7

    iget v2, v1, LG1/i;->a:I

    mul-int/lit8 v2, v2, 0x4

    add-int/lit8 v2, v2, 0x11

    if-ne v2, v0, :cond_7

    iput-object v1, p0, LG1/a;->c:Ljava/lang/Object;

    return-object v1

    :cond_7
    invoke-static {}, Lj1/d;->a()Lj1/d;

    move-result-object v0

    throw v0
.end method

.method public e()V
    .locals 7

    iget-object v0, p0, LG1/a;->d:Ljava/lang/Object;

    check-cast v0, LG1/f;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Lq/h;->b(I)[I

    move-result-object v0

    iget-object v1, p0, LG1/a;->d:Ljava/lang/Object;

    check-cast v1, LG1/f;

    iget-byte v1, v1, LG1/f;->b:B

    aget v0, v0, v1

    iget-object v1, p0, LG1/a;->b:Ljava/lang/Cloneable;

    check-cast v1, Lp1/b;

    iget v2, v1, Lp1/b;->c:I

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    move v5, v3

    :goto_1
    if-ge v5, v2, :cond_2

    invoke-static {v0, v4, v5}, LG1/e;->a(III)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v1, v5, v4}, Lp1/b;->a(II)V

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
