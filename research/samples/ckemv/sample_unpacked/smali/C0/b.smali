.class public final LC0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;


# virtual methods
.method public a(II)V
    .locals 5

    if-ltz p1, :cond_3

    if-ltz p2, :cond_2

    iget v0, p0, LC0/b;->c:I

    mul-int/lit8 v1, v0, 0x2

    iget-object v2, p0, LC0/b;->d:Ljava/lang/Object;

    check-cast v2, [I

    const/4 v3, 0x4

    if-nez v2, :cond_0

    new-array v0, v3, [I

    iput-object v0, p0, LC0/b;->d:Ljava/lang/Object;

    const/4 v2, -0x1

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    goto :goto_0

    :cond_0
    array-length v4, v2

    if-lt v1, v4, :cond_1

    mul-int/2addr v0, v3

    new-array v0, v0, [I

    iput-object v0, p0, LC0/b;->d:Ljava/lang/Object;

    array-length v3, v2

    const/4 v4, 0x0

    invoke-static {v2, v4, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    :goto_0
    iget-object v0, p0, LC0/b;->d:Ljava/lang/Object;

    check-cast v0, [I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    aput p2, v0, v1

    iget p1, p0, LC0/b;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LC0/b;->c:I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Pixel distance must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Layout positions must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()V
    .locals 4

    iget v0, p0, LC0/b;->c:I

    iget-object v1, p0, LC0/b;->d:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    iget v3, p0, LC0/b;->a:I

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    sget-object v2, LJ/T;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v0}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v2, p0, LC0/b;->b:I

    sub-int/2addr v0, v2

    rsub-int/lit8 v0, v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    return-void
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView;Z)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, LC0/b;->c:I

    iget-object v0, p0, LC0/b;->d:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->m:LZ/H;

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    iget-boolean v1, v0, LZ/H;->i:Z

    if-eqz v1, :cond_3

    if-eqz p2, :cond_1

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->e:LG/e;

    invoke-virtual {v1}, LG/e;->h()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LZ/z;

    invoke-virtual {v1}, LZ/z;->a()I

    move-result v1

    invoke-virtual {v0, v1, p0}, LZ/H;->i(ILC0/b;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->K()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, LC0/b;->a:I

    iget v2, p0, LC0/b;->b:I

    iget-object v3, p1, Landroidx/recyclerview/widget/RecyclerView;->d0:LZ/T;

    invoke-virtual {v0, v1, v2, v3, p0}, LZ/H;->h(IILZ/T;LC0/b;)V

    :cond_2
    :goto_0
    iget v1, p0, LC0/b;->c:I

    iget v2, v0, LZ/H;->j:I

    if-le v1, v2, :cond_3

    iput v1, v0, LZ/H;->j:I

    iput-boolean p2, v0, LZ/H;->k:Z

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->c:LZ/N;

    invoke-virtual {p1}, LZ/N;->k()V

    :cond_3
    return-void
.end method
