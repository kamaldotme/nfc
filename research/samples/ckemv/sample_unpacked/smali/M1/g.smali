.class public final LM1/g;
.super Ljava/util/AbstractCollection;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;


# instance fields
.field public final b:LM1/e;


# direct methods
.method public constructor <init>(LM1/e;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, LM1/g;->b:LM1/e;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0, p1}, LM1/e;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LM1/c;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, LM1/c;-><init>(LM1/e;I)V

    return-object v1
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-virtual {v0, p1}, LM1/e;->h(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LM1/e;->k(I)V

    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    invoke-static {p1, v0}, LX1/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM1/g;->b:LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, LM1/g;->b:LM1/e;

    iget v0, v0, LM1/e;->j:I

    return v0
.end method
