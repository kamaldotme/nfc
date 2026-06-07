.class public abstract LJ/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LU0/e;->c:LU0/e;

    if-nez v0, :cond_0

    new-instance v0, LU0/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, LU0/e;-><init>(I)V

    sput-object v0, LU0/e;->c:LU0/e;

    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    iget v0, p0, LJ/z;->c:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    iget v1, p0, LJ/z;->b:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, LM1/e;

    iget v0, v0, LM1/e;->i:I

    iget v1, p0, LJ/z;->c:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public abstract c(Landroid/view/View;)Ljava/lang/Object;
.end method

.method public abstract d(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public e(Landroid/view/View;)Ljava/lang/Object;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, LJ/z;->b:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1}, LJ/z;->c(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p0, LJ/z;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public f()V
    .locals 3

    :goto_0
    iget v0, p0, LJ/z;->a:I

    iget-object v1, p0, LJ/z;->d:Ljava/lang/Object;

    check-cast v1, LM1/e;

    iget v2, v1, LM1/e;->g:I

    if-ge v0, v2, :cond_0

    iget-object v1, v1, LM1/e;->d:[I

    aget v1, v1, v0

    if-gez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LJ/z;->a:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public g(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, LJ/z;->b:I

    if-lt v0, v1, :cond_0

    invoke-virtual {p0, p1, p2}, LJ/z;->d(Landroid/view/View;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, LJ/z;->e(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, LJ/z;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, LJ/T;->c(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    instance-of v1, v0, LJ/a;

    if-eqz v1, :cond_2

    check-cast v0, LJ/a;

    iget-object v0, v0, LJ/a;->a:LJ/c;

    goto :goto_0

    :cond_2
    new-instance v1, LJ/c;

    invoke-direct {v1, v0}, LJ/c;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, LJ/c;

    invoke-direct {v0}, LJ/c;-><init>()V

    :cond_3
    invoke-static {p1, v0}, LJ/T;->l(Landroid/view/View;LJ/c;)V

    iget v0, p0, LJ/z;->a:I

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget p2, p0, LJ/z;->c:I

    invoke-static {p1, p2}, LJ/T;->g(Landroid/view/View;I)V

    :cond_4
    :goto_1
    return-void
.end method

.method public abstract h(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, LJ/z;->a:I

    iget-object v1, p0, LJ/z;->d:Ljava/lang/Object;

    check-cast v1, LM1/e;

    iget v1, v1, LM1/e;->g:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public remove()V
    .locals 3

    invoke-virtual {p0}, LJ/z;->b()V

    iget v0, p0, LJ/z;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LJ/z;->d:Ljava/lang/Object;

    check-cast v0, LM1/e;

    invoke-virtual {v0}, LM1/e;->c()V

    iget v2, p0, LJ/z;->b:I

    invoke-virtual {v0, v2}, LM1/e;->k(I)V

    iput v1, p0, LJ/z;->b:I

    iget v0, v0, LM1/e;->i:I

    iput v0, p0, LJ/z;->c:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Call next() before removing element from the iterator."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
