.class public final Ln/b;
.super Ln/k;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public i:Ln/a;


# direct methods
.method public constructor <init>(Ln/b;)V
    .locals 4

    invoke-direct {p0}, Ln/k;-><init>()V

    if-eqz p1, :cond_1

    iget v0, p1, Ln/k;->d:I

    invoke-virtual {p0, v0}, Ln/k;->b(I)V

    iget v1, p0, Ln/k;->d:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    if-lez v0, :cond_1

    iget-object v1, p1, Ln/k;->b:[I

    iget-object v3, p0, Ln/k;->b:[I

    invoke-static {v1, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p1, Ln/k;->c:[Ljava/lang/Object;

    iget-object v1, p0, Ln/k;->c:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Ln/k;->d:I

    goto :goto_1

    :cond_0
    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p1, v2}, Ln/k;->h(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2}, Ln/k;->j(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v1, v3}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Ln/b;->i:Ln/a;

    if-nez v0, :cond_0

    new-instance v0, Ln/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ln/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ln/b;->i:Ln/a;

    :cond_0
    iget-object v0, p0, Ln/b;->i:Ln/a;

    iget-object v1, v0, La0/m;->a:Ljava/lang/Object;

    check-cast v1, Ln/h;

    if-nez v1, :cond_1

    new-instance v1, Ln/h;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ln/h;-><init>(La0/m;I)V

    iput-object v1, v0, La0/m;->a:Ljava/lang/Object;

    :cond_1
    iget-object v0, v0, La0/m;->a:Ljava/lang/Object;

    check-cast v0, Ln/h;

    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Ln/b;->i:Ln/a;

    if-nez v0, :cond_0

    new-instance v0, Ln/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ln/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ln/b;->i:Ln/a;

    :cond_0
    iget-object v0, p0, Ln/b;->i:Ln/a;

    iget-object v1, v0, La0/m;->b:Ljava/lang/Object;

    check-cast v1, Ln/h;

    if-nez v1, :cond_1

    new-instance v1, Ln/h;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ln/h;-><init>(La0/m;I)V

    iput-object v1, v0, La0/m;->b:Ljava/lang/Object;

    :cond_1
    iget-object v0, v0, La0/m;->b:Ljava/lang/Object;

    check-cast v0, Ln/h;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    iget v0, p0, Ln/k;->d:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ln/k;->b(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Ln/b;->i:Ln/a;

    if-nez v0, :cond_0

    new-instance v0, Ln/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ln/a;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ln/b;->i:Ln/a;

    :cond_0
    iget-object v0, p0, Ln/b;->i:Ln/a;

    iget-object v1, v0, La0/m;->c:Ljava/lang/Object;

    check-cast v1, Ln/j;

    if-nez v1, :cond_1

    new-instance v1, Ln/j;

    invoke-direct {v1, v0}, Ln/j;-><init>(La0/m;)V

    iput-object v1, v0, La0/m;->c:Ljava/lang/Object;

    :cond_1
    iget-object v0, v0, La0/m;->c:Ljava/lang/Object;

    check-cast v0, Ln/j;

    return-object v0
.end method
