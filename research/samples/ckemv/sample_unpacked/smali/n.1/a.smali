.class public final Ln/a;
.super La0/m;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ln/a;->d:I

    iput-object p2, p0, Ln/a;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/c;

    invoke-virtual {v0}, Ln/c;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    invoke-virtual {v0}, Ln/k;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(II)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast p2, Ln/c;

    iget-object p2, p2, Ln/c;->c:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    iget-object v0, v0, Ln/k;->c:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()Ljava/util/Map;
    .locals 2

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/c;

    iget v0, v0, Ln/c;->d:I

    return v0

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    iget v0, v0, Ln/k;->d:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/c;

    invoke-virtual {v0, p1}, Ln/c;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    invoke-virtual {v0, p1}, Ln/k;->e(Ljava/lang/Object;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/c;

    invoke-virtual {v0, p1}, Ln/c;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    invoke-virtual {v0, p1}, Ln/k;->g(Ljava/lang/Object;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast p2, Ln/c;

    invoke-virtual {p2, p1}, Ln/c;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    invoke-virtual {v0, p1, p2}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(I)V
    .locals 1

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/c;

    invoke-virtual {v0, p1}, Ln/c;->e(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    invoke-virtual {v0, p1}, Ln/k;->i(I)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final l(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ln/a;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Ln/a;->e:Ljava/lang/Object;

    check-cast v0, Ln/b;

    iget-object v0, v0, Ln/k;->c:[Ljava/lang/Object;

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
