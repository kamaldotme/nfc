.class public final Ld2/m;
.super LX1/h;
.source "SourceFile"

# interfaces
.implements LW1/p;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    iput p3, p0, Ld2/m;->c:I

    iput-object p1, p0, Ld2/m;->e:Ljava/lang/Object;

    iput-boolean p2, p0, Ld2/m;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, LX1/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Ld2/m;->c:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v7, 0x0

    iget-object v1, p0, Ld2/m;->e:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/util/List;

    iget-boolean v9, p0, Ld2/m;->d:Z

    const/4 v1, 0x1

    if-nez v9, :cond_3

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v2

    if-ne v2, v1, :cond_3

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v2

    if-eqz v2, :cond_2

    if-ne v2, v1, :cond_1

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x4

    invoke-static {p1, v1, p2, v0, v2}, Ld2/d;->c0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p1

    if-gez p1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, LK1/c;

    invoke-direct {p2, p1, v1}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "List has more than one element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "List is empty."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v2, La2/c;

    if-gez p2, :cond_4

    move p2, v0

    :cond_4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-direct {v2, p2, v0, v1}, La2/a;-><init>(III)V

    instance-of v0, p1, Ljava/lang/String;

    iget v10, v2, La2/a;->d:I

    iget v11, v2, La2/a;->c:I

    if-eqz v0, :cond_a

    if-lez v10, :cond_5

    if-le p2, v11, :cond_6

    :cond_5
    if-gez v10, :cond_10

    if-gt v11, p2, :cond_10

    :cond_6
    :goto_0
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v4, v12

    check-cast v4, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v1, 0x0

    move v2, p2

    move v6, v9

    invoke-static/range {v1 .. v6}, Ld2/l;->S(IIILjava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_8
    move-object v12, v7

    :goto_1
    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_9

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, LK1/c;

    invoke-direct {p2, p1, v12}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_9
    if-eq p2, v11, :cond_10

    add-int/2addr p2, v10

    goto :goto_0

    :cond_a
    if-lez v10, :cond_b

    if-le p2, v11, :cond_c

    :cond_b
    if-gez v10, :cond_10

    if-gt v11, p2, :cond_10

    :cond_c
    :goto_2
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v1, v12

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v2, 0x0

    move-object v3, p1

    move v4, p2

    move v6, v9

    invoke-static/range {v1 .. v6}, Ld2/d;->g0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_3

    :cond_e
    move-object v12, v7

    :goto_3
    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance p2, LK1/c;

    invoke-direct {p2, p1, v12}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_f
    if-eq p2, v11, :cond_10

    add-int/2addr p2, v10

    goto :goto_2

    :cond_10
    :goto_4
    move-object p2, v7

    :goto_5
    if-eqz p2, :cond_11

    iget-object p1, p2, LK1/c;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v7, LK1/c;

    iget-object p2, p2, LK1/c;->b:Ljava/lang/Object;

    invoke-direct {v7, p2, p1}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_11
    return-object v7

    :pswitch_0
    check-cast p1, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string v0, "$this$$receiver"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld2/m;->e:Ljava/lang/Object;

    check-cast v0, [C

    iget-boolean v1, p0, Ld2/m;->d:Z

    invoke-static {p1, v0, p2, v1}, Ld2/d;->d0(Ljava/lang/CharSequence;[CIZ)I

    move-result p1

    if-gez p1, :cond_12

    const/4 p1, 0x0

    goto :goto_6

    :cond_12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    new-instance v0, LK1/c;

    invoke-direct {v0, p1, p2}, LK1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v0

    :goto_6
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
