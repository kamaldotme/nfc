.class public abstract Ld2/e;
.super La/a;
.source "SourceFile"


# direct methods
.method public static O(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "|"

    invoke-static {v0}, Ld2/l;->R(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_a

    invoke-static {p0}, Ld2/d;->f0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-static {v1}, LL1/l;->Q(Ljava/util/List;)I

    move-result v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    if-ltz v6, :cond_8

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x0

    if-eqz v6, :cond_0

    if-ne v6, v3, :cond_1

    :cond_0
    invoke-static {v7}, Ld2/l;->R(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    :goto_1
    move-object v7, v9

    goto :goto_5

    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    move v10, v5

    :goto_2
    const/4 v11, -0x1

    if-ge v10, v6, :cond_3

    invoke-virtual {v7, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12}, Lv0/f;->A(C)Z

    move-result v12

    xor-int/2addr v12, v2

    if-eqz v12, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    move v10, v11

    :goto_3
    if-ne v10, v11, :cond_4

    goto :goto_4

    :cond_4
    invoke-static {v7, v0, v10, v5}, Ld2/l;->U(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v6

    if-eqz v6, :cond_5

    add-int/2addr v10, v2

    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    const-string v6, "substring(...)"

    invoke-static {v9, v6}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    :goto_4
    if-eqz v9, :cond_6

    goto :goto_1

    :cond_6
    :goto_5
    if-eqz v7, :cond_7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    move v6, v8

    goto :goto_0

    :cond_8
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string v0, "Index overflow has happened."

    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {v4, v0}, LL1/k;->V(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, LX1/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "marginPrefix must be non-blank string."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
