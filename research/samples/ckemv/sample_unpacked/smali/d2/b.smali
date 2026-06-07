.class public final Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:La2/c;

.field public e:I

.field public final synthetic f:Ld2/c;


# direct methods
.method public constructor <init>(Ld2/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/b;->f:Ld2/c;

    const/4 v0, -0x1

    iput v0, p0, Ld2/b;->a:I

    iget v0, p1, Ld2/c;->b:I

    iget-object p1, p1, Ld2/c;->a:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ltz p1, :cond_2

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    if-le v0, p1, :cond_1

    move v0, p1

    :cond_1
    :goto_0
    iput v0, p0, Ld2/b;->b:I

    iput v0, p0, Ld2/b;->c:I

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot coerce value to an empty range: maximum "

    const-string v2, " is less than minimum 0."

    invoke-static {v1, p1, v2}, LX/d;->g(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget v0, p0, Ld2/b;->c:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, Ld2/b;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Ld2/b;->d:La2/c;

    goto :goto_1

    :cond_0
    iget-object v2, p0, Ld2/b;->f:Ld2/c;

    iget v3, v2, Ld2/c;->c:I

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-lez v3, :cond_1

    iget v6, p0, Ld2/b;->e:I

    add-int/2addr v6, v5

    iput v6, p0, Ld2/b;->e:I

    if-ge v6, v3, :cond_2

    :cond_1
    iget-object v3, v2, Ld2/c;->a:Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v0, v3, :cond_3

    :cond_2
    new-instance v0, La2/c;

    iget v1, p0, Ld2/b;->b:I

    iget-object v2, v2, Ld2/c;->a:Ljava/lang/CharSequence;

    invoke-static {v2}, Ld2/d;->Y(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v5}, La2/a;-><init>(III)V

    iput-object v0, p0, Ld2/b;->d:La2/c;

    iput v4, p0, Ld2/b;->c:I

    goto :goto_0

    :cond_3
    iget-object v0, v2, Ld2/c;->d:LW1/p;

    iget-object v3, v2, Ld2/c;->a:Ljava/lang/CharSequence;

    iget v6, p0, Ld2/b;->c:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v3, v6}, LW1/p;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1/c;

    if-nez v0, :cond_4

    new-instance v0, La2/c;

    iget v1, p0, Ld2/b;->b:I

    iget-object v2, v2, Ld2/c;->a:Ljava/lang/CharSequence;

    invoke-static {v2}, Ld2/d;->Y(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v5}, La2/a;-><init>(III)V

    iput-object v0, p0, Ld2/b;->d:La2/c;

    iput v4, p0, Ld2/b;->c:I

    goto :goto_0

    :cond_4
    iget-object v2, v0, LK1/c;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v0, v0, LK1/c;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v3, p0, Ld2/b;->b:I

    invoke-static {v3, v2}, Lu2/l;->P(II)La2/c;

    move-result-object v3

    iput-object v3, p0, Ld2/b;->d:La2/c;

    add-int/2addr v2, v0

    iput v2, p0, Ld2/b;->b:I

    if-nez v0, :cond_5

    move v1, v5

    :cond_5
    add-int/2addr v2, v1

    iput v2, p0, Ld2/b;->c:I

    :goto_0
    iput v5, p0, Ld2/b;->a:I

    :goto_1
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Ld2/b;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ld2/b;->a()V

    :cond_0
    iget v0, p0, Ld2/b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ld2/b;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ld2/b;->a()V

    :cond_0
    iget v0, p0, Ld2/b;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld2/b;->d:La2/c;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, LX1/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, Ld2/b;->d:La2/c;

    iput v1, p0, Ld2/b;->a:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
