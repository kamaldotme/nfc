.class public final LC1/f;
.super Lv0/c;
.source "SourceFile"


# instance fields
.field public final e:Z


# direct methods
.method public constructor <init>(LC1/c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lv0/c;-><init>(LC1/c;)V

    iput-boolean p2, p0, LC1/f;->e:Z

    return-void
.end method


# virtual methods
.method public final r()LC1/a;
    .locals 14

    new-instance v0, LC1/b;

    invoke-direct {v0}, LC1/b;-><init>()V

    new-instance v1, LC1/b;

    invoke-direct {v1}, LC1/b;-><init>()V

    new-instance v2, LC1/b;

    invoke-direct {v2}, LC1/b;-><init>()V

    new-instance v3, LC1/b;

    invoke-direct {v3}, LC1/b;-><init>()V

    iget-object v4, p0, Lv0/c;->d:Ljava/lang/Object;

    check-cast v4, [LC1/a;

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x3

    if-ge v7, v5, :cond_5

    aget-object v9, v4, v7

    if-eqz v9, :cond_4

    invoke-virtual {v9}, LC1/a;->c()V

    iget v10, v9, LC1/a;->e:I

    rem-int/lit8 v10, v10, 0x1e

    iget v9, v9, LC1/a;->f:I

    iget-boolean v11, p0, LC1/f;->e:Z

    if-nez v11, :cond_0

    add-int/lit8 v9, v9, 0x2

    :cond_0
    rem-int/2addr v9, v8

    const/4 v8, 0x1

    if-eqz v9, :cond_3

    if-eq v9, v8, :cond_2

    const/4 v8, 0x2

    if-eq v9, v8, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v10, v10, 0x1

    invoke-virtual {v0, v10}, LC1/b;->b(I)V

    goto :goto_1

    :cond_2
    div-int/lit8 v8, v10, 0x3

    invoke-virtual {v3, v8}, LC1/b;->b(I)V

    rem-int/lit8 v10, v10, 0x3

    invoke-virtual {v2, v10}, LC1/b;->b(I)V

    goto :goto_1

    :cond_3
    mul-int/lit8 v10, v10, 0x3

    add-int/2addr v10, v8

    invoke-virtual {v1, v10}, LC1/b;->b(I)V

    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, LC1/b;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v1}, LC1/b;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v2}, LC1/b;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v3}, LC1/b;->a()[I

    move-result-object v5

    array-length v5, v5

    if-eqz v5, :cond_7

    invoke-virtual {v0}, LC1/b;->a()[I

    move-result-object v5

    aget v5, v5, v6

    if-lez v5, :cond_7

    invoke-virtual {v1}, LC1/b;->a()[I

    move-result-object v5

    aget v5, v5, v6

    invoke-virtual {v2}, LC1/b;->a()[I

    move-result-object v7

    aget v7, v7, v6

    add-int/2addr v5, v7

    if-lt v5, v8, :cond_7

    invoke-virtual {v1}, LC1/b;->a()[I

    move-result-object v5

    aget v5, v5, v6

    invoke-virtual {v2}, LC1/b;->a()[I

    move-result-object v7

    aget v7, v7, v6

    add-int/2addr v5, v7

    const/16 v7, 0x5a

    if-le v5, v7, :cond_6

    goto :goto_2

    :cond_6
    new-instance v5, LC1/a;

    invoke-virtual {v0}, LC1/b;->a()[I

    move-result-object v0

    aget v9, v0, v6

    invoke-virtual {v1}, LC1/b;->a()[I

    move-result-object v0

    aget v10, v0, v6

    invoke-virtual {v2}, LC1/b;->a()[I

    move-result-object v0

    aget v11, v0, v6

    invoke-virtual {v3}, LC1/b;->a()[I

    move-result-object v0

    aget v12, v0, v6

    const/4 v13, 0x0

    move-object v8, v5

    invoke-direct/range {v8 .. v13}, LC1/a;-><init>(IIIII)V

    invoke-virtual {p0, v4, v5}, LC1/f;->s([LC1/a;LC1/a;)V

    return-object v5

    :cond_7
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final s([LC1/a;LC1/a;)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_7

    aget-object v1, p1, v0

    if-eqz v1, :cond_6

    iget v2, v1, LC1/a;->e:I

    rem-int/lit8 v2, v2, 0x1e

    iget v1, v1, LC1/a;->f:I

    iget v3, p2, LC1/a;->f:I

    const/4 v4, 0x0

    if-le v1, v3, :cond_0

    aput-object v4, p1, v0

    goto :goto_1

    :cond_0
    iget-boolean v3, p0, LC1/f;->e:Z

    if-nez v3, :cond_1

    add-int/lit8 v1, v1, 0x2

    :cond_1
    rem-int/lit8 v1, v1, 0x3

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    if-eq v1, v3, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    iget v1, p2, LC1/a;->b:I

    if-eq v2, v1, :cond_6

    aput-object v4, p1, v0

    goto :goto_1

    :cond_3
    div-int/lit8 v1, v2, 0x3

    iget v3, p2, LC1/a;->c:I

    if-ne v1, v3, :cond_4

    rem-int/lit8 v2, v2, 0x3

    iget v1, p2, LC1/a;->e:I

    if-eq v2, v1, :cond_6

    :cond_4
    aput-object v4, p1, v0

    goto :goto_1

    :cond_5
    mul-int/lit8 v2, v2, 0x3

    add-int/2addr v2, v3

    iget v1, p2, LC1/a;->d:I

    if-eq v2, v1, :cond_6

    aput-object v4, p1, v0

    :cond_6
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IsLeft: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, LC1/f;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lv0/c;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
