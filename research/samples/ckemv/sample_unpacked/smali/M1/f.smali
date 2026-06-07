.class public final LM1/f;
.super LL1/g;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:LM1/e;


# direct methods
.method public constructor <init>(LM1/e;I)V
    .locals 0

    iput p2, p0, LM1/f;->b:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "backing"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LL1/g;-><init>()V

    iput-object p1, p0, LM1/f;->c:LM1/e;

    return-void

    :pswitch_0
    const-string p2, "backing"

    invoke-static {p1, p2}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LL1/g;-><init>()V

    iput-object p1, p0, LM1/f;->c:LM1/e;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM1/f;->c:LM1/e;

    iget v0, v0, LM1/e;->j:I

    return v0

    :pswitch_0
    iget-object v0, p0, LM1/f;->c:LM1/e;

    iget v0, v0, LM1/e;->j:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "element"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0, p1}, LM1/e;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "element"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0, p1}, LM1/e;->e(Ljava/util/Map$Entry;)Z

    move-result p1

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0, p1}, LM1/e;->d(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isEmpty()Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->isEmpty()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->isEmpty()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LM1/c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, LM1/c;-><init>(LM1/e;I)V

    return-object v1

    :pswitch_0
    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LM1/c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LM1/c;-><init>(LM1/e;I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-virtual {v0, p1}, LM1/e;->g(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LM1/e;->k(I)V

    if-ltz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    check-cast p1, Ljava/util/Map$Entry;

    const-string v0, "element"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, LM1/e;->g(Ljava/lang/Object;)I

    move-result v2

    if-gez v2, :cond_3

    goto :goto_2

    :cond_3
    iget-object v3, v0, LM1/e;->c:[Ljava/lang/Object;

    invoke-static {v3}, LX1/g;->b(Ljava/lang/Object;)V

    aget-object v3, v3, v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v3, p1}, LX1/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v2}, LM1/e;->k(I)V

    const/4 v1, 0x1

    :goto_2
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    iget v0, p0, LM1/f;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/f;->c:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
